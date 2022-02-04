package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p069c.p073b.p074a.p075a.p081d.p083b.BinderC1310b;
import p069c.p073b.p074a.p075a.p081d.p083b.C1309a;
import p069c.p073b.p074a.p075a.p081d.p083b.C1311c;

/* renamed from: com.google.android.gms.common.internal.k */
public interface AbstractC3009k extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.k$a */
    public static abstract class AbstractBinderC3010a extends BinderC1310b implements AbstractC3009k {

        /* renamed from: com.google.android.gms.common.internal.k$a$a */
        public static class C3011a extends C1309a implements AbstractC3009k {
            C3011a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
            }

            @Override // com.google.android.gms.common.internal.AbstractC3009k
            /* renamed from: h */
            public final Account mo9796h() {
                Parcel j = mo6317j(2, mo6316i());
                Account account = (Account) C1311c.m6833a(j, Account.CREATOR);
                j.recycle();
                return account;
            }
        }

        /* renamed from: j */
        public static AbstractC3009k m12345j(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof AbstractC3009k ? (AbstractC3009k) queryLocalInterface : new C3011a(iBinder);
        }
    }

    /* renamed from: h */
    Account mo9796h();
}
