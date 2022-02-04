package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.TextView;
import androidx.core.content.p005c.C0390f;
import androidx.core.widget.AbstractC0411b;
import java.lang.ref.WeakReference;
import p006b.p007a.C0763j;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.x */
public class C0297x {

    /* renamed from: a */
    private final TextView f1243a;

    /* renamed from: b */
    private C0281u0 f1244b;

    /* renamed from: c */
    private C0281u0 f1245c;

    /* renamed from: d */
    private C0281u0 f1246d;

    /* renamed from: e */
    private C0281u0 f1247e;

    /* renamed from: f */
    private C0281u0 f1248f;

    /* renamed from: g */
    private C0281u0 f1249g;

    /* renamed from: h */
    private C0281u0 f1250h;

    /* renamed from: i */
    private final C0304z f1251i;

    /* renamed from: j */
    private int f1252j = 0;

    /* renamed from: k */
    private int f1253k = -1;

    /* renamed from: l */
    private Typeface f1254l;

    /* renamed from: m */
    private boolean f1255m;

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.x$a */
    public class C0298a extends C0390f.AbstractC0391a {

        /* renamed from: a */
        final /* synthetic */ int f1256a;

        /* renamed from: b */
        final /* synthetic */ int f1257b;

        /* renamed from: c */
        final /* synthetic */ WeakReference f1258c;

        C0298a(int i, int i2, WeakReference weakReference) {
            this.f1256a = i;
            this.f1257b = i2;
            this.f1258c = weakReference;
        }

        @Override // androidx.core.content.p005c.C0390f.AbstractC0391a
        /* renamed from: c */
        public void mo1846c(int i) {
        }

        @Override // androidx.core.content.p005c.C0390f.AbstractC0391a
        /* renamed from: d */
        public void mo1847d(Typeface typeface) {
            int i;
            if (Build.VERSION.SDK_INT >= 28 && (i = this.f1256a) != -1) {
                typeface = Typeface.create(typeface, i, (this.f1257b & 2) != 0);
            }
            C0297x.this.mo1835n(this.f1258c, typeface);
        }
    }

    C0297x(TextView textView) {
        this.f1243a = textView;
        this.f1251i = new C0304z(textView);
    }

    /* renamed from: A */
    private void m1453A(int i, float f) {
        this.f1251i.mo1908y(i, f);
    }

