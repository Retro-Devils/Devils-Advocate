package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.content.C0378a;
import androidx.core.graphics.drawable.C0398a;
import p006b.p030g.p032e.p033a.AbstractMenuItemC0918b;
import p006b.p030g.p039k.AbstractC0974b;

/* renamed from: androidx.appcompat.view.menu.a */
public class C0118a implements AbstractMenuItemC0918b {

    /* renamed from: a */
    private final int f448a;

    /* renamed from: b */
    private final int f449b;

    /* renamed from: c */
    private final int f450c;

    /* renamed from: d */
    private CharSequence f451d;

    /* renamed from: e */
    private CharSequence f452e;

    /* renamed from: f */
    private Intent f453f;

    /* renamed from: g */
    private char f454g;

    /* renamed from: h */
    private int f455h = 4096;

    /* renamed from: i */
    private char f456i;

    /* renamed from: j */
    private int f457j = 4096;

    /* renamed from: k */
    private Drawable f458k;

    /* renamed from: l */
    private Context f459l;

    /* renamed from: m */
    private MenuItem.OnMenuItemClickListener f460m;

    /* renamed from: n */
    private CharSequence f461n;

    /* renamed from: o */
    private CharSequence f462o;

    /* renamed from: p */
    private ColorStateList f463p = null;

    /* renamed from: q */
    private PorterDuff.Mode f464q = null;

    /* renamed from: r */
    private boolean f465r = false;

    /* renamed from: s */
    private boolean f466s = false;

    /* renamed from: t */
    private int f467t = 16;

    public C0118a(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f459l = context;
        this.f448a = i2;
        this.f449b = i;
        this.f450c = i4;
        this.f451d = charSequence;
    }

    /* renamed from: c */
    private void m565c() {
        Drawable drawable = this.f458k;
        if (drawable == null) {
            return;
        }
        if (this.f465r || this.f466s) {
            Drawable r = C0398a.m1981r(drawable);
            this.f458k = r;
            Drawable mutate = r.mutate();
            this.f458k = mutate;
            if (this.f465r) {
                C0398a.m1978o(mutate, this.f463p);
            }
            if (this.f466s) {
                C0398a.m1979p(this.f458k, this.f464q);
            }
        }
    }

    @Override // p006b.p030g.p032e.p033a.AbstractMenuItemC0918b
    /* renamed from: a */
    public AbstractMenuItemC0918b mo484a(AbstractC0974b bVar) {
        throw new UnsupportedOperationException();
    }

    @Override // p006b.p030g.p032e.p033a.AbstractMenuItemC0918b
    /* renamed from: b */
    public AbstractC0974b mo485b() {
        return null;
    }

    @Override // p006b.p030g.p032e.p033a.AbstractMenuItemC0918b
    public boolean collapseActionView() {
        return false;
    }

    /* renamed from: d */
    public AbstractMenuItemC0918b setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public AbstractMenuItemC0918b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // p006b.p030g.p032e.p033a.AbstractMenuItemC0918b
    public boolean expandActionView() {
        return false;
    }

    /* renamed from: f */
    public AbstractMenuItemC0918b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // p006b.p030g.p032e.p033a.AbstractMenuItemC0918b
    public View getActionView() {
        return null;
    }

    @Override // p006b.p030g.p032e.p033a.AbstractMenuItemC0918b
    public int getAlphabeticModifiers() {
        return this.f457j;
    }

    public char getAlphabeticShortcut() {
        return this.f456i;
    }

    @Override // p006b.p030g.p032e.p033a.AbstractMenuItemC0918b
    public CharSequence getContentDescription() {
        return this.f461n;
    }

    public int getGroupId() {
        return this.f449b;
    }

    public Drawable getIcon() {
        return this.f458k;
    }

    @Override // p006b.p030g.p032e.p033a.AbstractMenuItemC0918b
    public ColorStateList getIconTintList() {
        return this.f463p;
    }

    @Override // p006b.p030g.p032e.p033a.AbstractMenuItemC0918b
    public PorterDuff.Mode getIconTintMode() {
        return this.f464q;
    }

    public Intent getIntent() {
        return this.f453f;
    }

    public int getItemId() {
        return this.f448a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p006b.p030g.p032e.p033a.AbstractMenuItemC0918b
    public int getNumericModifiers() {
        return this.f455h;
    }

    public char getNumericShortcut() {
        return this.f454g;
    }

    public int getOrder() {
        return this.f450c;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f451d;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f452e;
        return charSequence != null ? charSequence : this.f451d;
    }

    @Override // p006b.p030g.p032e.p033a.AbstractMenuItemC0918b
    public CharSequence getTooltipText() {
        return this.f462o;
    }

    public boolean hasSubMenu() {
        return false;
    }

    @Override // p006b.p030g.p032e.p033a.AbstractMenuItemC0918b
    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        return (this.f467t & 1) != 0;
    }

    public boolean isChecked() {
        return (this.f467t & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.f467t & 16) != 0;
    }

    public boolean isVisible() {
        return (this.f467t & 8) == 0;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f456i = Character.toLowerCase(c);
        return this;
    }

    @Override // p006b.p030g.p032e.p033a.AbstractMenuItemC0918b
    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f456i = Character.toLowerCase(c);
        this.f457j = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f467t = (z ? 1 : 0) | (this.f467t & -2);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f467t = (z ? 2 : 0) | (this.f467t & -3);
        return this;
    }

    @Override // p006b.p030g.p032e.p033a.AbstractMenuItemC0918b
    public AbstractMenuItemC0918b setContentDescription(CharSequence charSequence) {
        this.f461n = charSequence;
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f467t = (z ? 16 : 0) | (this.f467t & -17);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f458k = C0378a.m1874d(this.f459l, i);
        m565c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f458k = drawable;
        m565c();
        return this;
    }

    @Override // p006b.p030g.p032e.p033a.AbstractMenuItemC0918b
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f463p = colorStateList;
        this.f465r = true;
        m565c();
        return this;
    }

    @Override // p006b.p030g.p032e.p033a.AbstractMenuItemC0918b
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f464q = mode;
        this.f466s = true;
        m565c();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f453f = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f454g = c;
        return this;
    }

    @Override // p006b.p030g.p032e.p033a.AbstractMenuItemC0918b
    public MenuItem setNumericShortcut(char c, int i) {
        this.f454g = c;
        this.f455h = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f460m = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f454g = c;
        this.f456i = Character.toLowerCase(c2);
        return this;
    }

    @Override // p006b.p030g.p032e.p033a.AbstractMenuItemC0918b
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f454g = c;
        this.f455h = KeyEvent.normalizeMetaState(i);
        this.f456i = Character.toLowerCase(c2);
        this.f457j = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // p006b.p030g.p032e.p033a.AbstractMenuItemC0918b
    public void setShowAsAction(int i) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.f451d = this.f459l.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f451d = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f452e = charSequence;
        return this;
    }

    @Override // p006b.p030g.p032e.p033a.AbstractMenuItemC0918b
    public AbstractMenuItemC0918b setTooltipText(CharSequence charSequence) {
        this.f462o = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.f467t & 8;
        if (z) {
            i = 0;
        }
        this.f467t = i2 | i;
        return this;
    }
}
