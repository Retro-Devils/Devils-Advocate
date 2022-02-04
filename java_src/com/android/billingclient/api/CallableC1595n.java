package com.android.billingclient.api;

import com.android.billingclient.api.Purchase;
import java.util.concurrent.Callable;

/* renamed from: com.android.billingclient.api.n */
final class CallableC1595n implements Callable<Purchase.C1564a> {

    /* renamed from: a */
    private final /* synthetic */ String f6497a;

    /* renamed from: b */
    private final /* synthetic */ C1574d f6498b;

    CallableC1595n(C1574d dVar, String str) {
        this.f6498b = dVar;
        this.f6497a = str;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Purchase.C1564a call() {
        return this.f6498b.m7672y(this.f6497a);
    }
}
