package p069c.p073b.p074a.p090b.p092l;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import p006b.p050l.p051a.p052a.C1065a;
import p006b.p050l.p051a.p052a.C1066b;
import p006b.p050l.p051a.p052a.C1067c;

/* renamed from: c.b.a.b.l.a */
public class C1401a {

    /* renamed from: a */
    public static final TimeInterpolator f6006a = new LinearInterpolator();

    /* renamed from: b */
    public static final TimeInterpolator f6007b = new C1066b();

    /* renamed from: c */
    public static final TimeInterpolator f6008c = new C1065a();

    /* renamed from: d */
    public static final TimeInterpolator f6009d = new C1067c();

    /* renamed from: e */
    public static final TimeInterpolator f6010e = new DecelerateInterpolator();

    /* renamed from: a */
    public static float m7000a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }
}
