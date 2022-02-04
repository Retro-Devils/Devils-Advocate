package com.android.billingclient.api;

import android.os.Bundle;
import java.util.concurrent.Callable;
import p069c.p073b.p074a.p075a.p081d.p084c.C1314b;

/* renamed from: com.android.billingclient.api.f0 */
final class CallableC1581f0 implements Callable<Void> {

    /* renamed from: a */
    private final /* synthetic */ C1566a f6460a;

    /* renamed from: b */
    final /* synthetic */ AbstractC1569b f6461b;

    /* renamed from: c */
    private final /* synthetic */ C1574d f6462c;

    CallableC1581f0(C1574d dVar, C1566a aVar, AbstractC1569b bVar) {
        this.f6462c = dVar;
        this.f6460a = aVar;
        this.f6461b = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Void call() {
        try {
            Bundle i0 = this.f6462c.f6424g.mo6328i0(9, this.f6462c.f6423f.getPackageName(), this.f6460a.mo6906a(), C1314b.m6846c(this.f6460a, this.f6462c.f6419b));
            this.f6462c.m7667t(new RunnableC1584g0(this, C1314b.m6845b(i0, "BillingClient"), C1314b.m6853j(i0, "BillingClient")));
            return null;
        } catch (Exception e) {
            this.f6462c.m7667t(new RunnableC1586h0(this, e));
            return null;
        }
    }
}
