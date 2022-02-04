package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import p006b.p021d.C0830f;
import p006b.p021d.C0838i;
import p006b.p030g.p038j.AbstractC0958f;
import p006b.p030g.p038j.C0959g;

/* access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.p */
public class C0742p {

    /* renamed from: a */
    final C0838i<RecyclerView.AbstractC0655d0, C0743a> f3537a = new C0838i<>();

    /* renamed from: b */
    final C0830f<RecyclerView.AbstractC0655d0> f3538b = new C0830f<>();

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.p$a */
    public static class C0743a {

        /* renamed from: a */
        static AbstractC0958f<C0743a> f3539a = new C0959g(20);

        /* renamed from: b */
        int f3540b;

        /* renamed from: c */
        RecyclerView.AbstractC0663l.C0666c f3541c;

        /* renamed from: d */
        RecyclerView.AbstractC0663l.C0666c f3542d;

        private C0743a() {
        }

        /* renamed from: a */
        static void m4433a() {
            do {
            } while (f3539a.mo5399b() != null);
        }

        /* renamed from: b */
        static C0743a m4434b() {
            C0743a b = f3539a.mo5399b();
            return b == null ? new C0743a() : b;
        }

        /* renamed from: c */
        static void m4435c(C0743a aVar) {
            aVar.f3540b = 0;
            aVar.f3541c = null;
            aVar.f3542d = null;
            f3539a.mo5398a(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.p$b */
    public interface AbstractC0744b {
        /* renamed from: a */
        void mo3961a(RecyclerView.AbstractC0655d0 d0Var);

        /* renamed from: b */
        void mo3962b(RecyclerView.AbstractC0655d0 d0Var, RecyclerView.AbstractC0663l.C0666c cVar, RecyclerView.AbstractC0663l.C0666c cVar2);

        /* renamed from: c */
        void mo3963c(RecyclerView.AbstractC0655d0 d0Var, RecyclerView.AbstractC0663l.C0666c cVar, RecyclerView.AbstractC0663l.C0666c cVar2);

        /* renamed from: d */
        void mo3964d(RecyclerView.AbstractC0655d0 d0Var, RecyclerView.AbstractC0663l.C0666c cVar, RecyclerView.AbstractC0663l.C0666c cVar2);
    }

    C0742p() {
    }

    /* renamed from: l */
    private RecyclerView.AbstractC0663l.C0666c m4416l(RecyclerView.AbstractC0655d0 d0Var, int i) {
        C0743a m;
        RecyclerView.AbstractC0663l.C0666c cVar;
        int f = this.f3537a.mo5005f(d0Var);
        if (f >= 0 && (m = this.f3537a.mo5016m(f)) != null) {
            int i2 = m.f3540b;
            if ((i2 & i) != 0) {
                int i3 = (i ^ -1) & i2;
                m.f3540b = i3;
                if (i == 4) {
                    cVar = m.f3541c;
                } else if (i == 8) {
                    cVar = m.f3542d;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    this.f3537a.mo5014k(f);
                    C0743a.m4435c(m);
                }
                return cVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4489a(RecyclerView.AbstractC0655d0 d0Var, RecyclerView.AbstractC0663l.C0666c cVar) {
        C0743a aVar = this.f3537a.get(d0Var);
        if (aVar == null) {
            aVar = C0743a.m4434b();
            this.f3537a.put(d0Var, aVar);
        }
        aVar.f3540b |= 2;
        aVar.f3541c = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4490b(RecyclerView.AbstractC0655d0 d0Var) {
        C0743a aVar = this.f3537a.get(d0Var);
        if (aVar == null) {
            aVar = C0743a.m4434b();
            this.f3537a.put(d0Var, aVar);
        }
        aVar.f3540b |= 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo4491c(long j, RecyclerView.AbstractC0655d0 d0Var) {
        this.f3538b.mo4919i(j, d0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo4492d(RecyclerView.AbstractC0655d0 d0Var, RecyclerView.AbstractC0663l.C0666c cVar) {
        C0743a aVar = this.f3537a.get(d0Var);
        if (aVar == null) {
            aVar = C0743a.m4434b();
            this.f3537a.put(d0Var, aVar);
        }
        aVar.f3542d = cVar;
        aVar.f3540b |= 8;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo4493e(RecyclerView.AbstractC0655d0 d0Var, RecyclerView.AbstractC0663l.C0666c cVar) {
        C0743a aVar = this.f3537a.get(d0Var);
        if (aVar == null) {
            aVar = C0743a.m4434b();
            this.f3537a.put(d0Var, aVar);
        }
        aVar.f3541c = cVar;
        aVar.f3540b |= 4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo4494f() {
        this.f3537a.clear();
        this.f3538b.mo4912b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public RecyclerView.AbstractC0655d0 mo4495g(long j) {
        return this.f3538b.mo4915e(j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo4496h(RecyclerView.AbstractC0655d0 d0Var) {
        C0743a aVar = this.f3537a.get(d0Var);
        return (aVar == null || (aVar.f3540b & 1) == 0) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo4497i(RecyclerView.AbstractC0655d0 d0Var) {
        C0743a aVar = this.f3537a.get(d0Var);
        return (aVar == null || (aVar.f3540b & 4) == 0) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo4498j() {
        C0743a.m4433a();
    }

    /* renamed from: k */
    public void mo4499k(RecyclerView.AbstractC0655d0 d0Var) {
        mo4503p(d0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public RecyclerView.AbstractC0663l.C0666c mo4500m(RecyclerView.AbstractC0655d0 d0Var) {
        return m4416l(d0Var, 8);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public RecyclerView.AbstractC0663l.C0666c mo4501n(RecyclerView.AbstractC0655d0 d0Var) {
        return m4416l(d0Var, 4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo4502o(AbstractC0744b bVar) {
        RecyclerView.AbstractC0663l.C0666c cVar;
        RecyclerView.AbstractC0663l.C0666c cVar2;
        for (int size = this.f3537a.size() - 1; size >= 0; size--) {
            RecyclerView.AbstractC0655d0 i = this.f3537a.mo5011i(size);
            C0743a k = this.f3537a.mo5014k(size);
            int i2 = k.f3540b;
            if ((i2 & 3) != 3) {
                if ((i2 & 1) != 0) {
                    cVar = k.f3541c;
                    if (cVar != null) {
                        cVar2 = k.f3542d;
                    }
                } else {
                    if ((i2 & 14) != 14) {
                        if ((i2 & 12) == 12) {
                            bVar.mo3964d(i, k.f3541c, k.f3542d);
                        } else if ((i2 & 4) != 0) {
                            cVar = k.f3541c;
                            cVar2 = null;
                        } else if ((i2 & 8) == 0) {
                        }
                        C0743a.m4435c(k);
                    }
                    bVar.mo3962b(i, k.f3541c, k.f3542d);
                    C0743a.m4435c(k);
                }
                bVar.mo3963c(i, cVar, cVar2);
                C0743a.m4435c(k);
            }
            bVar.mo3961a(i);
            C0743a.m4435c(k);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo4503p(RecyclerView.AbstractC0655d0 d0Var) {
        C0743a aVar = this.f3537a.get(d0Var);
        if (aVar != null) {
            aVar.f3540b &= -2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo4504q(RecyclerView.AbstractC0655d0 d0Var) {
        int l = this.f3538b.mo4922l() - 1;
        while (true) {
            if (l < 0) {
                break;
            } else if (d0Var == this.f3538b.mo4923m(l)) {
                this.f3538b.mo4921k(l);
                break;
            } else {
                l--;
            }
        }
        C0743a remove = this.f3537a.remove(d0Var);
        if (remove != null) {
            C0743a.m4435c(remove);
        }
    }
}
