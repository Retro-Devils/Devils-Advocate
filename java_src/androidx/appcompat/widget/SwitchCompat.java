package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.C0398a;
import androidx.core.widget.C0418i;
import p006b.p007a.C0754a;
import p006b.p007a.C0763j;
import p006b.p007a.p008k.p009a.C0764a;
import p006b.p007a.p013n.C0783a;
import p006b.p030g.p039k.C1013s;

public class SwitchCompat extends CompoundButton {

    /* renamed from: b */
    private static final Property<SwitchCompat, Float> f819b = new C0186a(Float.class, "thumbPos");

    /* renamed from: c */
    private static final int[] f820c = {16842912};

    /* renamed from: A */
    float f821A;

    /* renamed from: B */
    private int f822B;

    /* renamed from: C */
    private int f823C;

    /* renamed from: D */
    private int f824D;

    /* renamed from: E */
    private int f825E;

    /* renamed from: F */
    private int f826F;

    /* renamed from: G */
    private int f827G;

    /* renamed from: H */
    private int f828H;

    /* renamed from: I */
    private final TextPaint f829I;

    /* renamed from: J */
    private ColorStateList f830J;

    /* renamed from: K */
    private Layout f831K;

    /* renamed from: L */
    private Layout f832L;

    /* renamed from: M */
    private TransformationMethod f833M;

    /* renamed from: N */
    ObjectAnimator f834N;

    /* renamed from: O */
    private final C0297x f835O;

    /* renamed from: P */
    private final Rect f836P;

    /* renamed from: d */
    private Drawable f837d;

    /* renamed from: e */
    private ColorStateList f838e;

    /* renamed from: f */
    private PorterDuff.Mode f839f;

    /* renamed from: g */
    private boolean f840g;

    /* renamed from: h */
    private boolean f841h;

    /* renamed from: i */
    private Drawable f842i;

    /* renamed from: j */
    private ColorStateList f843j;

    /* renamed from: k */
    private PorterDuff.Mode f844k;

    /* renamed from: l */
    private boolean f845l;

    /* renamed from: m */
    private boolean f846m;

    /* renamed from: n */
    private int f847n;

    /* renamed from: o */
    private int f848o;

    /* renamed from: p */
    private int f849p;

    /* renamed from: q */
    private boolean f850q;

    /* renamed from: r */
    private CharSequence f851r;

    /* renamed from: s */
    private CharSequence f852s;

    /* renamed from: t */
    private boolean f853t;

    /* renamed from: u */
    private int f854u;

    /* renamed from: v */
    private int f855v;

    /* renamed from: w */
    private float f856w;

    /* renamed from: x */
    private float f857x;

    /* renamed from: y */
    private VelocityTracker f858y;

    /* renamed from: z */
    private int f859z;

