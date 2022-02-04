package com.digdroid.alman.dig;

import android.content.Context;
import com.digdroid.alman.dig.C2363g4;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

/* renamed from: com.digdroid.alman.dig.a */
class C2164a extends C2363g4 {

    /* renamed from: m */
    boolean f7795m;

    /* renamed from: n */
    String f7796n;

    /* renamed from: o */
    C2363g4.C2364a f7797o;

    /* renamed from: p */
    FileInputStream f7798p = null;

    /* renamed from: q */
    BufferedInputStream f7799q = null;

    public C2164a(Context context, String str, String str2) {
        super(context, str);
        boolean z = (this.f8276e == null && this.f8277f == null && this.f8275d == null) ? false : true;
        this.f7795m = z;
        if (str2 != null && z) {
            super.mo8019a();
            this.f7795m = false;
        }
        if (!this.f7795m) {
            this.f7796n = str;
            File file = new File(str);
            C2363g4.C2364a aVar = new C2363g4.C2364a();
            this.f7797o = aVar;
            aVar.f8284a = str2;
            aVar.f8285b = file.length();
            this.f7797o.f8286c = 0;
        }
    }

    @Override // com.digdroid.alman.dig.C2363g4
    /* renamed from: a */
    public void mo8019a() {
        if (this.f7795m) {
            super.mo8019a();
            return;
        }
        BufferedInputStream bufferedInputStream = this.f7799q;
        if (bufferedInputStream != null) {
            try {
                bufferedInputStream.close();
            } catch (Exception unused) {
            }
        }
        FileInputStream fileInputStream = this.f7798p;
        if (fileInputStream != null) {
            try {
                fileInputStream.close();
            } catch (Exception unused2) {
            }
        }
    }

    @Override // com.digdroid.alman.dig.C2363g4
    /* renamed from: d */
    public C2363g4.C2364a mo8020d() {
        if (this.f7795m) {
            return super.mo8020d();
        }
        C2363g4.C2364a aVar = this.f7797o;
        this.f7797o = null;
        return aVar;
    }

    @Override // com.digdroid.alman.dig.C2363g4
    /* renamed from: f */
    public void mo8021f() {
        if (this.f8276e == null && this.f8277f == null && this.f8275d == null) {
            try {
                this.f7798p = new FileInputStream(new File(this.f7796n));
                this.f7799q = new BufferedInputStream(this.f7798p);
            } catch (Exception unused) {
                BufferedInputStream bufferedInputStream = this.f7799q;
                if (bufferedInputStream != null) {
                    try {
                        bufferedInputStream.close();
                    } catch (Exception unused2) {
                    }
                }
                FileInputStream fileInputStream = this.f7798p;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (Exception unused3) {
                    }
                }
                this.f7799q = null;
                this.f7798p = null;
            }
        } else {
            super.mo8021f();
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.C2363g4
    /* renamed from: g */
    public int mo8022g(byte[] bArr) {
        if (this.f7795m) {
            return super.mo8022g(bArr);
        }
        BufferedInputStream bufferedInputStream = this.f7799q;
        if (bufferedInputStream != null) {
            try {
                return bufferedInputStream.read(bArr);
            } catch (Exception unused) {
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo8023h() {
        return this.f7795m ? R.string.extracting : R.string.copying;
    }
}
