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
    String f8539l;

    /* renamed from: m */
    String f8540m;

    /* renamed from: n */
    Resources f8541n;

    /* renamed from: o */
    C2219c3 f8542o;

    /* renamed from: p */
    Activity f8543p;

    /* renamed from: q */
    String f8544q;

    /* renamed from: r */
    boolean f8545r;

    /* renamed from: s */
    C2375h3 f8546s;

    /* renamed from: com.digdroid.alman.dig.j3$a */
    public class C2447a extends RecyclerView.AbstractC0655d0 {

        /* renamed from: t */
        ImageView f8547t;

        /* renamed from: u */
        TextView f8548u;

        /* renamed from: v */
        TextView f8549v;

        public C2447a(View view) {
            super(view);
            view.setLayoutParams(new LinearLayout.LayoutParams(Math.round(((float) C2446j3.this.f8299f) * C2446j3.this.f8300g), -2));
            this.f8547t = (ImageView) view.findViewById(R.id.system_icon);
            TextView textView = (TextView) view.findViewById(R.id.system_name);
            this.f8548u = textView;
            textView.setTextColor(C2446j3.this.f8296c.f9409e);
            TextView textView2 = (TextView) view.findViewById(R.id.system_info);
            this.f8549v = textView2;
            textView2.setTextColor(C2446j3.this.f8296c.f9410f);
            if (C2446j3.this.f8545r) {
                this.f8548u.setVisibility(8);
                this.f8549v.setVisibility(8);
            }
        }
    }

    public C2446j3(MainActivity mainActivity, C2774t3 t3Var, Cursor cursor, float f, float f2, String str, boolean z) {
        super(mainActivity, t3Var, cursor, f, f2);
        if (mainActivity != null) {
            this.f8543p = mainActivity;
            this.f8544q = str;
            this.f8545r = z;
            this.f8542o = C2219c3.m9805k(mainActivity);
            this.f8546s = C2375h3.m10306r(mainActivity, C2775u.m11726e(mainActivity));
            File[] b = C2372h2.m10298b(mainActivity);
            if (b != null) {
                this.f8540m = b[0].getAbsolutePath() + "/Systems/icons";
            }
            String str2 = this.f8296c.f9424t;
            this.f8539l = str2;
            if (str2.equals("")) {
                this.f8539l = this.f8540m;
            }
            this.f8541n = mainActivity.getResources();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo8692A(ImageView imageView, Context context, Cursor cursor) {
        File file;
        String string = cursor.getString(3);
        String str = string + ".png";
        if (this.f8546s.mo8541A(string)) {
            file = new File(this.f8539l + "/" + str);
        } else {
            file = new File(this.f8540m + "/" + str);
        }
        C2457l1.m10577b(context).mo8860K(file).mo7762e(AbstractC1763j.f6911b).mo7754Y(true).mo7030p0(imageView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0658g
    /* renamed from: j */
    public void mo3581j(RecyclerView.AbstractC0655d0 d0Var, int i) {
        Cursor cursor;
        if (d0Var != null && (cursor = this.f8297d) != null && !cursor.isClosed() && i < this.f8298e && this.f8297d.moveToPosition(i)) {
            C2447a aVar = (C2447a) d0Var;
            mo8692A(aVar.f8547t, this.f8543p, this.f8297d);
            if (!this.f8545r) {
                aVar.f8548u.setText(this.f8297d.getString(1));
                String str = this.f8297d.getInt(2) + " " + ((Object) this.f8541n.getText(R.string.games));
                if (this.f8544q.equals("date")) {
                    Calendar instance = Calendar.getInstance();
                    instance.setTimeInMillis(this.f8297d.getLong(4));
                    str = str + " (" + instance.get(1) + ")";
                }
                aVar.f8549v.setText(str);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0658g
    /* renamed from: l */
    public RecyclerView.AbstractC0655d0 mo3582l(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.carousel_system, viewGroup, false);
        ((SquaredImageView) inflate.findViewById(R.id.system_icon)).mo7992c(this.f8301h);
        return new C2447a(inflate);
    }
}
