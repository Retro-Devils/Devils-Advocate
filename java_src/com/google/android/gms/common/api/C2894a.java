package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.AbstractC2911f;
import com.google.android.gms.common.api.C2894a.AbstractC2898d;
import com.google.android.gms.common.internal.AbstractC2978c;
import com.google.android.gms.common.internal.AbstractC3009k;
import com.google.android.gms.common.internal.C2992d;
import com.google.android.gms.common.internal.C3027r;
import java.util.Set;
import p069c.p073b.p074a.p075a.p077b.C1281c;

/* renamed from: com.google.android.gms.common.api.a */
public final class C2894a<O extends AbstractC2898d> {

    /* renamed from: a */
    private final AbstractC2895a<?, O> f9756a;

    /* renamed from: b */
    private final C2903g<?> f9757b;

    /* renamed from: c */
    private final String f9758c;

    /* renamed from: com.google.android.gms.common.api.a$a */
    public static abstract class AbstractC2895a<T extends AbstractC2902f, O> extends AbstractC2901e<T, O> {
        /* renamed from: a */
        public abstract T mo6385a(Context context, Looper looper, C2992d dVar, O o, AbstractC2911f.AbstractC2912a aVar, AbstractC2911f.AbstractC2913b bVar);
    }

    /* renamed from: com.google.android.gms.common.api.a$b */
    public interface AbstractC2896b {
    }

    /* renamed from: com.google.android.gms.common.api.a$c */
    public static class C2897c<C extends AbstractC2896b> {
    }

    /* renamed from: com.google.android.gms.common.api.a$d */
    public interface AbstractC2898d {

        /* renamed from: com.google.android.gms.common.api.a$d$a */
        public interface AbstractC2899a extends AbstractC2898d {
            /* renamed from: h */
            Account mo9564h();
        }

        /* renamed from: com.google.android.gms.common.api.a$d$b */
        public interface AbstractC2900b extends AbstractC2898d {
            /* renamed from: a */
            GoogleSignInAccount mo9565a();
        }
    }

    /* renamed from: com.google.android.gms.common.api.a$e */
    public static abstract class AbstractC2901e<T extends AbstractC2896b, O> {
    }

    /* renamed from: com.google.android.gms.common.api.a$f */
    public interface AbstractC2902f extends AbstractC2896b {
        /* renamed from: a */
        void mo9566a(AbstractC2978c.AbstractC2983e eVar);

        /* renamed from: c */
        boolean mo9567c();

        /* renamed from: d */
        C1281c[] mo9568d();

        /* renamed from: e */
        boolean mo9569e();

        /* renamed from: f */
        String mo9570f();

        /* renamed from: h */
        void mo9571h(AbstractC3009k kVar, Set<Scope> set);

        /* renamed from: j */
        void mo9572j(AbstractC2978c.AbstractC2981c cVar);

        /* renamed from: k */
        void mo9573k();

        /* renamed from: m */
        boolean mo6396m();

        /* renamed from: o */
        boolean mo9574o();

        /* renamed from: q */
        int mo6358q();
    }

    /* renamed from: com.google.android.gms.common.api.a$g */
    public static final class C2903g<C extends AbstractC2902f> extends C2897c<C> {
    }

    /* renamed from: com.google.android.gms.common.api.a$h */
    public interface AbstractC2904h<T extends IInterface> extends AbstractC2896b {
        /* renamed from: g */
        String mo9575g();

        /* renamed from: i */
        T mo9576i(IBinder iBinder);

        /* renamed from: n */
        String mo9577n();

        /* renamed from: p */
        void mo9578p(int i, T t);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.google.android.gms.common.api.a$a<C extends com.google.android.gms.common.api.a$f, O extends com.google.android.gms.common.api.a$d> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.google.android.gms.common.api.a$g<C extends com.google.android.gms.common.api.a$f> */
    /* JADX WARN: Multi-variable type inference failed */
    public <C extends AbstractC2902f> C2894a(String str, AbstractC2895a<C, O> aVar, C2903g<C> gVar) {
        C3027r.m12377i(aVar, "Cannot construct an Api with a null ClientBuilder");
        C3027r.m12377i(gVar, "Cannot construct an Api with a null ClientKey");
        this.f9758c = str;
        this.f9756a = aVar;
        this.f9757b = gVar;
    }

    /* renamed from: a */
    public final C2897c<?> mo9561a() {
        C2903g<?> gVar = this.f9757b;
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalStateException("This API was constructed with null client keys. This should not be possible.");
    }

    /* renamed from: b */
    public final String mo9562b() {
        return this.f9758c;
    }

    /* renamed from: c */
    public final AbstractC2895a<?, O> mo9563c() {
        C3027r.m12379k(this.f9756a != null, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.f9756a;
    }
}
