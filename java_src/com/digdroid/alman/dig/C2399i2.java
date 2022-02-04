package com.digdroid.alman.dig;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.util.Log;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import p006b.p046j.p047a.AbstractC1056a;

/* access modifiers changed from: package-private */
/* renamed from: com.digdroid.alman.dig.i2 */
public class C2399i2 extends File {

    /* renamed from: b */
    private static HashMap<String, AbstractC1056a> f8376b = new HashMap<>();

    /* renamed from: c */
    private AbstractC1056a f8377c;

    /* renamed from: d */
    private boolean f8378d;

    /* renamed from: e */
    private boolean f8379e;

    /* renamed from: f */
    private String f8380f;

    /* renamed from: g */
    private int f8381g;

    /* renamed from: h */
    private Context f8382h;

    public C2399i2() {
        super("");
        this.f8378d = false;
        this.f8379e = false;
        this.f8380f = null;
        this.f8381g = 0;
    }

    public C2399i2(Context context, Uri uri) {
        super("");
        this.f8378d = false;
        this.f8379e = false;
        this.f8380f = null;
        this.f8381g = 0;
        this.f8382h = context;
        this.f8380f = uri.toString();
        m10384t(1);
    }

    public C2399i2(Context context, AbstractC1056a aVar) {
        super("");
        this.f8378d = false;
        this.f8379e = false;
        this.f8380f = null;
        this.f8381g = 0;
        this.f8382h = context;
        this.f8380f = aVar.mo5674k().toString();
        m10384t(1);
    }

    public C2399i2(Context context, String str) {
        super("");
        this.f8378d = false;
        this.f8379e = false;
        this.f8380f = null;
        this.f8381g = 0;
        this.f8382h = context;
        this.f8380f = str;
        m10384t(1);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2399i2(java.io.File r5, java.lang.String r6) {
        /*
        // Method dump skipped, instructions count: 163
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.C2399i2.<init>(java.io.File, java.lang.String):void");
    }

    public C2399i2(String str) {
        super(str);
        this.f8378d = false;
        this.f8379e = false;
        this.f8380f = null;
        this.f8381g = 0;
    }

    /* renamed from: a */
    private String m10371a(Context context, Uri uri, String str) {
        File file;
        Cursor query = context.getContentResolver().query(uri, new String[]{"_display_name", "_size"}, null, null, null);
        int columnIndex = query.getColumnIndex("_display_name");
        int columnIndex2 = query.getColumnIndex("_size");
        query.moveToFirst();
        String string = query.getString(columnIndex);
        Long.toString(query.getLong(columnIndex2));
        if (!str.equals("")) {
            File file2 = new File(context.getFilesDir() + "/" + str);
            if (!file2.exists()) {
                file2.mkdir();
            }
            file = new File(context.getFilesDir() + "/" + str + "/" + string);
        } else {
            file = new File(context.getFilesDir() + "/" + string);
        }
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = openInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
            }
            openInputStream.close();
            fileOutputStream.close();
        } catch (Exception e) {
            Log.e("Exception", e.getMessage());
        }
        return file.getPath();
    }

    /* renamed from: b */
    private boolean m10372b(String str) {
        return new File(str).exists();
    }

    /* renamed from: c */
    public static C2399i2 m10373c(File file) {
        if (file instanceof C2399i2) {
            C2399i2 i2Var = (C2399i2) file;
            if (i2Var.f8380f != null) {
                C2399i2 i2Var2 = new C2399i2();
                i2Var2.f8382h = i2Var.f8382h;
                i2Var2.f8377c = i2Var.f8377c;
                i2Var2.f8378d = i2Var.f8378d;
                i2Var2.f8379e = i2Var.f8379e;
                i2Var2.f8380f = i2Var.f8380f;
                return i2Var2;
            }
        }
        return new C2399i2(file.getAbsolutePath());
    }

