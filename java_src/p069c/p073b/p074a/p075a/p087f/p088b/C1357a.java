package p069c.p073b.p074a.p075a.p087f.p088b;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.p146a.C2892a;
import com.google.android.gms.common.api.AbstractC2911f;
import com.google.android.gms.common.internal.AbstractC2978c;
import com.google.android.gms.common.internal.AbstractC3002h;
import com.google.android.gms.common.internal.C2992d;
import com.google.android.gms.common.internal.C3027r;
import com.google.android.gms.common.internal.C3028s;
import p069c.p073b.p074a.p075a.p077b.C1286g;
import p069c.p073b.p074a.p075a.p087f.AbstractC1372f;
import p069c.p073b.p074a.p075a.p087f.C1355a;

/* renamed from: c.b.a.a.f.b.a */
public class C1357a extends AbstractC3002h<AbstractC1363g> implements AbstractC1372f {

    /* renamed from: G */
    private final boolean f5624G;

    /* renamed from: H */
    private final C2992d f5625H;

    /* renamed from: I */
    private final Bundle f5626I;

    /* renamed from: J */
    private Integer f5627J;

    private C1357a(Context context, Looper looper, boolean z, C2992d dVar, Bundle bundle, AbstractC2911f.AbstractC2912a aVar, AbstractC2911f.AbstractC2913b bVar) {
        super(context, looper, 44, dVar, aVar, bVar);
        this.f5624G = true;
        this.f5625H = dVar;
        this.f5626I = bundle;
        this.f5627J = dVar.mo9749d();
    }

    public C1357a(Context context, Looper looper, boolean z, C2992d dVar, C1355a aVar, AbstractC2911f.AbstractC2912a aVar2, AbstractC2911f.AbstractC2913b bVar) {
        this(context, looper, true, dVar, m6929i0(dVar), aVar2, bVar);
    }

    /* renamed from: i0 */
    public static Bundle m6929i0(C2992d dVar) {
        C1355a h = dVar.mo9753h();
        Integer d = dVar.mo9749d();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", dVar.mo9746a());
        if (d != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", d.intValue());
        }
        if (h != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", h.mo6392i());
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", h.mo6391g());
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", h.mo6389e());
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", h.mo6390f());
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", h.mo6387c());
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", h.mo6393j());
            if (h.mo6386b() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion", h.mo6386b().longValue());
            }
            if (h.mo6388d() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.realClientLibraryVersion", h.mo6388d().longValue());
            }
        }
        return bundle;
    }

    @Override // p069c.p073b.p074a.p075a.p087f.AbstractC1372f
    /* renamed from: b */
    public final void mo6394b(AbstractC1361e eVar) {
        C3027r.m12377i(eVar, "Expecting a valid ISignInCallbacks");
        try {
            Account b = this.f5625H.mo9747b();
            GoogleSignInAccount googleSignInAccount = null;
            if ("<<default account>>".equals(b.name)) {
                googleSignInAccount = C2892a.m11994a(mo9725w()).mo9540b();
            }
            ((AbstractC1363g) mo9701A()).mo6406V(new C1365i(new C3028s(b, this.f5627J.intValue(), googleSignInAccount)), eVar);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                eVar.mo6405Q(new C1367k(8));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC2978c
    /* renamed from: g */
    public String mo6354g() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC2978c
    /* renamed from: i */
    public /* synthetic */ IInterface mo6355i(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof AbstractC1363g ? (AbstractC1363g) queryLocalInterface : new C1364h(iBinder);
    }

    @Override // p069c.p073b.p074a.p075a.p087f.AbstractC1372f
    /* renamed from: l */
    public final void mo6395l() {
        mo9717j(new AbstractC2978c.C2982d());
    }

    @Override // com.google.android.gms.common.api.C2894a.AbstractC2902f, com.google.android.gms.common.internal.AbstractC2978c
    /* renamed from: m */
    public boolean mo6396m() {
        return this.f5624G;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC2978c
    /* renamed from: n */
    public String mo6357n() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC3002h, com.google.android.gms.common.api.C2894a.AbstractC2902f, com.google.android.gms.common.internal.AbstractC2978c
    /* renamed from: q */
    public int mo6358q() {
        return C1286g.f5547a;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.AbstractC2978c
    /* renamed from: x */
    public Bundle mo6397x() {
        if (!mo9725w().getPackageName().equals(this.f5625H.mo9751f())) {
            this.f5626I.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f5625H.mo9751f());
        }
        return this.f5626I;
    }
}
