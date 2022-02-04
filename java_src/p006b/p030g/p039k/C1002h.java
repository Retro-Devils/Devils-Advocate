package p006b.p030g.p039k;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import p006b.p030g.p032e.p033a.AbstractMenuItemC0918b;

/* renamed from: b.g.k.h */
public final class C1002h {
    /* renamed from: a */
    public static MenuItem m5682a(MenuItem menuItem, AbstractC0974b bVar) {
        if (menuItem instanceof AbstractMenuItemC0918b) {
            return ((AbstractMenuItemC0918b) menuItem).mo484a(bVar);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    /* renamed from: b */
    public static void m5683b(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof AbstractMenuItemC0918b) {
            ((AbstractMenuItemC0918b) menuItem).setAlphabeticShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setAlphabeticShortcut(c, i);
        }
    }

    /* renamed from: c */
    public static void m5684c(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof AbstractMenuItemC0918b) {
            ((AbstractMenuItemC0918b) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setContentDescription(charSequence);
        }
    }

    /* renamed from: d */
    public static void m5685d(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof AbstractMenuItemC0918b) {
            ((AbstractMenuItemC0918b) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setIconTintList(colorStateList);
        }
    }

    /* renamed from: e */
    public static void m5686e(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof AbstractMenuItemC0918b) {
            ((AbstractMenuItemC0918b) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setIconTintMode(mode);
        }
    }

    /* renamed from: f */
    public static void m5687f(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof AbstractMenuItemC0918b) {
            ((AbstractMenuItemC0918b) menuItem).setNumericShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setNumericShortcut(c, i);
        }
    }

    /* renamed from: g */
    public static void m5688g(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof AbstractMenuItemC0918b) {
            ((AbstractMenuItemC0918b) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            menuItem.setTooltipText(charSequence);
        }
    }
}
