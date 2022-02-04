package p069c.p073b.p074a.p075a.p089g;

import java.util.concurrent.Executor;

/* renamed from: c.b.a.a.g.g */
public final class C1380g<TResult> implements AbstractC1384k<TResult> {

    /* renamed from: a */
    private final Executor f5656a;

    /* renamed from: b */
    private final Object f5657b = new Object();

    /* renamed from: c */
    private AbstractC1373a f5658c;

    public C1380g(Executor executor, AbstractC1373a aVar) {
        this.f5656a = executor;
        this.f5658c = aVar;
    }

    @Override // p069c.p073b.p074a.p075a.p089g.AbstractC1384k
    /* renamed from: a */
    public final void mo6431a(AbstractC1376d<TResult> dVar) {
        if (!dVar.mo6424h() && !dVar.mo6423g()) {
            synchronized (this.f5657b) {
                if (this.f5658c != null) {
                    this.f5656a.execute(new RunnableC1381h(this, dVar));
                }
            }
        }
    }
}
