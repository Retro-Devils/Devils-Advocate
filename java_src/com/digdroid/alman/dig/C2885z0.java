package com.digdroid.alman.dig;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.load.p122o.AbstractC1763j;
import java.io.File;
import java.util.Locale;

/* access modifiers changed from: package-private */
/* renamed from: com.digdroid.alman.dig.z0 */
public class C2885z0 {

    /* renamed from: a */
    Typeface f9705a;

    /* renamed from: b */
    boolean f9706b;

    /* renamed from: c */
    MainActivity f9707c;

    public C2885z0(Activity activity, boolean z) {
        this.f9707c = (MainActivity) activity;
        String q = C2219c3.m9805k(activity).mo8193q("language", "device");
        q = q.equals("device") ? Locale.getDefault().getLanguage() : q;
        boolean z2 = z && !q.equals("ja") && !q.equals("ru") && !q.equals("ko") && !q.equals("ar");
        this.f9706b = z2;
        if (z2) {
            this.f9705a = Typeface.createFromAsset(activity.getAssets(), "fonts/PressStart2P.ttf");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo9510a() {
        return Math.round(C2553q3.m11119e((float) (!this.f9706b ? 6 : 12)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public float mo9511b() {
        float f;
        float f2;
        Point g = this.f9707c.mo8203g(true);
        int i = g.y;
        int i2 = g.x;
        if (i > i2) {
            f2 = (float) i2;
            f = 25.0f;
        } else {
            f2 = (float) i2;
            f = 35.0f;
        }
        float f3 = f2 / f;
        return !this.f9706b ? f3 * 1.3f : f3;
    }

    /* renamed from: c */
    public void mo9512c(String str, boolean z, String str2, int i, ImageView imageView, TextView textView, String str3) {
        C2498n1<Drawable> n1Var;
        int i2 = 0;
        imageView.setVisibility(z ? 0 : 8);
        if (z) {
            i2 = 8;
        }
        textView.setVisibility(i2);
        if (z) {
            if (str2 != null) {
                n1Var = C2457l1.m10578c(this.f9707c).mo8860K(new File(str2 + "/" + str + ".png")).mo7762e(AbstractC1763j.f6903b).mo7754Y(true);
            } else {
                n1Var = C2457l1.m10578c(this.f9707c).mo8862M(str);
            }
            n1Var.mo7030p0(imageView);
            return;
        }
        mo9513d(textView, str3);
        textView.setTextColor(i);
    }

    /* renamed from: d */
    public void mo9513d(TextView textView, String str) {
        String substring = str.substring(0, 1);
        mo9514e(textView, substring.toUpperCase());
        ((boolean[]) textView.getTag())[2] = substring.matches("\\p{Latin}");
    }

    /* renamed from: e */
    public void mo9514e(TextView textView, String str) {
        if (this.f9706b) {
            str = C2185a4.m9696z(str).toUpperCase();
        }
        textView.setText(str);
        if (this.f9706b) {
            textView.setTypeface(this.f9705a);
        }
    }
}
