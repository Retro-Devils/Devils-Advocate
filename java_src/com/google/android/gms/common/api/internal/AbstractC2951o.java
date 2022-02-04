package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C2927d;
import com.google.android.gms.common.util.C3044f;

/* renamed from: com.google.android.gms.common.api.internal.o */
public abstract class AbstractC2951o {

    /* renamed from: a */
    private final int f9864a;

    public AbstractC2951o(int i) {
        this.f9864a = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static Status m12172a(RemoteException remoteException) {
        StringBuilder sb = new StringBuilder();
        if (C3044f.m12443b() && (remoteException instanceof TransactionTooLargeException)) {
            sb.append("TransactionTooLargeException: ");
        }
        sb.append(remoteException.getLocalizedMessage());
        return new Status(8, sb.toString());
    }

    /* renamed from: b */
    public abstract void mo9657b(Status status);

    /* renamed from: c */
    public abstract void mo9658c(C2927d.C2928a<?> aVar);

    /* renamed from: d */
    public abstract void mo9661d(C2942j jVar, boolean z);

    /* renamed from: e */
    public abstract void mo9659e(RuntimeException runtimeException);
}
