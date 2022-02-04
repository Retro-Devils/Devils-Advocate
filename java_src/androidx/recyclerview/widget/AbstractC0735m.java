package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.m */
public abstract class AbstractC0735m extends RecyclerView.AbstractC0663l {

    /* renamed from: g */
    boolean f3523g = true;

    /* renamed from: A */
    public final void mo4460A(RecyclerView.AbstractC0655d0 d0Var) {
        mo4468I(d0Var);
        mo4050h(d0Var);
    }

    /* renamed from: B */
    public final void mo4461B(RecyclerView.AbstractC0655d0 d0Var) {
        mo4469J(d0Var);
    }

    /* renamed from: C */
    public final void mo4462C(RecyclerView.AbstractC0655d0 d0Var, boolean z) {
        mo4470K(d0Var, z);
        mo4050h(d0Var);
    }

    /* renamed from: D */
    public final void mo4463D(RecyclerView.AbstractC0655d0 d0Var, boolean z) {
        mo4471L(d0Var, z);
    }

    /* renamed from: E */
    public final void mo4464E(RecyclerView.AbstractC0655d0 d0Var) {
        mo4472M(d0Var);
        mo4050h(d0Var);
    }

    /* renamed from: F */
    public final void mo4465F(RecyclerView.AbstractC0655d0 d0Var) {
        mo4473N(d0Var);
    }

    /* renamed from: G */
    public final void mo4466G(RecyclerView.AbstractC0655d0 d0Var) {
        mo4474O(d0Var);
        mo4050h(d0Var);
    }

    /* renamed from: H */
    public final void mo4467H(RecyclerView.AbstractC0655d0 d0Var) {
        mo4475P(d0Var);
    }

    /* renamed from: I */
    public void mo4468I(RecyclerView.AbstractC0655d0 d0Var) {
    }

    /* renamed from: J */
    public void mo4469J(RecyclerView.AbstractC0655d0 d0Var) {
    }

    /* renamed from: K */
    public void mo4470K(RecyclerView.AbstractC0655d0 d0Var, boolean z) {
    }

    /* renamed from: L */
    public void mo4471L(RecyclerView.AbstractC0655d0 d0Var, boolean z) {
    }

    /* renamed from: M */
    public void mo4472M(RecyclerView.AbstractC0655d0 d0Var) {
    }

    /* renamed from: N */
    public void mo4473N(RecyclerView.AbstractC0655d0 d0Var) {
    }

    /* renamed from: O */
    public void mo4474O(RecyclerView.AbstractC0655d0 d0Var) {
    }

    /* renamed from: P */
    public void mo4475P(RecyclerView.AbstractC0655d0 d0Var) {
    }

    /* renamed from: Q */
    public void mo4476Q(boolean z) {
        this.f3523g = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0663l
    /* renamed from: a */
    public boolean mo4044a(RecyclerView.AbstractC0655d0 d0Var, RecyclerView.AbstractC0663l.C0666c cVar, RecyclerView.AbstractC0663l.C0666c cVar2) {
        int i;
        int i2;
        return (cVar == null || ((i = cVar.f3256a) == (i2 = cVar2.f3256a) && cVar.f3257b == cVar2.f3257b)) ? mo4376w(d0Var) : mo4378y(d0Var, i, cVar.f3257b, i2, cVar2.f3257b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0663l
    /* renamed from: b */
    public boolean mo4045b(RecyclerView.AbstractC0655d0 d0Var, RecyclerView.AbstractC0655d0 d0Var2, RecyclerView.AbstractC0663l.C0666c cVar, RecyclerView.AbstractC0663l.C0666c cVar2) {
        int i;
        int i2;
        int i3 = cVar.f3256a;
        int i4 = cVar.f3257b;
        if (d0Var2.mo3974J()) {
            int i5 = cVar.f3256a;
            i = cVar.f3257b;
            i2 = i5;
        } else {
            i2 = cVar2.f3256a;
            i = cVar2.f3257b;
        }
        return mo4377x(d0Var, d0Var2, i3, i4, i2, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0663l
    /* renamed from: c */
    public boolean mo4046c(RecyclerView.AbstractC0655d0 d0Var, RecyclerView.AbstractC0663l.C0666c cVar, RecyclerView.AbstractC0663l.C0666c cVar2) {
        int i = cVar.f3256a;
        int i2 = cVar.f3257b;
        View view = d0Var.f3228b;
        int left = cVar2 == null ? view.getLeft() : cVar2.f3256a;
        int top = cVar2 == null ? view.getTop() : cVar2.f3257b;
        if (d0Var.mo3998v() || (i == left && i2 == top)) {
            return mo4379z(d0Var);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return mo4378y(d0Var, i, i2, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0663l
    /* renamed from: d */
    public boolean mo4047d(RecyclerView.AbstractC0655d0 d0Var, RecyclerView.AbstractC0663l.C0666c cVar, RecyclerView.AbstractC0663l.C0666c cVar2) {
        int i = cVar.f3256a;
        int i2 = cVar2.f3256a;
        if (i != i2 || cVar.f3257b != cVar2.f3257b) {
            return mo4378y(d0Var, i, cVar.f3257b, i2, cVar2.f3257b);
        }
        mo4464E(d0Var);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0663l
    /* renamed from: f */
    public boolean mo4048f(RecyclerView.AbstractC0655d0 d0Var) {
        return !this.f3523g || d0Var.mo3995t();
    }

    /* renamed from: w */
    public abstract boolean mo4376w(RecyclerView.AbstractC0655d0 d0Var);

    /* renamed from: x */
    public abstract boolean mo4377x(RecyclerView.AbstractC0655d0 d0Var, RecyclerView.AbstractC0655d0 d0Var2, int i, int i2, int i3, int i4);

    /* renamed from: y */
    public abstract boolean mo4378y(RecyclerView.AbstractC0655d0 d0Var, int i, int i2, int i3, int i4);

    /* renamed from: z */
    public abstract boolean mo4379z(RecyclerView.AbstractC0655d0 d0Var);
}
