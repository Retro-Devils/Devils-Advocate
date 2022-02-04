package p069c.p111c.p112a.p113a.p115b;

import android.view.View;
import com.gtomato.android.p149ui.manager.CarouselLayoutManager;
import p069c.p111c.p112a.p113a.p116c.C1546a;

/* renamed from: c.c.a.a.b.f */
public abstract class AbstractC1542f implements C1546a.AbstractC1558l {

    /* renamed from: a */
    protected float f6344a = 0.0f;

    /* renamed from: b */
    protected float f6345b = 0.0f;

    /* renamed from: c */
    protected float f6346c = 0.0f;

    /* renamed from: d */
    protected float f6347d = Float.NaN;

    /* renamed from: e */
    protected float f6348e = Float.NaN;

    /* renamed from: f */
    protected float f6349f = Float.NaN;

    /* renamed from: g */
    protected float f6350g = Float.NaN;

    /* renamed from: h */
    protected float f6351h = Float.NaN;

    /* renamed from: i */
    protected float f6352i = Float.NaN;

    /* renamed from: j */
    protected float f6353j = Float.NaN;

    /* renamed from: k */
    protected float f6354k = Float.NaN;

    /* renamed from: l */
    protected float f6355l = Float.NaN;

    /* renamed from: m */
    protected boolean f6356m = false;

    /* renamed from: n */
    protected float f6357n = Float.NaN;

    protected AbstractC1542f() {
    }

    /* renamed from: e */
    private static boolean m7543e(float f) {
        return f > 0.001f || f < -0.001f;
    }

    @Override // p069c.p111c.p112a.p113a.p116c.C1546a.AbstractC1558l
    /* renamed from: a */
    public void mo6833a(float f) {
        this.f6346c = f - 1.0f;
    }

    @Override // p069c.p111c.p112a.p113a.p116c.C1546a.AbstractC1558l
    /* renamed from: b */
    public void mo6829b(View view, float f) {
        float f2;
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (!Float.isNaN(this.f6350g)) {
            float abs = (this.f6356m ? 1.0f - Math.abs(f) : f) * this.f6350g;
            if (!Float.isNaN(this.f6349f)) {
                abs += this.f6349f;
            }
            if (!Float.isNaN(this.f6347d)) {
                abs = Math.max(this.f6347d, abs);
            }
            if (!Float.isNaN(this.f6348e)) {
                abs = Math.min(this.f6348e, abs);
            }
            view.setPivotX(((float) measuredWidth) / 2.0f);
            view.setPivotY(((float) measuredHeight) / 2.0f);
            view.setScaleX(abs);
        }
        if (!Float.isNaN(this.f6354k)) {
            float abs2 = (this.f6356m ? 1.0f - Math.abs(f) : f) * this.f6354k;
            if (!Float.isNaN(this.f6353j)) {
                abs2 += this.f6353j;
            }
            if (!Float.isNaN(this.f6351h)) {
                abs2 = Math.max(this.f6351h, abs2);
            }
            if (!Float.isNaN(this.f6352i)) {
                abs2 = Math.min(this.f6352i, abs2);
            }
            view.setPivotX(((float) measuredWidth) / 2.0f);
            view.setPivotY(((float) measuredHeight) / 2.0f);
            view.setScaleY(abs2);
        }
        if (m7543e(this.f6355l)) {
            float f3 = (float) measuredWidth;
            view.setPivotX(f3 / 2.0f);
            view.setPivotY(((float) measuredHeight) + (f3 * this.f6357n));
            view.setRotation(this.f6355l * f);
        }
        if (m7543e(this.f6344a)) {
            view.setTranslationX(((float) measuredWidth) * f * this.f6344a);
        }
        if (m7543e(this.f6345b)) {
            float f4 = (float) measuredHeight;
            f2 = (f * f4 * this.f6345b) + mo6837d(f4);
        } else {
            f2 = mo6837d((float) measuredHeight);
        }
        view.setTranslationY(f2);
    }

    @Override // p069c.p111c.p112a.p113a.p116c.C1546a.AbstractC1558l
    /* renamed from: c */
    public void mo6830c(CarouselLayoutManager carouselLayoutManager) {
    }

    /* renamed from: d */
    public float mo6837d(float f) {
        return f * this.f6346c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo6831f(float f) {
        this.f6344a = f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo6836g(float f) {
        this.f6345b = f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo6838h(float f) {
        this.f6355l = f;
        this.f6357n = Float.isNaN(f) ? Float.NaN : !m7543e(f) ? 0.0f : (float) (1.0d / Math.sin(Math.toRadians((double) f)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo6832i(float f) {
        this.f6354k = f;
    }
}
