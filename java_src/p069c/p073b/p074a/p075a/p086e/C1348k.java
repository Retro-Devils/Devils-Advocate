package p069c.p073b.p074a.p075a.p086e;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p147v.AbstractC3031a;
import com.google.android.gms.common.internal.p147v.C3034c;

/* renamed from: c.b.a.a.e.k */
public final class C1348k extends AbstractC3031a {
    public static final Parcelable.Creator<C1348k> CREATOR = new C1349l();

    /* renamed from: b */
    private final String f5612b;

    public C1348k(String str) {
        this.f5612b = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3034c.m12411a(parcel);
        C3034c.m12420j(parcel, 2, this.f5612b, false);
        C3034c.m12412b(parcel, a);
    }
}
