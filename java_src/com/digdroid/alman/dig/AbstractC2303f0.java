package com.digdroid.alman.dig;

import android.content.DialogInterface;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.appcompat.app.DialogInterfaceC0068b;

/* renamed from: com.digdroid.alman.dig.f0 */
public abstract class AbstractC2303f0 extends AbstractC2307f1 {

    /* renamed from: x0 */
    SQLiteDatabase f8157x0;

    /* renamed from: y0 */
    boolean f8158y0;

    /* renamed from: z0 */
    long f8159z0 = 0;

    /* renamed from: com.digdroid.alman.dig.f0$a */
    class DialogInterface$OnClickListenerC2304a implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ long f8160b;

        DialogInterface$OnClickListenerC2304a(long j) {
            this.f8160b = j;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            AbstractC2303f0.this.mo8418E3(this.f8160b);
            AbstractC2303f0 f0Var = AbstractC2303f0.this;
            f0Var.f8159z0 = 0;
            f0Var.f8806m0.mo8264R();
            AbstractC2303f0.this.mo8106G2(false);
            AbstractC2303f0 f0Var2 = AbstractC2303f0.this;
            f0Var2.f8806m0.mo8260K(f0Var2.f8958p0.mo8321f());
        }
    }

    /* renamed from: com.digdroid.alman.dig.f0$b */
    class DialogInterface$OnClickListenerC2305b implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ EditText f8162b;

        /* renamed from: c */
        final /* synthetic */ long f8163c;

        DialogInterface$OnClickListenerC2305b(EditText editText, long j) {
            this.f8162b = editText;
            this.f8163c = j;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            String trim = this.f8162b.getText().toString().trim();
            if (trim != null && !trim.equals("")) {
                AbstractC2303f0.this.mo8422I3(this.f8163c, trim);
                AbstractC2303f0 f0Var = AbstractC2303f0.this;
                f0Var.f8159z0 = 0;
                f0Var.f8806m0.mo8264R();
                AbstractC2303f0.this.mo8106G2(false);
                AbstractC2303f0 f0Var2 = AbstractC2303f0.this;
                f0Var2.f8806m0.mo8260K(f0Var2.f8958p0.mo8321f());
            }
        }
    }

    /* renamed from: com.digdroid.alman.dig.f0$c */
    class DialogInterface$OnClickListenerC2306c implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ EditText f8165b;

        DialogInterface$OnClickListenerC2306c(EditText editText) {
            this.f8165b = editText;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            String trim = this.f8165b.getText().toString().trim();
            if (trim != null && !trim.equals("")) {
                AbstractC2303f0.this.mo8417D3(trim);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2307f1
    /* renamed from: C3 */
    public boolean mo8416C3(MenuItem menuItem, long j, String str, String str2) {
        DialogInterfaceC0068b.C0069a o;
        if (menuItem.getItemId() == R.id.delete) {
            DialogInterfaceC0068b.C0069a aVar = new DialogInterfaceC0068b.C0069a(mo2552c0(), C2553q3.m11117c());
            o = aVar.mo239s(mo2501D0(R.string.delete) + " " + str2).mo229i(mo2501D0(R.string.confirm)).mo232l(17039360, null).mo235o(17039370, new DialogInterface$OnClickListenerC2304a(j));
        } else if (menuItem.getItemId() != R.id.rename) {
            return super.mo8416C3(menuItem, j, str, str2);
        } else {
            View inflate = mo2598q0().inflate(R.layout.genre_edit, (ViewGroup) null);
            EditText editText = (EditText) inflate.findViewById(R.id.genre_input);
            editText.setTextColor(C2553q3.m11116b());
            editText.setText(str2);
            o = new DialogInterfaceC0068b.C0069a(mo2552c0(), C2553q3.m11117c()).mo240t(inflate).mo229i(mo2501D0(mo8420G3())).mo232l(17039360, null).mo235o(17039370, new DialogInterface$OnClickListenerC2305b(editText, j));
        }
        o.mo221a().show();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D3 */
    public abstract void mo8417D3(String str);

    /* access modifiers changed from: package-private */
    /* renamed from: E3 */
    public abstract void mo8418E3(long j);

    /* access modifiers changed from: package-private */
    /* renamed from: F3 */
    public abstract int mo8419F3();

    /* access modifiers changed from: package-private */
    /* renamed from: G3 */
    public abstract int mo8420G3();

    @Override // com.digdroid.alman.dig.AbstractC2577r1, com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: H2 */
    public boolean mo8243H2(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.hide_genres) {
            boolean z = !this.f8158y0;
            this.f8158y0 = z;
            this.f8793Z.mo8152A("show_all_genres", z);
            mo2552c0().invalidateOptionsMenu();
            this.f8159z0 = 0;
            mo8407O2();
        } else if (menuItem.getItemId() == R.id.add_genre) {
            View inflate = mo2598q0().inflate(R.layout.genre_edit, (ViewGroup) null);
            EditText editText = (EditText) inflate.findViewById(R.id.genre_input);
            editText.setTextColor(C2553q3.m11116b());
            new DialogInterfaceC0068b.C0069a(mo2552c0(), C2553q3.m11117c()).mo240t(inflate).mo239s(mo2501D0(mo8419F3())).mo232l(17039360, null).mo235o(17039370, new DialogInterface$OnClickListenerC2306c(editText)).mo221a().show();
            return true;
        }
        return super.mo8243H2(menuItem);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H3 */
    public abstract boolean mo8421H3();

    /* access modifiers changed from: package-private */
    /* renamed from: I3 */
    public abstract void mo8422I3(long j, String str);

    /* access modifiers changed from: package-private */
    /* renamed from: J3 */
    public abstract void mo8423J3(Cursor cursor);

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2577r1, com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: O2 */
    public synchronized void mo8407O2() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f8159z0 >= 10000) {
            super.mo8407O2();
            this.f8159z0 = currentTimeMillis;
        }
    }

    @Override // com.digdroid.alman.dig.AbstractC2307f1, com.digdroid.alman.dig.C2324g1.AbstractC2325a
    /* renamed from: R */
    public int mo8424R(Cursor cursor) {
        return cursor.getInt(2);
    }

    @Override // com.digdroid.alman.dig.AbstractC2307f1, com.digdroid.alman.dig.C2324g1.AbstractC2325a, com.digdroid.alman.dig.C2264e1.AbstractC2265a, com.digdroid.alman.dig.C2215c1.AbstractC2216a
    /* renamed from: b */
    public /* bridge */ /* synthetic */ C2464m mo8310b() {
        return super.mo8310b();
    }

    @Override // com.digdroid.alman.dig.AbstractC2307f1, com.digdroid.alman.dig.C2264e1.AbstractC2265a, com.digdroid.alman.dig.C2215c1.AbstractC2216a
    /* renamed from: f */
    public /* bridge */ /* synthetic */ String mo8313f(Cursor cursor) {
        return super.mo8313f(cursor);
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1, com.digdroid.alman.dig.AbstractC2531p1, com.digdroid.alman.dig.AbstractC2307f1, androidx.fragment.app.Fragment
    /* renamed from: m1 */
    public /* bridge */ /* synthetic */ void mo2585m1() {
        super.mo2585m1();
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2577r1
    /* renamed from: n3 */
    public void mo8425n3(View view, Object obj) {
        if (obj != null) {
            mo8423J3((Cursor) obj);
        }
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1, com.digdroid.alman.dig.AbstractC2531p1, com.digdroid.alman.dig.AbstractC2307f1, androidx.fragment.app.Fragment
    /* renamed from: r1 */
    public /* bridge */ /* synthetic */ void mo2601r1() {
        super.mo2601r1();
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1, com.digdroid.alman.dig.AbstractC2531p1, androidx.fragment.app.Fragment
    /* renamed from: t1 */
    public void mo2605t1() {
        super.mo2605t1();
        this.f8157x0 = this.f8794a0.mo9325c();
        this.f8158y0 = mo8421H3();
    }
}
