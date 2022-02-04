package p006b.p060q;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import p006b.p030g.p039k.C1013s;

/* renamed from: b.q.d */
public class C1115d extends AbstractC1134j0 {

    /* access modifiers changed from: package-private */
    /* renamed from: b.q.d$a */
    public class C1116a extends C1150n {

        /* renamed from: a */
        final /* synthetic */ View f5074a;

        C1116a(View view) {
            this.f5074a = view;
        }

        @Override // p006b.p060q.AbstractC1142m.AbstractC1148f
        /* renamed from: e */
        public void mo5765e(AbstractC1142m mVar) {
            C1112c0.m6173g(this.f5074a, 1.0f);
            C1112c0.m6167a(this.f5074a);
            mVar.mo5816P(this);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b.q.d$b */
    public static class C1117b extends AnimatorListenerAdapter {

        /* renamed from: a */
        private final View f5076a;

        /* renamed from: b */
        private boolean f5077b = false;

        C1117b(View view) {
            this.f5076a = view;
        }

        public void onAnimationEnd(Animator animator) {
            C1112c0.m6173g(this.f5076a, 1.0f);
            if (this.f5077b) {
                this.f5076a.setLayerType(0, null);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (C1013s.m5733K(this.f5076a) && this.f5076a.getLayerType() == 0) {
                this.f5077b = true;
                this.f5076a.setLayerType(2, null);
            }
        }
    }

    public C1115d(int i) {
        mo5797i0(i);
    }

    /* renamed from: j0 */
    private Animator m6181j0(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        C1112c0.m6173g(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, C1112c0.f5072b, f2);
        ofFloat.addListener(new C1117b(view));
        mo5826a(new C1116a(view));
        return ofFloat;
    }

    /* renamed from: k0 */
    private static float m6182k0(C1159s sVar, float f) {
        Float f2;
        return (sVar == null || (f2 = (Float) sVar.f5192a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    @Override // p006b.p060q.AbstractC1134j0
    /* renamed from: e0 */
    public Animator mo5776e0(ViewGroup viewGroup, View view, C1159s sVar, C1159s sVar2) {
        float f = 0.0f;
        float k0 = m6182k0(sVar, 0.0f);
        if (k0 != 1.0f) {
            f = k0;
        }
        return m6181j0(view, f, 1.0f);
    }

    @Override // p006b.p060q.AbstractC1134j0
    /* renamed from: g0 */
    public Animator mo5777g0(ViewGroup viewGroup, View view, C1159s sVar, C1159s sVar2) {
        C1112c0.m6171e(view);
        return m6181j0(view, m6182k0(sVar, 1.0f), 0.0f);
    }

    @Override // p006b.p060q.AbstractC1134j0, p006b.p060q.AbstractC1142m
    /* renamed from: j */
    public void mo5733j(C1159s sVar) {
        super.mo5733j(sVar);
        sVar.f5192a.put("android:fade:transitionAlpha", Float.valueOf(C1112c0.m6169c(sVar.f5193b)));
    }
}
