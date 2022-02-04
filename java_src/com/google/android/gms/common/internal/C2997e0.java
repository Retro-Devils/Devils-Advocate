package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.p147v.AbstractC3031a;
import com.google.android.gms.common.internal.p147v.C3034c;
import p069c.p073b.p074a.p075a.p077b.C1281c;

/* renamed from: com.google.android.gms.common.internal.e0 */
public final class C2997e0 extends AbstractC3031a {
    public static final Parcelable.Creator<C2997e0> CREATOR = new C2999f0();

    /* renamed from: b */
    Bundle f9975b;

    /* renamed from: c */
    C1281c[] f9976c;

    public C2997e0() {
    }

    C2997e0(Bundle bundle, C1281c[] cVarArr) {
        this.f9975b = bundle;
        this.f9976c = cVarArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3034c.m12411a(parcel);
        C3034c.m12414d(parcel, 1, this.f9975b, false);
        C3034c.m12422l(parcel, 2, this.f9976c, i, false);
        C3034c.m12412b(parcel, a);
    }
}
