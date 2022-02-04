package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0614d;

/* renamed from: androidx.savedstate.a */
public final class C0748a {

    /* renamed from: a */
    private final AbstractC0749b f3549a;

    /* renamed from: b */
    private final SavedStateRegistry f3550b = new SavedStateRegistry();

    private C0748a(AbstractC0749b bVar) {
        this.f3549a = bVar;
    }

    /* renamed from: a */
    public static C0748a m4448a(AbstractC0749b bVar) {
        return new C0748a(bVar);
    }

    /* renamed from: b */
    public SavedStateRegistry mo4510b() {
        return this.f3550b;
    }

    /* renamed from: c */
    public void mo4511c(Bundle bundle) {
        AbstractC0614d n = this.f3549a.mo140n();
        if (n.mo3665b() == AbstractC0614d.EnumC0616b.INITIALIZED) {
            n.mo3664a(new Recreator(this.f3549a));
            this.f3550b.mo4506b(n, bundle);
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    /* renamed from: d */
    public void mo4512d(Bundle bundle) {
        this.f3550b.mo4507c(bundle);
    }
}
