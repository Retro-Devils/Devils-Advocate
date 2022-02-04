package com.bumptech.glide.load.p128q.p134i;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.C1647i;
import com.bumptech.glide.load.p122o.AbstractC1794v;
import com.bumptech.glide.load.p122o.p123a0.AbstractC1695e;
import com.bumptech.glide.load.p128q.p129d.C1910e;
import com.bumptech.glide.load.p128q.p133h.C1966c;

/* renamed from: com.bumptech.glide.load.q.i.c */
public final class C1981c implements AbstractC1983e<Drawable, byte[]> {

    /* renamed from: a */
    private final AbstractC1695e f7317a;

    /* renamed from: b */
    private final AbstractC1983e<Bitmap, byte[]> f7318b;

    /* renamed from: c */
    private final AbstractC1983e<C1966c, byte[]> f7319c;

    public C1981c(AbstractC1695e eVar, AbstractC1983e<Bitmap, byte[]> eVar2, AbstractC1983e<C1966c, byte[]> eVar3) {
        this.f7317a = eVar;
        this.f7318b = eVar2;
        this.f7319c = eVar3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.bumptech.glide.load.o.v<android.graphics.drawable.Drawable> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private static AbstractC1794v<C1966c> m8950b(AbstractC1794v<Drawable> vVar) {
        return vVar;
    }

    @Override // com.bumptech.glide.load.p128q.p134i.AbstractC1983e
    /* renamed from: a */
    public AbstractC1794v<byte[]> mo7624a(AbstractC1794v<Drawable> vVar, C1647i iVar) {
        Drawable c = vVar.mo7358c();
        if (c instanceof BitmapDrawable) {
            return this.f7318b.mo7624a(C1910e.m8673g(((BitmapDrawable) c).getBitmap(), this.f7317a), iVar);
        }
        if (c instanceof C1966c) {
            return this.f7319c.mo7624a(m8950b(vVar), iVar);
        }
        return null;
    }
}
