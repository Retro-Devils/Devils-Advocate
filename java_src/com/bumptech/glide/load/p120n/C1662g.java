package com.bumptech.glide.load.p120n;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.n.g */
public final class C1662g extends FilterInputStream {

    /* renamed from: b */
    private static final byte[] f6668b;

    /* renamed from: c */
    private static final int f6669c;

    /* renamed from: d */
    private static final int f6670d;

    /* renamed from: e */
    private final byte f6671e;

    /* renamed from: f */
    private int f6672f;

    static {
        byte[] bArr = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        f6668b = bArr;
        int length = bArr.length;
        f6669c = length;
        f6670d = length + 2;
    }

    public C1662g(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            throw new IllegalArgumentException("Cannot add invalid orientation: " + i);
        }
        this.f6671e = (byte) i;
    }

    public void mark(int i) {
        throw new UnsupportedOperationException();
    }

    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int i;
        int i2 = this.f6672f;
        int read = (i2 < 2 || i2 > (i = f6670d)) ? super.read() : i2 == i ? this.f6671e : f6668b[i2 - 2] & 255;
        if (read != -1) {
            this.f6672f++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4 = this.f6672f;
        int i5 = f6670d;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.f6671e;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int min = Math.min(i5 - i4, i2);
            System.arraycopy(f6668b, this.f6672f - 2, bArr, i, min);
            i3 = min;
        }
        if (i3 > 0) {
            this.f6672f += i3;
        }
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) {
        long skip = super.skip(j);
        if (skip > 0) {
            this.f6672f = (int) (((long) this.f6672f) + skip);
        }
        return skip;
    }
}
