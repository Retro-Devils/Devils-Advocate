package p155e.p164b.p165a.p170w;

/* renamed from: e.b.a.w.a */
public final class C3419a implements AbstractC3424f {

    /* renamed from: a */
    private final boolean f11525a;

    /* renamed from: b */
    private int f11526b;

    public C3419a(boolean z, int i) {
        this.f11525a = z;
        this.f11526b = i + 8;
    }

    @Override // p155e.p164b.p165a.p170w.AbstractC3424f
    /* renamed from: a */
    public int mo11427a(byte[] bArr, int i, int i2) {
        int i3 = (i2 + i) - 4;
        int i4 = i;
        while (i4 <= i3) {
            if ((bArr[i4 + 3] & 255) == 235) {
                int i5 = i4 + 2;
                int i6 = i4 + 1;
                int i7 = ((((bArr[i5] & 255) << 16) | ((bArr[i6] & 255) << 8)) | (bArr[i4] & 255)) << 2;
                int i8 = (this.f11525a ? i7 + ((this.f11526b + i4) - i) : i7 - ((this.f11526b + i4) - i)) >>> 2;
                bArr[i5] = (byte) (i8 >>> 16);
                bArr[i6] = (byte) (i8 >>> 8);
                bArr[i4] = (byte) i8;
            }
            i4 += 4;
        }
        int i9 = i4 - i;
        this.f11526b += i9;
        return i9;
    }
}
