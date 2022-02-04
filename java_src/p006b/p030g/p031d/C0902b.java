package p006b.p030g.p031d;

import android.graphics.Insets;

/* renamed from: b.g.d.b */
public final class C0902b {

    /* renamed from: a */
    public static final C0902b f4528a = new C0902b(0, 0, 0, 0);

    /* renamed from: b */
    public final int f4529b;

    /* renamed from: c */
    public final int f4530c;

    /* renamed from: d */
    public final int f4531d;

    /* renamed from: e */
    public final int f4532e;

    private C0902b(int i, int i2, int i3, int i4) {
        this.f4529b = i;
        this.f4530c = i2;
        this.f4531d = i3;
        this.f4532e = i4;
    }

    /* renamed from: a */
    public static C0902b m5301a(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f4528a : new C0902b(i, i2, i3, i4);
    }

    /* renamed from: b */
    public static C0902b m5302b(Insets insets) {
        return m5301a(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* renamed from: c */
    public Insets mo5300c() {
        return Insets.of(this.f4529b, this.f4530c, this.f4531d, this.f4532e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0902b.class != obj.getClass()) {
            return false;
        }
        C0902b bVar = (C0902b) obj;
        return this.f4532e == bVar.f4532e && this.f4529b == bVar.f4529b && this.f4531d == bVar.f4531d && this.f4530c == bVar.f4530c;
    }

    public int hashCode() {
        return (((((this.f4529b * 31) + this.f4530c) * 31) + this.f4531d) * 31) + this.f4532e;
    }

    public String toString() {
        return "Insets{left=" + this.f4529b + ", top=" + this.f4530c + ", right=" + this.f4531d + ", bottom=" + this.f4532e + '}';
    }
}
