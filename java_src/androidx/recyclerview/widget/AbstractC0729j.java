package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.j */
public abstract class AbstractC0729j {

    /* renamed from: a */
    protected final RecyclerView.AbstractC0669o f3516a;

    /* renamed from: b */
    private int f3517b;

    /* renamed from: c */
    final Rect f3518c;

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.j$a */
    public static class C0730a extends AbstractC0729j {
        C0730a(RecyclerView.AbstractC0669o oVar) {
            super(oVar, null);
        }

        @Override // androidx.recyclerview.widget.AbstractC0729j
        /* renamed from: d */
        public int mo4436d(View view) {
            return this.f3516a.mo3410X(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.C0674p) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0729j
        /* renamed from: e */
        public int mo4437e(View view) {
            RecyclerView.C0674p pVar = (RecyclerView.C0674p) view.getLayoutParams();
            return this.f3516a.mo4110W(view) + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0729j
        /* renamed from: f */
        public int mo4438f(View view) {
            RecyclerView.C0674p pVar = (RecyclerView.C0674p) view.getLayoutParams();
            return this.f3516a.mo4109V(view) + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0729j
        /* renamed from: g */
        public int mo4439g(View view) {
            return this.f3516a.mo3400U(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.C0674p) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0729j
        /* renamed from: h */
        public int mo4440h() {
            return this.f3516a.mo4143s0();
        }

        @Override // androidx.recyclerview.widget.AbstractC0729j
        /* renamed from: i */
        public int mo4441i() {
            return this.f3516a.mo4143s0() - this.f3516a.mo4129j0();
        }

        @Override // androidx.recyclerview.widget.AbstractC0729j
        /* renamed from: j */
        public int mo4442j() {
            return this.f3516a.mo4129j0();
        }

        @Override // androidx.recyclerview.widget.AbstractC0729j
        /* renamed from: k */
        public int mo4443k() {
            return this.f3516a.mo4145t0();
        }

        @Override // androidx.recyclerview.widget.AbstractC0729j
        /* renamed from: l */
        public int mo4444l() {
            return this.f3516a.mo4114b0();
        }

        @Override // androidx.recyclerview.widget.AbstractC0729j
        /* renamed from: m */
        public int mo4445m() {
            return this.f3516a.mo4127i0();
        }

        @Override // androidx.recyclerview.widget.AbstractC0729j
        /* renamed from: n */
        public int mo4446n() {
            return (this.f3516a.mo4143s0() - this.f3516a.mo4127i0()) - this.f3516a.mo4129j0();
        }

        @Override // androidx.recyclerview.widget.AbstractC0729j
        /* renamed from: p */
        public int mo4448p(View view) {
            this.f3516a.mo4142r0(view, true, this.f3518c);
            return this.f3518c.right;
        }

        @Override // androidx.recyclerview.widget.AbstractC0729j
        /* renamed from: q */
        public int mo4449q(View view) {
            this.f3516a.mo4142r0(view, true, this.f3518c);
            return this.f3518c.left;
        }

        @Override // androidx.recyclerview.widget.AbstractC0729j
        /* renamed from: r */
        public void mo4450r(int i) {
            this.f3516a.mo4090I0(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.j$b */
    public static class C0731b extends AbstractC0729j {
        C0731b(RecyclerView.AbstractC0669o oVar) {
            super(oVar, null);
        }

        @Override // androidx.recyclerview.widget.AbstractC0729j
        /* renamed from: d */
        public int mo4436d(View view) {
            return this.f3516a.mo3392S(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.C0674p) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0729j
        /* renamed from: e */
        public int mo4437e(View view) {
            RecyclerView.C0674p pVar = (RecyclerView.C0674p) view.getLayoutParams();
            return this.f3516a.mo4109V(view) + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0729j
        /* renamed from: f */
        public int mo4438f(View view) {
            RecyclerView.C0674p pVar = (RecyclerView.C0674p) view.getLayoutParams();
            return this.f3516a.mo4110W(view) + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0729j
        /* renamed from: g */
        public int mo4439g(View view) {
            return this.f3516a.mo3413Y(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.C0674p) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC0729j
        /* renamed from: h */
        public int mo4440h() {
            return this.f3516a.mo4112a0();
        }

        @Override // androidx.recyclerview.widget.AbstractC0729j
        /* renamed from: i */
        public int mo4441i() {
            return this.f3516a.mo4112a0() - this.f3516a.mo4124h0();
        }

        @Override // androidx.recyclerview.widget.AbstractC0729j
        /* renamed from: j */
        public int mo4442j() {
            return this.f3516a.mo4124h0();
        }

        @Override // androidx.recyclerview.widget.AbstractC0729j
        /* renamed from: k */
        public int mo4443k() {
            return this.f3516a.mo4114b0();
        }

        @Override // androidx.recyclerview.widget.AbstractC0729j
        /* renamed from: l */
        public int mo4444l() {
            return this.f3516a.mo4145t0();
        }

        @Override // androidx.recyclerview.widget.AbstractC0729j
        /* renamed from: m */
        public int mo4445m() {
            return this.f3516a.mo4131k0();
        }

        @Override // androidx.recyclerview.widget.AbstractC0729j
        /* renamed from: n */
        public int mo4446n() {
            return (this.f3516a.mo4112a0() - this.f3516a.mo4131k0()) - this.f3516a.mo4124h0();
        }

        @Override // androidx.recyclerview.widget.AbstractC0729j
        /* renamed from: p */
        public int mo4448p(View view) {
            this.f3516a.mo4142r0(view, true, this.f3518c);
            return this.f3518c.bottom;
        }

        @Override // androidx.recyclerview.widget.AbstractC0729j
        /* renamed from: q */
        public int mo4449q(View view) {
            this.f3516a.mo4142r0(view, true, this.f3518c);
            return this.f3518c.top;
        }

        @Override // androidx.recyclerview.widget.AbstractC0729j
        /* renamed from: r */
        public void mo4450r(int i) {
            this.f3516a.mo4093J0(i);
        }
    }

    private AbstractC0729j(RecyclerView.AbstractC0669o oVar) {
        this.f3517b = Integer.MIN_VALUE;
        this.f3518c = new Rect();
        this.f3516a = oVar;
    }

    /* synthetic */ AbstractC0729j(RecyclerView.AbstractC0669o oVar, C0730a aVar) {
        this(oVar);
    }

    /* renamed from: a */
    public static AbstractC0729j m4296a(RecyclerView.AbstractC0669o oVar) {
        return new C0730a(oVar);
    }

    /* renamed from: b */
    public static AbstractC0729j m4297b(RecyclerView.AbstractC0669o oVar, int i) {
        if (i == 0) {
            return m4296a(oVar);
        }
        if (i == 1) {
            return m4298c(oVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* renamed from: c */
    public static AbstractC0729j m4298c(RecyclerView.AbstractC0669o oVar) {
        return new C0731b(oVar);
    }

    /* renamed from: d */
    public abstract int mo4436d(View view);

    /* renamed from: e */
    public abstract int mo4437e(View view);

    /* renamed from: f */
    public abstract int mo4438f(View view);

    /* renamed from: g */
    public abstract int mo4439g(View view);

    /* renamed from: h */
    public abstract int mo4440h();

    /* renamed from: i */
    public abstract int mo4441i();

    /* renamed from: j */
    public abstract int mo4442j();

    /* renamed from: k */
    public abstract int mo4443k();

    /* renamed from: l */
    public abstract int mo4444l();

    /* renamed from: m */
    public abstract int mo4445m();

    /* renamed from: n */
    public abstract int mo4446n();

    /* renamed from: o */
    public int mo4447o() {
        if (Integer.MIN_VALUE == this.f3517b) {
            return 0;
        }
        return mo4446n() - this.f3517b;
    }

    /* renamed from: p */
    public abstract int mo4448p(View view);

    /* renamed from: q */
    public abstract int mo4449q(View view);

    /* renamed from: r */
    public abstract void mo4450r(int i);

    /* renamed from: s */
    public void mo4451s() {
        this.f3517b = mo4446n();
    }
}
