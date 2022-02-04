package p006b.p060q;

import android.os.IBinder;

/* renamed from: b.q.k0 */
class C1139k0 implements AbstractC1149m0 {

    /* renamed from: a */
    private final IBinder f5126a;

    C1139k0(IBinder iBinder) {
        this.f5126a = iBinder;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C1139k0) && ((C1139k0) obj).f5126a.equals(this.f5126a);
    }

    public int hashCode() {
        return this.f5126a.hashCode();
    }
}
