package com.digdroid.alman.dig;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.DialogInterfaceC0068b;
import androidx.appcompat.widget.C0248l0;
import androidx.fragment.app.ActivityC0447d;
import com.digdroid.alman.dig.C2215c1;
import com.digdroid.alman.dig.C2264e1;
import com.digdroid.alman.dig.C2324g1;
import com.digdroid.alman.dig.C2391i;
import java.io.File;
import p006b.p007a.p014o.C0788d;

/* renamed from: com.digdroid.alman.dig.f1 */
abstract class AbstractC2307f1 extends AbstractC2577r1 implements C2264e1.AbstractC2265a, C2324g1.AbstractC2325a, C2215c1.AbstractC2216a {

    /* renamed from: s0 */
    C2464m f8167s0;

    /* renamed from: t0 */
    Handler f8168t0 = new Handler();

    /* renamed from: u0 */
    Runnable f8169u0 = new RunnableC2308a();

    /* renamed from: v0 */
    protected boolean[] f8170v0 = null;

    /* renamed from: w0 */
    String f8171w0 = null;

    /* renamed from: com.digdroid.alman.dig.f1$a */
    class RunnableC2308a implements Runnable {
        RunnableC2308a() {
        }

        public void run() {
            AbstractC2307f1 f1Var = AbstractC2307f1.this;
            if (!(!f1Var.f8803j0 || f1Var.f8958p0 == null || f1Var.f8959q0 == null)) {
                f1Var.f8167s0.mo8727c();
                int b = AbstractC2307f1.this.f8959q0.mo8240b();
                for (int i = 0; i < b; i++) {
                    View c = AbstractC2307f1.this.f8958p0.mo8319c(i);
                    if (c != null) {
                        TextView textView = (TextView) c.findViewById(R.id.genre_name);
                        if (textView != null) {
                            textView.setTextColor(AbstractC2307f1.this.f8167s0.mo8725a(i));
                        }
                        TextView textView2 = (TextView) c.findViewById(R.id.genre_count);
                        if (textView2 != null) {
                            textView2.setTextColor(AbstractC2307f1.this.f8167s0.mo8725a(i));
                        }
                    }
                }
            }
            AbstractC2307f1 f1Var2 = AbstractC2307f1.this;
            f1Var2.f8168t0.postDelayed(this, (long) f1Var2.f8167s0.f8598h);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.f1$b */
    public class C2309b implements C2391i.AbstractC2394b {

        /* renamed from: a */
        final /* synthetic */ String f8173a;

        C2309b(String str) {
            this.f8173a = str;
        }

        @Override // com.digdroid.alman.dig.C2391i.AbstractC2394b
        /* renamed from: a */
        public void mo8043a(String[] strArr) {
            File A3;
            ActivityC0447d c0 = AbstractC2307f1.this.mo2552c0();
            if (c0 != null && !c0.isFinishing() && (A3 = AbstractC2307f1.this.mo8429A3()) != null) {
                if (!A3.exists()) {
                    try {
                        A3.mkdirs();
                    } catch (Exception unused) {
                    }
                }
                Context j0 = AbstractC2307f1.this.mo2575j0();
                String str = strArr[0];
                C2185a4.m9672b(j0, str, A3.getAbsolutePath() + "/" + this.f8173a + ".png");
                AbstractC2307f1.this.mo9021q3();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.f1$c */
    public class DialogInterface$OnClickListenerC2310c implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ String f8175b;

        DialogInterface$OnClickListenerC2310c(String str) {
            this.f8175b = str;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            File A3;
            ActivityC0447d c0 = AbstractC2307f1.this.mo2552c0();
            if (c0 != null && !c0.isFinishing() && (A3 = AbstractC2307f1.this.mo8429A3()) != null) {
                File file = new File(A3, this.f8175b + ".png");
                try {
                    if (file.exists()) {
                        file.delete();
                    }
                } catch (Exception unused) {
                }
                AbstractC2307f1.this.mo9021q3();
            }
        }
    }

    /* renamed from: com.digdroid.alman.dig.f1$d */
    class C2311d implements C0248l0.AbstractC0252d {

        /* renamed from: a */
        final /* synthetic */ long f8177a;

        /* renamed from: b */
        final /* synthetic */ String f8178b;

        /* renamed from: c */
        final /* synthetic */ String f8179c;

        C2311d(long j, String str, String str2) {
            this.f8177a = j;
            this.f8178b = str;
            this.f8179c = str2;
        }

        @Override // androidx.appcompat.widget.C0248l0.AbstractC0252d
        public boolean onMenuItemClick(MenuItem menuItem) {
            return AbstractC2307f1.this.mo8416C3(menuItem, this.f8177a, this.f8178b, this.f8179c);
        }
    }

    AbstractC2307f1() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A3 */
    public File mo8429A3() {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B3 */
    public String mo8430B3() {
        return "";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C3 */
    public boolean mo8416C3(MenuItem menuItem, long j, String str, String str2) {
        ActivityC0447d c0;
        if (menuItem.getItemId() == R.id.change_icon) {
            C2391i iVar = new C2391i(mo2552c0());
            iVar.mo8591g(true);
            iVar.mo8592h(new C2309b(str));
            iVar.mo8588d();
        } else if (menuItem.getItemId() == R.id.delete_icon && (c0 = mo2552c0()) != null && !c0.isFinishing()) {
            new DialogInterfaceC0068b.C0069a(c0, C2553q3.m11117c()).mo228h(R.string.confirm).mo232l(R.string.cancel, null).mo235o(R.string.ok, new DialogInterface$OnClickListenerC2310c(str)).mo221a().show();
        }
        return true;
    }

    @Override // com.digdroid.alman.dig.C2324g1.AbstractC2325a
    /* renamed from: R */
    public int mo8424R(Cursor cursor) {
        return -1;
    }

    @Override // com.digdroid.alman.dig.C2324g1.AbstractC2325a, com.digdroid.alman.dig.C2264e1.AbstractC2265a, com.digdroid.alman.dig.C2215c1.AbstractC2216a
    /* renamed from: b */
    public C2464m mo8310b() {
        C2774t3 t3Var = this.f8800g0;
        return new C2464m(true, t3Var.f9404h, t3Var.f9405i, 6);
    }

    @Override // com.digdroid.alman.dig.C2264e1.AbstractC2265a, com.digdroid.alman.dig.C2215c1.AbstractC2216a
    /* renamed from: f */
    public String mo8313f(Cursor cursor) {
        return "" + cursor.getLong(0);
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2577r1
    /* renamed from: h3 */
    public void mo8431h3(View view, Object obj) {
        Cursor cursor = (Cursor) obj;
        long j = cursor.getLong(0);
        String string = cursor.getString(1);
        String f = mo8313f(cursor);
        int position = cursor.getPosition();
        C0788d dVar = new C0788d(mo2552c0(), C2553q3.m11117c());
        if (view == null) {
            view = this.f8806m0.mo8904I();
        }
        C0248l0 l0Var = new C0248l0(dVar, view);
        l0Var.mo1571b().inflate(mo8433y3(), l0Var.mo1570a());
        l0Var.mo1570a().findItem(R.id.delete_icon).setVisible(this.f8170v0[position]);
        l0Var.mo1572c(new C2311d(j, f, string));
        l0Var.mo1573d();
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2577r1
    /* renamed from: j3 */
    public C2252d2 mo8432j3(Cursor cursor) {
        MainActivity mainActivity = (MainActivity) mo2552c0();
        if (mainActivity == null || mainActivity.isFinishing()) {
            return null;
        }
        C2464m b = mo8310b();
        this.f8167s0 = b;
        if (!b.f8591a) {
            this.f8168t0.removeCallbacksAndMessages(null);
            this.f8168t0.postDelayed(this.f8169u0, 0);
        }
        String Q = mo8375Q();
        Q.hashCode();
        char c = 65535;
        switch (Q.hashCode()) {
            case -1984141450:
                if (Q.equals("vertical")) {
                    c = 0;
                    break;
                }
                break;
            case -1102672091:
                if (Q.equals("linear")) {
                    c = 1;
                    break;
                }
                break;
            case 2908512:
                if (Q.equals("carousel")) {
                    c = 2;
                    break;
                }
                break;
            case 3181382:
                if (Q.equals("grid")) {
                    c = 3;
                    break;
                }
                break;
            case 3322014:
                if (Q.equals("list")) {
                    c = 4;
                    break;
                }
                break;
            case 110371416:
                if (Q.equals("title")) {
                    c = 5;
                    break;
                }
                break;
            case 113097563:
                if (Q.equals("wheel")) {
                    c = 6;
                    break;
                }
                break;
            case 1980277093:
                if (Q.equals("coverflow")) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new C2252d2(new C2370h1(mainActivity, this.f8800g0, cursor, mo8363E(), mo8468m3(), this.f8171w0, this.f8170v0, this));
            case 1:
                return new C2252d2(new C2251d1(mainActivity, this.f8800g0, cursor, mo8379V(), mo8468m3(), this.f8171w0, this.f8170v0, this));
            case 2:
                return new C2252d2(new C2176a1(mainActivity, this.f8800g0, cursor, mo8397z(), mo8468m3(), this.f8171w0, this.f8170v0, this));
            case 3:
                return new C2252d2(new C2215c1(mainActivity, this.f8800g0, cursor, mo8468m3(), this.f8171w0, this.f8170v0, this));
            case 4:
                return new C2252d2(new C2264e1(mainActivity, this.f8800g0, cursor, mo8468m3(), this.f8171w0, this.f8170v0, this));
            case 5:
                return new C2252d2(new C2324g1(mainActivity, this.f8800g0, cursor, mo8468m3(), this));
            case 6:
                return new C2252d2(new C2398i1(mainActivity, this.f8800g0, cursor, mo8395x(), mo8468m3(), this.f8171w0, this.f8170v0, this));
            case 7:
                return new C2252d2(new C2205b1(mainActivity, this.f8800g0, cursor, mo8380W(), mo8468m3(), this.f8171w0, this.f8170v0, this));
            default:
                return null;
        }
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1, com.digdroid.alman.dig.AbstractC2531p1, androidx.fragment.app.Fragment
    /* renamed from: m1 */
    public void mo2585m1() {
        super.mo2585m1();
        this.f8168t0.removeCallbacksAndMessages(null);
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1, com.digdroid.alman.dig.AbstractC2531p1, androidx.fragment.app.Fragment
    /* renamed from: r1 */
    public void mo2601r1() {
        super.mo2601r1();
        mo8118X2(mo8430B3());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y3 */
    public int mo8433y3() {
        return -1;
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: z2 */
    public void mo8410z2(Intent intent) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z3 */
    public void mo8434z3(Cursor cursor) {
        ActivityC0447d c0;
        File A3;
        if (cursor.moveToFirst() && (c0 = mo2552c0()) != null && !c0.isFinishing() && (A3 = mo8429A3()) != null) {
            this.f8171w0 = A3.getAbsolutePath();
            this.f8170v0 = new boolean[cursor.getCount()];
            int i = 0;
            while (true) {
                int i2 = i + 1;
                this.f8170v0[i] = new File(this.f8171w0 + "/" + mo8313f(cursor) + ".png").exists();
                if (cursor.moveToNext()) {
                    i = i2;
                } else {
                    return;
                }
            }
        }
    }
}
