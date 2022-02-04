package androidx.media;

import java.util.Arrays;

/* renamed from: androidx.media.c */
class C0639c implements AbstractC0637a {

    /* renamed from: a */
    int f3058a = 0;

    /* renamed from: b */
    int f3059b = 0;

    /* renamed from: c */
    int f3060c = 0;

    /* renamed from: d */
    int f3061d = -1;

    C0639c() {
    }

    /* renamed from: a */
    public int mo3696a() {
        return this.f3059b;
    }

    /* renamed from: b */
    public int mo3697b() {
        int i = this.f3060c;
        int c = mo3698c();
        if (c == 6) {
            i |= 4;
        } else if (c == 7) {
            i |= 1;
        }
        return i & 273;
    }

    /* renamed from: c */
    public int mo3698c() {
        int i = this.f3061d;
        return i != -1 ? i : AudioAttributesCompat.m3300a(false, this.f3060c, this.f3058a);
    }

    /* renamed from: d */
    public int mo3699d() {
        return this.f3058a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0639c)) {
            return false;
        }
        C0639c cVar = (C0639c) obj;
        return this.f3059b == cVar.mo3696a() && this.f3060c == cVar.mo3697b() && this.f3058a == cVar.mo3699d() && this.f3061d == cVar.f3061d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3059b), Integer.valueOf(this.f3060c), Integer.valueOf(this.f3058a), Integer.valueOf(this.f3061d)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f3061d != -1) {
            sb.append(" stream=");
            sb.append(this.f3061d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.m3301b(this.f3058a));
        sb.append(" content=");
        sb.append(this.f3059b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f3060c).toUpperCase());
        return sb.toString();
    }
}
