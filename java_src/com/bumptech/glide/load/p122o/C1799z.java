package com.bumptech.glide.load.p122o;

import android.util.Log;
import com.bumptech.glide.load.AbstractC1633d;
import com.bumptech.glide.load.AbstractC1643g;
import com.bumptech.glide.load.EnumC1630a;
import com.bumptech.glide.load.p120n.AbstractC1655d;
import com.bumptech.glide.load.p122o.AbstractC1749f;
import com.bumptech.glide.load.p126p.AbstractC1843n;
import com.bumptech.glide.p144t.C2077f;
import java.util.Collections;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.bumptech.glide.load.o.z */
public class C1799z implements AbstractC1749f, AbstractC1749f.AbstractC1750a {

    /* renamed from: b */
    private final C1751g<?> f7022b;

    /* renamed from: c */
    private final AbstractC1749f.AbstractC1750a f7023c;

    /* renamed from: d */
    private int f7024d;

    /* renamed from: e */
    private C1736c f7025e;

    /* renamed from: f */
    private Object f7026f;

    /* renamed from: g */
    private volatile AbstractC1843n.C1844a<?> f7027g;

    /* renamed from: h */
    private C1747d f7028h;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.o.z$a */
    public class C1800a implements AbstractC1655d.AbstractC1656a<Object> {

        /* renamed from: b */
        final /* synthetic */ AbstractC1843n.C1844a f7029b;

        C1800a(AbstractC1843n.C1844a aVar) {
            this.f7029b = aVar;
        }

        @Override // com.bumptech.glide.load.p120n.AbstractC1655d.AbstractC1656a
        /* renamed from: d */
        public void mo7108d(Exception exc) {
            if (C1799z.this.mo7390g(this.f7029b)) {
                C1799z.this.mo7392i(this.f7029b, exc);
            }
        }

        @Override // com.bumptech.glide.load.p120n.AbstractC1655d.AbstractC1656a
        /* renamed from: f */
        public void mo7109f(Object obj) {
            if (C1799z.this.mo7390g(this.f7029b)) {
                C1799z.this.mo7391h(this.f7029b, obj);
            }
        }
    }

    C1799z(C1751g<?> gVar, AbstractC1749f.AbstractC1750a aVar) {
        this.f7022b = gVar;
        this.f7023c = aVar;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    private void m8386e(Object obj) {
        long b = C2077f.m9416b();
        try {
            AbstractC1633d<X> p = this.f7022b.mo7283p(obj);
            C1748e eVar = new C1748e(p, obj, this.f7022b.mo7278k());
            this.f7028h = new C1747d(this.f7027g.f7081a, this.f7022b.mo7282o());
            this.f7022b.mo7271d().mo7212a(this.f7028h, eVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + this.f7028h + ", data: " + obj + ", encoder: " + p + ", duration: " + C2077f.m9415a(b));
            }
            this.f7027g.f7083c.mo7097b();
            this.f7025e = new C1736c(Collections.singletonList(this.f7027g.f7081a), this.f7022b, this);
        } catch (Throwable th) {
            this.f7027g.f7083c.mo7097b();
            throw th;
        }
    }

    /* renamed from: f */
    private boolean m8387f() {
        return this.f7024d < this.f7022b.mo7274g().size();
    }

    /* renamed from: j */
    private void m8388j(AbstractC1843n.C1844a<?> aVar) {
        this.f7027g.f7083c.mo7101e(this.f7022b.mo7279l(), new C1800a(aVar));
    }

    @Override // com.bumptech.glide.load.p122o.AbstractC1749f
    /* renamed from: a */
    public boolean mo7241a() {
        Object obj = this.f7026f;
        if (obj != null) {
            this.f7026f = null;
            m8386e(obj);
        }
        C1736c cVar = this.f7025e;
        if (cVar != null && cVar.mo7241a()) {
            return true;
        }
        this.f7025e = null;
        this.f7027g = null;
        boolean z = false;
        while (!z && m8387f()) {
            List<AbstractC1843n.C1844a<?>> g = this.f7022b.mo7274g();
            int i = this.f7024d;
            this.f7024d = i + 1;
            this.f7027g = g.get(i);
            if (this.f7027g != null && (this.f7022b.mo7272e().mo7317c(this.f7027g.f7083c.mo7098c()) || this.f7022b.mo7287t(this.f7027g.f7083c.mo7092a()))) {
                m8388j(this.f7027g);
                z = true;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.load.p122o.AbstractC1749f.AbstractC1750a
    /* renamed from: b */
    public void mo7265b() {
        throw new UnsupportedOperationException();
    }

    @Override // com.bumptech.glide.load.p122o.AbstractC1749f.AbstractC1750a
    /* renamed from: c */
    public void mo7266c(AbstractC1643g gVar, Object obj, AbstractC1655d<?> dVar, EnumC1630a aVar, AbstractC1643g gVar2) {
        this.f7023c.mo7266c(gVar, obj, dVar, this.f7027g.f7083c.mo7098c(), gVar);
    }

    @Override // com.bumptech.glide.load.p122o.AbstractC1749f
    public void cancel() {
        AbstractC1843n.C1844a<?> aVar = this.f7027g;
        if (aVar != null) {
            aVar.f7083c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.p122o.AbstractC1749f.AbstractC1750a
    /* renamed from: d */
    public void mo7267d(AbstractC1643g gVar, Exception exc, AbstractC1655d<?> dVar, EnumC1630a aVar) {
        this.f7023c.mo7267d(gVar, exc, dVar, this.f7027g.f7083c.mo7098c());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo7390g(AbstractC1843n.C1844a<?> aVar) {
        AbstractC1843n.C1844a<?> aVar2 = this.f7027g;
        return aVar2 != null && aVar2 == aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo7391h(AbstractC1843n.C1844a<?> aVar, Object obj) {
        AbstractC1763j e = this.f7022b.mo7272e();
        if (obj == null || !e.mo7317c(aVar.f7083c.mo7098c())) {
            AbstractC1749f.AbstractC1750a aVar2 = this.f7023c;
            AbstractC1643g gVar = aVar.f7081a;
            AbstractC1655d<Data> dVar = aVar.f7083c;
            aVar2.mo7266c(gVar, obj, dVar, dVar.mo7098c(), this.f7028h);
            return;
        }
        this.f7026f = obj;
        this.f7023c.mo7265b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo7392i(AbstractC1843n.C1844a<?> aVar, Exception exc) {
        AbstractC1749f.AbstractC1750a aVar2 = this.f7023c;
        C1747d dVar = this.f7028h;
        AbstractC1655d<Data> dVar2 = aVar.f7083c;
        aVar2.mo7267d(dVar, exc, dVar2, dVar2.mo7098c());
    }
}
