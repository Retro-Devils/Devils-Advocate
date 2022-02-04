package p006b.p030g.p039k;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import p006b.p030g.p031d.C0902b;
import p006b.p030g.p038j.C0955c;
import p006b.p030g.p038j.C0956d;
import p006b.p030g.p038j.C0961i;

/* renamed from: b.g.k.a0 */
public class C0964a0 {

    /* renamed from: a */
    public static final C0964a0 f4667a = new C0965a().mo5426a().mo5410a().mo5411b().mo5412c();

    /* renamed from: b */
    private final C0973i f4668b;

    /* renamed from: b.g.k.a0$a */
    public static final class C0965a {

        /* renamed from: a */
        private final C0968d f4669a;

        public C0965a() {
            int i = Build.VERSION.SDK_INT;
            this.f4669a = i >= 29 ? new C0967c() : i >= 20 ? new C0966b() : new C0968d();
        }

        public C0965a(C0964a0 a0Var) {
            int i = Build.VERSION.SDK_INT;
            this.f4669a = i >= 29 ? new C0967c(a0Var) : i >= 20 ? new C0966b(a0Var) : new C0968d(a0Var);
        }

        /* renamed from: a */
        public C0964a0 mo5426a() {
            return this.f4669a.mo5429a();
        }

        /* renamed from: b */
        public C0965a mo5427b(C0902b bVar) {
            this.f4669a.mo5431b(bVar);
            return this;
        }

        /* renamed from: c */
        public C0965a mo5428c(C0902b bVar) {
            this.f4669a.mo5430c(bVar);
            return this;
        }
    }

    /* renamed from: b.g.k.a0$b */
    private static class C0966b extends C0968d {

        /* renamed from: b */
        private static Field f4670b = null;

        /* renamed from: c */
        private static boolean f4671c = false;

        /* renamed from: d */
        private static Constructor<WindowInsets> f4672d = null;

        /* renamed from: e */
        private static boolean f4673e = false;

        /* renamed from: f */
        private WindowInsets f4674f;

        C0966b() {
            this.f4674f = m5528d();
        }

        C0966b(C0964a0 a0Var) {
            this.f4674f = a0Var.mo5425o();
        }

