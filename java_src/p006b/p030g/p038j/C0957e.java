package p006b.p030g.p038j;

/* renamed from: b.g.j.e */
public class C0957e<F, S> {

    /* renamed from: a */
    public final F f4654a;

    /* renamed from: b */
    public final S f4655b;

    public boolean equals(Object obj) {
        if (!(obj instanceof C0957e)) {
            return false;
        }
        C0957e eVar = (C0957e) obj;
        return C0956d.m5483a(eVar.f4654a, this.f4654a) && C0956d.m5483a(eVar.f4655b, this.f4655b);
    }

    public int hashCode() {
        F f = this.f4654a;
        int i = 0;
        int hashCode = f == null ? 0 : f.hashCode();
        S s = this.f4655b;
        if (s != null) {
            i = s.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "Pair{" + String.valueOf(this.f4654a) + " " + String.valueOf(this.f4655b) + "}";
    }
}
