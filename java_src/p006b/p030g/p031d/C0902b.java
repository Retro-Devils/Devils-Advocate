package p006b.p030g.p031d;

import android.graphics.Insets;

/* renamed from: b.g.d.b */
public final class C0902b {

    /* renamed from: a */
    public static final C0902b f4524a = new C0902b(0, 0, 0, 0);

    /* renamed from: b */
    public final int f4525b;

    /* renamed from: c */
    public final int f4526c;

    /* renamed from: d */
    public final int f4527d;

    /* renamed from: e */
    public final int f4528e;

    private C0902b(int i, int i2, int i3, int i4) {
        this.f4525b = i;
        this.f4526c = i2;
        this.f4527d = i3;
        this.f4528e = i4;
    }

    /* renamed from: a */
    public static C0902b m5301a(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f4524a : new C0902b(i, i2, i3, i4);
    }

    /* renamed from: b */
    public static C0902b m5302b(Insets insets) {
        return m5301a(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* renamed from: c */
    public Insets mo5300c() {
        return Insets.of(this.f4525b, this.f4526c, this.f4527d, this.f4528e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0902b.class != obj.getClass()) {
            return false;
        }
        C0902b bVar = (C0902b) obj;
        return this.f4528e == bVar.f4528e && this.f4525b == bVar.f4525b && this.f4527d == bVar.f4527d && this.f4526c == bVar.f4526c;
    }

    public int hashCode() {
        return (((((this.f4525b * 31) + this.f4526c) * 31) + this.f4527d) * 31) + this.f4528e;
    }

    public String toString() {
        return "Insets{left=" + this.f4525b + ", top=" + this.f4526c + ", right=" + this.f4527d + ", bottom=" + this.f4528e + '}';
    }
}
