package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.internal.C2927d;
import java.util.Collections;
import p069c.p073b.p074a.p075a.p077b.C1279a;

/* renamed from: com.google.android.gms.common.api.internal.u */
final class RunnableC2957u implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ C1279a f9870b;

    /* renamed from: c */
    private final /* synthetic */ C2927d.C2930c f9871c;

    RunnableC2957u(C2927d.C2930c cVar, C1279a aVar) {
        this.f9871c = cVar;
        this.f9870b = aVar;
    }

    public final void run() {
        if (this.f9870b.mo6266l()) {
            this.f9871c.f9839e = true;
            if (this.f9871c.f9835a.mo6396m()) {
                this.f9871c.m12139g();
                return;
            }
            try {
                this.f9871c.f9835a.mo9571h(null, Collections.emptySet());
            } catch (SecurityException e) {
                Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
                ((C2927d.C2928a) C2927d.this.f9815m.get(this.f9871c.f9836b)).mo9594i(new C1279a(10));
            }
        } else {
            ((C2927d.C2928a) C2927d.this.f9815m.get(this.f9871c.f9836b)).mo9594i(this.f9870b);
        }
    }
}
