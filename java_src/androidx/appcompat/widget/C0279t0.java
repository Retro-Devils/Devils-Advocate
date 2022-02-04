package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.widget.t0 */
public class C0279t0 extends ContextWrapper {

    /* renamed from: a */
    private static final Object f1194a = new Object();

    /* renamed from: b */
    private static ArrayList<WeakReference<C0279t0>> f1195b;

    /* renamed from: c */
    private final Resources f1196c;

    /* renamed from: d */
    private final Resources.Theme f1197d;

    private C0279t0(Context context) {
        super(context);
        if (C0202b1.m1060c()) {
            C0202b1 b1Var = new C0202b1(this, context.getResources());
            this.f1196c = b1Var;
            Resources.Theme newTheme = b1Var.newTheme();
            this.f1197d = newTheme;
            newTheme.setTo(context.getTheme());
            return;
        }
        this.f1196c = new C0294v0(this, context.getResources());
        this.f1197d = null;
    }

    /* renamed from: a */
    private static boolean m1380a(Context context) {
        if ((context instanceof C0279t0) || (context.getResources() instanceof C0294v0) || (context.getResources() instanceof C0202b1)) {
            return false;
        }
        return Build.VERSION.SDK_INT < 21 || C0202b1.m1060c();
    }

    /* renamed from: b */
    public static Context m1381b(Context context) {
        if (!m1380a(context)) {
            return context;
        }
        synchronized (f1194a) {
            ArrayList<WeakReference<C0279t0>> arrayList = f1195b;
            if (arrayList == null) {
                f1195b = new ArrayList<>();
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference<C0279t0> weakReference = f1195b.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f1195b.remove(size);
                    }
                }
                for (int size2 = f1195b.size() - 1; size2 >= 0; size2--) {
                    WeakReference<C0279t0> weakReference2 = f1195b.get(size2);
                    C0279t0 t0Var = weakReference2 != null ? weakReference2.get() : null;
                    if (t0Var != null && t0Var.getBaseContext() == context) {
                        return t0Var;
                    }
                }
            }
            C0279t0 t0Var2 = new C0279t0(context);
            f1195b.add(new WeakReference<>(t0Var2));
            return t0Var2;
        }
    }

    public AssetManager getAssets() {
        return this.f1196c.getAssets();
    }

    public Resources getResources() {
        return this.f1196c;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1197d;
        return theme == null ? super.getTheme() : theme;
    }

    public void setTheme(int i) {
        Resources.Theme theme = this.f1197d;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
