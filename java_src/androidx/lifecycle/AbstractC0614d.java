package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: androidx.lifecycle.d */
public abstract class AbstractC0614d {

    /* renamed from: a */
    AtomicReference<Object> f3026a = new AtomicReference<>();

    /* renamed from: androidx.lifecycle.d$a */
    public enum EnumC0615a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY
    }

    /* renamed from: androidx.lifecycle.d$b */
    public enum EnumC0616b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        /* renamed from: a */
        public boolean mo3667a(EnumC0616b bVar) {
            return compareTo(bVar) >= 0;
        }
    }

    /* renamed from: a */
    public abstract void mo3664a(AbstractC0618f fVar);

    /* renamed from: b */
    public abstract EnumC0616b mo3665b();

    /* renamed from: c */
    public abstract void mo3666c(AbstractC0618f fVar);
}
