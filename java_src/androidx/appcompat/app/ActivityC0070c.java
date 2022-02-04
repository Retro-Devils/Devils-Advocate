package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.C0202b1;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.C0348a;
import androidx.core.app.C0362f;
import androidx.core.app.C0374m;
import androidx.fragment.app.ActivityC0447d;
import p006b.p007a.p014o.AbstractC0785b;

/* renamed from: androidx.appcompat.app.c */
public class ActivityC0070c extends ActivityC0447d implements AbstractC0071d, C0374m.AbstractC0375a {

    /* renamed from: s */
    private AbstractC0072e f227s;

    /* renamed from: t */
    private Resources f228t;

    /* renamed from: R0 */
    private boolean m250R0(KeyEvent keyEvent) {
        Window window;
        return Build.VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode()) && (window = getWindow()) != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // androidx.fragment.app.ActivityC0447d
    /* renamed from: J0 */
    public void mo241J0() {
        mo242K0().mo295o();
    }

    /* renamed from: K0 */
    public AbstractC0072e mo242K0() {
        if (this.f227s == null) {
            this.f227s = AbstractC0072e.m271g(this, this);
        }
        return this.f227s;
    }

    /* renamed from: L0 */
    public AbstractC0064a mo243L0() {
        return mo242K0().mo293m();
    }

    /* renamed from: M0 */
    public void mo244M0(C0374m mVar) {
        mVar.mo2207b(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: N0 */
    public void mo245N0(int i) {
    }

    /* renamed from: O0 */
    public void mo246O0(C0374m mVar) {
    }

    @Deprecated
    /* renamed from: P0 */
    public void mo247P0() {
    }

    /* renamed from: Q0 */
    public boolean mo248Q0() {
        Intent k = mo261k();
        if (k == null) {
            return false;
        }
        if (mo252U0(k)) {
            C0374m d = C0374m.m1855d(this);
            mo244M0(d);
            mo246O0(d);
            d.mo2209e();
            try {
                C0348a.m1776h(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        } else {
            mo251T0(k);
            return true;
        }
    }

    @Override // androidx.appcompat.app.AbstractC0071d
    /* renamed from: S */
    public void mo249S(AbstractC0785b bVar) {
    }

    /* renamed from: S0 */
    public void mo250S0(Toolbar toolbar) {
        mo242K0().mo284E(toolbar);
    }

    /* renamed from: T0 */
    public void mo251T0(Intent intent) {
        C0362f.m1803e(this, intent);
    }

    /* renamed from: U0 */
    public boolean mo252U0(Intent intent) {
        return C0362f.m1804f(this, intent);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo242K0().mo287d(view, layoutParams);
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(mo242K0().mo289f(context));
    }

    public void closeOptionsMenu() {
        AbstractC0064a L0 = mo243L0();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (L0 == null || !L0.mo192g()) {
            super.closeOptionsMenu();
        }
    }

    @Override // androidx.core.app.ActivityC0361e
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC0064a L0 = mo243L0();
        if (keyCode != 82 || L0 == null || !L0.mo201p(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        return (T) mo242K0().mo290i(i);
    }

    public MenuInflater getMenuInflater() {
        return mo242K0().mo292l();
    }

    public Resources getResources() {
        if (this.f228t == null && C0202b1.m1060c()) {
            this.f228t = new C0202b1(this, super.getResources());
        }
        Resources resources = this.f228t;
        return resources == null ? super.getResources() : resources;
    }

    public void invalidateOptionsMenu() {
        mo242K0().mo295o();
    }

    @Override // androidx.core.app.C0374m.AbstractC0375a
    /* renamed from: k */
    public Intent mo261k() {
        return C0362f.m1799a(this);
    }

    @Override // androidx.appcompat.app.AbstractC0071d
    /* renamed from: l0 */
    public void mo262l0(AbstractC0785b bVar) {
    }

    @Override // androidx.fragment.app.ActivityC0447d
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f228t != null) {
            this.f228t.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        mo242K0().mo296p(configuration);
    }

    public void onContentChanged() {
        mo247P0();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0447d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0361e
    public void onCreate(Bundle bundle) {
        AbstractC0072e K0 = mo242K0();
        K0.mo294n();
        K0.mo297q(bundle);
        super.onCreate(bundle);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0447d
    public void onDestroy() {
        super.onDestroy();
        mo242K0().mo298r();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (m250R0(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // androidx.fragment.app.ActivityC0447d
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        AbstractC0064a L0 = mo243L0();
        if (menuItem.getItemId() != 16908332 || L0 == null || (L0.mo195j() & 4) == 0) {
            return false;
        }
        return mo248Q0();
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // androidx.fragment.app.ActivityC0447d
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        mo242K0().mo299s(bundle);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0447d
    public void onPostResume() {
        super.onPostResume();
        mo242K0().mo300t();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0447d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0361e
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        mo242K0().mo301u(bundle);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0447d
    public void onStart() {
        super.onStart();
        mo242K0().mo302v();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0447d
    public void onStop() {
        super.onStop();
        mo242K0().mo303w();
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        mo242K0().mo286G(charSequence);
    }

    public void openOptionsMenu() {
        AbstractC0064a L0 = mo243L0();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (L0 == null || !L0.mo202q()) {
            super.openOptionsMenu();
        }
    }

    @Override // androidx.appcompat.app.AbstractC0071d
    /* renamed from: p0 */
    public AbstractC0785b mo276p0(AbstractC0785b.AbstractC0786a aVar) {
        return null;
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        mo242K0().mo281B(i);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        mo242K0().mo282C(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo242K0().mo283D(view, layoutParams);
    }

    @Override // android.view.ContextThemeWrapper, android.app.Activity
    public void setTheme(int i) {
        super.setTheme(i);
        mo242K0().mo285F(i);
    }
}
