package com.digdroid.alman.dig;

import android.database.Cursor;

/* renamed from: com.digdroid.alman.dig.d2 */
public class C2252d2 {

    /* renamed from: a */
    AbstractC2551q1 f8040a = null;

    /* renamed from: b */
    AbstractC2365h f8041b = null;

    public C2252d2(AbstractC2365h hVar) {
        this.f8041b = hVar;
    }

    public C2252d2(AbstractC2551q1 q1Var) {
        this.f8040a = q1Var;
    }

    /* renamed from: a */
    public void mo8239a() {
        AbstractC2551q1 q1Var = this.f8040a;
        if (q1Var != null) {
            q1Var.mo8970a();
            return;
        }
        AbstractC2365h hVar = this.f8041b;
        if (hVar != null) {
            hVar.mo8524v();
        }
    }

    /* renamed from: b */
    public int mo8240b() {
        AbstractC2551q1 q1Var = this.f8040a;
        if (q1Var != null) {
            return q1Var.getCount();
        }
        AbstractC2365h hVar = this.f8041b;
        if (hVar != null) {
            return hVar.mo3580c();
        }
        return 0;
    }

    /* renamed from: c */
    public Cursor mo8241c() {
        AbstractC2551q1 q1Var = this.f8040a;
        if (q1Var != null) {
            return q1Var.getCursor();
        }
        AbstractC2365h hVar = this.f8041b;
        if (hVar != null) {
            return hVar.mo8525w();
        }
        return null;
    }
}
