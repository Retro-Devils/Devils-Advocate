package p006b.p060q;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import p006b.p030g.p039k.C1013s;

/* access modifiers changed from: package-private */
/* renamed from: b.q.c0 */
public class C1112c0 {

    /* renamed from: a */
    private static final C1132i0 f5071a;

    /* renamed from: b */
    static final Property<View, Float> f5072b = new C1113a(Float.class, "translationAlpha");

    /* renamed from: c */
    static final Property<View, Rect> f5073c = new C1114b(Rect.class, "clipBounds");

    /* renamed from: b.q.c0$a */
    static class C1113a extends Property<View, Float> {
        C1113a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(C1112c0.m6169c(view));
        }

        /* renamed from: b */
        public void set(View view, Float f) {
            C1112c0.m6173g(view, f.floatValue());
        }
    }

    /* renamed from: b.q.c0$b */
    static class C1114b extends Property<View, Rect> {
        C1114b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Rect get(View view) {
            return C1013s.m5783r(view);
        }

        /* renamed from: b */
        public void set(View view, Rect rect) {
            C1013s.m5778o0(view, rect);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        f5071a = i >= 29 ? new C1130h0() : i >= 23 ? new C1128g0() : i >= 22 ? new C1126f0() : i >= 21 ? new C1124e0() : i >= 19 ? new C1118d0() : new C1132i0();
    }

    /* renamed from: a */
    static void m6167a(View view) {
        f5071a.mo5780a(view);
    }

    /* renamed from: b */
    static AbstractC1099b0 m6168b(View view) {
        return Build.VERSION.SDK_INT >= 18 ? new C1097a0(view) : C1167z.m6388e(view);
    }

    /* renamed from: c */
    static float m6169c(View view) {
        return f5071a.mo5781c(view);
    }

    /* renamed from: d */
    static AbstractC1149m0 m6170d(View view) {
        return Build.VERSION.SDK_INT >= 18 ? new C1141l0(view) : new C1139k0(view.getWindowToken());
    }

    /* renamed from: e */
    static void m6171e(View view) {
        f5071a.mo5782d(view);
    }

    /* renamed from: f */
    static void m6172f(View view, int i, int i2, int i3, int i4) {
        f5071a.mo5787e(view, i, i2, i3, i4);
    }

    /* renamed from: g */
    static void m6173g(View view, float f) {
        f5071a.mo5783f(view, f);
    }

    /* renamed from: h */
    static void m6174h(View view, int i) {
        f5071a.mo5789g(view, i);
    }

    /* renamed from: i */
    static void m6175i(View view, Matrix matrix) {
        f5071a.mo5785h(view, matrix);
    }

    /* renamed from: j */
    static void m6176j(View view, Matrix matrix) {
        f5071a.mo5786i(view, matrix);
    }
}
