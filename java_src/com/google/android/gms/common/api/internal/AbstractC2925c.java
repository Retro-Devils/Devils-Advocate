package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.AbstractC2911f;
import com.google.android.gms.common.api.AbstractC2964k;
import com.google.android.gms.common.api.C2894a;
import com.google.android.gms.common.api.C2894a.AbstractC2896b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C3027r;
import com.google.android.gms.common.internal.C3030u;

/* renamed from: com.google.android.gms.common.api.internal.c */
public abstract class AbstractC2925c<R extends AbstractC2964k, A extends C2894a.AbstractC2896b> extends BasePendingResult<R> {

    /* renamed from: q */
    private final C2894a.C2897c<A> f9801q;

    /* renamed from: r */
    private final C2894a<?> f9802r;

    protected AbstractC2925c(C2894a<?> aVar, AbstractC2911f fVar) {
        super((AbstractC2911f) C3027r.m12377i(fVar, "GoogleApiClient must not be null"));
        C3027r.m12377i(aVar, "Api must not be null");
        this.f9801q = (C2894a.C2897c<A>) aVar.mo9561a();
        this.f9802r = aVar;
    }

    /* renamed from: o */
    private void m12069o(RemoteException remoteException) {
        mo9624p(new Status(8, remoteException.getLocalizedMessage(), null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract void mo6353l(A a);

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo9622m(R r) {
    }

    /* renamed from: n */
    public final void mo9623n(A a) {
        if (a instanceof C3030u) {
            a = ((C3030u) a).mo9815i0();
        }
        try {
            mo6353l(a);
        } catch (DeadObjectException e) {
            m12069o(e);
            throw e;
        } catch (RemoteException e2) {
            m12069o(e2);
        }
    }

    /* renamed from: p */
    public final void mo9624p(Status status) {
        C3027r.m12370b(!status.mo9557k(), "Failed result must not be success");
        R c = mo6352c(status);
        mo9600f(c);
        mo9622m(c);
    }
}
