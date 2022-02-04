package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.internal.C2927d;
import java.util.Collections;
import p069c.p073b.p074a.p075a.p077b.C1279a;

/* renamed from: com.google.android.gms.common.api.internal.u */
final class RunnableC2957u implements Runnable {

    /* renamed from: b */
    private final /* synthetic */ C1279a f9878b;

    /* renamed from: c */
    private final /* synthetic */ C2927d.C2930c f9879c;

    RunnableC2957u(C2927d.C2930c cVar, C1279a aVar) {
        this.f9879c = cVar;
        this.f9878b = aVar;
    }

    public final void run() {
        if (this.f9878b.mo6266l()) {
            this.f9879c.f9847e = true;
            if (this.f9879c.f9843a.mo6396m()) {
                this.f9879c.m12139g();
                return;
            }
            try {
                this.f9879c.f9843a.mo9571h(null, Collections.emptySet());
            } catch (SecurityException e) {
                Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
                ((C2927d.C2928a) C2927d.this.f9823m.get(this.f9879c.f9844b)).mo9594i(new C1279a(10));
            }
        } else {
            ((C2927d.C2928a) C2927d.this.f9823m.get(this.f9879c.f9844b)).mo9594i(this.f9878b);
        }
    }
}
