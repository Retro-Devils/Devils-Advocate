package com.bumptech.glide.load.p122o;

import com.bumptech.glide.load.AbstractC1643g;
import com.bumptech.glide.load.EnumC1630a;
import com.bumptech.glide.load.p120n.AbstractC1655d;
import com.bumptech.glide.load.p122o.AbstractC1749f;
import com.bumptech.glide.load.p126p.AbstractC1843n;
import java.io.File;
import java.util.List;

/* renamed from: com.bumptech.glide.load.o.c */
class C1736c implements AbstractC1749f, AbstractC1655d.AbstractC1656a<Object> {

    /* renamed from: b */
    private final List<AbstractC1643g> f6801b;

    /* renamed from: c */
    private final C1751g<?> f6802c;

    /* renamed from: d */
    private final AbstractC1749f.AbstractC1750a f6803d;

    /* renamed from: e */
    private int f6804e;

    /* renamed from: f */
    private AbstractC1643g f6805f;

    /* renamed from: g */
    private List<AbstractC1843n<File, ?>> f6806g;

    /* renamed from: h */
    private int f6807h;

    /* renamed from: i */
    private volatile AbstractC1843n.C1844a<?> f6808i;

    /* renamed from: j */
    private File f6809j;

    C1736c(C1751g<?> gVar, AbstractC1749f.AbstractC1750a aVar) {
        this(gVar.mo7270c(), gVar, aVar);
    }

    C1736c(List<AbstractC1643g> list, C1751g<?> gVar, AbstractC1749f.AbstractC1750a aVar) {
        this.f6804e = -1;
        this.f6801b = list;
        this.f6802c = gVar;
        this.f6803d = aVar;
    }

    /* renamed from: b */
    private boolean m8165b() {
        return this.f6807h < this.f6806g.size();
    }

    @Override // com.bumptech.glide.load.p122o.AbstractC1749f
    /* renamed from: a */
    public boolean mo7241a() {
        while (true) {
            boolean z = false;
            if (this.f6806g == null || !m8165b()) {
                int i = this.f6804e + 1;
                this.f6804e = i;
                if (i >= this.f6801b.size()) {
                    return false;
                }
                AbstractC1643g gVar = this.f6801b.get(this.f6804e);
                File b = this.f6802c.mo7271d().mo7213b(new C1747d(gVar, this.f6802c.mo7282o()));
                this.f6809j = b;
                if (b != null) {
                    this.f6805f = gVar;
                    this.f6806g = this.f6802c.mo7277j(b);
                    this.f6807h = 0;
                }
            } else {
                this.f6808i = null;
                while (!z && m8165b()) {
                    List<AbstractC1843n<File, ?>> list = this.f6806g;
                    int i2 = this.f6807h;
                    this.f6807h = i2 + 1;
                    this.f6808i = list.get(i2).mo7393a(this.f6809j, this.f6802c.mo7286s(), this.f6802c.mo7273f(), this.f6802c.mo7278k());
                    if (this.f6808i != null && this.f6802c.mo7287t(this.f6808i.f7091c.mo7092a())) {
                        this.f6808i.f7091c.mo7101e(this.f6802c.mo7279l(), this);
                        z = true;
                    }
                }
                return z;
            }
        }
    }

    @Override // com.bumptech.glide.load.p122o.AbstractC1749f
    public void cancel() {
        AbstractC1843n.C1844a<?> aVar = this.f6808i;
        if (aVar != null) {
            aVar.f7091c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.p120n.AbstractC1655d.AbstractC1656a
    /* renamed from: d */
    public void mo7108d(Exception exc) {
        this.f6803d.mo7267d(this.f6805f, exc, this.f6808i.f7091c, EnumC1630a.DATA_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.p120n.AbstractC1655d.AbstractC1656a
    /* renamed from: f */
    public void mo7109f(Object obj) {
        this.f6803d.mo7266c(this.f6805f, obj, this.f6808i.f7091c, EnumC1630a.DATA_DISK_CACHE, this.f6805f);
    }
}
