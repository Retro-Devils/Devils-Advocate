package com.digdroid.alman.dig;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.provider.DocumentsContract;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatRatingBar;
import com.bumptech.glide.load.p122o.AbstractC1763j;
import com.digdroid.alman.dig.AbstractC2365h;
import java.util.Calendar;
import java.util.regex.Pattern;

/* renamed from: com.digdroid.alman.dig.q0 */
public class C2550q0 implements AbstractC2365h.AbstractC2368c {

    /* renamed from: A */
    int f8852A;

    /* renamed from: B */
    int f8853B;

    /* renamed from: C */
    int f8854C;

    /* renamed from: D */
    int f8855D;

    /* renamed from: E */
    int f8856E;

    /* renamed from: F */
    int f8857F;

    /* renamed from: a */
    Activity f8858a;

    /* renamed from: b */
    C2774t3 f8859b;

    /* renamed from: c */
    Cursor f8860c;

    /* renamed from: d */
    SQLiteDatabase f8861d;

    /* renamed from: e */
    Pattern f8862e;

    /* renamed from: f */
    C2375h3 f8863f;

    /* renamed from: g */
    C2512o0 f8864g;

    /* renamed from: h */
    String f8865h;

    /* renamed from: i */
    C2219c3 f8866i;

    /* renamed from: j */
    Resources f8867j;

    /* renamed from: k */
    String f8868k;

    /* renamed from: l */
    String f8869l;

    /* renamed from: m */
    String f8870m;

    /* renamed from: n */
    String f8871n;

    /* renamed from: o */
    String f8872o = null;

    /* renamed from: p */
    String f8873p = null;

    /* renamed from: q */
    Uri f8874q = null;

    /* renamed from: r */
    Uri f8875r = null;

    /* renamed from: s */
    boolean f8876s;

    /* renamed from: t */
    float f8877t;

    /* renamed from: u */
    float f8878u;

    /* renamed from: v */
    int f8879v;

    /* renamed from: w */
    int f8880w;

    /* renamed from: x */
    int f8881x;

    /* renamed from: y */
    int f8882y;

    /* renamed from: z */
    int f8883z;

    public C2550q0(Activity activity, C2774t3 t3Var, Cursor cursor, float f, float f2, C2775u uVar, String str, String str2, boolean z) {
        this.f8858a = activity;
        this.f8859b = t3Var;
        this.f8860c = cursor;
        this.f8861d = uVar.mo9325c();
        this.f8865h = str;
        this.f8876s = z;
        this.f8877t = f2;
        this.f8878u = f;
        this.f8866i = C2219c3.m9805k(activity.getApplicationContext());
        C2399i2 d = C2399i2.m10374d(activity, str2);
        C2399i2 i2Var = new C2399i2(d, "Covers");
        C2399i2 i2Var2 = new C2399i2(d, "Screenshots");
        this.f8869l = i2Var.getAbsolutePath();
        this.f8870m = i2Var2.getAbsolutePath();
        if (str2.contains("://")) {
            int indexOf = this.f8869l.indexOf("/document/");
            this.f8874q = Uri.parse(this.f8869l.substring(0, indexOf));
            this.f8872o = Uri.decode(this.f8869l.substring(indexOf + 10));
            int indexOf2 = this.f8870m.indexOf("/document/");
            this.f8875r = Uri.parse(this.f8870m.substring(0, indexOf2));
            this.f8873p = Uri.decode(this.f8870m.substring(indexOf2 + 10));
        }
        this.f8871n = C2372h2.m10299c(activity).getAbsolutePath() + "/Systems/icons";
        this.f8863f = C2375h3.m10306r(activity.getApplicationContext(), uVar);
        this.f8864g = C2512o0.m10833g(activity.getApplicationContext(), uVar);
        this.f8867j = activity.getResources();
        this.f8868k = activity.getPackageName();
        this.f8862e = Pattern.compile("^.+\\/([^\\.]+)\\.[^\\.]+$");
        this.f8879v = cursor.getColumnIndex("title");
        this.f8880w = cursor.getColumnIndex("released");
        this.f8881x = cursor.getColumnIndex("system");
        this.f8882y = cursor.getColumnIndex("time_played");
        this.f8883z = cursor.getColumnIndex("times_played");
        this.f8852A = cursor.getColumnIndex("filename");
        this.f8857F = cursor.getColumnIndex("foldername");
        this.f8853B = cursor.getColumnIndex("has_images");
        this.f8854C = cursor.getColumnIndex("rating");
        this.f8855D = cursor.getColumnIndex("c_rating");
        this.f8856E = cursor.getColumnIndex("c_rating_count");
    }

