package p006b.p022e.p026b.p027k;

import java.util.HashSet;
import java.util.Iterator;
import p006b.p022e.p026b.C0845c;
import p006b.p022e.p026b.C0855i;

/* renamed from: b.e.b.k.d */
public class C0861d {

    /* renamed from: a */
    private HashSet<C0861d> f4251a = null;

    /* renamed from: b */
    public final C0864e f4252b;

    /* renamed from: c */
    public final EnumC0863b f4253c;

    /* renamed from: d */
    public C0861d f4254d;

    /* renamed from: e */
    public int f4255e = 0;

    /* renamed from: f */
    int f4256f = -1;

    /* renamed from: g */
    C0855i f4257g;

    /* access modifiers changed from: package-private */
    /* renamed from: b.e.b.k.d$a */
    public static /* synthetic */ class C0862a {

        /* renamed from: a */
        static final /* synthetic */ int[] f4258a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
            // Method dump skipped, instructions count: 109
            */
            throw new UnsupportedOperationException("Method not decompiled: p006b.p022e.p026b.p027k.C0861d.C0862a.<clinit>():void");
        }
    }

    /* renamed from: b.e.b.k.d$b */
    public enum EnumC0863b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public C0861d(C0864e eVar, EnumC0863b bVar) {
        this.f4252b = eVar;
        this.f4253c = bVar;
    }

    /* renamed from: a */
    public boolean mo5137a(C0861d dVar, int i, int i2, boolean z) {
        if (dVar == null) {
            mo5147k();
            return true;
        } else if (!z && !mo5146j(dVar)) {
            return false;
        } else {
            this.f4254d = dVar;
            if (dVar.f4251a == null) {
                dVar.f4251a = new HashSet<>();
            }
            this.f4254d.f4251a.add(this);
            if (i > 0) {
                this.f4255e = i;
            } else {
                this.f4255e = 0;
            }
            this.f4256f = i2;
            return true;
        }
    }

    /* renamed from: b */
    public int mo5138b() {
        C0861d dVar;
        if (this.f4252b.mo5169M() == 8) {
            return 0;
        }
        return (this.f4256f <= -1 || (dVar = this.f4254d) == null || dVar.f4252b.mo5169M() != 8) ? this.f4255e : this.f4256f;
    }

    /* renamed from: c */
    public final C0861d mo5139c() {
        switch (C0862a.f4258a[this.f4253c.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f4252b.f4274E;
            case 3:
                return this.f4252b.f4272C;
            case 4:
                return this.f4252b.f4275F;
            case 5:
                return this.f4252b.f4273D;
            default:
                throw new AssertionError(this.f4253c.name());
        }
    }

    /* renamed from: d */
    public C0864e mo5140d() {
        return this.f4252b;
    }

    /* renamed from: e */
    public C0855i mo5141e() {
        return this.f4257g;
    }

    /* renamed from: f */
    public C0861d mo5142f() {
        return this.f4254d;
    }

    /* renamed from: g */
    public EnumC0863b mo5143g() {
        return this.f4253c;
    }

    /* renamed from: h */
    public boolean mo5144h() {
        HashSet<C0861d> hashSet = this.f4251a;
        if (hashSet == null) {
            return false;
        }
        Iterator<C0861d> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().mo5139c().mo5145i()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public boolean mo5145i() {
        return this.f4254d != null;
    }

    /* renamed from: j */
    public boolean mo5146j(C0861d dVar) {
        boolean z = false;
        if (dVar == null) {
            return false;
        }
        EnumC0863b g = dVar.mo5143g();
        EnumC0863b bVar = this.f4253c;
        if (g == bVar) {
            return bVar != EnumC0863b.BASELINE || (dVar.mo5140d().mo5173Q() && mo5140d().mo5173Q());
        }
        switch (C0862a.f4258a[bVar.ordinal()]) {
            case 1:
                return (g == EnumC0863b.BASELINE || g == EnumC0863b.CENTER_X || g == EnumC0863b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z2 = g == EnumC0863b.LEFT || g == EnumC0863b.RIGHT;
                if (!(dVar.mo5140d() instanceof C0868g)) {
                    return z2;
                }
                if (z2 || g == EnumC0863b.CENTER_X) {
                    z = true;
                }
                return z;
            case 4:
            case 5:
                boolean z3 = g == EnumC0863b.TOP || g == EnumC0863b.BOTTOM;
                if (!(dVar.mo5140d() instanceof C0868g)) {
                    return z3;
                }
                if (z3 || g == EnumC0863b.CENTER_Y) {
                    z = true;
                }
                return z;
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f4253c.name());
        }
    }

    /* renamed from: k */
    public void mo5147k() {
        HashSet<C0861d> hashSet;
        C0861d dVar = this.f4254d;
        if (!(dVar == null || (hashSet = dVar.f4251a) == null)) {
            hashSet.remove(this);
        }
        this.f4254d = null;
        this.f4255e = 0;
        this.f4256f = -1;
    }

    /* renamed from: l */
    public void mo5148l(C0845c cVar) {
        C0855i iVar = this.f4257g;
        if (iVar == null) {
            this.f4257g = new C0855i(C0855i.EnumC0856a.UNRESTRICTED, null);
        } else {
            iVar.mo5119d();
        }
    }

    public String toString() {
        return this.f4252b.mo5205p() + ":" + this.f4253c.toString();
    }
}
