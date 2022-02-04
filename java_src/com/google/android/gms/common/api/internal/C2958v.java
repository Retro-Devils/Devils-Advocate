package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.AbstractC2964k;
import com.google.android.gms.common.api.C2894a;
import com.google.android.gms.common.api.C2894a.AbstractC2898d;
import com.google.android.gms.common.api.C2908e;

/* renamed from: com.google.android.gms.common.api.internal.v */
public final class C2958v<O extends C2894a.AbstractC2898d> extends C2950n {

    /* renamed from: c */
    private final C2908e<O> f9880c;

    public C2958v(C2908e<O> eVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f9880c = eVar;
    }

    @Override // com.google.android.gms.common.api.AbstractC2911f
    /* renamed from: a */
    public final <A extends C2894a.AbstractC2896b, R extends AbstractC2964k, T extends AbstractC2925c<R, A>> T mo9590a(T t) {
        return (T) this.f9880c.mo9582c(t);
    }

    @Override // com.google.android.gms.common.api.AbstractC2911f
    /* renamed from: b */
    public final Looper mo9591b() {
        return this.f9880c.mo9584e();
    }
}
