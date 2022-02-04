package p069c.p073b.p074a.p075a.p089g;

import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;

/* access modifiers changed from: package-private */
/* renamed from: c.b.a.a.g.l */
public final class C1385l<TResult> {

    /* renamed from: a */
    private final Object f5658a = new Object();
    @GuardedBy("mLock")

    /* renamed from: b */
    private Queue<AbstractC1384k<TResult>> f5659b;
    @GuardedBy("mLock")

    /* renamed from: c */
    private boolean f5660c;

    C1385l() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        r1 = r2.f5658a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0012, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0 = r2.f5659b.poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        if (r0 != null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001d, code lost:
        r2.f5660c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0021, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0022, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0023, code lost:
        r0.mo6431a(r3);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6434a(p069c.p073b.p074a.p075a.p089g.AbstractC1376d<TResult> r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f5658a
            monitor-enter(r0)
            java.util.Queue<c.b.a.a.g.k<TResult>> r1 = r2.f5659b     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x002a
            boolean r1 = r2.f5660c     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x000c
            goto L_0x002a
        L_0x000c:
            r1 = 1
            r2.f5660c = r1     // Catch:{ all -> 0x002c }
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
        L_0x0010:
            java.lang.Object r1 = r2.f5658a
            monitor-enter(r1)
            java.util.Queue<c.b.a.a.g.k<TResult>> r0 = r2.f5659b     // Catch:{ all -> 0x0027 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0027 }
            c.b.a.a.g.k r0 = (p069c.p073b.p074a.p075a.p089g.AbstractC1384k) r0     // Catch:{ all -> 0x0027 }
            if (r0 != 0) goto L_0x0022
            r3 = 0
            r2.f5660c = r3     // Catch:{ all -> 0x0027 }
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            return
        L_0x0022:
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            r0.mo6431a(r3)
            goto L_0x0010
        L_0x0027:
            r3 = move-exception
            monitor-exit(r1)
            throw r3
        L_0x002a:
            monitor-exit(r0)
            return
        L_0x002c:
            r3 = move-exception
            monitor-exit(r0)
            goto L_0x0030
        L_0x002f:
            throw r3
        L_0x0030:
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: p069c.p073b.p074a.p075a.p089g.C1385l.mo6434a(c.b.a.a.g.d):void");
    }

    /* renamed from: b */
    public final void mo6435b(AbstractC1384k<TResult> kVar) {
        synchronized (this.f5658a) {
            if (this.f5659b == null) {
                this.f5659b = new ArrayDeque();
            }
            this.f5659b.add(kVar);
        }
    }
}
