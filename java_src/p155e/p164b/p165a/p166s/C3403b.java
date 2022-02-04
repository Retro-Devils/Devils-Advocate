package p155e.p164b.p165a.p166s;

/* renamed from: e.b.a.s.b */
public class C3403b extends AbstractC3402a {
    public C3403b(int i) {
        super(i);
    }

    /* renamed from: a */
    public void mo11388a(byte[] bArr, int i, int i2) {
        int i3 = i2 + i;
        while (i < i3) {
            byte b = bArr[i];
            byte[] bArr2 = this.f11469b;
            int i4 = this.f11468a;
            int i5 = this.f11470c;
            bArr[i] = (byte) (b + bArr2[(i4 + i5) & 255]);
            this.f11470c = i5 - 1;
            bArr2[i5 & 255] = bArr[i];
            i++;
        }
    }
}
