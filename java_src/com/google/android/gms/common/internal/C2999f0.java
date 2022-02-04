package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p147v.C3032b;
import p069c.p073b.p074a.p075a.p077b.C1281c;

/* renamed from: com.google.android.gms.common.internal.f0 */
public final class C2999f0 implements Parcelable.Creator<C2997e0> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2997e0 createFromParcel(Parcel parcel) {
        int q = C3032b.m12409q(parcel);
        Bundle bundle = null;
        C1281c[] cVarArr = null;
        while (parcel.dataPosition() < q) {
            int k = C3032b.m12403k(parcel);
            int i = C3032b.m12401i(k);
            if (i == 1) {
                bundle = C3032b.m12393a(parcel, k);
            } else if (i != 2) {
                C3032b.m12408p(parcel, k);
            } else {
                cVarArr = (C1281c[]) C3032b.m12398f(parcel, k, C1281c.CREATOR);
            }
        }
        C3032b.m12400h(parcel, q);
        return new C2997e0(bundle, cVarArr);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2997e0[] newArray(int i) {
        return new C2997e0[i];
    }
}
