package p006b.p022e.p026b.p027k.p028m;

import p006b.p022e.p026b.p027k.C0861d;
import p006b.p022e.p026b.p027k.C0864e;

/* renamed from: b.e.b.k.m.m */
public abstract class AbstractC0892m implements AbstractC0880d {

    /* renamed from: a */
    public int f4457a;

    /* renamed from: b */
    C0864e f4458b;

    /* renamed from: c */
    C0889k f4459c;

    /* renamed from: d */
    protected C0864e.EnumC0866b f4460d;

    /* renamed from: e */
    C0884g f4461e = new C0884g(this);

    /* renamed from: f */
    public int f4462f = 0;

    /* renamed from: g */
    boolean f4463g = false;

    /* renamed from: h */
    public C0882f f4464h = new C0882f(this);

    /* renamed from: i */
    public C0882f f4465i = new C0882f(this);

    /* renamed from: j */
    protected EnumC0894b f4466j = EnumC0894b.NONE;

    /* access modifiers changed from: package-private */
    /* renamed from: b.e.b.k.m.m$a */
    public static /* synthetic */ class C0893a {

        /* renamed from: a */
        static final /* synthetic */ int[] f4467a;

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
                b.e.b.k.d$b[] r0 = p006b.p022e.p026b.p027k.C0861d.EnumC0863b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                p006b.p022e.p026b.p027k.p028m.AbstractC0892m.C0893a.f4467a = r0
                b.e.b.k.d$b r1 = p006b.p022e.p026b.p027k.C0861d.EnumC0863b.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = p006b.p022e.p026b.p027k.p028m.AbstractC0892m.C0893a.f4467a     // Catch:{ NoSuchFieldError -> 0x001d }
                b.e.b.k.d$b r1 = p006b.p022e.p026b.p027k.C0861d.EnumC0863b.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = p006b.p022e.p026b.p027k.p028m.AbstractC0892m.C0893a.f4467a     // Catch:{ NoSuchFieldError -> 0x0028 }
                b.e.b.k.d$b r1 = p006b.p022e.p026b.p027k.C0861d.EnumC0863b.TOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = p006b.p022e.p026b.p027k.p028m.AbstractC0892m.C0893a.f4467a     // Catch:{ NoSuchFieldError -> 0x0033 }
                b.e.b.k.d$b r1 = p006b.p022e.p026b.p027k.C0861d.EnumC0863b.BASELINE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = p006b.p022e.p026b.p027k.p028m.AbstractC0892m.C0893a.f4467a     // Catch:{ NoSuchFieldError -> 0x003e }
                b.e.b.k.d$b r1 = p006b.p022e.p026b.p027k.C0861d.EnumC0863b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p006b.p022e.p026b.p027k.p028m.AbstractC0892m.C0893a.<clinit>():void");
        }
    }

    /* renamed from: b.e.b.k.m.m$b */
    enum EnumC0894b {
        NONE,
        START,
        END,
        CENTER
    }

    public AbstractC0892m(C0864e eVar) {
        this.f4458b = eVar;
    }

    /* renamed from: l */
    private void m5277l(int i, int i2) {
        int i3;
        C0884g gVar;
        int i4 = this.f4457a;
        if (i4 != 0) {
            if (i4 == 1) {
                int g = mo5293g(this.f4461e.f4443m, i);
                gVar = this.f4461e;
                i3 = Math.min(g, i2);
                gVar.mo5283d(i3);
            } else if (i4 == 2) {
                C0864e E = this.f4458b.mo5158E();
                if (E != null) {
                    C0884g gVar2 = (i == 0 ? E.f4305f : E.f4307g).f4461e;
                    if (gVar2.f4431j) {
                        C0864e eVar = this.f4458b;
                        i2 = (int) ((((float) gVar2.f4428g) * (i == 0 ? eVar.f4329r : eVar.f4335u)) + 0.5f);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else if (i4 == 3) {
                C0864e eVar2 = this.f4458b;
                AbstractC0892m mVar = eVar2.f4305f;
                C0864e.EnumC0866b bVar = mVar.f4460d;
                C0864e.EnumC0866b bVar2 = C0864e.EnumC0866b.MATCH_CONSTRAINT;
                if (bVar == bVar2 && mVar.f4457a == 3) {
                    C0890l lVar = eVar2.f4307g;
                    if (lVar.f4460d == bVar2 && lVar.f4457a == 3) {
                        return;
                    }
                }
                if (i == 0) {
                    mVar = eVar2.f4307g;
                }
                if (mVar.f4461e.f4431j) {
                    float r = eVar2.mo5209r();
                    this.f4461e.mo5283d(i == 1 ? (int) ((((float) mVar.f4461e.f4428g) / r) + 0.5f) : (int) ((r * ((float) mVar.f4461e.f4428g)) + 0.5f));
                    return;
                }
                return;
            } else {
                return;
            }
        }
        gVar = this.f4461e;
        i3 = mo5293g(i2, i);
        gVar.mo5283d(i3);
    }

    @Override // p006b.p022e.p026b.p027k.p028m.AbstractC0880d
    /* renamed from: a */
    public void mo5265a(AbstractC0880d dVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo5291b(C0882f fVar, C0882f fVar2, int i) {
        fVar.f4433l.add(fVar2);
        fVar.f4427f = i;
        fVar2.f4432k.add(fVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo5292c(C0882f fVar, C0882f fVar2, int i, C0884g gVar) {
        fVar.f4433l.add(fVar2);
        fVar.f4433l.add(this.f4461e);
        fVar.f4429h = i;
        fVar.f4430i = gVar;
        fVar2.f4432k.add(fVar);
        gVar.f4432k.add(fVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract void mo5266d();

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract void mo5267e();

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract void mo5268f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final int mo5293g(int i, int i2) {
        int i3;
        if (i2 == 0) {
            C0864e eVar = this.f4458b;
            int i4 = eVar.f4327q;
            i3 = Math.max(eVar.f4325p, i);
            if (i4 > 0) {
                i3 = Math.min(i4, i);
            }
            if (i3 == i) {
                return i;
            }
        } else {
            C0864e eVar2 = this.f4458b;
            int i5 = eVar2.f4333t;
            i3 = Math.max(eVar2.f4331s, i);
            if (i5 > 0) {
                i3 = Math.min(i5, i);
            }
            if (i3 == i) {
                return i;
            }
        }
        return i3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C0882f mo5294h(C0861d dVar) {
        AbstractC0892m mVar;
        AbstractC0892m mVar2;
        C0861d dVar2 = dVar.f4254d;
        if (dVar2 == null) {
            return null;
        }
        C0864e eVar = dVar2.f4252b;
        int i = C0893a.f4467a[dVar2.f4253c.ordinal()];
        if (i != 1) {
            if (i == 2) {
                mVar2 = eVar.f4305f;
            } else if (i == 3) {
                mVar = eVar.f4307g;
            } else if (i == 4) {
                return eVar.f4307g.f4454k;
            } else {
                if (i != 5) {
                    return null;
                }
                mVar2 = eVar.f4307g;
            }
            return mVar2.f4465i;
        }
        mVar = eVar.f4305f;
        return mVar.f4464h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C0882f mo5295i(C0861d dVar, int i) {
        C0861d dVar2 = dVar.f4254d;
        if (dVar2 == null) {
            return null;
        }
        C0864e eVar = dVar2.f4252b;
        AbstractC0892m mVar = i == 0 ? eVar.f4305f : eVar.f4307g;
        int i2 = C0893a.f4467a[dVar2.f4253c.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return mVar.f4465i;
        }
        return mVar.f4464h;
    }

    /* renamed from: j */
    public long mo5269j() {
        C0884g gVar = this.f4461e;
        if (gVar.f4431j) {
            return (long) gVar.f4428g;
        }
        return 0;
    }

    /* renamed from: k */
    public boolean mo5296k() {
        return this.f4463g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public abstract boolean mo5270m();

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo5297n(AbstractC0880d dVar, C0861d dVar2, C0861d dVar3, int i) {
        C0882f fVar;
        C0882f h = mo5294h(dVar2);
        C0882f h2 = mo5294h(dVar3);
        if (h.f4431j && h2.f4431j) {
            int b = h.f4428g + dVar2.mo5138b();
            int b2 = h2.f4428g - dVar3.mo5138b();
            int i2 = b2 - b;
            if (!this.f4461e.f4431j && this.f4460d == C0864e.EnumC0866b.MATCH_CONSTRAINT) {
                m5277l(i, i2);
            }
            C0884g gVar = this.f4461e;
            if (gVar.f4431j) {
                if (gVar.f4428g == i2) {
                    this.f4464h.mo5283d(b);
                    fVar = this.f4465i;
                } else {
                    C0864e eVar = this.f4458b;
                    float u = i == 0 ? eVar.mo5215u() : eVar.mo5165I();
                    if (h == h2) {
                        b = h.f4428g;
                        b2 = h2.f4428g;
                        u = 0.5f;
                    }
                    this.f4464h.mo5283d((int) (((float) b) + 0.5f + (((float) ((b2 - b) - this.f4461e.f4428g)) * u)));
                    fVar = this.f4465i;
                    b2 = this.f4464h.f4428g + this.f4461e.f4428g;
                }
                fVar.mo5283d(b2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo5298o(AbstractC0880d dVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo5299p(AbstractC0880d dVar) {
    }
}
