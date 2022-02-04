package p069c.p070a.p071a;

import android.annotation.TargetApi;
import android.net.TrafficStats;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* renamed from: c.a.a.i */
public class C1234i extends Thread {

    /* renamed from: b */
    private final BlockingQueue<AbstractC1239n<?>> f5430b;

    /* renamed from: c */
    private final AbstractC1233h f5431c;

    /* renamed from: d */
    private final AbstractC1222b f5432d;

    /* renamed from: e */
    private final AbstractC1248q f5433e;

    /* renamed from: f */
    private volatile boolean f5434f = false;

    public C1234i(BlockingQueue<AbstractC1239n<?>> blockingQueue, AbstractC1233h hVar, AbstractC1222b bVar, AbstractC1248q qVar) {
        this.f5430b = blockingQueue;
        this.f5431c = hVar;
        this.f5432d = bVar;
        this.f5433e = qVar;
    }

    @TargetApi(14)
    /* renamed from: a */
    private void m6598a(AbstractC1239n<?> nVar) {
        if (Build.VERSION.SDK_INT >= 14) {
            TrafficStats.setThreadStatsTag(nVar.mo6214x());
        }
    }

    /* renamed from: b */
    private void m6599b(AbstractC1239n<?> nVar, C1252u uVar) {
        this.f5433e.mo6164a(nVar, nVar.mo6182E(uVar));
    }

    /* renamed from: c */
    private void m6600c() {
        mo6175d(this.f5430b.take());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo6175d(AbstractC1239n<?> nVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            nVar.mo6192b("network-queue-take");
            if (nVar.mo6178A()) {
                nVar.mo6197h("network-discard-cancelled");
                nVar.mo6180C();
                return;
            }
            m6598a(nVar);
            C1236k a = this.f5431c.mo6174a(nVar);
            nVar.mo6192b("network-http-complete");
            if (!a.f5439e || !nVar.mo6216z()) {
                C1245p<?> F = nVar.mo6183F(a);
                nVar.mo6192b("network-parse-complete");
                if (nVar.mo6190M() && F.f5475b != null) {
                    this.f5432d.mo6150b(nVar.mo6201l(), F.f5475b);
                    nVar.mo6192b("network-cache-written");
                }
                nVar.mo6179B();
                this.f5433e.mo6165b(nVar, F);
                nVar.mo6181D(F);
                return;
            }
            nVar.mo6197h("not-modified");
            nVar.mo6180C();
        } catch (C1252u e) {
            e.mo6227a(SystemClock.elapsedRealtime() - elapsedRealtime);
            m6599b(nVar, e);
            nVar.mo6180C();
        } catch (Exception e2) {
            C1253v.m6668d(e2, "Unhandled exception %s", e2.toString());
            C1252u uVar = new C1252u(e2);
            uVar.mo6227a(SystemClock.elapsedRealtime() - elapsedRealtime);
            this.f5433e.mo6164a(nVar, uVar);
            nVar.mo6180C();
        }
    }

    /* renamed from: e */
    public void mo6176e() {
        this.f5434f = true;
        interrupt();
    }

    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                m6600c();
            } catch (InterruptedException unused) {
                if (this.f5434f) {
                    Thread.currentThread().interrupt();
                    return;
                }
                C1253v.m6667c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
