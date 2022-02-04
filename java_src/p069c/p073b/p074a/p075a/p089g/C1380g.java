package p069c.p073b.p074a.p075a.p089g;

import java.util.concurrent.Executor;

/* renamed from: c.b.a.a.g.g */
public final class C1380g<TResult> implements AbstractC1384k<TResult> {

    /* renamed from: a */
    private final Executor f5648a;

    /* renamed from: b */
    private final Object f5649b = new Object();

    /* renamed from: c */
    private AbstractC1373a f5650c;

    public C1380g(Executor executor, AbstractC1373a aVar) {
        this.f5648a = executor;
        this.f5650c = aVar;
    }

    @Override // p069c.p073b.p074a.p075a.p089g.AbstractC1384k
    /* renamed from: a */
    public final void mo6431a(AbstractC1376d<TResult> dVar) {
        if (!dVar.mo6424h() && !dVar.mo6423g()) {
            synchronized (this.f5649b) {
                if (this.f5650c != null) {
                    this.f5648a.execute(new RunnableC1381h(this, dVar));
                }
            }
        }
    }
}
