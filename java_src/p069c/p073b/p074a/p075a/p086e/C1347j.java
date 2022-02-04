package p069c.p073b.p074a.p075a.p086e;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p147v.C3032b;

/* renamed from: c.b.a.a.e.j */
public final class C1347j implements Parcelable.Creator<C1346i> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1346i createFromParcel(Parcel parcel) {
        int q = C3032b.m12409q(parcel);
        long j = 0;
        C1336a[] aVarArr = null;
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < q) {
            int k = C3032b.m12403k(parcel);
            int i2 = C3032b.m12401i(k);
            if (i2 == 2) {
                j = C3032b.m12406n(parcel, k);
            } else if (i2 == 3) {
                aVarArr = (C1336a[]) C3032b.m12398f(parcel, k, C1336a.CREATOR);
            } else if (i2 == 4) {
                i = C3032b.m12405m(parcel, k);
            } else if (i2 != 5) {
                C3032b.m12408p(parcel, k);
            } else {
                z = C3032b.m12402j(parcel, k);
            }
        }
        C3032b.m12400h(parcel, q);
        return new C1346i(j, aVarArr, i, z);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1346i[] newArray(int i) {
        return new C1346i[i];
    }
}
