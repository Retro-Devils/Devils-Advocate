package com.android.billingclient.api;

import com.android.billingclient.api.SkuDetails;

/* renamed from: com.android.billingclient.api.e0 */
final class RunnableC1578e0 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ SkuDetails.C1565a f6443b;

    /* renamed from: c */
    private final /* synthetic */ CallableC1570b0 f6444c;

    RunnableC1578e0(CallableC1570b0 b0Var, SkuDetails.C1565a aVar) {
        this.f6444c = b0Var;
        this.f6443b = aVar;
    }

    public final void run() {
        this.f6444c.f6412d.mo6956a(C1582g.m7711b().mo6945c(this.f6443b.mo6904b()).mo6944b(this.f6443b.mo6905c()).mo6943a(), this.f6443b.mo6903a());
    }
}