    @Override // com.digdroid.alman.dig.AbstractC2365h.AbstractC2368c
    /* renamed from: a */
    public void mo8531a(Cursor cursor) {
        this.f8860c = cursor;
    }

    /* renamed from: b */
    public void mo8960b(ImageView imageView, TextView textView, TextView textView2, AppCompatRatingBar appCompatRatingBar, TextView textView3, int i) {
        Cursor cursor = this.f8860c;
        if (cursor != null && !cursor.isClosed() && this.f8860c.moveToPosition(i)) {
            mo8961c(imageView, textView, textView2, appCompatRatingBar, textView3, this.f8860c);
        }
    }

    /* renamed from: c */
    public void mo8961c(ImageView imageView, TextView textView, TextView textView2, AppCompatRatingBar appCompatRatingBar, TextView textView3, Cursor cursor) {
        String f;
        if (cursor != null && !cursor.isClosed()) {
            if (imageView != null) {
                mo8969k(imageView, this.f8858a, cursor);
            }
            if (!this.f8876s) {
                if (textView != null) {
                    textView.setText(cursor.getString(this.f8879v));
                }
                String str = this.f8865h;
                str.hashCode();
                char c = 65535;
                switch (str.hashCode()) {
                    case -985752877:
                        if (str.equals("played")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -938102371:
                        if (str.equals("rating")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -887328209:
                        if (str.equals("system")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 3076014:
                        if (str.equals("date")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 1025416128:
                        if (str.equals("crating")) {
                            c = 4;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        if (textView2 != null) {
                            f = mo8964f(this.f8858a, cursor);
                            break;
                        } else {
                            return;
                        }
                    case 1:
                        float f2 = cursor.isNull(this.f8854C) ? 0.0f : cursor.getFloat(this.f8854C);
                        if (appCompatRatingBar != null) {
                            appCompatRatingBar.setRating(f2);
                            return;
                        }
                        return;
                    case 2:
                        if (textView2 != null) {
                            f = this.f8863f.mo8568s(cursor.getString(this.f8881x));
                            break;
                        } else {
                            return;
                        }
                    case 3:
                        if (textView2 != null) {
                            f = mo8962d(cursor.getLong(this.f8880w));
                            break;
                        } else {
                            return;
                        }
                    case 4:
                        float f3 = cursor.getFloat(this.f8855D);
                        if (appCompatRatingBar != null) {
                            appCompatRatingBar.setRating(f3);
                        }
                        if (textView3 != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("");
                            double d = (double) f3;
                            Double.isNaN(d);
                            double round = (double) Math.round(d * 10.0d);
                            Double.isNaN(round);
                            sb.append(round / 10.0d);
                            sb.append("/");
                            sb.append(cursor.getInt(this.f8856E));
                            textView3.setText(sb.toString());
                            return;
                        }
                        return;
                    default:
                        return;
                }
                textView2.setText(f);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo8962d(long j) {
        if (j <= 0) {
            return "";
        }
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        return "" + instance.get(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Uri mo8963e(String str, int i, String str2, String str3) {
        boolean w = this.f8863f.mo8572w(str);
        Uri uri = null;
        if (i >= 0) {
            if (i == 0 && !this.f8859b.f9418v.equals("")) {
                C2399i2 d = C2399i2.m10374d(this.f8858a, this.f8859b.f9418v);
                uri = new C2399i2(d, str + ".png").mo8614m();
            } else if (w) {
                if ((i & 1) == 0 && (i & 2) != 0) {
                    w = false;
                }
            } else if ((i & 2) == 0 && (i & 1) != 0) {
                w = true;
            }
        }
        if (uri != null) {
            return uri;
        }
        Uri uri2 = this.f8874q;
        if (uri2 == null || Build.VERSION.SDK_INT < 21) {
            C2399i2 d2 = C2399i2.m10374d(this.f8858a, w ? this.f8869l : this.f8870m);
            return new C2399i2(d2, str + "/" + str3 + ".png").mo8614m();
        }
        if (!w) {
            uri2 = this.f8875r;
        }
        String str4 = w ? this.f8872o : this.f8873p;
        return DocumentsContract.buildDocumentUriUsingTree(uri2, str4 + "/" + str + "/" + str3 + ".png");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public String mo8964f(Context context, Cursor cursor) {
        int i = cursor.getInt(this.f8883z);
        String str = "" + i + "X";
        if (i <= 0) {
            return str;
        }
        String str2 = str + " " + context.getString(R.string.pfor);
        long j = cursor.getLong(this.f8882y) / 1000;
        long j2 = j / 3600;
        if (j2 > 0) {
            str2 = str2 + " " + j2 + context.getString(R.string.hours);
        }
        long j3 = (j % 3600) / 60;
        if (j3 > 0 || j2 > 0) {
            str2 = str2 + " " + j3 + context.getString(R.string.minutes);
        }
        return str2 + " " + (j % 60) + context.getString(R.string.seconds);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public long mo8965g(Cursor cursor) {
        return cursor.getLong(this.f8880w);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public String mo8966h(Cursor cursor) {
        return this.f8863f.mo8568s(cursor.getString(this.f8881x));
    }

    /* renamed from: i */
    public C2847x0 mo8967i(View view, float f) {
        ((SquaredImageView) view.findViewById(R.id.game_icon)).mo7992c(this.f8877t);
        view.setLayoutParams(new LinearLayout.LayoutParams(Math.round(f * this.f8877t * this.f8878u), -2));
        C2847x0 x0Var = new C2847x0(view);
        x0Var.mo9434N(this.f8859b, this.f8876s, this.f8865h);
        return x0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo8968j(Uri uri, Drawable drawable, int i, ImageView imageView) {
        C2498n1<Drawable> D0;
        if (drawable != null) {
            try {
                D0 = C2457l1.m10576a(this.f8858a).mo8859J(uri).mo7766h(drawable).mo7762e(AbstractC1763j.f6903b);
            } catch (Exception unused) {
                return;
            }
        } else {
            D0 = C2457l1.m10576a(this.f8858a).mo8859J(uri).mo7765g(i).mo7762e(AbstractC1763j.f6903b);
        }
        D0.mo7754Y(true).mo7030p0(imageView);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo8969k(ImageView imageView, Context context, Cursor cursor) {
        int lastIndexOf;
        String string = cursor.getString(this.f8881x);
        String t = this.f8863f.mo8569t(string);
        String string2 = cursor.getString(this.f8857F);
        int i = 0;
        if (string2 == null) {
            string2 = cursor.getString(this.f8852A);
            if (!string.equals("pc") && !string.equals("scumm") && !string.equals("android") && (lastIndexOf = string2.lastIndexOf(46)) > 0) {
                string2 = string2.substring(0, lastIndexOf);
            }
        }
        Drawable drawable = null;
        if (t.equals("android")) {
            try {
                drawable = context.getPackageManager().getApplicationIcon(string2);
            } catch (Exception unused) {
                Resources resources = this.f8867j;
                i = resources.getIdentifier("icon_grayed_" + string, "drawable", this.f8868k);
            }
        } else {
            Resources resources2 = this.f8867j;
            i = resources2.getIdentifier("icon_grayed_" + string, "drawable", this.f8868k);
            if (i == 0) {
                i = R.drawable.icon_grayed_atari2600;
            }
        }
        mo8968j(mo8963e(string, cursor.isNull(this.f8853B) ? -1 : cursor.getInt(this.f8853B), t, string2), drawable, i, imageView);
    }
}
