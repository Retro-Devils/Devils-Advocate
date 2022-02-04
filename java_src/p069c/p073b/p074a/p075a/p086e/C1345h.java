package p069c.p073b.p074a.p075a.p086e;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p147v.C3032b;

/* renamed from: c.b.a.a.e.h */
public final class C1345h implements Parcelable.Creator<C1336a> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1336a createFromParcel(Parcel parcel) {
        int q = C3032b.m12409q(parcel);
        String str = null;
        byte[] bArr = null;
        int i = 0;
        while (parcel.dataPosition() < q) {
            int k = C3032b.m12403k(parcel);
            int i2 = C3032b.m12401i(k);
            if (i2 == 2) {
                str = C3032b.m12396d(parcel, k);
            } else if (i2 == 3) {
                bArr = C3032b.m12394b(parcel, k);
            } else if (i2 != 4) {
                C3032b.m12408p(parcel, k);
            } else {
                i = C3032b.m12405m(parcel, k);
            }
        }
        C3032b.m12400h(parcel, q);
        return new C1336a(str, bArr, i);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1336a[] newArray(int i) {
        return new C1336a[i];
    }
}
