package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: com.google.android.material.appbar.c */
class C3059c<V extends View> extends CoordinatorLayout.AbstractC0337c<V> {

    /* renamed from: a */
    private C3060d f10112a;

    /* renamed from: b */
    private int f10113b = 0;

    /* renamed from: c */
    private int f10114c = 0;

    public C3059c() {
    }

    public C3059c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: E */
    public int mo9887E() {
        C3060d dVar = this.f10112a;
        if (dVar != null) {
            return dVar.mo9911b();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo9904F(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.mo2034I(v, i);
    }

    /* renamed from: G */
    public boolean mo9888G(int i) {
        C3060d dVar = this.f10112a;
        if (dVar != null) {
            return dVar.mo9914e(i);
        }
        this.f10113b = i;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0337c
    /* renamed from: l */
    public boolean mo2098l(CoordinatorLayout coordinatorLayout, V v, int i) {
        mo9904F(coordinatorLayout, v, i);
        if (this.f10112a == null) {
            this.f10112a = new C3060d(v);
        }
        this.f10112a.mo9912c();
        this.f10112a.mo9910a();
        int i2 = this.f10113b;
        if (i2 != 0) {
            this.f10112a.mo9914e(i2);
            this.f10113b = 0;
        }
        int i3 = this.f10114c;
        if (i3 == 0) {
            return true;
        }
        this.f10112a.mo9913d(i3);
        this.f10114c = 0;
        return true;
    }
}
