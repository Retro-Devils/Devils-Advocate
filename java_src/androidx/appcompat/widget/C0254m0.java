package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.content.C0378a;
import androidx.core.graphics.drawable.C0398a;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import p006b.p007a.p010l.p011a.C0766a;
import p006b.p007a.p012m.C0781a;
import p006b.p021d.C0830f;
import p006b.p021d.C0831g;
import p006b.p021d.C0838i;
import p006b.p021d.C0839j;
import p006b.p064s.p065a.p066a.C1184c;
import p006b.p064s.p065a.p066a.C1194i;

/* renamed from: androidx.appcompat.widget.m0 */
public final class C0254m0 {

    /* renamed from: a */
    private static final PorterDuff.Mode f1108a = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    private static C0254m0 f1109b;

    /* renamed from: c */
    private static final C0257c f1110c = new C0257c(6);

    /* renamed from: d */
    private WeakHashMap<Context, C0839j<ColorStateList>> f1111d;

    /* renamed from: e */
    private C0838i<String, AbstractC0258d> f1112e;

    /* renamed from: f */
    private C0839j<String> f1113f;

    /* renamed from: g */
    private final WeakHashMap<Context, C0830f<WeakReference<Drawable.ConstantState>>> f1114g = new WeakHashMap<>(0);

    /* renamed from: h */
    private TypedValue f1115h;

    /* renamed from: i */
    private boolean f1116i;

    /* renamed from: j */
    private AbstractC0259e f1117j;

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.m0$a */
    public static class C0255a implements AbstractC0258d {
        C0255a() {
        }

