package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.C0216d0;
import androidx.appcompat.widget.C0241j;
import androidx.appcompat.widget.C0302y;
import androidx.core.content.C0378a;
import androidx.core.graphics.drawable.C0398a;
import androidx.core.widget.C0418i;
import com.google.android.material.internal.C3168a;
import com.google.android.material.internal.C3171c;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p006b.p007a.p008k.p009a.C0764a;
import p006b.p030g.p037i.C0937a;
import p006b.p030g.p039k.C0962a;
import p006b.p030g.p039k.C1001g;
import p006b.p030g.p039k.C1013s;
import p006b.p030g.p039k.p040b0.C0979c;
import p006b.p043i.p044a.AbstractC1041a;
import p069c.p073b.p074a.p090b.C1391b;
import p069c.p073b.p074a.p090b.C1392c;
import p069c.p073b.p074a.p090b.C1393d;
import p069c.p073b.p074a.p090b.C1395f;
import p069c.p073b.p074a.p090b.C1398i;
import p069c.p073b.p074a.p090b.C1399j;
import p069c.p073b.p074a.p090b.p092l.C1401a;
import p069c.p073b.p074a.p090b.p098q.C1428a;
import p069c.p073b.p074a.p090b.p107z.C1455g;
import p069c.p073b.p074a.p090b.p107z.C1462k;

public class TextInputLayout extends LinearLayout {

    /* renamed from: b */
    private static final int f10819b = C1399j.Widget_Design_TextInputLayout;

    /* renamed from: A */
    private boolean f10820A;

    /* renamed from: A0 */
    private int f10821A0;

    /* renamed from: B */
    private CharSequence f10822B;

    /* renamed from: B0 */
    private int f10823B0;

    /* renamed from: C */
    private boolean f10824C;

    /* renamed from: C0 */
    private int f10825C0;

    /* renamed from: D */
    private C1455g f10826D;

    /* renamed from: D0 */
    private int f10827D0;

    /* renamed from: E */
    private C1455g f10828E;

    /* renamed from: E0 */
    private boolean f10829E0;

    /* renamed from: F */
    private C1462k f10830F;

    /* renamed from: F0 */
    final C3168a f10831F0;

    /* renamed from: G */
    private final int f10832G;

    /* renamed from: G0 */
    private boolean f10833G0;

    /* renamed from: H */
    private int f10834H;

    /* renamed from: H0 */
    private ValueAnimator f10835H0;

    /* renamed from: I */
    private final int f10836I;

    /* renamed from: I0 */
    private boolean f10837I0;

    /* renamed from: J */
    private int f10838J;

    /* renamed from: J0 */
    private boolean f10839J0;

    /* renamed from: K */
    private int f10840K;

    /* renamed from: L */
    private int f10841L;

    /* renamed from: M */
    private int f10842M;

    /* renamed from: N */
    private int f10843N;

    /* renamed from: O */
    private final Rect f10844O;

    /* renamed from: P */
    private final Rect f10845P;

    /* renamed from: Q */
    private final RectF f10846Q;

    /* renamed from: R */
    private Typeface f10847R;

    /* renamed from: S */
    private final CheckableImageButton f10848S;

    /* renamed from: T */
    private ColorStateList f10849T;

    /* renamed from: U */
    private boolean f10850U;

    /* renamed from: V */
    private PorterDuff.Mode f10851V;

    /* renamed from: W */
    private boolean f10852W;

    /* renamed from: a0 */
    private Drawable f10853a0;

    /* renamed from: b0 */
    private int f10854b0;

    /* renamed from: c */
    private final FrameLayout f10855c;

    /* renamed from: c0 */
    private View.OnLongClickListener f10856c0;

    /* renamed from: d */
    private final LinearLayout f10857d;

    /* renamed from: d0 */
    private final LinkedHashSet<AbstractC3249f> f10858d0;

    /* renamed from: e */
    private final LinearLayout f10859e;

    /* renamed from: e0 */
    private int f10860e0;

    /* renamed from: f */
    private final FrameLayout f10861f;

    /* renamed from: f0 */
    private final SparseArray<AbstractC3277e> f10862f0;

    /* renamed from: g */
    EditText f10863g;

    /* renamed from: g0 */
    private final CheckableImageButton f10864g0;

    /* renamed from: h */
    private CharSequence f10865h;

    /* renamed from: h0 */
    private final LinkedHashSet<AbstractC3250g> f10866h0;

    /* renamed from: i */
    private final C3278f f10867i;

    /* renamed from: i0 */
    private ColorStateList f10868i0;

    /* renamed from: j */
    boolean f10869j;

    /* renamed from: j0 */
    private boolean f10870j0;

    /* renamed from: k */
    private int f10871k;

    /* renamed from: k0 */
    private PorterDuff.Mode f10872k0;

    /* renamed from: l */
    private boolean f10873l;

    /* renamed from: l0 */
    private boolean f10874l0;

    /* renamed from: m */
    private TextView f10875m;

    /* renamed from: m0 */
    private Drawable f10876m0;

    /* renamed from: n */
    private int f10877n;

    /* renamed from: n0 */
    private int f10878n0;

    /* renamed from: o */
    private int f10879o;

    /* renamed from: o0 */
    private Drawable f10880o0;

    /* renamed from: p */
    private CharSequence f10881p;

    /* renamed from: p0 */
    private View.OnLongClickListener f10882p0;

    /* renamed from: q */
    private boolean f10883q;

    /* renamed from: q0 */
    private View.OnLongClickListener f10884q0;

    /* renamed from: r */
    private TextView f10885r;

    /* renamed from: r0 */
    private final CheckableImageButton f10886r0;

    /* renamed from: s */
    private ColorStateList f10887s;

    /* renamed from: s0 */
    private ColorStateList f10888s0;

    /* renamed from: t */
    private int f10889t;

    /* renamed from: t0 */
    private ColorStateList f10890t0;

    /* renamed from: u */
    private ColorStateList f10891u;

    /* renamed from: u0 */
    private ColorStateList f10892u0;

    /* renamed from: v */
    private ColorStateList f10893v;

    /* renamed from: v0 */
    private int f10894v0;

    /* renamed from: w */
    private CharSequence f10895w;

