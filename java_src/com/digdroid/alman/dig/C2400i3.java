package com.digdroid.alman.dig;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.load.p122o.AbstractC1763j;
import java.io.File;
import java.util.Calendar;

/* renamed from: com.digdroid.alman.dig.i3 */
class C2400i3 extends AbstractC2551q1 {

    /* renamed from: f */
    String f8383f;

    /* renamed from: g */
    String f8384g;

    /* renamed from: h */
    Resources f8385h;

    /* renamed from: i */
    C2219c3 f8386i;

    /* renamed from: j */
    String f8387j;

    /* renamed from: k */
    boolean f8388k;

    /* renamed from: l */
    float f8389l;

    /* renamed from: m */
    float f8390m;

    /* renamed from: n */
    C2375h3 f8391n;

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.i3$a */
    public class C2401a {

        /* renamed from: a */
        SquaredImageView f8392a;

        /* renamed from: b */
        TextView f8393b;

        /* renamed from: c */
        TextView f8394c;

        /* renamed from: d */
        TextView f8395d;

        C2401a() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.i3$b */
    public class C2402b {

        /* renamed from: a */
        SquaredImageView f8397a;

        /* renamed from: b */
        TextView f8398b;

        /* renamed from: c */
        TextView f8399c;

        C2402b() {
        }
    }

    public C2400i3(MainActivity mainActivity, C2774t3 t3Var, Cursor cursor, float f, String str, boolean z) {
        super(mainActivity, t3Var, cursor, f);
        this.f8387j = str;
        this.f8388k = z;
        if (mainActivity != null) {
            this.f8386i = C2219c3.m9805k(mainActivity);
            this.f8391n = C2375h3.m10306r(mainActivity, C2775u.m11726e(mainActivity));
            File[] b = C2372h2.m10298b(mainActivity);
            if (b != null) {
                this.f8384g = b[0].getAbsolutePath() + "/Systems/icons";
            }
            String str2 = t3Var.f9416t;
            this.f8383f = str2;
            if (str2.equals("")) {
                this.f8383f = this.f8384g;
            }
            this.f8385h = mainActivity.getResources();
            this.f8389l = this.f8386i.mo8183f("systems_list_scale", 1.0f);
            this.f8390m = this.f8386i.mo8183f("systems_list_spacing", 1.0f);
        }
    }

