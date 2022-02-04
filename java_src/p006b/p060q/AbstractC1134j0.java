package p006b.p060q;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import p006b.p060q.AbstractC1142m;
import p006b.p060q.C1095a;

/* renamed from: b.q.j0 */
public abstract class AbstractC1134j0 extends AbstractC1142m {

    /* renamed from: L */
    private static final String[] f5107L = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: M */
    private int f5108M = 3;

    /* access modifiers changed from: package-private */
    /* renamed from: b.q.j0$a */
    public class C1135a extends C1150n {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f5109a;

        /* renamed from: b */
        final /* synthetic */ View f5110b;

        /* renamed from: c */
        final /* synthetic */ View f5111c;

        C1135a(ViewGroup viewGroup, View view, View view2) {
            this.f5109a = viewGroup;
            this.f5110b = view;
            this.f5111c = view2;
        }

        @Override // p006b.p060q.AbstractC1142m.AbstractC1148f, p006b.p060q.C1150n
        /* renamed from: a */
        public void mo5762a(AbstractC1142m mVar) {
            C1164x.m6383a(this.f5109a).mo5870c(this.f5110b);
        }

        @Override // p006b.p060q.AbstractC1142m.AbstractC1148f, p006b.p060q.C1150n
        /* renamed from: b */
        public void mo5763b(AbstractC1142m mVar) {
            if (this.f5110b.getParent() == null) {
                C1164x.m6383a(this.f5109a).mo5869a(this.f5110b);
            } else {
                AbstractC1134j0.this.mo5832f();
            }
        }

