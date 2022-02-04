package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C2894a;
import com.google.android.gms.common.api.C2894a.AbstractC2898d;
import com.google.android.gms.common.internal.C3022p;

/* renamed from: com.google.android.gms.common.api.internal.j0 */
public final class C2943j0<O extends C2894a.AbstractC2898d> {

    /* renamed from: a */
    private final boolean f9850a = false;

    /* renamed from: b */
    private final int f9851b;

    /* renamed from: c */
    private final C2894a<O> f9852c;

    /* renamed from: d */
    private final O f9853d;

    private C2943j0(C2894a<O> aVar, O o) {
        this.f9852c = aVar;
        this.f9853d = o;
        this.f9851b = C3022p.m12362b(aVar, o);
    }

    /* renamed from: a */
    public static <O extends C2894a.AbstractC2898d> C2943j0<O> m12165a(C2894a<O> aVar, O o) {
        return new C2943j0<>(aVar, o);
    }

    /* renamed from: b */
    public final String mo9668b() {
        return this.f9852c.mo9562b();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2943j0)) {
            return false;
        }
        C2943j0 j0Var = (C2943j0) obj;
        return !this.f9850a && !j0Var.f9850a && C3022p.m12361a(this.f9852c, j0Var.f9852c) && C3022p.m12361a(this.f9853d, j0Var.f9853d);
    }

    public final int hashCode() {
        return this.f9851b;
    }
}
