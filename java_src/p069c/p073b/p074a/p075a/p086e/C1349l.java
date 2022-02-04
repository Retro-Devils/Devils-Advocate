package p069c.p073b.p074a.p075a.p086e;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p147v.C3032b;

/* renamed from: c.b.a.a.e.l */
public final class C1349l implements Parcelable.Creator<C1348k> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1348k createFromParcel(Parcel parcel) {
        int q = C3032b.m12409q(parcel);
        String str = null;
        while (parcel.dataPosition() < q) {
            int k = C3032b.m12403k(parcel);
            if (C3032b.m12401i(k) != 2) {
                C3032b.m12408p(parcel, k);
            } else {
                str = C3032b.m12396d(parcel, k);
            }
        }
        C3032b.m12400h(parcel, q);
        return new C1348k(str);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1348k[] newArray(int i) {
        return new C1348k[i];
    }
}
