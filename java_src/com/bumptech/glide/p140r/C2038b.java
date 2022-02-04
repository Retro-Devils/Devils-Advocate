package com.bumptech.glide.p140r;

import com.bumptech.glide.p140r.AbstractC2040d;

/* renamed from: com.bumptech.glide.r.b */
public final class C2038b implements AbstractC2040d, AbstractC2039c {

    /* renamed from: a */
    private final Object f7494a;

    /* renamed from: b */
    private final AbstractC2040d f7495b;

    /* renamed from: c */
    private volatile AbstractC2039c f7496c;

    /* renamed from: d */
    private volatile AbstractC2039c f7497d;

    /* renamed from: e */
    private AbstractC2040d.EnumC2041a f7498e;

    /* renamed from: f */
    private AbstractC2040d.EnumC2041a f7499f;

    public C2038b(Object obj, AbstractC2040d dVar) {
        AbstractC2040d.EnumC2041a aVar = AbstractC2040d.EnumC2041a.CLEARED;
        this.f7498e = aVar;
        this.f7499f = aVar;
        this.f7494a = obj;
        this.f7495b = dVar;
    }

    /* renamed from: m */
    private boolean m9241m(AbstractC2039c cVar) {
        return cVar.equals(this.f7496c) || (this.f7498e == AbstractC2040d.EnumC2041a.FAILED && cVar.equals(this.f7497d));
    }

    /* renamed from: n */
    private boolean m9242n() {
        AbstractC2040d dVar = this.f7495b;
        return dVar == null || dVar.mo7799l(this);
    }

    /* renamed from: o */
    private boolean m9243o() {
        AbstractC2040d dVar = this.f7495b;
        return dVar == null || dVar.mo7798k(this);
    }

    /* renamed from: p */
    private boolean m9244p() {
        AbstractC2040d dVar = this.f7495b;
        return dVar == null || dVar.mo7786a(this);
    }

    @Override // com.bumptech.glide.p140r.AbstractC2040d
    /* renamed from: a */
    public boolean mo7786a(AbstractC2039c cVar) {
        boolean z;
        synchronized (this.f7494a) {
            z = m9244p() && m9241m(cVar);
        }
        return z;
    }

    @Override // com.bumptech.glide.p140r.AbstractC2039c
    /* renamed from: b */
    public void mo7787b() {
        synchronized (this.f7494a) {
            AbstractC2040d.EnumC2041a aVar = this.f7498e;
            AbstractC2040d.EnumC2041a aVar2 = AbstractC2040d.EnumC2041a.RUNNING;
            if (aVar == aVar2) {
                this.f7498e = AbstractC2040d.EnumC2041a.PAUSED;
                this.f7496c.mo7787b();
            }
            if (this.f7499f == aVar2) {
                this.f7499f = AbstractC2040d.EnumC2041a.PAUSED;
                this.f7497d.mo7787b();
            }
        }
    }

