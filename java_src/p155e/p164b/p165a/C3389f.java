package p155e.p164b.p165a;

import java.io.IOException;
import java.io.InputStream;
import p155e.p164b.p165a.p166s.C3403b;

/* renamed from: e.b.a.f */
public class C3389f extends InputStream {

    /* renamed from: b */
    private InputStream f11422b;

    /* renamed from: c */
    private final C3403b f11423c;

    /* renamed from: d */
    private IOException f11424d = null;

    /* renamed from: e */
    private final byte[] f11425e = new byte[1];

    public C3389f(InputStream inputStream, int i) {
        inputStream.getClass();
        this.f11422b = inputStream;
        this.f11423c = new C3403b(i);
    }

    @Override // java.io.InputStream
    public int available() {
        InputStream inputStream = this.f11422b;
        if (inputStream != null) {
            IOException iOException = this.f11424d;
            if (iOException == null) {
                return inputStream.available();
            }
            throw iOException;
        }
        throw new C3401r("Stream closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() {
        InputStream inputStream = this.f11422b;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.f11422b = null;
            }
        }
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.f11425e, 0, 1) == -1) {
            return -1;
        }
        return this.f11425e[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = this.f11422b;
        if (inputStream != null) {
            IOException iOException = this.f11424d;
            if (iOException == null) {
                try {
                    int read = inputStream.read(bArr, i, i2);
                    if (read == -1) {
                        return -1;
                    }
                    this.f11423c.mo11388a(bArr, i, read);
                    return read;
                } catch (IOException e) {
                    this.f11424d = e;
                    throw e;
                }
            } else {
                throw iOException;
            }
        } else {
            throw new C3401r("Stream closed");
        }
    }
}
