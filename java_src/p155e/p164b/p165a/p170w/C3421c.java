package p155e.p164b.p165a.p170w;

/* renamed from: e.b.a.w.c */
public final class C3421c implements AbstractC3424f {

    /* renamed from: a */
    private static final int[] f11520a = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 4, 6, 6, 0, 0, 7, 7, 4, 4, 0, 0, 4, 4, 0, 0};

    /* renamed from: b */
    private final boolean f11521b;

    /* renamed from: c */
    private int f11522c;

    public C3421c(boolean z, int i) {
        this.f11521b = z;
        this.f11522c = i;
    }

    @Override // p155e.p164b.p165a.p170w.AbstractC3424f
    /* renamed from: a */
    public int mo11427a(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5 = (i + i2) - 16;
        int i6 = i;
        while (i6 <= i5) {
            int i7 = f11520a[bArr[i6] & 31];
            int i8 = 5;
            int i9 = 0;
            while (i9 < 3) {
                if (((i7 >>> i9) & 1) == 0) {
                    i4 = i6;
                } else {
                    int i10 = i8 >>> 3;
                    int i11 = i8 & 7;
                    long j = 0;
                    int i12 = 0;
                    while (i12 < 6) {
                        j |= (((long) bArr[(i6 + i10) + i12]) & 255) << (i12 * 8);
                        i12++;
                        i6 = i6;
                    }
                    i4 = i6;
                    long j2 = j >>> i11;
                    if (((j2 >>> 37) & 15) == 5 && ((j2 >>> 9) & 7) == 0) {
                        i3 = i9;
                        int i13 = (((((int) (j2 >>> 36)) & 1) << 20) | ((int) ((j2 >>> 13) & 1048575))) << 4;
                        long j3 = (long) ((this.f11521b ? i13 + ((this.f11522c + i4) - i) : i13 - ((this.f11522c + i4) - i)) >>> 4);
                        long j4 = ((((j2 & -77309403137L) | ((j3 & 1048575) << 13)) | ((j3 & 1048576) << 16)) << i11) | (((long) ((1 << i11) - 1)) & j);
                        for (int i14 = 0; i14 < 6; i14++) {
                            bArr[i4 + i10 + i14] = (byte) ((int) (j4 >>> (i14 * 8)));
                        }
                        i9 = i3 + 1;
                        i8 += 41;
                        i6 = i4;
                    }
                }
                i3 = i9;
                i9 = i3 + 1;
                i8 += 41;
                i6 = i4;
            }
            i6 += 16;
        }
        int i15 = i6 - i;
        this.f11522c += i15;
        return i15;
    }
}
