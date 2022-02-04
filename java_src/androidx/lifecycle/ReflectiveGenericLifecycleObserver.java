package androidx.lifecycle;

import androidx.lifecycle.AbstractC0614d;
import androidx.lifecycle.C0609a;

/* access modifiers changed from: package-private */
public class ReflectiveGenericLifecycleObserver implements AbstractC0617e {

    /* renamed from: a */
    private final Object f3016a;

    /* renamed from: b */
    private final C0609a.C0610a f3017b;

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f3016a = obj;
        this.f3017b = C0609a.f3019a.mo3651c(obj.getClass());
    }

    @Override // androidx.lifecycle.AbstractC0617e
    /* renamed from: d */
    public void mo148d(AbstractC0619g gVar, AbstractC0614d.EnumC0615a aVar) {
        this.f3017b.mo3653a(gVar, aVar, this.f3016a);
    }
}
