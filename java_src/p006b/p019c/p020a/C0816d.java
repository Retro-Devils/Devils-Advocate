package p006b.p019c.p020a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import p006b.p019c.p020a.C0821h;

/* access modifiers changed from: package-private */
/* renamed from: b.c.a.d */
public class C0816d implements AbstractC0819f {

    /* renamed from: a */
    final RectF f4033a = new RectF();

    /* renamed from: b.c.a.d$a */
    class C0817a implements C0821h.AbstractC0822a {
        C0817a() {
        }

        @Override // p006b.p019c.p020a.C0821h.AbstractC0822a
        /* renamed from: a */
        public void mo4807a(Canvas canvas, RectF rectF, float f, Paint paint) {
            float f2 = 2.0f * f;
            float width = (rectF.width() - f2) - 1.0f;
            float height = (rectF.height() - f2) - 1.0f;
            if (f >= 1.0f) {
                float f3 = f + 0.5f;
                float f4 = -f3;
                C0816d.this.f4033a.set(f4, f4, f3, f3);
                int save = canvas.save();
                canvas.translate(rectF.left + f3, rectF.top + f3);
                canvas.drawArc(C0816d.this.f4033a, 180.0f, 90.0f, true, paint);
                canvas.translate(width, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(C0816d.this.f4033a, 180.0f, 90.0f, true, paint);
                canvas.translate(height, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(C0816d.this.f4033a, 180.0f, 90.0f, true, paint);
                canvas.translate(width, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(C0816d.this.f4033a, 180.0f, 90.0f, true, paint);
                canvas.restoreToCount(save);
                float f5 = rectF.top;
                canvas.drawRect((rectF.left + f3) - 1.0f, f5, (rectF.right - f3) + 1.0f, f5 + f3, paint);
                float f6 = rectF.bottom;
                canvas.drawRect((rectF.left + f3) - 1.0f, f6 - f3, (rectF.right - f3) + 1.0f, f6, paint);
            }
            canvas.drawRect(rectF.left, rectF.top + f, rectF.right, rectF.bottom - f, paint);
        }
    }

    C0816d() {
    }

    /* renamed from: n */
    private C0821h m4735n(AbstractC0818e eVar) {
        return (C0821h) eVar.mo4825d();
    }

    @Override // p006b.p019c.p020a.AbstractC0819f
    /* renamed from: a */
    public float mo4808a(AbstractC0818e eVar) {
        return m4735n(eVar).mo4850i();
    }

    @Override // p006b.p019c.p020a.AbstractC0819f
    /* renamed from: b */
    public float mo4809b(AbstractC0818e eVar) {
        return m4735n(eVar).mo4846g();
    }

    @Override // p006b.p019c.p020a.AbstractC0819f
    /* renamed from: c */
    public float mo4810c(AbstractC0818e eVar) {
        return m4735n(eVar).mo4852j();
    }

    @Override // p006b.p019c.p020a.AbstractC0819f
    /* renamed from: d */
    public float mo4811d(AbstractC0818e eVar) {
        return m4735n(eVar).mo4853k();
    }

    @Override // p006b.p019c.p020a.AbstractC0819f
    /* renamed from: e */
    public void mo4812e(AbstractC0818e eVar) {
    }

    @Override // p006b.p019c.p020a.AbstractC0819f
    /* renamed from: f */
    public ColorStateList mo4813f(AbstractC0818e eVar) {
        return m4735n(eVar).mo4845f();
    }

    @Override // p006b.p019c.p020a.AbstractC0819f
    /* renamed from: g */
    public void mo4814g(AbstractC0818e eVar, float f) {
        m4735n(eVar).mo4861r(f);
    }

    @Override // p006b.p019c.p020a.AbstractC0819f
    /* renamed from: h */
    public void mo4815h(AbstractC0818e eVar, float f) {
        m4735n(eVar).mo4859p(f);
        mo4821o(eVar);
    }

    @Override // p006b.p019c.p020a.AbstractC0819f
    /* renamed from: i */
    public void mo4816i(AbstractC0818e eVar) {
        m4735n(eVar).mo4855m(eVar.mo4827f());
        mo4821o(eVar);
    }

    @Override // p006b.p019c.p020a.AbstractC0819f
    /* renamed from: j */
    public void mo4817j(AbstractC0818e eVar, ColorStateList colorStateList) {
        m4735n(eVar).mo4856o(colorStateList);
    }

    @Override // p006b.p019c.p020a.AbstractC0819f
    /* renamed from: k */
    public float mo4818k(AbstractC0818e eVar) {
        return m4735n(eVar).mo4854l();
    }

    @Override // p006b.p019c.p020a.AbstractC0819f
    /* renamed from: l */
    public void mo4819l(AbstractC0818e eVar, float f) {
        m4735n(eVar).mo4860q(f);
        mo4821o(eVar);
    }

    @Override // p006b.p019c.p020a.AbstractC0819f
    /* renamed from: m */
    public void mo4806m() {
        C0821h.f4047b = new C0817a();
    }

    /* renamed from: o */
    public void mo4821o(AbstractC0818e eVar) {
        Rect rect = new Rect();
        m4735n(eVar).mo4849h(rect);
        eVar.mo4826e((int) Math.ceil((double) mo4811d(eVar)), (int) Math.ceil((double) mo4810c(eVar)));
        eVar.mo4822a(rect.left, rect.top, rect.right, rect.bottom);
    }
}
