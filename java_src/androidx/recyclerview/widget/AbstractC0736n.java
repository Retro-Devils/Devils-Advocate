package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.n */
public abstract class AbstractC0736n extends RecyclerView.AbstractC0676r {

    /* renamed from: a */
    RecyclerView f3524a;

    /* renamed from: b */
    private Scroller f3525b;

    /* renamed from: c */
    private final RecyclerView.AbstractC0678t f3526c = new C0737a();

    /* renamed from: androidx.recyclerview.widget.n$a */
    class C0737a extends RecyclerView.AbstractC0678t {

        /* renamed from: a */
        boolean f3527a = false;

        C0737a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0678t
        /* renamed from: a */
        public void mo4177a(RecyclerView recyclerView, int i) {
            super.mo4177a(recyclerView, i);
            if (i == 0 && this.f3527a) {
                this.f3527a = false;
                AbstractC0736n.this.mo4481l();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0678t
        /* renamed from: b */
        public void mo4178b(RecyclerView recyclerView, int i, int i2) {
            if (i != 0 || i2 != 0) {
                this.f3527a = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.n$b */
    public class C0738b extends C0725g {
        C0738b(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.C0725g, androidx.recyclerview.widget.RecyclerView.AbstractC0686z
        /* renamed from: o */
        public void mo3484o(View view, RecyclerView.C0649a0 a0Var, RecyclerView.AbstractC0686z.C0687a aVar) {
            AbstractC0736n nVar = AbstractC0736n.this;
            RecyclerView recyclerView = nVar.f3524a;
            if (recyclerView != null) {
                int[] c = nVar.mo4430c(recyclerView.getLayoutManager(), view);
                int i = c[0];
                int i2 = c[1];
                int w = mo4428w(Math.max(Math.abs(i), Math.abs(i2)));
                if (w > 0) {
                    aVar.mo4250d(i, i2, w, this.f3506j);
                }
            }
        }

        /* access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.C0725g
        /* renamed from: v */
        public float mo4427v(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }
    }

    /* renamed from: g */
    private void m4388g() {
        this.f3524a.mo3818b1(this.f3526c);
        this.f3524a.setOnFlingListener(null);
    }

    /* renamed from: j */
    private void m4389j() {
        if (this.f3524a.getOnFlingListener() == null) {
            this.f3524a.mo3868k(this.f3526c);
            this.f3524a.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    /* renamed from: k */
    private boolean m4390k(RecyclerView.AbstractC0669o oVar, int i, int i2) {
        RecyclerView.AbstractC0686z e;
        int i3;
        if (!(oVar instanceof RecyclerView.AbstractC0686z.AbstractC0688b) || (e = mo4479e(oVar)) == null || (i3 = mo4432i(oVar, i, i2)) == -1) {
            return false;
        }
        e.mo4244p(i3);
        oVar.mo3389R1(e);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0676r
    /* renamed from: a */
    public boolean mo4173a(int i, int i2) {
        RecyclerView.AbstractC0669o layoutManager = this.f3524a.getLayoutManager();
        if (layoutManager == null || this.f3524a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f3524a.getMinFlingVelocity();
        return (Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && m4390k(layoutManager, i, i2);
    }

    /* renamed from: b */
    public void mo4477b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f3524a;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                m4388g();
            }
            this.f3524a = recyclerView;
            if (recyclerView != null) {
                m4389j();
                this.f3525b = new Scroller(this.f3524a.getContext(), new DecelerateInterpolator());
                mo4481l();
            }
        }
    }

    /* renamed from: c */
    public abstract int[] mo4430c(RecyclerView.AbstractC0669o oVar, View view);

    /* renamed from: d */
    public int[] mo4478d(int i, int i2) {
        this.f3525b.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.f3525b.getFinalX(), this.f3525b.getFinalY()};
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public RecyclerView.AbstractC0686z mo4479e(RecyclerView.AbstractC0669o oVar) {
        return mo4480f(oVar);
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: f */
    public C0725g mo4480f(RecyclerView.AbstractC0669o oVar) {
        if (!(oVar instanceof RecyclerView.AbstractC0686z.AbstractC0688b)) {
            return null;
        }
        return new C0738b(this.f3524a.getContext());
    }

    /* renamed from: h */
    public abstract View mo4431h(RecyclerView.AbstractC0669o oVar);

    /* renamed from: i */
    public abstract int mo4432i(RecyclerView.AbstractC0669o oVar, int i, int i2);

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo4481l() {
        RecyclerView.AbstractC0669o layoutManager;
        View h;
        RecyclerView recyclerView = this.f3524a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (h = mo4431h(layoutManager)) != null) {
            int[] c = mo4430c(layoutManager, h);
            if (c[0] != 0 || c[1] != 0) {
                this.f3524a.mo3878o1(c[0], c[1]);
            }
        }
    }
}
