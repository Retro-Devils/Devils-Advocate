package p006b.p021d;

/* renamed from: b.d.j */
public class C0839j<E> implements Cloneable {

    /* renamed from: b */
    private static final Object f4123b = new Object();

    /* renamed from: c */
    private boolean f4124c;

    /* renamed from: d */
    private int[] f4125d;

    /* renamed from: e */
    private Object[] f4126e;

    /* renamed from: f */
    private int f4127f;

    public C0839j() {
        this(10);
    }

    public C0839j(int i) {
        this.f4124c = false;
        if (i == 0) {
            this.f4125d = C0829e.f4085a;
            this.f4126e = C0829e.f4087c;
            return;
        }
        int e = C0829e.m4848e(i);
        this.f4125d = new int[e];
        this.f4126e = new Object[e];
    }

    /* renamed from: d */
    private void m4908d() {
        int i = this.f4127f;
        int[] iArr = this.f4125d;
        Object[] objArr = this.f4126e;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f4123b) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f4124c = false;
        this.f4127f = i2;
    }

    /* renamed from: a */
    public void mo5025a(int i, E e) {
        int i2 = this.f4127f;
        if (i2 == 0 || i > this.f4125d[i2 - 1]) {
            if (this.f4124c && i2 >= this.f4125d.length) {
                m4908d();
            }
            int i3 = this.f4127f;
            if (i3 >= this.f4125d.length) {
                int e2 = C0829e.m4848e(i3 + 1);
                int[] iArr = new int[e2];
                Object[] objArr = new Object[e2];
                int[] iArr2 = this.f4125d;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f4126e;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f4125d = iArr;
                this.f4126e = objArr;
            }
            this.f4125d[i3] = i;
            this.f4126e[i3] = e;
            this.f4127f = i3 + 1;
            return;
        }
        mo5034j(i, e);
    }

    /* renamed from: b */
    public void mo5026b() {
        int i = this.f4127f;
        Object[] objArr = this.f4126e;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f4127f = 0;
        this.f4124c = false;
    }

    /* renamed from: c */
    public C0839j<E> clone() {
        try {
            C0839j<E> jVar = (C0839j) super.clone();
            jVar.f4125d = (int[]) this.f4125d.clone();
            jVar.f4126e = (Object[]) this.f4126e.clone();
            return jVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: e */
    public E mo5029e(int i) {
        return mo5030f(i, null);
    }

    /* renamed from: f */
    public E mo5030f(int i, E e) {
        int a = C0829e.m4844a(this.f4125d, this.f4127f, i);
        if (a >= 0) {
            Object[] objArr = this.f4126e;
            if (objArr[a] != f4123b) {
                return (E) objArr[a];
            }
        }
        return e;
    }

    /* renamed from: g */
    public int mo5031g(int i) {
        if (this.f4124c) {
            m4908d();
        }
        return C0829e.m4844a(this.f4125d, this.f4127f, i);
    }

    /* renamed from: h */
    public int mo5032h(E e) {
        if (this.f4124c) {
            m4908d();
        }
        for (int i = 0; i < this.f4127f; i++) {
            if (this.f4126e[i] == e) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: i */
    public int mo5033i(int i) {
        if (this.f4124c) {
            m4908d();
        }
        return this.f4125d[i];
    }

    /* renamed from: j */
    public void mo5034j(int i, E e) {
        int a = C0829e.m4844a(this.f4125d, this.f4127f, i);
        if (a >= 0) {
            this.f4126e[a] = e;
            return;
        }
        int i2 = a ^ -1;
        int i3 = this.f4127f;
        if (i2 < i3) {
            Object[] objArr = this.f4126e;
            if (objArr[i2] == f4123b) {
                this.f4125d[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.f4124c && i3 >= this.f4125d.length) {
            m4908d();
            i2 = C0829e.m4844a(this.f4125d, this.f4127f, i) ^ -1;
        }
        int i4 = this.f4127f;
        if (i4 >= this.f4125d.length) {
            int e2 = C0829e.m4848e(i4 + 1);
            int[] iArr = new int[e2];
            Object[] objArr2 = new Object[e2];
            int[] iArr2 = this.f4125d;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f4126e;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f4125d = iArr;
            this.f4126e = objArr2;
        }
        int i5 = this.f4127f;
        if (i5 - i2 != 0) {
            int[] iArr3 = this.f4125d;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr4 = this.f4126e;
            System.arraycopy(objArr4, i2, objArr4, i6, this.f4127f - i2);
        }
        this.f4125d[i2] = i;
        this.f4126e[i2] = e;
        this.f4127f++;
    }

    /* renamed from: k */
    public void mo5035k(int i) {
        Object[] objArr;
        Object obj;
        int a = C0829e.m4844a(this.f4125d, this.f4127f, i);
        if (a >= 0 && (objArr = this.f4126e)[a] != (obj = f4123b)) {
            objArr[a] = obj;
            this.f4124c = true;
        }
    }

    /* renamed from: l */
    public int mo5036l() {
        if (this.f4124c) {
            m4908d();
        }
        return this.f4127f;
    }

    /* renamed from: m */
    public E mo5037m(int i) {
        if (this.f4124c) {
            m4908d();
        }
        return (E) this.f4126e[i];
    }

    public String toString() {
        if (mo5036l() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f4127f * 28);
        sb.append('{');
        for (int i = 0; i < this.f4127f; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo5033i(i));
            sb.append('=');
            E m = mo5037m(i);
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
