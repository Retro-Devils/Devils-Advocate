package com.bumptech.glide.p136n;

import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.p136n.AbstractC1996a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: com.bumptech.glide.n.e */
public class C2001e implements AbstractC1996a {

    /* renamed from: a */
    private static final String f7393a = "e";

    /* renamed from: b */
    private int[] f7394b;

    /* renamed from: c */
    private final int[] f7395c;

    /* renamed from: d */
    private final AbstractC1996a.AbstractC1997a f7396d;

    /* renamed from: e */
    private ByteBuffer f7397e;

    /* renamed from: f */
    private byte[] f7398f;

    /* renamed from: g */
    private short[] f7399g;

    /* renamed from: h */
    private byte[] f7400h;

    /* renamed from: i */
    private byte[] f7401i;

    /* renamed from: j */
    private byte[] f7402j;

    /* renamed from: k */
    private int[] f7403k;

    /* renamed from: l */
    private int f7404l;

    /* renamed from: m */
    private C1999c f7405m;

    /* renamed from: n */
    private Bitmap f7406n;

    /* renamed from: o */
    private boolean f7407o;

    /* renamed from: p */
    private int f7408p;

    /* renamed from: q */
    private int f7409q;

    /* renamed from: r */
    private int f7410r;

    /* renamed from: s */
    private int f7411s;

    /* renamed from: t */
    private Boolean f7412t;

    /* renamed from: u */
    private Bitmap.Config f7413u;

    public C2001e(AbstractC1996a.AbstractC1997a aVar) {
        this.f7395c = new int[256];
        this.f7413u = Bitmap.Config.ARGB_8888;
        this.f7396d = aVar;
        this.f7405m = new C1999c();
    }

    public C2001e(AbstractC1996a.AbstractC1997a aVar, C1999c cVar, ByteBuffer byteBuffer, int i) {
        this(aVar);
        mo7667r(cVar, byteBuffer, i);
    }

