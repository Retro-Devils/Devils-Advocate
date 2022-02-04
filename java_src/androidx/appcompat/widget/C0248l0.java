package androidx.appcompat.widget;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0130g;
import androidx.appcompat.view.menu.C0143l;
import p006b.p007a.C0754a;
import p006b.p007a.p014o.C0792g;

/* renamed from: androidx.appcompat.widget.l0 */
public class C0248l0 {

    /* renamed from: a */
    private final Context f1098a;

    /* renamed from: b */
    private final C0130g f1099b;

    /* renamed from: c */
    private final View f1100c;

    /* renamed from: d */
    final C0143l f1101d;

    /* renamed from: e */
    AbstractC0252d f1102e;

    /* renamed from: f */
    AbstractC0251c f1103f;

    /* renamed from: androidx.appcompat.widget.l0$a */
    class C0249a implements C0130g.AbstractC0131a {
        C0249a() {
        }

        @Override // androidx.appcompat.view.menu.C0130g.AbstractC0131a
        /* renamed from: a */
        public boolean mo320a(C0130g gVar, MenuItem menuItem) {
            AbstractC0252d dVar = C0248l0.this.f1102e;
            if (dVar != null) {
                return dVar.onMenuItemClick(menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.C0130g.AbstractC0131a
        /* renamed from: b */
        public void mo322b(C0130g gVar) {
        }
    }

    /* renamed from: androidx.appcompat.widget.l0$b */
    class C0250b implements PopupWindow.OnDismissListener {
        C0250b() {
        }

        public void onDismiss() {
            C0248l0 l0Var = C0248l0.this;
            AbstractC0251c cVar = l0Var.f1103f;
            if (cVar != null) {
                cVar.mo1575a(l0Var);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.l0$c */
    public interface AbstractC0251c {
        /* renamed from: a */
        void mo1575a(C0248l0 l0Var);
    }

    /* renamed from: androidx.appcompat.widget.l0$d */
    public interface AbstractC0252d {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public C0248l0(Context context, View view) {
        this(context, view, 0);
    }

    public C0248l0(Context context, View view, int i) {
        this(context, view, i, C0754a.popupMenuStyle, 0);
    }

    public C0248l0(Context context, View view, int i, int i2, int i3) {
        this.f1098a = context;
        this.f1100c = view;
        C0130g gVar = new C0130g(context);
        this.f1099b = gVar;
        gVar.mo630V(new C0249a());
        C0143l lVar = new C0143l(context, gVar, view, false, i2, i3);
        this.f1101d = lVar;
        lVar.mo830h(i);
        lVar.mo831i(new C0250b());
    }

    /* renamed from: a */
    public Menu mo1570a() {
        return this.f1099b;
    }

    /* renamed from: b */
    public MenuInflater mo1571b() {
        return new C0792g(this.f1098a);
    }

    /* renamed from: c */
    public void mo1572c(AbstractC0252d dVar) {
        this.f1102e = dVar;
    }

    /* renamed from: d */
    public void mo1573d() {
        this.f1101d.mo833k();
    }
}
