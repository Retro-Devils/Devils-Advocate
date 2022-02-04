package p069c.p073b.p074a.p075a.p087f.p088b;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.AbstractC2964k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.p147v.AbstractC3031a;
import com.google.android.gms.common.internal.p147v.C3034c;

/* renamed from: c.b.a.a.f.b.b */
public final class C1358b extends AbstractC3031a implements AbstractC2964k {
    public static final Parcelable.Creator<C1358b> CREATOR = new C1359c();

    /* renamed from: b */
    private final int f5636b;

    /* renamed from: c */
    private int f5637c;

    /* renamed from: d */
    private Intent f5638d;

    public C1358b() {
        this(0, null);
    }

    C1358b(int i, int i2, Intent intent) {
        this.f5636b = i;
        this.f5637c = i2;
        this.f5638d = intent;
    }

    private C1358b(int i, Intent intent) {
        this(2, 0, null);
    }

    @Override // com.google.android.gms.common.api.AbstractC2964k
    /* renamed from: g */
    public final Status mo6351g() {
        return this.f5637c == 0 ? Status.f9753b : Status.f9757f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3034c.m12411a(parcel);
        C3034c.m12417g(parcel, 1, this.f5636b);
        C3034c.m12417g(parcel, 2, this.f5637c);
        C3034c.m12419i(parcel, 3, this.f5638d, i, false);
        C3034c.m12412b(parcel, a);
    }
}
