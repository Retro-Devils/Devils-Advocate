package com.bumptech.glide.load.p128q.p133h;

import android.graphics.Bitmap;
import com.bumptech.glide.load.p122o.p123a0.AbstractC1690b;
import com.bumptech.glide.load.p122o.p123a0.AbstractC1695e;
import com.bumptech.glide.p136n.AbstractC1996a;

/* renamed from: com.bumptech.glide.load.q.h.b */
public final class C1965b implements AbstractC1996a.AbstractC1997a {

    /* renamed from: a */
    private final AbstractC1695e f7277a;

    /* renamed from: b */
    private final AbstractC1690b f7278b;

    public C1965b(AbstractC1695e eVar, AbstractC1690b bVar) {
        this.f7277a = eVar;
        this.f7278b = bVar;
    }

    @Override // com.bumptech.glide.p136n.AbstractC1996a.AbstractC1997a
    /* renamed from: a */
    public int[] mo7571a(int i) {
        AbstractC1690b bVar = this.f7278b;
        return bVar == null ? new int[i] : (int[]) bVar.mo7162e(i, int[].class);
    }

    @Override // com.bumptech.glide.p136n.AbstractC1996a.AbstractC1997a
    /* renamed from: b */
    public Bitmap mo7572b(int i, int i2, Bitmap.Config config) {
        return this.f7277a.mo7184e(i, i2, config);
    }

    @Override // com.bumptech.glide.p136n.AbstractC1996a.AbstractC1997a
    /* renamed from: c */
    public void mo7573c(byte[] bArr) {
        AbstractC1690b bVar = this.f7278b;
        if (bVar != null) {
            bVar.mo7161d(bArr);
        }
    }

    @Override // com.bumptech.glide.p136n.AbstractC1996a.AbstractC1997a
    /* renamed from: d */
    public void mo7574d(Bitmap bitmap) {
        this.f7277a.mo7183d(bitmap);
    }

    @Override // com.bumptech.glide.p136n.AbstractC1996a.AbstractC1997a
    /* renamed from: e */
    public byte[] mo7575e(int i) {
        AbstractC1690b bVar = this.f7278b;
        return bVar == null ? new byte[i] : (byte[]) bVar.mo7162e(i, byte[].class);
    }

    @Override // com.bumptech.glide.p136n.AbstractC1996a.AbstractC1997a
    /* renamed from: f */
    public void mo7576f(int[] iArr) {
        AbstractC1690b bVar = this.f7278b;
        if (bVar != null) {
            bVar.mo7161d(iArr);
        }
    }
}
