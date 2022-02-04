package com.digdroid.alman.dig;

import android.content.Context;
import android.database.Cursor;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.core.graphics.drawable.C0398a;

/* renamed from: com.digdroid.alman.dig.p0 */
class C2527p0 extends AbstractC2551q1 {

    /* renamed from: f */
    C2219c3 f8774f;

    /* renamed from: g */
    float f8775g;

    /* renamed from: h */
    float f8776h = this.f8774f.mo8183f("game_list_spacing", 1.0f);

    /* renamed from: i */
    C2550q0 f8777i;

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.p0$a */
    public class C2528a {

        /* renamed from: a */
        SquaredImageView f8778a;

        /* renamed from: b */
        TextView f8779b;

        /* renamed from: c */
        TextView f8780c;

        /* renamed from: d */
        TextView f8781d;

        /* renamed from: e */
        AppCompatRatingBar f8782e;

        /* renamed from: f */
        TextView f8783f;

        C2528a() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.p0$b */
    public class C2529b {

        /* renamed from: a */
        TextView f8785a;

        C2529b() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.p0$c */
    public class C2530c {

        /* renamed from: a */
        SquaredImageView f8787a;

        /* renamed from: b */
        TextView f8788b;

        /* renamed from: c */
        TextView f8789c;

        /* renamed from: d */
        AppCompatRatingBar f8790d;

        /* renamed from: e */
        TextView f8791e;

        C2530c() {
        }
    }

    public C2527p0(MainActivity mainActivity, C2774t3 t3Var, Cursor cursor, float f, C2775u uVar, String str, String str2, boolean z) {
        super(mainActivity, t3Var, cursor, f);
        this.f8777i = new C2550q0(mainActivity, t3Var, cursor, 1.0f, f, uVar, str, str2, z);
        C2219c3 k = C2219c3.m9805k(mainActivity.getApplicationContext());
        this.f8774f = k;
        this.f8775g = k.mo8183f("game_list_scale", 1.0f);
    }

    /* renamed from: j */
    private void m10908j(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0398a.m1977n(drawable, i);
        } else {
            drawable.setColorFilter(i, PorterDuff.Mode.SRC_IN);
        }
    }

