package com.bumptech.glide.load.p126p.p127y;

import com.bumptech.glide.load.C1647i;
import com.bumptech.glide.load.p126p.AbstractC1843n;
import com.bumptech.glide.load.p126p.AbstractC1845o;
import com.bumptech.glide.load.p126p.C1829g;
import com.bumptech.glide.load.p126p.C1851r;
import java.io.InputStream;
import java.net.URL;

/* renamed from: com.bumptech.glide.load.p.y.f */
public class C1888f implements AbstractC1843n<URL, InputStream> {

    /* renamed from: a */
    private final AbstractC1843n<C1829g, InputStream> f7150a;

    /* renamed from: com.bumptech.glide.load.p.y.f$a */
    public static class C1889a implements AbstractC1845o<URL, InputStream> {
        @Override // com.bumptech.glide.load.p126p.AbstractC1845o
        /* renamed from: b */
        public AbstractC1843n<URL, InputStream> mo7398b(C1851r rVar) {
            return new C1888f(rVar.mo7452d(C1829g.class, InputStream.class));
        }
    }

    public C1888f(AbstractC1843n<C1829g, InputStream> nVar) {
        this.f7150a = nVar;
    }

    /* renamed from: c */
    public AbstractC1843n.C1844a<InputStream> mo7393a(URL url, int i, int i2, C1647i iVar) {
        return this.f7150a.mo7393a(new C1829g(url), i, i2, iVar);
    }

    /* renamed from: d */
    public boolean mo7394b(URL url) {
        return true;
    }
}
