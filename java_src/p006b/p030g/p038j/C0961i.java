package p006b.p030g.p038j;

/* renamed from: b.g.j.i */
public final class C0961i {
    /* renamed from: a */
    public static void m5492a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: b */
    public static int m5493b(int i) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    public static <T> T m5494c(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: d */
    public static <T> T m5495d(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }
}
