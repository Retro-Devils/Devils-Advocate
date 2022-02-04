package com.digdroid.alman.dig;

import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.digdroid.alman.dig.C2176a1;
import com.digdroid.alman.dig.C2215c1;

/* renamed from: com.digdroid.alman.dig.h1 */
class C2370h1 extends C2176a1 {

    /* renamed from: com.digdroid.alman.dig.h1$a */
    class C2371a extends C2176a1.C2177a {

        /* renamed from: y */
        View f8324y;

        public C2371a(View view) {
            super(view);
            this.f8324y = view;
        }
    }

    public C2370h1(MainActivity mainActivity, C2774t3 t3Var, Cursor cursor, float f, float f2, String str, boolean[] zArr, C2215c1.AbstractC2216a aVar) {
        super(mainActivity, t3Var, cursor, f, f2, str, zArr, aVar);
        double d = (double) this.f8299f;
        Double.isNaN(d);
        this.f8299f = (int) Math.round((d * 3.0d) / 2.0d);
    }

    @Override // com.digdroid.alman.dig.C2176a1, androidx.recyclerview.widget.RecyclerView.AbstractC0658g
    /* renamed from: j */
    public void mo3581j(RecyclerView.AbstractC0655d0 d0Var, int i) {
        super.mo3581j(d0Var, i);
        if (d0Var != null) {
            mo8527y(((C2371a) d0Var).f8324y, i);
        }
    }

    @Override // com.digdroid.alman.dig.C2176a1, androidx.recyclerview.widget.RecyclerView.AbstractC0658g
    /* renamed from: l */
    public RecyclerView.AbstractC0655d0 mo3582l(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.generic_carousel_item, viewGroup, false);
        ((SquaredImageView) inflate.findViewById(R.id.game_icon)).mo7992c(this.f8301h);
        ((LetterBox) inflate.findViewById(R.id.letter)).mo7915f(this.f8301h);
        inflate.setLayoutParams(new LinearLayout.LayoutParams(Math.round(((float) this.f8299f) * this.f8301h * this.f8300g), -2));
        return new C2371a(inflate);
    }
}
