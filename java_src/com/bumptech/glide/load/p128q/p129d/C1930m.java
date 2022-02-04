package com.bumptech.glide.load.p128q.p129d;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.C1644h;
import com.bumptech.glide.load.C1647i;
import com.bumptech.glide.load.EnumC1631b;
import com.bumptech.glide.load.EnumC1648j;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.p120n.C1671m;
import com.bumptech.glide.load.p122o.AbstractC1794v;
import com.bumptech.glide.load.p122o.p123a0.AbstractC1690b;
import com.bumptech.glide.load.p122o.p123a0.AbstractC1695e;
import com.bumptech.glide.load.p128q.p129d.AbstractC1922l;
import com.bumptech.glide.load.p128q.p129d.AbstractC1939s;
import com.bumptech.glide.p144t.C2077f;
import com.bumptech.glide.p144t.C2081j;
import com.bumptech.glide.p144t.C2082k;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.q.d.m */
public final class C1930m {

    /* renamed from: a */
    public static final C1644h<EnumC1631b> f7212a = C1644h.m7873f("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", EnumC1631b.f6641d);

    /* renamed from: b */
    public static final C1644h<EnumC1648j> f7213b = C1644h.m7873f("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", EnumC1648j.SRGB);
    @Deprecated

    /* renamed from: c */
    public static final C1644h<AbstractC1922l> f7214c = AbstractC1922l.f7207h;

    /* renamed from: d */
    public static final C1644h<Boolean> f7215d;

    /* renamed from: e */
    public static final C1644h<Boolean> f7216e;

