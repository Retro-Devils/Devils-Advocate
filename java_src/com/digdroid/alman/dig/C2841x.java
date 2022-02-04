package com.digdroid.alman.dig;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.os.AsyncTask;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.digdroid.alman.dig.x */
public class C2841x {

    /* renamed from: a */
    private static C2841x f9597a;

    /* renamed from: b */
    String f9598b = null;

    /* renamed from: c */
    String f9599c = null;

    /* renamed from: d */
    C2846e[] f9600d;

    /* renamed from: e */
    ArrayList<C2843b> f9601e;

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.x$a */
    public class C2842a implements Comparator<C2846e> {
        C2842a() {
        }

        /* renamed from: a */
        public int compare(C2846e eVar, C2846e eVar2) {
            return eVar2.f9610a.length() - eVar.f9610a.length();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.x$b */
    public class C2843b {

        /* renamed from: a */
        String f9603a;

        /* renamed from: b */
        int f9604b;

        C2843b() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.x$c */
    public class AsyncTaskC2844c extends AsyncTask<Object, Void, Boolean> {

        /* renamed from: a */
        Activity f9606a;

        /* renamed from: b */
        AbstractC2845d f9607b;

        /* renamed from: c */
        String f9608c;

        AsyncTaskC2844c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Boolean doInBackground(Object... objArr) {
            Activity activity = (Activity) objArr[0];
            this.f9606a = activity;
            this.f9608c = (String) objArr[1];
            this.f9607b = (AbstractC2845d) objArr[2];
            return !C2841x.this.m11838m(activity) ? Boolean.FALSE : !C2841x.this.mo9423h(this.f9606a) ? Boolean.FALSE : Boolean.TRUE;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Boolean bool) {
            Activity activity;
            if (bool.booleanValue() && (activity = this.f9606a) != null && !activity.isFinishing()) {
                C2841x.this.mo9421c(this.f9608c, this.f9607b);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.x$d */
    public interface AbstractC2845d {
        /* renamed from: c0 */
        void mo8928c0(String str);

        /* renamed from: d */
        void mo8929d(C2369h0 h0Var);

        /* renamed from: f0 */
        void mo8933f0(String str);

        C2369h0 getFilter();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.x$e */
    public class C2846e {

        /* renamed from: a */
        String f9610a;

        /* renamed from: b */
        String f9611b;

        C2846e() {
        }
    }

    private C2841x() {
    }

    /* renamed from: e */
    private int m11833e(Matcher matcher, int i, C2369h0 h0Var) {
        String group;
        if (matcher.group(i) != null) {
            h0Var.f8319k = matcher.group(i).trim();
        }
        int i2 = i + 1;
        if (matcher.group(i2) != null) {
            h0Var.f8309a = mo9426o(Integer.parseInt(matcher.group(i2)));
            h0Var.f8310b = 0;
        } else {
            int i3 = i + 2;
            if (matcher.group(i3) != null) {
                h0Var.f8309a = 0;
            } else {
                i3 = i + 3;
                if (matcher.group(i3) != null) {
                    h0Var.f8309a = mo9426o(Integer.parseInt(matcher.group(i3)));
                } else {
                    int i4 = i + 4;
                    if (matcher.group(i4) != null) {
                        int i5 = i + 5;
                        if (matcher.group(i5) != null) {
                            h0Var.f8309a = mo9426o(Integer.parseInt(matcher.group(i4)));
                            group = matcher.group(i5);
                            h0Var.f8310b = mo9426o(Integer.parseInt(group) + 1);
                        }
                    }
                }
            }
            group = matcher.group(i3);
            h0Var.f8310b = mo9426o(Integer.parseInt(group) + 1);
        }
        int i6 = i + 6;
        if (matcher.group(i6) != null) {
            h0Var.f8319k = matcher.group(i6).trim();
        }
        return i + 7;
    }

    /* renamed from: f */
    private void m11834f(C2369h0 h0Var, String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1303281223:
                if (str.equals("eighth")) {
                    c = 0;
                    break;
                }
                break;
            case -1268684262:
                if (str.equals("fourth")) {
                    c = 1;
                    break;
                }
                break;
            case -906279820:
                if (str.equals("second")) {
                    c = 2;
                    break;
                }
                break;
            case 51560:
                if (str.equals("2nd")) {
                    c = 3;
                    break;
                }
                break;
            case 52645:
                if (str.equals("3rd")) {
                    c = 4;
                    break;
                }
                break;
            case 53672:
                if (str.equals("4th")) {
                    c = 5;
                    break;
                }
                break;
            case 54633:
                if (str.equals("5th")) {
                    c = 6;
                    break;
                }
                break;
            case 55594:
                if (str.equals("6th")) {
                    c = 7;
                    break;
                }
                break;
            case 56555:
                if (str.equals("7th")) {
                    c = '\b';
                    break;
                }
                break;
            case 57516:
                if (str.equals("8th")) {
                    c = '\t';
                    break;
                }
                break;
            case 97428919:
                if (str.equals("fifth")) {
                    c = '\n';
                    break;
                }
                break;
            case 109451990:
                if (str.equals("sixth")) {
                    c = 11;
                    break;
                }
                break;
            case 110331239:
                if (str.equals("third")) {
                    c = '\f';
                    break;
                }
                break;
            case 1987346241:
                if (str.equals("seventh")) {
                    c = '\r';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case '\t':
                h0Var.f8318j = 8;
                break;
            case 1:
            case 5:
                h0Var.f8318j = 4;
                break;
            case 2:
            case 3:
                h0Var.f8318j = 2;
                break;
            case 4:
            case '\f':
                h0Var.f8318j = 3;
                break;
            case 6:
            case '\n':
                h0Var.f8318j = 5;
                break;
            case 7:
            case 11:
                h0Var.f8318j = 6;
                break;
            case '\b':
            case '\r':
                h0Var.f8318j = 7;
                break;
        }
        h0Var.f8316h = "";
    }

    /* renamed from: g */
    private int m11835g(String str) {
        int size = this.f9601e.size();
        for (int i = 0; i < size; i++) {
            C2843b bVar = this.f9601e.get(i);
            if (str.equals(bVar.f9603a)) {
                return bVar.f9604b;
            }
        }
        return -1;
    }

    /* renamed from: i */
    public static synchronized C2841x m11836i() {
        C2841x xVar;
        synchronized (C2841x.class) {
            if (f9597a == null) {
                f9597a = new C2841x();
            }
            xVar = f9597a;
        }
        return xVar;
    }

    /* renamed from: l */
    private void m11837l(C2369h0 h0Var, String str) {
        for (int i = 0; i < this.f9600d.length; i++) {
            if (Pattern.compile("^" + this.f9600d[i].f9610a + "$").matcher(str).find()) {
                h0Var.f8316h = this.f9600d[i].f9611b;
            }
        }
        h0Var.f8317i = "";
        h0Var.f8318j = -1;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: m */
    private boolean m11838m(Context context) {
        if (this.f9598b != null) {
            return true;
        }
        C2775u e = C2775u.m11726e(context.getApplicationContext());
        e.mo9329h();
        Cursor rawQuery = e.mo9325c().rawQuery("SELECT _id,name,slug FROM systems", null);
        if (!rawQuery.moveToFirst()) {
            rawQuery.close();
            return false;
        }
        this.f9600d = new C2846e[rawQuery.getCount()];
        int i = 0;
        do {
            String p = mo9427p(rawQuery.getString(1));
            if (p.contains("game boy")) {
                p = p.replace("game boy", "game ?boy");
            }
            if (p.contains("gameboy")) {
                p = p.replace("gameboy", "game ?boy");
            }
            if (p.contains("advance")) {
                p = p.replace("advance", "advanced?");
            }
            if (p.contains("color")) {
                p = p.replace("color", "colou?r");
            }
            if (p.contains("colour")) {
                p = p.replace("colour", "colou?r");
            }
            if (p.contains("3do")) {
                p = p.replace("3do", "3di?o");
            }
            if (p.contains("scumm")) {
                p = p.replace("scumm", "scumm?");
            }
            if (p.contains("nintendo ")) {
                p = p.replace("nintendo ", "(?:nintendo )?");
            }
            if (p.contains("sega ")) {
                p = p.replace("sega ", "(?:sega )?");
            }
            if (p.contains("commodore ")) {
                p = p.replace("commodore ", "(?:commodore )?");
            }
            if (p.contains("atari ")) {
                p = p.replace("atari ", "(?:atari )?");
            }
            if (p.contains("nec ")) {
                p = p.replace("nec ", "(?:neck? )?");
            }
            if (p.contains("sony ")) {
                p = p.replace("sony ", "(?:sony )?");
            }
            if (p.contains("playstation portable")) {
                p = p.replace("playstation portable", "(?:playstation portable|psp)");
            }
            this.f9600d[i] = new C2846e();
            C2846e[] eVarArr = this.f9600d;
            eVarArr[i].f9610a = p;
            eVarArr[i].f9611b = rawQuery.getString(2);
            i++;
        } while (rawQuery.moveToNext());
        Arrays.sort(this.f9600d, new C2842a());
        rawQuery.close();
        this.f9598b = "(";
        for (int i2 = 0; i2 < this.f9600d.length; i2++) {
            if (i2 > 0) {
                this.f9598b += "|";
            }
            this.f9598b += this.f9600d[i2].f9610a;
        }
        this.f9598b += ")";
        return true;
    }

    /* renamed from: n */
    private void m11839n(C2369h0 h0Var, String str) {
        String str2 = "computer";
        if (!str.equals(str2) && !str.equals("computers")) {
            str2 = "console";
            if (!str.equals(str2) && !str.equals("consoles")) {
                if (str.equals("hand held") || str.equals("hand helds") || str.equals("handheld") || str.equals("handhelds")) {
                    h0Var.f8317i = "handheld";
                }
                h0Var.f8316h = "";
            }
        }
        h0Var.f8317i = str2;
        h0Var.f8316h = "";
    }

    /* renamed from: b */
    public void mo9420b(Activity activity, String str, AbstractC2845d dVar) {
        new AsyncTaskC2844c().execute(activity, str, dVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo9421c(String str, AbstractC2845d dVar) {
        int i;
        if (str != null) {
            String p = mo9427p(str);
            if (!p.equals("")) {
                Matcher matcher = Pattern.compile("^(?:(?:sort|order) bu?y )?" + "(title|date|last played|my most played|my time played|my rating|most played|time played|rating|played)" + "$").matcher(p);
                if (matcher.find()) {
                    dVar.mo8928c0(mo9425k(matcher.group(1)));
                    return;
                }
                C2369h0 filter = dVar.getFilter();
                Matcher matcher2 = Pattern.compile("^(?:show (?:me )?|go to )?(home|systems|genres|played games|all games|options|settings|faq|help|frequently asked questions|edit theme)$").matcher(p);
                if (matcher2.find()) {
                    String group = matcher2.group(1);
                    if (Pattern.compile("favou?rites?(?: games)?").matcher(group).find()) {
                        group = "favorites";
                    }
                    dVar.mo8933f0(group);
                    return;
                }
                String str2 = "(?:" + "(?:released|published|developed|made)? ?(?:bu?y|from)(.*?)" + ")? ?(?:" + "(?:released |published )?(?:after (\\d\\d(?:\\d\\d)?)|before (\\d\\d(?:\\d\\d)?)|(?:in |from )?(\\d\\d(?:\\d\\d)?)|(?:between |from )?(\\d\\d(?:\\d\\d)?)(?: to | and )(\\d\\d(?:\\d\\d)?))" + ")? ?(?:" + "(?:released|published|developed|made)? ?(?:bu?y|from)(.*?)" + ")?";
                String str3 = "(?:(?:sort(?:ed)?|order(?:ed)?) bu?y )" + "(title|date|last played|my most played|my time played|my rating|most played|time played|rating|played)";
                Matcher matcher3 = Pattern.compile("^(?:show (?:me )?)?(all |every |go to )?" + "(my most played|most played|my longest played|longest played|last played|highest rated|best rated)? ?" + "(favou?rites?)? ?" + "(?:" + this.f9599c + "|(.*?))(?: games?)? on (?:the )?" + "(?:((?:2nd|second)|(?:3rd|third)|(?:4th|fourth)|(?:5th|fifth)|(?:6th|sixth)|(?:7th|seventh)|(?:8th|eighth)) generation)? ?" + "(?:" + this.f9598b + "|" + "(computers?|consoles?|arcade|hand ?helds?)(?: systems?| devices?)?" + ")(?: " + str2 + ")?(?:" + str3 + ")?$").matcher(p);
                if (matcher3.find()) {
                    if (matcher3.group(1) != null) {
                        filter.mo8532a();
                    }
                    if (matcher3.group(2) != null) {
                        mo9424j(filter, matcher3.group(2));
                    }
                    if (matcher3.group(3) != null) {
                        i = 1;
                        filter.f8313e = true;
                    } else {
                        i = 1;
                    }
                    if (matcher3.group(4) != null) {
                        filter.f8311c = m11835g(matcher3.group(4));
                        filter.f8320l = matcher3.group(4).substring(0, i).toUpperCase() + matcher3.group(4).substring(i);
                    }
                    if (matcher3.group(5) != null && !matcher3.group(5).trim().equals("")) {
                        filter.f8315g = matcher3.group(5).trim();
                    }
                    if (matcher3.group(6) != null) {
                        m11834f(filter, matcher3.group(6));
                    }
                    if (matcher3.group(7) != null) {
                        m11837l(filter, matcher3.group(7));
                    }
                    if (matcher3.group(8) != null) {
                        m11839n(filter, matcher3.group(8));
                    }
                    int e = m11833e(matcher3, 9, filter);
                    if (matcher3.group(e) != null) {
                        filter.f8322n = mo9425k(matcher3.group(e));
                        filter.f8323o = mo9422d(matcher3.group(e));
                    }
                    dVar.mo8929d(filter);
                    return;
                }
                Matcher matcher4 = Pattern.compile("^(?:show (?:me )?)?(all |every |go to )?" + "(my most played|most played|my longest played|longest played|last played|highest rated|best rated)? ?" + "(favou?rites?)? ?" + "(?:((?:2nd|second)|(?:3rd|third)|(?:4th|fourth)|(?:5th|fifth)|(?:6th|sixth)|(?:7th|seventh)|(?:8th|eighth)) generation)? ?" + "(?:" + this.f9598b + "{1,1}+|" + "(computers?|consoles?|arcade|hand ?helds?)(?: systems?| devices?)?" + ") (?:" + this.f9599c + "|(.*?)) ?(?:games?)? ?(?:" + str2 + ")?(?:" + str3 + ")?$").matcher(p);
                if (matcher4.find()) {
                    if (matcher4.group(1) != null) {
                        filter.mo8532a();
                    }
                    if (matcher4.group(2) != null) {
                        mo9424j(filter, matcher4.group(2));
                    }
                    if (matcher4.group(3) != null) {
                        filter.f8313e = true;
                    }
                    if (matcher4.group(4) != null) {
                        m11834f(filter, matcher4.group(4));
                    }
                    if (matcher4.group(5) != null) {
                        m11837l(filter, matcher4.group(5));
                    }
                    if (matcher4.group(6) != null) {
                        m11839n(filter, matcher4.group(6));
                    }
                    if (matcher4.group(7) != null) {
                        filter.f8311c = m11835g(matcher4.group(7));
                        filter.f8320l = matcher4.group(7).substring(0, 1).toUpperCase() + matcher4.group(7).substring(1);
                    }
                    if (matcher4.group(8) != null && !matcher4.group(8).trim().equals("")) {
                        filter.f8315g = matcher4.group(8).trim();
                    }
                    int e2 = m11833e(matcher4, 9, filter);
                    if (matcher4.group(e2) != null) {
                        filter.f8322n = mo9425k(matcher4.group(e2));
                        filter.f8323o = mo9422d(matcher4.group(e2));
                    }
                    dVar.mo8929d(filter);
                    return;
                }
                Matcher matcher5 = Pattern.compile("^(?:show (?:me )?)?(all |every |go to )?" + "(my most played|most played|my longest played|longest played|last played|highest rated|best rated)? ?" + "(favou?rites?)? ?" + "(?:((?:2nd|second)|(?:3rd|third)|(?:4th|fourth)|(?:5th|fifth)|(?:6th|sixth)|(?:7th|seventh)|(?:8th|eighth)) generation)? ?" + "(?:" + this.f9599c + "|" + "(computers?|consoles?|arcade|hand ?helds?)(?: systems?| devices?)?" + "|" + this.f9598b + "|(.*?)) ?(?:games?)? ?(?:" + str2 + ")?(?:" + str3 + ")?$").matcher(p);
                if (matcher5.find()) {
                    if (matcher5.group(1) != null) {
                        filter.mo8532a();
                    }
                    if (matcher5.group(2) != null) {
                        mo9424j(filter, matcher5.group(2));
                    }
                    if (matcher5.group(3) != null) {
                        filter.f8313e = true;
                    }
                    if (matcher5.group(4) != null) {
                        m11834f(filter, matcher5.group(4));
                    }
                    if (matcher5.group(5) != null) {
                        filter.f8311c = m11835g(matcher5.group(5));
                        filter.f8320l = matcher5.group(5).substring(0, 1).toUpperCase() + matcher5.group(5).substring(1);
                    }
                    if (matcher5.group(6) != null) {
                        m11839n(filter, matcher5.group(6));
                    }
                    if (matcher5.group(7) != null) {
                        m11837l(filter, matcher5.group(7));
                    }
                    if (matcher5.group(8) != null && !matcher5.group(8).trim().equals("")) {
                        filter.f8315g = matcher5.group(8).trim();
                    }
                    int e3 = m11833e(matcher5, 9, filter);
                    if (matcher5.group(e3) != null) {
                        filter.f8322n = mo9425k(matcher5.group(e3));
                        filter.f8323o = mo9422d(matcher5.group(e3));
                    }
                    dVar.mo8929d(filter);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo9422d(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1942855907:
                if (str.equals("my longest played")) {
                    c = 0;
                    break;
                }
                break;
            case -1854240504:
                if (str.equals("highest rated")) {
                    c = 1;
                    break;
                }
                break;
            case -1620143471:
                if (str.equals("my rating")) {
                    c = 2;
                    break;
                }
                break;
            case -938102371:
                if (str.equals("rating")) {
                    c = 3;
                    break;
                }
                break;
            case -492405176:
                if (str.equals("best rated")) {
                    c = 4;
                    break;
                }
                break;
            case 106034962:
                if (str.equals("my time played")) {
                    c = 5;
                    break;
                }
                break;
            case 683696006:
                if (str.equals("time played")) {
                    c = 6;
                    break;
                }
                break;
            case 1033237916:
                if (str.equals("my most played")) {
                    c = 7;
                    break;
                }
                break;
            case 1518318121:
                if (str.equals("longest played")) {
                    c = '\b';
                    break;
                }
                break;
            case 1610898960:
                if (str.equals("most played")) {
                    c = '\t';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
                return false;
            default:
                return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo9423h(Context context) {
        if (this.f9599c != null) {
            return true;
        }
        C2775u e = C2775u.m11726e(context.getApplicationContext());
        e.mo9329h();
        Cursor rawQuery = e.mo9325c().rawQuery("SELECT _id,name FROM genres", null);
        if (!rawQuery.moveToFirst()) {
            rawQuery.close();
            return false;
        }
        this.f9601e = new ArrayList<>();
        do {
            String[] split = rawQuery.getString(1).split("\\/| and |,");
            if (split.length > 1) {
                C2843b bVar = new C2843b();
                bVar.f9603a = mo9427p(rawQuery.getString(1));
                bVar.f9604b = rawQuery.getInt(0);
                this.f9601e.add(bVar);
            }
            for (String str : split) {
                C2843b bVar2 = new C2843b();
                bVar2.f9603a = mo9427p(str);
                bVar2.f9604b = rawQuery.getInt(0);
                this.f9601e.add(bVar2);
            }
        } while (rawQuery.moveToNext());
        rawQuery.close();
        this.f9599c = "(";
        for (int i = 0; i < this.f9601e.size(); i++) {
            if (i > 0) {
                this.f9599c += "|";
            }
            this.f9599c += this.f9601e.get(i).f9603a;
        }
        this.f9599c += ")";
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo9424j(C2369h0 h0Var, String str) {
        h0Var.f8322n = mo9425k(str);
        h0Var.f8323o = mo9422d(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public String mo9425k(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1942855907:
                if (str.equals("my longest played")) {
                    c = 0;
                    break;
                }
                break;
            case -1854240504:
                if (str.equals("highest rated")) {
                    c = 1;
                    break;
                }
                break;
            case -1620143471:
                if (str.equals("my rating")) {
                    c = 2;
                    break;
                }
                break;
            case -938102371:
                if (str.equals("rating")) {
                    c = 3;
                    break;
                }
                break;
            case -492405176:
                if (str.equals("best rated")) {
                    c = 4;
                    break;
                }
                break;
            case 106034962:
                if (str.equals("my time played")) {
                    c = 5;
                    break;
                }
                break;
            case 683696006:
                if (str.equals("time played")) {
                    c = 6;
                    break;
                }
                break;
            case 1033237916:
                if (str.equals("my most played")) {
                    c = 7;
                    break;
                }
                break;
            case 1518318121:
                if (str.equals("longest played")) {
                    c = '\b';
                    break;
                }
                break;
            case 1610898960:
                if (str.equals("most played")) {
                    c = '\t';
                    break;
                }
                break;
            case 1864072093:
                if (str.equals("last played")) {
                    c = '\n';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 5:
                return "timeplayed";
            case 1:
            case 3:
            case 4:
                return "crating";
            case 2:
                return "rating";
            case 6:
            case '\b':
                return "ctimeplayed";
            case 7:
                return "mostplayed";
            case '\t':
                return "cmostplayed";
            case '\n':
                return "played";
            default:
                return str;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public long mo9426o(int i) {
        if (i < 50) {
            i += 2000;
        } else if (i <= 100) {
            i += 1900;
        }
        Calendar instance = Calendar.getInstance();
        instance.clear();
        instance.set(i, 0, 1);
        return instance.getTimeInMillis();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public String mo9427p(String str) {
        return str.trim().toLowerCase().replaceAll("\\'", "").replaceAll("[^\\w]", " ").replaceAll(" +", " ");
    }
}
