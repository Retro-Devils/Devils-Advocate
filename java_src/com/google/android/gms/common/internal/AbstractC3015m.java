package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p069c.p073b.p074a.p075a.p081d.p083b.BinderC1310b;
import p069c.p073b.p074a.p075a.p081d.p083b.C1311c;

/* renamed from: com.google.android.gms.common.internal.m */
public interface AbstractC3015m extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.m$a */
    public static abstract class AbstractBinderC3016a extends BinderC1310b implements AbstractC3015m {
        public AbstractBinderC3016a() {
            super("com.google.android.gms.common.internal.IGmsCallbacks");
        }

        /* access modifiers changed from: protected */
        @Override // p069c.p073b.p074a.p075a.p081d.p083b.BinderC1310b
        /* renamed from: i */
        public final boolean mo6319i(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                mo9741t0(parcel.readInt(), parcel.readStrongBinder(), (Bundle) C1311c.m6833a(parcel, Bundle.CREATOR));
            } else if (i == 2) {
                mo9740b0(parcel.readInt(), (Bundle) C1311c.m6833a(parcel, Bundle.CREATOR));
            } else if (i != 3) {
                return false;
            } else {
                mo9739R(parcel.readInt(), parcel.readStrongBinder(), (C2997e0) C1311c.m6833a(parcel, C2997e0.CREATOR));
            }
            parcel2.writeNoException();
            return true;
        }
    }

    /* renamed from: R */
    void mo9739R(int i, IBinder iBinder, C2997e0 e0Var);

    /* renamed from: b0 */
    void mo9740b0(int i, Bundle bundle);

    /* renamed from: t0 */
    void mo9741t0(int i, IBinder iBinder, Bundle bundle);
}
