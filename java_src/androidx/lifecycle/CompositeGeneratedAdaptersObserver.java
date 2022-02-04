package androidx.lifecycle;

import androidx.lifecycle.AbstractC0614d;

/* access modifiers changed from: package-private */
public class CompositeGeneratedAdaptersObserver implements AbstractC0617e {

    /* renamed from: a */
    private final AbstractC0613c[] f2994a;

    CompositeGeneratedAdaptersObserver(AbstractC0613c[] cVarArr) {
        this.f2994a = cVarArr;
    }

    @Override // androidx.lifecycle.AbstractC0617e
    /* renamed from: d */
    public void mo148d(AbstractC0619g gVar, AbstractC0614d.EnumC0615a aVar) {
        C0625k kVar = new C0625k();
        for (AbstractC0613c cVar : this.f2994a) {
            cVar.mo3663a(gVar, aVar, false, kVar);
        }
        for (AbstractC0613c cVar2 : this.f2994a) {
            cVar2.mo3663a(gVar, aVar, true, kVar);
        }
    }
}
