package com.digdroid.alman.dig;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Build;
import java.io.File;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
/* renamed from: com.digdroid.alman.dig.h2 */
public class C2372h2 {

    /* renamed from: a */
    static File f8326a;

    /* renamed from: b */
    static File f8327b;

    /* renamed from: com.digdroid.alman.dig.h2$a */
    static class AsyncTaskC2373a extends AsyncTask<Void, Void, String[]> {

        /* renamed from: a */
        Context f8328a;

        /* renamed from: b */
        AbstractC2374b f8329b;

        public AsyncTaskC2373a(Context context, AbstractC2374b bVar) {
            this.f8328a = context;
            this.f8329b = bVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String[] doInBackground(Void... voidArr) {
            return C2372h2.m10300d(this.f8328a);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String[] strArr) {
            this.f8329b.mo8540a(strArr);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.h2$b */
    public interface AbstractC2374b {
        /* renamed from: a */
        void mo8540a(String[] strArr);
    }

    /* renamed from: a */
    static synchronized boolean m10297a(Context context, String str) {
        synchronized (C2372h2.class) {
            File file = f8326a;
            if (file != null) {
                if (str != null) {
                    if (file.getAbsolutePath().equals(str)) {
                        return true;
                    }
                    if (f8327b == null) {
                        String str2 = "Android/data/" + context.getPackageName() + "/files";
                        int length = str.length() - str2.length();
                        if (length > 0 && str.substring(length).equals(str2)) {
                            f8327b = new File(str);
                        }
                    }
                    return false;
                }
            }
            return false;
        }
    }

    /* renamed from: b */
    static synchronized File[] m10298b(Context context) {
        synchronized (C2372h2.class) {
            File file = null;
            if (context == null) {
                return null;
            }
            if (f8326a == null) {
                File externalFilesDir = context.getExternalFilesDir(null);
                f8326a = externalFilesDir;
                if (externalFilesDir == null) {
                    return null;
                }
            }
            if (f8327b == null && Build.VERSION.SDK_INT >= 19) {
                try {
                    File[] externalFilesDirs = context.getExternalFilesDirs(null);
                    if (externalFilesDirs != null) {
                        for (int i = 1; i < externalFilesDirs.length && f8327b == null; i++) {
                            if (externalFilesDirs[i] != null && externalFilesDirs[i].exists()) {
                                f8327b = externalFilesDirs[i];
                            }
                        }
                    }
                } catch (Exception unused) {
                }
            }
            if (f8327b == null) {
                C2219c3 k = C2219c3.m9805k(context);
                int l = k.mo8188l("num_storage_dirs", 0);
                int i2 = 0;
                while (true) {
                    if (i2 >= l) {
                        break;
                    }
                    String q = k.mo8193q("storage_dir" + i2, "");
                    if (!q.equals("")) {
                        File file2 = new File(q + "/Android/data/" + context.getPackageName() + "/files");
                        if (file2.exists()) {
                            f8327b = file2;
                            break;
                        }
                    }
                    i2++;
                }
            }
            File file3 = f8327b;
            File[] fileArr = new File[(file3 == null ? 1 : 2)];
            fileArr[0] = f8326a;
            if (file3 != null) {
                if (file3.exists()) {
                    file = f8327b;
                }
                fileArr[1] = file;
            }
            return fileArr;
        }
    }

    /* renamed from: c */
    static synchronized File m10299c(Context context) {
        File file;
        synchronized (C2372h2.class) {
            if (f8326a == null) {
                f8326a = context.getExternalFilesDir(null);
            }
            file = f8326a;
        }
        return file;
    }

    /* renamed from: d */
    static synchronized String[] m10300d(Context context) {
        File[] b;
        synchronized (C2372h2.class) {
            if (context == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            if (Build.VERSION.SDK_INT >= 19) {
                try {
                    File[] externalFilesDirs = context.getExternalFilesDirs(null);
                    if (externalFilesDirs != null) {
                        for (int i = 0; i < externalFilesDirs.length; i++) {
                            if (externalFilesDirs[i] != null) {
                                arrayList.add(externalFilesDirs[i].getAbsolutePath().replaceAll("\\/Android\\/data.*", ""));
                            }
                        }
                    }
                } catch (Exception unused) {
                }
            }
            if (arrayList.size() == 0 && (b = m10298b(context)) != null) {
                for (int i2 = 0; i2 < b.length; i2++) {
                    if (b[i2] != null) {
                        arrayList.add(b[i2].getAbsolutePath().replaceAll("\\/Android\\/data.*", ""));
                    }
                }
            }
            C2219c3 k = C2219c3.m9805k(context);
            int l = k.mo8188l("num_storage_dirs", 0);
            for (int i3 = 0; i3 < l; i3++) {
                String q = k.mo8193q("storage_dir" + i3, "");
                if (!q.equals("") && !arrayList.contains(q)) {
                    arrayList.add(q);
                }
            }
            String[] strArr = new String[arrayList.size()];
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                strArr[i4] = (String) arrayList.get(i4);
            }
            return strArr;
        }
    }

    /* renamed from: e */
    static synchronized void m10301e(Context context, AbstractC2374b bVar) {
        synchronized (C2372h2.class) {
            new AsyncTaskC2373a(context, bVar).execute(new Void[0]);
        }
    }
}
