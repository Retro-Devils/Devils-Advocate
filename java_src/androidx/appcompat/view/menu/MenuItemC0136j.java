package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;
import p006b.p007a.p014o.AbstractC0787c;
import p006b.p030g.p032e.p033a.AbstractMenuItemC0918b;
import p006b.p030g.p039k.AbstractC0974b;

/* renamed from: androidx.appcompat.view.menu.j */
public class MenuItemC0136j extends AbstractC0120c implements MenuItem {

    /* renamed from: d */
    private final AbstractMenuItemC0918b f599d;

    /* renamed from: e */
    private Method f600e;

    /* renamed from: androidx.appcompat.view.menu.j$a */
    private class C0137a extends AbstractC0974b {

        /* renamed from: d */
        final ActionProvider f601d;

        C0137a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f601d = actionProvider;
        }

        @Override // p006b.p030g.p039k.AbstractC0974b
        /* renamed from: a */
        public boolean mo806a() {
            return this.f601d.hasSubMenu();
        }

        @Override // p006b.p030g.p039k.AbstractC0974b
        /* renamed from: c */
        public View mo807c() {
            return this.f601d.onCreateActionView();
        }

        @Override // p006b.p030g.p039k.AbstractC0974b
        /* renamed from: e */
        public boolean mo808e() {
            return this.f601d.onPerformDefaultAction();
        }

