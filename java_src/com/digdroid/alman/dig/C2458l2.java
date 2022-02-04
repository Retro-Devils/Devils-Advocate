package com.digdroid.alman.dig;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import p006b.p067t.p068a.C1205b;

/* access modifiers changed from: package-private */
/* renamed from: com.digdroid.alman.dig.l2 */
public class C2458l2 extends AbstractC2445j2 {

    /* renamed from: j */
    ArrayList<Integer> f8575j = new ArrayList<>();

    /* renamed from: k */
    ArrayList<Bundle> f8576k = new ArrayList<>();

    /* renamed from: l */
    C2219c3 f8577l;

    /* renamed from: m */
    Handler f8578m;

    /* renamed from: n */
    boolean f8579n = false;

    public C2458l2(AbstractActivityC2260e0 e0Var) {
        super(e0Var, e0Var.mo2668C0());
        this.f8577l = C2219c3.m9805k(e0Var);
        this.f8578m = new Handler();
    }

    @Override // p006b.p067t.p068a.AbstractC1204a
    /* renamed from: c */
    public synchronized int mo6058c() {
        return this.f8575j.size();
    }

    @Override // p006b.p067t.p068a.AbstractC1204a, com.digdroid.alman.dig.AbstractC2445j2
    /* renamed from: i */
    public synchronized void mo6064i(Parcelable parcelable, ClassLoader classLoader) {
        Bundle bundle = (Bundle) parcelable;
        this.f8576k = bundle.getParcelableArrayList("args");
        this.f8575j = bundle.getIntegerArrayList("types");
        super.mo6064i(bundle.getParcelable("state"), classLoader);
    }

    @Override // p006b.p067t.p068a.AbstractC1204a, com.digdroid.alman.dig.AbstractC2445j2
    /* renamed from: j */
    public synchronized Parcelable mo6065j() {
        Bundle bundle;
        bundle = new Bundle();
        bundle.putParcelable("state", super.mo6065j());
        bundle.putIntegerArrayList("types", this.f8575j);
        bundle.putParcelableArrayList("args", this.f8576k);
        return bundle;
    }

    @Override // com.digdroid.alman.dig.AbstractC2445j2
    /* renamed from: p */
    public synchronized Fragment mo8688p(int i) {
        Fragment fragment = null;
        if (i >= this.f8575j.size()) {
            return null;
        }
        switch (this.f8575j.get(i).intValue()) {
            case 0:
                fragment = new C2452k1();
                break;
            case 1:
                fragment = new C2712s1();
                break;
            case 2:
                fragment = new C2186b();
                break;
            case 3:
                fragment = new C2459l3();
                break;
            case 4:
                fragment = new C2329g3();
                break;
            case 5:
                fragment = new C2214c0();
                break;
            case 6:
                fragment = new C2444j1();
                break;
            case 7:
                fragment = new C2404j0();
                break;
            case 8:
                fragment = new C2773t2();
                break;
            case 9:
                fragment = new C2552q2();
                break;
            case 10:
                fragment = new C2292e3();
                break;
            case 11:
                fragment = new C2690s();
                break;
            case 12:
                fragment = new C2588r2();
                break;
            case 13:
                fragment = new C2254d4();
                break;
            case 14:
                fragment = new C2801v2();
                break;
            case 15:
                fragment = new C2294e4();
                break;
            case 16:
                fragment = new C2494n0();
                break;
            case 17:
                fragment = new C2448k();
                break;
            case 18:
                fragment = new C2403j();
                break;
            case 19:
                fragment = new C2313f3();
                break;
            case 20:
                fragment = new C2395i0();
                break;
            case 21:
                fragment = new C2209c();
                break;
            case 22:
                fragment = new C2316f4();
                break;
            case 23:
                fragment = new C2782u3();
                break;
        }
        fragment.mo2554c2(this.f8576k.get(i));
        return fragment;
    }

    @Override // com.digdroid.alman.dig.AbstractC2445j2
    /* renamed from: r */
    public synchronized void mo8690r(int i) {
        if (i < this.f8575j.size()) {
            super.mo8690r(i);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            arrayList.addAll(this.f8575j);
            arrayList2.addAll(this.f8576k);
            while (i < arrayList.size()) {
                arrayList.remove(i);
                arrayList2.remove(i);
            }
            this.f8576k.clear();
            this.f8576k.addAll(arrayList2);
            this.f8575j.clear();
            this.f8575j.addAll(arrayList);
            mo6063h();
        }
    }

    /* renamed from: t */
    public synchronized void mo8716t(C1205b bVar, int i, Bundle bundle) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(this.f8575j);
        arrayList2.addAll(this.f8576k);
        if (arrayList.size() > 0) {
            int currentItem = bVar.getCurrentItem();
            super.mo8690r(currentItem + 1);
            while (currentItem < arrayList.size() - 1) {
                arrayList.remove(arrayList.size() - 1);
                arrayList2.remove(arrayList2.size() - 1);
            }
        }
        arrayList.add(Integer.valueOf(i));
        arrayList2.add(bundle);
        this.f8576k.clear();
        this.f8576k.addAll(arrayList2);
        this.f8575j.clear();
        this.f8575j.addAll(arrayList);
        mo6063h();
        bVar.mo6072K(this.f8575j.size() - 1, false);
    }

    /* renamed from: u */
    public synchronized void mo8717u(int i) {
        if (i < this.f8575j.size()) {
            this.f8576k.remove(i);
            this.f8575j.remove(i);
            mo6063h();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public boolean mo8718v() {
        return this.f8579n;
    }

    /* renamed from: w */
    public void mo8719w(C1205b bVar) {
        mo8721y(bVar, null, null, -1, -1);
    }

    /* renamed from: x */
    public void mo8720x(C1205b bVar, int i) {
        mo8721y(bVar, null, null, -1, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006c  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo8721y(p006b.p067t.p068a.C1205b r4, com.digdroid.alman.dig.C2369h0 r5, java.lang.String r6, int r7, int r8) {
        /*
        // Method dump skipped, instructions count: 127
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.C2458l2.mo8721y(b.t.a.b, com.digdroid.alman.dig.h0, java.lang.String, int, int):void");
    }
}
