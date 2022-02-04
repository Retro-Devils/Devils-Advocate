package com.bumptech.glide.load.p122o;

import com.bumptech.glide.p144t.C2081j;
import com.bumptech.glide.p144t.p145l.AbstractC2093c;
import com.bumptech.glide.p144t.p145l.C2084a;
import p006b.p030g.p038j.AbstractC0958f;

/* access modifiers changed from: package-private */
/* renamed from: com.bumptech.glide.load.o.u */
public final class C1792u<Z> implements AbstractC1794v<Z>, C2084a.AbstractC2090f {

    /* renamed from: b */
    private static final AbstractC0958f<C1792u<?>> f7004b = C2084a.m9456d(20, new C1793a());

    /* renamed from: c */
    private final AbstractC2093c f7005c = AbstractC2093c.m9473a();

    /* renamed from: d */
    private AbstractC1794v<Z> f7006d;

    /* renamed from: e */
    private boolean f7007e;

    /* renamed from: f */
    private boolean f7008f;

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
        this.f7008f = false;
        this.f7007e = true;
        this.f7006d = vVar;
    }

    /* renamed from: g */
    static <Z> C1792u<Z> m8365g(AbstractC1794v<Z> vVar) {
        C1792u<Z> uVar = (C1792u) C2081j.m9432d(f7004b.mo5399b());
        uVar.m8364a(vVar);
        return uVar;
    }

    /* renamed from: h */
    private void m8366h() {
        this.f7006d = null;
        f7004b.mo5398a(this);
    }

    @Override // com.bumptech.glide.load.p122o.AbstractC1794v
    /* renamed from: b */
    public int mo7357b() {
        return this.f7006d.mo7357b();
    }

    @Override // com.bumptech.glide.load.p122o.AbstractC1794v
    /* renamed from: c */
    public Z mo7358c() {
        return this.f7006d.mo7358c();
    }

    @Override // com.bumptech.glide.load.p122o.AbstractC1794v
    /* renamed from: d */
    public Class<Z> mo7359d() {
        return this.f7006d.mo7359d();
    }

    @Override // com.bumptech.glide.p144t.p145l.C2084a.AbstractC2090f
    /* renamed from: e */
    public AbstractC2093c mo7240e() {
        return this.f7005c;
    }

    @Override // com.bumptech.glide.load.p122o.AbstractC1794v
    /* renamed from: f */
    public synchronized void mo7361f() {
        this.f7005c.mo7875c();
        this.f7008f = true;
        if (!this.f7007e) {
            this.f7006d.mo7361f();
            m8366h();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public synchronized void mo7385i() {
        this.f7005c.mo7875c();
        if (this.f7007e) {
            this.f7007e = false;
            if (this.f7008f) {
                mo7361f();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }
}