        @Override // p006b.p030g.p039k.AbstractC0974b
        /* renamed from: f */
        public void mo809f(SubMenu subMenu) {
            this.f601d.onPrepareSubMenu(MenuItemC0136j.this.mo561d(subMenu));
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$b */
    private class ActionProvider$VisibilityListenerC0138b extends C0137a implements ActionProvider.VisibilityListener {

        /* renamed from: f */
        private AbstractC0974b.AbstractC0976b f603f;

        ActionProvider$VisibilityListenerC0138b(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // p006b.p030g.p039k.AbstractC0974b
        /* renamed from: b */
        public boolean mo810b() {
            return this.f601d.isVisible();
        }

        @Override // p006b.p030g.p039k.AbstractC0974b
        /* renamed from: d */
        public View mo811d(MenuItem menuItem) {
            return this.f601d.onCreateActionView(menuItem);
        }

        @Override // p006b.p030g.p039k.AbstractC0974b
        /* renamed from: g */
        public boolean mo812g() {
            return this.f601d.overridesItemVisibility();
        }

        @Override // p006b.p030g.p039k.AbstractC0974b
        /* renamed from: j */
        public void mo813j(AbstractC0974b.AbstractC0976b bVar) {
            this.f603f = bVar;
            this.f601d.setVisibilityListener(bVar != null ? this : null);
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            AbstractC0974b.AbstractC0976b bVar = this.f603f;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z);
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$c */
    static class C0139c extends FrameLayout implements AbstractC0787c {

        /* renamed from: b */
        final CollapsibleActionView f605b;

        C0139c(View view) {
            super(view.getContext());
            this.f605b = (CollapsibleActionView) view;
            addView(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public View mo815a() {
            return (View) this.f605b;
        }

        @Override // p006b.p007a.p014o.AbstractC0787c
        /* renamed from: c */
        public void mo816c() {
            this.f605b.onActionViewExpanded();
        }

        @Override // p006b.p007a.p014o.AbstractC0787c
        /* renamed from: f */
        public void mo817f() {
            this.f605b.onActionViewCollapsed();
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$d */
    private class MenuItem$OnActionExpandListenerC0140d implements MenuItem.OnActionExpandListener {

        /* renamed from: a */
        private final MenuItem.OnActionExpandListener f606a;

        MenuItem$OnActionExpandListenerC0140d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f606a = onActionExpandListener;
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f606a.onMenuItemActionCollapse(MenuItemC0136j.this.mo560c(menuItem));
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f606a.onMenuItemActionExpand(MenuItemC0136j.this.mo560c(menuItem));
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$e */
    private class MenuItem$OnMenuItemClickListenerC0141e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a */
        private final MenuItem.OnMenuItemClickListener f608a;

        MenuItem$OnMenuItemClickListenerC0141e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f608a = onMenuItemClickListener;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f608a.onMenuItemClick(MenuItemC0136j.this.mo560c(menuItem));
        }
    }

    public MenuItemC0136j(Context context, AbstractMenuItemC0918b bVar) {
        super(context);
        if (bVar != null) {
            this.f599d = bVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public boolean collapseActionView() {
        return this.f599d.collapseActionView();
    }

    public boolean expandActionView() {
        return this.f599d.expandActionView();
    }

    public ActionProvider getActionProvider() {
        AbstractC0974b b = this.f599d.mo485b();
        if (b instanceof C0137a) {
            return ((C0137a) b).f601d;
        }
        return null;
    }

    public View getActionView() {
        View actionView = this.f599d.getActionView();
        return actionView instanceof C0139c ? ((C0139c) actionView).mo815a() : actionView;
    }

    public int getAlphabeticModifiers() {
        return this.f599d.getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return this.f599d.getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return this.f599d.getContentDescription();
    }

    public int getGroupId() {
        return this.f599d.getGroupId();
    }

    public Drawable getIcon() {
        return this.f599d.getIcon();
    }

    public ColorStateList getIconTintList() {
        return this.f599d.getIconTintList();
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f599d.getIconTintMode();
    }

    public Intent getIntent() {
        return this.f599d.getIntent();
    }

    public int getItemId() {
        return this.f599d.getItemId();
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f599d.getMenuInfo();
    }

    public int getNumericModifiers() {
        return this.f599d.getNumericModifiers();
    }

    public char getNumericShortcut() {
        return this.f599d.getNumericShortcut();
    }

    public int getOrder() {
        return this.f599d.getOrder();
    }

    public SubMenu getSubMenu() {
        return mo561d(this.f599d.getSubMenu());
    }

    public CharSequence getTitle() {
        return this.f599d.getTitle();
    }

    public CharSequence getTitleCondensed() {
        return this.f599d.getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return this.f599d.getTooltipText();
    }

    /* renamed from: h */
    public void mo772h(boolean z) {
        try {
            if (this.f600e == null) {
                this.f600e = this.f599d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f600e.invoke(this.f599d, Boolean.valueOf(z));
        } catch (Exception e) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
        }
    }

    public boolean hasSubMenu() {
        return this.f599d.hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return this.f599d.isActionViewExpanded();
    }

    public boolean isCheckable() {
        return this.f599d.isCheckable();
    }

    public boolean isChecked() {
        return this.f599d.isChecked();
    }

    public boolean isEnabled() {
        return this.f599d.isEnabled();
    }

    public boolean isVisible() {
        return this.f599d.isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        AbstractC0974b bVar = Build.VERSION.SDK_INT >= 16 ? new ActionProvider$VisibilityListenerC0138b(this.f478a, actionProvider) : new C0137a(this.f478a, actionProvider);
        AbstractMenuItemC0918b bVar2 = this.f599d;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.mo484a(bVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i) {
        this.f599d.setActionView(i);
        View actionView = this.f599d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f599d.setActionView(new C0139c(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0139c(view);
        }
        this.f599d.setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f599d.setAlphabeticShortcut(c);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f599d.setAlphabeticShortcut(c, i);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f599d.setCheckable(z);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f599d.setChecked(z);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f599d.setContentDescription(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f599d.setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f599d.setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f599d.setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f599d.setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f599d.setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f599d.setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f599d.setNumericShortcut(c);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        this.f599d.setNumericShortcut(c, i);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f599d.setOnActionExpandListener(onActionExpandListener != null ? new MenuItem$OnActionExpandListenerC0140d(onActionExpandListener) : null);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f599d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new MenuItem$OnMenuItemClickListenerC0141e(onMenuItemClickListener) : null);
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f599d.setShortcut(c, c2);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f599d.setShortcut(c, c2, i, i2);
        return this;
    }

    public void setShowAsAction(int i) {
        this.f599d.setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        this.f599d.setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.f599d.setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f599d.setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f599d.setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f599d.setTooltipText(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        return this.f599d.setVisible(z);
    }
}
