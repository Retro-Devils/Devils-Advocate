package com.bumptech.glide.p144t;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* renamed from: com.bumptech.glide.t.d */
public class C2073d extends InputStream {

    /* renamed from: b */
    private static final Queue<C2073d> f7592b = C2082k.m9438e(0);

    /* renamed from: c */
    private InputStream f7593c;

    /* renamed from: d */
    private IOException f7594d;

    C2073d() {
    }

    /* renamed from: b */
    public static C2073d m9409b(InputStream inputStream) {
        C2073d poll;
        Queue<C2073d> queue = f7592b;
        synchronized (queue) {
            poll = queue.poll();
        }
        if (poll == null) {
            poll = new C2073d();
        }
        poll.mo7845d(inputStream);
        return poll;
    }

    /* renamed from: a */
    public IOException mo7841a() {
        return this.f7594d;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f7593c.available();
    }

    /* renamed from: c */
    public void mo7843c() {
        this.f7594d = null;
        this.f7593c = null;
        Queue<C2073d> queue = f7592b;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() {
        this.f7593c.close();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo7845d(InputStream inputStream) {
        this.f7593c = inputStream;
    }

    public void mark(int i) {
        this.f7593c.mark(i);
    }

    public boolean markSupported() {
        return this.f7593c.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            return this.f7593c.read();
        } catch (IOException e) {
            this.f7594d = e;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        try {
            return this.f7593c.read(bArr);
        } catch (IOException e) {
            this.f7594d = e;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        try {
            return this.f7593c.read(bArr, i, i2);
        } catch (IOException e) {
            this.f7594d = e;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.f7593c.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        try {
            return this.f7593c.skip(j);
        } catch (IOException e) {
            this.f7594d = e;
            return 0;
        }
    }
}
