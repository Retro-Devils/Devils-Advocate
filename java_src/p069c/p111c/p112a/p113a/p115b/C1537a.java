package p069c.p111c.p112a.p113a.p115b;

import android.view.View;
import com.gtomato.android.p149ui.manager.CarouselLayoutManager;
import p069c.p111c.p112a.p113a.p116c.C1546a;

/* renamed from: c.c.a.a.b.a */
public class C1537a extends AbstractC1542f {

    /* renamed from: o */
    private double f6342o = 60.0d;

    public C1537a() {
        mo6831f(0.8f);
        mo6832i(-0.2f);
    }

    @Override // p069c.p111c.p112a.p113a.p115b.AbstractC1542f, p069c.p111c.p112a.p113a.p116c.C1546a.AbstractC1558l
    /* renamed from: b */
    public void mo6829b(View view, float f) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        float f2 = (float) measuredWidth;
        view.setPivotX(f2 / 2.0f);
        float f3 = (float) measuredHeight;
        view.setPivotY(f3 / 2.0f);
        view.setTranslationX(f2 * f * this.f6352a);
        view.setRotationY(Math.signum(f) * ((float) ((Math.log((double) (Math.abs(f) + 1.0f)) / Math.log(3.0d)) * (-this.f6342o))));
        view.setScaleY((this.f6362k * Math.abs(f)) + 1.0f);
        view.setTranslationY(mo6837d(f3));
    }

    @Override // p069c.p111c.p112a.p113a.p115b.AbstractC1542f, p069c.p111c.p112a.p113a.p116c.C1546a.AbstractC1558l
    /* renamed from: c */
    public void mo6830c(CarouselLayoutManager carouselLayoutManager) {
        carouselLayoutManager.mo11183t2(C1546a.EnumC1552f.CenterFront);
    }

    @Override // p069c.p111c.p112a.p113a.p115b.AbstractC1542f
    /* renamed from: f */
    public void mo6831f(float f) {
        super.mo6831f(f);
    }

    @Override // p069c.p111c.p112a.p113a.p115b.AbstractC1542f
    /* renamed from: i */
    public void mo6832i(float f) {
        super.mo6832i(f);
    }
}