    /* renamed from: f */
    private static final Set<String> f7217f = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));

    /* renamed from: g */
    private static final AbstractC1932b f7218g = new C1931a();

    /* renamed from: h */
    private static final Set<ImageHeaderParser.ImageType> f7219h = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));

    /* renamed from: i */
    private static final Queue<BitmapFactory.Options> f7220i = C2082k.m9438e(0);

    /* renamed from: j */
    private final AbstractC1695e f7221j;

    /* renamed from: k */
    private final DisplayMetrics f7222k;

    /* renamed from: l */
    private final AbstractC1690b f7223l;

    /* renamed from: m */
    private final List<ImageHeaderParser> f7224m;

    /* renamed from: n */
    private final C1938r f7225n = C1938r.m8778a();

    /* renamed from: com.bumptech.glide.load.q.d.m$a */
    class C1931a implements AbstractC1932b {
        C1931a() {
        }

        @Override // com.bumptech.glide.load.p128q.p129d.C1930m.AbstractC1932b
        /* renamed from: a */
        public void mo7522a(AbstractC1695e eVar, Bitmap bitmap) {
        }

        @Override // com.bumptech.glide.load.p128q.p129d.C1930m.AbstractC1932b
        /* renamed from: b */
        public void mo7523b() {
        }
    }

    /* renamed from: com.bumptech.glide.load.q.d.m$b */
    public interface AbstractC1932b {
        /* renamed from: a */
        void mo7522a(AbstractC1695e eVar, Bitmap bitmap);

        /* renamed from: b */
        void mo7523b();
    }

    static {
        Boolean bool = Boolean.FALSE;
        f7215d = C1644h.m7873f("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f7216e = C1644h.m7873f("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
    }

    public C1930m(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, AbstractC1695e eVar, AbstractC1690b bVar) {
        this.f7224m = list;
        this.f7222k = (DisplayMetrics) C2081j.m9432d(displayMetrics);
        this.f7221j = (AbstractC1695e) C2081j.m9432d(eVar);
        this.f7223l = (AbstractC1690b) C2081j.m9432d(bVar);
    }

    /* renamed from: a */
    private static int m8736a(double d) {
        int l = m8744l(d);
        double d2 = (double) l;
        Double.isNaN(d2);
        int x = m8753x(d2 * d);
        double d3 = (double) (((float) x) / ((float) l));
        Double.isNaN(d3);
        double d4 = (double) x;
        Double.isNaN(d4);
        return m8753x((d / d3) * d4);
    }

    /* renamed from: b */
    private void m8737b(AbstractC1939s sVar, EnumC1631b bVar, boolean z, boolean z2, BitmapFactory.Options options, int i, int i2) {
        if (!this.f7225n.mo7526e(i, i2, options, z, z2)) {
            if (bVar == EnumC1631b.PREFER_ARGB_8888 || Build.VERSION.SDK_INT == 16) {
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                return;
            }
            boolean z3 = false;
            try {
                z3 = sVar.mo7528b().hasAlpha();
            } catch (IOException e) {
                if (Log.isLoggable("Downsampler", 3)) {
                    Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + bVar, e);
                }
            }
            Bitmap.Config config = z3 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
            options.inPreferredConfig = config;
            if (config == Bitmap.Config.RGB_565) {
                options.inDither = true;
            }
        }
    }

    /* renamed from: c */
    private static void m8738c(ImageHeaderParser.ImageType imageType, AbstractC1939s sVar, AbstractC1932b bVar, AbstractC1695e eVar, AbstractC1922l lVar, int i, int i2, int i3, int i4, int i5, BitmapFactory.Options options) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        if (i2 > 0 && i3 > 0) {
            if (m8747r(i)) {
                i6 = i2;
                i7 = i3;
            } else {
                i7 = i2;
                i6 = i3;
            }
            float b = lVar.mo7515b(i7, i6, i4, i5);
            if (b > 0.0f) {
                AbstractC1922l.EnumC1929g a = lVar.mo7514a(i7, i6, i4, i5);
                if (a != null) {
                    float f = (float) i7;
                    float f2 = (float) i6;
                    int x = i7 / m8753x((double) (b * f));
                    int x2 = i6 / m8753x((double) (b * f2));
                    AbstractC1922l.EnumC1929g gVar = AbstractC1922l.EnumC1929g.MEMORY;
                    int max = a == gVar ? Math.max(x, x2) : Math.min(x, x2);
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 > 23 || !f7217f.contains(options.outMimeType)) {
                        int max2 = Math.max(1, Integer.highestOneBit(max));
                        if (a == gVar && ((float) max2) < 1.0f / b) {
                            max2 <<= 1;
                        }
                        i8 = max2;
                    } else {
                        i8 = 1;
                    }
                    options.inSampleSize = i8;
                    if (imageType == ImageHeaderParser.ImageType.JPEG) {
                        float min = (float) Math.min(i8, 8);
                        i9 = (int) Math.ceil((double) (f / min));
                        i10 = (int) Math.ceil((double) (f2 / min));
                        int i12 = i8 / 8;
                        if (i12 > 0) {
                            i9 /= i12;
                            i10 /= i12;
                        }
                    } else {
                        if (!(imageType == ImageHeaderParser.ImageType.PNG || imageType == ImageHeaderParser.ImageType.PNG_A)) {
                            if (imageType == ImageHeaderParser.ImageType.WEBP || imageType == ImageHeaderParser.ImageType.WEBP_A) {
                                if (i11 >= 24) {
                                    float f3 = (float) i8;
                                    i9 = Math.round(f / f3);
                                    i10 = Math.round(f2 / f3);
                                }
                            } else if (i7 % i8 == 0 && i6 % i8 == 0) {
                                i9 = i7 / i8;
                                i10 = i6 / i8;
                            } else {
                                int[] m = m8745m(sVar, options, bVar, eVar);
                                i9 = m[0];
                                i10 = m[1];
                            }
                        }
                        float f4 = (float) i8;
                        i9 = (int) Math.floor((double) (f / f4));
                        i10 = (int) Math.floor((double) (f2 / f4));
                    }
                    double b2 = (double) lVar.mo7515b(i9, i10, i4, i5);
                    if (i11 >= 19) {
                        options.inTargetDensity = m8736a(b2);
                        options.inDensity = m8744l(b2);
                    }
                    if (m8748s(options)) {
                        options.inScaled = true;
                    } else {
                        options.inTargetDensity = 0;
                        options.inDensity = 0;
                    }
                    if (Log.isLoggable("Downsampler", 2)) {
                        Log.v("Downsampler", "Calculate scaling, source: [" + i2 + "x" + i3 + "], degreesToRotate: " + i + ", target: [" + i4 + "x" + i5 + "], power of two scaled: [" + i9 + "x" + i10 + "], exact scale factor: " + b + ", power of 2 sample size: " + i8 + ", adjusted scale factor: " + b2 + ", target density: " + options.inTargetDensity + ", density: " + options.inDensity);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Cannot round with null rounding");
            }
            throw new IllegalArgumentException("Cannot scale with factor: " + b + " from: " + lVar + ", source: [" + i2 + "x" + i3 + "], target: [" + i4 + "x" + i5 + "]");
        } else if (Log.isLoggable("Downsampler", 3)) {
            Log.d("Downsampler", "Unable to determine dimensions for: " + imageType + " with target [" + i4 + "x" + i5 + "]");
        }
    }

    /* renamed from: e */
    private AbstractC1794v<Bitmap> m8739e(AbstractC1939s sVar, int i, int i2, C1647i iVar, AbstractC1932b bVar) {
        byte[] bArr = (byte[]) this.f7223l.mo7162e(65536, byte[].class);
        BitmapFactory.Options k = m8743k();
        k.inTempStorage = bArr;
        EnumC1631b bVar2 = (EnumC1631b) iVar.mo7084c(f7212a);
        EnumC1648j jVar = (EnumC1648j) iVar.mo7084c(f7213b);
        AbstractC1922l lVar = (AbstractC1922l) iVar.mo7084c(AbstractC1922l.f7207h);
        boolean booleanValue = ((Boolean) iVar.mo7084c(f7215d)).booleanValue();
        C1644h<Boolean> hVar = f7216e;
        try {
            return C1910e.m8673g(m8740h(sVar, k, lVar, bVar2, jVar, iVar.mo7084c(hVar) != null && ((Boolean) iVar.mo7084c(hVar)).booleanValue(), i, i2, booleanValue, bVar), this.f7221j);
        } finally {
            m8751v(k);
            this.f7223l.mo7161d(bArr);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x016f, code lost:
        if (r0 >= 26) goto L_0x0171;
     */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01a0  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Bitmap m8740h(com.bumptech.glide.load.p128q.p129d.AbstractC1939s r28, android.graphics.BitmapFactory.Options r29, com.bumptech.glide.load.p128q.p129d.AbstractC1922l r30, com.bumptech.glide.load.EnumC1631b r31, com.bumptech.glide.load.EnumC1648j r32, boolean r33, int r34, int r35, boolean r36, com.bumptech.glide.load.p128q.p129d.C1930m.AbstractC1932b r37) {
        /*
        // Method dump skipped, instructions count: 441
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p128q.p129d.C1930m.m8740h(com.bumptech.glide.load.q.d.s, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.q.d.l, com.bumptech.glide.load.b, com.bumptech.glide.load.j, boolean, int, int, boolean, com.bumptech.glide.load.q.d.m$b):android.graphics.Bitmap");
    }

    /* renamed from: i */
    private static Bitmap m8741i(AbstractC1939s sVar, BitmapFactory.Options options, AbstractC1932b bVar, AbstractC1695e eVar) {
        if (!options.inJustDecodeBounds) {
            bVar.mo7523b();
            sVar.mo7529c();
        }
        int i = options.outWidth;
        int i2 = options.outHeight;
        String str = options.outMimeType;
        C1950z.m8829f().lock();
        try {
            return sVar.mo7527a(options);
        } catch (IllegalArgumentException e) {
            IOException u = m8750u(e, i, i2, str, options);
            if (Log.isLoggable("Downsampler", 3)) {
                Log.d("Downsampler", "Failed to decode with inBitmap, trying again without Bitmap re-use", u);
            }
            Bitmap bitmap = options.inBitmap;
            if (bitmap != null) {
                try {
                    eVar.mo7183d(bitmap);
                    options.inBitmap = null;
                    return m8741i(sVar, options, bVar, eVar);
                } catch (IOException unused) {
                    throw u;
                }
            } else {
                throw u;
            }
        } finally {
            C1950z.m8829f().unlock();
        }
    }

    @TargetApi(19)
    /* renamed from: j */
    private static String m8742j(Bitmap bitmap) {
        String str;
        if (bitmap == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            str = " (" + bitmap.getAllocationByteCount() + ")";
        } else {
            str = "";
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + str;
    }

    /* renamed from: k */
    private static synchronized BitmapFactory.Options m8743k() {
        BitmapFactory.Options poll;
        synchronized (C1930m.class) {
            Queue<BitmapFactory.Options> queue = f7220i;
            synchronized (queue) {
                poll = queue.poll();
            }
            if (poll == null) {
                poll = new BitmapFactory.Options();
                m8752w(poll);
            }
        }
        return poll;
    }

    /* renamed from: l */
    private static int m8744l(double d) {
        if (d > 1.0d) {
            d = 1.0d / d;
        }
        return (int) Math.round(d * 2.147483647E9d);
    }

    /* renamed from: m */
    private static int[] m8745m(AbstractC1939s sVar, BitmapFactory.Options options, AbstractC1932b bVar, AbstractC1695e eVar) {
        options.inJustDecodeBounds = true;
        m8741i(sVar, options, bVar, eVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* renamed from: n */
    private static String m8746n(BitmapFactory.Options options) {
        return m8742j(options.inBitmap);
    }

    /* renamed from: r */
    private static boolean m8747r(int i) {
        return i == 90 || i == 270;
    }

    /* renamed from: s */
    private static boolean m8748s(BitmapFactory.Options options) {
        int i;
        int i2 = options.inTargetDensity;
        return i2 > 0 && (i = options.inDensity) > 0 && i2 != i;
    }

    /* renamed from: t */
    private static void m8749t(int i, int i2, String str, BitmapFactory.Options options, Bitmap bitmap, int i3, int i4, long j) {
        Log.v("Downsampler", "Decoded " + m8742j(bitmap) + " from [" + i + "x" + i2 + "] " + str + " with inBitmap " + m8746n(options) + " for [" + i3 + "x" + i4 + "], sample size: " + options.inSampleSize + ", density: " + options.inDensity + ", target density: " + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + C2077f.m9415a(j));
    }

    /* renamed from: u */
    private static IOException m8750u(IllegalArgumentException illegalArgumentException, int i, int i2, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i + ", outHeight: " + i2 + ", outMimeType: " + str + ", inBitmap: " + m8746n(options), illegalArgumentException);
    }

    /* renamed from: v */
    private static void m8751v(BitmapFactory.Options options) {
        m8752w(options);
        Queue<BitmapFactory.Options> queue = f7220i;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    /* renamed from: w */
    private static void m8752w(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    /* renamed from: x */
    private static int m8753x(double d) {
        return (int) (d + 0.5d);
    }

    @TargetApi(26)
    /* renamed from: y */
    private static void m8754y(BitmapFactory.Options options, AbstractC1695e eVar, int i, int i2) {
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT < 26) {
            config = null;
        } else if (options.inPreferredConfig != Bitmap.Config.HARDWARE) {
            config = options.outConfig;
        } else {
            return;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = eVar.mo7184e(i, i2, config);
    }

    /* renamed from: z */
    private boolean m8755z(ImageHeaderParser.ImageType imageType) {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return f7219h.contains(imageType);
    }

    /* renamed from: d */
    public AbstractC1794v<Bitmap> mo7516d(ParcelFileDescriptor parcelFileDescriptor, int i, int i2, C1647i iVar) {
        return m8739e(new AbstractC1939s.C1941b(parcelFileDescriptor, this.f7224m, this.f7223l), i, i2, iVar, f7218g);
    }

    /* renamed from: f */
    public AbstractC1794v<Bitmap> mo7517f(InputStream inputStream, int i, int i2, C1647i iVar) {
        return mo7518g(inputStream, i, i2, iVar, f7218g);
    }

    /* renamed from: g */
    public AbstractC1794v<Bitmap> mo7518g(InputStream inputStream, int i, int i2, C1647i iVar, AbstractC1932b bVar) {
        return m8739e(new AbstractC1939s.C1940a(inputStream, this.f7224m, this.f7223l), i, i2, iVar, bVar);
    }

    /* renamed from: o */
    public boolean mo7519o(ParcelFileDescriptor parcelFileDescriptor) {
        return C1671m.m7948c();
    }

    /* renamed from: p */
    public boolean mo7520p(InputStream inputStream) {
        return true;
    }

    /* renamed from: q */
    public boolean mo7521q(ByteBuffer byteBuffer) {
        return true;
    }
}
