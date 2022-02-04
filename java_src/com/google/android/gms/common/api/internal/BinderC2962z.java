package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.AbstractC2911f;
import com.google.android.gms.common.api.C2894a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C2992d;
import com.google.android.gms.common.internal.C3027r;
import com.google.android.gms.common.internal.C3029t;
import java.util.Set;
import p069c.p073b.p074a.p075a.p077b.C1279a;
import p069c.p073b.p074a.p075a.p087f.AbstractC1372f;
import p069c.p073b.p074a.p075a.p087f.C1355a;
import p069c.p073b.p074a.p075a.p087f.C1369c;
import p069c.p073b.p074a.p075a.p087f.p088b.BinderC1360d;
import p069c.p073b.p074a.p075a.p087f.p088b.C1367k;

/* renamed from: com.google.android.gms.common.api.internal.z */
public final class BinderC2962z extends BinderC1360d implements AbstractC2911f.AbstractC2912a, AbstractC2911f.AbstractC2913b {

    /* renamed from: a */
    private static C2894a.AbstractC2895a<? extends AbstractC1372f, C1355a> f9885a = C1369c.f5646c;

    /* renamed from: b */
    private final Context f9886b;

    /* renamed from: c */
    private final Handler f9887c;

    /* renamed from: d */
    private final C2894a.AbstractC2895a<? extends AbstractC1372f, C1355a> f9888d;

    /* renamed from: e */
    private Set<Scope> f9889e;

    /* renamed from: f */
    private C2992d f9890f;

    /* renamed from: g */
    private AbstractC1372f f9891g;

    /* renamed from: h */
    private AbstractC2926c0 f9892h;

    public BinderC2962z(Context context, Handler handler, C2992d dVar) {
        this(context, handler, dVar, f9885a);
    }

    public BinderC2962z(Context context, Handler handler, C2992d dVar, C2894a.AbstractC2895a<? extends AbstractC1372f, C1355a> aVar) {
        this.f9886b = context;
        this.f9887c = handler;
        this.f9890f = (C2992d) C3027r.m12377i(dVar, "ClientSettings must not be null");
        this.f9889e = dVar.mo9752g();
        this.f9888d = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: B0 */
    public final void m12184B0(C1367k kVar) {
        C1279a h = kVar.mo6410h();
        if (h.mo6266l()) {
            C3029t i = kVar.mo6411i();
            h = i.mo9811i();
            if (!h.mo6266l()) {
                String valueOf = String.valueOf(h);
                StringBuilder sb = new StringBuilder(valueOf.length() + 48);
                sb.append("Sign-in succeeded with resolve account failure: ");
                sb.append(valueOf);
                Log.wtf("SignInCoordinator", sb.toString(), new Exception());
            } else {
                this.f9892h.mo9626c(i.mo9810h(), this.f9889e);
                this.f9891g.mo9573k();
            }
        }
        this.f9892h.mo9625b(h);
        this.f9891g.mo9573k();
    }

    /* renamed from: A0 */
    public final void mo9681A0() {
        AbstractC1372f fVar = this.f9891g;
        if (fVar != null) {
            fVar.mo9573k();
        }
    }

    @Override // p069c.p073b.p074a.p075a.p087f.p088b.AbstractC1361e
    /* renamed from: Q */
    public final void mo6405Q(C1367k kVar) {
        this.f9887c.post(new RunnableC2924b0(this, kVar));
    }

    @Override // com.google.android.gms.common.api.AbstractC2911f.AbstractC2913b
    /* renamed from: i */
    public final void mo9594i(C1279a aVar) {
        this.f9892h.mo9625b(aVar);
    }

    @Override // com.google.android.gms.common.api.AbstractC2911f.AbstractC2912a
    /* renamed from: j */
    public final void mo9592j(int i) {
        this.f9891g.mo9573k();
    }

    @Override // com.google.android.gms.common.api.AbstractC2911f.AbstractC2912a
    /* renamed from: m */
    public final void mo9593m(Bundle bundle) {
        this.f9891g.mo6394b(this);
    }

    /* renamed from: z0 */
    public final void mo9682z0(AbstractC2926c0 c0Var) {
        AbstractC1372f fVar = this.f9891g;
        if (fVar != null) {
            fVar.mo9573k();
        }
        this.f9890f.mo9754i(Integer.valueOf(System.identityHashCode(this)));
        C2894a.AbstractC2895a<? extends AbstractC1372f, C1355a> aVar = this.f9888d;
        Context context = this.f9886b;
        Looper looper = this.f9887c.getLooper();
        C2992d dVar = this.f9890f;
        this.f9891g = (AbstractC1372f) aVar.mo6385a(context, looper, dVar, dVar.mo9753h(), this, this);
        this.f9892h = c0Var;
        Set<Scope> set = this.f9889e;
        if (set == null || set.isEmpty()) {
            this.f9887c.post(new RunnableC2921a0(this));
        } else {
            this.f9891g.mo6395l();
        }
    }
}
