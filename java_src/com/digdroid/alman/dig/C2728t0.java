package com.digdroid.alman.dig;

import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.appcompat.app.DialogInterfaceC0068b;
import androidx.appcompat.widget.C0248l0;
import androidx.fragment.app.ActivityC0447d;
import com.digdroid.alman.dig.AbstractC2531p1;
import com.digdroid.alman.dig.C2223d0;
import com.digdroid.alman.dig.C2267e2;
import com.digdroid.alman.dig.C2324g1;
import com.digdroid.alman.dig.C2465m0;
import com.digdroid.alman.dig.C2749t1;
import java.util.concurrent.Callable;
import p006b.p007a.p014o.C0788d;

/* renamed from: com.digdroid.alman.dig.t0 */
public class C2728t0 extends AbstractC2577r1 implements C2324g1.AbstractC2325a {

    /* renamed from: s0 */
    C2369h0 f9278s0;

    /* renamed from: t0 */
    private boolean f9279t0 = false;

    /* renamed from: u0 */
    private boolean f9280u0 = false;

    /* renamed from: v0 */
    EnumC2748l f9281v0 = EnumC2748l.CONTAINS;

    /* renamed from: w0 */
    private String f9282w0;

    /* renamed from: x0 */
    C2786v0 f9283x0 = null;

    /* renamed from: y0 */
    long f9284y0 = 0;

    /* renamed from: com.digdroid.alman.dig.t0$a */
    class C2729a implements C2267e2.AbstractC2291x {

        /* renamed from: a */
        Handler f9285a = new Handler();

        /* renamed from: b */
        int f9286b = -1;

        /* renamed from: com.digdroid.alman.dig.t0$a$a */
        class RunnableC2730a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ int f9288b;

            RunnableC2730a(int i) {
                this.f9288b = i;
            }

            public void run() {
                if (C2728t0.this.mo8102B2()) {
                    C2728t0.this.mo9242A3(this.f9288b);
                    int i = this.f9288b;
                    C2729a aVar = C2729a.this;
                    if (i != aVar.f9286b) {
                        C2728t0 t0Var = C2728t0.this;
                        if (t0Var.f8803j0) {
                            t0Var.m11596H3(i);
                        }
                    }
                    C2729a.this.f9286b = this.f9288b;
                }
            }
        }

        C2729a() {
        }

        @Override // com.digdroid.alman.dig.C2267e2.AbstractC2291x
        /* renamed from: a */
        public void mo8406a(View view, int i) {
            this.f9285a.removeCallbacksAndMessages(null);
            this.f9285a.postDelayed(new RunnableC2730a(i), 100);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.t0$b */
    public class CallableC2731b implements Callable<String> {
        CallableC2731b() {
        }

        /* renamed from: a */
        public String call() {
            C2728t0 t0Var = C2728t0.this;
            C2786v0 v0Var = t0Var.f9283x0;
            if (v0Var == null) {
                return null;
            }
            v0Var.mo9340f(t0Var.f8957o0, t0Var.f8958p0.mo8321f());
            return null;
        }
    }

    /* renamed from: com.digdroid.alman.dig.t0$c */
    class C2732c implements C2267e2.AbstractC2291x {

        /* renamed from: a */
        Handler f9291a = new Handler();

        /* renamed from: com.digdroid.alman.dig.t0$c$a */
        class RunnableC2733a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ int f9293b;

            RunnableC2733a(int i) {
                this.f9293b = i;
            }

            public void run() {
                if (C2728t0.this.mo8102B2()) {
                    C2728t0.this.mo9242A3(this.f9293b);
                }
            }
        }

        C2732c() {
        }

        @Override // com.digdroid.alman.dig.C2267e2.AbstractC2291x
        /* renamed from: a */
        public void mo8406a(View view, int i) {
            this.f9291a.removeCallbacksAndMessages(null);
            this.f9291a.postDelayed(new RunnableC2733a(i), 100);
        }
    }

    /* renamed from: com.digdroid.alman.dig.t0$d */
    class C2734d implements C2223d0.AbstractC2249s {
        C2734d() {
        }

        @Override // com.digdroid.alman.dig.C2223d0.AbstractC2249s
        /* renamed from: a */
        public void mo7941a() {
            if (C2728t0.this.f8793Z.mo8180c("games_preview_enabled", false)) {
                C2728t0 t0Var = C2728t0.this;
                if (t0Var.f9283x0 == null) {
                    t0Var.f9283x0 = new C2786v0(t0Var);
                }
                C2728t0.this.f9283x0.mo9342h();
            }
            C2728t0 t0Var2 = C2728t0.this;
            t0Var2.mo9242A3(t0Var2.f8956n0);
        }

        @Override // com.digdroid.alman.dig.C2223d0.AbstractC2249s
        /* renamed from: b */
        public void mo7942b() {
        }
    }

    /* renamed from: com.digdroid.alman.dig.t0$e */
    class C2735e implements C2223d0.AbstractC2249s {
        C2735e() {
        }

        @Override // com.digdroid.alman.dig.C2223d0.AbstractC2249s
        /* renamed from: a */
        public void mo7941a() {
            C2728t0 t0Var = C2728t0.this;
            if (t0Var.f9283x0 == null) {
                t0Var.f9283x0 = new C2786v0(t0Var);
            }
            C2728t0 t0Var2 = C2728t0.this;
            t0Var2.f9283x0.mo9344j(t0Var2.f8957o0, t0Var2.f8958p0.mo8321f());
        }

        @Override // com.digdroid.alman.dig.C2223d0.AbstractC2249s
        /* renamed from: b */
        public void mo7942b() {
        }
    }

    /* renamed from: com.digdroid.alman.dig.t0$f */
    class C2736f implements C0248l0.AbstractC0252d {

        /* renamed from: a */
        final /* synthetic */ long f9297a;

        /* renamed from: b */
        final /* synthetic */ boolean f9298b;

        /* renamed from: com.digdroid.alman.dig.t0$f$a */
        class C2737a implements C2749t1.AbstractC2772l {
            C2737a() {
            }

