package androidx.leanback.widget;

import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.leanback.widget.q */
public abstract class AbstractC0593q {

    /* renamed from: a */
    final List<?> f2970a = new ArrayList(2);

    /* renamed from: b */
    final List<Float> f2971b = new ArrayList(2);

    /* renamed from: c */
    final List<Float> f2972c = new ArrayList(2);

    /* renamed from: d */
    final List<AbstractC0594r> f2973d = new ArrayList(4);

    AbstractC0593q() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract Number mo3598a(AbstractC0583p pVar);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract float mo3599b(AbstractC0583p pVar);

    /* renamed from: c */
    public final void mo3600c(AbstractC0583p pVar) {
        if (this.f2970a.size() >= 2) {
            pVar.mo3542c();
            float f = 0.0f;
            Number number = null;
            boolean z = false;
            for (int i = 0; i < this.f2973d.size(); i++) {
                AbstractC0594r rVar = this.f2973d.get(i);
                if (rVar.mo3602b()) {
                    if (number == null) {
                        number = mo3598a(pVar);
                    }
                    rVar.mo3601a(number);
                } else {
                    if (!z) {
                        f = mo3599b(pVar);
                        z = true;
                    }
                    rVar.mo3603c(f);
                }
            }
        }
    }
}
