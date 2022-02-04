package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.l */
class C0734l {
    /* renamed from: a */
    static int m4359a(RecyclerView.C0649a0 a0Var, AbstractC0729j jVar, View view, View view2, RecyclerView.AbstractC0669o oVar, boolean z) {
        if (oVar.mo4098M() == 0 || a0Var.mo3945c() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(oVar.mo4133l0(view) - oVar.mo4133l0(view2)) + 1;
        }
        return Math.min(jVar.mo4446n(), jVar.mo4436d(view2) - jVar.mo4439g(view));
    }

    /* renamed from: b */
    static int m4360b(RecyclerView.C0649a0 a0Var, AbstractC0729j jVar, View view, View view2, RecyclerView.AbstractC0669o oVar, boolean z, boolean z2) {
        if (oVar.mo4098M() == 0 || a0Var.mo3945c() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (a0Var.mo3945c() - Math.max(oVar.mo4133l0(view), oVar.mo4133l0(view2))) - 1) : Math.max(0, Math.min(oVar.mo4133l0(view), oVar.mo4133l0(view2)));
        if (!z) {
            return max;
        }
        return Math.round((((float) max) * (((float) Math.abs(jVar.mo4436d(view2) - jVar.mo4439g(view))) / ((float) (Math.abs(oVar.mo4133l0(view) - oVar.mo4133l0(view2)) + 1)))) + ((float) (jVar.mo4445m() - jVar.mo4439g(view))));
    }

    /* renamed from: c */
    static int m4361c(RecyclerView.C0649a0 a0Var, AbstractC0729j jVar, View view, View view2, RecyclerView.AbstractC0669o oVar, boolean z) {
        if (oVar.mo4098M() == 0 || a0Var.mo3945c() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return a0Var.mo3945c();
        }
        return (int) ((((float) (jVar.mo4436d(view2) - jVar.mo4439g(view))) / ((float) (Math.abs(oVar.mo4133l0(view) - oVar.mo4133l0(view2)) + 1))) * ((float) a0Var.mo3945c()));
    }
}
