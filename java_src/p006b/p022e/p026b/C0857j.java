package p006b.p022e.p026b;

import java.util.Arrays;
import p006b.p022e.p026b.C0843b;

/* renamed from: b.e.b.j */
public class C0857j implements C0843b.AbstractC0844a {

    /* renamed from: a */
    private static float f4212a = 0.001f;

    /* renamed from: b */
    private final int f4213b = -1;

    /* renamed from: c */
    private int f4214c = 16;

    /* renamed from: d */
    private int f4215d = 16;

    /* renamed from: e */
    int[] f4216e = new int[16];

    /* renamed from: f */
    int[] f4217f = new int[16];

    /* renamed from: g */
    int[] f4218g = new int[16];

    /* renamed from: h */
    float[] f4219h = new float[16];

    /* renamed from: i */
    int[] f4220i = new int[16];

    /* renamed from: j */
    int[] f4221j = new int[16];

    /* renamed from: k */
    int f4222k = 0;

    /* renamed from: l */
    int f4223l = -1;

    /* renamed from: m */
    private final C0843b f4224m;

    /* renamed from: n */
    protected final C0845c f4225n;

    C0857j(C0843b bVar, C0845c cVar) {
        this.f4224m = bVar;
        this.f4225n = cVar;
        clear();
    }

