package com.android.billingclient.api;

import p069c.p073b.p074a.p075a.p081d.p084c.C1314b;

/* access modifiers changed from: package-private */
/* renamed from: com.android.billingclient.api.h0 */
public final class RunnableC1586h0 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ Exception f6470b;

    /* renamed from: c */
    private final /* synthetic */ CallableC1581f0 f6471c;

    RunnableC1586h0(CallableC1581f0 f0Var, Exception exc) {
        this.f6471c = f0Var;
        this.f6470b = exc;
    }

    public final void run() {
        String valueOf = String.valueOf(this.f6470b);
        StringBuilder sb = new StringBuilder(valueOf.length() + 32);
        sb.append("Error acknowledge purchase; ex: ");
        sb.append(valueOf);
        C1314b.m6854k("BillingClient", sb.toString());
        this.f6471c.f6461b.mo6909a(C1602u.f6514q);
    }
}
