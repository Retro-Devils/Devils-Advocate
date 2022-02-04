package p155e.p164b.p165a.p166s;

/* access modifiers changed from: package-private */
/* renamed from: e.b.a.s.a */
public abstract class AbstractC3402a {

    /* renamed from: a */
    final int f11468a;

    /* renamed from: b */
    final byte[] f11469b = new byte[256];

    /* renamed from: c */
    int f11470c = 0;

    AbstractC3402a(int i) {
        if (i < 1 || i > 256) {
            throw new IllegalArgumentException();
        }
        this.f11468a = i;
    }
}
