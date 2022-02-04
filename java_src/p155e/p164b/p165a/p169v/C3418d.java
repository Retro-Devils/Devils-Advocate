package p155e.p164b.p165a.p169v;

import java.io.DataInputStream;
import java.io.InputStream;
import p155e.p164b.p165a.C3388e;

/* renamed from: e.b.a.v.d */
public final class C3418d extends AbstractC3416b {

    /* renamed from: c */
    private final DataInputStream f11524c;

    public C3418d(InputStream inputStream) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f11524c = dataInputStream;
        if (dataInputStream.readUnsignedByte() == 0) {
            this.f11521b = dataInputStream.readInt();
            this.f11520a = -1;
            return;
        }
        throw new C3388e();
    }

    @Override // p155e.p164b.p165a.p169v.AbstractC3416b
    /* renamed from: f */
    public void mo11422f() {
        if ((this.f11520a & -16777216) == 0) {
            this.f11521b = (this.f11521b << 8) | this.f11524c.readUnsignedByte();
            this.f11520a <<= 8;
        }
    }

    /* renamed from: g */
    public boolean mo11426g() {
        return this.f11521b == 0;
    }
}
