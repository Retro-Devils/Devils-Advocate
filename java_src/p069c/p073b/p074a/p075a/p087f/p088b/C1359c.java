package p069c.p073b.p074a.p075a.p087f.p088b;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p147v.C3032b;

/* renamed from: c.b.a.a.f.b.c */
public final class C1359c implements Parcelable.Creator<C1358b> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1358b createFromParcel(Parcel parcel) {
        int q = C3032b.m12409q(parcel);
        int i = 0;
        Intent intent = null;
        int i2 = 0;
        while (parcel.dataPosition() < q) {
            int k = C3032b.m12403k(parcel);
            int i3 = C3032b.m12401i(k);
            if (i3 == 1) {
                i = C3032b.m12405m(parcel, k);
            } else if (i3 == 2) {
                i2 = C3032b.m12405m(parcel, k);
            } else if (i3 != 3) {
                C3032b.m12408p(parcel, k);
            } else {
                intent = (Intent) C3032b.m12395c(parcel, k, Intent.CREATOR);
            }
        }
        C3032b.m12400h(parcel, q);
        return new C1358b(i, i2, intent);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1358b[] newArray(int i) {
        return new C1358b[i];
    }
}
