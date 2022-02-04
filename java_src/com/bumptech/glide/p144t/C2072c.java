package com.bumptech.glide.p144t;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.t.c */
public final class C2072c extends FilterInputStream {

    /* renamed from: b */
    private final long f7590b;

    /* renamed from: c */
    private int f7591c;

    private C2072c(InputStream inputStream, long j) {
        super(inputStream);
        this.f7590b = j;
    }

    /* renamed from: a */
    private int m9407a(int i) {
        if (i >= 0) {
            this.f7591c += i;
        } else if (this.f7590b - ((long) this.f7591c) > 0) {
            throw new IOException("Failed to read all expected data, expected: " + this.f7590b + ", but read: " + this.f7591c);
        }
        return i;
    }

    /* renamed from: b */
    public static InputStream m9408b(InputStream inputStream, long j) {
        return new C2072c(inputStream, j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        return (int) Math.max(this.f7590b - ((long) this.f7591c), (long) ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        int read;
        read = super.read();
        m9407a(read >= 0 ? 1 : -1);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) {
        return m9407a(super.read(bArr, i, i2));
    }
}
