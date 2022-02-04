package p069c.p111c.p112a.p113a.p115b;

import android.view.View;
import com.gtomato.android.p149ui.manager.CarouselLayoutManager;
import p069c.p111c.p112a.p113a.p116c.C1546a;

/* renamed from: c.c.a.a.b.b */
public class C1538b implements C1546a.AbstractC1558l {

    /* renamed from: a */
    private int f6343a = 7;

    /* renamed from: b */
    private double f6344b;

    /* renamed from: c */
    private double f6345c;

    /* renamed from: d */
    private double f6346d;

    /* renamed from: e */
    private double f6347e;

    /* renamed from: f */
    private double f6348f;

    /* renamed from: g */
    private float f6349g;

    public C1538b() {
        double d = (double) 7;
        Double.isNaN(d);
        this.f6344b = 6.283185307179586d / d;
        this.f6345c = 0.8d;
        this.f6346d = 0.6d;
        this.f6347e = 0.35d;
        this.f6348f = 0.0d;
        this.f6349g = 0.0f;
    }

    @Override // p069c.p111c.p112a.p113a.p116c.C1546a.AbstractC1558l
    /* renamed from: a */
    public void mo6833a(float f) {
        this.f6349g = f - 1.0f;
    }

    @Override // p069c.p111c.p112a.p113a.p116c.C1546a.AbstractC1558l
    /* renamed from: b */
    public void mo6829b(View view, float f) {
        view.getMeasuredWidth();
        view.getMeasuredHeight();
        int measuredWidth = ((View) view.getParent()).getMeasuredWidth();
        int measuredHeight = ((View) view.getParent()).getMeasuredHeight();
        double d = (double) f;
        double d2 = this.f6344b;
        Double.isNaN(d);
        double d3 = (d * d2) + 4.71238898038469d;
        double d4 = (double) measuredWidth;
        double d5 = this.f6345c;
        Double.isNaN(d4);
        double d6 = (d4 * d5) / 2.0d;
        double d7 = this.f6346d * d6;
        double sin = (1.0d - Math.sin(d3)) * d7;
        double d8 = d7 * 2.0d;
        double d9 = sin - d8;
        double d10 = 0.0d - d8;
        double max = Math.max(0.0d, (((this.f6347e - 1.0d) * d9) / d10) + 1.0d);
        double max2 = Math.max(0.0d, (((this.f6348f - 1.0d) * d9) / d10) + 1.0d);
        view.setTranslationX((float) (d6 * Math.cos(d3)));
        view.setTranslationY(((float) (sin - (d8 / 2.0d))) + mo6834d((float) measuredHeight));
        float f2 = (float) max;
        view.setScaleX(f2);
        view.setScaleY(f2);
        view.setAlpha((float) max2);
    }

    @Override // p069c.p111c.p112a.p113a.p116c.C1546a.AbstractC1558l
    /* renamed from: c */
    public void mo6830c(CarouselLayoutManager carouselLayoutManager) {
        carouselLayoutManager.mo11183t2(C1546a.EnumC1552f.CenterFront);
    }

    /* renamed from: d */
    public float mo6834d(float f) {
        return f * this.f6349g;
    }

    /* renamed from: e */
    public void mo6835e(double d) {
        this.f6345c = d;
    }
}