    /* renamed from: w0 */
    private int f10896w0;

    /* renamed from: x */
    private final TextView f10897x;

    /* renamed from: x0 */
    private int f10898x0;

    /* renamed from: y */
    private CharSequence f10899y;

    /* renamed from: y0 */
    private ColorStateList f10900y0;

    /* renamed from: z */
    private final TextView f10901z;

    /* renamed from: z0 */
    private int f10902z0;

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.TextInputLayout$a */
    public class C3244a implements TextWatcher {
        C3244a() {
        }

        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.mo10989o0(!textInputLayout.f10839J0);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f10869j) {
                textInputLayout2.mo10939g0(editable.length());
            }
            if (TextInputLayout.this.f10883q) {
                TextInputLayout.this.m13608s0(editable.length());
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$b */
    class RunnableC3245b implements Runnable {
        RunnableC3245b() {
        }

        public void run() {
            TextInputLayout.this.f10864g0.performClick();
            TextInputLayout.this.f10864g0.jumpDrawablesToCurrentState();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$c */
    class RunnableC3246c implements Runnable {
        RunnableC3246c() {
        }

        public void run() {
            TextInputLayout.this.f10863g.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.TextInputLayout$d */
    public class C3247d implements ValueAnimator.AnimatorUpdateListener {
        C3247d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f10831F0.mo10696V(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$e */
    public static class C3248e extends C0962a {

        /* renamed from: d */
        private final TextInputLayout f10907d;

        public C3248e(TextInputLayout textInputLayout) {
            this.f10907d = textInputLayout;
        }

        @Override // p006b.p030g.p039k.C0962a
        /* renamed from: g */
        public void mo2362g(View view, C0979c cVar) {
            super.mo2362g(view, cVar);
            EditText editText = this.f10907d.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f10907d.getHint();
            CharSequence helperText = this.f10907d.getHelperText();
            CharSequence error = this.f10907d.getError();
            int counterMaxLength = this.f10907d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f10907d.getCounterOverflowDescription();
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(hint);
            boolean z3 = !TextUtils.isEmpty(helperText);
            boolean z4 = !TextUtils.isEmpty(error);
            boolean z5 = z4 || !TextUtils.isEmpty(counterOverflowDescription);
            String charSequence = z2 ? hint.toString() : "";
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence);
            sb.append(((z4 || z3) && !TextUtils.isEmpty(charSequence)) ? ", " : "");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            if (z4) {
                helperText = error;
            } else if (!z3) {
                helperText = "";
            }
            sb3.append((Object) helperText);
            String sb4 = sb3.toString();
            if (z) {
                cVar.mo5512y0(text);
            } else if (!TextUtils.isEmpty(sb4)) {
                cVar.mo5512y0(sb4);
            }
            if (!TextUtils.isEmpty(sb4)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    cVar.mo5489l0(sb4);
                } else {
                    if (z) {
                        sb4 = ((Object) text) + ", " + sb4;
                    }
                    cVar.mo5512y0(sb4);
                }
                cVar.mo5507v0(!z);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            cVar.mo5493n0(counterMaxLength);
            if (z5) {
                if (!z4) {
                    error = counterOverflowDescription;
                }
                cVar.mo5482h0(error);
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$f */
    public interface AbstractC3249f {
        /* renamed from: a */
        void mo11080a(TextInputLayout textInputLayout);
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$g */
    public interface AbstractC3250g {
        /* renamed from: a */
        void mo11081a(TextInputLayout textInputLayout, int i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.TextInputLayout$h */
    public static class C3251h extends AbstractC1041a {
        public static final Parcelable.Creator<C3251h> CREATOR = new C3252a();

        /* renamed from: d */
        CharSequence f10908d;

        /* renamed from: e */
        boolean f10909e;

        /* renamed from: com.google.android.material.textfield.TextInputLayout$h$a */
        static class C3252a implements Parcelable.ClassLoaderCreator<C3251h> {
            C3252a() {
            }

            /* renamed from: a */
            public C3251h createFromParcel(Parcel parcel) {
                return new C3251h(parcel, null);
            }

            /* renamed from: b */
            public C3251h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C3251h(parcel, classLoader);
            }

            /* renamed from: c */
            public C3251h[] newArray(int i) {
                return new C3251h[i];
            }
        }

        C3251h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f10908d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f10909e = parcel.readInt() != 1 ? false : true;
        }

        C3251h(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f10908d) + "}";
        }

        @Override // p006b.p043i.p044a.AbstractC1041a
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f10908d, parcel, i);
            parcel.writeInt(this.f10909e ? 1 : 0);
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1391b.textInputStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputLayout(android.content.Context r24, android.util.AttributeSet r25, int r26) {
        /*
        // Method dump skipped, instructions count: 1466
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* renamed from: A */
    private void m13557A() {
        Iterator<AbstractC3249f> it = this.f10858d0.iterator();
        while (it.hasNext()) {
            it.next().mo11080a(this);
        }
    }

    /* renamed from: B */
    private void m13558B(int i) {
        Iterator<AbstractC3250g> it = this.f10866h0.iterator();
        while (it.hasNext()) {
            it.next().mo11081a(this, i);
        }
    }

    /* renamed from: C */
    private void m13559C(Canvas canvas) {
        C1455g gVar = this.f10828E;
        if (gVar != null) {
            Rect bounds = gVar.getBounds();
            bounds.top = bounds.bottom - this.f10838J;
            this.f10828E.draw(canvas);
        }
    }

    /* renamed from: D */
    private void m13560D(Canvas canvas) {
        if (this.f10820A) {
            this.f10831F0.mo10703j(canvas);
        }
    }

    /* renamed from: E */
    private void m13561E(boolean z) {
        ValueAnimator valueAnimator = this.f10835H0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f10835H0.cancel();
        }
        if (!z || !this.f10833G0) {
            this.f10831F0.mo10696V(0.0f);
        } else {
            mo10987h(0.0f);
        }
        if (m13620z() && ((C3264c) this.f10826D).mo11100h0()) {
            m13617x();
        }
        this.f10829E0 = true;
        m13565I();
        m13612u0();
        m13618x0();
    }

    /* renamed from: F */
    private int m13562F(int i, boolean z) {
        int compoundPaddingLeft = i + this.f10863g.getCompoundPaddingLeft();
        return (this.f10895w == null || z) ? compoundPaddingLeft : (compoundPaddingLeft - this.f10897x.getMeasuredWidth()) + this.f10897x.getPaddingLeft();
    }

    /* renamed from: G */
    private int m13563G(int i, boolean z) {
        int compoundPaddingRight = i - this.f10863g.getCompoundPaddingRight();
        return (this.f10895w == null || !z) ? compoundPaddingRight : compoundPaddingRight + (this.f10897x.getMeasuredWidth() - this.f10897x.getPaddingRight());
    }

    /* renamed from: H */
    private boolean m13564H() {
        return this.f10860e0 != 0;
    }

    /* renamed from: I */
    private void m13565I() {
        TextView textView = this.f10885r;
        if (textView != null && this.f10883q) {
            textView.setText((CharSequence) null);
            this.f10885r.setVisibility(4);
        }
    }

    /* renamed from: K */
    private boolean m13566K() {
        return this.f10886r0.getVisibility() == 0;
    }

    /* renamed from: O */
    private boolean m13567O() {
        return this.f10834H == 1 && (Build.VERSION.SDK_INT < 16 || this.f10863g.getMinLines() <= 1);
    }

    /* renamed from: Q */
    private void m13568Q() {
        m13600o();
        m13572U();
        mo11073y0();
        if (this.f10834H != 0) {
            m13599n0();
        }
    }

    /* renamed from: R */
    private void m13569R() {
        if (m13620z()) {
            RectF rectF = this.f10846Q;
            this.f10831F0.mo10704m(rectF, this.f10863g.getWidth(), this.f10863g.getGravity());
            m13593k(rectF);
            rectF.offset((float) (-getPaddingLeft()), (float) (-getPaddingTop()));
            ((C3264c) this.f10826D).mo11103n0(rectF);
        }
    }

    /* renamed from: S */
    private static void m13570S(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m13570S((ViewGroup) childAt, z);
            }
        }
    }

    /* renamed from: T */
    private void m13571T() {
        TextView textView = this.f10885r;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    /* renamed from: U */
    private void m13572U() {
        if (m13580b0()) {
            C1013s.m5772l0(this.f10863g, this.f10826D);
        }
    }

    /* renamed from: V */
    private static void m13573V(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean J = C1013s.m5732J(checkableImageButton);
        boolean z = false;
        int i = 1;
        boolean z2 = onLongClickListener != null;
        if (J || z2) {
            z = true;
        }
        checkableImageButton.setFocusable(z);
        checkableImageButton.setClickable(J);
        checkableImageButton.setPressable(J);
        checkableImageButton.setLongClickable(z2);
        if (!z) {
            i = 2;
        }
        C1013s.m5786s0(checkableImageButton, i);
    }

    /* renamed from: W */
    private static void m13574W(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        m13573V(checkableImageButton, onLongClickListener);
    }

    /* renamed from: X */
    private static void m13575X(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m13573V(checkableImageButton, onLongClickListener);
    }

    /* renamed from: Z */
    private boolean m13576Z() {
        return (this.f10886r0.getVisibility() == 0 || ((m13564H() && mo10926J()) || this.f10899y != null)) && this.f10859e.getMeasuredWidth() > 0;
    }

    /* renamed from: a0 */
    private boolean m13578a0() {
        return !(getStartIconDrawable() == null && this.f10895w == null) && this.f10857d.getMeasuredWidth() > 0;
    }

    /* renamed from: b0 */
    private boolean m13580b0() {
        EditText editText = this.f10863g;
        return (editText == null || this.f10826D == null || editText.getBackground() != null || this.f10834H == 0) ? false : true;
    }

    /* renamed from: c0 */
    private void m13582c0() {
        TextView textView = this.f10885r;
        if (textView != null && this.f10883q) {
            textView.setText(this.f10881p);
            this.f10885r.setVisibility(0);
            this.f10885r.bringToFront();
        }
    }

    /* renamed from: d0 */
    private void m13584d0(boolean z) {
        if (!z || getEndIconDrawable() == null) {
            m13594l();
            return;
        }
        Drawable mutate = C0398a.m1981r(getEndIconDrawable()).mutate();
        C0398a.m1977n(mutate, this.f10867i.mo11132o());
        this.f10864g0.setImageDrawable(mutate);
    }

    /* renamed from: e0 */
    private void m13585e0(Rect rect) {
        C1455g gVar = this.f10828E;
        if (gVar != null) {
            int i = rect.bottom;
            gVar.setBounds(rect.left, i - this.f10841L, rect.right, i);
        }
    }

    /* renamed from: f0 */
    private void m13586f0() {
        if (this.f10875m != null) {
            EditText editText = this.f10863g;
            mo10939g0(editText == null ? 0 : editText.getText().length());
        }
    }

    /* renamed from: g */
    private void m13587g() {
        TextView textView = this.f10885r;
        if (textView != null) {
            this.f10855c.addView(textView);
            this.f10885r.setVisibility(0);
        }
    }

    private AbstractC3277e getEndIconDelegate() {
        AbstractC3277e eVar = this.f10862f0.get(this.f10860e0);
        return eVar != null ? eVar : this.f10862f0.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.f10886r0.getVisibility() == 0) {
            return this.f10886r0;
        }
        if (!m13564H() || !mo10926J()) {
            return null;
        }
        return this.f10864g0;
    }

    /* renamed from: h0 */
    private static void m13588h0(Context context, TextView textView, int i, int i2, boolean z) {
        textView.setContentDescription(context.getString(z ? C1398i.character_counter_overflowed_content_description : C1398i.character_counter_content_description, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    /* renamed from: i */
    private void m13589i() {
        C1455g gVar = this.f10826D;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(this.f10830F);
            if (m13613v()) {
                this.f10826D.mo6613a0((float) this.f10838J, this.f10842M);
            }
            int p = m13601p();
            this.f10843N = p;
            this.f10826D.mo6608V(ColorStateList.valueOf(p));
            if (this.f10860e0 == 3) {
                this.f10863g.getBackground().invalidateSelf();
            }
            m13591j();
            invalidate();
        }
    }

    /* renamed from: i0 */
    private void m13590i0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f10875m;
        if (textView != null) {
            mo10931Y(textView, this.f10873l ? this.f10877n : this.f10879o);
            if (!this.f10873l && (colorStateList2 = this.f10891u) != null) {
                this.f10875m.setTextColor(colorStateList2);
            }
            if (this.f10873l && (colorStateList = this.f10893v) != null) {
                this.f10875m.setTextColor(colorStateList);
            }
        }
    }

    /* renamed from: j */
    private void m13591j() {
        if (this.f10828E != null) {
            if (m13615w()) {
                this.f10828E.mo6608V(ColorStateList.valueOf(this.f10842M));
            }
            invalidate();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d3  */
    /* renamed from: j0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m13592j0() {
        /*
        // Method dump skipped, instructions count: 246
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m13592j0():boolean");
    }

    /* renamed from: k */
    private void m13593k(RectF rectF) {
        float f = rectF.left;
        int i = this.f10832G;
        rectF.left = f - ((float) i);
        rectF.top -= (float) i;
        rectF.right += (float) i;
        rectF.bottom += (float) i;
    }

    /* renamed from: l */
    private void m13594l() {
        m13596m(this.f10864g0, this.f10870j0, this.f10868i0, this.f10874l0, this.f10872k0);
    }

    /* renamed from: l0 */
    private boolean m13595l0() {
        int max;
        if (this.f10863g == null || this.f10863g.getMeasuredHeight() >= (max = Math.max(this.f10859e.getMeasuredHeight(), this.f10857d.getMeasuredHeight()))) {
            return false;
        }
        this.f10863g.setMinimumHeight(max);
        return true;
    }

    /* renamed from: m */
    private void m13596m(CheckableImageButton checkableImageButton, boolean z, ColorStateList colorStateList, boolean z2, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z || z2)) {
            drawable = C0398a.m1981r(drawable).mutate();
            if (z) {
                C0398a.m1978o(drawable, colorStateList);
            }
            if (z2) {
                C0398a.m1979p(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* renamed from: m0 */
    private void m13597m0(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int colorForState = colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
            Drawable mutate = C0398a.m1981r(drawable).mutate();
            C0398a.m1978o(mutate, ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    /* renamed from: n */
    private void m13598n() {
        m13596m(this.f10848S, this.f10850U, this.f10849T, this.f10852W, this.f10851V);
    }

    /* renamed from: n0 */
    private void m13599n0() {
        if (this.f10834H != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f10855c.getLayoutParams();
            int u = m13611u();
            if (u != layoutParams.topMargin) {
                layoutParams.topMargin = u;
                this.f10855c.requestLayout();
            }
        }
    }

    /* renamed from: o */
    private void m13600o() {
        int i = this.f10834H;
        if (i == 0) {
            this.f10826D = null;
        } else if (i == 1) {
            this.f10826D = new C1455g(this.f10830F);
            this.f10828E = new C1455g();
            return;
        } else if (i == 2) {
            this.f10826D = (!this.f10820A || (this.f10826D instanceof C3264c)) ? new C1455g(this.f10830F) : new C3264c(this.f10830F);
        } else {
            throw new IllegalArgumentException(this.f10834H + " is illegal; only @BoxBackgroundMode constants are supported.");
        }
        this.f10828E = null;
    }

    /* renamed from: p */
    private int m13601p() {
        return this.f10834H == 1 ? C1428a.m7054e(C1428a.m7053d(this, C1391b.colorSurface, 0), this.f10843N) : this.f10843N;
    }

    /* renamed from: p0 */
    private void m13602p0(boolean z, boolean z2) {
        ColorStateList colorStateList;
        C3168a aVar;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.f10863g;
        boolean z3 = editText != null && !TextUtils.isEmpty(editText.getText());
        EditText editText2 = this.f10863g;
        boolean z4 = editText2 != null && editText2.hasFocus();
        boolean k = this.f10867i.mo11129k();
        ColorStateList colorStateList2 = this.f10890t0;
        if (colorStateList2 != null) {
            this.f10831F0.mo10688K(colorStateList2);
            this.f10831F0.mo10693R(this.f10890t0);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f10890t0;
            int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f10827D0) : this.f10827D0;
            this.f10831F0.mo10688K(ColorStateList.valueOf(colorForState));
            this.f10831F0.mo10693R(ColorStateList.valueOf(colorForState));
        } else if (k) {
            this.f10831F0.mo10688K(this.f10867i.mo11133p());
        } else {
            if (this.f10873l && (textView = this.f10875m) != null) {
                aVar = this.f10831F0;
                colorStateList = textView.getTextColors();
            } else if (z4 && (colorStateList = this.f10892u0) != null) {
                aVar = this.f10831F0;
            }
            aVar.mo10688K(colorStateList);
        }
        if (z3 || (isEnabled() && (z4 || k))) {
            if (z2 || this.f10829E0) {
                m13619y(z);
            }
        } else if (z2 || !this.f10829E0) {
            m13561E(z);
        }
    }

    /* renamed from: q */
    private Rect m13603q(Rect rect) {
        int i;
        int i2;
        if (this.f10863g != null) {
            Rect rect2 = this.f10845P;
            boolean z = C1013s.m5797y(this) == 1;
            rect2.bottom = rect.bottom;
            int i3 = this.f10834H;
            if (i3 == 1) {
                rect2.left = m13562F(rect.left, z);
                i = rect.top + this.f10836I;
            } else if (i3 != 2) {
                rect2.left = m13562F(rect.left, z);
                i = getPaddingTop();
            } else {
                rect2.left = rect.left + this.f10863g.getPaddingLeft();
                rect2.top = rect.top - m13611u();
                i2 = rect.right - this.f10863g.getPaddingRight();
                rect2.right = i2;
                return rect2;
            }
            rect2.top = i;
            i2 = m13563G(rect.right, z);
            rect2.right = i2;
            return rect2;
        }
        throw new IllegalStateException();
    }

    /* renamed from: q0 */
    private void m13604q0() {
        EditText editText;
        if (this.f10885r != null && (editText = this.f10863g) != null) {
            this.f10885r.setGravity(editText.getGravity());
            this.f10885r.setPadding(this.f10863g.getCompoundPaddingLeft(), this.f10863g.getCompoundPaddingTop(), this.f10863g.getCompoundPaddingRight(), this.f10863g.getCompoundPaddingBottom());
        }
    }

    /* renamed from: r */
    private int m13605r(Rect rect, Rect rect2, float f) {
        return m13567O() ? (int) (((float) rect2.top) + f) : rect.bottom - this.f10863g.getCompoundPaddingBottom();
    }

    /* renamed from: r0 */
    private void m13606r0() {
        EditText editText = this.f10863g;
        m13608s0(editText == null ? 0 : editText.getText().length());
    }

    /* renamed from: s */
    private int m13607s(Rect rect, float f) {
        return m13567O() ? (int) (((float) rect.centerY()) - (f / 2.0f)) : rect.top + this.f10863g.getCompoundPaddingTop();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: s0 */
    private void m13608s0(int i) {
        if (i != 0 || this.f10829E0) {
            m13565I();
        } else {
            m13582c0();
        }
    }

    private void setEditText(EditText editText) {
        if (this.f10863g == null) {
            if (this.f10860e0 != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f10863g = editText;
            m13568Q();
            setTextInputAccessibilityDelegate(new C3248e(this));
            this.f10831F0.mo10701b0(this.f10863g.getTypeface());
            this.f10831F0.mo10695T(this.f10863g.getTextSize());
            int gravity = this.f10863g.getGravity();
            this.f10831F0.mo10689L((gravity & -113) | 48);
            this.f10831F0.mo10694S(gravity);
            this.f10863g.addTextChangedListener(new C3244a());
            if (this.f10890t0 == null) {
                this.f10890t0 = this.f10863g.getHintTextColors();
            }
            if (this.f10820A) {
                if (TextUtils.isEmpty(this.f10822B)) {
                    CharSequence hint = this.f10863g.getHint();
                    this.f10865h = hint;
                    setHint(hint);
                    this.f10863g.setHint((CharSequence) null);
                }
                this.f10824C = true;
            }
            if (this.f10875m != null) {
                mo10939g0(this.f10863g.getText().length());
            }
            mo10988k0();
            this.f10867i.mo11127e();
            this.f10857d.bringToFront();
            this.f10859e.bringToFront();
            this.f10861f.bringToFront();
            this.f10886r0.bringToFront();
            m13557A();
            m13610t0();
            m13616w0();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            m13602p0(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setErrorIconVisible(boolean z) {
        int i = 0;
        this.f10886r0.setVisibility(z ? 0 : 8);
        FrameLayout frameLayout = this.f10861f;
        if (z) {
            i = 8;
        }
        frameLayout.setVisibility(i);
        m13616w0();
        if (!m13564H()) {
            m13592j0();
        }
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f10822B)) {
            this.f10822B = charSequence;
            this.f10831F0.mo10699Z(charSequence);
            if (!this.f10829E0) {
                m13569R();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.f10883q != z) {
            if (z) {
                C0302y yVar = new C0302y(getContext());
                this.f10885r = yVar;
                yVar.setId(C1395f.textinput_placeholder);
                C1013s.m5770k0(this.f10885r, 1);
                setPlaceholderTextAppearance(this.f10889t);
                setPlaceholderTextColor(this.f10887s);
                m13587g();
            } else {
                m13571T();
                this.f10885r = null;
            }
            this.f10883q = z;
        }
    }

    /* renamed from: t */
    private Rect m13609t(Rect rect) {
        if (this.f10863g != null) {
            Rect rect2 = this.f10845P;
            float u = this.f10831F0.mo10708u();
            rect2.left = rect.left + this.f10863g.getCompoundPaddingLeft();
            rect2.top = m13607s(rect, u);
            rect2.right = rect.right - this.f10863g.getCompoundPaddingRight();
            rect2.bottom = m13605r(rect, rect2, u);
            return rect2;
        }
        throw new IllegalStateException();
    }

    /* renamed from: t0 */
    private void m13610t0() {
        if (this.f10863g != null) {
            C1013s.m5792v0(this.f10897x, mo10930P() ? 0 : C1013s.m5726D(this.f10863g), this.f10863g.getCompoundPaddingTop(), 0, this.f10863g.getCompoundPaddingBottom());
        }
    }

    /* renamed from: u */
    private int m13611u() {
        float o;
        if (!this.f10820A) {
            return 0;
        }
        int i = this.f10834H;
        if (i == 0 || i == 1) {
            o = this.f10831F0.mo10706o();
        } else if (i != 2) {
            return 0;
        } else {
            o = this.f10831F0.mo10706o() / 2.0f;
        }
        return (int) o;
    }

    /* renamed from: u0 */
    private void m13612u0() {
        this.f10897x.setVisibility((this.f10895w == null || mo10928M()) ? 8 : 0);
        m13592j0();
    }

    /* renamed from: v */
    private boolean m13613v() {
        return this.f10834H == 2 && m13615w();
    }

    /* renamed from: v0 */
    private void m13614v0(boolean z, boolean z2) {
        int defaultColor = this.f10900y0.getDefaultColor();
        int colorForState = this.f10900y0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.f10900y0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z) {
            this.f10842M = colorForState2;
        } else if (z2) {
            this.f10842M = colorForState;
        } else {
            this.f10842M = defaultColor;
        }
    }

    /* renamed from: w */
    private boolean m13615w() {
        return this.f10838J > -1 && this.f10842M != 0;
    }

    /* renamed from: w0 */
    private void m13616w0() {
        if (this.f10863g != null) {
            C1013s.m5792v0(this.f10901z, 0, this.f10863g.getPaddingTop(), (mo10926J() || m13566K()) ? 0 : C1013s.m5725C(this.f10863g), this.f10863g.getPaddingBottom());
        }
    }

    /* renamed from: x */
    private void m13617x() {
        if (m13620z()) {
            ((C3264c) this.f10826D).mo11101k0();
        }
    }

    /* renamed from: x0 */
    private void m13618x0() {
        int visibility = this.f10901z.getVisibility();
        int i = 0;
        boolean z = this.f10899y != null && !mo10928M();
        TextView textView = this.f10901z;
        if (!z) {
            i = 8;
        }
        textView.setVisibility(i);
        if (visibility != this.f10901z.getVisibility()) {
            getEndIconDelegate().mo11090c(z);
        }
        m13592j0();
    }

    /* renamed from: y */
    private void m13619y(boolean z) {
        ValueAnimator valueAnimator = this.f10835H0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f10835H0.cancel();
        }
        if (!z || !this.f10833G0) {
            this.f10831F0.mo10696V(1.0f);
        } else {
            mo10987h(1.0f);
        }
        this.f10829E0 = false;
        if (m13620z()) {
            m13569R();
        }
        m13606r0();
        m13612u0();
        m13618x0();
    }

    /* renamed from: z */
    private boolean m13620z() {
        return this.f10820A && !TextUtils.isEmpty(this.f10822B) && (this.f10826D instanceof C3264c);
    }

    /* renamed from: J */
    public boolean mo10926J() {
        return this.f10861f.getVisibility() == 0 && this.f10864g0.getVisibility() == 0;
    }

    /* renamed from: L */
    public boolean mo10927L() {
        return this.f10867i.mo11140x();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public final boolean mo10928M() {
        return this.f10829E0;
    }

    /* renamed from: N */
    public boolean mo10929N() {
        return this.f10824C;
    }

    /* renamed from: P */
    public boolean mo10930P() {
        return this.f10848S.getVisibility() == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public void mo10931Y(TextView textView, int i) {
        boolean z = true;
        try {
            C0418i.m2106n(textView, i);
            if (Build.VERSION.SDK_INT < 23 || textView.getTextColors().getDefaultColor() != -65281) {
                z = false;
            }
        } catch (Exception unused) {
        }
        if (z) {
            C0418i.m2106n(textView, C1399j.TextAppearance_AppCompat_Caption);
            textView.setTextColor(C0378a.m1872b(getContext(), C1392c.design_error));
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.f10855c.addView(view, layoutParams2);
            this.f10855c.setLayoutParams(layoutParams);
            m13599n0();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText;
        if (this.f10865h == null || (editText = this.f10863g) == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        boolean z = this.f10824C;
        this.f10824C = false;
        CharSequence hint = editText.getHint();
        this.f10863g.setHint(this.f10865h);
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i);
        } finally {
            this.f10863g.setHint(hint);
            this.f10824C = z;
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.f10839J0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f10839J0 = false;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        m13560D(canvas);
        m13559C(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (!this.f10837I0) {
            boolean z = true;
            this.f10837I0 = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            C3168a aVar = this.f10831F0;
            boolean Y = aVar != null ? aVar.mo10698Y(drawableState) | false : false;
            if (this.f10863g != null) {
                if (!C1013s.m5737O(this) || !isEnabled()) {
                    z = false;
                }
                mo10989o0(z);
            }
            mo10988k0();
            mo11073y0();
            if (Y) {
                invalidate();
            }
            this.f10837I0 = false;
        }
    }

    /* renamed from: e */
    public void mo10937e(AbstractC3249f fVar) {
        this.f10858d0.add(fVar);
        if (this.f10863g != null) {
            fVar.mo11080a(this);
        }
    }

    /* renamed from: f */
    public void mo10938f(AbstractC3250g gVar) {
        this.f10866h0.add(gVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g0 */
    public void mo10939g0(int i) {
        boolean z = this.f10873l;
        int i2 = this.f10871k;
        if (i2 == -1) {
            this.f10875m.setText(String.valueOf(i));
            this.f10875m.setContentDescription(null);
            this.f10873l = false;
        } else {
            this.f10873l = i > i2;
            m13588h0(getContext(), this.f10875m, i, this.f10871k, this.f10873l);
            if (z != this.f10873l) {
                m13590i0();
            }
            this.f10875m.setText(C0937a.m5432c().mo5357j(getContext().getString(C1398i.character_counter_pattern, Integer.valueOf(i), Integer.valueOf(this.f10871k))));
        }
        if (this.f10863g != null && z != this.f10873l) {
            mo10989o0(false);
            mo11073y0();
            mo10988k0();
        }
    }

    public int getBaseline() {
        EditText editText = this.f10863g;
        return editText != null ? editText.getBaseline() + getPaddingTop() + m13611u() : super.getBaseline();
    }

    /* access modifiers changed from: package-private */
    public C1455g getBoxBackground() {
        int i = this.f10834H;
        if (i == 1 || i == 2) {
            return this.f10826D;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f10843N;
    }

    public int getBoxBackgroundMode() {
        return this.f10834H;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.f10826D.mo6630s();
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.f10826D.mo6633t();
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.f10826D.mo6600G();
    }

    public float getBoxCornerRadiusTopStart() {
        return this.f10826D.mo6599F();
    }

    public int getBoxStrokeColor() {
        return this.f10898x0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f10900y0;
    }

    public int getBoxStrokeWidth() {
        return this.f10840K;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f10841L;
    }

    public int getCounterMaxLength() {
        return this.f10871k;
    }

    /* access modifiers changed from: package-private */
    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (!this.f10869j || !this.f10873l || (textView = this.f10875m) == null) {
            return null;
        }
        return textView.getContentDescription();
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f10891u;
    }

    public ColorStateList getCounterTextColor() {
        return this.f10891u;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f10890t0;
    }

    public EditText getEditText() {
        return this.f10863g;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f10864g0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f10864g0.getDrawable();
    }

    public int getEndIconMode() {
        return this.f10860e0;
    }

    /* access modifiers changed from: package-private */
    public CheckableImageButton getEndIconView() {
        return this.f10864g0;
    }

    public CharSequence getError() {
        if (this.f10867i.mo11139w()) {
            return this.f10867i.mo11131n();
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.f10867i.mo11130m();
    }

    public int getErrorCurrentTextColors() {
        return this.f10867i.mo11132o();
    }

    public Drawable getErrorIconDrawable() {
        return this.f10886r0.getDrawable();
    }

    /* access modifiers changed from: package-private */
    public final int getErrorTextCurrentColor() {
        return this.f10867i.mo11132o();
    }

    public CharSequence getHelperText() {
        if (this.f10867i.mo11140x()) {
            return this.f10867i.mo11134q();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f10867i.mo11135r();
    }

    public CharSequence getHint() {
        if (this.f10820A) {
            return this.f10822B;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final float getHintCollapsedTextHeight() {
        return this.f10831F0.mo10706o();
    }

    /* access modifiers changed from: package-private */
    public final int getHintCurrentCollapsedTextColor() {
        return this.f10831F0.mo10707r();
    }

    public ColorStateList getHintTextColor() {
        return this.f10892u0;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f10864g0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f10864g0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f10883q) {
            return this.f10881p;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f10889t;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f10887s;
    }

    public CharSequence getPrefixText() {
        return this.f10895w;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f10897x.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f10897x;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f10848S.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f10848S.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.f10899y;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f10901z.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f10901z;
    }

    public Typeface getTypeface() {
        return this.f10847R;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo10987h(float f) {
        if (this.f10831F0.mo10709v() != f) {
            if (this.f10835H0 == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f10835H0 = valueAnimator;
                valueAnimator.setInterpolator(C1401a.f6015b);
                this.f10835H0.setDuration(167L);
                this.f10835H0.addUpdateListener(new C3247d());
            }
            this.f10835H0.setFloatValues(this.f10831F0.mo10709v(), f);
            this.f10835H0.start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k0 */
    public void mo10988k0() {
        Drawable background;
        TextView textView;
        int currentTextColor;
        EditText editText = this.f10863g;
        if (editText != null && this.f10834H == 0 && (background = editText.getBackground()) != null) {
            if (C0216d0.m1134a(background)) {
                background = background.mutate();
            }
            if (this.f10867i.mo11129k()) {
                currentTextColor = this.f10867i.mo11132o();
            } else if (!this.f10873l || (textView = this.f10875m) == null) {
                C0398a.m1966c(background);
                this.f10863g.refreshDrawableState();
                return;
            } else {
                currentTextColor = textView.getCurrentTextColor();
            }
            background.setColorFilter(C0241j.m1244e(currentTextColor, PorterDuff.Mode.SRC_IN));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o0 */
    public void mo10989o0(boolean z) {
        m13602p0(z, false);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.f10863g;
        if (editText != null) {
            Rect rect = this.f10844O;
            C3171c.m13324a(this, editText, rect);
            m13585e0(rect);
            if (this.f10820A) {
                this.f10831F0.mo10695T(this.f10863g.getTextSize());
                int gravity = this.f10863g.getGravity();
                this.f10831F0.mo10689L((gravity & -113) | 48);
                this.f10831F0.mo10694S(gravity);
                this.f10831F0.mo10686H(m13603q(rect));
                this.f10831F0.mo10692P(m13609t(rect));
                this.f10831F0.mo10684E();
                if (m13620z() && !this.f10829E0) {
                    m13569R();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean l0 = m13595l0();
        boolean j0 = m13592j0();
        if (l0 || j0) {
            this.f10863g.post(new RunnableC3246c());
        }
        m13604q0();
        m13610t0();
        m13616w0();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C3251h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C3251h hVar = (C3251h) parcelable;
        super.onRestoreInstanceState(hVar.mo5608b());
        setError(hVar.f10908d);
        if (hVar.f10909e) {
            this.f10864g0.post(new RunnableC3245b());
        }
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        C3251h hVar = new C3251h(super.onSaveInstanceState());
        if (this.f10867i.mo11129k()) {
            hVar.f10908d = getError();
        }
        hVar.f10909e = m13564H() && this.f10864g0.isChecked();
        return hVar;
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f10843N != i) {
            this.f10843N = i;
            this.f10902z0 = i;
            this.f10823B0 = i;
            this.f10825C0 = i;
            m13589i();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(C0378a.m1872b(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f10902z0 = defaultColor;
        this.f10843N = defaultColor;
        this.f10821A0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f10823B0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.f10825C0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        m13589i();
    }

    public void setBoxBackgroundMode(int i) {
        if (i != this.f10834H) {
            this.f10834H = i;
            if (this.f10863g != null) {
                m13568Q();
            }
        }
    }

    public void setBoxStrokeColor(int i) {
        if (this.f10898x0 != i) {
            this.f10898x0 = i;
            mo11073y0();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        int defaultColor;
        if (colorStateList.isStateful()) {
            this.f10894v0 = colorStateList.getDefaultColor();
            this.f10827D0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f10896w0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            defaultColor = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else {
            if (this.f10898x0 != colorStateList.getDefaultColor()) {
                defaultColor = colorStateList.getDefaultColor();
            }
            mo11073y0();
        }
        this.f10898x0 = defaultColor;
        mo11073y0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f10900y0 != colorStateList) {
            this.f10900y0 = colorStateList;
            mo11073y0();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f10840K = i;
        mo11073y0();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f10841L = i;
        mo11073y0();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.f10869j != z) {
            if (z) {
                C0302y yVar = new C0302y(getContext());
                this.f10875m = yVar;
                yVar.setId(C1395f.textinput_counter);
                Typeface typeface = this.f10847R;
                if (typeface != null) {
                    this.f10875m.setTypeface(typeface);
                }
                this.f10875m.setMaxLines(1);
                this.f10867i.mo11126d(this.f10875m, 2);
                C1001g.m5681c((ViewGroup.MarginLayoutParams) this.f10875m.getLayoutParams(), getResources().getDimensionPixelOffset(C1393d.mtrl_textinput_counter_margin_start));
                m13590i0();
                m13586f0();
            } else {
                this.f10867i.mo11141y(this.f10875m, 2);
                this.f10875m = null;
            }
            this.f10869j = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f10871k != i) {
            if (i <= 0) {
                i = -1;
            }
            this.f10871k = i;
            if (this.f10869j) {
                m13586f0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f10877n != i) {
            this.f10877n = i;
            m13590i0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f10893v != colorStateList) {
            this.f10893v = colorStateList;
            m13590i0();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f10879o != i) {
            this.f10879o = i;
            m13590i0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f10891u != colorStateList) {
            this.f10891u = colorStateList;
            m13590i0();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f10890t0 = colorStateList;
        this.f10892u0 = colorStateList;
        if (this.f10863g != null) {
            mo10989o0(false);
        }
    }

    public void setEnabled(boolean z) {
        m13570S(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f10864g0.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f10864g0.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f10864g0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(int i) {
        setEndIconDrawable(i != 0 ? C0764a.m4517d(getContext(), i) : null);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f10864g0.setImageDrawable(drawable);
    }

    public void setEndIconMode(int i) {
        int i2 = this.f10860e0;
        this.f10860e0 = i;
        m13558B(i2);
        setEndIconVisible(i != 0);
        if (getEndIconDelegate().mo11104b(this.f10834H)) {
            getEndIconDelegate().mo11089a();
            m13594l();
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.f10834H + " is not supported by the end icon mode " + i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        m13574W(this.f10864g0, onClickListener, this.f10882p0);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f10882p0 = onLongClickListener;
        m13575X(this.f10864g0, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.f10868i0 != colorStateList) {
            this.f10868i0 = colorStateList;
            this.f10870j0 = true;
            m13594l();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.f10872k0 != mode) {
            this.f10872k0 = mode;
            this.f10874l0 = true;
            m13594l();
        }
    }

    public void setEndIconVisible(boolean z) {
        if (mo10926J() != z) {
            this.f10864g0.setVisibility(z ? 0 : 8);
            m13616w0();
            m13592j0();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.f10867i.mo11139w()) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.f10867i.mo11124L(charSequence);
        } else {
            this.f10867i.mo11136s();
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.f10867i.mo11116A(charSequence);
    }

    public void setErrorEnabled(boolean z) {
        this.f10867i.mo11117B(z);
    }

    public void setErrorIconDrawable(int i) {
        setErrorIconDrawable(i != 0 ? C0764a.m4517d(getContext(), i) : null);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f10886r0.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.f10867i.mo11139w());
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        m13574W(this.f10886r0, onClickListener, this.f10884q0);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f10884q0 = onLongClickListener;
        m13575X(this.f10886r0, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.f10888s0 = colorStateList;
        Drawable drawable = this.f10886r0.getDrawable();
        if (drawable != null) {
            drawable = C0398a.m1981r(drawable).mutate();
            C0398a.m1978o(drawable, colorStateList);
        }
        if (this.f10886r0.getDrawable() != drawable) {
            this.f10886r0.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f10886r0.getDrawable();
        if (drawable != null) {
            drawable = C0398a.m1981r(drawable).mutate();
            C0398a.m1979p(drawable, mode);
        }
        if (this.f10886r0.getDrawable() != drawable) {
            this.f10886r0.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i) {
        this.f10867i.mo11118C(i);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f10867i.mo11119D(colorStateList);
    }

    public void setHelperText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (!mo10927L()) {
                setHelperTextEnabled(true);
            }
            this.f10867i.mo11125M(charSequence);
        } else if (mo10927L()) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f10867i.mo11122G(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        this.f10867i.mo11121F(z);
    }

    public void setHelperTextTextAppearance(int i) {
        this.f10867i.mo11120E(i);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f10820A) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f10833G0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f10820A) {
            this.f10820A = z;
            if (!z) {
                this.f10824C = false;
                if (!TextUtils.isEmpty(this.f10822B) && TextUtils.isEmpty(this.f10863g.getHint())) {
                    this.f10863g.setHint(this.f10822B);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.f10863g.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f10822B)) {
                        setHint(hint);
                    }
                    this.f10863g.setHint((CharSequence) null);
                }
                this.f10824C = true;
            }
            if (this.f10863g != null) {
                m13599n0();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        this.f10831F0.mo10687I(i);
        this.f10892u0 = this.f10831F0.mo10705n();
        if (this.f10863g != null) {
            mo10989o0(false);
            m13599n0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f10892u0 != colorStateList) {
            if (this.f10890t0 == null) {
                this.f10831F0.mo10688K(colorStateList);
            }
            this.f10892u0 = colorStateList;
            if (this.f10863g != null) {
                mo10989o0(false);
            }
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f10864g0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? C0764a.m4517d(getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f10864g0.setImageDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.f10860e0 != 1) {
            setEndIconMode(1);
        } else if (!z) {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f10868i0 = colorStateList;
        this.f10870j0 = true;
        m13594l();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f10872k0 = mode;
        this.f10874l0 = true;
        m13594l();
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (!this.f10883q || !TextUtils.isEmpty(charSequence)) {
            if (!this.f10883q) {
                setPlaceholderTextEnabled(true);
            }
            this.f10881p = charSequence;
        } else {
            setPlaceholderTextEnabled(false);
        }
        m13606r0();
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f10889t = i;
        TextView textView = this.f10885r;
        if (textView != null) {
            C0418i.m2106n(textView, i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f10887s != colorStateList) {
            this.f10887s = colorStateList;
            TextView textView = this.f10885r;
            if (textView != null && colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f10895w = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f10897x.setText(charSequence);
        m13612u0();
    }

    public void setPrefixTextAppearance(int i) {
        C0418i.m2106n(this.f10897x, i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f10897x.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.f10848S.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.f10848S.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? C0764a.m4517d(getContext(), i) : null);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f10848S.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            m13598n();
            return;
        }
        setStartIconVisible(false);
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        setStartIconContentDescription((CharSequence) null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        m13574W(this.f10848S, onClickListener, this.f10856c0);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f10856c0 = onLongClickListener;
        m13575X(this.f10848S, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.f10849T != colorStateList) {
            this.f10849T = colorStateList;
            this.f10850U = true;
            m13598n();
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.f10851V != mode) {
            this.f10851V = mode;
            this.f10852W = true;
            m13598n();
        }
    }

    public void setStartIconVisible(boolean z) {
        if (mo10930P() != z) {
            this.f10848S.setVisibility(z ? 0 : 8);
            m13610t0();
            m13592j0();
        }
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f10899y = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f10901z.setText(charSequence);
        m13618x0();
    }

    public void setSuffixTextAppearance(int i) {
        C0418i.m2106n(this.f10901z, i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f10901z.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(C3248e eVar) {
        EditText editText = this.f10863g;
        if (editText != null) {
            C1013s.m5766i0(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f10847R) {
            this.f10847R = typeface;
            this.f10831F0.mo10701b0(typeface);
            this.f10867i.mo11123I(typeface);
            TextView textView = this.f10875m;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ca  */
    /* renamed from: y0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11073y0() {
        /*
        // Method dump skipped, instructions count: 232
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.mo11073y0():void");
    }
}
