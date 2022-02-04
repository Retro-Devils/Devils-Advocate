package p069c.p070a.p071a;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: c.a.a.f */
public class C1229f implements AbstractC1248q {

    /* renamed from: a */
    private final Executor f5429a;

    /* renamed from: c.a.a.f$a */
    class ExecutorC1230a implements Executor {

        /* renamed from: a */
        final /* synthetic */ Handler f5430a;

        ExecutorC1230a(Handler handler) {
            this.f5430a = handler;
        }

        public void execute(Runnable runnable) {
            this.f5430a.post(runnable);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c.a.a.f$b */
    public static class RunnableC1231b implements Runnable {

        /* renamed from: b */
        private final AbstractC1239n f5432b;

        /* renamed from: c */
        private final C1245p f5433c;

        /* renamed from: d */
        private final Runnable f5434d;

        public RunnableC1231b(AbstractC1239n nVar, C1245p pVar, Runnable runnable) {
            this.f5432b = nVar;
            this.f5433c = pVar;
            this.f5434d = runnable;
        }

        public void run() {
            if (this.f5432b.mo6178A()) {
                this.f5432b.mo6197h("canceled-at-delivery");
                return;
            }
            if (this.f5433c.mo6224b()) {
                this.f5432b.mo6196e(this.f5433c.f5481a);
            } else {
                this.f5432b.mo6195d(this.f5433c.f5483c);
            }
            if (this.f5433c.f5484d) {
                this.f5432b.mo6192b("intermediate-response");
            } else {
                this.f5432b.mo6197h("done");
            }
            Runnable runnable = this.f5434d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public C1229f(Handler handler) {
        this.f5429a = new ExecutorC1230a(handler);
    }

    @Override // p069c.p070a.p071a.AbstractC1248q
    /* renamed from: a */
    public void mo6164a(AbstractC1239n<?> nVar, C1252u uVar) {
        nVar.mo6192b("post-error");
        this.f5429a.execute(new RunnableC1231b(nVar, C1245p.m6653a(uVar), null));
    }

    @Override // p069c.p070a.p071a.AbstractC1248q
    /* renamed from: b */
    public void mo6165b(AbstractC1239n<?> nVar, C1245p<?> pVar) {
        mo6166c(nVar, pVar, null);
    }

    @Override // p069c.p070a.p071a.AbstractC1248q
    /* renamed from: c */
    public void mo6166c(AbstractC1239n<?> nVar, C1245p<?> pVar, Runnable runnable) {
        nVar.mo6179B();
        nVar.mo6192b("post-response");
        this.f5429a.execute(new RunnableC1231b(nVar, pVar, runnable));
    }
}
