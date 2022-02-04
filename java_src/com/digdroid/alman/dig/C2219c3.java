package com.digdroid.alman.dig;

import android.app.UiModeManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.digdroid.alman.dig.c3 */
public class C2219c3 {

    /* renamed from: a */
    private static C2219c3 f7954a;

    /* renamed from: b */
    private SharedPreferences f7955b;

    /* renamed from: c */
    private boolean f7956c = false;

    /* renamed from: d */
    private boolean f7957d = false;

    /* renamed from: e */
    private boolean f7958e = false;

    /* renamed from: f */
    private boolean f7959f = false;

    /* renamed from: g */
    public boolean f7960g = false;

    /* renamed from: h */
    private boolean f7961h;

    /* renamed from: i */
    private boolean f7962i;

    /* renamed from: j */
    public String f7963j = "default";

    /* renamed from: k */
    private Context f7964k;

    private C2219c3(Context context) {
        this.f7964k = context;
        this.f7955b = PreferenceManager.getDefaultSharedPreferences(context);
        this.f7961h = mo8190n("read_announcement", 0) < mo8190n("last_announcement", 0);
        this.f7962i = mo8180c("kiosk_mode", false);
    }

    /* renamed from: k */
    public static synchronized C2219c3 m9805k(Context context) {
        C2219c3 c3Var;
        synchronized (C2219c3.class) {
            if (f7954a == null) {
                f7954a = new C2219c3(context.getApplicationContext());
            }
            c3Var = f7954a;
        }
        return c3Var;
    }

    /* renamed from: A */
    public void mo8152A(String str, boolean z) {
        mo8153B(str, z);
    }

    /* renamed from: B */
    public void mo8153B(String str, boolean z) {
        SharedPreferences.Editor edit = this.f7955b.edit();
        edit.putBoolean(str, z);
        edit.apply();
    }

    /* renamed from: C */
    public void mo8154C(long j) {
        mo8157F("dirs_last_scanned", j);
    }

    /* renamed from: D */
    public void mo8155D(String str, float f) {
        SharedPreferences.Editor edit = this.f7955b.edit();
        edit.putFloat(str, f);
        edit.apply();
    }

    /* renamed from: E */
    public void mo8156E(String str, int i) {
        SharedPreferences.Editor edit = this.f7955b.edit();
        edit.putInt(str, i);
        edit.apply();
    }

    /* renamed from: F */
    public void mo8157F(String str, long j) {
        SharedPreferences.Editor edit = this.f7955b.edit();
        edit.putLong(str, j);
        edit.apply();
    }

    /* renamed from: G */
    public void mo8158G(String str, String str2) {
        SharedPreferences.Editor edit = this.f7955b.edit();
        edit.putString(str, str2);
        edit.apply();
    }

    /* renamed from: H */
    public void mo8159H(String str, Set<String> set) {
        SharedPreferences.Editor edit = this.f7955b.edit();
        edit.putStringSet(str, set);
        edit.apply();
    }

    /* renamed from: I */
    public void mo8160I(String str) {
        SharedPreferences.Editor edit = this.f7955b.edit();
        try {
            edit.remove(str);
            edit.apply();
        } catch (Exception unused) {
        }
    }

    /* renamed from: J */
    public void mo8161J(String str) {
        long t = C2185a4.m9690t(str);
        mo8157F("last_announcement", t);
        this.f7961h = mo8190n("read_announcement", 0) < t;
    }

    /* renamed from: K */
    public void mo8162K(boolean z) {
        mo8153B("download_covers", z);
    }

    /* renamed from: L */
    public synchronized void mo8163L(boolean z) {
        this.f7958e = z;
    }

    /* renamed from: M */
    public void mo8164M(String str) {
        mo8158G("game_list_type", str);
    }

    /* renamed from: N */
    public void mo8165N(long j) {
        mo8157F("game_start_t", j);
    }

    /* renamed from: O */
    public void mo8166O(double d) {
        mo8155D("game_block_size", (float) d);
    }

    /* renamed from: P */
    public void mo8167P(boolean z) {
        this.f7959f = z;
    }

    /* renamed from: Q */
    public synchronized void mo8168Q(boolean z) {
        this.f7957d = z;
    }

    /* renamed from: R */
    public synchronized void mo8169R(boolean z) {
        mo8153B("images_renamed", z);
    }

