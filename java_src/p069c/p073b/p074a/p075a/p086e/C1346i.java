package p069c.p073b.p074a.p075a.p086e;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p147v.AbstractC3031a;
import com.google.android.gms.common.internal.p147v.C3034c;

/* renamed from: c.b.a.a.e.i */
public final class C1346i extends AbstractC3031a {
    public static final Parcelable.Creator<C1346i> CREATOR = new C1347j();

    /* renamed from: b */
    public final long f5608b;

    /* renamed from: c */
    public final C1336a[] f5609c;

    /* renamed from: d */
    public final int f5610d;

    /* renamed from: e */
    private final boolean f5611e;

    public C1346i(long j, C1336a[] aVarArr, int i, boolean z) {
        this.f5608b = j;
        this.f5609c = aVarArr;
        this.f5611e = z;
        if (z) {
            this.f5610d = i;
        } else {
            this.f5610d = -1;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3034c.m12411a(parcel);
        C3034c.m12418h(parcel, 2, this.f5608b);
        C3034c.m12422l(parcel, 3, this.f5609c, i, false);
        C3034c.m12417g(parcel, 4, this.f5610d);
        C3034c.m12413c(parcel, 5, this.f5611e);
        C3034c.m12412b(parcel, a);
    }
}
