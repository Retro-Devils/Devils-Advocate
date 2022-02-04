package p069c.p073b.p074a.p075a.p077b;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C3022p;
import com.google.android.gms.common.internal.p147v.AbstractC3031a;
import com.google.android.gms.common.internal.p147v.C3034c;

/* renamed from: c.b.a.a.b.a */
public final class C1279a extends AbstractC3031a {
    public static final Parcelable.Creator<C1279a> CREATOR = new C1293m();

    /* renamed from: b */
    public static final C1279a f5528b = new C1279a(0);

    /* renamed from: c */
    private final int f5529c;

    /* renamed from: d */
    private final int f5530d;

    /* renamed from: e */
    private final PendingIntent f5531e;

    /* renamed from: f */
    private final String f5532f;

    public C1279a(int i) {
        this(i, null, null);
    }

    C1279a(int i, int i2, PendingIntent pendingIntent, String str) {
        this.f5529c = i;
        this.f5530d = i2;
        this.f5531e = pendingIntent;
        this.f5532f = str;
    }

    public C1279a(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, null);
    }

    public C1279a(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str);
    }

    /* renamed from: m */
    static String m6755m(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1279a)) {
            return false;
        }
        C1279a aVar = (C1279a) obj;
        return this.f5530d == aVar.f5530d && C3022p.m12361a(this.f5531e, aVar.f5531e) && C3022p.m12361a(this.f5532f, aVar.f5532f);
    }

    /* renamed from: h */
    public final int mo6261h() {
        return this.f5530d;
    }

    public final int hashCode() {
        return C3022p.m12362b(Integer.valueOf(this.f5530d), this.f5531e, this.f5532f);
    }

    /* renamed from: i */
    public final String mo6263i() {
        return this.f5532f;
    }

    /* renamed from: j */
    public final PendingIntent mo6264j() {
        return this.f5531e;
    }

    /* renamed from: k */
    public final boolean mo6265k() {
        return (this.f5530d == 0 || this.f5531e == null) ? false : true;
    }

    /* renamed from: l */
    public final boolean mo6266l() {
        return this.f5530d == 0;
    }

    public final String toString() {
        return C3022p.m12363c(this).mo9802a("statusCode", m6755m(this.f5530d)).mo9802a("resolution", this.f5531e).mo9802a("message", this.f5532f).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3034c.m12411a(parcel);
        C3034c.m12417g(parcel, 1, this.f5529c);
        C3034c.m12417g(parcel, 2, mo6261h());
        C3034c.m12419i(parcel, 3, mo6264j(), i, false);
        C3034c.m12420j(parcel, 4, mo6263i(), false);
        C3034c.m12412b(parcel, a);
    }
}
