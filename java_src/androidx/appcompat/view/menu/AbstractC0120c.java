package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import p006b.p021d.C0838i;
import p006b.p030g.p032e.p033a.AbstractMenuItemC0918b;
import p006b.p030g.p032e.p033a.AbstractSubMenuC0919c;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.view.menu.c */
public abstract class AbstractC0120c {

    /* renamed from: a */
    final Context f478a;

    /* renamed from: b */
    private C0838i<AbstractMenuItemC0918b, MenuItem> f479b;

    /* renamed from: c */
    private C0838i<AbstractSubMenuC0919c, SubMenu> f480c;

    AbstractC0120c(Context context) {
        this.f478a = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final MenuItem mo560c(MenuItem menuItem) {
        if (!(menuItem instanceof AbstractMenuItemC0918b)) {
            return menuItem;
        }
        AbstractMenuItemC0918b bVar = (AbstractMenuItemC0918b) menuItem;
        if (this.f479b == null) {
            this.f479b = new C0838i<>();
        }
        MenuItem menuItem2 = this.f479b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC0136j jVar = new MenuItemC0136j(this.f478a, bVar);
        this.f479b.put(bVar, jVar);
        return jVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final SubMenu mo561d(SubMenu subMenu) {
        if (!(subMenu instanceof AbstractSubMenuC0919c)) {
            return subMenu;
        }
        AbstractSubMenuC0919c cVar = (AbstractSubMenuC0919c) subMenu;
        if (this.f480c == null) {
            this.f480c = new C0838i<>();
        }
        SubMenu subMenu2 = this.f480c.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        SubMenuC0155s sVar = new SubMenuC0155s(this.f478a, cVar);
        this.f480c.put(cVar, sVar);
        return sVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo562e() {
        C0838i<AbstractMenuItemC0918b, MenuItem> iVar = this.f479b;
        if (iVar != null) {
            iVar.clear();
        }
        C0838i<AbstractSubMenuC0919c, SubMenu> iVar2 = this.f480c;
        if (iVar2 != null) {
            iVar2.clear();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo563f(int i) {
        if (this.f479b != null) {
            int i2 = 0;
            while (i2 < this.f479b.size()) {
                if (this.f479b.mo5011i(i2).getGroupId() == i) {
                    this.f479b.mo5014k(i2);
                    i2--;
                }
                i2++;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo564g(int i) {
        if (this.f479b != null) {
            for (int i2 = 0; i2 < this.f479b.size(); i2++) {
                if (this.f479b.mo5011i(i2).getItemId() == i) {
                    this.f479b.mo5014k(i2);
                    return;
                }
            }
        }
    }
}
