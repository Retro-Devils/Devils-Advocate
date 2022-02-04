package p155e.p164b.p165a.p168u;

import java.lang.reflect.Array;
import p155e.p164b.p165a.p169v.AbstractC3415a;

/* access modifiers changed from: package-private */
/* renamed from: e.b.a.u.a */
public abstract class AbstractC3405a {

    /* renamed from: a */
    final int f11479a;

    /* renamed from: b */
    final int[] f11480b = new int[4];

    /* renamed from: c */
    final C3414c f11481c = new C3414c();

    /* renamed from: d */
    final short[][] f11482d = ((short[][]) Array.newInstance(short.class, 12, 16));

    /* renamed from: e */
    final short[] f11483e = new short[12];

    /* renamed from: f */
    final short[] f11484f = new short[12];

    /* renamed from: g */
    final short[] f11485g = new short[12];

    /* renamed from: h */
    final short[] f11486h = new short[12];

    /* renamed from: i */
    final short[][] f11487i = ((short[][]) Array.newInstance(short.class, 12, 16));

    /* renamed from: j */
    final short[][] f11488j = ((short[][]) Array.newInstance(short.class, 4, 64));

    /* renamed from: k */
    final short[][] f11489k = {new short[2], new short[2], new short[4], new short[4], new short[8], new short[8], new short[16], new short[16], new short[32], new short[32]};

    /* renamed from: l */
    final short[] f11490l = new short[16];

    /* access modifiers changed from: package-private */
    /* renamed from: e.b.a.u.a$a */
    public abstract class AbstractC3406a {

        /* renamed from: a */
        final short[] f11491a = new short[2];

        /* renamed from: b */
        final short[][] f11492b = ((short[][]) Array.newInstance(short.class, 16, 8));

        /* renamed from: c */
        final short[][] f11493c = ((short[][]) Array.newInstance(short.class, 16, 8));

        /* renamed from: d */
        final short[] f11494d = new short[256];

        AbstractC3406a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo11402a() {
            AbstractC3415a.m14106a(this.f11491a);
            int i = 0;
            while (true) {
                short[][] sArr = this.f11492b;
                if (i >= sArr.length) {
                    break;
                }
                AbstractC3415a.m14106a(sArr[i]);
                i++;
            }
            for (int i2 = 0; i2 < this.f11492b.length; i2++) {
                AbstractC3415a.m14106a(this.f11493c[i2]);
            }
            AbstractC3415a.m14106a(this.f11494d);
        }
    }

    /* renamed from: e.b.a.u.a$b */
    abstract class AbstractC3407b {

        /* renamed from: a */
        private final int f11496a;

        /* renamed from: b */
        private final int f11497b;

        /* renamed from: e.b.a.u.a$b$a */
        abstract class AbstractC3408a {

            /* renamed from: a */
            final short[] f11499a = new short[768];

            AbstractC3408a() {
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo11404a() {
                AbstractC3415a.m14106a(this.f11499a);
            }
        }

        AbstractC3407b(int i, int i2) {
            this.f11496a = i;
            this.f11497b = (1 << i2) - 1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final int mo11403a(int i, int i2) {
            int i3 = this.f11496a;
            return (i >> (8 - i3)) + ((i2 & this.f11497b) << i3);
        }
    }

    AbstractC3405a(int i) {
        this.f11479a = (1 << i) - 1;
    }

    /* renamed from: a */
    static final int m14083a(int i) {
        if (i < 6) {
            return i - 2;
        }
        return 3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo11401b() {
        int[] iArr = this.f11480b;
        int i = 0;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        this.f11481c.mo11413c();
        int i2 = 0;
        while (true) {
            short[][] sArr = this.f11482d;
            if (i2 >= sArr.length) {
                break;
            }
            AbstractC3415a.m14106a(sArr[i2]);
            i2++;
        }
        AbstractC3415a.m14106a(this.f11483e);
        AbstractC3415a.m14106a(this.f11484f);
        AbstractC3415a.m14106a(this.f11485g);
        AbstractC3415a.m14106a(this.f11486h);
        int i3 = 0;
        while (true) {
            short[][] sArr2 = this.f11487i;
            if (i3 >= sArr2.length) {
                break;
            }
            AbstractC3415a.m14106a(sArr2[i3]);
            i3++;
        }
        int i4 = 0;
        while (true) {
            short[][] sArr3 = this.f11488j;
            if (i4 >= sArr3.length) {
                break;
            }
            AbstractC3415a.m14106a(sArr3[i4]);
            i4++;
        }
        while (true) {
            short[][] sArr4 = this.f11489k;
            if (i < sArr4.length) {
                AbstractC3415a.m14106a(sArr4[i]);
                i++;
            } else {
                AbstractC3415a.m14106a(this.f11490l);
                return;
            }
        }
    }
}
