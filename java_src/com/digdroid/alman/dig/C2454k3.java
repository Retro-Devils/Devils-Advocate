package com.digdroid.alman.dig;

import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.digdroid.alman.dig.C2446j3;

/* renamed from: com.digdroid.alman.dig.k3 */
class C2454k3 extends C2446j3 {

    /* renamed from: t */
    int f8576t;

    public C2454k3(MainActivity mainActivity, C2774t3 t3Var, Cursor cursor, float f, float f2, String str, boolean z) {
        super(mainActivity, t3Var, cursor, f, f2, str, z);
        double d = (double) this.f8299f;
        Double.isNaN(d);
        int round = (int) Math.round((d * 3.0d) / 2.0d);
        this.f8299f = round;
        double d2 = (double) round;
        Double.isNaN(d2);
        this.f8576t = (int) Math.round(d2 / 30.0d);
    }

    @Override // com.digdroid.alman.dig.C2446j3, androidx.recyclerview.widget.RecyclerView.AbstractC0658g
    /* renamed from: l */
    public RecyclerView.AbstractC0655d0 mo3582l(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.carousel_system, viewGroup, false);
        ((SquaredImageView) inflate.findViewById(R.id.system_icon)).mo7992c(this.f8301h);
        int i2 = this.f8576t;
        inflate.setPadding(i2, 0, i2, 0);
        return new C2446j3.C2447a(inflate);
    }
}
