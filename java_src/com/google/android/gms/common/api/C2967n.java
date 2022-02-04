package com.google.android.gms.common.api;

import p069c.p073b.p074a.p075a.p077b.C1281c;

/* renamed from: com.google.android.gms.common.api.n */
public final class C2967n extends UnsupportedOperationException {

    /* renamed from: b */
    private final C1281c f9894b;

    public C2967n(C1281c cVar) {
        this.f9894b = cVar;
    }

    public final String getMessage() {
        String valueOf = String.valueOf(this.f9894b);
        StringBuilder sb = new StringBuilder(valueOf.length() + 8);
        sb.append("Missing ");
        sb.append(valueOf);
        return sb.toString();
    }
}
