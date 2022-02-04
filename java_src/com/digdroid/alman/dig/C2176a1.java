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
    String f7843l;

    /* renamed from: m */
    boolean[] f7844m;

    /* renamed from: n */
    Activity f7845n;

    /* renamed from: o */
    C2215c1.AbstractC2216a f7846o;

    /* renamed from: p */
    C2885z0 f7847p;

    /* renamed from: q */
    C2464m f7848q;

    /* renamed from: com.digdroid.alman.dig.a1$a */
    public class C2177a extends RecyclerView.AbstractC0655d0 {

        /* renamed from: t */
        SquaredImageView f7849t;

        /* renamed from: u */
        TextView f7850u;

        /* renamed from: v */
        TextView f7851v;

        /* renamed from: w */
        TextView f7852w;

        public C2177a(View view) {
            super(view);
            this.f7849t = (SquaredImageView) view.findViewById(R.id.game_icon);
            TextView textView = (TextView) view.findViewById(R.id.letter);
            this.f7850u = textView;
            textView.setTag(new boolean[]{C2176a1.this.f7847p.f9714b, false, false});
            TextView textView2 = (TextView) view.findViewById(R.id.game_name);
            this.f7851v = textView2;
            textView2.setTextColor(C2176a1.this.f8296c.f9409e);
            TextView textView3 = (TextView) view.findViewById(R.id.game_info);
            this.f7852w = textView3;
            textView3.setTextColor(C2176a1.this.f8296c.f9410f);
            if (C2176a1.this.f7846o.mo8151w()) {
                this.f7851v.setVisibility(8);
                this.f7852w.setVisibility(8);
            }
        }
    }

    public C2176a1(MainActivity mainActivity, C2774t3 t3Var, Cursor cursor, float f, float f2, String str, boolean[] zArr, C2215c1.AbstractC2216a aVar) {
        super(mainActivity, t3Var, cursor, f, f2);
        this.f7843l = str;
        this.f7844m = zArr;
        this.f7845n = mainActivity;
        this.f7848q = aVar.mo8147b();
        this.f7846o = aVar;
        this.f7847p = new C2885z0(mainActivity, aVar.mo8148c());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0658g
    /* renamed from: j */
    public void mo3581j(RecyclerView.AbstractC0655d0 d0Var, int i) {
        Cursor cursor;
        if (d0Var != null && (cursor = this.f8297d) != null && !cursor.isClosed() && i < this.f8298e && this.f8297d.moveToPosition(i)) {
            try {
                C2177a aVar = (C2177a) d0Var;
                TextView textView = aVar.f7851v;
                TextView textView2 = aVar.f7852w;
                String a = this.f7846o.mo8146a(this.f8297d);
                this.f7847p.mo9512c(this.f7846o.mo8150f(this.f8297d), this.f7844m[i], this.f7843l, this.f7848q.mo8725a(i), aVar.f7849t, aVar.f7850u, a);
                if (!this.f7846o.mo8151w()) {
                    textView.setText(a);
                    String d = this.f7846o.mo8149d(this.f8297d);
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
        ((SquaredImageView) inflate.findViewById(R.id.game_icon)).mo7992c(this.f8301h);
        ((LetterBox) inflate.findViewById(R.id.letter)).mo7915f(this.f8301h);
        inflate.setLayoutParams(new LinearLayout.LayoutParams(Math.round(((float) this.f8299f) * this.f8301h * this.f8300g), -2));
        return new C2177a(inflate);
    }
}
