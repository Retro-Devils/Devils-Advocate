package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3009k;
import com.google.android.gms.common.internal.p147v.AbstractC3031a;
import com.google.android.gms.common.internal.p147v.C3034c;
import p069c.p073b.p074a.p075a.p077b.C1279a;

/* renamed from: com.google.android.gms.common.internal.t */
public class C3029t extends AbstractC3031a {
    public static final Parcelable.Creator<C3029t> CREATOR = new C2995d0();

    /* renamed from: b */
    private final int f10038b;

    /* renamed from: c */
    private IBinder f10039c;

    /* renamed from: d */
    private C1279a f10040d;

    /* renamed from: e */
    private boolean f10041e;

    /* renamed from: f */
    private boolean f10042f;

    C3029t(int i, IBinder iBinder, C1279a aVar, boolean z, boolean z2) {
        this.f10038b = i;
        this.f10039c = iBinder;
        this.f10040d = aVar;
        this.f10041e = z;
        this.f10042f = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3029t)) {
            return false;
        }
        C3029t tVar = (C3029t) obj;
        return this.f10040d.equals(tVar.f10040d) && mo9810h().equals(tVar.mo9810h());
    }

    /* renamed from: h */
    public AbstractC3009k mo9810h() {
        return AbstractC3009k.AbstractBinderC3010a.m12345j(this.f10039c);
    }

    /* renamed from: i */
    public C1279a mo9811i() {
        return this.f10040d;
    }

    /* renamed from: j */
    public boolean mo9812j() {
        return this.f10041e;
    }

    /* renamed from: k */
    public boolean mo9813k() {
        return this.f10042f;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3034c.m12411a(parcel);
        C3034c.m12417g(parcel, 1, this.f10038b);
        C3034c.m12416f(parcel, 2, this.f10039c, false);
        C3034c.m12419i(parcel, 3, mo9811i(), i, false);
        C3034c.m12413c(parcel, 4, mo9812j());
        C3034c.m12413c(parcel, 5, mo9813k());
        C3034c.m12412b(parcel, a);
    }
}
