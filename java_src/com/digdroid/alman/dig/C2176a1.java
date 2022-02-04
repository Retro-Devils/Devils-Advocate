package com.digdroid.alman.dig;

import android.app.Activity;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.digdroid.alman.dig.C2215c1;

/* renamed from: com.digdroid.alman.dig.a1 */
class C2176a1 extends AbstractC2365h {

    /* renamed from: l */
    String f7835l;

    /* renamed from: m */
    boolean[] f7836m;

    /* renamed from: n */
    Activity f7837n;

    /* renamed from: o */
    C2215c1.AbstractC2216a f7838o;

    /* renamed from: p */
    C2885z0 f7839p;

    /* renamed from: q */
    C2464m f7840q;

    /* renamed from: com.digdroid.alman.dig.a1$a */
    public class C2177a extends RecyclerView.AbstractC0655d0 {

        /* renamed from: t */
        SquaredImageView f7841t;

        /* renamed from: u */
        TextView f7842u;

        /* renamed from: v */
        TextView f7843v;

        /* renamed from: w */
        TextView f7844w;

        public C2177a(View view) {
            super(view);
            this.f7841t = (SquaredImageView) view.findViewById(R.id.game_icon);
            TextView textView = (TextView) view.findViewById(R.id.letter);
            this.f7842u = textView;
            textView.setTag(new boolean[]{C2176a1.this.f7839p.f9706b, false, false});
            TextView textView2 = (TextView) view.findViewById(R.id.game_name);
            this.f7843v = textView2;
            textView2.setTextColor(C2176a1.this.f8288c.f9401e);
            TextView textView3 = (TextView) view.findViewById(R.id.game_info);
            this.f7844w = textView3;
            textView3.setTextColor(C2176a1.this.f8288c.f9402f);
            if (C2176a1.this.f7838o.mo8151w()) {
                this.f7843v.setVisibility(8);
                this.f7844w.setVisibility(8);
            }
        }
    }

    public C2176a1(MainActivity mainActivity, C2774t3 t3Var, Cursor cursor, float f, float f2, String str, boolean[] zArr, C2215c1.AbstractC2216a aVar) {
        super(mainActivity, t3Var, cursor, f, f2);
        this.f7835l = str;
        this.f7836m = zArr;
        this.f7837n = mainActivity;
        this.f7840q = aVar.mo8147b();
        this.f7838o = aVar;
        this.f7839p = new C2885z0(mainActivity, aVar.mo8148c());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0658g
    /* renamed from: j */
    public void mo3581j(RecyclerView.AbstractC0655d0 d0Var, int i) {
        Cursor cursor;
        if (d0Var != null && (cursor = this.f8289d) != null && !cursor.isClosed() && i < this.f8290e && this.f8289d.moveToPosition(i)) {
            try {
                C2177a aVar = (C2177a) d0Var;
                TextView textView = aVar.f7843v;
                TextView textView2 = aVar.f7844w;
                String a = this.f7838o.mo8146a(this.f8289d);
                this.f7839p.mo9512c(this.f7838o.mo8150f(this.f8289d), this.f7836m[i], this.f7835l, this.f7840q.mo8725a(i), aVar.f7841t, aVar.f7842u, a);
                if (!this.f7838o.mo8151w()) {
                    textView.setText(a);
                    String d = this.f7838o.mo8149d(this.f8289d);
                    if (d == null) {
                        textView2.setVisibility(8);
                    } else {
                        textView2.setText(d);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0658g
    /* renamed from: l */
    public RecyclerView.AbstractC0655d0 mo3582l(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.generic_carousel_item, viewGroup, false);
        ((SquaredImageView) inflate.findViewById(R.id.game_icon)).mo7992c(this.f8293h);
        ((LetterBox) inflate.findViewById(R.id.letter)).mo7915f(this.f8293h);
        inflate.setLayoutParams(new LinearLayout.LayoutParams(Math.round(((float) this.f8291f) * this.f8293h * this.f8292g), -2));
        return new C2177a(inflate);
    }
}