    @Override // com.bumptech.glide.p140r.AbstractC2040d, com.bumptech.glide.p140r.AbstractC2039c
    /* renamed from: c */
    public boolean mo7788c() {
        boolean z;
        synchronized (this.f7494a) {
            if (!this.f7496c.mo7788c()) {
                if (!this.f7497d.mo7788c()) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    @Override // com.bumptech.glide.p140r.AbstractC2039c
    public void clear() {
        synchronized (this.f7494a) {
            AbstractC2040d.EnumC2041a aVar = AbstractC2040d.EnumC2041a.CLEARED;
            this.f7498e = aVar;
            this.f7496c.clear();
            if (this.f7499f != aVar) {
                this.f7499f = aVar;
                this.f7497d.clear();
            }
        }
    }

    @Override // com.bumptech.glide.p140r.AbstractC2040d
    /* renamed from: d */
    public AbstractC2040d mo7790d() {
        AbstractC2040d d;
        synchronized (this.f7494a) {
            AbstractC2040d dVar = this.f7495b;
            d = dVar != null ? dVar.mo7790d() : this;
        }
        return d;
    }

    @Override // com.bumptech.glide.p140r.AbstractC2040d
    /* renamed from: e */
    public void mo7791e(AbstractC2039c cVar) {
        synchronized (this.f7494a) {
            if (!cVar.equals(this.f7497d)) {
                this.f7498e = AbstractC2040d.EnumC2041a.FAILED;
                AbstractC2040d.EnumC2041a aVar = this.f7499f;
                AbstractC2040d.EnumC2041a aVar2 = AbstractC2040d.EnumC2041a.RUNNING;
                if (aVar != aVar2) {
                    this.f7499f = aVar2;
                    this.f7497d.mo7792f();
                }
                return;
            }
            this.f7499f = AbstractC2040d.EnumC2041a.FAILED;
            AbstractC2040d dVar = this.f7495b;
            if (dVar != null) {
                dVar.mo7791e(this);
            }
        }
    }

    @Override // com.bumptech.glide.p140r.AbstractC2039c
    /* renamed from: f */
    public void mo7792f() {
        synchronized (this.f7494a) {
            AbstractC2040d.EnumC2041a aVar = this.f7498e;
            AbstractC2040d.EnumC2041a aVar2 = AbstractC2040d.EnumC2041a.RUNNING;
            if (aVar != aVar2) {
                this.f7498e = aVar2;
                this.f7496c.mo7792f();
            }
        }
    }

    @Override // com.bumptech.glide.p140r.AbstractC2040d
    /* renamed from: g */
    public void mo7793g(AbstractC2039c cVar) {
        synchronized (this.f7494a) {
            if (cVar.equals(this.f7496c)) {
                this.f7498e = AbstractC2040d.EnumC2041a.SUCCESS;
            } else if (cVar.equals(this.f7497d)) {
                this.f7499f = AbstractC2040d.EnumC2041a.SUCCESS;
            }
            AbstractC2040d dVar = this.f7495b;
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
        return this.f7496c.mo7794h(bVar.f7496c) && this.f7497d.mo7794h(bVar.f7497d);
    }

    @Override // com.bumptech.glide.p140r.AbstractC2039c
    /* renamed from: i */
    public boolean mo7795i() {
        boolean z;
        synchronized (this.f7494a) {
            AbstractC2040d.EnumC2041a aVar = this.f7498e;
            AbstractC2040d.EnumC2041a aVar2 = AbstractC2040d.EnumC2041a.SUCCESS;
            if (aVar != aVar2) {
                if (this.f7499f != aVar2) {
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
        synchronized (this.f7494a) {
            AbstractC2040d.EnumC2041a aVar = this.f7498e;
            AbstractC2040d.EnumC2041a aVar2 = AbstractC2040d.EnumC2041a.RUNNING;
            if (aVar != aVar2) {
                if (this.f7499f != aVar2) {
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
        synchronized (this.f7494a) {
            AbstractC2040d.EnumC2041a aVar = this.f7498e;
            AbstractC2040d.EnumC2041a aVar2 = AbstractC2040d.EnumC2041a.CLEARED;
            z = aVar == aVar2 && this.f7499f == aVar2;
        }
        return z;
    }

    @Override // com.bumptech.glide.p140r.AbstractC2040d
    /* renamed from: k */
    public boolean mo7798k(AbstractC2039c cVar) {
        boolean z;
        synchronized (this.f7494a) {
            z = m9243o() && m9241m(cVar);
        }
        return z;
    }

    @Override // com.bumptech.glide.p140r.AbstractC2040d
    /* renamed from: l */
    public boolean mo7799l(AbstractC2039c cVar) {
        boolean z;
        synchronized (this.f7494a) {
            z = m9242n() && m9241m(cVar);
        }
        return z;
    }

    /* renamed from: q */
    public void mo7800q(AbstractC2039c cVar, AbstractC2039c cVar2) {
        this.f7496c = cVar;
        this.f7497d = cVar2;
    }
}
