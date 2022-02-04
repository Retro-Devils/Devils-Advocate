package p006b.p022e.p026b;

import java.util.Arrays;
import p006b.p022e.p026b.C0843b;

/* renamed from: b.e.b.a */
public class C0842a implements C0843b.AbstractC0844a {

    /* renamed from: a */
    private static float f4131a = 0.001f;

    /* renamed from: b */
    int f4132b = 0;

    /* renamed from: c */
    private final C0843b f4133c;

    /* renamed from: d */
    protected final C0845c f4134d;

    /* renamed from: e */
    private int f4135e = 8;

    /* renamed from: f */
    private C0855i f4136f = null;

    /* renamed from: g */
    private int[] f4137g = new int[8];

    /* renamed from: h */
    private int[] f4138h = new int[8];

    /* renamed from: i */
    private float[] f4139i = new float[8];

    /* renamed from: j */
    private int f4140j = -1;

    /* renamed from: k */
    private int f4141k = -1;

    /* renamed from: l */
    private boolean f4142l = false;

    C0842a(C0843b bVar, C0845c cVar) {
        this.f4133c = bVar;
        this.f4134d = cVar;
    }

    @Override // p006b.p022e.p026b.C0843b.AbstractC0844a
    /* renamed from: a */
    public float mo5040a(int i) {
        int i2 = this.f4140j;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f4132b) {
            if (i3 == i) {
                return this.f4139i[i2];
            }
            i2 = this.f4138h[i2];
            i3++;
        }
        return 0.0f;
    }

    @Override // p006b.p022e.p026b.C0843b.AbstractC0844a
    /* renamed from: b */
    public float mo5041b(C0843b bVar, boolean z) {
        float g = mo5047g(bVar.f4143a);
        mo5044d(bVar.f4143a, z);
        C0843b.AbstractC0844a aVar = bVar.f4147e;
        int k = aVar.mo5051k();
        for (int i = 0; i < k; i++) {
            C0855i f = aVar.mo5046f(i);
            mo5045e(f, aVar.mo5047g(f) * g, z);
        }
        return g;
    }

    @Override // p006b.p022e.p026b.C0843b.AbstractC0844a
    /* renamed from: c */
    public final void mo5042c(C0855i iVar, float f) {
        if (f == 0.0f) {
            mo5044d(iVar, true);
            return;
        }
        int i = this.f4140j;
        if (i == -1) {
            this.f4140j = 0;
            this.f4139i[0] = f;
            this.f4137g[0] = iVar.f4190d;
            this.f4138h[0] = -1;
            iVar.f4200n++;
            iVar.mo5117a(this.f4133c);
            this.f4132b++;
            if (!this.f4142l) {
                int i2 = this.f4141k + 1;
                this.f4141k = i2;
                int[] iArr = this.f4137g;
                if (i2 >= iArr.length) {
                    this.f4142l = true;
                    this.f4141k = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i3 = 0;
        int i4 = -1;
        while (i != -1 && i3 < this.f4132b) {
            int[] iArr2 = this.f4137g;
            int i5 = iArr2[i];
            int i6 = iVar.f4190d;
            if (i5 == i6) {
                this.f4139i[i] = f;
                return;
            }
            if (iArr2[i] < i6) {
                i4 = i;
            }
            i = this.f4138h[i];
            i3++;
        }
        int i7 = this.f4141k;
        int i8 = i7 + 1;
        if (this.f4142l) {
            int[] iArr3 = this.f4137g;
            if (iArr3[i7] != -1) {
                i7 = iArr3.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr4 = this.f4137g;
        if (i7 >= iArr4.length && this.f4132b < iArr4.length) {
            int i9 = 0;
            while (true) {
                int[] iArr5 = this.f4137g;
                if (i9 >= iArr5.length) {
                    break;
                } else if (iArr5[i9] == -1) {
                    i7 = i9;
                    break;
                } else {
                    i9++;
                }
            }
        }
        int[] iArr6 = this.f4137g;
        if (i7 >= iArr6.length) {
            i7 = iArr6.length;
            int i10 = this.f4135e * 2;
            this.f4135e = i10;
            this.f4142l = false;
            this.f4141k = i7 - 1;
            this.f4139i = Arrays.copyOf(this.f4139i, i10);
            this.f4137g = Arrays.copyOf(this.f4137g, this.f4135e);
            this.f4138h = Arrays.copyOf(this.f4138h, this.f4135e);
        }
        this.f4137g[i7] = iVar.f4190d;
        this.f4139i[i7] = f;
        int[] iArr7 = this.f4138h;
        if (i4 != -1) {
            iArr7[i7] = iArr7[i4];
            iArr7[i4] = i7;
        } else {
            iArr7[i7] = this.f4140j;
            this.f4140j = i7;
        }
        iVar.f4200n++;
        iVar.mo5117a(this.f4133c);
        int i11 = this.f4132b + 1;
        this.f4132b = i11;
        if (!this.f4142l) {
            this.f4141k++;
        }
        int[] iArr8 = this.f4137g;
        if (i11 >= iArr8.length) {
            this.f4142l = true;
        }
        if (this.f4141k >= iArr8.length) {
            this.f4142l = true;
            this.f4141k = iArr8.length - 1;
        }
    }

    @Override // p006b.p022e.p026b.C0843b.AbstractC0844a
    public final void clear() {
        int i = this.f4140j;
        int i2 = 0;
        while (i != -1 && i2 < this.f4132b) {
            C0855i iVar = this.f4134d.f4152d[this.f4137g[i]];
            if (iVar != null) {
                iVar.mo5118c(this.f4133c);
            }
            i = this.f4138h[i];
            i2++;
        }
        this.f4140j = -1;
        this.f4141k = -1;
        this.f4142l = false;
        this.f4132b = 0;
    }

    @Override // p006b.p022e.p026b.C0843b.AbstractC0844a
    /* renamed from: d */
    public final float mo5044d(C0855i iVar, boolean z) {
        if (this.f4136f == iVar) {
            this.f4136f = null;
        }
        int i = this.f4140j;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f4132b) {
            if (this.f4137g[i] == iVar.f4190d) {
                if (i == this.f4140j) {
                    this.f4140j = this.f4138h[i];
                } else {
                    int[] iArr = this.f4138h;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    iVar.mo5118c(this.f4133c);
                }
                iVar.f4200n--;
                this.f4132b--;
                this.f4137g[i] = -1;
                if (this.f4142l) {
                    this.f4141k = i;
                }
                return this.f4139i[i];
            }
            i2++;
            i3 = i;
            i = this.f4138h[i];
        }
        return 0.0f;
    }

    @Override // p006b.p022e.p026b.C0843b.AbstractC0844a
    /* renamed from: e */
    public void mo5045e(C0855i iVar, float f, boolean z) {
        float f2 = f4131a;
        if (f <= (-f2) || f >= f2) {
            int i = this.f4140j;
            if (i == -1) {
                this.f4140j = 0;
                this.f4139i[0] = f;
                this.f4137g[0] = iVar.f4190d;
                this.f4138h[0] = -1;
                iVar.f4200n++;
                iVar.mo5117a(this.f4133c);
                this.f4132b++;
                if (!this.f4142l) {
                    int i2 = this.f4141k + 1;
                    this.f4141k = i2;
                    int[] iArr = this.f4137g;
                    if (i2 >= iArr.length) {
                        this.f4142l = true;
                        this.f4141k = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i3 = 0;
            int i4 = -1;
            while (i != -1 && i3 < this.f4132b) {
                int[] iArr2 = this.f4137g;
                int i5 = iArr2[i];
                int i6 = iVar.f4190d;
                if (i5 == i6) {
                    float[] fArr = this.f4139i;
                    float f3 = fArr[i] + f;
                    float f4 = f4131a;
                    if (f3 > (-f4) && f3 < f4) {
                        f3 = 0.0f;
                    }
                    fArr[i] = f3;
                    if (f3 == 0.0f) {
                        if (i == this.f4140j) {
                            this.f4140j = this.f4138h[i];
                        } else {
                            int[] iArr3 = this.f4138h;
                            iArr3[i4] = iArr3[i];
                        }
                        if (z) {
                            iVar.mo5118c(this.f4133c);
                        }
                        if (this.f4142l) {
                            this.f4141k = i;
                        }
                        iVar.f4200n--;
                        this.f4132b--;
                        return;
                    }
                    return;
                }
                if (iArr2[i] < i6) {
                    i4 = i;
                }
                i = this.f4138h[i];
                i3++;
            }
            int i7 = this.f4141k;
            int i8 = i7 + 1;
            if (this.f4142l) {
                int[] iArr4 = this.f4137g;
                if (iArr4[i7] != -1) {
                    i7 = iArr4.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr5 = this.f4137g;
            if (i7 >= iArr5.length && this.f4132b < iArr5.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr6 = this.f4137g;
                    if (i9 >= iArr6.length) {
                        break;
                    } else if (iArr6[i9] == -1) {
                        i7 = i9;
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            int[] iArr7 = this.f4137g;
            if (i7 >= iArr7.length) {
                i7 = iArr7.length;
                int i10 = this.f4135e * 2;
                this.f4135e = i10;
                this.f4142l = false;
                this.f4141k = i7 - 1;
                this.f4139i = Arrays.copyOf(this.f4139i, i10);
                this.f4137g = Arrays.copyOf(this.f4137g, this.f4135e);
                this.f4138h = Arrays.copyOf(this.f4138h, this.f4135e);
            }
            this.f4137g[i7] = iVar.f4190d;
            this.f4139i[i7] = f;
            int[] iArr8 = this.f4138h;
            if (i4 != -1) {
                iArr8[i7] = iArr8[i4];
                iArr8[i4] = i7;
            } else {
                iArr8[i7] = this.f4140j;
                this.f4140j = i7;
            }
            iVar.f4200n++;
            iVar.mo5117a(this.f4133c);
            this.f4132b++;
            if (!this.f4142l) {
                this.f4141k++;
            }
            int i11 = this.f4141k;
            int[] iArr9 = this.f4137g;
            if (i11 >= iArr9.length) {
                this.f4142l = true;
                this.f4141k = iArr9.length - 1;
            }
        }
    }

    @Override // p006b.p022e.p026b.C0843b.AbstractC0844a
    /* renamed from: f */
    public C0855i mo5046f(int i) {
        int i2 = this.f4140j;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f4132b) {
            if (i3 == i) {
                return this.f4134d.f4152d[this.f4137g[i2]];
            }
            i2 = this.f4138h[i2];
            i3++;
        }
        return null;
    }

    @Override // p006b.p022e.p026b.C0843b.AbstractC0844a
    /* renamed from: g */
    public final float mo5047g(C0855i iVar) {
        int i = this.f4140j;
        int i2 = 0;
        while (i != -1 && i2 < this.f4132b) {
            if (this.f4137g[i] == iVar.f4190d) {
                return this.f4139i[i];
            }
            i = this.f4138h[i];
            i2++;
        }
        return 0.0f;
    }

    @Override // p006b.p022e.p026b.C0843b.AbstractC0844a
    /* renamed from: h */
    public boolean mo5048h(C0855i iVar) {
        int i = this.f4140j;
        if (i == -1) {
            return false;
        }
        int i2 = 0;
        while (i != -1 && i2 < this.f4132b) {
            if (this.f4137g[i] == iVar.f4190d) {
                return true;
            }
            i = this.f4138h[i];
            i2++;
        }
        return false;
    }

    @Override // p006b.p022e.p026b.C0843b.AbstractC0844a
    /* renamed from: i */
    public void mo5049i(float f) {
        int i = this.f4140j;
        int i2 = 0;
        while (i != -1 && i2 < this.f4132b) {
            float[] fArr = this.f4139i;
            fArr[i] = fArr[i] / f;
            i = this.f4138h[i];
            i2++;
        }
    }

    @Override // p006b.p022e.p026b.C0843b.AbstractC0844a
    /* renamed from: j */
    public void mo5050j() {
        int i = this.f4140j;
        int i2 = 0;
        while (i != -1 && i2 < this.f4132b) {
            float[] fArr = this.f4139i;
            fArr[i] = fArr[i] * -1.0f;
            i = this.f4138h[i];
            i2++;
        }
    }

    @Override // p006b.p022e.p026b.C0843b.AbstractC0844a
    /* renamed from: k */
    public int mo5051k() {
        return this.f4132b;
    }

    public String toString() {
        int i = this.f4140j;
        String str = "";
        int i2 = 0;
        while (i != -1 && i2 < this.f4132b) {
            str = ((str + " -> ") + this.f4139i[i] + " : ") + this.f4134d.f4152d[this.f4137g[i]];
            i = this.f4138h[i];
            i2++;
        }
        return str;
    }
}
