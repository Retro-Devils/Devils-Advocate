package androidx.leanback.widget;

import androidx.leanback.widget.AbstractC0559e;
import p006b.p021d.C0827c;
import p006b.p021d.C0828d;

/* access modifiers changed from: package-private */
/* renamed from: androidx.leanback.widget.u */
public abstract class AbstractC0597u extends AbstractC0559e {

    /* renamed from: j */
    protected C0827c<C0598a> f2975j = new C0827c<>(64);

    /* renamed from: k */
    protected int f2976k = -1;

    /* renamed from: l */
    protected Object f2977l;

    /* renamed from: m */
    protected int f2978m;

    /* renamed from: androidx.leanback.widget.u$a */
    public static class C0598a extends AbstractC0559e.C0560a {

        /* renamed from: b */
        public int f2979b;

        /* renamed from: c */
        public int f2980c;

        public C0598a(int i, int i2, int i3) {
            super(i);
            this.f2979b = i2;
            this.f2980c = i3;
        }
    }

    AbstractC0597u() {
    }

    /* renamed from: K */
    private int m3162K(int i) {
        boolean z;
        int M = mo3611M();
        while (true) {
            if (M < this.f2976k) {
                z = false;
                break;
            } else if (mo3339q(M).f2831a == i) {
                z = true;
                break;
            } else {
                M--;
            }
        }
        if (!z) {
            M = mo3611M();
        }
        int i2 = mo3343u() ? (-mo3339q(M).f2980c) - this.f2825d : mo3339q(M).f2980c + this.f2825d;
        for (int i3 = M + 1; i3 <= mo3611M(); i3++) {
            i2 -= mo3339q(i3).f2979b;
        }
        return i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public final boolean mo3607H(int i, boolean z) {
        int i2;
        int i3;
        int i4;
        if (this.f2975j.mo4904h() == 0) {
            return false;
        }
        int count = this.f2823b.getCount();
        int i5 = this.f2828g;
        if (i5 >= 0) {
            i2 = i5 + 1;
            i3 = this.f2823b.mo3350b(i5);
        } else {
            int i6 = this.f2830i;
            i2 = i6 != -1 ? i6 : 0;
            if (i2 > mo3611M() + 1 || i2 < mo3610L()) {
                this.f2975j.mo4900c();
                return false;
            } else if (i2 > mo3611M()) {
                return false;
            } else {
                i3 = Integer.MAX_VALUE;
            }
        }
        int M = mo3611M();
        int i7 = i2;
        while (i7 < count && i7 <= M) {
            C0598a N = mo3339q(i7);
            if (i3 != Integer.MAX_VALUE) {
                i3 += N.f2979b;
            }
            int i8 = N.f2831a;
            int e = this.f2823b.mo3353e(i7, true, this.f2822a, false);
            if (e != N.f2980c) {
                N.f2980c = e;
                this.f2975j.mo4902f(M - i7);
                i4 = i7;
            } else {
                i4 = M;
            }
            this.f2828g = i7;
            if (this.f2827f < 0) {
                this.f2827f = i7;
            }
            this.f2823b.mo3351c(this.f2822a[0], i7, e, i8, i3);
            if (!z && mo3327d(i)) {
                return true;
            }
            if (i3 == Integer.MAX_VALUE) {
                i3 = this.f2823b.mo3350b(i7);
            }
            if (i8 == this.f2826e - 1 && z) {
                return true;
            }
            i7++;
            M = i4;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public final int mo3608I(int i, int i2, int i3) {
        int i4 = this.f2828g;
        if (i4 < 0 || (i4 == mo3611M() && this.f2828g == i - 1)) {
            int i5 = this.f2828g;
            C0598a aVar = new C0598a(i2, i5 < 0 ? (this.f2975j.mo4904h() <= 0 || i != mo3611M() + 1) ? 0 : m3162K(i2) : i3 - this.f2823b.mo3350b(i5), 0);
            this.f2975j.mo4899b(aVar);
            Object obj = this.f2977l;
            if (obj != null) {
                aVar.f2980c = this.f2978m;
                this.f2977l = null;
            } else {
                aVar.f2980c = this.f2823b.mo3353e(i, true, this.f2822a, false);
                obj = this.f2822a[0];
            }
            if (this.f2975j.mo4904h() == 1) {
                this.f2828g = i;
                this.f2827f = i;
                this.f2976k = i;
            } else {
                int i6 = this.f2828g;
                if (i6 < 0) {
                    this.f2828g = i;
                    this.f2827f = i;
                } else {
                    this.f2828g = i6 + 1;
                }
            }
            this.f2823b.mo3351c(obj, i, aVar.f2980c, i2, i3);
            return aVar.f2980c;
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public abstract boolean mo3609J(int i, boolean z);

    /* renamed from: L */
    public final int mo3610L() {
        return this.f2976k;
    }

    /* renamed from: M */
    public final int mo3611M() {
        return (this.f2976k + this.f2975j.mo4904h()) - 1;
    }

    /* renamed from: N */
    public final C0598a mo3339q(int i) {
        int i2 = i - this.f2976k;
        if (i2 < 0 || i2 >= this.f2975j.mo4904h()) {
            return null;
        }
        return this.f2975j.mo4901e(i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public final boolean mo3613O(int i, boolean z) {
        int i2;
        int i3;
        int i4;
        if (this.f2975j.mo4904h() == 0) {
            return false;
        }
        int i5 = this.f2827f;
        if (i5 >= 0) {
            i4 = this.f2823b.mo3350b(i5);
            i3 = mo3339q(this.f2827f).f2979b;
            i2 = this.f2827f - 1;
        } else {
            i4 = Integer.MAX_VALUE;
            int i6 = this.f2830i;
            i2 = i6 != -1 ? i6 : 0;
            if (i2 > mo3611M() || i2 < mo3610L() - 1) {
                this.f2975j.mo4900c();
                return false;
            } else if (i2 < mo3610L()) {
                return false;
            } else {
                i3 = 0;
            }
        }
        int max = Math.max(this.f2823b.mo3352d(), this.f2976k);
        while (i2 >= max) {
            C0598a N = mo3339q(i2);
            int i7 = N.f2831a;
            int e = this.f2823b.mo3353e(i2, false, this.f2822a, false);
            if (e != N.f2980c) {
                this.f2975j.mo4903g((i2 + 1) - this.f2976k);
                this.f2976k = this.f2827f;
                this.f2977l = this.f2822a[0];
                this.f2978m = e;
                return false;
            }
            this.f2827f = i2;
            if (this.f2828g < 0) {
                this.f2828g = i2;
            }
            this.f2823b.mo3351c(this.f2822a[0], i2, e, i7, i4 - i3);
            if (!z && mo3328e(i)) {
                return true;
            }
            i4 = this.f2823b.mo3350b(i2);
            i3 = N.f2979b;
            if (i7 == 0 && z) {
                return true;
            }
            i2--;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public final int mo3614P(int i, int i2, int i3) {
        int i4 = this.f2827f;
        if (i4 < 0 || (i4 == mo3610L() && this.f2827f == i + 1)) {
            int i5 = this.f2976k;
            C0598a N = i5 >= 0 ? mo3339q(i5) : null;
            int b = this.f2823b.mo3350b(this.f2976k);
            C0598a aVar = new C0598a(i2, 0, 0);
            this.f2975j.mo4898a(aVar);
            Object obj = this.f2977l;
            if (obj != null) {
                aVar.f2980c = this.f2978m;
                this.f2977l = null;
            } else {
                aVar.f2980c = this.f2823b.mo3353e(i, false, this.f2822a, false);
                obj = this.f2822a[0];
            }
            this.f2827f = i;
            this.f2976k = i;
            if (this.f2828g < 0) {
                this.f2828g = i;
            }
            int i6 = !this.f2824c ? i3 - aVar.f2980c : i3 + aVar.f2980c;
            if (N != null) {
                N.f2979b = b - i6;
            }
            this.f2823b.mo3351c(obj, i, aVar.f2980c, i2, i6);
            return aVar.f2980c;
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public abstract boolean mo3615Q(int i, boolean z);

    /* access modifiers changed from: protected */
    @Override // androidx.leanback.widget.AbstractC0559e
    /* renamed from: c */
    public final boolean mo3326c(int i, boolean z) {
        boolean J;
        if (this.f2823b.getCount() == 0) {
            return false;
        }
        if (!z && mo3327d(i)) {
            return false;
        }
        try {
            if (mo3607H(i, z)) {
                J = true;
                this.f2822a[0] = null;
            } else {
                J = mo3609J(i, z);
                this.f2822a[0] = null;
            }
            this.f2977l = null;
            return J;
        } catch (Throwable th) {
            this.f2822a[0] = null;
            this.f2977l = null;
            throw th;
        }
    }

    @Override // androidx.leanback.widget.AbstractC0559e
    /* renamed from: o */
    public final C0828d[] mo3337o(int i, int i2) {
        for (int i3 = 0; i3 < this.f2826e; i3++) {
            this.f2829h[i3].mo4906b();
        }
        if (i >= 0) {
            while (i <= i2) {
                C0828d dVar = this.f2829h[mo3339q(i).f2831a];
                if (dVar.mo4910g() <= 0 || dVar.mo4908e() != i - 1) {
                    dVar.mo4905a(i);
                } else {
                    dVar.mo4909f();
                }
                dVar.mo4905a(i);
                i++;
            }
        }
        return this.f2829h;
    }

    @Override // androidx.leanback.widget.AbstractC0559e
    /* renamed from: t */
    public void mo3342t(int i) {
        super.mo3342t(i);
        this.f2975j.mo4902f((mo3611M() - i) + 1);
        if (this.f2975j.mo4904h() == 0) {
            this.f2976k = -1;
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.leanback.widget.AbstractC0559e
    /* renamed from: x */
    public final boolean mo3346x(int i, boolean z) {
        boolean Q;
        if (this.f2823b.getCount() == 0) {
            return false;
        }
        if (!z && mo3328e(i)) {
            return false;
        }
        try {
            if (mo3613O(i, z)) {
                Q = true;
                this.f2822a[0] = null;
            } else {
                Q = mo3615Q(i, z);
                this.f2822a[0] = null;
            }
            this.f2977l = null;
            return Q;
        } catch (Throwable th) {
            this.f2822a[0] = null;
            this.f2977l = null;
            throw th;
        }
    }
}
