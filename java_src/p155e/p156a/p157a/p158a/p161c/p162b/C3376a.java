package p155e.p156a.p157a.p158a.p161c.p162b;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import p155e.p156a.p157a.p158a.p161c.AbstractC3375a;

/* renamed from: e.a.a.a.c.b.a */
public class C3376a extends AbstractC3375a {

    /* renamed from: A */
    private C3377a f11368A;

    /* renamed from: c */
    private int f11369c;

    /* renamed from: d */
    private int f11370d;

    /* renamed from: e */
    private int f11371e;

    /* renamed from: f */
    private boolean f11372f;

    /* renamed from: g */
    private int f11373g;

    /* renamed from: h */
    private int f11374h;

    /* renamed from: i */
    private final C3378b f11375i;

    /* renamed from: j */
    private int f11376j;

    /* renamed from: k */
    private InputStream f11377k;

    /* renamed from: l */
    private final boolean f11378l;

    /* renamed from: m */
    private int f11379m;

    /* renamed from: n */
    private int f11380n;

    /* renamed from: o */
    private int f11381o;

    /* renamed from: p */
    private int f11382p;

    /* renamed from: q */
    private int f11383q;

    /* renamed from: r */
    private int f11384r;

    /* renamed from: s */
    private int f11385s;

    /* renamed from: t */
    private int f11386t;

    /* renamed from: u */
    private int f11387u;

    /* renamed from: v */
    private int f11388v;

    /* renamed from: w */
    private int f11389w;

    /* renamed from: x */
    private int f11390x;

    /* renamed from: y */
    private int f11391y;

    /* renamed from: z */
    private char f11392z;

    /* access modifiers changed from: private */
    /* renamed from: e.a.a.a.c.b.a$a */
    public static final class C3377a {

        /* renamed from: a */
        final boolean[] f11393a = new boolean[256];

        /* renamed from: b */
        final byte[] f11394b = new byte[256];

        /* renamed from: c */
        final byte[] f11395c = new byte[18002];

        /* renamed from: d */
        final byte[] f11396d = new byte[18002];

        /* renamed from: e */
        final int[] f11397e = new int[256];

        /* renamed from: f */
        final int[][] f11398f = ((int[][]) Array.newInstance(int.class, 6, 258));

        /* renamed from: g */
        final int[][] f11399g = ((int[][]) Array.newInstance(int.class, 6, 258));

        /* renamed from: h */
        final int[][] f11400h = ((int[][]) Array.newInstance(int.class, 6, 258));

        /* renamed from: i */
        final int[] f11401i = new int[6];

        /* renamed from: j */
        final int[] f11402j = new int[257];

        /* renamed from: k */
        final char[] f11403k = new char[256];

        /* renamed from: l */
        final char[][] f11404l = ((char[][]) Array.newInstance(char.class, 6, 258));

        /* renamed from: m */
        final byte[] f11405m = new byte[6];

        /* renamed from: n */
        int[] f11406n;

        /* renamed from: o */
        byte[] f11407o;

        C3377a(int i) {
            this.f11407o = new byte[(i * 100000)];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int[] mo11352a(int i) {
            int[] iArr = this.f11406n;
            if (iArr != null && iArr.length >= i) {
                return iArr;
            }
            int[] iArr2 = new int[i];
            this.f11406n = iArr2;
            return iArr2;
        }
    }

    public C3376a(InputStream inputStream) {
        this(inputStream, false);
    }

    public C3376a(InputStream inputStream, boolean z) {
        this.f11375i = new C3378b();
        this.f11379m = 1;
        this.f11377k = inputStream;
        this.f11378l = z;
        m14028m(true);
        m14029n();
    }

    /* renamed from: c */
    private boolean m14018c() {
        return m14021f(1) != 0;
    }

    /* renamed from: d */
    private int m14019d() {
        return m14021f(8) | (((((m14021f(8) << 8) | m14021f(8)) << 8) | m14021f(8)) << 8);
    }

    /* renamed from: e */
    private char m14020e() {
        return (char) m14021f(8);
    }

    /* renamed from: f */
    private int m14021f(int i) {
        int i2 = this.f11374h;
        int i3 = this.f11373g;
        if (i2 < i) {
            InputStream inputStream = this.f11377k;
            do {
                int read = inputStream.read();
                if (read >= 0) {
                    i3 = (i3 << 8) | read;
                    i2 += 8;
                } else {
                    throw new IOException("unexpected end of stream");
                }
            } while (i2 < i);
            this.f11373g = i3;
        }
        int i4 = i2 - i;
        this.f11374h = i4;
        return ((1 << i) - 1) & (i3 >> i4);
    }

