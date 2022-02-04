package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.AbstractC2964k;
import com.google.android.gms.common.api.C2894a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC2925c;
import com.google.android.gms.common.api.internal.C2927d;

/* renamed from: com.google.android.gms.common.api.internal.h0 */
public final class C2939h0<A extends AbstractC2925c<? extends AbstractC2964k, C2894a.AbstractC2896b>> extends AbstractC2951o {

    /* renamed from: b */
    private final A f9846b;

    public C2939h0(int i, A a) {
        super(i);
        this.f9846b = a;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2951o
    /* renamed from: b */
    public final void mo9657b(Status status) {
        this.f9846b.mo9624p(status);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2951o
    /* renamed from: c */
    public final void mo9658c(C2927d.C2928a<?> aVar) {
        try {
            this.f9846b.mo9623n(aVar.mo9644o());
        } catch (RuntimeException e) {
            mo9659e(e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2951o
    /* renamed from: d */
    public final void mo9661d(C2942j jVar, boolean z) {
        jVar.mo9664b(this.f9846b, z);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC2951o
    /* renamed from: e */
    public final void mo9659e(RuntimeException runtimeException) {
        String simpleName = runtimeException.getClass().getSimpleName();
        String localizedMessage = runtimeException.getLocalizedMessage();
        StringBuilder sb = new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length());
        sb.append(simpleName);
        sb.append(": ");
        sb.append(localizedMessage);
        this.f9846b.mo9624p(new Status(10, sb.toString()));
    }
}