    public void bindView(View view, Context context, Cursor cursor) {
        if (view != null && context != null && cursor != null && !cursor.isClosed() && cursor.getCount() > 0) {
            try {
                if (view.getTag() instanceof C2402b) {
                    mo8619c(view, context, cursor);
                } else {
                    mo8621e(view, context, cursor);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    public void mo8619c(View view, Context context, Cursor cursor) {
        C2402b bVar = (C2402b) view.getTag();
        SquaredImageView squaredImageView = bVar.f8397a;
        TextView textView = bVar.f8398b;
        TextView textView2 = bVar.f8399c;
        mo8620d(squaredImageView, context, cursor);
        if (!this.f8388k) {
            textView.setText(cursor.getString(1));
            String str = cursor.getInt(2) + " " + ((Object) this.f8385h.getText(R.string.games));
            if (this.f8387j.equals("date")) {
                Calendar instance = Calendar.getInstance();
                instance.setTimeInMillis(cursor.getLong(4));
                str = str + " (" + instance.get(1) + ")";
            }
            textView2.setText(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo8620d(ImageView imageView, Context context, Cursor cursor) {
        File file;
        String string = cursor.getString(3);
        String str = string + ".png";
        if (this.f8391n.mo8541A(string)) {
            file = new File(this.f8383f + "/" + str);
        } else {
            file = new File(this.f8384g + "/" + str);
        }
        C2457l1.m10577b(context).mo8860K(file).mo7762e(AbstractC1763j.f6903b).mo7754Y(true).mo7030p0(imageView);
    }

    /* renamed from: e */
    public void mo8621e(View view, Context context, Cursor cursor) {
        C2401a aVar = (C2401a) view.getTag();
        SquaredImageView squaredImageView = aVar.f8392a;
        TextView textView = aVar.f8393b;
        TextView textView2 = aVar.f8394c;
        TextView textView3 = aVar.f8395d;
        mo8620d(squaredImageView, context, cursor);
        textView.setText(cursor.getString(1));
        textView2.setText(context.getString(R.string.released).toLowerCase() + " " + mo8971b(cursor.getLong(4)));
        textView3.setText(cursor.getInt(2) + " " + ((Object) this.f8385h.getText(R.string.games)));
    }

    /* renamed from: f */
    public View mo8622f(Context context, Cursor cursor, ViewGroup viewGroup) {
        View inflate = this.f8887e.inflate(R.layout.system, viewGroup, false);
        C2402b bVar = new C2402b();
        SquaredImageView squaredImageView = (SquaredImageView) inflate.findViewById(R.id.system_icon);
        bVar.f8397a = squaredImageView;
        squaredImageView.mo7992c(this.f8886d);
        TextView textView = (TextView) inflate.findViewById(R.id.system_name);
        bVar.f8398b = textView;
        textView.setTextColor(this.f8884b.f9401e);
        TextView textView2 = (TextView) inflate.findViewById(R.id.system_info);
        bVar.f8399c = textView2;
        textView2.setTextColor(this.f8884b.f9402f);
        if (this.f8388k) {
            bVar.f8398b.setVisibility(8);
            bVar.f8399c.setVisibility(8);
        }
        inflate.setTag(bVar);
        return inflate;
    }

    /* renamed from: g */
    public View mo8623g(Context context, Cursor cursor, ViewGroup viewGroup) {
        View inflate = this.f8887e.inflate(R.layout.system_as_list, viewGroup, false);
        C2401a aVar = new C2401a();
        SquaredImageView squaredImageView = (SquaredImageView) inflate.findViewById(R.id.game_icon);
        aVar.f8392a = squaredImageView;
        squaredImageView.mo7992c(this.f8886d);
        TextView textView = (TextView) inflate.findViewById(R.id.game_name);
        aVar.f8393b = textView;
        textView.setTextColor(this.f8884b.f9401e);
        TextView textView2 = (TextView) inflate.findViewById(R.id.system);
        aVar.f8394c = textView2;
        textView2.setTextColor(this.f8884b.f9402f);
        TextView textView3 = (TextView) inflate.findViewById(R.id.played);
        aVar.f8395d = textView3;
        textView3.setTextColor(this.f8884b.f9402f);
        int round = Math.round(C2553q3.m11119e(10.0f));
        inflate.setPadding(inflate.getPaddingLeft(), round, inflate.getPaddingRight(), round);
        float d = C2553q3.m11118d(this.f8389l * 80.0f);
        aVar.f8392a.getLayoutParams().width = Math.round(d);
        aVar.f8392a.getLayoutParams().height = Math.round(d);
        aVar.f8393b.setTextSize(0, C2553q3.m11135u(this.f8389l * 18.0f));
        int round2 = Math.round(C2553q3.m11118d(this.f8389l * 20.0f));
        aVar.f8393b.setPadding(round2, 0, 0, 0);
        aVar.f8394c.setTextSize(0, C2553q3.m11135u(this.f8389l * 14.0f));
        aVar.f8394c.setPadding(round2, 0, 0, 0);
        aVar.f8395d.setTextSize(0, C2553q3.m11135u(this.f8389l * 14.0f));
        aVar.f8395d.setPadding(round2, 0, 0, 0);
        inflate.setTag(aVar);
        return inflate;
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        String q = this.f8386i.mo8193q("systems_list_type", "grid");
        q.hashCode();
        return !q.equals("grid") ? mo8623g(context, cursor, viewGroup) : mo8622f(context, cursor, viewGroup);
    }
}
