package p155e.p156a.p157a.p158a.p163d;

import java.io.InputStream;

/* renamed from: e.a.a.a.d.a */
public class C3380a extends InputStream {

    /* renamed from: b */
    private final InputStream f11411b;

    /* renamed from: c */
    private long f11412c;

    public C3380a(InputStream inputStream, long j) {
        this.f11411b = inputStream;
        this.f11412c = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() {
    }

    @Override // java.io.InputStream
    public int read() {
        long j = this.f11412c;
        if (j <= 0) {
            return -1;
        }
        this.f11412c = j - 1;
        return this.f11411b.read();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        long j = this.f11412c;
        if (j == 0) {
            return -1;
        }
        if (((long) i2) > j) {
            i2 = (int) j;
        }
        int read = this.f11411b.read(bArr, i, i2);
        if (read >= 0) {
            this.f11412c -= (long) read;
        }
        return read;
    }
}
