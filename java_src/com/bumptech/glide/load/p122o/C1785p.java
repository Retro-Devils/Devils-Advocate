package com.bumptech.glide.load.p122o;

import com.bumptech.glide.load.AbstractC1643g;
import com.bumptech.glide.p144t.C2081j;

/* access modifiers changed from: package-private */
/* renamed from: com.bumptech.glide.load.o.p */
public class C1785p<Z> implements AbstractC1794v<Z> {

    /* renamed from: b */
    private final boolean f6982b;

    /* renamed from: c */
    private final boolean f6983c;

    /* renamed from: d */
    private final AbstractC1794v<Z> f6984d;

    /* renamed from: e */
    private final AbstractC1786a f6985e;

    /* renamed from: f */
    private final AbstractC1643g f6986f;

    /* renamed from: g */
    private int f6987g;

    /* renamed from: h */
    private boolean f6988h;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.o.p$a */
    public interface AbstractC1786a {
        /* renamed from: a */
        void mo7319a(AbstractC1643g gVar, C1785p<?> pVar);
    }

    C1785p(AbstractC1794v<Z> vVar, boolean z, boolean z2, AbstractC1643g gVar, AbstractC1786a aVar) {
        this.f6984d = (AbstractC1794v) C2081j.m9432d(vVar);
        this.f6982b = z;
        this.f6983c = z2;
        this.f6986f = gVar;
        this.f6985e = (AbstractC1786a) C2081j.m9432d(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo7356a() {
        if (!this.f6988h) {
            this.f6987g++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    @Override // com.bumptech.glide.load.p122o.AbstractC1794v
    /* renamed from: b */
    public int mo7357b() {
        return this.f6984d.mo7357b();
    }

    @Override // com.bumptech.glide.load.p122o.AbstractC1794v
    /* renamed from: c */
    public Z mo7358c() {
        return this.f6984d.mo7358c();
    }

    @Override // com.bumptech.glide.load.p122o.AbstractC1794v
    /* renamed from: d */
    public Class<Z> mo7359d() {
        return this.f6984d.mo7359d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public AbstractC1794v<Z> mo7360e() {
        return this.f6984d;
    }

    @Override // com.bumptech.glide.load.p122o.AbstractC1794v
    /* renamed from: f */
    public synchronized void mo7361f() {
        if (this.f6987g > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (!this.f6988h) {
            this.f6988h = true;
            if (this.f6983c) {
                this.f6984d.mo7361f();
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo7362g() {
        return this.f6982b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo7363h() {
        boolean z;
        synchronized (this) {
            int i = this.f6987g;
            if (i > 0) {
                z = true;
                int i2 = i - 1;
                this.f6987g = i2;
                if (i2 != 0) {
                    z = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z) {
            this.f6985e.mo7319a(this.f6986f, this);
        }
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f6982b + ", listener=" + this.f6985e + ", key=" + this.f6986f + ", acquired=" + this.f6987g + ", isRecycled=" + this.f6988h + ", resource=" + this.f6984d + '}';
    }
}
