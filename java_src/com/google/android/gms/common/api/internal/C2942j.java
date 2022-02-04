package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.AbstractC2964k;
import com.google.android.gms.common.api.C2905b;
import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import p069c.p073b.p074a.p075a.p089g.C1377e;

/* renamed from: com.google.android.gms.common.api.internal.j */
public final class C2942j {

    /* renamed from: a */
    private final Map<BasePendingResult<?>, Boolean> f9848a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b */
    private final Map<C1377e<?>, Boolean> f9849b = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: c */
    private final void m12160c(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f9848a) {
            hashMap = new HashMap(this.f9848a);
        }
        synchronized (this.f9849b) {
            hashMap2 = new HashMap(this.f9849b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).mo9601j(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C1377e) entry2.getKey()).mo6428d(new C2905b(status));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo9664b(BasePendingResult<? extends AbstractC2964k> basePendingResult, boolean z) {
        this.f9848a.put(basePendingResult, Boolean.valueOf(z));
        basePendingResult.mo9595a(new C2944k(this, basePendingResult));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo9665d() {
        return !this.f9848a.isEmpty() || !this.f9849b.isEmpty();
    }

    /* renamed from: e */
    public final void mo9666e() {
        m12160c(false, C2927d.f9803a);
    }

    /* renamed from: f */
    public final void mo9667f() {
        m12160c(true, C2933e0.f9841a);
    }
}
