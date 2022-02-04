package com.google.android.gms.common.internal;

import android.os.Parcel;
import p069c.p073b.p074a.p075a.p080c.AbstractC1302a;
import p069c.p073b.p074a.p075a.p081d.p083b.BinderC1310b;
import p069c.p073b.p074a.p075a.p081d.p083b.C1311c;

/* renamed from: com.google.android.gms.common.internal.m0 */
public abstract class AbstractBinderC3017m0 extends BinderC1310b implements AbstractC3014l0 {
    public AbstractBinderC3017m0() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    /* access modifiers changed from: protected */
    @Override // p069c.p073b.p074a.p075a.p081d.p083b.BinderC1310b
    /* renamed from: i */
    public final boolean mo6319i(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            AbstractC1302a M = mo6302M();
            parcel2.writeNoException();
            C1311c.m6834b(parcel2, M);
        } else if (i != 2) {
            return false;
        } else {
            int n0 = mo6306n0();
            parcel2.writeNoException();
            parcel2.writeInt(n0);
        }
        return true;
    }
}
