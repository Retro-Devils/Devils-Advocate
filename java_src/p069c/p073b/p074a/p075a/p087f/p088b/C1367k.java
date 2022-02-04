package p069c.p073b.p074a.p075a.p087f.p088b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C3029t;
import com.google.android.gms.common.internal.p147v.AbstractC3031a;
import com.google.android.gms.common.internal.p147v.C3034c;
import p069c.p073b.p074a.p075a.p077b.C1279a;

/* renamed from: c.b.a.a.f.b.k */
public final class C1367k extends AbstractC3031a {
    public static final Parcelable.Creator<C1367k> CREATOR = new C1368l();

    /* renamed from: b */
    private final int f5641b;

    /* renamed from: c */
    private final C1279a f5642c;

    /* renamed from: d */
    private final C3029t f5643d;

    public C1367k(int i) {
        this(new C1279a(8, null), null);
    }

    C1367k(int i, C1279a aVar, C3029t tVar) {
        this.f5641b = i;
        this.f5642c = aVar;
        this.f5643d = tVar;
    }

    private C1367k(C1279a aVar, C3029t tVar) {
        this(1, aVar, null);
    }

    /* renamed from: h */
    public final C1279a mo6410h() {
        return this.f5642c;
    }

    /* renamed from: i */
    public final C3029t mo6411i() {
        return this.f5643d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3034c.m12411a(parcel);
        C3034c.m12417g(parcel, 1, this.f5641b);
        C3034c.m12419i(parcel, 2, this.f5642c, i, false);
        C3034c.m12419i(parcel, 3, this.f5643d, i, false);
        C3034c.m12412b(parcel, a);
    }
}
