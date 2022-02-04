package com.bumptech.glide.p140r;

import com.bumptech.glide.p140r.AbstractC2040d;

/* renamed from: com.bumptech.glide.r.i */
public class C2047i implements AbstractC2040d, AbstractC2039c {

    /* renamed from: a */
    private final AbstractC2040d f7544a;

    /* renamed from: b */
    private final Object f7545b;

    /* renamed from: c */
    private volatile AbstractC2039c f7546c;

    /* renamed from: d */
    private volatile AbstractC2039c f7547d;

    /* renamed from: e */
    private AbstractC2040d.EnumC2041a f7548e;

    /* renamed from: f */
    private AbstractC2040d.EnumC2041a f7549f;

    /* renamed from: g */
    private boolean f7550g;

    public C2047i(Object obj, AbstractC2040d dVar) {
        AbstractC2040d.EnumC2041a aVar = AbstractC2040d.EnumC2041a.CLEARED;
        this.f7548e = aVar;
        this.f7549f = aVar;
        this.f7545b = obj;
        this.f7544a = dVar;
    }

    /* renamed from: m */
    private boolean m9308m() {
        AbstractC2040d dVar = this.f7544a;
        return dVar == null || dVar.mo7799l(this);
    }

    /* renamed from: n */
    private boolean m9309n() {
        AbstractC2040d dVar = this.f7544a;
        return dVar == null || dVar.mo7798k(this);
    }

    /* renamed from: o */
    private boolean m9310o() {
        AbstractC2040d dVar = this.f7544a;
        return dVar == null || dVar.mo7786a(this);
    }

    @Override // com.bumptech.glide.p140r.AbstractC2040d
    /* renamed from: a */
    public boolean mo7786a(AbstractC2039c cVar) {
        boolean z;
        synchronized (this.f7545b) {
            z = m9310o() && (cVar.equals(this.f7546c) || this.f7548e != AbstractC2040d.EnumC2041a.SUCCESS);
        }
        return z;
    }

    @Override // com.bumptech.glide.p140r.AbstractC2039c
    /* renamed from: b */
    public void mo7787b() {
        synchronized (this.f7545b) {
            if (!this.f7549f.mo7801a()) {
                this.f7549f = AbstractC2040d.EnumC2041a.PAUSED;
                this.f7547d.mo7787b();
            }
            if (!this.f7548e.mo7801a()) {
                this.f7548e = AbstractC2040d.EnumC2041a.PAUSED;
                this.f7546c.mo7787b();
            }
        }
    }

