package com.digdroid.alman.dig;

import android.app.Activity;
import android.app.Dialog;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.app.DialogInterfaceC0068b;
import java.util.ArrayList;

/* renamed from: com.digdroid.alman.dig.a0 */
public class C2165a0 {

    /* renamed from: a */
    Activity f7808a;

    /* renamed from: b */
    SQLiteDatabase f7809b;

    /* renamed from: c */
    ArrayList<C2174f> f7810c = new ArrayList<>();

    /* renamed from: d */
    ArrayList<String> f7811d = new ArrayList<>();

    /* renamed from: e */
    int f7812e = -1;

    /* renamed from: f */
    long f7813f = -1;

    /* renamed from: g */
    AbstractC2175g f7814g;

    /* renamed from: h */
    Dialog f7815h;

    /* renamed from: com.digdroid.alman.dig.a0$a */
    class C2166a implements AdapterView.OnItemSelectedListener {

        /* renamed from: b */
        final /* synthetic */ View f7816b;

        C2166a(View view) {
            this.f7816b = view;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            C2165a0 a0Var = C2165a0.this;
            a0Var.f7812e = i;
            a0Var.f7813f = a0Var.f7810c.get(i).f7832a;
            C2165a0.this.f7810c.get(i).mo8036c(this.f7816b);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: com.digdroid.alman.dig.a0$b */
    class View$OnClickListenerC2167b implements View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ View f7818b;

        /* renamed from: c */
        final /* synthetic */ String f7819c;

        /* renamed from: d */
        final /* synthetic */ Spinner f7820d;

        /* renamed from: com.digdroid.alman.dig.a0$b$a */
        class DialogInterface$OnClickListenerC2168a implements DialogInterface.OnClickListener {
            DialogInterface$OnClickListenerC2168a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C2165a0 a0Var = C2165a0.this;
                View$OnClickListenerC2167b bVar = View$OnClickListenerC2167b.this;
                long e = a0Var.f7810c.get(a0Var.f7812e).mo8038e(C2165a0.this.f7808a, bVar.f7818b);
                if (e >= 0) {
                    View$OnClickListenerC2167b bVar2 = View$OnClickListenerC2167b.this;
                    C2165a0 a0Var2 = C2165a0.this;
                    a0Var2.f7813f = e;
                    a0Var2.m9649d(bVar2.f7819c);
                    View$OnClickListenerC2167b bVar3 = View$OnClickListenerC2167b.this;
                    C2165a0.this.m9650e(bVar3.f7820d);
                }
            }
        }

        View$OnClickListenerC2167b(View view, String str, Spinner spinner) {
            this.f7818b = view;
            this.f7819c = str;
            this.f7820d = spinner;
        }

        public void onClick(View view) {
            new DialogInterfaceC0068b.C0069a(C2165a0.this.f7808a, C2553q3.m11117c()).mo228h(R.string.confirm).mo232l(R.string.cancel, null).mo235o(R.string.ok, new DialogInterface$OnClickListenerC2168a()).mo221a().show();
        }
    }

    /* renamed from: com.digdroid.alman.dig.a0$c */
    class View$OnClickListenerC2169c implements View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ String f7823b;

        /* renamed from: c */
        final /* synthetic */ Spinner f7824c;