    /* renamed from: androidx.appcompat.widget.SwitchCompat$a */
    class C0186a extends Property<SwitchCompat, Float> {
        C0186a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f821A);
        }

        /* renamed from: b */
        public void set(SwitchCompat switchCompat, Float f) {
            switchCompat.setThumbPosition(f.floatValue());
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0754a.switchStyle);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f838e = null;
        this.f839f = null;
        this.f840g = false;
        this.f841h = false;
        this.f843j = null;
        this.f844k = null;
        this.f845l = false;
        this.f846m = false;
        this.f858y = VelocityTracker.obtain();
        this.f836P = new Rect();
        C0275r0.m1374a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f829I = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = C0763j.f3620I2;
        C0296w0 v = C0296w0.m1432v(context, attributeSet, iArr, i, 0);
        C1013s.m5762g0(this, context, iArr, attributeSet, v.mo1821r(), i, 0);
        Drawable g = v.mo1810g(C0763j.f3635L2);
        this.f837d = g;
        if (g != null) {
            g.setCallback(this);
        }
        Drawable g2 = v.mo1810g(C0763j.f3680U2);
        this.f842i = g2;
        if (g2 != null) {
            g2.setCallback(this);
        }
        this.f851r = v.mo1819p(C0763j.f3625J2);
        this.f852s = v.mo1819p(C0763j.f3630K2);
        this.f853t = v.mo1804a(C0763j.f3640M2, true);
        this.f847n = v.mo1809f(C0763j.f3665R2, 0);
        this.f848o = v.mo1809f(C0763j.f3650O2, 0);
        this.f849p = v.mo1809f(C0763j.f3655P2, 0);
        this.f850q = v.mo1804a(C0763j.f3645N2, false);
        ColorStateList c = v.mo1806c(C0763j.f3670S2);
        if (c != null) {
            this.f838e = c;
            this.f840g = true;
        }
        PorterDuff.Mode e = C0216d0.m1138e(v.mo1814k(C0763j.f3675T2, -1), null);
        if (this.f839f != e) {
            this.f839f = e;
            this.f841h = true;
        }
        if (this.f840g || this.f841h) {
            m964b();
        }
        ColorStateList c2 = v.mo1806c(C0763j.f3685V2);
        if (c2 != null) {
            this.f843j = c2;
            this.f845l = true;
        }
        PorterDuff.Mode e2 = C0216d0.m1138e(v.mo1814k(C0763j.f3690W2, -1), null);
        if (this.f844k != e2) {
            this.f844k = e2;
            this.f846m = true;
        }
        if (this.f845l || this.f846m) {
            m965c();
        }
        int n = v.mo1817n(C0763j.f3660Q2, 0);
        if (n != 0) {
            mo1153i(context, n);
        }
        C0297x xVar = new C0297x(this);
        this.f835O = xVar;
        xVar.mo1834m(attributeSet, i);
        v.mo1823w();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f855v = viewConfiguration.getScaledTouchSlop();
        this.f859z = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    /* renamed from: a */
    private void m963a(boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f819b, z ? 1.0f : 0.0f);
        this.f834N = ofFloat;
        ofFloat.setDuration(250L);
        if (Build.VERSION.SDK_INT >= 18) {
            this.f834N.setAutoCancel(true);
        }
        this.f834N.start();
    }

    /* renamed from: b */
    private void m964b() {
        Drawable drawable = this.f837d;
        if (drawable == null) {
            return;
        }
        if (this.f840g || this.f841h) {
            Drawable mutate = C0398a.m1981r(drawable).mutate();
            this.f837d = mutate;
            if (this.f840g) {
                C0398a.m1978o(mutate, this.f838e);
            }
            if (this.f841h) {
                C0398a.m1979p(this.f837d, this.f839f);
            }
            if (this.f837d.isStateful()) {
                this.f837d.setState(getDrawableState());
            }
        }
    }

    /* renamed from: c */
    private void m965c() {
        Drawable drawable = this.f842i;
        if (drawable == null) {
            return;
        }
        if (this.f845l || this.f846m) {
            Drawable mutate = C0398a.m1981r(drawable).mutate();
            this.f842i = mutate;
            if (this.f845l) {
                C0398a.m1978o(mutate, this.f843j);
            }
            if (this.f846m) {
                C0398a.m1979p(this.f842i, this.f844k);
            }
            if (this.f842i.isStateful()) {
                this.f842i.setState(getDrawableState());
            }
        }
    }

    /* renamed from: d */
    private void m966d() {
        ObjectAnimator objectAnimator = this.f834N;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* renamed from: e */
    private void m967e(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: f */
    private static float m968f(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    /* renamed from: g */
    private boolean m969g(float f, float f2) {
        if (this.f837d == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f837d.getPadding(this.f836P);
        int i = this.f826F;
        int i2 = this.f855v;
        int i3 = i - i2;
        int i4 = (this.f825E + thumbOffset) - i2;
        Rect rect = this.f836P;
        return f > ((float) i4) && f < ((float) ((((this.f824D + i4) + rect.left) + rect.right) + i2)) && f2 > ((float) i3) && f2 < ((float) (this.f828H + i2));
    }

    private boolean getTargetCheckedState() {
        return this.f821A > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((C0214c1.m1132b(this) ? 1.0f - this.f821A : this.f821A) * ((float) getThumbScrollRange())) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f842i;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f836P;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f837d;
        Rect d = drawable2 != null ? C0216d0.m1137d(drawable2) : C0216d0.f973c;
        return ((((this.f822B - this.f824D) - rect.left) - rect.right) - d.left) - d.right;
    }

    /* renamed from: h */
    private Layout m970h(CharSequence charSequence) {
        TransformationMethod transformationMethod = this.f833M;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, this);
        }
        TextPaint textPaint = this.f829I;
        return new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil((double) Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    /* renamed from: k */
    private void m971k(int i, int i2) {
        mo1154j(i != 1 ? i != 2 ? i != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF, i2);
    }

    /* renamed from: l */
    private void m972l(MotionEvent motionEvent) {
        this.f854u = 0;
        boolean z = true;
        boolean z2 = motionEvent.getAction() == 1 && isEnabled();
        boolean isChecked = isChecked();
        if (z2) {
            this.f858y.computeCurrentVelocity(1000);
            float xVelocity = this.f858y.getXVelocity();
            if (Math.abs(xVelocity) <= ((float) this.f859z)) {
                z = getTargetCheckedState();
            } else if (!C0214c1.m1132b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                z = false;
            }
        } else {
            z = isChecked;
        }
        if (z != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z);
        m967e(motionEvent);
    }

    public void draw(Canvas canvas) {
        int i;
        int i2;
        Rect rect = this.f836P;
        int i3 = this.f825E;
        int i4 = this.f826F;
        int i5 = this.f827G;
        int i6 = this.f828H;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.f837d;
        Rect d = drawable != null ? C0216d0.m1137d(drawable) : C0216d0.f973c;
        Drawable drawable2 = this.f842i;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            thumbOffset += i7;
            if (d != null) {
                int i8 = d.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = d.top;
                int i10 = rect.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = d.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = d.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                    this.f842i.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.f842i.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f837d;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = thumbOffset - rect.left;
            int i16 = thumbOffset + this.f824D + rect.right;
            this.f837d.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                C0398a.m1975l(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    public void drawableHotspotChanged(float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f, f2);
        }
        Drawable drawable = this.f837d;
        if (drawable != null) {
            C0398a.m1974k(drawable, f, f2);
        }
        Drawable drawable2 = this.f842i;
        if (drawable2 != null) {
            C0398a.m1974k(drawable2, f, f2);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f837d;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f842i;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public int getCompoundPaddingLeft() {
        if (!C0214c1.m1132b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f822B;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f849p : compoundPaddingLeft;
    }

    public int getCompoundPaddingRight() {
        if (C0214c1.m1132b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f822B;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f849p : compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.f853t;
    }

    public boolean getSplitTrack() {
        return this.f850q;
    }

    public int getSwitchMinWidth() {
        return this.f848o;
    }

    public int getSwitchPadding() {
        return this.f849p;
    }

    public CharSequence getTextOff() {
        return this.f852s;
    }

    public CharSequence getTextOn() {
        return this.f851r;
    }

    public Drawable getThumbDrawable() {
        return this.f837d;
    }

    public int getThumbTextPadding() {
        return this.f847n;
    }

    public ColorStateList getThumbTintList() {
        return this.f838e;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f839f;
    }

    public Drawable getTrackDrawable() {
        return this.f842i;
    }

    public ColorStateList getTrackTintList() {
        return this.f843j;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f844k;
    }

    /* renamed from: i */
    public void mo1153i(Context context, int i) {
        C0296w0 t = C0296w0.m1430t(context, i, C0763j.f3695X2);
        ColorStateList c = t.mo1806c(C0763j.f3715b3);
        if (c == null) {
            c = getTextColors();
        }
        this.f830J = c;
        int f = t.mo1809f(C0763j.f3700Y2, 0);
        if (f != 0) {
            float f2 = (float) f;
            if (f2 != this.f829I.getTextSize()) {
                this.f829I.setTextSize(f2);
                requestLayout();
            }
        }
        m971k(t.mo1814k(C0763j.f3705Z2, -1), t.mo1814k(C0763j.f3710a3, -1));
        this.f833M = t.mo1804a(C0763j.f3750i3, false) ? new C0783a(getContext()) : null;
        t.mo1823w();
    }

    /* renamed from: j */
    public void mo1154j(Typeface typeface, int i) {
        float f = 0.0f;
        boolean z = false;
        if (i > 0) {
            Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i) : Typeface.create(typeface, i);
            setSwitchTypeface(defaultFromStyle);
            int style = ((defaultFromStyle != null ? defaultFromStyle.getStyle() : 0) ^ -1) & i;
            TextPaint textPaint = this.f829I;
            if ((style & 1) != 0) {
                z = true;
            }
            textPaint.setFakeBoldText(z);
            TextPaint textPaint2 = this.f829I;
            if ((style & 2) != 0) {
                f = -0.25f;
            }
            textPaint2.setTextSkewX(f);
            return;
        }
        this.f829I.setFakeBoldText(false);
        this.f829I.setTextSkewX(0.0f);
        setSwitchTypeface(typeface);
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f837d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f842i;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f834N;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.f834N.end();
            this.f834N = null;
        }
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            CompoundButton.mergeDrawableStates(onCreateDrawableState, f820c);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        Rect rect = this.f836P;
        Drawable drawable = this.f842i;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i2 = this.f826F;
        int i3 = this.f828H;
        int i4 = i2 + rect.top;
        int i5 = i3 - rect.bottom;
        Drawable drawable2 = this.f837d;
        if (drawable != null) {
            if (!this.f850q || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect d = C0216d0.m1137d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += d.left;
                rect.right -= d.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.f831K : this.f832L;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f830J;
            if (colorStateList != null) {
                this.f829I.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f829I.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                i = bounds.left + bounds.right;
            } else {
                i = getWidth();
            }
            canvas.translate((float) ((i / 2) - (layout.getWidth() / 2)), (float) (((i4 + i5) / 2) - (layout.getHeight() / 2)));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        CharSequence charSequence = isChecked() ? this.f851r : this.f852s;
        if (!TextUtils.isEmpty(charSequence)) {
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        super.onLayout(z, i, i2, i3, i4);
        int i11 = 0;
        if (this.f837d != null) {
            Rect rect = this.f836P;
            Drawable drawable = this.f842i;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect d = C0216d0.m1137d(this.f837d);
            i5 = Math.max(0, d.left - rect.left);
            i11 = Math.max(0, d.right - rect.right);
        } else {
            i5 = 0;
        }
        if (C0214c1.m1132b(this)) {
            i7 = getPaddingLeft() + i5;
            i6 = ((this.f822B + i7) - i5) - i11;
        } else {
            i6 = (getWidth() - getPaddingRight()) - i11;
            i7 = (i6 - this.f822B) + i5 + i11;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            i10 = this.f823C;
            i9 = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (i10 / 2);
        } else if (gravity != 80) {
            i9 = getPaddingTop();
            i10 = this.f823C;
        } else {
            i8 = getHeight() - getPaddingBottom();
            i9 = i8 - this.f823C;
            this.f825E = i7;
            this.f826F = i9;
            this.f828H = i8;
            this.f827G = i6;
        }
        i8 = i10 + i9;
        this.f825E = i7;
        this.f826F = i9;
        this.f828H = i8;
        this.f827G = i6;
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (this.f853t) {
            if (this.f831K == null) {
                this.f831K = m970h(this.f851r);
            }
            if (this.f832L == null) {
                this.f832L = m970h(this.f852s);
            }
        }
        Rect rect = this.f836P;
        Drawable drawable = this.f837d;
        int i5 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i4 = (this.f837d.getIntrinsicWidth() - rect.left) - rect.right;
            i3 = this.f837d.getIntrinsicHeight();
        } else {
            i4 = 0;
            i3 = 0;
        }
        this.f824D = Math.max(this.f853t ? Math.max(this.f831K.getWidth(), this.f832L.getWidth()) + (this.f847n * 2) : 0, i4);
        Drawable drawable2 = this.f842i;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i5 = this.f842i.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i6 = rect.left;
        int i7 = rect.right;
        Drawable drawable3 = this.f837d;
        if (drawable3 != null) {
            Rect d = C0216d0.m1137d(drawable3);
            i6 = Math.max(i6, d.left);
            i7 = Math.max(i7, d.right);
        }
        int max = Math.max(this.f848o, (this.f824D * 2) + i6 + i7);
        int max2 = Math.max(i5, i3);
        this.f822B = max;
        this.f823C = max2;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f851r : this.f852s;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r0 != 3) goto L_0x00b9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
        // Method dump skipped, instructions count: 190
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (getWindowToken() == null || !C1013s.m5737O(this)) {
            m966d();
            setThumbPosition(isChecked ? 1.0f : 0.0f);
            return;
        }
        m963a(isChecked);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0418i.m2108p(this, callback));
    }

    public void setShowText(boolean z) {
        if (this.f853t != z) {
            this.f853t = z;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z) {
        this.f850q = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.f848o = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.f849p = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f829I.getTypeface() != null && !this.f829I.getTypeface().equals(typeface)) || (this.f829I.getTypeface() == null && typeface != null)) {
            this.f829I.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        this.f852s = charSequence;
        requestLayout();
    }

    public void setTextOn(CharSequence charSequence) {
        this.f851r = charSequence;
        requestLayout();
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f837d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f837d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void setThumbPosition(float f) {
        this.f821A = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(C0764a.m4517d(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.f847n = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f838e = colorStateList;
        this.f840g = true;
        m964b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f839f = mode;
        this.f841h = true;
        m964b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f842i;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f842i = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(C0764a.m4517d(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f843j = colorStateList;
        this.f845l = true;
        m965c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f844k = mode;
        this.f846m = true;
        m965c();
    }

    public void toggle() {
        setChecked(!isChecked());
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f837d || drawable == this.f842i;
    }
}
