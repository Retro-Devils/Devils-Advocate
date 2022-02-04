package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.AbstractC0145m;
import androidx.appcompat.widget.C0245k0;
import p006b.p007a.C0757d;
import p006b.p007a.C0760g;
import p006b.p030g.p039k.C1013s;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.view.menu.q */
public final class View$OnKeyListenerC0151q extends AbstractC0142k implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, AbstractC0145m, View.OnKeyListener {

    /* renamed from: c */
    private static final int f625c = C0760g.abc_popup_menu_item_layout;

    /* renamed from: d */
    private final Context f626d;

    /* renamed from: e */
    private final C0130g f627e;

    /* renamed from: f */
    private final C0129f f628f;

    /* renamed from: g */
    private final boolean f629g;

    /* renamed from: h */
    private final int f630h;

    /* renamed from: i */
    private final int f631i;

    /* renamed from: j */
    private final int f632j;

    /* renamed from: k */
    final C0245k0 f633k;

    /* renamed from: l */
    final ViewTreeObserver.OnGlobalLayoutListener f634l = new ViewTreeObserver$OnGlobalLayoutListenerC0152a();

    /* renamed from: m */
    private final View.OnAttachStateChangeListener f635m = new View$OnAttachStateChangeListenerC0153b();

    /* renamed from: n */
    private PopupWindow.OnDismissListener f636n;

    /* renamed from: o */
    private View f637o;

    /* renamed from: p */
    View f638p;

    /* renamed from: q */
    private AbstractC0145m.AbstractC0146a f639q;

    /* renamed from: r */
    ViewTreeObserver f640r;

    /* renamed from: s */
    private boolean f641s;

    /* renamed from: t */
    private boolean f642t;

    /* renamed from: u */
    private int f643u;

    /* renamed from: v */
    private int f644v = 0;

    /* renamed from: w */
    private boolean f645w;

    /* renamed from: androidx.appcompat.view.menu.q$a */
    class ViewTreeObserver$OnGlobalLayoutListenerC0152a implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserver$OnGlobalLayoutListenerC0152a() {
        }

