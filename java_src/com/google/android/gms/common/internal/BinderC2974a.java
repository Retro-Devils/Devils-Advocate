package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC3009k;

/* renamed from: com.google.android.gms.common.internal.a */
public class BinderC2974a extends AbstractC3009k.AbstractBinderC3010a {
    /* renamed from: m */
    public static Account m12201m(AbstractC3009k kVar) {
        if (kVar != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return kVar.mo9796h();
            } catch (RemoteException unused) {
                Log.w("AccountAccessor", "Remote account accessor probably died");
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return null;
    }
}
