package com.bumptech.glide.load.p122o;

import com.bumptech.glide.load.AbstractC1643g;
import com.bumptech.glide.load.EnumC1630a;
import com.bumptech.glide.load.p120n.AbstractC1655d;
import com.bumptech.glide.load.p122o.AbstractC1749f;
import com.bumptech.glide.load.p126p.AbstractC1843n;
import java.io.File;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.bumptech.glide.load.o.w */
public class C1795w implements AbstractC1749f, AbstractC1655d.AbstractC1656a<Object> {

    /* renamed from: b */
    private final AbstractC1749f.AbstractC1750a f7001b;

    /* renamed from: c */
    private final C1751g<?> f7002c;

    /* renamed from: d */
    private int f7003d;

    /* renamed from: e */
    private int f7004e = -1;

    /* renamed from: f */
    private AbstractC1643g f7005f;

    /* renamed from: g */
    private List<AbstractC1843n<File, ?>> f7006g;

    /* renamed from: h */
    private int f7007h;

    /* renamed from: i */
    private volatile AbstractC1843n.C1844a<?> f7008i;

    /* renamed from: j */
    private File f7009j;

    /* renamed from: k */
    private C1796x f7010k;

    C1795w(C1751g<?> gVar, AbstractC1749f.AbstractC1750a aVar) {
        this.f7002c = gVar;
        this.f7001b = aVar;
    }

    /* renamed from: b */
    private boolean m8379b() {
        return this.f7007h < this.f7006g.size();
    }

    @Override // com.bumptech.glide.load.p122o.AbstractC1749f
    /* renamed from: a */
    public boolean mo7241a() {
        List<AbstractC1643g> c = this.f7002c.mo7270c();
        boolean z = false;
        if (c.isEmpty()) {
            return false;
        }
        List<Class<?>> m = this.f7002c.mo7280m();
        if (!m.isEmpty()) {
            while (true) {
                if (this.f7006g == null || !m8379b()) {
                    int i = this.f7004e + 1;
                    this.f7004e = i;
                    if (i >= m.size()) {
                        int i2 = this.f7003d + 1;
                        this.f7003d = i2;
                        if (i2 >= c.size()) {
                            return false;
                        }
                        this.f7004e = 0;
                    }
                    AbstractC1643g gVar = c.get(this.f7003d);
                    Class<?> cls = m.get(this.f7004e);
                    this.f7010k = new C1796x(this.f7002c.mo7269b(), gVar, this.f7002c.mo7282o(), this.f7002c.mo7286s(), this.f7002c.mo7273f(), this.f7002c.mo7285r(cls), cls, this.f7002c.mo7278k());
                    File b = this.f7002c.mo7271d().mo7213b(this.f7010k);
                    this.f7009j = b;
                    if (b != null) {
                        this.f7005f = gVar;
                        this.f7006g = this.f7002c.mo7277j(b);
                        this.f7007h = 0;
                    }
                } else {
                    this.f7008i = null;
                    while (!z && m8379b()) {
                        List<AbstractC1843n<File, ?>> list = this.f7006g;
                        int i3 = this.f7007h;
                        this.f7007h = i3 + 1;
                        this.f7008i = list.get(i3).mo7393a(this.f7009j, this.f7002c.mo7286s(), this.f7002c.mo7273f(), this.f7002c.mo7278k());
                        if (this.f7008i != null && this.f7002c.mo7287t(this.f7008i.f7083c.mo7092a())) {
                            this.f7008i.f7083c.mo7101e(this.f7002c.mo7279l(), this);
                            z = true;
                        }
                    }
                    return z;
                }
            }
        } else if (File.class.equals(this.f7002c.mo7284q())) {
            return false;
        } else {
            throw new IllegalStateException("Failed to find any load path from " + this.f7002c.mo7276i() + " to " + this.f7002c.mo7284q());
        }
    }

    @Override // com.bumptech.glide.load.p122o.AbstractC1749f
    public void cancel() {
        AbstractC1843n.C1844a<?> aVar = this.f7008i;
        if (aVar != null) {
            aVar.f7083c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.p120n.AbstractC1655d.AbstractC1656a
    /* renamed from: d */
    public void mo7108d(Exception exc) {
        this.f7001b.mo7267d(this.f7010k, exc, this.f7008i.f7083c, EnumC1630a.RESOURCE_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.p120n.AbstractC1655d.AbstractC1656a
    /* renamed from: f */
    public void mo7109f(Object obj) {
        this.f7001b.mo7266c(this.f7005f, obj, this.f7008i.f7083c, EnumC1630a.RESOURCE_DISK_CACHE, this.f7010k);
    }
}
