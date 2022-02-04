package com.android.billingclient.api;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.android.billingclient.api.b0 */
final class CallableC1570b0 implements Callable<Void> {

    /* renamed from: a */
    private final /* synthetic */ String f6417a;

    /* renamed from: b */
    private final /* synthetic */ List f6418b;

    /* renamed from: c */
    private final /* synthetic */ String f6419c;

    /* renamed from: d */
    final /* synthetic */ AbstractC1590j f6420d;

    /* renamed from: e */
    private final /* synthetic */ C1574d f6421e;

    CallableC1570b0(C1574d dVar, String str, List list, String str2, AbstractC1590j jVar) {
        this.f6421e = dVar;
        this.f6417a = str;
        this.f6418b = list;
        this.f6419c = str2;
        this.f6420d = jVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Void call() {
        this.f6421e.m7667t(new RunnableC1578e0(this, this.f6421e.mo6922m(this.f6417a, this.f6418b, this.f6419c)));
        return null;
    }
}
