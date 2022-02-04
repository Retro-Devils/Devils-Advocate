package com.android.billingclient.api;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* renamed from: com.android.billingclient.api.m */
final class CallableC1594m implements Callable<Bundle> {

    /* renamed from: a */
    private final /* synthetic */ int f6483a;

    /* renamed from: b */
    private final /* synthetic */ SkuDetails f6484b;

    /* renamed from: c */
    private final /* synthetic */ String f6485c;

    /* renamed from: d */
    private final /* synthetic */ C1579f f6486d;

    /* renamed from: e */
    private final /* synthetic */ Bundle f6487e;

    /* renamed from: f */
    private final /* synthetic */ C1574d f6488f;

    CallableC1594m(C1574d dVar, int i, SkuDetails skuDetails, String str, C1579f fVar, Bundle bundle) {
        this.f6488f = dVar;
        this.f6483a = i;
        this.f6484b = skuDetails;
        this.f6485c = str;
        this.f6486d = fVar;
        this.f6487e = bundle;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Bundle call() {
        return this.f6488f.f6424g.mo6329v0(this.f6483a, this.f6488f.f6423f.getPackageName(), this.f6484b.mo6896b(), this.f6485c, this.f6486d.mo6938q(), this.f6487e);
    }
}
