package p006b.p030g.p032e.p033a;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import android.view.View;
import p006b.p030g.p039k.AbstractC0974b;

/* renamed from: b.g.e.a.b */
public interface AbstractMenuItemC0918b extends MenuItem {
    /* renamed from: a */
    AbstractMenuItemC0918b mo484a(AbstractC0974b bVar);

    /* renamed from: b */
    AbstractC0974b mo485b();

    boolean collapseActionView();

    boolean expandActionView();

    View getActionView();

    int getAlphabeticModifiers();

    CharSequence getContentDescription();

    ColorStateList getIconTintList();

    PorterDuff.Mode getIconTintMode();

    int getNumericModifiers();

    CharSequence getTooltipText();

    boolean isActionViewExpanded();

    @Override // android.view.MenuItem
    MenuItem setActionView(int i);

    @Override // android.view.MenuItem
    MenuItem setActionView(View view);

    MenuItem setAlphabeticShortcut(char c, int i);

    AbstractMenuItemC0918b setContentDescription(CharSequence charSequence);

    MenuItem setIconTintList(ColorStateList colorStateList);

    MenuItem setIconTintMode(PorterDuff.Mode mode);

    MenuItem setNumericShortcut(char c, int i);

    MenuItem setShortcut(char c, char c2, int i, int i2);

    void setShowAsAction(int i);

    MenuItem setShowAsActionFlags(int i);

    AbstractMenuItemC0918b setTooltipText(CharSequence charSequence);
}
