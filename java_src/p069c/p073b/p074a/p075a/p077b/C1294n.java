package p069c.p073b.p074a.p075a.p077b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p147v.C3032b;

/* renamed from: c.b.a.a.b.n */
public final class C1294n implements Parcelable.Creator<C1281c> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1281c createFromParcel(Parcel parcel) {
        int q = C3032b.m12409q(parcel);
        String str = null;
        int i = 0;
        long j = -1;
        while (parcel.dataPosition() < q) {
            int k = C3032b.m12403k(parcel);
            int i2 = C3032b.m12401i(k);
            if (i2 == 1) {
                str = C3032b.m12396d(parcel, k);
            } else if (i2 == 2) {
                i = C3032b.m12405m(parcel, k);
            } else if (i2 != 3) {
                C3032b.m12408p(parcel, k);
            } else {
                j = C3032b.m12406n(parcel, k);
            }
        }
        C3032b.m12400h(parcel, q);
        return new C1281c(str, i, j);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1281c[] newArray(int i) {
        return new C1281c[i];
    }
}
