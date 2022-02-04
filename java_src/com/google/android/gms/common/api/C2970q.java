package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p147v.C3032b;

/* renamed from: com.google.android.gms.common.api.q */
public final class C2970q implements Parcelable.Creator<Status> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Status createFromParcel(Parcel parcel) {
        int q = C3032b.m12409q(parcel);
        String str = null;
        PendingIntent pendingIntent = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < q) {
            int k = C3032b.m12403k(parcel);
            int i3 = C3032b.m12401i(k);
            if (i3 == 1) {
                i2 = C3032b.m12405m(parcel, k);
            } else if (i3 == 2) {
                str = C3032b.m12396d(parcel, k);
            } else if (i3 == 3) {
                pendingIntent = (PendingIntent) C3032b.m12395c(parcel, k, PendingIntent.CREATOR);
            } else if (i3 != 1000) {
                C3032b.m12408p(parcel, k);
            } else {
                i = C3032b.m12405m(parcel, k);
            }
        }
        C3032b.m12400h(parcel, q);
        return new Status(i, i2, str, pendingIntent);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Status[] newArray(int i) {
        return new Status[i];
    }
}
