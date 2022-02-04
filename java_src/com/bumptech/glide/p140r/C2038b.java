package com.bumptech.glide.p140r;

import com.bumptech.glide.p140r.AbstractC2040d;

/* renamed from: com.bumptech.glide.r.b */
public final class C2038b implements AbstractC2040d, AbstractC2039c {

    /* renamed from: a */
    private final Object f7502a;

    /* renamed from: b */
    private final AbstractC2040d f7503b;

    /* renamed from: c */
    private volatile AbstractC2039c f7504c;

    /* renamed from: d */
    private volatile AbstractC2039c f7505d;

    /* renamed from: e */
    private AbstractC2040d.EnumC2041a f7506e;

    /* renamed from: f */
    private AbstractC2040d.EnumC2041a f7507f;

    public C2038b(Object obj, AbstractC2040d dVar) {
        AbstractC2040d.EnumC2041a aVar = AbstractC2040d.EnumC2041a.CLEARED;
        this.f7506e = aVar;
        this.f7507f = aVar;
        this.f7502a = obj;
        this.f7503b = dVar;
    }

    /* renamed from: m */
    private boolean m9241m(AbstractC2039c cVar) {
        return cVar.equals(this.f7504c) || (this.f7506e == AbstractC2040d.EnumC2041a.FAILED && cVar.equals(this.f7505d));
    }

    /* renamed from: n */
    private boolean m9242n() {
        AbstractC2040d dVar = this.f7503b;
        return dVar == null || dVar.mo7799l(this);
    }

    /* renamed from: o */
    private boolean m9243o() {
        AbstractC2040d dVar = this.f7503b;
        return dVar == null || dVar.mo7798k(this);
    }

    /* renamed from: p */
    private boolean m9244p() {
        AbstractC2040d dVar = this.f7503b;
        return dVar == null || dVar.mo7786a(this);
    }

    @Override // com.bumptech.glide.p140r.AbstractC2040d
    /* renamed from: a */
    public boolean mo7786a(AbstractC2039c cVar) {
        boolean z;
        synchronized (this.f7502a) {
            z = m9244p() && m9241m(cVar);
        }
        return z;
    }

    @Override // com.bumptech.glide.p140r.AbstractC2039c
    /* renamed from: b */
    public void mo7787b() {
        synchronized (this.f7502a) {
            AbstractC2040d.EnumC2041a aVar = this.f7506e;
            AbstractC2040d.EnumC2041a aVar2 = AbstractC2040d.EnumC2041a.RUNNING;
            if (aVar == aVar2) {
                this.f7506e = AbstractC2040d.EnumC2041a.PAUSED;
                this.f7504c.mo7787b();
            }
            if (this.f7507f == aVar2) {
                this.f7507f = AbstractC2040d.EnumC2041a.PAUSED;
                this.f7505d.mo7787b();
            }
        }
    }

