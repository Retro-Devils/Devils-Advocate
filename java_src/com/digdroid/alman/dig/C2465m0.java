package com.digdroid.alman.dig;

import android.app.Activity;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.appcompat.app.DialogInterfaceC0068b;
import com.digdroid.alman.dig.AbstractC2531p1;
import com.digdroid.alman.dig.C2223d0;
import com.digdroid.alman.dig.C2828w2;

/* renamed from: com.digdroid.alman.dig.m0 */
public class C2465m0 {

    /* renamed from: a */
    Activity f8608a;

    /* renamed from: b */
    long f8609b;

    /* renamed from: c */
    SQLiteDatabase f8610c;

    /* renamed from: d */
    AbstractC2488p f8611d;

    /* renamed from: e */
    AbstractC2531p1.AbstractC2532a f8612e;

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.m0$a */
    public class DialogInterface$OnClickListenerC2466a implements DialogInterface.OnClickListener {
        DialogInterface$OnClickListenerC2466a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("last_played", (Integer) 0);
            contentValues.put("time_played", (Integer) 0);
            contentValues.put("times_played", (Integer) 0);
            SQLiteDatabase sQLiteDatabase = C2465m0.this.f8610c;
            sQLiteDatabase.update("roms", contentValues, "_id=" + C2465m0.this.f8609b, null);
            C2369h0 filter = C2465m0.this.f8611d.getFilter();
            Activity activity = C2465m0.this.f8608a;
            if (C2512o0.m10833g(activity, C2775u.m11726e(activity)).mo8848m(filter)) {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("merged_last_played", (Integer) 0);
                contentValues2.put("merged_time_played", (Integer) 0);
                contentValues2.put("merged_times_played", (Integer) 0);
                SQLiteDatabase sQLiteDatabase2 = C2465m0.this.f8610c;
                sQLiteDatabase2.update("roms", contentValues2, "merged_with=" + C2465m0.this.f8609b, null);
            }
            C2465m0.this.f8611d.mo8664b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.m0$b */
    public class DialogInterface$OnMultiChoiceClickListenerC2467b implements DialogInterface.OnMultiChoiceClickListener {

        /* renamed from: a */
        final /* synthetic */ boolean[] f8614a;

        DialogInterface$OnMultiChoiceClickListenerC2467b(boolean[] zArr) {
            this.f8614a = zArr;
        }

