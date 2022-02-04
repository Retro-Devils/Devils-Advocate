package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.p147v.AbstractC3031a;
import com.google.android.gms.common.internal.p147v.C3034c;

/* renamed from: com.google.android.gms.common.internal.s */
public class C3028s extends AbstractC3031a {
    public static final Parcelable.Creator<C3028s> CREATOR = new C2991c0();

    /* renamed from: b */
    private final int f10026b;

    /* renamed from: c */
    private final Account f10027c;

    /* renamed from: d */
    private final int f10028d;

    /* renamed from: e */
    private final GoogleSignInAccount f10029e;

    C3028s(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.f10026b = i;
        this.f10027c = account;
        this.f10028d = i2;
        this.f10029e = googleSignInAccount;
    }

    public C3028s(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }

    /* renamed from: h */
    public Account mo9805h() {
        return this.f10027c;
    }

    /* renamed from: i */
    public int mo9806i() {
        return this.f10028d;
    }

    /* renamed from: j */
    public GoogleSignInAccount mo9807j() {
        return this.f10029e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C3034c.m12411a(parcel);
        C3034c.m12417g(parcel, 1, this.f10026b);
        C3034c.m12419i(parcel, 2, mo9805h(), i, false);
        C3034c.m12417g(parcel, 3, mo9806i());
        C3034c.m12419i(parcel, 4, mo9807j(), i, false);
        C3034c.m12412b(parcel, a);
    }
}
