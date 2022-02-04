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
    private final Account f9961a;

    /* renamed from: b */
    private final Set<Scope> f9962b;

    /* renamed from: c */
    private final Set<Scope> f9963c;

    /* renamed from: d */
    private final Map<C2894a<?>, C2994b> f9964d;

    /* renamed from: e */
    private final int f9965e;

    /* renamed from: f */
    private final View f9966f;

    /* renamed from: g */
    private final String f9967g;

    /* renamed from: h */
    private final String f9968h;

    /* renamed from: i */
    private final C1355a f9969i;

    /* renamed from: j */
    private final boolean f9970j;

    /* renamed from: k */
    private Integer f9971k;

    /* renamed from: com.google.android.gms.common.internal.d$a */
    public static final class C2993a {

        /* renamed from: a */
        private Account f9972a;

        /* renamed from: b */
        private C0825b<Scope> f9973b;

        /* renamed from: c */
        private Map<C2894a<?>, C2994b> f9974c;

        /* renamed from: d */
        private int f9975d = 0;

        /* renamed from: e */
        private View f9976e;

        /* renamed from: f */
        private String f9977f;

        /* renamed from: g */
        private String f9978g;

        /* renamed from: h */
        private C1355a f9979h = C1355a.f5623a;

        /* renamed from: i */
        private boolean f9980i;

        /* renamed from: a */
        public final C2993a mo9755a(Collection<Scope> collection) {
            if (this.f9973b == null) {
                this.f9973b = new C0825b<>();
            }
            this.f9973b.addAll(collection);
            return this;
        }

        /* renamed from: b */
        public final C2992d mo9756b() {
            return new C2992d(this.f9972a, this.f9973b, this.f9974c, this.f9975d, this.f9976e, this.f9977f, this.f9978g, this.f9979h, this.f9980i);
        }

        /* renamed from: c */
        public final C2993a mo9757c(Account account) {
            this.f9972a = account;
            return this;
        }

        /* renamed from: d */
        public final C2993a mo9758d(String str) {
            this.f9978g = str;
            return this;
        }

        /* renamed from: e */
        public final C2993a mo9759e(String str) {
            this.f9977f = str;
            return this;
        }
    }

    /* renamed from: com.google.android.gms.common.internal.d$b */
    public static final class C2994b {

        /* renamed from: a */
        public final Set<Scope> f9981a;
    }

    public C2992d(Account account, Set<Scope> set, Map<C2894a<?>, C2994b> map, int i, View view, String str, String str2, C1355a aVar, boolean z) {
        this.f9961a = account;
        Set<Scope> unmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.f9962b = unmodifiableSet;
        map = map == null ? Collections.EMPTY_MAP : map;
        this.f9964d = map;
        this.f9966f = view;
        this.f9965e = i;
        this.f9967g = str;
        this.f9968h = str2;
        this.f9969i = aVar;
        this.f9970j = z;
        HashSet hashSet = new HashSet(unmodifiableSet);
        for (C2994b bVar : map.values()) {
            hashSet.addAll(bVar.f9981a);
        }
        this.f9963c = Collections.unmodifiableSet(hashSet);
    }

    @Nullable
    /* renamed from: a */
    public final Account mo9746a() {
        return this.f9961a;
    }

    /* renamed from: b */
    public final Account mo9747b() {
        Account account = this.f9961a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    /* renamed from: c */
    public final Set<Scope> mo9748c() {
        return this.f9963c;
    }

    @Nullable
    /* renamed from: d */
    public final Integer mo9749d() {
        return this.f9971k;
    }

    @Nullable
    /* renamed from: e */
    public final String mo9750e() {
        return this.f9968h;
    }

    @Nullable
    /* renamed from: f */
    public final String mo9751f() {
        return this.f9967g;
    }

    /* renamed from: g */
    public final Set<Scope> mo9752g() {
        return this.f9962b;
    }

    @Nullable
    /* renamed from: h */
    public final C1355a mo9753h() {
        return this.f9969i;
    }

    /* renamed from: i */
    public final void mo9754i(Integer num) {
        this.f9971k = num;
    }
}