    /* renamed from: S */
    public void mo8170S(boolean z) {
        mo8153B("inform_scan", z);
    }

    /* renamed from: T */
    public void mo8171T(boolean z) {
        this.f7962i = z;
        mo8153B("kiosk_mode", z);
    }

    /* renamed from: U */
    public void mo8172U(boolean z) {
        mo8153B("launch_immediately", z);
    }

    /* renamed from: V */
    public synchronized void mo8173V(boolean z) {
        this.f7956c = z;
    }

    /* renamed from: W */
    public void mo8174W(boolean z) {
        mo8153B("show_all_systems", z);
    }

    /* renamed from: X */
    public void mo8175X(double d) {
        mo8155D("systems_block_size", (float) d);
    }

    /* renamed from: Y */
    public void mo8176Y() {
        mo8157F("read_announcement", mo8190n("last_announcement", 0));
        this.f7961h = false;
    }

    /* renamed from: Z */
    public boolean mo8177Z() {
        File[] b = C2372h2.m10298b(this.f7964k);
        SharedPreferences sharedPreferences = this.f7955b;
        boolean z = true;
        if (b == null || b.length <= 1 || b[1] == null) {
            z = false;
        }
        return sharedPreferences.getBoolean("use_sd_card", z);
    }

    /* renamed from: a */
    public boolean mo8178a() {
        return this.f7955b.getBoolean("download_covers", true);
    }

    /* renamed from: b */
    public String mo8179b() {
        return this.f7955b.getString("game_list_type", "grid");
    }

    /* renamed from: c */
    public boolean mo8180c(String str, boolean z) {
        return this.f7955b.getBoolean(str, z);
    }

    /* renamed from: d */
    public long mo8181d() {
        return this.f7955b.getLong("dirs_last_scanned", 0);
    }

    /* renamed from: e */
    public synchronized boolean mo8182e() {
        return this.f7958e;
    }

    /* renamed from: f */
    public float mo8183f(String str, float f) {
        return this.f7955b.getFloat(str, f);
    }

    /* renamed from: g */
    public Long mo8184g() {
        return Long.valueOf(this.f7955b.getLong("game_start_t", 0));
    }

    /* renamed from: h */
    public boolean mo8185h() {
        return this.f7959f;
    }

    /* renamed from: i */
    public synchronized boolean mo8186i() {
        return this.f7957d;
    }

    /* renamed from: j */
    public boolean mo8187j() {
        return this.f7955b.getBoolean("inform_scan", true);
    }

    /* renamed from: l */
    public int mo8188l(String str, int i) {
        return this.f7955b.getInt(str, i);
    }

    /* renamed from: m */
    public boolean mo8189m() {
        return this.f7955b.getBoolean("launch_immediately", false);
    }

    /* renamed from: n */
    public long mo8190n(String str, long j) {
        return this.f7955b.getLong(str, j);
    }

    /* renamed from: o */
    public synchronized boolean mo8191o() {
        return this.f7956c;
    }

    /* renamed from: p */
    public boolean mo8192p() {
        return this.f7955b.getBoolean("show_all_systems", false);
    }

    /* renamed from: q */
    public String mo8193q(String str, String str2) {
        return this.f7955b.getString(str, str2);
    }

    /* renamed from: r */
    public Set<String> mo8194r(String str) {
        return this.f7955b.getStringSet(str, new HashSet());
    }

    /* renamed from: s */
    public synchronized boolean mo8195s() {
        return this.f7955b.getBoolean("images_renamed", false);
    }

    /* renamed from: t */
    public boolean mo8196t() {
        return this.f7962i;
    }

    /* renamed from: u */
    public boolean mo8197u() {
        return ((UiModeManager) this.f7964k.getSystemService("uimode")).getCurrentModeType() == 4;
    }

    /* renamed from: v */
    public boolean mo8198v() {
        return this.f7961h;
    }

    /* renamed from: w */
    public void mo8199w(String str, float f) {
        mo8155D(str, f);
    }

    /* renamed from: x */
    public void mo8200x(String str, int i) {
        mo8156E(str, i);
    }

    /* renamed from: y */
    public void mo8201y(String str, long j) {
        mo8157F(str, j);
    }

    /* renamed from: z */
    public void mo8202z(String str, String str2) {
        mo8158G(str, str2);
    }
}
