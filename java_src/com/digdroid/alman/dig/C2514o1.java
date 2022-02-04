package com.digdroid.alman.dig;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.ComponentCallbacks2C1610c;
import com.bumptech.glide.ComponentCallbacks2C1626k;
import com.bumptech.glide.p137o.AbstractC2011h;
import com.bumptech.glide.p137o.AbstractC2019m;
import com.bumptech.glide.p140r.C2043f;
import java.io.File;

/* renamed from: com.digdroid.alman.dig.o1 */
public class C2514o1 extends ComponentCallbacks2C1626k {
    public C2514o1(ComponentCallbacks2C1610c cVar, AbstractC2011h hVar, AbstractC2019m mVar, Context context) {
        super(cVar, hVar, mVar, context);
    }

    /* access modifiers changed from: protected */
    @Override // com.bumptech.glide.ComponentCallbacks2C1626k
    /* renamed from: B */
    public void mo7038B(C2043f fVar) {
        if (!(fVar instanceof C2489m1)) {
            fVar = new C2489m1().mo7022a(fVar);
        }
        super.mo7038B(fVar);
    }

    /* renamed from: F */
    public <ResourceType> C2498n1<ResourceType> mo7044l(Class<ResourceType> cls) {
        return new C2498n1<>(this.f6608e, this, cls, this.f6609f);
    }

    /* renamed from: G */
    public C2498n1<Bitmap> mo7045m() {
        return (C2498n1) super.mo7045m();
    }

    /* renamed from: H */
    public C2498n1<Drawable> mo7046n() {
        return (C2498n1) super.mo7046n();
    }

    /* renamed from: I */
    public C2498n1<Drawable> mo8858I(Drawable drawable) {
        return (C2498n1) super.mo7054s(drawable);
    }

    /* renamed from: J */
    public C2498n1<Drawable> mo8859J(Uri uri) {
        return (C2498n1) super.mo7055t(uri);
    }

    /* renamed from: K */
    public C2498n1<Drawable> mo8860K(File file) {
        return (C2498n1) super.mo7057u(file);
    }

    /* renamed from: L */
    public C2498n1<Drawable> mo8861L(Integer num) {
        return (C2498n1) super.mo7058v(num);
    }

    /* renamed from: M */
    public C2498n1<Drawable> mo8862M(String str) {
        return (C2498n1) super.mo7059w(str);
    }
}
