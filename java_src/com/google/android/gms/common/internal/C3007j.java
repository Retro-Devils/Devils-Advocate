package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.C2894a;
import p069c.p073b.p074a.p075a.p077b.C1284e;

/* renamed from: com.google.android.gms.common.internal.j */
public class C3007j {

    /* renamed from: a */
    private final SparseIntArray f10010a = new SparseIntArray();

    /* renamed from: b */
    private C1284e f10011b;

    public C3007j(C1284e eVar) {
        C3027r.m12376h(eVar);
        this.f10011b = eVar;
    }

    /* renamed from: a */
    public void mo9794a() {
        this.f10010a.clear();
    }

    /* renamed from: b */
    public int mo9795b(Context context, C2894a.AbstractC2902f fVar) {
        C3027r.m12376h(context);
        C3027r.m12376h(fVar);
        int i = 0;
        if (!fVar.mo9574o()) {
            return 0;
        }
        int q = fVar.mo6358q();
        int i2 = this.f10010a.get(q, -1);
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= this.f10010a.size()) {
                i = i2;
                break;
            }
            int keyAt = this.f10010a.keyAt(i3);
            if (keyAt > q && this.f10010a.get(keyAt) == 0) {
                break;
            }
            i3++;
        }
        if (i == -1) {
            i = this.f10011b.mo6282f(context, q);
        }
        this.f10010a.put(q, i);
        return i;
    }
}
