package com.bumptech.glide.p144t;

/* renamed from: com.bumptech.glide.t.i */
public class C2080i {

    /* renamed from: a */
    private Class<?> f7596a;

    /* renamed from: b */
    private Class<?> f7597b;

    /* renamed from: c */
    private Class<?> f7598c;

    public C2080i() {
    }

    public C2080i(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        mo7867a(cls, cls2, cls3);
    }

    /* renamed from: a */
    public void mo7867a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.f7596a = cls;
        this.f7597b = cls2;
        this.f7598c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2080i.class != obj.getClass()) {
            return false;
        }
        C2080i iVar = (C2080i) obj;
        return this.f7596a.equals(iVar.f7596a) && this.f7597b.equals(iVar.f7597b) && C2082k.m9436c(this.f7598c, iVar.f7598c);
    }

    public int hashCode() {
        int hashCode = ((this.f7596a.hashCode() * 31) + this.f7597b.hashCode()) * 31;
        Class<?> cls = this.f7598c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f7596a + ", second=" + this.f7597b + '}';
    }
}
