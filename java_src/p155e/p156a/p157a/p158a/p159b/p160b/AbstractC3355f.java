package p155e.p156a.p157a.p158a.p159b.p160b;

import java.io.InputStream;

/* access modifiers changed from: package-private */
/* renamed from: e.a.a.a.b.b.f */
public abstract class AbstractC3355f {

    /* renamed from: a */
    private static final byte[] f11298a = new byte[0];

    /* renamed from: b */
    private final Class<?>[] f11299b;

    protected AbstractC3355f(Class<?>... clsArr) {
        this.f11299b = clsArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo11302a(Object obj) {
        for (Class<?> cls : this.f11299b) {
            if (cls.isInstance(obj)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract InputStream mo11293b(String str, InputStream inputStream, long j, C3354e eVar, byte[] bArr);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Object mo11303c(C3354e eVar, InputStream inputStream) {
        return null;
    }
}
