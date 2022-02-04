package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import p069c.p073b.p074a.p090b.p107z.C1455g;
import p069c.p073b.p074a.p090b.p107z.C1462k;

/* renamed from: com.google.android.material.textfield.c */
class C3264c extends C1455g {

    /* renamed from: A */
    private final RectF f10925A;

    /* renamed from: B */
    private int f10926B;

    /* renamed from: z */
    private final Paint f10927z;

    C3264c() {
        this(null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C3264c(C1462k kVar) {
        super(kVar == null ? new C1462k() : kVar);
        this.f10927z = new Paint(1);
        m13657o0();
        this.f10925A = new RectF();
    }

    /* renamed from: i0 */
    private void m13654i0(Canvas canvas) {
        if (!m13658p0(getCallback())) {
            canvas.restoreToCount(this.f10926B);
        }
    }

    /* renamed from: j0 */
    private void m13655j0(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (m13658p0(callback)) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, null);
                return;
            }
            return;
        }
        m13656l0(canvas);
    }

    /* renamed from: l0 */
    private void m13656l0(Canvas canvas) {
        this.f10926B = Build.VERSION.SDK_INT >= 21 ? canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), null) : canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), null, 31);
    }

    /* renamed from: o0 */
    private void m13657o0() {
        this.f10927z.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f10927z.setColor(-1);
        this.f10927z.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    /* renamed from: p0 */
    private boolean m13658p0(Drawable.Callback callback) {
        return callback instanceof View;
    }

    @Override // p069c.p073b.p074a.p090b.p107z.C1455g
    public void draw(Canvas canvas) {
        m13655j0(canvas);
        super.draw(canvas);
        canvas.drawRect(this.f10925A, this.f10927z);
        m13654i0(canvas);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h0 */
    public boolean mo11100h0() {
        return !this.f10925A.isEmpty();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k0 */
    public void mo11101k0() {
        mo11102m0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m0 */
    public void mo11102m0(float f, float f2, float f3, float f4) {
        RectF rectF = this.f10925A;
        if (f != rectF.left || f2 != rectF.top || f3 != rectF.right || f4 != rectF.bottom) {
            rectF.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n0 */
    public void mo11103n0(RectF rectF) {
        mo11102m0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
}
