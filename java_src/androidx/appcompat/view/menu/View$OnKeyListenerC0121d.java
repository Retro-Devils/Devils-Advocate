package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.AbstractC0145m;
import androidx.appcompat.widget.AbstractC0243j0;
import androidx.appcompat.widget.C0245k0;
import java.util.ArrayList;
import java.util.List;
import p006b.p007a.C0757d;
import p006b.p007a.C0760g;
import p006b.p030g.p039k.C0997d;
import p006b.p030g.p039k.C1013s;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.view.menu.d */
public final class View$OnKeyListenerC0121d extends AbstractC0142k implements AbstractC0145m, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: c */
    private static final int f481c = C0760g.abc_cascading_menu_item_layout;

    /* renamed from: A */
    ViewTreeObserver f482A;

    /* renamed from: B */
    private PopupWindow.OnDismissListener f483B;

    /* renamed from: C */
    boolean f484C;

    /* renamed from: d */
    private final Context f485d;

    /* renamed from: e */
    private final int f486e;

    /* renamed from: f */
    private final int f487f;

    /* renamed from: g */
    private final int f488g;

    /* renamed from: h */
    private final boolean f489h;

    /* renamed from: i */
    final Handler f490i;

    /* renamed from: j */
    private final List<C0130g> f491j = new ArrayList();

    /* renamed from: k */
    final List<C0126d> f492k = new ArrayList();

    /* renamed from: l */
    final ViewTreeObserver.OnGlobalLayoutListener f493l = new ViewTreeObserver$OnGlobalLayoutListenerC0122a();

    /* renamed from: m */
    private final View.OnAttachStateChangeListener f494m = new View$OnAttachStateChangeListenerC0123b();

    /* renamed from: n */
    private final AbstractC0243j0 f495n = new C0124c();

    /* renamed from: o */
    private int f496o = 0;

    /* renamed from: p */
    private int f497p = 0;

    /* renamed from: q */
    private View f498q;

    /* renamed from: r */
    View f499r;

    /* renamed from: s */
    private int f500s;

    /* renamed from: t */
    private boolean f501t;

    /* renamed from: u */
    private boolean f502u;

    /* renamed from: v */
    private int f503v;

    /* renamed from: w */
    private int f504w;

    /* renamed from: x */
    private boolean f505x;

    /* renamed from: y */
    private boolean f506y;

    /* renamed from: z */
    private AbstractC0145m.AbstractC0146a f507z;

    /* renamed from: androidx.appcompat.view.menu.d$a */
    class ViewTreeObserver$OnGlobalLayoutListenerC0122a implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserver$OnGlobalLayoutListenerC0122a() {
        }

        public void onGlobalLayout() {
            if (View$OnKeyListenerC0121d.this.mo566c() && View$OnKeyListenerC0121d.this.f492k.size() > 0 && !View$OnKeyListenerC0121d.this.f492k.get(0).f515a.mo1507B()) {
                View view = View$OnKeyListenerC0121d.this.f499r;
                if (view == null || !view.isShown()) {
                    View$OnKeyListenerC0121d.this.dismiss();
                    return;
                }
                for (C0126d dVar : View$OnKeyListenerC0121d.this.f492k) {
                    dVar.f515a.mo565a();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$b */
    class View$OnAttachStateChangeListenerC0123b implements View.OnAttachStateChangeListener {
        View$OnAttachStateChangeListenerC0123b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = View$OnKeyListenerC0121d.this.f482A;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    View$OnKeyListenerC0121d.this.f482A = view.getViewTreeObserver();
                }
                View$OnKeyListenerC0121d dVar = View$OnKeyListenerC0121d.this;
                dVar.f482A.removeGlobalOnLayoutListener(dVar.f493l);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$c */
    class C0124c implements AbstractC0243j0 {

        /* renamed from: androidx.appcompat.view.menu.d$c$a */
        class RunnableC0125a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ C0126d f511b;

            /* renamed from: c */
            final /* synthetic */ MenuItem f512c;

            /* renamed from: d */
            final /* synthetic */ C0130g f513d;

            RunnableC0125a(C0126d dVar, MenuItem menuItem, C0130g gVar) {
                this.f511b = dVar;
                this.f512c = menuItem;
                this.f513d = gVar;
            }

            public void run() {
                C0126d dVar = this.f511b;
                if (dVar != null) {
                    View$OnKeyListenerC0121d.this.f484C = true;
                    dVar.f516b.mo654e(false);
                    View$OnKeyListenerC0121d.this.f484C = false;
                }
                if (this.f512c.isEnabled() && this.f512c.hasSubMenu()) {
                    this.f513d.mo623N(this.f512c, 4);
                }
            }
        }

        C0124c() {
        }

        @Override // androidx.appcompat.widget.AbstractC0243j0
        /* renamed from: g */
        public void mo586g(C0130g gVar, MenuItem menuItem) {
            C0126d dVar = null;
            View$OnKeyListenerC0121d.this.f490i.removeCallbacksAndMessages(null);
            int size = View$OnKeyListenerC0121d.this.f492k.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (gVar == View$OnKeyListenerC0121d.this.f492k.get(i).f516b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                int i2 = i + 1;
                if (i2 < View$OnKeyListenerC0121d.this.f492k.size()) {
                    dVar = View$OnKeyListenerC0121d.this.f492k.get(i2);
                }
                View$OnKeyListenerC0121d.this.f490i.postAtTime(new RunnableC0125a(dVar, menuItem, gVar), gVar, SystemClock.uptimeMillis() + 200);
            }
        }

        @Override // androidx.appcompat.widget.AbstractC0243j0
        /* renamed from: i */
        public void mo587i(C0130g gVar, MenuItem menuItem) {
            View$OnKeyListenerC0121d.this.f490i.removeCallbacksAndMessages(gVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.view.menu.d$d */
    public static class C0126d {

        /* renamed from: a */
        public final C0245k0 f515a;

        /* renamed from: b */
        public final C0130g f516b;

        /* renamed from: c */
        public final int f517c;

        public C0126d(C0245k0 k0Var, C0130g gVar, int i) {
            this.f515a = k0Var;
            this.f516b = gVar;
            this.f517c = i;
        }

        /* renamed from: a */
        public ListView mo589a() {
            return this.f515a.mo571l();
        }
    }

    public View$OnKeyListenerC0121d(Context context, View view, int i, int i2, boolean z) {
        this.f485d = context;
        this.f498q = view;
        this.f487f = i;
        this.f488g = i2;
        this.f489h = z;
        this.f505x = false;
        this.f500s = m597G();
        Resources resources = context.getResources();
        this.f486e = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0757d.abc_config_prefDialogWidth));
        this.f490i = new Handler();
    }

    /* renamed from: C */
    private C0245k0 m593C() {
        C0245k0 k0Var = new C0245k0(this.f485d, null, this.f487f, this.f488g);
        k0Var.mo1566T(this.f495n);
        k0Var.mo1516L(this);
        k0Var.mo1515K(this);
        k0Var.mo1508D(this.f498q);
        k0Var.mo1511G(this.f497p);
        k0Var.mo1514J(true);
        k0Var.mo1513I(2);
        return k0Var;
    }

    /* renamed from: D */
    private int m594D(C0130g gVar) {
        int size = this.f492k.size();
        for (int i = 0; i < size; i++) {
            if (gVar == this.f492k.get(i).f516b) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: E */
    private MenuItem m595E(C0130g gVar, C0130g gVar2) {
        int size = gVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = gVar.getItem(i);
            if (item.hasSubMenu() && gVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* renamed from: F */
    private View m596F(C0126d dVar, C0130g gVar) {
        int i;
        C0129f fVar;
        int firstVisiblePosition;
        MenuItem E = m595E(dVar.f516b, gVar);
        if (E == null) {
            return null;
        }
        ListView a = dVar.mo589a();
        ListAdapter adapter = a.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            fVar = (C0129f) headerViewListAdapter.getWrappedAdapter();
        } else {
            fVar = (C0129f) adapter;
            i = 0;
        }
        int count = fVar.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            } else if (E == fVar.getItem(i2)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 != -1 && (firstVisiblePosition = (i2 + i) - a.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a.getChildCount()) {
            return a.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    /* renamed from: G */
    private int m597G() {
        return C1013s.m5797y(this.f498q) == 1 ? 0 : 1;
    }

    /* renamed from: H */
    private int m598H(int i) {
        List<C0126d> list = this.f492k;
        ListView a = list.get(list.size() - 1).mo589a();
        int[] iArr = new int[2];
        a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f499r.getWindowVisibleDisplayFrame(rect);
        return this.f500s == 1 ? (iArr[0] + a.getWidth()) + i > rect.right ? 0 : 1 : iArr[0] - i < 0 ? 1 : 0;
    }

    /* renamed from: I */
    private void m599I(C0130g gVar) {
        View view;
        C0126d dVar;
        int i;
        int i2;
        int i3;
        LayoutInflater from = LayoutInflater.from(this.f485d);
        C0129f fVar = new C0129f(gVar, from, this.f489h, f481c);
        if (!mo566c() && this.f505x) {
            fVar.mo605d(true);
        } else if (mo566c()) {
            fVar.mo605d(AbstractC0142k.m750A(gVar));
        }
        int r = AbstractC0142k.m752r(fVar, null, this.f485d, this.f486e);
        C0245k0 C = m593C();
        C.mo1527o(fVar);
        C.mo1510F(r);
        C.mo1511G(this.f497p);
        if (this.f492k.size() > 0) {
            List<C0126d> list = this.f492k;
            dVar = list.get(list.size() - 1);
            view = m596F(dVar, gVar);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            C.mo1567U(false);
            C.mo1564R(null);
            int H = m598H(r);
            boolean z = H == 1;
            this.f500s = H;
            if (Build.VERSION.SDK_INT >= 26) {
                C.mo1508D(view);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.f498q.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f497p & 7) == 5) {
                    iArr[0] = iArr[0] + this.f498q.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.f497p & 5) != 5) {
                if (z) {
                    r = view.getWidth();
                }
                i3 = i - r;
                C.mo1522d(i3);
                C.mo1517M(true);
                C.mo1526n(i2);
            } else if (!z) {
                r = view.getWidth();
                i3 = i - r;
                C.mo1522d(i3);
                C.mo1517M(true);
                C.mo1526n(i2);
            }
            i3 = i + r;
            C.mo1522d(i3);
            C.mo1517M(true);
            C.mo1526n(i2);
        } else {
            if (this.f501t) {
                C.mo1522d(this.f503v);
            }
            if (this.f502u) {
                C.mo1526n(this.f504w);
            }
            C.mo1512H(mo822q());
        }
        this.f492k.add(new C0126d(C, gVar, this.f500s));
        C.mo565a();
        ListView l = C.mo571l();
        l.setOnKeyListener(this);
        if (dVar == null && this.f506y && gVar.mo686z() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(C0760g.abc_popup_menu_header_item_layout, (ViewGroup) l, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(gVar.mo686z());
            l.addHeaderView(frameLayout, null, false);
            C.mo565a();
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0150p
    /* renamed from: a */
    public void mo565a() {
        if (!mo566c()) {
            for (C0130g gVar : this.f491j) {
                m599I(gVar);
            }
            this.f491j.clear();
            View view = this.f498q;
            this.f499r = view;
            if (view != null) {
                boolean z = this.f482A == null;
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.f482A = viewTreeObserver;
                if (z) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f493l);
                }
                this.f499r.addOnAttachStateChangeListener(this.f494m);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0145m
    /* renamed from: b */
    public void mo544b(C0130g gVar, boolean z) {
        int D = m594D(gVar);
        if (D >= 0) {
            int i = D + 1;
            if (i < this.f492k.size()) {
                this.f492k.get(i).f516b.mo654e(false);
            }
            C0126d remove = this.f492k.remove(D);
            remove.f516b.mo625Q(this);
            if (this.f484C) {
                remove.f515a.mo1565S(null);
                remove.f515a.mo1509E(0);
            }
            remove.f515a.dismiss();
            int size = this.f492k.size();
            this.f500s = size > 0 ? this.f492k.get(size - 1).f517c : m597G();
            if (size == 0) {
                dismiss();
                AbstractC0145m.AbstractC0146a aVar = this.f507z;
                if (aVar != null) {
                    aVar.mo347b(gVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.f482A;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f482A.removeGlobalOnLayoutListener(this.f493l);
                    }
                    this.f482A = null;
                }
                this.f499r.removeOnAttachStateChangeListener(this.f494m);
                this.f483B.onDismiss();
            } else if (z) {
                this.f492k.get(0).f516b.mo654e(false);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0150p
    /* renamed from: c */
    public boolean mo566c() {
        return this.f492k.size() > 0 && this.f492k.get(0).f515a.mo566c();
    }

    @Override // androidx.appcompat.view.menu.AbstractC0150p
    public void dismiss() {
        int size = this.f492k.size();
        if (size > 0) {
            C0126d[] dVarArr = (C0126d[]) this.f492k.toArray(new C0126d[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0126d dVar = dVarArr[i];
                if (dVar.f515a.mo566c()) {
                    dVar.f515a.dismiss();
                }
            }
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
        this.f507z = aVar;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0150p
    /* renamed from: l */
    public ListView mo571l() {
        if (this.f492k.isEmpty()) {
            return null;
        }
        List<C0126d> list = this.f492k;
        return list.get(list.size() - 1).mo589a();
    }

    @Override // androidx.appcompat.view.menu.AbstractC0145m
    /* renamed from: m */
    public boolean mo552m(SubMenuC0154r rVar) {
        for (C0126d dVar : this.f492k) {
            if (rVar == dVar.f516b) {
                dVar.mo589a().requestFocus();
                return true;
            }
        }
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        mo572o(rVar);
        AbstractC0145m.AbstractC0146a aVar = this.f507z;
        if (aVar != null) {
            aVar.mo348c(rVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0145m
    /* renamed from: n */
    public void mo553n(boolean z) {
        for (C0126d dVar : this.f492k) {
            AbstractC0142k.m751B(dVar.mo589a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0142k
    /* renamed from: o */
    public void mo572o(C0130g gVar) {
        gVar.mo647c(this, this.f485d);
        if (mo566c()) {
            m599I(gVar);
        } else {
            this.f491j.add(gVar);
        }
    }

    public void onDismiss() {
        C0126d dVar;
        int size = this.f492k.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                dVar = null;
                break;
            }
            dVar = this.f492k.get(i);
            if (!dVar.f515a.mo566c()) {
                break;
            }
            i++;
        }
        if (dVar != null) {
            dVar.f516b.mo654e(false);
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.view.menu.AbstractC0142k
    /* renamed from: p */
    public boolean mo575p() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0142k
    /* renamed from: s */
    public void mo576s(View view) {
        if (this.f498q != view) {
            this.f498q = view;
            this.f497p = C0997d.m5669b(this.f496o, C1013s.m5797y(view));
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0142k
    /* renamed from: u */
    public void mo577u(boolean z) {
        this.f505x = z;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0142k
    /* renamed from: v */
    public void mo578v(int i) {
        if (this.f496o != i) {
            this.f496o = i;
            this.f497p = C0997d.m5669b(i, C1013s.m5797y(this.f498q));
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0142k
    /* renamed from: w */
    public void mo579w(int i) {
        this.f501t = true;
        this.f503v = i;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0142k
    /* renamed from: x */
    public void mo580x(PopupWindow.OnDismissListener onDismissListener) {
        this.f483B = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0142k
    /* renamed from: y */
    public void mo581y(boolean z) {
        this.f506y = z;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0142k
    /* renamed from: z */
    public void mo582z(int i) {
        this.f502u = true;
        this.f504w = i;
    }
}
