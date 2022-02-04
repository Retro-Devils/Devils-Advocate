package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.app.AbstractC0064a;
import androidx.appcompat.view.menu.C0130g;
import androidx.appcompat.widget.AbstractC0213c0;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.C0266p0;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p006b.p007a.C0754a;
import p006b.p007a.C0759f;
import p006b.p007a.C0763j;
import p006b.p007a.p014o.AbstractC0785b;
import p006b.p007a.p014o.C0784a;
import p006b.p007a.p014o.C0792g;
import p006b.p007a.p014o.C0795h;
import p006b.p030g.p039k.AbstractC1032x;
import p006b.p030g.p039k.AbstractC1034z;
import p006b.p030g.p039k.C1013s;
import p006b.p030g.p039k.C1028w;
import p006b.p030g.p039k.C1033y;

/* renamed from: androidx.appcompat.app.m */
public class C0111m extends AbstractC0064a implements ActionBarOverlayLayout.AbstractC0160d {

    /* renamed from: a */
    private static final Interpolator f376a = new AccelerateInterpolator();

    /* renamed from: b */
    private static final Interpolator f377b = new DecelerateInterpolator();

    /* renamed from: A */
    C0795h f378A;

    /* renamed from: B */
    private boolean f379B;

    /* renamed from: C */
    boolean f380C;

    /* renamed from: D */
    final AbstractC1032x f381D = new C0112a();

    /* renamed from: E */
    final AbstractC1032x f382E = new C0113b();

    /* renamed from: F */
    final AbstractC1034z f383F = new C0114c();

    /* renamed from: c */
    Context f384c;

    /* renamed from: d */
    private Context f385d;

    /* renamed from: e */
    private Activity f386e;

    /* renamed from: f */
    ActionBarOverlayLayout f387f;

    /* renamed from: g */
    ActionBarContainer f388g;

    /* renamed from: h */
    AbstractC0213c0 f389h;

    /* renamed from: i */
    ActionBarContextView f390i;

    /* renamed from: j */
    View f391j;

    /* renamed from: k */
    C0266p0 f392k;

    /* renamed from: l */
    private ArrayList<?> f393l = new ArrayList<>();

    /* renamed from: m */
    private int f394m = -1;

    /* renamed from: n */
    private boolean f395n;

    /* renamed from: o */
    C0115d f396o;

    /* renamed from: p */
    AbstractC0785b f397p;

    /* renamed from: q */
    AbstractC0785b.AbstractC0786a f398q;

    /* renamed from: r */
    private boolean f399r;

    /* renamed from: s */
    private ArrayList<AbstractC0064a.AbstractC0066b> f400s = new ArrayList<>();

    /* renamed from: t */
    private boolean f401t;

    /* renamed from: u */
    private int f402u = 0;

    /* renamed from: v */
    boolean f403v = true;

    /* renamed from: w */
    boolean f404w;

    /* renamed from: x */
    boolean f405x;

    /* renamed from: y */
    private boolean f406y;

    /* renamed from: z */
    private boolean f407z = true;

    /* renamed from: androidx.appcompat.app.m$a */
    class C0112a extends C1033y {
        C0112a() {
        }

