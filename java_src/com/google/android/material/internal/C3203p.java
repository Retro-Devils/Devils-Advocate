package com.google.android.material.internal;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import p006b.p030g.p039k.AbstractC1010p;
import p006b.p030g.p039k.C0964a0;
import p006b.p030g.p039k.C1013s;

/* renamed from: com.google.android.material.internal.p */
public class C3203p {

    /* renamed from: com.google.android.material.internal.p$a */
    static class C3204a implements AbstractC1010p {

        /* renamed from: a */
        final /* synthetic */ AbstractC3206c f10724a;

        /* renamed from: b */
        final /* synthetic */ C3207d f10725b;

        C3204a(AbstractC3206c cVar, C3207d dVar) {
            this.f10724a = cVar;
            this.f10725b = dVar;
        }

        @Override // p006b.p030g.p039k.AbstractC1010p
        /* renamed from: a */
        public C0964a0 mo340a(View view, C0964a0 a0Var) {
            return this.f10724a.mo9996a(view, a0Var, new C3207d(this.f10725b));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.internal.p$b */
    public static class View$OnAttachStateChangeListenerC3205b implements View.OnAttachStateChangeListener {
        View$OnAttachStateChangeListenerC3205b() {
        }

        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            C1013s.m5760f0(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: com.google.android.material.internal.p$c */
    public interface AbstractC3206c {
        /* renamed from: a */
        C0964a0 mo9996a(View view, C0964a0 a0Var, C3207d dVar);
    }

    /* renamed from: com.google.android.material.internal.p$d */
    public static class C3207d {

        /* renamed from: a */
        public int f10726a;

        /* renamed from: b */
        public int f10727b;

        /* renamed from: c */
        public int f10728c;

        /* renamed from: d */
        public int f10729d;

        public C3207d(int i, int i2, int i3, int i4) {
            this.f10726a = i;
            this.f10727b = i2;
            this.f10728c = i3;
            this.f10729d = i4;
        }

        public C3207d(C3207d dVar) {
            this.f10726a = dVar.f10726a;
            this.f10727b = dVar.f10727b;
            this.f10728c = dVar.f10728c;
            this.f10729d = dVar.f10729d;
        }
    }

    /* renamed from: a */
    public static void m13432a(View view, AbstractC3206c cVar) {
        C1013s.m5790u0(view, new C3204a(cVar, new C3207d(C1013s.m5726D(view), view.getPaddingTop(), C1013s.m5725C(view), view.getPaddingBottom())));
        m13437f(view);
    }

    /* renamed from: b */
    public static float m13433b(Context context, int i) {
        return TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics());
    }

    /* renamed from: c */
    public static float m13434c(View view) {
        float f = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f += C1013s.m5787t((View) parent);
        }
        return f;
    }

    /* renamed from: d */
    public static boolean m13435d(View view) {
        return C1013s.m5797y(view) == 1;
    }

    /* renamed from: e */
    public static PorterDuff.Mode m13436e(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: f */
    public static void m13437f(View view) {
        if (C1013s.m5736N(view)) {
            C1013s.m5760f0(view);
        } else {
            view.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC3205b());
        }
    }
}
