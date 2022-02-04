package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.f */
class C0724f {

    /* renamed from: a */
    boolean f3496a = true;

    /* renamed from: b */
    int f3497b;

    /* renamed from: c */
    int f3498c;

    /* renamed from: d */
    int f3499d;

    /* renamed from: e */
    int f3500e;

    /* renamed from: f */
    int f3501f = 0;

    /* renamed from: g */
    int f3502g = 0;

    /* renamed from: h */
    boolean f3503h;

    /* renamed from: i */
    boolean f3504i;

    C0724f() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo4420a(RecyclerView.C0649a0 a0Var) {
        int i = this.f3498c;
        return i >= 0 && i < a0Var.mo3945c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public View mo4421b(RecyclerView.C0681v vVar) {
        View o = vVar.mo4215o(this.f3498c);
        this.f3498c += this.f3499d;
        return o;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f3497b + ", mCurrentPosition=" + this.f3498c + ", mItemDirection=" + this.f3499d + ", mLayoutDirection=" + this.f3500e + ", mStartLine=" + this.f3501f + ", mEndLine=" + this.f3502g + '}';
    }
}
