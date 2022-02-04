package com.digdroid.alman.dig;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* renamed from: com.digdroid.alman.dig.g1 */
class C2324g1 extends AbstractC2551q1 {

    /* renamed from: f */
    AbstractC2325a f8200f;

    /* renamed from: g */
    float f8201g;

    /* renamed from: h */
    LayoutInflater f8202h;

    /* renamed from: i */
    int f8203i = this.f8206l.mo9510a();

    /* renamed from: j */
    float f8204j;

    /* renamed from: k */
    float f8205k;

    /* renamed from: l */
    C2885z0 f8206l;

    /* renamed from: m */
    C2464m f8207m;

    /* renamed from: com.digdroid.alman.dig.g1$a */
    interface AbstractC2325a {
        /* renamed from: R */
        int mo8424R(Cursor cursor);

        /* renamed from: a */
        String mo8458a(Cursor cursor);

        /* renamed from: b */
        C2464m mo8310b();

        /* renamed from: c */
        boolean mo8459c();

        /* renamed from: h */
        float mo8460h();

        /* renamed from: o */
        float mo8461o();
    }

    public C2324g1(Activity activity, C2774t3 t3Var, Cursor cursor, float f, AbstractC2325a aVar) {
        super(activity, t3Var, cursor, f);
        this.f8207m = aVar.mo8310b();
        this.f8200f = aVar;
        C2885z0 z0Var = new C2885z0(activity, aVar.mo8459c());
        this.f8206l = z0Var;
        this.f8201g = z0Var.mo9511b();
        this.f8204j = aVar.mo8460h();
        this.f8205k = aVar.mo8461o();
        this.f8202h = LayoutInflater.from(activity);
    }

    public void bindView(View view, Context context, Cursor cursor) {
        if (view != null && context != null && cursor != null && !cursor.isClosed() && cursor.getCount() > 0) {
            int a = this.f8207m.mo8725a(cursor.getPosition());
            TextView textView = (TextView) view.findViewById(R.id.genre_name);
            this.f8206l.mo9514e(textView, this.f8200f.mo8458a(cursor));
            textView.setTextColor(a);
            textView.setTextSize(0, this.f8201g * this.f8204j);
            TextView textView2 = (TextView) view.findViewById(R.id.genre_count);
            int R = this.f8200f.mo8424R(cursor);
            C2885z0 z0Var = this.f8206l;
            String str = "";
            if (R >= 0) {
                str = str + R;
            }
            z0Var.mo9514e(textView2, str);
            textView2.setTextColor(a);
            textView2.setTextSize(0, this.f8201g * this.f8204j);
            view.setPadding(0, Math.round(((float) this.f8203i) * this.f8204j * this.f8205k), 0, Math.round(((float) this.f8203i) * this.f8204j * this.f8205k));
        }
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f8202h.inflate(R.layout.genre, viewGroup, false);
    }
}
