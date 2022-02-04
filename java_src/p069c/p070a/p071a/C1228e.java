package p069c.p070a.p071a;

/* renamed from: c.a.a.e */
public class C1228e implements AbstractC1249r {

    /* renamed from: a */
    private int f5418a;

    /* renamed from: b */
    private int f5419b;

    /* renamed from: c */
    private final int f5420c;

    /* renamed from: d */
    private final float f5421d;

    public C1228e() {
        this(2500, 1, 1.0f);
    }

    public C1228e(int i, int i2, float f) {
        this.f5418a = i;
        this.f5420c = i2;
        this.f5421d = f;
    }

    @Override // p069c.p070a.p071a.AbstractC1249r
    /* renamed from: a */
    public int mo6160a() {
        return this.f5418a;
    }

    @Override // p069c.p070a.p071a.AbstractC1249r
    /* renamed from: b */
    public void mo6161b(C1252u uVar) {
        this.f5419b++;
        int i = this.f5418a;
        this.f5418a = i + ((int) (((float) i) * this.f5421d));
        if (!mo6163d()) {
            throw uVar;
        }
    }

    @Override // p069c.p070a.p071a.AbstractC1249r
    /* renamed from: c */
    public int mo6162c() {
        return this.f5419b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo6163d() {
        return this.f5419b <= this.f5420c;
    }
}
