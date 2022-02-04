package androidx.leanback.widget;

import androidx.leanback.widget.AbstractC0559e;
import androidx.recyclerview.widget.RecyclerView;
import p006b.p021d.C0828d;

/* renamed from: androidx.leanback.widget.s */
class C0595s extends AbstractC0559e {

    /* renamed from: j */
    private final AbstractC0559e.C0560a f2974j = new AbstractC0559e.C0560a(0);

    C0595s() {
        mo3319C(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public int mo3604H() {
        int i = this.f2828g;
        if (i >= 0) {
            return i + 1;
        }
        int i2 = this.f2830i;
        if (i2 != -1) {
            return Math.min(i2, this.f2823b.getCount() - 1);
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public int mo3605I() {
        int i = this.f2827f;
        if (i >= 0) {
            return i - 1;
        }
        int i2 = this.f2830i;
        return i2 != -1 ? Math.min(i2, this.f2823b.getCount() - 1) : this.f2823b.getCount() - 1;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.leanback.widget.AbstractC0559e
    /* renamed from: c */
    public final boolean mo3326c(int i, boolean z) {
        int i2;
        if (this.f2823b.getCount() == 0) {
            return false;
        }
        if (!z && mo3327d(i)) {
            return false;
        }
        int H = mo3604H();
        boolean z2 = false;
        while (H < this.f2823b.getCount()) {
            int e = this.f2823b.mo3353e(H, true, this.f2822a, false);
            if (this.f2827f < 0 || this.f2828g < 0) {
                i2 = this.f2824c ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                this.f2827f = H;
            } else if (this.f2824c) {
                int i3 = H - 1;
                i2 = (this.f2823b.mo3350b(i3) - this.f2823b.mo3349a(i3)) - this.f2825d;
            } else {
                int i4 = H - 1;
                i2 = this.f2823b.mo3350b(i4) + this.f2823b.mo3349a(i4) + this.f2825d;
            }
            this.f2828g = H;
            this.f2823b.mo3351c(this.f2822a[0], H, e, 0, i2);
            if (z || mo3327d(i)) {
                return true;
            }
            H++;
            z2 = true;
        }
        return z2;
    }

    @Override // androidx.leanback.widget.AbstractC0559e
    /* renamed from: f */
    public void mo3329f(int i, int i2, RecyclerView.AbstractC0669o.AbstractC0672c cVar) {
        int i3;
        int i4;
        if (!this.f2824c ? i2 >= 0 : i2 <= 0) {
            if (mo3338p() != this.f2823b.getCount() - 1) {
                i3 = mo3604H();
                int a = this.f2823b.mo3349a(this.f2828g) + this.f2825d;
                int b = this.f2823b.mo3350b(this.f2828g);
                if (this.f2824c) {
                    a = -a;
                }
                i4 = a + b;
            } else {
                return;
            }
        } else if (mo3335m() != 0) {
            i3 = mo3605I();
            i4 = this.f2823b.mo3350b(this.f2827f) + (this.f2824c ? this.f2825d : -this.f2825d);
        } else {
            return;
        }
        cVar.mo4164a(i3, Math.abs(i4 - i));
    }

    /* access modifiers changed from: protected */
    @Override // androidx.leanback.widget.AbstractC0559e
    /* renamed from: i */
    public final int mo3331i(boolean z, int i, int[] iArr) {
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = i;
        }
        return this.f2824c ? this.f2823b.mo3350b(i) : this.f2823b.mo3350b(i) + this.f2823b.mo3349a(i);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.leanback.widget.AbstractC0559e
    /* renamed from: k */
    public final int mo3333k(boolean z, int i, int[] iArr) {
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = i;
        }
        return this.f2824c ? this.f2823b.mo3350b(i) - this.f2823b.mo3349a(i) : this.f2823b.mo3350b(i);
    }

    @Override // androidx.leanback.widget.AbstractC0559e
    /* renamed from: o */
    public final C0828d[] mo3337o(int i, int i2) {
        this.f2829h[0].mo4906b();
        this.f2829h[0].mo4905a(i);
        this.f2829h[0].mo4905a(i2);
        return this.f2829h;
    }

    @Override // androidx.leanback.widget.AbstractC0559e
    /* renamed from: q */
    public final AbstractC0559e.C0560a mo3339q(int i) {
        return this.f2974j;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.leanback.widget.AbstractC0559e
    /* renamed from: x */
    public final boolean mo3346x(int i, boolean z) {
        int i2;
        if (this.f2823b.getCount() == 0) {
            return false;
        }
        if (!z && mo3328e(i)) {
            return false;
        }
        int d = this.f2823b.mo3352d();
        int I = mo3605I();
        boolean z2 = false;
        while (I >= d) {
            int e = this.f2823b.mo3353e(I, false, this.f2822a, false);
            if (this.f2827f < 0 || this.f2828g < 0) {
                i2 = this.f2824c ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                this.f2827f = I;
                this.f2828g = I;
            } else {
                i2 = this.f2824c ? this.f2823b.mo3350b(I + 1) + this.f2825d + e : (this.f2823b.mo3350b(I + 1) - this.f2825d) - e;
                this.f2827f = I;
            }
            this.f2823b.mo3351c(this.f2822a[0], I, e, 0, i2);
            if (z || mo3328e(i)) {
                return true;
            }
            I--;
            z2 = true;
        }
        return z2;
    }
}