            @Override // com.digdroid.alman.dig.C2749t1.AbstractC2772l
            /* renamed from: a */
            public void mo8684a() {
                C2728t0.this.mo8407O2();
            }
        }

        /* renamed from: com.digdroid.alman.dig.t0$f$b */
        class C2738b implements C2749t1.AbstractC2772l {
            C2738b() {
            }

            @Override // com.digdroid.alman.dig.C2749t1.AbstractC2772l
            /* renamed from: a */
            public void mo8684a() {
                C2728t0.this.mo8407O2();
            }
        }

        /* renamed from: com.digdroid.alman.dig.t0$f$c */
        class C2739c implements C2465m0.AbstractC2488p {
            C2739c() {
            }

            @Override // com.digdroid.alman.dig.C2465m0.AbstractC2488p
            /* renamed from: a */
            public void mo8663a() {
                C2728t0.this.f8806m0.mo8264R();
                C2728t0.this.mo8105F2();
            }

            @Override // com.digdroid.alman.dig.C2465m0.AbstractC2488p
            /* renamed from: b */
            public void mo8664b() {
                C2728t0.this.f8806m0.mo8264R();
                C2728t0.this.mo8105F2();
            }

            @Override // com.digdroid.alman.dig.C2465m0.AbstractC2488p
            /* renamed from: c */
            public void mo8665c(boolean z) {
                C2728t0.this.f8806m0.mo8264R();
                C2728t0.this.mo8105F2();
            }

            @Override // com.digdroid.alman.dig.C2465m0.AbstractC2488p
            public C2369h0 getFilter() {
                return C2728t0.this.f9278s0;
            }
        }

        C2736f(long j, boolean z) {
            this.f9297a = j;
            this.f9298b = z;
        }

