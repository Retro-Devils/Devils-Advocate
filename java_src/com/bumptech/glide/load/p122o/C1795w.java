package com.bumptech.glide.load.p122o;

import com.bumptech.glide.load.AbstractC1643g;
import com.bumptech.glide.load.EnumC1630a;
import com.bumptech.glide.load.p120n.AbstractC1655d;
import com.bumptech.glide.load.p122o.AbstractC1749f;
import com.bumptech.glide.load.p126p.AbstractC1843n;
import java.io.File;
import java.util.List;

/* renamed from: com.bumptech.glide.load.o.w */
class C1795w implements AbstractC1749f, AbstractC1655d.AbstractC1656a<Object> {

    /* renamed from: b */
    private final AbstractC1749f.AbstractC1750a f7009b;

    /* renamed from: c */
    private final C1751g<?> f7010c;

    /* renamed from: d */
    private int f7011d;

    /* renamed from: e */
    private int f7012e = -1;

    /* renamed from: f */
    private AbstractC1643g f7013f;

    /* renamed from: g */
    private List<AbstractC1843n<File, ?>> f7014g;

    /* renamed from: h */
    private int f7015h;

    /* renamed from: i */
    private volatile AbstractC1843n.C1844a<?> f7016i;

    /* renamed from: j */
    private File f7017j;

    /* renamed from: k */
    private C1796x f7018k;

    C1795w(C1751g<?> gVar, AbstractC1749f.AbstractC1750a aVar) {
        this.f7010c = gVar;
        this.f7009b = aVar;
    }

    /* renamed from: b */
    private boolean m8379b() {
        return this.f7015h < this.f7014g.size();
    }

    @Override // com.bumptech.glide.load.p122o.AbstractC1749f
    /* renamed from: a */
    public boolean mo7241a() {
        List<AbstractC1643g> c = this.f7010c.mo7270c();
        boolean z = false;
        if (c.isEmpty()) {
            return false;
        }
        List<Class<?>> m = this.f7010c.mo7280m();
        if (!m.isEmpty()) {
            while (true) {
                if (this.f7014g == null || !m8379b()) {
                    int i = this.f7012e + 1;
                    this.f7012e = i;
                    if (i >= m.size()) {
                        int i2 = this.f7011d + 1;
                        this.f7011d = i2;
                        if (i2 >= c.size()) {
                            return false;
                        }
                        this.f7012e = 0;
                    }
                    AbstractC1643g gVar = c.get(this.f7011d);
                    Class<?> cls = m.get(this.f7012e);
                    this.f7018k = new C1796x(this.f7010c.mo7269b(), gVar, this.f7010c.mo7282o(), this.f7010c.mo7286s(), this.f7010c.mo7273f(), this.f7010c.mo7285r(cls), cls, this.f7010c.mo7278k());
                    File b = this.f7010c.mo7271d().mo7213b(this.f7018k);
                    this.f7017j = b;
                    if (b != null) {
                        this.f7013f = gVar;
                        this.f7014g = this.f7010c.mo7277j(b);
                        this.f7015h = 0;
                    }
                } else {
                    this.f7016i = null;
                    while (!z && m8379b()) {
                        List<AbstractC1843n<File, ?>> list = this.f7014g;
                        int i3 = this.f7015h;
                        this.f7015h = i3 + 1;
                        this.f7016i = list.get(i3).mo7393a(this.f7017j, this.f7010c.mo7286s(), this.f7010c.mo7273f(), this.f7010c.mo7278k());
                        if (this.f7016i != null && this.f7010c.mo7287t(this.f7016i.f7091c.mo7092a())) {
                            this.f7016i.f7091c.mo7101e(this.f7010c.mo7279l(), this);
                            z = true;
                        }
                    }
                    return z;
                }
            }
        } else if (File.class.equals(this.f7010c.mo7284q())) {
            return false;
        } else {
            throw new IllegalStateException("Failed to find any load path from " + this.f7010c.mo7276i() + " to " + this.f7010c.mo7284q());
        }
    }

    @Override // com.bumptech.glide.load.p122o.AbstractC1749f
    public void cancel() {
        AbstractC1843n.C1844a<?> aVar = this.f7016i;
        if (aVar != null) {
            aVar.f7091c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.p120n.AbstractC1655d.AbstractC1656a
    /* renamed from: d */
    public void mo7108d(Exception exc) {
        this.f7009b.mo7267d(this.f7018k, exc, this.f7016i.f7091c, EnumC1630a.RESOURCE_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.p120n.AbstractC1655d.AbstractC1656a
    /* renamed from: f */
    public void mo7109f(Object obj) {
        this.f7009b.mo7266c(this.f7013f, obj, this.f7016i.f7091c, EnumC1630a.RESOURCE_DISK_CACHE, this.f7018k);
    }
}