        /* renamed from: d */
        private static WindowInsets m5528d() {
            if (!f4671c) {
                try {
                    f4670b = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
                }
                f4671c = true;
            }
            Field field = f4670b;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e2) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e2);
                }
            }
            if (!f4673e) {
                try {
                    f4672d = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e3);
                }
                f4673e = true;
            }
            Constructor<WindowInsets> constructor = f4672d;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e4);
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        @Override // p006b.p030g.p039k.C0964a0.C0968d
        /* renamed from: a */
        public C0964a0 mo5429a() {
            return C0964a0.m5510p(this.f4674f);
        }

        /* access modifiers changed from: package-private */
        @Override // p006b.p030g.p039k.C0964a0.C0968d
        /* renamed from: c */
        public void mo5430c(C0902b bVar) {
            WindowInsets windowInsets = this.f4674f;
            if (windowInsets != null) {
                this.f4674f = windowInsets.replaceSystemWindowInsets(bVar.f4529b, bVar.f4530c, bVar.f4531d, bVar.f4532e);
            }
        }
    }

    /* renamed from: b.g.k.a0$c */
    private static class C0967c extends C0968d {

        /* renamed from: b */
        final WindowInsets.Builder f4675b;

        C0967c() {
            this.f4675b = new WindowInsets.Builder();
        }

        C0967c(C0964a0 a0Var) {
            WindowInsets.Builder builder;
            if (a0Var.mo5425o() == null) {
                builder = new WindowInsets.Builder();
            }
            this.f4675b = builder;
        }

        /* access modifiers changed from: package-private */
        @Override // p006b.p030g.p039k.C0964a0.C0968d
        /* renamed from: a */
        public C0964a0 mo5429a() {
            return C0964a0.m5510p(this.f4675b.build());
        }

        /* access modifiers changed from: package-private */
        @Override // p006b.p030g.p039k.C0964a0.C0968d
        /* renamed from: b */
        public void mo5431b(C0902b bVar) {
            this.f4675b.setStableInsets(bVar.mo5300c());
        }

        /* access modifiers changed from: package-private */
        @Override // p006b.p030g.p039k.C0964a0.C0968d
        /* renamed from: c */
        public void mo5430c(C0902b bVar) {
            this.f4675b.setSystemWindowInsets(bVar.mo5300c());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b.g.k.a0$d */
    public static class C0968d {

        /* renamed from: a */
        private final C0964a0 f4676a;

        C0968d() {
            this(new C0964a0((C0964a0) null));
        }

        C0968d(C0964a0 a0Var) {
            this.f4676a = a0Var;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0964a0 mo5429a() {
            return this.f4676a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo5431b(C0902b bVar) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo5430c(C0902b bVar) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b.g.k.a0$e */
    public static class C0969e extends C0973i {

        /* renamed from: b */
        final WindowInsets f4677b;

        /* renamed from: c */
        private C0902b f4678c;

        C0969e(C0964a0 a0Var, WindowInsets windowInsets) {
            super(a0Var);
            this.f4678c = null;
            this.f4677b = windowInsets;
        }

        C0969e(C0964a0 a0Var, C0969e eVar) {
            this(a0Var, new WindowInsets(eVar.f4677b));
        }

        /* access modifiers changed from: package-private */
        @Override // p006b.p030g.p039k.C0964a0.C0973i
        /* renamed from: g */
        public final C0902b mo5432g() {
            if (this.f4678c == null) {
                this.f4678c = C0902b.m5301a(this.f4677b.getSystemWindowInsetLeft(), this.f4677b.getSystemWindowInsetTop(), this.f4677b.getSystemWindowInsetRight(), this.f4677b.getSystemWindowInsetBottom());
            }
            return this.f4678c;
        }

        /* access modifiers changed from: package-private */
        @Override // p006b.p030g.p039k.C0964a0.C0973i
        /* renamed from: h */
        public C0964a0 mo5433h(int i, int i2, int i3, int i4) {
            C0965a aVar = new C0965a(C0964a0.m5510p(this.f4677b));
            aVar.mo5428c(C0964a0.m5509l(mo5432g(), i, i2, i3, i4));
            aVar.mo5427b(C0964a0.m5509l(mo5437f(), i, i2, i3, i4));
            return aVar.mo5426a();
        }

        /* access modifiers changed from: package-private */
        @Override // p006b.p030g.p039k.C0964a0.C0973i
        /* renamed from: j */
        public boolean mo5434j() {
            return this.f4677b.isRound();
        }
    }

    /* renamed from: b.g.k.a0$f */
    private static class C0970f extends C0969e {

        /* renamed from: d */
        private C0902b f4679d = null;

        C0970f(C0964a0 a0Var, WindowInsets windowInsets) {
            super(a0Var, windowInsets);
        }

        C0970f(C0964a0 a0Var, C0970f fVar) {
            super(a0Var, fVar);
        }

        /* access modifiers changed from: package-private */
        @Override // p006b.p030g.p039k.C0964a0.C0973i
        /* renamed from: b */
        public C0964a0 mo5435b() {
            return C0964a0.m5510p(this.f4677b.consumeStableInsets());
        }

        /* access modifiers changed from: package-private */
        @Override // p006b.p030g.p039k.C0964a0.C0973i
        /* renamed from: c */
        public C0964a0 mo5436c() {
            return C0964a0.m5510p(this.f4677b.consumeSystemWindowInsets());
        }

        /* access modifiers changed from: package-private */
        @Override // p006b.p030g.p039k.C0964a0.C0973i
        /* renamed from: f */
        public final C0902b mo5437f() {
            if (this.f4679d == null) {
                this.f4679d = C0902b.m5301a(this.f4677b.getStableInsetLeft(), this.f4677b.getStableInsetTop(), this.f4677b.getStableInsetRight(), this.f4677b.getStableInsetBottom());
            }
            return this.f4679d;
        }

        /* access modifiers changed from: package-private */
        @Override // p006b.p030g.p039k.C0964a0.C0973i
        /* renamed from: i */
        public boolean mo5438i() {
            return this.f4677b.isConsumed();
        }
    }

    /* renamed from: b.g.k.a0$g */
    private static class C0971g extends C0970f {
        C0971g(C0964a0 a0Var, WindowInsets windowInsets) {
            super(a0Var, windowInsets);
        }

        C0971g(C0964a0 a0Var, C0971g gVar) {
            super(a0Var, gVar);
        }

        /* access modifiers changed from: package-private */
        @Override // p006b.p030g.p039k.C0964a0.C0973i
        /* renamed from: a */
        public C0964a0 mo5439a() {
            return C0964a0.m5510p(this.f4677b.consumeDisplayCutout());
        }

        /* access modifiers changed from: package-private */
        @Override // p006b.p030g.p039k.C0964a0.C0973i
        /* renamed from: d */
        public C0996c mo5440d() {
            return C0996c.m5667a(this.f4677b.getDisplayCutout());
        }

        @Override // p006b.p030g.p039k.C0964a0.C0973i
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0971g)) {
                return false;
            }
            return C0955c.m5482a(this.f4677b, ((C0971g) obj).f4677b);
        }

        @Override // p006b.p030g.p039k.C0964a0.C0973i
        public int hashCode() {
            return this.f4677b.hashCode();
        }
    }

    /* renamed from: b.g.k.a0$h */
    private static class C0972h extends C0971g {

        /* renamed from: e */
        private C0902b f4680e = null;

        /* renamed from: f */
        private C0902b f4681f = null;

        /* renamed from: g */
        private C0902b f4682g = null;

        C0972h(C0964a0 a0Var, WindowInsets windowInsets) {
            super(a0Var, windowInsets);
        }

        C0972h(C0964a0 a0Var, C0972h hVar) {
            super(a0Var, hVar);
        }

        /* access modifiers changed from: package-private */
        @Override // p006b.p030g.p039k.C0964a0.C0973i
        /* renamed from: e */
        public C0902b mo5443e() {
            if (this.f4681f == null) {
                this.f4681f = C0902b.m5302b(this.f4677b.getMandatorySystemGestureInsets());
            }
            return this.f4681f;
        }

        /* access modifiers changed from: package-private */
        @Override // p006b.p030g.p039k.C0964a0.C0973i, p006b.p030g.p039k.C0964a0.C0969e
        /* renamed from: h */
        public C0964a0 mo5433h(int i, int i2, int i3, int i4) {
            return C0964a0.m5510p(this.f4677b.inset(i, i2, i3, i4));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b.g.k.a0$i */
    public static class C0973i {

        /* renamed from: a */
        final C0964a0 f4683a;

        C0973i(C0964a0 a0Var) {
            this.f4683a = a0Var;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0964a0 mo5439a() {
            return this.f4683a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C0964a0 mo5435b() {
            return this.f4683a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C0964a0 mo5436c() {
            return this.f4683a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public C0996c mo5440d() {
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C0902b mo5443e() {
            return mo5432g();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0973i)) {
                return false;
            }
            C0973i iVar = (C0973i) obj;
            return mo5434j() == iVar.mo5434j() && mo5438i() == iVar.mo5438i() && C0956d.m5483a(mo5432g(), iVar.mo5432g()) && C0956d.m5483a(mo5437f(), iVar.mo5437f()) && C0956d.m5483a(mo5440d(), iVar.mo5440d());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public C0902b mo5437f() {
            return C0902b.f4528a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public C0902b mo5432g() {
            return C0902b.f4528a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public C0964a0 mo5433h(int i, int i2, int i3, int i4) {
            return C0964a0.f4667a;
        }

        public int hashCode() {
            return C0956d.m5484b(Boolean.valueOf(mo5434j()), Boolean.valueOf(mo5438i()), mo5432g(), mo5437f(), mo5440d());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public boolean mo5438i() {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean mo5434j() {
            return false;
        }
    }

    private C0964a0(WindowInsets windowInsets) {
        C0973i eVar;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            eVar = new C0972h(this, windowInsets);
        } else if (i >= 28) {
            eVar = new C0971g(this, windowInsets);
        } else if (i >= 21) {
            eVar = new C0970f(this, windowInsets);
        } else if (i >= 20) {
            eVar = new C0969e(this, windowInsets);
        } else {
            this.f4668b = new C0973i(this);
            return;
        }
        this.f4668b = eVar;
    }

    public C0964a0(C0964a0 a0Var) {
        C0973i iVar;
        C0973i eVar;
        if (a0Var != null) {
            C0973i iVar2 = a0Var.f4668b;
            int i = Build.VERSION.SDK_INT;
            if (i >= 29 && (iVar2 instanceof C0972h)) {
                eVar = new C0972h(this, (C0972h) iVar2);
            } else if (i >= 28 && (iVar2 instanceof C0971g)) {
                eVar = new C0971g(this, (C0971g) iVar2);
            } else if (i >= 21 && (iVar2 instanceof C0970f)) {
                eVar = new C0970f(this, (C0970f) iVar2);
            } else if (i < 20 || !(iVar2 instanceof C0969e)) {
                iVar = new C0973i(this);
            } else {
                eVar = new C0969e(this, (C0969e) iVar2);
            }
            this.f4668b = eVar;
            return;
        }
        iVar = new C0973i(this);
        this.f4668b = iVar;
    }

    /* renamed from: l */
    static C0902b m5509l(C0902b bVar, int i, int i2, int i3, int i4) {
        int max = Math.max(0, bVar.f4529b - i);
        int max2 = Math.max(0, bVar.f4530c - i2);
        int max3 = Math.max(0, bVar.f4531d - i3);
        int max4 = Math.max(0, bVar.f4532e - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? bVar : C0902b.m5301a(max, max2, max3, max4);
    }

    /* renamed from: p */
    public static C0964a0 m5510p(WindowInsets windowInsets) {
        return new C0964a0((WindowInsets) C0961i.m5494c(windowInsets));
    }

    /* renamed from: a */
    public C0964a0 mo5410a() {
        return this.f4668b.mo5439a();
    }

    /* renamed from: b */
    public C0964a0 mo5411b() {
        return this.f4668b.mo5435b();
    }

    /* renamed from: c */
    public C0964a0 mo5412c() {
        return this.f4668b.mo5436c();
    }

    /* renamed from: d */
    public C0902b mo5413d() {
        return this.f4668b.mo5443e();
    }

    /* renamed from: e */
    public int mo5414e() {
        return mo5420i().f4532e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0964a0)) {
            return false;
        }
        return C0956d.m5483a(this.f4668b, ((C0964a0) obj).f4668b);
    }

    /* renamed from: f */
    public int mo5416f() {
        return mo5420i().f4529b;
    }

    /* renamed from: g */
    public int mo5417g() {
        return mo5420i().f4531d;
    }

    /* renamed from: h */
    public int mo5418h() {
        return mo5420i().f4530c;
    }

    public int hashCode() {
        C0973i iVar = this.f4668b;
        if (iVar == null) {
            return 0;
        }
        return iVar.hashCode();
    }

    /* renamed from: i */
    public C0902b mo5420i() {
        return this.f4668b.mo5432g();
    }

    /* renamed from: j */
    public boolean mo5421j() {
        return !mo5420i().equals(C0902b.f4528a);
    }

    /* renamed from: k */
    public C0964a0 mo5422k(int i, int i2, int i3, int i4) {
        return this.f4668b.mo5433h(i, i2, i3, i4);
    }

    /* renamed from: m */
    public boolean mo5423m() {
        return this.f4668b.mo5438i();
    }

    @Deprecated
    /* renamed from: n */
    public C0964a0 mo5424n(int i, int i2, int i3, int i4) {
        return new C0965a(this).mo5428c(C0902b.m5301a(i, i2, i3, i4)).mo5426a();
    }

    /* renamed from: o */
    public WindowInsets mo5425o() {
        C0973i iVar = this.f4668b;
        if (iVar instanceof C0969e) {
            return ((C0969e) iVar).f4677b;
        }
        return null;
    }
}
