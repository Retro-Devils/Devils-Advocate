package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.AbstractC0614d;
import androidx.lifecycle.AbstractC0619g;
import androidx.lifecycle.C0620h;
import androidx.lifecycle.FragmentC0629o;
import p006b.p021d.C0838i;
import p006b.p030g.p039k.C0998e;

/* renamed from: androidx.core.app.e */
public class ActivityC0361e extends Activity implements AbstractC0619g, C0998e.AbstractC0999a {

    /* renamed from: b */
    private C0838i<Class<?>, ?> f1979b = new C0838i<>();

    /* renamed from: c */
    private C0620h f1980c = new C0620h(this);

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C0998e.m5673d(decorView, keyEvent)) {
            return C0998e.m5674e(this, decorView, this, keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C0998e.m5673d(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Override // p006b.p030g.p039k.C0998e.AbstractC0999a
    /* renamed from: h */
    public boolean mo390h(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentC0629o.m3284e(this);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        this.f1980c.mo3669k(AbstractC0614d.EnumC0616b.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
