package com.google.android.gms.common.api;

import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.C2894a;
import com.google.android.gms.common.api.internal.AbstractC2925c;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import javax.annotation.concurrent.GuardedBy;
import p069c.p073b.p074a.p075a.p077b.C1279a;

/* renamed from: com.google.android.gms.common.api.f */
public abstract class AbstractC2911f {
    @GuardedBy("sAllClients")

    /* renamed from: a */
    private static final Set<AbstractC2911f> f9783a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: com.google.android.gms.common.api.f$a */
    public interface AbstractC2912a {
        /* renamed from: j */
        void mo9592j(int i);

        /* renamed from: m */
        void mo9593m(Bundle bundle);
    }

    /* renamed from: com.google.android.gms.common.api.f$b */
    public interface AbstractC2913b {
        /* renamed from: i */
        void mo9594i(C1279a aVar);
    }

    /* renamed from: a */
    public <A extends C2894a.AbstractC2896b, R extends AbstractC2964k, T extends AbstractC2925c<R, A>> T mo9590a(T t) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public Looper mo9591b() {
        throw new UnsupportedOperationException();
    }
}
