package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageManager;
import p069c.p073b.p074a.p075a.p077b.p079l.C1292b;

/* renamed from: com.google.android.gms.common.util.b */
public class C3040b {
    /* renamed from: a */
    public static boolean m12434a(Context context, String str) {
        "com.google.android.gms".equals(str);
        try {
            return (C1292b.m6810a(context).mo6295a(str, 0).flags & 2097152) != 0;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }
}
