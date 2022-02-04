package com.android.billingclient.api;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* renamed from: com.android.billingclient.api.o */
final class CallableC1596o implements Callable<Bundle> {

    /* renamed from: a */
    private final /* synthetic */ SkuDetails f6499a;

    /* renamed from: b */
    private final /* synthetic */ String f6500b;

    /* renamed from: c */
    private final /* synthetic */ C1574d f6501c;

    CallableC1596o(C1574d dVar, SkuDetails skuDetails, String str) {
        this.f6501c = dVar;
        this.f6499a = skuDetails;
        this.f6500b = str;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Bundle call() {
        return this.f6501c.f6432g.mo6326O(3, this.f6501c.f6431f.getPackageName(), this.f6499a.mo6896b(), this.f6500b, null);
    }
}