    @Override // com.bumptech.glide.p140r.AbstractC2040d, com.bumptech.glide.p140r.AbstractC2039c
    /* renamed from: c */
    public boolean mo7788c() {
        boolean z;
        synchronized (this.f7545b) {
            if (!this.f7547d.mo7788c()) {
                if (!this.f7546c.mo7788c()) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    @Override // com.bumptech.glide.p140r.AbstractC2039c
    public void clear() {
        synchronized (this.f7545b) {
            this.f7550g = false;
            AbstractC2040d.EnumC2041a aVar = AbstractC2040d.EnumC2041a.CLEARED;
            this.f7548e = aVar;
            this.f7549f = aVar;
            this.f7547d.clear();
            this.f7546c.clear();
        }
    }

    @Override // com.bumptech.glide.p140r.AbstractC2040d
    /* renamed from: d */
    public AbstractC2040d mo7790d() {
        AbstractC2040d d;
        synchronized (this.f7545b) {
            AbstractC2040d dVar = this.f7544a;
            d = dVar != null ? dVar.mo7790d() : this;
        }
        return d;
    }

    @Override // com.bumptech.glide.p140r.AbstractC2040d
    /* renamed from: e */
    public void mo7791e(AbstractC2039c cVar) {
        synchronized (this.f7545b) {
            if (!cVar.equals(this.f7546c)) {
                this.f7549f = AbstractC2040d.EnumC2041a.FAILED;
                return;
            }
            this.f7548e = AbstractC2040d.EnumC2041a.FAILED;
            AbstractC2040d dVar = this.f7544a;
            if (dVar != null) {
                dVar.mo7791e(this);
            }
        }
    }

    @Override // com.bumptech.glide.p140r.AbstractC2039c
    /* renamed from: f */
    public void mo7792f() {
        AbstractC2040d.EnumC2041a aVar;
        AbstractC2040d.EnumC2041a aVar2;
        synchronized (this.f7545b) {
            this.f7550g = true;
            try {
                if (!(this.f7548e == AbstractC2040d.EnumC2041a.SUCCESS || this.f7549f == (aVar2 = AbstractC2040d.EnumC2041a.RUNNING))) {
                    this.f7549f = aVar2;
                    this.f7547d.mo7792f();
                }
                if (this.f7550g && this.f7548e != (aVar = AbstractC2040d.EnumC2041a.RUNNING)) {
                    this.f7548e = aVar;
                    this.f7546c.mo7792f();
                }
            } finally {
                this.f7550g = false;
            }
        }
    }

    @Override // com.bumptech.glide.p140r.AbstractC2040d
    /* renamed from: g */
    public void mo7793g(AbstractC2039c cVar) {
        synchronized (this.f7545b) {
            if (cVar.equals(this.f7547d)) {
                this.f7549f = AbstractC2040d.EnumC2041a.SUCCESS;
                return;
            }
            this.f7548e = AbstractC2040d.EnumC2041a.SUCCESS;
            AbstractC2040d dVar = this.f7544a;
            if (dVar != null) {
                dVar.mo7793g(this);
            }
            if (!this.f7549f.mo7801a()) {
                this.f7547d.clear();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    @Override // com.bumptech.glide.p140r.AbstractC2039c
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo7794h(com.bumptech.glide.p140r.AbstractC2039c r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof com.bumptech.glide.p140r.C2047i
            r1 = 0
            if (r0 == 0) goto L_0x002e
            com.bumptech.glide.r.i r4 = (com.bumptech.glide.p140r.C2047i) r4
            com.bumptech.glide.r.c r0 = r3.f7546c
            if (r0 != 0) goto L_0x0010
            com.bumptech.glide.r.c r0 = r4.f7546c
            if (r0 != 0) goto L_0x002e
            goto L_0x001a
        L_0x0010:
            com.bumptech.glide.r.c r0 = r3.f7546c
            com.bumptech.glide.r.c r2 = r4.f7546c
            boolean r0 = r0.mo7794h(r2)
            if (r0 == 0) goto L_0x002e
        L_0x001a:
            com.bumptech.glide.r.c r0 = r3.f7547d
            if (r0 != 0) goto L_0x0023
            com.bumptech.glide.r.c r4 = r4.f7547d
            if (r4 != 0) goto L_0x002e
            goto L_0x002d
        L_0x0023:
            com.bumptech.glide.r.c r0 = r3.f7547d
            com.bumptech.glide.r.c r4 = r4.f7547d
            boolean r4 = r0.mo7794h(r4)
            if (r4 == 0) goto L_0x002e
        L_0x002d:
            r1 = 1
        L_0x002e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p140r.C2047i.mo7794h(com.bumptech.glide.r.c):boolean");
    }

    @Override // com.bumptech.glide.p140r.AbstractC2039c
    /* renamed from: i */
    public boolean mo7795i() {
        boolean z;
        synchronized (this.f7545b) {
            z = this.f7548e == AbstractC2040d.EnumC2041a.SUCCESS;
        }
        return z;
    }

    @Override // com.bumptech.glide.p140r.AbstractC2039c
    public boolean isRunning() {
        boolean z;
        synchronized (this.f7545b) {
            z = this.f7548e == AbstractC2040d.EnumC2041a.RUNNING;
        }
        return z;
    }

    @Override // com.bumptech.glide.p140r.AbstractC2039c
    /* renamed from: j */
    public boolean mo7797j() {
        boolean z;
        synchronized (this.f7545b) {
            z = this.f7548e == AbstractC2040d.EnumC2041a.CLEARED;
        }
        return z;
    }

    @Override // com.bumptech.glide.p140r.AbstractC2040d
    /* renamed from: k */
    public boolean mo7798k(AbstractC2039c cVar) {
        boolean z;
        synchronized (this.f7545b) {
            z = m9309n() && cVar.equals(this.f7546c) && !mo7788c();
        }
        return z;
    }

    @Override // com.bumptech.glide.p140r.AbstractC2040d
    /* renamed from: l */
    public boolean mo7799l(AbstractC2039c cVar) {
        boolean z;
        synchronized (this.f7545b) {
            z = m9308m() && cVar.equals(this.f7546c) && this.f7548e != AbstractC2040d.EnumC2041a.PAUSED;
        }
        return z;
    }

    /* renamed from: p */
    public void mo7808p(AbstractC2039c cVar, AbstractC2039c cVar2) {
        this.f7546c = cVar;
        this.f7547d = cVar2;
    }
}