    /* renamed from: g */
    private boolean m14022g() {
        int d = m14019d();
        this.f11381o = d;
        this.f11379m = 0;
        this.f11368A = null;
        if (d == this.f11383q) {
            return !this.f11378l || !m14028m(false);
        }
        throw new IOException("BZip2 CRC error");
    }

    /* renamed from: h */
    private void m14023h(int i, int i2) {
        C3377a aVar = this.f11368A;
        char[][] cArr = aVar.f11404l;
        int[] iArr = aVar.f11401i;
        int[][] iArr2 = aVar.f11398f;
        int[][] iArr3 = aVar.f11399g;
        int[][] iArr4 = aVar.f11400h;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = 32;
            char[] cArr2 = cArr[i3];
            int i5 = i;
            char c = 0;
            while (true) {
                i5--;
                if (i5 < 0) {
                    break;
                }
                char c2 = cArr2[i5];
                if (c2 > c) {
                    c = c2;
                }
                if (c2 < i4) {
                    i4 = c2;
                }
            }
            m14027l(iArr2[i3], iArr3[i3], iArr4[i3], cArr[i3], i4, c, i);
            iArr[i3] = i4;
        }
    }

    /* renamed from: i */
    private void m14024i() {
        int a = this.f11375i.mo11353a();
        this.f11382p = a;
        int i = this.f11380n;
        if (i == a) {
            int i2 = this.f11383q;
            int i3 = (i2 >>> 31) | (i2 << 1);
            this.f11383q = i3;
            this.f11383q = a ^ i3;
            return;
        }
        int i4 = this.f11381o;
        int i5 = (i4 >>> 31) | (i4 << 1);
        this.f11383q = i5;
        this.f11383q = i5 ^ i;
        throw new IOException("BZip2 CRC error");
    }

