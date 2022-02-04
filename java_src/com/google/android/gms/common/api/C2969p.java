package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p147v.C3032b;

/* renamed from: com.google.android.gms.common.api.p */
public final class C2969p implements Parcelable.Creator<Scope> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Scope createFromParcel(Parcel parcel) {
        int q = C3032b.m12409q(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < q) {
            int k = C3032b.m12403k(parcel);
            int i2 = C3032b.m12401i(k);
            if (i2 == 1) {
                i = C3032b.m12405m(parcel, k);
            } else if (i2 != 2) {
                C3032b.m12408p(parcel, k);
            } else {
                str = C3032b.m12396d(parcel, k);
            }
        }
        C3032b.m12400h(parcel, q);
        return new Scope(i, str);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Scope[] newArray(int i) {
        return new Scope[i];
    }
}
