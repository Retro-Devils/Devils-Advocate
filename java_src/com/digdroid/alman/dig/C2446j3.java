package com.digdroid.alman.dig;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.load.p122o.AbstractC1763j;
import java.io.File;
import java.util.Calendar;

/* renamed from: com.digdroid.alman.dig.j3 */
class C2446j3 extends AbstractC2365h {

    /* renamed from: l */
    String f8531l;

    /* renamed from: m */
    String f8532m;

    /* renamed from: n */
    Resources f8533n;

    /* renamed from: o */
    C2219c3 f8534o;

    /* renamed from: p */
    Activity f8535p;

    /* renamed from: q */
    String f8536q;

    /* renamed from: r */
    boolean f8537r;

    /* renamed from: s */
    C2375h3 f8538s;

    /* renamed from: com.digdroid.alman.dig.j3$a */
    public class C2447a extends RecyclerView.AbstractC0655d0 {

        /* renamed from: t */
        ImageView f8539t;

        /* renamed from: u */
        TextView f8540u;

        /* renamed from: v */
        TextView f8541v;

        public C2447a(View view) {
            super(view);
            view.setLayoutParams(new LinearLayout.LayoutParams(Math.round(((float) C2446j3.this.f8291f) * C2446j3.this.f8292g), -2));
            this.f8539t = (ImageView) view.findViewById(R.id.system_icon);
            TextView textView = (TextView) view.findViewById(R.id.system_name);
            this.f8540u = textView;
            textView.setTextColor(C2446j3.this.f8288c.f9401e);
            TextView textView2 = (TextView) view.findViewById(R.id.system_info);
            this.f8541v = textView2;
            textView2.setTextColor(C2446j3.this.f8288c.f9402f);
            if (C2446j3.this.f8537r) {
                this.f8540u.setVisibility(8);
                this.f8541v.setVisibility(8);
            }
        }
    }

    public C2446j3(MainActivity mainActivity, C2774t3 t3Var, Cursor cursor, float f, float f2, String str, boolean z) {
        super(mainActivity, t3Var, cursor, f, f2);
        if (mainActivity != null) {
            this.f8535p = mainActivity;
            this.f8536q = str;
            this.f8537r = z;
            this.f8534o = C2219c3.m9805k(mainActivity);
            this.f8538s = C2375h3.m10306r(mainActivity, C2775u.m11726e(mainActivity));
            File[] b = C2372h2.m10298b(mainActivity);
            if (b != null) {
                this.f8532m = b[0].getAbsolutePath() + "/Systems/icons";
            }
            String str2 = this.f8288c.f9416t;
            this.f8531l = str2;
            if (str2.equals("")) {
                this.f8531l = this.f8532m;
            }
            this.f8533n = mainActivity.getResources();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo8692A(ImageView imageView, Context context, Cursor cursor) {
        File file;
        String string = cursor.getString(3);
        String str = string + ".png";
        if (this.f8538s.mo8541A(string)) {
            file = new File(this.f8531l + "/" + str);
        } else {
            file = new File(this.f8532m + "/" + str);
        }
        C2457l1.m10577b(context).mo8860K(file).mo7762e(AbstractC1763j.f6903b).mo7754Y(true).mo7030p0(imageView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0658g
    /* renamed from: j */
    public void mo3581j(RecyclerView.AbstractC0655d0 d0Var, int i) {
        Cursor cursor;
        if (d0Var != null && (cursor = this.f8289d) != null && !cursor.isClosed() && i < this.f8290e && this.f8289d.moveToPosition(i)) {
            C2447a aVar = (C2447a) d0Var;
            mo8692A(aVar.f8539t, this.f8535p, this.f8289d);
            if (!this.f8537r) {
                aVar.f8540u.setText(this.f8289d.getString(1));
                String str = this.f8289d.getInt(2) + " " + ((Object) this.f8533n.getText(R.string.games));
                if (this.f8536q.equals("date")) {
                    Calendar instance = Calendar.getInstance();
                    instance.setTimeInMillis(this.f8289d.getLong(4));
                    str = str + " (" + instance.get(1) + ")";
                }
                aVar.f8541v.setText(str);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0658g
    /* renamed from: l */
    public RecyclerView.AbstractC0655d0 mo3582l(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.carousel_system, viewGroup, false);
        ((SquaredImageView) inflate.findViewById(R.id.system_icon)).mo7992c(this.f8293h);
        return new C2447a(inflate);
    }
}
