package com.digdroid.alman.dig;

import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.digdroid.alman.dig.C2446j3;

/* renamed from: com.digdroid.alman.dig.n3 */
class C2500n3 extends C2446j3 {

    /* renamed from: com.digdroid.alman.dig.n3$a */
    class C2501a extends C2446j3.C2447a {

        /* renamed from: x */
        View f8656x;

        public C2501a(View view) {
            super(view);
            this.f8656x = view;
        }
    }

    public C2500n3(MainActivity mainActivity, C2774t3 t3Var, Cursor cursor, float f, float f2, String str, boolean z) {
        super(mainActivity, t3Var, cursor, f, f2, str, z);
        double d = (double) this.f8291f;
        Double.isNaN(d);
        this.f8291f = (int) Math.round((d * 3.0d) / 2.0d);
    }

    @Override // com.digdroid.alman.dig.C2446j3, androidx.recyclerview.widget.RecyclerView.AbstractC0658g
    /* renamed from: j */
    public void mo3581j(RecyclerView.AbstractC0655d0 d0Var, int i) {
        super.mo3581j(d0Var, i);
        if (d0Var != null) {
            mo8527y(((C2501a) d0Var).f8656x, i);
        }
    }

    @Override // com.digdroid.alman.dig.C2446j3, androidx.recyclerview.widget.RecyclerView.AbstractC0658g
    /* renamed from: l */
    public RecyclerView.AbstractC0655d0 mo3582l(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.carousel_system, viewGroup, false);
        ((SquaredImageView) inflate.findViewById(R.id.system_icon)).mo7992c(this.f8293h);
        inflate.setLayoutParams(new LinearLayout.LayoutParams(Math.round(((float) this.f8291f) * this.f8293h * this.f8292g), -2));
        return new C2501a(inflate);
    }
}
