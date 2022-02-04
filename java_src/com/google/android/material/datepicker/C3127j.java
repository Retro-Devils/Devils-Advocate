package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;

/* renamed from: com.google.android.material.datepicker.j */
class C3127j extends BaseAdapter {

    /* renamed from: b */
    static final int f10443b = C3136p.m13082l().getMaximum(4);

    /* renamed from: c */
    final C3125i f10444c;

    /* renamed from: d */
    final AbstractC3108d<?> f10445d;

    /* renamed from: e */
    C3107c f10446e;

    /* renamed from: f */
    final C3103a f10447f;

    C3127j(C3125i iVar, AbstractC3108d<?> dVar, C3103a aVar) {
        this.f10444c = iVar;
        this.f10445d = dVar;
        this.f10447f = aVar;
    }

    /* renamed from: e */
    private void m13045e(Context context) {
        if (this.f10446e == null) {
            this.f10446e = new C3107c(context);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo10447a(int i) {
        return mo10448b() + (i - 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo10448b() {
        return this.f10444c.mo10436i();
    }

    /* renamed from: c */
    public Long getItem(int i) {
        if (i < this.f10444c.mo10436i() || i > mo10457h()) {
            return null;
        }
        return Long.valueOf(this.f10444c.mo10437j(mo10459i(i)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x006c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006d  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
        // Method dump skipped, instructions count: 212
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.C3127j.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo10451f(int i) {
        return i % this.f10444c.f10440f == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo10452g(int i) {
        return (i + 1) % this.f10444c.f10440f == 0;
    }

    public int getCount() {
        return this.f10444c.f10441g + mo10448b();
    }

    public long getItemId(int i) {
        return (long) (i / this.f10444c.f10440f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo10457h() {
        return (this.f10444c.mo10436i() + this.f10444c.f10441g) - 1;
    }

    public boolean hasStableIds() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo10459i(int i) {
        return (i - this.f10444c.mo10436i()) + 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo10460j(int i) {
        return i >= mo10448b() && i <= mo10457h();
    }
}
