package com.bumptech.glide.load.p122o;

import com.bumptech.glide.p144t.C2081j;
import com.bumptech.glide.p144t.p145l.AbstractC2093c;
import com.bumptech.glide.p144t.p145l.C2084a;
import p006b.p030g.p038j.AbstractC0958f;

/* access modifiers changed from: package-private */
/* renamed from: com.bumptech.glide.load.o.u */
public final class C1792u<Z> implements AbstractC1794v<Z>, C2084a.AbstractC2090f {

    /* renamed from: b */
    private static final AbstractC0958f<C1792u<?>> f6996b = C2084a.m9456d(20, new C1793a());

    /* renamed from: c */
    private final AbstractC2093c f6997c = AbstractC2093c.m9473a();

    /* renamed from: d */
    private AbstractC1794v<Z> f6998d;

    /* renamed from: e */
    private boolean f6999e;

    /* renamed from: f */
    private boolean f7000f;

    /* renamed from: com.bumptech.glide.load.o.u$a */
    class C1793a implements C2084a.AbstractC2088d<C1792u<?>> {
        C1793a() {
        }

        /* renamed from: b */
        public C1792u<?> mo7238a() {
            return new C1792u<>();
        }
    }

    C1792u() {
    }

    /* renamed from: a */
    private void m8364a(AbstractC1794v<Z> vVar) {
        this.f7000f = false;
        this.f6999e = true;
        this.f6998d = vVar;
    }

    /* renamed from: g */
    static <Z> C1792u<Z> m8365g(AbstractC1794v<Z> vVar) {
        C1792u<Z> uVar = (C1792u) C2081j.m9432d(f6996b.mo5399b());
        uVar.m8364a(vVar);
        return uVar;
    }

    /* renamed from: h */
    private void m8366h() {
        this.f6998d = null;
        f6996b.mo5398a(this);
    }

    @Override // com.bumptech.glide.load.p122o.AbstractC1794v
    /* renamed from: b */
    public int mo7357b() {
        return this.f6998d.mo7357b();
    }

    @Override // com.bumptech.glide.load.p122o.AbstractC1794v
    /* renamed from: c */
    public Z mo7358c() {
        return this.f6998d.mo7358c();
    }

    @Override // com.bumptech.glide.load.p122o.AbstractC1794v
    /* renamed from: d */
    public Class<Z> mo7359d() {
        return this.f6998d.mo7359d();
    }

    @Override // com.bumptech.glide.p144t.p145l.C2084a.AbstractC2090f
    /* renamed from: e */
    public AbstractC2093c mo7240e() {
        return this.f6997c;
    }

    @Override // com.bumptech.glide.load.p122o.AbstractC1794v
    /* renamed from: f */
    public synchronized void mo7361f() {
        this.f6997c.mo7875c();
        this.f7000f = true;
        if (!this.f6999e) {
            this.f6998d.mo7361f();
            m8366h();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public synchronized void mo7385i() {
        this.f6997c.mo7875c();
        if (this.f6999e) {
            this.f6999e = false;
            if (this.f7000f) {
                mo7361f();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }
}