        @Override // p006b.p060q.AbstractC1142m.AbstractC1148f
        /* renamed from: e */
        public void mo5765e(AbstractC1142m mVar) {
            this.f5111c.setTag(C1133j.save_overlay_view, null);
            C1164x.m6383a(this.f5109a).mo5870c(this.f5110b);
            mVar.mo5816P(this);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b.q.j0$b */
    public static class C1136b extends AnimatorListenerAdapter implements AbstractC1142m.AbstractC1148f, C1095a.AbstractC1096a {

        /* renamed from: a */
        private final View f5113a;

        /* renamed from: b */
        private final int f5114b;

        /* renamed from: c */
        private final ViewGroup f5115c;

        /* renamed from: d */
        private final boolean f5116d;

        /* renamed from: e */
        private boolean f5117e;

        /* renamed from: f */
        boolean f5118f = false;

        C1136b(View view, int i, boolean z) {
            this.f5113a = view;
            this.f5114b = i;
            this.f5115c = (ViewGroup) view.getParent();
            this.f5116d = z;
            m6255g(true);
        }

        /* renamed from: f */
        private void m6254f() {
            if (!this.f5118f) {
                C1112c0.m6174h(this.f5113a, this.f5114b);
                ViewGroup viewGroup = this.f5115c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m6255g(false);
        }

        /* renamed from: g */
        private void m6255g(boolean z) {
            ViewGroup viewGroup;
            if (this.f5116d && this.f5117e != z && (viewGroup = this.f5115c) != null) {
                this.f5117e = z;
                C1164x.m6385c(viewGroup, z);
            }
        }

        @Override // p006b.p060q.AbstractC1142m.AbstractC1148f
        /* renamed from: a */
        public void mo5762a(AbstractC1142m mVar) {
            m6255g(false);
        }

        @Override // p006b.p060q.AbstractC1142m.AbstractC1148f
        /* renamed from: b */
        public void mo5763b(AbstractC1142m mVar) {
            m6255g(true);
        }

        @Override // p006b.p060q.AbstractC1142m.AbstractC1148f
        /* renamed from: c */
        public void mo5784c(AbstractC1142m mVar) {
        }

        @Override // p006b.p060q.AbstractC1142m.AbstractC1148f
        /* renamed from: d */
        public void mo5764d(AbstractC1142m mVar) {
        }

        @Override // p006b.p060q.AbstractC1142m.AbstractC1148f
        /* renamed from: e */
        public void mo5765e(AbstractC1142m mVar) {
            m6254f();
            mVar.mo5816P(this);
        }

        public void onAnimationCancel(Animator animator) {
            this.f5118f = true;
        }

        public void onAnimationEnd(Animator animator) {
            m6254f();
        }

        @Override // p006b.p060q.C1095a.AbstractC1096a
        public void onAnimationPause(Animator animator) {
            if (!this.f5118f) {
                C1112c0.m6174h(this.f5113a, this.f5114b);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        @Override // p006b.p060q.C1095a.AbstractC1096a
        public void onAnimationResume(Animator animator) {
            if (!this.f5118f) {
                C1112c0.m6174h(this.f5113a, 0);
            }
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b.q.j0$c */
    public static class C1137c {

        /* renamed from: a */
        boolean f5119a;

        /* renamed from: b */
        boolean f5120b;

        /* renamed from: c */
        int f5121c;

        /* renamed from: d */
        int f5122d;

        /* renamed from: e */
        ViewGroup f5123e;

        /* renamed from: f */
        ViewGroup f5124f;

        C1137c() {
        }
    }

    /* renamed from: c0 */
    private void m6239c0(C1159s sVar) {
        sVar.f5192a.put("android:visibility:visibility", Integer.valueOf(sVar.f5193b.getVisibility()));
        sVar.f5192a.put("android:visibility:parent", sVar.f5193b.getParent());
        int[] iArr = new int[2];
        sVar.f5193b.getLocationOnScreen(iArr);
        sVar.f5192a.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0075, code lost:
        if (r9 == 0) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007f, code lost:
        if (r0.f5123e == null) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0091, code lost:
        if (r0.f5121c == 0) goto L_0x0093;
     */
    /* renamed from: d0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p006b.p060q.AbstractC1134j0.C1137c m6240d0(p006b.p060q.C1159s r8, p006b.p060q.C1159s r9) {
        /*
        // Method dump skipped, instructions count: 151
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p060q.AbstractC1134j0.m6240d0(b.q.s, b.q.s):b.q.j0$c");
    }

    @Override // p006b.p060q.AbstractC1142m
    /* renamed from: D */
    public String[] mo5731D() {
        return f5107L;
    }

    @Override // p006b.p060q.AbstractC1142m
    /* renamed from: F */
    public boolean mo5794F(C1159s sVar, C1159s sVar2) {
        if (sVar == null && sVar2 == null) {
            return false;
        }
        if (sVar != null && sVar2 != null && sVar2.f5192a.containsKey("android:visibility:visibility") != sVar.f5192a.containsKey("android:visibility:visibility")) {
            return false;
        }
        C1137c d0 = m6240d0(sVar, sVar2);
        if (d0.f5119a) {
            return d0.f5121c == 0 || d0.f5122d == 0;
        }
        return false;
    }

    /* renamed from: e0 */
    public abstract Animator mo5776e0(ViewGroup viewGroup, View view, C1159s sVar, C1159s sVar2);

    /* renamed from: f0 */
    public Animator mo5795f0(ViewGroup viewGroup, C1159s sVar, int i, C1159s sVar2, int i2) {
        if ((this.f5108M & 1) != 1 || sVar2 == null) {
            return null;
        }
        if (sVar == null) {
            View view = (View) sVar2.f5193b.getParent();
            if (m6240d0(mo5842t(view, false), mo5812E(view, false)).f5119a) {
                return null;
            }
        }
        return mo5776e0(viewGroup, sVar2.f5193b, sVar, sVar2);
    }

    @Override // p006b.p060q.AbstractC1142m
    /* renamed from: g */
    public void mo5732g(C1159s sVar) {
        m6239c0(sVar);
    }

    /* renamed from: g0 */
    public abstract Animator mo5777g0(ViewGroup viewGroup, View view, C1159s sVar, C1159s sVar2);

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0089, code lost:
        if (r17.f5133A != false) goto L_0x008b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004a  */
    /* renamed from: h0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator mo5796h0(android.view.ViewGroup r18, p006b.p060q.C1159s r19, int r20, p006b.p060q.C1159s r21, int r22) {
        /*
        // Method dump skipped, instructions count: 264
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p060q.AbstractC1134j0.mo5796h0(android.view.ViewGroup, b.q.s, int, b.q.s, int):android.animation.Animator");
    }

    /* renamed from: i0 */
    public void mo5797i0(int i) {
        if ((i & -4) == 0) {
            this.f5108M = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    @Override // p006b.p060q.AbstractC1142m
    /* renamed from: j */
    public void mo5733j(C1159s sVar) {
        m6239c0(sVar);
    }

    @Override // p006b.p060q.AbstractC1142m
    /* renamed from: n */
    public Animator mo5734n(ViewGroup viewGroup, C1159s sVar, C1159s sVar2) {
        C1137c d0 = m6240d0(sVar, sVar2);
        if (!d0.f5119a) {
            return null;
        }
        if (d0.f5123e == null && d0.f5124f == null) {
            return null;
        }
        return d0.f5120b ? mo5795f0(viewGroup, sVar, d0.f5121c, sVar2, d0.f5122d) : mo5796h0(viewGroup, sVar, d0.f5121c, sVar2, d0.f5122d);
    }
}
