package com.android.billingclient.api;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.android.billingclient.api.b0 */
final class CallableC1570b0 implements Callable<Void> {

    /* renamed from: a */
    private final /* synthetic */ String f6409a;

    /* renamed from: b */
    private final /* synthetic */ List f6410b;

    /* renamed from: c */
    private final /* synthetic */ String f6411c;

    /* renamed from: d */
    final /* synthetic */ AbstractC1590j f6412d;

    /* renamed from: e */
    private final /* synthetic */ C1574d f6413e;

    CallableC1570b0(C1574d dVar, String str, List list, String str2, AbstractC1590j jVar) {
        this.f6413e = dVar;
        this.f6409a = str;
        this.f6410b = list;
        this.f6411c = str2;
        this.f6412d = jVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Void call() {
        this.f6413e.m7667t(new RunnableC1578e0(this, this.f6413e.mo6922m(this.f6409a, this.f6410b, this.f6411c)));
        return null;
    }
}
