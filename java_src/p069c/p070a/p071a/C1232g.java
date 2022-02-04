package p069c.p070a.p071a;

import android.text.TextUtils;

/* renamed from: c.a.a.g */
public final class C1232g {

    /* renamed from: a */
    private final String f5435a;

    /* renamed from: b */
    private final String f5436b;

    public C1232g(String str, String str2) {
        this.f5435a = str;
        this.f5436b = str2;
    }

    /* renamed from: a */
    public final String mo6169a() {
        return this.f5435a;
    }

    /* renamed from: b */
    public final String mo6170b() {
        return this.f5436b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1232g.class != obj.getClass()) {
            return false;
        }
        C1232g gVar = (C1232g) obj;
        return TextUtils.equals(this.f5435a, gVar.f5435a) && TextUtils.equals(this.f5436b, gVar.f5436b);
    }

    public int hashCode() {
        return (this.f5435a.hashCode() * 31) + this.f5436b.hashCode();
    }

    public String toString() {
        return "Header[name=" + this.f5435a + ",value=" + this.f5436b + "]";
    }
}
