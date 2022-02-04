package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC2911f;
import com.google.android.gms.common.api.C2894a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AbstractC2978c;
import java.util.Set;
import p069c.p073b.p074a.p075a.p077b.C1282d;

/* renamed from: com.google.android.gms.common.internal.h */
public abstract class AbstractC3002h<T extends IInterface> extends AbstractC2978c<T> implements C2894a.AbstractC2902f {

    /* renamed from: D */
    private final C2992d f9996D;

    /* renamed from: E */
    private final Set<Scope> f9997E;

    /* renamed from: F */
    private final Account f9998F;

    protected AbstractC3002h(Context context, Looper looper, int i, C2992d dVar, AbstractC2911f.AbstractC2912a aVar, AbstractC2911f.AbstractC2913b bVar) {
        this(context, looper, AbstractC3004i.m12321a(context), C1282d.m6764k(), i, dVar, (AbstractC2911f.AbstractC2912a) C3027r.m12376h(aVar), (AbstractC2911f.AbstractC2913b) C3027r.m12376h(bVar));
    }

    protected AbstractC3002h(Context context, Looper looper, AbstractC3004i iVar, C1282d dVar, int i, C2992d dVar2, AbstractC2911f.AbstractC2912a aVar, AbstractC2911f.AbstractC2913b bVar) {
        super(context, looper, iVar, dVar, i, m12307f0(aVar), m12308g0(bVar), dVar2.mo9750e());
        this.f9996D = dVar2;
        this.f9998F = dVar2.mo9746a();
        this.f9997E = m12309h0(dVar2.mo9748c());
    }

    /* renamed from: f0 */
    private static AbstractC2978c.AbstractC2979a m12307f0(AbstractC2911f.AbstractC2912a aVar) {
        if (aVar == null) {
            return null;
        }
        return new C3036x(aVar);
    }

    /* renamed from: g0 */
    private static AbstractC2978c.AbstractC2980b m12308g0(AbstractC2911f.AbstractC2913b bVar) {
        if (bVar == null) {
            return null;
        }
        return new C3037y(bVar);
    }

    /* renamed from: h0 */
    private final Set<Scope> m12309h0(Set<Scope> set) {
        Set<Scope> e0 = mo9770e0(set);
        for (Scope scope : e0) {
            if (!set.contains(scope)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return e0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e0 */
    public Set<Scope> mo9770e0(Set<Scope> set) {
        return set;
    }

    @Override // com.google.android.gms.common.api.C2894a.AbstractC2902f, com.google.android.gms.common.internal.AbstractC2978c
    /* renamed from: q */
    public int mo6358q() {
        return super.mo6358q();
    }

    @Override // com.google.android.gms.common.internal.AbstractC2978c
    /* renamed from: t */
    public final Account mo9722t() {
        return this.f9998F;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC2978c
    /* renamed from: z */
    public final Set<Scope> mo9727z() {
        return this.f9997E;
    }
}
