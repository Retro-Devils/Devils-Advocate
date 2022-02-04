package p006b.p022e.p026b;

import java.util.Arrays;
import java.util.HashSet;

/* renamed from: b.e.b.i */
public class C0855i {

    /* renamed from: a */
    private static int f4187a = 1;

    /* renamed from: b */
    public boolean f4188b;

    /* renamed from: c */
    private String f4189c;

    /* renamed from: d */
    public int f4190d = -1;

    /* renamed from: e */
    int f4191e = -1;

    /* renamed from: f */
    public int f4192f = 0;

    /* renamed from: g */
    public float f4193g;

    /* renamed from: h */
    public boolean f4194h = false;

    /* renamed from: i */
    float[] f4195i = new float[9];

    /* renamed from: j */
    float[] f4196j = new float[9];

    /* renamed from: k */
    EnumC0856a f4197k;

    /* renamed from: l */
    C0843b[] f4198l = new C0843b[16];

    /* renamed from: m */
    int f4199m = 0;

    /* renamed from: n */
    public int f4200n = 0;

    /* renamed from: o */
    HashSet<C0843b> f4201o = null;

    /* renamed from: b.e.b.i$a */
    public enum EnumC0856a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public C0855i(EnumC0856a aVar, String str) {
        this.f4197k = aVar;
    }

    /* renamed from: b */
    static void m5025b() {
        f4187a++;
    }

    /* renamed from: a */
    public final void mo5117a(C0843b bVar) {
        int i = 0;
        while (true) {
            int i2 = this.f4199m;
            if (i >= i2) {
                C0843b[] bVarArr = this.f4198l;
                if (i2 >= bVarArr.length) {
                    this.f4198l = (C0843b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                C0843b[] bVarArr2 = this.f4198l;
                int i3 = this.f4199m;
                bVarArr2[i3] = bVar;
                this.f4199m = i3 + 1;
                return;
            } else if (this.f4198l[i] != bVar) {
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final void mo5118c(C0843b bVar) {
        int i = this.f4199m;
        int i2 = 0;
        while (i2 < i) {
            if (this.f4198l[i2] == bVar) {
                while (i2 < i - 1) {
                    C0843b[] bVarArr = this.f4198l;
                    int i3 = i2 + 1;
                    bVarArr[i2] = bVarArr[i3];
                    i2 = i3;
                }
                this.f4199m--;
                return;
            }
            i2++;
        }
    }

    /* renamed from: d */
    public void mo5119d() {
        this.f4189c = null;
        this.f4197k = EnumC0856a.UNKNOWN;
        this.f4192f = 0;
        this.f4190d = -1;
        this.f4191e = -1;
        this.f4193g = 0.0f;
        this.f4194h = false;
        int i = this.f4199m;
        for (int i2 = 0; i2 < i; i2++) {
            this.f4198l[i2] = null;
        }
        this.f4199m = 0;
        this.f4200n = 0;
        this.f4188b = false;
        Arrays.fill(this.f4196j, 0.0f);
    }

    /* renamed from: e */
    public void mo5120e(C0846d dVar, float f) {
        this.f4193g = f;
        this.f4194h = true;
        int i = this.f4199m;
        for (int i2 = 0; i2 < i; i2++) {
            this.f4198l[i2].mo5054B(dVar, this, false);
        }
        this.f4199m = 0;
    }

    /* renamed from: f */
    public void mo5121f(EnumC0856a aVar, String str) {
        this.f4197k = aVar;
    }

    /* renamed from: g */
    public final void mo5122g(C0843b bVar) {
        int i = this.f4199m;
        for (int i2 = 0; i2 < i; i2++) {
            this.f4198l[i2].mo5055C(bVar, false);
        }
        this.f4199m = 0;
    }

    public String toString() {
        StringBuilder sb;
        if (this.f4189c != null) {
            sb = new StringBuilder();
            sb.append("");
            sb.append(this.f4189c);
        } else {
            sb = new StringBuilder();
            sb.append("");
            sb.append(this.f4190d);
        }
        return sb.toString();
    }
}