    /* renamed from: j */
    private void m14025j() {
        int i;
        int i2;
        char c;
        int i3;
        C3376a aVar = this;
        aVar.f11370d = aVar.m14021f(24);
        m14032q();
        InputStream inputStream = aVar.f11377k;
        C3377a aVar2 = aVar.f11368A;
        byte[] bArr = aVar2.f11407o;
        int[] iArr = aVar2.f11397e;
        byte[] bArr2 = aVar2.f11395c;
        byte[] bArr3 = aVar2.f11394b;
        char[] cArr = aVar2.f11403k;
        int[] iArr2 = aVar2.f11401i;
        int[][] iArr3 = aVar2.f11398f;
        int[][] iArr4 = aVar2.f11399g;
        int[][] iArr5 = aVar2.f11400h;
        int i4 = aVar.f11371e * 100000;
        int i5 = 256;
        while (true) {
            i5--;
            if (i5 < 0) {
                break;
            }
            cArr[i5] = (char) i5;
            iArr[i5] = 0;
        }
        int i6 = aVar.f11376j + 1;
        int k = aVar.m14026k(0);
        int i7 = aVar.f11373g;
        int i8 = aVar.f11374h;
        int i9 = bArr2[0] & 255;
        int[] iArr6 = iArr4[i9];
        int[] iArr7 = iArr3[i9];
        int[] iArr8 = iArr5[i9];
        int i10 = i8;
        int i11 = k;
        int i12 = -1;
        int i13 = 0;
        int i14 = 49;
        int i15 = iArr2[i9];
        int i16 = i7;
        while (i11 != i6) {
            int i17 = i16;
            if (i11 == 0 || i11 == 1) {
                int i18 = 1;
                int i19 = -1;
                while (true) {
                    if (i11 == 0) {
                        i19 += i18;
                        i = i12;
                    } else {
                        i = i12;
                        if (i11 == 1) {
                            i19 += i18 << 1;
                        } else {
                            byte b = bArr3[cArr[0]];
                            int i20 = b & 255;
                            iArr[i20] = iArr[i20] + i19 + 1;
                            i12 = i;
                            while (true) {
                                int i21 = i19 - 1;
                                if (i19 < 0) {
                                    break;
                                }
                                i12++;
                                bArr[i12] = b;
                                i19 = i21;
                            }
                            if (i12 < i4) {
                                aVar = this;
                                i6 = i6;
                                i16 = i17;
                                iArr5 = iArr5;
                                bArr2 = bArr2;
                            } else {
                                throw new IOException("block overrun");
                            }
                        }
                    }
                    if (i14 == 0) {
                        i13++;
                        int i22 = bArr2[i13] & 255;
                        iArr6 = iArr4[i22];
                        iArr7 = iArr3[i22];
                        iArr8 = iArr5[i22];
                        i2 = iArr2[i22];
                        i14 = 49;
                    } else {
                        i14--;
                        i2 = i15;
                    }
                    int i23 = i10;
                    while (i23 < i2) {
                        int read = inputStream.read();
                        if (read >= 0) {
                            i17 = (i17 << 8) | read;
                            i23 += 8;
                        } else {
                            throw new IOException("unexpected end of stream");
                        }
                    }
                    int i24 = i23 - i2;
                    i10 = i24;
                    int i25 = (i17 >> i24) & ((1 << i2) - 1);
                    int i26 = i2;
                    while (i25 > iArr7[i26]) {
                        int i27 = i26 + 1;
                        int i28 = i10;
                        while (i28 < 1) {
                            int read2 = inputStream.read();
                            if (read2 >= 0) {
                                i17 = (i17 << 8) | read2;
                                i28 += 8;
                            } else {
                                throw new IOException("unexpected end of stream");
                            }
                        }
                        i10 = i28 - 1;
                        i25 = (i25 << 1) | ((i17 >> i10) & 1);
                        i26 = i27;
                        bArr2 = bArr2;
                    }
                    int i29 = iArr8[i25 - iArr6[i26]];
                    i18 <<= 1;
                    i15 = i2;
                    i12 = i;
                    i11 = i29;
                    iArr5 = iArr5;
                }
            } else {
                i12++;
                if (i12 < i4) {
                    int i30 = i11 - 1;
                    char c2 = cArr[i30];
                    int i31 = bArr3[c2] & 255;
                    iArr[i31] = iArr[i31] + 1;
                    bArr[i12] = bArr3[c2];
                    if (i11 <= 16) {
                        while (i30 > 0) {
                            int i32 = i30 - 1;
                            cArr[i30] = cArr[i32];
                            i30 = i32;
                        }
                        c = 0;
                    } else {
                        c = 0;
                        System.arraycopy(cArr, 0, cArr, 1, i30);
                    }
                    cArr[c] = c2;
                    if (i14 == 0) {
                        i13++;
                        int i33 = bArr2[i13] & 255;
                        int[] iArr9 = iArr4[i33];
                        int[] iArr10 = iArr3[i33];
                        int[] iArr11 = iArr5[i33];
                        i3 = iArr2[i33];
                        iArr6 = iArr9;
                        iArr7 = iArr10;
                        iArr8 = iArr11;
                        i14 = 49;
                    } else {
                        i14--;
                        i3 = i15;
                    }
                    int i34 = i10;
                    while (i34 < i3) {
                        int read3 = inputStream.read();
                        if (read3 >= 0) {
                            i17 = (i17 << 8) | read3;
                            i34 += 8;
                        } else {
                            throw new IOException("unexpected end of stream");
                        }
                    }
                    int i35 = i34 - i3;
                    int i36 = (i17 >> i35) & ((1 << i3) - 1);
                    i10 = i35;
                    int i37 = i3;
                    while (i36 > iArr7[i37]) {
                        i37++;
                        int i38 = i10;
                        while (i38 < 1) {
                            int read4 = inputStream.read();
                            if (read4 >= 0) {
                                i17 = (i17 << 8) | read4;
                                i38 += 8;
                            } else {
                                throw new IOException("unexpected end of stream");
                            }
                        }
                        i10 = i38 - 1;
                        i36 = (i36 << 1) | ((i17 >> i10) & 1);
                        i3 = i3;
                    }
                    i11 = iArr8[i36 - iArr6[i37]];
                    aVar = this;
                    i6 = i6;
                    i16 = i17;
                    i15 = i3;
                } else {
                    throw new IOException("block overrun");
                }
            }
        }
        aVar.f11369c = i12;
        aVar.f11374h = i10;
        aVar.f11373g = i16;
    }

