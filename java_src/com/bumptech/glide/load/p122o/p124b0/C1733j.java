package com.bumptech.glide.load.p122o.p124b0;

import com.bumptech.glide.load.AbstractC1643g;
import com.bumptech.glide.p144t.C2078g;
import com.bumptech.glide.p144t.C2081j;
import com.bumptech.glide.p144t.C2082k;
import com.bumptech.glide.p144t.p145l.AbstractC2093c;
import com.bumptech.glide.p144t.p145l.C2084a;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p006b.p030g.p038j.AbstractC0958f;

/* renamed from: com.bumptech.glide.load.o.b0.j */
public class C1733j {

    /* renamed from: a */
    private final C2078g<AbstractC1643g, String> f6796a = new C2078g<>(1000);

    /* renamed from: b */
    private final AbstractC0958f<C1735b> f6797b = C2084a.m9456d(10, new C1734a());

    /* renamed from: com.bumptech.glide.load.o.b0.j$a */
    class C1734a implements C2084a.AbstractC2088d<C1735b> {
        C1734a() {
        }

        /* renamed from: b */
        public C1735b mo7238a() {
            try {
                return new C1735b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.o.b0.j$b */
    public static final class C1735b implements C2084a.AbstractC2090f {

        /* renamed from: b */
        final MessageDigest f6799b;

        /* renamed from: c */
        private final AbstractC2093c f6800c = AbstractC2093c.m9473a();

        C1735b(MessageDigest messageDigest) {
            this.f6799b = messageDigest;
        }

        @Override // com.bumptech.glide.p144t.p145l.C2084a.AbstractC2090f
        /* renamed from: e */
        public AbstractC2093c mo7240e() {
            return this.f6800c;
        }
    }

    /* renamed from: a */
    private String m8160a(AbstractC1643g gVar) {
        C1735b bVar = (C1735b) C2081j.m9432d(this.f6797b.mo5399b());
        try {
            gVar.mo7075a(bVar.f6799b);
            return C2082k.m9452s(bVar.f6799b.digest());
        } finally {
            this.f6797b.mo5398a(bVar);
        }
    }

    /* renamed from: b */
    public String mo7237b(AbstractC1643g gVar) {
        String g;
        synchronized (this.f6796a) {
            g = this.f6796a.mo7856g(gVar);
        }
        if (g == null) {
            g = m8160a(gVar);
        }
        synchronized (this.f6796a) {
            this.f6796a.mo7858k(gVar, g);
        }
        return g;
    }
}
