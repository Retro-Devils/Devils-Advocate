package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C3022p;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.p147v.AbstractC3031a;
import com.google.android.gms.common.internal.p147v.C3034c;

public final class Status extends AbstractC3031a implements AbstractC2964k, ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new C2970q();

    /* renamed from: b */
    public static final Status f9745b = new Status(0);

    /* renamed from: c */
    public static final Status f9746c = new Status(14);

    /* renamed from: d */
    public static final Status f9747d = new Status(8);

    /* renamed from: e */
    public static final Status f9748e = new Status(15);

    /* renamed from: f */
    public static final Status f9749f = new Status(16);

    /* renamed from: g */
    private static final Status f9750g = new Status(17);

    /* renamed from: h */
    public static final Status f9751h = new Status(18);

    /* renamed from: i */
    private final int f9752i;

    /* renamed from: j */
    private final int f9753j;

    /* renamed from: k */
    private final String f9754k;

    /* renamed from: l */
    private final PendingIntent f9755l;

    public Status(int i) {
        this(i, null);
    }

    Status(int i, int i2, String str, PendingIntent pendingIntent) {
        this.f9752i = i;
        this.f9753j = i2;
        this.f9754k = str;
        this.f9755l = pendingIntent;
    }

    public Status(int i, String str) {
        this(1, i, str, null);
    }

    public Status(int i, String str, PendingIntent pendingIntent) {
        this(1, i, str, pendingIntent);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f9752i == status.f9752i && this.f9753j == status.f9753j && C3022p.m12361a(this.f9754k, status.f9754k) && C3022p.m12361a(this.f9755l, status.f9755l);
    }

    @Override // com.google.android.gms.common.api.AbstractC2964k
    /* renamed from: g */
    public final Status mo6351g() {
        return this;
    }

    /* renamed from: h */
    public final int mo9553h() {
        return this.f9753j;
    }

    public final int hashCode() {
        return C3022p.m12362b(Integer.valueOf(this.f9752i), Integer.valueOf(this.f9753j), this.f9754k, this.f9755l);
    }

    /* renamed from: i */
    public final String mo9555i() {
        return this.f9754k;
    }

    /* renamed from: j */
    public final boolean mo9556j() {
        return this.f9755l != null;
    }

    /* renamed from: k */
    public final boolean mo9557k() {
        return this.f9753j <= 0;
    }

    /* renamed from: l */
    public final String mo9558l() {
        String str = this.f9754k;
        return str != null ? str : C2907d.m12029a(this.f9753j);
    }

    public final String toString() {
        return C3022p.m12363c(this).mo9802a("statusCode", mo9558l()).mo9802a("resolution", this.f9755l).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3034c.m12411a(parcel);
        C3034c.m12417g(parcel, 1, mo9553h());
        C3034c.m12420j(parcel, 2, mo9555i(), false);
        C3034c.m12419i(parcel, 3, this.f9755l, i, false);
        C3034c.m12417g(parcel, 1000, this.f9752i);
        C3034c.m12412b(parcel, a);
    }
}
