package p006b.p030g.p039k;

import android.view.View;
import android.view.ViewParent;

/* renamed from: b.g.k.k */
public class C1005k {

    /* renamed from: a */
    private ViewParent f4743a;

    /* renamed from: b */
    private ViewParent f4744b;

    /* renamed from: c */
    private final View f4745c;

    /* renamed from: d */
    private boolean f4746d;

    /* renamed from: e */
    private int[] f4747e;

    public C1005k(View view) {
        this.f4745c = view;
    }

    /* renamed from: g */
    private boolean m5691g(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent h;
        int i6;
        int i7;
        int[] iArr3;
        if (!mo5542l() || (h = m5692h(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f4745c.getLocationInWindow(iArr);
            i7 = iArr[0];
            i6 = iArr[1];
        } else {
            i7 = 0;
            i6 = 0;
        }
        if (iArr2 == null) {
            int[] i8 = m5693i();
            i8[0] = 0;
            i8[1] = 0;
            iArr3 = i8;
        } else {
            iArr3 = iArr2;
        }
        C1027v.m5849d(h, this.f4745c, i, i2, i3, i4, i5, iArr3);
        if (iArr != null) {
            this.f4745c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i7;
            iArr[1] = iArr[1] - i6;
        }
        return true;
    }

    /* renamed from: h */
    private ViewParent m5692h(int i) {
        if (i == 0) {
            return this.f4743a;
        }
        if (i != 1) {
            return null;
        }
        return this.f4744b;
    }

    /* renamed from: i */
    private int[] m5693i() {
        if (this.f4747e == null) {
            this.f4747e = new int[2];
        }
        return this.f4747e;
    }

    /* renamed from: n */
    private void m5694n(int i, ViewParent viewParent) {
        if (i == 0) {
            this.f4743a = viewParent;
        } else if (i == 1) {
            this.f4744b = viewParent;
        }
    }

    /* renamed from: a */
    public boolean mo5534a(float f, float f2, boolean z) {
        ViewParent h;
        if (!mo5542l() || (h = m5692h(0)) == null) {
            return false;
        }
        return C1027v.m5846a(h, this.f4745c, f, f2, z);
    }

    /* renamed from: b */
    public boolean mo5535b(float f, float f2) {
        ViewParent h;
        if (!mo5542l() || (h = m5692h(0)) == null) {
            return false;
        }
        return C1027v.m5847b(h, this.f4745c, f, f2);
    }

    /* renamed from: c */
    public boolean mo5536c(int i, int i2, int[] iArr, int[] iArr2) {
        return mo5537d(i, i2, iArr, iArr2, 0);
    }

    /* renamed from: d */
    public boolean mo5537d(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent h;
        int i4;
        int i5;
        if (!mo5542l() || (h = m5692h(i3)) == null) {
            return false;
        }
        if (i != 0 || i2 != 0) {
            if (iArr2 != null) {
                this.f4745c.getLocationInWindow(iArr2);
                i5 = iArr2[0];
                i4 = iArr2[1];
            } else {
                i5 = 0;
                i4 = 0;
            }
            if (iArr == null) {
                iArr = m5693i();
            }
            iArr[0] = 0;
            iArr[1] = 0;
            C1027v.m5848c(h, this.f4745c, i, i2, iArr, i3);
            if (iArr2 != null) {
                this.f4745c.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i5;
                iArr2[1] = iArr2[1] - i4;
            }
            return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
        } else if (iArr2 == null) {
            return false;
        } else {
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
    }

    /* renamed from: e */
    public void mo5538e(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        m5691g(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: f */
    public boolean mo5539f(int i, int i2, int i3, int i4, int[] iArr) {
        return m5691g(i, i2, i3, i4, iArr, 0, null);
    }

    /* renamed from: j */
    public boolean mo5540j() {
        return mo5541k(0);
    }

    /* renamed from: k */
    public boolean mo5541k(int i) {
        return m5692h(i) != null;
    }

    /* renamed from: l */
    public boolean mo5542l() {
        return this.f4746d;
    }

    /* renamed from: m */
    public void mo5543m(boolean z) {
        if (this.f4746d) {
            C1013s.m5800z0(this.f4745c);
        }
        this.f4746d = z;
    }

    /* renamed from: o */
    public boolean mo5544o(int i) {
        return mo5545p(i, 0);
    }

    /* renamed from: p */
    public boolean mo5545p(int i, int i2) {
        if (mo5541k(i2)) {
            return true;
        }
        if (!mo5542l()) {
            return false;
        }
        View view = this.f4745c;
        for (ViewParent parent = this.f4745c.getParent(); parent != null; parent = parent.getParent()) {
            if (C1027v.m5851f(parent, view, this.f4745c, i, i2)) {
                m5694n(i2, parent);
                C1027v.m5850e(parent, view, this.f4745c, i, i2);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    /* renamed from: q */
    public void mo5546q() {
        mo5547r(0);
    }

    /* renamed from: r */
    public void mo5547r(int i) {
        ViewParent h = m5692h(i);
        if (h != null) {
            C1027v.m5852g(h, this.f4745c, i);
            m5694n(i, null);
        }
    }
}
