package com.bumptech.glide.load.p126p;

import com.bumptech.glide.load.AbstractC1643g;
import com.bumptech.glide.load.C1647i;
import com.bumptech.glide.load.p120n.AbstractC1655d;
import com.bumptech.glide.p144t.C2081j;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bumptech.glide.load.p.n */
public interface AbstractC1843n<Model, Data> {

    /* renamed from: com.bumptech.glide.load.p.n$a */
    public static class C1844a<Data> {

        /* renamed from: a */
        public final AbstractC1643g f7081a;

        /* renamed from: b */
        public final List<AbstractC1643g> f7082b;

        /* renamed from: c */
        public final AbstractC1655d<Data> f7083c;

        public C1844a(AbstractC1643g gVar, AbstractC1655d<Data> dVar) {
            this(gVar, Collections.emptyList(), dVar);
        }

        public C1844a(AbstractC1643g gVar, List<AbstractC1643g> list, AbstractC1655d<Data> dVar) {
            this.f7081a = (AbstractC1643g) C2081j.m9432d(gVar);
            this.f7082b = (List) C2081j.m9432d(list);
            this.f7083c = (AbstractC1655d) C2081j.m9432d(dVar);
        }
    }

    /* renamed from: a */
    C1844a<Data> mo7393a(Model model, int i, int i2, C1647i iVar);

    /* renamed from: b */
    boolean mo7394b(Model model);
}
