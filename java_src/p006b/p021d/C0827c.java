package p006b.p021d;

/* renamed from: b.d.c */
public final class C0827c<E> {

    /* renamed from: a */
    private E[] f4077a;

    /* renamed from: b */
    private int f4078b;

    /* renamed from: c */
    private int f4079c;

    /* renamed from: d */
    private int f4080d;

    public C0827c(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        } else if (i <= 1073741824) {
            i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
            this.f4080d = i - 1;
            this.f4077a = (E[]) new Object[i];
        } else {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
    }

    /* renamed from: d */
    private void m4829d() {
        E[] eArr = this.f4077a;
        int length = eArr.length;
        int i = this.f4078b;
        int i2 = length - i;
        int i3 = length << 1;
        if (i3 >= 0) {
            E[] eArr2 = (E[]) new Object[i3];
            System.arraycopy(eArr, i, eArr2, 0, i2);
            System.arraycopy(this.f4077a, 0, eArr2, i2, this.f4078b);
            this.f4077a = eArr2;
            this.f4078b = 0;
            this.f4079c = length;
            this.f4080d = i3 - 1;
            return;
        }
        throw new RuntimeException("Max array capacity exceeded");
    }

    /* renamed from: a */
    public void mo4898a(E e) {
        int i = (this.f4078b - 1) & this.f4080d;
        this.f4078b = i;
        this.f4077a[i] = e;
        if (i == this.f4079c) {
            m4829d();
        }
    }

    /* renamed from: b */
    public void mo4899b(E e) {
        E[] eArr = this.f4077a;
        int i = this.f4079c;
        eArr[i] = e;
        int i2 = this.f4080d & (i + 1);
        this.f4079c = i2;
        if (i2 == this.f4078b) {
            m4829d();
        }
    }

    /* renamed from: c */
    public void mo4900c() {
        mo4903g(mo4904h());
    }

    /* renamed from: e */
    public E mo4901e(int i) {
        if (i < 0 || i >= mo4904h()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.f4077a[this.f4080d & (this.f4078b + i)];
    }

    /* renamed from: f */
    public void mo4902f(int i) {
        int i2;
        if (i > 0) {
            if (i <= mo4904h()) {
                int i3 = 0;
                int i4 = this.f4079c;
                if (i < i4) {
                    i3 = i4 - i;
                }
                int i5 = i3;
                while (true) {
                    i2 = this.f4079c;
                    if (i5 >= i2) {
                        break;
                    }
                    this.f4077a[i5] = null;
                    i5++;
                }
                int i6 = i2 - i3;
                int i7 = i - i6;
                this.f4079c = i2 - i6;
                if (i7 > 0) {
                    int length = this.f4077a.length;
                    this.f4079c = length;
                    int i8 = length - i7;
                    for (int i9 = i8; i9 < this.f4079c; i9++) {
                        this.f4077a[i9] = null;
                    }
                    this.f4079c = i8;
                    return;
                }
                return;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: g */
    public void mo4903g(int i) {
        if (i > 0) {
            if (i <= mo4904h()) {
                int length = this.f4077a.length;
                int i2 = this.f4078b;
                if (i < length - i2) {
                    length = i2 + i;
                }
                while (i2 < length) {
                    this.f4077a[i2] = null;
                    i2++;
                }
                int i3 = this.f4078b;
                int i4 = length - i3;
                int i5 = i - i4;
                this.f4078b = this.f4080d & (i3 + i4);
                if (i5 > 0) {
                    for (int i6 = 0; i6 < i5; i6++) {
                        this.f4077a[i6] = null;
                    }
                    this.f4078b = i5;
                    return;
                }
                return;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: h */
    public int mo4904h() {
        return (this.f4079c - this.f4078b) & this.f4080d;
    }
}
