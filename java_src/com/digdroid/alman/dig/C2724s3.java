package com.digdroid.alman.dig;

import android.content.Context;
import android.graphics.Point;
import java.io.File;

/* access modifiers changed from: package-private */
/* renamed from: com.digdroid.alman.dig.s3 */
public class C2724s3 extends C2492n {

    /* renamed from: f */
    String f9260f;

    /* renamed from: g */
    C2219c3 f9261g;

    /* renamed from: h */
    ActivityC2220c4 f9262h;

    /* renamed from: i */
    float f9263i = 1.0f;

    /* renamed from: j */
    float f9264j = 1.0f;

    /* renamed from: k */
    int f9265k = 0;

    /* renamed from: l */
    int f9266l = 0;

    /* renamed from: m */
    Point f9267m;

    public C2724s3(ActivityC2220c4 c4Var) {
        super(c4Var);
        this.f9262h = c4Var;
        this.f9260f = null;
        this.f9261g = C2219c3.m9805k(c4Var);
    }

    public C2724s3(ActivityC2220c4 c4Var, String str) {
        super(c4Var);
        this.f9262h = c4Var;
        this.f9260f = str;
        this.f9261g = C2219c3.m9805k(c4Var);
    }

    public C2724s3(C2724s3 s3Var) {
        super(s3Var);
        this.f9262h = s3Var.f9262h;
        this.f9260f = s3Var.f9260f;
        this.f9261g = s3Var.f9261g;
    }

