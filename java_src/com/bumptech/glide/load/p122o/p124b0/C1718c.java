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
    private final Map<String, C1719a> f6759a = new HashMap();

    /* renamed from: b */
    private final C1720b f6760b = new C1720b();

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.o.b0.c$a */
    public static class C1719a {

        /* renamed from: a */
        final Lock f6761a = new ReentrantLock();

        /* renamed from: b */
        int f6762b;

        C1719a() {
        }
    }

    /* renamed from: com.bumptech.glide.load.o.b0.c$b */
    private static class C1720b {

        /* renamed from: a */
        private final Queue<C1719a> f6763a = new ArrayDeque();

        C1720b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C1719a mo7218a() {
            C1719a poll;
            synchronized (this.f6763a) {
                poll = this.f6763a.poll();
            }
            return poll == null ? new C1719a() : poll;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo7219b(C1719a aVar) {
            synchronized (this.f6763a) {
                if (this.f6763a.size() < 10) {
                    this.f6763a.offer(aVar);
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
            aVar = this.f6759a.get(str);
            if (aVar == null) {
                aVar = this.f6760b.mo7218a();
                this.f6759a.put(str, aVar);
            }
            aVar.f6762b++;
        }
        aVar.f6761a.lock();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo7217b(String str) {
        C1719a aVar;
        synchronized (this) {
            aVar = (C1719a) C2081j.m9432d(this.f6759a.get(str));
            int i = aVar.f6762b;
            if (i >= 1) {
                int i2 = i - 1;
                aVar.f6762b = i2;
                if (i2 == 0) {
                    C1719a remove = this.f6759a.remove(str);
                    if (remove.equals(aVar)) {
                        this.f6760b.mo7219b(remove);
                    } else {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + remove + ", safeKey: " + str);
                    }
                }
            } else {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f6762b);
            }
        }
        aVar.f6761a.unlock();
    }
}
