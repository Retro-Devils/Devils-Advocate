package p069c.p073b.p074a.p075a.p089g;

import com.google.android.gms.common.internal.C3027r;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* access modifiers changed from: package-private */
/* renamed from: c.b.a.a.g.n */
public final class C1387n<TResult> extends AbstractC1376d<TResult> {

    /* renamed from: a */
    private final Object f5669a = new Object();

    /* renamed from: b */
    private final C1385l<TResult> f5670b = new C1385l<>();
    @GuardedBy("mLock")

    /* renamed from: c */
    private boolean f5671c;

    /* renamed from: d */
    private volatile boolean f5672d;
    @GuardedBy("mLock")

    /* renamed from: e */
    private TResult f5673e;
    @GuardedBy("mLock")

    /* renamed from: f */
    private Exception f5674f;

    C1387n() {
    }

    @GuardedBy("mLock")
    /* renamed from: m */
    private final void m6981m() {
        C3027r.m12379k(this.f5671c, "Task is not yet complete");
    }

    @GuardedBy("mLock")
    /* renamed from: n */
    private final void m6982n() {
        C3027r.m12379k(!this.f5671c, "Task is already complete");
    }

    @GuardedBy("mLock")
    /* renamed from: o */
    private final void m6983o() {
        if (this.f5672d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    /* renamed from: p */
    private final void m6984p() {
        synchronized (this.f5669a) {
            if (this.f5671c) {
                this.f5670b.mo6434a(this);
            }
        }
    }

    @Override // p069c.p073b.p074a.p075a.p089g.AbstractC1376d
    /* renamed from: a */
    public final AbstractC1376d<TResult> mo6417a(AbstractC1373a aVar) {
        return mo6418b(C1378f.f5653a, aVar);
    }

    @Override // p069c.p073b.p074a.p075a.p089g.AbstractC1376d
    /* renamed from: b */
    public final AbstractC1376d<TResult> mo6418b(Executor executor, AbstractC1373a aVar) {
        this.f5670b.mo6435b(new C1380g(executor, aVar));
        m6984p();
        return this;
    }

    @Override // p069c.p073b.p074a.p075a.p089g.AbstractC1376d
    /* renamed from: c */
    public final AbstractC1376d<TResult> mo6419c(AbstractC1374b<? super TResult> bVar) {
        return mo6420d(C1378f.f5653a, bVar);
    }

    @Override // p069c.p073b.p074a.p075a.p089g.AbstractC1376d
    /* renamed from: d */
    public final AbstractC1376d<TResult> mo6420d(Executor executor, AbstractC1374b<? super TResult> bVar) {
        this.f5670b.mo6435b(new C1382i(executor, bVar));
        m6984p();
        return this;
    }

    @Override // p069c.p073b.p074a.p075a.p089g.AbstractC1376d
    /* renamed from: e */
    public final Exception mo6421e() {
        Exception exc;
        synchronized (this.f5669a) {
            exc = this.f5674f;
        }
        return exc;
    }

    @Override // p069c.p073b.p074a.p075a.p089g.AbstractC1376d
    /* renamed from: f */
    public final TResult mo6422f() {
        TResult tresult;
        synchronized (this.f5669a) {
            m6981m();
            m6983o();
            if (this.f5674f == null) {
                tresult = this.f5673e;
            } else {
                throw new C1375c(this.f5674f);
            }
        }
        return tresult;
    }

    @Override // p069c.p073b.p074a.p075a.p089g.AbstractC1376d
    /* renamed from: g */
    public final boolean mo6423g() {
        return this.f5672d;
    }

    @Override // p069c.p073b.p074a.p075a.p089g.AbstractC1376d
    /* renamed from: h */
    public final boolean mo6424h() {
        boolean z;
        synchronized (this.f5669a) {
            z = this.f5671c && !this.f5672d && this.f5674f == null;
        }
        return z;
    }

    /* renamed from: i */
    public final void mo6437i(Exception exc) {
        C3027r.m12377i(exc, "Exception must not be null");
        synchronized (this.f5669a) {
            m6982n();
            this.f5671c = true;
            this.f5674f = exc;
        }
        this.f5670b.mo6434a(this);
    }

    /* renamed from: j */
    public final void mo6438j(TResult tresult) {
        synchronized (this.f5669a) {
            m6982n();
            this.f5671c = true;
            this.f5673e = tresult;
        }
        this.f5670b.mo6434a(this);
    }

    /* renamed from: k */
    public final boolean mo6439k(Exception exc) {
        C3027r.m12377i(exc, "Exception must not be null");
        synchronized (this.f5669a) {
            if (this.f5671c) {
                return false;
            }
            this.f5671c = true;
            this.f5674f = exc;
            this.f5670b.mo6434a(this);
            return true;
        }
    }

    /* renamed from: l */
    public final boolean mo6440l(TResult tresult) {
        synchronized (this.f5669a) {
            if (this.f5671c) {
                return false;
            }
            this.f5671c = true;
            this.f5673e = tresult;
            this.f5670b.mo6434a(this);
            return true;
        }
    }
}
