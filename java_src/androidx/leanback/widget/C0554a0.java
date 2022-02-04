package androidx.leanback.widget;

/* access modifiers changed from: package-private */
/* renamed from: androidx.leanback.widget.a0 */
public class C0554a0 {

    /* renamed from: a */
    private int f2804a = 0;

    /* renamed from: b */
    public final C0555a f2805b;

    /* renamed from: c */
    public final C0555a f2806c;

    /* renamed from: d */
    private C0555a f2807d;

    /* renamed from: e */
    private C0555a f2808e;

    /* renamed from: androidx.leanback.widget.a0$a */
    public static class C0555a {

        /* renamed from: a */
        private int f2809a;

        /* renamed from: b */
        private int f2810b;

        /* renamed from: c */
        private int f2811c;

        /* renamed from: d */
        private int f2812d;

        /* renamed from: e */
        private int f2813e = 2;

        /* renamed from: f */
        private int f2814f = 3;

        /* renamed from: g */
        private int f2815g = 0;

        /* renamed from: h */
        private float f2816h = 50.0f;

        /* renamed from: i */
        private int f2817i;

        /* renamed from: j */
        private int f2818j;

        /* renamed from: k */
        private int f2819k;

        /* renamed from: l */
        private boolean f2820l;

        /* renamed from: m */
        private String f2821m;

        public C0555a(String str) {
            mo3307s();
            this.f2821m = str;
        }

