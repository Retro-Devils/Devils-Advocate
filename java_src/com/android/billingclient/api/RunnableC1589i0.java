package com.android.billingclient.api;

import java.util.concurrent.Future;
import p069c.p073b.p074a.p075a.p081d.p084c.C1314b;

/* access modifiers changed from: package-private */
/* renamed from: com.android.billingclient.api.i0 */
public final class RunnableC1589i0 implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ Future f6485b;

    /* renamed from: c */
    private final /* synthetic */ Runnable f6486c;

    RunnableC1589i0(C1574d dVar, Future future, Runnable runnable) {
        this.f6485b = future;
        this.f6486c = runnable;
    }

    public final void run() {
        if (!this.f6485b.isDone() && !this.f6485b.isCancelled()) {
            this.f6485b.cancel(true);
            C1314b.m6854k("BillingClient", "Async task is taking too long, cancel it!");
            Runnable runnable = this.f6486c;
            if (runnable != null) {
                runnable.run();
            }
        }
    }
}
