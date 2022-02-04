package p155e.p164b.p165a.p167t;

import java.io.DataInputStream;
import p155e.p164b.p165a.C3386c;
import p155e.p164b.p165a.C3388e;

/* renamed from: e.b.a.t.a */
public final class C3404a {

    /* renamed from: a */
    private final byte[] f11471a;

    /* renamed from: b */
    private final int f11472b;

    /* renamed from: c */
    private int f11473c = 0;

    /* renamed from: d */
    private int f11474d = 0;

    /* renamed from: e */
    private int f11475e = 0;

    /* renamed from: f */
    private int f11476f = 0;

    /* renamed from: g */
    private int f11477g = 0;

    /* renamed from: h */
    private int f11478h = 0;

    public C3404a(int i, byte[] bArr, C3386c cVar) {
        this.f11472b = i;
        byte[] a = cVar.mo11366a(i, false);
        this.f11471a = a;
        if (bArr != null) {
            int min = Math.min(bArr.length, i);
            this.f11474d = min;
            this.f11475e = min;
            this.f11473c = min;
            System.arraycopy(bArr, bArr.length - min, a, 0, min);
        }
    }

    /* renamed from: a */
    public void mo11389a(DataInputStream dataInputStream, int i) {
        int min = Math.min(this.f11472b - this.f11474d, i);
        dataInputStream.readFully(this.f11471a, this.f11474d, min);
        int i2 = this.f11474d + min;
        this.f11474d = i2;
        if (this.f11475e < i2) {
            this.f11475e = i2;
        }
    }

    /* renamed from: b */
    public int mo11390b(byte[] bArr, int i) {
        int i2 = this.f11474d;
        int i3 = this.f11473c;
        int i4 = i2 - i3;
        if (i2 == this.f11472b) {
            this.f11474d = 0;
        }
        System.arraycopy(this.f11471a, i3, bArr, i, i4);
        this.f11473c = this.f11474d;
        return i4;
    }

    /* renamed from: c */
    public int mo11391c(int i) {
        int i2 = this.f11474d;
        int i3 = (i2 - i) - 1;
        if (i >= i2) {
            i3 += this.f11472b;
        }
        return this.f11471a[i3] & 255;
    }

    /* renamed from: d */
    public int mo11392d() {
        return this.f11474d;
    }

    /* renamed from: e */
    public boolean mo11393e() {
        return this.f11477g > 0;
    }

    /* renamed from: f */
    public boolean mo11394f() {
        return this.f11474d < this.f11476f;
    }

    /* renamed from: g */
    public void mo11395g(C3386c cVar) {
        cVar.mo11367c(this.f11471a);
    }

    /* renamed from: h */
    public void mo11396h(byte b) {
        byte[] bArr = this.f11471a;
        int i = this.f11474d;
        int i2 = i + 1;
        this.f11474d = i2;
        bArr[i] = b;
        if (this.f11475e < i2) {
            this.f11475e = i2;
        }
    }

    /* renamed from: i */
    public void mo11397i(int i, int i2) {
        int i3;
        if (i < 0 || i >= this.f11475e) {
            throw new C3388e();
        }
        int min = Math.min(this.f11476f - this.f11474d, i2);
        this.f11477g = i2 - min;
        this.f11478h = i;
        int i4 = this.f11474d;
        int i5 = (i4 - i) - 1;
        if (i >= i4) {
            i5 += this.f11472b;
        }
        do {
            byte[] bArr = this.f11471a;
            int i6 = this.f11474d;
            i3 = i6 + 1;
            this.f11474d = i3;
            int i7 = i5 + 1;
            bArr[i6] = bArr[i5];
            i5 = i7 == this.f11472b ? 0 : i7;
            min--;
        } while (min > 0);
        if (this.f11475e < i3) {
            this.f11475e = i3;
        }
    }

    /* renamed from: j */
    public void mo11398j() {
        int i = this.f11477g;
        if (i > 0) {
            mo11397i(this.f11478h, i);
        }
    }

    /* renamed from: k */
    public void mo11399k() {
        this.f11473c = 0;
        this.f11474d = 0;
        this.f11475e = 0;
        this.f11476f = 0;
        this.f11471a[this.f11472b - 1] = 0;
    }

    /* renamed from: l */
    public void mo11400l(int i) {
        int i2 = this.f11472b;
        int i3 = this.f11474d;
        if (i2 - i3 <= i) {
            this.f11476f = i2;
        } else {
            this.f11476f = i3 + i;
        }
    }
}
