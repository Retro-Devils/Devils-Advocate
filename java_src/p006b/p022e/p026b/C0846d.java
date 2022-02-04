package p006b.p022e.p026b;

import java.util.Arrays;
import java.util.HashMap;
import p006b.p022e.p026b.C0855i;
import p006b.p022e.p026b.p027k.C0861d;
import p006b.p022e.p026b.p027k.C0864e;

/* renamed from: b.e.b.d */
public class C0846d {

    /* renamed from: a */
    private static int f4153a = 1000;

    /* renamed from: b */
    public static C0849e f4154b = null;

    /* renamed from: c */
    public static boolean f4155c = true;

    /* renamed from: d */
    public static long f4156d;

    /* renamed from: e */
    public static long f4157e;

    /* renamed from: f */
    int f4158f;

    /* renamed from: g */
    private HashMap<String, C0855i> f4159g;

    /* renamed from: h */
    private AbstractC0847a f4160h;

    /* renamed from: i */
    private int f4161i;

    /* renamed from: j */
    private int f4162j;

    /* renamed from: k */
    C0843b[] f4163k;

    /* renamed from: l */
    public boolean f4164l;

    /* renamed from: m */
    public boolean f4165m;

    /* renamed from: n */
    private boolean[] f4166n;

    /* renamed from: o */
    int f4167o;

    /* renamed from: p */
    int f4168p;

    /* renamed from: q */
    private int f4169q;

    /* renamed from: r */
    final C0845c f4170r;

    /* renamed from: s */
    private C0855i[] f4171s;

    /* renamed from: t */
    private int f4172t;

    /* renamed from: u */
    private AbstractC0847a f4173u;

    /* access modifiers changed from: package-private */
    /* renamed from: b.e.b.d$a */
    public interface AbstractC0847a {
        /* renamed from: a */
        void mo5057a(AbstractC0847a aVar);

        /* renamed from: b */
        void mo5058b(C0855i iVar);

        /* renamed from: c */
        C0855i mo5059c(C0846d dVar, boolean[] zArr);

        void clear();

        C0855i getKey();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.e.b.d$b */
    public class C0848b extends C0843b {
        public C0848b(C0845c cVar) {
            this.f4147e = new C0857j(this, cVar);
        }
    }

    public C0846d() {
        this.f4158f = 0;
        this.f4159g = null;
        this.f4161i = 32;
        this.f4162j = 32;
        this.f4163k = null;
        this.f4164l = false;
        this.f4165m = false;
        this.f4166n = new boolean[32];
        this.f4167o = 1;
        this.f4168p = 0;
        this.f4169q = 32;
        this.f4171s = new C0855i[f4153a];
        this.f4172t = 0;
        this.f4163k = new C0843b[32];
        m4975C();
        C0845c cVar = new C0845c();
        this.f4170r = cVar;
        this.f4160h = new C0852h(cVar);
        this.f4173u = f4155c ? new C0848b(cVar) : new C0843b(cVar);
    }

