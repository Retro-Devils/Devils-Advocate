package p069c.p073b.p074a.p090b.p098q;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import p006b.p030g.p031d.C0901a;
import p069c.p073b.p074a.p090b.p104w.C1436b;

/* renamed from: c.b.a.b.q.a */
public class C1428a {
    /* renamed from: a */
    public static int m7050a(Context context, int i, int i2) {
        TypedValue a = C1436b.m7073a(context, i);
        return a != null ? a.data : i2;
    }

    /* renamed from: b */
    public static int m7051b(Context context, int i, String str) {
        return C1436b.m7075c(context, i, str);
    }

    /* renamed from: c */
    public static int m7052c(View view, int i) {
        return C1436b.m7076d(view, i);
    }

    /* renamed from: d */
    public static int m7053d(View view, int i, int i2) {
        return m7050a(view.getContext(), i, i2);
    }

    /* renamed from: e */
    public static int m7054e(int i, int i2) {
        return C0901a.m5297e(i2, i);
    }

    /* renamed from: f */
    public static int m7055f(int i, int i2, float f) {
        return m7054e(i, C0901a.m5300h(i2, Math.round(((float) Color.alpha(i2)) * f)));
    }

    /* renamed from: g */
    public static int m7056g(View view, int i, int i2, float f) {
        return m7055f(m7052c(view, i), m7052c(view, i2), f);
    }
}
