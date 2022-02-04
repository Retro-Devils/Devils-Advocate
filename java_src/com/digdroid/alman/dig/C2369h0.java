package com.digdroid.alman.dig;

import android.content.Context;
import android.os.Bundle;
import java.util.Calendar;

/* access modifiers changed from: package-private */
/* renamed from: com.digdroid.alman.dig.h0 */
public class C2369h0 {

    /* renamed from: a */
    long f8301a;

    /* renamed from: b */
    long f8302b;

    /* renamed from: c */
    int f8303c;

    /* renamed from: d */
    int f8304d;

    /* renamed from: e */
    boolean f8305e;

    /* renamed from: f */
    boolean f8306f;

    /* renamed from: g */
    String f8307g;

    /* renamed from: h */
    String f8308h;

    /* renamed from: i */
    String f8309i;

    /* renamed from: j */
    int f8310j;

    /* renamed from: k */
    String f8311k;

    /* renamed from: l */
    String f8312l;

    /* renamed from: m */
    String f8313m;

    /* renamed from: n */
    String f8314n;

    /* renamed from: o */
    boolean f8315o;

    public C2369h0() {
        mo8532a();
    }

    public C2369h0(C2369h0 h0Var) {
        this.f8301a = h0Var.f8301a;
        this.f8302b = h0Var.f8302b;
        this.f8303c = h0Var.f8303c;
        this.f8304d = h0Var.f8304d;
        this.f8312l = h0Var.f8312l;
        this.f8313m = h0Var.f8313m;
        this.f8305e = h0Var.f8305e;
        this.f8306f = h0Var.f8306f;
        this.f8307g = h0Var.f8307g;
        this.f8308h = h0Var.f8308h;
        this.f8309i = h0Var.f8309i;
        this.f8310j = h0Var.f8310j;
        this.f8311k = h0Var.f8311k;
        this.f8314n = h0Var.f8314n;
        this.f8315o = h0Var.f8315o;
    }

