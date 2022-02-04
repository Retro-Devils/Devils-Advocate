package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C0727i;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p006b.p030g.p038j.AbstractC0958f;
import p006b.p030g.p038j.C0959g;

/* access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.a */
public class C0698a implements C0727i.AbstractC0728a {

    /* renamed from: a */
    private AbstractC0958f<C0700b> f3377a;

    /* renamed from: b */
    final ArrayList<C0700b> f3378b;

    /* renamed from: c */
    final ArrayList<C0700b> f3379c;

    /* renamed from: d */
    final AbstractC0699a f3380d;

    /* renamed from: e */
    Runnable f3381e;

    /* renamed from: f */
    final boolean f3382f;

    /* renamed from: g */
    final C0727i f3383g;

    /* renamed from: h */
    private int f3384h;

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.a$a */
    public interface AbstractC0699a {
        /* renamed from: a */
        void mo4014a(int i, int i2);

        /* renamed from: b */
        void mo4015b(C0700b bVar);

        /* renamed from: c */
        RecyclerView.AbstractC0655d0 mo4016c(int i);

        /* renamed from: d */
        void mo4017d(int i, int i2);

        /* renamed from: e */
        void mo4018e(int i, int i2);

        /* renamed from: f */
        void mo4019f(C0700b bVar);

        /* renamed from: g */
        void mo4020g(int i, int i2);

        /* renamed from: h */
        void mo4021h(int i, int i2, Object obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.a$b */
    public static class C0700b {

        /* renamed from: a */
        int f3385a;

        /* renamed from: b */
        int f3386b;

        /* renamed from: c */
        Object f3387c;

        /* renamed from: d */
        int f3388d;

        C0700b(int i, int i2, int i3, Object obj) {
            this.f3385a = i;
            this.f3386b = i2;
            this.f3388d = i3;
            this.f3387c = obj;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo4341a() {
            int i = this.f3385a;
            return i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0700b.class != obj.getClass()) {
                return false;
            }
            C0700b bVar = (C0700b) obj;
            int i = this.f3385a;
            if (i != bVar.f3385a) {
                return false;
            }
            if (i == 8 && Math.abs(this.f3388d - this.f3386b) == 1 && this.f3388d == bVar.f3386b && this.f3386b == bVar.f3388d) {
                return true;
            }
            if (this.f3388d != bVar.f3388d || this.f3386b != bVar.f3386b) {
                return false;
            }
            Object obj2 = this.f3387c;
            Object obj3 = bVar.f3387c;
            if (obj2 != null) {
                if (!obj2.equals(obj3)) {
                    return false;
                }
            } else if (obj3 != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f3385a * 31) + this.f3386b) * 31) + this.f3388d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + mo4341a() + ",s:" + this.f3386b + "c:" + this.f3388d + ",p:" + this.f3387c + "]";
        }
    }

    C0698a(AbstractC0699a aVar) {
        this(aVar, false);
    }

    C0698a(AbstractC0699a aVar, boolean z) {
        this.f3377a = new C0959g(30);
        this.f3378b = new ArrayList<>();
        this.f3379c = new ArrayList<>();
        this.f3384h = 0;
        this.f3380d = aVar;
        this.f3382f = z;
        this.f3383g = new C0727i(this);
    }

    /* renamed from: c */
    private void m4131c(C0700b bVar) {
        m4137r(bVar);
    }

    /* renamed from: d */
    private void m4132d(C0700b bVar) {
        m4137r(bVar);
    }

