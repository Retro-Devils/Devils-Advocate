package com.bumptech.glide.load.p122o.p124b0;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* renamed from: com.bumptech.glide.load.o.b0.i */
public final class C1729i {

    /* renamed from: a */
    private final int f6782a;

    /* renamed from: b */
    private final int f6783b;

    /* renamed from: c */
    private final Context f6784c;

    /* renamed from: d */
    private final int f6785d;

    /* renamed from: com.bumptech.glide.load.o.b0.i$a */
    public static final class C1730a {

        /* renamed from: a */
        static final int f6786a = (Build.VERSION.SDK_INT < 26 ? 4 : 1);

        /* renamed from: b */
        final Context f6787b;

        /* renamed from: c */
        ActivityManager f6788c;

        /* renamed from: d */
        AbstractC1732c f6789d;

        /* renamed from: e */
        float f6790e = 2.0f;

        /* renamed from: f */
        float f6791f = ((float) f6786a);

        /* renamed from: g */
        float f6792g = 0.4f;

        /* renamed from: h */
        float f6793h = 0.33f;

        /* renamed from: i */
        int f6794i = 4194304;

        public C1730a(Context context) {
            this.f6787b = context;
            this.f6788c = (ActivityManager) context.getSystemService("activity");
            this.f6789d = new C1731b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT >= 26 && C1729i.m8150e(this.f6788c)) {
                this.f6791f = 0.0f;
            }
        }

        /* renamed from: a */
        public C1729i mo7234a() {
            return new C1729i(this);
        }
    }

    /* renamed from: com.bumptech.glide.load.o.b0.i$b */
    private static final class C1731b implements AbstractC1732c {

        /* renamed from: a */
        private final DisplayMetrics f6795a;

        C1731b(DisplayMetrics displayMetrics) {
            this.f6795a = displayMetrics;
        }

        @Override // com.bumptech.glide.load.p122o.p124b0.C1729i.AbstractC1732c
        /* renamed from: a */
        public int mo7235a() {
            return this.f6795a.heightPixels;
        }

        @Override // com.bumptech.glide.load.p122o.p124b0.C1729i.AbstractC1732c
        /* renamed from: b */
        public int mo7236b() {
            return this.f6795a.widthPixels;
        }
    }

    /* renamed from: com.bumptech.glide.load.o.b0.i$c */
    interface AbstractC1732c {
        /* renamed from: a */
        int mo7235a();

        /* renamed from: b */
        int mo7236b();
    }

    C1729i(C1730a aVar) {
        this.f6784c = aVar.f6787b;
        int i = m8150e(aVar.f6788c) ? aVar.f6794i / 2 : aVar.f6794i;
        this.f6785d = i;
        int c = m8149c(aVar.f6788c, aVar.f6792g, aVar.f6793h);
        float b = (float) (aVar.f6789d.mo7236b() * aVar.f6789d.mo7235a() * 4);
        int round = Math.round(aVar.f6791f * b);
        int round2 = Math.round(b * aVar.f6790e);
        int i2 = c - i;
        int i3 = round2 + round;
        if (i3 <= i2) {
            this.f6783b = round2;
            this.f6782a = round;
        } else {
            float f = (float) i2;
            float f2 = aVar.f6791f;
            float f3 = aVar.f6790e;
            float f4 = f / (f2 + f3);
            this.f6783b = Math.round(f3 * f4);
            this.f6782a = Math.round(f4 * aVar.f6791f);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Calculation complete, Calculated memory cache size: ");
            sb.append(m8151f(this.f6783b));
            sb.append(", pool size: ");
            sb.append(m8151f(this.f6782a));
            sb.append(", byte array size: ");
            sb.append(m8151f(i));
            sb.append(", memory class limited? ");
            sb.append(i3 > c);
            sb.append(", max size: ");
            sb.append(m8151f(c));
            sb.append(", memoryClass: ");
            sb.append(aVar.f6788c.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(m8150e(aVar.f6788c));
            Log.d("MemorySizeCalculator", sb.toString());
        }
    }

    /* renamed from: c */
    private static int m8149c(ActivityManager activityManager, float f, float f2) {
        boolean e = m8150e(activityManager);
        float memoryClass = (float) (activityManager.getMemoryClass() * 1024 * 1024);
        if (e) {
            f = f2;
        }
        return Math.round(memoryClass * f);
    }

    @TargetApi(19)
    /* renamed from: e */
    static boolean m8150e(ActivityManager activityManager) {
        if (Build.VERSION.SDK_INT >= 19) {
            return activityManager.isLowRamDevice();
        }
        return true;
    }

    /* renamed from: f */
    private String m8151f(int i) {
        return Formatter.formatFileSize(this.f6784c, (long) i);
    }

    /* renamed from: a */
    public int mo7231a() {
        return this.f6785d;
    }

    /* renamed from: b */
    public int mo7232b() {
        return this.f6782a;
    }

    /* renamed from: d */
    public int mo7233d() {
        return this.f6783b;
    }
}
