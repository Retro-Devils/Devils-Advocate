package p069c.p073b.p074a.p075a.p077b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C3022p;
import com.google.android.gms.common.internal.p147v.AbstractC3031a;
import com.google.android.gms.common.internal.p147v.C3034c;

/* renamed from: c.b.a.a.b.c */
public class C1281c extends AbstractC3031a {
    public static final Parcelable.Creator<C1281c> CREATOR = new C1294n();

    /* renamed from: b */
    private final String f5535b;
    @Deprecated

    /* renamed from: c */
    private final int f5536c;

    /* renamed from: d */
    private final long f5537d;

    public C1281c(String str, int i, long j) {
        this.f5535b = str;
        this.f5536c = i;
        this.f5537d = j;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1281c) {
            C1281c cVar = (C1281c) obj;
            return ((mo6273h() != null && mo6273h().equals(cVar.mo6273h())) || (mo6273h() == null && cVar.mo6273h() == null)) && mo6275i() == cVar.mo6275i();
        }
    }

    /* renamed from: h */
    public String mo6273h() {
        return this.f5535b;
    }

    public int hashCode() {
        return C3022p.m12362b(mo6273h(), Long.valueOf(mo6275i()));
    }

    /* renamed from: i */
    public long mo6275i() {
        long j = this.f5537d;
        return j == -1 ? (long) this.f5536c : j;
    }

    public String toString() {
        return C3022p.m12363c(this).mo9802a("name", mo6273h()).mo9802a("version", Long.valueOf(mo6275i())).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3034c.m12411a(parcel);
        C3034c.m12420j(parcel, 1, mo6273h(), false);
        C3034c.m12417g(parcel, 2, this.f5536c);
        C3034c.m12418h(parcel, 3, mo6275i());
        C3034c.m12412b(parcel, a);
    }
}
