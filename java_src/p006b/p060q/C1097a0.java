package p006b.p060q;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* renamed from: b.q.a0 */
class C1097a0 implements AbstractC1099b0 {

    /* renamed from: a */
    private final ViewOverlay f5026a;

    C1097a0(View view) {
        this.f5026a = view.getOverlay();
    }

    @Override // p006b.p060q.AbstractC1099b0
    /* renamed from: b */
    public void mo5729b(Drawable drawable) {
        this.f5026a.add(drawable);
    }

    @Override // p006b.p060q.AbstractC1099b0
    /* renamed from: d */
    public void mo5730d(Drawable drawable) {
        this.f5026a.remove(drawable);
    }
}
