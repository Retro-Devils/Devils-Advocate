package p155e.p164b.p165a.p167t;

import java.io.DataInputStream;
import p155e.p164b.p165a.C3386c;
import p155e.p164b.p165a.C3388e;

/* renamed from: e.b.a.t.a */
public final class C3404a {

    /* renamed from: a */
    private final byte[] f11480a;

    /* renamed from: b */
    private final int f11481b;

    /* renamed from: c */
    private int f11482c = 0;

    /* renamed from: d */
    private int f11483d = 0;

    /* renamed from: e */
    private int f11484e = 0;

    /* renamed from: f */
    private int f11485f = 0;

    /* renamed from: g */
    private int f11486g = 0;

    /* renamed from: h */
    private int f11487h = 0;

    public C3404a(int i, byte[] bArr, C3386c cVar) {
        this.f11481b = i;
        byte[] a = cVar.mo11366a(i, false);
        this.f11480a = a;
        if (bArr != null) {
            int min = Math.min(bArr.length, i);
            this.f11483d = min;
            this.f11484e = min;
            this.f11482c = min;
            System.arraycopy(bArr, bArr.length - min, a, 0, min);
        }
    }

    /* renamed from: a */
    public void mo11389a(DataInputStream dataInputStream, int i) {
        int min = Math.min(this.f11481b - this.f11483d, i);
        dataInputStream.readFully(this.f11480a, this.f11483d, min);
        int i2 = this.f11483d + min;
        this.f11483d = i2;
        if (this.f11484e < i2) {
            this.f11484e = i2;
        }
    }

    /* renamed from: b */
    public int mo11390b(byte[] bArr, int i) {
        int i2 = this.f11483d;
        int i3 = this.f11482c;
        int i4 = i2 - i3;
        if (i2 == this.f11481b) {
            this.f11483d = 0;
        }
        System.arraycopy(this.f11480a, i3, bArr, i, i4);
        this.f11482c = this.f11483d;
        return i4;
    }

    /* renamed from: c */
    public int mo11391c(int i) {
        int i2 = this.f11483d;
        int i3 = (i2 - i) - 1;
        if (i >= i2) {
            i3 += this.f11481b;
        }
        return this.f11480a[i3] & 255;
    }

    /* renamed from: d */
    public int mo11392d() {
        return this.f11483d;
    }

    /* renamed from: e */
    public boolean mo11393e() {
        return this.f11486g > 0;
    }

    /* renamed from: f */
    public boolean mo11394f() {
        return this.f11483d < this.f11485f;
    }

    /* renamed from: g */
    public void mo11395g(C3386c cVar) {
        cVar.mo11367c(this.f11480a);
    }

    /* renamed from: h */
    public void mo11396h(byte b) {
        byte[] bArr = this.f11480a;
        int i = this.f11483d;
        int i2 = i + 1;
        this.f11483d = i2;
        bArr[i] = b;
        if (this.f11484e < i2) {
            this.f11484e = i2;
        }
    }

    /* renamed from: i */
    public void mo11397i(int i, int i2) {
        int i3;
        if (i < 0 || i >= this.f11484e) {
            throw new C3388e();
        }
        int min = Math.min(this.f11485f - this.f11483d, i2);
        this.f11486g = i2 - min;
        this.f11487h = i;
        int i4 = this.f11483d;
        int i5 = (i4 - i) - 1;
        if (i >= i4) {
            i5 += this.f11481b;
        }
        do {
            byte[] bArr = this.f11480a;
            int i6 = this.f11483d;
            i3 = i6 + 1;
            this.f11483d = i3;
            int i7 = i5 + 1;
            bArr[i6] = bArr[i5];
            i5 = i7 == this.f11481b ? 0 : i7;
            min--;
        } while (min > 0);
        if (this.f11484e < i3) {
            this.f11484e = i3;
        }
    }

    /* renamed from: j */
    public void mo11398j() {
        int i = this.f11486g;
        if (i > 0) {
            mo11397i(this.f11487h, i);
        }
    }

    /* renamed from: k */
    public void mo11399k() {
        this.f11482c = 0;
        this.f11483d = 0;
        this.f11484e = 0;
        this.f11485f = 0;
        this.f11480a[this.f11481b - 1] = 0;
    }

    /* renamed from: l */
    public void mo11400l(int i) {
        int i2 = this.f11481b;
        int i3 = this.f11483d;
        if (i2 - i3 <= i) {
            this.f11485f = i2;
        } else {
            this.f11485f = i3 + i;
        }
    }
}
