package com.bumptech.glide.load.p128q.p129d;

import com.bumptech.glide.load.p122o.p123a0.AbstractC1690b;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.q.d.w */
public class C1945w extends FilterInputStream {

    /* renamed from: b */
    private volatile byte[] f7247b;

    /* renamed from: c */
    private int f7248c;

    /* renamed from: d */
    private int f7249d;

    /* renamed from: e */
    private int f7250e;

    /* renamed from: f */
    private int f7251f;

    /* renamed from: g */
    private final AbstractC1690b f7252g;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.q.d.w$a */
    public static class C1946a extends IOException {
        C1946a(String str) {
            super(str);
        }
    }

    public C1945w(InputStream inputStream, AbstractC1690b bVar) {
        this(inputStream, bVar, 65536);
    }

    C1945w(InputStream inputStream, AbstractC1690b bVar, int i) {
        super(inputStream);
        this.f7250e = -1;
        this.f7252g = bVar;
        this.f7247b = (byte[]) bVar.mo7162e(i, byte[].class);
    }

    /* renamed from: a */
    private int m8810a(InputStream inputStream, byte[] bArr) {
        int i;
        int i2 = this.f7250e;
        if (i2 == -1 || this.f7251f - i2 >= (i = this.f7249d)) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                this.f7250e = -1;
                this.f7251f = 0;
                this.f7248c = read;
            }
            return read;
        }
        if (i2 == 0 && i > bArr.length && this.f7248c == bArr.length) {
            int length = bArr.length * 2;
            if (length <= i) {
                i = length;
            }
            byte[] bArr2 = (byte[]) this.f7252g.mo7162e(i, byte[].class);
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.f7247b = bArr2;
            this.f7252g.mo7161d(bArr);
            bArr = bArr2;
        } else if (i2 > 0) {
            System.arraycopy(bArr, i2, bArr, 0, bArr.length - i2);
        }
        int i3 = this.f7251f - this.f7250e;
        this.f7251f = i3;
        this.f7250e = 0;
        this.f7248c = 0;
        int read2 = inputStream.read(bArr, i3, bArr.length - i3);
        int i4 = this.f7251f;
        if (read2 > 0) {
            i4 += read2;
        }
        this.f7248c = i4;
        return read2;
    }

    /* renamed from: d */
    private static IOException m8811d() {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f7247b == null || inputStream == null) {
            throw m8811d();
        }
        return (this.f7248c - this.f7251f) + inputStream.available();
    }

    /* renamed from: b */
    public synchronized void mo7537b() {
        this.f7249d = this.f7247b.length;
    }

    /* renamed from: c */
    public synchronized void mo7538c() {
        if (this.f7247b != null) {
            this.f7252g.mo7161d(this.f7247b);
            this.f7247b = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() {
        if (this.f7247b != null) {
            this.f7252g.mo7161d(this.f7247b);
            this.f7247b = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public synchronized void mark(int i) {
        this.f7249d = Math.max(this.f7249d, i);
        this.f7250e = this.f7251f;
    }

    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        byte[] bArr = this.f7247b;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            throw m8811d();
        } else if (this.f7251f >= this.f7248c && m8810a(inputStream, bArr) == -1) {
            return -1;
        } else {
            if (bArr == this.f7247b || (bArr = this.f7247b) != null) {
                int i = this.f7248c;
                int i2 = this.f7251f;
                if (i - i2 <= 0) {
                    return -1;
                }
                this.f7251f = i2 + 1;
                return bArr[i2] & 255;
            }
            throw m8811d();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        byte[] bArr2 = this.f7247b;
        if (bArr2 == null) {
            throw m8811d();
        } else if (i2 == 0) {
            return 0;
        } else {
            InputStream inputStream = ((FilterInputStream) this).in;
            if (inputStream != null) {
                int i5 = this.f7251f;
                int i6 = this.f7248c;
                if (i5 < i6) {
                    int i7 = i6 - i5 >= i2 ? i2 : i6 - i5;
                    System.arraycopy(bArr2, i5, bArr, i, i7);
                    this.f7251f += i7;
                    if (i7 == i2 || inputStream.available() == 0) {
                        return i7;
                    }
                    i += i7;
                    i3 = i2 - i7;
                } else {
                    i3 = i2;
                }
                while (true) {
                    int i8 = -1;
                    if (this.f7250e == -1 && i3 >= bArr2.length) {
                        i4 = inputStream.read(bArr, i, i3);
                        if (i4 == -1) {
                            if (i3 != i2) {
                                i8 = i2 - i3;
                            }
                            return i8;
                        }
                    } else if (m8810a(inputStream, bArr2) == -1) {
                        if (i3 != i2) {
                            i8 = i2 - i3;
                        }
                        return i8;
                    } else if (bArr2 == this.f7247b || (bArr2 = this.f7247b) != null) {
                        int i9 = this.f7248c;
                        int i10 = this.f7251f;
                        i4 = i9 - i10 >= i3 ? i3 : i9 - i10;
                        System.arraycopy(bArr2, i10, bArr, i, i4);
                        this.f7251f += i4;
                    } else {
                        throw m8811d();
                    }
                    i3 -= i4;
                    if (i3 == 0) {
                        return i2;
                    }
                    if (inputStream.available() == 0) {
                        return i2 - i3;
                    }
                    i += i4;
                }
            } else {
                throw m8811d();
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        if (this.f7247b != null) {
            int i = this.f7250e;
            if (-1 != i) {
                this.f7251f = i;
            } else {
                throw new C1946a("Mark has been invalidated, pos: " + this.f7251f + " markLimit: " + this.f7249d);
            }
        } else {
            throw new IOException("Stream is closed");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j) {
        if (j < 1) {
            return 0;
        }
        byte[] bArr = this.f7247b;
        if (bArr != null) {
            InputStream inputStream = ((FilterInputStream) this).in;
            if (inputStream != null) {
                int i = this.f7248c;
                int i2 = this.f7251f;
                if (((long) (i - i2)) >= j) {
                    this.f7251f = (int) (((long) i2) + j);
                    return j;
                }
                long j2 = ((long) i) - ((long) i2);
                this.f7251f = i;
                if (this.f7250e == -1 || j > ((long) this.f7249d)) {
                    return j2 + inputStream.skip(j - j2);
                } else if (m8810a(inputStream, bArr) == -1) {
                    return j2;
                } else {
                    int i3 = this.f7248c;
                    int i4 = this.f7251f;
                    if (((long) (i3 - i4)) >= j - j2) {
                        this.f7251f = (int) ((((long) i4) + j) - j2);
                        return j;
                    }
                    long j3 = (j2 + ((long) i3)) - ((long) i4);
                    this.f7251f = i3;
                    return j3;
                }
            } else {
                throw m8811d();
            }
        } else {
            throw m8811d();
        }
    }
}