    /* renamed from: B */
    private final int m4974B(AbstractC0847a aVar, boolean z) {
        if (f4154b == null) {
            for (int i = 0; i < this.f4167o; i++) {
                this.f4166n[i] = false;
            }
            boolean z2 = false;
            int i2 = 0;
            while (!z2) {
                if (f4154b == null) {
                    i2++;
                    if (i2 >= this.f4167o * 2) {
                        return i2;
                    }
                    if (aVar.getKey() != null) {
                        this.f4166n[aVar.getKey().f4190d] = true;
                    }
                    C0855i c = aVar.mo5059c(this, this.f4166n);
                    if (c != null) {
                        boolean[] zArr = this.f4166n;
                        int i3 = c.f4190d;
                        if (zArr[i3]) {
                            return i2;
                        }
                        zArr[i3] = true;
                    }
                    if (c != null) {
                        float f = Float.MAX_VALUE;
                        int i4 = -1;
                        for (int i5 = 0; i5 < this.f4168p; i5++) {
                            C0843b bVar = this.f4163k[i5];
                            if (bVar.f4143a.f4197k != C0855i.EnumC0856a.UNRESTRICTED && !bVar.f4148f && bVar.mo5078t(c)) {
                                float g = bVar.f4147e.mo5047g(c);
                                if (g < 0.0f) {
                                    float f2 = (-bVar.f4144b) / g;
                                    if (f2 < f) {
                                        i4 = i5;
                                        f = f2;
                                    }
                                }
                            }
                        }
                        if (i4 > -1) {
                            C0843b bVar2 = this.f4163k[i4];
                            bVar2.f4143a.f4191e = -1;
                            if (f4154b == null) {
                                bVar2.mo5082y(c);
                                C0855i iVar = bVar2.f4143a;
                                iVar.f4191e = i4;
                                iVar.mo5122g(bVar2);
                            } else {
                                throw null;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        z2 = true;
                    }
                } else {
                    throw null;
                }
            }
            return i2;
        }
        throw null;
    }

    /* renamed from: C */
    private void m4975C() {
        int i = 0;
        if (f4155c) {
            while (true) {
                C0843b[] bVarArr = this.f4163k;
                if (i < bVarArr.length) {
                    C0843b bVar = bVarArr[i];
                    if (bVar != null) {
                        this.f4170r.f4149a.mo5105a(bVar);
                    }
                    this.f4163k[i] = null;
                    i++;
                } else {
                    return;
                }
            }
        } else {
            while (true) {
                C0843b[] bVarArr2 = this.f4163k;
                if (i < bVarArr2.length) {
                    C0843b bVar2 = bVarArr2[i];
                    if (bVar2 != null) {
                        this.f4170r.f4150b.mo5105a(bVar2);
                    }
                    this.f4163k[i] = null;
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private C0855i m4976a(C0855i.EnumC0856a aVar, String str) {
        C0855i b = this.f4170r.f4151c.mo5106b();
        if (b == null) {
            b = new C0855i(aVar, str);
        } else {
            b.mo5119d();
        }
        b.mo5121f(aVar, str);
        int i = this.f4172t;
        int i2 = f4153a;
        if (i >= i2) {
            int i3 = i2 * 2;
            f4153a = i3;
            this.f4171s = (C0855i[]) Arrays.copyOf(this.f4171s, i3);
        }
        C0855i[] iVarArr = this.f4171s;
        int i4 = this.f4172t;
        this.f4172t = i4 + 1;
        iVarArr[i4] = b;
        return b;
    }

    /* renamed from: l */
    private final void m4977l(C0843b bVar) {
        AbstractC0850f<C0843b> fVar;
        C0843b bVar2;
        if (f4155c) {
            C0843b[] bVarArr = this.f4163k;
            int i = this.f4168p;
            if (bVarArr[i] != null) {
                fVar = this.f4170r.f4149a;
                bVar2 = bVarArr[i];
            }
            C0843b[] bVarArr2 = this.f4163k;
            int i2 = this.f4168p;
            bVarArr2[i2] = bVar;
            C0855i iVar = bVar.f4143a;
            iVar.f4191e = i2;
            this.f4168p = i2 + 1;
            iVar.mo5122g(bVar);
        }
        C0843b[] bVarArr3 = this.f4163k;
        int i3 = this.f4168p;
        if (bVarArr3[i3] != null) {
            fVar = this.f4170r.f4150b;
            bVar2 = bVarArr3[i3];
        }
        C0843b[] bVarArr22 = this.f4163k;
        int i22 = this.f4168p;
        bVarArr22[i22] = bVar;
        C0855i iVar2 = bVar.f4143a;
        iVar2.f4191e = i22;
        this.f4168p = i22 + 1;
        iVar2.mo5122g(bVar);
        fVar.mo5105a(bVar2);
        C0843b[] bVarArr222 = this.f4163k;
        int i222 = this.f4168p;
        bVarArr222[i222] = bVar;
        C0855i iVar22 = bVar.f4143a;
        iVar22.f4191e = i222;
        this.f4168p = i222 + 1;
        iVar22.mo5122g(bVar);
    }

    /* renamed from: n */
    private void m4978n() {
        for (int i = 0; i < this.f4168p; i++) {
            C0843b bVar = this.f4163k[i];
            bVar.f4143a.f4193g = bVar.f4144b;
        }
    }

    /* renamed from: s */
    public static C0843b m4979s(C0846d dVar, C0855i iVar, C0855i iVar2, float f) {
        return dVar.mo5100r().mo5068j(iVar, iVar2, f);
    }

    /* renamed from: u */
    private int m4980u(AbstractC0847a aVar) {
        float f;
        boolean z;
        int i = 0;
        while (true) {
            f = 0.0f;
            if (i >= this.f4168p) {
                z = false;
                break;
            }
            C0843b[] bVarArr = this.f4163k;
            if (bVarArr[i].f4143a.f4197k != C0855i.EnumC0856a.UNRESTRICTED && bVarArr[i].f4144b < 0.0f) {
                z = true;
                break;
            }
            i++;
        }
        if (!z) {
            return 0;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            if (f4154b == null) {
                i2++;
                float f2 = Float.MAX_VALUE;
                int i3 = 0;
                int i4 = -1;
                int i5 = -1;
                int i6 = 0;
                while (i3 < this.f4168p) {
                    C0843b bVar = this.f4163k[i3];
                    if (bVar.f4143a.f4197k != C0855i.EnumC0856a.UNRESTRICTED && !bVar.f4148f && bVar.f4144b < f) {
                        int i7 = 1;
                        while (i7 < this.f4167o) {
                            C0855i iVar = this.f4170r.f4152d[i7];
                            float g = bVar.f4147e.mo5047g(iVar);
                            if (g > f) {
                                for (int i8 = 0; i8 < 9; i8++) {
                                    float f3 = iVar.f4195i[i8] / g;
                                    if ((f3 < f2 && i8 == i6) || i8 > i6) {
                                        i6 = i8;
                                        f2 = f3;
                                        i4 = i3;
                                        i5 = i7;
                                    }
                                }
                            }
                            i7++;
                            f = 0.0f;
                        }
                    }
                    i3++;
                    f = 0.0f;
                }
                if (i4 != -1) {
                    C0843b bVar2 = this.f4163k[i4];
                    bVar2.f4143a.f4191e = -1;
                    if (f4154b == null) {
                        bVar2.mo5082y(this.f4170r.f4152d[i5]);
                        C0855i iVar2 = bVar2.f4143a;
                        iVar2.f4191e = i4;
                        iVar2.mo5122g(bVar2);
                    } else {
                        throw null;
                    }
                } else {
                    z2 = true;
                }
                if (i2 > this.f4167o / 2) {
                    z2 = true;
                }
                f = 0.0f;
            } else {
                throw null;
            }
        }
        return i2;
    }

    /* renamed from: w */
    public static C0849e m4981w() {
        return f4154b;
    }

    /* renamed from: y */
    private void m4982y() {
        int i = this.f4161i * 2;
        this.f4161i = i;
        this.f4163k = (C0843b[]) Arrays.copyOf(this.f4163k, i);
        C0845c cVar = this.f4170r;
        cVar.f4152d = (C0855i[]) Arrays.copyOf(cVar.f4152d, this.f4161i);
        int i2 = this.f4161i;
        this.f4166n = new boolean[i2];
        this.f4162j = i2;
        this.f4169q = i2;
        if (f4154b != null) {
            throw null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo5084A(AbstractC0847a aVar) {
        if (f4154b == null) {
            m4980u(aVar);
            m4974B(aVar, false);
            m4978n();
            return;
        }
        throw null;
    }

    /* renamed from: D */
    public void mo5085D() {
        C0845c cVar;
        int i = 0;
        while (true) {
            cVar = this.f4170r;
            C0855i[] iVarArr = cVar.f4152d;
            if (i >= iVarArr.length) {
                break;
            }
            C0855i iVar = iVarArr[i];
            if (iVar != null) {
                iVar.mo5119d();
            }
            i++;
        }
        cVar.f4151c.mo5107c(this.f4171s, this.f4172t);
        this.f4172t = 0;
        Arrays.fill(this.f4170r.f4152d, (Object) null);
        HashMap<String, C0855i> hashMap = this.f4159g;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f4158f = 0;
        this.f4160h.clear();
        this.f4167o = 1;
        for (int i2 = 0; i2 < this.f4168p; i2++) {
            this.f4163k[i2].f4145c = false;
        }
        m4975C();
        this.f4168p = 0;
        this.f4173u = f4155c ? new C0848b(this.f4170r) : new C0843b(this.f4170r);
    }

    /* renamed from: b */
    public void mo5086b(C0864e eVar, C0864e eVar2, float f, int i) {
        C0861d.EnumC0863b bVar = C0861d.EnumC0863b.LEFT;
        C0855i q = mo5099q(eVar.mo5195k(bVar));
        C0861d.EnumC0863b bVar2 = C0861d.EnumC0863b.TOP;
        C0855i q2 = mo5099q(eVar.mo5195k(bVar2));
        C0861d.EnumC0863b bVar3 = C0861d.EnumC0863b.RIGHT;
        C0855i q3 = mo5099q(eVar.mo5195k(bVar3));
        C0861d.EnumC0863b bVar4 = C0861d.EnumC0863b.BOTTOM;
        C0855i q4 = mo5099q(eVar.mo5195k(bVar4));
        C0855i q5 = mo5099q(eVar2.mo5195k(bVar));
        C0855i q6 = mo5099q(eVar2.mo5195k(bVar2));
        C0855i q7 = mo5099q(eVar2.mo5195k(bVar3));
        C0855i q8 = mo5099q(eVar2.mo5195k(bVar4));
        C0843b r = mo5100r();
        double d = (double) f;
        double sin = Math.sin(d);
        double d2 = (double) i;
        Double.isNaN(d2);
        r.mo5075q(q2, q4, q6, q8, (float) (sin * d2));
        mo5088d(r);
        C0843b r2 = mo5100r();
        double cos = Math.cos(d);
        Double.isNaN(d2);
        r2.mo5075q(q, q3, q5, q7, (float) (cos * d2));
        mo5088d(r2);
    }

    /* renamed from: c */
    public void mo5087c(C0855i iVar, C0855i iVar2, int i, float f, C0855i iVar3, C0855i iVar4, int i2, int i3) {
        C0843b r = mo5100r();
        r.mo5066h(iVar, iVar2, i, f, iVar3, iVar4, i2);
        if (i3 != 8) {
            r.mo5061d(this, i3);
        }
        mo5088d(r);
    }

    /* renamed from: d */
    public void mo5088d(C0843b bVar) {
        C0855i w;
        if (bVar != null) {
            if (f4154b == null) {
                boolean z = true;
                if (this.f4168p + 1 >= this.f4169q || this.f4167o + 1 >= this.f4162j) {
                    m4982y();
                }
                boolean z2 = false;
                if (!bVar.f4148f) {
                    bVar.mo5056D(this);
                    if (!bVar.mo5080u()) {
                        bVar.mo5076r();
                        if (bVar.mo5063f(this)) {
                            C0855i p = mo5098p();
                            bVar.f4143a = p;
                            m4977l(bVar);
                            this.f4173u.mo5057a(bVar);
                            m4974B(this.f4173u, true);
                            if (p.f4191e == -1) {
                                if (bVar.f4143a == p && (w = bVar.mo5081w(p)) != null) {
                                    if (f4154b == null) {
                                        bVar.mo5082y(w);
                                    } else {
                                        throw null;
                                    }
                                }
                                if (!bVar.f4148f) {
                                    bVar.f4143a.mo5122g(bVar);
                                }
                                this.f4168p--;
                            }
                        } else {
                            z = false;
                        }
                        if (bVar.mo5077s()) {
                            z2 = z;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if (!z2) {
                    m4977l(bVar);
                    return;
                }
                return;
            }
            throw null;
        }
    }

    /* renamed from: e */
    public C0843b mo5089e(C0855i iVar, C0855i iVar2, int i, int i2) {
        if (i2 == 8 && iVar2.f4194h && iVar.f4191e == -1) {
            iVar.mo5120e(this, iVar2.f4193g + ((float) i));
            return null;
        }
        C0843b r = mo5100r();
        r.mo5072n(iVar, iVar2, i);
        if (i2 != 8) {
            r.mo5061d(this, i2);
        }
        mo5088d(r);
        return r;
    }

    /* renamed from: f */
    public void mo5090f(C0855i iVar, int i) {
        C0843b bVar;
        int i2 = iVar.f4191e;
        if (i2 == -1) {
            iVar.mo5120e(this, (float) i);
            return;
        }
        if (i2 != -1) {
            C0843b bVar2 = this.f4163k[i2];
            if (!bVar2.f4148f) {
                if (bVar2.f4147e.mo5051k() == 0) {
                    bVar2.f4148f = true;
                } else {
                    bVar = mo5100r();
                    bVar.mo5071m(iVar, i);
                }
            }
            bVar2.f4144b = (float) i;
            return;
        }
        bVar = mo5100r();
        bVar.mo5067i(iVar, i);
        mo5088d(bVar);
    }

    /* renamed from: g */
    public void mo5091g(C0855i iVar, C0855i iVar2, int i, boolean z) {
        C0843b r = mo5100r();
        C0855i t = mo5101t();
        t.f4192f = 0;
        r.mo5073o(iVar, iVar2, t, i);
        mo5088d(r);
    }

    /* renamed from: h */
    public void mo5092h(C0855i iVar, C0855i iVar2, int i, int i2) {
        C0843b r = mo5100r();
        C0855i t = mo5101t();
        t.f4192f = 0;
        r.mo5073o(iVar, iVar2, t, i);
        if (i2 != 8) {
            mo5096m(r, (int) (r.f4147e.mo5047g(t) * -1.0f), i2);
        }
        mo5088d(r);
    }

    /* renamed from: i */
    public void mo5093i(C0855i iVar, C0855i iVar2, int i, boolean z) {
        C0843b r = mo5100r();
        C0855i t = mo5101t();
        t.f4192f = 0;
        r.mo5074p(iVar, iVar2, t, i);
        mo5088d(r);
    }

    /* renamed from: j */
    public void mo5094j(C0855i iVar, C0855i iVar2, int i, int i2) {
        C0843b r = mo5100r();
        C0855i t = mo5101t();
        t.f4192f = 0;
        r.mo5074p(iVar, iVar2, t, i);
        if (i2 != 8) {
            mo5096m(r, (int) (r.f4147e.mo5047g(t) * -1.0f), i2);
        }
        mo5088d(r);
    }

    /* renamed from: k */
    public void mo5095k(C0855i iVar, C0855i iVar2, C0855i iVar3, C0855i iVar4, float f, int i) {
        C0843b r = mo5100r();
        r.mo5069k(iVar, iVar2, iVar3, iVar4, f);
        if (i != 8) {
            r.mo5061d(this, i);
        }
        mo5088d(r);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo5096m(C0843b bVar, int i, int i2) {
        bVar.mo5062e(mo5097o(i2, null), i);
    }

    /* renamed from: o */
    public C0855i mo5097o(int i, String str) {
        if (f4154b == null) {
            if (this.f4167o + 1 >= this.f4162j) {
                m4982y();
            }
            C0855i a = m4976a(C0855i.EnumC0856a.ERROR, str);
            int i2 = this.f4158f + 1;
            this.f4158f = i2;
            this.f4167o++;
            a.f4190d = i2;
            a.f4192f = i;
            this.f4170r.f4152d[i2] = a;
            this.f4160h.mo5058b(a);
            return a;
        }
        throw null;
    }

    /* renamed from: p */
    public C0855i mo5098p() {
        if (f4154b == null) {
            if (this.f4167o + 1 >= this.f4162j) {
                m4982y();
            }
            C0855i a = m4976a(C0855i.EnumC0856a.SLACK, null);
            int i = this.f4158f + 1;
            this.f4158f = i;
            this.f4167o++;
            a.f4190d = i;
            this.f4170r.f4152d[i] = a;
            return a;
        }
        throw null;
    }

    /* renamed from: q */
    public C0855i mo5099q(Object obj) {
        C0855i iVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f4167o + 1 >= this.f4162j) {
            m4982y();
        }
        if (obj instanceof C0861d) {
            C0861d dVar = (C0861d) obj;
            iVar = dVar.mo5141e();
            if (iVar == null) {
                dVar.mo5148l(this.f4170r);
                iVar = dVar.mo5141e();
            }
            int i = iVar.f4190d;
            if (i == -1 || i > this.f4158f || this.f4170r.f4152d[i] == null) {
                if (i != -1) {
                    iVar.mo5119d();
                }
                int i2 = this.f4158f + 1;
                this.f4158f = i2;
                this.f4167o++;
                iVar.f4190d = i2;
                iVar.f4197k = C0855i.EnumC0856a.UNRESTRICTED;
                this.f4170r.f4152d[i2] = iVar;
            }
        }
        return iVar;
    }

    /* renamed from: r */
    public C0843b mo5100r() {
        C0843b bVar;
        if (f4155c) {
            bVar = this.f4170r.f4149a.mo5106b();
            if (bVar == null) {
                bVar = new C0848b(this.f4170r);
                f4157e++;
                C0855i.m5025b();
                return bVar;
            }
        } else {
            bVar = this.f4170r.f4150b.mo5106b();
            if (bVar == null) {
                bVar = new C0843b(this.f4170r);
                f4156d++;
                C0855i.m5025b();
                return bVar;
            }
        }
        bVar.mo5083z();
        C0855i.m5025b();
        return bVar;
    }

    /* renamed from: t */
    public C0855i mo5101t() {
        if (f4154b == null) {
            if (this.f4167o + 1 >= this.f4162j) {
                m4982y();
            }
            C0855i a = m4976a(C0855i.EnumC0856a.SLACK, null);
            int i = this.f4158f + 1;
            this.f4158f = i;
            this.f4167o++;
            a.f4190d = i;
            this.f4170r.f4152d[i] = a;
            return a;
        }
        throw null;
    }

    /* renamed from: v */
    public C0845c mo5102v() {
        return this.f4170r;
    }

    /* renamed from: x */
    public int mo5103x(Object obj) {
        C0855i e = ((C0861d) obj).mo5141e();
        if (e != null) {
            return (int) (e.f4193g + 0.5f);
        }
        return 0;
    }

    /* renamed from: z */
    public void mo5104z() {
        C0849e eVar = f4154b;
        if (eVar == null) {
            if (this.f4164l || this.f4165m) {
                if (eVar == null) {
                    boolean z = false;
                    int i = 0;
                    while (true) {
                        if (i >= this.f4168p) {
                            z = true;
                            break;
                        } else if (!this.f4163k[i].f4148f) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (z) {
                        if (f4154b == null) {
                            m4978n();
                            return;
                        }
                        throw null;
                    }
                } else {
                    throw null;
                }
            }
            mo5084A(this.f4160h);
            return;
        }
        throw null;
    }
}
