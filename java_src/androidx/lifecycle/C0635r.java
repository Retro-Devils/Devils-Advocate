package androidx.lifecycle;

import java.util.HashMap;

/* renamed from: androidx.lifecycle.r */
public class C0635r {

    /* renamed from: a */
    private final HashMap<String, AbstractC0631p> f3052a = new HashMap<>();

    /* renamed from: a */
    public final void mo3687a() {
        for (AbstractC0631p pVar : this.f3052a.values()) {
            pVar.mo3683a();
        }
        this.f3052a.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final AbstractC0631p mo3688b(String str) {
        return this.f3052a.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo3689c(String str, AbstractC0631p pVar) {
        AbstractC0631p put = this.f3052a.put(str, pVar);
        if (put != null) {
            put.mo2847c();
        }
    }
}
