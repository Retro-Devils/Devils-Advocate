package com.android.billingclient.api;

import android.content.Context;
import android.content.IntentFilter;

/* access modifiers changed from: package-private */
/* renamed from: com.android.billingclient.api.y */
public final class C1606y {

    /* renamed from: a */
    private final Context f6519a;

    /* renamed from: b */
    private final C1607z f6520b;

    C1606y(Context context, AbstractC1585h hVar) {
        this.f6519a = context;
        this.f6520b = new C1607z(this, hVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo6965b() {
        this.f6520b.mo6969c(this.f6519a, new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final AbstractC1585h mo6966c() {
        return C1607z.m7736a(this.f6520b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo6967d() {
        this.f6520b.mo6968b(this.f6519a);
    }
}
