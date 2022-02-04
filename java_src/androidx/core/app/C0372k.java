package androidx.core.app;

import android.app.RemoteInput;

/* renamed from: androidx.core.app.k */
public final class C0372k {
    /* renamed from: a */
    static RemoteInput m1853a(C0372k kVar) {
        throw null;
    }

    /* renamed from: b */
    static RemoteInput[] m1854b(C0372k[] kVarArr) {
        if (kVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[kVarArr.length];
        for (int i = 0; i < kVarArr.length; i++) {
            remoteInputArr[i] = m1853a(kVarArr[i]);
        }
        return remoteInputArr;
    }
}
