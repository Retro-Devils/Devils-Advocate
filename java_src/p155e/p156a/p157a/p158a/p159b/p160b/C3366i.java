package p155e.p156a.p157a.p158a.p159b.p160b;

import java.util.LinkedList;

/* access modifiers changed from: package-private */
/* renamed from: e.a.a.a.b.b.i */
public class C3366i {

    /* renamed from: a */
    C3354e[] f11306a;

    /* renamed from: b */
    long f11307b;

    /* renamed from: c */
    long f11308c;

    /* renamed from: d */
    C3352c[] f11309d;

    /* renamed from: e */
    long[] f11310e;

    /* renamed from: f */
    long[] f11311f;

    /* renamed from: g */
    boolean f11312g;

    /* renamed from: h */
    long f11313h;

    /* renamed from: i */
    int f11314i;

    C3366i() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo11310a(int i) {
        int i2 = 0;
        while (true) {
            C3352c[] cVarArr = this.f11309d;
            if (i2 >= cVarArr.length) {
                return -1;
            }
            if (cVarArr[i2].f11290a == ((long) i)) {
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
            C3352c[] cVarArr = this.f11309d;
            if (i2 >= cVarArr.length) {
                return -1;
            }
            if (cVarArr[i2].f11291b == ((long) i)) {
                return i2;
            }
            i2++;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Iterable<C3354e> mo11312c() {
        LinkedList linkedList = new LinkedList();
        int i = (int) this.f11310e[0];
        while (i != -1) {
            linkedList.addLast(this.f11306a[i]);
            int b = mo11311b(i);
            i = b != -1 ? (int) this.f11309d[b].f11290a : -1;
        }
        return linkedList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public long mo11313d() {
        long j = this.f11308c;
        if (j == 0) {
            return 0;
        }
        for (int i = ((int) j) - 1; i >= 0; i--) {
            if (mo11311b(i) < 0) {
                return this.f11311f[i];
            }
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public long mo11314e(C3354e eVar) {
        if (this.f11306a == null) {
            return 0;
        }
        int i = 0;
        while (true) {
            C3354e[] eVarArr = this.f11306a;
            if (i >= eVarArr.length) {
                return 0;
            }
            if (eVarArr[i] == eVar) {
                return this.f11311f[i];
            }
            i++;
        }
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Folder with ");
        sb.append(this.f11306a.length);
        sb.append(" coders, ");
        sb.append(this.f11307b);
        sb.append(" input streams, ");
        sb.append(this.f11308c);
        sb.append(" output streams, ");
        sb.append(this.f11309d.length);
        sb.append(" bind pairs, ");
        sb.append(this.f11310e.length);
        sb.append(" packed streams, ");
        sb.append(this.f11311f.length);
        sb.append(" unpack sizes, ");
        if (this.f11312g) {
            str = "with CRC " + this.f11313h;
        } else {
            str = "without CRC";
        }
        sb.append(str);
        sb.append(" and ");
        sb.append(this.f11314i);
        sb.append(" unpack streams");
        return sb.toString();
    }
}
