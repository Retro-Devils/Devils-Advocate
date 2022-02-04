package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.g */
public final class C2936g<L> {

    /* renamed from: a */
    private final L f9851a;

    /* renamed from: b */
    private final String f9852b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2936g)) {
            return false;
        }
        C2936g gVar = (C2936g) obj;
        return this.f9851a == gVar.f9851a && this.f9852b.equals(gVar.f9852b);
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f9851a) * 31) + this.f9852b.hashCode();
    }
}
