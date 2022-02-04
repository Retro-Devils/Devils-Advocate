package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p069c.p073b.p074a.p075a.p081d.p084c.C1314b;

/* renamed from: com.android.billingclient.api.z */
public final class C1607z extends BroadcastReceiver {

    /* renamed from: a */
    private final AbstractC1585h f6521a;

    /* renamed from: b */
    private boolean f6522b;

    /* renamed from: c */
    private final /* synthetic */ C1606y f6523c;

    private C1607z(C1606y yVar, AbstractC1585h hVar) {
        this.f6523c = yVar;
        this.f6521a = hVar;
    }

    /* renamed from: b */
    public final void mo6968b(Context context) {
        if (this.f6522b) {
            context.unregisterReceiver(this.f6523c.f6520b);
            this.f6522b = false;
            return;
        }
        C1314b.m6854k("BillingBroadcastManager", "Receiver is not registered.");
    }

    /* renamed from: c */
    public final void mo6969c(Context context, IntentFilter intentFilter) {
        if (!this.f6522b) {
            context.registerReceiver(this.f6523c.f6520b, intentFilter);
            this.f6522b = true;
        }
    }

    public final void onReceive(Context context, Intent intent) {
        this.f6521a.mo6947a(C1314b.m6852i(intent, "BillingBroadcastManager"), C1314b.m6850g(intent.getExtras()));
    }
}
