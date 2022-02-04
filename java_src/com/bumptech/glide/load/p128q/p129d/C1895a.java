package com.bumptech.glide.load.p128q.p129d;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.AbstractC1649k;
import com.bumptech.glide.load.C1647i;
import com.bumptech.glide.load.p122o.AbstractC1794v;
import com.bumptech.glide.p144t.C2081j;

/* renamed from: com.bumptech.glide.load.q.d.a */
public class C1895a<DataType> implements AbstractC1649k<DataType, BitmapDrawable> {

    /* renamed from: a */
    private final AbstractC1649k<DataType, Bitmap> f7162a;

    /* renamed from: b */
    private final Resources f7163b;

    public C1895a(Resources resources, AbstractC1649k<DataType, Bitmap> kVar) {
        this.f7163b = (Resources) C2081j.m9432d(resources);
        this.f7162a = (AbstractC1649k) C2081j.m9432d(kVar);
    }

    @Override // com.bumptech.glide.load.AbstractC1649k
    /* renamed from: a */
    public AbstractC1794v<BitmapDrawable> mo7088a(DataType datatype, int i, int i2, C1647i iVar) {
        return C1943u.m8799g(this.f7163b, this.f7162a.mo7088a(datatype, i, i2, iVar));
    }

    @Override // com.bumptech.glide.load.AbstractC1649k
    /* renamed from: b */
    public boolean mo7089b(DataType datatype, C1647i iVar) {
        return this.f7162a.mo7089b(datatype, iVar);
    }
}
