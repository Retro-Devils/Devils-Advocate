package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AbstractC3009k;
import com.google.android.gms.common.internal.p147v.AbstractC3031a;
import com.google.android.gms.common.internal.p147v.C3034c;
import p069c.p073b.p074a.p075a.p077b.C1281c;
import p069c.p073b.p074a.p075a.p077b.C1284e;

/* renamed from: com.google.android.gms.common.internal.g */
public class C3000g extends AbstractC3031a {
    public static final Parcelable.Creator<C3000g> CREATOR = new C3001g0();

    /* renamed from: b */
    private final int f9985b;

    /* renamed from: c */
    private final int f9986c;

    /* renamed from: d */
    private int f9987d;

    /* renamed from: e */
    String f9988e;

    /* renamed from: f */
    IBinder f9989f;

    /* renamed from: g */
    Scope[] f9990g;

    /* renamed from: h */
    Bundle f9991h;

    /* renamed from: i */
    Account f9992i;

    /* renamed from: j */
    C1281c[] f9993j;

    /* renamed from: k */
    C1281c[] f9994k;

    /* renamed from: l */
    private boolean f9995l;

    public C3000g(int i) {
        this.f9985b = 4;
        this.f9987d = C1284e.f5552a;
        this.f9986c = i;
        this.f9995l = true;
    }

    C3000g(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C1281c[] cVarArr, C1281c[] cVarArr2, boolean z) {
        this.f9985b = i;
        this.f9986c = i2;
        this.f9987d = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f9988e = "com.google.android.gms";
        } else {
            this.f9988e = str;
        }
        if (i < 2) {
            this.f9992i = iBinder != null ? BinderC2974a.m12201m(AbstractC3009k.AbstractBinderC3010a.m12345j(iBinder)) : null;
        } else {
            this.f9989f = iBinder;
            this.f9992i = account;
        }
        this.f9990g = scopeArr;
        this.f9991h = bundle;
        this.f9993j = cVarArr;
        this.f9994k = cVarArr2;
        this.f9995l = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3034c.m12411a(parcel);
        C3034c.m12417g(parcel, 1, this.f9985b);
        C3034c.m12417g(parcel, 2, this.f9986c);
        C3034c.m12417g(parcel, 3, this.f9987d);
        C3034c.m12420j(parcel, 4, this.f9988e, false);
        C3034c.m12416f(parcel, 5, this.f9989f, false);
        C3034c.m12422l(parcel, 6, this.f9990g, i, false);
        C3034c.m12414d(parcel, 7, this.f9991h, false);
        C3034c.m12419i(parcel, 8, this.f9992i, i, false);
        C3034c.m12422l(parcel, 10, this.f9993j, i, false);
        C3034c.m12422l(parcel, 11, this.f9994k, i, false);
        C3034c.m12413c(parcel, 12, this.f9995l);
        C3034c.m12412b(parcel, a);
    }
}
