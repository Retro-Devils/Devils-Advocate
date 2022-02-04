package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import p006b.p007a.p008k.p009a.C0764a;
import p006b.p030g.p039k.C1013s;
import p006b.p030g.p039k.p040b0.C0979c;
import p069c.p073b.p074a.p090b.C1391b;
import p069c.p073b.p074a.p090b.C1393d;
import p069c.p073b.p074a.p090b.C1394e;
import p069c.p073b.p074a.p090b.C1398i;
import p069c.p073b.p074a.p090b.p092l.C1401a;
import p069c.p073b.p074a.p090b.p098q.C1428a;
import p069c.p073b.p074a.p090b.p107z.C1455g;
import p069c.p073b.p074a.p090b.p107z.C1462k;

/* renamed from: com.google.android.material.textfield.d */
class C3265d extends AbstractC3277e {

    /* renamed from: d */
    private static final boolean f10920d = (Build.VERSION.SDK_INT >= 21);

    /* renamed from: e */
    private final TextWatcher f10921e = new C3266a();

    /* renamed from: f */
    private final View.OnFocusChangeListener f10922f = new View$OnFocusChangeListenerC3269c();

    /* renamed from: g */
    private final TextInputLayout.C3248e f10923g = new C3270d(this.f10947a);

    /* renamed from: h */
    private final TextInputLayout.AbstractC3249f f10924h = new C3271e();
    @SuppressLint({"ClickableViewAccessibility"})

    /* renamed from: i */
    private final TextInputLayout.AbstractC3250g f10925i = new C3272f();

    /* renamed from: j */
    private boolean f10926j = false;

    /* renamed from: k */
    private boolean f10927k = false;

    /* renamed from: l */
    private long f10928l = Long.MAX_VALUE;

    /* renamed from: m */
    private StateListDrawable f10929m;

    /* renamed from: n */
    private C1455g f10930n;

    /* renamed from: o */
    private AccessibilityManager f10931o;

    /* renamed from: p */
    private ValueAnimator f10932p;

    /* renamed from: q */
    private ValueAnimator f10933q;

    /* renamed from: com.google.android.material.textfield.d$a */
    class C3266a implements TextWatcher {

        /* renamed from: com.google.android.material.textfield.d$a$a */
        class RunnableC3267a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ AutoCompleteTextView f10935b;

            RunnableC3267a(AutoCompleteTextView autoCompleteTextView) {
                this.f10935b = autoCompleteTextView;
            }

            public void run() {
                boolean isPopupShowing = this.f10935b.isPopupShowing();
                C3265d.this.m13665C(isPopupShowing);
                C3265d.this.f10926j = isPopupShowing;
            }
        }

        C3266a() {
        }

