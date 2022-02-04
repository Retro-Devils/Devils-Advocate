package p069c.p070a.p071a.p072w;

import java.io.ByteArrayOutputStream;

/* renamed from: c.a.a.w.m */
public class C1274m extends ByteArrayOutputStream {

    /* renamed from: b */
    private final C1259d f5532b;

    public C1274m(C1259d dVar, int i) {
        this.f5532b = dVar;
        ((ByteArrayOutputStream) this).buf = dVar.mo6233a(Math.max(i, 256));
    }

    /* renamed from: a */
    private void m6748a(int i) {
        int i2 = ((ByteArrayOutputStream) this).count;
        if (i2 + i > ((ByteArrayOutputStream) this).buf.length) {
            byte[] a = this.f5532b.mo6233a((i2 + i) * 2);
            System.arraycopy(((ByteArrayOutputStream) this).buf, 0, a, 0, ((ByteArrayOutputStream) this).count);
            this.f5532b.mo6234b(((ByteArrayOutputStream) this).buf);
            ((ByteArrayOutputStream) this).buf = a;
        }
    }

    @Override // java.io.OutputStream, java.io.ByteArrayOutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f5532b.mo6234b(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    @Override // java.lang.Object
    public void finalize() {
        this.f5532b.mo6234b(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.OutputStream, java.io.ByteArrayOutputStream
    public synchronized void write(int i) {
        m6748a(1);
        super.write(i);
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] bArr, int i, int i2) {
        m6748a(i2);
        super.write(bArr, i, i2);
    }
}