    /* renamed from: B */
    private void m1454B(Context context, C0296w0 w0Var) {
        String o;
        Typeface typeface;
        Typeface typeface2;
        this.f1252j = w0Var.mo1814k(C0763j.f3706a3, this.f1252j);
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        if (i >= 28) {
            int k = w0Var.mo1814k(C0763j.f3731f3, -1);
            this.f1253k = k;
            if (k != -1) {
                this.f1252j = (this.f1252j & 2) | 0;
            }
        }
        int i2 = C0763j.f3726e3;
        if (w0Var.mo1822s(i2) || w0Var.mo1822s(C0763j.f3736g3)) {
            this.f1254l = null;
            int i3 = C0763j.f3736g3;
            if (w0Var.mo1822s(i3)) {
                i2 = i3;
            }
            int i4 = this.f1253k;
            int i5 = this.f1252j;
            if (!context.isRestricted()) {
                try {
                    Typeface j = w0Var.mo1813j(i2, this.f1252j, new C0298a(i4, i5, new WeakReference(this.f1243a)));
                    if (j != null) {
                        if (i >= 28 && this.f1253k != -1) {
                            j = Typeface.create(Typeface.create(j, 0), this.f1253k, (this.f1252j & 2) != 0);
                        }
                        this.f1254l = j;
                    }
                    this.f1255m = this.f1254l == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f1254l == null && (o = w0Var.mo1818o(i2)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.f1253k == -1) {
                    typeface = Typeface.create(o, this.f1252j);
                } else {
                    Typeface create = Typeface.create(o, 0);
                    int i6 = this.f1253k;
                    if ((this.f1252j & 2) != 0) {
                        z = true;
                    }
                    typeface = Typeface.create(create, i6, z);
                }
                this.f1254l = typeface;
                return;
            }
            return;
        }
        int i7 = C0763j.f3701Z2;
        if (w0Var.mo1822s(i7)) {
            this.f1255m = false;
            int k2 = w0Var.mo1814k(i7, 1);
            if (k2 == 1) {
                typeface2 = Typeface.SANS_SERIF;
            } else if (k2 == 2) {
                typeface2 = Typeface.SERIF;
            } else if (k2 == 3) {
                typeface2 = Typeface.MONOSPACE;
            } else {
                return;
            }
            this.f1254l = typeface2;
        }
    }

    /* renamed from: a */
    private void m1455a(Drawable drawable, C0281u0 u0Var) {
        if (drawable != null && u0Var != null) {
            C0241j.m1246i(drawable, u0Var, this.f1243a.getDrawableState());
        }
    }

    /* renamed from: d */
    private static C0281u0 m1456d(Context context, C0241j jVar, int i) {
        ColorStateList f = jVar.mo1548f(context, i);
        if (f == null) {
            return null;
        }
        C0281u0 u0Var = new C0281u0();
        u0Var.f1207d = true;
        u0Var.f1204a = f;
        return u0Var;
    }

    /* renamed from: x */
    private void m1457x(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 17 && (drawable5 != null || drawable6 != null)) {
            Drawable[] compoundDrawablesRelative = this.f1243a.getCompoundDrawablesRelative();
            TextView textView = this.f1243a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
        } else if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
            if (i >= 17) {
                Drawable[] compoundDrawablesRelative2 = this.f1243a.getCompoundDrawablesRelative();
                if (!(compoundDrawablesRelative2[0] == null && compoundDrawablesRelative2[2] == null)) {
                    TextView textView2 = this.f1243a;
                    Drawable drawable7 = compoundDrawablesRelative2[0];
                    if (drawable2 == null) {
                        drawable2 = compoundDrawablesRelative2[1];
                    }
                    Drawable drawable8 = compoundDrawablesRelative2[2];
                    if (drawable4 == null) {
                        drawable4 = compoundDrawablesRelative2[3];
                    }
                    textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
                    return;
                }
            }
            Drawable[] compoundDrawables = this.f1243a.getCompoundDrawables();
            TextView textView3 = this.f1243a;
            if (drawable == null) {
                drawable = compoundDrawables[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawables[1];
            }
            if (drawable3 == null) {
                drawable3 = compoundDrawables[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawables[3];
            }
            textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }
    }

    /* renamed from: y */
    private void m1458y() {
        C0281u0 u0Var = this.f1250h;
        this.f1244b = u0Var;
        this.f1245c = u0Var;
        this.f1246d = u0Var;
        this.f1247e = u0Var;
        this.f1248f = u0Var;
        this.f1249g = u0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1824b() {
        if (!(this.f1244b == null && this.f1245c == null && this.f1246d == null && this.f1247e == null)) {
            Drawable[] compoundDrawables = this.f1243a.getCompoundDrawables();
            m1455a(compoundDrawables[0], this.f1244b);
            m1455a(compoundDrawables[1], this.f1245c);
            m1455a(compoundDrawables[2], this.f1246d);
            m1455a(compoundDrawables[3], this.f1247e);
        }
        if (Build.VERSION.SDK_INT < 17) {
            return;
        }
        if (this.f1248f != null || this.f1249g != null) {
            Drawable[] compoundDrawablesRelative = this.f1243a.getCompoundDrawablesRelative();
            m1455a(compoundDrawablesRelative[0], this.f1248f);
            m1455a(compoundDrawablesRelative[2], this.f1249g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo1825c() {
        this.f1251i.mo1895b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo1826e() {
        return this.f1251i.mo1897j();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo1827f() {
        return this.f1251i.mo1898k();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo1828g() {
        return this.f1251i.mo1899l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int[] mo1829h() {
        return this.f1251i.mo1900m();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo1830i() {
        return this.f1251i.mo1901n();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public ColorStateList mo1831j() {
        C0281u0 u0Var = this.f1250h;
        if (u0Var != null) {
            return u0Var.f1204a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public PorterDuff.Mode mo1832k() {
        C0281u0 u0Var = this.f1250h;
        if (u0Var != null) {
            return u0Var.f1205b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo1833l() {
        return this.f1251i.mo1903s();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x029b  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02a4  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02b3  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02b9  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02de  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02ee  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x030d  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0314  */
    /* JADX WARNING: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01ce  */
    @android.annotation.SuppressLint({"NewApi"})
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1834m(android.util.AttributeSet r24, int r25) {
        /*
        // Method dump skipped, instructions count: 794
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0297x.mo1834m(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo1835n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f1255m) {
            this.f1254l = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                textView.setTypeface(typeface, this.f1252j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo1836o(boolean z, int i, int i2, int i3, int i4) {
        if (!AbstractC0411b.f2170a) {
            mo1825c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo1837p() {
        mo1824b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo1838q(Context context, int i) {
        String o;
        ColorStateList c;
        C0296w0 t = C0296w0.m1430t(context, i, C0763j.f3691X2);
        int i2 = C0763j.f3746i3;
        if (t.mo1822s(i2)) {
            mo1839r(t.mo1804a(i2, false));
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 23) {
            int i4 = C0763j.f3711b3;
            if (t.mo1822s(i4) && (c = t.mo1806c(i4)) != null) {
                this.f1243a.setTextColor(c);
            }
        }
        int i5 = C0763j.f3696Y2;
        if (t.mo1822s(i5) && t.mo1809f(i5, -1) == 0) {
            this.f1243a.setTextSize(0, 0.0f);
        }
        m1454B(context, t);
        if (i3 >= 26) {
            int i6 = C0763j.f3741h3;
            if (t.mo1822s(i6) && (o = t.mo1818o(i6)) != null) {
                this.f1243a.setFontVariationSettings(o);
            }
        }
        t.mo1823w();
        Typeface typeface = this.f1254l;
        if (typeface != null) {
            this.f1243a.setTypeface(typeface, this.f1252j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo1839r(boolean z) {
        this.f1243a.setAllCaps(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo1840s(int i, int i2, int i3, int i4) {
        this.f1251i.mo1905u(i, i2, i3, i4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo1841t(int[] iArr, int i) {
        this.f1251i.mo1906v(iArr, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo1842u(int i) {
        this.f1251i.mo1907w(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo1843v(ColorStateList colorStateList) {
        if (this.f1250h == null) {
            this.f1250h = new C0281u0();
        }
        C0281u0 u0Var = this.f1250h;
        u0Var.f1204a = colorStateList;
        u0Var.f1207d = colorStateList != null;
        m1458y();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo1844w(PorterDuff.Mode mode) {
        if (this.f1250h == null) {
            this.f1250h = new C0281u0();
        }
        C0281u0 u0Var = this.f1250h;
        u0Var.f1205b = mode;
        u0Var.f1206c = mode != null;
        m1458y();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo1845z(int i, float f) {
        if (!AbstractC0411b.f2170a && !mo1833l()) {
            m1453A(i, f);
        }
    }
}