        public void onClick(DialogInterface dialogInterface, int i, boolean z) {
            this.f8614a[i] = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.m0$c */
    public class DialogInterface$OnClickListenerC2468c implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ SQLiteDatabase f8616b;

        /* renamed from: c */
        final /* synthetic */ int f8617c;

        /* renamed from: d */
        final /* synthetic */ boolean[] f8618d;

        /* renamed from: e */
        final /* synthetic */ long[] f8619e;

        DialogInterface$OnClickListenerC2468c(SQLiteDatabase sQLiteDatabase, int i, boolean[] zArr, long[] jArr) {
            this.f8616b = sQLiteDatabase;
            this.f8617c = i;
            this.f8618d = zArr;
            this.f8619e = jArr;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            SQLiteDatabase sQLiteDatabase = this.f8616b;
            sQLiteDatabase.execSQL("DELETE FROM gamegenres WHERE game=" + C2465m0.this.f8609b);
            for (int i2 = 0; i2 < this.f8617c; i2++) {
                if (this.f8618d[i2]) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("game", Long.valueOf(C2465m0.this.f8609b));
                    contentValues.put("genre", Long.valueOf(this.f8619e[i2]));
                    this.f8616b.insert("gamegenres", null, contentValues);
                }
            }
            C2465m0.this.f8611d.mo8664b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.m0$d */
    public class DialogInterface$OnClickListenerC2469d implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ long[] f8621b;

        /* renamed from: com.digdroid.alman.dig.m0$d$a */
        class DialogInterface$OnClickListenerC2470a implements DialogInterface.OnClickListener {

            /* renamed from: b */
            final /* synthetic */ int f8623b;

            DialogInterface$OnClickListenerC2470a(int i) {
                this.f8623b = i;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                SQLiteDatabase sQLiteDatabase = C2465m0.this.f8610c;
                sQLiteDatabase.execSQL("DELETE FROM gamecollection WHERE _id=" + DialogInterface$OnClickListenerC2469d.this.f8621b[this.f8623b]);
                C2465m0.this.f8611d.mo8664b();
            }
        }

        DialogInterface$OnClickListenerC2469d(long[] jArr) {
            this.f8621b = jArr;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            new DialogInterfaceC0068b.C0069a(C2465m0.this.f8608a, C2553q3.m11117c()).mo228h(R.string.confirm).mo232l(R.string.cancel, null).mo235o(R.string.ok, new DialogInterface$OnClickListenerC2470a(i)).mo221a().show();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.m0$e */
    public class DialogInterface$OnClickListenerC2471e implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ EditText f8625b;

        /* renamed from: c */
        final /* synthetic */ Activity f8626c;

        /* renamed from: d */
        final /* synthetic */ AbstractC2487o f8627d;

        DialogInterface$OnClickListenerC2471e(EditText editText, Activity activity, AbstractC2487o oVar) {
            this.f8625b = editText;
            this.f8626c = activity;
            this.f8627d = oVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            long j;
            String trim = this.f8625b.getText().toString().trim();
            if (trim != null && !trim.equals("")) {
                SQLiteDatabase c = C2775u.m11726e(this.f8626c).mo9325c();
                Cursor rawQuery = c.rawQuery("SELECT _id FROM collections WHERE parent=-1 AND name LIKE " + DatabaseUtils.sqlEscapeString(trim), null);
                if (!rawQuery.moveToFirst()) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("name", trim);
                    contentValues.put("parent", (Integer) -1);
                    contentValues.put("isfolder", (Integer) 0);
                    j = c.insert("collections", null, contentValues);
                } else {
                    j = rawQuery.getLong(0);
                }
                rawQuery.close();
                this.f8627d.mo8739a(j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.m0$f */
    public class DialogInterface$OnClickListenerC2472f implements DialogInterface.OnClickListener {
        DialogInterface$OnClickListenerC2472f() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            SQLiteDatabase sQLiteDatabase = C2465m0.this.f8610c;
            sQLiteDatabase.execSQL("UPDATE roms SET youtube=NULL WHERE _id=" + C2465m0.this.f8609b);
            C2465m0.this.f8611d.mo8664b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.m0$g */
    public class DialogInterface$OnClickListenerC2473g implements DialogInterface.OnClickListener {
        DialogInterface$OnClickListenerC2473g() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            SQLiteDatabase sQLiteDatabase = C2465m0.this.f8610c;
            Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT mdbid FROM roms WHERE _id=" + C2465m0.this.f8609b, null);
            if (rawQuery.moveToFirst()) {
                long j = rawQuery.getLong(0);
                if (j >= 0) {
                    SQLiteDatabase a = C2886z1.m11967b(C2465m0.this.f8608a).mo9515a();
                    Cursor rawQuery2 = a.rawQuery("SELECT youtube FROM games WHERE _id=" + j, null);
                    if (rawQuery2.moveToFirst()) {
                        long j2 = rawQuery2.getLong(0);
                        ContentValues contentValues = new ContentValues();
                        if (j2 != 0) {
                            try {
                                contentValues.put("youtube", C2185a4.m9688r(j2));
                            } catch (Exception unused) {
                            }
                            SQLiteDatabase sQLiteDatabase2 = C2465m0.this.f8610c;
                            sQLiteDatabase2.update("roms", contentValues, "_id=" + C2465m0.this.f8609b, null);
                            C2465m0.this.f8611d.mo8664b();
                        }
                        contentValues.put("youtube", (String) null);
                        SQLiteDatabase sQLiteDatabase22 = C2465m0.this.f8610c;
                        sQLiteDatabase22.update("roms", contentValues, "_id=" + C2465m0.this.f8609b, null);
                        C2465m0.this.f8611d.mo8664b();
                    }
                    rawQuery2.close();
                }
            }
            rawQuery.close();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.m0$h */
    public class C2474h implements C2828w2.AbstractC2838j {
        C2474h() {
        }

        @Override // com.digdroid.alman.dig.C2828w2.AbstractC2838j
        /* renamed from: a */
        public void mo8071a(boolean z) {
            C2465m0.this.f8611d.mo8664b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.m0$i */
    public class C2475i implements C2223d0.AbstractC2249s {
        C2475i() {
        }

        @Override // com.digdroid.alman.dig.C2223d0.AbstractC2249s
        /* renamed from: a */
        public void mo7941a() {
            Activity activity = C2465m0.this.f8608a;
            if (activity != null && !activity.isFinishing()) {
                C2465m0 m0Var = C2465m0.this;
                MyWidget.m9545a(m0Var.f8608a, m0Var.f8609b, false);
            }
        }

        @Override // com.digdroid.alman.dig.C2223d0.AbstractC2249s
        /* renamed from: b */
        public void mo7942b() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.m0$j */
    public class C2476j implements C2223d0.AbstractC2249s {
        C2476j() {
        }

        @Override // com.digdroid.alman.dig.C2223d0.AbstractC2249s
        /* renamed from: a */
        public void mo7941a() {
            C2465m0.this.mo8728a();
        }

        @Override // com.digdroid.alman.dig.C2223d0.AbstractC2249s
        /* renamed from: b */
        public void mo7942b() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.m0$k */
    public class C2477k implements C2223d0.AbstractC2249s {

        /* renamed from: com.digdroid.alman.dig.m0$k$a */
        class DialogInterface$OnClickListenerC2478a implements DialogInterface.OnClickListener {

            /* renamed from: b */
            final /* synthetic */ long[] f8634b;

            /* renamed from: com.digdroid.alman.dig.m0$k$a$a */
            class C2479a implements AbstractC2487o {
                C2479a() {
                }

                @Override // com.digdroid.alman.dig.C2465m0.AbstractC2487o
                /* renamed from: a */
                public void mo8739a(long j) {
                    SQLiteDatabase sQLiteDatabase = C2465m0.this.f8610c;
                    Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT _id FROM gamecollection WHERE collection=" + j + " AND game=" + C2465m0.this.f8609b, null);
                    if (!rawQuery.moveToFirst()) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("collection", Long.valueOf(j));
                        contentValues.put("game", Long.valueOf(C2465m0.this.f8609b));
                        C2465m0.this.f8610c.insert("gamecollection", null, contentValues);
                        C2465m0.this.f8611d.mo8664b();
                    }
                    rawQuery.close();
                }
            }

            DialogInterface$OnClickListenerC2478a(long[] jArr) {
                this.f8634b = jArr;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C2465m0.m10622b(C2465m0.this.f8608a, this.f8634b[i], new C2479a());
            }
        }

        C2477k() {
        }

        @Override // com.digdroid.alman.dig.C2223d0.AbstractC2249s
        /* renamed from: a */
        public void mo7941a() {
            Cursor rawQuery = C2465m0.this.f8610c.rawQuery("SELECT _id,name FROM collections WHERE isfolder=0 ORDER BY name", null);
            int count = rawQuery.moveToFirst() ? rawQuery.getCount() : 0;
            int i = count + 1;
            CharSequence[] charSequenceArr = new CharSequence[i];
            long[] jArr = new long[i];
            charSequenceArr[0] = C2465m0.this.f8608a.getString(R.string.new_collection);
            jArr[0] = -1;
            int i2 = 0;
            while (i2 < count) {
                i2++;
                charSequenceArr[i2] = rawQuery.getString(1);
                jArr[i2] = rawQuery.getLong(0);
                rawQuery.moveToNext();
            }
            rawQuery.close();
            new DialogInterfaceC0068b.C0069a(C2465m0.this.f8608a, C2553q3.m11117c()).mo238r(R.string.add_to_collection).mo227g(charSequenceArr, new DialogInterface$OnClickListenerC2478a(jArr)).mo221a().show();
        }

        @Override // com.digdroid.alman.dig.C2223d0.AbstractC2249s
        /* renamed from: b */
        public void mo7942b() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.m0$l */
    public class C2480l implements C2223d0.AbstractC2249s {

        /* renamed from: com.digdroid.alman.dig.m0$l$a */
        class DialogInterface$OnClickListenerC2481a implements DialogInterface.OnClickListener {
            DialogInterface$OnClickListenerC2481a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                SQLiteDatabase sQLiteDatabase = C2465m0.this.f8610c;
                sQLiteDatabase.execSQL("UPDATE roms SET ignored=1 WHERE _id=" + C2465m0.this.f8609b);
                Activity activity = C2465m0.this.f8608a;
                C2512o0.m10833g(activity, C2775u.m11726e(activity)).mo8852t(C2465m0.this.f8609b);
                C2465m0.this.f8611d.mo8663a();
            }
        }

        /* renamed from: com.digdroid.alman.dig.m0$l$b */
        class DialogInterface$OnClickListenerC2482b implements DialogInterface.OnClickListener {
            DialogInterface$OnClickListenerC2482b() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }

        C2480l() {
        }

        @Override // com.digdroid.alman.dig.C2223d0.AbstractC2249s
        /* renamed from: a */
        public void mo7941a() {
            Activity activity = C2465m0.this.f8608a;
            if (activity != null && !activity.isFinishing()) {
                new DialogInterfaceC0068b.C0069a(C2465m0.this.f8608a, C2553q3.m11117c()).mo229i(C2465m0.this.f8608a.getString(R.string.confirm_ignore)).mo232l(17039360, new DialogInterface$OnClickListenerC2482b()).mo235o(17039370, new DialogInterface$OnClickListenerC2481a()).mo221a().show();
            }
        }

        @Override // com.digdroid.alman.dig.C2223d0.AbstractC2249s
        /* renamed from: b */
        public void mo7942b() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.m0$m */
    public class C2483m implements C2223d0.AbstractC2249s {

        /* renamed from: com.digdroid.alman.dig.m0$m$a */
        class DialogInterface$OnClickListenerC2484a implements DialogInterface.OnClickListener {

            /* renamed from: com.digdroid.alman.dig.m0$m$a$a */
            class DialogInterface$OnClickListenerC2485a implements DialogInterface.OnClickListener {

                /* renamed from: b */
                final /* synthetic */ boolean f8642b;

                DialogInterface$OnClickListenerC2485a(boolean z) {
                    this.f8642b = z;
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    if (this.f8642b) {
                        C2465m0.this.f8611d.mo8663a();
                    }
                }
            }

            DialogInterface$OnClickListenerC2484a() {
            }

            /* JADX WARNING: Removed duplicated region for block: B:13:0x0060  */
            /* JADX WARNING: Removed duplicated region for block: B:16:0x00dc  */
            /* JADX WARNING: Removed duplicated region for block: B:17:0x00e0  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onClick(android.content.DialogInterface r6, int r7) {
                /*
                // Method dump skipped, instructions count: 258
                */
                throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.C2465m0.C2483m.DialogInterface$OnClickListenerC2484a.onClick(android.content.DialogInterface, int):void");
            }
        }

        C2483m() {
        }

        @Override // com.digdroid.alman.dig.C2223d0.AbstractC2249s
        /* renamed from: a */
        public void mo7941a() {
            Activity activity = C2465m0.this.f8608a;
            if (activity != null && !activity.isFinishing()) {
                new DialogInterfaceC0068b.C0069a(C2465m0.this.f8608a, C2553q3.m11117c()).mo228h(R.string.confirm_delete).mo232l(R.string.cancel, null).mo235o(R.string.ok, new DialogInterface$OnClickListenerC2484a()).mo221a().show();
            }
        }

        @Override // com.digdroid.alman.dig.C2223d0.AbstractC2249s
        /* renamed from: b */
        public void mo7942b() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.m0$n */
    public class DialogInterface$OnClickListenerC2486n implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ EditText f8644b;

        DialogInterface$OnClickListenerC2486n(EditText editText) {
            this.f8644b = editText;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            String trim = this.f8644b.getText().toString().trim();
            if (trim != null && !trim.equals("")) {
                SQLiteDatabase sQLiteDatabase = C2465m0.this.f8610c;
                sQLiteDatabase.execSQL("UPDATE roms SET sortname=" + DatabaseUtils.sqlEscapeString(trim) + " WHERE _id=" + C2465m0.this.f8609b);
                C2465m0.this.f8611d.mo8664b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.m0$o */
    public interface AbstractC2487o {
        /* renamed from: a */
        void mo8739a(long j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.m0$p */
    public interface AbstractC2488p {
        /* renamed from: a */
        void mo8663a();

        /* renamed from: b */
        void mo8664b();

        /* renamed from: c */
        void mo8665c(boolean z);

        C2369h0 getFilter();
    }

    public C2465m0(Activity activity, long j, AbstractC2488p pVar, AbstractC2531p1.AbstractC2532a aVar) {
        this.f8608a = activity;
        this.f8609b = j;
        this.f8611d = pVar;
        this.f8612e = aVar;
        this.f8610c = C2775u.m11726e(activity).mo9325c();
    }

    /* renamed from: b */
    static void m10622b(Activity activity, long j, AbstractC2487o oVar) {
        if (j >= 0) {
            oVar.mo8739a(j);
            return;
        }
        View inflate = activity.getLayoutInflater().inflate(R.layout.genre_edit, (ViewGroup) null);
        EditText editText = (EditText) inflate.findViewById(R.id.genre_input);
        editText.setTextColor(C2553q3.m11116b());
        new DialogInterfaceC0068b.C0069a(activity, C2553q3.m11117c()).mo240t(inflate).mo238r(R.string.enter_collection).mo232l(17039360, null).mo235o(17039370, new DialogInterface$OnClickListenerC2471e(editText, activity, oVar)).mo221a().show();
    }

    /* renamed from: d */
    private void m10623d() {
        SQLiteDatabase sQLiteDatabase = this.f8610c;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT gc._id,c.name FROM gamecollection as gc,collections as c WHERE gc.game=" + this.f8609b + " AND c._id=gc.collection ORDER BY c.name", null);
        if (!rawQuery.moveToFirst()) {
            rawQuery.close();
            return;
        }
        int count = rawQuery.getCount();
        CharSequence[] charSequenceArr = new CharSequence[count];
        long[] jArr = new long[count];
        int i = 0;
        do {
            charSequenceArr[i] = rawQuery.getString(1);
            jArr[i] = rawQuery.getLong(0);
            i++;
        } while (rawQuery.moveToNext());
        rawQuery.close();
        new DialogInterfaceC0068b.C0069a(this.f8608a, C2553q3.m11117c()).mo238r(R.string.remove_collection).mo227g(charSequenceArr, new DialogInterface$OnClickListenerC2469d(jArr)).mo221a().show();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8728a() {
        SQLiteDatabase sQLiteDatabase = this.f8610c;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT _id,name FROM genres ORDER BY name", null);
        int count = rawQuery.getCount();
        String[] strArr = new String[count];
        long[] jArr = new long[count];
        boolean[] zArr = new boolean[count];
        if (rawQuery.moveToFirst()) {
            int i = 0;
            do {
                jArr[i] = rawQuery.getLong(0);
                strArr[i] = rawQuery.getString(1);
                zArr[i] = false;
                Cursor rawQuery2 = sQLiteDatabase.rawQuery("SELECT * FROM gamegenres WHERE game=" + this.f8609b + " AND genre=" + jArr[i], null);
                if (rawQuery2.moveToFirst()) {
                    zArr[i] = true;
                }
                rawQuery2.close();
                i++;
            } while (rawQuery.moveToNext());
        }
        rawQuery.close();
        DialogInterfaceC0068b.C0069a aVar = new DialogInterfaceC0068b.C0069a(this.f8608a, C2553q3.m11117c());
        aVar.mo238r(R.string.set_genres);
        aVar.mo231k(strArr, zArr, new DialogInterface$OnMultiChoiceClickListenerC2467b(zArr));
        aVar.mo235o(R.string.ok, new DialogInterface$OnClickListenerC2468c(sQLiteDatabase, count, zArr, jArr));
        aVar.mo232l(R.string.cancel, null);
        aVar.mo221a().show();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v18, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public boolean mo8729c(MenuItem menuItem) {
        char c = 0;
        switch (menuItem.getItemId()) {
            case R.id.add_collection /*{ENCODED_INT: 2131296340}*/:
                C2223d0.m9876p().mo8215r(this.f8608a, 16, new C2477k());
                return true;
            case R.id.add_homescreen /*{ENCODED_INT: 2131296342}*/:
                C2223d0.m9876p().mo8215r(this.f8608a, 2, new C2475i());
                return true;
            case R.id.delete /*{ENCODED_INT: 2131296578}*/:
                C2223d0.m9876p().mo8215r(this.f8608a, 13, new C2483m());
                return true;
            case R.id.delete_video /*{ENCODED_INT: 2131296581}*/:
                new DialogInterfaceC0068b.C0069a(this.f8608a, C2553q3.m11117c()).mo228h(R.string.confirm).mo232l(R.string.cancel, null).mo235o(R.string.ok, new DialogInterface$OnClickListenerC2472f()).mo221a().show();
                return true;
            case R.id.edit_genres /*{ENCODED_INT: 2131296635}*/:
                C2223d0.m9876p().mo8215r(this.f8608a, 5, new C2476j());
                return true;
            case R.id.edit_sort /*{ENCODED_INT: 2131296638}*/:
                SQLiteDatabase sQLiteDatabase = this.f8610c;
                Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT  sortname FROM roms WHERE _id=" + this.f8609b, null);
                if (rawQuery.moveToFirst()) {
                    String string = rawQuery.getString(0);
                    View inflate = this.f8608a.getLayoutInflater().inflate(R.layout.genre_edit, (ViewGroup) null);
                    EditText editText = (EditText) inflate.findViewById(R.id.genre_input);
                    editText.setText(string);
                    editText.setTextColor(C2553q3.m11116b());
                    new DialogInterfaceC0068b.C0069a(this.f8608a, C2553q3.m11117c()).mo240t(inflate).mo228h(R.string.edit_sort).mo232l(17039360, null).mo235o(17039370, new DialogInterface$OnClickListenerC2486n(editText)).mo221a().show();
                }
                return true;
            case R.id.favorite /*{ENCODED_INT: 2131296659}*/:
                SQLiteDatabase sQLiteDatabase2 = this.f8610c;
                Cursor rawQuery2 = sQLiteDatabase2.rawQuery("SELECT favorite FROM roms WHERE _id=" + this.f8609b, null);
                if (rawQuery2.moveToFirst()) {
                    if (rawQuery2.getInt(0) == 1) {
                        c = 1;
                    }
                    boolean z = c ^ 1;
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("favorite", Integer.valueOf(z ? 1 : 0));
                    SQLiteDatabase sQLiteDatabase3 = this.f8610c;
                    sQLiteDatabase3.update("roms", contentValues, "_id=" + this.f8609b, null);
                    this.f8611d.mo8665c(z);
                }
                rawQuery2.close();
                return true;
            case R.id.ignore /*{ENCODED_INT: 2131296788}*/:
                C2223d0.m9876p().mo8215r(this.f8608a, 12, new C2480l());
                return true;
            case R.id.rate /*{ENCODED_INT: 2131297063}*/:
                new C2828w2(this.f8608a, this.f8610c, false, new C2474h()).mo9396f(this.f8609b);
                return true;
            case R.id.remove_collection /*{ENCODED_INT: 2131297073}*/:
                m10623d();
                return true;
            case R.id.reset_stats /*{ENCODED_INT: 2131297077}*/:
                new DialogInterfaceC0068b.C0069a(this.f8608a, C2553q3.m11117c()).mo228h(R.string.confirm).mo232l(R.string.cancel, null).mo235o(R.string.ok, new DialogInterface$OnClickListenerC2466a()).mo221a().show();
                return true;
            case R.id.reset_video /*{ENCODED_INT: 2131297078}*/:
                new DialogInterfaceC0068b.C0069a(this.f8608a, C2553q3.m11117c()).mo228h(R.string.confirm).mo232l(R.string.cancel, null).mo235o(R.string.ok, new DialogInterface$OnClickListenerC2473g()).mo221a().show();
                return true;
            case R.id.search_video /*{ENCODED_INT: 2131297131}*/:
                this.f8612e.mo8253A(this.f8609b);
                return true;
            default:
                return false;
        }
    }
}
