package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.p */
public abstract class AbstractC0631p {

    /* renamed from: a */
    private final Map<String, Object> f3048a = new HashMap();

    /* renamed from: b */
    private volatile boolean f3049b = false;

    /* renamed from: b */
    private static void m3288b(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3683a() {
        this.f3049b = true;
        Map<String, Object> map = this.f3048a;
        if (map != null) {
            synchronized (map) {
                for (Object obj : this.f3048a.values()) {
                    m3288b(obj);
                }
            }
        }
        mo2847c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo2847c() {
    }
}
