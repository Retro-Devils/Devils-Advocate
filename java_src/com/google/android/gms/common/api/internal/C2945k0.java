package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C2906c;
import java.util.Map;
import java.util.Set;
import p006b.p021d.C0823a;
import p069c.p073b.p074a.p075a.p077b.C1279a;
import p069c.p073b.p074a.p075a.p089g.C1377e;

/* renamed from: com.google.android.gms.common.api.internal.k0 */
public final class C2945k0 {

    /* renamed from: a */
    private final C0823a<C2943j0<?>, C1279a> f9856a;

    /* renamed from: b */
    private final C0823a<C2943j0<?>, String> f9857b;

    /* renamed from: c */
    private final C1377e<Map<C2943j0<?>, String>> f9858c;

    /* renamed from: d */
    private int f9859d;

    /* renamed from: e */
    private boolean f9860e;

    /* renamed from: a */
    public final void mo9671a(C2943j0<?> j0Var, C1279a aVar, String str) {
        this.f9856a.put(j0Var, aVar);
        this.f9857b.put(j0Var, str);
        this.f9859d--;
        if (!aVar.mo6266l()) {
            this.f9860e = true;
        }
        if (this.f9859d != 0) {
            return;
        }
        if (this.f9860e) {
            this.f9858c.mo6426b(new C2906c(this.f9856a));
            return;
        }
        this.f9858c.mo6427c(this.f9857b);
    }

    /* renamed from: b */
    public final Set<C2943j0<?>> mo9672b() {
        return this.f9856a.keySet();
    }
}
