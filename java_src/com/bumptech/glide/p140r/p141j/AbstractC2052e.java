package com.bumptech.glide.p140r.p141j;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.p140r.p142k.AbstractC2061b;

/* renamed from: com.bumptech.glide.r.j.e */
public abstract class AbstractC2052e<Z> extends AbstractC2056i<ImageView, Z> implements AbstractC2061b.AbstractC2062a {

    /* renamed from: i */
    private Animatable f7554i;

    public AbstractC2052e(ImageView imageView) {
        super(imageView);
    }

    /* renamed from: p */
    private void m9343p(Z z) {
        if (z instanceof Animatable) {
            Z z2 = z;
            this.f7554i = z2;
            z2.start();
            return;
        }
        this.f7554i = null;
    }

    /* renamed from: s */
    private void m9344s(Z z) {
        mo7811r(z);
        m9343p(z);
    }

    @Override // com.bumptech.glide.p140r.p141j.AbstractC2048a, com.bumptech.glide.p137o.AbstractC2012i
    /* renamed from: a */
    public void mo7041a() {
        Animatable animatable = this.f7554i;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // com.bumptech.glide.p140r.p141j.AbstractC2048a, com.bumptech.glide.p140r.p141j.AbstractC2055h, com.bumptech.glide.p140r.p141j.AbstractC2056i
    /* renamed from: c */
    public void mo7809c(Drawable drawable) {
        super.mo7809c(drawable);
        m9344s(null);
        mo7818q(drawable);
    }

    @Override // com.bumptech.glide.p140r.p141j.AbstractC2055h
    /* renamed from: d */
    public void mo7614d(Z z, AbstractC2061b<? super Z> bVar) {
        if (bVar == null || !bVar.mo7826a(z, this)) {
            m9344s(z);
        } else {
            m9343p(z);
        }
    }

    @Override // com.bumptech.glide.p140r.p141j.AbstractC2048a, com.bumptech.glide.p140r.p141j.AbstractC2055h
    /* renamed from: e */
    public void mo7810e(Drawable drawable) {
        super.mo7810e(drawable);
        m9344s(null);
        mo7818q(drawable);
    }

    @Override // com.bumptech.glide.p140r.p141j.AbstractC2048a, com.bumptech.glide.p137o.AbstractC2012i
    /* renamed from: f */
    public void mo7042f() {
        Animatable animatable = this.f7554i;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // com.bumptech.glide.p140r.p141j.AbstractC2048a, com.bumptech.glide.p140r.p141j.AbstractC2055h, com.bumptech.glide.p140r.p141j.AbstractC2056i
    /* renamed from: h */
    public void mo7615h(Drawable drawable) {
        super.mo7615h(drawable);
        Animatable animatable = this.f7554i;
        if (animatable != null) {
            animatable.stop();
        }
        m9344s(null);
        mo7818q(drawable);
    }

    /* renamed from: q */
    public void mo7818q(Drawable drawable) {
        ((ImageView) this.f7557d).setImageDrawable(drawable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract void mo7811r(Z z);
}