        public void afterTextChanged(Editable editable) {
            C3265d dVar = C3265d.this;
            AutoCompleteTextView x = dVar.m13688x(dVar.f10947a.getEditText());
            x.post(new RunnableC3267a(x));
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.d$b */
    public class C3268b implements ValueAnimator.AnimatorUpdateListener {
        C3268b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C3265d.this.f10949c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.d$c */
    class View$OnFocusChangeListenerC3269c implements View.OnFocusChangeListener {
        View$OnFocusChangeListenerC3269c() {
        }

        public void onFocusChange(View view, boolean z) {
            C3265d.this.f10947a.setEndIconActivated(z);
            if (!z) {
                C3265d.this.m13665C(false);
                C3265d.this.f10926j = false;
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.d$d */
    class C3270d extends TextInputLayout.C3248e {
        C3270d(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        @Override // p006b.p030g.p039k.C0962a, com.google.android.material.textfield.TextInputLayout.C3248e
        /* renamed from: g */
        public void mo2362g(View view, C0979c cVar) {
            super.mo2362g(view, cVar);
            if (C3265d.this.f10947a.getEditText().getKeyListener() == null) {
                cVar.mo5470a0(Spinner.class.getName());
            }
            if (cVar.mo5459L()) {
                cVar.mo5489l0(null);
            }
        }

        @Override // p006b.p030g.p039k.C0962a
        /* renamed from: h */
        public void mo4455h(View view, AccessibilityEvent accessibilityEvent) {
            super.mo4455h(view, accessibilityEvent);
            C3265d dVar = C3265d.this;
            AutoCompleteTextView x = dVar.m13688x(dVar.f10947a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && C3265d.this.f10931o.isTouchExplorationEnabled()) {
                C3265d.this.m13668F(x);
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.d$e */
    class C3271e implements TextInputLayout.AbstractC3249f {
        C3271e() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.AbstractC3249f
        /* renamed from: a */
        public void mo11080a(TextInputLayout textInputLayout) {
            AutoCompleteTextView x = C3265d.this.m13688x(textInputLayout.getEditText());
            C3265d.this.m13666D(x);
            C3265d.this.m13685u(x);
            C3265d.this.m13667E(x);
            x.setThreshold(0);
            x.removeTextChangedListener(C3265d.this.f10921e);
            x.addTextChangedListener(C3265d.this.f10921e);
            textInputLayout.setEndIconCheckable(true);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            textInputLayout.setTextInputAccessibilityDelegate(C3265d.this.f10923g);
            textInputLayout.setEndIconVisible(true);
        }
    }

    /* renamed from: com.google.android.material.textfield.d$f */
    class C3272f implements TextInputLayout.AbstractC3250g {
        C3272f() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.AbstractC3250g
        /* renamed from: a */
        public void mo11081a(TextInputLayout textInputLayout, int i) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView != null && i == 3) {
                autoCompleteTextView.removeTextChangedListener(C3265d.this.f10921e);
                if (autoCompleteTextView.getOnFocusChangeListener() == C3265d.this.f10922f) {
                    autoCompleteTextView.setOnFocusChangeListener(null);
                }
                autoCompleteTextView.setOnTouchListener(null);
                if (C3265d.f10920d) {
                    autoCompleteTextView.setOnDismissListener(null);
                }
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.d$g */
    class View$OnClickListenerC3273g implements View.OnClickListener {
        View$OnClickListenerC3273g() {
        }

        public void onClick(View view) {
            C3265d.this.m13668F((AutoCompleteTextView) C3265d.this.f10947a.getEditText());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.d$h */
    public class View$OnTouchListenerC3274h implements View.OnTouchListener {

        /* renamed from: b */
        final /* synthetic */ AutoCompleteTextView f10943b;

        View$OnTouchListenerC3274h(AutoCompleteTextView autoCompleteTextView) {
            this.f10943b = autoCompleteTextView;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (C3265d.this.m13664B()) {
                    C3265d.this.f10926j = false;
                }
                C3265d.this.m13668F(this.f10943b);
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.d$i */
    public class C3275i implements AutoCompleteTextView.OnDismissListener {
        C3275i() {
        }

        public void onDismiss() {
            C3265d.this.f10926j = true;
            C3265d.this.f10928l = System.currentTimeMillis();
            C3265d.this.m13665C(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.d$j */
    public class C3276j extends AnimatorListenerAdapter {
        C3276j() {
        }

        public void onAnimationEnd(Animator animator) {
            C3265d dVar = C3265d.this;
            dVar.f10949c.setChecked(dVar.f10927k);
            C3265d.this.f10933q.start();
        }
    }

    C3265d(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* renamed from: A */
    private void m13663A() {
        this.f10933q = m13689y(67, 0.0f, 1.0f);
        ValueAnimator y = m13689y(50, 1.0f, 0.0f);
        this.f10932p = y;
        y.addListener(new C3276j());
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: B */
    private boolean m13664B() {
        long currentTimeMillis = System.currentTimeMillis() - this.f10928l;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: C */
    private void m13665C(boolean z) {
        if (this.f10927k != z) {
            this.f10927k = z;
            this.f10933q.cancel();
            this.f10932p.start();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: D */
    private void m13666D(AutoCompleteTextView autoCompleteTextView) {
        Drawable drawable;
        if (f10920d) {
            int boxBackgroundMode = this.f10947a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                drawable = this.f10930n;
            } else if (boxBackgroundMode == 1) {
                drawable = this.f10929m;
            } else {
                return;
            }
            autoCompleteTextView.setDropDownBackgroundDrawable(drawable);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: E */
    private void m13667E(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new View$OnTouchListenerC3274h(autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(this.f10922f);
        if (f10920d) {
            autoCompleteTextView.setOnDismissListener(new C3275i());
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: F */
    private void m13668F(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView != null) {
            if (m13664B()) {
                this.f10926j = false;
            }
            if (!this.f10926j) {
                if (f10920d) {
                    m13665C(!this.f10927k);
                } else {
                    this.f10927k = !this.f10927k;
                    this.f10949c.toggle();
                }
                if (this.f10927k) {
                    autoCompleteTextView.requestFocus();
                    autoCompleteTextView.showDropDown();
                    return;
                }
                autoCompleteTextView.dismissDropDown();
                return;
            }
            this.f10926j = false;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: u */
    private void m13685u(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView.getKeyListener() == null) {
            int boxBackgroundMode = this.f10947a.getBoxBackgroundMode();
            C1455g boxBackground = this.f10947a.getBoxBackground();
            int c = C1428a.m7052c(autoCompleteTextView, C1391b.f5672g);
            int[][] iArr = {new int[]{16842919}, new int[0]};
            if (boxBackgroundMode == 2) {
                m13687w(autoCompleteTextView, c, iArr, boxBackground);
            } else if (boxBackgroundMode == 1) {
                m13686v(autoCompleteTextView, c, iArr, boxBackground);
            }
        }
    }

    /* renamed from: v */
    private void m13686v(AutoCompleteTextView autoCompleteTextView, int i, int[][] iArr, C1455g gVar) {
        int boxBackgroundColor = this.f10947a.getBoxBackgroundColor();
        int[] iArr2 = {C1428a.m7055f(i, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (f10920d) {
            C1013s.m5772l0(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, iArr2), gVar, gVar));
            return;
        }
        C1455g gVar2 = new C1455g(gVar.mo6597C());
        gVar2.mo6608V(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar, gVar2});
        int D = C1013s.m5726D(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int C = C1013s.m5725C(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        C1013s.m5772l0(autoCompleteTextView, layerDrawable);
        C1013s.m5792v0(autoCompleteTextView, D, paddingTop, C, paddingBottom);
    }

    /* renamed from: w */
    private void m13687w(AutoCompleteTextView autoCompleteTextView, int i, int[][] iArr, C1455g gVar) {
        LayerDrawable layerDrawable;
        int c = C1428a.m7052c(autoCompleteTextView, C1391b.colorSurface);
        C1455g gVar2 = new C1455g(gVar.mo6597C());
        int f = C1428a.m7055f(i, c, 0.1f);
        gVar2.mo6608V(new ColorStateList(iArr, new int[]{f, 0}));
        if (f10920d) {
            gVar2.setTint(c);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{f, c});
            C1455g gVar3 = new C1455g(gVar.mo6597C());
            gVar3.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar2, gVar3), gVar});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar});
        }
        C1013s.m5772l0(autoCompleteTextView, layerDrawable);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: x */
    private AutoCompleteTextView m13688x(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    /* renamed from: y */
    private ValueAnimator m13689y(int i, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C1401a.f6006a);
        ofFloat.setDuration((long) i);
        ofFloat.addUpdateListener(new C3268b());
        return ofFloat;
    }

    /* renamed from: z */
    private C1455g m13690z(float f, float f2, float f3, int i) {
        C1462k m = C1462k.m7189a().mo6679z(f).mo6665D(f).mo6671r(f2).mo6675v(f2).mo6667m();
        C1455g m2 = C1455g.m7141m(this.f10948b, f3);
        m2.setShapeAppearanceModel(m);
        m2.mo6610X(0, i, 0, i);
        return m2;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.AbstractC3277e
    /* renamed from: a */
    public void mo11089a() {
        float dimensionPixelOffset = (float) this.f10948b.getResources().getDimensionPixelOffset(C1393d.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = (float) this.f10948b.getResources().getDimensionPixelOffset(C1393d.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.f10948b.getResources().getDimensionPixelOffset(C1393d.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        C1455g z = m13690z(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        C1455g z2 = m13690z(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f10930n = z;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f10929m = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, z);
        this.f10929m.addState(new int[0], z2);
        this.f10947a.setEndIconDrawable(C0764a.m4517d(this.f10948b, f10920d ? C1394e.mtrl_dropdown_arrow : C1394e.mtrl_ic_arrow_drop_down));
        TextInputLayout textInputLayout = this.f10947a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C1398i.exposed_dropdown_menu_content_description));
        this.f10947a.setEndIconOnClickListener(new View$OnClickListenerC3273g());
        this.f10947a.mo10937e(this.f10924h);
        this.f10947a.mo10938f(this.f10925i);
        m13663A();
        C1013s.m5786s0(this.f10949c, 2);
        this.f10931o = (AccessibilityManager) this.f10948b.getSystemService("accessibility");
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.AbstractC3277e
    /* renamed from: b */
    public boolean mo11104b(int i) {
        return i != 0;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.AbstractC3277e
    /* renamed from: d */
    public boolean mo11105d() {
        return true;
    }
}
