package p069c.p073b.p074a.p075a.p087f.p088b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C3029t;
import com.google.android.gms.common.internal.p147v.C3032b;
import p069c.p073b.p074a.p075a.p077b.C1279a;

/* renamed from: c.b.a.a.f.b.l */
public final class C1368l implements Parcelable.Creator<C1367k> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1367k createFromParcel(Parcel parcel) {
        int q = C3032b.m12409q(parcel);
        C1279a aVar = null;
        C3029t tVar = null;
        int i = 0;
        while (parcel.dataPosition() < q) {
            int k = C3032b.m12403k(parcel);
            int i2 = C3032b.m12401i(k);
            if (i2 == 1) {
                i = C3032b.m12405m(parcel, k);
            } else if (i2 == 2) {
                aVar = (C1279a) C3032b.m12395c(parcel, k, C1279a.CREATOR);
            } else if (i2 != 3) {
                C3032b.m12408p(parcel, k);
            } else {
                tVar = (C3029t) C3032b.m12395c(parcel, k, C3029t.CREATOR);
            }
        }
        C3032b.m12400h(parcel, q);
        return new C1367k(i, aVar, tVar);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1367k[] newArray(int i) {
        return new C1367k[i];
    }
}
