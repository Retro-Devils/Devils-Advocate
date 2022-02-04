package androidx.lifecycle;

/* renamed from: androidx.lifecycle.q */
public class C0632q {

    /* renamed from: a */
    private final AbstractC0633a f3050a;

    /* renamed from: b */
    private final C0635r f3051b;

    /* renamed from: androidx.lifecycle.q$a */
    public interface AbstractC0633a {
        /* renamed from: a */
        <T extends AbstractC0631p> T mo2859a(Class<T> cls);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.q$b */
    public static abstract class AbstractC0634b implements AbstractC0633a {
        AbstractC0634b() {
        }

        @Override // androidx.lifecycle.C0632q.AbstractC0633a
        /* renamed from: a */
        public <T extends AbstractC0631p> T mo2859a(Class<T> cls) {
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
        }

        /* renamed from: b */
        public abstract <T extends AbstractC0631p> T mo3686b(String str, Class<T> cls);
    }

    public C0632q(C0635r rVar, AbstractC0633a aVar) {
        this.f3050a = aVar;
        this.f3051b = rVar;
    }

    /* renamed from: a */
    public <T extends AbstractC0631p> T mo3684a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) mo3685b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* renamed from: b */
    public <T extends AbstractC0631p> T mo3685b(String str, Class<T> cls) {
        T t = (T) this.f3051b.mo3688b(str);
        if (cls.isInstance(t)) {
            return t;
        }
        AbstractC0633a aVar = this.f3050a;
        T t2 = aVar instanceof AbstractC0634b ? (T) ((AbstractC0634b) aVar).mo3686b(str, cls) : (T) aVar.mo2859a(cls);
        this.f3051b.mo3689c(str, t2);
        return t2;
    }
}
