package p155e.p164b.p165a.p169v;

import java.io.DataInputStream;
import p155e.p164b.p165a.C3386c;
import p155e.p164b.p165a.C3388e;

/* renamed from: e.b.a.v.c */
public final class C3417c extends AbstractC3416b {

    /* renamed from: c */
    private final byte[] f11513c;

    /* renamed from: d */
    private int f11514d;

    public C3417c(int i, C3386c cVar) {
        byte[] a = cVar.mo11366a(i - 5, false);
        this.f11513c = a;
        this.f11514d = a.length;
    }

    @Override // p155e.p164b.p165a.p169v.AbstractC3416b
    /* renamed from: f */
    public void mo11422f() {
        int i = this.f11511a;
        if ((-16777216 & i) == 0) {
            try {
                byte[] bArr = this.f11513c;
                int i2 = this.f11514d;
                this.f11514d = i2 + 1;
                this.f11512b = (this.f11512b << 8) | (bArr[i2] & 255);
                this.f11511a = i << 8;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new C3388e();
            }
        }
    }

    /* renamed from: g */
    public boolean mo11423g() {
        return this.f11514d == this.f11513c.length && this.f11512b == 0;
    }

    /* renamed from: h */
    public void mo11424h(DataInputStream dataInputStream, int i) {
        if (i < 5) {
            throw new C3388e();
        } else if (dataInputStream.readUnsignedByte() == 0) {
            this.f11512b = dataInputStream.readInt();
            this.f11511a = -1;
            int i2 = i - 5;
            byte[] bArr = this.f11513c;
            int length = bArr.length - i2;
            this.f11514d = length;
            dataInputStream.readFully(bArr, length, i2);
        } else {
            throw new C3388e();
        }
    }

    /* renamed from: i */
    public void mo11425i(C3386c cVar) {
        cVar.mo11367c(this.f11513c);
    }
}
