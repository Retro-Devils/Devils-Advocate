package p006b.p060q;

import android.view.ViewGroup;

/* renamed from: b.q.l */
public class C1140l {

    /* renamed from: a */
    private ViewGroup f5127a;

    /* renamed from: b */
    private Runnable f5128b;

    /* renamed from: b */
    public static C1140l m6262b(ViewGroup viewGroup) {
        return (C1140l) viewGroup.getTag(C1133j.transition_current_scene);
    }

    /* renamed from: c */
    static void m6263c(ViewGroup viewGroup, C1140l lVar) {
        viewGroup.setTag(C1133j.transition_current_scene, lVar);
    }

    /* renamed from: a */
    public void mo5806a() {
        Runnable runnable;
        if (m6262b(this.f5127a) == this && (runnable = this.f5128b) != null) {
            runnable.run();
        }
    }
}
