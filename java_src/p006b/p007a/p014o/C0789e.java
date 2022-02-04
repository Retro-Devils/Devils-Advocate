package p006b.p007a.p014o;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.C0130g;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import p006b.p007a.p014o.AbstractC0785b;

/* renamed from: b.a.o.e */
public class C0789e extends AbstractC0785b implements C0130g.AbstractC0131a {

    /* renamed from: d */
    private Context f3940d;

    /* renamed from: e */
    private ActionBarContextView f3941e;

    /* renamed from: f */
    private AbstractC0785b.AbstractC0786a f3942f;

    /* renamed from: g */
    private WeakReference<View> f3943g;

    /* renamed from: h */
    private boolean f3944h;

    /* renamed from: i */
    private boolean f3945i;

    /* renamed from: j */
    private C0130g f3946j;

    public C0789e(Context context, ActionBarContextView actionBarContextView, AbstractC0785b.AbstractC0786a aVar, boolean z) {
        this.f3940d = context;
        this.f3941e = actionBarContextView;
        this.f3942f = aVar;
        C0130g W = new C0130g(actionBarContextView.getContext()).mo631W(1);
        this.f3946j = W;
        W.mo630V(this);
        this.f3945i = z;
    }

    @Override // androidx.appcompat.view.menu.C0130g.AbstractC0131a
    /* renamed from: a */
    public boolean mo320a(C0130g gVar, MenuItem menuItem) {
        return this.f3942f.mo350b(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.C0130g.AbstractC0131a
    /* renamed from: b */
    public void mo322b(C0130g gVar) {
        mo438k();
        this.f3941e.mo913l();
    }

    @Override // p006b.p007a.p014o.AbstractC0785b
    /* renamed from: c */
    public void mo432c() {
        if (!this.f3944h) {
            this.f3944h = true;
            this.f3941e.sendAccessibilityEvent(32);
            this.f3942f.mo352d(this);
        }
    }

    @Override // p006b.p007a.p014o.AbstractC0785b
    /* renamed from: d */
    public View mo433d() {
        WeakReference<View> weakReference = this.f3943g;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // p006b.p007a.p014o.AbstractC0785b
    /* renamed from: e */
    public Menu mo434e() {
        return this.f3946j;
    }

    @Override // p006b.p007a.p014o.AbstractC0785b
    /* renamed from: f */
    public MenuInflater mo435f() {
        return new C0792g(this.f3941e.getContext());
    }

    @Override // p006b.p007a.p014o.AbstractC0785b
    /* renamed from: g */
    public CharSequence mo436g() {
        return this.f3941e.getSubtitle();
    }

    @Override // p006b.p007a.p014o.AbstractC0785b
    /* renamed from: i */
    public CharSequence mo437i() {
        return this.f3941e.getTitle();
    }

    @Override // p006b.p007a.p014o.AbstractC0785b
    /* renamed from: k */
    public void mo438k() {
        this.f3942f.mo349a(this, this.f3946j);
    }

    @Override // p006b.p007a.p014o.AbstractC0785b
    /* renamed from: l */
    public boolean mo439l() {
        return this.f3941e.mo911j();
    }

    @Override // p006b.p007a.p014o.AbstractC0785b
    /* renamed from: m */
    public void mo440m(View view) {
        this.f3941e.setCustomView(view);
        this.f3943g = view != null ? new WeakReference<>(view) : null;
    }

    @Override // p006b.p007a.p014o.AbstractC0785b
    /* renamed from: n */
    public void mo441n(int i) {
        mo442o(this.f3940d.getString(i));
    }

    @Override // p006b.p007a.p014o.AbstractC0785b
    /* renamed from: o */
    public void mo442o(CharSequence charSequence) {
        this.f3941e.setSubtitle(charSequence);
    }

    @Override // p006b.p007a.p014o.AbstractC0785b
    /* renamed from: q */
    public void mo443q(int i) {
        mo444r(this.f3940d.getString(i));
    }

    @Override // p006b.p007a.p014o.AbstractC0785b
    /* renamed from: r */
    public void mo444r(CharSequence charSequence) {
        this.f3941e.setTitle(charSequence);
    }

    @Override // p006b.p007a.p014o.AbstractC0785b
    /* renamed from: s */
    public void mo445s(boolean z) {
        super.mo445s(z);
        this.f3941e.setTitleOptional(z);
    }
}
