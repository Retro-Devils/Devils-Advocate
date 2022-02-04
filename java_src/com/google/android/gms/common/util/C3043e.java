package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;

/* renamed from: com.google.android.gms.common.util.e */
public final class C3043e {

    /* renamed from: a */
    private static Boolean f10050a;

    /* renamed from: b */
    private static Boolean f10051b;

    /* renamed from: c */
    private static Boolean f10052c;

    @TargetApi(21)
    /* renamed from: a */
    public static boolean m12438a(Context context) {
        if (f10051b == null) {
            f10051b = Boolean.valueOf(C3044f.m12447f() && context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f10051b.booleanValue();
    }

    @TargetApi(20)
    /* renamed from: b */
    public static boolean m12439b(Context context) {
        if (f10050a == null) {
            f10050a = Boolean.valueOf(C3044f.m12446e() && context.getPackageManager().hasSystemFeature("android.hardware.type.watch"));
        }
        return f10050a.booleanValue();
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
        if (f10052c == null) {
            f10052c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
        }
        return f10052c.booleanValue();
    }
}
