package com.google.android.material.textfield;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import p006b.p007a.p008k.p009a.C0764a;
import p069c.p073b.p074a.p090b.C1394e;
import p069c.p073b.p074a.p090b.C1398i;

/* renamed from: com.google.android.material.textfield.i */
class C3283i extends AbstractC3277e {

    /* renamed from: d */
    private final TextWatcher f10989d = new C3284a();

    /* renamed from: e */
    private final TextInputLayout.AbstractC3249f f10990e = new C3285b();

    /* renamed from: f */
    private final TextInputLayout.AbstractC3250g f10991f = new C3286c();

    /* renamed from: com.google.android.material.textfield.i$a */
    class C3284a implements TextWatcher {
        C3284a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C3283i iVar = C3283i.this;
            iVar.f10957c.setChecked(!iVar.m13750g());
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.i$b */
    class C3285b implements TextInputLayout.AbstractC3249f {
        C3285b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.AbstractC3249f
        /* renamed from: a */
        public void mo11080a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(true);
            textInputLayout.setEndIconCheckable(true);
            C3283i iVar = C3283i.this;
            iVar.f10957c.setChecked(!iVar.m13750g());
            editText.removeTextChangedListener(C3283i.this.f10989d);
            editText.addTextChangedListener(C3283i.this.f10989d);
        }
    }

    /* renamed from: com.google.android.material.textfield.i$c */
    class C3286c implements TextInputLayout.AbstractC3250g {
        C3286c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.AbstractC3250g
        /* renamed from: a */
        public void mo11081a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i == 1) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                editText.removeTextChangedListener(C3283i.this.f10989d);
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.i$d */
    class View$OnClickListenerC3287d implements View.OnClickListener {
        View$OnClickListenerC3287d() {
        }

        public void onClick(View view) {
            EditText editText = C3283i.this.f10955a.getEditText();
            if (editText != null) {
                int selectionEnd = editText.getSelectionEnd();
                editText.setTransformationMethod(C3283i.this.m13750g() ? null : PasswordTransformationMethod.getInstance());
                if (selectionEnd >= 0) {
                    editText.setSelection(selectionEnd);
                }
            }
        }
    }

    C3283i(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: g */
    private boolean m13750g() {
        EditText editText = this.f10955a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    /* renamed from: h */
    private static boolean m13751h(EditText editText) {
        return editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.textfield.AbstractC3277e
    /* renamed from: a */
    public void mo11089a() {
        this.f10955a.setEndIconDrawable(C0764a.m4517d(this.f10956b, C1394e.design_password_eye));
        TextInputLayout textInputLayout = this.f10955a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C1398i.password_toggle_content_description));
        this.f10955a.setEndIconOnClickListener(new View$OnClickListenerC3287d());
        this.f10955a.mo10937e(this.f10990e);
        this.f10955a.mo10938f(this.f10991f);
        EditText editText = this.f10955a.getEditText();
        if (m13751h(editText)) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