        /* renamed from: com.digdroid.alman.dig.a0$c$a */
        class DialogInterface$OnClickListenerC2170a implements DialogInterface.OnClickListener {
            DialogInterface$OnClickListenerC2170a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C2165a0 a0Var = C2165a0.this;
                a0Var.f7810c.get(a0Var.f7812e).mo8034a();
                View$OnClickListenerC2169c cVar = View$OnClickListenerC2169c.this;
                C2165a0.this.m9649d(cVar.f7823b);
                View$OnClickListenerC2169c cVar2 = View$OnClickListenerC2169c.this;
                C2165a0.this.m9650e(cVar2.f7824c);
            }
        }

        View$OnClickListenerC2169c(String str, Spinner spinner) {
            this.f7823b = str;
            this.f7824c = spinner;
        }

        public void onClick(View view) {
            new DialogInterfaceC0068b.C0069a(C2165a0.this.f7808a, C2553q3.m11117c()).mo228h(R.string.confirm).mo232l(R.string.cancel, null).mo235o(R.string.ok, new DialogInterface$OnClickListenerC2170a()).mo221a().show();
        }
    }

    /* renamed from: com.digdroid.alman.dig.a0$d */
    class View$OnClickListenerC2171d implements View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ String f7827b;

        /* renamed from: c */
        final /* synthetic */ Spinner f7828c;

        /* renamed from: com.digdroid.alman.dig.a0$d$a */
        class DialogInterface$OnClickListenerC2172a implements DialogInterface.OnClickListener {
            DialogInterface$OnClickListenerC2172a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                View$OnClickListenerC2171d dVar = View$OnClickListenerC2171d.this;
                C2174f fVar = new C2174f(dVar.f7827b);
                fVar.f7834c = C2165a0.this.f7808a.getString(R.string.new_emulator);
                C2165a0.this.f7810c.add(fVar);
                C2165a0 a0Var = C2165a0.this;
                a0Var.f7811d.add(a0Var.f7808a.getString(R.string.new_emulator));
                View$OnClickListenerC2171d dVar2 = View$OnClickListenerC2171d.this;
                C2165a0.this.m9650e(dVar2.f7828c);
                View$OnClickListenerC2171d dVar3 = View$OnClickListenerC2171d.this;
                dVar3.f7828c.setSelection(C2165a0.this.f7811d.size() - 1);
            }
        }

        View$OnClickListenerC2171d(String str, Spinner spinner) {
            this.f7827b = str;
            this.f7828c = spinner;
        }

        public void onClick(View view) {
            new DialogInterfaceC0068b.C0069a(C2165a0.this.f7808a, C2553q3.m11117c()).mo228h(R.string.confirm).mo232l(R.string.cancel, null).mo235o(R.string.ok, new DialogInterface$OnClickListenerC2172a()).mo221a().show();
        }
    }

    /* renamed from: com.digdroid.alman.dig.a0$e */
    class View$OnClickListenerC2173e implements View.OnClickListener {
        View$OnClickListenerC2173e() {
        }

        public void onClick(View view) {
            C2165a0.this.f7814g.mo8039a();
            C2165a0.this.f7815h.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.a0$f */
    public class C2174f {

        /* renamed from: a */
        long f7832a;

        /* renamed from: b */
        String f7833b;

        /* renamed from: c */
        String f7834c;

        /* renamed from: d */
        String f7835d;

        /* renamed from: e */
        String f7836e;

        /* renamed from: f */
        String f7837f;

        /* renamed from: g */
        String f7838g;

        /* renamed from: h */
        String f7839h;

        /* renamed from: i */
        boolean f7840i;

        /* renamed from: j */
        boolean f7841j;

        public C2174f(String str) {
            this.f7832a = -1;
            this.f7833b = str;
            this.f7834c = "";
            this.f7835d = "";
            this.f7836e = "";
            this.f7837f = "";
            this.f7838g = "";
            this.f7839h = "";
            this.f7840i = true;
            this.f7841j = false;
        }

        public C2174f(String str, Cursor cursor) {
            this.f7833b = str;
            boolean z = false;
            this.f7832a = cursor.getLong(0);
            this.f7834c = cursor.getString(1);
            this.f7837f = cursor.getString(2);
            this.f7835d = cursor.getString(3);
            this.f7836e = cursor.getString(4);
            this.f7838g = cursor.getString(5);
            this.f7839h = cursor.getString(6);
            this.f7840i = cursor.getInt(7) == 1;
            this.f7841j = cursor.getInt(8) == 1 ? true : z;
        }

        /* renamed from: a */
        public void mo8034a() {
            SQLiteDatabase sQLiteDatabase = C2165a0.this.f7809b;
            sQLiteDatabase.execSQL("DELETE FROM emulators WHERE _id=" + this.f7832a);
        }

        /* renamed from: b */
        public void mo8035b(View view) {
            this.f7834c = ((EditText) view.findViewById(R.id.name_edit)).getText().toString().trim();
            this.f7835d = ((EditText) view.findViewById(R.id.package_edit)).getText().toString().trim();
            this.f7836e = ((EditText) view.findViewById(R.id.activity_edit)).getText().toString().trim();
            this.f7837f = ((EditText) view.findViewById(R.id.core_edit)).getText().toString().trim();
            this.f7838g = ((EditText) view.findViewById(R.id.key_edit)).getText().toString().trim();
            this.f7839h = ((EditText) view.findViewById(R.id.data_edit)).getText().toString().trim();
            this.f7840i = ((CheckBox) view.findViewById(R.id.takes_zip)).isChecked();
        }

        /* renamed from: c */
        public void mo8036c(View view) {
            ((EditText) view.findViewById(R.id.name_edit)).setText(this.f7834c);
            ((EditText) view.findViewById(R.id.package_edit)).setText(this.f7835d);
            ((EditText) view.findViewById(R.id.activity_edit)).setText(this.f7836e);
            ((EditText) view.findViewById(R.id.core_edit)).setText(this.f7837f);
            ((EditText) view.findViewById(R.id.key_edit)).setText(this.f7838g);
            ((EditText) view.findViewById(R.id.data_edit)).setText(this.f7839h);
            ((CheckBox) view.findViewById(R.id.takes_zip)).setChecked(this.f7840i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public ContentValues mo8037d(Activity activity) {
            if (this.f7834c.equals("") || this.f7835d.equals("") || this.f7836e.equals("")) {
                new DialogInterfaceC0068b.C0069a(activity, C2553q3.m11117c()).mo228h(R.string.bad_emu).mo235o(R.string.ok, null).mo221a().show();
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("system", this.f7833b);
            contentValues.put("user_edited", (Integer) 1);
            contentValues.put("name", this.f7834c);
            contentValues.put("package", this.f7835d);
            contentValues.put("class", this.f7836e);
            contentValues.put("core", this.f7837f);
            contentValues.put("rom_key", this.f7838g);
            contentValues.put("data_type", this.f7839h);
            contentValues.put("takes_zip", Integer.valueOf(this.f7840i ? 1 : 0));
            contentValues.put("action_type", "");
            contentValues.put("config_dir", "");
            contentValues.put("use_retroarch64", Integer.valueOf(this.f7841j ? 1 : 0));
            return contentValues;
        }

        /* renamed from: e */
        public long mo8038e(Activity activity, View view) {
            mo8035b(view);
            ContentValues d = mo8037d(activity);
            if (d == null) {
                return -1;
            }
            int i = (this.f7832a > 0 ? 1 : (this.f7832a == 0 ? 0 : -1));
            SQLiteDatabase sQLiteDatabase = C2165a0.this.f7809b;
            if (i < 0) {
                this.f7832a = sQLiteDatabase.insert("emulators", null, d);
            } else {
                sQLiteDatabase.update("emulators", d, "_id=" + this.f7832a, null);
            }
            return this.f7832a;
        }
    }

    /* renamed from: com.digdroid.alman.dig.a0$g */
    interface AbstractC2175g {
        /* renamed from: a */
        void mo8039a();
    }

    public C2165a0(Activity activity, AbstractC2175g gVar) {
        this.f7808a = activity;
        this.f7814g = gVar;
        this.f7809b = C2775u.m11726e(activity).mo9325c();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: d */
    private boolean m9649d(String str) {
        SQLiteDatabase sQLiteDatabase = this.f7809b;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT _id,name,core,package,class,rom_key,data_type,takes_zip,use_retroarch64 FROM emulators WHERE system='" + str + "' ORDER BY name", null);
        if (!rawQuery.moveToFirst()) {
            rawQuery.close();
            return false;
        }
        this.f7810c.clear();
        this.f7811d.clear();
        do {
            C2174f fVar = new C2174f(str, rawQuery);
            this.f7810c.add(fVar);
            this.f7811d.add(fVar.f7834c);
        } while (rawQuery.moveToNext());
        return true;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: e */
    private void m9650e(Spinner spinner) {
        ArrayAdapter arrayAdapter = new ArrayAdapter(this.f7808a, 17367048, this.f7811d);
        arrayAdapter.setDropDownViewResource(17367049);
        spinner.setAdapter((SpinnerAdapter) arrayAdapter);
        for (int i = 0; i < this.f7810c.size(); i++) {
            if (this.f7810c.get(i).f7832a == this.f7813f) {
                spinner.setSelection(i);
            }
        }
    }

    /* renamed from: c */
    public void mo8024c(String str) {
        if (m9649d(str)) {
            View inflate = this.f7808a.getLayoutInflater().inflate(R.layout.edit_emulators, (ViewGroup) null);
            Spinner spinner = (Spinner) inflate.findViewById(R.id.select_emulator);
            m9650e(spinner);
            spinner.setOnItemSelectedListener(new C2166a(inflate));
            TextView textView = (TextView) inflate.findViewById(R.id.save);
            C2553q3.m11132r(textView, -2134061876);
            textView.setOnClickListener(new View$OnClickListenerC2167b(inflate, str, spinner));
            TextView textView2 = (TextView) inflate.findViewById(R.id.delete);
            C2553q3.m11132r(textView2, -2134061876);
            textView2.setOnClickListener(new View$OnClickListenerC2169c(str, spinner));
            TextView textView3 = (TextView) inflate.findViewById(R.id.new_emu);
            C2553q3.m11132r(textView3, -2134061876);
            textView3.setOnClickListener(new View$OnClickListenerC2171d(str, spinner));
            TextView textView4 = (TextView) inflate.findViewById(R.id.done);
            C2553q3.m11132r(textView4, -2134061876);
            textView4.setOnClickListener(new View$OnClickListenerC2173e());
            DialogInterfaceC0068b a = new DialogInterfaceC0068b.C0069a(this.f7808a).mo240t(inflate).mo224d(false).mo221a();
            this.f7815h = a;
            a.show();
        }
    }
}
