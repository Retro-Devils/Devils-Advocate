package com.digdroid.alman.dig;

import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.digdroid.alman.dig.C2267e2;

/* renamed from: com.digdroid.alman.dig.r0 */
public class C2576r0 extends AbstractC2365h {

    /* renamed from: l */
    C2550q0 f8963l;

    public C2576r0(MainActivity mainActivity, C2774t3 t3Var, Cursor cursor, float f, float f2, C2775u uVar, String str, String str2, boolean z) {
        super(mainActivity, t3Var, cursor, f, f2);
        C2550q0 q0Var = new C2550q0(mainActivity, t3Var, cursor, f, f2, uVar, str, str2, z);
        this.f8963l = q0Var;
        this.f8304k = q0Var;
    }

    @Override // com.digdroid.alman.dig.AbstractC2365h, androidx.recyclerview.widget.RecyclerView.AbstractC0658g
    /* renamed from: c */
    public /* bridge */ /* synthetic */ int mo3580c() {
        return super.mo3580c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0658g
    /* renamed from: j */
    public void mo3581j(RecyclerView.AbstractC0655d0 d0Var, int i) {
        if (d0Var != null) {
            C2847x0 x0Var = (C2847x0) d0Var;
            this.f8963l.mo8960b(x0Var.f9613u, x0Var.f9614v, x0Var.f9615w, x0Var.f9616x, x0Var.f9617y, i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0658g
    /* renamed from: l */
    public RecyclerView.AbstractC0655d0 mo3582l(ViewGroup viewGroup, int i) {
        return this.f8963l.mo8967i(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.carousel_view, viewGroup, false), (float) this.f8299f);
    }

    @Override // com.digdroid.alman.dig.AbstractC2365h
    /* renamed from: u */
    public /* bridge */ /* synthetic */ void mo8523u(Cursor cursor) {
        super.mo8523u(cursor);
    }

    @Override // com.digdroid.alman.dig.AbstractC2365h
    /* renamed from: v */
    public /* bridge */ /* synthetic */ void mo8524v() {
        super.mo8524v();
    }

    @Override // com.digdroid.alman.dig.AbstractC2365h
    /* renamed from: w */
    public /* bridge */ /* synthetic */ Cursor mo8525w() {
        return super.mo8525w();
    }

    @Override // com.digdroid.alman.dig.AbstractC2365h
    /* renamed from: x */
    public /* bridge */ /* synthetic */ void mo8526x(C2267e2.AbstractC2289v vVar) {
        super.mo8526x(vVar);
    }

    @Override // com.digdroid.alman.dig.AbstractC2365h
    /* renamed from: z */
    public /* bridge */ /* synthetic */ void mo8528z(C2267e2.AbstractC2290w wVar) {
        super.mo8528z(wVar);
    }
}
