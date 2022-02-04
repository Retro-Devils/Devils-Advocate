package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p069c.p073b.p074a.p075a.p081d.p084c.C1314b;

/* renamed from: com.android.billingclient.api.z */
public final class C1607z extends BroadcastReceiver {

    /* renamed from: a */
    private final AbstractC1585h f6529a;

    /* renamed from: b */
    private boolean f6530b;

    /* renamed from: c */
    private final /* synthetic */ C1606y f6531c;

    private C1607z(C1606y yVar, AbstractC1585h hVar) {
        this.f6531c = yVar;
        this.f6529a = hVar;
    }

    /* renamed from: b */
    public final void mo6968b(Context context) {
        if (this.f6530b) {
            context.unregisterReceiver(this.f6531c.f6528b);
            this.f6530b = false;
            return;
        }
        C1314b.m6854k("BillingBroadcastManager", "Receiver is not registered.");
    }

    /* renamed from: c */
    public final void mo6969c(Context context, IntentFilter intentFilter) {
        if (!this.f6530b) {
            context.registerReceiver(this.f6531c.f6528b, intentFilter);
            this.f6530b = true;
        }
    }

    public final void onReceive(Context context, Intent intent) {
        this.f6529a.mo6947a(C1314b.m6852i(intent, "BillingBroadcastManager"), C1314b.m6850g(intent.getExtras()));
    }
}
