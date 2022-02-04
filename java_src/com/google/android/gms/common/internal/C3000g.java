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
    private final int f9977b;

    /* renamed from: c */
    private final int f9978c;

    /* renamed from: d */
    private int f9979d;

    /* renamed from: e */
    String f9980e;

    /* renamed from: f */
    IBinder f9981f;

    /* renamed from: g */
    Scope[] f9982g;

    /* renamed from: h */
    Bundle f9983h;

    /* renamed from: i */
    Account f9984i;

    /* renamed from: j */
    C1281c[] f9985j;

    /* renamed from: k */
    C1281c[] f9986k;

    /* renamed from: l */
    private boolean f9987l;

    public C3000g(int i) {
        this.f9977b = 4;
        this.f9979d = C1284e.f5544a;
        this.f9978c = i;
        this.f9987l = true;
    }

    C3000g(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C1281c[] cVarArr, C1281c[] cVarArr2, boolean z) {
        this.f9977b = i;
        this.f9978c = i2;
        this.f9979d = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f9980e = "com.google.android.gms";
        } else {
            this.f9980e = str;
        }
        if (i < 2) {
            this.f9984i = iBinder != null ? BinderC2974a.m12201m(AbstractC3009k.AbstractBinderC3010a.m12345j(iBinder)) : null;
        } else {
            this.f9981f = iBinder;
            this.f9984i = account;
        }
        this.f9982g = scopeArr;
        this.f9983h = bundle;
        this.f9985j = cVarArr;
        this.f9986k = cVarArr2;
        this.f9987l = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3034c.m12411a(parcel);
        C3034c.m12417g(parcel, 1, this.f9977b);
        C3034c.m12417g(parcel, 2, this.f9978c);
        C3034c.m12417g(parcel, 3, this.f9979d);
        C3034c.m12420j(parcel, 4, this.f9980e, false);
        C3034c.m12416f(parcel, 5, this.f9981f, false);
        C3034c.m12422l(parcel, 6, this.f9982g, i, false);
        C3034c.m12414d(parcel, 7, this.f9983h, false);
        C3034c.m12419i(parcel, 8, this.f9984i, i, false);
        C3034c.m12422l(parcel, 10, this.f9985j, i, false);
        C3034c.m12422l(parcel, 11, this.f9986k, i, false);
        C3034c.m12413c(parcel, 12, this.f9987l);
        C3034c.m12412b(parcel, a);
    }
}
