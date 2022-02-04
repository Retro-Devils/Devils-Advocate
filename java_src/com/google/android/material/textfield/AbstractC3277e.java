package com.google.android.material.textfield;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;

/* renamed from: com.google.android.material.textfield.e */
abstract class AbstractC3277e {

    /* renamed from: a */
    TextInputLayout f10947a;

    /* renamed from: b */
    Context f10948b;

    /* renamed from: c */
    CheckableImageButton f10949c;

    AbstractC3277e(TextInputLayout textInputLayout) {
        this.f10947a = textInputLayout;
        this.f10948b = textInputLayout.getContext();
        this.f10949c = textInputLayout.getEndIconView();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo11089a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo11104b(int i) {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo11090c(boolean z) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo11105d() {
        return false;
    }
}
