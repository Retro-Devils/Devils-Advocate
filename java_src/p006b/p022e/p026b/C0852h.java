package p006b.p022e.p026b;

import java.util.Arrays;
import java.util.Comparator;
import p006b.p022e.p026b.C0843b;

/* renamed from: b.e.b.h */
public class C0852h extends C0843b {

    /* renamed from: g */
    private int f4181g = 128;

    /* renamed from: h */
    private C0855i[] f4182h = new C0855i[128];

    /* renamed from: i */
    private C0855i[] f4183i = new C0855i[128];

    /* renamed from: j */
    private int f4184j = 0;

    /* renamed from: k */
    C0854b f4185k = new C0854b(this);

    /* renamed from: l */
    C0845c f4186l;

    /* access modifiers changed from: package-private */
    /* renamed from: b.e.b.h$a */
    public class C0853a implements Comparator<C0855i> {
        C0853a() {
        }

        /* renamed from: a */
        public int compare(C0855i iVar, C0855i iVar2) {
            return iVar.f4194d - iVar2.f4194d;
        }
    }

    /* renamed from: b.e.b.h$b */
    class C0854b implements Comparable {

        /* renamed from: b */
        C0855i f4188b;

        /* renamed from: c */
        C0852h f4189c;

        public C0854b(C0852h hVar) {
            this.f4189c = hVar;
        }

        /* renamed from: a */
        public boolean mo5110a(C0855i iVar, float f) {
            boolean z = true;
            if (this.f4188b.f4192b) {
                for (int i = 0; i < 9; i++) {
                    float[] fArr = this.f4188b.f4200j;
                    fArr[i] = fArr[i] + (iVar.f4200j[i] * f);
                    if (Math.abs(fArr[i]) < 1.0E-4f) {
                        this.f4188b.f4200j[i] = 0.0f;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    C0852h.this.m5015G(this.f4188b);
                }
                return false;
            }
            for (int i2 = 0; i2 < 9; i2++) {
                float f2 = iVar.f4200j[i2];
                if (f2 != 0.0f) {
                    float f3 = f2 * f;
                    if (Math.abs(f3) < 1.0E-4f) {
                        f3 = 0.0f;
                    }
                    this.f4188b.f4200j[i2] = f3;
                } else {
                    this.f4188b.f4200j[i2] = 0.0f;
                }
            }
            return true;
        }

        /* renamed from: b */
        public void mo5111b(C0855i iVar) {
            this.f4188b = iVar;
        }

        /* renamed from: c */
        public final boolean mo5112c() {
            for (int i = 8; i >= 0; i--) {
                float f = this.f4188b.f4200j[i];
                if (f > 0.0f) {
                    return false;
                }
                if (f < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f4188b.f4194d - ((C0855i) obj).f4194d;
        }

        /* renamed from: d */
        public final boolean mo5114d(C0855i iVar) {
            int i = 8;
            while (true) {
                if (i < 0) {
                    break;
                }
                float f = iVar.f4200j[i];
                float f2 = this.f4188b.f4200j[i];
                if (f2 == f) {
                    i--;
                } else if (f2 < f) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: e */
        public void mo5115e() {
            Arrays.fill(this.f4188b.f4200j, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f4188b != null) {
                for (int i = 0; i < 9; i++) {
                    str = str + this.f4188b.f4200j[i] + " ";
                }
            }
            return str + "] " + this.f4188b;
        }
    }

    public C0852h(C0845c cVar) {
        super(cVar);
        this.f4186l = cVar;
    }

    /* renamed from: F */
    private final void m5014F(C0855i iVar) {
        int i;
        int i2 = this.f4184j + 1;
        C0855i[] iVarArr = this.f4182h;
        if (i2 > iVarArr.length) {
            C0855i[] iVarArr2 = (C0855i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f4182h = iVarArr2;
            this.f4183i = (C0855i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        C0855i[] iVarArr3 = this.f4182h;
        int i3 = this.f4184j;
        iVarArr3[i3] = iVar;
        int i4 = i3 + 1;
        this.f4184j = i4;
        if (i4 > 1 && iVarArr3[i4 - 1].f4194d > iVar.f4194d) {
            int i5 = 0;
            while (true) {
                i = this.f4184j;
                if (i5 >= i) {
                    break;
                }
                this.f4183i[i5] = this.f4182h[i5];
                i5++;
            }
            Arrays.sort(this.f4183i, 0, i, new C0853a());
            for (int i6 = 0; i6 < this.f4184j; i6++) {
                this.f4182h[i6] = this.f4183i[i6];
            }
        }
        iVar.f4192b = true;
        iVar.mo5117a(this);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: G */
    private final void m5015G(C0855i iVar) {
        int i = 0;
        while (i < this.f4184j) {
            if (this.f4182h[i] == iVar) {
                while (true) {
                    int i2 = this.f4184j;
                    if (i < i2 - 1) {
                        C0855i[] iVarArr = this.f4182h;
                        int i3 = i + 1;
                        iVarArr[i] = iVarArr[i3];
                        i = i3;
                    } else {
                        this.f4184j = i2 - 1;
                        iVar.f4192b = false;
                        return;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // p006b.p022e.p026b.C0843b
    /* renamed from: C */
    public void mo5055C(C0843b bVar, boolean z) {
        C0855i iVar = bVar.f4147a;
        if (iVar != null) {
            C0843b.AbstractC0844a aVar = bVar.f4151e;
            int k = aVar.mo5051k();
            for (int i = 0; i < k; i++) {
                C0855i f = aVar.mo5046f(i);
                float a = aVar.mo5040a(i);
                this.f4185k.mo5111b(f);
                if (this.f4185k.mo5110a(iVar, a)) {
                    m5014F(f);
                }
                this.f4148b += bVar.f4148b * a;
            }
            m5015G(iVar);
        }
    }

    @Override // p006b.p022e.p026b.C0843b, p006b.p022e.p026b.C0846d.AbstractC0847a
    /* renamed from: b */
    public void mo5058b(C0855i iVar) {
        this.f4185k.mo5111b(iVar);
        this.f4185k.mo5115e();
        iVar.f4200j[iVar.f4196f] = 1.0f;
        m5014F(iVar);
    }

    @Override // p006b.p022e.p026b.C0843b, p006b.p022e.p026b.C0846d.AbstractC0847a
    /* renamed from: c */
    public C0855i mo5059c(C0846d dVar, boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f4184j; i2++) {
            C0855i iVar = this.f4182h[i2];
            if (!zArr[iVar.f4194d]) {
                this.f4185k.mo5111b(iVar);
                C0854b bVar = this.f4185k;
                if (i == -1) {
                    if (!bVar.mo5112c()) {
                    }
                } else if (!bVar.mo5114d(this.f4182h[i])) {
                }
                i = i2;
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f4182h[i];
    }

    @Override // p006b.p022e.p026b.C0843b, p006b.p022e.p026b.C0846d.AbstractC0847a
    public void clear() {
        this.f4184j = 0;
        this.f4148b = 0.0f;
    }

    @Override // p006b.p022e.p026b.C0843b
    public String toString() {
        String str = "" + " goal -> (" + this.f4148b + ") : ";
        for (int i = 0; i < this.f4184j; i++) {
            this.f4185k.mo5111b(this.f4182h[i]);
            str = str + this.f4185k + " ";
        }
        return str;
    }
}
