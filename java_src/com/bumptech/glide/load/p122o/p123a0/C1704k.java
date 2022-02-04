package com.bumptech.glide.load.p122o.p123a0;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.o.a0.k */
public class C1704k implements AbstractC1695e {

    /* renamed from: a */
    private static final Bitmap.Config f6744a = Bitmap.Config.ARGB_8888;

    /* renamed from: b */
    private final AbstractC1707l f6745b;

    /* renamed from: c */
    private final Set<Bitmap.Config> f6746c;

    /* renamed from: d */
    private final long f6747d;

    /* renamed from: e */
    private final AbstractC1705a f6748e;

    /* renamed from: f */
    private long f6749f;

    /* renamed from: g */
    private long f6750g;

    /* renamed from: h */
    private int f6751h;

    /* renamed from: i */
    private int f6752i;

    /* renamed from: j */
    private int f6753j;

    /* renamed from: k */
    private int f6754k;

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.o.a0.k$a */
    public interface AbstractC1705a {
        /* renamed from: a */
        void mo7203a(Bitmap bitmap);

        /* renamed from: b */
        void mo7204b(Bitmap bitmap);
    }

    /* renamed from: com.bumptech.glide.load.o.a0.k$b */
    private static final class C1706b implements AbstractC1705a {
        C1706b() {
        }

        @Override // com.bumptech.glide.load.p122o.p123a0.C1704k.AbstractC1705a
        /* renamed from: a */
        public void mo7203a(Bitmap bitmap) {
        }

        @Override // com.bumptech.glide.load.p122o.p123a0.C1704k.AbstractC1705a
        /* renamed from: b */
        public void mo7204b(Bitmap bitmap) {
        }
    }

    public C1704k(long j) {
        this(j, m8080l(), m8079k());
    }

    C1704k(long j, AbstractC1707l lVar, Set<Bitmap.Config> set) {
        this.f6747d = j;
        this.f6749f = j;
        this.f6745b = lVar;
        this.f6746c = set;
        this.f6748e = new C1706b();
    }

    @TargetApi(26)
    /* renamed from: f */
    private static void m8074f(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    /* renamed from: g */
    private static Bitmap m8075g(int i, int i2, Bitmap.Config config) {
        if (config == null) {
            config = f6744a;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    /* renamed from: h */
    private void m8076h() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            m8077i();
        }
    }

    /* renamed from: i */
    private void m8077i() {
        Log.v("LruBitmapPool", "Hits=" + this.f6751h + ", misses=" + this.f6752i + ", puts=" + this.f6753j + ", evictions=" + this.f6754k + ", currentSize=" + this.f6750g + ", maxSize=" + this.f6749f + "\nStrategy=" + this.f6745b);
    }

    /* renamed from: j */
    private void m8078j() {
        m8084q(this.f6749f);
    }

    @TargetApi(26)
    /* renamed from: k */
    private static Set<Bitmap.Config> m8079k() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            hashSet.add(null);
        }
        if (i >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: l */
    private static AbstractC1707l m8080l() {
        return Build.VERSION.SDK_INT >= 19 ? new C1709n() : new C1691c();
    }

    /* renamed from: m */
    private synchronized Bitmap m8081m(int i, int i2, Bitmap.Config config) {
        Bitmap c;
        m8074f(config);
        c = this.f6745b.mo7165c(i, i2, config != null ? config : f6744a);
        if (c == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Missing bitmap=" + this.f6745b.mo7167e(i, i2, config));
            }
            this.f6752i++;
        } else {
            this.f6751h++;
            this.f6750g -= (long) this.f6745b.mo7163a(c);
            this.f6748e.mo7203a(c);
            m8083p(c);
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            Log.v("LruBitmapPool", "Get bitmap=" + this.f6745b.mo7167e(i, i2, config));
        }
        m8076h();
        return c;
    }

    @TargetApi(19)
    /* renamed from: o */
    private static void m8082o(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 19) {
            bitmap.setPremultiplied(true);
        }
    }

    /* renamed from: p */
    private static void m8083p(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        m8082o(bitmap);
    }

    /* renamed from: q */
    private synchronized void m8084q(long j) {
        while (this.f6750g > j) {
            Bitmap b = this.f6745b.mo7164b();
            if (b == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    m8077i();
                }
                this.f6750g = 0;
                return;
            }
            this.f6748e.mo7203a(b);
            this.f6750g -= (long) this.f6745b.mo7163a(b);
            this.f6754k++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Evicting bitmap=" + this.f6745b.mo7168f(b));
            }
            m8076h();
            b.recycle();
        }
    }

    @Override // com.bumptech.glide.load.p122o.p123a0.AbstractC1695e
    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    public void mo7180a(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i);
        }
        if (i >= 40 || (Build.VERSION.SDK_INT >= 23 && i >= 20)) {
            mo7181b();
        } else if (i >= 20 || i == 15) {
            m8084q(mo7202n() / 2);
        }
    }

    @Override // com.bumptech.glide.load.p122o.p123a0.AbstractC1695e
    /* renamed from: b */
    public void mo7181b() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        m8084q(0);
    }

    @Override // com.bumptech.glide.load.p122o.p123a0.AbstractC1695e
    /* renamed from: c */
    public Bitmap mo7182c(int i, int i2, Bitmap.Config config) {
        Bitmap m = m8081m(i, i2, config);
        if (m == null) {
            return m8075g(i, i2, config);
        }
        m.eraseColor(0);
        return m;
    }

    @Override // com.bumptech.glide.load.p122o.p123a0.AbstractC1695e
    /* renamed from: d */
    public synchronized void mo7183d(Bitmap bitmap) {
        if (bitmap == null) {
            throw new NullPointerException("Bitmap must not be null");
        } else if (!bitmap.isRecycled()) {
            if (bitmap.isMutable() && ((long) this.f6745b.mo7163a(bitmap)) <= this.f6749f) {
                if (this.f6746c.contains(bitmap.getConfig())) {
                    int a = this.f6745b.mo7163a(bitmap);
                    this.f6745b.mo7166d(bitmap);
                    this.f6748e.mo7204b(bitmap);
                    this.f6753j++;
                    this.f6750g += (long) a;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Log.v("LruBitmapPool", "Put bitmap in pool=" + this.f6745b.mo7168f(bitmap));
                    }
                    m8076h();
                    m8078j();
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.f6745b.mo7168f(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f6746c.contains(bitmap.getConfig()));
            }
            bitmap.recycle();
        } else {
            throw new IllegalStateException("Cannot pool recycled bitmap");
        }
    }

    @Override // com.bumptech.glide.load.p122o.p123a0.AbstractC1695e
    /* renamed from: e */
    public Bitmap mo7184e(int i, int i2, Bitmap.Config config) {
        Bitmap m = m8081m(i, i2, config);
        return m == null ? m8075g(i, i2, config) : m;
    }

    /* renamed from: n */
    public long mo7202n() {
        return this.f6749f;
    }
}
