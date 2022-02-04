package p155e.p164b.p165a;

import java.io.IOException;
import java.io.InputStream;
import p155e.p164b.p165a.p170w.AbstractC3424f;

/* renamed from: e.b.a.o */
class C3398o extends InputStream {

    /* renamed from: b */
    private InputStream f11459b;

    /* renamed from: c */
    private final AbstractC3424f f11460c;

    /* renamed from: d */
    private final byte[] f11461d = new byte[4096];

    /* renamed from: e */
    private int f11462e = 0;

    /* renamed from: f */
    private int f11463f = 0;

    /* renamed from: g */
    private int f11464g = 0;

    /* renamed from: h */
    private boolean f11465h = false;

    /* renamed from: i */
    private IOException f11466i = null;

    /* renamed from: j */
    private final byte[] f11467j = new byte[1];

    C3398o(InputStream inputStream, AbstractC3424f fVar) {
        inputStream.getClass();
        this.f11459b = inputStream;
        this.f11460c = fVar;
    }

    @Override // java.io.InputStream
    public int available() {
        if (this.f11459b != null) {
            IOException iOException = this.f11466i;
            if (iOException == null) {
                return this.f11463f;
            }
            throw iOException;
        }
        throw new C3401r("Stream closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() {
        InputStream inputStream = this.f11459b;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.f11459b = null;
            }
        }
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.f11467j, 0, 1) == -1) {
            return -1;
        }
        return this.f11467j[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        } else if (i2 == 0) {
            return 0;
        } else {
            if (this.f11459b != null) {
                IOException iOException = this.f11466i;
                if (iOException == null) {
                    int i4 = 0;
                    while (true) {
                        try {
                            int min = Math.min(this.f11463f, i2);
                            System.arraycopy(this.f11461d, this.f11462e, bArr, i, min);
                            int i5 = this.f11462e + min;
                            this.f11462e = i5;
                            int i6 = this.f11463f - min;
                            this.f11463f = i6;
                            i += min;
                            i2 -= min;
                            i4 += min;
                            int i7 = this.f11464g;
                            if (i5 + i6 + i7 == 4096) {
                                byte[] bArr2 = this.f11461d;
                                System.arraycopy(bArr2, i5, bArr2, 0, i6 + i7);
                                this.f11462e = 0;
                            }
                            if (i2 == 0) {
                                break;
                            } else if (this.f11465h) {
                                break;
                            } else {
                                int i8 = this.f11462e;
                                int i9 = this.f11463f;
                                int i10 = this.f11464g;
                                int read = this.f11459b.read(this.f11461d, i8 + i9 + i10, 4096 - ((i8 + i9) + i10));
                                if (read == -1) {
                                    this.f11465h = true;
                                    this.f11463f = this.f11464g;
                                    this.f11464g = 0;
                                } else {
                                    int i11 = this.f11464g + read;
                                    this.f11464g = i11;
                                    int a = this.f11460c.mo11427a(this.f11461d, this.f11462e, i11);
                                    this.f11463f = a;
                                    this.f11464g -= a;
                                }
                            }
                        } catch (IOException e) {
                            this.f11466i = e;
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
