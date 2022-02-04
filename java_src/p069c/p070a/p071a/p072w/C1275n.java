package p069c.p070a.p071a.p072w;

import java.io.UnsupportedEncodingException;
import p069c.p070a.p071a.AbstractC1239n;
import p069c.p070a.p071a.C1236k;
import p069c.p070a.p071a.C1245p;

/* renamed from: c.a.a.w.n */
public class C1275n extends AbstractC1239n<String> {

    /* renamed from: q */
    private final Object f5526q;

    /* renamed from: r */
    private C1245p.AbstractC1247b<String> f5527r;

    public C1275n(int i, String str, C1245p.AbstractC1247b<String> bVar, C1245p.AbstractC1246a aVar) {
        super(i, str, aVar);
        this.f5526q = new Object();
        this.f5527r = bVar;
    }

    public C1275n(String str, C1245p.AbstractC1247b<String> bVar, C1245p.AbstractC1246a aVar) {
        this(0, str, bVar, aVar);
    }

    /* access modifiers changed from: protected */
    @Override // p069c.p070a.p071a.AbstractC1239n
    /* renamed from: F */
    public C1245p<String> mo6183F(C1236k kVar) {
        String str;
        try {
            str = new String(kVar.f5436b, C1266g.m6721d(kVar.f5437c));
        } catch (UnsupportedEncodingException unused) {
            str = new String(kVar.f5436b);
        }
        return C1245p.m6654c(str, C1266g.m6720c(kVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public void mo6196e(String str) {
        C1245p.AbstractC1247b<String> bVar;
        synchronized (this.f5526q) {
            bVar = this.f5527r;
        }
        if (bVar != null) {
            bVar.mo6226a(str);
        }
    }
}
