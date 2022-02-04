package p069c.p073b.p074a.p075a.p087f.p088b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C3028s;
import com.google.android.gms.common.internal.p147v.C3032b;

/* renamed from: c.b.a.a.f.b.j */
public final class C1366j implements Parcelable.Creator<C1365i> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1365i createFromParcel(Parcel parcel) {
        int q = C3032b.m12409q(parcel);
        int i = 0;
        C3028s sVar = null;
        while (parcel.dataPosition() < q) {
            int k = C3032b.m12403k(parcel);
            int i2 = C3032b.m12401i(k);
            if (i2 == 1) {
                i = C3032b.m12405m(parcel, k);
            } else if (i2 != 2) {
                C3032b.m12408p(parcel, k);
            } else {
                sVar = (C3028s) C3032b.m12395c(parcel, k, C3028s.CREATOR);
            }
        }
        C3032b.m12400h(parcel, q);
        return new C1365i(i, sVar);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1365i[] newArray(int i) {
        return new C1365i[i];
    }
}
