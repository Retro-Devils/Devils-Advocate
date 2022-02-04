package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C3027r;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.p147v.AbstractC3031a;
import com.google.android.gms.common.internal.p147v.C3034c;

public final class Scope extends AbstractC3031a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new C2969p();

    /* renamed from: b */
    private final int f9751b;

    /* renamed from: c */
    private final String f9752c;

    Scope(int i, String str) {
        C3027r.m12374f(str, "scopeUri must not be null or empty");
        this.f9751b = i;
        this.f9752c = str;
    }

    public Scope(String str) {
        this(1, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f9752c.equals(((Scope) obj).f9752c);
    }

    /* renamed from: h */
    public final String mo9548h() {
        return this.f9752c;
    }

    public final int hashCode() {
        return this.f9752c.hashCode();
    }

    public final String toString() {
        return this.f9752c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3034c.m12411a(parcel);
        C3034c.m12417g(parcel, 1, this.f9751b);
        C3034c.m12420j(parcel, 2, mo9548h(), false);
        C3034c.m12412b(parcel, a);
    }
}
