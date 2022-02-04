package p006b.p030g.p039k;

import android.os.Build;
import android.view.ViewGroup;
import p006b.p030g.C0899b;

/* renamed from: b.g.k.u */
public final class C1026u {
    /* renamed from: a */
    public static boolean m5845a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 21) {
            return viewGroup.isTransitionGroup();
        }
        Boolean bool = (Boolean) viewGroup.getTag(C0899b.tag_transition_group);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && C1013s.m5729G(viewGroup) == null) ? false : true;
    }
}
