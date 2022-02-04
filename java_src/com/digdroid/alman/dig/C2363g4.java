package com.digdroid.alman.dig;

import android.content.Context;
import android.net.Uri;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import p155e.p156a.p157a.p158a.p159b.p160b.C3368k;
import p155e.p156a.p157a.p158a.p159b.p160b.C3369l;

/* renamed from: com.digdroid.alman.dig.g4 */
class C2363g4 {

    /* renamed from: a */
    static Pattern f8280a = Pattern.compile(".+\\.(zip|7z)$");

    /* renamed from: b */
    String f8281b;

    /* renamed from: c */
    String f8282c;

    /* renamed from: d */
    C3369l f8283d;

    /* renamed from: e */
    ZipFile f8284e;

    /* renamed from: f */
    Uri f8285f;

    /* renamed from: g */
    Enumeration<? extends ZipEntry> f8286g;

    /* renamed from: h */
    Context f8287h;

    /* renamed from: i */
    InputStream f8288i = null;

    /* renamed from: j */
    FileInputStream f8289j = null;

    /* renamed from: k */
    BufferedInputStream f8290k = null;

    /* renamed from: l */
    ZipInputStream f8291l = null;

    /* renamed from: com.digdroid.alman.dig.g4$a */
    class C2364a {

        /* renamed from: a */
        String f8292a;

        /* renamed from: b */
        long f8293b;

        /* renamed from: c */
        long f8294c;

        C2364a() {
        }
    }

    public C2363g4(Context context, String str) {
        this.f8287h = context;
        this.f8281b = str;
        this.f8283d = null;
        this.f8284e = null;
        this.f8285f = null;
        Matcher matcher = f8280a.matcher(str.toLowerCase());
        if (matcher.find()) {
            String group = matcher.group(1);
            this.f8282c = group;
            if (group.equals("zip")) {
                try {
                    if (str.contains("://")) {
                        C2399i2 d = C2399i2.m10374d(context, str);
                        if (d != null) {
                            this.f8285f = d.mo8614m();
                            mo8021f();
                            return;
                        }
                        return;
                    }
                    ZipFile zipFile = new ZipFile(str);
                    this.f8284e = zipFile;
                    this.f8286g = zipFile.entries();
                } catch (Exception unused) {
                    ZipFile zipFile2 = this.f8284e;
                    if (zipFile2 != null) {
                        try {
                            zipFile2.close();
                        } catch (Exception unused2) {
                        }
                        this.f8284e = null;
                    }
                }
            } else if (this.f8282c.equals("7z")) {
                try {
                    this.f8283d = new C3369l(new File(str));
                } catch (Exception unused3) {
                    C3369l lVar = this.f8283d;
                    if (lVar != null) {
                        try {
                            lVar.close();
                        } catch (Exception unused4) {
                        }
                    }
                    this.f8283d = null;
                }
            }
        }
    }

