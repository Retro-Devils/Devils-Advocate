package com.google.android.gms.common.api;

import android.text.TextUtils;
import com.google.android.gms.common.api.internal.C2943j0;
import java.util.ArrayList;
import p006b.p021d.C0823a;
import p069c.p073b.p074a.p075a.p077b.C1279a;

/* renamed from: com.google.android.gms.common.api.c */
public class C2906c extends Exception {

    /* renamed from: b */
    private final C0823a<C2943j0<?>, C1279a> f9760b;

    public C2906c(C0823a<C2943j0<?>, C1279a> aVar) {
        this.f9760b = aVar;
    }

    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (C2943j0<?> j0Var : this.f9760b.keySet()) {
            C1279a aVar = this.f9760b.get(j0Var);
            if (aVar.mo6266l()) {
                z = false;
            }
            String b = j0Var.mo9668b();
            String valueOf = String.valueOf(aVar);
            StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 2 + valueOf.length());
            sb.append(b);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z ? "None of the queried APIs are available. " : "Some of the queried APIs are unavailable. ");
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
