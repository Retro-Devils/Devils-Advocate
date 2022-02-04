package p069c.p073b.p074a.p075a.p077b.p079l;

import android.content.Context;

/* renamed from: c.b.a.a.b.l.b */
public class C1292b {

    /* renamed from: a */
    private static C1292b f5569a = new C1292b();

    /* renamed from: b */
    private C1291a f5570b = null;

    /* renamed from: a */
    public static C1291a m6810a(Context context) {
        return f5569a.m6811b(context);
    }

    /* renamed from: b */
    private final synchronized C1291a m6811b(Context context) {
        if (this.f5570b == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f5570b = new C1291a(context);
        }
        return this.f5570b;
    }
}