    /* renamed from: k */
    private int m14026k(int i) {
        InputStream inputStream = this.f11377k;
        C3377a aVar = this.f11368A;
        int i2 = aVar.f11395c[i] & 255;
        int[] iArr = aVar.f11398f[i2];
        int i3 = aVar.f11401i[i2];
        int f = m14021f(i3);
        int i4 = this.f11374h;
        int i5 = this.f11373g;
        while (f > iArr[i3]) {
            i3++;
            while (i4 < 1) {
                int read = inputStream.read();
                if (read >= 0) {
                    i5 = (i5 << 8) | read;
                    i4 += 8;
                } else {
                    throw new IOException("unexpected end of stream");
                }
            }
            i4--;
            f = (f << 1) | (1 & (i5 >> i4));
        }
        this.f11374h = i4;
        this.f11373g = i5;
        return aVar.f11400h[i2][f - aVar.f11399g[i2][i3]];
    }

    /* renamed from: l */
    private static void m14027l(int[] iArr, int[] iArr2, int[] iArr3, char[] cArr, int i, int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        for (int i6 = i; i6 <= i2; i6++) {
            for (int i7 = 0; i7 < i3; i7++) {
                if (cArr[i7] == i6) {
                    iArr3[i5] = i7;
                    i5++;
                }
            }
        }
        int i8 = 23;
        while (true) {
            i8--;
            if (i8 <= 0) {
                break;
            }
            iArr2[i8] = 0;
            iArr[i8] = 0;
        }
        for (int i9 = 0; i9 < i3; i9++) {
            int i10 = cArr[i9] + 1;
            iArr2[i10] = iArr2[i10] + 1;
        }
        int i11 = iArr2[0];
        for (int i12 = 1; i12 < 23; i12++) {
            i11 += iArr2[i12];
            iArr2[i12] = i11;
        }
        int i13 = iArr2[i];
        int i14 = i;
        while (i14 <= i2) {
            int i15 = i14 + 1;
            int i16 = iArr2[i15];
            int i17 = i4 + (i16 - i13);
            iArr[i14] = i17 - 1;
            i4 = i17 << 1;
            i14 = i15;
            i13 = i16;
        }
        for (int i18 = i + 1; i18 <= i2; i18++) {
            iArr2[i18] = ((iArr[i18 - 1] + 1) << 1) - iArr2[i18];
        }
    }

    /* renamed from: m */
    private boolean m14028m(boolean z) {
        InputStream inputStream = this.f11377k;
        if (inputStream != null) {
            int read = inputStream.read();
            if (read == -1 && !z) {
                return false;
            }
            int read2 = this.f11377k.read();
            int read3 = this.f11377k.read();
            if (read == 66 && read2 == 90 && read3 == 104) {
                int read4 = this.f11377k.read();
                if (read4 < 49 || read4 > 57) {
                    throw new IOException("BZip2 block size is invalid");
                }
                this.f11371e = read4 - 48;
                this.f11374h = 0;
                this.f11383q = 0;
                return true;
            }
            throw new IOException(z ? "Stream is not in the BZip2 format" : "Garbage after a valid BZip2 stream");
        }
        throw new IOException("No InputStream");
    }

    /* renamed from: n */
    private void m14029n() {
        do {
            char e = m14020e();
            char e2 = m14020e();
            char e3 = m14020e();
            char e4 = m14020e();
            char e5 = m14020e();
            char e6 = m14020e();
            if (e != 23 || e2 != 'r' || e3 != 'E' || e4 != '8' || e5 != 'P' || e6 != 144) {
                boolean z = false;
                if (e == '1' && e2 == 'A' && e3 == 'Y' && e4 == '&' && e5 == 'S' && e6 == 'Y') {
                    this.f11380n = m14019d();
                    if (m14021f(1) == 1) {
                        z = true;
                    }
                    this.f11372f = z;
                    if (this.f11368A == null) {
                        this.f11368A = new C3377a(this.f11371e);
                    }
                    m14025j();
                    this.f11375i.mo11354b();
                    this.f11379m = 1;
                    return;
                }
                this.f11379m = 0;
                throw new IOException("bad block header");
            }
        } while (!m14022g());
    }

