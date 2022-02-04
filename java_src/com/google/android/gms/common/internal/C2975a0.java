package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.AbstractC2914g;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C3024q;
import java.util.concurrent.TimeUnit;
import p069c.p073b.p074a.p075a.p089g.C1377e;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.internal.a0 */
public final class C2975a0 implements AbstractC2914g.AbstractC2915a {

    /* renamed from: a */
    private final /* synthetic */ AbstractC2914g f9904a;

    /* renamed from: b */
    private final /* synthetic */ C1377e f9905b;

    /* renamed from: c */
    private final /* synthetic */ C3024q.AbstractC3025a f9906c;

    /* renamed from: d */
    private final /* synthetic */ C3024q.AbstractC3026b f9907d;

    C2975a0(AbstractC2914g gVar, C1377e eVar, C3024q.AbstractC3025a aVar, C3024q.AbstractC3026b bVar) {
        this.f9904a = gVar;
        this.f9905b = eVar;
        this.f9906c = aVar;
        this.f9907d = bVar;
    }

    @Override // com.google.android.gms.common.api.AbstractC2914g.AbstractC2915a
    /* renamed from: a */
    public final void mo9597a(Status status) {
        if (status.mo9557k()) {
            this.f9905b.mo6427c(this.f9906c.mo9700a(this.f9904a.mo9596b(0, TimeUnit.MILLISECONDS)));
            return;
        }
        this.f9905b.mo6426b(this.f9907d.mo9804a(status));
    }
}
