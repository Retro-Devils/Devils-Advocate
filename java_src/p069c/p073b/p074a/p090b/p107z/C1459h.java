package p069c.p073b.p074a.p090b.p107z;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.C3203p;

/* renamed from: c.b.a.b.z.h */
public class C1459h {
    /* renamed from: a */
    static C1452d m7181a(int i) {
        return i != 0 ? i != 1 ? m7182b() : new C1453e() : new C1461j();
    }

    /* renamed from: b */
    static C1452d m7182b() {
        return new C1461j();
    }

    /* renamed from: c */
    static C1454f m7183c() {
        return new C1454f();
    }

    /* renamed from: d */
    public static void m7184d(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof C1455g) {
            ((C1455g) background).mo6607U(f);
        }
    }

    /* renamed from: e */
    public static void m7185e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof C1455g) {
            m7186f(view, (C1455g) background);
        }
    }

    /* renamed from: f */
    public static void m7186f(View view, C1455g gVar) {
        if (gVar.mo6604O()) {
            gVar.mo6611Y(C3203p.m13434c(view));
        }
    }
}
