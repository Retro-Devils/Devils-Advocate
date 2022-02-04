package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.graphics.drawable.C0398a;
import p006b.p007a.C0763j;
import p006b.p030g.p039k.C1013s;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.u */
public class C0280u extends C0274r {

    /* renamed from: d */
    private final SeekBar f1198d;

    /* renamed from: e */
    private Drawable f1199e;

    /* renamed from: f */
    private ColorStateList f1200f = null;

    /* renamed from: g */
    private PorterDuff.Mode f1201g = null;

    /* renamed from: h */
    private boolean f1202h = false;

    /* renamed from: i */
    private boolean f1203i = false;

    C0280u(SeekBar seekBar) {
        super(seekBar);
        this.f1198d = seekBar;
    }

    /* renamed from: f */
    private void m1382f() {
        Drawable drawable = this.f1199e;
        if (drawable == null) {
            return;
        }
        if (this.f1202h || this.f1203i) {
            Drawable r = C0398a.m1981r(drawable.mutate());
            this.f1199e = r;
            if (this.f1202h) {
                C0398a.m1978o(r, this.f1200f);
            }
            if (this.f1203i) {
                C0398a.m1979p(this.f1199e, this.f1201g);
            }
            if (this.f1199e.isStateful()) {
                this.f1199e.setState(this.f1198d.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.appcompat.widget.C0274r
    /* renamed from: c */
    public void mo1715c(AttributeSet attributeSet, int i) {
        super.mo1715c(attributeSet, i);
        Context context = this.f1198d.getContext();
        int[] iArr = C0763j.f3682V;
        C0296w0 v = C0296w0.m1432v(context, attributeSet, iArr, i, 0);
        SeekBar seekBar = this.f1198d;
        C1013s.m5762g0(seekBar, seekBar.getContext(), iArr, attributeSet, v.mo1821r(), i, 0);
        Drawable h = v.mo1811h(C0763j.f3687W);
        if (h != null) {
            this.f1198d.setThumb(h);
        }
        mo1735j(v.mo1810g(C0763j.f3692X));
        int i2 = C0763j.f3702Z;
        if (v.mo1822s(i2)) {
            this.f1201g = C0216d0.m1138e(v.mo1814k(i2, -1), this.f1201g);
            this.f1203i = true;
        }
        int i3 = C0763j.f3697Y;
        if (v.mo1822s(i3)) {
            this.f1200f = v.mo1806c(i3);
            this.f1202h = true;
        }
        v.mo1823w();
        m1382f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo1732g(Canvas canvas) {
        if (this.f1199e != null) {
            int max = this.f1198d.getMax();
            int i = 1;
            if (max > 1) {
                int intrinsicWidth = this.f1199e.getIntrinsicWidth();
                int intrinsicHeight = this.f1199e.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i = intrinsicHeight / 2;
                }
                this.f1199e.setBounds(-i2, -i, i2, i);
                float width = ((float) ((this.f1198d.getWidth() - this.f1198d.getPaddingLeft()) - this.f1198d.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.f1198d.getPaddingLeft(), (float) (this.f1198d.getHeight() / 2));
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f1199e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo1733h() {
        Drawable drawable = this.f1199e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f1198d.getDrawableState())) {
            this.f1198d.invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo1734i() {
        Drawable drawable = this.f1199e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo1735j(Drawable drawable) {
        Drawable drawable2 = this.f1199e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1199e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1198d);
            C0398a.m1976m(drawable, C1013s.m5797y(this.f1198d));
            if (drawable.isStateful()) {
                drawable.setState(this.f1198d.getDrawableState());
            }
            m1382f();
        }
        this.f1198d.invalidate();
    }
}
