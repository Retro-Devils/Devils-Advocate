package p155e.p164b.p165a.p168u;

import java.lang.reflect.Array;
import p155e.p164b.p165a.p169v.AbstractC3415a;

/* access modifiers changed from: package-private */
/* renamed from: e.b.a.u.a */
public abstract class AbstractC3405a {

    /* renamed from: a */
    final int f11488a;

    /* renamed from: b */
    final int[] f11489b = new int[4];

    /* renamed from: c */
    final C3414c f11490c = new C3414c();

    /* renamed from: d */
    final short[][] f11491d = ((short[][]) Array.newInstance(short.class, 12, 16));

    /* renamed from: e */
    final short[] f11492e = new short[12];

    /* renamed from: f */
    final short[] f11493f = new short[12];

    /* renamed from: g */
    final short[] f11494g = new short[12];

    /* renamed from: h */
    final short[] f11495h = new short[12];

    /* renamed from: i */
    final short[][] f11496i = ((short[][]) Array.newInstance(short.class, 12, 16));

    /* renamed from: j */
    final short[][] f11497j = ((short[][]) Array.newInstance(short.class, 4, 64));

    /* renamed from: k */
    final short[][] f11498k = {new short[2], new short[2], new short[4], new short[4], new short[8], new short[8], new short[16], new short[16], new short[32], new short[32]};

    /* renamed from: l */
    final short[] f11499l = new short[16];

    /* access modifiers changed from: package-private */
    /* renamed from: e.b.a.u.a$a */
    public abstract class AbstractC3406a {

        /* renamed from: a */
        final short[] f11500a = new short[2];

        /* renamed from: b */
        final short[][] f11501b = ((short[][]) Array.newInstance(short.class, 16, 8));

        /* renamed from: c */
        final short[][] f11502c = ((short[][]) Array.newInstance(short.class, 16, 8));

        /* renamed from: d */
        final short[] f11503d = new short[256];

        AbstractC3406a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo11402a() {
            AbstractC3415a.m14106a(this.f11500a);
            int i = 0;
            while (true) {
                short[][] sArr = this.f11501b;
                if (i >= sArr.length) {
                    break;
                }
                AbstractC3415a.m14106a(sArr[i]);
                i++;
            }
            for (int i2 = 0; i2 < this.f11501b.length; i2++) {
                AbstractC3415a.m14106a(this.f11502c[i2]);
            }
            AbstractC3415a.m14106a(this.f11503d);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e.b.a.u.a$b */
    public abstract class AbstractC3407b {

        /* renamed from: a */
        private final int f11505a;

        /* renamed from: b */
        private final int f11506b;

        /* access modifiers changed from: package-private */
        /* renamed from: e.b.a.u.a$b$a */
        public abstract class AbstractC3408a {

            /* renamed from: a */
            final short[] f11508a = new short[768];

            AbstractC3408a() {
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo11404a() {
                AbstractC3415a.m14106a(this.f11508a);
            }
        }

        AbstractC3407b(int i, int i2) {
            this.f11505a = i;
            this.f11506b = (1 << i2) - 1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final int mo11403a(int i, int i2) {
            int i3 = this.f11505a;
            return (i >> (8 - i3)) + ((i2 & this.f11506b) << i3);
        }
    }

    AbstractC3405a(int i) {
        this.f11488a = (1 << i) - 1;
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
        int[] iArr = this.f11489b;
        int i = 0;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        this.f11490c.mo11413c();
        int i2 = 0;
        while (true) {
            short[][] sArr = this.f11491d;
            if (i2 >= sArr.length) {
                break;
            }
            AbstractC3415a.m14106a(sArr[i2]);
            i2++;
        }
        AbstractC3415a.m14106a(this.f11492e);
        AbstractC3415a.m14106a(this.f11493f);
        AbstractC3415a.m14106a(this.f11494g);
        AbstractC3415a.m14106a(this.f11495h);
        int i3 = 0;
        while (true) {
            short[][] sArr2 = this.f11496i;
            if (i3 >= sArr2.length) {
                break;
            }
            AbstractC3415a.m14106a(sArr2[i3]);
            i3++;
        }
        int i4 = 0;
        while (true) {
            short[][] sArr3 = this.f11497j;
            if (i4 >= sArr3.length) {
                break;
            }
            AbstractC3415a.m14106a(sArr3[i4]);
            i4++;
        }
        while (true) {
            short[][] sArr4 = this.f11498k;
            if (i < sArr4.length) {
                AbstractC3415a.m14106a(sArr4[i]);
                i++;
            } else {
                AbstractC3415a.m14106a(this.f11499l);
                return;
            }
        }
    }
}
