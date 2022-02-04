package com.bumptech.glide.load.p122o;

import com.bumptech.glide.load.AbstractC1643g;
import java.util.HashMap;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.bumptech.glide.load.o.s */
public final class C1790s {

    /* renamed from: a */
    private final Map<AbstractC1643g, C1776l<?>> f6998a = new HashMap();

    /* renamed from: b */
    private final Map<AbstractC1643g, C1776l<?>> f6999b = new HashMap();

    C1790s() {
    }

    /* renamed from: b */
    private Map<AbstractC1643g, C1776l<?>> m8358b(boolean z) {
        return z ? this.f6999b : this.f6998a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C1776l<?> mo7380a(AbstractC1643g gVar, boolean z) {
        return m8358b(z).get(gVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo7381c(AbstractC1643g gVar, C1776l<?> lVar) {
        m8358b(lVar.mo7338p()).put(gVar, lVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo7382d(AbstractC1643g gVar, C1776l<?> lVar) {
        Map<AbstractC1643g, C1776l<?>> b = m8358b(lVar.mo7338p());
        if (lVar.equals(b.get(gVar))) {
            b.remove(gVar);
        }
    }
}
