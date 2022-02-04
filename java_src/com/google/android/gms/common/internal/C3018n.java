package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: com.google.android.gms.common.internal.n */
final class C3018n implements AbstractC3020o {

    /* renamed from: a */
    private final IBinder f10018a;

    C3018n(IBinder iBinder) {
        this.f10018a = iBinder;
    }

    public final IBinder asBinder() {
        return this.f10018a;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3020o
    /* renamed from: e0 */
    public final void mo9801e0(AbstractC3015m mVar, C3000g gVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(mVar != null ? mVar.asBinder() : null);
            if (gVar != null) {
                obtain.writeInt(1);
                gVar.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f10018a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
