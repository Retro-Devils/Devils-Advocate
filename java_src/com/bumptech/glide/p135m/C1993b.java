package com.bumptech.glide.p135m;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* access modifiers changed from: package-private */
/* renamed from: com.bumptech.glide.m.b */
public class C1993b implements Closeable {

    /* renamed from: b */
    private final InputStream f7365b;

    /* renamed from: c */
    private final Charset f7366c;

    /* renamed from: d */
    private byte[] f7367d;

    /* renamed from: e */
    private int f7368e;

    /* renamed from: f */
    private int f7369f;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.m.b$a */
    public class C1994a extends ByteArrayOutputStream {
        C1994a(int i) {
            super(i);
        }

        public String toString() {
            int i = ((ByteArrayOutputStream) this).count;
            if (i > 0 && ((ByteArrayOutputStream) this).buf[i - 1] == 13) {
                i--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i, C1993b.this.f7366c.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public C1993b(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        } else if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        } else if (charset.equals(C1995c.f7371a)) {
            this.f7365b = inputStream;
            this.f7366c = charset;
            this.f7367d = new byte[i];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    public C1993b(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    /* renamed from: b */
    private void m9009b() {
        InputStream inputStream = this.f7365b;
        byte[] bArr = this.f7367d;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f7368e = 0;
            this.f7369f = read;
            return;
        }
        throw new EOFException();
    }

    /* renamed from: c */
    public boolean mo7645c() {
        return this.f7369f == -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f7365b) {
            if (this.f7367d != null) {
                this.f7367d = null;
                this.f7365b.close();
            }
        }
    }

    /* renamed from: d */
    public String mo7647d() {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.f7365b) {
            if (this.f7367d != null) {
                if (this.f7368e >= this.f7369f) {
                    m9009b();
                }
                for (int i3 = this.f7368e; i3 != this.f7369f; i3++) {
                    byte[] bArr2 = this.f7367d;
                    if (bArr2[i3] == 10) {
                        if (i3 != this.f7368e) {
                            i2 = i3 - 1;
                            if (bArr2[i2] == 13) {
                                byte[] bArr3 = this.f7367d;
                                int i4 = this.f7368e;
                                String str = new String(bArr3, i4, i2 - i4, this.f7366c.name());
                                this.f7368e = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        byte[] bArr32 = this.f7367d;
                        int i42 = this.f7368e;
                        String str2 = new String(bArr32, i42, i2 - i42, this.f7366c.name());
                        this.f7368e = i3 + 1;
                        return str2;
                    }
                }
                C1994a aVar = new C1994a((this.f7369f - this.f7368e) + 80);
                loop1:
                while (true) {
                    byte[] bArr4 = this.f7367d;
                    int i5 = this.f7368e;
                    aVar.write(bArr4, i5, this.f7369f - i5);
                    this.f7369f = -1;
                    m9009b();
                    i = this.f7368e;
                    while (true) {
                        if (i != this.f7369f) {
                            bArr = this.f7367d;
                            if (bArr[i] == 10) {
                                break loop1;
                            }
                            i++;
                        }
                    }
                }
                int i6 = this.f7368e;
                if (i != i6) {
                    aVar.write(bArr, i6, i - i6);
                }
                this.f7368e = i + 1;
                return aVar.toString();
            }
            throw new IOException("LineReader is closed");
        }
    }
}