        @Override // p006b.p030g.p039k.AbstractC1032x
        /* renamed from: a */
        public void mo345a(View view) {
            View view2;
            C0111m mVar = C0111m.this;
            if (mVar.f403v && (view2 = mVar.f391j) != null) {
                view2.setTranslationY(0.0f);
                C0111m.this.f388g.setTranslationY(0.0f);
            }
            C0111m.this.f388g.setVisibility(8);
            C0111m.this.f388g.setTransitioning(false);
            C0111m mVar2 = C0111m.this;
            mVar2.f378A = null;
            mVar2.mo430z();
            ActionBarOverlayLayout actionBarOverlayLayout = C0111m.this.f387f;
            if (actionBarOverlayLayout != null) {
                C1013s.m5760f0(actionBarOverlayLayout);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.m$b */
    class C0113b extends C1033y {
        C0113b() {
        }

        @Override // p006b.p030g.p039k.AbstractC1032x
        /* renamed from: a */
        public void mo345a(View view) {
            C0111m mVar = C0111m.this;
            mVar.f378A = null;
            mVar.f388g.requestLayout();
        }
    }

    /* renamed from: androidx.appcompat.app.m$c */
    class C0114c implements AbstractC1034z {
        C0114c() {
        }

        @Override // p006b.p030g.p039k.AbstractC1034z
        /* renamed from: a */
        public void mo431a(View view) {
            ((View) C0111m.this.f388g.getParent()).invalidate();
        }
    }

    /* renamed from: androidx.appcompat.app.m$d */
    public class C0115d extends AbstractC0785b implements C0130g.AbstractC0131a {

        /* renamed from: d */
        private final Context f411d;

        /* renamed from: e */
        private final C0130g f412e;

        /* renamed from: f */
        private AbstractC0785b.AbstractC0786a f413f;

        /* renamed from: g */
        private WeakReference<View> f414g;

        public C0115d(Context context, AbstractC0785b.AbstractC0786a aVar) {
            this.f411d = context;
            this.f413f = aVar;
            C0130g W = new C0130g(context).mo631W(1);
            this.f412e = W;
            W.mo630V(this);
        }

        @Override // androidx.appcompat.view.menu.C0130g.AbstractC0131a
        /* renamed from: a */
        public boolean mo320a(C0130g gVar, MenuItem menuItem) {
            AbstractC0785b.AbstractC0786a aVar = this.f413f;
            if (aVar != null) {
                return aVar.mo350b(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.C0130g.AbstractC0131a
        /* renamed from: b */
        public void mo322b(C0130g gVar) {
            if (this.f413f != null) {
                mo438k();
                C0111m.this.f390i.mo913l();
            }
        }

        @Override // p006b.p007a.p014o.AbstractC0785b
        /* renamed from: c */
        public void mo432c() {
            C0111m mVar = C0111m.this;
            if (mVar.f396o == this) {
                if (!C0111m.m497y(mVar.f404w, mVar.f405x, false)) {
                    C0111m mVar2 = C0111m.this;
                    mVar2.f397p = this;
                    mVar2.f398q = this.f413f;
                } else {
                    this.f413f.mo352d(this);
                }
                this.f413f = null;
                C0111m.this.mo429x(false);
                C0111m.this.f390i.mo903g();
                C0111m.this.f389h.mo1357o().sendAccessibilityEvent(32);
                C0111m mVar3 = C0111m.this;
                mVar3.f387f.setHideOnContentScrollEnabled(mVar3.f380C);
                C0111m.this.f396o = null;
            }
        }

        @Override // p006b.p007a.p014o.AbstractC0785b
        /* renamed from: d */
        public View mo433d() {
            WeakReference<View> weakReference = this.f414g;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // p006b.p007a.p014o.AbstractC0785b
        /* renamed from: e */
        public Menu mo434e() {
            return this.f412e;
        }

        @Override // p006b.p007a.p014o.AbstractC0785b
        /* renamed from: f */
        public MenuInflater mo435f() {
            return new C0792g(this.f411d);
        }

        @Override // p006b.p007a.p014o.AbstractC0785b
        /* renamed from: g */
        public CharSequence mo436g() {
            return C0111m.this.f390i.getSubtitle();
        }

        @Override // p006b.p007a.p014o.AbstractC0785b
        /* renamed from: i */
        public CharSequence mo437i() {
            return C0111m.this.f390i.getTitle();
        }

        @Override // p006b.p007a.p014o.AbstractC0785b
        /* renamed from: k */
        public void mo438k() {
            if (C0111m.this.f396o == this) {
                this.f412e.mo661h0();
                try {
                    this.f413f.mo349a(this, this.f412e);
                } finally {
                    this.f412e.mo658g0();
                }
            }
        }

        @Override // p006b.p007a.p014o.AbstractC0785b
        /* renamed from: l */
        public boolean mo439l() {
            return C0111m.this.f390i.mo911j();
        }

        @Override // p006b.p007a.p014o.AbstractC0785b
        /* renamed from: m */
        public void mo440m(View view) {
            C0111m.this.f390i.setCustomView(view);
            this.f414g = new WeakReference<>(view);
        }

        @Override // p006b.p007a.p014o.AbstractC0785b
        /* renamed from: n */
        public void mo441n(int i) {
            mo442o(C0111m.this.f384c.getResources().getString(i));
        }

        @Override // p006b.p007a.p014o.AbstractC0785b
        /* renamed from: o */
        public void mo442o(CharSequence charSequence) {
            C0111m.this.f390i.setSubtitle(charSequence);
        }

        @Override // p006b.p007a.p014o.AbstractC0785b
        /* renamed from: q */
        public void mo443q(int i) {
            mo444r(C0111m.this.f384c.getResources().getString(i));
        }

        @Override // p006b.p007a.p014o.AbstractC0785b
        /* renamed from: r */
        public void mo444r(CharSequence charSequence) {
            C0111m.this.f390i.setTitle(charSequence);
        }

        @Override // p006b.p007a.p014o.AbstractC0785b
        /* renamed from: s */
        public void mo445s(boolean z) {
            super.mo445s(z);
            C0111m.this.f390i.setTitleOptional(z);
        }

        /* renamed from: t */
        public boolean mo446t() {
            this.f412e.mo661h0();
            try {
                return this.f413f.mo351c(this, this.f412e);
            } finally {
                this.f412e.mo658g0();
            }
        }
    }

    public C0111m(Activity activity, boolean z) {
        this.f386e = activity;
        View decorView = activity.getWindow().getDecorView();
        m492F(decorView);
        if (!z) {
            this.f391j = decorView.findViewById(16908290);
        }
    }

    public C0111m(Dialog dialog) {
        m492F(dialog.getWindow().getDecorView());
    }

    /* renamed from: C */
    private AbstractC0213c0 m490C(View view) {
        if (view instanceof AbstractC0213c0) {
            return (AbstractC0213c0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: E */
    private void m491E() {
        if (this.f406y) {
            this.f406y = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f387f;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            m496N(false);
        }
    }

    /* renamed from: F */
    private void m492F(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(C0759f.decor_content_parent);
        this.f387f = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f389h = m490C(view.findViewById(C0759f.action_bar));
        this.f390i = (ActionBarContextView) view.findViewById(C0759f.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(C0759f.action_bar_container);
        this.f388g = actionBarContainer;
        AbstractC0213c0 c0Var = this.f389h;
        if (c0Var == null || this.f390i == null || actionBarContainer == null) {
            throw new IllegalStateException(C0111m.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f384c = c0Var.mo1359q();
        boolean z = (this.f389h.mo1352j() & 4) != 0;
        if (z) {
            this.f395n = true;
        }
        C0784a b = C0784a.m4602b(this.f384c);
        mo422K(b.mo4678a() || z);
        m493I(b.mo4683g());
        TypedArray obtainStyledAttributes = this.f384c.obtainStyledAttributes(null, C0763j.f3706a, C0754a.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(C0763j.f3756k, false)) {
            mo421J(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C0763j.f3746i, 0);
        if (dimensionPixelSize != 0) {
            mo420H((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: I */
    private void m493I(boolean z) {
        this.f401t = z;
        if (!z) {
            this.f389h.mo1356n(null);
            this.f388g.setTabContainer(this.f392k);
        } else {
            this.f388g.setTabContainer(null);
            this.f389h.mo1356n(this.f392k);
        }
        boolean z2 = true;
        boolean z3 = mo418D() == 2;
        C0266p0 p0Var = this.f392k;
        if (p0Var != null) {
            if (z3) {
                p0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f387f;
                if (actionBarOverlayLayout != null) {
                    C1013s.m5760f0(actionBarOverlayLayout);
                }
            } else {
                p0Var.setVisibility(8);
            }
        }
        this.f389h.mo1369w(!this.f401t && z3);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f387f;
        if (this.f401t || !z3) {
            z2 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z2);
    }

    /* renamed from: L */
    private boolean m494L() {
        return C1013s.m5737O(this.f388g);
    }

    /* renamed from: M */
    private void m495M() {
        if (!this.f406y) {
            this.f406y = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f387f;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            m496N(false);
        }
    }

    /* renamed from: N */
    private void m496N(boolean z) {
        if (m497y(this.f404w, this.f405x, this.f406y)) {
            if (!this.f407z) {
                this.f407z = true;
                mo417B(z);
            }
        } else if (this.f407z) {
            this.f407z = false;
            mo416A(z);
        }
    }

    /* renamed from: y */
    static boolean m497y(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return !z && !z2;
    }

    /* renamed from: A */
    public void mo416A(boolean z) {
        View view;
        C0795h hVar = this.f378A;
        if (hVar != null) {
            hVar.mo4724a();
        }
        if (this.f402u != 0 || (!this.f379B && !z)) {
            this.f381D.mo345a(null);
            return;
        }
        this.f388g.setAlpha(1.0f);
        this.f388g.setTransitioning(true);
        C0795h hVar2 = new C0795h();
        float f = (float) (-this.f388g.getHeight());
        if (z) {
            int[] iArr = {0, 0};
            this.f388g.getLocationInWindow(iArr);
            f -= (float) iArr[1];
        }
        C1028w k = C1013s.m5753c(this.f388g).mo5587k(f);
        k.mo5585i(this.f383F);
        hVar2.mo4726c(k);
        if (this.f403v && (view = this.f391j) != null) {
            hVar2.mo4726c(C1013s.m5753c(view).mo5587k(f));
        }
        hVar2.mo4729f(f376a);
        hVar2.mo4728e(250);
        hVar2.mo4730g(this.f381D);
        this.f378A = hVar2;
        hVar2.mo4731h();
    }

    /* renamed from: B */
    public void mo417B(boolean z) {
        View view;
        View view2;
        C0795h hVar = this.f378A;
        if (hVar != null) {
            hVar.mo4724a();
        }
        this.f388g.setVisibility(0);
        if (this.f402u != 0 || (!this.f379B && !z)) {
            this.f388g.setAlpha(1.0f);
            this.f388g.setTranslationY(0.0f);
            if (this.f403v && (view = this.f391j) != null) {
                view.setTranslationY(0.0f);
            }
            this.f382E.mo345a(null);
        } else {
            this.f388g.setTranslationY(0.0f);
            float f = (float) (-this.f388g.getHeight());
            if (z) {
                int[] iArr = {0, 0};
                this.f388g.getLocationInWindow(iArr);
                f -= (float) iArr[1];
            }
            this.f388g.setTranslationY(f);
            C0795h hVar2 = new C0795h();
            C1028w k = C1013s.m5753c(this.f388g).mo5587k(0.0f);
            k.mo5585i(this.f383F);
            hVar2.mo4726c(k);
            if (this.f403v && (view2 = this.f391j) != null) {
                view2.setTranslationY(f);
                hVar2.mo4726c(C1013s.m5753c(this.f391j).mo5587k(0.0f));
            }
            hVar2.mo4729f(f377b);
            hVar2.mo4728e(250);
            hVar2.mo4730g(this.f382E);
            this.f378A = hVar2;
            hVar2.mo4731h();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f387f;
        if (actionBarOverlayLayout != null) {
            C1013s.m5760f0(actionBarOverlayLayout);
        }
    }

    /* renamed from: D */
    public int mo418D() {
        return this.f389h.mo1360r();
    }

    /* renamed from: G */
    public void mo419G(int i, int i2) {
        int j = this.f389h.mo1352j();
        if ((i2 & 4) != 0) {
            this.f395n = true;
        }
        this.f389h.mo1370x((i & i2) | ((i2 ^ -1) & j));
    }

    /* renamed from: H */
    public void mo420H(float f) {
        C1013s.m5780p0(this.f388g, f);
    }

    /* renamed from: J */
    public void mo421J(boolean z) {
        if (!z || this.f387f.mo982w()) {
            this.f380C = z;
            this.f387f.setHideOnContentScrollEnabled(z);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    /* renamed from: K */
    public void mo422K(boolean z) {
        this.f389h.mo1358p(z);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.AbstractC0160d
    /* renamed from: a */
    public void mo423a(boolean z) {
        this.f403v = z;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.AbstractC0160d
    /* renamed from: b */
    public void mo424b() {
        if (this.f405x) {
            this.f405x = false;
            m496N(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.AbstractC0160d
    /* renamed from: c */
    public void mo425c() {
        C0795h hVar = this.f378A;
        if (hVar != null) {
            hVar.mo4724a();
            this.f378A = null;
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.AbstractC0160d
    /* renamed from: d */
    public void mo426d(int i) {
        this.f402u = i;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.AbstractC0160d
    /* renamed from: e */
    public void mo427e() {
        if (!this.f405x) {
            this.f405x = true;
            m496N(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.AbstractC0160d
    /* renamed from: f */
    public void mo428f() {
    }

    @Override // androidx.appcompat.app.AbstractC0064a
    /* renamed from: h */
    public boolean mo193h() {
        AbstractC0213c0 c0Var = this.f389h;
        if (c0Var == null || !c0Var.mo1367u()) {
            return false;
        }
        this.f389h.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0064a
    /* renamed from: i */
    public void mo194i(boolean z) {
        if (z != this.f399r) {
            this.f399r = z;
            int size = this.f400s.size();
            for (int i = 0; i < size; i++) {
                this.f400s.get(i).mo209a(z);
            }
        }
    }

    @Override // androidx.appcompat.app.AbstractC0064a
    /* renamed from: j */
    public int mo195j() {
        return this.f389h.mo1352j();
    }

    @Override // androidx.appcompat.app.AbstractC0064a
    /* renamed from: k */
    public Context mo196k() {
        if (this.f385d == null) {
            TypedValue typedValue = new TypedValue();
            this.f384c.getTheme().resolveAttribute(C0754a.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f385d = new ContextThemeWrapper(this.f384c, i);
            } else {
                this.f385d = this.f384c;
            }
        }
        return this.f385d;
    }

    @Override // androidx.appcompat.app.AbstractC0064a
    /* renamed from: m */
    public void mo198m(Configuration configuration) {
        m493I(C0784a.m4602b(this.f384c).mo4683g());
    }

    @Override // androidx.appcompat.app.AbstractC0064a
    /* renamed from: o */
    public boolean mo200o(int i, KeyEvent keyEvent) {
        Menu e;
        C0115d dVar = this.f396o;
        if (dVar == null || (e = dVar.mo434e()) == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        e.setQwertyMode(z);
        return e.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.AbstractC0064a
    /* renamed from: r */
    public void mo203r(boolean z) {
        if (!this.f395n) {
            mo204s(z);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0064a
    /* renamed from: s */
    public void mo204s(boolean z) {
        mo419G(z ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.AbstractC0064a
    /* renamed from: t */
    public void mo205t(int i) {
        this.f389h.mo1371y(i);
    }

    @Override // androidx.appcompat.app.AbstractC0064a
    /* renamed from: u */
    public void mo206u(boolean z) {
        C0795h hVar;
        this.f379B = z;
        if (!z && (hVar = this.f378A) != null) {
            hVar.mo4724a();
        }
    }

    @Override // androidx.appcompat.app.AbstractC0064a
    /* renamed from: v */
    public void mo207v(CharSequence charSequence) {
        this.f389h.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC0064a
    /* renamed from: w */
    public AbstractC0785b mo208w(AbstractC0785b.AbstractC0786a aVar) {
        C0115d dVar = this.f396o;
        if (dVar != null) {
            dVar.mo432c();
        }
        this.f387f.setHideOnContentScrollEnabled(false);
        this.f390i.mo912k();
        C0115d dVar2 = new C0115d(this.f390i.getContext(), aVar);
        if (!dVar2.mo446t()) {
            return null;
        }
        this.f396o = dVar2;
        dVar2.mo438k();
        this.f390i.mo910h(dVar2);
        mo429x(true);
        this.f390i.sendAccessibilityEvent(32);
        return dVar2;
    }

    /* renamed from: x */
    public void mo429x(boolean z) {
        C1028w wVar;
        C1028w wVar2;
        if (z) {
            m495M();
        } else {
            m491E();
        }
        if (m494L()) {
            if (z) {
                wVar = this.f389h.mo1361s(4, 100);
                wVar2 = this.f390i.mo902f(0, 200);
            } else {
                wVar2 = this.f389h.mo1361s(0, 200);
                wVar = this.f390i.mo902f(8, 100);
            }
            C0795h hVar = new C0795h();
            hVar.mo4727d(wVar, wVar2);
            hVar.mo4731h();
        } else if (z) {
            this.f389h.mo1353k(4);
            this.f390i.setVisibility(0);
        } else {
            this.f389h.mo1353k(0);
            this.f390i.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo430z() {
        AbstractC0785b.AbstractC0786a aVar = this.f398q;
        if (aVar != null) {
            aVar.mo352d(this.f397p);
            this.f397p = null;
            this.f398q = null;
        }
    }
}
