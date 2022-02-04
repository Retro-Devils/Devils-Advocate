package androidx.leanback.widget;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import java.util.Map;
import p006b.p021d.C0831g;

/* access modifiers changed from: package-private */
/* renamed from: androidx.leanback.widget.z */
public class C0605z {

    /* renamed from: a */
    private int f2991a = 0;

    /* renamed from: b */
    private int f2992b = 100;

    /* renamed from: c */
    private C0831g<String, SparseArray<Parcelable>> f2993c;

    /* renamed from: e */
    static String m3195e(int i) {
        return Integer.toString(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3627a() {
        C0831g<String, SparseArray<Parcelable>> gVar;
        int i = this.f2991a;
        if (i == 2) {
            if (this.f2992b > 0) {
                C0831g<String, SparseArray<Parcelable>> gVar2 = this.f2993c;
                if (gVar2 == null || gVar2.mo4929e() != this.f2992b) {
                    gVar = new C0831g<>(this.f2992b);
                } else {
                    return;
                }
            } else {
                throw new IllegalArgumentException();
            }
        } else if (i == 3 || i == 1) {
            C0831g<String, SparseArray<Parcelable>> gVar3 = this.f2993c;
            if (gVar3 == null || gVar3.mo4929e() != Integer.MAX_VALUE) {
                gVar = new C0831g<>(Integer.MAX_VALUE);
            } else {
                return;
            }
        } else {
            gVar = null;
        }
        this.f2993c = gVar;
    }

    /* renamed from: b */
    public void mo3628b() {
        C0831g<String, SparseArray<Parcelable>> gVar = this.f2993c;
        if (gVar != null) {
            gVar.mo4927c();
        }
    }

    /* renamed from: c */
    public final int mo3629c() {
        return this.f2992b;
    }

    /* renamed from: d */
    public final int mo3630d() {
        return this.f2991a;
    }

    /* renamed from: f */
    public final void mo3631f(Bundle bundle) {
        C0831g<String, SparseArray<Parcelable>> gVar = this.f2993c;
        if (!(gVar == null || bundle == null)) {
            gVar.mo4927c();
            for (String str : bundle.keySet()) {
                this.f2993c.mo4930f(str, bundle.getSparseParcelableArray(str));
            }
        }
    }

    /* renamed from: g */
    public final void mo3632g(View view, int i) {
        SparseArray<Parcelable> g;
        if (this.f2993c != null && (g = this.f2993c.mo4931g(m3195e(i))) != null) {
            view.restoreHierarchyState(g);
        }
    }

    /* renamed from: h */
    public void mo3633h(int i) {
        C0831g<String, SparseArray<Parcelable>> gVar = this.f2993c;
        if (gVar != null && gVar.mo4932i() != 0) {
            this.f2993c.mo4931g(m3195e(i));
        }
    }

    /* renamed from: i */
    public final Bundle mo3634i() {
        C0831g<String, SparseArray<Parcelable>> gVar = this.f2993c;
        if (gVar == null || gVar.mo4932i() == 0) {
            return null;
        }
        Map<String, SparseArray<Parcelable>> k = this.f2993c.mo4934k();
        Bundle bundle = new Bundle();
        for (Map.Entry<String, SparseArray<Parcelable>> entry : k.entrySet()) {
            bundle.putSparseParcelableArray(entry.getKey(), entry.getValue());
        }
        return bundle;
    }

    /* renamed from: j */
    public final void mo3635j(View view, int i) {
        int i2 = this.f2991a;
        if (i2 == 1) {
            mo3633h(i);
        } else if (i2 == 2 || i2 == 3) {
            mo3637l(view, i);
        }
    }

    /* renamed from: k */
    public final Bundle mo3636k(Bundle bundle, View view, int i) {
        if (this.f2991a != 0) {
            String e = m3195e(i);
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            view.saveHierarchyState(sparseArray);
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray(e, sparseArray);
        }
        return bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo3637l(View view, int i) {
        if (this.f2993c != null) {
            String e = m3195e(i);
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            view.saveHierarchyState(sparseArray);
            this.f2993c.mo4930f(e, sparseArray);
        }
    }

    /* renamed from: m */
    public final void mo3638m(int i) {
        this.f2992b = i;
        mo3627a();
    }

    /* renamed from: n */
    public final void mo3639n(int i) {
        this.f2991a = i;
        mo3627a();
    }
}
