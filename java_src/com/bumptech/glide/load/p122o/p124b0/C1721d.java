package com.bumptech.glide.load.p122o.p124b0;

import com.bumptech.glide.load.p122o.p124b0.AbstractC1714a;
import java.io.File;

/* renamed from: com.bumptech.glide.load.o.b0.d */
public class C1721d implements AbstractC1714a.AbstractC1715a {

    /* renamed from: a */
    private final long f6764a;

    /* renamed from: b */
    private final AbstractC1722a f6765b;

    /* renamed from: com.bumptech.glide.load.o.b0.d$a */
    public interface AbstractC1722a {
        /* renamed from: a */
        File mo7220a();
    }

    public C1721d(AbstractC1722a aVar, long j) {
        this.f6764a = j;
        this.f6765b = aVar;
    }

    @Override // com.bumptech.glide.load.p122o.p124b0.AbstractC1714a.AbstractC1715a
    /* renamed from: a */
    public AbstractC1714a mo7214a() {
        File a = this.f6765b.mo7220a();
        if (a == null) {
            return null;
        }
        if (a.mkdirs() || (a.exists() && a.isDirectory())) {
            return C1723e.m8130c(a, this.f6764a);
        }
        return null;
    }
}