    /* renamed from: a */
    public void mo8532a() {
        this.f8301a = 0;
        this.f8302b = 0;
        this.f8303c = -1;
        this.f8304d = -1;
        this.f8305e = false;
        this.f8306f = false;
        this.f8307g = "";
        this.f8308h = "";
        this.f8309i = "";
        this.f8310j = -1;
        this.f8311k = "";
        this.f8314n = "title";
        this.f8315o = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo8533b(Bundle bundle) {
        if (bundle.containsKey("filter_favorite")) {
            this.f8305e = bundle.getBoolean("filter_favorite");
        }
        if (bundle.containsKey("filter_genre")) {
            this.f8303c = bundle.getInt("filter_genre");
        }
        if (bundle.containsKey("filter_genrename")) {
            this.f8312l = bundle.getString("filter_genrename");
        }
        if (bundle.containsKey("filter_collection")) {
            this.f8304d = bundle.getInt("filter_collection");
        }
        if (bundle.containsKey("filter_collectionname")) {
            this.f8313m = bundle.getString("filter_collectionname");
        }
        if (bundle.containsKey("filter_system")) {
            this.f8308h = bundle.getString("filter_system");
        }
        if (bundle.containsKey("filter_publisher")) {
            this.f8311k = bundle.getString("filter_publisher");
        }
        if (bundle.containsKey("filter_type")) {
            this.f8309i = bundle.getString("filter_type");
        }
        if (bundle.containsKey("filter_generation")) {
            this.f8310j = bundle.getInt("filter_generation");
        }
        if (bundle.containsKey("filter_search")) {
            this.f8307g = bundle.getString("filter_search");
        }
        if (bundle.containsKey("filter_date_start")) {
            this.f8301a = bundle.getLong("filter_date_start");
        }
        if (bundle.containsKey("filter_date_end")) {
            this.f8302b = bundle.getLong("filter_date_end");
        }
        if (bundle.containsKey("filter_sorttype")) {
            this.f8314n = bundle.getString("filter_sorttype");
        }
        if (bundle.containsKey("filter_sortascending")) {
            this.f8315o = bundle.getBoolean("filter_sortascending");
        }
    }

    /* renamed from: c */
    public String mo8534c(Context context, C2375h3 h3Var) {
        String str;
        String str2;
        StringBuilder sb;
        StringBuilder sb2;
        int i;
        StringBuilder sb3;
        int i2;
        if (context == null || h3Var == null) {
            return "";
        }
        if (this.f8304d >= 0) {
            str = "" + this.f8313m;
        } else {
            str = "";
        }
        if (this.f8305e) {
            if (!str.equals("")) {
                str = str + ", ";
            }
            str = str + context.getString(R.string.favorites);
        }
        if (!this.f8308h.equals("")) {
            if (!str.equals("")) {
                str = str + ", ";
            }
            str = str + h3Var.mo8568s(this.f8308h);
        }
        if (!this.f8309i.equals("")) {
            if (!str.equals("")) {
                str = str + ", ";
            }
            String str3 = this.f8309i;
            str3.hashCode();
            char c = 65535;
            switch (str3.hashCode()) {
                case -1409612528:
                    if (str3.equals("arcade")) {
                        c = 0;
                        break;
                    }
                    break;
                case -599163109:
                    if (str3.equals("computer")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1949732:
                    if (str3.equals("handheld")) {
                        c = 2;
                        break;
                    }
                    break;
                case 951510359:
                    if (str3.equals("console")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    sb3 = new StringBuilder();
                    sb3.append(str);
                    i2 = R.string.arcade;
                    sb3.append(context.getString(i2));
                    str = sb3.toString();
                    break;
                case 1:
                    sb3 = new StringBuilder();
                    sb3.append(str);
                    i2 = R.string.computers;
                    sb3.append(context.getString(i2));
                    str = sb3.toString();
                    break;
                case 2:
                    sb3 = new StringBuilder();
                    sb3.append(str);
                    i2 = R.string.handhelds;
                    sb3.append(context.getString(i2));
                    str = sb3.toString();
                    break;
                case 3:
                    sb3 = new StringBuilder();
                    sb3.append(str);
                    i2 = R.string.consoles;
                    sb3.append(context.getString(i2));
                    str = sb3.toString();
                    break;
            }
        }
        if (this.f8310j >= 2) {
            if (!str.equals("")) {
                str = str + ", ";
            }
            switch (this.f8310j) {
                case 2:
                    sb2 = new StringBuilder();
                    sb2.append(str);
                    i = R.string.generation2;
                    sb2.append(context.getString(i));
                    str = sb2.toString();
                    break;
                case 3:
                    sb2 = new StringBuilder();
                    sb2.append(str);
                    i = R.string.generation3;
                    sb2.append(context.getString(i));
                    str = sb2.toString();
                    break;
                case 4:
                    sb2 = new StringBuilder();
                    sb2.append(str);
                    i = R.string.generation4;
                    sb2.append(context.getString(i));
                    str = sb2.toString();
                    break;
                case 5:
                    sb2 = new StringBuilder();
                    sb2.append(str);
                    i = R.string.generation5;
                    sb2.append(context.getString(i));
                    str = sb2.toString();
                    break;
                case 6:
                    sb2 = new StringBuilder();
                    sb2.append(str);
                    i = R.string.generation6;
                    sb2.append(context.getString(i));
                    str = sb2.toString();
                    break;
                case 7:
                    sb2 = new StringBuilder();
                    sb2.append(str);
                    i = R.string.generation7;
                    sb2.append(context.getString(i));
                    str = sb2.toString();
                    break;
                case 8:
                    sb2 = new StringBuilder();
                    sb2.append(str);
                    i = R.string.generation8;
                    sb2.append(context.getString(i));
                    str = sb2.toString();
                    break;
            }
        }
        if (this.f8303c >= 0) {
            if (!str.equals("")) {
                str = str + ", ";
            }
            str = str + this.f8312l.substring(0, 1).toUpperCase() + this.f8312l.substring(1);
        }
        if (!this.f8307g.equals("")) {
            if (!str.equals("")) {
                str = str + ", ";
            }
            str = str + this.f8307g;
        }
        if (this.f8301a > 0) {
            if (!str.equals("")) {
                str = str + ", ";
            }
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(this.f8301a);
            int i3 = instance.get(1);
            long j = this.f8302b;
            if (j == 0) {
                sb = new StringBuilder();
                sb.append(str);
                str = "after ";
            } else {
                instance.setTimeInMillis(j);
                int i4 = instance.get(1) - 1;
                if (i3 == i4) {
                    sb = new StringBuilder();
                } else {
                    str2 = str + i3 + "-" + i4;
                    str = str2;
                }
            }
            sb.append(str);
            sb.append(i3);
            str2 = sb.toString();
            str = str2;
        } else if (this.f8302b > 0) {
            if (!str.equals("")) {
                str = str + ", ";
            }
            Calendar instance2 = Calendar.getInstance();
            instance2.setTimeInMillis(this.f8302b);
            str = str + "before " + (instance2.get(1) - 1);
        }
        if (this.f8311k.equals("")) {
            return str;
        }
        if (!str.equals("")) {
            str = str + ", ";
        }
        return str + "by " + this.f8311k.substring(0, 1).toUpperCase() + this.f8311k.substring(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo8535d(Bundle bundle) {
        bundle.putBoolean("filter_favorite", this.f8305e);
        bundle.putInt("filter_genre", this.f8303c);
        bundle.putString("filter_genrename", this.f8312l);
        bundle.putInt("filter_collection", this.f8304d);
        bundle.putString("filter_collectionname", this.f8313m);
        bundle.putString("filter_type", this.f8309i);
        bundle.putInt("filter_generation", this.f8310j);
        bundle.putString("filter_system", this.f8308h);
        bundle.putLong("filter_date_start", this.f8301a);
        bundle.putLong("filter_date_end", this.f8302b);
        bundle.putString("filter_search", this.f8307g);
        bundle.putString("filter_publisher", this.f8311k);
        bundle.putString("filter_sorttype", this.f8314n);
        bundle.putBoolean("filter_sortascending", this.f8315o);
    }
}
