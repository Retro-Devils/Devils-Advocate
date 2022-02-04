package androidx.fragment.app;

import androidx.lifecycle.AbstractC0614d;
import androidx.lifecycle.AbstractC0619g;
import androidx.lifecycle.C0620h;

/* renamed from: androidx.fragment.app.r */
class C0494r implements AbstractC0619g {

    /* renamed from: b */
    private C0620h f2547b = null;

    C0494r() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2915a(AbstractC0614d.EnumC0615a aVar) {
        this.f2547b.mo3668i(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2916b() {
        if (this.f2547b == null) {
            this.f2547b = new C0620h(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo2917c() {
        return this.f2547b != null;
    }

    @Override // androidx.lifecycle.AbstractC0619g
    /* renamed from: n */
    public AbstractC0614d mo140n() {
        mo2916b();
        return this.f2547b;
    }
}
