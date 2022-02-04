package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.C2894a;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import p006b.p021d.C0825b;
import p069c.p073b.p074a.p075a.p087f.C1355a;

/* renamed from: com.google.android.gms.common.internal.d */
public final class C2992d {

    /* renamed from: a */
    private final Account f9953a;

    /* renamed from: b */
    private final Set<Scope> f9954b;

    /* renamed from: c */
    private final Set<Scope> f9955c;

    /* renamed from: d */
    private final Map<C2894a<?>, C2994b> f9956d;

    /* renamed from: e */
    private final int f9957e;

    /* renamed from: f */
    private final View f9958f;

    /* renamed from: g */
    private final String f9959g;

    /* renamed from: h */
    private final String f9960h;

    /* renamed from: i */
    private final C1355a f9961i;

    /* renamed from: j */
    private final boolean f9962j;

    /* renamed from: k */
    private Integer f9963k;

    /* renamed from: com.google.android.gms.common.internal.d$a */
    public static final class C2993a {

        /* renamed from: a */
        private Account f9964a;

        /* renamed from: b */
        private C0825b<Scope> f9965b;

        /* renamed from: c */
        private Map<C2894a<?>, C2994b> f9966c;

        /* renamed from: d */
        private int f9967d = 0;

        /* renamed from: e */
        private View f9968e;

        /* renamed from: f */
        private String f9969f;

        /* renamed from: g */
        private String f9970g;

        /* renamed from: h */
        private C1355a f9971h = C1355a.f5615a;

        /* renamed from: i */
        private boolean f9972i;

        /* renamed from: a */
        public final C2993a mo9755a(Collection<Scope> collection) {
            if (this.f9965b == null) {
                this.f9965b = new C0825b<>();
            }
            this.f9965b.addAll(collection);
            return this;
        }

        /* renamed from: b */
        public final C2992d mo9756b() {
            return new C2992d(this.f9964a, this.f9965b, this.f9966c, this.f9967d, this.f9968e, this.f9969f, this.f9970g, this.f9971h, this.f9972i);
        }

        /* renamed from: c */
        public final C2993a mo9757c(Account account) {
            this.f9964a = account;
            return this;
        }

        /* renamed from: d */
        public final C2993a mo9758d(String str) {
            this.f9970g = str;
            return this;
        }

        /* renamed from: e */
        public final C2993a mo9759e(String str) {
            this.f9969f = str;
            return this;
        }
    }

    /* renamed from: com.google.android.gms.common.internal.d$b */
    public static final class C2994b {

        /* renamed from: a */
        public final Set<Scope> f9973a;
    }

    public C2992d(Account account, Set<Scope> set, Map<C2894a<?>, C2994b> map, int i, View view, String str, String str2, C1355a aVar, boolean z) {
        this.f9953a = account;
        Set<Scope> unmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f9954b = unmodifiableSet;
        map = map == null ? Collections.EMPTY_MAP : map;
        this.f9956d = map;
        this.f9958f = view;
        this.f9957e = i;
        this.f9959g = str;
        this.f9960h = str2;
        this.f9961i = aVar;
        this.f9962j = z;
        HashSet hashSet = new HashSet(unmodifiableSet);
        for (C2994b bVar : map.values()) {
            hashSet.addAll(bVar.f9973a);
        }
        this.f9955c = Collections.unmodifiableSet(hashSet);
    }

    @Nullable
    /* renamed from: a */
    public final Account mo9746a() {
        return this.f9953a;
    }

    /* renamed from: b */
    public final Account mo9747b() {
        Account account = this.f9953a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    /* renamed from: c */
    public final Set<Scope> mo9748c() {
        return this.f9955c;
    }

    @Nullable
    /* renamed from: d */
    public final Integer mo9749d() {
        return this.f9963k;
    }

    @Nullable
    /* renamed from: e */
    public final String mo9750e() {
        return this.f9960h;
    }

    @Nullable
    /* renamed from: f */
    public final String mo9751f() {
        return this.f9959g;
    }

    /* renamed from: g */
    public final Set<Scope> mo9752g() {
        return this.f9954b;
    }

    @Nullable
    /* renamed from: h */
    public final C1355a mo9753h() {
        return this.f9961i;
    }

    /* renamed from: i */
    public final void mo9754i(Integer num) {
        this.f9963k = num;
    }
}
