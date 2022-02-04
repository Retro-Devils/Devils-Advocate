package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.C2905b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C2927d;
import p069c.p073b.p074a.p075a.p089g.C1377e;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.g0 */
public abstract class AbstractC2937g0<T> extends AbstractC2961y {

    /* renamed from: b */
    protected final C1377e<T> f9845b;

    public AbstractC2937g0(int i, C1377e<T> eVar) {
        super(i);
        this.f9845b = eVar;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2951o
    /* renamed from: b */
    public void mo9657b(Status status) {
        this.f9845b.mo6428d(new C2905b(status));
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2951o
    /* renamed from: c */
    public final void mo9658c(C2927d.C2928a<?> aVar) {
        try {
            mo9660i(aVar);
        } catch (DeadObjectException e) {
            mo9657b(AbstractC2951o.m12172a(e));
            throw e;
        } catch (RemoteException e2) {
            mo9657b(AbstractC2951o.m12172a(e2));
        } catch (RuntimeException e3) {
            mo9659e(e3);
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2951o
    /* renamed from: e */
    public void mo9659e(RuntimeException runtimeException) {
        this.f9845b.mo6428d(runtimeException);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract void mo9660i(C2927d.C2928a<?> aVar);
}
