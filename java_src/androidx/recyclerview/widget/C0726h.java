package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.h */
public class C0726h extends AbstractC0736n {

    /* renamed from: d */
    private AbstractC0729j f3513d;

    /* renamed from: e */
    private AbstractC0729j f3514e;

    /* renamed from: m */
    private float m4279m(RecyclerView.AbstractC0669o oVar, AbstractC0729j jVar) {
        int max;
        int M = oVar.mo4098M();
        if (M == 0) {
            return 1.0f;
        }
        View view = null;
        View view2 = null;
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < M; i3++) {
            View L = oVar.mo4096L(i3);
            int l0 = oVar.mo4133l0(L);
            if (l0 != -1) {
                if (l0 < i) {
                    view = L;
                    i = l0;
                }
                if (l0 > i2) {
                    view2 = L;
                    i2 = l0;
                }
            }
        }
        if (view == null || view2 == null || (max = Math.max(jVar.mo4436d(view), jVar.mo4436d(view2)) - Math.min(jVar.mo4439g(view), jVar.mo4439g(view2))) == 0) {
            return 1.0f;
        }
        return (((float) max) * 1.0f) / ((float) ((i2 - i) + 1));
    }

    /* renamed from: n */
    private int m4280n(RecyclerView.AbstractC0669o oVar, View view, AbstractC0729j jVar) {
        return (jVar.mo4439g(view) + (jVar.mo4437e(view) / 2)) - (jVar.mo4445m() + (jVar.mo4446n() / 2));
    }

    /* renamed from: o */
    private int m4281o(RecyclerView.AbstractC0669o oVar, AbstractC0729j jVar, int i, int i2) {
        int[] d = mo4478d(i, i2);
        float m = m4279m(oVar, jVar);
        if (m <= 0.0f) {
            return 0;
        }
        return Math.round(((float) (Math.abs(d[0]) > Math.abs(d[1]) ? d[0] : d[1])) / m);
    }

    /* renamed from: p */
    private View m4282p(RecyclerView.AbstractC0669o oVar, AbstractC0729j jVar) {
        int M = oVar.mo4098M();
        View view = null;
        if (M == 0) {
            return null;
        }
        int m = jVar.mo4445m() + (jVar.mo4446n() / 2);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < M; i2++) {
            View L = oVar.mo4096L(i2);
            int abs = Math.abs((jVar.mo4439g(L) + (jVar.mo4437e(L) / 2)) - m);
            if (abs < i) {
                view = L;
                i = abs;
            }
        }
        return view;
    }

    /* renamed from: q */
    private AbstractC0729j m4283q(RecyclerView.AbstractC0669o oVar) {
        AbstractC0729j jVar = this.f3514e;
        if (jVar == null || jVar.f3516a != oVar) {
            this.f3514e = AbstractC0729j.m4296a(oVar);
        }
        return this.f3514e;
    }

    /* renamed from: r */
    private AbstractC0729j m4284r(RecyclerView.AbstractC0669o oVar) {
        AbstractC0729j jVar = this.f3513d;
        if (jVar == null || jVar.f3516a != oVar) {
            this.f3513d = AbstractC0729j.m4298c(oVar);
        }
        return this.f3513d;
    }

    @Override // androidx.recyclerview.widget.AbstractC0736n
    /* renamed from: c */
    public int[] mo4430c(RecyclerView.AbstractC0669o oVar, View view) {
        int[] iArr = new int[2];
        if (oVar.mo3451l()) {
            iArr[0] = m4280n(oVar, view, m4283q(oVar));
        } else {
            iArr[0] = 0;
        }
        if (oVar.mo3454m()) {
            iArr[1] = m4280n(oVar, view, m4284r(oVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.AbstractC0736n
    /* renamed from: h */
    public View mo4431h(RecyclerView.AbstractC0669o oVar) {
        AbstractC0729j q;
        if (oVar.mo3454m()) {
            q = m4284r(oVar);
        } else if (!oVar.mo3451l()) {
            return null;
        } else {
            q = m4283q(oVar);
        }
        return m4282p(oVar, q);
    }

    @Override // androidx.recyclerview.widget.AbstractC0736n
    /* renamed from: i */
    public int mo4432i(RecyclerView.AbstractC0669o oVar, int i, int i2) {
        int c0;
        View h;
        int l0;
        int i3;
        PointF a;
        int i4;
        int i5;
        if (!(oVar instanceof RecyclerView.AbstractC0686z.AbstractC0688b) || (c0 = oVar.mo4116c0()) == 0 || (h = mo4431h(oVar)) == null || (l0 = oVar.mo4133l0(h)) == -1 || (a = ((RecyclerView.AbstractC0686z.AbstractC0688b) oVar).mo3738a(c0 - 1)) == null) {
            return -1;
        }
        int i6 = 0;
        if (oVar.mo3451l()) {
            i4 = m4281o(oVar, m4283q(oVar), i, 0);
            if (a.x < 0.0f) {
                i4 = -i4;
            }
        } else {
            i4 = 0;
        }
        if (oVar.mo3454m()) {
            i5 = m4281o(oVar, m4284r(oVar), 0, i2);
            if (a.y < 0.0f) {
                i5 = -i5;
            }
        } else {
            i5 = 0;
        }
        if (oVar.mo3454m()) {
            i4 = i5;
        }
        if (i4 == 0) {
            return -1;
        }
        int i7 = l0 + i4;
        if (i7 >= 0) {
            i6 = i7;
        }
        return i6 >= c0 ? i3 : i6;
    }
}
