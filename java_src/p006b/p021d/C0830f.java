package p006b.p021d;

/* renamed from: b.d.f */
public class C0830f<E> implements Cloneable {

    /* renamed from: b */
    private static final Object f4092b = new Object();

    /* renamed from: c */
    private boolean f4093c;

    /* renamed from: d */
    private long[] f4094d;

    /* renamed from: e */
    private Object[] f4095e;

    /* renamed from: f */
    private int f4096f;

    public C0830f() {
        this(10);
    }

    public C0830f(int i) {
        this.f4093c = false;
        if (i == 0) {
            this.f4094d = C0829e.f4090b;
            this.f4095e = C0829e.f4091c;
            return;
        }
        int f = C0829e.m4849f(i);
        this.f4094d = new long[f];
        this.f4095e = new Object[f];
    }

    /* renamed from: d */
    private void m4850d() {
        int i = this.f4096f;
        long[] jArr = this.f4094d;
        Object[] objArr = this.f4095e;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f4092b) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f4093c = false;
        this.f4096f = i2;
    }

    /* renamed from: a */
    public void mo4911a(long j, E e) {
        int i = this.f4096f;
        if (i == 0 || j > this.f4094d[i - 1]) {
            if (this.f4093c && i >= this.f4094d.length) {
                m4850d();
            }
            int i2 = this.f4096f;
            if (i2 >= this.f4094d.length) {
                int f = C0829e.m4849f(i2 + 1);
                long[] jArr = new long[f];
                Object[] objArr = new Object[f];
                long[] jArr2 = this.f4094d;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.f4095e;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f4094d = jArr;
                this.f4095e = objArr;
            }
            this.f4094d[i2] = j;
            this.f4095e[i2] = e;
            this.f4096f = i2 + 1;
            return;
        }
        mo4919i(j, e);
    }

    /* renamed from: b */
    public void mo4912b() {
        int i = this.f4096f;
        Object[] objArr = this.f4095e;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f4096f = 0;
        this.f4093c = false;
    }

    /* renamed from: c */
    public C0830f<E> clone() {
        try {
            C0830f<E> fVar = (C0830f) super.clone();
            fVar.f4094d = (long[]) this.f4094d.clone();
            fVar.f4095e = (Object[]) this.f4095e.clone();
            return fVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: e */
    public E mo4915e(long j) {
        return mo4916f(j, null);
    }

    /* renamed from: f */
    public E mo4916f(long j, E e) {
        int b = C0829e.m4845b(this.f4094d, this.f4096f, j);
        if (b >= 0) {
            Object[] objArr = this.f4095e;
            if (objArr[b] != f4092b) {
                return (E) objArr[b];
            }
        }
        return e;
    }

    /* renamed from: g */
    public int mo4917g(long j) {
        if (this.f4093c) {
            m4850d();
        }
        return C0829e.m4845b(this.f4094d, this.f4096f, j);
    }

    /* renamed from: h */
    public long mo4918h(int i) {
        if (this.f4093c) {
            m4850d();
        }
        return this.f4094d[i];
    }

    /* renamed from: i */
    public void mo4919i(long j, E e) {
        int b = C0829e.m4845b(this.f4094d, this.f4096f, j);
        if (b >= 0) {
            this.f4095e[b] = e;
            return;
        }
        int i = b ^ -1;
        int i2 = this.f4096f;
        if (i < i2) {
            Object[] objArr = this.f4095e;
            if (objArr[i] == f4092b) {
                this.f4094d[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.f4093c && i2 >= this.f4094d.length) {
            m4850d();
            i = C0829e.m4845b(this.f4094d, this.f4096f, j) ^ -1;
        }
        int i3 = this.f4096f;
        if (i3 >= this.f4094d.length) {
            int f = C0829e.m4849f(i3 + 1);
            long[] jArr = new long[f];
            Object[] objArr2 = new Object[f];
            long[] jArr2 = this.f4094d;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f4095e;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f4094d = jArr;
            this.f4095e = objArr2;
        }
        int i4 = this.f4096f;
        if (i4 - i != 0) {
            long[] jArr3 = this.f4094d;
            int i5 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i5, i4 - i);
            Object[] objArr4 = this.f4095e;
            System.arraycopy(objArr4, i, objArr4, i5, this.f4096f - i);
        }
        this.f4094d[i] = j;
        this.f4095e[i] = e;
        this.f4096f++;
    }

    /* renamed from: j */
    public void mo4920j(long j) {
        Object[] objArr;
        Object obj;
        int b = C0829e.m4845b(this.f4094d, this.f4096f, j);
        if (b >= 0 && (objArr = this.f4095e)[b] != (obj = f4092b)) {
            objArr[b] = obj;
            this.f4093c = true;
        }
    }

    /* renamed from: k */
    public void mo4921k(int i) {
        Object[] objArr = this.f4095e;
        Object obj = objArr[i];
        Object obj2 = f4092b;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f4093c = true;
        }
    }

    /* renamed from: l */
    public int mo4922l() {
        if (this.f4093c) {
            m4850d();
        }
        return this.f4096f;
    }

    /* renamed from: m */
    public E mo4923m(int i) {
        if (this.f4093c) {
            m4850d();
        }
        return (E) this.f4095e[i];
    }

    public String toString() {
        if (mo4922l() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f4096f * 28);
        sb.append('{');
        for (int i = 0; i < this.f4096f; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo4918h(i));
            sb.append('=');
            E m = mo4923m(i);
            if (m != this) {
                sb.append((Object) m);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