    /* renamed from: f */
    private void m4133f(C0700b bVar) {
        char c;
        boolean z;
        int i = bVar.f3386b;
        int i2 = bVar.f3388d + i;
        char c2 = 65535;
        int i3 = i;
        int i4 = 0;
        while (i3 < i2) {
            if (this.f3380d.mo4016c(i3) != null || m4135h(i3)) {
                if (c2 == 0) {
                    m4136k(mo4328b(2, i, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                c = 1;
            } else {
                if (c2 == 1) {
                    m4137r(mo4328b(2, i, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                c = 0;
            }
            if (z) {
                i3 -= i4;
                i2 -= i4;
                i4 = 1;
            } else {
                i4++;
            }
            i3++;
            c2 = c;
        }
        if (i4 != bVar.f3388d) {
            mo4327a(bVar);
            bVar = mo4328b(2, i, i4, null);
        }
        if (c2 == 0) {
            m4136k(bVar);
        } else {
            m4137r(bVar);
        }
    }

    /* renamed from: g */
    private void m4134g(C0700b bVar) {
        int i = bVar.f3386b;
        int i2 = bVar.f3388d + i;
        int i3 = i;
        char c = 65535;
        int i4 = 0;
        while (i < i2) {
            if (this.f3380d.mo4016c(i) != null || m4135h(i)) {
                if (c == 0) {
                    m4136k(mo4328b(4, i3, i4, bVar.f3387c));
                    i3 = i;
                    i4 = 0;
                }
                c = 1;
            } else {
                if (c == 1) {
                    m4137r(mo4328b(4, i3, i4, bVar.f3387c));
                    i3 = i;
                    i4 = 0;
                }
                c = 0;
            }
            i4++;
            i++;
        }
        if (i4 != bVar.f3388d) {
            Object obj = bVar.f3387c;
            mo4327a(bVar);
            bVar = mo4328b(4, i3, i4, obj);
        }
        if (c == 0) {
            m4136k(bVar);
        } else {
            m4137r(bVar);
        }
    }

    /* renamed from: h */
    private boolean m4135h(int i) {
        int size = this.f3379c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0700b bVar = this.f3379c.get(i2);
            int i3 = bVar.f3385a;
            if (i3 == 8) {
                if (mo4334n(bVar.f3388d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = bVar.f3386b;
                int i5 = bVar.f3388d + i4;
                while (i4 < i5) {
                    if (mo4334n(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: k */
    private void m4136k(C0700b bVar) {
        int i;
        int i2 = bVar.f3385a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int v = m4138v(bVar.f3386b, i2);
        int i3 = bVar.f3386b;
        int i4 = bVar.f3385a;
        if (i4 == 2) {
            i = 0;
        } else if (i4 == 4) {
            i = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        }
        int i5 = 1;
        for (int i6 = 1; i6 < bVar.f3388d; i6++) {
            int v2 = m4138v(bVar.f3386b + (i * i6), bVar.f3385a);
            int i7 = bVar.f3385a;
            if (i7 == 2 ? v2 == v : i7 == 4 && v2 == v + 1) {
                i5++;
            } else {
                C0700b b = mo4328b(i7, v, i5, bVar.f3387c);
                mo4332l(b, i3);
                mo4327a(b);
                if (bVar.f3385a == 4) {
                    i3 += i5;
                }
                v = v2;
                i5 = 1;
            }
        }
        Object obj = bVar.f3387c;
        mo4327a(bVar);
        if (i5 > 0) {
            C0700b b2 = mo4328b(bVar.f3385a, v, i5, obj);
            mo4332l(b2, i3);
            mo4327a(b2);
        }
    }

    /* renamed from: r */
    private void m4137r(C0700b bVar) {
        this.f3379c.add(bVar);
        int i = bVar.f3385a;
        if (i == 1) {
            this.f3380d.mo4020g(bVar.f3386b, bVar.f3388d);
        } else if (i == 2) {
            this.f3380d.mo4018e(bVar.f3386b, bVar.f3388d);
        } else if (i == 4) {
            this.f3380d.mo4021h(bVar.f3386b, bVar.f3388d, bVar.f3387c);
        } else if (i == 8) {
            this.f3380d.mo4014a(bVar.f3386b, bVar.f3388d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* renamed from: v */
    private int m4138v(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        for (int size = this.f3379c.size() - 1; size >= 0; size--) {
            C0700b bVar = this.f3379c.get(size);
            int i9 = bVar.f3385a;
            if (i9 == 8) {
                int i10 = bVar.f3386b;
                int i11 = bVar.f3388d;
                if (i10 < i11) {
                    i5 = i10;
                    i4 = i11;
                } else {
                    i4 = i10;
                    i5 = i11;
                }
                if (i < i5 || i > i4) {
                    if (i < i10) {
                        if (i2 == 1) {
                            bVar.f3386b = i10 + 1;
                            i6 = i11 + 1;
                        } else if (i2 == 2) {
                            bVar.f3386b = i10 - 1;
                            i6 = i11 - 1;
                        }
                        bVar.f3388d = i6;
                    }
                } else if (i5 == i10) {
                    if (i2 == 1) {
                        i8 = i11 + 1;
                    } else {
                        if (i2 == 2) {
                            i8 = i11 - 1;
                        }
                        i++;
                    }
                    bVar.f3388d = i8;
                    i++;
                } else {
                    if (i2 == 1) {
                        i7 = i10 + 1;
                    } else {
                        if (i2 == 2) {
                            i7 = i10 - 1;
                        }
                        i--;
                    }
                    bVar.f3386b = i7;
                    i--;
                }
            } else {
                int i12 = bVar.f3386b;
                if (i12 > i) {
                    if (i2 == 1) {
                        i3 = i12 + 1;
                    } else if (i2 == 2) {
                        i3 = i12 - 1;
                    }
                    bVar.f3386b = i3;
                } else if (i9 == 1) {
                    i -= bVar.f3388d;
                } else if (i9 == 2) {
                    i += bVar.f3388d;
                }
            }
        }
        for (int size2 = this.f3379c.size() - 1; size2 >= 0; size2--) {
            C0700b bVar2 = this.f3379c.get(size2);
            if (bVar2.f3385a == 8) {
                int i13 = bVar2.f3388d;
                if (i13 != bVar2.f3386b && i13 >= 0) {
                }
            } else if (bVar2.f3388d > 0) {
            }
            this.f3379c.remove(size2);
            mo4327a(bVar2);
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.C0727i.AbstractC0728a
    /* renamed from: a */
    public void mo4327a(C0700b bVar) {
        if (!this.f3382f) {
            bVar.f3387c = null;
            this.f3377a.mo5398a(bVar);
        }
    }

    @Override // androidx.recyclerview.widget.C0727i.AbstractC0728a
    /* renamed from: b */
    public C0700b mo4328b(int i, int i2, int i3, Object obj) {
        C0700b b = this.f3377a.mo5399b();
        if (b == null) {
            return new C0700b(i, i2, i3, obj);
        }
        b.f3385a = i;
        b.f3386b = i2;
        b.f3388d = i3;
        b.f3387c = obj;
        return b;
    }

    /* renamed from: e */
    public int mo4329e(int i) {
        int size = this.f3378b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0700b bVar = this.f3378b.get(i2);
            int i3 = bVar.f3385a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = bVar.f3386b;
                    if (i4 <= i) {
                        int i5 = bVar.f3388d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = bVar.f3386b;
                    if (i6 == i) {
                        i = bVar.f3388d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (bVar.f3388d <= i) {
                            i++;
                        }
                    }
                }
            } else if (bVar.f3386b <= i) {
                i += bVar.f3388d;
            }
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo4330i() {
        int size = this.f3379c.size();
        for (int i = 0; i < size; i++) {
            this.f3380d.mo4015b(this.f3379c.get(i));
        }
        mo4339t(this.f3379c);
        this.f3384h = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo4331j() {
        mo4330i();
        int size = this.f3378b.size();
        for (int i = 0; i < size; i++) {
            C0700b bVar = this.f3378b.get(i);
            int i2 = bVar.f3385a;
            if (i2 == 1) {
                this.f3380d.mo4015b(bVar);
                this.f3380d.mo4020g(bVar.f3386b, bVar.f3388d);
            } else if (i2 == 2) {
                this.f3380d.mo4015b(bVar);
                this.f3380d.mo4017d(bVar.f3386b, bVar.f3388d);
            } else if (i2 == 4) {
                this.f3380d.mo4015b(bVar);
                this.f3380d.mo4021h(bVar.f3386b, bVar.f3388d, bVar.f3387c);
            } else if (i2 == 8) {
                this.f3380d.mo4015b(bVar);
                this.f3380d.mo4014a(bVar.f3386b, bVar.f3388d);
            }
            Runnable runnable = this.f3381e;
            if (runnable != null) {
                runnable.run();
            }
        }
        mo4339t(this.f3378b);
        this.f3384h = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo4332l(C0700b bVar, int i) {
        this.f3380d.mo4019f(bVar);
        int i2 = bVar.f3385a;
        if (i2 == 2) {
            this.f3380d.mo4017d(i, bVar.f3388d);
        } else if (i2 == 4) {
            this.f3380d.mo4021h(i, bVar.f3388d, bVar.f3387c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public int mo4333m(int i) {
        return mo4334n(i, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public int mo4334n(int i, int i2) {
        int size = this.f3379c.size();
        while (i2 < size) {
            C0700b bVar = this.f3379c.get(i2);
            int i3 = bVar.f3385a;
            if (i3 == 8) {
                int i4 = bVar.f3386b;
                if (i4 == i) {
                    i = bVar.f3388d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (bVar.f3388d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = bVar.f3386b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = bVar.f3388d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += bVar.f3388d;
                }
            }
            i2++;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo4335o(int i) {
        return (i & this.f3384h) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo4336p() {
        return this.f3378b.size() > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo4337q() {
        return !this.f3379c.isEmpty() && !this.f3378b.isEmpty();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo4338s() {
        this.f3383g.mo4433b(this.f3378b);
        int size = this.f3378b.size();
        for (int i = 0; i < size; i++) {
            C0700b bVar = this.f3378b.get(i);
            int i2 = bVar.f3385a;
            if (i2 == 1) {
                m4131c(bVar);
            } else if (i2 == 2) {
                m4133f(bVar);
            } else if (i2 == 4) {
                m4134g(bVar);
            } else if (i2 == 8) {
                m4132d(bVar);
            }
            Runnable runnable = this.f3381e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f3378b.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo4339t(List<C0700b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mo4327a(list.get(i));
        }
        list.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo4340u() {
        mo4339t(this.f3378b);
        mo4339t(this.f3379c);
        this.f3384h = 0;
    }
}
