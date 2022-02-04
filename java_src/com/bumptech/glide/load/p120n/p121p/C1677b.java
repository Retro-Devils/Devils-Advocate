package com.bumptech.glide.load.p120n.p121p;

import android.net.Uri;

/* renamed from: com.bumptech.glide.load.n.p.b */
public final class C1677b {
    /* renamed from: a */
    public static boolean m7971a(Uri uri) {
        return m7972b(uri) && !m7975e(uri);
    }

    /* renamed from: b */
    public static boolean m7972b(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* renamed from: c */
    public static boolean m7973c(Uri uri) {
        return m7972b(uri) && m7975e(uri);
    }

    /* renamed from: d */
    public static boolean m7974d(int i, int i2) {
        return i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384;
    }

    /* renamed from: e */
    private static boolean m7975e(Uri uri) {
        return uri.getPathSegments().contains("video");
    }
}
