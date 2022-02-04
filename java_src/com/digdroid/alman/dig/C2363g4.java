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
    static Pattern f8272a = Pattern.compile(".+\\.(zip|7z)$");

    /* renamed from: b */
    String f8273b;

    /* renamed from: c */
    String f8274c;

    /* renamed from: d */
    C3369l f8275d;

    /* renamed from: e */
    ZipFile f8276e;

    /* renamed from: f */
    Uri f8277f;

    /* renamed from: g */
    Enumeration<? extends ZipEntry> f8278g;

    /* renamed from: h */
    Context f8279h;

    /* renamed from: i */
    InputStream f8280i = null;

    /* renamed from: j */
    FileInputStream f8281j = null;

    /* renamed from: k */
    BufferedInputStream f8282k = null;

    /* renamed from: l */
    ZipInputStream f8283l = null;

    /* renamed from: com.digdroid.alman.dig.g4$a */
    class C2364a {

        /* renamed from: a */
        String f8284a;

        /* renamed from: b */
        long f8285b;

        /* renamed from: c */
        long f8286c;

        C2364a() {
        }
    }

    public C2363g4(Context context, String str) {
        this.f8279h = context;
        this.f8273b = str;
        this.f8275d = null;
        this.f8276e = null;
        this.f8277f = null;
        Matcher matcher = f8272a.matcher(str.toLowerCase());
        if (matcher.find()) {
            String group = matcher.group(1);
            this.f8274c = group;
            if (group.equals("zip")) {
                try {
                    if (str.contains("://")) {
                        C2399i2 d = C2399i2.m10374d(context, str);
                        if (d != null) {
                            this.f8277f = d.mo8614m();
                            mo8021f();
                            return;
                        }
                        return;
                    }
                    ZipFile zipFile = new ZipFile(str);
                    this.f8276e = zipFile;
                    this.f8278g = zipFile.entries();
                } catch (Exception unused) {
                    ZipFile zipFile2 = this.f8276e;
                    if (zipFile2 != null) {
                        try {
                            zipFile2.close();
                        } catch (Exception unused2) {
                        }
                        this.f8276e = null;
                    }
                }
            } else if (this.f8274c.equals("7z")) {
                try {
                    this.f8275d = new C3369l(new File(str));
                } catch (Exception unused3) {
                    C3369l lVar = this.f8275d;
                    if (lVar != null) {
                        try {
                            lVar.close();
                        } catch (Exception unused4) {
                        }
                    }
                    this.f8275d = null;
                }
            }
        }
    }

    /* renamed from: c */
    static synchronized boolean m10276c(String str) {
        synchronized (C2363g4.class) {
            Matcher matcher = f8272a.matcher(str.toLowerCase());
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
        ZipInputStream zipInputStream = this.f8283l;
        if (zipInputStream != null) {
            try {
                zipInputStream.close();
            } catch (Exception unused) {
            }
        }
        BufferedInputStream bufferedInputStream = this.f8282k;
        if (bufferedInputStream != null) {
            try {
                bufferedInputStream.close();
            } catch (Exception unused2) {
            }
        }
        FileInputStream fileInputStream = this.f8281j;
        if (fileInputStream != null) {
            try {
                fileInputStream.close();
            } catch (Exception unused3) {
            }
        }
        ZipFile zipFile = this.f8276e;
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (Exception unused4) {
            }
        }
        C3369l lVar = this.f8275d;
        if (lVar != null) {
            try {
                lVar.close();
            } catch (Exception unused5) {
            }
        }
    }

    /* renamed from: b */
    public String mo8521b() {
        return this.f8274c;
    }

    /* renamed from: d */
    public C2364a mo8020d() {
        ZipEntry zipEntry;
        if (this.f8276e == null && this.f8277f == null) {
            C3369l lVar = this.f8275d;
            if (lVar != null) {
                try {
                    C3368k e = lVar.mo11342e();
                    if (e == null) {
                        return null;
                    }
                    C2364a aVar = new C2364a();
                    aVar.f8284a = e.mo11323i();
                    aVar.f8285b = e.mo11292b();
                    if (e.mo11319e()) {
                        aVar.f8286c = e.mo11317c();
                    } else {
                        aVar.f8286c = 0;
                    }
                    return aVar;
                } catch (Exception unused) {
                }
            }
            return null;
        }
        try {
            ZipInputStream zipInputStream = this.f8283l;
            if (zipInputStream != null) {
                zipEntry = zipInputStream.getNextEntry();
            } else {
                Enumeration<? extends ZipEntry> enumeration = this.f8278g;
                zipEntry = (enumeration == null || !enumeration.hasMoreElements()) ? null : (ZipEntry) this.f8278g.nextElement();
            }
            if (zipEntry == null) {
                return null;
            }
            C2364a aVar2 = new C2364a();
            aVar2.f8284a = zipEntry.getName();
            aVar2.f8285b = zipEntry.getSize();
            aVar2.f8286c = zipEntry.getCrc();
            return aVar2;
        } catch (Exception unused2) {
            return null;
        }
    }

    /* renamed from: e */
    public ZipEntry mo8522e() {
        if (this.f8276e == null) {
            return null;
        }
        try {
            Enumeration<? extends ZipEntry> enumeration = this.f8278g;
            if (enumeration == null || !enumeration.hasMoreElements()) {
                return null;
            }
            return (ZipEntry) this.f8278g.nextElement();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: f */
    public void mo8021f() {
        if (this.f8276e != null) {
            try {
                this.f8281j = new FileInputStream(new File(this.f8273b));
                this.f8282k = new BufferedInputStream(this.f8281j);
                this.f8283l = new ZipInputStream(this.f8282k);
            } catch (Exception unused) {
                ZipInputStream zipInputStream = this.f8283l;
                if (zipInputStream != null) {
                    try {
                        zipInputStream.close();
                    } catch (Exception unused2) {
                    }
                }
                BufferedInputStream bufferedInputStream = this.f8282k;
                if (bufferedInputStream != null) {
                    try {
                        bufferedInputStream.close();
                    } catch (Exception unused3) {
                    }
                }
                FileInputStream fileInputStream = this.f8281j;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (Exception unused4) {
                    }
                }
                this.f8283l = null;
                this.f8282k = null;
                this.f8281j = null;
            }
        }
        if (this.f8277f != null) {
            try {
                this.f8280i = this.f8279h.getContentResolver().openInputStream(this.f8277f);
                this.f8282k = new BufferedInputStream(this.f8280i);
                this.f8283l = new ZipInputStream(this.f8282k);
            } catch (Exception unused5) {
                ZipInputStream zipInputStream2 = this.f8283l;
                if (zipInputStream2 != null) {
                    try {
                        zipInputStream2.close();
                    } catch (Exception unused6) {
                    }
                }
                BufferedInputStream bufferedInputStream2 = this.f8282k;
                if (bufferedInputStream2 != null) {
                    try {
                        bufferedInputStream2.close();
                    } catch (Exception unused7) {
                    }
                }
                InputStream inputStream = this.f8280i;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Exception unused8) {
                    }
                }
                this.f8283l = null;
                this.f8282k = null;
                this.f8280i = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo8022g(byte[] bArr) {
        ZipInputStream zipInputStream = this.f8283l;
        if (zipInputStream != null) {
            try {
                return zipInputStream.read(bArr);
            } catch (Exception unused) {
                return -1;
            }
        } else {
            C3369l lVar = this.f8275d;
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
