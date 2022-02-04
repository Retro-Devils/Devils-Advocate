package com.bumptech.glide.load.p128q.p129d;

import android.os.Build;
import com.bumptech.glide.load.C1644h;

/* renamed from: com.bumptech.glide.load.q.d.l */
public abstract class AbstractC1922l {

    /* renamed from: a */
    public static final AbstractC1922l f7192a = new C1923a();

    /* renamed from: b */
    public static final AbstractC1922l f7193b = new C1924b();

    /* renamed from: c */
    public static final AbstractC1922l f7194c = new C1927e();

    /* renamed from: d */
    public static final AbstractC1922l f7195d = new C1925c();

    /* renamed from: e */
    public static final AbstractC1922l f7196e;

    /* renamed from: f */
    public static final AbstractC1922l f7197f = new C1928f();

    /* renamed from: g */
    public static final AbstractC1922l f7198g;

    /* renamed from: h */
    public static final C1644h<AbstractC1922l> f7199h;

    /* renamed from: i */
    static final boolean f7200i = (Build.VERSION.SDK_INT >= 19);

    /* renamed from: com.bumptech.glide.load.q.d.l$a */
    private static class C1923a extends AbstractC1922l {
        C1923a() {
        }

        @Override // com.bumptech.glide.load.p128q.p129d.AbstractC1922l
        /* renamed from: a */
        public EnumC1929g mo7514a(int i, int i2, int i3, int i4) {
            return EnumC1929g.QUALITY;
        }

        @Override // com.bumptech.glide.load.p128q.p129d.AbstractC1922l
        /* renamed from: b */
        public float mo7515b(int i, int i2, int i3, int i4) {
            int min = Math.min(i2 / i4, i / i3);
            if (min == 0) {
                return 1.0f;
            }
            return 1.0f / ((float) Integer.highestOneBit(min));
        }
    }

    /* renamed from: com.bumptech.glide.load.q.d.l$b */
    private static class C1924b extends AbstractC1922l {
        C1924b() {
        }

        @Override // com.bumptech.glide.load.p128q.p129d.AbstractC1922l
        /* renamed from: a */
        public EnumC1929g mo7514a(int i, int i2, int i3, int i4) {
            return EnumC1929g.MEMORY;
        }

        @Override // com.bumptech.glide.load.p128q.p129d.AbstractC1922l
        /* renamed from: b */
        public float mo7515b(int i, int i2, int i3, int i4) {
            int ceil = (int) Math.ceil((double) Math.max(((float) i2) / ((float) i4), ((float) i) / ((float) i3)));
            int i5 = 1;
            int max = Math.max(1, Integer.highestOneBit(ceil));
            if (max >= ceil) {
                i5 = 0;
            }
            return 1.0f / ((float) (max << i5));
        }
    }

    /* renamed from: com.bumptech.glide.load.q.d.l$c */
    private static class C1925c extends AbstractC1922l {
        C1925c() {
        }

        @Override // com.bumptech.glide.load.p128q.p129d.AbstractC1922l
        /* renamed from: a */
        public EnumC1929g mo7514a(int i, int i2, int i3, int i4) {
            return mo7515b(i, i2, i3, i4) == 1.0f ? EnumC1929g.QUALITY : AbstractC1922l.f7194c.mo7514a(i, i2, i3, i4);
        }

        @Override // com.bumptech.glide.load.p128q.p129d.AbstractC1922l
        /* renamed from: b */
        public float mo7515b(int i, int i2, int i3, int i4) {
            return Math.min(1.0f, AbstractC1922l.f7194c.mo7515b(i, i2, i3, i4));
        }
    }

    /* renamed from: com.bumptech.glide.load.q.d.l$d */
    private static class C1926d extends AbstractC1922l {
        C1926d() {
        }

        @Override // com.bumptech.glide.load.p128q.p129d.AbstractC1922l
        /* renamed from: a */
        public EnumC1929g mo7514a(int i, int i2, int i3, int i4) {
            return EnumC1929g.QUALITY;
        }

        @Override // com.bumptech.glide.load.p128q.p129d.AbstractC1922l
        /* renamed from: b */
        public float mo7515b(int i, int i2, int i3, int i4) {
            return Math.max(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
        }
    }

    /* renamed from: com.bumptech.glide.load.q.d.l$e */
    private static class C1927e extends AbstractC1922l {
        C1927e() {
        }

        @Override // com.bumptech.glide.load.p128q.p129d.AbstractC1922l
        /* renamed from: a */
        public EnumC1929g mo7514a(int i, int i2, int i3, int i4) {
            return AbstractC1922l.f7200i ? EnumC1929g.QUALITY : EnumC1929g.MEMORY;
        }

        @Override // com.bumptech.glide.load.p128q.p129d.AbstractC1922l
        /* renamed from: b */
        public float mo7515b(int i, int i2, int i3, int i4) {
            if (AbstractC1922l.f7200i) {
                return Math.min(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
            }
            int max = Math.max(i2 / i4, i / i3);
            if (max == 0) {
                return 1.0f;
            }
            return 1.0f / ((float) Integer.highestOneBit(max));
        }
    }

    /* renamed from: com.bumptech.glide.load.q.d.l$f */
    private static class C1928f extends AbstractC1922l {
        C1928f() {
        }

        @Override // com.bumptech.glide.load.p128q.p129d.AbstractC1922l
        /* renamed from: a */
        public EnumC1929g mo7514a(int i, int i2, int i3, int i4) {
            return EnumC1929g.QUALITY;
        }

        @Override // com.bumptech.glide.load.p128q.p129d.AbstractC1922l
        /* renamed from: b */
        public float mo7515b(int i, int i2, int i3, int i4) {
            return 1.0f;
        }
    }

    /* renamed from: com.bumptech.glide.load.q.d.l$g */
    public enum EnumC1929g {
        MEMORY,
        QUALITY
    }

    static {
        C1926d dVar = new C1926d();
        f7196e = dVar;
        f7198g = dVar;
        f7199h = C1644h.m7873f("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", dVar);
    }

    /* renamed from: a */
    public abstract EnumC1929g mo7514a(int i, int i2, int i3, int i4);

    /* renamed from: b */
    public abstract float mo7515b(int i, int i2, int i3, int i4);
}
