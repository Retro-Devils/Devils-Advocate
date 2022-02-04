package com.bumptech.glide.p144t;

import android.text.TextUtils;
import java.util.Collection;

/* renamed from: com.bumptech.glide.t.j */
public final class C2081j {
    /* renamed from: a */
    public static void m9429a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static String m9430b(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    /* renamed from: c */
    public static <T extends Collection<Y>, Y> T m9431c(T t) {
        if (!t.isEmpty()) {
            return t;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    /* renamed from: d */
    public static <T> T m9432d(T t) {
        return (T) m9433e(t, "Argument must not be null");
    }

    /* renamed from: e */
    public static <T> T m9433e(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }
}
