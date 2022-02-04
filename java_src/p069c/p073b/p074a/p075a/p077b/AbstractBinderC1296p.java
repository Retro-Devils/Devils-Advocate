package p069c.p073b.p074a.p075a.p077b;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractBinderC3017m0;
import com.google.android.gms.common.internal.AbstractC3014l0;
import com.google.android.gms.common.internal.C3027r;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import p069c.p073b.p074a.p075a.p080c.AbstractC1302a;
import p069c.p073b.p074a.p075a.p080c.BinderC1304b;

/* access modifiers changed from: package-private */
/* renamed from: c.b.a.a.b.p */
public abstract class AbstractBinderC1296p extends AbstractBinderC3017m0 {

    /* renamed from: a */
    private int f5573a;

    protected AbstractBinderC1296p(byte[] bArr) {
        C3027r.m12369a(bArr.length == 25);
        this.f5573a = Arrays.hashCode(bArr);
    }

    /* renamed from: m */
    protected static byte[] m6813m(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC3014l0
    /* renamed from: M */
    public final AbstractC1302a mo6302M() {
        return BinderC1304b.m6823m(mo6305j());
    }

    public boolean equals(Object obj) {
        AbstractC1302a M;
        if (obj != null && (obj instanceof AbstractC3014l0)) {
            try {
                AbstractC3014l0 l0Var = (AbstractC3014l0) obj;
                if (l0Var.mo6306n0() == hashCode() && (M = l0Var.mo6302M()) != null) {
                    return Arrays.equals(mo6305j(), (byte[]) BinderC1304b.m6822j(M));
                }
                return false;
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f5573a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public abstract byte[] mo6305j();

    @Override // com.google.android.gms.common.internal.AbstractC3014l0
    /* renamed from: n0 */
    public final int mo6306n0() {
        return hashCode();
    }
}
