package com.bumptech.glide.p144t;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.SystemClock;

/* renamed from: com.bumptech.glide.t.f */
public final class C2077f {

    /* renamed from: a */
    private static final double f7590a;

    static {
        double d = 1.0d;
        if (Build.VERSION.SDK_INT >= 17) {
            d = 1.0d / Math.pow(10.0d, 6.0d);
        }
        f7590a = d;
    }

    /* renamed from: a */
    public static double m9415a(long j) {
        double b = (double) (m9416b() - j);
        double d = f7590a;
        Double.isNaN(b);
        return b * d;
    }

    @TargetApi(17)
    /* renamed from: b */
    public static long m9416b() {
        return Build.VERSION.SDK_INT >= 17 ? SystemClock.elapsedRealtimeNanos() : SystemClock.uptimeMillis();
    }
}
