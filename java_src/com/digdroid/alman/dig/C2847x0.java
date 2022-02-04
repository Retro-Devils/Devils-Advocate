package com.digdroid.alman.dig;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.core.graphics.drawable.C0398a;

/* access modifiers changed from: package-private */
/* renamed from: com.digdroid.alman.dig.x0 */
public class C2847x0 extends C2777u1 {

    /* renamed from: u */
    ImageView f9605u;

    /* renamed from: v */
    TextView f9606v;

    /* renamed from: w */
    TextView f9607w;

    /* renamed from: x */
    AppCompatRatingBar f9608x;

    /* renamed from: y */
    TextView f9609y;

    public C2847x0(View view) {
        super(view);
    }

    /* renamed from: M */
    private void m11854M(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0398a.m1977n(drawable, i);
        } else {
            drawable.setColorFilter(i, PorterDuff.Mode.SRC_IN);
        }
    }

    /* renamed from: N */
    public void mo9434N(C2774t3 t3Var, boolean z, String str) {
        ImageView imageView = (ImageView) this.f9426t.findViewById(R.id.game_icon);
        this.f9605u = imageView;
        imageView.setBackgroundColor(t3Var.f9400d);
        TextView textView = (TextView) this.f9426t.findViewById(R.id.game_name);
        this.f9606v = textView;
        textView.setTextColor(t3Var.f9401e);
        TextView textView2 = (TextView) this.f9426t.findViewById(R.id.game_info);
        this.f9607w = textView2;
        textView2.setTextColor(t3Var.f9402f);
        this.f9608x = (AppCompatRatingBar) this.f9426t.findViewById(R.id.game_rating);
        TextView textView3 = (TextView) this.f9426t.findViewById(R.id.rating_text);
        this.f9609y = textView3;
        textView3.setTextColor(t3Var.f9403g);
        int i = 8;
        if (z) {
            this.f9606v.setVisibility(8);
            this.f9607w.setVisibility(8);
        } else if (str.equals("rating") || str.equals("crating")) {
            this.f9607w.setVisibility(8);
            this.f9426t.findViewById(R.id.rating_bar).setVisibility(0);
            TextView textView4 = this.f9609y;
            if (!str.equals("rating")) {
                i = 0;
            }
            textView4.setVisibility(i);
            LayerDrawable layerDrawable = (LayerDrawable) this.f9608x.getProgressDrawable();
            m11854M(layerDrawable.getDrawable(2), -8448);
            m11854M(layerDrawable.getDrawable(1), -2138535800);
            m11854M(layerDrawable.getDrawable(0), -2138535800);
            return;
        } else {
            this.f9607w.setVisibility(0);
        }
        this.f9426t.findViewById(R.id.rating_bar).setVisibility(8);
    }
}
