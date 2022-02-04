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
    int f8860A;

    /* renamed from: B */
    int f8861B;

    /* renamed from: C */
    int f8862C;

    /* renamed from: D */
    int f8863D;

    /* renamed from: E */
    int f8864E;

    /* renamed from: F */
    int f8865F;

    /* renamed from: a */
    Activity f8866a;

    /* renamed from: b */
    C2774t3 f8867b;

    /* renamed from: c */
    Cursor f8868c;

    /* renamed from: d */
    SQLiteDatabase f8869d;

    /* renamed from: e */
    Pattern f8870e;

    /* renamed from: f */
    C2375h3 f8871f;

    /* renamed from: g */
    C2512o0 f8872g;

    /* renamed from: h */
    String f8873h;

    /* renamed from: i */
    C2219c3 f8874i;

    /* renamed from: j */
    Resources f8875j;

    /* renamed from: k */
    String f8876k;

    /* renamed from: l */
    String f8877l;

    /* renamed from: m */
    String f8878m;

    /* renamed from: n */
    String f8879n;

    /* renamed from: o */
    String f8880o = null;

    /* renamed from: p */
    String f8881p = null;

    /* renamed from: q */
    Uri f8882q = null;

    /* renamed from: r */
    Uri f8883r = null;

    /* renamed from: s */
    boolean f8884s;

    /* renamed from: t */
    float f8885t;

    /* renamed from: u */
    float f8886u;

    /* renamed from: v */
    int f8887v;

    /* renamed from: w */
    int f8888w;

    /* renamed from: x */
    int f8889x;

    /* renamed from: y */
    int f8890y;

    /* renamed from: z */
    int f8891z;

    public C2550q0(Activity activity, C2774t3 t3Var, Cursor cursor, float f, float f2, C2775u uVar, String str, String str2, boolean z) {
        this.f8866a = activity;
        this.f8867b = t3Var;
        this.f8868c = cursor;
        this.f8869d = uVar.mo9325c();
        this.f8873h = str;
        this.f8884s = z;
        this.f8885t = f2;
        this.f8886u = f;
        this.f8874i = C2219c3.m9805k(activity.getApplicationContext());
        C2399i2 d = C2399i2.m10374d(activity, str2);
        C2399i2 i2Var = new C2399i2(d, "Covers");
        C2399i2 i2Var2 = new C2399i2(d, "Screenshots");
        this.f8877l = i2Var.getAbsolutePath();
        this.f8878m = i2Var2.getAbsolutePath();
        if (str2.contains("://")) {
            int indexOf = this.f8877l.indexOf("/document/");
            this.f8882q = Uri.parse(this.f8877l.substring(0, indexOf));
            this.f8880o = Uri.decode(this.f8877l.substring(indexOf + 10));
            int indexOf2 = this.f8878m.indexOf("/document/");
            this.f8883r = Uri.parse(this.f8878m.substring(0, indexOf2));
            this.f8881p = Uri.decode(this.f8878m.substring(indexOf2 + 10));
        }
        this.f8879n = C2372h2.m10299c(activity).getAbsolutePath() + "/Systems/icons";
        this.f8871f = C2375h3.m10306r(activity.getApplicationContext(), uVar);
        this.f8872g = C2512o0.m10833g(activity.getApplicationContext(), uVar);
        this.f8875j = activity.getResources();
        this.f8876k = activity.getPackageName();
        this.f8870e = Pattern.compile("^.+\\/([^\\.]+)\\.[^\\.]+$");
        this.f8887v = cursor.getColumnIndex("title");
        this.f8888w = cursor.getColumnIndex("released");
        this.f8889x = cursor.getColumnIndex("system");
        this.f8890y = cursor.getColumnIndex("time_played");
        this.f8891z = cursor.getColumnIndex("times_played");
        this.f8860A = cursor.getColumnIndex("filename");
        this.f8865F = cursor.getColumnIndex("foldername");
        this.f8861B = cursor.getColumnIndex("has_images");
        this.f8862C = cursor.getColumnIndex("rating");
        this.f8863D = cursor.getColumnIndex("c_rating");
        this.f8864E = cursor.getColumnIndex("c_rating_count");
    }

    @Override // com.digdroid.alman.dig.AbstractC2365h.AbstractC2368c
    /* renamed from: a */
    public void mo8531a(Cursor cursor) {
        this.f8868c = cursor;
    }

    /* renamed from: b */
    public void mo8960b(ImageView imageView, TextView textView, TextView textView2, AppCompatRatingBar appCompatRatingBar, TextView textView3, int i) {
        Cursor cursor = this.f8868c;
        if (cursor != null && !cursor.isClosed() && this.f8868c.moveToPosition(i)) {
            mo8961c(imageView, textView, textView2, appCompatRatingBar, textView3, this.f8868c);
        }
    }

    /* renamed from: c */
    public void mo8961c(ImageView imageView, TextView textView, TextView textView2, AppCompatRatingBar appCompatRatingBar, TextView textView3, Cursor cursor) {
        String f;
        if (cursor != null && !cursor.isClosed()) {
            if (imageView != null) {
                mo8969k(imageView, this.f8866a, cursor);
            }
            if (!this.f8884s) {
                if (textView != null) {
                    textView.setText(cursor.getString(this.f8887v));
                }
                String str = this.f8873h;
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
                            f = mo8964f(this.f8866a, cursor);
                            break;
                        } else {
                            return;
                        }
                    case 1:
                        float f2 = cursor.isNull(this.f8862C) ? 0.0f : cursor.getFloat(this.f8862C);
                        if (appCompatRatingBar != null) {
                            appCompatRatingBar.setRating(f2);
                            return;
                        }
                        return;
                    case 2:
                        if (textView2 != null) {
                            f = this.f8871f.mo8568s(cursor.getString(this.f8889x));
                            break;
                        } else {
                            return;
                        }
                    case 3:
                        if (textView2 != null) {
                            f = mo8962d(cursor.getLong(this.f8888w));
                            break;
                        } else {
                            return;
                        }
                    case 4:
                        float f3 = cursor.getFloat(this.f8863D);
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
                            sb.append(cursor.getInt(this.f8864E));
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
        boolean w = this.f8871f.mo8572w(str);
        Uri uri = null;
        if (i >= 0) {
            if (i == 0 && !this.f8867b.f9426v.equals("")) {
                C2399i2 d = C2399i2.m10374d(this.f8866a, this.f8867b.f9426v);
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
        Uri uri2 = this.f8882q;
        if (uri2 == null || Build.VERSION.SDK_INT < 21) {
            C2399i2 d2 = C2399i2.m10374d(this.f8866a, w ? this.f8877l : this.f8878m);
            return new C2399i2(d2, str + "/" + str3 + ".png").mo8614m();
        }
        if (!w) {
            uri2 = this.f8883r;
        }
        String str4 = w ? this.f8880o : this.f8881p;
        return DocumentsContract.buildDocumentUriUsingTree(uri2, str4 + "/" + str + "/" + str3 + ".png");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public String mo8964f(Context context, Cursor cursor) {
        int i = cursor.getInt(this.f8891z);
        String str = "" + i + "X";
        if (i <= 0) {
            return str;
        }
        String str2 = str + " " + context.getString(R.string.pfor);
        long j = cursor.getLong(this.f8890y) / 1000;
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
        return cursor.getLong(this.f8888w);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public String mo8966h(Cursor cursor) {
        return this.f8871f.mo8568s(cursor.getString(this.f8889x));
    }

    /* renamed from: i */
    public C2847x0 mo8967i(View view, float f) {
        ((SquaredImageView) view.findViewById(R.id.game_icon)).mo7992c(this.f8885t);
        view.setLayoutParams(new LinearLayout.LayoutParams(Math.round(f * this.f8885t * this.f8886u), -2));
        C2847x0 x0Var = new C2847x0(view);
        x0Var.mo9434N(this.f8867b, this.f8884s, this.f8873h);
        return x0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo8968j(Uri uri, Drawable drawable, int i, ImageView imageView) {
        C2498n1<Drawable> D0;
        if (drawable != null) {
            try {
                D0 = C2457l1.m10576a(this.f8866a).mo8859J(uri).mo7766h(drawable).mo7762e(AbstractC1763j.f6911b);
            } catch (Exception unused) {
                return;
            }
        } else {
            D0 = C2457l1.m10576a(this.f8866a).mo8859J(uri).mo7765g(i).mo7762e(AbstractC1763j.f6911b);
        }
        D0.mo7754Y(true).mo7030p0(imageView);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo8969k(ImageView imageView, Context context, Cursor cursor) {
        int lastIndexOf;
        String string = cursor.getString(this.f8889x);
        String t = this.f8871f.mo8569t(string);
        String string2 = cursor.getString(this.f8865F);
        int i = 0;
        if (string2 == null) {
            string2 = cursor.getString(this.f8860A);
            if (!string.equals("pc") && !string.equals("scumm") && !string.equals("android") && (lastIndexOf = string2.lastIndexOf(46)) > 0) {
                string2 = string2.substring(0, lastIndexOf);
            }
        }
        Drawable drawable = null;
        if (t.equals("android")) {
            try {
                drawable = context.getPackageManager().getApplicationIcon(string2);
            } catch (Exception unused) {
                Resources resources = this.f8875j;
                i = resources.getIdentifier("icon_grayed_" + string, "drawable", this.f8876k);
            }
        } else {
            Resources resources2 = this.f8875j;
            i = resources2.getIdentifier("icon_grayed_" + string, "drawable", this.f8876k);
            if (i == 0) {
                i = R.drawable.icon_grayed_atari2600;
            }
        }
        mo8968j(mo8963e(string, cursor.isNull(this.f8861B) ? -1 : cursor.getInt(this.f8861B), t, string2), drawable, i, imageView);
    }
}
