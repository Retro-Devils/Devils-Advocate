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
    private final List<AbstractC1643g> f6793b;

    /* renamed from: c */
    private final C1751g<?> f6794c;

    /* renamed from: d */
    private final AbstractC1749f.AbstractC1750a f6795d;

    /* renamed from: e */
    private int f6796e;

    /* renamed from: f */
    private AbstractC1643g f6797f;

    /* renamed from: g */
    private List<AbstractC1843n<File, ?>> f6798g;

    /* renamed from: h */
    private int f6799h;

    /* renamed from: i */
    private volatile AbstractC1843n.C1844a<?> f6800i;

    /* renamed from: j */
    private File f6801j;

    C1736c(C1751g<?> gVar, AbstractC1749f.AbstractC1750a aVar) {
        this(gVar.mo7270c(), gVar, aVar);
    }

    C1736c(List<AbstractC1643g> list, C1751g<?> gVar, AbstractC1749f.AbstractC1750a aVar) {
        this.f6796e = -1;
        this.f6793b = list;
        this.f6794c = gVar;
        this.f6795d = aVar;
    }

    /* renamed from: b */
    private boolean m8165b() {
        return this.f6799h < this.f6798g.size();
    }

    @Override // com.bumptech.glide.load.p122o.AbstractC1749f
    /* renamed from: a */
    public boolean mo7241a() {
        while (true) {
            boolean z = false;
            if (this.f6798g == null || !m8165b()) {
                int i = this.f6796e + 1;
                this.f6796e = i;
                if (i >= this.f6793b.size()) {
                    return false;
                }
                AbstractC1643g gVar = this.f6793b.get(this.f6796e);
                File b = this.f6794c.mo7271d().mo7213b(new C1747d(gVar, this.f6794c.mo7282o()));
                this.f6801j = b;
                if (b != null) {
                    this.f6797f = gVar;
                    this.f6798g = this.f6794c.mo7277j(b);
                    this.f6799h = 0;
                }
            } else {
                this.f6800i = null;
                while (!z && m8165b()) {
                    List<AbstractC1843n<File, ?>> list = this.f6798g;
                    int i2 = this.f6799h;
                    this.f6799h = i2 + 1;
                    this.f6800i = list.get(i2).mo7393a(this.f6801j, this.f6794c.mo7286s(), this.f6794c.mo7273f(), this.f6794c.mo7278k());
                    if (this.f6800i != null && this.f6794c.mo7287t(this.f6800i.f7083c.mo7092a())) {
                        this.f6800i.f7083c.mo7101e(this.f6794c.mo7279l(), this);
                        z = true;
                    }
                }
                return z;
            }
        }
    }

    @Override // com.bumptech.glide.load.p122o.AbstractC1749f
    public void cancel() {
        AbstractC1843n.C1844a<?> aVar = this.f6800i;
        if (aVar != null) {
            aVar.f7083c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.p120n.AbstractC1655d.AbstractC1656a
    /* renamed from: d */
    public void mo7108d(Exception exc) {
        this.f6795d.mo7267d(this.f6797f, exc, this.f6800i.f7083c, EnumC1630a.DATA_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.p120n.AbstractC1655d.AbstractC1656a
    /* renamed from: f */
    public void mo7109f(Object obj) {
        this.f6795d.mo7266c(this.f6797f, obj, this.f6800i.f7083c, EnumC1630a.DATA_DISK_CACHE, this.f6797f);
    }
}