        /* renamed from: A */
        public final void mo3287A(float f) {
            if ((f < 0.0f || f > 100.0f) && f != -1.0f) {
                throw new IllegalArgumentException();
            }
            this.f2816h = f;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0068, code lost:
            if (mo3306r() != false) goto L_0x006a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0089, code lost:
            if (mo3305q() != false) goto L_0x0098;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x0096, code lost:
            if (mo3306r() != false) goto L_0x0098;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x0098, code lost:
            r4.f2811c = java.lang.Math.max(r4.f2811c, mo3290b(r7, r6));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a4, code lost:
            r4.f2812d = java.lang.Math.min(r4.f2812d, r4.f2811c);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b7, code lost:
            if (mo3305q() != false) goto L_0x006a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
            return;
         */
        /* renamed from: B */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo3288B(int r5, int r6, int r7, int r8) {
            /*
            // Method dump skipped, instructions count: 187
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C0554a0.C0555a.mo3288B(int, int, int, int):void");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final int mo3289a() {
            if (!this.f2820l) {
                int i = this.f2815g;
                if (i < 0) {
                    i += this.f2817i;
                }
                float f = this.f2816h;
                return f != -1.0f ? i + ((int) ((((float) this.f2817i) * f) / 100.0f)) : i;
            }
            int i2 = this.f2815g;
            int i3 = i2 >= 0 ? this.f2817i - i2 : -i2;
            float f2 = this.f2816h;
            return f2 != -1.0f ? i3 - ((int) ((((float) this.f2817i) * f2) / 100.0f)) : i3;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final int mo3290b(int i, int i2) {
            return i - i2;
        }

        /* renamed from: c */
        public final int mo3291c() {
            return (this.f2817i - this.f2818j) - this.f2819k;
        }

        /* renamed from: d */
        public final int mo3292d() {
            return this.f2811c;
        }

        /* renamed from: e */
        public final int mo3293e() {
            return this.f2812d;
        }

        /* renamed from: f */
        public final int mo3294f() {
            return this.f2819k;
        }

        /* renamed from: g */
        public final int mo3295g() {
            return this.f2818j;
        }

        /* renamed from: h */
        public final int mo3296h(int i) {
            int i2;
            int i3;
            int i4 = mo3297i();
            int a = mo3289a();
            boolean p = mo3304p();
            boolean o = mo3303o();
            if (!p) {
                int i5 = this.f2818j;
                int i6 = a - i5;
                if (this.f2820l ? (this.f2814f & 2) != 0 : (this.f2814f & 1) != 0) {
                    int i7 = this.f2810b;
                    if (i - i7 <= i6) {
                        int i8 = i7 - i5;
                        return (o || i8 <= (i3 = this.f2811c)) ? i8 : i3;
                    }
                }
            }
            if (!o) {
                int i9 = this.f2819k;
                int i10 = (i4 - a) - i9;
                if (this.f2820l ? (this.f2814f & 1) != 0 : (this.f2814f & 2) != 0) {
                    int i11 = this.f2809a;
                    if (i11 - i <= i10) {
                        int i12 = i11 - (i4 - i9);
                        return (p || i12 >= (i2 = this.f2812d)) ? i12 : i2;
                    }
                }
            }
            return mo3290b(i, a);
        }

        /* renamed from: i */
        public final int mo3297i() {
            return this.f2817i;
        }

        /* renamed from: j */
        public final int mo3298j() {
            return this.f2814f;
        }

        /* renamed from: k */
        public final int mo3299k() {
            return this.f2815g;
        }

        /* renamed from: l */
        public final float mo3300l() {
            return this.f2816h;
        }

        /* renamed from: m */
        public final void mo3301m() {
            this.f2809a = Integer.MAX_VALUE;
            this.f2811c = Integer.MAX_VALUE;
        }

        /* renamed from: n */
        public final void mo3302n() {
            this.f2810b = Integer.MIN_VALUE;
            this.f2812d = Integer.MIN_VALUE;
        }

        /* renamed from: o */
        public final boolean mo3303o() {
            return this.f2809a == Integer.MAX_VALUE;
        }

        /* renamed from: p */
        public final boolean mo3304p() {
            return this.f2810b == Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public final boolean mo3305q() {
            return (this.f2813e & 2) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public final boolean mo3306r() {
            return (this.f2813e & 1) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public void mo3307s() {
            this.f2810b = Integer.MIN_VALUE;
            this.f2809a = Integer.MAX_VALUE;
        }

        /* renamed from: t */
        public final void mo3308t(int i, int i2) {
            this.f2818j = i;
            this.f2819k = i2;
        }

        public String toString() {
            return " min:" + this.f2810b + " " + this.f2812d + " max:" + this.f2809a + " " + this.f2811c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: u */
        public final void mo3310u(boolean z) {
            this.f2813e = z ? this.f2813e | 2 : this.f2813e & -3;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public final void mo3311v(boolean z) {
            this.f2813e = z ? this.f2813e | 1 : this.f2813e & -2;
        }

        /* renamed from: w */
        public final void mo3312w(boolean z) {
            this.f2820l = z;
        }

        /* renamed from: x */
        public final void mo3313x(int i) {
            this.f2817i = i;
        }

        /* renamed from: y */
        public final void mo3314y(int i) {
            this.f2814f = i;
        }

        /* renamed from: z */
        public final void mo3315z(int i) {
            this.f2815g = i;
        }
    }

    C0554a0() {
        C0555a aVar = new C0555a("vertical");
        this.f2805b = aVar;
        C0555a aVar2 = new C0555a("horizontal");
        this.f2806c = aVar2;
        this.f2807d = aVar2;
        this.f2808e = aVar;
    }

    /* renamed from: a */
    public final C0555a mo3282a() {
        return this.f2807d;
    }

    /* renamed from: b */
    public final void mo3283b() {
        mo3282a().mo3307s();
    }

    /* renamed from: c */
    public final C0555a mo3284c() {
        return this.f2808e;
    }

    /* renamed from: d */
    public final void mo3285d(int i) {
        C0555a aVar;
        this.f2804a = i;
        if (i == 0) {
            this.f2807d = this.f2806c;
            aVar = this.f2805b;
        } else {
            this.f2807d = this.f2805b;
            aVar = this.f2806c;
        }
        this.f2808e = aVar;
    }

    public String toString() {
        return "horizontal=" + this.f2806c + "; vertical=" + this.f2805b;
    }
}
