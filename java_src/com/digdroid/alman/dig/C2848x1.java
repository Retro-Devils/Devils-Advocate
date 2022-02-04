package com.digdroid.alman.dig;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.os.Build;
import androidx.appcompat.app.DialogInterfaceC0068b;
import com.digdroid.alman.dig.C2363g4;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

/* renamed from: com.digdroid.alman.dig.x1 */
public class C2848x1 {

    /* renamed from: a */
    private static final String[][] f9618a = {new String[]{"intellivision", "intv.xml", "intv", "rom", null}, new String[]{"vic20", "vic1001_cart.xml", "vic1001", "rom", null}, new String[]{"atari5200", "a5200.xml", "a5200", "rom", null}, new String[]{"astrocade", "astrocde.xml", "astrocde", "rom", null}, new String[]{"ti99", "ti99_cart.xml", "ti99_4a", "rom", null}, new String[]{"odyssey2", "odyssey2.xml", "odyssey2", "rom", null}, new String[]{"channelf", "channelf.xml", "channelf", "rom", null}, new String[]{"studio2", "studio2.xml", "studio2", "rom", null}, new String[]{"apfm1000", "apfm1000.xml", "apfm1000", "rom", null}, new String[]{"vc4000", "vc4000.xml", "vc4000", "rom", null}, new String[]{"crvision", "crvision.xml", "crvision", "rom", null}, new String[]{"arcadia", "arcadia.xml", "arcadia", "rom", null}, new String[]{"pv1000", "pv1000.xml", "pv1000", "rom", null}, new String[]{"scvision", "scv.xml", "scv", "rom", null}, new String[]{"gx4000", "gx4000.xml", "gx4000", "rom", null}, new String[]{"atarixegs", "xegs.xml", "xegs", "rom", null}, new String[]{"coco", "coco_cart.xml", "coco", "rom", "Color Computer"}, new String[]{"coco", "coco_cart.xml", "coco2", "rom", "Color Computer 2"}, new String[]{"coco", "coco_cart.xml", "coco3", "rom", "Color Computer 3"}, new String[]{"coco", "coco_cart.xml", "dragon32", "rom", "Dragon 32"}, new String[]{"cdi", "cdi.xml", "cdimono1", "chd", null}, new String[]{"ngcd", "neocd.xml", "neocdz", "chd", null}, new String[]{"adam", "adam_flop.xml", "adam", "rom", null}, new String[]{"sv8000", "sv8000.xml", "sv8000", "rom", null}, new String[]{"tutor", "tutor.xml", "tutor", "rom", "Tomy Tutor"}, new String[]{"tutor", "tutor.xml", "pyuuta", "rom", "Tomy Pyuuta"}, new String[]{"tutor", "tutor.xml", "pyuutajr", "rom", "Tomy Pyuuta Jr."}, new String[]{"gpc", "gamepock.xml", "gamepock", "rom", null}, new String[]{"gamate", "gamate.xml", "gamate", "rom", null}, new String[]{"svision", "svision.xml", "svision", "rom", null}, new String[]{"megaduck", "megaduck.xml", "megaduck", "rom", null}, new String[]{"gamecom", "gamecom.xml", "gamecom", "rom", null}, new String[]{"loopy", "casloopy.xml", "casloopy", "rom", null}, new String[]{"advision", "advision.xml", "advision", "rom", null}, new String[]{"supracan", "supracan.xml", "supracan", "rom", null}, new String[]{"gp32", "gp32.xml", "gp32", "rom", null}, new String[]{"gmaster", "gmaster.xml", "gmaster", "rom", null}, new String[]{"apple2", "apple2.xml", "apple2", "rom", "Apple II"}, new String[]{"apple2", "apple2.xml", "apple2c", "rom", "Apple IIc"}, new String[]{"apple2", "apple2.xml", "apple2e", "rom", "Apple IIe"}, new String[]{"apple2", "apple2.xml", "apple2gs", "rom", "Apple IIgs"}};

    /* renamed from: b */
    final int f9619b = 0;

    /* renamed from: c */
    final int f9620c = 1;

    /* renamed from: d */
    final int f9621d = 2;

    /* renamed from: e */
    final int f9622e = 3;

    /* renamed from: f */
    Activity f9623f;

    /* renamed from: g */
    String f9624g;

    /* renamed from: h */
    String f9625h;

    /* renamed from: i */
    String f9626i;

    /* renamed from: j */
    String f9627j;

