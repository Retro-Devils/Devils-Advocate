package p006b.p030g.p038j;

/* renamed from: b.g.j.h */
public class C0960h<T> extends C0959g<T> {

    /* renamed from: c */
    private final Object f4662c = new Object();

    public C0960h(int i) {
        super(i);
    }

    @Override // p006b.p030g.p038j.C0959g, p006b.p030g.p038j.AbstractC0958f
    /* renamed from: a */
    public boolean mo5398a(T t) {
        boolean a;
        synchronized (this.f4662c) {
            a = super.mo5398a(t);
        }
        return a;
    }

    @Override // p006b.p030g.p038j.C0959g, p006b.p030g.p038j.AbstractC0958f
    /* renamed from: b */
    public T mo5399b() {
        T t;
        synchronized (this.f4662c) {
            t = (T) super.mo5399b();
        }
        return t;
    }
}