    @Override // com.bumptech.glide.p140r.AbstractC2040d, com.bumptech.glide.p140r.AbstractC2039c
    /* renamed from: c */
    public boolean mo7788c() {
        boolean z;
        synchronized (this.f7502a) {
            if (!this.f7504c.mo7788c()) {
                if (!this.f7505d.mo7788c()) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    @Override // com.bumptech.glide.p140r.AbstractC2039c
    public void clear() {
        synchronized (this.f7502a) {
            AbstractC2040d.EnumC2041a aVar = AbstractC2040d.EnumC2041a.CLEARED;
            this.f7506e = aVar;
            this.f7504c.clear();
            if (this.f7507f != aVar) {
                this.f7507f = aVar;
                this.f7505d.clear();
            }
        }
    }

    @Override // com.bumptech.glide.p140r.AbstractC2040d
    /* renamed from: d */
    public AbstractC2040d mo7790d() {
        AbstractC2040d d;
        synchronized (this.f7502a) {
            AbstractC2040d dVar = this.f7503b;
            d = dVar != null ? dVar.mo7790d() : this;
        }
        return d;
    }

    @Override // com.bumptech.glide.p140r.AbstractC2040d
    /* renamed from: e */
    public void mo7791e(AbstractC2039c cVar) {
        synchronized (this.f7502a) {
            if (!cVar.equals(this.f7505d)) {
                this.f7506e = AbstractC2040d.EnumC2041a.FAILED;
                AbstractC2040d.EnumC2041a aVar = this.f7507f;
                AbstractC2040d.EnumC2041a aVar2 = AbstractC2040d.EnumC2041a.RUNNING;
                if (aVar != aVar2) {
                    this.f7507f = aVar2;
                    this.f7505d.mo7792f();
                }
                return;
            }
            this.f7507f = AbstractC2040d.EnumC2041a.FAILED;
            AbstractC2040d dVar = this.f7503b;
            if (dVar != null) {
                dVar.mo7791e(this);
            }
        }
    }

    @Override // com.bumptech.glide.p140r.AbstractC2039c
    /* renamed from: f */
    public void mo7792f() {
        synchronized (this.f7502a) {
            AbstractC2040d.EnumC2041a aVar = this.f7506e;
            AbstractC2040d.EnumC2041a aVar2 = AbstractC2040d.EnumC2041a.RUNNING;
            if (aVar != aVar2) {
                this.f7506e = aVar2;
                this.f7504c.mo7792f();
            }
        }
    }

    @Override // com.bumptech.glide.p140r.AbstractC2040d
    /* renamed from: g */
    public void mo7793g(AbstractC2039c cVar) {
        synchronized (this.f7502a) {
            if (cVar.equals(this.f7504c)) {
                this.f7506e = AbstractC2040d.EnumC2041a.SUCCESS;
            } else if (cVar.equals(this.f7505d)) {
                this.f7507f = AbstractC2040d.EnumC2041a.SUCCESS;
            }
            AbstractC2040d dVar = this.f7503b;
            if (dVar != null) {
                dVar.mo7793g(this);
            }
        }
    }

    @Override // com.bumptech.glide.p140r.AbstractC2039c
    /* renamed from: h */
    public boolean mo7794h(AbstractC2039c cVar) {
        if (!(cVar instanceof C2038b)) {
            return false;
        }
        C2038b bVar = (C2038b) cVar;
        return this.f7504c.mo7794h(bVar.f7504c) && this.f7505d.mo7794h(bVar.f7505d);
    }

    @Override // com.bumptech.glide.p140r.AbstractC2039c
    /* renamed from: i */
    public boolean mo7795i() {
        boolean z;
        synchronized (this.f7502a) {
            AbstractC2040d.EnumC2041a aVar = this.f7506e;
            AbstractC2040d.EnumC2041a aVar2 = AbstractC2040d.EnumC2041a.SUCCESS;
            if (aVar != aVar2) {
                if (this.f7507f != aVar2) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    @Override // com.bumptech.glide.p140r.AbstractC2039c
    public boolean isRunning() {
        boolean z;
        synchronized (this.f7502a) {
            AbstractC2040d.EnumC2041a aVar = this.f7506e;
            AbstractC2040d.EnumC2041a aVar2 = AbstractC2040d.EnumC2041a.RUNNING;
            if (aVar != aVar2) {
                if (this.f7507f != aVar2) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    @Override // com.bumptech.glide.p140r.AbstractC2039c
    /* renamed from: j */
    public boolean mo7797j() {
        boolean z;
        synchronized (this.f7502a) {
            AbstractC2040d.EnumC2041a aVar = this.f7506e;
            AbstractC2040d.EnumC2041a aVar2 = AbstractC2040d.EnumC2041a.CLEARED;
            z = aVar == aVar2 && this.f7507f == aVar2;
        }
        return z;
    }

    @Override // com.bumptech.glide.p140r.AbstractC2040d
    /* renamed from: k */
    public boolean mo7798k(AbstractC2039c cVar) {
        boolean z;
        synchronized (this.f7502a) {
            z = m9243o() && m9241m(cVar);
        }
        return z;
    }

    @Override // com.bumptech.glide.p140r.AbstractC2040d
    /* renamed from: l */
    public boolean mo7799l(AbstractC2039c cVar) {
        boolean z;
        synchronized (this.f7502a) {
            z = m9242n() && m9241m(cVar);
        }
        return z;
    }

    /* renamed from: q */
    public void mo7800q(AbstractC2039c cVar, AbstractC2039c cVar2) {
        this.f7504c = cVar;
        this.f7505d = cVar2;
    }
}
