package p069c.p073b.p074a.p090b.p093m;

import android.graphics.Canvas;
import android.os.Build;

/* renamed from: c.b.a.b.m.a */
public class C1412a {
    /* renamed from: a */
    public static int m7030a(Canvas canvas, float f, float f2, float f3, float f4, int i) {
        return Build.VERSION.SDK_INT > 21 ? canvas.saveLayerAlpha(f, f2, f3, f4, i) : canvas.saveLayerAlpha(f, f2, f3, f4, i, 31);
    }
}
