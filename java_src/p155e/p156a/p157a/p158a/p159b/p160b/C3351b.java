package p155e.p156a.p157a.p158a.p159b.p160b;

import java.util.BitSet;

/* access modifiers changed from: package-private */
/* renamed from: e.a.a.a.b.b.b */
public class C3351b {

    /* renamed from: a */
    long f11291a;

    /* renamed from: b */
    long[] f11292b;

    /* renamed from: c */
    BitSet f11293c;

    /* renamed from: d */
    long[] f11294d;

    /* renamed from: e */
    C3366i[] f11295e;

    /* renamed from: f */
    C3374q f11296f;

    /* renamed from: g */
    C3368k[] f11297g;

    /* renamed from: h */
    C3373p f11298h;

    C3351b() {
    }

    /* renamed from: a */
    private static String m13944a(long[] jArr) {
        return jArr == null ? "(null)" : String.valueOf(jArr.length);
    }

    /* renamed from: b */
    private static String m13945b(Object[] objArr) {
        return objArr == null ? "(null)" : String.valueOf(objArr.length);
    }

    public String toString() {
        return "Archive with packed streams starting at offset " + this.f11291a + ", " + m13944a(this.f11292b) + " pack sizes, " + m13944a(this.f11294d) + " CRCs, " + m13945b(this.f11295e) + " folders, " + m13945b(this.f11297g) + " files and " + this.f11298h;
    }
}