    /* renamed from: l */
    private void m5032l(C0855i iVar, int i) {
        int[] iArr;
        int i2 = iVar.f4194d % this.f4215d;
        int[] iArr2 = this.f4216e;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            iArr2[i2] = i;
        } else {
            while (true) {
                iArr = this.f4217f;
                if (iArr[i3] == -1) {
                    break;
                }
                i3 = iArr[i3];
            }
            iArr[i3] = i;
        }
        this.f4217f[i] = -1;
    }

    /* renamed from: m */
    private void m5033m(int i, C0855i iVar, float f) {
        this.f4218g[i] = iVar.f4194d;
        this.f4219h[i] = f;
        this.f4220i[i] = -1;
        this.f4221j[i] = -1;
        iVar.mo5117a(this.f4224m);
        iVar.f4204n++;
        this.f4222k++;
    }

    /* renamed from: n */
    private int m5034n() {
        for (int i = 0; i < this.f4214c; i++) {
            if (this.f4218g[i] == -1) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: o */
    private void m5035o() {
        int i = this.f4214c * 2;
        this.f4218g = Arrays.copyOf(this.f4218g, i);
        this.f4219h = Arrays.copyOf(this.f4219h, i);
        this.f4220i = Arrays.copyOf(this.f4220i, i);
        this.f4221j = Arrays.copyOf(this.f4221j, i);
        this.f4217f = Arrays.copyOf(this.f4217f, i);
        for (int i2 = this.f4214c; i2 < i; i2++) {
            this.f4218g[i2] = -1;
            this.f4217f[i2] = -1;
        }
        this.f4214c = i;
    }

    /* renamed from: q */
    private void m5036q(int i, C0855i iVar, float f) {
        int n = m5034n();
        m5033m(n, iVar, f);
        if (i != -1) {
            this.f4220i[n] = i;
            int[] iArr = this.f4221j;
            iArr[n] = iArr[i];
            iArr[i] = n;
        } else {
            this.f4220i[n] = -1;
            if (this.f4222k > 0) {
                this.f4221j[n] = this.f4223l;
                this.f4223l = n;
            } else {
                this.f4221j[n] = -1;
            }
        }
        int[] iArr2 = this.f4221j;
        if (iArr2[n] != -1) {
            this.f4220i[iArr2[n]] = n;
        }
        m5032l(iVar, n);
    }

    /* renamed from: r */
    private void m5037r(C0855i iVar) {
        int[] iArr;
        int i = iVar.f4194d;
        int i2 = i % this.f4215d;
        int[] iArr2 = this.f4216e;
        int i3 = iArr2[i2];
        if (i3 != -1) {
            if (this.f4218g[i3] == i) {
                int[] iArr3 = this.f4217f;
                iArr2[i2] = iArr3[i3];
                iArr3[i3] = -1;
                return;
            }
            while (true) {
                iArr = this.f4217f;
                if (iArr[i3] == -1 || this.f4218g[iArr[i3]] == i) {
                    int i4 = iArr[i3];
                } else {
                    i3 = iArr[i3];
                }
            }
            int i42 = iArr[i3];
            if (i42 != -1 && this.f4218g[i42] == i) {
                iArr[i3] = iArr[i42];
                iArr[i42] = -1;
            }
        }
    }

    @Override // p006b.p022e.p026b.C0843b.AbstractC0844a
    /* renamed from: a */
    public float mo5040a(int i) {
        int i2 = this.f4222k;
        int i3 = this.f4223l;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                return this.f4219h[i3];
            }
            i3 = this.f4221j[i3];
            if (i3 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // p006b.p022e.p026b.C0843b.AbstractC0844a
    /* renamed from: b */
    public float mo5041b(C0843b bVar, boolean z) {
        float g = mo5047g(bVar.f4147a);
        mo5044d(bVar.f4147a, z);
        C0857j jVar = (C0857j) bVar.f4151e;
        int k = jVar.mo5051k();
        int i = 0;
        int i2 = 0;
        while (i < k) {
            int[] iArr = jVar.f4218g;
            if (iArr[i2] != -1) {
                mo5045e(this.f4225n.f4156d[iArr[i2]], jVar.f4219h[i2] * g, z);
                i++;
            }
            i2++;
        }
        return g;
    }

    @Override // p006b.p022e.p026b.C0843b.AbstractC0844a
    /* renamed from: c */
    public void mo5042c(C0855i iVar, float f) {
        float f2 = f4212a;
        if (f <= (-f2) || f >= f2) {
            if (this.f4222k == 0) {
                m5033m(0, iVar, f);
                m5032l(iVar, 0);
                this.f4223l = 0;
                return;
            }
            int p = mo5124p(iVar);
            if (p != -1) {
                this.f4219h[p] = f;
                return;
            }
            if (this.f4222k + 1 >= this.f4214c) {
                m5035o();
            }
            int i = this.f4222k;
            int i2 = this.f4223l;
            int i3 = -1;
            for (int i4 = 0; i4 < i; i4++) {
                int[] iArr = this.f4218g;
                int i5 = iArr[i2];
                int i6 = iVar.f4194d;
                if (i5 == i6) {
                    this.f4219h[i2] = f;
                    return;
                }
                if (iArr[i2] < i6) {
                    i3 = i2;
                }
                i2 = this.f4221j[i2];
                if (i2 == -1) {
                    break;
                }
            }
            m5036q(i3, iVar, f);
            return;
        }
        mo5044d(iVar, true);
    }

    @Override // p006b.p022e.p026b.C0843b.AbstractC0844a
    public void clear() {
        int i = this.f4222k;
        for (int i2 = 0; i2 < i; i2++) {
            C0855i f = mo5046f(i2);
            if (f != null) {
                f.mo5118c(this.f4224m);
            }
        }
        for (int i3 = 0; i3 < this.f4214c; i3++) {
            this.f4218g[i3] = -1;
            this.f4217f[i3] = -1;
        }
        for (int i4 = 0; i4 < this.f4215d; i4++) {
            this.f4216e[i4] = -1;
        }
        this.f4222k = 0;
        this.f4223l = -1;
    }

    @Override // p006b.p022e.p026b.C0843b.AbstractC0844a
    /* renamed from: d */
    public float mo5044d(C0855i iVar, boolean z) {
        int p = mo5124p(iVar);
        if (p == -1) {
            return 0.0f;
        }
        m5037r(iVar);
        float f = this.f4219h[p];
        if (this.f4223l == p) {
            this.f4223l = this.f4221j[p];
        }
        this.f4218g[p] = -1;
        int[] iArr = this.f4220i;
        if (iArr[p] != -1) {
            int[] iArr2 = this.f4221j;
            iArr2[iArr[p]] = iArr2[p];
        }
        int[] iArr3 = this.f4221j;
        if (iArr3[p] != -1) {
            iArr[iArr3[p]] = iArr[p];
        }
        this.f4222k--;
        iVar.f4204n--;
        if (z) {
            iVar.mo5118c(this.f4224m);
        }
        return f;
    }

    @Override // p006b.p022e.p026b.C0843b.AbstractC0844a
    /* renamed from: e */
    public void mo5045e(C0855i iVar, float f, boolean z) {
        float f2 = f4212a;
        if (f <= (-f2) || f >= f2) {
            int p = mo5124p(iVar);
            if (p == -1) {
                mo5042c(iVar, f);
                return;
            }
            float[] fArr = this.f4219h;
            fArr[p] = fArr[p] + f;
            float f3 = fArr[p];
            float f4 = f4212a;
            if (f3 > (-f4) && fArr[p] < f4) {
                fArr[p] = 0.0f;
                mo5044d(iVar, z);
            }
        }
    }

    @Override // p006b.p022e.p026b.C0843b.AbstractC0844a
    /* renamed from: f */
    public C0855i mo5046f(int i) {
        int i2 = this.f4222k;
        if (i2 == 0) {
            return null;
        }
        int i3 = this.f4223l;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i && i3 != -1) {
                return this.f4225n.f4156d[this.f4218g[i3]];
            }
            i3 = this.f4221j[i3];
            if (i3 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // p006b.p022e.p026b.C0843b.AbstractC0844a
    /* renamed from: g */
    public float mo5047g(C0855i iVar) {
        int p = mo5124p(iVar);
        if (p != -1) {
            return this.f4219h[p];
        }
        return 0.0f;
    }

    @Override // p006b.p022e.p026b.C0843b.AbstractC0844a
    /* renamed from: h */
    public boolean mo5048h(C0855i iVar) {
        return mo5124p(iVar) != -1;
    }

    @Override // p006b.p022e.p026b.C0843b.AbstractC0844a
    /* renamed from: i */
    public void mo5049i(float f) {
        int i = this.f4222k;
        int i2 = this.f4223l;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.f4219h;
            fArr[i2] = fArr[i2] / f;
            i2 = this.f4221j[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // p006b.p022e.p026b.C0843b.AbstractC0844a
    /* renamed from: j */
    public void mo5050j() {
        int i = this.f4222k;
        int i2 = this.f4223l;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.f4219h;
            fArr[i2] = fArr[i2] * -1.0f;
            i2 = this.f4221j[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // p006b.p022e.p026b.C0843b.AbstractC0844a
    /* renamed from: k */
    public int mo5051k() {
        return this.f4222k;
    }

    /* renamed from: p */
    public int mo5124p(C0855i iVar) {
        int[] iArr;
        if (this.f4222k == 0) {
            return -1;
        }
        int i = iVar.f4194d;
        int i2 = this.f4216e[i % this.f4215d];
        if (i2 == -1) {
            return -1;
        }
        if (this.f4218g[i2] == i) {
            return i2;
        }
        while (true) {
            iArr = this.f4217f;
            if (iArr[i2] != -1 && this.f4218g[iArr[i2]] != i) {
                i2 = iArr[i2];
            }
        }
        if (iArr[i2] != -1 && this.f4218g[iArr[i2]] == i) {
            return iArr[i2];
        }
        return -1;
    }

    public String toString() {
        StringBuilder sb;
        String str = hashCode() + " { ";
        int i = this.f4222k;
        for (int i2 = 0; i2 < i; i2++) {
            C0855i f = mo5046f(i2);
            if (f != null) {
                String str2 = str + f + " = " + mo5040a(i2) + " ";
                int p = mo5124p(f);
                String str3 = str2 + "[p: ";
                if (this.f4220i[p] != -1) {
                    sb = new StringBuilder();
                    sb.append(str3);
                    sb.append(this.f4225n.f4156d[this.f4218g[this.f4220i[p]]]);
                } else {
                    sb = new StringBuilder();
                    sb.append(str3);
                    sb.append("none");
                }
                String str4 = sb.toString() + ", n: ";
                str = (this.f4221j[p] != -1 ? str4 + this.f4225n.f4156d[this.f4218g[this.f4221j[p]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }
}
