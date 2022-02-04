package p006b.p060q;

import android.view.View;
import android.view.WindowId;

/* renamed from: b.q.l0 */
class C1141l0 implements AbstractC1149m0 {

    /* renamed from: a */
    private final WindowId f5122a;

    C1141l0(View view) {
        this.f5122a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C1141l0) && ((C1141l0) obj).f5122a.equals(this.f5122a);
    }

    public int hashCode() {
        return this.f5122a.hashCode();
    }
}
