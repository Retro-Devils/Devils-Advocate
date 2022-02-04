package com.google.android.material.appbar;

import android.view.View;
import p006b.p030g.p039k.C1013s;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.material.appbar.d */
public class C3060d {

    /* renamed from: a */
    private final View f10115a;

    /* renamed from: b */
    private int f10116b;

    /* renamed from: c */
    private int f10117c;

    /* renamed from: d */
    private int f10118d;

    /* renamed from: e */
    private int f10119e;

    /* renamed from: f */
    private boolean f10120f = true;

    /* renamed from: g */
    private boolean f10121g = true;

    public C3060d(View view) {
        this.f10115a = view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9910a() {
        View view = this.f10115a;
        C1013s.m5743U(view, this.f10118d - (view.getTop() - this.f10116b));
        View view2 = this.f10115a;
        C1013s.m5742T(view2, this.f10119e - (view2.getLeft() - this.f10117c));
    }

    /* renamed from: b */
    public int mo9911b() {
        return this.f10118d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo9912c() {
        this.f10116b = this.f10115a.getTop();
        this.f10117c = this.f10115a.getLeft();
    }

    /* renamed from: d */
    public boolean mo9913d(int i) {
        if (!this.f10121g || this.f10119e == i) {
            return false;
        }
        this.f10119e = i;
        mo9910a();
        return true;
    }

    /* renamed from: e */
    public boolean mo9914e(int i) {
        if (!this.f10120f || this.f10118d == i) {
            return false;
        }
        this.f10118d = i;
        mo9910a();
        return true;
    }
}
