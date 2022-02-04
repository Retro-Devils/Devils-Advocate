package com.google.android.material.datepicker;

import android.os.Build;
import java.util.Date;
import java.util.Locale;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.material.datepicker.e */
public class C3109e {
    /* renamed from: a */
    static String m12997a(long j) {
        return m12998b(j, Locale.getDefault());
    }

    /* renamed from: b */
    static String m12998b(long j, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? C3136p.m13072b(locale).format(new Date(j)) : C3136p.m13076f(locale).format(new Date(j));
    }

    /* renamed from: c */
    static String m12999c(long j) {
        return m13000d(j, Locale.getDefault());
    }

    /* renamed from: d */
    static String m13000d(long j, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? C3136p.m13084n(locale).format(new Date(j)) : C3136p.m13076f(locale).format(new Date(j));
    }
}
