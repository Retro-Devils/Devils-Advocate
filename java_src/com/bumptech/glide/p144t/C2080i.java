package com.bumptech.glide.p144t;

/* renamed from: com.bumptech.glide.t.i */
public class C2080i {

    /* renamed from: a */
    private Class<?> f7604a;

    /* renamed from: b */
    private Class<?> f7605b;

    /* renamed from: c */
    private Class<?> f7606c;

    public C2080i() {
    }

    public C2080i(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        mo7867a(cls, cls2, cls3);
    }

    /* renamed from: a */
    public void mo7867a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.f7604a = cls;
        this.f7605b = cls2;
        this.f7606c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2080i.class != obj.getClass()) {
            return false;
        }
        C2080i iVar = (C2080i) obj;
        return this.f7604a.equals(iVar.f7604a) && this.f7605b.equals(iVar.f7605b) && C2082k.m9436c(this.f7606c, iVar.f7606c);
    }

    public int hashCode() {
        int hashCode = ((this.f7604a.hashCode() * 31) + this.f7605b.hashCode()) * 31;
        Class<?> cls = this.f7606c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f7604a + ", second=" + this.f7605b + '}';
    }
}
