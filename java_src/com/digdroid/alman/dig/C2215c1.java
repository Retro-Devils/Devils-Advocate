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
    String f7934f;

    /* renamed from: g */
    boolean[] f7935g;

    /* renamed from: h */
    AbstractC2216a f7936h;

    /* renamed from: i */
    C2885z0 f7937i;

    /* renamed from: j */
    C2464m f7938j;

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
        SquaredImageView f7939a;

        /* renamed from: b */
        LetterBox f7940b;

        /* renamed from: c */
        TextView f7941c;

        /* renamed from: d */
        TextView f7942d;

        C2217b() {
        }
    }

    public C2215c1(Activity activity, C2774t3 t3Var, Cursor cursor, float f, String str, boolean[] zArr, AbstractC2216a aVar) {
        super(activity, t3Var, cursor, f);
        this.f7934f = str;
        this.f7935g = zArr;
        this.f7938j = aVar.mo8147b();
        this.f7936h = aVar;
        this.f7937i = new C2885z0(activity, aVar.mo8148c());
    }

    public void bindView(View view, Context context, Cursor cursor) {
        boolean[] zArr;
        if (view != null && context != null && cursor != null) {
            try {
                C2217b bVar = (C2217b) view.getTag();
                String a = this.f7936h.mo8146a(cursor);
                int position = cursor.getPosition();
                if (position >= 0 && (zArr = this.f7935g) != null && position < zArr.length) {
                    this.f7937i.mo9512c(this.f7936h.mo8150f(cursor), this.f7935g[position], this.f7934f, this.f7938j.mo8725a(position), bVar.f7939a, bVar.f7940b, a);
                    if (!this.f7936h.mo8151w()) {
                        bVar.f7941c.setText(a);
                        String d = this.f7936h.mo8149d(cursor);
                        if (d == null) {
                            bVar.f7942d.setVisibility(8);
                        } else {
                            bVar.f7942d.setText(d);
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        View inflate = this.f8887e.inflate(R.layout.generic_grid_item, viewGroup, false);
        C2217b bVar = new C2217b();
        SquaredImageView squaredImageView = (SquaredImageView) inflate.findViewById(R.id.game_icon);
        bVar.f7939a = squaredImageView;
        squaredImageView.mo7992c(this.f8886d);
        LetterBox letterBox = (LetterBox) inflate.findViewById(R.id.letter);
        bVar.f7940b = letterBox;
        letterBox.mo7915f(this.f8886d);
        bVar.f7940b.setTag(new boolean[]{this.f7937i.f9706b, false, false});
        TextView textView = (TextView) inflate.findViewById(R.id.game_name);
        bVar.f7941c = textView;
        textView.setTextColor(this.f8884b.f9401e);
        TextView textView2 = (TextView) inflate.findViewById(R.id.game_info);
        bVar.f7942d = textView2;
        textView2.setTextColor(this.f8884b.f9402f);
        if (this.f7936h.mo8151w()) {
            bVar.f7941c.setVisibility(8);
            bVar.f7942d.setVisibility(8);
        }
        inflate.setTag(bVar);
        return inflate;
    }
}
