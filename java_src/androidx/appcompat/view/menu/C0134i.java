package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.AbstractC0147n;
import androidx.core.graphics.drawable.C0398a;
import p006b.p007a.C0761h;
import p006b.p007a.p008k.p009a.C0764a;
import p006b.p030g.p032e.p033a.AbstractMenuItemC0918b;
import p006b.p030g.p039k.AbstractC0974b;

/* renamed from: androidx.appcompat.view.menu.i */
public final class C0134i implements AbstractMenuItemC0918b {

    /* renamed from: A */
    private View f567A;

    /* renamed from: B */
    private AbstractC0974b f568B;

    /* renamed from: C */
    private MenuItem.OnActionExpandListener f569C;

    /* renamed from: D */
    private boolean f570D = false;

    /* renamed from: E */
    private ContextMenu.ContextMenuInfo f571E;

    /* renamed from: a */
    private final int f572a;

    /* renamed from: b */
    private final int f573b;

    /* renamed from: c */
    private final int f574c;

    /* renamed from: d */
    private final int f575d;

    /* renamed from: e */
    private CharSequence f576e;

    /* renamed from: f */
    private CharSequence f577f;

    /* renamed from: g */
    private Intent f578g;

    /* renamed from: h */
    private char f579h;

    /* renamed from: i */
    private int f580i = 4096;

    /* renamed from: j */
    private char f581j;

    /* renamed from: k */
    private int f582k = 4096;

    /* renamed from: l */
    private Drawable f583l;

    /* renamed from: m */
    private int f584m = 0;

    /* renamed from: n */
    C0130g f585n;

    /* renamed from: o */
    private SubMenuC0154r f586o;

    /* renamed from: p */
    private Runnable f587p;

    /* renamed from: q */
    private MenuItem.OnMenuItemClickListener f588q;

    /* renamed from: r */
    private CharSequence f589r;

    /* renamed from: s */
    private CharSequence f590s;

    /* renamed from: t */
    private ColorStateList f591t = null;

    /* renamed from: u */
    private PorterDuff.Mode f592u = null;

    /* renamed from: v */
    private boolean f593v = false;

    /* renamed from: w */
    private boolean f594w = false;

    /* renamed from: x */
    private boolean f595x = false;

    /* renamed from: y */
    private int f596y = 16;

    /* renamed from: z */
    private int f597z = 0;

    /* renamed from: androidx.appcompat.view.menu.i$a */
    class C0135a implements AbstractC0974b.AbstractC0976b {
        C0135a() {
        }

        @Override // p006b.p030g.p039k.AbstractC0974b.AbstractC0976b
        public void onActionProviderVisibilityChanged(boolean z) {
            C0134i iVar = C0134i.this;
            iVar.f585n.mo621L(iVar);
        }
    }

    C0134i(C0130g gVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f585n = gVar;
        this.f572a = i2;
        this.f573b = i;
        this.f574c = i3;
        this.f575d = i4;
        this.f576e = charSequence;
        this.f597z = i5;
    }

