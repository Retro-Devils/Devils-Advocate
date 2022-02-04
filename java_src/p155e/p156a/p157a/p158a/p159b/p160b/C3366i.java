package p155e.p156a.p157a.p158a.p159b.p160b;

import java.util.LinkedList;

/* access modifiers changed from: package-private */
/* renamed from: e.a.a.a.b.b.i */
public class C3366i {

    /* renamed from: a */
    C3354e[] f11315a;

    /* renamed from: b */
    long f11316b;

    /* renamed from: c */
    long f11317c;

    /* renamed from: d */
    C3352c[] f11318d;

    /* renamed from: e */
    long[] f11319e;

    /* renamed from: f */
    long[] f11320f;

    /* renamed from: g */
    boolean f11321g;

    /* renamed from: h */
    long f11322h;

    /* renamed from: i */
    int f11323i;

    C3366i() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo11310a(int i) {
        int i2 = 0;
        while (true) {
            C3352c[] cVarArr = this.f11318d;
            if (i2 >= cVarArr.length) {
                return -1;
            }
            if (cVarArr[i2].f11299a == ((long) i)) {
                return i2;
            }
            i2++;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo11311b(int i) {
        int i2 = 0;
        while (true) {
            C3352c[] cVarArr = this.f11318d;
            if (i2 >= cVarArr.length) {
                return -1;
            }
            if (cVarArr[i2].f11300b == ((long) i)) {
                return i2;
            }
            i2++;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Iterable<C3354e> mo11312c() {
        LinkedList linkedList = new LinkedList();
        int i = (int) this.f11319e[0];
        while (i != -1) {
            linkedList.addLast(this.f11315a[i]);
            int b = mo11311b(i);
            i = b != -1 ? (int) this.f11318d[b].f11299a : -1;
        }
        return linkedList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public long mo11313d() {
        long j = this.f11317c;
        if (j == 0) {
            return 0;
        }
        for (int i = ((int) j) - 1; i >= 0; i--) {
            if (mo11311b(i) < 0) {
                return this.f11320f[i];
            }
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public long mo11314e(C3354e eVar) {
        if (this.f11315a == null) {
            return 0;
        }
        int i = 0;
        while (true) {
            C3354e[] eVarArr = this.f11315a;
            if (i >= eVarArr.length) {
                return 0;
            }
            if (eVarArr[i] == eVar) {
                return this.f11320f[i];
            }
            i++;
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Folder with ");
        sb.append(this.f11315a.length);
        sb.append(" coders, ");
        sb.append(this.f11316b);
        sb.append(" input streams, ");
        sb.append(this.f11317c);
        sb.append(" output streams, ");
        sb.append(this.f11318d.length);
        sb.append(" bind pairs, ");
        sb.append(this.f11319e.length);
        sb.append(" packed streams, ");
        sb.append(this.f11320f.length);
        sb.append(" unpack sizes, ");
        if (this.f11321g) {
            str = "with CRC " + this.f11322h;
        } else {
            str = "without CRC";
        }
        sb.append(str);
        sb.append(" and ");
        sb.append(this.f11323i);
        sb.append(" unpack streams");
        return sb.toString();
    }
}
