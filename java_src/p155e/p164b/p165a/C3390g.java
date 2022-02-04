package p155e.p164b.p165a;

import java.io.InputStream;

/* renamed from: e.b.a.g */
public class C3390g extends AbstractC3391h {

    /* renamed from: b */
    private int f11435b = 1;

    public C3390g() {
    }

    public C3390g(int i) {
        mo11372c(i);
    }

    @Override // p155e.p164b.p165a.AbstractC3391h
    /* renamed from: b */
    public InputStream mo11364b(InputStream inputStream, C3386c cVar) {
        return new C3389f(inputStream, this.f11435b);
    }

    /* renamed from: c */
    public void mo11372c(int i) {
        if (i < 1 || i > 256) {
            throw new C3399p("Delta distance must be in the range [1, 256]: " + i);
        }
        this.f11435b = i;
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
