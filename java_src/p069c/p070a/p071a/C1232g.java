package p069c.p070a.p071a;

import android.text.TextUtils;

/* renamed from: c.a.a.g */
public final class C1232g {

    /* renamed from: a */
    private final String f5428a;

    /* renamed from: b */
    private final String f5429b;

    public C1232g(String str, String str2) {
        this.f5428a = str;
        this.f5429b = str2;
    }

    /* renamed from: a */
    public final String mo6169a() {
        return this.f5428a;
    }

    /* renamed from: b */
    public final String mo6170b() {
        return this.f5429b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1232g.class != obj.getClass()) {
            return false;
        }
        C1232g gVar = (C1232g) obj;
        return TextUtils.equals(this.f5428a, gVar.f5428a) && TextUtils.equals(this.f5429b, gVar.f5429b);
    }

    public int hashCode() {
        return (this.f5428a.hashCode() * 31) + this.f5429b.hashCode();
    }

    public String toString() {
        return "Header[name=" + this.f5428a + ",value=" + this.f5429b + "]";
    }
}
