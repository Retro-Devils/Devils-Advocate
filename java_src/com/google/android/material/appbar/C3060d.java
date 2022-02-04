package com.google.android.material.appbar;

import android.view.View;
import p006b.p030g.p039k.C1013s;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.material.appbar.d */
public class C3060d {

    /* renamed from: a */
    private final View f10107a;

    /* renamed from: b */
    private int f10108b;

    /* renamed from: c */
    private int f10109c;

    /* renamed from: d */
    private int f10110d;

    /* renamed from: e */
    private int f10111e;

    /* renamed from: f */
    private boolean f10112f = true;

    /* renamed from: g */
    private boolean f10113g = true;

    public C3060d(View view) {
        this.f10107a = view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9910a() {
        View view = this.f10107a;
        C1013s.m5743U(view, this.f10110d - (view.getTop() - this.f10108b));
        View view2 = this.f10107a;
        C1013s.m5742T(view2, this.f10111e - (view2.getLeft() - this.f10109c));
    }

    /* renamed from: b */
    public int mo9911b() {
        return this.f10110d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo9912c() {
        this.f10108b = this.f10107a.getTop();
        this.f10109c = this.f10107a.getLeft();
    }

    /* renamed from: d */
    public boolean mo9913d(int i) {
        if (!this.f10113g || this.f10111e == i) {
            return false;
        }
        this.f10111e = i;
        mo9910a();
        return true;
    }

    /* renamed from: e */
    public boolean mo9914e(int i) {
        if (!this.f10112f || this.f10110d == i) {
            return false;
        }
        this.f10110d = i;
        mo9910a();
        return true;
    }
}
