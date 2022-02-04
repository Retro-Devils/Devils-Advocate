package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.C2894a;
import com.google.android.gms.common.api.C2894a.AbstractC2898d;
import com.google.android.gms.common.api.internal.AbstractC2925c;
import com.google.android.gms.common.api.internal.AbstractC2940i;
import com.google.android.gms.common.api.internal.BinderC2962z;
import com.google.android.gms.common.api.internal.C2920a;
import com.google.android.gms.common.api.internal.C2927d;
import com.google.android.gms.common.api.internal.C2943j0;
import com.google.android.gms.common.api.internal.C2958v;
import com.google.android.gms.common.internal.C2992d;
import com.google.android.gms.common.internal.C3027r;
import java.util.Collections;

/* renamed from: com.google.android.gms.common.api.e */
public class C2908e<O extends C2894a.AbstractC2898d> {

    /* renamed from: a */
    private final Context f9761a;

    /* renamed from: b */
    private final C2894a<O> f9762b;

    /* renamed from: c */
    private final O f9763c;

    /* renamed from: d */
    private final C2943j0<O> f9764d;

    /* renamed from: e */
    private final Looper f9765e;

    /* renamed from: f */
    private final int f9766f;

    /* renamed from: g */
    private final AbstractC2911f f9767g;

    /* renamed from: h */
    private final AbstractC2940i f9768h;

    /* renamed from: i */
    protected final C2927d f9769i;

    /* renamed from: com.google.android.gms.common.api.e$a */
    public static class C2909a {

        /* renamed from: a */
        public static final C2909a f9770a = new C2910a().mo9588a();

        /* renamed from: b */
        public final AbstractC2940i f9771b;

        /* renamed from: c */
        public final Looper f9772c;

        /* renamed from: com.google.android.gms.common.api.e$a$a */
        public static class C2910a {

            /* renamed from: a */
            private AbstractC2940i f9773a;

            /* renamed from: b */
            private Looper f9774b;

            /* renamed from: a */
            public C2909a mo9588a() {
                if (this.f9773a == null) {
                    this.f9773a = new C2920a();
                }
                if (this.f9774b == null) {
                    this.f9774b = Looper.getMainLooper();
                }
                return new C2909a(this.f9773a, this.f9774b);
            }

            /* renamed from: b */
            public C2910a mo9589b(AbstractC2940i iVar) {
                C3027r.m12377i(iVar, "StatusExceptionMapper must not be null.");
                this.f9773a = iVar;
                return this;
            }
        }

        private C2909a(AbstractC2940i iVar, Account account, Looper looper) {
            this.f9771b = iVar;
            this.f9772c = looper;
        }
    }

    public C2908e(Context context, C2894a<O> aVar, O o, C2909a aVar2) {
        C3027r.m12377i(context, "Null context is not permitted.");
        C3027r.m12377i(aVar, "Api must not be null.");
        C3027r.m12377i(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        this.f9761a = applicationContext;
        this.f9762b = aVar;
        this.f9763c = o;
        this.f9765e = aVar2.f9772c;
        this.f9764d = C2943j0.m12165a(aVar, o);
        this.f9767g = new C2958v(this);
        C2927d f = C2927d.m12078f(applicationContext);
        this.f9769i = f;
        this.f9766f = f.mo9630h();
        this.f9768h = aVar2.f9771b;
        f.mo9628c(this);
    }

    @Deprecated
    public C2908e(Context context, C2894a<O> aVar, O o, AbstractC2940i iVar) {
        this(context, aVar, o, new C2909a.C2910a().mo9589b(iVar).mo9588a());
    }

    /* renamed from: g */
    private final <A extends C2894a.AbstractC2896b, T extends AbstractC2925c<? extends AbstractC2964k, A>> T m12030g(int i, T t) {
        t.mo9602k();
        this.f9769i.mo9629d(this, i, t);
        return t;
    }

    /* renamed from: a */
    public AbstractC2911f mo9580a() {
        return this.f9767g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C2992d.C2993a mo9581b() {
        Account account;
        GoogleSignInAccount a;
        GoogleSignInAccount a2;
        C2992d.C2993a aVar = new C2992d.C2993a();
        O o = this.f9763c;
        if (!(o instanceof C2894a.AbstractC2898d.AbstractC2900b) || (a2 = ((C2894a.AbstractC2898d.AbstractC2900b) o).mo9565a()) == null) {
            O o2 = this.f9763c;
            account = o2 instanceof C2894a.AbstractC2898d.AbstractC2899a ? ((C2894a.AbstractC2898d.AbstractC2899a) o2).mo9564h() : null;
        } else {
            account = a2.mo9528h();
        }
        C2992d.C2993a c = aVar.mo9757c(account);
        O o3 = this.f9763c;
        return c.mo9755a((!(o3 instanceof C2894a.AbstractC2898d.AbstractC2900b) || (a = ((C2894a.AbstractC2898d.AbstractC2900b) o3).mo9565a()) == null) ? Collections.emptySet() : a.mo9537p()).mo9758d(this.f9761a.getClass().getName()).mo9759e(this.f9761a.getPackageName());
    }

    /* renamed from: c */
    public <A extends C2894a.AbstractC2896b, T extends AbstractC2925c<? extends AbstractC2964k, A>> T mo9582c(T t) {
        return (T) m12030g(0, t);
    }

    /* renamed from: d */
    public final int mo9583d() {
        return this.f9766f;
    }

    /* renamed from: e */
    public Looper mo9584e() {
        return this.f9765e;
    }

    /* renamed from: f */
    public C2894a.AbstractC2902f mo9585f(Looper looper, C2927d.C2928a<O> aVar) {
        return this.f9762b.mo9563c().mo6385a(this.f9761a, looper, mo9581b().mo9756b(), this.f9763c, aVar, aVar);
    }

    /* renamed from: h */
    public BinderC2962z mo9586h(Context context, Handler handler) {
        return new BinderC2962z(context, handler, mo9581b().mo9756b());
    }

    /* renamed from: i */
    public final C2943j0<O> mo9587i() {
        return this.f9764d;
    }
}
