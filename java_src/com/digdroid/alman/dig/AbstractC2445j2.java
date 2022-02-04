package com.digdroid.alman.dig;

import android.app.Activity;
import android.app.ActivityManager;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0453i;
import androidx.fragment.app.AbstractC0477n;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Iterator;
import p006b.p067t.p068a.AbstractC1204a;

/* renamed from: com.digdroid.alman.dig.j2 */
public abstract class AbstractC2445j2 extends AbstractC1204a {

    /* renamed from: c */
    private final AbstractC0453i f8532c;

    /* renamed from: d */
    private AbstractC0477n f8533d = null;

    /* renamed from: e */
    private ArrayList<Fragment.C0440g> f8534e = new ArrayList<>();

    /* renamed from: f */
    private ArrayList<Fragment> f8535f = new ArrayList<>();

    /* renamed from: g */
    private Fragment f8536g = null;

    /* renamed from: h */
    private Activity f8537h;

    /* renamed from: i */
    private int f8538i = 6;

    public AbstractC2445j2(Activity activity, AbstractC0453i iVar) {
        this.f8537h = activity;
        this.f8532c = iVar;
    }

    @Override // p006b.p067t.p068a.AbstractC1204a
    /* renamed from: a */
    public void mo6056a(ViewGroup viewGroup, int i, Object obj) {
    }

    @Override // p006b.p067t.p068a.AbstractC1204a
    /* renamed from: b */
    public void mo6057b(ViewGroup viewGroup) {
        AbstractC0477n nVar = this.f8533d;
        if (nVar != null) {
            nVar.mo2635f();
            this.f8533d = null;
            try {
                this.f8532c.mo2731c();
            } catch (Exception unused) {
            }
        }
    }

    @Override // p006b.p067t.p068a.AbstractC1204a
    /* renamed from: d */
    public int mo6059d(Object obj) {
        Fragment fragment = (Fragment) obj;
        Iterator<Fragment> it = this.f8535f.iterator();
        while (it.hasNext()) {
            if (it.next() == fragment) {
                return -1;
            }
        }
        return -2;
    }

    @Override // p006b.p067t.p068a.AbstractC1204a
    /* renamed from: f */
    public Object mo6061f(ViewGroup viewGroup, int i) {
        Fragment.C0440g gVar;
        Fragment fragment;
        if (this.f8535f.size() > i && (fragment = this.f8535f.get(i)) != null) {
            return fragment;
        }
        if (this.f8533d == null) {
            this.f8533d = this.f8532c.mo2729a();
        }
        Fragment p = mo8688p(i);
        if (this.f8534e.size() > i && (gVar = this.f8534e.get(i)) != null) {
            this.f8534e.set(i, null);
            p.mo2564f2(gVar);
        }
        while (this.f8535f.size() <= i) {
            this.f8535f.add(null);
        }
        p.mo2567g2(false);
        this.f8535f.set(i, p);
        this.f8533d.mo2868b(viewGroup.getId(), p);
        return p;
    }

    @Override // p006b.p067t.p068a.AbstractC1204a
    /* renamed from: g */
    public boolean mo6062g(View view, Object obj) {
        return ((Fragment) obj).mo2505F0() == view;
    }

