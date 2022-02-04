package p006b.p022e.p026b;

import java.util.Arrays;
import java.util.HashMap;
import p006b.p022e.p026b.C0855i;
import p006b.p022e.p026b.p027k.C0861d;
import p006b.p022e.p026b.p027k.C0864e;

/* renamed from: b.e.b.d */
public class C0846d {

    /* renamed from: a */
    private static int f4157a = 1000;

    /* renamed from: b */
    public static C0849e f4158b = null;

    /* renamed from: c */
    public static boolean f4159c = true;

    /* renamed from: d */
    public static long f4160d;

    /* renamed from: e */
    public static long f4161e;

    /* renamed from: f */
    int f4162f;

    /* renamed from: g */
    private HashMap<String, C0855i> f4163g;

    /* renamed from: h */
    private AbstractC0847a f4164h;

    /* renamed from: i */
    private int f4165i;

    /* renamed from: j */
    private int f4166j;

    /* renamed from: k */
    C0843b[] f4167k;

    /* renamed from: l */
    public boolean f4168l;

    /* renamed from: m */
    public boolean f4169m;

    /* renamed from: n */
    private boolean[] f4170n;

    /* renamed from: o */
    int f4171o;

    /* renamed from: p */
    int f4172p;

    /* renamed from: q */
    private int f4173q;

    /* renamed from: r */
    final C0845c f4174r;

    /* renamed from: s */
    private C0855i[] f4175s;

    /* renamed from: t */
    private int f4176t;

