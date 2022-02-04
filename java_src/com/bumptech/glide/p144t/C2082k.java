package com.bumptech.glide.p144t;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Looper;
import com.bumptech.glide.load.p126p.AbstractC1839l;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/* renamed from: com.bumptech.glide.t.k */
public final class C2082k {

    /* renamed from: a */
    private static final char[] f7607a = "0123456789abcdef".toCharArray();

    /* renamed from: b */
    private static final char[] f7608b = new char[64];

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.t.k$a */
    public static /* synthetic */ class C2083a {

        /* renamed from: a */
        static final /* synthetic */ int[] f7609a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bumptech.glide.p144t.C2082k.C2083a.f7609a = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bumptech.glide.p144t.C2082k.C2083a.f7609a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.bumptech.glide.p144t.C2082k.C2083a.f7609a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.bumptech.glide.p144t.C2082k.C2083a.f7609a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGBA_F16     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.bumptech.glide.p144t.C2082k.C2083a.f7609a     // Catch:{ NoSuchFieldError -> 0x003e }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p144t.C2082k.C2083a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static void m9434a() {
        if (!m9449p()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    /* renamed from: b */
    public static boolean m9435b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj instanceof AbstractC1839l ? ((AbstractC1839l) obj).mo7437a(obj2) : obj.equals(obj2);
    }

    /* renamed from: c */
    public static boolean m9436c(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: d */
    private static String m9437d(byte[] bArr, char[] cArr) {
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            char[] cArr2 = f7607a;
            cArr[i3] = cArr2[i2 >>> 4];
            cArr[i3 + 1] = cArr2[i2 & 15];
        }
        return new String(cArr);
    }

    /* renamed from: e */
    public static <T> Queue<T> m9438e(int i) {
        return new ArrayDeque(i);
    }

    /* renamed from: f */
    public static int m9439f(int i, int i2, Bitmap.Config config) {
        return i * i2 * m9441h(config);
    }

    @TargetApi(19)
    /* renamed from: g */
    public static int m9440g(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            if (Build.VERSION.SDK_INT >= 19) {
                try {
                    return bitmap.getAllocationByteCount();
                } catch (NullPointerException unused) {
                }
            }
            return bitmap.getHeight() * bitmap.getRowBytes();
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    /* renamed from: h */
    private static int m9441h(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = C2083a.f7609a[config.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2 || i == 3) {
            return 2;
        }
        return i != 4 ? 4 : 8;
    }

    /* renamed from: i */
    public static <T> List<T> m9442i(Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T t : collection) {
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    public static int m9443j(float f) {
        return m9444k(f, 17);
    }

    /* renamed from: k */
    public static int m9444k(float f, int i) {
        return m9445l(Float.floatToIntBits(f), i);
    }

    /* renamed from: l */
    public static int m9445l(int i, int i2) {
        return (i2 * 31) + i;
    }

    /* renamed from: m */
    public static int m9446m(Object obj, int i) {
        return m9445l(obj == null ? 0 : obj.hashCode(), i);
    }

    /* renamed from: n */
    public static int m9447n(boolean z, int i) {
        return m9445l(z ? 1 : 0, i);
    }

    /* renamed from: o */
    public static boolean m9448o() {
        return !m9449p();
    }

    /* renamed from: p */
    public static boolean m9449p() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: q */
    private static boolean m9450q(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    /* renamed from: r */
    public static boolean m9451r(int i, int i2) {
        return m9450q(i) && m9450q(i2);
    }

    /* renamed from: s */
    public static String m9452s(byte[] bArr) {
        String d;
        char[] cArr = f7608b;
        synchronized (cArr) {
            d = m9437d(bArr, cArr);
        }
        return d;
    }
}