    /* renamed from: o */
    private void m14030o() {
        C3377a aVar = this.f11368A;
        boolean[] zArr = aVar.f11393a;
        byte[] bArr = aVar.f11394b;
        int i = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            if (zArr[i2]) {
                bArr[i] = (byte) i2;
                i++;
            }
        }
        this.f11376j = i;
    }

    /* renamed from: p */
    private int m14031p() {
        switch (this.f11379m) {
            case 0:
                return -1;
            case 1:
                return m14033r();
            case 2:
                throw new IllegalStateException();
            case 3:
                return m14038w();
            case 4:
                return m14039x();
            case 5:
                throw new IllegalStateException();
            case 6:
                return m14035t();
            case 7:
                return m14036u();
            default:
                throw new IllegalStateException();
        }
    }

    /* renamed from: q */
    private void m14032q() {
        C3377a aVar = this.f11368A;
        boolean[] zArr = aVar.f11393a;
        byte[] bArr = aVar.f11405m;
        byte[] bArr2 = aVar.f11395c;
        byte[] bArr3 = aVar.f11396d;
        int i = 0;
        for (int i2 = 0; i2 < 16; i2++) {
            if (m14018c()) {
                i |= 1 << i2;
            }
        }
        int i3 = 256;
        while (true) {
            i3--;
            if (i3 < 0) {
                break;
            }
            zArr[i3] = false;
        }
        for (int i4 = 0; i4 < 16; i4++) {
            if (((1 << i4) & i) != 0) {
                int i5 = i4 << 4;
                for (int i6 = 0; i6 < 16; i6++) {
                    if (m14018c()) {
                        zArr[i5 + i6] = true;
                    }
                }
            }
        }
        m14030o();
        int i7 = this.f11376j + 2;
        int f = m14021f(3);
        int f2 = m14021f(15);
        for (int i8 = 0; i8 < f2; i8++) {
            int i9 = 0;
            while (m14018c()) {
                i9++;
            }
            bArr3[i8] = (byte) i9;
        }
        int i10 = f;
        while (true) {
            i10--;
            if (i10 < 0) {
                break;
            }
            bArr[i10] = (byte) i10;
        }
        for (int i11 = 0; i11 < f2; i11++) {
            int i12 = bArr3[i11] & 255;
            byte b = bArr[i12];
            while (i12 > 0) {
                bArr[i12] = bArr[i12 - 1];
                i12--;
            }
            bArr[0] = b;
            bArr2[i11] = b;
        }
        char[][] cArr = aVar.f11404l;
        for (int i13 = 0; i13 < f; i13++) {
            int f3 = m14021f(5);
            char[] cArr2 = cArr[i13];
            for (int i14 = 0; i14 < i7; i14++) {
                while (m14018c()) {
                    f3 += m14018c() ? -1 : 1;
                }
                cArr2[i14] = (char) f3;
            }
        }
        m14023h(i7, f);
    }

    /* renamed from: r */
    private int m14033r() {
        C3377a aVar;
        if (this.f11379m == 0 || (aVar = this.f11368A) == null) {
            return -1;
        }
        int[] iArr = aVar.f11402j;
        int[] a = aVar.mo11352a(this.f11369c + 1);
        C3377a aVar2 = this.f11368A;
        byte[] bArr = aVar2.f11407o;
        iArr[0] = 0;
        System.arraycopy(aVar2.f11397e, 0, iArr, 1, 256);
        int i = iArr[0];
        for (int i2 = 1; i2 <= 256; i2++) {
            i += iArr[i2];
            iArr[i2] = i;
        }
        int i3 = this.f11369c;
        for (int i4 = 0; i4 <= i3; i4++) {
            int i5 = bArr[i4] & 255;
            int i6 = iArr[i5];
            iArr[i5] = i6 + 1;
            a[i6] = i4;
        }
        int i7 = this.f11370d;
        if (i7 < 0 || i7 >= a.length) {
            throw new IOException("stream corrupted");
        }
        this.f11391y = a[i7];
        this.f11384r = 0;
        this.f11387u = 0;
        this.f11385s = 256;
        if (!this.f11372f) {
            return m14034s();
        }
        this.f11389w = 0;
        this.f11390x = 0;
        return m14037v();
    }

    /* renamed from: s */
    private int m14034s() {
        int i = this.f11387u;
        if (i <= this.f11369c) {
            this.f11386t = this.f11385s;
            C3377a aVar = this.f11368A;
            byte[] bArr = aVar.f11407o;
            int i2 = this.f11391y;
            int i3 = bArr[i2] & 255;
            this.f11385s = i3;
            this.f11391y = aVar.f11406n[i2];
            this.f11387u = i + 1;
            this.f11379m = 6;
            this.f11375i.mo11355c(i3);
            return i3;
        }
        this.f11379m = 5;
        m14024i();
        m14029n();
        return m14033r();
    }

    /* renamed from: t */
    private int m14035t() {
        if (this.f11385s != this.f11386t) {
            this.f11384r = 1;
            return m14034s();
        }
        int i = this.f11384r + 1;
        this.f11384r = i;
        if (i < 4) {
            return m14034s();
        }
        C3377a aVar = this.f11368A;
        byte[] bArr = aVar.f11407o;
        int i2 = this.f11391y;
        this.f11392z = (char) (bArr[i2] & 255);
        this.f11391y = aVar.f11406n[i2];
        this.f11388v = 0;
        return m14036u();
    }

    /* renamed from: u */
    private int m14036u() {
        if (this.f11388v < this.f11392z) {
            int i = this.f11385s;
            this.f11375i.mo11355c(i);
            this.f11388v++;
            this.f11379m = 7;
            return i;
        }
        this.f11387u++;
        this.f11384r = 0;
        return m14034s();
    }

    /* renamed from: v */
    private int m14037v() {
        if (this.f11387u <= this.f11369c) {
            this.f11386t = this.f11385s;
            C3377a aVar = this.f11368A;
            byte[] bArr = aVar.f11407o;
            int i = this.f11391y;
            int i2 = bArr[i] & 255;
            this.f11391y = aVar.f11406n[i];
            int i3 = this.f11389w;
            int i4 = 0;
            if (i3 == 0) {
                this.f11389w = C3379c.m14044a(this.f11390x) - 1;
                int i5 = this.f11390x + 1;
                this.f11390x = i5;
                if (i5 == 512) {
                    this.f11390x = 0;
                }
            } else {
                this.f11389w = i3 - 1;
            }
            if (this.f11389w == 1) {
                i4 = 1;
            }
            int i6 = i2 ^ i4;
            this.f11385s = i6;
            this.f11387u++;
            this.f11379m = 3;
            this.f11375i.mo11355c(i6);
            return i6;
        }
        m14024i();
        m14029n();
        return m14033r();
    }

    /* renamed from: w */
    private int m14038w() {
        if (this.f11385s != this.f11386t) {
            this.f11379m = 2;
            this.f11384r = 1;
        } else {
            int i = this.f11384r + 1;
            this.f11384r = i;
            if (i >= 4) {
                C3377a aVar = this.f11368A;
                byte[] bArr = aVar.f11407o;
                int i2 = this.f11391y;
                this.f11392z = (char) (bArr[i2] & 255);
                this.f11391y = aVar.f11406n[i2];
                int i3 = this.f11389w;
                if (i3 == 0) {
                    this.f11389w = C3379c.m14044a(this.f11390x) - 1;
                    int i4 = this.f11390x + 1;
                    this.f11390x = i4;
                    if (i4 == 512) {
                        this.f11390x = 0;
                    }
                } else {
                    this.f11389w = i3 - 1;
                }
                this.f11388v = 0;
                this.f11379m = 4;
                if (this.f11389w == 1) {
                    this.f11392z = (char) (this.f11392z ^ 1);
                }
                return m14039x();
            }
            this.f11379m = 2;
        }
        return m14037v();
    }

    /* renamed from: x */
    private int m14039x() {
        if (this.f11388v < this.f11392z) {
            this.f11375i.mo11355c(this.f11385s);
            this.f11388v++;
            return this.f11385s;
        }
        this.f11379m = 2;
        this.f11387u++;
        this.f11384r = 0;
        return m14037v();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() {
        InputStream inputStream = this.f11377k;
        if (inputStream != null) {
            try {
                if (inputStream != System.in) {
                    inputStream.close();
                }
            } finally {
                this.f11368A = null;
                this.f11377k = null;
            }
        }
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.f11377k != null) {
            int p = m14031p();
            mo11347a(p < 0 ? -1 : 1);
            return p;
        }
        throw new IOException("stream closed");
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        if (i < 0) {
            throw new IndexOutOfBoundsException("offs(" + i + ") < 0.");
        } else if (i2 >= 0) {
            int i3 = i + i2;
            if (i3 > bArr.length) {
                throw new IndexOutOfBoundsException("offs(" + i + ") + len(" + i2 + ") > dest.length(" + bArr.length + ").");
            } else if (this.f11377k == null) {
                throw new IOException("stream closed");
            } else if (i2 == 0) {
                return 0;
            } else {
                int i4 = i;
                while (i4 < i3) {
                    int p = m14031p();
                    if (p < 0) {
                        break;
                    }
                    bArr[i4] = (byte) p;
                    mo11347a(1);
                    i4++;
                }
                if (i4 == i) {
                    return -1;
                }
                return i4 - i;
            }
        } else {
            throw new IndexOutOfBoundsException("len(" + i2 + ") < 0.");
        }
    }
}
