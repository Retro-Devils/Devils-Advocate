package p155e.p164b.p165a.p169v;

/* renamed from: e.b.a.v.b */
public abstract class AbstractC3416b extends AbstractC3415a {

    /* renamed from: a */
    int f11511a = 0;

    /* renamed from: b */
    int f11512b = 0;

    /* renamed from: b */
    public int mo11418b(short[] sArr, int i) {
        mo11422f();
        short s = sArr[i];
        int i2 = this.f11511a;
        int i3 = (i2 >>> 11) * s;
        int i4 = this.f11512b;
        if ((i4 ^ Integer.MIN_VALUE) < (Integer.MIN_VALUE ^ i3)) {
            this.f11511a = i3;
            sArr[i] = (short) (s + ((2048 - s) >>> 5));
            return 0;
        }
        this.f11511a = i2 - i3;
        this.f11512b = i4 - i3;
        sArr[i] = (short) (s - (s >>> 5));
        return 1;
    }

    /* renamed from: c */
    public int mo11419c(short[] sArr) {
        int i = 1;
        do {
            i = mo11418b(sArr, i) | (i << 1);
        } while (i < sArr.length);
        return i - sArr.length;
    }

    /* renamed from: d */
    public int mo11420d(int i) {
        int i2 = 0;
        do {
            mo11422f();
            int i3 = this.f11511a >>> 1;
            this.f11511a = i3;
            int i4 = this.f11512b;
            int i5 = (i4 - i3) >>> 31;
            this.f11512b = i4 - (i3 & (i5 - 1));
            i2 = (i2 << 1) | (1 - i5);
            i--;
        } while (i != 0);
        return i2;
    }

    /* renamed from: e */
    public int mo11421e(short[] sArr) {
        int i = 0;
        int i2 = 0;
        int i3 = 1;
        while (true) {
            int b = mo11418b(sArr, i3);
            i3 = (i3 << 1) | b;
            int i4 = i2 + 1;
            i |= b << i2;
            if (i3 >= sArr.length) {
                return i;
            }
            i2 = i4;
        }
    }

    /* renamed from: f */
    public abstract void mo11422f();
}
