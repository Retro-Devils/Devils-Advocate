package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p147v.C3032b;
import p069c.p073b.p074a.p075a.p077b.C1279a;

/* renamed from: com.google.android.gms.common.internal.d0 */
public final class C2995d0 implements Parcelable.Creator<C3029t> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C3029t createFromParcel(Parcel parcel) {
        int q = C3032b.m12409q(parcel);
        IBinder iBinder = null;
        C1279a aVar = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < q) {
            int k = C3032b.m12403k(parcel);
            int i2 = C3032b.m12401i(k);
            if (i2 == 1) {
                i = C3032b.m12405m(parcel, k);
            } else if (i2 == 2) {
                iBinder = C3032b.m12404l(parcel, k);
            } else if (i2 == 3) {
                aVar = (C1279a) C3032b.m12395c(parcel, k, C1279a.CREATOR);
            } else if (i2 == 4) {
                z = C3032b.m12402j(parcel, k);
            } else if (i2 != 5) {
                C3032b.m12408p(parcel, k);
            } else {
                z2 = C3032b.m12402j(parcel, k);
            }
        }
        C3032b.m12400h(parcel, q);
        return new C3029t(i, iBinder, aVar, z, z2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C3029t[] newArray(int i) {
        return new C3029t[i];
    }
}
