package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.g */
public class C0725g extends RecyclerView.AbstractC0686z {

    /* renamed from: i */
    protected final LinearInterpolator f3505i = new LinearInterpolator();

    /* renamed from: j */
    protected final DecelerateInterpolator f3506j = new DecelerateInterpolator();

    /* renamed from: k */
    protected PointF f3507k;

    /* renamed from: l */
    private final DisplayMetrics f3508l;

    /* renamed from: m */
    private boolean f3509m = false;

    /* renamed from: n */
    private float f3510n;

    /* renamed from: o */
    protected int f3511o = 0;

    /* renamed from: p */
    protected int f3512p = 0;

    public C0725g(Context context) {
        this.f3508l = context.getResources().getDisplayMetrics();
    }

    /* renamed from: A */
    private float m4264A() {
        if (!this.f3509m) {
            this.f3510n = mo4427v(this.f3508l);
            this.f3509m = true;
        }
        return this.f3510n;
    }

    /* renamed from: y */
    private int m4265y(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public int mo4423B() {
        PointF pointF = this.f3507k;
        if (pointF != null) {
            float f = pointF.y;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo3503C(RecyclerView.AbstractC0686z.C0687a aVar) {
        PointF a = mo3481a(mo4236f());
        if (a == null || (a.x == 0.0f && a.y == 0.0f)) {
            aVar.mo4248b(mo4236f());
            mo4246r();
            return;
        }
        mo4239i(a);
        this.f3507k = a;
        this.f3511o = (int) (a.x * 10000.0f);
        this.f3512p = (int) (a.y * 10000.0f);
        aVar.mo4250d((int) (((float) this.f3511o) * 1.2f), (int) (((float) this.f3512p) * 1.2f), (int) (((float) mo3485x(10000)) * 1.2f), this.f3505i);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0686z
    /* renamed from: l */
    public void mo4242l(int i, int i2, RecyclerView.C0649a0 a0Var, RecyclerView.AbstractC0686z.C0687a aVar) {
        if (mo4233c() == 0) {
            mo4246r();
            return;
        }
        this.f3511o = m4265y(this.f3511o, i);
        int y = m4265y(this.f3512p, i2);
        this.f3512p = y;
        if (this.f3511o == 0 && y == 0) {
            mo3503C(aVar);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0686z
    /* renamed from: m */
    public void mo4243m() {
    }

    /* access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0686z
    /* renamed from: n */
    public void mo3483n() {
        this.f3512p = 0;
        this.f3511o = 0;
        this.f3507k = null;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0686z
    /* renamed from: o */
    public void mo3484o(View view, RecyclerView.C0649a0 a0Var, RecyclerView.AbstractC0686z.C0687a aVar) {
        int t = mo4425t(view, mo4429z());
        int u = mo4426u(view, mo4423B());
        int w = mo4428w((int) Math.sqrt((double) ((t * t) + (u * u))));
        if (w > 0) {
            aVar.mo4250d(-t, -u, w, this.f3506j);
        }
    }

    /* renamed from: s */
    public int mo4424s(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 == 0) {
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 < 0) {
                return i7;
            }
            return 0;
        } else if (i5 == 1) {
            return i4 - i2;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    /* renamed from: t */
    public int mo4425t(View view, int i) {
        RecyclerView.AbstractC0669o e = mo4235e();
        if (e == null || !e.mo3451l()) {
            return 0;
        }
        RecyclerView.C0674p pVar = (RecyclerView.C0674p) view.getLayoutParams();
        return mo4424s(e.mo3400U(view) - ((ViewGroup.MarginLayoutParams) pVar).leftMargin, e.mo3410X(view) + ((ViewGroup.MarginLayoutParams) pVar).rightMargin, e.mo4127i0(), e.mo4143s0() - e.mo4129j0(), i);
    }

    /* renamed from: u */
    public int mo4426u(View view, int i) {
        RecyclerView.AbstractC0669o e = mo4235e();
        if (e == null || !e.mo3454m()) {
            return 0;
        }
        RecyclerView.C0674p pVar = (RecyclerView.C0674p) view.getLayoutParams();
        return mo4424s(e.mo3413Y(view) - ((ViewGroup.MarginLayoutParams) pVar).topMargin, e.mo3392S(view) + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin, e.mo4131k0(), e.mo4112a0() - e.mo4124h0(), i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public float mo4427v(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public int mo4428w(int i) {
        double x = (double) mo3485x(i);
        Double.isNaN(x);
        return (int) Math.ceil(x / 0.3356d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public int mo3485x(int i) {
        return (int) Math.ceil((double) (((float) Math.abs(i)) * m4264A()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public int mo4429z() {
        PointF pointF = this.f3507k;
        if (pointF != null) {
            float f = pointF.x;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }
}
