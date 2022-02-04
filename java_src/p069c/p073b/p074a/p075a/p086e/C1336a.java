package p069c.p073b.p074a.p075a.p086e;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p147v.AbstractC3031a;
import com.google.android.gms.common.internal.p147v.C3034c;

/* renamed from: c.b.a.a.e.a */
public class C1336a extends AbstractC3031a {
    public static final Parcelable.Creator<C1336a> CREATOR = new C1345h();

    /* renamed from: b */
    public final String f5599b;

    /* renamed from: c */
    public final byte[] f5600c;

    /* renamed from: d */
    public final int f5601d;

    public C1336a(String str, byte[] bArr, int i) {
        this.f5599b = str;
        this.f5600c = bArr;
        this.f5601d = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3034c.m12411a(parcel);
        C3034c.m12420j(parcel, 2, this.f5599b, false);
        C3034c.m12415e(parcel, 3, this.f5600c, false);
        C3034c.m12417g(parcel, 4, this.f5601d);
        C3034c.m12412b(parcel, a);
    }
}
