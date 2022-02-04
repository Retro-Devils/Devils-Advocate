package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;
import p006b.p030g.p039k.C0962a;
import p006b.p030g.p039k.C1013s;
import p006b.p030g.p039k.p040b0.C0979c;
import p006b.p030g.p039k.p040b0.C0983d;

/* renamed from: androidx.recyclerview.widget.k */
public class C0732k extends C0962a {

    /* renamed from: d */
    final RecyclerView f3519d;

    /* renamed from: e */
    private final C0733a f3520e;

    /* renamed from: androidx.recyclerview.widget.k$a */
    public static class C0733a extends C0962a {

        /* renamed from: d */
        final C0732k f3521d;

        /* renamed from: e */
        private Map<View, C0962a> f3522e = new WeakHashMap();

        public C0733a(C0732k kVar) {
            this.f3521d = kVar;
        }

        @Override // p006b.p030g.p039k.C0962a
        /* renamed from: a */
        public boolean mo2468a(View view, AccessibilityEvent accessibilityEvent) {
            C0962a aVar = this.f3522e.get(view);
            return aVar != null ? aVar.mo2468a(view, accessibilityEvent) : super.mo2468a(view, accessibilityEvent);
        }

        @Override // p006b.p030g.p039k.C0962a
        /* renamed from: b */
        public C0983d mo4454b(View view) {
            C0962a aVar = this.f3522e.get(view);
            return aVar != null ? aVar.mo4454b(view) : super.mo4454b(view);
        }

        @Override // p006b.p030g.p039k.C0962a
        /* renamed from: f */
        public void mo2361f(View view, AccessibilityEvent accessibilityEvent) {
            C0962a aVar = this.f3522e.get(view);
            if (aVar != null) {
                aVar.mo2361f(view, accessibilityEvent);
            } else {
                super.mo2361f(view, accessibilityEvent);
            }
        }

        @Override // p006b.p030g.p039k.C0962a
        /* renamed from: g */
        public void mo2362g(View view, C0979c cVar) {
            if (!this.f3521d.mo4453o() && this.f3521d.f3519d.getLayoutManager() != null) {
                this.f3521d.f3519d.getLayoutManager().mo4108U0(view, cVar);
                C0962a aVar = this.f3522e.get(view);
                if (aVar != null) {
                    aVar.mo2362g(view, cVar);
                    return;
                }
            }
            super.mo2362g(view, cVar);
        }

        @Override // p006b.p030g.p039k.C0962a
        /* renamed from: h */
        public void mo4455h(View view, AccessibilityEvent accessibilityEvent) {
            C0962a aVar = this.f3522e.get(view);
            if (aVar != null) {
                aVar.mo4455h(view, accessibilityEvent);
            } else {
                super.mo4455h(view, accessibilityEvent);
            }
        }

        @Override // p006b.p030g.p039k.C0962a
        /* renamed from: i */
        public boolean mo2469i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C0962a aVar = this.f3522e.get(viewGroup);
            return aVar != null ? aVar.mo2469i(viewGroup, view, accessibilityEvent) : super.mo2469i(viewGroup, view, accessibilityEvent);
        }

        @Override // p006b.p030g.p039k.C0962a
        /* renamed from: j */
        public boolean mo2363j(View view, int i, Bundle bundle) {
            if (this.f3521d.mo4453o() || this.f3521d.f3519d.getLayoutManager() == null) {
                return super.mo2363j(view, i, bundle);
            }
            C0962a aVar = this.f3522e.get(view);
            if (aVar != null) {
                if (aVar.mo2363j(view, i, bundle)) {
                    return true;
                }
            } else if (super.mo2363j(view, i, bundle)) {
                return true;
            }
            return this.f3521d.f3519d.getLayoutManager().mo4137o1(view, i, bundle);
        }

        @Override // p006b.p030g.p039k.C0962a
        /* renamed from: l */
        public void mo4456l(View view, int i) {
            C0962a aVar = this.f3522e.get(view);
            if (aVar != null) {
                aVar.mo4456l(view, i);
            } else {
                super.mo4456l(view, i);
            }
        }

        @Override // p006b.p030g.p039k.C0962a
        /* renamed from: m */
        public void mo4457m(View view, AccessibilityEvent accessibilityEvent) {
            C0962a aVar = this.f3522e.get(view);
            if (aVar != null) {
                aVar.mo4457m(view, accessibilityEvent);
            } else {
                super.mo4457m(view, accessibilityEvent);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public C0962a mo4458n(View view) {
            return this.f3522e.remove(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo4459o(View view) {
            C0962a j = C1013s.m5767j(view);
            if (j != null && j != this) {
                this.f3522e.put(view, j);
            }
        }
    }

    public C0732k(RecyclerView recyclerView) {
        this.f3519d = recyclerView;
        C0962a n = mo4452n();
        this.f3520e = (n == null || !(n instanceof C0733a)) ? new C0733a(this) : (C0733a) n;
    }

    @Override // p006b.p030g.p039k.C0962a
    /* renamed from: f */
    public void mo2361f(View view, AccessibilityEvent accessibilityEvent) {
        super.mo2361f(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !mo4453o()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().mo3735Q0(accessibilityEvent);
            }
        }
    }

    @Override // p006b.p030g.p039k.C0962a
    /* renamed from: g */
    public void mo2362g(View view, C0979c cVar) {
        super.mo2362g(view, cVar);
        if (!mo4453o() && this.f3519d.getLayoutManager() != null) {
            this.f3519d.getLayoutManager().mo4106S0(cVar);
        }
    }

    @Override // p006b.p030g.p039k.C0962a
    /* renamed from: j */
    public boolean mo2363j(View view, int i, Bundle bundle) {
        if (super.mo2363j(view, i, bundle)) {
            return true;
        }
        if (mo4453o() || this.f3519d.getLayoutManager() == null) {
            return false;
        }
        return this.f3519d.getLayoutManager().mo4135m1(i, bundle);
    }

    /* renamed from: n */
    public C0962a mo4452n() {
        return this.f3520e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo4453o() {
        return this.f3519d.mo3877o0();
    }
}
