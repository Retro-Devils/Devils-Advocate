package com.bumptech.glide.p140r.p141j;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.p140r.AbstractC2039c;
import com.bumptech.glide.p144t.C2082k;

/* renamed from: com.bumptech.glide.r.j.c */
public abstract class AbstractC2050c<T> implements AbstractC2055h<T> {

    /* renamed from: b */
    private final int f7559b;

    /* renamed from: c */
    private final int f7560c;

    /* renamed from: d */
    private AbstractC2039c f7561d;

    public AbstractC2050c() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public AbstractC2050c(int i, int i2) {
        if (C2082k.m9451r(i, i2)) {
            this.f7559b = i;
            this.f7560c = i2;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i + " and height: " + i2);
    }

    @Override // com.bumptech.glide.p137o.AbstractC2012i
    /* renamed from: a */
    public void mo7041a() {
    }

    @Override // com.bumptech.glide.p140r.p141j.AbstractC2055h
    /* renamed from: b */
    public final void mo7813b(AbstractC2054g gVar) {
    }

    @Override // com.bumptech.glide.p140r.p141j.AbstractC2055h
    /* renamed from: c */
    public void mo7809c(Drawable drawable) {
    }

    @Override // com.bumptech.glide.p140r.p141j.AbstractC2055h
    /* renamed from: e */
    public void mo7810e(Drawable drawable) {
    }

    @Override // com.bumptech.glide.p137o.AbstractC2012i
    /* renamed from: f */
    public void mo7042f() {
    }

    @Override // com.bumptech.glide.p140r.p141j.AbstractC2055h
    /* renamed from: g */
    public final AbstractC2039c mo7814g() {
        return this.f7561d;
    }

    @Override // com.bumptech.glide.p140r.p141j.AbstractC2055h
    /* renamed from: i */
    public final void mo7815i(AbstractC2054g gVar) {
        gVar.mo7807g(this.f7559b, this.f7560c);
    }

    @Override // com.bumptech.glide.p140r.p141j.AbstractC2055h
    /* renamed from: j */
    public final void mo7816j(AbstractC2039c cVar) {
        this.f7561d = cVar;
    }

    @Override // com.bumptech.glide.p137o.AbstractC2012i
    /* renamed from: k */
    public void mo7043k() {
    }
}
