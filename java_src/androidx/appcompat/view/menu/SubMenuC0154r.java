package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0130g;

/* renamed from: androidx.appcompat.view.menu.r */
public class SubMenuC0154r extends C0130g implements SubMenu {

    /* renamed from: B */
    private C0130g f648B;

    /* renamed from: C */
    private C0134i f649C;

    public SubMenuC0154r(Context context, C0130g gVar, C0134i iVar) {
        super(context);
        this.f648B = gVar;
        this.f649C = iVar;
    }

    @Override // androidx.appcompat.view.menu.C0130g
    /* renamed from: F */
    public C0130g mo615F() {
        return this.f648B.mo615F();
    }

    @Override // androidx.appcompat.view.menu.C0130g
    /* renamed from: H */
    public boolean mo617H() {
        return this.f648B.mo617H();
    }

    @Override // androidx.appcompat.view.menu.C0130g
    /* renamed from: I */
    public boolean mo618I() {
        return this.f648B.mo618I();
    }

    @Override // androidx.appcompat.view.menu.C0130g
    /* renamed from: J */
    public boolean mo619J() {
        return this.f648B.mo619J();
    }

    @Override // androidx.appcompat.view.menu.C0130g
    /* renamed from: V */
    public void mo630V(C0130g.AbstractC0131a aVar) {
        this.f648B.mo630V(aVar);
    }

    @Override // androidx.appcompat.view.menu.C0130g
    /* renamed from: f */
    public boolean mo656f(C0134i iVar) {
        return this.f648B.mo656f(iVar);
    }

    public MenuItem getItem() {
        return this.f649C;
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.appcompat.view.menu.C0130g
    /* renamed from: h */
    public boolean mo660h(C0130g gVar, MenuItem menuItem) {
        return super.mo660h(gVar, menuItem) || this.f648B.mo660h(gVar, menuItem);
    }

    /* renamed from: i0 */
    public Menu mo867i0() {
        return this.f648B;
    }

    @Override // androidx.appcompat.view.menu.C0130g
    /* renamed from: m */
    public boolean mo664m(C0134i iVar) {
        return this.f648B.mo664m(iVar);
    }

    @Override // androidx.appcompat.view.menu.C0130g
    public void setGroupDividerEnabled(boolean z) {
        this.f648B.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        return (SubMenu) super.mo633Y(i);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.mo634Z(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        return (SubMenu) super.mo646b0(i);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.mo648c0(charSequence);
    }

    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.mo653d0(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.f649C.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f649C.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.C0130g
    public void setQwertyMode(boolean z) {
        this.f648B.setQwertyMode(z);
    }

    @Override // androidx.appcompat.view.menu.C0130g
    /* renamed from: v */
    public String mo682v() {
        C0134i iVar = this.f649C;
        int itemId = iVar != null ? iVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.mo682v() + ":" + itemId;
    }
}
