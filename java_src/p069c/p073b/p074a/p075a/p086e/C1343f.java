package p069c.p073b.p074a.p075a.p086e;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p147v.AbstractC3031a;
import com.google.android.gms.common.internal.p147v.C3034c;

/* renamed from: c.b.a.a.e.f */
public final class C1343f extends AbstractC3031a {
    public static final Parcelable.Creator<C1343f> CREATOR = new C1344g();

    /* renamed from: b */
    private final String f5607b;

    public C1343f(String str) {
        this.f5607b = str;
    }

    /* renamed from: b */
    public final String mo6368b() {
        return this.f5607b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3034c.m12411a(parcel);
        C3034c.m12420j(parcel, 2, this.f5607b, false);
        C3034c.m12412b(parcel, a);
    }
}