    public void bindView(View view, Context context, Cursor cursor) {
        if (view != null && context != null && cursor != null && !cursor.isClosed()) {
            try {
                Object tag = view.getTag();
                if (tag instanceof C2529b) {
                    mo8887e(view, context, cursor);
                } else if (tag instanceof C2530c) {
                    mo8885c(view, context, cursor);
                } else if (tag instanceof C2528a) {
                    mo8886d(view, context, cursor);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: c */
    public void mo8885c(View view, Context context, Cursor cursor) {
        C2530c cVar = (C2530c) view.getTag();
        this.f8777i.mo8961c(cVar.f8787a, cVar.f8788b, cVar.f8789c, cVar.f8790d, cVar.f8791e, cursor);
    }

    /* renamed from: d */
    public void mo8886d(View view, Context context, Cursor cursor) {
        C2528a aVar = (C2528a) view.getTag();
        SquaredImageView squaredImageView = aVar.f8778a;
        TextView textView = aVar.f8779b;
        TextView textView2 = aVar.f8780c;
        TextView textView3 = aVar.f8781d;
        this.f8777i.mo8961c(squaredImageView, textView, null, aVar.f8782e, aVar.f8783f, cursor);
        if (!this.f8777i.f8865h.equals("rating") && !this.f8777i.f8865h.equals("crating")) {
            String h = this.f8777i.mo8966h(cursor);
            long g = this.f8777i.mo8965g(cursor);
            if (g > 0) {
                h = h + ", " + mo8971b(g);
            }
            textView2.setText(h);
        }
        textView3.setText(context.getString(R.string.played_for) + " " + this.f8777i.mo8964f(context, cursor));
    }

    /* renamed from: e */
    public void mo8887e(View view, Context context, Cursor cursor) {
        this.f8777i.mo8961c(null, ((C2529b) view.getTag()).f8785a, null, null, null, cursor);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C2530c mo8888f(View view) {
        C2530c cVar = new C2530c();
        SquaredImageView squaredImageView = (SquaredImageView) view.findViewById(R.id.game_icon);
        cVar.f8787a = squaredImageView;
        squaredImageView.mo7992c(this.f8886d);
        cVar.f8787a.setBackgroundColor(this.f8884b.f9400d);
        TextView textView = (TextView) view.findViewById(R.id.game_name);
        cVar.f8788b = textView;
        textView.setTextColor(this.f8884b.f9401e);
        TextView textView2 = (TextView) view.findViewById(R.id.game_info);
        cVar.f8789c = textView2;
        textView2.setTextColor(this.f8884b.f9402f);
        cVar.f8790d = (AppCompatRatingBar) view.findViewById(R.id.game_rating);
        TextView textView3 = (TextView) view.findViewById(R.id.rating_text);
        cVar.f8791e = textView3;
        textView3.setTextColor(this.f8884b.f9403g);
        C2550q0 q0Var = this.f8777i;
        int i = 8;
        if (q0Var.f8876s) {
            cVar.f8788b.setVisibility(8);
            cVar.f8789c.setVisibility(8);
        } else if (q0Var.f8865h.equals("rating") || this.f8777i.f8865h.equals("crating")) {
            cVar.f8789c.setVisibility(8);
            view.findViewById(R.id.rating_bar).setVisibility(0);
            TextView textView4 = cVar.f8791e;
            if (!this.f8777i.f8865h.equals("rating")) {
                i = 0;
            }
            textView4.setVisibility(i);
            LayerDrawable layerDrawable = (LayerDrawable) cVar.f8790d.getProgressDrawable();
            m10908j(layerDrawable.getDrawable(2), -8448);
            m10908j(layerDrawable.getDrawable(1), -2138535800);
            m10908j(layerDrawable.getDrawable(0), -2138535800);
            view.setTag(cVar);
            return cVar;
        } else {
            cVar.f8789c.setVisibility(0);
        }
        view.findViewById(R.id.rating_bar).setVisibility(8);
        view.setTag(cVar);
        return cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public View mo8889g(Context context, Cursor cursor, ViewGroup viewGroup) {
        View inflate = this.f8887e.inflate(R.layout.game, viewGroup, false);
        mo8888f(inflate);
        return inflate;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public View mo8890h(Context context, Cursor cursor, ViewGroup viewGroup) {
        View inflate = this.f8887e.inflate(R.layout.game_as_list, viewGroup, false);
        C2528a aVar = new C2528a();
        SquaredImageView squaredImageView = (SquaredImageView) inflate.findViewById(R.id.game_icon);
        aVar.f8778a = squaredImageView;
        squaredImageView.mo7992c(this.f8886d);
        aVar.f8778a.setBackgroundColor(this.f8884b.f9400d);
        TextView textView = (TextView) inflate.findViewById(R.id.game_name);
        aVar.f8779b = textView;
        textView.setTextColor(this.f8884b.f9401e);
        TextView textView2 = (TextView) inflate.findViewById(R.id.system);
        aVar.f8780c = textView2;
        textView2.setTextColor(this.f8884b.f9402f);
        TextView textView3 = (TextView) inflate.findViewById(R.id.played);
        aVar.f8781d = textView3;
        textView3.setTextColor(this.f8884b.f9402f);
        aVar.f8782e = (AppCompatRatingBar) inflate.findViewById(R.id.game_rating);
        TextView textView4 = (TextView) inflate.findViewById(R.id.rating_text);
        aVar.f8783f = textView4;
        textView4.setTextColor(this.f8884b.f9403g);
        int round = Math.round(C2553q3.m11118d(this.f8776h * 10.0f));
        inflate.setPadding(inflate.getPaddingLeft(), round, inflate.getPaddingRight(), round);
        float d = C2553q3.m11118d(this.f8775g * 80.0f);
        aVar.f8778a.getLayoutParams().width = Math.round(d);
        aVar.f8778a.getLayoutParams().height = Math.round(d);
        aVar.f8779b.setTextSize(0, C2553q3.m11135u(this.f8775g * 18.0f));
        int round2 = Math.round(C2553q3.m11118d(this.f8775g * 20.0f));
        aVar.f8779b.setPadding(round2, 0, 0, 0);
        aVar.f8780c.setTextSize(0, C2553q3.m11135u(this.f8775g * 14.0f));
        aVar.f8781d.setTextSize(0, C2553q3.m11135u(this.f8775g * 12.0f));
        aVar.f8781d.setPadding(round2, 0, 0, 0);
        inflate.findViewById(R.id.system_rating).setPadding(round2, 0, 0, 0);
        int i = 8;
        if (this.f8777i.f8865h.equals("rating") || this.f8777i.f8865h.equals("crating")) {
            aVar.f8780c.setVisibility(8);
            inflate.findViewById(R.id.rating_bar).setVisibility(0);
            TextView textView5 = aVar.f8783f;
            if (!this.f8777i.f8865h.equals("rating")) {
                i = 0;
            }
            textView5.setVisibility(i);
            LayerDrawable layerDrawable = (LayerDrawable) aVar.f8782e.getProgressDrawable();
            m10908j(layerDrawable.getDrawable(2), -8448);
            m10908j(layerDrawable.getDrawable(1), -2138535800);
            m10908j(layerDrawable.getDrawable(0), -2138535800);
        } else {
            aVar.f8780c.setVisibility(0);
            inflate.findViewById(R.id.rating_bar).setVisibility(8);
        }
        inflate.setTag(aVar);
        return inflate;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public View mo8891i(Context context, Cursor cursor, ViewGroup viewGroup) {
        View inflate = this.f8887e.inflate(R.layout.game_title, viewGroup, false);
        C2529b bVar = new C2529b();
        TextView textView = (TextView) inflate.findViewById(R.id.game_name);
        bVar.f8785a = textView;
        textView.setTextColor(this.f8884b.f9401e);
        float f = this.f8774f.mo8183f("game_title_scale", 1.0f);
        bVar.f8785a.setTextSize(0, C2553q3.m11135u(18.0f * f));
        int round = Math.round(C2553q3.m11119e(9.0f * f));
        int round2 = Math.round(C2553q3.m11118d(f * 15.0f));
        bVar.f8785a.setPadding(round2, round, round2, 0);
        inflate.setTag(bVar);
        return inflate;
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        String b = this.f8774f.mo8179b();
        b.hashCode();
        char c = 65535;
        switch (b.hashCode()) {
            case 3181382:
                if (b.equals("grid")) {
                    c = 0;
                    break;
                }
                break;
            case 3322014:
                if (b.equals("list")) {
                    c = 1;
                    break;
                }
                break;
            case 110371416:
                if (b.equals("title")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return mo8889g(context, cursor, viewGroup);
            case 1:
                return mo8890h(context, cursor, viewGroup);
            case 2:
                return mo8891i(context, cursor, viewGroup);
            default:
                return null;
        }
    }
}
