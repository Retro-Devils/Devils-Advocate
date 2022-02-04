package p006b.p060q;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: b.q.h0 */
class C1130h0 extends C1128g0 {
    C1130h0() {
    }

    @Override // p006b.p060q.C1118d0, p006b.p060q.C1132i0
    /* renamed from: c */
    public float mo5781c(View view) {
        return view.getTransitionAlpha();
    }

    @Override // p006b.p060q.C1126f0, p006b.p060q.C1132i0
    /* renamed from: e */
    public void mo5787e(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // p006b.p060q.C1118d0, p006b.p060q.C1132i0
    /* renamed from: f */
    public void mo5783f(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // p006b.p060q.C1128g0, p006b.p060q.C1132i0
    /* renamed from: g */
    public void mo5789g(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // p006b.p060q.C1124e0, p006b.p060q.C1132i0
    /* renamed from: h */
    public void mo5785h(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // p006b.p060q.C1124e0, p006b.p060q.C1132i0
    /* renamed from: i */
    public void mo5786i(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
