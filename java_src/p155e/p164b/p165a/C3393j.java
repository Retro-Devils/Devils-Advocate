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
    private final C3386c f11436b;

    /* renamed from: c */
    private DataInputStream f11437c;

    /* renamed from: d */
    private C3404a f11438d;

    /* renamed from: e */
    private C3417c f11439e;

    /* renamed from: f */
    private C3409b f11440f;

    /* renamed from: g */
    private int f11441g;

    /* renamed from: h */
    private boolean f11442h;

    /* renamed from: i */
    private boolean f11443i;

    /* renamed from: j */
    private boolean f11444j;

    /* renamed from: k */
    private boolean f11445k;

    /* renamed from: l */
    private IOException f11446l;

    /* renamed from: m */
    private final byte[] f11447m;

    public C3393j(InputStream inputStream, int i) {
        this(inputStream, i, null);
    }

    public C3393j(InputStream inputStream, int i, byte[] bArr) {
        this(inputStream, i, bArr, C3386c.m14049b());
    }

    C3393j(InputStream inputStream, int i, byte[] bArr, C3386c cVar) {
        this.f11441g = 0;
        this.f11442h = false;
        this.f11443i = true;
        this.f11444j = true;
        this.f11445k = false;
        this.f11446l = null;
        this.f11447m = new byte[1];
        inputStream.getClass();
        this.f11436b = cVar;
        this.f11437c = new DataInputStream(inputStream);
        this.f11439e = new C3417c(65536, cVar);
        this.f11438d = new C3404a(m14059c(i), bArr, cVar);
        if (bArr != null && bArr.length > 0) {
            this.f11443i = false;
        }
    }

    /* renamed from: a */
    private void m14057a() {
        int readUnsignedByte = this.f11437c.readUnsignedByte();
        if (readUnsignedByte == 0) {
            this.f11445k = true;
            m14060d();
            return;
        }
        if (readUnsignedByte >= 224 || readUnsignedByte == 1) {
            this.f11444j = true;
            this.f11443i = false;
            this.f11438d.mo11399k();
        } else if (this.f11443i) {
            throw new C3388e();
        }
        if (readUnsignedByte >= 128) {
            this.f11442h = true;
            int i = (readUnsignedByte & 31) << 16;
            this.f11441g = i;
            this.f11441g = i + this.f11437c.readUnsignedShort() + 1;
            int readUnsignedShort = this.f11437c.readUnsignedShort() + 1;
            if (readUnsignedByte >= 192) {
                this.f11444j = false;
                m14058b();
            } else if (this.f11444j) {
                throw new C3388e();
            } else if (readUnsignedByte >= 160) {
                this.f11440f.mo11401b();
            }
            this.f11439e.mo11424h(this.f11437c, readUnsignedShort);
        } else if (readUnsignedByte <= 2) {
            this.f11442h = false;
            this.f11441g = this.f11437c.readUnsignedShort() + 1;
        } else {
            throw new C3388e();
        }
    }

    /* renamed from: b */
    private void m14058b() {
        int readUnsignedByte = this.f11437c.readUnsignedByte();
        if (readUnsignedByte <= 224) {
            int i = readUnsignedByte / 45;
            int i2 = readUnsignedByte - ((i * 9) * 5);
            int i3 = i2 / 9;
            int i4 = i2 - (i3 * 9);
            if (i4 + i3 <= 4) {
                this.f11440f = new C3409b(this.f11438d, this.f11439e, i4, i3, i);
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
        C3404a aVar = this.f11438d;
        if (aVar != null) {
            aVar.mo11395g(this.f11436b);
            this.f11438d = null;
            this.f11439e.mo11425i(this.f11436b);
            this.f11439e = null;
        }
    }

    @Override // java.io.InputStream
    public int available() {
        DataInputStream dataInputStream = this.f11437c;
        if (dataInputStream != null) {
            IOException iOException = this.f11446l;
            if (iOException == null) {
                return this.f11442h ? this.f11441g : Math.min(this.f11441g, dataInputStream.available());
            }
            throw iOException;
        }
        throw new C3401r("Stream closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() {
        if (this.f11437c != null) {
            m14060d();
            try {
                this.f11437c.close();
            } finally {
                this.f11437c = null;
            }
        }
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.f11447m, 0, 1) == -1) {
            return -1;
        }
        return this.f11447m[0] & 255;
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
        if (this.f11437c != null) {
            IOException iOException = this.f11446l;
            if (iOException != null) {
                throw iOException;
            } else if (this.f11445k) {
                return -1;
            } else {
                while (i2 > 0) {
                    try {
                        if (this.f11441g == 0) {
                            m14057a();
                            if (this.f11445k) {
                                if (i4 == 0) {
                                    return -1;
                                }
                                return i4;
                            }
                        }
                        int min = Math.min(this.f11441g, i2);
                        if (!this.f11442h) {
                            this.f11438d.mo11389a(this.f11437c, min);
                        } else {
                            this.f11438d.mo11400l(min);
                            this.f11440f.mo11405e();
                        }
                        int b = this.f11438d.mo11390b(bArr, i);
                        i += b;
                        i2 -= b;
                        i4 += b;
                        int i5 = this.f11441g - b;
                        this.f11441g = i5;
                        if (i5 == 0) {
                            if (!this.f11439e.mo11423g() || this.f11438d.mo11393e()) {
                                throw new C3388e();
                            }
                        }
                    } catch (IOException e) {
                        this.f11446l = e;
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
