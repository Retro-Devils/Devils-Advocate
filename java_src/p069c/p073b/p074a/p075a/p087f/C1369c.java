package p069c.p073b.p074a.p075a.p087f;

import com.google.android.gms.common.api.C2894a;
import com.google.android.gms.common.api.Scope;
import p069c.p073b.p074a.p075a.p087f.p088b.C1357a;

/* renamed from: c.b.a.a.f.c */
public final class C1369c {

    /* renamed from: a */
    private static final C2894a.C2903g<C1357a> f5636a;

    /* renamed from: b */
    private static final C2894a.C2903g<C1357a> f5637b;

    /* renamed from: c */
    public static final C2894a.AbstractC2895a<C1357a, C1355a> f5638c;

    /* renamed from: d */
    private static final C2894a.AbstractC2895a<C1357a, Object> f5639d;

    /* renamed from: e */
    private static final Scope f5640e = new Scope("profile");

    /* renamed from: f */
    private static final Scope f5641f = new Scope("email");

    /* renamed from: g */
    public static final C2894a<C1355a> f5642g;

    /* renamed from: h */
    private static final C2894a<Object> f5643h;

    static {
        C2894a.C2903g<C1357a> gVar = new C2894a.C2903g<>();
        f5636a = gVar;
        C2894a.C2903g<C1357a> gVar2 = new C2894a.C2903g<>();
        f5637b = gVar2;
        C1370d dVar = new C1370d();
        f5638c = dVar;
        C1371e eVar = new C1371e();
        f5639d = eVar;
        f5642g = new C2894a<>("SignIn.API", dVar, gVar);
        f5643h = new C2894a<>("SignIn.INTERNAL_API", eVar, gVar2);
    }
}
