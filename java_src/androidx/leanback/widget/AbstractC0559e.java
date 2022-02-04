package androidx.leanback.widget;

import android.util.SparseIntArray;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import p006b.p021d.C0828d;

/* access modifiers changed from: package-private */
/* renamed from: androidx.leanback.widget.e */
public abstract class AbstractC0559e {

    /* renamed from: a */
    Object[] f2822a = new Object[1];

    /* renamed from: b */
    protected AbstractC0561b f2823b;

    /* renamed from: c */
    protected boolean f2824c;

    /* renamed from: d */
    protected int f2825d;

    /* renamed from: e */
    protected int f2826e;

    /* renamed from: f */
    protected int f2827f = -1;

    /* renamed from: g */
    protected int f2828g = -1;

    /* renamed from: h */
    protected C0828d[] f2829h;

    /* renamed from: i */
    protected int f2830i = -1;

    /* renamed from: androidx.leanback.widget.e$a */
    public static class C0560a {

        /* renamed from: a */
        public int f2831a;

        public C0560a(int i) {
            this.f2831a = i;
        }
    }

    /* renamed from: androidx.leanback.widget.e$b */
    public interface AbstractC0561b {
        /* renamed from: a */
        int mo3349a(int i);

        /* renamed from: b */
        int mo3350b(int i);

        /* renamed from: c */
        void mo3351c(Object obj, int i, int i2, int i3, int i4);

        /* renamed from: d */
        int mo3352d();

        /* renamed from: e */
        int mo3353e(int i, boolean z, Object[] objArr, boolean z2);

        int getCount();

        void removeItem(int i);
    }

    AbstractC0559e() {
    }

    /* renamed from: B */
    private void m2834B() {
        if (this.f2828g < this.f2827f) {
            mo3318A();
        }
    }

    /* renamed from: g */
    public static AbstractC0559e m2835g(int i) {
        if (i == 1) {
            return new C0595s();
        }
        C0599v vVar = new C0599v();
        vVar.mo3319C(i);
        return vVar;
    }

    /* renamed from: A */
    public void mo3318A() {
        this.f2828g = -1;
        this.f2827f = -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo3319C(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException();
        } else if (this.f2826e != i) {
            this.f2826e = i;
            this.f2829h = new C0828d[i];
            for (int i2 = 0; i2 < this.f2826e; i2++) {
                this.f2829h[i2] = new C0828d();
            }
        }
    }

    /* renamed from: D */
    public void mo3320D(AbstractC0561b bVar) {
        this.f2823b = bVar;
    }

    /* renamed from: E */
    public final void mo3321E(boolean z) {
        this.f2824c = z;
    }

    /* renamed from: F */
    public final void mo3322F(int i) {
        this.f2825d = i;
    }

    /* renamed from: G */
    public void mo3323G(int i) {
        this.f2830i = i;
    }

    /* renamed from: a */
    public boolean mo3324a() {
        return mo3326c(this.f2824c ? Integer.MAX_VALUE : Integer.MIN_VALUE, true);
    }

