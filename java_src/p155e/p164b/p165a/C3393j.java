package p155e.p164b.p165a;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import p155e.p164b.p165a.p167t.C3404a;
import p155e.p164b.p165a.p168u.C3409b;
import p155e.p164b.p165a.p169v.C3417c;

/* renamed from: e.b.a.j */
public class C3393j extends InputStream {

    /* renamed from: b */
    private final C3386c f11427b;

    /* renamed from: c */
    private DataInputStream f11428c;

    /* renamed from: d */
    private C3404a f11429d;

    /* renamed from: e */
    private C3417c f11430e;

    /* renamed from: f */
    private C3409b f11431f;

    /* renamed from: g */
    private int f11432g;

    /* renamed from: h */
    private boolean f11433h;

    /* renamed from: i */
    private boolean f11434i;

    /* renamed from: j */
    private boolean f11435j;

    /* renamed from: k */
    private boolean f11436k;

    /* renamed from: l */
    private IOException f11437l;

    /* renamed from: m */
    private final byte[] f11438m;

    public C3393j(InputStream inputStream, int i) {
        this(inputStream, i, null);
    }

    public C3393j(InputStream inputStream, int i, byte[] bArr) {
        this(inputStream, i, bArr, C3386c.m14049b());
    }

    C3393j(InputStream inputStream, int i, byte[] bArr, C3386c cVar) {
        this.f11432g = 0;
        this.f11433h = false;
        this.f11434i = true;
        this.f11435j = true;
        this.f11436k = false;
        this.f11437l = null;
        this.f11438m = new byte[1];
        inputStream.getClass();
        this.f11427b = cVar;
        this.f11428c = new DataInputStream(inputStream);
        this.f11430e = new C3417c(65536, cVar);
        this.f11429d = new C3404a(m14059c(i), bArr, cVar);
        if (bArr != null && bArr.length > 0) {
            this.f11434i = false;
        }
    }

    /* renamed from: a */
    private void m14057a() {
        int readUnsignedByte = this.f11428c.readUnsignedByte();
        if (readUnsignedByte == 0) {
            this.f11436k = true;
            m14060d();
            return;
        }
        if (readUnsignedByte >= 224 || readUnsignedByte == 1) {
            this.f11435j = true;
            this.f11434i = false;
            this.f11429d.mo11399k();
        } else if (this.f11434i) {
            throw new C3388e();
        }
        if (readUnsignedByte >= 128) {
            this.f11433h = true;
            int i = (readUnsignedByte & 31) << 16;
            this.f11432g = i;
            this.f11432g = i + this.f11428c.readUnsignedShort() + 1;
            int readUnsignedShort = this.f11428c.readUnsignedShort() + 1;
            if (readUnsignedByte >= 192) {
                this.f11435j = false;
                m14058b();
            } else if (this.f11435j) {
                throw new C3388e();
            } else if (readUnsignedByte >= 160) {
                this.f11431f.mo11401b();
            }
            this.f11430e.mo11424h(this.f11428c, readUnsignedShort);
        } else if (readUnsignedByte <= 2) {
            this.f11433h = false;
            this.f11432g = this.f11428c.readUnsignedShort() + 1;
        } else {
            throw new C3388e();
        }
    }

    /* renamed from: b */
    private void m14058b() {
        int readUnsignedByte = this.f11428c.readUnsignedByte();
        if (readUnsignedByte <= 224) {
            int i = readUnsignedByte / 45;
            int i2 = readUnsignedByte - ((i * 9) * 5);
            int i3 = i2 / 9;
            int i4 = i2 - (i3 * 9);
            if (i4 + i3 <= 4) {
                this.f11431f = new C3409b(this.f11429d, this.f11430e, i4, i3, i);
                return;
            }
            throw new C3388e();
        }
        throw new C3388e();
    }

    /* renamed from: c */
    private static int m14059c(int i) {
        if (i >= 4096 && i <= 2147483632) {
            return (i + 15) & -16;
        }
        throw new IllegalArgumentException("Unsupported dictionary size " + i);
    }

    /* renamed from: d */
    private void m14060d() {
        C3404a aVar = this.f11429d;
        if (aVar != null) {
            aVar.mo11395g(this.f11427b);
            this.f11429d = null;
            this.f11430e.mo11425i(this.f11427b);
            this.f11430e = null;
        }
    }

    @Override // java.io.InputStream
    public int available() {
        DataInputStream dataInputStream = this.f11428c;
        if (dataInputStream != null) {
            IOException iOException = this.f11437l;
            if (iOException == null) {
                return this.f11433h ? this.f11432g : Math.min(this.f11432g, dataInputStream.available());
            }
            throw iOException;
        }
        throw new C3401r("Stream closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() {
        if (this.f11428c != null) {
            m14060d();
            try {
                this.f11428c.close();
            } finally {
                this.f11428c = null;
            }
        }
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.f11438m, 0, 1) == -1) {
            return -1;
        }
        return this.f11438m[0] & 255;
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
        if (this.f11428c != null) {
            IOException iOException = this.f11437l;
            if (iOException != null) {
                throw iOException;
            } else if (this.f11436k) {
                return -1;
            } else {
                while (i2 > 0) {
                    try {
                        if (this.f11432g == 0) {
                            m14057a();
                            if (this.f11436k) {
                                if (i4 == 0) {
                                    return -1;
                                }
                                return i4;
                            }
                        }
                        int min = Math.min(this.f11432g, i2);
                        if (!this.f11433h) {
                            this.f11429d.mo11389a(this.f11428c, min);
                        } else {
                            this.f11429d.mo11400l(min);
                            this.f11431f.mo11405e();
                        }
                        int b = this.f11429d.mo11390b(bArr, i);
                        i += b;
                        i2 -= b;
                        i4 += b;
                        int i5 = this.f11432g - b;
                        this.f11432g = i5;
                        if (i5 == 0) {
                            if (!this.f11430e.mo11423g() || this.f11429d.mo11393e()) {
                                throw new C3388e();
                            }
                        }
                    } catch (IOException e) {
                        this.f11437l = e;
                        throw e;
                    }
                }
                return i4;
            }
        } else {
            throw new C3401r("Stream closed");
        }
    }
}
