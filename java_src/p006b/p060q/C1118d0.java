package p006b.p060q;

import android.annotation.SuppressLint;
import android.view.View;

/* renamed from: b.q.d0 */
class C1118d0 extends C1132i0 {

    /* renamed from: e */
    private static boolean f5078e = true;

    C1118d0() {
    }

    @Override // p006b.p060q.C1132i0
    /* renamed from: a */
    public void mo5780a(View view) {
    }

    @Override // p006b.p060q.C1132i0
    @SuppressLint({"NewApi"})
    /* renamed from: c */
    public float mo5781c(View view) {
        if (f5078e) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f5078e = false;
            }
        }
        return view.getAlpha();
    }

    @Override // p006b.p060q.C1132i0
    /* renamed from: d */
    public void mo5782d(View view) {
    }

    @Override // p006b.p060q.C1132i0
    @SuppressLint({"NewApi"})
    /* renamed from: f */
    public void mo5783f(View view, float f) {
        if (f5078e) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                f5078e = false;
            }
        }
        view.setAlpha(f);
    }
}
