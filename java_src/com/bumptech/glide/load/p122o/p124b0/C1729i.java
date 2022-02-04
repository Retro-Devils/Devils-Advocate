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
    private final int f6774a;

    /* renamed from: b */
    private final int f6775b;

    /* renamed from: c */
    private final Context f6776c;

    /* renamed from: d */
    private final int f6777d;

    /* renamed from: com.bumptech.glide.load.o.b0.i$a */
    public static final class C1730a {

        /* renamed from: a */
        static final int f6778a = (Build.VERSION.SDK_INT < 26 ? 4 : 1);

        /* renamed from: b */
        final Context f6779b;

        /* renamed from: c */
        ActivityManager f6780c;

        /* renamed from: d */
        AbstractC1732c f6781d;

        /* renamed from: e */
        float f6782e = 2.0f;

        /* renamed from: f */
        float f6783f = ((float) f6778a);

        /* renamed from: g */
        float f6784g = 0.4f;

        /* renamed from: h */
        float f6785h = 0.33f;

        /* renamed from: i */
        int f6786i = 4194304;

        public C1730a(Context context) {
            this.f6779b = context;
            this.f6780c = (ActivityManager) context.getSystemService("activity");
            this.f6781d = new C1731b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT >= 26 && C1729i.m8150e(this.f6780c)) {
                this.f6783f = 0.0f;
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
        private final DisplayMetrics f6787a;

        C1731b(DisplayMetrics displayMetrics) {
            this.f6787a = displayMetrics;
        }

        @Override // com.bumptech.glide.load.p122o.p124b0.C1729i.AbstractC1732c
        /* renamed from: a */
        public int mo7235a() {
            return this.f6787a.heightPixels;
        }

        @Override // com.bumptech.glide.load.p122o.p124b0.C1729i.AbstractC1732c
        /* renamed from: b */
        public int mo7236b() {
            return this.f6787a.widthPixels;
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
        this.f6776c = aVar.f6779b;
        int i = m8150e(aVar.f6780c) ? aVar.f6786i / 2 : aVar.f6786i;
        this.f6777d = i;
        int c = m8149c(aVar.f6780c, aVar.f6784g, aVar.f6785h);
        float b = (float) (aVar.f6781d.mo7236b() * aVar.f6781d.mo7235a() * 4);
        int round = Math.round(aVar.f6783f * b);
        int round2 = Math.round(b * aVar.f6782e);
        int i2 = c - i;
        int i3 = round2 + round;
        if (i3 <= i2) {
            this.f6775b = round2;
            this.f6774a = round;
        } else {
            float f = (float) i2;
            float f2 = aVar.f6783f;
            float f3 = aVar.f6782e;
            float f4 = f / (f2 + f3);
            this.f6775b = Math.round(f3 * f4);
            this.f6774a = Math.round(f4 * aVar.f6783f);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Calculation complete, Calculated memory cache size: ");
            sb.append(m8151f(this.f6775b));
            sb.append(", pool size: ");
            sb.append(m8151f(this.f6774a));
            sb.append(", byte array size: ");
            sb.append(m8151f(i));
            sb.append(", memory class limited? ");
            sb.append(i3 > c);
            sb.append(", max size: ");
            sb.append(m8151f(c));
            sb.append(", memoryClass: ");
            sb.append(aVar.f6780c.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(m8150e(aVar.f6780c));
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
        return Formatter.formatFileSize(this.f6776c, (long) i);
    }

    /* renamed from: a */
    public int mo7231a() {
        return this.f6777d;
    }

    /* renamed from: b */
    public int mo7232b() {
        return this.f6774a;
    }

    /* renamed from: d */
    public int mo7233d() {
        return this.f6775b;
    }
}
