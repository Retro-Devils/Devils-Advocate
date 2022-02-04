package com.bumptech.glide.load.p122o.p124b0;

import android.annotation.SuppressLint;
import com.bumptech.glide.load.AbstractC1643g;
import com.bumptech.glide.load.p122o.AbstractC1794v;
import com.bumptech.glide.load.p122o.p124b0.AbstractC1727h;
import com.bumptech.glide.p144t.C2078g;

/* renamed from: com.bumptech.glide.load.o.b0.g */
public class C1726g extends C2078g<AbstractC1643g, AbstractC1794v<?>> implements AbstractC1727h {

    /* renamed from: e */
    private AbstractC1727h.AbstractC1728a f6773e;

    public C1726g(long j) {
        super(j);
    }

    @Override // com.bumptech.glide.load.p122o.p124b0.AbstractC1727h
    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    public void mo7221a(int i) {
        if (i >= 40) {
            mo7855b();
        } else if (i >= 20 || i == 15) {
            mo7860m(mo7857h() / 2);
        }
    }

    @Override // com.bumptech.glide.load.p122o.p124b0.AbstractC1727h
    /* renamed from: c */
    public /* bridge */ /* synthetic */ AbstractC1794v mo7222c(AbstractC1643g gVar, AbstractC1794v vVar) {
        return (AbstractC1794v) super.mo7858k(gVar, vVar);
    }

    @Override // com.bumptech.glide.load.p122o.p124b0.AbstractC1727h
    /* renamed from: d */
    public /* bridge */ /* synthetic */ AbstractC1794v mo7223d(AbstractC1643g gVar) {
        return (AbstractC1794v) super.mo7859l(gVar);
    }

    @Override // com.bumptech.glide.load.p122o.p124b0.AbstractC1727h
    /* renamed from: e */
    public void mo7224e(AbstractC1727h.AbstractC1728a aVar) {
        this.f6773e = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public int mo7225i(AbstractC1794v<?> vVar) {
        return vVar == null ? super.mo7225i(null) : vVar.mo7357b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo7226j(AbstractC1643g gVar, AbstractC1794v<?> vVar) {
        AbstractC1727h.AbstractC1728a aVar = this.f6773e;
        if (aVar != null && vVar != null) {
            aVar.mo7230b(vVar);
        }
    }
}
