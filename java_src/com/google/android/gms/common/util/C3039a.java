package com.google.android.gms.common.util;

import com.google.android.gms.common.internal.C3022p;

/* renamed from: com.google.android.gms.common.util.a */
public final class C3039a {
    /* renamed from: a */
    public static <T> boolean m12433a(T[] tArr, T t) {
        int length = tArr != null ? tArr.length : 0;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (C3022p.m12361a(tArr[i], t)) {
                break;
            } else {
                i++;
            }
        }
        return i >= 0;
    }
}
