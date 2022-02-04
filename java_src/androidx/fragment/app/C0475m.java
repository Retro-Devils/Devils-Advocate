package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.lifecycle.AbstractC0614d;

/* access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.m */
public final class C0475m implements Parcelable {
    public static final Parcelable.Creator<C0475m> CREATOR = new C0476a();

    /* renamed from: b */
    final String f2444b;

    /* renamed from: c */
    final String f2445c;

    /* renamed from: d */
    final boolean f2446d;

    /* renamed from: e */
    final int f2447e;

    /* renamed from: f */
    final int f2448f;

    /* renamed from: g */
    final String f2449g;

    /* renamed from: h */
    final boolean f2450h;

    /* renamed from: i */
    final boolean f2451i;

    /* renamed from: j */
    final boolean f2452j;

    /* renamed from: k */
    final Bundle f2453k;

    /* renamed from: l */
    final boolean f2454l;

    /* renamed from: m */
    final int f2455m;

    /* renamed from: n */
    Bundle f2456n;

    /* renamed from: o */
    Fragment f2457o;

    /* renamed from: androidx.fragment.app.m$a */
    static class C0476a implements Parcelable.Creator<C0475m> {
        C0476a() {
        }

        /* renamed from: a */
        public C0475m createFromParcel(Parcel parcel) {
            return new C0475m(parcel);
        }

        /* renamed from: b */
        public C0475m[] newArray(int i) {
            return new C0475m[i];
        }
    }

    C0475m(Parcel parcel) {
        this.f2444b = parcel.readString();
        this.f2445c = parcel.readString();
        boolean z = true;
        this.f2446d = parcel.readInt() != 0;
        this.f2447e = parcel.readInt();
        this.f2448f = parcel.readInt();
        this.f2449g = parcel.readString();
        this.f2450h = parcel.readInt() != 0;
        this.f2451i = parcel.readInt() != 0;
        this.f2452j = parcel.readInt() != 0;
        this.f2453k = parcel.readBundle();
        this.f2454l = parcel.readInt() == 0 ? false : z;
        this.f2456n = parcel.readBundle();
        this.f2455m = parcel.readInt();
    }

    C0475m(Fragment fragment) {
        this.f2444b = fragment.getClass().getName();
        this.f2445c = fragment.f2272g;
        this.f2446d = fragment.f2280o;
        this.f2447e = fragment.f2289x;
        this.f2448f = fragment.f2290y;
        this.f2449g = fragment.f2291z;
        this.f2450h = fragment.f2245C;
        this.f2451i = fragment.f2279n;
        this.f2452j = fragment.f2244B;
        this.f2453k = fragment.f2273h;
        this.f2454l = fragment.f2243A;
        this.f2455m = fragment.f2262T.ordinal();
    }

    /* renamed from: b */
    public Fragment mo2860b(ClassLoader classLoader, C0451g gVar) {
        Bundle bundle;
        Fragment fragment;
        if (this.f2457o == null) {
            Bundle bundle2 = this.f2453k;
            if (bundle2 != null) {
                bundle2.setClassLoader(classLoader);
            }
            Fragment a = gVar.mo2725a(classLoader, this.f2444b);
            this.f2457o = a;
            a.mo2554c2(this.f2453k);
            Bundle bundle3 = this.f2456n;
            if (bundle3 != null) {
                bundle3.setClassLoader(classLoader);
                fragment = this.f2457o;
                bundle = this.f2456n;
            } else {
                fragment = this.f2457o;
                bundle = new Bundle();
            }
            fragment.f2269d = bundle;
            Fragment fragment2 = this.f2457o;
            fragment2.f2272g = this.f2445c;
            fragment2.f2280o = this.f2446d;
            fragment2.f2282q = true;
            fragment2.f2289x = this.f2447e;
            fragment2.f2290y = this.f2448f;
            fragment2.f2291z = this.f2449g;
            fragment2.f2245C = this.f2450h;
            fragment2.f2279n = this.f2451i;
            fragment2.f2244B = this.f2452j;
            fragment2.f2243A = this.f2454l;
            fragment2.f2262T = AbstractC0614d.EnumC0616b.values()[this.f2455m];
            if (LayoutInflater$Factory2C0456j.f2366d) {
                Log.v("FragmentManager", "Instantiated fragment " + this.f2457o);
            }
        }
        return this.f2457o;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f2444b);
        sb.append(" (");
        sb.append(this.f2445c);
        sb.append(")}:");
        if (this.f2446d) {
            sb.append(" fromLayout");
        }
        if (this.f2448f != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f2448f));
        }
        String str = this.f2449g;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f2449g);
        }
        if (this.f2450h) {
            sb.append(" retainInstance");
        }
        if (this.f2451i) {
            sb.append(" removing");
        }
        if (this.f2452j) {
            sb.append(" detached");
        }
        if (this.f2454l) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2444b);
        parcel.writeString(this.f2445c);
        parcel.writeInt(this.f2446d ? 1 : 0);
        parcel.writeInt(this.f2447e);
        parcel.writeInt(this.f2448f);
        parcel.writeString(this.f2449g);
        parcel.writeInt(this.f2450h ? 1 : 0);
        parcel.writeInt(this.f2451i ? 1 : 0);
        parcel.writeInt(this.f2452j ? 1 : 0);
        parcel.writeBundle(this.f2453k);
        parcel.writeInt(this.f2454l ? 1 : 0);
        parcel.writeBundle(this.f2456n);
        parcel.writeInt(this.f2455m);
    }
}