        @Override // androidx.appcompat.widget.C0248l0.AbstractC0252d
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (menuItem.getItemId() == R.id.box_cover) {
                C2749t1.m11663p(C2728t0.this.f8805l0).mo9276k(C2728t0.this.mo2552c0(), C2728t0.this, this.f9297a, this.f9298b, new C2737a());
                return true;
            } else if (menuItem.getItemId() == R.id.screenshot) {
                C2749t1.m11663p(C2728t0.this.f8805l0).mo9276k(C2728t0.this.mo2552c0(), C2728t0.this, this.f9297a, !this.f9298b, new C2738b());
                return true;
            } else {
                new C2465m0(C2728t0.this.mo2552c0(), this.f9297a, new C2739c(), C2728t0.this.f8806m0).mo8729c(menuItem);
                return true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.t0$g */
    public class C2740g implements C0248l0.AbstractC0252d {
        C2740g() {
        }

        @Override // androidx.appcompat.widget.C0248l0.AbstractC0252d
        public boolean onMenuItemClick(MenuItem menuItem) {
            C2728t0.this.mo9247J3(menuItem.getItemId());
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.t0$h */
    public class C2741h implements AdapterView.OnItemSelectedListener {
        C2741h() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            C2728t0.this.f8793Z.mo8156E("min_ratings", i + 1);
            C2728t0.this.mo2552c0().invalidateOptionsMenu();
            C2728t0.this.mo9021q3();
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: com.digdroid.alman.dig.t0$i */
    class C2742i implements C2223d0.AbstractC2249s {
        C2742i() {
        }

        @Override // com.digdroid.alman.dig.C2223d0.AbstractC2249s
        /* renamed from: a */
        public void mo7941a() {
            C2728t0 t0Var = C2728t0.this;
            if (t0Var.f9283x0 == null) {
                t0Var.f9283x0 = new C2786v0(t0Var);
            }
            C2728t0.this.f9283x0.mo9337c();
        }

        @Override // com.digdroid.alman.dig.C2223d0.AbstractC2249s
        /* renamed from: b */
        public void mo7942b() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.t0$j */
    public class C2743j implements C2223d0.AbstractC2249s {

        /* access modifiers changed from: package-private */
        /* renamed from: com.digdroid.alman.dig.t0$j$a */
        public class DialogInterface$OnClickListenerC2744a implements DialogInterface.OnClickListener {

            /* renamed from: b */
            final /* synthetic */ long[] f9307b;

            /* renamed from: c */
            final /* synthetic */ SQLiteDatabase f9308c;

            /* access modifiers changed from: package-private */
            /* renamed from: com.digdroid.alman.dig.t0$j$a$a */
            public class C2745a implements C2465m0.AbstractC2487o {

                /* renamed from: com.digdroid.alman.dig.t0$j$a$a$a */
                class AsyncTaskC2746a extends AsyncTask<Cursor, Void, Void> {

                    /* renamed from: a */
                    final /* synthetic */ long f9311a;

                    AsyncTaskC2746a(long j) {
                        this.f9311a = j;
                    }

                    /* access modifiers changed from: protected */
                    /* renamed from: a */
                    public Void doInBackground(Cursor... cursorArr) {
                        Cursor cursor = cursorArr[0];
                        if (cursor.moveToFirst()) {
                            do {
                                long j = cursor.getLong(0);
                                SQLiteDatabase sQLiteDatabase = DialogInterface$OnClickListenerC2744a.this.f9308c;
                                Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT _id FROM gamecollection WHERE collection=" + this.f9311a + " AND game=" + j, null);
                                if (!rawQuery.moveToFirst()) {
                                    ContentValues contentValues = new ContentValues();
                                    contentValues.put("collection", Long.valueOf(this.f9311a));
                                    contentValues.put("game", Long.valueOf(j));
                                    DialogInterface$OnClickListenerC2744a.this.f9308c.insert("gamecollection", null, contentValues);
                                }
                                rawQuery.close();
                            } while (cursor.moveToNext());
                        }
                        cursor.close();
                        return null;
                    }

                    /* access modifiers changed from: protected */
                    /* renamed from: b */
                    public void onPostExecute(Void r2) {
                        C2728t0.this.f8806m0.mo8264R();
                        C2728t0.this.mo8106G2(false);
                    }
                }

                C2745a() {
                }

                @Override // com.digdroid.alman.dig.C2465m0.AbstractC2487o
                /* renamed from: a */
                public void mo8739a(long j) {
                    new AsyncTaskC2746a(j).execute(C2728t0.this.mo8694k3());
                }
            }

            DialogInterface$OnClickListenerC2744a(long[] jArr, SQLiteDatabase sQLiteDatabase) {
                this.f9307b = jArr;
                this.f9308c = sQLiteDatabase;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C2465m0.m10622b(C2728t0.this.mo2552c0(), this.f9307b[i], new C2745a());
            }
        }

        C2743j() {
        }

        @Override // com.digdroid.alman.dig.C2223d0.AbstractC2249s
        /* renamed from: a */
        public void mo7941a() {
            SQLiteDatabase c = C2728t0.this.f8794a0.mo9325c();
            Cursor rawQuery = c.rawQuery("SELECT _id,name FROM collections WHERE isfolder=0 ORDER BY name", null);
            int count = rawQuery.moveToFirst() ? rawQuery.getCount() : 0;
            int i = count + 1;
            CharSequence[] charSequenceArr = new CharSequence[i];
            long[] jArr = new long[i];
            charSequenceArr[0] = C2728t0.this.mo2552c0().getString(R.string.new_collection);
            jArr[0] = -1;
            int i2 = 0;
            while (i2 < count) {
                i2++;
                charSequenceArr[i2] = rawQuery.getString(1);
                jArr[i2] = rawQuery.getLong(0);
                rawQuery.moveToNext();
            }
            rawQuery.close();
            new DialogInterfaceC0068b.C0069a(C2728t0.this.mo2552c0(), C2553q3.m11117c()).mo238r(R.string.add_to_collection).mo227g(charSequenceArr, new DialogInterface$OnClickListenerC2744a(jArr, c)).mo221a().show();
        }

        @Override // com.digdroid.alman.dig.C2223d0.AbstractC2249s
        /* renamed from: b */
        public void mo7942b() {
        }
    }

    /* renamed from: com.digdroid.alman.dig.t0$k */
    class AsyncTaskC2747k extends AsyncTask<Void, Void, Integer> {

        /* renamed from: a */
        Cursor f9313a;

        /* renamed from: b */
        boolean f9314b;

        public AsyncTaskC2747k(Object obj, boolean z) {
            this.f9313a = (Cursor) obj;
            this.f9314b = z;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Integer doInBackground(Void... voidArr) {
            int i;
            Cursor cursor = this.f9313a;
            if (cursor == null || cursor.isClosed()) {
                i = -1;
            } else {
                int columnIndex = this.f9313a.getColumnIndex("sortname");
                char b = mo9260b(this.f9313a.getString(columnIndex));
                do {
                    if ((!this.f9314b || this.f9313a.moveToNext()) && (this.f9314b || this.f9313a.moveToPrevious())) {
                    }
                } while (mo9260b(this.f9313a.getString(columnIndex)) == b);
                i = this.f9313a.getPosition();
            }
            return Integer.valueOf(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public char mo9260b(String str) {
            char charAt = str.charAt(0);
            if (!Character.isLetter(charAt)) {
                return '0';
            }
            return charAt;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void onPostExecute(Integer num) {
            if (num.intValue() >= 0) {
                C2728t0.this.f8958p0.mo8338w(num.intValue());
                C2728t0.this.mo9242A3(num.intValue());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.t0$l */
    public enum EnumC2748l {
        CONTAINS,
        STARTS_WITH,
        FUZZY
    }

    /* renamed from: F3 */
    private String m11595F3() {
        ActivityC0447d c0 = mo2552c0();
        if (c0 == null || c0.isFinishing()) {
            return "";
        }
        String c = this.f9278s0.mo8534c(c0, this.f8795b0);
        return c.equals("") ? mo2568h0().getString("title") : c;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: H3 */
    private boolean m11596H3(int i) {
        C2252d2 d2Var;
        Cursor c;
        if (!mo8102B2()) {
            return true;
        }
        if (i < 0 || this.f8806m0 == null || (d2Var = this.f8959q0) == null || (c = d2Var.mo8241c()) == null || c.isClosed() || !c.moveToPosition(i)) {
            return false;
        }
        String string = c.getString(2);
        this.f8806m0.mo8903G(this.f8800g0, this.f8795b0.mo8566p(string), this.f8795b0.mo8565o(string));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A3 */
    public void mo9242A3(int i) {
        C2786v0 v0Var;
        if (mo8102B2() && (v0Var = this.f9283x0) != null && v0Var.f9450g) {
            v0Var.mo9345k(this.f8957o0, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B3 */
    public boolean mo8141B3(Intent intent) {
        return false;
    }

    /* renamed from: C3 */
    public C2369h0 mo9243C3() {
        return new C2369h0(this.f9278s0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D3 */
    public Cursor mo8142D3() {
        return this.f8796c0.mo8841e(mo9244E3(), this.f9278s0);
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1, com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: E2 */
    public void mo8104E2(boolean z) {
        if (this.f8958p0 != null) {
            C2267e2 e2Var = this.f8958p0;
            new AsyncTaskC2747k(e2Var.mo8320d(e2Var.mo8321f()), z).execute(new Void[0]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E3 */
    public String mo9244E3() {
        String str = this.f9278s0.f8314n;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1263933418:
                if (str.equals("mostplayed")) {
                    c = 0;
                    break;
                }
                break;
            case -985752877:
                if (str.equals("played")) {
                    c = 1;
                    break;
                }
                break;
            case -188874621:
                if (str.equals("ctimeplayed")) {
                    c = 2;
                    break;
                }
                break;
            case 97805834:
                if (str.equals("fuzzy")) {
                    c = 3;
                    break;
                }
                break;
            case 110371416:
                if (str.equals("title")) {
                    c = 4;
                    break;
                }
                break;
            case 1226508473:
                if (str.equals("cmostplayed")) {
                    c = 5;
                    break;
                }
                break;
            case 1615650784:
                if (str.equals("timeplayed")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 5:
            case 6:
                return "played";
            case 3:
            case 4:
                return mo8143z3();
            default:
                return this.f9278s0.f8314n;
        }
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1, com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: F2 */
    public void mo8105F2() {
        super.mo8105F2();
        this.f9279t0 = false;
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1, com.digdroid.alman.dig.C2267e2.AbstractC2286s
    /* renamed from: G */
    public int[] mo8365G() {
        return new int[]{R.id.game_icon, R.id.game_icon, R.id.game_name, R.id.rating_bar, R.id.game_info};
    }

    /* renamed from: G3 */
    public void mo9245G3() {
        this.f8806m0.mo7916J();
        this.f9280u0 = true;
        this.f9278s0.f8307g = "";
        this.f9281v0 = EnumC2748l.CONTAINS;
        mo9021q3();
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1, com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: H2 */
    public boolean mo8243H2(MenuItem menuItem) {
        if (mo9247J3(menuItem.getItemId())) {
            return true;
        }
        switch (menuItem.getItemId()) {
            case R.id.add_collection /*{ENCODED_INT: 2131296340}*/:
                C2223d0.m9876p().mo8215r(mo2552c0(), 16, new C2743j());
                return true;
            case R.id.search_contains /*{ENCODED_INT: 2131297122}*/:
                this.f8806m0.mo7916J();
                this.f9280u0 = true;
                this.f9278s0.f8307g = "";
                this.f9281v0 = EnumC2748l.CONTAINS;
                mo9021q3();
                return true;
            case R.id.search_filenames /*{ENCODED_INT: 2131297124}*/:
                C2219c3 c3Var = this.f8793Z;
                c3Var.mo8153B("search_filenames", !c3Var.mo8180c("search_filenames", false));
                mo2552c0().invalidateOptionsMenu();
                return true;
            case R.id.search_start /*{ENCODED_INT: 2131297130}*/:
                this.f8806m0.mo7916J();
                this.f9280u0 = true;
                this.f9278s0.f8307g = "";
                this.f9281v0 = EnumC2748l.STARTS_WITH;
                mo9021q3();
                return true;
            case R.id.set_preview_pane /*{ENCODED_INT: 2131297145}*/:
                C2223d0.m9876p().mo8215r(mo2552c0(), 20, new C2742i());
                return true;
            case R.id.show_favorites /*{ENCODED_INT: 2131297156}*/:
                C2369h0 h0Var = this.f9278s0;
                boolean z = !h0Var.f8305e;
                h0Var.f8305e = z;
                this.f8793Z.mo8153B("show_favorites", z);
                mo2552c0().invalidateOptionsMenu();
                mo9021q3();
                return true;
            case R.id.show_not_played /*{ENCODED_INT: 2131297158}*/:
                C2369h0 h0Var2 = this.f9278s0;
                boolean z2 = !h0Var2.f8306f;
                h0Var2.f8306f = z2;
                this.f8793Z.mo8153B("show_not_played", z2);
                mo2552c0().invalidateOptionsMenu();
                mo9021q3();
                return true;
            case R.id.skip_info /*{ENCODED_INT: 2131297164}*/:
                C2219c3 c3Var2 = this.f8793Z;
                c3Var2.mo8172U(!c3Var2.mo8189m());
                mo2552c0().invalidateOptionsMenu();
                return true;
            default:
                return super.mo8243H2(menuItem);
        }
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1, com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: I2 */
    public void mo8107I2(String str) {
        if (this.f9280u0 && this.f9281v0 != EnumC2748l.FUZZY && !this.f9279t0) {
            C2369h0 h0Var = this.f9278s0;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f9281v0 == EnumC2748l.STARTS_WITH ? "^" : "");
            sb.append(str);
            h0Var.f8307g = sb.toString();
            mo9021q3();
        }
    }

    /* renamed from: I3 */
    public void mo9246I3(String str) {
        C2369h0 h0Var;
        boolean z = true;
        if (this.f9278s0.f8314n.equals(str)) {
            h0Var = this.f9278s0;
            z = true ^ h0Var.f8315o;
        } else {
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -985752877:
                    if (str.equals("played")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3076014:
                    if (str.equals("date")) {
                        c = 1;
                        break;
                    }
                    break;
                case 110371416:
                    if (str.equals("title")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                case 2:
                    h0Var = this.f9278s0;
                    break;
                default:
                    this.f9278s0.f8315o = false;
                    break;
            }
            this.f9278s0.f8314n = str;
            mo2552c0().invalidateOptionsMenu();
            mo9021q3();
        }
        h0Var.f8315o = z;
        this.f9278s0.f8314n = str;
        mo2552c0().invalidateOptionsMenu();
        mo9021q3();
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1, com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: J2 */
    public void mo8108J2(String str) {
        this.f9280u0 = false;
        if (this.f9281v0 != EnumC2748l.FUZZY) {
            C2369h0 h0Var = this.f9278s0;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f9281v0 == EnumC2748l.STARTS_WITH ? "^" : "");
            sb.append(str);
            h0Var.f8307g = sb.toString();
            mo9021q3();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J3 */
    public boolean mo9247J3(int i) {
        int i2 = 0;
        boolean z = false;
        r1 = false;
        boolean z2 = false;
        r1 = false;
        boolean z3 = false;
        boolean z4 = false;
        r1 = false;
        boolean z5 = false;
        boolean z6 = false;
        r1 = false;
        boolean z7 = false;
        r1 = false;
        boolean z8 = false;
        r1 = false;
        boolean z9 = false;
        if (i != R.id.min_ratings) {
            switch (i) {
                case R.id.sort_cmost_played /*{ENCODED_INT: 2131297173}*/:
                case R.id.sort_cmost_played2 /*{ENCODED_INT: 2131297174}*/:
                    C2369h0 h0Var = this.f9278s0;
                    if (h0Var.f8314n.equals("cmostplayed") && !this.f9278s0.f8315o) {
                        z9 = true;
                    }
                    h0Var.f8315o = z9;
                    this.f9278s0.f8314n = "cmostplayed";
                    mo2552c0().invalidateOptionsMenu();
                    mo9021q3();
                    return true;
                case R.id.sort_crating /*{ENCODED_INT: 2131297175}*/:
                case R.id.sort_crating2 /*{ENCODED_INT: 2131297176}*/:
                    C2369h0 h0Var2 = this.f9278s0;
                    if (h0Var2.f8314n.equals("crating") && !this.f9278s0.f8315o) {
                        z8 = true;
                    }
                    h0Var2.f8315o = z8;
                    this.f9278s0.f8314n = "crating";
                    mo2552c0().invalidateOptionsMenu();
                    mo9021q3();
                    return true;
                case R.id.sort_ctime_played /*{ENCODED_INT: 2131297177}*/:
                case R.id.sort_ctime_played2 /*{ENCODED_INT: 2131297178}*/:
                    C2369h0 h0Var3 = this.f9278s0;
                    if (h0Var3.f8314n.equals("ctimeplayed") && !this.f9278s0.f8315o) {
                        z7 = true;
                    }
                    h0Var3.f8315o = z7;
                    this.f9278s0.f8314n = "ctimeplayed";
                    mo2552c0().invalidateOptionsMenu();
                    mo9021q3();
                    return true;
                case R.id.sort_date /*{ENCODED_INT: 2131297179}*/:
                case R.id.sort_date2 /*{ENCODED_INT: 2131297180}*/:
                    C2369h0 h0Var4 = this.f9278s0;
                    if (!h0Var4.f8314n.equals("date") || !this.f9278s0.f8315o) {
                        z6 = true;
                    }
                    h0Var4.f8315o = z6;
                    this.f9278s0.f8314n = "date";
                    mo2552c0().invalidateOptionsMenu();
                    mo9021q3();
                    return true;
                case R.id.sort_most_played /*{ENCODED_INT: 2131297181}*/:
                case R.id.sort_most_played2 /*{ENCODED_INT: 2131297182}*/:
                    C2369h0 h0Var5 = this.f9278s0;
                    if (h0Var5.f8314n.equals("mostplayed") && !this.f9278s0.f8315o) {
                        z5 = true;
                    }
                    h0Var5.f8315o = z5;
                    this.f9278s0.f8314n = "mostplayed";
                    mo2552c0().invalidateOptionsMenu();
                    mo9021q3();
                    return true;
                default:
                    switch (i) {
                        case R.id.sort_played /*{ENCODED_INT: 2131297184}*/:
                        case R.id.sort_played2 /*{ENCODED_INT: 2131297185}*/:
                            C2369h0 h0Var6 = this.f9278s0;
                            if (!h0Var6.f8314n.equals("played") || !this.f9278s0.f8315o) {
                                z4 = true;
                            }
                            h0Var6.f8315o = z4;
                            this.f9278s0.f8314n = "played";
                            mo2552c0().invalidateOptionsMenu();
                            mo9021q3();
                            return true;
                        case R.id.sort_rating /*{ENCODED_INT: 2131297186}*/:
                        case R.id.sort_rating2 /*{ENCODED_INT: 2131297187}*/:
                            C2369h0 h0Var7 = this.f9278s0;
                            if (h0Var7.f8314n.equals("rating") && !this.f9278s0.f8315o) {
                                z3 = true;
                            }
                            h0Var7.f8315o = z3;
                            this.f9278s0.f8314n = "rating";
                            mo2552c0().invalidateOptionsMenu();
                            mo9021q3();
                            return true;
                        case R.id.sort_time_played /*{ENCODED_INT: 2131297188}*/:
                        case R.id.sort_time_played2 /*{ENCODED_INT: 2131297189}*/:
                            C2369h0 h0Var8 = this.f9278s0;
                            if (h0Var8.f8314n.equals("timeplayed") && !this.f9278s0.f8315o) {
                                z2 = true;
                            }
                            h0Var8.f8315o = z2;
                            this.f9278s0.f8314n = "timeplayed";
                            mo2552c0().invalidateOptionsMenu();
                            mo9021q3();
                            return true;
                        case R.id.sort_title /*{ENCODED_INT: 2131297190}*/:
                        case R.id.sort_title2 /*{ENCODED_INT: 2131297191}*/:
                            C2369h0 h0Var9 = this.f9278s0;
                            if (!h0Var9.f8314n.equals("title") || !this.f9278s0.f8315o) {
                                z = true;
                            }
                            h0Var9.f8315o = z;
                            this.f9278s0.f8314n = "title";
                            mo2552c0().invalidateOptionsMenu();
                            mo9021q3();
                            return true;
                        default:
                            return false;
                    }
            }
        } else {
            View inflate = mo2552c0().getLayoutInflater().inflate(R.layout.min_votes, (ViewGroup) null);
            String[] strArr = new String[10];
            while (i2 < 10) {
                StringBuilder sb = new StringBuilder();
                sb.append("");
                int i3 = i2 + 1;
                sb.append(i3);
                strArr[i2] = sb.toString();
                i2 = i3;
            }
            ArrayAdapter arrayAdapter = new ArrayAdapter(mo2552c0(), 17367048, strArr);
            int l = this.f8793Z.mo8188l("min_ratings", 2);
            Spinner spinner = (Spinner) inflate.findViewById(R.id.min_votes_spinner);
            spinner.setAdapter((SpinnerAdapter) arrayAdapter);
            spinner.setSelection(l - 1);
            spinner.setOnItemSelectedListener(new C2741h());
            new DialogInterfaceC0068b.C0069a(mo2552c0()).mo228h(R.string.min_ratings).mo240t(inflate).mo235o(R.string.ok, null).mo221a().show();
            return true;
        }
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1, com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: K2 */
    public void mo8109K2() {
        mo8112Q2();
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1, com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: N2 */
    public boolean mo8110N2() {
        C2267e2 e2Var;
        Cursor cursor;
        ActivityC0447d c0 = mo2552c0();
        if (c0 != null && !c0.isFinishing() && (e2Var = this.f8958p0) != null && !this.f9279t0 && (cursor = (Cursor) e2Var.mo8320d(e2Var.mo8321f())) != null && !cursor.isClosed()) {
            this.f9279t0 = true;
            this.f8796c0.mo8844i((ActivityC2888z3) mo2552c0(), cursor.getLong(0), this.f9278s0);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2577r1, com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: O2 */
    public void mo8407O2() {
        super.mo9020p3(!this.f9280u0, new CallableC2731b());
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1, com.digdroid.alman.dig.C2267e2.AbstractC2286s
    /* renamed from: Q */
    public String mo8375Q() {
        return this.f8793Z.mo8179b();
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1, com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: Q2 */
    public void mo8112Q2() {
        C2267e2 e2Var = this.f8958p0;
        if (e2Var == null || !m11596H3(e2Var.mo8321f())) {
            super.mo8112Q2();
        }
    }

    @Override // com.digdroid.alman.dig.C2324g1.AbstractC2325a
    /* renamed from: R */
    public int mo8424R(Cursor cursor) {
        return -1;
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1, com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: S2 */
    public void mo8114S2() {
        super.mo8114S2();
        Menu B = this.f8806m0.mo8254B();
        B.findItem(R.id.nav_search).setVisible(this.f8793Z.mo8196t());
        B.findItem(R.id.nav_sort).setVisible(this.f8793Z.mo8196t());
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1, com.digdroid.alman.dig.AbstractC2531p1, androidx.fragment.app.Fragment
    /* renamed from: W0 */
    public void mo2537W0(Bundle bundle) {
        super.mo2537W0(bundle);
        C2369h0 h0Var = new C2369h0();
        this.f9278s0 = h0Var;
        h0Var.mo8533b(mo2568h0());
        this.f9278s0.f8305e = this.f8793Z.mo8180c("show_favorites", false);
        this.f9278s0.f8306f = this.f8793Z.mo8180c("show_not_played", false);
        mo8118X2("");
        if (bundle != null) {
            this.f9278s0.f8314n = bundle.getString("sort_type");
            this.f9278s0.f8315o = bundle.getBoolean("sort_ascending");
            this.f9278s0.f8307g = bundle.getString("search_for");
        }
        this.f8801h0 = mo2568h0().getString("title");
    }

    @Override // com.digdroid.alman.dig.C2324g1.AbstractC2325a
    /* renamed from: a */
    public String mo8458a(Cursor cursor) {
        return cursor.getString(1);
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1, androidx.fragment.app.Fragment
    /* renamed from: a1 */
    public View mo2547a1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C2267e2.AbstractC2291x xVar;
        C2267e2 e2Var;
        View a1 = super.mo2547a1(layoutInflater, viewGroup, bundle);
        if (!this.f8800g0.f9417u.equals("")) {
            e2Var = this.f8958p0;
            xVar = new C2729a();
        } else {
            e2Var = this.f8958p0;
            xVar = new C2732c();
        }
        e2Var.mo8337v(xVar);
        return a1;
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1, com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: a3 */
    public void mo8120a3(boolean z) {
        C2267e2 e2Var;
        C2786v0 v0Var;
        boolean z2 = this.f8803j0;
        super.mo8120a3(z);
        if (!z && z2 && (v0Var = this.f9283x0) != null) {
            v0Var.mo9341g();
        } else if (z && !z2 && (e2Var = this.f8958p0) != null) {
            mo9242A3(e2Var.mo8321f());
        }
    }

    @Override // com.digdroid.alman.dig.C2324g1.AbstractC2325a
    /* renamed from: b */
    public C2464m mo8310b() {
        C2774t3 t3Var = this.f8800g0;
        return new C2464m(true, t3Var.f9404h, t3Var.f9405i, 6);
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1, com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: c3 */
    public void mo8121c3() {
        C0248l0 l0Var = new C0248l0(new C0788d(mo2552c0(), (int) R.style.AppThemeLight), this.f8806m0.mo8904I(), 8388613);
        l0Var.mo1571b().inflate(R.menu.sort_menu, l0Var.mo1570a());
        MenuItem findItem = l0Var.mo1570a().findItem(R.id.min_ratings);
        findItem.setTitle(mo2552c0().getString(R.string.min_ratings) + ": " + this.f8793Z.mo8188l("min_ratings", 2));
        l0Var.mo1572c(new C2740g());
        l0Var.mo1573d();
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1, com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: e3 */
    public void mo8123e3() {
        C2223d0.m9876p().mo8215r(mo2552c0(), 20, new C2735e());
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2577r1
    /* renamed from: h3 */
    public void mo8431h3(View view, Object obj) {
        if (obj != null) {
            Cursor cursor = (Cursor) obj;
            boolean z = false;
            long j = cursor.getLong(0);
            boolean equals = this.f8795b0.mo8569t(cursor.getString(2)).equals("mame");
            C0788d dVar = new C0788d(mo2552c0(), C2553q3.m11117c());
            C0248l0 l0Var = view == null ? new C0248l0(dVar, this.f8806m0.mo8904I(), 5) : new C0248l0(dVar, view);
            l0Var.mo1571b().inflate(R.menu.list_game_menu, l0Var.mo1570a());
            l0Var.mo1570a().findItem(R.id.manage_game).getSubMenu().clearHeader();
            SQLiteDatabase c = this.f8794a0.mo9325c();
            Cursor rawQuery = c.rawQuery("SELECT favorite FROM roms WHERE _id=" + j, null);
            if (rawQuery.moveToFirst()) {
                MenuItem findItem = l0Var.mo1570a().findItem(R.id.favorite);
                if (rawQuery.getInt(0) == 1) {
                    z = true;
                }
                findItem.setChecked(z);
            }
            rawQuery.close();
            l0Var.mo1572c(new C2736f(j, equals));
            l0Var.mo1573d();
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0093, code lost:
        if (r0.equals("vertical") == false) goto L_0x0054;
     */
    @Override // com.digdroid.alman.dig.AbstractC2577r1
    /* renamed from: j3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.digdroid.alman.dig.C2252d2 mo8432j3(android.database.Cursor r13) {
        /*
        // Method dump skipped, instructions count: 412
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.C2728t0.mo8432j3(android.database.Cursor):com.digdroid.alman.dig.d2");
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2577r1
    /* renamed from: k3 */
    public Cursor mo8694k3() {
        this.f9282w0 = C2185a4.m9678h(mo2552c0());
        return mo8142D3();
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1
    /* renamed from: l3 */
    public String mo8695l3() {
        return "grid";
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1, com.digdroid.alman.dig.AbstractC2531p1, androidx.fragment.app.Fragment
    /* renamed from: m1 */
    public void mo2585m1() {
        super.mo2585m1();
        C2786v0 v0Var = this.f9283x0;
        if (v0Var != null) {
            v0Var.mo9341g();
        }
        mo8118X2("");
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2577r1
    /* renamed from: n3 */
    public void mo8425n3(View view, Object obj) {
        if (obj != null) {
            this.f9279t0 = true;
            Cursor cursor = (Cursor) obj;
            if (this.f8793Z.mo8189m()) {
                this.f8796c0.mo8844i((ActivityC2888z3) mo2552c0(), cursor.getLong(0), this.f9278s0);
            } else {
                this.f8806m0.mo8256D(cursor.getLong(0), cursor.getString(1), this.f9278s0);
            }
        }
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1, com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: p2 */
    public void mo8439p2(Menu menu) {
        super.mo8439p2(menu);
        menu.findItem(R.id.view).setVisible(false);
        String str = this.f9278s0.f8315o ? "▲" : "▼";
        MenuItem findItem = menu.findItem(R.id.sort_played);
        StringBuilder sb = new StringBuilder();
        sb.append(mo2552c0().getString(R.string.last_played));
        sb.append(this.f9278s0.f8314n.equals("played") ? str : "");
        findItem.setTitle(sb.toString());
        MenuItem findItem2 = menu.findItem(R.id.sort_played2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(mo2552c0().getString(R.string.last_played));
        sb2.append(this.f9278s0.f8314n.equals("played") ? str : "");
        findItem2.setTitle(sb2.toString());
        menu.findItem(R.id.sort_played).setVisible(this.f9278s0.f8314n.equals("played"));
        MenuItem findItem3 = menu.findItem(R.id.sort_most_played);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(mo2552c0().getString(R.string.my_most_played));
        sb3.append(this.f9278s0.f8314n.equals("mostplayed") ? str : "");
        findItem3.setTitle(sb3.toString());
        MenuItem findItem4 = menu.findItem(R.id.sort_most_played2);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(mo2552c0().getString(R.string.my_most_played));
        sb4.append(this.f9278s0.f8314n.equals("mostplayed") ? str : "");
        findItem4.setTitle(sb4.toString());
        menu.findItem(R.id.sort_most_played).setVisible(this.f9278s0.f8314n.equals("mostplayed"));
        MenuItem findItem5 = menu.findItem(R.id.sort_time_played);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(mo2552c0().getString(R.string.my_time_played));
        sb5.append(this.f9278s0.f8314n.equals("timeplayed") ? str : "");
        findItem5.setTitle(sb5.toString());
        MenuItem findItem6 = menu.findItem(R.id.sort_time_played2);
        StringBuilder sb6 = new StringBuilder();
        sb6.append(mo2552c0().getString(R.string.my_time_played));
        sb6.append(this.f9278s0.f8314n.equals("timeplayed") ? str : "");
        findItem6.setTitle(sb6.toString());
        menu.findItem(R.id.sort_time_played).setVisible(this.f9278s0.f8314n.equals("timeplayed"));
        MenuItem findItem7 = menu.findItem(R.id.sort_title);
        StringBuilder sb7 = new StringBuilder();
        sb7.append(mo2552c0().getString(R.string.sort_by_title));
        sb7.append(this.f9278s0.f8314n.equals("title") ? str : "");
        findItem7.setTitle(sb7.toString());
        MenuItem findItem8 = menu.findItem(R.id.sort_title2);
        StringBuilder sb8 = new StringBuilder();
        sb8.append(mo2552c0().getString(R.string.sort_by_title));
        sb8.append(this.f9278s0.f8314n.equals("title") ? str : "");
        findItem8.setTitle(sb8.toString());
        menu.findItem(R.id.sort_title).setVisible(this.f9278s0.f8314n.equals("title"));
        MenuItem findItem9 = menu.findItem(R.id.sort_date);
        StringBuilder sb9 = new StringBuilder();
        sb9.append(mo2552c0().getString(R.string.sort_by_date));
        sb9.append(this.f9278s0.f8314n.equals("date") ? str : "");
        findItem9.setTitle(sb9.toString());
        MenuItem findItem10 = menu.findItem(R.id.sort_date2);
        StringBuilder sb10 = new StringBuilder();
        sb10.append(mo2552c0().getString(R.string.sort_by_date));
        sb10.append(this.f9278s0.f8314n.equals("date") ? str : "");
        findItem10.setTitle(sb10.toString());
        menu.findItem(R.id.sort_date).setVisible(this.f9278s0.f8314n.equals("date"));
        MenuItem findItem11 = menu.findItem(R.id.sort_rating);
        StringBuilder sb11 = new StringBuilder();
        sb11.append(mo2552c0().getString(R.string.my_rating));
        sb11.append(this.f9278s0.f8314n.equals("rating") ? str : "");
        findItem11.setTitle(sb11.toString());
        MenuItem findItem12 = menu.findItem(R.id.sort_rating2);
        StringBuilder sb12 = new StringBuilder();
        sb12.append(mo2552c0().getString(R.string.my_rating));
        sb12.append(this.f9278s0.f8314n.equals("rating") ? str : "");
        findItem12.setTitle(sb12.toString());
        menu.findItem(R.id.sort_rating).setVisible(this.f9278s0.f8314n.equals("rating"));
        MenuItem findItem13 = menu.findItem(R.id.sort_crating);
        StringBuilder sb13 = new StringBuilder();
        sb13.append(mo2552c0().getString(R.string.rating));
        sb13.append(this.f9278s0.f8314n.equals("crating") ? str : "");
        findItem13.setTitle(sb13.toString());
        MenuItem findItem14 = menu.findItem(R.id.sort_crating2);
        StringBuilder sb14 = new StringBuilder();
        sb14.append(mo2552c0().getString(R.string.rating));
        sb14.append(this.f9278s0.f8314n.equals("crating") ? str : "");
        findItem14.setTitle(sb14.toString());
        menu.findItem(R.id.sort_crating).setVisible(this.f9278s0.f8314n.equals("crating"));
        MenuItem findItem15 = menu.findItem(R.id.sort_cmost_played);
        StringBuilder sb15 = new StringBuilder();
        sb15.append(mo2552c0().getString(R.string.most_played));
        sb15.append(this.f9278s0.f8314n.equals("cmostplayed") ? str : "");
        findItem15.setTitle(sb15.toString());
        MenuItem findItem16 = menu.findItem(R.id.sort_cmost_played2);
        StringBuilder sb16 = new StringBuilder();
        sb16.append(mo2552c0().getString(R.string.most_played));
        sb16.append(this.f9278s0.f8314n.equals("cmostplayed") ? str : "");
        findItem16.setTitle(sb16.toString());
        menu.findItem(R.id.sort_cmost_played).setVisible(this.f9278s0.f8314n.equals("cmostplayed"));
        MenuItem findItem17 = menu.findItem(R.id.sort_ctime_played);
        StringBuilder sb17 = new StringBuilder();
        sb17.append(mo2552c0().getString(R.string.time_played));
        sb17.append(this.f9278s0.f8314n.equals("ctimeplayed") ? str : "");
        findItem17.setTitle(sb17.toString());
        MenuItem findItem18 = menu.findItem(R.id.sort_ctime_played2);
        StringBuilder sb18 = new StringBuilder();
        sb18.append(mo2552c0().getString(R.string.time_played));
        if (!this.f9278s0.f8314n.equals("ctimeplayed")) {
            str = "";
        }
        sb18.append(str);
        findItem18.setTitle(sb18.toString());
        menu.findItem(R.id.sort_ctime_played).setVisible(this.f9278s0.f8314n.equals("ctimeplayed"));
        MenuItem findItem19 = menu.findItem(R.id.min_ratings);
        findItem19.setTitle(mo2552c0().getString(R.string.min_ratings) + ": " + this.f8793Z.mo8188l("min_ratings", 2));
        MenuItem findItem20 = menu.findItem(R.id.sort_by);
        findItem20.getSubMenu().clearHeader();
        Drawable icon = findItem20.getIcon();
        if (icon != null) {
            icon.mutate();
            icon.setColorFilter(new PorterDuffColorFilter(C2553q3.m11137w(), PorterDuff.Mode.MULTIPLY));
        }
        findItem20.setIcon(icon);
        SubMenu subMenu = menu.findItem(R.id.search).getSubMenu();
        subMenu.clearHeader();
        MenuItem findItem21 = subMenu.findItem(R.id.search_filenames);
        findItem21.setChecked(this.f8793Z.mo8180c("search_filenames", false));
        Drawable icon2 = findItem21.getIcon();
        if (icon2 != null) {
            icon2.mutate();
            icon2.setColorFilter(new PorterDuffColorFilter(C2553q3.m11137w(), PorterDuff.Mode.MULTIPLY));
        }
        findItem21.setIcon(icon2);
        menu.findItem(R.id.skip_info).setChecked(this.f8793Z.mo8189m());
        menu.findItem(R.id.show_favorites).setChecked(this.f9278s0.f8305e);
        menu.findItem(R.id.show_not_played).setChecked(this.f9278s0.f8306f);
        menu.findItem(R.id.manage_system).setVisible(false);
        menu.findItem(R.id.add_homescreen).setVisible(false);
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1
    /* renamed from: q3 */
    public void mo9021q3() {
        super.mo9022r3(!this.f9280u0);
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1, com.digdroid.alman.dig.AbstractC2531p1, androidx.fragment.app.Fragment
    /* renamed from: r1 */
    public void mo2601r1() {
        super.mo2601r1();
        this.f9279t0 = false;
        this.f9283x0 = null;
        mo8118X2(m11595F3());
        C2223d0.m9876p().mo8216s(mo2552c0(), 20, new C2734d(), true);
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: r2 */
    public int mo8248r2() {
        return R.menu.games_menu;
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1, androidx.fragment.app.Fragment
    /* renamed from: s1 */
    public void mo2603s1(Bundle bundle) {
        bundle.putString("sort_type", this.f9278s0.f8314n);
        bundle.putBoolean("sort_ascending", this.f9278s0.f8315o);
        bundle.putString("search_for", this.f9278s0.f8307g);
        super.mo2603s1(bundle);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: t2 */
    public String mo8127t2() {
        return "game";
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1
    /* renamed from: w3 */
    public void mo8723w3(String str, int i) {
        this.f8793Z.mo8164M(str);
        AbstractC2531p1.AbstractC2532a aVar = this.f8806m0;
        if (aVar != null) {
            aVar.mo8290q(str, this.f9278s0, i);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: z2 */
    public synchronized void mo8410z2(Intent intent) {
        long currentTimeMillis = System.currentTimeMillis();
        if (mo8141B3(intent) && currentTimeMillis - this.f9284y0 >= 5000) {
            this.f9284y0 = currentTimeMillis;
            mo8407O2();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z3 */
    public String mo8143z3() {
        return this.f9278s0.f8308h.equals("") ? "system" : "date";
    }
}
