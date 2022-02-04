package p006b.p030g.p039k;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: b.g.k.e */
public class C0998e {

    /* renamed from: a */
    private static boolean f4741a = false;

    /* renamed from: b */
    private static Method f4742b = null;

    /* renamed from: c */
    private static boolean f4743c = false;

    /* renamed from: d */
    private static Field f4744d;

    /* renamed from: b.g.k.e$a */
    public interface AbstractC0999a {
        /* renamed from: h */
        boolean mo390h(KeyEvent keyEvent);
    }

    /* renamed from: a */
    private static boolean m5670a(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f4741a) {
            try {
                f4742b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
            } catch (NoSuchMethodException unused) {
            }
            f4741a = true;
        }
        Method method = f4742b;
        if (method != null) {
            try {
                return ((Boolean) method.invoke(actionBar, keyEvent)).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m5671b(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && m5670a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C1013s.m5763h(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
    }

    /* renamed from: c */
    private static boolean m5672c(Dialog dialog, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener f = m5675f(dialog);
        if (f != null && f.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (C1013s.m5763h(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
    }

    /* renamed from: d */
    public static boolean m5673d(View view, KeyEvent keyEvent) {
        return C1013s.m5765i(view, keyEvent);
    }

    /* renamed from: e */
    public static boolean m5674e(AbstractC0999a aVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        if (aVar == null) {
            return false;
        }
        return Build.VERSION.SDK_INT >= 28 ? aVar.mo390h(keyEvent) : callback instanceof Activity ? m5671b((Activity) callback, keyEvent) : callback instanceof Dialog ? m5672c((Dialog) callback, keyEvent) : (view != null && C1013s.m5763h(view, keyEvent)) || aVar.mo390h(keyEvent);
    }

    /* renamed from: f */
    private static DialogInterface.OnKeyListener m5675f(Dialog dialog) {
        if (!f4743c) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f4744d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f4743c = true;
        }
        Field field = f4744d;
        if (field == null) {
            return null;
        }
        try {
            return (DialogInterface.OnKeyListener) field.get(dialog);
        } catch (IllegalAccessException unused2) {
            return null;
        }
    }
}
