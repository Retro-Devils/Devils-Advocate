package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.AbstractC0145m;
import androidx.appcompat.view.menu.C0118a;
import androidx.appcompat.view.menu.C0130g;
import androidx.appcompat.widget.Toolbar;
import p006b.p007a.C0754a;
import p006b.p007a.C0758e;
import p006b.p007a.C0759f;
import p006b.p007a.C0761h;
import p006b.p007a.C0763j;
import p006b.p007a.p008k.p009a.C0764a;
import p006b.p030g.p039k.C1013s;
import p006b.p030g.p039k.C1028w;
import p006b.p030g.p039k.C1033y;

/* renamed from: androidx.appcompat.widget.x0 */
public class C0299x0 implements AbstractC0213c0 {

    /* renamed from: a */
    Toolbar f1260a;

    /* renamed from: b */
    private int f1261b;

    /* renamed from: c */
    private View f1262c;

    /* renamed from: d */
    private View f1263d;

    /* renamed from: e */
    private Drawable f1264e;

    /* renamed from: f */
    private Drawable f1265f;

    /* renamed from: g */
    private Drawable f1266g;

    /* renamed from: h */
    private boolean f1267h;

    /* renamed from: i */
    CharSequence f1268i;

    /* renamed from: j */
    private CharSequence f1269j;

    /* renamed from: k */
    private CharSequence f1270k;

    /* renamed from: l */
    Window.Callback f1271l;

    /* renamed from: m */
    boolean f1272m;

    /* renamed from: n */
    private C0203c f1273n;

    /* renamed from: o */
    private int f1274o;

    /* renamed from: p */
    private int f1275p;

    /* renamed from: q */
    private Drawable f1276q;

    /* renamed from: androidx.appcompat.widget.x0$a */
    class View$OnClickListenerC0300a implements View.OnClickListener {

        /* renamed from: b */
        final C0118a f1277b;

        View$OnClickListenerC0300a() {
            this.f1277b = new C0118a(C0299x0.this.f1260a.getContext(), 0, 16908332, 0, 0, C0299x0.this.f1268i);
        }

