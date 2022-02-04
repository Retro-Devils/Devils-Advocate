package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import p006b.p007a.C0763j;
import p006b.p030g.p039k.C1013s;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.e */
public class C0218e {

    /* renamed from: a */
    private final View f975a;

    /* renamed from: b */
    private final C0241j f976b;

    /* renamed from: c */
    private int f977c = -1;

    /* renamed from: d */
    private C0281u0 f978d;

    /* renamed from: e */
    private C0281u0 f979e;

    /* renamed from: f */
    private C0281u0 f980f;

    C0218e(View view) {
        this.f975a = view;
        this.f976b = C0241j.m1243b();
    }

    /* renamed from: a */
    private boolean m1140a(Drawable drawable) {
        if (this.f980f == null) {
            this.f980f = new C0281u0();
        }
        C0281u0 u0Var = this.f980f;
        u0Var.mo1736a();
        ColorStateList p = C1013s.m5779p(this.f975a);
        if (p != null) {
            u0Var.f1207d = true;
            u0Var.f1204a = p;
        }
        PorterDuff.Mode q = C1013s.m5781q(this.f975a);
        if (q != null) {
            u0Var.f1206c = true;
            u0Var.f1205b = q;
        }
        if (!u0Var.f1207d && !u0Var.f1206c) {
            return false;
        }
        C0241j.m1246i(drawable, u0Var, this.f975a.getDrawableState());
        return true;
    }

    /* renamed from: k */
    private boolean m1141k() {
        int i = Build.VERSION.SDK_INT;
        return i > 21 ? this.f978d != null : i == 21;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1383b() {
        Drawable background = this.f975a.getBackground();
        if (background == null) {
            return;
        }
        if (!m1141k() || !m1140a(background)) {
            C0281u0 u0Var = this.f979e;
            if (u0Var != null) {
                C0241j.m1246i(background, u0Var, this.f975a.getDrawableState());
                return;
            }
            C0281u0 u0Var2 = this.f978d;
            if (u0Var2 != null) {
                C0241j.m1246i(background, u0Var2, this.f975a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public ColorStateList mo1384c() {
        C0281u0 u0Var = this.f979e;
        if (u0Var != null) {
            return u0Var.f1204a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public PorterDuff.Mode mo1385d() {
        C0281u0 u0Var = this.f979e;
        if (u0Var != null) {
            return u0Var.f1205b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo1386e(AttributeSet attributeSet, int i) {
        Context context = this.f975a.getContext();
        int[] iArr = C0763j.f3666R3;
        C0296w0 v = C0296w0.m1432v(context, attributeSet, iArr, i, 0);
        View view = this.f975a;
        C1013s.m5762g0(view, view.getContext(), iArr, attributeSet, v.mo1821r(), i, 0);
        try {
            int i2 = C0763j.f3671S3;
            if (v.mo1822s(i2)) {
                this.f977c = v.mo1817n(i2, -1);
                ColorStateList f = this.f976b.mo1548f(this.f975a.getContext(), this.f977c);
                if (f != null) {
                    mo1389h(f);
                }
            }
            int i3 = C0763j.f3676T3;
            if (v.mo1822s(i3)) {
                C1013s.m5774m0(this.f975a, v.mo1806c(i3));
            }
            int i4 = C0763j.f3681U3;
            if (v.mo1822s(i4)) {
                C1013s.m5776n0(this.f975a, C0216d0.m1138e(v.mo1814k(i4, -1), null));
            }
        } finally {
            v.mo1823w();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo1387f(Drawable drawable) {
        this.f977c = -1;
        mo1389h(null);
        mo1383b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo1388g(int i) {
        this.f977c = i;
        C0241j jVar = this.f976b;
        mo1389h(jVar != null ? jVar.mo1548f(this.f975a.getContext(), i) : null);
        mo1383b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo1389h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f978d == null) {
                this.f978d = new C0281u0();
            }
            C0281u0 u0Var = this.f978d;
            u0Var.f1204a = colorStateList;
            u0Var.f1207d = true;
        } else {
            this.f978d = null;
        }
        mo1383b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo1390i(ColorStateList colorStateList) {
        if (this.f979e == null) {
            this.f979e = new C0281u0();
        }
        C0281u0 u0Var = this.f979e;
        u0Var.f1204a = colorStateList;
        u0Var.f1207d = true;
        mo1383b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo1391j(PorterDuff.Mode mode) {
        if (this.f979e == null) {
            this.f979e = new C0281u0();
        }
        C0281u0 u0Var = this.f979e;
        u0Var.f1205b = mode;
        u0Var.f1206c = true;
        mo1383b();
    }
}
