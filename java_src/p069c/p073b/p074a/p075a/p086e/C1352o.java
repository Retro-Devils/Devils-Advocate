package p069c.p073b.p074a.p075a.p086e;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.p147v.C3032b;
import com.google.android.gms.common.internal.p147v.C3034c;

/* renamed from: c.b.a.a.e.o */
public final class C1352o implements Parcelable.Creator<C1337b> {
    /* renamed from: a */
    static void m6919a(C1337b bVar, Parcel parcel, int i) {
        int a = C3034c.m12411a(parcel);
        C3034c.m12420j(parcel, 2, bVar.mo6363k(), false);
        C3034c.m12419i(parcel, 3, bVar.mo6360h(), i, false);
        C3034c.m12419i(parcel, 4, bVar.mo6361i(), i, false);
        C3034c.m12418h(parcel, 5, bVar.mo6362j());
        C3034c.m12415e(parcel, 6, bVar.mo6364l(), false);
        C3034c.m12412b(parcel, a);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1337b createFromParcel(Parcel parcel) {
        int q = C3032b.m12409q(parcel);
        String str = null;
        DataHolder dataHolder = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        byte[] bArr = null;
        long j = 0;
        while (parcel.dataPosition() < q) {
            int k = C3032b.m12403k(parcel);
            int i = C3032b.m12401i(k);
            if (i == 2) {
                str = C3032b.m12396d(parcel, k);
            } else if (i == 3) {
                dataHolder = (DataHolder) C3032b.m12395c(parcel, k, DataHolder.CREATOR);
            } else if (i == 4) {
                parcelFileDescriptor = (ParcelFileDescriptor) C3032b.m12395c(parcel, k, ParcelFileDescriptor.CREATOR);
            } else if (i == 5) {
                j = C3032b.m12406n(parcel, k);
            } else if (i != 6) {
                C3032b.m12408p(parcel, k);
            } else {
                bArr = C3032b.m12394b(parcel, k);
            }
        }
        C3032b.m12400h(parcel, q);
        return new C1337b(str, dataHolder, parcelFileDescriptor, j, bArr);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C1337b[] newArray(int i) {
        return new C1337b[i];
    }
}
