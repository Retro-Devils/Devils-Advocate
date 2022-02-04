package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p147v.C3032b;

/* renamed from: com.google.android.gms.common.data.b */
public final class C2973b implements Parcelable.Creator<DataHolder> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ DataHolder createFromParcel(Parcel parcel) {
        int q = C3032b.m12409q(parcel);
        String[] strArr = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundle = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < q) {
            int k = C3032b.m12403k(parcel);
            int i3 = C3032b.m12401i(k);
            if (i3 == 1) {
                strArr = C3032b.m12397e(parcel, k);
            } else if (i3 == 2) {
                cursorWindowArr = (CursorWindow[]) C3032b.m12398f(parcel, k, CursorWindow.CREATOR);
            } else if (i3 == 3) {
                i2 = C3032b.m12405m(parcel, k);
            } else if (i3 == 4) {
                bundle = C3032b.m12393a(parcel, k);
            } else if (i3 != 1000) {
                C3032b.m12408p(parcel, k);
            } else {
                i = C3032b.m12405m(parcel, k);
            }
        }
        C3032b.m12400h(parcel, q);
        DataHolder dataHolder = new DataHolder(i, strArr, cursorWindowArr, i2, bundle);
        dataHolder.mo9696k();
        return dataHolder;
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ DataHolder[] newArray(int i) {
        return new DataHolder[i];
    }
}
