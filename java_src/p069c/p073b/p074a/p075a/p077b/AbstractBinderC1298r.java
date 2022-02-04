package p069c.p073b.p074a.p075a.p077b;

import java.lang.ref.WeakReference;

/* renamed from: c.b.a.a.b.r */
abstract class AbstractBinderC1298r extends AbstractBinderC1296p {

    /* renamed from: b */
    private static final WeakReference<byte[]> f5575b = new WeakReference<>(null);

    /* renamed from: c */
    private WeakReference<byte[]> f5576c = f5575b;

    AbstractBinderC1298r(byte[] bArr) {
        super(bArr);
    }

    /* access modifiers changed from: package-private */
    @Override // p069c.p073b.p074a.p075a.p077b.AbstractBinderC1296p
    /* renamed from: j */
    public final byte[] mo6305j() {
        byte[] bArr;
        synchronized (this) {
            bArr = this.f5576c.get();
            if (bArr == null) {
                bArr = mo6307w0();
                this.f5576c = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w0 */
    public abstract byte[] mo6307w0();
}
