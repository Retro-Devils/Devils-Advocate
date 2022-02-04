package p155e.p156a.p157a.p158a.p159b.p160b;

/* renamed from: e.a.a.a.b.b.n */
public class C3371n {

    /* renamed from: a */
    private final EnumC3370m f11355a;

    /* renamed from: b */
    private final Object f11356b;

    public C3371n(EnumC3370m mVar, Object obj) {
        this.f11355a = mVar;
        this.f11356b = obj;
        if (obj != null && !C3356g.m13950b(mVar).mo11302a(obj)) {
            throw new IllegalArgumentException("The " + mVar + " method doesn't support options of type " + obj.getClass());
        }
    }
}
