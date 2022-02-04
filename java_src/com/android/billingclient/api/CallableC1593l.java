package com.android.billingclient.api;

import android.os.Bundle;
import java.util.Arrays;
import java.util.concurrent.Callable;

/* renamed from: com.android.billingclient.api.l */
final class CallableC1593l implements Callable<Bundle> {

    /* renamed from: a */
    private final /* synthetic */ C1579f f6480a;

    /* renamed from: b */
    private final /* synthetic */ SkuDetails f6481b;

    /* renamed from: c */
    private final /* synthetic */ C1574d f6482c;

    CallableC1593l(C1574d dVar, C1579f fVar, SkuDetails skuDetails) {
        this.f6482c = dVar;
        this.f6480a = fVar;
        this.f6481b = skuDetails;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Bundle call() {
        return this.f6482c.f6424g.mo6324H(5, this.f6482c.f6423f.getPackageName(), Arrays.asList(this.f6480a.mo6930a()), this.f6481b.mo6896b(), "subs", null);
    }
}
