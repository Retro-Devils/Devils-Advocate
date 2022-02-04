package p069c.p111c.p112a.p113a.p115b;

import android.view.View;
import com.gtomato.android.p149ui.manager.CarouselLayoutManager;
import p069c.p111c.p112a.p113a.p114a.C1535a;
import p069c.p111c.p112a.p113a.p116c.C1546a;

/* renamed from: c.c.a.a.b.h */
public class C1544h implements C1546a.AbstractC1558l {

    /* renamed from: a */
    float f6366a = 0.0f;

    @Override // p069c.p111c.p112a.p113a.p116c.C1546a.AbstractC1558l
    /* renamed from: a */
    public void mo6833a(float f) {
        this.f6366a = f - 1.0f;
    }

    @Override // p069c.p111c.p112a.p113a.p116c.C1546a.AbstractC1558l
    /* renamed from: b */
    public void mo6829b(View view, float f) {
        int measuredWidth = view.getMeasuredWidth();
        view.getMeasuredHeight();
        view.setTranslationX(((float) measuredWidth) * f * -0.5f * (2.0f / (Math.abs(f) + 2.0f)));
        float f2 = 2.0f / (f + 2.0f);
        view.setScaleX(f2);
        view.setScaleY(f2);
        float f3 = 1.0f;
        if (f < 0.0f) {
            f3 = Math.max(f + 1.0f, 0.0f);
        }
        view.setAlpha(f3);
    }

    @Override // p069c.p111c.p112a.p113a.p116c.C1546a.AbstractC1558l
    /* renamed from: c */
    public void mo6830c(CarouselLayoutManager carouselLayoutManager) {
        carouselLayoutManager.mo11189z2(new C1535a());
        carouselLayoutManager.mo11183t2(C1546a.EnumC1552f.FirstFront);
    }
}
