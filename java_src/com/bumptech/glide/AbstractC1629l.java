package com.bumptech.glide;

import com.bumptech.glide.AbstractC1629l;
import com.bumptech.glide.p140r.p142k.AbstractC2063c;
import com.bumptech.glide.p140r.p142k.C2059a;

/* renamed from: com.bumptech.glide.l */
public abstract class AbstractC1629l<CHILD extends AbstractC1629l<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* renamed from: b */
    private AbstractC2063c<? super TranscodeType> f6623b = C2059a.m9384b();

    /* renamed from: a */
    public final CHILD clone() {
        try {
            return (CHILD) ((AbstractC1629l) super.clone());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final AbstractC2063c<? super TranscodeType> mo7066b() {
        return this.f6623b;
    }
}
