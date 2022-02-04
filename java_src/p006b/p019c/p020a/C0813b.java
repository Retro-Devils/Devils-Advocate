package p006b.p019c.p020a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import p006b.p019c.p020a.C0821h;

/* renamed from: b.c.a.b */
class C0813b extends C0816d {

    /* renamed from: b.c.a.b$a */
    class C0814a implements C0821h.AbstractC0822a {
        C0814a() {
        }

        @Override // p006b.p019c.p020a.C0821h.AbstractC0822a
        /* renamed from: a */
        public void mo4807a(Canvas canvas, RectF rectF, float f, Paint paint) {
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    C0813b() {
    }

    @Override // p006b.p019c.p020a.AbstractC0819f, p006b.p019c.p020a.C0816d
    /* renamed from: m */
    public void mo4806m() {
        C0821h.f4047b = new C0814a();
    }
}