    /* renamed from: d */
    public static C2399i2 m10374d(Context context, String str) {
        return str.contains("://") ? new C2399i2(context, str) : new C2399i2(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0035  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m10375e(android.content.Context r9, android.net.Uri r10, java.lang.String r11, java.lang.String[] r12) {
        /*
            r8 = this;
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]
            r0 = 0
            java.lang.String r7 = "_data"
            r3[r0] = r7
            r0 = 0
            android.content.ContentResolver r1 = r9.getContentResolver()     // Catch:{ all -> 0x0032 }
            r6 = 0
            r2 = r10
            r4 = r11
            r5 = r12
            android.database.Cursor r9 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0032 }
            if (r9 == 0) goto L_0x002c
            boolean r10 = r9.moveToFirst()     // Catch:{ all -> 0x0029 }
            if (r10 == 0) goto L_0x002c
            int r10 = r9.getColumnIndexOrThrow(r7)     // Catch:{ all -> 0x0029 }
            java.lang.String r10 = r9.getString(r10)     // Catch:{ all -> 0x0029 }
            r9.close()
            return r10
        L_0x0029:
            r10 = move-exception
            r0 = r9
            goto L_0x0033
        L_0x002c:
            if (r9 == 0) goto L_0x0031
            r9.close()
        L_0x0031:
            return r0
        L_0x0032:
            r10 = move-exception
        L_0x0033:
            if (r0 == 0) goto L_0x0038
            r0.close()
        L_0x0038:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.C2399i2.m10375e(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    /* renamed from: f */
    private String m10376f(Context context, Uri uri) {
        Cursor query = context.getContentResolver().query(uri, null, null, null, null);
        int columnIndex = query.getColumnIndex("_display_name");
        int columnIndex2 = query.getColumnIndex("_size");
        query.moveToFirst();
        String string = query.getString(columnIndex);
        Long.toString(query.getLong(columnIndex2));
        File file = new File(context.getCacheDir(), string);
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[Math.min(openInputStream.available(), 1048576)];
            while (true) {
                int read = openInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
            }
            Log.e("File Size", "Size " + file.length());
            openInputStream.close();
            fileOutputStream.close();
            Log.e("File Path", "Path " + file.getPath());
            Log.e("File Size", "Size " + file.length());
        } catch (Exception e) {
            Log.e("Exception", e.getMessage());
        }
        return file.getPath();
    }

    /* renamed from: h */
    private String m10377h(Context context, Uri uri) {
        return m10371a(context, uri, "whatsapp");
    }

    /* renamed from: l */
    private String m10378l(String[] strArr) {
        String str = strArr[0];
        String str2 = "/" + strArr[1];
        if ("primary".equalsIgnoreCase(str)) {
            String str3 = Environment.getExternalStorageDirectory() + str2;
            if (m10372b(str3)) {
                return str3;
            }
        }
        String str4 = System.getenv("SECONDARY_STORAGE") + str2;
        if (m10372b(str4)) {
            return str4;
        }
        String str5 = System.getenv("EXTERNAL_STORAGE") + str2;
        m10372b(str5);
        return str5;
    }

    /* renamed from: n */
    private boolean m10379n(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    /* renamed from: o */
    private boolean m10380o(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    /* renamed from: p */
    private boolean m10381p(Uri uri) {
        return "com.google.android.apps.docs.storage".equals(uri.getAuthority()) || "com.google.android.apps.docs.storage.legacy".equals(uri.getAuthority());
    }

    /* renamed from: q */
    private boolean m10382q(Uri uri) {
        return "com.google.android.apps.photos.content".equals(uri.getAuthority());
    }

    /* renamed from: r */
    private boolean m10383r(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    /* renamed from: t */
    private synchronized boolean m10384t(int i) {
        boolean z = true;
        if (i == 1) {
            int indexOf = this.f8380f.indexOf("/document/");
            if (indexOf < 0) {
                AbstractC1056a aVar = f8376b.get(this.f8380f);
                this.f8377c = aVar;
                if (aVar == null) {
                    this.f8377c = AbstractC1056a.m6014i(this.f8382h, Uri.parse(this.f8380f));
                }
                if (this.f8377c == null) {
                    z = false;
                }
                return m10385u(z);
            } else if (Build.VERSION.SDK_INT >= 21) {
                Uri parse = Uri.parse(this.f8380f.substring(0, indexOf));
                if (parse == null) {
                    return m10385u(false);
                }
                Uri buildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(parse, Uri.decode(this.f8380f.substring(indexOf + 10)));
                if (buildDocumentUriUsingTree == null) {
                    return m10385u(false);
                }
                AbstractC1056a h = AbstractC1056a.m6013h(this.f8382h, buildDocumentUriUsingTree);
                this.f8377c = h;
                if (h == null) {
                    return m10385u(false);
                }
                if (!h.mo5675l()) {
                    return m10385u(true);
                }
            }
        }
        String[] split = Uri.decode(this.f8380f).split(":");
        String[] split2 = split[split.length - 1].split("/");
        String str = split[0] + ":" + split[1] + "%3A";
        int i2 = 0;
        boolean z2 = false;
        while (true) {
            if (i2 >= split2.length) {
                break;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            int i3 = i2 + 1;
            sb.append(Uri.encode(split2[i2]));
            String sb2 = sb.toString();
            AbstractC1056a aVar2 = f8376b.get(sb2);
            this.f8377c = aVar2;
            if (aVar2 == null) {
                AbstractC1056a i4 = AbstractC1056a.m6014i(this.f8382h, Uri.parse(sb2));
                this.f8377c = i4;
                if (i4 != null && i4.mo5666a()) {
                    f8376b.put(sb2, this.f8377c);
                }
            }
            AbstractC1056a aVar3 = this.f8377c;
            if (aVar3 == null) {
                return m10385u(false);
            }
            z2 = aVar3.mo5666a();
            if (z2) {
                i2 = i3;
                str = sb2;
                break;
            }
            i2 = i3;
            str = sb2 + "%2F";
        }
        if (!z2) {
            return m10385u(false);
        }
        if (i2 == split2.length) {
            return m10385u(true);
        }
        while (i2 < split2.length) {
            str = str + "%2F" + Uri.encode(split2[i2]);
            AbstractC1056a aVar4 = f8376b.get(str);
            if (aVar4 == null && (aVar4 = this.f8377c.mo5672g(split2[i2])) != null && aVar4.mo5675l()) {
                f8376b.put(str, aVar4);
            }
            if ((i == 3 || i == 2) && aVar4 != null && !aVar4.mo5671f()) {
                aVar4 = null;
            }
            if (aVar4 == null) {
                if (i == 3 || (i == 2 && i2 < split2.length - 1)) {
                    aVar4 = this.f8377c.mo5668c(split2[i2]);
                    if (aVar4 != null) {
                        f8376b.put(str, aVar4);
                    }
                } else if (i == 2) {
                    aVar4 = this.f8377c.mo5669d("*/*", split2[i2]);
                }
            }
            if (aVar4 == null) {
                return m10385u(false);
            }
            this.f8377c = aVar4;
            i2++;
        }
        return m10385u(true);
    }

    /* renamed from: u */
    private boolean m10385u(boolean z) {
        this.f8379e = true;
        this.f8378d = z;
        this.f8381g = 0;
        return z;
    }

    public boolean canExecute() {
        if (this.f8380f == null) {
            return super.canExecute();
        }
        return true;
    }

    public boolean canRead() {
        return this.f8380f == null ? super.canRead() : this.f8378d && this.f8377c.mo5666a();
    }

    public boolean canWrite() {
        return this.f8380f == null ? super.canWrite() : this.f8378d && this.f8377c.mo5667b();
    }

    public synchronized boolean delete() {
        if (this.f8380f == null) {
            return super.delete();
        }
        boolean z = this.f8378d && this.f8377c.mo5670e();
        this.f8379e = false;
        return z;
    }

    public boolean exists() {
        return this.f8380f == null ? super.exists() : this.f8378d && this.f8377c.mo5671f();
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e6  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo8601g() {
        /*
        // Method dump skipped, instructions count: 503
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.C2399i2.mo8601g():java.lang.String");
    }

    public String getAbsolutePath() {
        String str = this.f8380f;
        return str == null ? super.getAbsolutePath() : str;
    }

    public String getName() {
        return this.f8380f == null ? super.getName() : this.f8378d ? this.f8377c.mo5673j() : "";
    }

    public String getPath() {
        String str = this.f8380f;
        return str == null ? super.getPath() : str;
    }

    /* renamed from: i */
    public InputStream mo8606i() {
        try {
            if (this.f8380f == null) {
                return new FileInputStream(this);
            }
            if (m10384t(1)) {
                return this.f8382h.getContentResolver().openInputStream(this.f8377c.mo5674k());
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean isDirectory() {
        return this.f8380f == null ? super.isDirectory() : this.f8378d && this.f8377c.mo5675l();
    }

    /* renamed from: j */
    public synchronized OutputStream mo8608j() {
        try {
            if (this.f8380f == null) {
                return new FileOutputStream(this);
            }
            if (m10384t(2)) {
                return this.f8382h.getContentResolver().openOutputStream(this.f8377c.mo5674k());
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: k */
    public C2399i2 getParentFile() {
        String str = this.f8380f;
        if (str == null) {
            return new C2399i2(getParent());
        }
        int lastIndexOf = str.lastIndexOf("%2F");
        if (lastIndexOf < 0) {
            lastIndexOf = this.f8380f.lastIndexOf("%2f");
        }
        if (lastIndexOf < 0) {
            return null;
        }
        return new C2399i2(this.f8382h, this.f8380f.substring(0, lastIndexOf));
    }

    public long lastModified() {
        if (this.f8380f == null) {
            return super.lastModified();
        }
        if (this.f8378d) {
            return this.f8377c.mo5676m();
        }
        return 0;
    }

    public long length() {
        if (this.f8380f == null) {
            return super.length();
        }
        if (this.f8378d) {
            return this.f8377c.mo5677n();
        }
        return 0;
    }

    public synchronized File[] listFiles() {
        if (this.f8380f == null) {
            return super.listFiles();
        } else if (!this.f8378d) {
            return null;
        } else {
            AbstractC1056a[] o = this.f8377c.mo5678o();
            if (o == null) {
                return null;
            }
            C2399i2[] i2VarArr = new C2399i2[o.length];
            for (int i = 0; i < o.length; i++) {
                i2VarArr[i] = new C2399i2(this.f8382h, o[i]);
            }
            return i2VarArr;
        }
    }

    @Override // java.io.File
    public synchronized File[] listFiles(FileFilter fileFilter) {
        if (this.f8380f == null) {
            return super.listFiles(fileFilter);
        } else if (!this.f8378d) {
            return null;
        } else {
            AbstractC1056a[] o = this.f8377c.mo5678o();
            if (o == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (AbstractC1056a aVar : o) {
                C2399i2 i2Var = new C2399i2(this.f8382h, aVar);
                if (fileFilter.accept(i2Var)) {
                    arrayList.add(i2Var);
                }
            }
            C2399i2[] i2VarArr = new C2399i2[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                i2VarArr[i] = (C2399i2) arrayList.get(i);
            }
            return i2VarArr;
        }
    }

    /* renamed from: m */
    public Uri mo8614m() {
        if (this.f8380f == null) {
            return Uri.fromFile(this);
        }
        if (this.f8378d) {
            return this.f8377c.mo5674k();
        }
        return null;
    }

    public synchronized boolean mkdirs() {
        if (this.f8380f == null) {
            return super.mkdirs();
        }
        return m10384t(3);
    }

    /* renamed from: s */
    public boolean mo8616s(Uri uri) {
        return "com.whatsapp.provider.media".equals(uri.getAuthority());
    }

    public String toString() {
        String str = this.f8380f;
        return str != null ? str : super.toString();
    }
}
