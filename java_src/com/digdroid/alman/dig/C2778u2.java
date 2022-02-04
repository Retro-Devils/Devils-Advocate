package com.digdroid.alman.dig;

import android.content.Context;
import android.database.Cursor;
import android.os.AsyncTask;
import androidx.appcompat.app.DialogInterfaceC0068b;
import java.io.File;
import java.io.FilenameFilter;

/* renamed from: com.digdroid.alman.dig.u2 */
public class C2778u2 {

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.u2$a */
    public class C2779a implements FilenameFilter {

        /* renamed from: a */
        final /* synthetic */ String f9435a;

        C2779a(String str) {
            this.f9435a = str;
        }

        public boolean accept(File file, String str) {
            int lastIndexOf;
            if (file.canRead() && (lastIndexOf = str.lastIndexOf(46)) >= 2) {
                return str.substring(0, lastIndexOf).equalsIgnoreCase(this.f9435a);
            }
            return false;
        }
    }

    /* renamed from: com.digdroid.alman.dig.u2$b */
    public interface AbstractC2780b {
        /* renamed from: a */
        void mo8076a(String str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.u2$c */
    public static class AsyncTaskC2781c extends AsyncTask<Void, Void, String> {

        /* renamed from: a */
        ActivityC2888z3 f9436a;

        /* renamed from: b */
        C2375h3 f9437b;

        /* renamed from: c */
        Cursor f9438c;

        /* renamed from: d */
        boolean f9439d;

        /* renamed from: e */
        AbstractC2780b f9440e;

        /* renamed from: f */
        String f9441f;

        public AsyncTaskC2781c(ActivityC2888z3 z3Var, C2375h3 h3Var, Cursor cursor, boolean z, AbstractC2780b bVar) {
            this.f9436a = z3Var;
            this.f9437b = h3Var;
            this.f9438c = cursor;
            this.f9439d = z;
            this.f9440e = bVar;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x0104 A[SYNTHETIC, Splitter:B:39:0x0104] */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x010a A[SYNTHETIC, Splitter:B:45:0x010a] */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x0114 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x011f A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x0120  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String doInBackground(java.lang.Void... r12) {
            /*
            // Method dump skipped, instructions count: 305
            */
            throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.C2778u2.AsyncTaskC2781c.doInBackground(java.lang.Void[]):java.lang.String");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            String str2;
            if (str == null || !str.equals("")) {
                this.f9440e.mo8076a(str);
                return;
            }
            String string = this.f9436a.getString(R.string.playlist_error);
            this.f9441f = this.f9441f.toLowerCase();
            File[] b = C2372h2.m10298b(this.f9436a);
            if (b != null && b.length > 0) {
                int length = b.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    str2 = b[i].getAbsolutePath().replaceAll("/Android/data.*", "");
                    if (this.f9441f.length() > str2.length() && this.f9441f.substring(0, str2.length()).equals(str2.toLowerCase())) {
                        break;
                    }
                    i++;
                }
            }
            str2 = null;
            if (str2 != null) {
                File file = new File(str2 + "/NVIDIA_SHIELD");
                if (file.exists()) {
                    string = string + " " + this.f9436a.getString(R.string.move_games_1) + " " + file.getAbsolutePath() + "\n\n" + this.f9436a.getString(R.string.move_games_2);
                }
            }
            new DialogInterfaceC0068b.C0069a(this.f9436a, C2553q3.m11117c()).mo229i(string).mo235o(R.string.ok, null).mo221a().show();
            this.f9440e.mo8076a(null);
        }
    }

    /* renamed from: a */
    static void m11736a(Context context, C2882y2 y2Var, String str, String str2, String str3, String str4) {
        File[] listFiles;
        String i = y2Var.mo8772i(str);
        if (!i.equals("")) {
            str2 = i.replaceAll("^.*RetroArch/", "");
        }
        C2399i2 i2Var = new C2399i2(C2399i2.m10374d(context, C2219c3.m9805k(context).mo8193q("retroarch_dir", "")), str2);
        if (i2Var.exists() && (listFiles = i2Var.listFiles(new C2779a(str3))) != null) {
            for (File file : listFiles) {
                String absolutePath = ((C2399i2) file).getAbsolutePath();
                String str5 = str2 + "/" + str4 + absolutePath.substring(absolutePath.lastIndexOf("."));
                if (!C2399i2.m10374d(context, str5).exists()) {
                    C2185a4.m9672b(context, absolutePath, str5);
                }
            }
        }
    }

    /* renamed from: b */
    static void m11737b(ActivityC2888z3 z3Var, C2375h3 h3Var, Cursor cursor, boolean z, AbstractC2780b bVar) {
        if (!z) {
            try {
                bVar.mo8076a(new C2399i2(C2399i2.m10374d(z3Var, h3Var.mo8570u(cursor.getInt(3))), cursor.getString(7)).getAbsolutePath());
            } catch (Exception unused) {
                bVar.mo8076a(null);
            }
        } else {
            new AsyncTaskC2781c(z3Var, h3Var, cursor, z, bVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0048 A[SYNTHETIC, Splitter:B:23:0x0048] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004f A[SYNTHETIC, Splitter:B:27:0x004f] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0057 A[SYNTHETIC, Splitter:B:34:0x0057] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x005e A[SYNTHETIC, Splitter:B:38:0x005e] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0064 A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0066 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m11738c(android.content.Context r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
        /*
        // Method dump skipped, instructions count: 104
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.C2778u2.m11738c(android.content.Context, java.lang.String, java.lang.String, java.lang.String):boolean");
    }
}
