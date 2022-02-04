package p069c.p070a.p071a;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: c.a.a.o */
public class C1243o {

    /* renamed from: a */
    private final AtomicInteger f5464a;

    /* renamed from: b */
    private final Set<AbstractC1239n<?>> f5465b;

    /* renamed from: c */
    private final PriorityBlockingQueue<AbstractC1239n<?>> f5466c;

    /* renamed from: d */
    private final PriorityBlockingQueue<AbstractC1239n<?>> f5467d;

    /* renamed from: e */
    private final AbstractC1222b f5468e;

    /* renamed from: f */
    private final AbstractC1233h f5469f;

    /* renamed from: g */
    private final AbstractC1248q f5470g;

    /* renamed from: h */
    private final C1234i[] f5471h;

    /* renamed from: i */
    private C1224c f5472i;

    /* renamed from: j */
    private final List<AbstractC1244a> f5473j;

    /* renamed from: c.a.a.o$a */
    public interface AbstractC1244a<T> {
        /* renamed from: a */
        void mo6223a(AbstractC1239n<T> nVar);
    }

    public C1243o(AbstractC1222b bVar, AbstractC1233h hVar) {
        this(bVar, hVar, 4);
    }

    public C1243o(AbstractC1222b bVar, AbstractC1233h hVar, int i) {
        this(bVar, hVar, i, new C1229f(new Handler(Looper.getMainLooper())));
    }

    public C1243o(AbstractC1222b bVar, AbstractC1233h hVar, int i, AbstractC1248q qVar) {
        this.f5464a = new AtomicInteger();
        this.f5465b = new HashSet();
        this.f5466c = new PriorityBlockingQueue<>();
        this.f5467d = new PriorityBlockingQueue<>();
        this.f5473j = new ArrayList();
        this.f5468e = bVar;
        this.f5469f = hVar;
        this.f5471h = new C1234i[i];
        this.f5470g = qVar;
    }

    /* renamed from: a */
    public <T> AbstractC1239n<T> mo6218a(AbstractC1239n<T> nVar) {
        nVar.mo6186I(this);
        synchronized (this.f5465b) {
            this.f5465b.add(nVar);
        }
        nVar.mo6188K(mo6220c());
        nVar.mo6192b("add-to-queue");
        (!nVar.mo6190M() ? this.f5467d : this.f5466c).add(nVar);
        return nVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public <T> void mo6219b(AbstractC1239n<T> nVar) {
        synchronized (this.f5465b) {
            this.f5465b.remove(nVar);
        }
        synchronized (this.f5473j) {
            for (AbstractC1244a aVar : this.f5473j) {
                aVar.mo6223a(nVar);
            }
        }
    }

    /* renamed from: c */
    public int mo6220c() {
        return this.f5464a.incrementAndGet();
    }

    /* renamed from: d */
    public void mo6221d() {
        mo6222e();
        C1224c cVar = new C1224c(this.f5466c, this.f5467d, this.f5468e, this.f5470g);
        this.f5472i = cVar;
        cVar.start();
        for (int i = 0; i < this.f5471h.length; i++) {
            C1234i iVar = new C1234i(this.f5467d, this.f5469f, this.f5468e, this.f5470g);
            this.f5471h[i] = iVar;
            iVar.start();
        }
    }

    /* renamed from: e */
    public void mo6222e() {
        C1224c cVar = this.f5472i;
        if (cVar != null) {
            cVar.mo6155e();
        }
        C1234i[] iVarArr = this.f5471h;
        for (C1234i iVar : iVarArr) {
            if (iVar != null) {
                iVar.mo6176e();
            }
        }
    }
}