    /* renamed from: b */
    public final void mo3325b(int i) {
        mo3326c(i, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract boolean mo3326c(int i, boolean z);

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001f A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo3327d(int r5) {
        /*
            r4 = this;
            int r0 = r4.f2828g
            r1 = 0
            if (r0 >= 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r0 = r4.f2824c
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0016
            int r0 = r4.mo3334l(r3, r2)
            int r2 = r4.f2825d
            int r5 = r5 + r2
            if (r0 > r5) goto L_0x0020
            goto L_0x001f
        L_0x0016:
            int r0 = r4.mo3332j(r1, r2)
            int r2 = r4.f2825d
            int r5 = r5 - r2
            if (r0 < r5) goto L_0x0020
        L_0x001f:
            r1 = 1
        L_0x0020:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.AbstractC0559e.mo3327d(int):boolean");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001f A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo3328e(int r5) {
        /*
            r4 = this;
            int r0 = r4.f2828g
            r1 = 0
            if (r0 >= 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r0 = r4.f2824c
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0016
            int r0 = r4.mo3332j(r1, r2)
            int r2 = r4.f2825d
            int r5 = r5 - r2
            if (r0 < r5) goto L_0x0020
            goto L_0x001f
        L_0x0016:
            int r0 = r4.mo3334l(r3, r2)
            int r2 = r4.f2825d
            int r5 = r5 + r2
            if (r0 > r5) goto L_0x0020
        L_0x001f:
            r1 = 1
        L_0x0020:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.AbstractC0559e.mo3328e(int):boolean");
    }

    /* renamed from: f */
    public void mo3329f(int i, int i2, RecyclerView.AbstractC0669o.AbstractC0672c cVar) {
    }

    /* renamed from: h */
    public void mo3330h(int[] iArr, int i, SparseIntArray sparseIntArray) {
        int p = mo3338p();
        int binarySearch = p >= 0 ? Arrays.binarySearch(iArr, 0, i, p) : 0;
        if (binarySearch < 0) {
            int b = this.f2824c ? (this.f2823b.mo3350b(p) - this.f2823b.mo3349a(p)) - this.f2825d : this.f2823b.mo3350b(p) + this.f2823b.mo3349a(p) + this.f2825d;
            for (int i2 = (-binarySearch) - 1; i2 < i; i2++) {
                int i3 = iArr[i2];
                int i4 = sparseIntArray.get(i3);
                int i5 = i4 < 0 ? 0 : i4;
                int e = this.f2823b.mo3353e(i3, true, this.f2822a, true);
                this.f2823b.mo3351c(this.f2822a[0], i3, e, i5, b);
                b = this.f2824c ? (b - e) - this.f2825d : b + e + this.f2825d;
            }
        }
        int m = mo3335m();
        int binarySearch2 = m >= 0 ? Arrays.binarySearch(iArr, 0, i, m) : 0;
        if (binarySearch2 < 0) {
            boolean z = this.f2824c;
            int b2 = this.f2823b.mo3350b(m);
            for (int i6 = (-binarySearch2) - 2; i6 >= 0; i6--) {
                int i7 = iArr[i6];
                int i8 = sparseIntArray.get(i7);
                int i9 = i8 < 0 ? 0 : i8;
                int e2 = this.f2823b.mo3353e(i7, false, this.f2822a, true);
                b2 = this.f2824c ? b2 + this.f2825d + e2 : (b2 - this.f2825d) - e2;
                this.f2823b.mo3351c(this.f2822a[0], i7, e2, i9, b2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract int mo3331i(boolean z, int i, int[] iArr);

    /* renamed from: j */
    public final int mo3332j(boolean z, int[] iArr) {
        return mo3331i(z, this.f2824c ? this.f2827f : this.f2828g, iArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract int mo3333k(boolean z, int i, int[] iArr);

    /* renamed from: l */
    public final int mo3334l(boolean z, int[] iArr) {
        return mo3333k(z, this.f2824c ? this.f2828g : this.f2827f, iArr);
    }

    /* renamed from: m */
    public final int mo3335m() {
        return this.f2827f;
    }

    /* renamed from: n */
    public final C0828d[] mo3336n() {
        return mo3337o(mo3335m(), mo3338p());
    }

    /* renamed from: o */
    public abstract C0828d[] mo3337o(int i, int i2);

    /* renamed from: p */
    public final int mo3338p() {
        return this.f2828g;
    }

    /* renamed from: q */
    public abstract C0560a mo3339q(int i);

    /* renamed from: r */
    public int mo3340r() {
        return this.f2826e;
    }

    /* renamed from: s */
    public final int mo3341s(int i) {
        C0560a q = mo3339q(i);
        if (q == null) {
            return -1;
        }
        return q.f2831a;
    }

    /* renamed from: t */
    public void mo3342t(int i) {
        int i2;
        if (i >= 0 && (i2 = this.f2828g) >= 0) {
            if (i2 >= i) {
                this.f2828g = i - 1;
            }
            m2834B();
            if (mo3335m() < 0) {
                mo3323G(i);
            }
        }
    }

    /* renamed from: u */
    public boolean mo3343u() {
        return this.f2824c;
    }

    /* renamed from: v */
    public final boolean mo3344v() {
        return mo3346x(this.f2824c ? Integer.MIN_VALUE : Integer.MAX_VALUE, true);
    }

    /* renamed from: w */
    public final void mo3345w(int i) {
        mo3346x(i, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public abstract boolean mo3346x(int i, boolean z);

    /* renamed from: y */
    public void mo3347y(int i, int i2) {
        while (true) {
            int i3 = this.f2828g;
            if (i3 < this.f2827f || i3 <= i) {
                break;
            }
            boolean z = false;
            if (this.f2824c ? this.f2823b.mo3350b(i3) <= i2 : this.f2823b.mo3350b(i3) >= i2) {
                z = true;
            }
            if (!z) {
                break;
            }
            this.f2823b.removeItem(this.f2828g);
            this.f2828g--;
        }
        m2834B();
    }

    /* renamed from: z */
    public void mo3348z(int i, int i2) {
        while (true) {
            int i3 = this.f2828g;
            int i4 = this.f2827f;
            if (i3 < i4 || i4 >= i) {
                break;
            }
            int a = this.f2823b.mo3349a(i4);
            boolean z = false;
            if (this.f2824c ? this.f2823b.mo3350b(this.f2827f) - a >= i2 : this.f2823b.mo3350b(this.f2827f) + a <= i2) {
                z = true;
            }
            if (!z) {
                break;
            }
            this.f2823b.removeItem(this.f2827f);
            this.f2827f++;
        }
        m2834B();
    }
}
