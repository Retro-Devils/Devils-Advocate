package com.digdroid.alman.dig;

import android.content.Context;
import com.digdroid.alman.dig.C2363g4;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

/* renamed from: com.digdroid.alman.dig.a */
class C2164a extends C2363g4 {

    /* renamed from: m */
    boolean f7803m;

    /* renamed from: n */
    String f7804n;

    /* renamed from: o */
    C2363g4.C2364a f7805o;

    /* renamed from: p */
    FileInputStream f7806p = null;

    /* renamed from: q */
    BufferedInputStream f7807q = null;

    public C2164a(Context context, String str, String str2) {
        super(context, str);
        boolean z = (this.f8284e == null && this.f8285f == null && this.f8283d == null) ? false : true;
        this.f7803m = z;
        if (str2 != null && z) {
            super.mo8019a();
            this.f7803m = false;
        }
        if (!this.f7803m) {
            this.f7804n = str;
            File file = new File(str);
            C2363g4.C2364a aVar = new C2363g4.C2364a();
            this.f7805o = aVar;
            aVar.f8292a = str2;
            aVar.f8293b = file.length();
            this.f7805o.f8294c = 0;
        }
    }

    @Override // com.digdroid.alman.dig.C2363g4
    /* renamed from: a */
    public void mo8019a() {
        if (this.f7803m) {
            super.mo8019a();
            return;
        }
        BufferedInputStream bufferedInputStream = this.f7807q;
        if (bufferedInputStream != null) {
            try {
                bufferedInputStream.close();
            } catch (Exception unused) {
            }
        }
        FileInputStream fileInputStream = this.f7806p;
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
        if (this.f7803m) {
            return super.mo8020d();
        }
        C2363g4.C2364a aVar = this.f7805o;
        this.f7805o = null;
        return aVar;
    }

    @Override // com.digdroid.alman.dig.C2363g4
    /* renamed from: f */
    public void mo8021f() {
        if (this.f8284e == null && this.f8285f == null && this.f8283d == null) {
            try {
                this.f7806p = new FileInputStream(new File(this.f7804n));
                this.f7807q = new BufferedInputStream(this.f7806p);
            } catch (Exception unused) {
                BufferedInputStream bufferedInputStream = this.f7807q;
                if (bufferedInputStream != null) {
                    try {
                        bufferedInputStream.close();
                    } catch (Exception unused2) {
                    }
                }
                FileInputStream fileInputStream = this.f7806p;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (Exception unused3) {
                    }
                }
                this.f7807q = null;
                this.f7806p = null;
            }
        } else {
            super.mo8021f();
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.C2363g4
    /* renamed from: g */
    public int mo8022g(byte[] bArr) {
        if (this.f7803m) {
            return super.mo8022g(bArr);
        }
        BufferedInputStream bufferedInputStream = this.f7807q;
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
        return this.f7803m ? R.string.extracting : R.string.copying;
    }
}
