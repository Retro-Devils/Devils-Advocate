package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.widget.C0414e;
import p006b.p007a.C0763j;
import p006b.p007a.p008k.p009a.C0764a;
import p006b.p030g.p039k.C1013s;

/* renamed from: androidx.appcompat.widget.n */
public class C0261n {

    /* renamed from: a */
    private final ImageView f1118a;

    /* renamed from: b */
    private C0281u0 f1119b;

    /* renamed from: c */
    private C0281u0 f1120c;

    /* renamed from: d */
    private C0281u0 f1121d;

    public C0261n(ImageView imageView) {
        this.f1118a = imageView;
    }

    /* renamed from: a */
    private boolean m1318a(Drawable drawable) {
        if (this.f1121d == null) {
            this.f1121d = new C0281u0();
        }
        C0281u0 u0Var = this.f1121d;
        u0Var.mo1736a();
        ColorStateList a = C0414e.m2082a(this.f1118a);
        if (a != null) {
            u0Var.f1207d = true;
            u0Var.f1204a = a;
        }
        PorterDuff.Mode b = C0414e.m2083b(this.f1118a);
        if (b != null) {
            u0Var.f1206c = true;
            u0Var.f1205b = b;
        }
        if (!u0Var.f1207d && !u0Var.f1206c) {
            return false;
        }
        C0241j.m1246i(drawable, u0Var, this.f1118a.getDrawableState());
        return true;
    }

    /* renamed from: j */
    private boolean m1319j() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.f1119b != null : i == 21;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1600b() {
        Drawable drawable = this.f1118a.getDrawable();
        if (drawable != null) {
            C0216d0.m1135b(drawable);
        }
        if (drawable == null) {
            return;
        }
        if (!m1319j() || !m1318a(drawable)) {
            C0281u0 u0Var = this.f1120c;
            if (u0Var != null) {
                C0241j.m1246i(drawable, u0Var, this.f1118a.getDrawableState());
                return;
            }
            C0281u0 u0Var2 = this.f1119b;
            if (u0Var2 != null) {
                C0241j.m1246i(drawable, u0Var2, this.f1118a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public ColorStateList mo1601c() {
        C0281u0 u0Var = this.f1120c;
        if (u0Var != null) {
            return u0Var.f1204a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public PorterDuff.Mode mo1602d() {
        C0281u0 u0Var = this.f1120c;
        if (u0Var != null) {
            return u0Var.f1205b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo1603e() {
        return Build.VERSION.SDK_INT < 21 || !(this.f1118a.getBackground() instanceof RippleDrawable);
    }

    /* renamed from: f */
    public void mo1604f(AttributeSet attributeSet, int i) {
        int n;
        Context context = this.f1118a.getContext();
        int[] iArr = C0763j.f3662R;
        C0296w0 v = C0296w0.m1432v(context, attributeSet, iArr, i, 0);
        ImageView imageView = this.f1118a;
        C1013s.m5762g0(imageView, imageView.getContext(), iArr, attributeSet, v.mo1821r(), i, 0);
        try {
            Drawable drawable = this.f1118a.getDrawable();
            if (!(drawable != null || (n = v.mo1817n(C0763j.f3667S, -1)) == -1 || (drawable = C0764a.m4517d(this.f1118a.getContext(), n)) == null)) {
                this.f1118a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                C0216d0.m1135b(drawable);
            }
            int i2 = C0763j.f3672T;
            if (v.mo1822s(i2)) {
                C0414e.m2084c(this.f1118a, v.mo1806c(i2));
            }
            int i3 = C0763j.f3677U;
            if (v.mo1822s(i3)) {
                C0414e.m2085d(this.f1118a, C0216d0.m1138e(v.mo1814k(i3, -1), null));
            }
        } finally {
            v.mo1823w();
        }
    }

    /* renamed from: g */
    public void mo1605g(int i) {
        if (i != 0) {
            Drawable d = C0764a.m4517d(this.f1118a.getContext(), i);
            if (d != null) {
                C0216d0.m1135b(d);
            }
            this.f1118a.setImageDrawable(d);
        } else {
            this.f1118a.setImageDrawable(null);
        }
        mo1600b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo1606h(ColorStateList colorStateList) {
        if (this.f1120c == null) {
            this.f1120c = new C0281u0();
        }
        C0281u0 u0Var = this.f1120c;
        u0Var.f1204a = colorStateList;
        u0Var.f1207d = true;
        mo1600b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo1607i(PorterDuff.Mode mode) {
        if (this.f1120c == null) {
            this.f1120c = new C0281u0();
        }
        C0281u0 u0Var = this.f1120c;
        u0Var.f1205b = mode;
        u0Var.f1206c = true;
        mo1600b();
    }
}
