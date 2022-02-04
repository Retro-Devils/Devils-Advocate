package p155e.p164b.p165a;

import java.io.IOException;
import java.io.InputStream;
import p155e.p164b.p165a.p170w.AbstractC3424f;

/* renamed from: e.b.a.o */
class C3398o extends InputStream {

    /* renamed from: b */
    private InputStream f11468b;

    /* renamed from: c */
    private final AbstractC3424f f11469c;

    /* renamed from: d */
    private final byte[] f11470d = new byte[4096];

    /* renamed from: e */
    private int f11471e = 0;

    /* renamed from: f */
    private int f11472f = 0;

    /* renamed from: g */
    private int f11473g = 0;

    /* renamed from: h */
    private boolean f11474h = false;

    /* renamed from: i */
    private IOException f11475i = null;

    /* renamed from: j */
    private final byte[] f11476j = new byte[1];

    C3398o(InputStream inputStream, AbstractC3424f fVar) {
        inputStream.getClass();
        this.f11468b = inputStream;
        this.f11469c = fVar;
    }

    @Override // java.io.InputStream
    public int available() {
        if (this.f11468b != null) {
            IOException iOException = this.f11475i;
            if (iOException == null) {
                return this.f11472f;
            }
            throw iOException;
        }
        throw new C3401r("Stream closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() {
        InputStream inputStream = this.f11468b;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.f11468b = null;
            }
        }
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.f11476j, 0, 1) == -1) {
            return -1;
        }
        return this.f11476j[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        } else if (i2 == 0) {
            return 0;
        } else {
            if (this.f11468b != null) {
                IOException iOException = this.f11475i;
                if (iOException == null) {
                    int i4 = 0;
                    while (true) {
                        try {
                            int min = Math.min(this.f11472f, i2);
                            System.arraycopy(this.f11470d, this.f11471e, bArr, i, min);
                            int i5 = this.f11471e + min;
                            this.f11471e = i5;
                            int i6 = this.f11472f - min;
                            this.f11472f = i6;
                            i += min;
                            i2 -= min;
                            i4 += min;
                            int i7 = this.f11473g;
                            if (i5 + i6 + i7 == 4096) {
                                byte[] bArr2 = this.f11470d;
                                System.arraycopy(bArr2, i5, bArr2, 0, i6 + i7);
                                this.f11471e = 0;
                            }
                            if (i2 == 0) {
                                break;
                            } else if (this.f11474h) {
                                break;
                            } else {
                                int i8 = this.f11471e;
                                int i9 = this.f11472f;
                                int i10 = this.f11473g;
                                int read = this.f11468b.read(this.f11470d, i8 + i9 + i10, 4096 - ((i8 + i9) + i10));
                                if (read == -1) {
                                    this.f11474h = true;
                                    this.f11472f = this.f11473g;
                                    this.f11473g = 0;
                                } else {
                                    int i11 = this.f11473g + read;
                                    this.f11473g = i11;
                                    int a = this.f11469c.mo11427a(this.f11470d, this.f11471e, i11);
                                    this.f11472f = a;
                                    this.f11473g -= a;
                                }
                            }
                        } catch (IOException e) {
                            this.f11475i = e;
                            throw e;
                        }
                    }
                    if (i4 > 0) {
                        return i4;
                    }
                    return -1;
                }
                throw iOException;
            }
            throw new C3401r("Stream closed");
        }
    }
}
