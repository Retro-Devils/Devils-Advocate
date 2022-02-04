package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.AbstractC2914g;
import com.google.android.gms.common.api.AbstractC2964k;
import com.google.android.gms.common.api.C2905b;
import com.google.android.gms.common.api.C2963j;
import com.google.android.gms.common.api.Status;
import p069c.p073b.p074a.p075a.p089g.AbstractC1376d;
import p069c.p073b.p074a.p075a.p089g.C1377e;

/* renamed from: com.google.android.gms.common.internal.q */
public class C3024q {

    /* renamed from: a */
    private static final AbstractC3026b f10033a = new C3038z();

    /* renamed from: com.google.android.gms.common.internal.q$a */
    public interface AbstractC3025a<R extends AbstractC2964k, T> {
        /* renamed from: a */
        T mo9700a(R r);
    }

    /* renamed from: com.google.android.gms.common.internal.q$b */
    public interface AbstractC3026b {
        /* renamed from: a */
        C2905b mo9804a(Status status);
    }

    /* renamed from: a */
    public static <R extends AbstractC2964k, T extends C2963j<R>> AbstractC1376d<T> m12365a(AbstractC2914g<R> gVar, T t) {
        return m12366b(gVar, new C2977b0(t));
    }

    /* renamed from: b */
    public static <R extends AbstractC2964k, T> AbstractC1376d<T> m12366b(AbstractC2914g<R> gVar, AbstractC3025a<R, T> aVar) {
        AbstractC3026b bVar = f10033a;
        C1377e eVar = new C1377e();
        gVar.mo9595a(new C2975a0(gVar, eVar, aVar, bVar));
        return eVar.mo6425a();
    }
}
