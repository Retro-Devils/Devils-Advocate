package com.bumptech.glide.p136n;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: com.bumptech.glide.n.d */
public class C2000d {

    /* renamed from: a */
    private final byte[] f7389a = new byte[256];

    /* renamed from: b */
    private ByteBuffer f7390b;

    /* renamed from: c */
    private C1999c f7391c;

    /* renamed from: d */
    private int f7392d = 0;

    /* renamed from: b */
    private boolean m9033b() {
        return this.f7391c.f7377b != 0;
    }

    /* renamed from: d */
    private int m9034d() {
        try {
            return this.f7390b.get() & 255;
        } catch (Exception unused) {
            this.f7391c.f7377b = 1;
            return 0;
        }
    }

    /* renamed from: e */
    private void m9035e() {
        this.f7391c.f7379d.f7365a = m9044n();
        this.f7391c.f7379d.f7366b = m9044n();
        this.f7391c.f7379d.f7367c = m9044n();
        this.f7391c.f7379d.f7368d = m9044n();
        int d = m9034d();
        boolean z = false;
        boolean z2 = (d & 128) != 0;
        int pow = (int) Math.pow(2.0d, (double) ((d & 7) + 1));
        C1998b bVar = this.f7391c.f7379d;
        if ((d & 64) != 0) {
            z = true;
        }
        bVar.f7369e = z;
        if (z2) {
            bVar.f7375k = m9037g(pow);
        } else {
            bVar.f7375k = null;
        }
        this.f7391c.f7379d.f7374j = this.f7390b.position();
        m9047r();
        if (!m9033b()) {
            C1999c cVar = this.f7391c;
            cVar.f7378c++;
            cVar.f7380e.add(cVar.f7379d);
        }
    }

    /* renamed from: f */
    private void m9036f() {
        int d = m9034d();
        this.f7392d = d;
        if (d > 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                try {
                    int i3 = this.f7392d;
                    if (i < i3) {
                        i2 = i3 - i;
                        this.f7390b.get(this.f7389a, i, i2);
                        i += i2;
                    } else {
                        return;
                    }
                } catch (Exception e) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        Log.d("GifHeaderParser", "Error Reading Block n: " + i + " count: " + i2 + " blockSize: " + this.f7392d, e);
                    }
                    this.f7391c.f7377b = 1;
                    return;
                }
            }
        }
    }

    /* renamed from: g */
    private int[] m9037g(int i) {
        byte[] bArr = new byte[(i * 3)];
        int[] iArr = null;
        try {
            this.f7390b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = i3 + 1;
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                int i7 = i2 + 1;
                iArr[i2] = ((bArr[i3] & 255) << 16) | -16777216 | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
                i3 = i6;
                i2 = i7;
            }
        } catch (BufferUnderflowException e) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e);
            }
            this.f7391c.f7377b = 1;
        }
        return iArr;
    }

    /* renamed from: h */
    private void m9038h() {
        m9039i(Integer.MAX_VALUE);
    }

    /* renamed from: i */
    private void m9039i(int i) {
        boolean z = false;
        while (!z && !m9033b() && this.f7391c.f7378c <= i) {
            int d = m9034d();
            if (d == 33) {
                int d2 = m9034d();
                if (d2 != 1) {
                    if (d2 == 249) {
                        this.f7391c.f7379d = new C1998b();
                        m9040j();
                    } else if (d2 != 254 && d2 == 255) {
                        m9036f();
                        StringBuilder sb = new StringBuilder();
                        for (int i2 = 0; i2 < 11; i2++) {
                            sb.append((char) this.f7389a[i2]);
                        }
                        if (sb.toString().equals("NETSCAPE2.0")) {
                            m9043m();
                        }
                    }
                }
                m9046q();
            } else if (d == 44) {
                C1999c cVar = this.f7391c;
                if (cVar.f7379d == null) {
                    cVar.f7379d = new C1998b();
                }
                m9035e();
            } else if (d != 59) {
                this.f7391c.f7377b = 1;
            } else {
                z = true;
            }
        }
    }

    /* renamed from: j */
    private void m9040j() {
        m9034d();
        int d = m9034d();
        C1998b bVar = this.f7391c.f7379d;
        int i = (d & 28) >> 2;
        bVar.f7371g = i;
        boolean z = true;
        if (i == 0) {
            bVar.f7371g = 1;
        }
        if ((d & 1) == 0) {
            z = false;
        }
        bVar.f7370f = z;
        int n = m9044n();
        if (n < 2) {
            n = 10;
        }
        C1998b bVar2 = this.f7391c.f7379d;
        bVar2.f7373i = n * 10;
        bVar2.f7372h = m9034d();
        m9034d();
    }

    /* renamed from: k */
    private void m9041k() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) m9034d());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.f7391c.f7377b = 1;
            return;
        }
        m9042l();
        if (this.f7391c.f7383h && !m9033b()) {
            C1999c cVar = this.f7391c;
            cVar.f7376a = m9037g(cVar.f7384i);
            C1999c cVar2 = this.f7391c;
            cVar2.f7387l = cVar2.f7376a[cVar2.f7385j];
        }
    }

    /* renamed from: l */
    private void m9042l() {
        this.f7391c.f7381f = m9044n();
        this.f7391c.f7382g = m9044n();
        int d = m9034d();
        C1999c cVar = this.f7391c;
        cVar.f7383h = (d & 128) != 0;
        cVar.f7384i = (int) Math.pow(2.0d, (double) ((d & 7) + 1));
        this.f7391c.f7385j = m9034d();
        this.f7391c.f7386k = m9034d();
    }

    /* renamed from: m */
    private void m9043m() {
        do {
            m9036f();
            byte[] bArr = this.f7389a;
            if (bArr[0] == 1) {
                this.f7391c.f7388m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.f7392d <= 0) {
                return;
            }
        } while (!m9033b());
    }

    /* renamed from: n */
    private int m9044n() {
        return this.f7390b.getShort();
    }

    /* renamed from: o */
    private void m9045o() {
        this.f7390b = null;
        Arrays.fill(this.f7389a, (byte) 0);
        this.f7391c = new C1999c();
        this.f7392d = 0;
    }

    /* renamed from: q */
    private void m9046q() {
        int d;
        do {
            d = m9034d();
            this.f7390b.position(Math.min(this.f7390b.position() + d, this.f7390b.limit()));
        } while (d > 0);
    }

    /* renamed from: r */
    private void m9047r() {
        m9034d();
        m9046q();
    }

    /* renamed from: a */
    public void mo7663a() {
        this.f7390b = null;
        this.f7391c = null;
    }

    /* renamed from: c */
    public C1999c mo7664c() {
        if (this.f7390b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } else if (m9033b()) {
            return this.f7391c;
        } else {
            m9041k();
            if (!m9033b()) {
                m9038h();
                C1999c cVar = this.f7391c;
                if (cVar.f7378c < 0) {
                    cVar.f7377b = 1;
                }
            }
            return this.f7391c;
        }
    }

    /* renamed from: p */
    public C2000d mo7665p(ByteBuffer byteBuffer) {
        m9045o();
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f7390b = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.f7390b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }
}
