package com.bumptech.glide.load.p122o.p124b0;

import android.util.Log;
import com.bumptech.glide.load.AbstractC1643g;
import com.bumptech.glide.load.p122o.p124b0.AbstractC1714a;
import com.bumptech.glide.p135m.C1987a;
import java.io.File;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.o.b0.e */
public class C1723e implements AbstractC1714a {

    /* renamed from: a */
    private final C1733j f6766a;

    /* renamed from: b */
    private final File f6767b;

    /* renamed from: c */
    private final long f6768c;

    /* renamed from: d */
    private final C1718c f6769d = new C1718c();

    /* renamed from: e */
    private C1987a f6770e;

    @Deprecated
    protected C1723e(File file, long j) {
        this.f6767b = file;
        this.f6768c = j;
        this.f6766a = new C1733j();
    }

    /* renamed from: c */
    public static AbstractC1714a m8130c(File file, long j) {
        return new C1723e(file, j);
    }

    /* renamed from: d */
    private synchronized C1987a m8131d() {
        if (this.f6770e == null) {
            this.f6770e = C1987a.m8975s(this.f6767b, 1, 1, this.f6768c);
        }
        return this.f6770e;
    }

    @Override // com.bumptech.glide.load.p122o.p124b0.AbstractC1714a
    /* renamed from: a */
    public void mo7212a(AbstractC1643g gVar, AbstractC1714a.AbstractC1716b bVar) {
        String b = this.f6766a.mo7237b(gVar);
        this.f6769d.mo7216a(b);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + b + " for for Key: " + gVar);
            }
            try {
                C1987a d = m8131d();
                if (d.mo7632q(b) == null) {
                    C1987a.C1990c n = d.mo7631n(b);
                    if (n != null) {
                        try {
                            if (bVar.mo7215a(n.mo7640f(0))) {
                                n.mo7639e();
                            }
                            this.f6769d.mo7217b(b);
                        } finally {
                            n.mo7638b();
                        }
                    } else {
                        throw new IllegalStateException("Had two simultaneous puts for: " + b);
                    }
                }
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            }
        } finally {
            this.f6769d.mo7217b(b);
        }
    }

    @Override // com.bumptech.glide.load.p122o.p124b0.AbstractC1714a
    /* renamed from: b */
    public File mo7213b(AbstractC1643g gVar) {
        String b = this.f6766a.mo7237b(gVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + b + " for for Key: " + gVar);
        }
        try {
            C1987a.C1992e q = m8131d().mo7632q(b);
            if (q != null) {
                return q.mo7644a(0);
            }
            return null;
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }
}