        public void onClick(View view) {
            C0299x0 x0Var = C0299x0.this;
            Window.Callback callback = x0Var.f1271l;
            if (callback != null && x0Var.f1272m) {
                callback.onMenuItemSelected(0, this.f1277b);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.x0$b */
    class C0301b extends C1033y {

        /* renamed from: a */
        private boolean f1279a = false;

        /* renamed from: b */
        final /* synthetic */ int f1280b;

        C0301b(int i) {
            this.f1280b = i;
        }

        @Override // p006b.p030g.p039k.AbstractC1032x
        /* renamed from: a */
        public void mo345a(View view) {
            if (!this.f1279a) {
                C0299x0.this.f1260a.setVisibility(this.f1280b);
            }
        }

        @Override // p006b.p030g.p039k.C1033y, p006b.p030g.p039k.AbstractC1032x
        /* renamed from: b */
        public void mo346b(View view) {
            C0299x0.this.f1260a.setVisibility(0);
        }

        @Override // p006b.p030g.p039k.C1033y, p006b.p030g.p039k.AbstractC1032x
        /* renamed from: c */
        public void mo1307c(View view) {
            this.f1279a = true;
        }
    }

    public C0299x0(Toolbar toolbar, boolean z) {
        this(toolbar, z, C0761h.abc_action_bar_up_description, C0758e.abc_ic_ab_back_material);
    }

    public C0299x0(Toolbar toolbar, boolean z, int i, int i2) {
        Drawable drawable;
        this.f1274o = 0;
        this.f1275p = 0;
        this.f1260a = toolbar;
        this.f1268i = toolbar.getTitle();
        this.f1269j = toolbar.getSubtitle();
        this.f1267h = this.f1268i != null;
        this.f1266g = toolbar.getNavigationIcon();
        C0296w0 v = C0296w0.m1432v(toolbar.getContext(), null, C0763j.f3706a, C0754a.actionBarStyle, 0);
        this.f1276q = v.mo1810g(C0763j.f3761l);
        if (z) {
            CharSequence p = v.mo1819p(C0763j.f3791r);
            if (!TextUtils.isEmpty(p)) {
                mo1855H(p);
            }
            CharSequence p2 = v.mo1819p(C0763j.f3781p);
            if (!TextUtils.isEmpty(p2)) {
                mo1854G(p2);
            }
            Drawable g = v.mo1810g(C0763j.f3771n);
            if (g != null) {
                mo1850C(g);
            }
            Drawable g2 = v.mo1810g(C0763j.f3766m);
            if (g2 != null) {
                setIcon(g2);
            }
            if (this.f1266g == null && (drawable = this.f1276q) != null) {
                mo1853F(drawable);
            }
            mo1370x(v.mo1814k(C0763j.f3741h, 0));
            int n = v.mo1817n(C0763j.f3736g, 0);
            if (n != 0) {
                mo1848A(LayoutInflater.from(this.f1260a.getContext()).inflate(n, (ViewGroup) this.f1260a, false));
                mo1370x(this.f1261b | 16);
            }
            int m = v.mo1816m(C0763j.f3751j, 0);
            if (m > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1260a.getLayoutParams();
                layoutParams.height = m;
                this.f1260a.setLayoutParams(layoutParams);
            }
            int e = v.mo1808e(C0763j.f3731f, -1);
            int e2 = v.mo1808e(C0763j.f3726e, -1);
            if (e >= 0 || e2 >= 0) {
                this.f1260a.mo1191H(Math.max(e, 0), Math.max(e2, 0));
            }
            int n2 = v.mo1817n(C0763j.f3796s, 0);
            if (n2 != 0) {
                Toolbar toolbar2 = this.f1260a;
                toolbar2.mo1195L(toolbar2.getContext(), n2);
            }
            int n3 = v.mo1817n(C0763j.f3786q, 0);
            if (n3 != 0) {
                Toolbar toolbar3 = this.f1260a;
                toolbar3.mo1194K(toolbar3.getContext(), n3);
            }
            int n4 = v.mo1817n(C0763j.f3776o, 0);
            if (n4 != 0) {
                this.f1260a.setPopupTheme(n4);
            }
        } else {
            this.f1261b = m1487z();
        }
        v.mo1823w();
        mo1849B(i);
        this.f1270k = this.f1260a.getNavigationContentDescription();
        this.f1260a.setNavigationOnClickListener(new View$OnClickListenerC0300a());
    }

    /* renamed from: I */
    private void m1483I(CharSequence charSequence) {
        this.f1268i = charSequence;
        if ((this.f1261b & 8) != 0) {
            this.f1260a.setTitle(charSequence);
        }
    }

    /* renamed from: J */
    private void m1484J() {
        if ((this.f1261b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f1270k)) {
            this.f1260a.setNavigationContentDescription(this.f1275p);
        } else {
            this.f1260a.setNavigationContentDescription(this.f1270k);
        }
    }

    /* renamed from: K */
    private void m1485K() {
        Drawable drawable;
        Toolbar toolbar;
        if ((this.f1261b & 4) != 0) {
            toolbar = this.f1260a;
            drawable = this.f1266g;
            if (drawable == null) {
                drawable = this.f1276q;
            }
        } else {
            toolbar = this.f1260a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    /* renamed from: L */
    private void m1486L() {
        Drawable drawable;
        int i = this.f1261b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f1265f) == null) {
            drawable = this.f1264e;
        }
        this.f1260a.setLogo(drawable);
    }

    /* renamed from: z */
    private int m1487z() {
        if (this.f1260a.getNavigationIcon() == null) {
            return 11;
        }
        this.f1276q = this.f1260a.getNavigationIcon();
        return 15;
    }

    /* renamed from: A */
    public void mo1848A(View view) {
        View view2 = this.f1263d;
        if (!(view2 == null || (this.f1261b & 16) == 0)) {
            this.f1260a.removeView(view2);
        }
        this.f1263d = view;
        if (view != null && (this.f1261b & 16) != 0) {
            this.f1260a.addView(view);
        }
    }

    /* renamed from: B */
    public void mo1849B(int i) {
        if (i != this.f1275p) {
            this.f1275p = i;
            if (TextUtils.isEmpty(this.f1260a.getNavigationContentDescription())) {
                mo1851D(this.f1275p);
            }
        }
    }

    /* renamed from: C */
    public void mo1850C(Drawable drawable) {
        this.f1265f = drawable;
        m1486L();
    }

    /* renamed from: D */
    public void mo1851D(int i) {
        mo1852E(i == 0 ? null : mo1359q().getString(i));
    }

    /* renamed from: E */
    public void mo1852E(CharSequence charSequence) {
        this.f1270k = charSequence;
        m1484J();
    }

    /* renamed from: F */
    public void mo1853F(Drawable drawable) {
        this.f1266g = drawable;
        m1485K();
    }

    /* renamed from: G */
    public void mo1854G(CharSequence charSequence) {
        this.f1269j = charSequence;
        if ((this.f1261b & 8) != 0) {
            this.f1260a.setSubtitle(charSequence);
        }
    }

    /* renamed from: H */
    public void mo1855H(CharSequence charSequence) {
        this.f1267h = true;
        m1483I(charSequence);
    }

    @Override // androidx.appcompat.widget.AbstractC0213c0
    /* renamed from: a */
    public void mo1341a(Menu menu, AbstractC0145m.AbstractC0146a aVar) {
        if (this.f1273n == null) {
            C0203c cVar = new C0203c(this.f1260a.getContext());
            this.f1273n = cVar;
            cVar.mo558s(C0759f.action_menu_presenter);
        }
        this.f1273n.mo550k(aVar);
        this.f1260a.mo1192I((C0130g) menu, this.f1273n);
    }

    @Override // androidx.appcompat.widget.AbstractC0213c0
    /* renamed from: b */
    public boolean mo1342b() {
        return this.f1260a.mo1281z();
    }

    @Override // androidx.appcompat.widget.AbstractC0213c0
    /* renamed from: c */
    public boolean mo1343c() {
        return this.f1260a.mo1189A();
    }

    @Override // androidx.appcompat.widget.AbstractC0213c0
    public void collapseActionView() {
        this.f1260a.mo1200e();
    }

    @Override // androidx.appcompat.widget.AbstractC0213c0
    /* renamed from: d */
    public boolean mo1345d() {
        return this.f1260a.mo1279w();
    }

    @Override // androidx.appcompat.widget.AbstractC0213c0
    /* renamed from: e */
    public boolean mo1346e() {
        return this.f1260a.mo1196O();
    }

    @Override // androidx.appcompat.widget.AbstractC0213c0
    /* renamed from: f */
    public void mo1347f() {
        this.f1272m = true;
    }

    @Override // androidx.appcompat.widget.AbstractC0213c0
    /* renamed from: g */
    public boolean mo1348g() {
        return this.f1260a.mo1199d();
    }

    @Override // androidx.appcompat.widget.AbstractC0213c0
    public CharSequence getTitle() {
        return this.f1260a.getTitle();
    }

    @Override // androidx.appcompat.widget.AbstractC0213c0
    /* renamed from: h */
    public void mo1350h() {
        this.f1260a.mo1201f();
    }

    @Override // androidx.appcompat.widget.AbstractC0213c0
    /* renamed from: i */
    public void mo1351i(AbstractC0145m.AbstractC0146a aVar, C0130g.AbstractC0131a aVar2) {
        this.f1260a.mo1193J(aVar, aVar2);
    }

    @Override // androidx.appcompat.widget.AbstractC0213c0
    /* renamed from: j */
    public int mo1352j() {
        return this.f1261b;
    }

    @Override // androidx.appcompat.widget.AbstractC0213c0
    /* renamed from: k */
    public void mo1353k(int i) {
        this.f1260a.setVisibility(i);
    }

    @Override // androidx.appcompat.widget.AbstractC0213c0
    /* renamed from: l */
    public Menu mo1354l() {
        return this.f1260a.getMenu();
    }

    @Override // androidx.appcompat.widget.AbstractC0213c0
    /* renamed from: m */
    public void mo1355m(int i) {
        mo1850C(i != 0 ? C0764a.m4517d(mo1359q(), i) : null);
    }

    @Override // androidx.appcompat.widget.AbstractC0213c0
    /* renamed from: n */
    public void mo1356n(C0266p0 p0Var) {
        Toolbar toolbar;
        View view = this.f1262c;
        if (view != null && view.getParent() == (toolbar = this.f1260a)) {
            toolbar.removeView(this.f1262c);
        }
        this.f1262c = p0Var;
        if (p0Var != null && this.f1274o == 2) {
            this.f1260a.addView(p0Var, 0);
            Toolbar.C0191e eVar = (Toolbar.C0191e) this.f1262c.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) eVar).width = -2;
            ((ViewGroup.MarginLayoutParams) eVar).height = -2;
            eVar.f223a = 8388691;
            p0Var.setAllowCollapse(true);
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0213c0
    /* renamed from: o */
    public ViewGroup mo1357o() {
        return this.f1260a;
    }

    @Override // androidx.appcompat.widget.AbstractC0213c0
    /* renamed from: p */
    public void mo1358p(boolean z) {
    }

    @Override // androidx.appcompat.widget.AbstractC0213c0
    /* renamed from: q */
    public Context mo1359q() {
        return this.f1260a.getContext();
    }

    @Override // androidx.appcompat.widget.AbstractC0213c0
    /* renamed from: r */
    public int mo1360r() {
        return this.f1274o;
    }

    @Override // androidx.appcompat.widget.AbstractC0213c0
    /* renamed from: s */
    public C1028w mo1361s(int i, long j) {
        return C1013s.m5753c(this.f1260a).mo5578a(i == 0 ? 1.0f : 0.0f).mo5581d(j).mo5583f(new C0301b(i));
    }

    @Override // androidx.appcompat.widget.AbstractC0213c0
    public void setIcon(int i) {
        setIcon(i != 0 ? C0764a.m4517d(mo1359q(), i) : null);
    }

    @Override // androidx.appcompat.widget.AbstractC0213c0
    public void setIcon(Drawable drawable) {
        this.f1264e = drawable;
        m1486L();
    }

    @Override // androidx.appcompat.widget.AbstractC0213c0
    public void setWindowCallback(Window.Callback callback) {
        this.f1271l = callback;
    }

    @Override // androidx.appcompat.widget.AbstractC0213c0
    public void setWindowTitle(CharSequence charSequence) {
        if (!this.f1267h) {
            m1483I(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0213c0
    /* renamed from: t */
    public void mo1366t() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.AbstractC0213c0
    /* renamed from: u */
    public boolean mo1367u() {
        return this.f1260a.mo1278v();
    }

    @Override // androidx.appcompat.widget.AbstractC0213c0
    /* renamed from: v */
    public void mo1368v() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.AbstractC0213c0
    /* renamed from: w */
    public void mo1369w(boolean z) {
        this.f1260a.setCollapsible(z);
    }

    @Override // androidx.appcompat.widget.AbstractC0213c0
    /* renamed from: x */
    public void mo1370x(int i) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i2 = this.f1261b ^ i;
        this.f1261b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m1484J();
                }
                m1485K();
            }
            if ((i2 & 3) != 0) {
                m1486L();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f1260a.setTitle(this.f1268i);
                    toolbar = this.f1260a;
                    charSequence = this.f1269j;
                } else {
                    charSequence = null;
                    this.f1260a.setTitle((CharSequence) null);
                    toolbar = this.f1260a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i2 & 16) != 0 && (view = this.f1263d) != null) {
                if ((i & 16) != 0) {
                    this.f1260a.addView(view);
                } else {
                    this.f1260a.removeView(view);
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0213c0
    /* renamed from: y */
    public void mo1371y(int i) {
        mo1853F(i != 0 ? C0764a.m4517d(mo1359q(), i) : null);
    }
}
