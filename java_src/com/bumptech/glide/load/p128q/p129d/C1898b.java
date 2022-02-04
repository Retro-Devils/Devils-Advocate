package com.bumptech.glide.load.p128q.p129d;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.AbstractC1650l;
import com.bumptech.glide.load.C1647i;
import com.bumptech.glide.load.EnumC1632c;
import com.bumptech.glide.load.p122o.AbstractC1794v;
import com.bumptech.glide.load.p122o.p123a0.AbstractC1695e;
import java.io.File;

/* renamed from: com.bumptech.glide.load.q.d.b */
public class C1898b implements AbstractC1650l<BitmapDrawable> {

    /* renamed from: a */
    private final AbstractC1695e f7173a;

    /* renamed from: b */
    private final AbstractC1650l<Bitmap> f7174b;

    public C1898b(AbstractC1695e eVar, AbstractC1650l<Bitmap> lVar) {
        this.f7173a = eVar;
        this.f7174b = lVar;
    }

    @Override // com.bumptech.glide.load.AbstractC1650l
    /* renamed from: b */
    public EnumC1632c mo7090b(C1647i iVar) {
        return this.f7174b.mo7090b(iVar);
    }

    /* renamed from: c */
    public boolean mo7072a(AbstractC1794v<BitmapDrawable> vVar, File file, C1647i iVar) {
        return this.f7174b.mo7072a(new C1910e(vVar.mo7358c().getBitmap(), this.f7173a), file, iVar);
    }
}
