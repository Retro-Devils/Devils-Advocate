package com.digdroid.alman.dig;

/* access modifiers changed from: package-private */
/* renamed from: com.digdroid.alman.dig.p */
public abstract class AbstractC2526p {

    /* renamed from: a */
    int f8778a = 0;

    /* renamed from: b */
    int f8779b = 5;

    /* renamed from: c */
    int f8780c = 600000;

    /* renamed from: d */
    long f8781d = 0;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8881a() {
        synchronized (this) {
            if (!mo8883e()) {
                this.f8778a++;
            }
            if (this.f8778a == this.f8779b) {
                this.f8778a = 0;
                this.f8781d = System.currentTimeMillis();
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
            z = System.currentTimeMillis() - this.f8781d < ((long) this.f8780c);
        }
        return z;
    }
}
