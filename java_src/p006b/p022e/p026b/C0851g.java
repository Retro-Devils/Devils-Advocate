package p006b.p022e.p026b;

/* access modifiers changed from: package-private */
/* renamed from: b.e.b.g */
public class C0851g<T> implements AbstractC0850f<T> {

    /* renamed from: a */
    private final Object[] f4179a;

    /* renamed from: b */
    private int f4180b;

    C0851g(int i) {
        if (i > 0) {
            this.f4179a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    @Override // p006b.p022e.p026b.AbstractC0850f
    /* renamed from: a */
    public boolean mo5105a(T t) {
        int i = this.f4180b;
        Object[] objArr = this.f4179a;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = t;
        this.f4180b = i + 1;
        return true;
    }

    @Override // p006b.p022e.p026b.AbstractC0850f
    /* renamed from: b */
    public T mo5106b() {
        int i = this.f4180b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f4179a;
        T t = (T) objArr[i2];
        objArr[i2] = null;
        this.f4180b = i - 1;
        return t;
    }

    @Override // p006b.p022e.p026b.AbstractC0850f
    /* renamed from: c */
    public void mo5107c(T[] tArr, int i) {
        if (i > tArr.length) {
            i = tArr.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            T t = tArr[i2];
            int i3 = this.f4180b;
            Object[] objArr = this.f4179a;
            if (i3 < objArr.length) {
                objArr[i3] = t;
                this.f4180b = i3 + 1;
            }
        }
    }
}
