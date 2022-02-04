package com.android.billingclient.api;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* renamed from: com.android.billingclient.api.o */
final class CallableC1596o implements Callable<Bundle> {

    /* renamed from: a */
    private final /* synthetic */ SkuDetails f6491a;

    /* renamed from: b */
    private final /* synthetic */ String f6492b;

    /* renamed from: c */
    private final /* synthetic */ C1574d f6493c;

    CallableC1596o(C1574d dVar, SkuDetails skuDetails, String str) {
        this.f6493c = dVar;
        this.f6491a = skuDetails;
        this.f6492b = str;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Bundle call() {
        return this.f6493c.f6424g.mo6326O(3, this.f6493c.f6423f.getPackageName(), this.f6491a.mo6896b(), this.f6492b, null);
    }
}