    /* renamed from: c */
    static synchronized boolean m10276c(String str) {
        synchronized (C2363g4.class) {
            Matcher matcher = f8280a.matcher(str.toLowerCase());
            if (!matcher.find()) {
                return false;
            }
            if (matcher.group(1).equals("7z")) {
                try {
                    new C3369l(new File(str)).close();
                } catch (Exception unused) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    public void mo8019a() {
        ZipInputStream zipInputStream = this.f8291l;
        if (zipInputStream != null) {
            try {
                zipInputStream.close();
            } catch (Exception unused) {
            }
        }
        BufferedInputStream bufferedInputStream = this.f8290k;
        if (bufferedInputStream != null) {
            try {
                bufferedInputStream.close();
            } catch (Exception unused2) {
            }
        }
        FileInputStream fileInputStream = this.f8289j;
        if (fileInputStream != null) {
            try {
                fileInputStream.close();
            } catch (Exception unused3) {
            }
        }
        ZipFile zipFile = this.f8284e;
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (Exception unused4) {
            }
        }
        C3369l lVar = this.f8283d;
        if (lVar != null) {
            try {
                lVar.close();
            } catch (Exception unused5) {
            }
        }
    }

    /* renamed from: b */
    public String mo8521b() {
        return this.f8282c;
    }

    /* renamed from: d */
    public C2364a mo8020d() {
        ZipEntry zipEntry;
        if (this.f8284e == null && this.f8285f == null) {
            C3369l lVar = this.f8283d;
            if (lVar != null) {
                try {
                    C3368k e = lVar.mo11342e();
                    if (e == null) {
                        return null;
                    }
                    C2364a aVar = new C2364a();
                    aVar.f8292a = e.mo11323i();
                    aVar.f8293b = e.mo11292b();
                    if (e.mo11319e()) {
                        aVar.f8294c = e.mo11317c();
                    } else {
                        aVar.f8294c = 0;
                    }
                    return aVar;
                } catch (Exception unused) {
                }
            }
            return null;
        }
        try {
            ZipInputStream zipInputStream = this.f8291l;
            if (zipInputStream != null) {
                zipEntry = zipInputStream.getNextEntry();
            } else {
                Enumeration<? extends ZipEntry> enumeration = this.f8286g;
                zipEntry = (enumeration == null || !enumeration.hasMoreElements()) ? null : (ZipEntry) this.f8286g.nextElement();
            }
            if (zipEntry == null) {
                return null;
            }
            C2364a aVar2 = new C2364a();
            aVar2.f8292a = zipEntry.getName();
            aVar2.f8293b = zipEntry.getSize();
            aVar2.f8294c = zipEntry.getCrc();
            return aVar2;
        } catch (Exception unused2) {
            return null;
        }
    }

    /* renamed from: e */
    public ZipEntry mo8522e() {
        if (this.f8284e == null) {
            return null;
        }
        try {
            Enumeration<? extends ZipEntry> enumeration = this.f8286g;
            if (enumeration == null || !enumeration.hasMoreElements()) {
                return null;
            }
            return (ZipEntry) this.f8286g.nextElement();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: f */
    public void mo8021f() {
        if (this.f8284e != null) {
            try {
                this.f8289j = new FileInputStream(new File(this.f8281b));
                this.f8290k = new BufferedInputStream(this.f8289j);
                this.f8291l = new ZipInputStream(this.f8290k);
            } catch (Exception unused) {
                ZipInputStream zipInputStream = this.f8291l;
                if (zipInputStream != null) {
                    try {
                        zipInputStream.close();
                    } catch (Exception unused2) {
                    }
                }
                BufferedInputStream bufferedInputStream = this.f8290k;
                if (bufferedInputStream != null) {
                    try {
                        bufferedInputStream.close();
                    } catch (Exception unused3) {
                    }
                }
                FileInputStream fileInputStream = this.f8289j;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (Exception unused4) {
                    }
                }
                this.f8291l = null;
                this.f8290k = null;
                this.f8289j = null;
            }
        }
        if (this.f8285f != null) {
            try {
                this.f8288i = this.f8287h.getContentResolver().openInputStream(this.f8285f);
                this.f8290k = new BufferedInputStream(this.f8288i);
                this.f8291l = new ZipInputStream(this.f8290k);
            } catch (Exception unused5) {
                ZipInputStream zipInputStream2 = this.f8291l;
                if (zipInputStream2 != null) {
                    try {
                        zipInputStream2.close();
                    } catch (Exception unused6) {
                    }
                }
                BufferedInputStream bufferedInputStream2 = this.f8290k;
                if (bufferedInputStream2 != null) {
                    try {
                        bufferedInputStream2.close();
                    } catch (Exception unused7) {
                    }
                }
                InputStream inputStream = this.f8288i;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Exception unused8) {
                    }
                }
                this.f8291l = null;
                this.f8290k = null;
                this.f8288i = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo8022g(byte[] bArr) {
        ZipInputStream zipInputStream = this.f8291l;
        if (zipInputStream != null) {
            try {
                return zipInputStream.read(bArr);
            } catch (Exception unused) {
                return -1;
            }
        } else {
            C3369l lVar = this.f8283d;
            if (lVar != null) {
                try {
                    return lVar.mo11343f(bArr);
                } catch (Exception unused2) {
                }
            }
            return -1;
        }
    }
}
