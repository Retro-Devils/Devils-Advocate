package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.AbstractC2914g;
import com.google.android.gms.common.api.Status;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.k */
public final class C2944k implements AbstractC2914g.AbstractC2915a {

    /* renamed from: a */
    private final /* synthetic */ BasePendingResult f9862a;

    /* renamed from: b */
    private final /* synthetic */ C2942j f9863b;

    C2944k(C2942j jVar, BasePendingResult basePendingResult) {
        this.f9863b = jVar;
        this.f9862a = basePendingResult;
    }

    @Override // com.google.android.gms.common.api.AbstractC2914g.AbstractC2915a
    /* renamed from: a */
    public final void mo9597a(Status status) {
        this.f9863b.f9856a.remove(this.f9862a);
    }
}
