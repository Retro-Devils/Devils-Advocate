package com.bumptech.glide.p144t;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.t.h */
public class C2079h extends FilterInputStream {

    /* renamed from: b */
    private int f7603b = Integer.MIN_VALUE;

    public C2079h(InputStream inputStream) {
        super(inputStream);
    }

    /* renamed from: a */
    private long m9426a(long j) {
        int i = this.f7603b;
        if (i == 0) {
            return -1;
        }
        return (i == Integer.MIN_VALUE || j <= ((long) i)) ? j : (long) i;
    }

    /* renamed from: b */
    private void m9427b(long j) {
        int i = this.f7603b;
        if (i != Integer.MIN_VALUE && j != -1) {
            this.f7603b = (int) (((long) i) - j);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        int i = this.f7603b;
        return i == Integer.MIN_VALUE ? super.available() : Math.min(i, super.available());
    }

    public synchronized void mark(int i) {
        super.mark(i);
        this.f7603b = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        if (m9426a(1) == -1) {
            return -1;
        }
        int read = super.read();
        m9427b(1);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int a = (int) m9426a((long) i2);
        if (a == -1) {
            return -1;
        }
        int read = super.read(bArr, i, a);
        m9427b((long) read);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        super.reset();
        this.f7603b = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) {
        long a = m9426a(j);
        if (a == -1) {
            return 0;
        }
        long skip = super.skip(a);
        m9427b(skip);
        return skip;
    }
}
