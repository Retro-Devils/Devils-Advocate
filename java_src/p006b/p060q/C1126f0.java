package p006b.p060q;

import android.annotation.SuppressLint;
import android.view.View;

/* renamed from: b.q.f0 */
class C1126f0 extends C1124e0 {

    /* renamed from: h */
    private static boolean f5088h = true;

    C1126f0() {
    }

    @Override // p006b.p060q.C1132i0
    @SuppressLint({"NewApi"})
    /* renamed from: e */
    public void mo5787e(View view, int i, int i2, int i3, int i4) {
        if (f5088h) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f5088h = false;
            }
        }
    }
}
