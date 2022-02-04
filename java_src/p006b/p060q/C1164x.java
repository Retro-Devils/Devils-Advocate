package p006b.p060q;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;

/* access modifiers changed from: package-private */
/* renamed from: b.q.x */
public class C1164x {

    /* renamed from: a */
    private static boolean f5193a = true;

    /* renamed from: a */
    static AbstractC1163w m6383a(ViewGroup viewGroup) {
        return Build.VERSION.SDK_INT >= 18 ? new C1162v(viewGroup) : C1161u.m6374g(viewGroup);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    private static void m6384b(ViewGroup viewGroup, boolean z) {
        if (f5193a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                f5193a = false;
            }
        }
    }

    /* renamed from: c */
    static void m6385c(ViewGroup viewGroup, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            viewGroup.suppressLayout(z);
        } else if (i >= 18) {
            m6384b(viewGroup, z);
        } else {
            C1165y.m6387b(viewGroup, z);
        }
    }
}