    /* renamed from: j */
    private int m9051j(int i, int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = i; i9 < this.f7409q + i; i9++) {
            byte[] bArr = this.f7402j;
            if (i9 >= bArr.length || i9 >= i2) {
                break;
            }
            int i10 = this.f7394b[bArr[i9] & 255];
            if (i10 != 0) {
                i4 += (i10 >> 24) & 255;
                i5 += (i10 >> 16) & 255;
                i6 += (i10 >> 8) & 255;
                i7 += i10 & 255;
                i8++;
            }
        }
        int i11 = i + i3;
        for (int i12 = i11; i12 < this.f7409q + i11; i12++) {
            byte[] bArr2 = this.f7402j;
            if (i12 >= bArr2.length || i12 >= i2) {
                break;
            }
            int i13 = this.f7394b[bArr2[i12] & 255];
            if (i13 != 0) {
                i4 += (i13 >> 24) & 255;
                i5 += (i13 >> 16) & 255;
                i6 += (i13 >> 8) & 255;
                i7 += i13 & 255;
                i8++;
            }
        }
        if (i8 == 0) {
            return 0;
        }
        return ((i4 / i8) << 24) | ((i5 / i8) << 16) | ((i6 / i8) << 8) | (i7 / i8);
    }

    /* renamed from: k */
    private void m9052k(C1998b bVar) {
        Boolean bool;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr = this.f7403k;
        int i6 = bVar.f7368d;
        int i7 = this.f7409q;
        int i8 = i6 / i7;
        int i9 = bVar.f7366b / i7;
        int i10 = bVar.f7367c / i7;
        int i11 = bVar.f7365a / i7;
        boolean z = this.f7404l == 0;
        int i12 = this.f7411s;
        int i13 = this.f7410r;
        byte[] bArr = this.f7402j;
        int[] iArr2 = this.f7394b;
        Boolean bool2 = this.f7412t;
        int i14 = 8;
        int i15 = 0;
        int i16 = 0;
        int i17 = 1;
        while (true) {
            bool = bool2;
            if (i15 >= i8) {
                break;
            }
            if (bVar.f7369e) {
                if (i16 >= i8) {
                    i = i8;
                    int i18 = i17 + 1;
                    if (i18 == 2) {
                        i17 = i18;
                        i16 = 4;
                    } else if (i18 != 3) {
                        i17 = i18;
                        if (i18 == 4) {
                            i16 = 1;
                            i14 = 2;
                        }
                    } else {
                        i17 = i18;
                        i16 = 2;
                        i14 = 4;
                    }
                } else {
                    i = i8;
                }
                i2 = i16 + i14;
            } else {
                i = i8;
                i2 = i16;
                i16 = i15;
            }
            int i19 = i16 + i9;
            boolean z2 = i7 == 1;
            if (i19 < i13) {
                int i20 = i19 * i12;
                int i21 = i20 + i11;
                int i22 = i21 + i10;
                int i23 = i20 + i12;
                if (i23 < i22) {
                    i22 = i23;
                }
                i3 = i2;
                int i24 = i15 * i7 * bVar.f7367c;
                if (z2) {
                    int i25 = i21;
                    while (true) {
                        i5 = i9;
                        if (i25 >= i22) {
                            break;
                        }
                        int i26 = iArr2[bArr[i24] & 255];
                        if (i26 != 0) {
                            iArr[i25] = i26;
                        } else if (z && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i24 += i7;
                        i25++;
                        i9 = i5;
                    }
                } else {
                    i5 = i9;
                    int i27 = ((i22 - i21) * i7) + i24;
                    int i28 = i21;
                    while (true) {
                        i4 = i10;
                        if (i28 >= i22) {
                            break;
                        }
                        int j = m9051j(i24, i27, bVar.f7367c);
                        if (j != 0) {
                            iArr[i28] = j;
                        } else if (z && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i24 += i7;
                        i28++;
                        i10 = i4;
                    }
                    bool2 = bool;
                    i15++;
                    i9 = i5;
                    i10 = i4;
                    i8 = i;
                    i16 = i3;
                }
            } else {
                i3 = i2;
                i5 = i9;
            }
            i4 = i10;
            bool2 = bool;
            i15++;
            i9 = i5;
            i10 = i4;
            i8 = i;
            i16 = i3;
        }
        if (this.f7412t == null) {
            this.f7412t = Boolean.valueOf(bool == null ? false : bool.booleanValue());
        }
    }

    /* renamed from: l */
    private void m9053l(C1998b bVar) {
        C1998b bVar2 = bVar;
        int[] iArr = this.f7403k;
        int i = bVar2.f7368d;
        int i2 = bVar2.f7366b;
        int i3 = bVar2.f7367c;
        int i4 = bVar2.f7365a;
        boolean z = this.f7404l == 0;
        int i5 = this.f7411s;
        byte[] bArr = this.f7402j;
        int[] iArr2 = this.f7394b;
        int i6 = 0;
        byte b = -1;
        while (i6 < i) {
            int i7 = (i6 + i2) * i5;
            int i8 = i7 + i4;
            int i9 = i8 + i3;
            int i10 = i7 + i5;
            if (i10 < i9) {
                i9 = i10;
            }
            int i11 = bVar2.f7367c * i6;
            int i12 = i8;
            while (i12 < i9) {
                byte b2 = bArr[i11];
                int i13 = b2 & 255;
                if (i13 != b) {
                    int i14 = iArr2[i13];
                    if (i14 != 0) {
                        iArr[i12] = i14;
                    } else {
                        b = b2;
                    }
                }
                i11++;
                i12++;
                i = i;
            }
            i6++;
            bVar2 = bVar;
        }
        Boolean bool = this.f7412t;
        this.f7412t = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.f7412t == null && z && b != -1));
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:72:0x00f7 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: short[] */
    /* JADX DEBUG: Multi-variable search result rejected for r7v13, resolved type: short */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m */
    private void m9054m(C1998b bVar) {
        int i;
        int i2;
        short s;
        C2001e eVar = this;
        if (bVar != null) {
            eVar.f7397e.position(bVar.f7374j);
        }
        if (bVar == null) {
            C1999c cVar = eVar.f7405m;
            i = cVar.f7381f;
            i2 = cVar.f7382g;
        } else {
            i = bVar.f7367c;
            i2 = bVar.f7368d;
        }
        int i3 = i * i2;
        byte[] bArr = eVar.f7402j;
        if (bArr == null || bArr.length < i3) {
            eVar.f7402j = eVar.f7396d.mo7575e(i3);
        }
        byte[] bArr2 = eVar.f7402j;
        if (eVar.f7399g == null) {
            eVar.f7399g = new short[4096];
        }
        short[] sArr = eVar.f7399g;
        if (eVar.f7400h == null) {
            eVar.f7400h = new byte[4096];
        }
        byte[] bArr3 = eVar.f7400h;
        if (eVar.f7401i == null) {
            eVar.f7401i = new byte[4097];
        }
        byte[] bArr4 = eVar.f7401i;
        int q = m9057q();
        int i4 = 1 << q;
        int i5 = i4 + 1;
        int i6 = i4 + 2;
        int i7 = q + 1;
        int i8 = (1 << i7) - 1;
        int i9 = 0;
        for (int i10 = 0; i10 < i4; i10++) {
            sArr[i10] = 0;
            bArr3[i10] = (byte) i10;
        }
        byte[] bArr5 = eVar.f7398f;
        int i11 = i7;
        int i12 = i6;
        int i13 = i8;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = -1;
        int i20 = 0;
        int i21 = 0;
        while (true) {
            if (i9 >= i3) {
                break;
            }
            if (i14 == 0) {
                i14 = m9056p();
                if (i14 <= 0) {
                    eVar.f7408p = 3;
                    break;
                }
                i15 = 0;
            }
            i17 += (bArr5[i15] & 255) << i16;
            i15++;
            i14--;
            int i22 = i16 + 8;
            int i23 = i12;
            int i24 = i11;
            int i25 = i19;
            int i26 = i20;
            while (true) {
                if (i22 < i24) {
                    i19 = i25;
                    i12 = i23;
                    i16 = i22;
                    eVar = this;
                    i20 = i26;
                    i7 = i7;
                    i11 = i24;
                    break;
                }
                int i27 = i17 & i13;
                i17 >>= i24;
                i22 -= i24;
                if (i27 == i4) {
                    i13 = i8;
                    i24 = i7;
                    i23 = i6;
                    i6 = i23;
                    i25 = -1;
                } else if (i27 == i5) {
                    i16 = i22;
                    i20 = i26;
                    i12 = i23;
                    i7 = i7;
                    i6 = i6;
                    i19 = i25;
                    i11 = i24;
                    eVar = this;
                    break;
                } else if (i25 == -1) {
                    bArr2[i18] = bArr3[i27];
                    i18++;
                    i9++;
                    i25 = i27;
                    i26 = i25;
                    i6 = i6;
                    i22 = i22;
                } else {
                    if (i27 >= i23) {
                        bArr4[i21] = (byte) i26;
                        i21++;
                        s = i25;
                    } else {
                        s = i27;
                    }
                    while (s >= i4) {
                        bArr4[i21] = bArr3[s];
                        i21++;
                        s = sArr[s];
                    }
                    i26 = bArr3[s] & 255;
                    byte b = (byte) i26;
                    bArr2[i18] = b;
                    while (true) {
                        i18++;
                        i9++;
                        if (i21 <= 0) {
                            break;
                        }
                        i21--;
                        bArr2[i18] = bArr4[i21];
                    }
                    if (i23 < 4096) {
                        sArr[i23] = (short) i25;
                        bArr3[i23] = b;
                        i23++;
                        if ((i23 & i13) == 0 && i23 < 4096) {
                            i24++;
                            i13 += i23;
                        }
                    }
                    i25 = i27;
                    i6 = i6;
                    i22 = i22;
                    bArr4 = bArr4;
                }
            }
        }
        Arrays.fill(bArr2, i18, i3, (byte) 0);
    }

    /* renamed from: o */
    private Bitmap m9055o() {
        Boolean bool = this.f7412t;
        Bitmap b = this.f7396d.mo7572b(this.f7411s, this.f7410r, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f7413u);
        b.setHasAlpha(true);
        return b;
    }

    /* renamed from: p */
    private int m9056p() {
        int q = m9057q();
        if (q <= 0) {
            return q;
        }
        ByteBuffer byteBuffer = this.f7397e;
        byteBuffer.get(this.f7398f, 0, Math.min(q, byteBuffer.remaining()));
        return q;
    }

    /* renamed from: q */
    private int m9057q() {
        return this.f7397e.get() & 255;
    }

    /* renamed from: s */
    private Bitmap m9058s(C1998b bVar, C1998b bVar2) {
        int i;
        int i2;
        Bitmap bitmap;
        int[] iArr = this.f7403k;
        int i3 = 0;
        if (bVar2 == null) {
            Bitmap bitmap2 = this.f7406n;
            if (bitmap2 != null) {
                this.f7396d.mo7574d(bitmap2);
            }
            this.f7406n = null;
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && bVar2.f7371g == 3 && this.f7406n == null) {
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && (i2 = bVar2.f7371g) > 0) {
            if (i2 == 2) {
                if (!bVar.f7370f) {
                    C1999c cVar = this.f7405m;
                    int i4 = cVar.f7387l;
                    if (bVar.f7375k == null || cVar.f7385j != bVar.f7372h) {
                        i3 = i4;
                    }
                }
                int i5 = bVar2.f7368d;
                int i6 = this.f7409q;
                int i7 = i5 / i6;
                int i8 = bVar2.f7366b / i6;
                int i9 = bVar2.f7367c / i6;
                int i10 = bVar2.f7365a / i6;
                int i11 = this.f7411s;
                int i12 = (i8 * i11) + i10;
                int i13 = (i7 * i11) + i12;
                while (i12 < i13) {
                    int i14 = i12 + i9;
                    for (int i15 = i12; i15 < i14; i15++) {
                        iArr[i15] = i3;
                    }
                    i12 += this.f7411s;
                }
            } else if (i2 == 3 && (bitmap = this.f7406n) != null) {
                int i16 = this.f7411s;
                bitmap.getPixels(iArr, 0, i16, 0, 0, i16, this.f7410r);
            }
        }
        m9054m(bVar);
        if (bVar.f7369e || this.f7409q != 1) {
            m9052k(bVar);
        } else {
            m9053l(bVar);
        }
        if (this.f7407o && ((i = bVar.f7371g) == 0 || i == 1)) {
            if (this.f7406n == null) {
                this.f7406n = m9055o();
            }
            Bitmap bitmap3 = this.f7406n;
            int i17 = this.f7411s;
            bitmap3.setPixels(iArr, 0, i17, 0, 0, i17, this.f7410r);
        }
        Bitmap o = m9055o();
        int i18 = this.f7411s;
        o.setPixels(iArr, 0, i18, 0, 0, i18, this.f7410r);
        return o;
    }

    @Override // com.bumptech.glide.p136n.AbstractC1996a
    /* renamed from: a */
    public int mo7649a() {
        return this.f7404l;
    }

    @Override // com.bumptech.glide.p136n.AbstractC1996a
    /* renamed from: b */
    public int mo7650b() {
        return this.f7397e.limit() + this.f7402j.length + (this.f7403k.length * 4);
    }

    @Override // com.bumptech.glide.p136n.AbstractC1996a
    /* renamed from: c */
    public void mo7651c(Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.f7413u = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }

    @Override // com.bumptech.glide.p136n.AbstractC1996a
    public void clear() {
        this.f7405m = null;
        byte[] bArr = this.f7402j;
        if (bArr != null) {
            this.f7396d.mo7573c(bArr);
        }
        int[] iArr = this.f7403k;
        if (iArr != null) {
            this.f7396d.mo7576f(iArr);
        }
        Bitmap bitmap = this.f7406n;
        if (bitmap != null) {
            this.f7396d.mo7574d(bitmap);
        }
        this.f7406n = null;
        this.f7397e = null;
        this.f7412t = null;
        byte[] bArr2 = this.f7398f;
        if (bArr2 != null) {
            this.f7396d.mo7573c(bArr2);
        }
    }

    @Override // com.bumptech.glide.p136n.AbstractC1996a
    /* renamed from: d */
    public synchronized Bitmap mo7653d() {
        if (this.f7405m.f7378c <= 0 || this.f7404l < 0) {
            String str = f7393a;
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Unable to decode frame, frameCount=" + this.f7405m.f7378c + ", framePointer=" + this.f7404l);
            }
            this.f7408p = 1;
        }
        int i = this.f7408p;
        if (i != 1) {
            if (i != 2) {
                this.f7408p = 0;
                if (this.f7398f == null) {
                    this.f7398f = this.f7396d.mo7575e(255);
                }
                C1998b bVar = this.f7405m.f7380e.get(this.f7404l);
                int i2 = this.f7404l - 1;
                C1998b bVar2 = i2 >= 0 ? this.f7405m.f7380e.get(i2) : null;
                int[] iArr = bVar.f7375k;
                if (iArr == null) {
                    iArr = this.f7405m.f7376a;
                }
                this.f7394b = iArr;
                if (iArr == null) {
                    String str2 = f7393a;
                    if (Log.isLoggable(str2, 3)) {
                        Log.d(str2, "No valid color table found for frame #" + this.f7404l);
                    }
                    this.f7408p = 1;
                    return null;
                }
                if (bVar.f7370f) {
                    System.arraycopy(iArr, 0, this.f7395c, 0, iArr.length);
                    int[] iArr2 = this.f7395c;
                    this.f7394b = iArr2;
                    iArr2[bVar.f7372h] = 0;
                    if (bVar.f7371g == 2 && this.f7404l == 0) {
                        this.f7412t = Boolean.TRUE;
                    }
                }
                return m9058s(bVar, bVar2);
            }
        }
        String str3 = f7393a;
        if (Log.isLoggable(str3, 3)) {
            Log.d(str3, "Unable to decode frame, status=" + this.f7408p);
        }
        return null;
    }

    @Override // com.bumptech.glide.p136n.AbstractC1996a
    /* renamed from: e */
    public void mo7654e() {
        this.f7404l = (this.f7404l + 1) % this.f7405m.f7378c;
    }

    @Override // com.bumptech.glide.p136n.AbstractC1996a
    /* renamed from: f */
    public int mo7655f() {
        return this.f7405m.f7378c;
    }

    @Override // com.bumptech.glide.p136n.AbstractC1996a
    /* renamed from: g */
    public int mo7656g() {
        int i;
        if (this.f7405m.f7378c <= 0 || (i = this.f7404l) < 0) {
            return 0;
        }
        return mo7666n(i);
    }

    @Override // com.bumptech.glide.p136n.AbstractC1996a
    /* renamed from: h */
    public ByteBuffer mo7657h() {
        return this.f7397e;
    }

    @Override // com.bumptech.glide.p136n.AbstractC1996a
    /* renamed from: i */
    public void mo7658i() {
        this.f7404l = -1;
    }

    /* renamed from: n */
    public int mo7666n(int i) {
        if (i >= 0) {
            C1999c cVar = this.f7405m;
            if (i < cVar.f7378c) {
                return cVar.f7380e.get(i).f7373i;
            }
        }
        return -1;
    }

    /* renamed from: r */
    public synchronized void mo7667r(C1999c cVar, ByteBuffer byteBuffer, int i) {
        if (i > 0) {
            int highestOneBit = Integer.highestOneBit(i);
            this.f7408p = 0;
            this.f7405m = cVar;
            this.f7404l = -1;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f7397e = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            this.f7397e.order(ByteOrder.LITTLE_ENDIAN);
            this.f7407o = false;
            Iterator<C1998b> it = cVar.f7380e.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().f7371g == 3) {
                        this.f7407o = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            this.f7409q = highestOneBit;
            int i2 = cVar.f7381f;
            this.f7411s = i2 / highestOneBit;
            int i3 = cVar.f7382g;
            this.f7410r = i3 / highestOneBit;
            this.f7402j = this.f7396d.mo7575e(i2 * i3);
            this.f7403k = this.f7396d.mo7571a(this.f7411s * this.f7410r);
        } else {
            throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
        }
    }
}