    /* renamed from: J */
    public static String m11551J(Context context) {
        try {
            String K = m11552K(context);
            return K == null ? "" : K;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: K */
    public static String m11552K(Context context) {
        if (context == null) {
            return "";
        }
        C2219c3 k = C2219c3.m9805k(context);
        int l = k.mo8188l("theme_storage", 1);
        if (l == 0) {
            return k.mo8193q("theme_storage_dir", "");
        }
        File[] b = C2372h2.m10298b(context);
        if (l == 2 && b != null && b.length > 1 && b[1] != null) {
            return b[1].getAbsolutePath() + "/Themes";
        } else if (b == null || b.length <= 0 || b[0] == null) {
            return "";
        } else {
            return b[0].getAbsolutePath() + "/Themes";
        }
    }

    /* renamed from: v */
    private void m11553v(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    m11553v(file2);
                } else {
                    try {
                        file2.delete();
                    } catch (Exception unused) {
                    }
                }
            }
            try {
                file.delete();
            } catch (Exception unused2) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo9200A(String str) {
        String i = mo8772i(str);
        if (!i.equals("")) {
            this.f9261g.mo8153B(str, i.equalsIgnoreCase("true"));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo9201B(String str) {
        String i = mo8772i(str);
        if (!i.equals("")) {
            try {
                this.f9261g.mo8155D(str, Float.parseFloat(i));
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: C */
    public String mo9202C() {
        File externalFilesDir;
        Context context = this.f8647a;
        if (context == null || (externalFilesDir = context.getExternalFilesDir(null)) == null) {
            return null;
        }
        String str = externalFilesDir.getAbsolutePath() + "/Themes";
        File file = new File(str);
        if (!file.exists()) {
            try {
                file.mkdirs();
            } catch (Exception unused) {
                return null;
            }
        }
        return str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo9203D(String str) {
        String i = mo8772i(str);
        if (!i.equals("")) {
            this.f9261g.mo8156E(str, Integer.parseInt(i));
        }
    }

    /* renamed from: E */
    public int mo9204E(String str, String str2, int i) {
        if (!str.equals("default")) {
            if (!mo8772i(str + "_" + str2).equals("")) {
                return mo8769f(str + "_" + str2, i);
            }
        }
        return mo8769f(str2, i);
    }

    /* renamed from: F */
    public int mo9205F(String str, String str2, int i) {
        if (!str.equals("default")) {
            if (!mo8772i(str + "_" + str2).equals("")) {
                return mo8770g(str + "_" + str2, i);
            }
        }
        return mo8770g(str2, i);
    }

    /* renamed from: G */
    public String mo9206G(String str, String str2) {
        if (!str.equals("default")) {
            String I = mo9208I(str + "_" + str2);
            if (!I.equals("")) {
                return I;
            }
        }
        return mo9208I(str2);
    }

    /* renamed from: H */
    public String mo9207H(String str, String str2) {
        if (!str.equals("default")) {
            String i = mo8772i(str + "_" + str2);
            if (!i.equals("")) {
                return i;
            }
        }
        return mo8772i(str2);
    }

    /* renamed from: I */
    public String mo9208I(String str) {
        String i = mo8772i(str);
        if (i.equals("") || i.substring(0, 1).equals("/")) {
            return i;
        }
        String J = m11551J(this.f8647a);
        if (J == null) {
            return "";
        }
        return J + "/" + mo9226c0() + "/" + i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public void mo9209L(String str) {
        String i = mo8772i(str);
        if (!i.equals("")) {
            this.f9261g.mo8158G(str, i);
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0148, code lost:
        if (r11.equals("systems") == false) goto L_0x011a;
     */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9210M(java.lang.String r11, com.digdroid.alman.dig.C2774t3 r12) {
        /*
        // Method dump skipped, instructions count: 412
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.C2724s3.mo9210M(java.lang.String, com.digdroid.alman.dig.t3):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public void mo9211N() {
        this.f9263i = mo8768e("theme_density", 1.0f);
        this.f9264j = mo8768e("theme_scaled_density", 1.0f);
        this.f9265k = mo8770g("theme_width", 0);
        this.f9266l = mo8770g("theme_height", 0);
        this.f9267m = this.f9262h.mo8203g(true);
        if (this.f9261g.mo8180c("new_theme_set", true)) {
            this.f9261g.mo8155D("main_aspect_ratio", mo8768e("theme_aspect_ratio", -1.0f));
            mo9212O("game");
            mo9212O("systems");
            mo9212O("home");
            mo9212O("genres");
            mo9212O("collections");
            mo9212O("themes");
            mo9209L("editthemes_toolbar");
            mo9209L("splash_toolbar");
            mo9209L("announcements_toolbar");
            mo9209L("gamepad_toolbar");
            mo9209L("notes_toolbar");
            mo9209L("options_toolbar");
            mo9209L("webpage_toolbar");
            mo9209L("themes_toolbar");
            mo9201B("icons_toolbar_scale");
            mo9201B("toolbar_icon_scale");
            mo9201B("toolbar_icons_padding");
            mo9200A("games_preview_enabled");
            mo9203D("games_preview_lines");
            mo9200A("games_preview_play");
            mo9200A("games_preview_play_mobile");
            mo9203D("games_preview_size");
            mo9203D("games_preview_padding");
            this.f9261g.mo8153B("new_theme_set", false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public void mo9212O(String str) {
        mo9209L(str + "_toolbar");
        mo9209L(str + "_list_type");
        mo9201B(str + "_block_size");
        mo9201B(str + "_list_scale");
        mo9201B(str + "_list_spacing");
        mo9201B(str + "_title_scale");
        mo9201B(str + "_title_spacing");
        mo9201B(str + "_vertical_scale");
        mo9201B(str + "_vertical_spacing");
        mo9201B(str + "_carousel_scale");
        mo9201B(str + "_carousel_spacing");
        mo9201B(str + "_coverflow_scale");
        mo9201B(str + "_coverflow_spacing");
        mo9201B(str + "_wheel_scale");
        mo9201B(str + "_wheel_spacing");
        mo9201B(str + "_linear_scale");
        mo9201B(str + "_linear_spacing");
        mo9200A(str + "_8bit");
        mo9200A(str + "_icons_only");
        mo9201B(str + "_aspect_ratio");
    }

    /* renamed from: P */
    public boolean mo9213P(String str) {
        this.f9260f = str;
        String C = mo9202C();
        if (C != null) {
            Context context = this.f8647a;
            super.mo8774k(C2399i2.m10374d(context, C + "/" + str));
        }
        if (this.f8648b.equals("")) {
            return false;
        }
        mo8775l();
        mo9227d0();
        mo9211N();
        return true;
    }

    /* renamed from: Q */
    public void mo9214Q() {
        String C = mo9202C();
        if (C != null) {
            Context context = this.f8647a;
            C2399i2 d = C2399i2.m10374d(context, C + "/___tmp.cfg");
            super.mo8774k(d);
            mo8775l();
            try {
                d.delete();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: R */
    public synchronized void mo9215R() {
        mo9216S(true);
    }

    /* renamed from: S */
    public synchronized void mo9216S(boolean z) {
        String C = mo9202C();
        if (C != null) {
            if (z) {
                mo9222Y();
            }
            super.mo8781r(C + "/" + this.f9260f);
        }
    }

    /* renamed from: T */
    public void mo9217T() {
        String C = mo9202C();
        if (C != null) {
            super.mo8781r(C + "/___tmp.cfg");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public void mo9218U(String str, boolean z) {
        mo8782s(str, this.f9261g.mo8180c(str, z) ? "true" : "false");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public void mo9219V(String str, float f) {
        mo8782s(str, "" + this.f9261g.mo8183f(str, f));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public void mo9220W(String str, int i) {
        mo8782s(str, "" + this.f9261g.mo8188l(str, i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public void mo9221X(String str, String str2) {
        mo8782s(str, this.f9261g.mo8193q(str, str2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public void mo9222Y() {
        mo9223Z("game", "grid");
        mo9223Z("systems", "grid");
        mo9223Z("home", "title");
        mo9223Z("genres", "title");
        mo9223Z("collections", "title");
        mo9223Z("themes", "coverflow");
        mo9221X("editthemes_toolbar", "default");
        mo9221X("splash_toolbar", "none");
        mo9221X("announcements_toolbar", "default");
        mo9221X("gamepad_toolbar", "none");
        mo9221X("notes_toolbar", "default");
        mo9221X("options_toolbar", "default");
        mo9221X("webpage_toolbar", "default");
        mo9221X("themes_toolbar", "default");
        mo9219V("icons_toolbar_scale", 10.0f);
        mo9219V("toolbar_icon_spacing", 0.08f);
        mo9219V("toolbar_icons_padding", 0.0f);
        mo9218U("games_preview_enabled", false);
        mo9220W("games_preview_lines", 3);
        mo9218U("games_preview_play", true);
        mo9218U("games_preview_play_mobile", false);
        mo9220W("games_preview_size", 50);
        mo9220W("games_preview_padding", 5);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public void mo9223Z(String str, String str2) {
        mo9221X(str + "_toolbar", "default");
        mo9221X(str + "_list_type", str2);
        mo9219V(str + "_block_size", 170.0f);
        mo9219V(str + "_list_scale", 1.0f);
        mo9219V(str + "_list_spacing", 1.0f);
        mo9219V(str + "_title_scale", 1.0f);
        mo9219V(str + "_title_spacing", 1.0f);
        mo9219V(str + "_vertical_scale", 1.0f);
        mo9219V(str + "_vertical_spacing", 1.0f);
        mo9219V(str + "_carousel_scale", 1.0f);
        mo9219V(str + "_carousel_spacing", 1.0f);
        mo9219V(str + "_coverflow_scale", 1.0f);
        mo9219V(str + "_coverflow_spacing", 1.0f);
        mo9219V(str + "_wheel_scale", 1.0f);
        mo9219V(str + "_wheel_spacing", 1.0f);
        mo9219V(str + "_linear_scale", 1.0f);
        mo9219V(str + "_linear_spacing", 1.0f);
        mo9218U(str + "_8bit", true);
        mo9218U(str + "_icons_only", false);
        mo9219V(str + "_aspect_ratio", 1.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a0 */
    public void mo9224a0() {
        if (mo8772i("zoom").equals("")) {
            mo8782s("zoom", "fillscreen");
        }
        if (mo8772i("collections1").equals("")) {
            mo8782s("collections1", mo8772i("genres1"));
            mo8782s("collections2", mo8772i("genres2"));
        }
        if (mo8772i("games1").equals("")) {
            mo8782s("games1", mo8772i("genres1"));
            mo8782s("games2", mo8772i("genres2"));
        }
        if (mo8772i("systems1").equals("")) {
            mo8782s("systems1", mo8772i("genres1"));
            mo8782s("systems2", mo8772i("genres2"));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public float mo9225b0(float f) {
        int i = this.f9266l;
        if (i == 0) {
            return f * this.f8647a.getResources().getDisplayMetrics().scaledDensity;
        }
        return ((float) this.f9267m.y) * ((f * this.f9264j) / ((float) i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public String mo9226c0() {
        String str = this.f9260f;
        if (str == null) {
            return "<theme-name>";
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf > 0) {
            return this.f9260f.substring(0, lastIndexOf);
        }
        return this.f9260f + ".dir";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public void mo9227d0() {
        int g = mo8770g("version", 1);
        if (g < 13) {
            this.f9261g.mo8153B("new_theme_set", true);
            if (g < 2) {
                mo9224a0();
                mo8782s("systems_icons", mo8772i("system_icons"));
                mo8765a("system_icons");
                mo8782s("systems_system_backgrounds", mo8772i("system_backgrounds"));
                mo8765a("system_backgrounds");
                mo8782s("text1", mo8772i("other_text"));
                mo8782s("text2", mo8772i("game_title"));
                mo8782s("text3", mo8772i("game_info"));
                mo8765a("other_text");
                mo8765a("game_title");
                mo8765a("game_info");
                mo8782s("systems_text1", mo8772i("labels"));
                mo8782s("systems_text2", mo8772i("labels"));
                mo8782s("game_text1", mo8772i("labels"));
                mo8782s("game_text2", mo8772i("labels"));
                mo8782s("genres_text1", mo8772i("labels"));
                mo8782s("genres_text2", mo8772i("labels"));
                mo8782s("home_text1", mo8772i("labels"));
                mo8782s("home_text2", mo8772i("labels"));
                mo8782s("collections_text1", mo8772i("labels"));
                mo8782s("collections_text2", mo8772i("labels"));
                mo8765a("labels");
                mo8782s("home_gradient1", mo8772i("main1"));
                mo8782s("home_gradient2", mo8772i("main2"));
                mo8765a("main1");
                mo8765a("main2");
                mo8782s("genres_gradient1", mo8772i("genres1"));
                mo8782s("genres_gradient2", mo8772i("genres2"));
                mo8765a("genres1");
                mo8765a("genres2");
                mo8782s("collections_gradient1", mo8772i("collections1"));
                mo8782s("collections_gradient2", mo8772i("collections2"));
                mo8765a("collections1");
                mo8765a("collections2");
                mo8782s("game_gradient1", mo8772i("games1"));
                mo8782s("game_gradient2", mo8772i("games2"));
                mo8765a("games1");
                mo8765a("games2");
                mo8782s("systems_gradient1", mo8772i("systems1"));
                mo8782s("systems_gradient2", mo8772i("systems2"));
                mo8765a("systems1");
                mo8765a("systems2");
            }
            if (g < 3) {
                mo8782s("games_preview_enabled", "false");
                mo8782s("games_preview_play", "true");
                mo8782s("games_preview_play_mobile", "false");
                mo8782s("games_preview_size", "50");
                mo8782s("games_preview_padding", "5");
            }
            if (g < 4) {
                mo8777n("theme_aspect_ratio", -1.0f);
            }
            if (g < 5) {
                mo8779p("games_preview_lines", 3);
            }
            if (g < 6) {
                mo8779p("theme_width", 0);
                mo8779p("theme_height", 0);
                mo8777n("theme_density", 1.0f);
            }
            if (g < 13) {
                mo8777n("themes_aspect_ratio", 1.7777778f);
            }
            mo8779p("version", 13);
            mo9216S(false);
        }
    }

    @Override // com.digdroid.alman.dig.C2492n
    /* renamed from: j */
    public void mo8773j(String str) {
        this.f9260f = str.substring(str.indexOf(47) + 1);
        super.mo8773j(str);
        mo8775l();
        mo9227d0();
        mo9211N();
    }

    /* renamed from: u */
    public void mo9228u() {
        String C = mo9202C();
        if (C != null) {
            try {
                new File(C + "/" + this.f9260f).delete();
            } catch (Exception unused) {
            }
            File file = new File(m11551J(this.f8647a) + "/" + mo9226c0());
            if (file.exists() && file.isDirectory()) {
                m11553v(file);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public float mo9229w(float f, int i, int i2) {
        if (i == 0) {
            return f * this.f8647a.getResources().getDisplayMetrics().density;
        }
        return ((float) i2) * ((f * this.f9263i) / ((float) i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public float mo9230x(float f) {
        return mo9229w(f, this.f9265k, this.f9267m.x);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public float mo9231y(float f) {
        return mo9229w(f, this.f9266l, this.f9267m.y);
    }

    /* renamed from: z */
    public boolean mo9232z() {
        String C = mo9202C();
        if (C == null) {
            return false;
        }
        return new File(C + "/" + this.f9260f).exists();
    }
}
