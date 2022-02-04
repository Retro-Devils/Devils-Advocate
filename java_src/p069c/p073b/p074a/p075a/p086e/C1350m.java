package p069c.p073b.p074a.p075a.p086e;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p147v.AbstractC3031a;
import com.google.android.gms.common.internal.p147v.C3034c;

/* renamed from: c.b.a.a.e.m */
public final class C1350m extends AbstractC3031a {
    public static final Parcelable.Creator<C1350m> CREATOR = new C1351n();

    /* renamed from: b */
    private final int f5621b;

    /* renamed from: c */
    private final boolean f5622c;

    public C1350m(int i, boolean z) {
        this.f5621b = i;
        this.f5622c = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3034c.m12411a(parcel);
        C3034c.m12417g(parcel, 2, this.f5621b);
        C3034c.m12413c(parcel, 3, this.f5622c);
        C3034c.m12412b(parcel, a);
    }
}
