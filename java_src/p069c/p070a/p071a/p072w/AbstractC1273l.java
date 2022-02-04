package p069c.p070a.p071a.p072w;

import java.io.UnsupportedEncodingException;
import p069c.p070a.p071a.AbstractC1239n;
import p069c.p070a.p071a.C1245p;
import p069c.p070a.p071a.C1253v;

/* renamed from: c.a.a.w.l */
public abstract class AbstractC1273l<T> extends AbstractC1239n<T> {

    /* renamed from: q */
    private static final String f5528q = String.format("application/json; charset=%s", "utf-8");

    /* renamed from: r */
    private final Object f5529r = new Object();

    /* renamed from: s */
    private C1245p.AbstractC1247b<T> f5530s;

    /* renamed from: t */
    private final String f5531t;

    public AbstractC1273l(int i, String str, String str2, C1245p.AbstractC1247b<T> bVar, C1245p.AbstractC1246a aVar) {
        super(i, str, aVar);
        this.f5530s = bVar;
        this.f5531t = str2;
    }

    /* access modifiers changed from: protected */
    @Override // p069c.p070a.p071a.AbstractC1239n
    /* renamed from: e */
    public void mo6196e(T t) {
        C1245p.AbstractC1247b<T> bVar;
        synchronized (this.f5529r) {
            bVar = this.f5530s;
        }
        if (bVar != null) {
            bVar.mo6226a(t);
        }
    }

    @Override // p069c.p070a.p071a.AbstractC1239n
    /* renamed from: i */
    public byte[] mo6198i() {
        try {
            String str = this.f5531t;
            if (str == null) {
                return null;
            }
            return str.getBytes("utf-8");
        } catch (UnsupportedEncodingException unused) {
            C1253v.m6670f("Unsupported Encoding while trying to get the bytes of %s using %s", this.f5531t, "utf-8");
            return null;
        }
    }

    @Override // p069c.p070a.p071a.AbstractC1239n
    /* renamed from: j */
    public String mo6199j() {
        return f5528q;
    }

    @Override // p069c.p070a.p071a.AbstractC1239n
    @Deprecated
    /* renamed from: q */
    public byte[] mo6206q() {
        return mo6198i();
    }

    @Override // p069c.p070a.p071a.AbstractC1239n
    @Deprecated
    /* renamed from: r */
    public String mo6207r() {
        return mo6199j();
    }
}
