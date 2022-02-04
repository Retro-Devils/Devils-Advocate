package p155e.p164b.p165a;

import java.io.IOException;
import java.io.InputStream;
import p155e.p164b.p165a.p167t.C3404a;
import p155e.p164b.p165a.p168u.C3409b;
import p155e.p164b.p165a.p169v.C3418d;

/* renamed from: e.b.a.l */
public class C3395l extends InputStream {

    /* renamed from: b */
    private InputStream f11459b;

    /* renamed from: c */
    private C3386c f11460c;

    /* renamed from: d */
    private C3404a f11461d;

    /* renamed from: e */
    private C3418d f11462e;

    /* renamed from: f */
    private C3409b f11463f;

    /* renamed from: g */
    private boolean f11464g = false;

    /* renamed from: h */
    private final byte[] f11465h = new byte[1];

    /* renamed from: i */
    private long f11466i;

    /* renamed from: j */
    private IOException f11467j = null;

    public C3395l(InputStream inputStream, long j, byte b, int i) {
        m14064b(inputStream, j, b, i, null, C3386c.m14049b());
    }

    /* renamed from: a */
    private static int m14063a(int i) {
        if (i < 0 || i > 2147483632) {
            throw new IllegalArgumentException("LZMA dictionary is too big for this implementation");
        }
        if (i < 4096) {
            i = 4096;
        }
        return (i + 15) & -16;
    }

    /* renamed from: b */
    private void m14064b(InputStream inputStream, long j, byte b, int i, byte[] bArr, C3386c cVar) {
        if (j >= -1) {
            int i2 = b & 255;
            if (i2 <= 224) {
                int i3 = i2 / 45;
                int i4 = i2 - ((i3 * 9) * 5);
                int i5 = i4 / 9;
                int i6 = i4 - (i5 * 9);
                if (i < 0 || i > 2147483632) {
                    throw new C3399p("LZMA dictionary is too big for this implementation");
                }
                m14065c(inputStream, j, i6, i5, i3, i, bArr, cVar);
                return;
            }
            throw new C3388e("Invalid LZMA properties byte");
        }
        throw new C3399p("Uncompressed size is too big");
    }

    /* renamed from: c */
    private void m14065c(InputStream inputStream, long j, int i, int i2, int i3, int i4, byte[] bArr, C3386c cVar) {
        if (j < -1 || i < 0 || i > 8 || i2 < 0 || i2 > 4 || i3 < 0 || i3 > 4) {
            throw new IllegalArgumentException();
        }
        this.f11459b = inputStream;
        this.f11460c = cVar;
        int a = m14063a(i4);
        if (j >= 0 && ((long) a) > j) {
            a = m14063a((int) j);
        }
        this.f11461d = new C3404a(m14063a(a), bArr, cVar);
        C3418d dVar = new C3418d(inputStream);
        this.f11462e = dVar;
        this.f11463f = new C3409b(this.f11461d, dVar, i, i2, i3);
        this.f11466i = j;
    }

    /* renamed from: d */
    private void m14066d() {
        C3404a aVar = this.f11461d;
        if (aVar != null) {
            aVar.mo11395g(this.f11460c);
            this.f11461d = null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() {
        if (this.f11459b != null) {
            m14066d();
            try {
                this.f11459b.close();
            } finally {
                this.f11459b = null;
            }
        }
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.f11465h, 0, 1) == -1) {
            return -1;
        }
        return this.f11465h[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        int i4 = 0;
        if (i2 == 0) {
            return 0;
        }
        if (this.f11459b != null) {
            IOException iOException = this.f11467j;
            if (iOException != null) {
                throw iOException;
            } else if (this.f11464g) {
                return -1;
            } else {
                while (i2 > 0) {
                    try {
                        long j = this.f11466i;
                        this.f11461d.mo11400l((j < 0 || j >= ((long) i2)) ? i2 : (int) j);
                        try {
                            this.f11463f.mo11405e();
                        } catch (C3388e e) {
                            if (this.f11466i != -1 || !this.f11463f.mo11406h()) {
                                throw e;
                            }
                            this.f11464g = true;
                            this.f11462e.mo11422f();
                        }
                        int b = this.f11461d.mo11390b(bArr, i);
                        i += b;
                        i2 -= b;
                        i4 += b;
                        long j2 = this.f11466i;
                        if (j2 >= 0) {
                            long j3 = j2 - ((long) b);
                            this.f11466i = j3;
                            if (j3 == 0) {
                                this.f11464g = true;
                            }
                        }
                        if (this.f11464g) {
                            if (!this.f11462e.mo11426g() || this.f11461d.mo11393e()) {
                                throw new C3388e();
                            }
                            m14066d();
                            if (i4 == 0) {
                                return -1;
                            }
                            return i4;
                        }
                    } catch (IOException e2) {
                        this.f11467j = e2;
                        throw e2;
                    }
                }
                return i4;
            }
        } else {
            throw new C3401r("Stream closed");
        }
    }
}
