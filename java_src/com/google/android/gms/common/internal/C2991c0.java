package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.p147v.C3032b;

/* renamed from: com.google.android.gms.common.internal.c0 */
public final class C2991c0 implements Parcelable.Creator<C3028s> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C3028s createFromParcel(Parcel parcel) {
        int q = C3032b.m12409q(parcel);
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < q) {
            int k = C3032b.m12403k(parcel);
            int i3 = C3032b.m12401i(k);
            if (i3 == 1) {
                i = C3032b.m12405m(parcel, k);
            } else if (i3 == 2) {
                account = (Account) C3032b.m12395c(parcel, k, Account.CREATOR);
            } else if (i3 == 3) {
                i2 = C3032b.m12405m(parcel, k);
            } else if (i3 != 4) {
                C3032b.m12408p(parcel, k);
            } else {
                googleSignInAccount = (GoogleSignInAccount) C3032b.m12395c(parcel, k, GoogleSignInAccount.CREATOR);
            }
        }
        C3032b.m12400h(parcel, q);
        return new C3028s(i, account, i2, googleSignInAccount);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C3028s[] newArray(int i) {
        return new C3028s[i];
    }
}
