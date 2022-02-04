package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import javax.annotation.concurrent.GuardedBy;
import p069c.p073b.p074a.p075a.p077b.p079l.C1292b;

/* renamed from: com.google.android.gms.common.internal.n0 */
public final class C3019n0 {

    /* renamed from: a */
    private static Object f10019a = new Object();
    @GuardedBy("sLock")

    /* renamed from: b */
    private static boolean f10020b;

    /* renamed from: c */
    private static String f10021c;

    /* renamed from: d */
    private static int f10022d;

    /* renamed from: a */
    public static int m12358a(Context context) {
        m12359b(context);
        return f10022d;
    }

    /* renamed from: b */
    private static void m12359b(Context context) {
        synchronized (f10019a) {
            if (!f10020b) {
                f10020b = true;
                try {
                    Bundle bundle = C1292b.m6810a(context).mo6295a(context.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        f10021c = bundle.getString("com.google.app.id");
                        f10022d = bundle.getInt("com.google.android.gms.version");
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e);
                }
            }
        }
    }
}
