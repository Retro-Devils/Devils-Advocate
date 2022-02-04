package p069c.p073b.p074a.p108c.p109a.p110f;

import android.app.Activity;
import android.content.Context;
import p069c.p073b.p074a.p108c.p109a.p110f.AbstractC1523p;

/* renamed from: c.b.a.c.a.f.a */
public abstract class AbstractC1493a {

    /* renamed from: a */
    private static final AbstractC1493a f6286a = m7370d();

    /* renamed from: a */
    public static AbstractC1493a m7369a() {
        return f6286a;
    }

    /* renamed from: d */
    private static AbstractC1493a m7370d() {
        try {
            try {
                return (AbstractC1493a) Class.forName("com.google.android.youtube.api.locallylinked.LocallyLinkedFactory").asSubclass(AbstractC1493a.class).newInstance();
            } catch (InstantiationException e) {
                throw new IllegalStateException(e);
            } catch (IllegalAccessException e2) {
                throw new IllegalStateException(e2);
            }
        } catch (ClassNotFoundException unused) {
            return new C1495c();
        }
    }

    /* renamed from: b */
    public abstract AbstractC1496d mo6745b(Context context, String str, AbstractC1523p.AbstractC1524a aVar, AbstractC1523p.AbstractC1525b bVar);

    /* renamed from: c */
    public abstract AbstractC1499f mo6746c(Activity activity, AbstractC1496d dVar, boolean z);
}
