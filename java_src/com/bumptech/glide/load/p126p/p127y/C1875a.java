package com.bumptech.glide.load.p126p.p127y;

import com.bumptech.glide.load.C1644h;
import com.bumptech.glide.load.C1647i;
import com.bumptech.glide.load.p120n.C1665j;
import com.bumptech.glide.load.p126p.AbstractC1843n;
import com.bumptech.glide.load.p126p.AbstractC1845o;
import com.bumptech.glide.load.p126p.C1829g;
import com.bumptech.glide.load.p126p.C1840m;
import com.bumptech.glide.load.p126p.C1851r;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.p.y.a */
public class C1875a implements AbstractC1843n<C1829g, InputStream> {

    /* renamed from: a */
    public static final C1644h<Integer> f7124a = C1644h.m7873f("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* renamed from: b */
    private final C1840m<C1829g, C1829g> f7125b;

    /* renamed from: com.bumptech.glide.load.p.y.a$a */
    public static class C1876a implements AbstractC1845o<C1829g, InputStream> {

        /* renamed from: a */
        private final C1840m<C1829g, C1829g> f7126a = new C1840m<>(500);

        @Override // com.bumptech.glide.load.p126p.AbstractC1845o
        /* renamed from: b */
        public AbstractC1843n<C1829g, InputStream> mo7398b(C1851r rVar) {
            return new C1875a(this.f7126a);
        }
    }

    public C1875a(C1840m<C1829g, C1829g> mVar) {
        this.f7125b = mVar;
    }

    /* renamed from: c */
    public AbstractC1843n.C1844a<InputStream> mo7393a(C1829g gVar, int i, int i2, C1647i iVar) {
        C1840m<C1829g, C1829g> mVar = this.f7125b;
        if (mVar != null) {
            C1829g a = mVar.mo7438a(gVar, 0, 0);
            if (a == null) {
                this.f7125b.mo7439b(gVar, 0, 0, gVar);
            } else {
                gVar = a;
            }
        }
        return new AbstractC1843n.C1844a<>(gVar, new C1665j(gVar, ((Integer) iVar.mo7084c(f7124a)).intValue()));
    }

    /* renamed from: d */
    public boolean mo7394b(C1829g gVar) {
        return true;
    }
}
