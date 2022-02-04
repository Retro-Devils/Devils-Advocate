package com.android.billingclient.api;

import android.os.Bundle;
import java.util.Arrays;
import java.util.concurrent.Callable;

/* renamed from: com.android.billingclient.api.l */
final class CallableC1593l implements Callable<Bundle> {

    /* renamed from: a */
    private final /* synthetic */ C1579f f6488a;

    /* renamed from: b */
    private final /* synthetic */ SkuDetails f6489b;

    /* renamed from: c */
    private final /* synthetic */ C1574d f6490c;

    CallableC1593l(C1574d dVar, C1579f fVar, SkuDetails skuDetails) {
        this.f6490c = dVar;
        this.f6488a = fVar;
        this.f6489b = skuDetails;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Bundle call() {
        return this.f6490c.f6432g.mo6324H(5, this.f6490c.f6431f.getPackageName(), Arrays.asList(this.f6488a.mo6930a()), this.f6489b.mo6896b(), "subs", null);
    }
}
