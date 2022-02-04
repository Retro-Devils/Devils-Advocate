package p006b.p021d;

/* renamed from: b.d.d */
public final class C0828d {

    /* renamed from: a */
    private int[] f4081a;

    /* renamed from: b */
    private int f4082b;

    /* renamed from: c */
    private int f4083c;

    /* renamed from: d */
    private int f4084d;

    public C0828d() {
        this(8);
    }

    public C0828d(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        } else if (i <= 1073741824) {
            i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
            this.f4084d = i - 1;
            this.f4081a = new int[i];
        } else {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
    }

    /* renamed from: c */
    private void m4837c() {
        int[] iArr = this.f4081a;
        int length = iArr.length;
        int i = this.f4082b;
        int i2 = length - i;
        int i3 = length << 1;
        if (i3 >= 0) {
            int[] iArr2 = new int[i3];
            System.arraycopy(iArr, i, iArr2, 0, i2);
            System.arraycopy(this.f4081a, 0, iArr2, i2, this.f4082b);
            this.f4081a = iArr2;
            this.f4082b = 0;
            this.f4083c = length;
            this.f4084d = i3 - 1;
            return;
        }
        throw new RuntimeException("Max array capacity exceeded");
    }

    /* renamed from: a */
    public void mo4905a(int i) {
        int[] iArr = this.f4081a;
        int i2 = this.f4083c;
        iArr[i2] = i;
        int i3 = this.f4084d & (i2 + 1);
        this.f4083c = i3;
        if (i3 == this.f4082b) {
            m4837c();
        }
    }

    /* renamed from: b */
    public void mo4906b() {
        this.f4083c = this.f4082b;
    }

    /* renamed from: d */
    public int mo4907d(int i) {
        if (i < 0 || i >= mo4910g()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.f4081a[this.f4084d & (this.f4082b + i)];
    }

    /* renamed from: e */
    public int mo4908e() {
        int i = this.f4082b;
        int i2 = this.f4083c;
        if (i != i2) {
            return this.f4081a[(i2 - 1) & this.f4084d];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* renamed from: f */
    public int mo4909f() {
        int i = this.f4082b;
        int i2 = this.f4083c;
        if (i != i2) {
            int i3 = this.f4084d & (i2 - 1);
            int i4 = this.f4081a[i3];
            this.f4083c = i3;
            return i4;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* renamed from: g */
    public int mo4910g() {
        return (this.f4083c - this.f4082b) & this.f4084d;
    }
}
