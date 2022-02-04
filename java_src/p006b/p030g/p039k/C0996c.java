package p006b.p030g.p039k;

/* renamed from: b.g.k.c */
public final class C0996c {

    /* renamed from: a */
    private final Object f4740a;

    private C0996c(Object obj) {
        this.f4740a = obj;
    }

    /* renamed from: a */
    static C0996c m5667a(Object obj) {
        if (obj == null) {
            return null;
        }
        return new C0996c(obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0996c.class != obj.getClass()) {
            return false;
        }
        Object obj2 = this.f4740a;
        Object obj3 = ((C0996c) obj).f4740a;
        return obj2 == null ? obj3 == null : obj2.equals(obj3);
    }

    public int hashCode() {
        Object obj = this.f4740a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f4740a + "}";
    }
}
