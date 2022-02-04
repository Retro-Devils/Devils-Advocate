package p069c.p073b.p074a.p090b.p104w;

import android.graphics.Typeface;

/* renamed from: c.b.a.b.w.a */
public final class C1434a extends AbstractC1442f {

    /* renamed from: a */
    private final Typeface f6069a;

    /* renamed from: b */
    private final AbstractC1435a f6070b;

    /* renamed from: c */
    private boolean f6071c;

    /* renamed from: c.b.a.b.w.a$a */
    public interface AbstractC1435a {
        /* renamed from: a */
        void mo6558a(Typeface typeface);
    }

    public C1434a(AbstractC1435a aVar, Typeface typeface) {
        this.f6069a = typeface;
        this.f6070b = aVar;
    }

    /* renamed from: d */
    private void m7068d(Typeface typeface) {
        if (!this.f6071c) {
            this.f6070b.mo6558a(typeface);
        }
    }

    @Override // p069c.p073b.p074a.p090b.p104w.AbstractC1442f
    /* renamed from: a */
    public void mo6555a(int i) {
        m7068d(this.f6069a);
    }

    @Override // p069c.p073b.p074a.p090b.p104w.AbstractC1442f
    /* renamed from: b */
    public void mo6556b(Typeface typeface, boolean z) {
        m7068d(typeface);
    }

    /* renamed from: c */
    public void mo6557c() {
        this.f6071c = true;
    }
}