    /* renamed from: u */
    private AbstractC0847a f4177u;

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
            this.f4151e = new C0857j(this, cVar);
        }
    }

    public C0846d() {
        this.f4162f = 0;
        this.f4163g = null;
        this.f4165i = 32;
        this.f4166j = 32;
        this.f4167k = null;
        this.f4168l = false;
        this.f4169m = false;
        this.f4170n = new boolean[32];
        this.f4171o = 1;
        this.f4172p = 0;
        this.f4173q = 32;
        this.f4175s = new C0855i[f4157a];
        this.f4176t = 0;
        this.f4167k = new C0843b[32];
        m4975C();
        C0845c cVar = new C0845c();
        this.f4174r = cVar;
        this.f4164h = new C0852h(cVar);
        this.f4177u = f4159c ? new C0848b(cVar) : new C0843b(cVar);
    }

    /* renamed from: B */
    private final int m4974B(AbstractC0847a aVar, boolean z) {
        if (f4158b == null) {
            for (int i = 0; i < this.f4171o; i++) {
                this.f4170n[i] = false;
            }
            boolean z2 = false;
            int i2 = 0;
            while (!z2) {
                if (f4158b == null) {
                    i2++;
                    if (i2 >= this.f4171o * 2) {
                        return i2;
                    }
                    if (aVar.getKey() != null) {
                        this.f4170n[aVar.getKey().f4194d] = true;
                    }
                    C0855i c = aVar.mo5059c(this, this.f4170n);
                    if (c != null) {
                        boolean[] zArr = this.f4170n;
                        int i3 = c.f4194d;
                        if (zArr[i3]) {
                            return i2;
                        }
                        zArr[i3] = true;
                    }
                    if (c != null) {
                        float f = Float.MAX_VALUE;
                        int i4 = -1;
                        for (int i5 = 0; i5 < this.f4172p; i5++) {
                            C0843b bVar = this.f4167k[i5];
                            if (bVar.f4147a.f4201k != C0855i.EnumC0856a.UNRESTRICTED && !bVar.f4152f && bVar.mo5078t(c)) {
                                float g = bVar.f4151e.mo5047g(c);
                                if (g < 0.0f) {
                                    float f2 = (-bVar.f4148b) / g;
                                    if (f2 < f) {
                                        i4 = i5;
                                        f = f2;
                                    }
                                }
                            }
                        }
                        if (i4 > -1) {
                            C0843b bVar2 = this.f4167k[i4];
                            bVar2.f4147a.f4195e = -1;
                            if (f4158b == null) {
                                bVar2.mo5082y(c);
                                C0855i iVar = bVar2.f4147a;
                                iVar.f4195e = i4;
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
        if (f4159c) {
            while (true) {
                C0843b[] bVarArr = this.f4167k;
                if (i < bVarArr.length) {
                    C0843b bVar = bVarArr[i];
                    if (bVar != null) {
                        this.f4174r.f4153a.mo5105a(bVar);
                    }
                    this.f4167k[i] = null;
                    i++;
                } else {
                    return;
                }
            }
        } else {
            while (true) {
                C0843b[] bVarArr2 = this.f4167k;
                if (i < bVarArr2.length) {
                    C0843b bVar2 = bVarArr2[i];
                    if (bVar2 != null) {
                        this.f4174r.f4154b.mo5105a(bVar2);
                    }
                    this.f4167k[i] = null;
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private C0855i m4976a(C0855i.EnumC0856a aVar, String str) {
        C0855i b = this.f4174r.f4155c.mo5106b();
        if (b == null) {
            b = new C0855i(aVar, str);
        } else {
            b.mo5119d();
        }
        b.mo5121f(aVar, str);
        int i = this.f4176t;
        int i2 = f4157a;
        if (i >= i2) {
            int i3 = i2 * 2;
            f4157a = i3;
            this.f4175s = (C0855i[]) Arrays.copyOf(this.f4175s, i3);
        }
        C0855i[] iVarArr = this.f4175s;
        int i4 = this.f4176t;
        this.f4176t = i4 + 1;
        iVarArr[i4] = b;
        return b;
    }

    /* renamed from: l */
    private final void m4977l(C0843b bVar) {
        AbstractC0850f<C0843b> fVar;
        C0843b bVar2;
        if (f4159c) {
            C0843b[] bVarArr = this.f4167k;
            int i = this.f4172p;
            if (bVarArr[i] != null) {
                fVar = this.f4174r.f4153a;
                bVar2 = bVarArr[i];
            }
            C0843b[] bVarArr2 = this.f4167k;
            int i2 = this.f4172p;
            bVarArr2[i2] = bVar;
            C0855i iVar = bVar.f4147a;
            iVar.f4195e = i2;
            this.f4172p = i2 + 1;
            iVar.mo5122g(bVar);
        }
        C0843b[] bVarArr3 = this.f4167k;
        int i3 = this.f4172p;
        if (bVarArr3[i3] != null) {
            fVar = this.f4174r.f4154b;
            bVar2 = bVarArr3[i3];
        }
        C0843b[] bVarArr22 = this.f4167k;
        int i22 = this.f4172p;
        bVarArr22[i22] = bVar;
        C0855i iVar2 = bVar.f4147a;
        iVar2.f4195e = i22;
        this.f4172p = i22 + 1;
        iVar2.mo5122g(bVar);
        fVar.mo5105a(bVar2);
        C0843b[] bVarArr222 = this.f4167k;
        int i222 = this.f4172p;
        bVarArr222[i222] = bVar;
        C0855i iVar22 = bVar.f4147a;
        iVar22.f4195e = i222;
        this.f4172p = i222 + 1;
        iVar22.mo5122g(bVar);
    }

    /* renamed from: n */
    private void m4978n() {
        for (int i = 0; i < this.f4172p; i++) {
            C0843b bVar = this.f4167k[i];
            bVar.f4147a.f4197g = bVar.f4148b;
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
            if (i >= this.f4172p) {
                z = false;
                break;
            }
            C0843b[] bVarArr = this.f4167k;
            if (bVarArr[i].f4147a.f4201k != C0855i.EnumC0856a.UNRESTRICTED && bVarArr[i].f4148b < 0.0f) {
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
            if (f4158b == null) {
                i2++;
                float f2 = Float.MAX_VALUE;
                int i3 = 0;
                int i4 = -1;
                int i5 = -1;
                int i6 = 0;
                while (i3 < this.f4172p) {
                    C0843b bVar = this.f4167k[i3];
                    if (bVar.f4147a.f4201k != C0855i.EnumC0856a.UNRESTRICTED && !bVar.f4152f && bVar.f4148b < f) {
                        int i7 = 1;
                        while (i7 < this.f4171o) {
                            C0855i iVar = this.f4174r.f4156d[i7];
                            float g = bVar.f4151e.mo5047g(iVar);
                            if (g > f) {
                                for (int i8 = 0; i8 < 9; i8++) {
                                    float f3 = iVar.f4199i[i8] / g;
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
                    C0843b bVar2 = this.f4167k[i4];
                    bVar2.f4147a.f4195e = -1;
                    if (f4158b == null) {
                        bVar2.mo5082y(this.f4174r.f4156d[i5]);
                        C0855i iVar2 = bVar2.f4147a;
                        iVar2.f4195e = i4;
                        iVar2.mo5122g(bVar2);
                    } else {
                        throw null;
                    }
                } else {
                    z2 = true;
                }
                if (i2 > this.f4171o / 2) {
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
        return f4158b;
    }

    /* renamed from: y */
    private void m4982y() {
        int i = this.f4165i * 2;
        this.f4165i = i;
        this.f4167k = (C0843b[]) Arrays.copyOf(this.f4167k, i);
        C0845c cVar = this.f4174r;
        cVar.f4156d = (C0855i[]) Arrays.copyOf(cVar.f4156d, this.f4165i);
        int i2 = this.f4165i;
        this.f4170n = new boolean[i2];
        this.f4166j = i2;
        this.f4173q = i2;
        if (f4158b != null) {
            throw null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo5084A(AbstractC0847a aVar) {
        if (f4158b == null) {
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
            cVar = this.f4174r;
            C0855i[] iVarArr = cVar.f4156d;
            if (i >= iVarArr.length) {
                break;
            }
            C0855i iVar = iVarArr[i];
            if (iVar != null) {
                iVar.mo5119d();
            }
            i++;
        }
        cVar.f4155c.mo5107c(this.f4175s, this.f4176t);
        this.f4176t = 0;
        Arrays.fill(this.f4174r.f4156d, (Object) null);
        HashMap<String, C0855i> hashMap = this.f4163g;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f4162f = 0;
        this.f4164h.clear();
        this.f4171o = 1;
        for (int i2 = 0; i2 < this.f4172p; i2++) {
            this.f4167k[i2].f4149c = false;
        }
        m4975C();
        this.f4172p = 0;
        this.f4177u = f4159c ? new C0848b(this.f4174r) : new C0843b(this.f4174r);
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
            if (f4158b == null) {
                boolean z = true;
                if (this.f4172p + 1 >= this.f4173q || this.f4171o + 1 >= this.f4166j) {
                    m4982y();
                }
                boolean z2 = false;
                if (!bVar.f4152f) {
                    bVar.mo5056D(this);
                    if (!bVar.mo5080u()) {
                        bVar.mo5076r();
                        if (bVar.mo5063f(this)) {
                            C0855i p = mo5098p();
                            bVar.f4147a = p;
                            m4977l(bVar);
                            this.f4177u.mo5057a(bVar);
                            m4974B(this.f4177u, true);
                            if (p.f4195e == -1) {
                                if (bVar.f4147a == p && (w = bVar.mo5081w(p)) != null) {
                                    if (f4158b == null) {
                                        bVar.mo5082y(w);
                                    } else {
                                        throw null;
                                    }
                                }
                                if (!bVar.f4152f) {
                                    bVar.f4147a.mo5122g(bVar);
                                }
                                this.f4172p--;
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
        if (i2 == 8 && iVar2.f4198h && iVar.f4195e == -1) {
            iVar.mo5120e(this, iVar2.f4197g + ((float) i));
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
        int i2 = iVar.f4195e;
        if (i2 == -1) {
            iVar.mo5120e(this, (float) i);
            return;
        }
        if (i2 != -1) {
            C0843b bVar2 = this.f4167k[i2];
            if (!bVar2.f4152f) {
                if (bVar2.f4151e.mo5051k() == 0) {
                    bVar2.f4152f = true;
                } else {
                    bVar = mo5100r();
                    bVar.mo5071m(iVar, i);
                }
            }
            bVar2.f4148b = (float) i;
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
        t.f4196f = 0;
        r.mo5073o(iVar, iVar2, t, i);
        mo5088d(r);
    }

    /* renamed from: h */
    public void mo5092h(C0855i iVar, C0855i iVar2, int i, int i2) {
        C0843b r = mo5100r();
        C0855i t = mo5101t();
        t.f4196f = 0;
        r.mo5073o(iVar, iVar2, t, i);
        if (i2 != 8) {
            mo5096m(r, (int) (r.f4151e.mo5047g(t) * -1.0f), i2);
        }
        mo5088d(r);
    }

    /* renamed from: i */
    public void mo5093i(C0855i iVar, C0855i iVar2, int i, boolean z) {
        C0843b r = mo5100r();
        C0855i t = mo5101t();
        t.f4196f = 0;
        r.mo5074p(iVar, iVar2, t, i);
        mo5088d(r);
    }

    /* renamed from: j */
    public void mo5094j(C0855i iVar, C0855i iVar2, int i, int i2) {
        C0843b r = mo5100r();
        C0855i t = mo5101t();
        t.f4196f = 0;
        r.mo5074p(iVar, iVar2, t, i);
        if (i2 != 8) {
            mo5096m(r, (int) (r.f4151e.mo5047g(t) * -1.0f), i2);
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
        if (f4158b == null) {
            if (this.f4171o + 1 >= this.f4166j) {
                m4982y();
            }
            C0855i a = m4976a(C0855i.EnumC0856a.ERROR, str);
            int i2 = this.f4162f + 1;
            this.f4162f = i2;
            this.f4171o++;
            a.f4194d = i2;
            a.f4196f = i;
            this.f4174r.f4156d[i2] = a;
            this.f4164h.mo5058b(a);
            return a;
        }
        throw null;
    }

    /* renamed from: p */
    public C0855i mo5098p() {
        if (f4158b == null) {
            if (this.f4171o + 1 >= this.f4166j) {
                m4982y();
            }
            C0855i a = m4976a(C0855i.EnumC0856a.SLACK, null);
            int i = this.f4162f + 1;
            this.f4162f = i;
            this.f4171o++;
            a.f4194d = i;
            this.f4174r.f4156d[i] = a;
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
        if (this.f4171o + 1 >= this.f4166j) {
            m4982y();
        }
        if (obj instanceof C0861d) {
            C0861d dVar = (C0861d) obj;
            iVar = dVar.mo5141e();
            if (iVar == null) {
                dVar.mo5148l(this.f4174r);
                iVar = dVar.mo5141e();
            }
            int i = iVar.f4194d;
            if (i == -1 || i > this.f4162f || this.f4174r.f4156d[i] == null) {
                if (i != -1) {
                    iVar.mo5119d();
                }
                int i2 = this.f4162f + 1;
                this.f4162f = i2;
                this.f4171o++;
                iVar.f4194d = i2;
                iVar.f4201k = C0855i.EnumC0856a.UNRESTRICTED;
                this.f4174r.f4156d[i2] = iVar;
            }
        }
        return iVar;
    }

    /* renamed from: r */
    public C0843b mo5100r() {
        C0843b bVar;
        if (f4159c) {
            bVar = this.f4174r.f4153a.mo5106b();
            if (bVar == null) {
                bVar = new C0848b(this.f4174r);
                f4161e++;
                C0855i.m5025b();
                return bVar;
            }
        } else {
            bVar = this.f4174r.f4154b.mo5106b();
            if (bVar == null) {
                bVar = new C0843b(this.f4174r);
                f4160d++;
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
        if (f4158b == null) {
            if (this.f4171o + 1 >= this.f4166j) {
                m4982y();
            }
            C0855i a = m4976a(C0855i.EnumC0856a.SLACK, null);
            int i = this.f4162f + 1;
            this.f4162f = i;
            this.f4171o++;
            a.f4194d = i;
            this.f4174r.f4156d[i] = a;
            return a;
        }
        throw null;
    }

    /* renamed from: v */
    public C0845c mo5102v() {
        return this.f4174r;
    }

    /* renamed from: x */
    public int mo5103x(Object obj) {
        C0855i e = ((C0861d) obj).mo5141e();
        if (e != null) {
            return (int) (e.f4197g + 0.5f);
        }
        return 0;
    }

    /* renamed from: z */
    public void mo5104z() {
        C0849e eVar = f4158b;
        if (eVar == null) {
            if (this.f4168l || this.f4169m) {
                if (eVar == null) {
                    boolean z = false;
                    int i = 0;
                    while (true) {
                        if (i >= this.f4172p) {
                            z = true;
                            break;
                        } else if (!this.f4167k[i].f4152f) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (z) {
                        if (f4158b == null) {
                            m4978n();
                            return;
                        }
                        throw null;
                    }
                } else {
                    throw null;
                }
            }
            mo5084A(this.f4164h);
            return;
        }
        throw null;
    }
}
