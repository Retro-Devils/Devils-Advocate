package p155e.p164b.p165a;

import java.io.InputStream;

/* renamed from: e.b.a.k */
public class C3394k extends AbstractC3391h {

    /* renamed from: b */
    private static final int[] f11448b = {262144, 1048576, 2097152, 4194304, 4194304, 8388608, 8388608, 16777216, 33554432, 67108864};

    /* renamed from: c */
    private static final int[] f11449c = {4, 8, 24, 48};

    /* renamed from: d */
    private int f11450d;

    /* renamed from: e */
    private byte[] f11451e = null;

    /* renamed from: f */
    private int f11452f;

    /* renamed from: g */
    private int f11453g;

    /* renamed from: h */
    private int f11454h;

    /* renamed from: i */
    private int f11455i;

    /* renamed from: j */
    private int f11456j;

    /* renamed from: k */
    private int f11457k;

    /* renamed from: l */
    private int f11458l;

    public C3394k() {
        try {
            mo11379c(6);
        } catch (C3399p unused) {
            throw new RuntimeException();
        }
    }

    @Override // p155e.p164b.p165a.AbstractC3391h
    /* renamed from: b */
    public InputStream mo11364b(InputStream inputStream, C3386c cVar) {
        return new C3393j(inputStream, this.f11450d, this.f11451e, cVar);
    }

    /* renamed from: c */
    public void mo11379c(int i) {
        if (i < 0 || i > 9) {
            throw new C3399p("Unsupported preset: " + i);
        }
        this.f11452f = 3;
        this.f11453g = 0;
        this.f11454h = 2;
        this.f11450d = f11448b[i];
        if (i <= 3) {
            this.f11455i = 1;
            this.f11457k = 4;
            this.f11456j = i <= 1 ? 128 : 273;
            this.f11458l = f11449c[i];
            return;
        }
        this.f11455i = 2;
        this.f11457k = 20;
        this.f11456j = i == 4 ? 16 : i == 5 ? 32 : 64;
        this.f11458l = 0;
    }

    @Override // java.lang.Object
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new RuntimeException();
        }
    }
}
