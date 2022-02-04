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
    public static final Status f9753b = new Status(0);

    /* renamed from: c */
    public static final Status f9754c = new Status(14);

    /* renamed from: d */
    public static final Status f9755d = new Status(8);

    /* renamed from: e */
    public static final Status f9756e = new Status(15);

    /* renamed from: f */
    public static final Status f9757f = new Status(16);

    /* renamed from: g */
    private static final Status f9758g = new Status(17);

    /* renamed from: h */
    public static final Status f9759h = new Status(18);

    /* renamed from: i */
    private final int f9760i;

    /* renamed from: j */
    private final int f9761j;

    /* renamed from: k */
    private final String f9762k;

    /* renamed from: l */
    private final PendingIntent f9763l;

    public Status(int i) {
        this(i, null);
    }

    Status(int i, int i2, String str, PendingIntent pendingIntent) {
        this.f9760i = i;
        this.f9761j = i2;
        this.f9762k = str;
        this.f9763l = pendingIntent;
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
        return this.f9760i == status.f9760i && this.f9761j == status.f9761j && C3022p.m12361a(this.f9762k, status.f9762k) && C3022p.m12361a(this.f9763l, status.f9763l);
    }

    @Override // com.google.android.gms.common.api.AbstractC2964k
    /* renamed from: g */
    public final Status mo6351g() {
        return this;
    }

    /* renamed from: h */
    public final int mo9553h() {
        return this.f9761j;
    }

    public final int hashCode() {
        return C3022p.m12362b(Integer.valueOf(this.f9760i), Integer.valueOf(this.f9761j), this.f9762k, this.f9763l);
    }

    /* renamed from: i */
    public final String mo9555i() {
        return this.f9762k;
    }

    /* renamed from: j */
    public final boolean mo9556j() {
        return this.f9763l != null;
    }

    /* renamed from: k */
    public final boolean mo9557k() {
        return this.f9761j <= 0;
    }

    /* renamed from: l */
    public final String mo9558l() {
        String str = this.f9762k;
        return str != null ? str : C2907d.m12029a(this.f9761j);
    }

    public final String toString() {
        return C3022p.m12363c(this).mo9802a("statusCode", mo9558l()).mo9802a("resolution", this.f9763l).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3034c.m12411a(parcel);
        C3034c.m12417g(parcel, 1, mo9553h());
        C3034c.m12420j(parcel, 2, mo9555i(), false);
        C3034c.m12419i(parcel, 3, this.f9763l, i, false);
        C3034c.m12417g(parcel, 1000, this.f9760i);
        C3034c.m12412b(parcel, a);
    }
}
