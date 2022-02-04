package com.android.billingclient.api;

import com.android.billingclient.api.C1574d;

/* access modifiers changed from: package-private */
/* renamed from: com.android.billingclient.api.p */
public final class RunnableC1597p implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ C1582g f6502b;

    /* renamed from: c */
    private final /* synthetic */ C1574d.ServiceConnectionC1575a f6503c;

    RunnableC1597p(C1574d.ServiceConnectionC1575a aVar, C1582g gVar) {
        this.f6503c = aVar;
        this.f6502b = gVar;
    }

    public final void run() {
        synchronized (this.f6503c.f6446a) {
            if (this.f6503c.f6448c != null) {
                this.f6503c.f6448c.mo6928b(this.f6502b);
            }
        }
    }
}
