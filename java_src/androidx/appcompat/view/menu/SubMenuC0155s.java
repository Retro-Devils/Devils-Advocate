package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p006b.p030g.p032e.p033a.AbstractSubMenuC0919c;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.view.menu.s */
public class SubMenuC0155s extends MenuC0149o implements SubMenu {

    /* renamed from: e */
    private final AbstractSubMenuC0919c f650e;

    SubMenuC0155s(Context context, AbstractSubMenuC0919c cVar) {
        super(context, cVar);
        this.f650e = cVar;
    }

    public void clearHeader() {
        this.f650e.clearHeader();
    }

    public MenuItem getItem() {
        return mo560c(this.f650e.getItem());
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        this.f650e.setHeaderIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f650e.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        this.f650e.setHeaderTitle(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f650e.setHeaderTitle(charSequence);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        this.f650e.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.f650e.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f650e.setIcon(drawable);
        return this;
    }
}
