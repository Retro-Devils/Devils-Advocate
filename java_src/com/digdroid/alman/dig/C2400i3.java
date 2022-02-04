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
    String f8391f;

    /* renamed from: g */
    String f8392g;

    /* renamed from: h */
    Resources f8393h;

    /* renamed from: i */
    C2219c3 f8394i;

    /* renamed from: j */
    String f8395j;

    /* renamed from: k */
    boolean f8396k;

    /* renamed from: l */
    float f8397l;

    /* renamed from: m */
    float f8398m;

    /* renamed from: n */
    C2375h3 f8399n;

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.i3$a */
    public class C2401a {

        /* renamed from: a */
        SquaredImageView f8400a;

        /* renamed from: b */
        TextView f8401b;

        /* renamed from: c */
        TextView f8402c;

        /* renamed from: d */
        TextView f8403d;

        C2401a() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.i3$b */
    public class C2402b {

        /* renamed from: a */
        SquaredImageView f8405a;

        /* renamed from: b */
        TextView f8406b;

        /* renamed from: c */
        TextView f8407c;

        C2402b() {
        }
    }

    public C2400i3(MainActivity mainActivity, C2774t3 t3Var, Cursor cursor, float f, String str, boolean z) {
        super(mainActivity, t3Var, cursor, f);
        this.f8395j = str;
        this.f8396k = z;
        if (mainActivity != null) {
            this.f8394i = C2219c3.m9805k(mainActivity);
            this.f8399n = C2375h3.m10306r(mainActivity, C2775u.m11726e(mainActivity));
            File[] b = C2372h2.m10298b(mainActivity);
            if (b != null) {
                this.f8392g = b[0].getAbsolutePath() + "/Systems/icons";
            }
            String str2 = t3Var.f9424t;
            this.f8391f = str2;
            if (str2.equals("")) {
                this.f8391f = this.f8392g;
            }
            this.f8393h = mainActivity.getResources();
            this.f8397l = this.f8394i.mo8183f("systems_list_scale", 1.0f);
            this.f8398m = this.f8394i.mo8183f("systems_list_spacing", 1.0f);
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
        SquaredImageView squaredImageView = bVar.f8405a;
        TextView textView = bVar.f8406b;
        TextView textView2 = bVar.f8407c;
        mo8620d(squaredImageView, context, cursor);
        if (!this.f8396k) {
            textView.setText(cursor.getString(1));
            String str = cursor.getInt(2) + " " + ((Object) this.f8393h.getText(R.string.games));
            if (this.f8395j.equals("date")) {
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
        if (this.f8399n.mo8541A(string)) {
            file = new File(this.f8391f + "/" + str);
        } else {
            file = new File(this.f8392g + "/" + str);
        }
        C2457l1.m10577b(context).mo8860K(file).mo7762e(AbstractC1763j.f6911b).mo7754Y(true).mo7030p0(imageView);
    }

    /* renamed from: e */
    public void mo8621e(View view, Context context, Cursor cursor) {
        C2401a aVar = (C2401a) view.getTag();
        SquaredImageView squaredImageView = aVar.f8400a;
        TextView textView = aVar.f8401b;
        TextView textView2 = aVar.f8402c;
        TextView textView3 = aVar.f8403d;
        mo8620d(squaredImageView, context, cursor);
        textView.setText(cursor.getString(1));
        textView2.setText(context.getString(R.string.released).toLowerCase() + " " + mo8971b(cursor.getLong(4)));
        textView3.setText(cursor.getInt(2) + " " + ((Object) this.f8393h.getText(R.string.games)));
    }

    /* renamed from: f */
    public View mo8622f(Context context, Cursor cursor, ViewGroup viewGroup) {
        View inflate = this.f8895e.inflate(R.layout.system, viewGroup, false);
        C2402b bVar = new C2402b();
        SquaredImageView squaredImageView = (SquaredImageView) inflate.findViewById(R.id.system_icon);
        bVar.f8405a = squaredImageView;
        squaredImageView.mo7992c(this.f8894d);
        TextView textView = (TextView) inflate.findViewById(R.id.system_name);
        bVar.f8406b = textView;
        textView.setTextColor(this.f8892b.f9409e);
        TextView textView2 = (TextView) inflate.findViewById(R.id.system_info);
        bVar.f8407c = textView2;
        textView2.setTextColor(this.f8892b.f9410f);
        if (this.f8396k) {
            bVar.f8406b.setVisibility(8);
            bVar.f8407c.setVisibility(8);
        }
        inflate.setTag(bVar);
        return inflate;
    }

    /* renamed from: g */
    public View mo8623g(Context context, Cursor cursor, ViewGroup viewGroup) {
        View inflate = this.f8895e.inflate(R.layout.system_as_list, viewGroup, false);
        C2401a aVar = new C2401a();
        SquaredImageView squaredImageView = (SquaredImageView) inflate.findViewById(R.id.game_icon);
        aVar.f8400a = squaredImageView;
        squaredImageView.mo7992c(this.f8894d);
        TextView textView = (TextView) inflate.findViewById(R.id.game_name);
        aVar.f8401b = textView;
        textView.setTextColor(this.f8892b.f9409e);
        TextView textView2 = (TextView) inflate.findViewById(R.id.system);
        aVar.f8402c = textView2;
        textView2.setTextColor(this.f8892b.f9410f);
        TextView textView3 = (TextView) inflate.findViewById(R.id.played);
        aVar.f8403d = textView3;
        textView3.setTextColor(this.f8892b.f9410f);
        int round = Math.round(C2553q3.m11119e(10.0f));
        inflate.setPadding(inflate.getPaddingLeft(), round, inflate.getPaddingRight(), round);
        float d = C2553q3.m11118d(this.f8397l * 80.0f);
        aVar.f8400a.getLayoutParams().width = Math.round(d);
        aVar.f8400a.getLayoutParams().height = Math.round(d);
        aVar.f8401b.setTextSize(0, C2553q3.m11135u(this.f8397l * 18.0f));
        int round2 = Math.round(C2553q3.m11118d(this.f8397l * 20.0f));
        aVar.f8401b.setPadding(round2, 0, 0, 0);
        aVar.f8402c.setTextSize(0, C2553q3.m11135u(this.f8397l * 14.0f));
        aVar.f8402c.setPadding(round2, 0, 0, 0);
        aVar.f8403d.setTextSize(0, C2553q3.m11135u(this.f8397l * 14.0f));
        aVar.f8403d.setPadding(round2, 0, 0, 0);
        inflate.setTag(aVar);
        return inflate;
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        String q = this.f8394i.mo8193q("systems_list_type", "grid");
        q.hashCode();
        return !q.equals("grid") ? mo8623g(context, cursor, viewGroup) : mo8622f(context, cursor, viewGroup);
    }
}
