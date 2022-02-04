package com.bumptech.glide.load.p122o.p124b0;

import com.bumptech.glide.p144t.C2081j;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.bumptech.glide.load.o.b0.c */
final class C1718c {

    /* renamed from: a */
    private final Map<String, C1719a> f6767a = new HashMap();

    /* renamed from: b */
    private final C1720b f6768b = new C1720b();

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.o.b0.c$a */
    public static class C1719a {

        /* renamed from: a */
        final Lock f6769a = new ReentrantLock();

        /* renamed from: b */
        int f6770b;

        C1719a() {
        }
    }

    /* renamed from: com.bumptech.glide.load.o.b0.c$b */
    private static class C1720b {

        /* renamed from: a */
        private final Queue<C1719a> f6771a = new ArrayDeque();

        C1720b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C1719a mo7218a() {
            C1719a poll;
            synchronized (this.f6771a) {
                poll = this.f6771a.poll();
            }
            return poll == null ? new C1719a() : poll;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo7219b(C1719a aVar) {
            synchronized (this.f6771a) {
                if (this.f6771a.size() < 10) {
                    this.f6771a.offer(aVar);
                }
            }
        }
    }

    C1718c() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7216a(String str) {
        C1719a aVar;
        synchronized (this) {
            aVar = this.f6767a.get(str);
            if (aVar == null) {
                aVar = this.f6768b.mo7218a();
                this.f6767a.put(str, aVar);
            }
            aVar.f6770b++;
        }
        aVar.f6769a.lock();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo7217b(String str) {
        C1719a aVar;
        synchronized (this) {
            aVar = (C1719a) C2081j.m9432d(this.f6767a.get(str));
            int i = aVar.f6770b;
            if (i >= 1) {
                int i2 = i - 1;
                aVar.f6770b = i2;
                if (i2 == 0) {
                    C1719a remove = this.f6767a.remove(str);
                    if (remove.equals(aVar)) {
                        this.f6768b.mo7219b(remove);
                    } else {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + remove + ", safeKey: " + str);
                    }
                }
            } else {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f6770b);
            }
        }
        aVar.f6769a.unlock();
    }
}