    /* renamed from: k */
    boolean f9628k = false;

    /* renamed from: l */
    String f9629l;

    /* renamed from: m */
    String f9630m;

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.x1$a */
    public class DialogInterface$OnClickListenerC2849a implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ ArrayList f9631b;

        /* renamed from: c */
        final /* synthetic */ String f9632c;

        /* renamed from: d */
        final /* synthetic */ String f9633d;

        /* renamed from: e */
        final /* synthetic */ AbstractC2851c f9634e;

        DialogInterface$OnClickListenerC2849a(ArrayList arrayList, String str, String str2, AbstractC2851c cVar) {
            this.f9631b = arrayList;
            this.f9632c = str;
            this.f9633d = str2;
            this.f9634e = cVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C2848x1.this.mo9436b((String[]) this.f9631b.get(i), this.f9632c, this.f9633d, this.f9634e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.x1$b */
    public class AsyncTaskC2850b extends AsyncTask<Void, Void, Integer> {

        /* renamed from: a */
        final /* synthetic */ String f9636a;

        /* renamed from: b */
        final /* synthetic */ String f9637b;

        /* renamed from: c */
        final /* synthetic */ AbstractC2851c f9638c;

        AsyncTaskC2850b(String str, String str2, AbstractC2851c cVar) {
            this.f9636a = str;
            this.f9637b = str2;
            this.f9638c = cVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Integer doInBackground(Void... voidArr) {
            int e;
            if (!C2848x1.this.mo9441g(this.f9636a)) {
                e = 0;
            } else {
                C2848x1 x1Var = C2848x1.this;
                e = x1Var.f9628k ? x1Var.mo9439e(this.f9636a, this.f9637b) : x1Var.mo9440f(this.f9636a, this.f9637b);
            }
            return Integer.valueOf(e);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Integer num) {
            int intValue = num.intValue();
            if (intValue == 0) {
                this.f9638c.mo8081c();
            } else if (intValue == 1) {
                this.f9638c.mo8082d();
            } else if (intValue == 2) {
                this.f9638c.mo8083e(C2848x1.this.f9629l);
            } else if (intValue == 3) {
                AbstractC2851c cVar = this.f9638c;
                C2848x1 x1Var = C2848x1.this;
                cVar.mo8079a(x1Var.f9630m, x1Var.f9629l);
            }
        }
    }

    /* renamed from: com.digdroid.alman.dig.x1$c */
    public interface AbstractC2851c {
        /* renamed from: a */
        void mo8079a(String str, String str2);

        /* renamed from: b */
        void mo8080b();

        /* renamed from: c */
        void mo8081c();

        /* renamed from: d */
        void mo8082d();

        /* renamed from: e */
        void mo8083e(String str);
    }

    public C2848x1(Activity activity) {
        this.f9623f = activity;
    }

    /* renamed from: a */
    public void mo9435a(String str, String str2, String str3, AbstractC2851c cVar) {
        String str4;
        if (this.f9623f != null) {
            String lowerCase = str2.toLowerCase();
            if (lowerCase.contains("(mess 2015)")) {
                str4 = "/MESS2015";
            } else if (lowerCase.contains("(mess 2014)") || lowerCase.contains("(mess)")) {
                str4 = "/MESS2014";
            } else if (lowerCase.contains("(mame 2016)")) {
                str4 = "/MAME2016";
            } else if (lowerCase.contains("(mame)")) {
                str4 = "/MAME";
            } else {
                cVar.mo8080b();
                return;
            }
            this.f9624g = str4;
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                String[][] strArr = f9618a;
                if (i >= strArr.length) {
                    break;
                }
                if (strArr[i][0].equals(str)) {
                    arrayList.add(strArr[i]);
                }
                i++;
            }
            if (arrayList.size() == 0) {
                cVar.mo8080b();
            } else if (arrayList.size() == 1) {
                mo9436b((String[]) arrayList.get(0), str, str3, cVar);
            } else {
                CharSequence[] charSequenceArr = new CharSequence[arrayList.size()];
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    charSequenceArr[i2] = ((String[]) arrayList.get(i2))[4];
                }
                new DialogInterfaceC0068b.C0069a(this.f9623f, C2553q3.m11117c()).mo238r(R.string.select_model).mo227g(charSequenceArr, new DialogInterface$OnClickListenerC2849a(arrayList, str, str3, cVar)).mo221a().show();
            }
        }
    }

    /* renamed from: b */
    public void mo9436b(String[] strArr, String str, String str2, AbstractC2851c cVar) {
        this.f9626i = strArr[1];
        this.f9627j = strArr[2];
        this.f9628k = strArr[3].equals("chd");
        new AsyncTaskC2850b(str, str2, cVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo9437c(String str, String str2) {
        try {
            C2399i2 i2Var = new C2399i2(C2399i2.m10374d(this.f9623f, str), str2);
            if (i2Var.exists()) {
                return true;
            }
            AssetManager assets = this.f9623f.getAssets();
            InputStream open = assets.open("MESS/" + str2);
            OutputStream j = i2Var.mo8608j();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = open.read(bArr);
                if (read > 0) {
                    j.write(bArr, 0, read);
                } else {
                    open.close();
                    j.flush();
                    j.close();
                    return true;
                }
            }
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo9438d(String str, SQLiteDatabase sQLiteDatabase) {
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT g._id,s.slug FROM games as g,slugs as s,titles as t,systems as sys WHERE sys.slug='" + str + "' AND t.title='BIOS' AND t.system=sys._id AND g._id=t.rowid AND s.gameid=t.rowid", null);
        if (rawQuery.moveToFirst()) {
            do {
                long j = rawQuery.getLong(0);
                Cursor rawQuery2 = C2775u.m11726e(this.f9623f).mo9325c().rawQuery("SELECT r.filename,p.path,p.uri FROM roms as r,rompaths as p WHERE r.mdbid=" + j + " AND r.present=1 AND p._id=r.pathid", null);
                if (rawQuery2.moveToFirst()) {
                    boolean z = false;
                    do {
                        String string = rawQuery2.getString(0);
                        C2399i2 i2Var = new C2399i2(C2399i2.m10374d(this.f9623f, rawQuery2.isNull(2) ? rawQuery2.getString(1) : rawQuery2.getString(2)), string);
                        String absolutePath = i2Var.getAbsolutePath();
                        if (C2363g4.m10276c(absolutePath) && i2Var.exists()) {
                            C2363g4 g4Var = new C2363g4(this.f9623f, absolutePath);
                            while (true) {
                                C2363g4.C2364a d = g4Var.mo8020d();
                                if (d == null || z) {
                                    break;
                                }
                                Cursor rawQuery3 = sQLiteDatabase.rawQuery("SELECT rowid FROM mess WHERE rowid=" + d.f8294c + " AND slug='" + this.f9627j + "'", null);
                                if (rawQuery3.moveToFirst()) {
                                    String str2 = this.f9627j;
                                    if (string.lastIndexOf(46) > 0) {
                                        str2 = str2 + string.substring(string.lastIndexOf(46));
                                    }
                                    String absolutePath2 = new C2399i2(C2399i2.m10374d(this.f9623f, this.f9625h), str2).getAbsolutePath();
                                    if (!absolutePath.equalsIgnoreCase(absolutePath2)) {
                                        C2185a4.m9672b(this.f9623f, absolutePath, absolutePath2);
                                        z = true;
                                    }
                                }
                                rawQuery3.close();
                            }
                        }
                        if (!rawQuery2.moveToNext()) {
                            break;
                        }
                    } while (!z);
                }
                rawQuery2.close();
            } while (rawQuery.moveToNext());
        }
        rawQuery.close();
    }

    /* renamed from: e */
    public int mo9439e(String str, String str2) {
        C2886z1 b = C2886z1.m11967b(this.f9623f);
        b.mo9516c();
        SQLiteDatabase a = b.mo9515a();
        String g = C2185a4.m9677g(str2);
        if (g == null) {
            return 1;
        }
        String str3 = null;
        Cursor rawQuery = a.rawQuery("SELECT slug,name FROM chuds WHERE sha1=x'" + g + "'", null);
        if (!rawQuery.moveToFirst()) {
            rawQuery.close();
            return 1;
        }
        String string = rawQuery.getString(0);
        String string2 = rawQuery.getString(1);
        rawQuery.close();
        File file = new File(str2);
        if (file.getName().toLowerCase().equals(string2.toLowerCase() + ".chd")) {
            File parentFile = file.getParentFile();
            if (parentFile.getName().toLowerCase().equals(string)) {
                File parentFile2 = parentFile.getParentFile();
                if (parentFile2.getName().toLowerCase().equals(this.f9627j)) {
                    String str4 = parentFile2.getAbsolutePath() + "/" + string + ".zip";
                    File file2 = new File(str4);
                    if (!file2.exists()) {
                        try {
                            file2.createNewFile();
                        } catch (Exception unused) {
                        }
                    }
                    if (file2.exists()) {
                        this.f9625h = parentFile2.getAbsolutePath();
                        str3 = str4;
                    }
                }
            }
        }
        if (str3 == null) {
            File file3 = new File(this.f9625h + "/" + string);
            if (!file3.exists()) {
                try {
                    file3.mkdirs();
                } catch (Exception unused2) {
                }
            }
            if (!file3.exists()) {
                return 0;
            }
            str3 = this.f9625h + "/" + string + ".zip";
            File file4 = new File(str3);
            if (!file4.exists()) {
                try {
                    file4.createNewFile();
                } catch (Exception unused3) {
                }
            }
            if (!file4.exists()) {
                return 0;
            }
        }
        mo9438d(str, a);
        this.f9629l = str3;
        this.f9630m = this.f9625h + "/" + string + "/" + string2 + ".chd";
        return new File(this.f9630m).exists() ? 2 : 3;
    }

    /* renamed from: f */
    public int mo9440f(String str, String str2) {
        String str3;
        C2363g4 g4Var;
        C2886z1 b = C2886z1.m11967b(this.f9623f);
        b.mo9516c();
        SQLiteDatabase a = b.mo9515a();
        String str4 = null;
        if (C2363g4.m10276c(str2)) {
            try {
                g4Var = new C2363g4(this.f9623f, str2);
                str3 = null;
                while (true) {
                    try {
                        C2363g4.C2364a d = g4Var.mo8020d();
                        if (d == null || str3 != null) {
                            g4Var.mo8019a();
                        } else {
                            Cursor rawQuery = a.rawQuery("SELECT slug FROM mess WHERE rowid=" + d.f8294c, null);
                            if (rawQuery.moveToFirst()) {
                                str3 = rawQuery.getString(0);
                            }
                            rawQuery.close();
                        }
                    } catch (Exception unused) {
                    }
                }
                g4Var.mo8019a();
            } catch (Exception unused2) {
                g4Var = null;
                str3 = null;
            }
            if (str3 != null) {
                str4 = str3 + "." + g4Var.mo8521b();
            }
        }
        if (str4 == null) {
            return 1;
        }
        new File(str2);
        String str5 = this.f9625h + "/" + str4;
        mo9438d(str, a);
        this.f9629l = str5;
        this.f9630m = str5;
        return new File(str5).exists() ? 2 : 3;
    }

    /* renamed from: g */
    public boolean mo9441g(String str) {
        String str2;
        if (Build.VERSION.SDK_INT < 30) {
            str2 = new C2882y2(this.f9623f).mo8772i("system_directory");
        } else {
            str2 = new C2399i2(C2399i2.m10374d(this.f9623f, C2219c3.m9805k(this.f9623f).mo8193q("retroarch_dir", null)), "system").getAbsolutePath();
        }
        if (str2.equals("")) {
            return false;
        }
        this.f9624g = new C2399i2(C2399i2.m10374d(this.f9623f, str2), this.f9624g).getAbsolutePath();
        String absolutePath = new C2399i2(C2399i2.m10374d(this.f9623f, this.f9624g), "hash").getAbsolutePath();
        C2399i2 d = C2399i2.m10374d(this.f9623f, absolutePath);
        if (!d.exists()) {
            try {
                d.mkdirs();
            } catch (Exception unused) {
                return false;
            }
        }
        if (!mo9437c(absolutePath, this.f9626i)) {
            return false;
        }
        if (str.equals("apple2") && (!mo9437c(absolutePath, "apple2_cass.xml") || !mo9437c(absolutePath, "apple2_flop_clcracked.xml") || !mo9437c(absolutePath, "apple2_flop_misc.xml") || !mo9437c(absolutePath, "apple2_flop_orig.xml"))) {
            return false;
        }
        C2399i2 d2 = C2399i2.m10374d(this.f9623f, this.f9624g);
        C2399i2 i2Var = new C2399i2(d2, "/roms/" + this.f9627j);
        if (!i2Var.exists()) {
            try {
                i2Var.mkdirs();
            } catch (Exception unused2) {
                return false;
            }
        }
        this.f9625h = i2Var.getAbsolutePath();
        return true;
    }
}
