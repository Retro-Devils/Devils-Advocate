package p155e.p156a.p157a.p158a.p163d;

import java.io.IOException;
import java.io.InputStream;
import java.util.zip.Checksum;

/* renamed from: e.a.a.a.d.c */
public class C3382c extends InputStream {

    /* renamed from: b */
    private final InputStream f11413b;

    /* renamed from: c */
    private long f11414c;

    /* renamed from: d */
    private final long f11415d;

    /* renamed from: e */
    private final Checksum f11416e;

    public C3382c(Checksum checksum, InputStream inputStream, long j, long j2) {
        this.f11416e = checksum;
        this.f11413b = inputStream;
        this.f11415d = j2;
        this.f11414c = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() {
        this.f11413b.close();
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.f11414c <= 0) {
            return -1;
        }
        int read = this.f11413b.read();
        if (read >= 0) {
            this.f11416e.update(read);
            this.f11414c--;
        }
        if (this.f11414c != 0 || this.f11415d == this.f11416e.getValue()) {
            return read;
        }
        throw new IOException("Checksum verification failed");
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int read = this.f11413b.read(bArr, i, i2);
        if (read >= 0) {
            this.f11416e.update(bArr, i, read);
            this.f11414c -= (long) read;
        }
        if (this.f11414c > 0 || this.f11415d == this.f11416e.getValue()) {
            return read;
        }
        throw new IOException("Checksum verification failed");
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        return read() >= 0 ? 1 : 0;
    }
}