        public void onGlobalLayout() {
            if (View$OnKeyListenerC0151q.this.mo566c() && !View$OnKeyListenerC0151q.this.f633k.mo1507B()) {
                View view = View$OnKeyListenerC0151q.this.f638p;
                if (view == null || !view.isShown()) {
                    View$OnKeyListenerC0151q.this.dismiss();
                } else {
                    View$OnKeyListenerC0151q.this.f633k.mo565a();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.q$b */
    class View$OnAttachStateChangeListenerC0153b implements View.OnAttachStateChangeListener {
        View$OnAttachStateChangeListenerC0153b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = View$OnKeyListenerC0151q.this.f640r;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    View$OnKeyListenerC0151q.this.f640r = view.getViewTreeObserver();
                }
                View$OnKeyListenerC0151q qVar = View$OnKeyListenerC0151q.this;
                qVar.f640r.removeGlobalOnLayoutListener(qVar.f634l);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public View$OnKeyListenerC0151q(Context context, C0130g gVar, View view, int i, int i2, boolean z) {
        this.f626d = context;
        this.f627e = gVar;
        this.f629g = z;
        this.f628f = new C0129f(gVar, LayoutInflater.from(context), z, f625c);
        this.f631i = i;
        this.f632j = i2;
        Resources resources = context.getResources();
        this.f630h = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0757d.abc_config_prefDialogWidth));
        this.f637o = view;
        this.f633k = new C0245k0(context, null, i, i2);
        gVar.mo647c(this, context);
    }

    /* renamed from: C */
    private boolean m801C() {
        View view;
        if (mo566c()) {
            return true;
        }
        if (this.f641s || (view = this.f637o) == null) {
            return false;
        }
        this.f638p = view;
        this.f633k.mo1515K(this);
        this.f633k.mo1516L(this);
        this.f633k.mo1514J(true);
        View view2 = this.f638p;
        boolean z = this.f640r == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f640r = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f634l);
        }
        view2.addOnAttachStateChangeListener(this.f635m);
        this.f633k.mo1508D(view2);
        this.f633k.mo1511G(this.f644v);
        if (!this.f642t) {
            this.f643u = AbstractC0142k.m752r(this.f628f, null, this.f626d, this.f630h);
            this.f642t = true;
        }
        this.f633k.mo1510F(this.f643u);
        this.f633k.mo1513I(2);
        this.f633k.mo1512H(mo822q());
        this.f633k.mo565a();
        ListView l = this.f633k.mo571l();
        l.setOnKeyListener(this);
        if (this.f645w && this.f627e.mo686z() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f626d).inflate(C0760g.abc_popup_menu_header_item_layout, (ViewGroup) l, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f627e.mo686z());
            }
            frameLayout.setEnabled(false);
            l.addHeaderView(frameLayout, null, false);
        }
        this.f633k.mo1527o(this.f628f);
        this.f633k.mo565a();
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0150p
    /* renamed from: a */
    public void mo565a() {
        if (!m801C()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0145m
    /* renamed from: b */
    public void mo544b(C0130g gVar, boolean z) {
        if (gVar == this.f627e) {
            dismiss();
            AbstractC0145m.AbstractC0146a aVar = this.f639q;
            if (aVar != null) {
                aVar.mo347b(gVar, z);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0150p
    /* renamed from: c */
    public boolean mo566c() {
        return !this.f641s && this.f633k.mo566c();
    }

    @Override // androidx.appcompat.view.menu.AbstractC0150p
    public void dismiss() {
        if (mo566c()) {
            this.f633k.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0145m
    /* renamed from: e */
    public boolean mo568e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0145m
    /* renamed from: f */
    public Parcelable mo569f() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0145m
    /* renamed from: h */
    public void mo570h(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.AbstractC0145m
    /* renamed from: k */
    public void mo550k(AbstractC0145m.AbstractC0146a aVar) {
        this.f639q = aVar;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0150p
    /* renamed from: l */
    public ListView mo571l() {
        return this.f633k.mo571l();
    }

    @Override // androidx.appcompat.view.menu.AbstractC0145m
    /* renamed from: m */
    public boolean mo552m(SubMenuC0154r rVar) {
        if (rVar.hasVisibleItems()) {
            C0143l lVar = new C0143l(this.f626d, rVar, this.f638p, this.f629g, this.f631i, this.f632j);
            lVar.mo832j(this.f639q);
            lVar.mo829g(AbstractC0142k.m750A(rVar));
            lVar.mo831i(this.f636n);
            this.f636n = null;
            this.f627e.mo654e(false);
            int e = this.f633k.mo1523e();
            int h = this.f633k.mo1524h();
            if ((Gravity.getAbsoluteGravity(this.f644v, C1013s.m5797y(this.f637o)) & 7) == 5) {
                e += this.f637o.getWidth();
            }
            if (lVar.mo835n(e, h)) {
                AbstractC0145m.AbstractC0146a aVar = this.f639q;
                if (aVar == null) {
                    return true;
                }
                aVar.mo348c(rVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0145m
    /* renamed from: n */
    public void mo553n(boolean z) {
        this.f642t = false;
        C0129f fVar = this.f628f;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0142k
    /* renamed from: o */
    public void mo572o(C0130g gVar) {
    }

    public void onDismiss() {
        this.f641s = true;
        this.f627e.close();
        ViewTreeObserver viewTreeObserver = this.f640r;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f640r = this.f638p.getViewTreeObserver();
            }
            this.f640r.removeGlobalOnLayoutListener(this.f634l);
            this.f640r = null;
        }
        this.f638p.removeOnAttachStateChangeListener(this.f635m);
        PopupWindow.OnDismissListener onDismissListener = this.f636n;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0142k
    /* renamed from: s */
    public void mo576s(View view) {
        this.f637o = view;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0142k
    /* renamed from: u */
    public void mo577u(boolean z) {
        this.f628f.mo605d(z);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0142k
    /* renamed from: v */
    public void mo578v(int i) {
        this.f644v = i;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0142k
    /* renamed from: w */
    public void mo579w(int i) {
        this.f633k.mo1522d(i);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0142k
    /* renamed from: x */
    public void mo580x(PopupWindow.OnDismissListener onDismissListener) {
        this.f636n = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0142k
    /* renamed from: y */
    public void mo581y(boolean z) {
        this.f645w = z;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0142k
    /* renamed from: z */
    public void mo582z(int i) {
        this.f633k.mo1526n(i);
    }
}
