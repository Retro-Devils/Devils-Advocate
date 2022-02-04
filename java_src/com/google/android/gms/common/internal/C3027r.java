package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.util.C3046h;

/* renamed from: com.google.android.gms.common.internal.r */
public final class C3027r {
    /* renamed from: a */
    public static void m12369a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static void m12370b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: c */
    public static void m12371c(Handler handler) {
        m12372d(handler, "Must be called on the handler thread");
    }

    /* renamed from: d */
    public static void m12372d(Handler handler, String str) {
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: e */
    public static String m12373e(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    /* renamed from: f */
    public static String m12374f(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    /* renamed from: g */
    public static void m12375g(String str) {
        if (C3046h.m12451a()) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: h */
    public static <T> T m12376h(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException("null reference");
    }

    /* renamed from: i */
    public static <T> T m12377i(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: j */
    public static void m12378j(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: k */
    public static void m12379k(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
