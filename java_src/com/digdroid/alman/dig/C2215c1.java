package com.digdroid.alman.dig;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* renamed from: com.digdroid.alman.dig.c1 */
class C2215c1 extends AbstractC2551q1 {

    /* renamed from: f */
    String f7942f;

    /* renamed from: g */
    boolean[] f7943g;

    /* renamed from: h */
    AbstractC2216a f7944h;

    /* renamed from: i */
    C2885z0 f7945i;

    /* renamed from: j */
    C2464m f7946j;

    /* renamed from: com.digdroid.alman.dig.c1$a */
    interface AbstractC2216a {
        /* renamed from: a */
        String mo8146a(Cursor cursor);

        /* renamed from: b */
        C2464m mo8147b();

        /* renamed from: c */
        boolean mo8148c();

        /* renamed from: d */
        String mo8149d(Cursor cursor);

        /* renamed from: f */
        String mo8150f(Cursor cursor);

        /* renamed from: w */
        boolean mo8151w();
    }

    /* renamed from: com.digdroid.alman.dig.c1$b */
    class C2217b {

        /* renamed from: a */
        SquaredImageView f7947a;

        /* renamed from: b */
        LetterBox f7948b;

        /* renamed from: c */
        TextView f7949c;

        /* renamed from: d */
        TextView f7950d;

        C2217b() {
        }
    }

    public C2215c1(Activity activity, C2774t3 t3Var, Cursor cursor, float f, String str, boolean[] zArr, AbstractC2216a aVar) {
        super(activity, t3Var, cursor, f);
        this.f7942f = str;
        this.f7943g = zArr;
        this.f7946j = aVar.mo8147b();
        this.f7944h = aVar;
        this.f7945i = new C2885z0(activity, aVar.mo8148c());
    }

    public void bindView(View view, Context context, Cursor cursor) {
        boolean[] zArr;
        if (view != null && context != null && cursor != null) {
            try {
                C2217b bVar = (C2217b) view.getTag();
                String a = this.f7944h.mo8146a(cursor);
                int position = cursor.getPosition();
                if (position >= 0 && (zArr = this.f7943g) != null && position < zArr.length) {
                    this.f7945i.mo9512c(this.f7944h.mo8150f(cursor), this.f7943g[position], this.f7942f, this.f7946j.mo8725a(position), bVar.f7947a, bVar.f7948b, a);
                    if (!this.f7944h.mo8151w()) {
                        bVar.f7949c.setText(a);
                        String d = this.f7944h.mo8149d(cursor);
                        if (d == null) {
                            bVar.f7950d.setVisibility(8);
                        } else {
                            bVar.f7950d.setText(d);
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        View inflate = this.f8895e.inflate(R.layout.generic_grid_item, viewGroup, false);
        C2217b bVar = new C2217b();
        SquaredImageView squaredImageView = (SquaredImageView) inflate.findViewById(R.id.game_icon);
        bVar.f7947a = squaredImageView;
        squaredImageView.mo7992c(this.f8894d);
        LetterBox letterBox = (LetterBox) inflate.findViewById(R.id.letter);
        bVar.f7948b = letterBox;
        letterBox.mo7915f(this.f8894d);
        bVar.f7948b.setTag(new boolean[]{this.f7945i.f9714b, false, false});
        TextView textView = (TextView) inflate.findViewById(R.id.game_name);
        bVar.f7949c = textView;
        textView.setTextColor(this.f8892b.f9409e);
        TextView textView2 = (TextView) inflate.findViewById(R.id.game_info);
        bVar.f7950d = textView2;
        textView2.setTextColor(this.f8892b.f9410f);
        if (this.f7944h.mo8151w()) {
            bVar.f7949c.setVisibility(8);
            bVar.f7950d.setVisibility(8);
        }
        inflate.setTag(bVar);
        return inflate;
    }
}
