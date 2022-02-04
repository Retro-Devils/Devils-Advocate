package androidx.leanback.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ReplacementSpan;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import androidx.core.widget.C0418i;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p006b.p053m.C1072d;

/* access modifiers changed from: package-private */
/* renamed from: androidx.leanback.widget.w */
public class C0600w extends EditText {

    /* renamed from: b */
    private static final Pattern f2981b = Pattern.compile("\\S+");

    /* renamed from: c */
    private static final Property<C0600w, Integer> f2982c = new C0601a(Integer.class, "streamPosition");

    /* renamed from: d */
    final Random f2983d = new Random();

    /* renamed from: e */
    Bitmap f2984e;

    /* renamed from: f */
    Bitmap f2985f;

    /* renamed from: g */
    int f2986g;

    /* renamed from: h */
    private ObjectAnimator f2987h;

    /* renamed from: androidx.leanback.widget.w$a */
    static class C0601a extends Property<C0600w, Integer> {
        C0601a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Integer get(C0600w wVar) {
            return Integer.valueOf(wVar.getStreamPosition());
        }

        /* renamed from: b */
        public void set(C0600w wVar, Integer num) {
            wVar.setStreamPosition(num.intValue());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.leanback.widget.w$b */
    public class C0602b extends ReplacementSpan {

        /* renamed from: b */
        private final int f2988b;

        /* renamed from: c */
        private final int f2989c;

        public C0602b(int i, int i2) {
            this.f2988b = i;
            this.f2989c = i2;
        }

        public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
            int measureText = (int) paint.measureText(charSequence, i, i2);
            int width = C0600w.this.f2984e.getWidth();
            int i6 = width * 2;
            int i7 = measureText / i6;
            int i8 = (measureText % i6) / 2;
            boolean d = C0600w.m3187d(C0600w.this);
            C0600w.this.f2983d.setSeed((long) this.f2988b);
            int alpha = paint.getAlpha();
            for (int i9 = 0; i9 < i7; i9++) {
                int i10 = this.f2989c + i9;
                C0600w wVar = C0600w.this;
                if (i10 >= wVar.f2986g) {
                    break;
                }
                float f2 = (float) ((i9 * i6) + i8 + (width / 2));
                float f3 = d ? ((((float) measureText) + f) - f2) - ((float) width) : f + f2;
                paint.setAlpha((wVar.f2983d.nextInt(4) + 1) * 63);
                Bitmap bitmap = C0600w.this.f2983d.nextBoolean() ? C0600w.this.f2985f : C0600w.this.f2984e;
                canvas.drawBitmap(bitmap, f3, (float) (i4 - bitmap.getHeight()), paint);
            }
            paint.setAlpha(alpha);
        }

        public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
            return (int) paint.measureText(charSequence, i, i2);
        }
    }

    public C0600w(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C0600w(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    private void m3184a(SpannableStringBuilder spannableStringBuilder, String str, int i) {
        Matcher matcher = f2981b.matcher(str);
        while (matcher.find()) {
            int start = matcher.start() + i;
            spannableStringBuilder.setSpan(new C0602b(str.charAt(matcher.start()), start), start, matcher.end() + i, 33);
        }
    }

    /* renamed from: b */
    private void m3185b() {
        ObjectAnimator objectAnimator = this.f2987h;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* renamed from: c */
    private Bitmap m3186c(int i, float f) {
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), i);
        return Bitmap.createScaledBitmap(decodeResource, (int) (((float) decodeResource.getWidth()) * f), (int) (((float) decodeResource.getHeight()) * f), false);
    }

    /* renamed from: d */
    public static boolean m3187d(View view) {
        return Build.VERSION.SDK_INT >= 17 && 1 == view.getLayoutDirection();
    }

    /* renamed from: f */
    private void m3188f() {
        m3185b();
        int streamPosition = getStreamPosition();
        int length = length();
        int i = length - streamPosition;
        if (i > 0) {
            if (this.f2987h == null) {
                ObjectAnimator objectAnimator = new ObjectAnimator();
                this.f2987h = objectAnimator;
                objectAnimator.setTarget(this);
                this.f2987h.setProperty(f2982c);
            }
            this.f2987h.setIntValues(streamPosition, length);
            this.f2987h.setDuration(((long) i) * 50);
            this.f2987h.start();
        }
    }

    /* renamed from: h */
    private void m3189h(CharSequence charSequence) {
        setText(charSequence);
        bringPointIntoView(length());
    }

    /* renamed from: e */
    public void mo3137e() {
        this.f2986g = -1;
        m3185b();
        setText("");
    }

    /* renamed from: g */
    public void mo3138g(String str, String str2) {
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (str2 != null) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) str2);
            m3184a(spannableStringBuilder, str2, length);
        }
        this.f2986g = Math.max(str.length(), this.f2986g);
        m3189h(new SpannedString(spannableStringBuilder));
        m3188f();
    }

    /* access modifiers changed from: package-private */
    public int getStreamPosition() {
        return this.f2986g;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f2984e = m3186c(C1072d.lb_text_dot_one, 1.3f);
        this.f2985f = m3186c(C1072d.lb_text_dot_two, 1.3f);
        mo3137e();
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(C0600w.class.getCanonicalName());
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0418i.m2108p(this, callback));
    }

    public void setFinalRecognizedText(CharSequence charSequence) {
        m3189h(charSequence);
    }

    /* access modifiers changed from: package-private */
    public void setStreamPosition(int i) {
        this.f2986g = i;
        invalidate();
    }
}
