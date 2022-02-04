package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;

/* renamed from: com.google.android.gms.common.util.e */
public final class C3043e {

    /* renamed from: a */
    private static Boolean f10042a;

    /* renamed from: b */
    private static Boolean f10043b;

    /* renamed from: c */
    private static Boolean f10044c;

    @TargetApi(21)
    /* renamed from: a */
    public static boolean m12438a(Context context) {
        if (f10043b == null) {
            f10043b = Boolean.valueOf(C3044f.m12447f() && context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f10043b.booleanValue();
    }

    @TargetApi(20)
    /* renamed from: b */
    public static boolean m12439b(Context context) {
        if (f10042a == null) {
            f10042a = Boolean.valueOf(C3044f.m12446e() && context.getPackageManager().hasSystemFeature("android.hardware.type.watch"));
        }
        return f10042a.booleanValue();
    }

    @TargetApi(26)
    /* renamed from: c */
    public static boolean m12440c(Context context) {
        if (!m12439b(context)) {
            return false;
        }
        if (C3044f.m12448g()) {
            return m12438a(context) && !C3044f.m12449h();
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m12441d(Context context) {
        if (f10044c == null) {
            f10044c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
        }
        return f10044c.booleanValue();
    }
}
