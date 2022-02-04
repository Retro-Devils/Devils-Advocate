package com.digdroid.alman.dig;

import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.digdroid.alman.dig.w0 */
class C2826w0 extends AbstractC2208b4 {

    /* renamed from: l */
    C2550q0 f9566l;

    public C2826w0(MainActivity mainActivity, C2774t3 t3Var, Cursor cursor, float f, float f2, C2775u uVar, String str, String str2, boolean z) {
        super(mainActivity, t3Var, cursor, f, f2);
        C2550q0 q0Var = new C2550q0(mainActivity, t3Var, cursor, f, f2, uVar, str, str2, z);
        this.f9566l = q0Var;
        this.f8304k = q0Var;
    }

    @Override // com.digdroid.alman.dig.AbstractC2208b4, androidx.recyclerview.widget.RecyclerView.AbstractC0658g
    /* renamed from: j */
    public void mo3581j(RecyclerView.AbstractC0655d0 d0Var, int i) {
        super.mo3581j(d0Var, i);
        if (d0Var != null) {
            C2847x0 x0Var = (C2847x0) d0Var;
            this.f9566l.mo8960b(x0Var.f9613u, x0Var.f9614v, x0Var.f9615w, x0Var.f9616x, x0Var.f9617y, i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0658g
    /* renamed from: l */
    public RecyclerView.AbstractC0655d0 mo3582l(ViewGroup viewGroup, int i) {
        return this.f9566l.mo8967i(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.carousel_view, viewGroup, false), (float) this.f8299f);
    }
}
