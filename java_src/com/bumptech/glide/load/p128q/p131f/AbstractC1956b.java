package com.bumptech.glide.load.p128q.p131f;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.p122o.AbstractC1789r;
import com.bumptech.glide.load.p122o.AbstractC1794v;
import com.bumptech.glide.load.p128q.p133h.C1966c;
import com.bumptech.glide.p144t.C2081j;

/* renamed from: com.bumptech.glide.load.q.f.b */
public abstract class AbstractC1956b<T extends Drawable> implements AbstractC1794v<T>, AbstractC1789r {

    /* renamed from: b */
    protected final T f7259b;

    public AbstractC1956b(T t) {
        this.f7259b = (T) ((Drawable) C2081j.m9432d(t));
    }

    @Override // com.bumptech.glide.load.p122o.AbstractC1789r
    /* renamed from: a */
    public void mo7379a() {
        Bitmap e;
        T t = this.f7259b;
        if (t instanceof BitmapDrawable) {
            e = ((BitmapDrawable) t).getBitmap();
        } else if (t instanceof C1966c) {
            e = ((C1966c) t).mo7580e();
        } else {
            return;
        }
        e.prepareToDraw();
    }

    /* renamed from: e */
    public final T mo7358c() {
        Drawable.ConstantState constantState = this.f7259b.getConstantState();
        return constantState == null ? this.f7259b : (T) constantState.newDrawable();
    }
}
