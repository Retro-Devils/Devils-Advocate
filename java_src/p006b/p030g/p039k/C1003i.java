package p006b.p030g.p039k;

import android.view.MotionEvent;

/* renamed from: b.g.k.i */
public final class C1003i {
    @Deprecated
    /* renamed from: a */
    public static int m5689a(MotionEvent motionEvent) {
        return motionEvent.getActionMasked();
    }

    /* renamed from: b */
    public static boolean m5690b(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }
}
