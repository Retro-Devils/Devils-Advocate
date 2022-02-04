package androidx.appcompat.widget;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.o0 */
public class C0264o0 {

    /* renamed from: a */
    private int f1125a = 0;

    /* renamed from: b */
    private int f1126b = 0;

    /* renamed from: c */
    private int f1127c = Integer.MIN_VALUE;

    /* renamed from: d */
    private int f1128d = Integer.MIN_VALUE;

    /* renamed from: e */
    private int f1129e = 0;

    /* renamed from: f */
    private int f1130f = 0;

    /* renamed from: g */
    private boolean f1131g = false;

    /* renamed from: h */
    private boolean f1132h = false;

    C0264o0() {
    }

    /* renamed from: a */
    public int mo1660a() {
        return this.f1131g ? this.f1125a : this.f1126b;
    }

    /* renamed from: b */
    public int mo1661b() {
        return this.f1125a;
    }

    /* renamed from: c */
    public int mo1662c() {
        return this.f1126b;
    }

    /* renamed from: d */
    public int mo1663d() {
        return this.f1131g ? this.f1126b : this.f1125a;
    }

    /* renamed from: e */
    public void mo1664e(int i, int i2) {
        this.f1132h = false;
        if (i != Integer.MIN_VALUE) {
            this.f1129e = i;
            this.f1125a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1130f = i2;
            this.f1126b = i2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (r2 != Integer.MIN_VALUE) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        if (r2 != Integer.MIN_VALUE) goto L_0x0031;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1665f(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.f1131g
            if (r2 != r0) goto L_0x0005
            return
        L_0x0005:
            r1.f1131g = r2
            boolean r0 = r1.f1132h
            if (r0 == 0) goto L_0x002b
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == 0) goto L_0x001d
            int r2 = r1.f1128d
            if (r2 == r0) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            int r2 = r1.f1129e
        L_0x0016:
            r1.f1125a = r2
            int r2 = r1.f1127c
            if (r2 == r0) goto L_0x002f
            goto L_0x0031
        L_0x001d:
            int r2 = r1.f1127c
            if (r2 == r0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            int r2 = r1.f1129e
        L_0x0024:
            r1.f1125a = r2
            int r2 = r1.f1128d
            if (r2 == r0) goto L_0x002f
            goto L_0x0031
        L_0x002b:
            int r2 = r1.f1129e
            r1.f1125a = r2
        L_0x002f:
            int r2 = r1.f1130f
        L_0x0031:
            r1.f1126b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0264o0.mo1665f(boolean):void");
    }

    /* renamed from: g */
    public void mo1666g(int i, int i2) {
        this.f1127c = i;
        this.f1128d = i2;
        this.f1132h = true;
        if (this.f1131g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f1125a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f1126b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f1125a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1126b = i2;
        }
    }
}
