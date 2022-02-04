package com.bumptech.glide.load.p120n;

import com.bumptech.glide.load.p120n.AbstractC1657e;
import com.bumptech.glide.load.p122o.p123a0.AbstractC1690b;
import com.bumptech.glide.load.p128q.p129d.C1945w;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.n.k */
public final class C1668k implements AbstractC1657e<InputStream> {

    /* renamed from: a */
    private final C1945w f6688a;

    /* renamed from: com.bumptech.glide.load.n.k$a */
    public static final class C1669a implements AbstractC1657e.AbstractC1658a<InputStream> {

        /* renamed from: a */
        private final AbstractC1690b f6689a;

        public C1669a(AbstractC1690b bVar) {
            this.f6689a = bVar;
        }

        @Override // com.bumptech.glide.load.p120n.AbstractC1657e.AbstractC1658a
        /* renamed from: a */
        public Class<InputStream> mo7112a() {
            return InputStream.class;
        }

        /* renamed from: c */
        public AbstractC1657e<InputStream> mo7113b(InputStream inputStream) {
            return new C1668k(inputStream, this.f6689a);
        }
    }

    public C1668k(InputStream inputStream, AbstractC1690b bVar) {
        C1945w wVar = new C1945w(inputStream, bVar);
        this.f6688a = wVar;
        wVar.mark(5242880);
    }

    @Override // com.bumptech.glide.load.p120n.AbstractC1657e
    /* renamed from: b */
    public void mo7111b() {
        this.f6688a.mo7538c();
    }

    /* renamed from: c */
    public void mo7127c() {
        this.f6688a.mo7537b();
    }

    /* renamed from: d */
    public InputStream mo7110a() {
        this.f6688a.reset();
        return this.f6688a;
    }
}
