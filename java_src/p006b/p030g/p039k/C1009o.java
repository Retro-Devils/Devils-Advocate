package p006b.p030g.p039k;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: b.g.k.o */
public class C1009o {

    /* renamed from: a */
    private int f4748a;

    /* renamed from: b */
    private int f4749b;

    public C1009o(ViewGroup viewGroup) {
    }

    /* renamed from: a */
    public int mo5548a() {
        return this.f4748a | this.f4749b;
    }

    /* renamed from: b */
    public void mo5549b(View view, View view2, int i) {
        mo5550c(view, view2, i, 0);
    }

    /* renamed from: c */
    public void mo5550c(View view, View view2, int i, int i2) {
        if (i2 == 1) {
            this.f4749b = i;
        } else {
            this.f4748a = i;
        }
    }

    /* renamed from: d */
    public void mo5551d(View view, int i) {
        if (i == 1) {
            this.f4749b = 0;
        } else {
            this.f4748a = 0;
        }
    }
}
