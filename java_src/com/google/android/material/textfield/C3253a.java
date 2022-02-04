package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import p006b.p007a.p008k.p009a.C0764a;
import p069c.p073b.p074a.p090b.C1394e;
import p069c.p073b.p074a.p090b.C1398i;
import p069c.p073b.p074a.p090b.p092l.C1401a;

/* renamed from: com.google.android.material.textfield.a */
class C3253a extends AbstractC3277e {

    /* renamed from: d */
    private final TextWatcher f10902d = new C3254a();

    /* renamed from: e */
    private final View.OnFocusChangeListener f10903e = new View$OnFocusChangeListenerC3255b();

    /* renamed from: f */
    private final TextInputLayout.AbstractC3249f f10904f = new C3256c();

    /* renamed from: g */
    private final TextInputLayout.AbstractC3250g f10905g = new C3257d();

    /* renamed from: h */
    private AnimatorSet f10906h;

    /* renamed from: i */
    private ValueAnimator f10907i;

    /* renamed from: com.google.android.material.textfield.a$a */
    class C3254a implements TextWatcher {
        C3254a() {
        }

        public void afterTextChanged(Editable editable) {
            if (C3253a.this.f10947a.getSuffixText() == null) {
                C3253a.this.m13644i(C3253a.m13647l(editable));
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.a$b */
    class View$OnFocusChangeListenerC3255b implements View.OnFocusChangeListener {
        View$OnFocusChangeListenerC3255b() {
        }

        public void onFocusChange(View view, boolean z) {
            boolean z2 = true;
            boolean z3 = !TextUtils.isEmpty(((EditText) view).getText());
            C3253a aVar = C3253a.this;
            if (!z3 || !z) {
                z2 = false;
            }
            aVar.m13644i(z2);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$c */
    class C3256c implements TextInputLayout.AbstractC3249f {
        C3256c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.AbstractC3249f
        /* renamed from: a */
        public void mo11080a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(editText.hasFocus() && C3253a.m13647l(editText.getText()));
            textInputLayout.setEndIconCheckable(false);
            editText.setOnFocusChangeListener(C3253a.this.f10903e);
            editText.removeTextChangedListener(C3253a.this.f10902d);
            editText.addTextChangedListener(C3253a.this.f10902d);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$d */
    class C3257d implements TextInputLayout.AbstractC3250g {
        C3257d() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.AbstractC3250g
        /* renamed from: a */
        public void mo11081a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i == 2) {
                editText.removeTextChangedListener(C3253a.this.f10902d);
                if (editText.getOnFocusChangeListener() == C3253a.this.f10903e) {
                    editText.setOnFocusChangeListener(null);
                }
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.a$e */
    class View$OnClickListenerC3258e implements View.OnClickListener {
        View$OnClickListenerC3258e() {
        }

        public void onClick(View view) {
            Editable text = C3253a.this.f10947a.getEditText().getText();
            if (text != null) {
                text.clear();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.a$f */
    public class C3259f extends AnimatorListenerAdapter {
        C3259f() {
        }

        public void onAnimationStart(Animator animator) {
            C3253a.this.f10947a.setEndIconVisible(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.a$g */
    public class C3260g extends AnimatorListenerAdapter {
        C3260g() {
        }

        public void onAnimationEnd(Animator animator) {
            C3253a.this.f10947a.setEndIconVisible(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.a$h */
    public class C3261h implements ValueAnimator.AnimatorUpdateListener {
        C3261h() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C3253a.this.f10949c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.a$i */
    public class C3262i implements ValueAnimator.AnimatorUpdateListener {
        C3262i() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C3253a.this.f10949c.setScaleX(floatValue);
            C3253a.this.f10949c.setScaleY(floatValue);
        }
    }

    C3253a(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: i */
    private void m13644i(boolean z) {
        boolean z2 = this.f10947a.mo10926J() == z;
        if (z) {
            this.f10907i.cancel();
            this.f10906h.start();
            if (z2) {
                this.f10906h.end();
                return;
            }
            return;
        }
        this.f10906h.cancel();
        this.f10907i.start();
        if (z2) {
            this.f10907i.end();
        }
    }

    /* renamed from: j */
    private ValueAnimator m13645j(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C1401a.f6006a);
        ofFloat.setDuration(100L);
        ofFloat.addUpdateListener(new C3261h());
        return ofFloat;
    }

    /* renamed from: k */
    private ValueAnimator m13646k() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(C1401a.f6009d);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new C3262i());
        return ofFloat;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static boolean m13647l(Editable editable) {
        return editable.length() > 0;
    }

    /* renamed from: m */
    private void m13648m() {
        ValueAnimator k = m13646k();
        ValueAnimator j = m13645j(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f10906h = animatorSet;
        animatorSet.playTogether(k, j);
        this.f10906h.addListener(new C3259f());
        ValueAnimator j2 = m13645j(1.0f, 0.0f);
        this.f10907i = j2;
        j2.addListener(new C3260g());
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.AbstractC3277e
    /* renamed from: a */
    public void mo11089a() {
        this.f10947a.setEndIconDrawable(C0764a.m4517d(this.f10948b, C1394e.mtrl_ic_cancel));
        TextInputLayout textInputLayout = this.f10947a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C1398i.clear_text_end_icon_content_description));
        this.f10947a.setEndIconOnClickListener(new View$OnClickListenerC3258e());
        this.f10947a.mo10937e(this.f10904f);
        this.f10947a.mo10938f(this.f10905g);
        m13648m();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.AbstractC3277e
    /* renamed from: c */
    public void mo11090c(boolean z) {
        if (this.f10947a.getSuffixText() != null) {
            m13644i(z);
        }
    }
}
