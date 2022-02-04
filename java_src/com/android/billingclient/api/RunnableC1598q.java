package com.android.billingclient.api;

import com.android.billingclient.api.C1574d;

/* renamed from: com.android.billingclient.api.q */
final class RunnableC1598q implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ C1574d.ServiceConnectionC1575a f6504b;

    RunnableC1598q(C1574d.ServiceConnectionC1575a aVar) {
        this.f6504b = aVar;
    }

    public final void run() {
        C1574d.this.f6426a = 0;
        C1574d.this.f6432g = null;
        this.f6504b.m7684d(C1602u.f6523r);
    }
}
