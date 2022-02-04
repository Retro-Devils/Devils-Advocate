package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.g */
public final class C2936g<L> {

    /* renamed from: a */
    private final L f9843a;

    /* renamed from: b */
    private final String f9844b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2936g)) {
            return false;
        }
        C2936g gVar = (C2936g) obj;
        return this.f9843a == gVar.f9843a && this.f9844b.equals(gVar.f9844b);
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f9843a) * 31) + this.f9844b.hashCode();
    }
}
