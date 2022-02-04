package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.C0302y;
import androidx.core.widget.C0418i;
import java.util.ArrayList;
import java.util.List;
import p006b.p030g.p039k.C1013s;
import p069c.p073b.p074a.p090b.C1393d;
import p069c.p073b.p074a.p090b.C1395f;
import p069c.p073b.p074a.p090b.p092l.C1401a;
import p069c.p073b.p074a.p090b.p092l.C1402b;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.material.textfield.f */
public final class C3278f {

    /* renamed from: a */
    private final Context f10950a;

    /* renamed from: b */
    private final TextInputLayout f10951b;

    /* renamed from: c */
    private LinearLayout f10952c;

    /* renamed from: d */
    private int f10953d;

    /* renamed from: e */
    private FrameLayout f10954e;

    /* renamed from: f */
    private int f10955f;

    /* renamed from: g */
    private Animator f10956g;

    /* renamed from: h */
    private final float f10957h;

    /* renamed from: i */
    private int f10958i;

    /* renamed from: j */
    private int f10959j;

    /* renamed from: k */
    private CharSequence f10960k;

    /* renamed from: l */
    private boolean f10961l;

    /* renamed from: m */
    private TextView f10962m;

    /* renamed from: n */
    private CharSequence f10963n;

    /* renamed from: o */
    private int f10964o;

    /* renamed from: p */
    private ColorStateList f10965p;

    /* renamed from: q */
    private CharSequence f10966q;

    /* renamed from: r */
    private boolean f10967r;

    /* renamed from: s */
    private TextView f10968s;

    /* renamed from: t */
    private int f10969t;

    /* renamed from: u */
    private ColorStateList f10970u;

    /* renamed from: v */
    private Typeface f10971v;

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.f$a */
    public class C3279a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ int f10972a;

        /* renamed from: b */
        final /* synthetic */ TextView f10973b;

        /* renamed from: c */
        final /* synthetic */ int f10974c;

        /* renamed from: d */
        final /* synthetic */ TextView f10975d;

        C3279a(int i, TextView textView, int i2, TextView textView2) {
            this.f10972a = i;
            this.f10973b = textView;
            this.f10974c = i2;
            this.f10975d = textView2;
        }

