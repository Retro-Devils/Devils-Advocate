package p006b.p060q;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* renamed from: b.q.e0 */
class C1124e0 extends C1118d0 {

    /* renamed from: f */
    private static boolean f5093f = true;

    /* renamed from: g */
    private static boolean f5094g = true;

    C1124e0() {
    }

    @Override // p006b.p060q.C1132i0
    @SuppressLint({"NewApi"})
    /* renamed from: h */
    public void mo5785h(View view, Matrix matrix) {
        if (f5093f) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f5093f = false;
            }
        }
    }

    @Override // p006b.p060q.C1132i0
    @SuppressLint({"NewApi"})
    /* renamed from: i */
    public void mo5786i(View view, Matrix matrix) {
        if (f5094g) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f5094g = false;
            }
        }
    }
}
