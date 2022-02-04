package p155e.p164b.p165a.p168u;

import p155e.p164b.p165a.p167t.C3404a;
import p155e.p164b.p165a.p168u.AbstractC3405a;
import p155e.p164b.p165a.p169v.AbstractC3416b;

/* renamed from: e.b.a.u.b */
public final class C3409b extends AbstractC3405a {

    /* renamed from: m */
    private final C3404a f11510m;

    /* renamed from: n */
    private final AbstractC3416b f11511n;

    /* renamed from: o */
    private final C3412c f11512o;

    /* renamed from: p */
    private final C3411b f11513p = new C3411b();

    /* renamed from: q */
    private final C3411b f11514q = new C3411b();

    /* access modifiers changed from: private */
    /* renamed from: e.b.a.u.b$b */
    public class C3411b extends AbstractC3405a.AbstractC3406a {
        private C3411b() {
            super();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo11407b(int i) {
            return C3409b.this.f11511n.mo11418b(this.f11500a, 0) == 0 ? C3409b.this.f11511n.mo11419c(this.f11501b[i]) + 2 : C3409b.this.f11511n.mo11418b(this.f11500a, 1) == 0 ? C3409b.this.f11511n.mo11419c(this.f11502c[i]) + 2 + 8 : C3409b.this.f11511n.mo11419c(this.f11503d) + 2 + 8 + 8;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e.b.a.u.b$c */
    public class C3412c extends AbstractC3405a.AbstractC3407b {

        /* renamed from: d */
        private final C3413a[] f11516d;

        /* access modifiers changed from: private */
        /* renamed from: e.b.a.u.b$c$a */
        public class C3413a extends AbstractC3405a.AbstractC3407b.AbstractC3408a {
            private C3413a() {
                super();
            }

            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public void mo11410b() {
                int i = 1;
                if (C3409b.this.f11490c.mo11412b()) {
                    do {
                        i = C3409b.this.f11511n.mo11418b(this.f11508a, i) | (i << 1);
                    } while (i < 256);
                } else {
                    int c = C3409b.this.f11510m.mo11391c(C3409b.this.f11489b[0]);
                    int i2 = 256;
                    int i3 = 1;
                    do {
                        c <<= 1;
                        int i4 = c & i2;
                        int b = C3409b.this.f11511n.mo11418b(this.f11508a, i2 + i4 + i3);
                        i3 = (i3 << 1) | b;
                        i2 &= (i4 ^ -1) ^ (0 - b);
                    } while (i3 < 256);
                    i = i3;
                }
                C3409b.this.f11510m.mo11396h((byte) i);
                C3409b.this.f11490c.mo11414d();
            }
        }

        C3412c(int i, int i2) {
            super(i, i2);
            this.f11516d = new C3413a[(1 << (i + i2))];
            int i3 = 0;
            while (true) {
                C3413a[] aVarArr = this.f11516d;
                if (i3 < aVarArr.length) {
                    aVarArr[i3] = new C3413a();
                    i3++;
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo11408b() {
            this.f11516d[mo11403a(C3409b.this.f11510m.mo11391c(0), C3409b.this.f11510m.mo11392d())].mo11410b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo11409c() {
            int i = 0;
            while (true) {
                C3413a[] aVarArr = this.f11516d;
                if (i < aVarArr.length) {
                    aVarArr[i].mo11404a();
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public C3409b(C3404a aVar, AbstractC3416b bVar, int i, int i2, int i3) {
        super(i3);
        this.f11510m = aVar;
        this.f11511n = bVar;
        this.f11512o = new C3412c(i, i2);
        mo11401b();
    }

    /* renamed from: f */
    private int m14090f(int i) {
        this.f11490c.mo11416f();
        int[] iArr = this.f11489b;
        iArr[3] = iArr[2];
        iArr[2] = iArr[1];
        iArr[1] = iArr[0];
        int b = this.f11513p.mo11407b(i);
        int c = this.f11511n.mo11419c(this.f11497j[AbstractC3405a.m14083a(b)]);
        if (c < 4) {
            this.f11489b[0] = c;
        } else {
            int i2 = (c >> 1) - 1;
            int[] iArr2 = this.f11489b;
            iArr2[0] = (2 | (c & 1)) << i2;
            if (c < 14) {
                iArr2[0] = this.f11511n.mo11421e(this.f11498k[c - 4]) | iArr2[0];
            } else {
                iArr2[0] = iArr2[0] | (this.f11511n.mo11420d(i2 - 4) << 4);
                int[] iArr3 = this.f11489b;
                iArr3[0] = iArr3[0] | this.f11511n.mo11421e(this.f11499l);
            }
        }
        return b;
    }

    /* renamed from: g */
    private int m14091g(int i) {
        int i2;
        if (this.f11511n.mo11418b(this.f11493f, this.f11490c.mo11411a()) != 0) {
            if (this.f11511n.mo11418b(this.f11494g, this.f11490c.mo11411a()) == 0) {
                i2 = this.f11489b[1];
            } else {
                if (this.f11511n.mo11418b(this.f11495h, this.f11490c.mo11411a()) == 0) {
                    i2 = this.f11489b[2];
                } else {
                    int[] iArr = this.f11489b;
                    int i3 = iArr[3];
                    iArr[3] = iArr[2];
                    i2 = i3;
                }
                int[] iArr2 = this.f11489b;
                iArr2[2] = iArr2[1];
            }
            int[] iArr3 = this.f11489b;
            iArr3[1] = iArr3[0];
            iArr3[0] = i2;
        } else if (this.f11511n.mo11418b(this.f11496i[this.f11490c.mo11411a()], i) == 0) {
            this.f11490c.mo11417g();
            return 1;
        }
        this.f11490c.mo11415e();
        return this.f11514q.mo11407b(i);
    }

    @Override // p155e.p164b.p165a.p168u.AbstractC3405a
    /* renamed from: b */
    public void mo11401b() {
        super.mo11401b();
        this.f11512o.mo11409c();
        this.f11513p.mo11402a();
        this.f11514q.mo11402a();
    }

    /* renamed from: e */
    public void mo11405e() {
        this.f11510m.mo11398j();
        while (this.f11510m.mo11394f()) {
            int d = this.f11510m.mo11392d() & this.f11488a;
            if (this.f11511n.mo11418b(this.f11491d[this.f11490c.mo11411a()], d) == 0) {
                this.f11512o.mo11408b();
            } else {
                this.f11510m.mo11397i(this.f11489b[0], this.f11511n.mo11418b(this.f11492e, this.f11490c.mo11411a()) == 0 ? m14090f(d) : m14091g(d));
            }
        }
        this.f11511n.mo11422f();
    }

    /* renamed from: h */
    public boolean mo11406h() {
        return this.f11489b[0] == -1;
    }
}
