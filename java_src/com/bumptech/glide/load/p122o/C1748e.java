package com.bumptech.glide.load.p122o;

import com.bumptech.glide.load.AbstractC1633d;
import com.bumptech.glide.load.C1647i;
import com.bumptech.glide.load.p122o.p124b0.AbstractC1714a;
import java.io.File;

/* renamed from: com.bumptech.glide.load.o.e */
class C1748e<DataType> implements AbstractC1714a.AbstractC1716b {

    /* renamed from: a */
    private final AbstractC1633d<DataType> f6831a;

    /* renamed from: b */
    private final DataType f6832b;

    /* renamed from: c */
    private final C1647i f6833c;

    C1748e(AbstractC1633d<DataType> dVar, DataType datatype, C1647i iVar) {
        this.f6831a = dVar;
        this.f6832b = datatype;
        this.f6833c = iVar;
    }

    @Override // com.bumptech.glide.load.p122o.p124b0.AbstractC1714a.AbstractC1716b
    /* renamed from: a */
    public boolean mo7215a(File file) {
        return this.f6831a.mo7072a(this.f6832b, file, this.f6833c);
    }
}
