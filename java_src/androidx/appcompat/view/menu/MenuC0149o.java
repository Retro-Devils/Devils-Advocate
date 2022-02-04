package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p006b.p030g.p032e.p033a.AbstractMenuC0917a;

/* renamed from: androidx.appcompat.view.menu.o */
public class MenuC0149o extends AbstractC0120c implements Menu {

    /* renamed from: d */
    private final AbstractMenuC0917a f624d;

    public MenuC0149o(Context context, AbstractMenuC0917a aVar) {
        super(context);
        if (aVar != null) {
            this.f624d = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return mo560c(this.f624d.add(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo560c(this.f624d.add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo560c(this.f624d.add(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return mo560c(this.f624d.add(charSequence));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.f624d.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = mo560c(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return mo561d(this.f624d.addSubMenu(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return mo561d(this.f624d.addSubMenu(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return mo561d(this.f624d.addSubMenu(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return mo561d(this.f624d.addSubMenu(charSequence));
    }

    public void clear() {
        mo562e();
        this.f624d.clear();
    }

    public void close() {
        this.f624d.close();
    }

    public MenuItem findItem(int i) {
        return mo560c(this.f624d.findItem(i));
    }

    public MenuItem getItem(int i) {
        return mo560c(this.f624d.getItem(i));
    }

    public boolean hasVisibleItems() {
        return this.f624d.hasVisibleItems();
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f624d.isShortcutKey(i, keyEvent);
    }

    public boolean performIdentifierAction(int i, int i2) {
        return this.f624d.performIdentifierAction(i, i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f624d.performShortcut(i, keyEvent, i2);
    }

    public void removeGroup(int i) {
        mo563f(i);
        this.f624d.removeGroup(i);
    }

    public void removeItem(int i) {
        mo564g(i);
        this.f624d.removeItem(i);
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f624d.setGroupCheckable(i, z, z2);
    }

    public void setGroupEnabled(int i, boolean z) {
        this.f624d.setGroupEnabled(i, z);
    }

    public void setGroupVisible(int i, boolean z) {
        this.f624d.setGroupVisible(i, z);
    }

    public void setQwertyMode(boolean z) {
        this.f624d.setQwertyMode(z);
    }

    public int size() {
        return this.f624d.size();
    }
}
