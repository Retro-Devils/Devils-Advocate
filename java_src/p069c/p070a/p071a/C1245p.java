package p069c.p070a.p071a;

import p069c.p070a.p071a.AbstractC1222b;

/* renamed from: c.a.a.p */
public class C1245p<T> {

    /* renamed from: a */
    public final T f5481a;

    /* renamed from: b */
    public final AbstractC1222b.C1223a f5482b;

    /* renamed from: c */
    public final C1252u f5483c;

    /* renamed from: d */
    public boolean f5484d;

    /* renamed from: c.a.a.p$a */
    public interface AbstractC1246a {
        /* renamed from: a */
        void mo6225a(C1252u uVar);
    }

    /* renamed from: c.a.a.p$b */
    public interface AbstractC1247b<T> {
        /* renamed from: a */
        void mo6226a(T t);
    }

    private C1245p(C1252u uVar) {
        this.f5484d = false;
        this.f5481a = null;
        this.f5482b = null;
        this.f5483c = uVar;
    }

    private C1245p(T t, AbstractC1222b.C1223a aVar) {
        this.f5484d = false;
        this.f5481a = t;
        this.f5482b = aVar;
        this.f5483c = null;
    }

    /* renamed from: a */
    public static <T> C1245p<T> m6653a(C1252u uVar) {
        return new C1245p<>(uVar);
    }

    /* renamed from: c */
    public static <T> C1245p<T> m6654c(T t, AbstractC1222b.C1223a aVar) {
        return new C1245p<>(t, aVar);
    }

    /* renamed from: b */
    public boolean mo6224b() {
        return this.f5483c == null;
    }
}
