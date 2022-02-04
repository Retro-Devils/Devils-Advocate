package p069c.p070a.p071a;

import android.os.Process;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import p069c.p070a.p071a.AbstractC1222b;
import p069c.p070a.p071a.AbstractC1239n;

/* renamed from: c.a.a.c */
public class C1224c extends Thread {

    /* renamed from: b */
    private static final boolean f5414b = C1253v.f5488b;

    /* renamed from: c */
    private final BlockingQueue<AbstractC1239n<?>> f5415c;

    /* renamed from: d */
    private final BlockingQueue<AbstractC1239n<?>> f5416d;

    /* renamed from: e */
    private final AbstractC1222b f5417e;

    /* renamed from: f */
    private final AbstractC1248q f5418f;

    /* renamed from: g */
    private volatile boolean f5419g = false;

    /* renamed from: h */
    private final C1226b f5420h;

    /* access modifiers changed from: package-private */
    /* renamed from: c.a.a.c$a */
    public class RunnableC1225a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ AbstractC1239n f5421b;

        RunnableC1225a(AbstractC1239n nVar) {
            this.f5421b = nVar;
        }

        public void run() {
            try {
                C1224c.this.f5416d.put(this.f5421b);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c.a.a.c$b */
    public static class C1226b implements AbstractC1239n.AbstractC1241b {

        /* renamed from: a */
        private final Map<String, List<AbstractC1239n<?>>> f5423a = new HashMap();

        /* renamed from: b */
        private final C1224c f5424b;

        C1226b(C1224c cVar) {
            this.f5424b = cVar;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: d */
        private synchronized boolean m6585d(AbstractC1239n<?> nVar) {
            String l = nVar.mo6201l();
            if (this.f5423a.containsKey(l)) {
                List<AbstractC1239n<?>> list = this.f5423a.get(l);
                if (list == null) {
                    list = new ArrayList<>();
                }
                nVar.mo6192b("waiting-for-response");
                list.add(nVar);
                this.f5423a.put(l, list);
                if (C1253v.f5488b) {
                    C1253v.m6666b("Request for cacheKey=%s is in flight, putting on hold.", l);
                }
                return true;
            }
            this.f5423a.put(l, null);
            nVar.mo6185H(this);
            if (C1253v.f5488b) {
                C1253v.m6666b("new request, sending to network %s", l);
            }
            return false;
        }

        @Override // p069c.p070a.p071a.AbstractC1239n.AbstractC1241b
        /* renamed from: a */
        public synchronized void mo6158a(AbstractC1239n<?> nVar) {
            String l = nVar.mo6201l();
            List<AbstractC1239n<?>> remove = this.f5423a.remove(l);
            if (remove != null && !remove.isEmpty()) {
                if (C1253v.f5488b) {
                    C1253v.m6669e("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(remove.size()), l);
                }
                AbstractC1239n<?> remove2 = remove.remove(0);
                this.f5423a.put(l, remove);
                remove2.mo6185H(this);
                try {
                    this.f5424b.f5416d.put(remove2);
                } catch (InterruptedException e) {
                    C1253v.m6667c("Couldn't add request to queue. %s", e.toString());
                    Thread.currentThread().interrupt();
                    this.f5424b.mo6155e();
                }
            }
        }

        @Override // p069c.p070a.p071a.AbstractC1239n.AbstractC1241b
        /* renamed from: b */
        public void mo6159b(AbstractC1239n<?> nVar, C1245p<?> pVar) {
            List<AbstractC1239n<?>> remove;
            AbstractC1222b.C1223a aVar = pVar.f5482b;
            if (aVar == null || aVar.mo6152a()) {
                mo6158a(nVar);
                return;
            }
            String l = nVar.mo6201l();
            synchronized (this) {
                remove = this.f5423a.remove(l);
            }
            if (remove != null) {
                if (C1253v.f5488b) {
                    C1253v.m6669e("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(remove.size()), l);
                }
                for (AbstractC1239n<?> nVar2 : remove) {
                    this.f5424b.f5418f.mo6165b(nVar2, pVar);
                }
            }
        }
    }

    public C1224c(BlockingQueue<AbstractC1239n<?>> blockingQueue, BlockingQueue<AbstractC1239n<?>> blockingQueue2, AbstractC1222b bVar, AbstractC1248q qVar) {
        this.f5415c = blockingQueue;
        this.f5416d = blockingQueue2;
        this.f5417e = bVar;
        this.f5418f = qVar;
        this.f5420h = new C1226b(this);
    }

    /* renamed from: c */
    private void m6581c() {
        mo6154d(this.f5415c.take());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo6154d(AbstractC1239n<?> nVar) {
        nVar.mo6192b("cache-queue-take");
        if (nVar.mo6178A()) {
            nVar.mo6197h("cache-discard-canceled");
            return;
        }
        AbstractC1222b.C1223a c = this.f5417e.mo6151c(nVar.mo6201l());
        if (c == null) {
            nVar.mo6192b("cache-miss");
            if (!this.f5420h.m6585d(nVar)) {
                this.f5416d.put(nVar);
            }
        } else if (c.mo6152a()) {
            nVar.mo6192b("cache-hit-expired");
            nVar.mo6184G(c);
            if (!this.f5420h.m6585d(nVar)) {
                this.f5416d.put(nVar);
            }
        } else {
            nVar.mo6192b("cache-hit");
            C1245p<?> F = nVar.mo6183F(new C1236k(c.f5406a, c.f5412g));
            nVar.mo6192b("cache-hit-parsed");
            if (c.mo6153b()) {
                nVar.mo6192b("cache-hit-refresh-needed");
                nVar.mo6184G(c);
                F.f5484d = true;
                if (!this.f5420h.m6585d(nVar)) {
                    this.f5418f.mo6166c(nVar, F, new RunnableC1225a(nVar));
                    return;
                }
            }
            this.f5418f.mo6165b(nVar, F);
        }
    }

    /* renamed from: e */
    public void mo6155e() {
        this.f5419g = true;
        interrupt();
    }

    public void run() {
        if (f5414b) {
            C1253v.m6669e("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f5417e.mo6149a();
        while (true) {
            try {
                m6581c();
            } catch (InterruptedException unused) {
                if (this.f5419g) {
                    Thread.currentThread().interrupt();
                    return;
                }
                C1253v.m6667c("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
