package p069c.p073b.p074a.p075a.p087f.p088b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C3028s;
import com.google.android.gms.common.internal.p147v.AbstractC3031a;
import com.google.android.gms.common.internal.p147v.C3034c;

/* renamed from: c.b.a.a.f.b.i */
public final class C1365i extends AbstractC3031a {
    public static final Parcelable.Creator<C1365i> CREATOR = new C1366j();

    /* renamed from: b */
    private final int f5639b;

    /* renamed from: c */
    private final C3028s f5640c;

    C1365i(int i, C3028s sVar) {
        this.f5639b = i;
        this.f5640c = sVar;
    }

    public C1365i(C3028s sVar) {
        this(1, sVar);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3034c.m12411a(parcel);
        C3034c.m12417g(parcel, 1, this.f5639b);
        C3034c.m12419i(parcel, 2, this.f5640c, i, false);
        C3034c.m12412b(parcel, a);
    }
}
