package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.AbstractC0614d;
import androidx.lifecycle.AbstractC0617e;
import androidx.lifecycle.AbstractC0619g;
import java.lang.reflect.Field;

final class ImmLeaksCleaner implements AbstractC0617e {

    /* renamed from: a */
    private static int f93a;

    /* renamed from: b */
    private static Field f94b;

    /* renamed from: c */
    private static Field f95c;

    /* renamed from: d */
    private static Field f96d;

    /* renamed from: e */
    private Activity f97e;

    ImmLeaksCleaner(Activity activity) {
        this.f97e = activity;
    }

    /* renamed from: h */
    private static void m159h() {
        try {
            f93a = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            f95c = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            f96d = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f94b = declaredField3;
            declaredField3.setAccessible(true);
            f93a = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // androidx.lifecycle.AbstractC0617e
    /* renamed from: d */
    public void mo148d(AbstractC0619g gVar, AbstractC0614d.EnumC0615a aVar) {
        if (aVar == AbstractC0614d.EnumC0615a.ON_DESTROY) {
            if (f93a == 0) {
                m159h();
            }
            if (f93a == 1) {
                InputMethodManager inputMethodManager = (InputMethodManager) this.f97e.getSystemService("input_method");
                try {
                    Object obj = f94b.get(inputMethodManager);
                    if (obj != null) {
                        synchronized (obj) {
                            try {
                                View view = (View) f95c.get(inputMethodManager);
                                if (view != null) {
                                    if (!view.isAttachedToWindow()) {
                                        try {
                                            f96d.set(inputMethodManager, null);
                                            inputMethodManager.isActive();
                                        } catch (IllegalAccessException unused) {
                                        }
                                    }
                                }
                            } catch (IllegalAccessException unused2) {
                            } catch (ClassCastException unused3) {
                            }
                        }
                    }
                } catch (IllegalAccessException unused4) {
                }
            }
        }
    }
}
