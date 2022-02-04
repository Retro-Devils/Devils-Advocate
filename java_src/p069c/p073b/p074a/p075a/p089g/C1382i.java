package p069c.p073b.p074a.p075a.p089g;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* access modifiers changed from: package-private */
/* renamed from: c.b.a.a.g.i */
public final class C1382i<TResult> implements AbstractC1384k<TResult> {

    /* renamed from: a */
    private final Executor f5653a;

    /* renamed from: b */
    private final Object f5654b = new Object();
    @GuardedBy("mLock")

    /* renamed from: c */
    private AbstractC1374b<? super TResult> f5655c;

    public C1382i(Executor executor, AbstractC1374b<? super TResult> bVar) {
        this.f5653a = executor;
        this.f5655c = bVar;
    }

    @Override // p069c.p073b.p074a.p075a.p089g.AbstractC1384k
    /* renamed from: a */
    public final void mo6431a(AbstractC1376d<TResult> dVar) {
        if (dVar.mo6424h()) {
            synchronized (this.f5654b) {
                if (this.f5655c != null) {
                    this.f5653a.execute(new RunnableC1383j(this, dVar));
                }
            }
        }
    }
}