        @Override // androidx.appcompat.widget.C0254m0.AbstractC0258d
        /* renamed from: a */
        public Drawable mo1597a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C0766a.m4521m(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                return null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.m0$b */
    public static class C0256b implements AbstractC0258d {
        C0256b() {
        }

        @Override // androidx.appcompat.widget.C0254m0.AbstractC0258d
        /* renamed from: a */
        public Drawable mo1597a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C1184c.m6429a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.m0$c */
    public static class C0257c extends C0831g<Integer, PorterDuffColorFilter> {
        public C0257c(int i) {
            super(i);
        }

        /* renamed from: m */
        private static int m1308m(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public PorterDuffColorFilter mo1598n(int i, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) mo4928d(Integer.valueOf(m1308m(i, mode)));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public PorterDuffColorFilter mo1599o(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) mo4930f(Integer.valueOf(m1308m(i, mode)), porterDuffColorFilter);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.m0$d */
    public interface AbstractC0258d {
        /* renamed from: a */
        Drawable mo1597a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.m0$e */
    public interface AbstractC0259e {
        /* renamed from: a */
        Drawable mo1550a(C0254m0 m0Var, Context context, int i);

        /* renamed from: b */
        boolean mo1551b(Context context, int i, Drawable drawable);

        /* renamed from: c */
        ColorStateList mo1552c(Context context, int i);

        /* renamed from: d */
        boolean mo1553d(Context context, int i, Drawable drawable);

        /* renamed from: e */
        PorterDuff.Mode mo1554e(int i);
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.m0$f */
    public static class C0260f implements AbstractC0258d {
        C0260f() {
        }

        @Override // androidx.appcompat.widget.C0254m0.AbstractC0258d
        /* renamed from: a */
        public Drawable mo1597a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C1194i.m6462c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    /* renamed from: a */
    private void m1282a(String str, AbstractC0258d dVar) {
        if (this.f1112e == null) {
            this.f1112e = new C0838i<>();
        }
        this.f1112e.put(str, dVar);
    }

    /* renamed from: b */
    private synchronized boolean m1283b(Context context, long j, Drawable drawable) {
        boolean z;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            C0830f<WeakReference<Drawable.ConstantState>> fVar = this.f1114g.get(context);
            if (fVar == null) {
                fVar = new C0830f<>();
                this.f1114g.put(context, fVar);
            }
            fVar.mo4919i(j, new WeakReference<>(constantState));
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: c */
    private void m1284c(Context context, int i, ColorStateList colorStateList) {
        if (this.f1111d == null) {
            this.f1111d = new WeakHashMap<>();
        }
        C0839j<ColorStateList> jVar = this.f1111d.get(context);
        if (jVar == null) {
            jVar = new C0839j<>();
            this.f1111d.put(context, jVar);
        }
        jVar.mo5025a(i, colorStateList);
    }

    /* renamed from: d */
    private void m1285d(Context context) {
        if (!this.f1116i) {
            this.f1116i = true;
            Drawable j = mo1589j(context, C0781a.abc_vector_test);
            if (j == null || !m1294q(j)) {
                this.f1116i = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    /* renamed from: e */
    private static long m1286e(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    /* renamed from: f */
    private Drawable m1287f(Context context, int i) {
        if (this.f1115h == null) {
            this.f1115h = new TypedValue();
        }
        TypedValue typedValue = this.f1115h;
        context.getResources().getValue(i, typedValue, true);
        long e = m1286e(typedValue);
        Drawable i2 = m1290i(context, e);
        if (i2 != null) {
            return i2;
        }
        AbstractC0259e eVar = this.f1117j;
        Drawable a = eVar == null ? null : eVar.mo1550a(this, context, i);
        if (a != null) {
            a.setChangingConfigurations(typedValue.changingConfigurations);
            m1283b(context, e, a);
        }
        return a;
    }

    /* renamed from: g */
    private static PorterDuffColorFilter m1288g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return m1291l(colorStateList.getColorForState(iArr, 0), mode);
    }

    /* renamed from: h */
    public static synchronized C0254m0 m1289h() {
        C0254m0 m0Var;
        synchronized (C0254m0.class) {
            if (f1109b == null) {
                C0254m0 m0Var2 = new C0254m0();
                f1109b = m0Var2;
                m1293p(m0Var2);
            }
            m0Var = f1109b;
        }
        return m0Var;
    }

    /* renamed from: i */
    private synchronized Drawable m1290i(Context context, long j) {
        C0830f<WeakReference<Drawable.ConstantState>> fVar = this.f1114g.get(context);
        if (fVar == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> e = fVar.mo4915e(j);
        if (e != null) {
            Drawable.ConstantState constantState = e.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            fVar.mo4920j(j);
        }
        return null;
    }

    /* renamed from: l */
    public static synchronized PorterDuffColorFilter m1291l(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter n;
        synchronized (C0254m0.class) {
            C0257c cVar = f1110c;
            n = cVar.mo1598n(i, mode);
            if (n == null) {
                n = new PorterDuffColorFilter(i, mode);
                cVar.mo1599o(i, mode, n);
            }
        }
        return n;
    }

    /* renamed from: n */
    private ColorStateList m1292n(Context context, int i) {
        C0839j<ColorStateList> jVar;
        WeakHashMap<Context, C0839j<ColorStateList>> weakHashMap = this.f1111d;
        if (weakHashMap == null || (jVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return jVar.mo5029e(i);
    }

    /* renamed from: p */
    private static void m1293p(C0254m0 m0Var) {
        if (Build.VERSION.SDK_INT < 24) {
            m0Var.m1282a("vector", new C0260f());
            m0Var.m1282a("animated-vector", new C0256b());
            m0Var.m1282a("animated-selector", new C0255a());
        }
    }

    /* renamed from: q */
    private static boolean m1294q(Drawable drawable) {
        return (drawable instanceof C1194i) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0073 A[Catch:{ Exception -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009a A[Catch:{ Exception -> 0x00a2 }] */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m1295r(android.content.Context r11, int r12) {
        /*
        // Method dump skipped, instructions count: 179
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0254m0.m1295r(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    /* renamed from: v */
    private Drawable m1296v(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList m = mo1591m(context, i);
        if (m != null) {
            if (C0216d0.m1134a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable r = C0398a.m1981r(drawable);
            C0398a.m1978o(r, m);
            PorterDuff.Mode o = mo1592o(i);
            if (o == null) {
                return r;
            }
            C0398a.m1979p(r, o);
            return r;
        }
        AbstractC0259e eVar = this.f1117j;
        if ((eVar == null || !eVar.mo1553d(context, i, drawable)) && !mo1596x(context, i, drawable) && z) {
            return null;
        }
        return drawable;
    }

    /* renamed from: w */
    static void m1297w(Drawable drawable, C0281u0 u0Var, int[] iArr) {
        if (!C0216d0.m1134a(drawable) || drawable.mutate() == drawable) {
            boolean z = u0Var.f1207d;
            if (z || u0Var.f1206c) {
                drawable.setColorFilter(m1288g(z ? u0Var.f1204a : null, u0Var.f1206c ? u0Var.f1205b : f1108a, iArr));
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
                return;
            }
            return;
        }
        Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
    }

    /* renamed from: j */
    public synchronized Drawable mo1589j(Context context, int i) {
        return mo1590k(context, i, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public synchronized Drawable mo1590k(Context context, int i, boolean z) {
        Drawable r;
        m1285d(context);
        r = m1295r(context, i);
        if (r == null) {
            r = m1287f(context, i);
        }
        if (r == null) {
            r = C0378a.m1874d(context, i);
        }
        if (r != null) {
            r = m1296v(context, i, z, r);
        }
        if (r != null) {
            C0216d0.m1135b(r);
        }
        return r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public synchronized ColorStateList mo1591m(Context context, int i) {
        ColorStateList n;
        n = m1292n(context, i);
        if (n == null) {
            AbstractC0259e eVar = this.f1117j;
            n = eVar == null ? null : eVar.mo1552c(context, i);
            if (n != null) {
                m1284c(context, i, n);
            }
        }
        return n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public PorterDuff.Mode mo1592o(int i) {
        AbstractC0259e eVar = this.f1117j;
        if (eVar == null) {
            return null;
        }
        return eVar.mo1554e(i);
    }

    /* renamed from: s */
    public synchronized void mo1593s(Context context) {
        C0830f<WeakReference<Drawable.ConstantState>> fVar = this.f1114g.get(context);
        if (fVar != null) {
            fVar.mo4912b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public synchronized Drawable mo1594t(Context context, C0202b1 b1Var, int i) {
        Drawable r = m1295r(context, i);
        if (r == null) {
            r = b1Var.mo1317d(i);
        }
        if (r == null) {
            return null;
        }
        return m1296v(context, i, false, r);
    }

    /* renamed from: u */
    public synchronized void mo1595u(AbstractC0259e eVar) {
        this.f1117j = eVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean mo1596x(Context context, int i, Drawable drawable) {
        AbstractC0259e eVar = this.f1117j;
        return eVar != null && eVar.mo1551b(context, i, drawable);
    }
}
