package com.digdroid.alman.dig;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: com.digdroid.alman.dig.e1 */
class C2264e1 extends AbstractC2551q1 {

    /* renamed from: f */
    String f8072f;

    /* renamed from: g */
    boolean[] f8073g;

    /* renamed from: h */
    AbstractC2265a f8074h;

    /* renamed from: i */
    C2885z0 f8075i;

    /* renamed from: j */
    C2464m f8076j;

    /* renamed from: k */
    Resources f8077k;

    /* renamed from: l */
    float f8078l;

    /* renamed from: m */
    float f8079m;

    /* renamed from: com.digdroid.alman.dig.e1$a */
    interface AbstractC2265a {
        /* renamed from: a */
        String mo8309a(Cursor cursor);

        /* renamed from: b */
        C2464m mo8310b();

        /* renamed from: c */
        boolean mo8311c();

        /* renamed from: d */
        String mo8312d(Cursor cursor);

        /* renamed from: f */
        String mo8313f(Cursor cursor);

        /* renamed from: k */
        float mo8314k();

        /* renamed from: m */
        float mo8315m();
    }

    /* renamed from: com.digdroid.alman.dig.e1$b */
    class C2266b {

        /* renamed from: a */
        SquaredImageView f8080a;

        /* renamed from: b */
        LetterBox f8081b;

        /* renamed from: c */
        TextView f8082c;

        /* renamed from: d */
        TextView f8083d;

        C2266b() {
        }
    }

    public C2264e1(MainActivity mainActivity, C2774t3 t3Var, Cursor cursor, float f, String str, boolean[] zArr, AbstractC2265a aVar) {
        super(mainActivity, t3Var, cursor, f);
        this.f8072f = str;
        this.f8073g = zArr;
        this.f8076j = aVar.mo8310b();
        this.f8074h = aVar;
        this.f8078l = aVar.mo8314k();
        this.f8079m = aVar.mo8315m();
        this.f8075i = new C2885z0(mainActivity, aVar.mo8311c());
        this.f8077k = mainActivity.getResources();
    }

    public void bindView(View view, Context context, Cursor cursor) {
        if (view != null && context != null && cursor != null) {
            try {
                C2266b bVar = (C2266b) view.getTag();
                String a = this.f8074h.mo8309a(cursor);
                int position = cursor.getPosition();
                if (position >= 0 && position < this.f8073g.length) {
                    this.f8075i.mo9512c(this.f8074h.mo8313f(cursor), this.f8073g[position], this.f8072f, this.f8076j.mo8725a(position), bVar.f8080a, bVar.f8081b, a);
                    bVar.f8082c.setText(a);
                    String d = this.f8074h.mo8312d(cursor);
                    if (d == null) {
                        bVar.f8083d.setVisibility(8);
                    } else {
                        bVar.f8083d.setText(d);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        View inflate = this.f8895e.inflate(R.layout.generic_list_item, viewGroup, false);
        C2266b bVar = new C2266b();
        SquaredImageView squaredImageView = (SquaredImageView) inflate.findViewById(R.id.game_icon);
        bVar.f8080a = squaredImageView;
        squaredImageView.mo7992c(this.f8894d);
        LetterBox letterBox = (LetterBox) inflate.findViewById(R.id.letter);
        bVar.f8081b = letterBox;
        letterBox.mo7915f(this.f8894d);
        bVar.f8081b.setTag(new boolean[]{this.f8075i.f9714b, true, false});
        TextView textView = (TextView) inflate.findViewById(R.id.game_name);
        bVar.f8082c = textView;
        textView.setTextColor(this.f8892b.f9409e);
        TextView textView2 = (TextView) inflate.findViewById(R.id.game_info);
        bVar.f8083d = textView2;
        textView2.setTextColor(this.f8892b.f9410f);
        int round = Math.round(C2553q3.m11119e(this.f8079m * 10.0f));
        inflate.setPadding(inflate.getPaddingLeft(), round, inflate.getPaddingRight(), round);
        ((RelativeLayout) inflate.findViewById(R.id.icon_box)).setLayoutParams(new ConstraintLayout.C0312b(Math.round(C2553q3.m11119e(this.f8078l * 50.0f)), -2));
        bVar.f8082c.setTextSize(0, C2553q3.m11135u(this.f8078l * 18.0f));
        int round2 = Math.round(C2553q3.m11118d(this.f8078l * 20.0f));
        bVar.f8082c.setPadding(round2, 0, 0, 0);
        bVar.f8083d.setTextSize(0, C2553q3.m11135u(this.f8078l * 14.0f));
        bVar.f8083d.setPadding(round2, 0, 0, 0);
        inflate.setTag(bVar);
        return inflate;
    }
}
