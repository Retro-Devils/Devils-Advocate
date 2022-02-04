package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.p147v.C3032b;
import p069c.p073b.p074a.p075a.p077b.C1281c;

/* renamed from: com.google.android.gms.common.internal.g0 */
public final class C3001g0 implements Parcelable.Creator<C3000g> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C3000g createFromParcel(Parcel parcel) {
        int q = C3032b.m12409q(parcel);
        String str = null;
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Bundle bundle = null;
        Account account = null;
        C1281c[] cVarArr = null;
        C1281c[] cVarArr2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        while (parcel.dataPosition() < q) {
            int k = C3032b.m12403k(parcel);
            switch (C3032b.m12401i(k)) {
                case 1:
                    i = C3032b.m12405m(parcel, k);
                    break;
                case 2:
                    i2 = C3032b.m12405m(parcel, k);
                    break;
                case 3:
                    i3 = C3032b.m12405m(parcel, k);
                    break;
                case 4:
                    str = C3032b.m12396d(parcel, k);
                    break;
                case 5:
                    iBinder = C3032b.m12404l(parcel, k);
                    break;
                case 6:
                    scopeArr = (Scope[]) C3032b.m12398f(parcel, k, Scope.CREATOR);
                    break;
                case 7:
                    bundle = C3032b.m12393a(parcel, k);
                    break;
                case 8:
                    account = (Account) C3032b.m12395c(parcel, k, Account.CREATOR);
                    break;
                case 9:
                default:
                    C3032b.m12408p(parcel, k);
                    break;
                case 10:
                    cVarArr = (C1281c[]) C3032b.m12398f(parcel, k, C1281c.CREATOR);
                    break;
                case 11:
                    cVarArr2 = (C1281c[]) C3032b.m12398f(parcel, k, C1281c.CREATOR);
                    break;
                case 12:
                    z = C3032b.m12402j(parcel, k);
                    break;
            }
        }
        C3032b.m12400h(parcel, q);
        return new C3000g(i, i2, i3, str, iBinder, scopeArr, bundle, account, cVarArr, cVarArr2, z);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C3000g[] newArray(int i) {
        return new C3000g[i];
    }
}
