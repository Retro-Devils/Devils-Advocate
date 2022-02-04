package p006b.p060q;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* access modifiers changed from: package-private */
/* renamed from: b.q.v */
public class C1162v implements AbstractC1163w {

    /* renamed from: a */
    private final ViewGroupOverlay f5199a;

    C1162v(ViewGroup viewGroup) {
        this.f5199a = viewGroup.getOverlay();
    }

    @Override // p006b.p060q.AbstractC1163w
    /* renamed from: a */
    public void mo5869a(View view) {
        this.f5199a.add(view);
    }

    @Override // p006b.p060q.AbstractC1099b0
    /* renamed from: b */
    public void mo5729b(Drawable drawable) {
        this.f5199a.add(drawable);
    }

    @Override // p006b.p060q.AbstractC1163w
    /* renamed from: c */
    public void mo5870c(View view) {
        this.f5199a.remove(view);
    }

    @Override // p006b.p060q.AbstractC1099b0
    /* renamed from: d */
    public void mo5730d(Drawable drawable) {
        this.f5199a.remove(drawable);
    }
}
