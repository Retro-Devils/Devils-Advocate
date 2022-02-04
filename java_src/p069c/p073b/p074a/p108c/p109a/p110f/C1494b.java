package p069c.p073b.p074a.p108c.p109a.p110f;

import android.text.TextUtils;

/* renamed from: c.b.a.c.a.f.b */
public final class C1494b {
    /* renamed from: a */
    public static <T> T m7373a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException("null reference");
    }

    /* renamed from: b */
    public static <T> T m7374b(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: c */
    public static String m7375c(String str, Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    /* renamed from: d */
    public static void m7376d(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }
}
