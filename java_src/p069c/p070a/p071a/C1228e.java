package p069c.p070a.p071a;

/* renamed from: c.a.a.e */
public class C1228e implements AbstractC1249r {

    /* renamed from: a */
    private int f5425a;

    /* renamed from: b */
    private int f5426b;

    /* renamed from: c */
    private final int f5427c;

    /* renamed from: d */
    private final float f5428d;

    public C1228e() {
        this(2500, 1, 1.0f);
    }

    public C1228e(int i, int i2, float f) {
        this.f5425a = i;
        this.f5427c = i2;
        this.f5428d = f;
    }

    @Override // p069c.p070a.p071a.AbstractC1249r
    /* renamed from: a */
    public int mo6160a() {
        return this.f5425a;
    }

    @Override // p069c.p070a.p071a.AbstractC1249r
    /* renamed from: b */
    public void mo6161b(C1252u uVar) {
        this.f5426b++;
        int i = this.f5425a;
        this.f5425a = i + ((int) (((float) i) * this.f5428d));
        if (!mo6163d()) {
            throw uVar;
        }
    }

    @Override // p069c.p070a.p071a.AbstractC1249r
    /* renamed from: c */
    public int mo6162c() {
        return this.f5426b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo6163d() {
        return this.f5426b <= this.f5427c;
    }
}
