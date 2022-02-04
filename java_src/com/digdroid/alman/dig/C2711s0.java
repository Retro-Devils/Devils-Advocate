package com.digdroid.alman.dig;

import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.digdroid.alman.dig.s0 */
class C2711s0 extends C2576r0 {
    public C2711s0(MainActivity mainActivity, C2774t3 t3Var, Cursor cursor, float f, float f2, C2775u uVar, String str, String str2, boolean z) {
        super(mainActivity, t3Var, cursor, f, f2, uVar, str, str2, z);
        double d = (double) this.f8291f;
        Double.isNaN(d);
        this.f8291f = (int) Math.round((d * 3.0d) / 2.0d);
    }

    @Override // com.digdroid.alman.dig.C2576r0, androidx.recyclerview.widget.RecyclerView.AbstractC0658g
    /* renamed from: l */
    public RecyclerView.AbstractC0655d0 mo3582l(ViewGroup viewGroup, int i) {
        return this.f8955l.mo8967i(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.coverflow_games, viewGroup, false), (float) this.f8291f);
    }
}
