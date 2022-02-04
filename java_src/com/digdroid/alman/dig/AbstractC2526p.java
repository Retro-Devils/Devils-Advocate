package com.digdroid.alman.dig;

/* access modifiers changed from: package-private */
/* renamed from: com.digdroid.alman.dig.p */
public abstract class AbstractC2526p {

    /* renamed from: a */
    int f8770a = 0;

    /* renamed from: b */
    int f8771b = 5;

    /* renamed from: c */
    int f8772c = 600000;

    /* renamed from: d */
    long f8773d = 0;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8881a() {
        synchronized (this) {
            if (!mo8883e()) {
                this.f8770a++;
            }
            if (this.f8770a == this.f8771b) {
                this.f8770a = 0;
                this.f8773d = System.currentTimeMillis();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo8091b(long j) {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract String mo8092c(int i, String str, long j, long j2, String str2);

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo8882d(int i) {
        return i == 8 ? "gif" : i == 2 ? "png" : "jpg";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo8883e() {
        boolean z;
        synchronized (this) {
            z = System.currentTimeMillis() - this.f8773d < ((long) this.f8772c);
        }
        return z;
    }
}
