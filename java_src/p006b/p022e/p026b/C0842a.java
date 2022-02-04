package p006b.p022e.p026b;

import java.util.Arrays;
import p006b.p022e.p026b.C0843b;

/* renamed from: b.e.b.a */
public class C0842a implements C0843b.AbstractC0844a {

    /* renamed from: a */
    private static float f4135a = 0.001f;

    /* renamed from: b */
    int f4136b = 0;

    /* renamed from: c */
    private final C0843b f4137c;

    /* renamed from: d */
    protected final C0845c f4138d;

    /* renamed from: e */
    private int f4139e = 8;

    /* renamed from: f */
    private C0855i f4140f = null;

    /* renamed from: g */
    private int[] f4141g = new int[8];

    /* renamed from: h */
    private int[] f4142h = new int[8];

    /* renamed from: i */
    private float[] f4143i = new float[8];

    /* renamed from: j */
    private int f4144j = -1;

    /* renamed from: k */
    private int f4145k = -1;

    /* renamed from: l */
    private boolean f4146l = false;

    C0842a(C0843b bVar, C0845c cVar) {
        this.f4137c = bVar;
        this.f4138d = cVar;
    }

    @Override // p006b.p022e.p026b.C0843b.AbstractC0844a
    /* renamed from: a */
    public float mo5040a(int i) {
        int i2 = this.f4144j;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f4136b) {
            if (i3 == i) {
                return this.f4143i[i2];
            }
            i2 = this.f4142h[i2];
            i3++;
        }
        return 0.0f;
    }

    @Override // p006b.p022e.p026b.C0843b.AbstractC0844a
    /* renamed from: b */
    public float mo5041b(C0843b bVar, boolean z) {
        float g = mo5047g(bVar.f4147a);
        mo5044d(bVar.f4147a, z);
        C0843b.AbstractC0844a aVar = bVar.f4151e;
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
        int i = this.f4144j;
        if (i == -1) {
            this.f4144j = 0;
            this.f4143i[0] = f;
            this.f4141g[0] = iVar.f4194d;
            this.f4142h[0] = -1;
            iVar.f4204n++;
            iVar.mo5117a(this.f4137c);
            this.f4136b++;
            if (!this.f4146l) {
                int i2 = this.f4145k + 1;
                this.f4145k = i2;
                int[] iArr = this.f4141g;
                if (i2 >= iArr.length) {
                    this.f4146l = true;
                    this.f4145k = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i3 = 0;
        int i4 = -1;
        while (i != -1 && i3 < this.f4136b) {
            int[] iArr2 = this.f4141g;
            int i5 = iArr2[i];
            int i6 = iVar.f4194d;
            if (i5 == i6) {
                this.f4143i[i] = f;
                return;
            }
            if (iArr2[i] < i6) {
                i4 = i;
            }
            i = this.f4142h[i];
            i3++;
        }
        int i7 = this.f4145k;
        int i8 = i7 + 1;
        if (this.f4146l) {
            int[] iArr3 = this.f4141g;
            if (iArr3[i7] != -1) {
                i7 = iArr3.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr4 = this.f4141g;
        if (i7 >= iArr4.length && this.f4136b < iArr4.length) {
            int i9 = 0;
            while (true) {
                int[] iArr5 = this.f4141g;
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
        int[] iArr6 = this.f4141g;
        if (i7 >= iArr6.length) {
            i7 = iArr6.length;
            int i10 = this.f4139e * 2;
            this.f4139e = i10;
            this.f4146l = false;
            this.f4145k = i7 - 1;
            this.f4143i = Arrays.copyOf(this.f4143i, i10);
            this.f4141g = Arrays.copyOf(this.f4141g, this.f4139e);
            this.f4142h = Arrays.copyOf(this.f4142h, this.f4139e);
        }
        this.f4141g[i7] = iVar.f4194d;
        this.f4143i[i7] = f;
        int[] iArr7 = this.f4142h;
        if (i4 != -1) {
            iArr7[i7] = iArr7[i4];
            iArr7[i4] = i7;
        } else {
            iArr7[i7] = this.f4144j;
            this.f4144j = i7;
        }
        iVar.f4204n++;
        iVar.mo5117a(this.f4137c);
        int i11 = this.f4136b + 1;
        this.f4136b = i11;
        if (!this.f4146l) {
            this.f4145k++;
        }
        int[] iArr8 = this.f4141g;
        if (i11 >= iArr8.length) {
            this.f4146l = true;
        }
        if (this.f4145k >= iArr8.length) {
            this.f4146l = true;
            this.f4145k = iArr8.length - 1;
        }
    }

    @Override // p006b.p022e.p026b.C0843b.AbstractC0844a
    public final void clear() {
        int i = this.f4144j;
        int i2 = 0;
        while (i != -1 && i2 < this.f4136b) {
            C0855i iVar = this.f4138d.f4156d[this.f4141g[i]];
            if (iVar != null) {
                iVar.mo5118c(this.f4137c);
            }
            i = this.f4142h[i];
            i2++;
        }
        this.f4144j = -1;
        this.f4145k = -1;
        this.f4146l = false;
        this.f4136b = 0;
    }

    @Override // p006b.p022e.p026b.C0843b.AbstractC0844a
    /* renamed from: d */
    public final float mo5044d(C0855i iVar, boolean z) {
        if (this.f4140f == iVar) {
            this.f4140f = null;
        }
        int i = this.f4144j;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f4136b) {
            if (this.f4141g[i] == iVar.f4194d) {
                if (i == this.f4144j) {
                    this.f4144j = this.f4142h[i];
                } else {
                    int[] iArr = this.f4142h;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    iVar.mo5118c(this.f4137c);
                }
                iVar.f4204n--;
                this.f4136b--;
                this.f4141g[i] = -1;
                if (this.f4146l) {
                    this.f4145k = i;
                }
                return this.f4143i[i];
            }
            i2++;
            i3 = i;
            i = this.f4142h[i];
        }
        return 0.0f;
    }

    @Override // p006b.p022e.p026b.C0843b.AbstractC0844a
    /* renamed from: e */
    public void mo5045e(C0855i iVar, float f, boolean z) {
        float f2 = f4135a;
        if (f <= (-f2) || f >= f2) {
            int i = this.f4144j;
            if (i == -1) {
                this.f4144j = 0;
                this.f4143i[0] = f;
                this.f4141g[0] = iVar.f4194d;
                this.f4142h[0] = -1;
                iVar.f4204n++;
                iVar.mo5117a(this.f4137c);
                this.f4136b++;
                if (!this.f4146l) {
                    int i2 = this.f4145k + 1;
                    this.f4145k = i2;
                    int[] iArr = this.f4141g;
                    if (i2 >= iArr.length) {
                        this.f4146l = true;
                        this.f4145k = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i3 = 0;
            int i4 = -1;
            while (i != -1 && i3 < this.f4136b) {
                int[] iArr2 = this.f4141g;
                int i5 = iArr2[i];
                int i6 = iVar.f4194d;
                if (i5 == i6) {
                    float[] fArr = this.f4143i;
                    float f3 = fArr[i] + f;
                    float f4 = f4135a;
                    if (f3 > (-f4) && f3 < f4) {
                        f3 = 0.0f;
                    }
                    fArr[i] = f3;
                    if (f3 == 0.0f) {
                        if (i == this.f4144j) {
                            this.f4144j = this.f4142h[i];
                        } else {
                            int[] iArr3 = this.f4142h;
                            iArr3[i4] = iArr3[i];
                        }
                        if (z) {
                            iVar.mo5118c(this.f4137c);
                        }
                        if (this.f4146l) {
                            this.f4145k = i;
                        }
                        iVar.f4204n--;
                        this.f4136b--;
                        return;
                    }
                    return;
                }
                if (iArr2[i] < i6) {
                    i4 = i;
                }
                i = this.f4142h[i];
                i3++;
            }
            int i7 = this.f4145k;
            int i8 = i7 + 1;
            if (this.f4146l) {
                int[] iArr4 = this.f4141g;
                if (iArr4[i7] != -1) {
                    i7 = iArr4.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr5 = this.f4141g;
            if (i7 >= iArr5.length && this.f4136b < iArr5.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr6 = this.f4141g;
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
            int[] iArr7 = this.f4141g;
            if (i7 >= iArr7.length) {
                i7 = iArr7.length;
                int i10 = this.f4139e * 2;
                this.f4139e = i10;
                this.f4146l = false;
                this.f4145k = i7 - 1;
                this.f4143i = Arrays.copyOf(this.f4143i, i10);
                this.f4141g = Arrays.copyOf(this.f4141g, this.f4139e);
                this.f4142h = Arrays.copyOf(this.f4142h, this.f4139e);
            }
            this.f4141g[i7] = iVar.f4194d;
            this.f4143i[i7] = f;
            int[] iArr8 = this.f4142h;
            if (i4 != -1) {
                iArr8[i7] = iArr8[i4];
                iArr8[i4] = i7;
            } else {
                iArr8[i7] = this.f4144j;
                this.f4144j = i7;
            }
            iVar.f4204n++;
            iVar.mo5117a(this.f4137c);
            this.f4136b++;
            if (!this.f4146l) {
                this.f4145k++;
            }
            int i11 = this.f4145k;
            int[] iArr9 = this.f4141g;
            if (i11 >= iArr9.length) {
                this.f4146l = true;
                this.f4145k = iArr9.length - 1;
            }
        }
    }

    @Override // p006b.p022e.p026b.C0843b.AbstractC0844a
    /* renamed from: f */
    public C0855i mo5046f(int i) {
        int i2 = this.f4144j;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f4136b) {
            if (i3 == i) {
                return this.f4138d.f4156d[this.f4141g[i2]];
            }
            i2 = this.f4142h[i2];
            i3++;
        }
        return null;
    }

    @Override // p006b.p022e.p026b.C0843b.AbstractC0844a
    /* renamed from: g */
    public final float mo5047g(C0855i iVar) {
        int i = this.f4144j;
        int i2 = 0;
        while (i != -1 && i2 < this.f4136b) {
            if (this.f4141g[i] == iVar.f4194d) {
                return this.f4143i[i];
            }
            i = this.f4142h[i];
            i2++;
        }
        return 0.0f;
    }

    @Override // p006b.p022e.p026b.C0843b.AbstractC0844a
    /* renamed from: h */
    public boolean mo5048h(C0855i iVar) {
        int i = this.f4144j;
        if (i == -1) {
            return false;
        }
        int i2 = 0;
        while (i != -1 && i2 < this.f4136b) {
            if (this.f4141g[i] == iVar.f4194d) {
                return true;
            }
            i = this.f4142h[i];
            i2++;
        }
        return false;
    }

    @Override // p006b.p022e.p026b.C0843b.AbstractC0844a
    /* renamed from: i */
    public void mo5049i(float f) {
        int i = this.f4144j;
        int i2 = 0;
        while (i != -1 && i2 < this.f4136b) {
            float[] fArr = this.f4143i;
            fArr[i] = fArr[i] / f;
            i = this.f4142h[i];
            i2++;
        }
    }

    @Override // p006b.p022e.p026b.C0843b.AbstractC0844a
    /* renamed from: j */
    public void mo5050j() {
        int i = this.f4144j;
        int i2 = 0;
        while (i != -1 && i2 < this.f4136b) {
            float[] fArr = this.f4143i;
            fArr[i] = fArr[i] * -1.0f;
            i = this.f4142h[i];
            i2++;
        }
    }

    @Override // p006b.p022e.p026b.C0843b.AbstractC0844a
    /* renamed from: k */
    public int mo5051k() {
        return this.f4136b;
    }

    public String toString() {
        int i = this.f4144j;
        String str = "";
        int i2 = 0;
        while (i != -1 && i2 < this.f4136b) {
            str = ((str + " -> ") + this.f4143i[i] + " : ") + this.f4138d.f4156d[this.f4141g[i]];
            i = this.f4142h[i];
            i2++;
        }
        return str;
    }
}