        public void onAnimationEnd(Animator animator) {
            C3278f.this.f10958i = this.f10972a;
            C3278f.this.f10956g = null;
            TextView textView = this.f10973b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f10974c == 1 && C3278f.this.f10962m != null) {
                    C3278f.this.f10962m.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f10975d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f10975d.setAlpha(1.0f);
            }
        }

        public void onAnimationStart(Animator animator) {
            TextView textView = this.f10975d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public C3278f(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f10950a = context;
        this.f10951b = textInputLayout;
        this.f10957h = (float) context.getResources().getDimensionPixelSize(C1393d.design_textinput_caption_translate_y);
    }

    /* renamed from: H */
    private void m13702H(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    /* renamed from: J */
    private void m13703J(ViewGroup viewGroup, int i) {
        if (i == 0) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: K */
    private boolean m13704K(TextView textView, CharSequence charSequence) {
        return C1013s.m5737O(this.f10951b) && this.f10951b.isEnabled() && (this.f10959j != this.f10958i || textView == null || !TextUtils.equals(textView.getText(), charSequence));
    }

    /* renamed from: N */
    private void m13705N(int i, int i2, boolean z) {
        if (i != i2) {
            if (z) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.f10956g = animatorSet;
                ArrayList arrayList = new ArrayList();
                m13710h(arrayList, this.f10967r, this.f10968s, 2, i, i2);
                m13710h(arrayList, this.f10961l, this.f10962m, 1, i, i2);
                C1402b.m7001a(animatorSet, arrayList);
                animatorSet.addListener(new C3279a(i2, m13713l(i), i, m13713l(i2)));
                animatorSet.start();
            } else {
                m13715z(i, i2);
            }
            this.f10951b.mo10988k0();
            this.f10951b.mo10989o0(z);
            this.f10951b.mo11073y0();
        }
    }

    /* renamed from: f */
    private boolean m13709f() {
        return (this.f10952c == null || this.f10951b.getEditText() == null) ? false : true;
    }

    /* renamed from: h */
    private void m13710h(List<Animator> list, boolean z, TextView textView, int i, int i2, int i3) {
        if (textView != null && z) {
            if (i == i3 || i == i2) {
                list.add(m13711i(textView, i3 == i));
                if (i3 == i) {
                    list.add(m13712j(textView));
                }
            }
        }
    }

    /* renamed from: i */
    private ObjectAnimator m13711i(TextView textView, boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, z ? 1.0f : 0.0f);
        ofFloat.setDuration(167L);
        ofFloat.setInterpolator(C1401a.f6006a);
        return ofFloat;
    }

    /* renamed from: j */
    private ObjectAnimator m13712j(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, -this.f10957h, 0.0f);
        ofFloat.setDuration(217L);
        ofFloat.setInterpolator(C1401a.f6009d);
        return ofFloat;
    }

    /* renamed from: l */
    private TextView m13713l(int i) {
        if (i == 1) {
            return this.f10962m;
        }
        if (i != 2) {
            return null;
        }
        return this.f10968s;
    }

    /* renamed from: u */
    private boolean m13714u(int i) {
        return i == 1 && this.f10962m != null && !TextUtils.isEmpty(this.f10960k);
    }

    /* renamed from: z */
    private void m13715z(int i, int i2) {
        TextView l;
        TextView l2;
        if (i != i2) {
            if (!(i2 == 0 || (l2 = m13713l(i2)) == null)) {
                l2.setVisibility(0);
                l2.setAlpha(1.0f);
            }
            if (!(i == 0 || (l = m13713l(i)) == null)) {
                l.setVisibility(4);
                if (i == 1) {
                    l.setText((CharSequence) null);
                }
            }
            this.f10958i = i2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo11116A(CharSequence charSequence) {
        this.f10963n = charSequence;
        TextView textView = this.f10962m;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo11117B(boolean z) {
        if (this.f10961l != z) {
            mo11128g();
            if (z) {
                C0302y yVar = new C0302y(this.f10950a);
                this.f10962m = yVar;
                yVar.setId(C1395f.textinput_error);
                if (Build.VERSION.SDK_INT >= 17) {
                    this.f10962m.setTextAlignment(5);
                }
                Typeface typeface = this.f10971v;
                if (typeface != null) {
                    this.f10962m.setTypeface(typeface);
                }
                mo11118C(this.f10964o);
                mo11119D(this.f10965p);
                mo11116A(this.f10963n);
                this.f10962m.setVisibility(4);
                C1013s.m5770k0(this.f10962m, 1);
                mo11126d(this.f10962m, 0);
            } else {
                mo11136s();
                mo11141y(this.f10962m, 0);
                this.f10962m = null;
                this.f10951b.mo10988k0();
                this.f10951b.mo11073y0();
            }
            this.f10961l = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo11118C(int i) {
        this.f10964o = i;
        TextView textView = this.f10962m;
        if (textView != null) {
            this.f10951b.mo10931Y(textView, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo11119D(ColorStateList colorStateList) {
        this.f10965p = colorStateList;
        TextView textView = this.f10962m;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo11120E(int i) {
        this.f10969t = i;
        TextView textView = this.f10968s;
        if (textView != null) {
            C0418i.m2106n(textView, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo11121F(boolean z) {
        if (this.f10967r != z) {
            mo11128g();
            if (z) {
                C0302y yVar = new C0302y(this.f10950a);
                this.f10968s = yVar;
                yVar.setId(C1395f.textinput_helper_text);
                if (Build.VERSION.SDK_INT >= 17) {
                    this.f10968s.setTextAlignment(5);
                }
                Typeface typeface = this.f10971v;
                if (typeface != null) {
                    this.f10968s.setTypeface(typeface);
                }
                this.f10968s.setVisibility(4);
                C1013s.m5770k0(this.f10968s, 1);
                mo11120E(this.f10969t);
                mo11122G(this.f10970u);
                mo11126d(this.f10968s, 1);
            } else {
                mo11137t();
                mo11141y(this.f10968s, 1);
                this.f10968s = null;
                this.f10951b.mo10988k0();
                this.f10951b.mo11073y0();
            }
            this.f10967r = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo11122G(ColorStateList colorStateList) {
        this.f10970u = colorStateList;
        TextView textView = this.f10968s;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo11123I(Typeface typeface) {
        if (typeface != this.f10971v) {
            this.f10971v = typeface;
            m13702H(this.f10962m, typeface);
            m13702H(this.f10968s, typeface);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public void mo11124L(CharSequence charSequence) {
        mo11128g();
        this.f10960k = charSequence;
        this.f10962m.setText(charSequence);
        int i = this.f10958i;
        if (i != 1) {
            this.f10959j = 1;
        }
        m13705N(i, this.f10959j, m13704K(this.f10962m, charSequence));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public void mo11125M(CharSequence charSequence) {
        mo11128g();
        this.f10966q = charSequence;
        this.f10968s.setText(charSequence);
        int i = this.f10958i;
        if (i != 2) {
            this.f10959j = 2;
        }
        m13705N(i, this.f10959j, m13704K(this.f10968s, charSequence));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo11126d(TextView textView, int i) {
        if (this.f10952c == null && this.f10954e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f10950a);
            this.f10952c = linearLayout;
            linearLayout.setOrientation(0);
            this.f10951b.addView(this.f10952c, -1, -2);
            this.f10954e = new FrameLayout(this.f10950a);
            this.f10952c.addView(this.f10954e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f10951b.getEditText() != null) {
                mo11127e();
            }
        }
        if (mo11138v(i)) {
            this.f10954e.setVisibility(0);
            this.f10954e.addView(textView);
            this.f10955f++;
        } else {
            this.f10952c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f10952c.setVisibility(0);
        this.f10953d++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo11127e() {
        if (m13709f()) {
            C1013s.m5792v0(this.f10952c, C1013s.m5726D(this.f10951b.getEditText()), 0, C1013s.m5725C(this.f10951b.getEditText()), 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo11128g() {
        Animator animator = this.f10956g;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo11129k() {
        return m13714u(this.f10959j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public CharSequence mo11130m() {
        return this.f10963n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public CharSequence mo11131n() {
        return this.f10960k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public int mo11132o() {
        TextView textView = this.f10962m;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public ColorStateList mo11133p() {
        TextView textView = this.f10962m;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public CharSequence mo11134q() {
        return this.f10966q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public int mo11135r() {
        TextView textView = this.f10968s;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo11136s() {
        this.f10960k = null;
        mo11128g();
        if (this.f10958i == 1) {
            this.f10959j = (!this.f10967r || TextUtils.isEmpty(this.f10966q)) ? 0 : 2;
        }
        m13705N(this.f10958i, this.f10959j, m13704K(this.f10962m, null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo11137t() {
        mo11128g();
        int i = this.f10958i;
        if (i == 2) {
            this.f10959j = 0;
        }
        m13705N(i, this.f10959j, m13704K(this.f10968s, null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public boolean mo11138v(int i) {
        return i == 0 || i == 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public boolean mo11139w() {
        return this.f10961l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean mo11140x() {
        return this.f10967r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo11141y(TextView textView, int i) {
        FrameLayout frameLayout;
        if (this.f10952c != null) {
            if (!mo11138v(i) || (frameLayout = this.f10954e) == null) {
                this.f10952c.removeView(textView);
            } else {
                int i2 = this.f10955f - 1;
                this.f10955f = i2;
                m13703J(frameLayout, i2);
                this.f10954e.removeView(textView);
            }
            int i3 = this.f10953d - 1;
            this.f10953d = i3;
            m13703J(this.f10952c, i3);
        }
    }
}
