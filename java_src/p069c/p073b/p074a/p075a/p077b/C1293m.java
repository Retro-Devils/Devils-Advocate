package p069c.p073b.p074a.p075a.p077b;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p147v.C3032b;

/* renamed from: c.b.a.a.b.m */
public final class C1293m implements Parcelable.Creator<C1279a> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1279a createFromParcel(Parcel parcel) {
        int q = C3032b.m12409q(parcel);
        PendingIntent pendingIntent = null;
        String str = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < q) {
            int k = C3032b.m12403k(parcel);
            int i3 = C3032b.m12401i(k);
            if (i3 == 1) {
                i = C3032b.m12405m(parcel, k);
            } else if (i3 == 2) {
                i2 = C3032b.m12405m(parcel, k);
            } else if (i3 == 3) {
                pendingIntent = (PendingIntent) C3032b.m12395c(parcel, k, PendingIntent.CREATOR);
            } else if (i3 != 4) {
                C3032b.m12408p(parcel, k);
            } else {
                str = C3032b.m12396d(parcel, k);
            }
        }
        C3032b.m12400h(parcel, q);
        return new C1279a(i, i2, pendingIntent, str);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1279a[] newArray(int i) {
        return new C1279a[i];
    }
}
