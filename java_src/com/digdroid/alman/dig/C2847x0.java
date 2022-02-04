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
    ImageView f9613u;

    /* renamed from: v */
    TextView f9614v;

    /* renamed from: w */
    TextView f9615w;

    /* renamed from: x */
    AppCompatRatingBar f9616x;

    /* renamed from: y */
    TextView f9617y;

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
        ImageView imageView = (ImageView) this.f9434t.findViewById(R.id.game_icon);
        this.f9613u = imageView;
        imageView.setBackgroundColor(t3Var.f9408d);
        TextView textView = (TextView) this.f9434t.findViewById(R.id.game_name);
        this.f9614v = textView;
        textView.setTextColor(t3Var.f9409e);
        TextView textView2 = (TextView) this.f9434t.findViewById(R.id.game_info);
        this.f9615w = textView2;
        textView2.setTextColor(t3Var.f9410f);
        this.f9616x = (AppCompatRatingBar) this.f9434t.findViewById(R.id.game_rating);
        TextView textView3 = (TextView) this.f9434t.findViewById(R.id.rating_text);
        this.f9617y = textView3;
        textView3.setTextColor(t3Var.f9411g);
        int i = 8;
        if (z) {
            this.f9614v.setVisibility(8);
            this.f9615w.setVisibility(8);
        } else if (str.equals("rating") || str.equals("crating")) {
            this.f9615w.setVisibility(8);
            this.f9434t.findViewById(R.id.rating_bar).setVisibility(0);
            TextView textView4 = this.f9617y;
            if (!str.equals("rating")) {
                i = 0;
            }
            textView4.setVisibility(i);
            LayerDrawable layerDrawable = (LayerDrawable) this.f9616x.getProgressDrawable();
            m11854M(layerDrawable.getDrawable(2), -8448);
            m11854M(layerDrawable.getDrawable(1), -2138535800);
            m11854M(layerDrawable.getDrawable(0), -2138535800);
            return;
        } else {
            this.f9615w.setVisibility(0);
        }
        this.f9434t.findViewById(R.id.rating_bar).setVisibility(8);
    }
}