    @Override // p006b.p067t.p068a.AbstractC1204a
    /* renamed from: i */
    public void mo6064i(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            this.f8538i = bundle.getInt("max_fragments");
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.f8534e.clear();
            this.f8535f.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.f8534e.add((Fragment.C0440g) parcelable2);
                }
            }
            for (T t : bundle.keySet()) {
                if (t.startsWith("f")) {
                    int parseInt = Integer.parseInt(t.substring(1));
                    Fragment e = this.f8532c.mo2733e(bundle, t);
                    if (e != null) {
                        while (this.f8535f.size() <= parseInt) {
                            this.f8535f.add(null);
                        }
                        e.mo2567g2(false);
                        this.f8535f.set(parseInt, e);
                    }
                }
            }
        }
    }

    @Override // p006b.p067t.p068a.AbstractC1204a
    /* renamed from: j */
    public Parcelable mo6065j() {
        Bundle bundle = new Bundle();
        bundle.putInt("max_fragments", this.f8538i);
        if (this.f8534e.size() > 0) {
            Fragment.C0440g[] gVarArr = new Fragment.C0440g[this.f8534e.size()];
            this.f8534e.toArray(gVarArr);
            bundle.putParcelableArray("states", gVarArr);
        }
        for (int i = 0; i < this.f8535f.size(); i++) {
            Fragment fragment = this.f8535f.get(i);
            if (fragment != null) {
                this.f8532c.mo2738j(bundle, "f" + i, fragment);
            }
        }
        return bundle;
    }

    @Override // p006b.p067t.p068a.AbstractC1204a
    /* renamed from: k */
    public void mo6066k(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f8536g;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.mo2567g2(false);
                if (!this.f8537h.isFinishing()) {
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    ((ActivityManager) this.f8537h.getSystemService("activity")).getMemoryInfo(memoryInfo);
                    this.f8538i = memoryInfo.lowMemory ? Math.max(this.f8538i - 1, 3) : Math.min(this.f8538i + 1, 6);
                }
                int size = this.f8535f.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    if (this.f8535f.get(i3) != null) {
                        i2++;
                    }
                }
                for (int i4 = size - 1; i4 > i + 1 && i2 > this.f8538i; i4--) {
                    Fragment fragment3 = this.f8535f.get(i4);
                    if (fragment3 != null) {
                        mo8686n(i4, fragment3);
                        i2--;
                    }
                }
                for (int i5 = 0; i5 < i - 1 && i2 > this.f8538i; i5++) {
                    Fragment fragment4 = this.f8535f.get(i5);
                    if (fragment4 != null) {
                        mo8686n(i5, fragment4);
                        i2--;
                    }
                }
            }
            this.f8536g = fragment;
        }
        if (fragment != null) {
            fragment.mo2567g2(true);
            Iterator<Fragment> it = this.f8535f.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                if (next != null) {
                    AbstractC2531p1 p1Var = (AbstractC2531p1) next;
                    p1Var.mo8120a3(next == fragment && p1Var.f8814m0 != null);
                }
            }
        }
    }

    @Override // p006b.p067t.p068a.AbstractC1204a
    /* renamed from: m */
    public void mo6068m(ViewGroup viewGroup) {
    }

    /* renamed from: n */
    public void mo8686n(int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (fragment != null && i < this.f8535f.size()) {
            if (this.f8533d == null) {
                this.f8533d = this.f8532c.mo2729a();
            }
            while (this.f8534e.size() <= i) {
                this.f8534e.add(null);
            }
            this.f8534e.set(i, this.f8532c.mo2739k(fragment));
            this.f8535f.set(i, null);
            this.f8533d.mo2637h(fragment);
        }
    }

    /* renamed from: o */
    public Fragment mo8687o(int i) {
        if (i >= this.f8535f.size()) {
            return null;
        }
        return this.f8535f.get(i);
    }

    /* renamed from: p */
    public abstract Fragment mo8688p(int i);

    /* renamed from: q */
    public void mo8689q() {
        Iterator<Fragment> it = this.f8535f.iterator();
        while (it.hasNext()) {
            Fragment next = it.next();
            if (next != null) {
                ((AbstractC2531p1) next).mo8106G2(true);
            }
        }
    }

    /* renamed from: r */
    public void mo8690r(int i) {
        while (this.f8535f.size() > i) {
            Fragment fragment = this.f8535f.get(i);
            if (fragment != null) {
                if (this.f8533d == null) {
                    this.f8533d = this.f8532c.mo2729a();
                }
                this.f8533d.mo2637h(fragment);
            }
            this.f8535f.remove(i);
        }
        while (this.f8534e.size() > i) {
            this.f8534e.remove(i);
        }
    }

    /* renamed from: s */
    public void mo8691s(int i, int i2) {
        for (int i3 = 0; i3 < this.f8535f.size(); i3++) {
            if (i3 < i - i2 || i3 > i + i2) {
                mo8686n(i3, this.f8535f.get(i3));
            }
        }
        mo6057b(null);
    }
}
