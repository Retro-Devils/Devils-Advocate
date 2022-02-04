package com.bumptech.glide.load.p128q.p129d;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import java.io.File;

/* renamed from: com.bumptech.glide.load.q.d.r */
public final class C1938r {

    /* renamed from: a */
    private static final File f7222a = new File("/proc/self/fd");

    /* renamed from: b */
    private static volatile C1938r f7223b;

    /* renamed from: c */
    private final boolean f7224c = m8780d();

    /* renamed from: d */
    private final int f7225d;

    /* renamed from: e */
    private final int f7226e;

    /* renamed from: f */
    private int f7227f;

    /* renamed from: g */
    private boolean f7228g = true;

    C1938r() {
        int i;
        if (Build.VERSION.SDK_INT >= 28) {
            this.f7225d = 20000;
            i = 0;
        } else {
            this.f7225d = 700;
            i = 128;
        }
        this.f7226e = i;
    }

    /* renamed from: a */
    public static C1938r m8778a() {
        if (f7223b == null) {
            synchronized (C1938r.class) {
                if (f7223b == null) {
                    f7223b = new C1938r();
                }
            }
        }
        return f7223b;
    }

    /* renamed from: b */
    private synchronized boolean m8779b() {
        boolean z = true;
        int i = this.f7227f + 1;
        this.f7227f = i;
        if (i >= 50) {
            this.f7227f = 0;
            int length = f7222a.list().length;
            if (length >= this.f7225d) {
                z = false;
            }
            this.f7228g = z;
            if (!z && Log.isLoggable("Downsampler", 5)) {
                Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + this.f7225d);
            }
        }
        return this.f7228g;
    }

    /* renamed from: d */
    private static boolean m8780d() {
        String str = Build.MODEL;
        if (str == null || str.length() < 7) {
            return true;
        }
        String substring = str.substring(0, 7);
        substring.hashCode();
        char c = 65535;
        switch (substring.hashCode()) {
            case -1398613787:
                if (substring.equals("SM-A520")) {
                    c = 0;
                    break;
                }
                break;
            case -1398431166:
                if (substring.equals("SM-G930")) {
                    c = 1;
                    break;
                }
                break;
            case -1398431161:
                if (substring.equals("SM-G935")) {
                    c = 2;
                    break;
                }
                break;
            case -1398431073:
                if (substring.equals("SM-G960")) {
                    c = 3;
                    break;
                }
                break;
            case -1398431068:
                if (substring.equals("SM-G965")) {
                    c = 4;
                    break;
                }
                break;
            case -1398343746:
                if (substring.equals("SM-J720")) {
                    c = 5;
                    break;
                }
                break;
            case -1398222624:
                if (substring.equals("SM-N935")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return Build.VERSION.SDK_INT != 26;
            default:
                return true;
        }
    }

    /* renamed from: c */
    public boolean mo7525c(int i, int i2, boolean z, boolean z2) {
        int i3;
        return z && this.f7224c && Build.VERSION.SDK_INT >= 26 && !z2 && i >= (i3 = this.f7226e) && i2 >= i3 && m8779b();
    }

    /* access modifiers changed from: package-private */
    @TargetApi(26)
    /* renamed from: e */
    public boolean mo7526e(int i, int i2, BitmapFactory.Options options, boolean z, boolean z2) {
        boolean c = mo7525c(i, i2, z, z2);
        if (c) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return c;
    }
}
