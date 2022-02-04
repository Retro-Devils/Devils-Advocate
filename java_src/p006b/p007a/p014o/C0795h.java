package p006b.p007a.p014o;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import p006b.p030g.p039k.AbstractC1032x;
import p006b.p030g.p039k.C1028w;
import p006b.p030g.p039k.C1033y;

/* renamed from: b.a.o.h */
public class C0795h {

    /* renamed from: a */
    final ArrayList<C1028w> f3994a = new ArrayList<>();

    /* renamed from: b */
    private long f3995b = -1;

    /* renamed from: c */
    private Interpolator f3996c;

    /* renamed from: d */
    AbstractC1032x f3997d;

    /* renamed from: e */
    private boolean f3998e;

    /* renamed from: f */
    private final C1033y f3999f = new C0796a();

    /* renamed from: b.a.o.h$a */
    class C0796a extends C1033y {

        /* renamed from: a */
        private boolean f4000a = false;

        /* renamed from: b */
        private int f4001b = 0;

        C0796a() {
        }

        @Override // p006b.p030g.p039k.AbstractC1032x
        /* renamed from: a */
        public void mo345a(View view) {
            int i = this.f4001b + 1;
            this.f4001b = i;
            if (i == C0795h.this.f3994a.size()) {
                AbstractC1032x xVar = C0795h.this.f3997d;
                if (xVar != null) {
                    xVar.mo345a(null);
                }
                mo4732d();
            }
        }

        @Override // p006b.p030g.p039k.C1033y, p006b.p030g.p039k.AbstractC1032x
        /* renamed from: b */
        public void mo346b(View view) {
            if (!this.f4000a) {
                this.f4000a = true;
                AbstractC1032x xVar = C0795h.this.f3997d;
                if (xVar != null) {
                    xVar.mo346b(null);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo4732d() {
            this.f4001b = 0;
            this.f4000a = false;
            C0795h.this.mo4725b();
        }
    }

    /* renamed from: a */
    public void mo4724a() {
        if (this.f3998e) {
            Iterator<C1028w> it = this.f3994a.iterator();
            while (it.hasNext()) {
                it.next().mo5579b();
            }
            this.f3998e = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4725b() {
        this.f3998e = false;
    }

    /* renamed from: c */
    public C0795h mo4726c(C1028w wVar) {
        if (!this.f3998e) {
            this.f3994a.add(wVar);
        }
        return this;
    }

    /* renamed from: d */
    public C0795h mo4727d(C1028w wVar, C1028w wVar2) {
        this.f3994a.add(wVar);
        wVar2.mo5584h(wVar.mo5580c());
        this.f3994a.add(wVar2);
        return this;
    }

    /* renamed from: e */
    public C0795h mo4728e(long j) {
        if (!this.f3998e) {
            this.f3995b = j;
        }
        return this;
    }

    /* renamed from: f */
    public C0795h mo4729f(Interpolator interpolator) {
        if (!this.f3998e) {
            this.f3996c = interpolator;
        }
        return this;
    }

    /* renamed from: g */
    public C0795h mo4730g(AbstractC1032x xVar) {
        if (!this.f3998e) {
            this.f3997d = xVar;
        }
        return this;
    }

    /* renamed from: h */
    public void mo4731h() {
        if (!this.f3998e) {
            Iterator<C1028w> it = this.f3994a.iterator();
            while (it.hasNext()) {
                C1028w next = it.next();
                long j = this.f3995b;
                if (j >= 0) {
                    next.mo5581d(j);
                }
                Interpolator interpolator = this.f3996c;
                if (interpolator != null) {
                    next.mo5582e(interpolator);
                }
                if (this.f3997d != null) {
                    next.mo5583f(this.f3999f);
                }
                next.mo5586j();
            }
            this.f3998e = true;
        }
    }
}