    /* renamed from: d */
    private static void m710d(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    /* renamed from: e */
    private Drawable m711e(Drawable drawable) {
        if (drawable != null && this.f595x && (this.f593v || this.f594w)) {
            drawable = C0398a.m1981r(drawable).mutate();
            if (this.f593v) {
                C0398a.m1978o(drawable, this.f591t);
            }
            if (this.f594w) {
                C0398a.m1979p(drawable, this.f592u);
            }
            this.f595x = false;
        }
        return drawable;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public boolean mo692A() {
        return this.f585n.mo619J() && mo696g() != 0;
    }

    /* renamed from: B */
    public boolean mo693B() {
        return (this.f597z & 4) == 4;
    }

    @Override // p006b.p030g.p032e.p033a.AbstractMenuItemC0918b
    /* renamed from: a */
    public AbstractMenuItemC0918b mo484a(AbstractC0974b bVar) {
        AbstractC0974b bVar2 = this.f568B;
        if (bVar2 != null) {
            bVar2.mo5444h();
        }
        this.f567A = null;
        this.f568B = bVar;
        this.f585n.mo622M(true);
        AbstractC0974b bVar3 = this.f568B;
        if (bVar3 != null) {
            bVar3.mo813j(new C0135a());
        }
        return this;
    }

    @Override // p006b.p030g.p032e.p033a.AbstractMenuItemC0918b
    /* renamed from: b */
    public AbstractC0974b mo485b() {
        return this.f568B;
    }

    /* renamed from: c */
    public void mo694c() {
        this.f585n.mo620K(this);
    }

    @Override // p006b.p030g.p032e.p033a.AbstractMenuItemC0918b
    public boolean collapseActionView() {
        if ((this.f597z & 8) == 0) {
            return false;
        }
        if (this.f567A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f569C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f585n.mo656f(this);
        }
        return false;
    }

    @Override // p006b.p030g.p032e.p033a.AbstractMenuItemC0918b
    public boolean expandActionView() {
        if (!mo716j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f569C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f585n.mo664m(this);
        }
        return false;
    }

    /* renamed from: f */
    public int mo695f() {
        return this.f575d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public char mo696g() {
        return this.f585n.mo618I() ? this.f581j : this.f579h;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // p006b.p030g.p032e.p033a.AbstractMenuItemC0918b
    public View getActionView() {
        View view = this.f567A;
        if (view != null) {
            return view;
        }
        AbstractC0974b bVar = this.f568B;
        if (bVar == null) {
            return null;
        }
        View d = bVar.mo811d(this);
        this.f567A = d;
        return d;
    }

    @Override // p006b.p030g.p032e.p033a.AbstractMenuItemC0918b
    public int getAlphabeticModifiers() {
        return this.f582k;
    }

    public char getAlphabeticShortcut() {
        return this.f581j;
    }

    @Override // p006b.p030g.p032e.p033a.AbstractMenuItemC0918b
    public CharSequence getContentDescription() {
        return this.f589r;
    }

    public int getGroupId() {
        return this.f573b;
    }

    public Drawable getIcon() {
        Drawable drawable = this.f583l;
        if (drawable != null) {
            return m711e(drawable);
        }
        if (this.f584m == 0) {
            return null;
        }
        Drawable d = C0764a.m4517d(this.f585n.mo683w(), this.f584m);
        this.f584m = 0;
        this.f583l = d;
        return m711e(d);
    }

    @Override // p006b.p030g.p032e.p033a.AbstractMenuItemC0918b
    public ColorStateList getIconTintList() {
        return this.f591t;
    }

    @Override // p006b.p030g.p032e.p033a.AbstractMenuItemC0918b
    public PorterDuff.Mode getIconTintMode() {
        return this.f592u;
    }

    public Intent getIntent() {
        return this.f578g;
    }

    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f572a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f571E;
    }

    @Override // p006b.p030g.p032e.p033a.AbstractMenuItemC0918b
    public int getNumericModifiers() {
        return this.f580i;
    }

    public char getNumericShortcut() {
        return this.f579h;
    }

    public int getOrder() {
        return this.f574c;
    }

    public SubMenu getSubMenu() {
        return this.f586o;
    }

    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f576e;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f577f;
        if (charSequence == null) {
            charSequence = this.f576e;
        }
        return (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    @Override // p006b.p030g.p032e.p033a.AbstractMenuItemC0918b
    public CharSequence getTooltipText() {
        return this.f590s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public String mo709h() {
        int i;
        char g = mo696g();
        if (g == 0) {
            return "";
        }
        Resources resources = this.f585n.mo683w().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f585n.mo683w()).hasPermanentMenuKey()) {
            sb.append(resources.getString(C0761h.abc_prepend_shortcut_label));
        }
        int i2 = this.f585n.mo618I() ? this.f582k : this.f580i;
        m710d(sb, i2, 65536, resources.getString(C0761h.abc_menu_meta_shortcut_label));
        m710d(sb, i2, 4096, resources.getString(C0761h.abc_menu_ctrl_shortcut_label));
        m710d(sb, i2, 2, resources.getString(C0761h.abc_menu_alt_shortcut_label));
        m710d(sb, i2, 1, resources.getString(C0761h.abc_menu_shift_shortcut_label));
        m710d(sb, i2, 4, resources.getString(C0761h.abc_menu_sym_shortcut_label));
        m710d(sb, i2, 8, resources.getString(C0761h.abc_menu_function_shortcut_label));
        if (g == '\b') {
            i = C0761h.abc_menu_delete_shortcut_label;
        } else if (g == '\n') {
            i = C0761h.abc_menu_enter_shortcut_label;
        } else if (g != ' ') {
            sb.append(g);
            return sb.toString();
        } else {
            i = C0761h.abc_menu_space_shortcut_label;
        }
        sb.append(resources.getString(i));
        return sb.toString();
    }

    public boolean hasSubMenu() {
        return this.f586o != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public CharSequence mo711i(AbstractC0147n.AbstractC0148a aVar) {
        return (aVar == null || !aVar.mo449d()) ? getTitle() : getTitleCondensed();
    }

    @Override // p006b.p030g.p032e.p033a.AbstractMenuItemC0918b
    public boolean isActionViewExpanded() {
        return this.f570D;
    }

    public boolean isCheckable() {
        return (this.f596y & 1) == 1;
    }

    public boolean isChecked() {
        return (this.f596y & 2) == 2;
    }

    public boolean isEnabled() {
        return (this.f596y & 16) != 0;
    }

    public boolean isVisible() {
        AbstractC0974b bVar = this.f568B;
        return (bVar == null || !bVar.mo812g()) ? (this.f596y & 8) == 0 : (this.f596y & 8) == 0 && this.f568B.mo810b();
    }

    /* renamed from: j */
    public boolean mo716j() {
        AbstractC0974b bVar;
        if ((this.f597z & 8) == 0) {
            return false;
        }
        if (this.f567A == null && (bVar = this.f568B) != null) {
            this.f567A = bVar.mo811d(this);
        }
        return this.f567A != null;
    }

    /* renamed from: k */
    public boolean mo717k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f588q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        C0130g gVar = this.f585n;
        if (gVar.mo660h(gVar, this)) {
            return true;
        }
        Runnable runnable = this.f587p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f578g != null) {
            try {
                this.f585n.mo683w().startActivity(this.f578g);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        AbstractC0974b bVar = this.f568B;
        return bVar != null && bVar.mo808e();
    }

    /* renamed from: l */
    public boolean mo718l() {
        return (this.f596y & 32) == 32;
    }

    /* renamed from: m */
    public boolean mo719m() {
        return (this.f596y & 4) != 0;
    }

    /* renamed from: n */
    public boolean mo720n() {
        return (this.f597z & 1) == 1;
    }

    /* renamed from: o */
    public boolean mo721o() {
        return (this.f597z & 2) == 2;
    }

    /* renamed from: p */
    public AbstractMenuItemC0918b setActionView(int i) {
        Context w = this.f585n.mo683w();
        setActionView(LayoutInflater.from(w).inflate(i, (ViewGroup) new LinearLayout(w), false));
        return this;
    }

    /* renamed from: q */
    public AbstractMenuItemC0918b setActionView(View view) {
        int i;
        this.f567A = view;
        this.f568B = null;
        if (view != null && view.getId() == -1 && (i = this.f572a) > 0) {
            view.setId(i);
        }
        this.f585n.mo620K(this);
        return this;
    }

    /* renamed from: r */
    public void mo724r(boolean z) {
        this.f570D = z;
        this.f585n.mo622M(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo725s(boolean z) {
        int i = this.f596y;
        int i2 = (z ? 2 : 0) | (i & -3);
        this.f596y = i2;
        if (i != i2) {
            this.f585n.mo622M(false);
        }
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f581j == c) {
            return this;
        }
        this.f581j = Character.toLowerCase(c);
        this.f585n.mo622M(false);
        return this;
    }

    @Override // p006b.p030g.p032e.p033a.AbstractMenuItemC0918b
    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f581j == c && this.f582k == i) {
            return this;
        }
        this.f581j = Character.toLowerCase(c);
        this.f582k = KeyEvent.normalizeMetaState(i);
        this.f585n.mo622M(false);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        int i = this.f596y;
        int i2 = (z ? 1 : 0) | (i & -2);
        this.f596y = i2;
        if (i != i2) {
            this.f585n.mo622M(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean z) {
        if ((this.f596y & 4) != 0) {
            this.f585n.mo632X(this);
        } else {
            mo725s(z);
        }
        return this;
    }

    @Override // p006b.p030g.p032e.p033a.AbstractMenuItemC0918b
    public AbstractMenuItemC0918b setContentDescription(CharSequence charSequence) {
        this.f589r = charSequence;
        this.f585n.mo622M(false);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f596y = z ? this.f596y | 16 : this.f596y & -17;
        this.f585n.mo622M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f583l = null;
        this.f584m = i;
        this.f595x = true;
        this.f585n.mo622M(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f584m = 0;
        this.f583l = drawable;
        this.f595x = true;
        this.f585n.mo622M(false);
        return this;
    }

    @Override // p006b.p030g.p032e.p033a.AbstractMenuItemC0918b
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f591t = colorStateList;
        this.f593v = true;
        this.f595x = true;
        this.f585n.mo622M(false);
        return this;
    }

    @Override // p006b.p030g.p032e.p033a.AbstractMenuItemC0918b
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f592u = mode;
        this.f594w = true;
        this.f595x = true;
        this.f585n.mo622M(false);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f578g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        if (this.f579h == c) {
            return this;
        }
        this.f579h = c;
        this.f585n.mo622M(false);
        return this;
    }

    @Override // p006b.p030g.p032e.p033a.AbstractMenuItemC0918b
    public MenuItem setNumericShortcut(char c, int i) {
        if (this.f579h == c && this.f580i == i) {
            return this;
        }
        this.f579h = c;
        this.f580i = KeyEvent.normalizeMetaState(i);
        this.f585n.mo622M(false);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f569C = onActionExpandListener;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f588q = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f579h = c;
        this.f581j = Character.toLowerCase(c2);
        this.f585n.mo622M(false);
        return this;
    }

    @Override // p006b.p030g.p032e.p033a.AbstractMenuItemC0918b
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f579h = c;
        this.f580i = KeyEvent.normalizeMetaState(i);
        this.f581j = Character.toLowerCase(c2);
        this.f582k = KeyEvent.normalizeMetaState(i2);
        this.f585n.mo622M(false);
        return this;
    }

    @Override // p006b.p030g.p032e.p033a.AbstractMenuItemC0918b
    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            this.f597z = i;
            this.f585n.mo620K(this);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        return setTitle(this.f585n.mo683w().getString(i));
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f576e = charSequence;
        this.f585n.mo622M(false);
        SubMenuC0154r rVar = this.f586o;
        if (rVar != null) {
            rVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f577f = charSequence;
        this.f585n.mo622M(false);
        return this;
    }

    @Override // p006b.p030g.p032e.p033a.AbstractMenuItemC0918b
    public AbstractMenuItemC0918b setTooltipText(CharSequence charSequence) {
        this.f590s = charSequence;
        this.f585n.mo622M(false);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        if (mo748y(z)) {
            this.f585n.mo621L(this);
        }
        return this;
    }

    /* renamed from: t */
    public void mo742t(boolean z) {
        this.f596y = (z ? 4 : 0) | (this.f596y & -5);
    }

    public String toString() {
        CharSequence charSequence = this.f576e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* renamed from: u */
    public void mo744u(boolean z) {
        this.f596y = z ? this.f596y | 32 : this.f596y & -33;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo745v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f571E = contextMenuInfo;
    }

    /* renamed from: w */
    public AbstractMenuItemC0918b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    /* renamed from: x */
    public void mo747x(SubMenuC0154r rVar) {
        this.f586o = rVar;
        rVar.setHeaderTitle(getTitle());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public boolean mo748y(boolean z) {
        int i = this.f596y;
        int i2 = (z ? 0 : 8) | (i & -9);
        this.f596y = i2;
        return i != i2;
    }

    /* renamed from: z */
    public boolean mo749z() {
        return this.f585n.mo613C();
    }
}
