package p006b.p022e.p026b;

import java.util.Arrays;
import java.util.HashSet;

/* renamed from: b.e.b.i */
public class C0855i {

    /* renamed from: a */
    private static int f4191a = 1;

    /* renamed from: b */
    public boolean f4192b;

    /* renamed from: c */
    private String f4193c;

    /* renamed from: d */
    public int f4194d = -1;

    /* renamed from: e */
    int f4195e = -1;

    /* renamed from: f */
    public int f4196f = 0;

    /* renamed from: g */
    public float f4197g;

    /* renamed from: h */
    public boolean f4198h = false;

    /* renamed from: i */
    float[] f4199i = new float[9];

    /* renamed from: j */
    float[] f4200j = new float[9];

    /* renamed from: k */
    EnumC0856a f4201k;

    /* renamed from: l */
    C0843b[] f4202l = new C0843b[16];

    /* renamed from: m */
    int f4203m = 0;

    /* renamed from: n */
    public int f4204n = 0;

    /* renamed from: o */
    HashSet<C0843b> f4205o = null;

    /* renamed from: b.e.b.i$a */
    public enum EnumC0856a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public C0855i(EnumC0856a aVar, String str) {
        this.f4201k = aVar;
    }

    /* renamed from: b */
    static void m5025b() {
        f4191a++;
    }

    /* renamed from: a */
    public final void mo5117a(C0843b bVar) {
        int i = 0;
        while (true) {
            int i2 = this.f4203m;
            if (i >= i2) {
                C0843b[] bVarArr = this.f4202l;
                if (i2 >= bVarArr.length) {
                    this.f4202l = (C0843b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                C0843b[] bVarArr2 = this.f4202l;
                int i3 = this.f4203m;
                bVarArr2[i3] = bVar;
                this.f4203m = i3 + 1;
                return;
            } else if (this.f4202l[i] != bVar) {
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final void mo5118c(C0843b bVar) {
        int i = this.f4203m;
        int i2 = 0;
        while (i2 < i) {
            if (this.f4202l[i2] == bVar) {
                while (i2 < i - 1) {
                    C0843b[] bVarArr = this.f4202l;
                    int i3 = i2 + 1;
                    bVarArr[i2] = bVarArr[i3];
                    i2 = i3;
                }
                this.f4203m--;
                return;
            }
            i2++;
        }
    }

    /* renamed from: d */
    public void mo5119d() {
        this.f4193c = null;
        this.f4201k = EnumC0856a.UNKNOWN;
        this.f4196f = 0;
        this.f4194d = -1;
        this.f4195e = -1;
        this.f4197g = 0.0f;
        this.f4198h = false;
        int i = this.f4203m;
        for (int i2 = 0; i2 < i; i2++) {
            this.f4202l[i2] = null;
        }
        this.f4203m = 0;
        this.f4204n = 0;
        this.f4192b = false;
        Arrays.fill(this.f4200j, 0.0f);
    }

    /* renamed from: e */
    public void mo5120e(C0846d dVar, float f) {
        this.f4197g = f;
        this.f4198h = true;
        int i = this.f4203m;
        for (int i2 = 0; i2 < i; i2++) {
            this.f4202l[i2].mo5054B(dVar, this, false);
        }
        this.f4203m = 0;
    }

    /* renamed from: f */
    public void mo5121f(EnumC0856a aVar, String str) {
        this.f4201k = aVar;
    }

    /* renamed from: g */
    public final void mo5122g(C0843b bVar) {
        int i = this.f4203m;
        for (int i2 = 0; i2 < i; i2++) {
            this.f4202l[i2].mo5055C(bVar, false);
        }
        this.f4203m = 0;
    }

    public String toString() {
        StringBuilder sb;
        if (this.f4193c != null) {
            sb = new StringBuilder();
            sb.append("");
            sb.append(this.f4193c);
        } else {
            sb = new StringBuilder();
            sb.append("");
            sb.append(this.f4194d);
        }
        return sb.toString();
    }
}
