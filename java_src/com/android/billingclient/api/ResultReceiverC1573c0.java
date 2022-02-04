package com.android.billingclient.api;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import p069c.p073b.p074a.p075a.p081d.p084c.C1314b;

/* access modifiers changed from: package-private */
/* renamed from: com.android.billingclient.api.c0 */
public final class ResultReceiverC1573c0 extends ResultReceiver {

    /* renamed from: b */
    private final /* synthetic */ C1574d f6425b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ResultReceiverC1573c0(C1574d dVar, Handler handler) {
        super(handler);
        this.f6425b = dVar;
    }

    public final void onReceiveResult(int i, Bundle bundle) {
        AbstractC1585h c = this.f6425b.f6429d.mo6966c();
        if (c == null) {
            C1314b.m6854k("BillingClient", "PurchasesUpdatedListener is null - no way to return the response.");
            return;
        }
        c.mo6947a(C1582g.m7711b().mo6945c(i).mo6944b(C1314b.m6853j(bundle, "BillingClient")).mo6943a(), C1314b.m6850g(bundle));
    }
}
