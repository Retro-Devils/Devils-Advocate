package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C2927d;
import p069c.p073b.p074a.p075a.p077b.C1281c;
import p069c.p073b.p074a.p075a.p089g.C1377e;

/* renamed from: com.google.android.gms.common.api.internal.i0 */
public final class C2941i0 extends AbstractC2937g0<Boolean> {

    /* renamed from: c */
    private final C2936g<?> f9855c;

    public C2941i0(C2936g<?> gVar, C1377e<Boolean> eVar) {
        super(4, eVar);
        this.f9855c = gVar;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2937g0, com.google.android.gms.common.api.internal.AbstractC2951o
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo9657b(Status status) {
        super.mo9657b(status);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2951o
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo9661d(C2942j jVar, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2937g0, com.google.android.gms.common.api.internal.AbstractC2951o
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo9659e(RuntimeException runtimeException) {
        super.mo9659e(runtimeException);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2961y
    /* renamed from: g */
    public final C1281c[] mo9662g(C2927d.C2928a<?> aVar) {
        if (aVar.mo9647x().get(this.f9855c) == null) {
            return null;
        }
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2961y
    /* renamed from: h */
    public final boolean mo9663h(C2927d.C2928a<?> aVar) {
        if (aVar.mo9647x().get(this.f9855c) == null) {
            return false;
        }
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2937g0
    /* renamed from: i */
    public final void mo9660i(C2927d.C2928a<?> aVar) {
        if (aVar.mo9647x().remove(this.f9855c) == null) {
            this.f9853b.mo6429e((T) Boolean.FALSE);
        } else {
            aVar.mo9644o();
            throw null;
        }
    }
}
