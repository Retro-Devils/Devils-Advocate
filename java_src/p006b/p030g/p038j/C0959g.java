package p006b.p030g.p038j;

/* renamed from: b.g.j.g */
public class C0959g<T> implements AbstractC0958f<T> {

    /* renamed from: a */
    private final Object[] f4660a;

    /* renamed from: b */
    private int f4661b;

    public C0959g(int i) {
        if (i > 0) {
            this.f4660a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    /* renamed from: c */
    private boolean m5487c(T t) {
        for (int i = 0; i < this.f4661b; i++) {
            if (this.f4660a[i] == t) {
                return true;
            }
        }
        return false;
    }

    @Override // p006b.p030g.p038j.AbstractC0958f
    /* renamed from: a */
    public boolean mo5398a(T t) {
        if (!m5487c(t)) {
            int i = this.f4661b;
            Object[] objArr = this.f4660a;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = t;
            this.f4661b = i + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    @Override // p006b.p030g.p038j.AbstractC0958f
    /* renamed from: b */
    public T mo5399b() {
        int i = this.f4661b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f4660a;
        T t = (T) objArr[i2];
        objArr[i2] = null;
        this.f4661b = i - 1;
        return t;
    }
}
