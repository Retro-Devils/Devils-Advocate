package com.bumptech.glide.load.p122o.p123a0;

import com.bumptech.glide.load.p122o.p123a0.AbstractC1708m;
import com.bumptech.glide.p144t.C2082k;
import java.util.Queue;

/* access modifiers changed from: package-private */
/* renamed from: com.bumptech.glide.load.o.a0.d */
public abstract class AbstractC1694d<T extends AbstractC1708m> {

    /* renamed from: a */
    private final Queue<T> f6720a = C2082k.m9438e(20);

    AbstractC1694d() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract T mo7175a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public T mo7178b() {
        T poll = this.f6720a.poll();
        return poll == null ? mo7175a() : poll;
    }

    /* renamed from: c */
    public void mo7179c(T t) {
        if (this.f6720a.size() < 20) {
            this.f6720a.offer(t);
        }
    }
}
