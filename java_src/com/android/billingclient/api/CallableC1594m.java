package com.android.billingclient.api;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* renamed from: com.android.billingclient.api.m */
final class CallableC1594m implements Callable<Bundle> {

    /* renamed from: a */
    private final /* synthetic */ int f6491a;

    /* renamed from: b */
    private final /* synthetic */ SkuDetails f6492b;

    /* renamed from: c */
    private final /* synthetic */ String f6493c;

    /* renamed from: d */
    private final /* synthetic */ C1579f f6494d;

    /* renamed from: e */
    private final /* synthetic */ Bundle f6495e;

    /* renamed from: f */
    private final /* synthetic */ C1574d f6496f;

    CallableC1594m(C1574d dVar, int i, SkuDetails skuDetails, String str, C1579f fVar, Bundle bundle) {
        this.f6496f = dVar;
        this.f6491a = i;
        this.f6492b = skuDetails;
        this.f6493c = str;
        this.f6494d = fVar;
        this.f6495e = bundle;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Bundle call() {
        return this.f6496f.f6432g.mo6329v0(this.f6491a, this.f6496f.f6431f.getPackageName(), this.f6492b.mo6896b(), this.f6493c, this.f6494d.mo6938q(), this.f6495e);
    }
}
