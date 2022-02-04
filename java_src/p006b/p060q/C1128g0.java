package p006b.p060q;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* renamed from: b.q.g0 */
class C1128g0 extends C1126f0 {

    /* renamed from: i */
    private static boolean f5096i = true;

    C1128g0() {
    }

    @Override // p006b.p060q.C1132i0
    @SuppressLint({"NewApi"})
    /* renamed from: g */
    public void mo5789g(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo5789g(view, i);
        } else if (f5096i) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                f5096i = false;
            }
        }
    }
}
