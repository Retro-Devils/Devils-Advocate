package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class LinearLayoutManager extends RecyclerView.AbstractC0669o implements RecyclerView.AbstractC0686z.AbstractC0688b {

    /* renamed from: A */
    int f3077A;

    /* renamed from: B */
    int f3078B;

    /* renamed from: C */
    private boolean f3079C;

    /* renamed from: D */
    C0646d f3080D;

    /* renamed from: E */
    final C0643a f3081E;

    /* renamed from: F */
    private final C0644b f3082F;

    /* renamed from: G */
    private int f3083G;

    /* renamed from: H */
    private int[] f3084H;

    /* renamed from: s */
    int f3085s;

    /* renamed from: t */
    private C0645c f3086t;

    /* renamed from: u */
    AbstractC0729j f3087u;

    /* renamed from: v */
    private boolean f3088v;

    /* renamed from: w */
    private boolean f3089w;

    /* renamed from: x */
    boolean f3090x;

    /* renamed from: y */
    private boolean f3091y;

    /* renamed from: z */
    private boolean f3092z;

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$a */
    public static class C0643a {

        /* renamed from: a */
        AbstractC0729j f3093a;

        /* renamed from: b */
        int f3094b;

        /* renamed from: c */
        int f3095c;

        /* renamed from: d */
        boolean f3096d;

        /* renamed from: e */
        boolean f3097e;

        C0643a() {
            mo3760e();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3756a() {
            this.f3095c = this.f3096d ? this.f3093a.mo4441i() : this.f3093a.mo4445m();
        }

        /* renamed from: b */
        public void mo3757b(View view, int i) {
            this.f3095c = this.f3096d ? this.f3093a.mo4436d(view) + this.f3093a.mo4447o() : this.f3093a.mo4439g(view);
            this.f3094b = i;
        }

        /* renamed from: c */
        public void mo3758c(View view, int i) {
            int o = this.f3093a.mo4447o();
            if (o >= 0) {
                mo3757b(view, i);
                return;
            }
            this.f3094b = i;
            if (this.f3096d) {
                int i2 = (this.f3093a.mo4441i() - o) - this.f3093a.mo4436d(view);
                this.f3095c = this.f3093a.mo4441i() - i2;
                if (i2 > 0) {
                    int e = this.f3095c - this.f3093a.mo4437e(view);
                    int m = this.f3093a.mo4445m();
                    int min = e - (m + Math.min(this.f3093a.mo4439g(view) - m, 0));
                    if (min < 0) {
                        this.f3095c += Math.min(i2, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int g = this.f3093a.mo4439g(view);
            int m2 = g - this.f3093a.mo4445m();
            this.f3095c = g;
            if (m2 > 0) {
                int i3 = (this.f3093a.mo4441i() - Math.min(0, (this.f3093a.mo4441i() - o) - this.f3093a.mo4436d(view))) - (g + this.f3093a.mo4437e(view));
                if (i3 < 0) {
                    this.f3095c -= Math.min(m2, -i3);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo3759d(View view, RecyclerView.C0649a0 a0Var) {
            RecyclerView.C0674p pVar = (RecyclerView.C0674p) view.getLayoutParams();
            return !pVar.mo4168d() && pVar.mo4166b() >= 0 && pVar.mo4166b() < a0Var.mo3945c();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo3760e() {
            this.f3094b = -1;
            this.f3095c = Integer.MIN_VALUE;
            this.f3096d = false;
            this.f3097e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f3094b + ", mCoordinate=" + this.f3095c + ", mLayoutFromEnd=" + this.f3096d + ", mValid=" + this.f3097e + '}';
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$b */
    public static class C0644b {

        /* renamed from: a */
        public int f3098a;

        /* renamed from: b */
        public boolean f3099b;

        /* renamed from: c */
        public boolean f3100c;

        /* renamed from: d */
        public boolean f3101d;

        protected C0644b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3762a() {
            this.f3098a = 0;
            this.f3099b = false;
            this.f3100c = false;
            this.f3101d = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$c */
    public static class C0645c {

        /* renamed from: a */
        boolean f3102a = true;

        /* renamed from: b */
        int f3103b;

        /* renamed from: c */
        int f3104c;

        /* renamed from: d */
        int f3105d;

        /* renamed from: e */
        int f3106e;

        /* renamed from: f */
        int f3107f;

        /* renamed from: g */
        int f3108g;

        /* renamed from: h */
        int f3109h = 0;

        /* renamed from: i */
        int f3110i = 0;

        /* renamed from: j */
        boolean f3111j = false;

        /* renamed from: k */
        int f3112k;

        /* renamed from: l */
        List<RecyclerView.AbstractC0655d0> f3113l = null;

        /* renamed from: m */
        boolean f3114m;

        C0645c() {
        }

        /* renamed from: e */
        private View m3452e() {
            int size = this.f3113l.size();
            for (int i = 0; i < size; i++) {
                View view = this.f3113l.get(i).f3228b;
                RecyclerView.C0674p pVar = (RecyclerView.C0674p) view.getLayoutParams();
                if (!pVar.mo4168d() && this.f3105d == pVar.mo4166b()) {
                    mo3764b(view);
                    return view;
                }
            }
            return null;
        }

        /* renamed from: a */
        public void mo3763a() {
            mo3764b(null);
        }

        /* renamed from: b */
        public void mo3764b(View view) {
            View f = mo3767f(view);
            this.f3105d = f == null ? -1 : ((RecyclerView.C0674p) f.getLayoutParams()).mo4166b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo3765c(RecyclerView.C0649a0 a0Var) {
            int i = this.f3105d;
            return i >= 0 && i < a0Var.mo3945c();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public View mo3766d(RecyclerView.C0681v vVar) {
            if (this.f3113l != null) {
                return m3452e();
            }
            View o = vVar.mo4215o(this.f3105d);
            this.f3105d += this.f3106e;
            return o;
        }

        /* renamed from: f */
        public View mo3767f(View view) {
            int b;
            int size = this.f3113l.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.f3113l.get(i2).f3228b;
                RecyclerView.C0674p pVar = (RecyclerView.C0674p) view3.getLayoutParams();
                if (view3 != view && !pVar.mo4168d() && (b = (pVar.mo4166b() - this.f3105d) * this.f3106e) >= 0 && b < i) {
                    view2 = view3;
                    if (b == 0) {
                        break;
                    }
                    i = b;
                }
            }
            return view2;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$d */
    public static class C0646d implements Parcelable {
        public static final Parcelable.Creator<C0646d> CREATOR = new C0647a();

        /* renamed from: b */
        int f3115b;

        /* renamed from: c */
        int f3116c;

        /* renamed from: d */
        boolean f3117d;

        /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$d$a */
        static class C0647a implements Parcelable.Creator<C0646d> {
            C0647a() {
            }

            /* renamed from: a */
            public C0646d createFromParcel(Parcel parcel) {
                return new C0646d(parcel);
            }

            /* renamed from: b */
            public C0646d[] newArray(int i) {
                return new C0646d[i];
            }
        }

        public C0646d() {
        }

        C0646d(Parcel parcel) {
            this.f3115b = parcel.readInt();
            this.f3116c = parcel.readInt();
            this.f3117d = parcel.readInt() != 1 ? false : true;
        }

        public C0646d(C0646d dVar) {
            this.f3115b = dVar.f3115b;
            this.f3116c = dVar.f3116c;
            this.f3117d = dVar.f3117d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo3768b() {
            return this.f3115b >= 0;
        }

        public int describeContents() {
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo3770g() {
            this.f3115b = -1;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f3115b);
            parcel.writeInt(this.f3116c);
            parcel.writeInt(this.f3117d ? 1 : 0);
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.f3085s = 1;
        this.f3089w = false;
        this.f3090x = false;
        this.f3091y = false;
        this.f3092z = true;
        this.f3077A = -1;
        this.f3078B = Integer.MIN_VALUE;
        this.f3080D = null;
        this.f3081E = new C0643a();
        this.f3082F = new C0644b();
        this.f3083G = 2;
        this.f3084H = new int[2];
        mo3731K2(i);
        mo3732L2(z);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f3085s = 1;
        this.f3089w = false;
        this.f3090x = false;
        this.f3091y = false;
        this.f3092z = true;
        this.f3077A = -1;
        this.f3078B = Integer.MIN_VALUE;
        this.f3080D = null;
        this.f3081E = new C0643a();
        this.f3082F = new C0644b();
        this.f3083G = 2;
        this.f3084H = new int[2];
        RecyclerView.AbstractC0669o.C0673d m0 = RecyclerView.AbstractC0669o.m3735m0(context, attributeSet, i, i2);
        mo3731K2(m0.f3281a);
        mo3732L2(m0.f3283c);
        mo3706M2(m0.f3284d);
    }

    /* renamed from: B2 */
    private void m3365B2(RecyclerView.C0681v vVar, RecyclerView.C0649a0 a0Var, int i, int i2) {
        if (a0Var.mo3952j() && mo4098M() != 0 && !a0Var.mo3950h() && mo3397T1()) {
            List<RecyclerView.AbstractC0655d0> k = vVar.mo4211k();
            int size = k.size();
            int l0 = mo4133l0(mo4096L(0));
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                RecyclerView.AbstractC0655d0 d0Var = k.get(i5);
                if (!d0Var.mo3998v()) {
                    char c = 1;
                    if ((d0Var.mo3988m() < l0) != this.f3090x) {
                        c = 65535;
                    }
                    int e = this.f3087u.mo4437e(d0Var.f3228b);
                    if (c == 65535) {
                        i3 += e;
                    } else {
                        i4 += e;
                    }
                }
            }
            this.f3086t.f3113l = k;
            if (i3 > 0) {
                m3377T2(mo4133l0(m3393v2()), i);
                C0645c cVar = this.f3086t;
                cVar.f3109h = i3;
                cVar.f3104c = 0;
                cVar.mo3763a();
                mo3741c2(vVar, this.f3086t, a0Var, false);
            }
            if (i4 > 0) {
                m3375R2(mo4133l0(m3392u2()), i2);
                C0645c cVar2 = this.f3086t;
                cVar2.f3109h = i4;
                cVar2.f3104c = 0;
                cVar2.mo3763a();
                mo3741c2(vVar, this.f3086t, a0Var, false);
            }
            this.f3086t.f3113l = null;
        }
    }

    /* renamed from: D2 */
    private void m3366D2(RecyclerView.C0681v vVar, C0645c cVar) {
        if (cVar.f3102a && !cVar.f3114m) {
            int i = cVar.f3108g;
            int i2 = cVar.f3110i;
            if (cVar.f3107f == -1) {
                m3368F2(vVar, i, i2);
            } else {
                m3369G2(vVar, i, i2);
            }
        }
    }

    /* renamed from: E2 */
    private void m3367E2(RecyclerView.C0681v vVar, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    mo4148u1(i3, vVar);
                }
                return;
            }
            while (i > i2) {
                mo4148u1(i, vVar);
                i--;
            }
        }
    }

    /* renamed from: F2 */
    private void m3368F2(RecyclerView.C0681v vVar, int i, int i2) {
        int M = mo4098M();
        if (i >= 0) {
            int h = (this.f3087u.mo4440h() - i) + i2;
            if (this.f3090x) {
                for (int i3 = 0; i3 < M; i3++) {
                    View L = mo4096L(i3);
                    if (this.f3087u.mo4439g(L) < h || this.f3087u.mo4449q(L) < h) {
                        m3367E2(vVar, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = M - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View L2 = mo4096L(i5);
                if (this.f3087u.mo4439g(L2) < h || this.f3087u.mo4449q(L2) < h) {
                    m3367E2(vVar, i4, i5);
                    return;
                }
            }
        }
    }

    /* renamed from: G2 */
    private void m3369G2(RecyclerView.C0681v vVar, int i, int i2) {
        if (i >= 0) {
            int i3 = i - i2;
            int M = mo4098M();
            if (this.f3090x) {
                int i4 = M - 1;
                for (int i5 = i4; i5 >= 0; i5--) {
                    View L = mo4096L(i5);
                    if (this.f3087u.mo4436d(L) > i3 || this.f3087u.mo4448p(L) > i3) {
                        m3367E2(vVar, i4, i5);
                        return;
                    }
                }
                return;
            }
            for (int i6 = 0; i6 < M; i6++) {
                View L2 = mo4096L(i6);
                if (this.f3087u.mo4436d(L2) > i3 || this.f3087u.mo4448p(L2) > i3) {
                    m3367E2(vVar, 0, i6);
                    return;
                }
            }
        }
    }

    /* renamed from: I2 */
    private void m3370I2() {
        this.f3090x = (this.f3085s == 1 || !mo3754y2()) ? this.f3089w : !this.f3089w;
    }

    /* renamed from: N2 */
    private boolean m3371N2(RecyclerView.C0681v vVar, RecyclerView.C0649a0 a0Var, C0643a aVar) {
        boolean z = false;
        if (mo4098M() == 0) {
            return false;
        }
        View Z = mo4111Z();
        if (Z != null && aVar.mo3759d(Z, a0Var)) {
            aVar.mo3758c(Z, mo4133l0(Z));
            return true;
        } else if (this.f3088v != this.f3091y) {
            return false;
        } else {
            View q2 = aVar.f3096d ? m3388q2(vVar, a0Var) : m3389r2(vVar, a0Var);
            if (q2 == null) {
                return false;
            }
            aVar.mo3757b(q2, mo4133l0(q2));
            if (!a0Var.mo3950h() && mo3397T1()) {
                if (this.f3087u.mo4439g(q2) >= this.f3087u.mo4441i() || this.f3087u.mo4436d(q2) < this.f3087u.mo4445m()) {
                    z = true;
                }
                if (z) {
                    aVar.f3095c = aVar.f3096d ? this.f3087u.mo4441i() : this.f3087u.mo4445m();
                }
            }
            return true;
        }
    }

    /* renamed from: O2 */
    private boolean m3372O2(RecyclerView.C0649a0 a0Var, C0643a aVar) {
        int i;
        boolean z = false;
        if (!a0Var.mo3950h() && (i = this.f3077A) != -1) {
            if (i < 0 || i >= a0Var.mo3945c()) {
                this.f3077A = -1;
                this.f3078B = Integer.MIN_VALUE;
            } else {
                aVar.f3094b = this.f3077A;
                C0646d dVar = this.f3080D;
                if (dVar != null && dVar.mo3768b()) {
                    boolean z2 = this.f3080D.f3117d;
                    aVar.f3096d = z2;
                    aVar.f3095c = z2 ? this.f3087u.mo4441i() - this.f3080D.f3116c : this.f3087u.mo4445m() + this.f3080D.f3116c;
                    return true;
                } else if (this.f3078B == Integer.MIN_VALUE) {
                    View F = mo3728F(this.f3077A);
                    if (F == null) {
                        if (mo4098M() > 0) {
                            if ((this.f3077A < mo4133l0(mo4096L(0))) == this.f3090x) {
                                z = true;
                            }
                            aVar.f3096d = z;
                        }
                        aVar.mo3756a();
                    } else if (this.f3087u.mo4437e(F) > this.f3087u.mo4446n()) {
                        aVar.mo3756a();
                        return true;
                    } else if (this.f3087u.mo4439g(F) - this.f3087u.mo4445m() < 0) {
                        aVar.f3095c = this.f3087u.mo4445m();
                        aVar.f3096d = false;
                        return true;
                    } else if (this.f3087u.mo4441i() - this.f3087u.mo4436d(F) < 0) {
                        aVar.f3095c = this.f3087u.mo4441i();
                        aVar.f3096d = true;
                        return true;
                    } else {
                        aVar.f3095c = aVar.f3096d ? this.f3087u.mo4436d(F) + this.f3087u.mo4447o() : this.f3087u.mo4439g(F);
                    }
                    return true;
                } else {
                    boolean z3 = this.f3090x;
                    aVar.f3096d = z3;
                    aVar.f3095c = z3 ? this.f3087u.mo4441i() - this.f3078B : this.f3087u.mo4445m() + this.f3078B;
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: P2 */
    private void m3373P2(RecyclerView.C0681v vVar, RecyclerView.C0649a0 a0Var, C0643a aVar) {
        if (!m3372O2(a0Var, aVar) && !m3371N2(vVar, a0Var, aVar)) {
            aVar.mo3756a();
            aVar.f3094b = this.f3091y ? a0Var.mo3945c() - 1 : 0;
        }
    }

    /* renamed from: Q2 */
    private void m3374Q2(int i, int i2, boolean z, RecyclerView.C0649a0 a0Var) {
        int i3;
        this.f3086t.f3114m = mo3729H2();
        this.f3086t.f3107f = i;
        int[] iArr = this.f3084H;
        boolean z2 = false;
        iArr[0] = 0;
        int i4 = 1;
        iArr[1] = 0;
        mo3736U1(a0Var, iArr);
        int max = Math.max(0, this.f3084H[0]);
        int max2 = Math.max(0, this.f3084H[1]);
        if (i == 1) {
            z2 = true;
        }
        C0645c cVar = this.f3086t;
        int i5 = z2 ? max2 : max;
        cVar.f3109h = i5;
        if (!z2) {
            max = max2;
        }
        cVar.f3110i = max;
        if (z2) {
            cVar.f3109h = i5 + this.f3087u.mo4442j();
            View u2 = m3392u2();
            C0645c cVar2 = this.f3086t;
            if (this.f3090x) {
                i4 = -1;
            }
            cVar2.f3106e = i4;
            int l0 = mo4133l0(u2);
            C0645c cVar3 = this.f3086t;
            cVar2.f3105d = l0 + cVar3.f3106e;
            cVar3.f3103b = this.f3087u.mo4436d(u2);
            i3 = this.f3087u.mo4436d(u2) - this.f3087u.mo4441i();
        } else {
            View v2 = m3393v2();
            this.f3086t.f3109h += this.f3087u.mo4445m();
            C0645c cVar4 = this.f3086t;
            if (!this.f3090x) {
                i4 = -1;
            }
            cVar4.f3106e = i4;
            int l02 = mo4133l0(v2);
            C0645c cVar5 = this.f3086t;
            cVar4.f3105d = l02 + cVar5.f3106e;
            cVar5.f3103b = this.f3087u.mo4439g(v2);
            i3 = (-this.f3087u.mo4439g(v2)) + this.f3087u.mo4445m();
        }
        C0645c cVar6 = this.f3086t;
        cVar6.f3104c = i2;
        if (z) {
            cVar6.f3104c = i2 - i3;
        }
        cVar6.f3108g = i3;
    }

    /* renamed from: R2 */
    private void m3375R2(int i, int i2) {
        this.f3086t.f3104c = this.f3087u.mo4441i() - i2;
        C0645c cVar = this.f3086t;
        cVar.f3106e = this.f3090x ? -1 : 1;
        cVar.f3105d = i;
        cVar.f3107f = 1;
        cVar.f3103b = i2;
        cVar.f3108g = Integer.MIN_VALUE;
    }

    /* renamed from: S2 */
    private void m3376S2(C0643a aVar) {
        m3375R2(aVar.f3094b, aVar.f3095c);
    }

    /* renamed from: T2 */
    private void m3377T2(int i, int i2) {
        this.f3086t.f3104c = i2 - this.f3087u.mo4445m();
        C0645c cVar = this.f3086t;
        cVar.f3105d = i;
        cVar.f3106e = this.f3090x ? 1 : -1;
        cVar.f3107f = -1;
        cVar.f3103b = i2;
        cVar.f3108g = Integer.MIN_VALUE;
    }

    /* renamed from: U2 */
    private void m3378U2(C0643a aVar) {
        m3377T2(aVar.f3094b, aVar.f3095c);
    }

    /* renamed from: W1 */
    private int m3379W1(RecyclerView.C0649a0 a0Var) {
        if (mo4098M() == 0) {
            return 0;
        }
        mo3740b2();
        return C0734l.m4359a(a0Var, this.f3087u, mo3744g2(!this.f3092z, true), mo3742f2(!this.f3092z, true), this, this.f3092z);
    }

    /* renamed from: X1 */
    private int m3380X1(RecyclerView.C0649a0 a0Var) {
        if (mo4098M() == 0) {
            return 0;
        }
        mo3740b2();
        return C0734l.m4360b(a0Var, this.f3087u, mo3744g2(!this.f3092z, true), mo3742f2(!this.f3092z, true), this, this.f3092z, this.f3090x);
    }

    /* renamed from: Y1 */
    private int m3381Y1(RecyclerView.C0649a0 a0Var) {
        if (mo4098M() == 0) {
            return 0;
        }
        mo3740b2();
        return C0734l.m4361c(a0Var, this.f3087u, mo3744g2(!this.f3092z, true), mo3742f2(!this.f3092z, true), this, this.f3092z);
    }

    /* renamed from: d2 */
    private View m3382d2() {
        return mo3747l2(0, mo4098M());
    }

    /* renamed from: e2 */
    private View m3383e2(RecyclerView.C0681v vVar, RecyclerView.C0649a0 a0Var) {
        return mo3714p2(vVar, a0Var, 0, mo4098M(), a0Var.mo3945c());
    }

    /* renamed from: i2 */
    private View m3384i2() {
        return mo3747l2(mo4098M() - 1, -1);
    }

    /* renamed from: j2 */
    private View m3385j2(RecyclerView.C0681v vVar, RecyclerView.C0649a0 a0Var) {
        return mo3714p2(vVar, a0Var, mo4098M() - 1, -1, a0Var.mo3945c());
    }

    /* renamed from: n2 */
    private View m3386n2() {
        return this.f3090x ? m3382d2() : m3384i2();
    }

    /* renamed from: o2 */
    private View m3387o2() {
        return this.f3090x ? m3384i2() : m3382d2();
    }

    /* renamed from: q2 */
    private View m3388q2(RecyclerView.C0681v vVar, RecyclerView.C0649a0 a0Var) {
        return this.f3090x ? m3383e2(vVar, a0Var) : m3385j2(vVar, a0Var);
    }

    /* renamed from: r2 */
    private View m3389r2(RecyclerView.C0681v vVar, RecyclerView.C0649a0 a0Var) {
        return this.f3090x ? m3385j2(vVar, a0Var) : m3383e2(vVar, a0Var);
    }

    /* renamed from: s2 */
    private int m3390s2(int i, RecyclerView.C0681v vVar, RecyclerView.C0649a0 a0Var, boolean z) {
        int i2;
        int i3 = this.f3087u.mo4441i() - i;
        if (i3 <= 0) {
            return 0;
        }
        int i4 = -mo3730J2(-i3, vVar, a0Var);
        int i5 = i + i4;
        if (!z || (i2 = this.f3087u.mo4441i() - i5) <= 0) {
            return i4;
        }
        this.f3087u.mo4450r(i2);
        return i2 + i4;
    }

    /* renamed from: t2 */
    private int m3391t2(int i, RecyclerView.C0681v vVar, RecyclerView.C0649a0 a0Var, boolean z) {
        int m;
        int m2 = i - this.f3087u.mo4445m();
        if (m2 <= 0) {
            return 0;
        }
        int i2 = -mo3730J2(m2, vVar, a0Var);
        int i3 = i + i2;
        if (!z || (m = i3 - this.f3087u.mo4445m()) <= 0) {
            return i2;
        }
        this.f3087u.mo4450r(-m);
        return i2 - m;
    }

    /* renamed from: u2 */
    private View m3392u2() {
        return mo4096L(this.f3090x ? 0 : mo4098M() - 1);
    }

    /* renamed from: v2 */
    private View m3393v2() {
        return mo4096L(this.f3090x ? mo4098M() - 1 : 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A2 */
    public void mo3703A2(RecyclerView.C0681v vVar, RecyclerView.C0649a0 a0Var, C0645c cVar, C0644b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        View d = cVar.mo3766d(vVar);
        if (d == null) {
            bVar.f3099b = true;
            return;
        }
        RecyclerView.C0674p pVar = (RecyclerView.C0674p) d.getLayoutParams();
        if (cVar.f3113l == null) {
            if (this.f3090x == (cVar.f3107f == -1)) {
                mo4117d(d);
            } else {
                mo4119e(d, 0);
            }
        } else {
            if (this.f3090x == (cVar.f3107f == -1)) {
                mo4113b(d);
            } else {
                mo4115c(d, 0);
            }
        }
        mo4086G0(d, 0, 0);
        bVar.f3098a = this.f3087u.mo4437e(d);
        if (this.f3085s == 1) {
            if (mo3754y2()) {
                i5 = mo4143s0() - mo4129j0();
                i4 = i5 - this.f3087u.mo4438f(d);
            } else {
                i4 = mo4127i0();
                i5 = this.f3087u.mo4438f(d) + i4;
            }
            int i6 = cVar.f3107f;
            int i7 = cVar.f3103b;
            if (i6 == -1) {
                i = i7;
                i2 = i5;
                i3 = i7 - bVar.f3098a;
            } else {
                i3 = i7;
                i2 = i5;
                i = bVar.f3098a + i7;
            }
        } else {
            int k0 = mo4131k0();
            int f = this.f3087u.mo4438f(d) + k0;
            int i8 = cVar.f3107f;
            int i9 = cVar.f3103b;
            if (i8 == -1) {
                i2 = i9;
                i3 = k0;
                i = f;
                i4 = i9 - bVar.f3098a;
            } else {
                i3 = k0;
                i2 = bVar.f3098a + i9;
                i = f;
                i4 = i9;
            }
        }
        mo4085F0(d, i4, i3, i2, i);
        if (pVar.mo4168d() || pVar.mo4167c()) {
            bVar.f3100c = true;
        }
        bVar.f3101d = d.hasFocusable();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C2 */
    public void mo3704C2(RecyclerView.C0681v vVar, RecyclerView.C0649a0 a0Var, C0643a aVar, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: D1 */
    public int mo3359D1(int i, RecyclerView.C0681v vVar, RecyclerView.C0649a0 a0Var) {
        if (this.f3085s == 1) {
            return 0;
        }
        return mo3730J2(i, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: E1 */
    public void mo3360E1(int i) {
        this.f3077A = i;
        this.f3078B = Integer.MIN_VALUE;
        C0646d dVar = this.f3080D;
        if (dVar != null) {
            dVar.mo3770g();
        }
        mo4077A1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: F */
    public View mo3728F(int i) {
        int M = mo4098M();
        if (M == 0) {
            return null;
        }
        int l0 = i - mo4133l0(mo4096L(0));
        if (l0 >= 0 && l0 < M) {
            View L = mo4096L(l0);
            if (mo4133l0(L) == i) {
                return L;
            }
        }
        return super.mo3728F(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: F1 */
    public int mo3362F1(int i, RecyclerView.C0681v vVar, RecyclerView.C0649a0 a0Var) {
        if (this.f3085s == 0) {
            return 0;
        }
        return mo3730J2(i, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: G */
    public RecyclerView.C0674p mo3364G() {
        return new RecyclerView.C0674p(-2, -2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H2 */
    public boolean mo3729H2() {
        return this.f3087u.mo4443k() == 0 && this.f3087u.mo4440h() == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J2 */
    public int mo3730J2(int i, RecyclerView.C0681v vVar, RecyclerView.C0649a0 a0Var) {
        if (mo4098M() == 0 || i == 0) {
            return 0;
        }
        mo3740b2();
        this.f3086t.f3102a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        m3374Q2(i2, abs, true, a0Var);
        C0645c cVar = this.f3086t;
        int c2 = cVar.f3108g + mo3741c2(vVar, cVar, a0Var, false);
        if (c2 < 0) {
            return 0;
        }
        if (abs > c2) {
            i = i2 * c2;
        }
        this.f3087u.mo4450r(-i);
        this.f3086t.f3112k = i;
        return i;
    }

    /* renamed from: K2 */
    public void mo3731K2(int i) {
        if (i == 0 || i == 1) {
            mo3743g(null);
            if (i != this.f3085s || this.f3087u == null) {
                AbstractC0729j b = AbstractC0729j.m4297b(this, i);
                this.f3087u = b;
                this.f3081E.f3093a = b;
                this.f3085s = i;
                mo4077A1();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:" + i);
    }

    /* renamed from: L2 */
    public void mo3732L2(boolean z) {
        mo3743g(null);
        if (z != this.f3089w) {
            this.f3089w = z;
            mo4077A1();
        }
    }

    /* renamed from: M2 */
    public void mo3706M2(boolean z) {
        mo3743g(null);
        if (this.f3091y != z) {
            this.f3091y = z;
            mo4077A1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: O0 */
    public void mo3733O0(RecyclerView recyclerView, RecyclerView.C0681v vVar) {
        super.mo3733O0(recyclerView, vVar);
        if (this.f3079C) {
            mo3470r1(vVar);
            vVar.mo4203c();
        }
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: O1 */
    public boolean mo3734O1() {
        return (mo4114b0() == 1073741824 || mo4145t0() == 1073741824 || !mo4147u0()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: P0 */
    public View mo3707P0(View view, int i, RecyclerView.C0681v vVar, RecyclerView.C0649a0 a0Var) {
        int Z1;
        m3370I2();
        if (mo4098M() == 0 || (Z1 = mo3737Z1(i)) == Integer.MIN_VALUE) {
            return null;
        }
        mo3740b2();
        m3374Q2(Z1, (int) (((float) this.f3087u.mo4446n()) * 0.33333334f), false, a0Var);
        C0645c cVar = this.f3086t;
        cVar.f3108g = Integer.MIN_VALUE;
        cVar.f3102a = false;
        mo3741c2(vVar, cVar, a0Var, true);
        View o2 = Z1 == -1 ? m3387o2() : m3386n2();
        View v2 = Z1 == -1 ? m3393v2() : m3392u2();
        if (!v2.hasFocusable()) {
            return o2;
        }
        if (o2 == null) {
            return null;
        }
        return v2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: Q0 */
    public void mo3735Q0(AccessibilityEvent accessibilityEvent) {
        super.mo3735Q0(accessibilityEvent);
        if (mo4098M() > 0) {
            accessibilityEvent.setFromIndex(mo3745h2());
            accessibilityEvent.setToIndex(mo3746k2());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: Q1 */
    public void mo3385Q1(RecyclerView recyclerView, RecyclerView.C0649a0 a0Var, int i) {
        C0725g gVar = new C0725g(recyclerView.getContext());
        gVar.mo4244p(i);
        mo3389R1(gVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: T1 */
    public boolean mo3397T1() {
        return this.f3080D == null && this.f3088v == this.f3091y;
    }

    /* access modifiers changed from: protected */
    /* renamed from: U1 */
    public void mo3736U1(RecyclerView.C0649a0 a0Var, int[] iArr) {
        int i;
        int w2 = mo3751w2(a0Var);
        if (this.f3086t.f3107f == -1) {
            i = 0;
        } else {
            i = w2;
            w2 = 0;
        }
        iArr[0] = w2;
        iArr[1] = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V1 */
    public void mo3708V1(RecyclerView.C0649a0 a0Var, C0645c cVar, RecyclerView.AbstractC0669o.AbstractC0672c cVar2) {
        int i = cVar.f3105d;
        if (i >= 0 && i < a0Var.mo3945c()) {
            cVar2.mo4164a(i, Math.max(0, cVar.f3108g));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z1 */
    public int mo3737Z1(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f3085s == 1) ? 1 : Integer.MIN_VALUE : this.f3085s == 0 ? 1 : Integer.MIN_VALUE : this.f3085s == 1 ? -1 : Integer.MIN_VALUE : this.f3085s == 0 ? -1 : Integer.MIN_VALUE : (this.f3085s != 1 && mo3754y2()) ? -1 : 1 : (this.f3085s != 1 && mo3754y2()) ? 1 : -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0686z.AbstractC0688b
    /* renamed from: a */
    public PointF mo3738a(int i) {
        if (mo4098M() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < mo4133l0(mo4096L(0))) {
            z = true;
        }
        if (z != this.f3090x) {
            i2 = -1;
        }
        return this.f3085s == 0 ? new PointF((float) i2, 0.0f) : new PointF(0.0f, (float) i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a2 */
    public C0645c mo3739a2() {
        return new C0645c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b2 */
    public void mo3740b2() {
        if (this.f3086t == null) {
            this.f3086t = mo3739a2();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c2 */
    public int mo3741c2(RecyclerView.C0681v vVar, C0645c cVar, RecyclerView.C0649a0 a0Var, boolean z) {
        int i = cVar.f3104c;
        int i2 = cVar.f3108g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                cVar.f3108g = i2 + i;
            }
            m3366D2(vVar, cVar);
        }
        int i3 = cVar.f3104c + cVar.f3109h;
        C0644b bVar = this.f3082F;
        while (true) {
            if ((!cVar.f3114m && i3 <= 0) || !cVar.mo3765c(a0Var)) {
                break;
            }
            bVar.mo3762a();
            mo3703A2(vVar, a0Var, cVar, bVar);
            if (!bVar.f3099b) {
                cVar.f3103b += bVar.f3098a * cVar.f3107f;
                if (!bVar.f3100c || cVar.f3113l != null || !a0Var.mo3950h()) {
                    int i4 = cVar.f3104c;
                    int i5 = bVar.f3098a;
                    cVar.f3104c = i4 - i5;
                    i3 -= i5;
                }
                int i6 = cVar.f3108g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + bVar.f3098a;
                    cVar.f3108g = i7;
                    int i8 = cVar.f3104c;
                    if (i8 < 0) {
                        cVar.f3108g = i7 + i8;
                    }
                    m3366D2(vVar, cVar);
                }
                if (z && bVar.f3101d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.f3104c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: d1 */
    public void mo3430d1(RecyclerView.C0681v vVar, RecyclerView.C0649a0 a0Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        View F;
        int i7;
        int i8;
        int i9 = -1;
        if (!(this.f3080D == null && this.f3077A == -1) && a0Var.mo3945c() == 0) {
            mo3470r1(vVar);
            return;
        }
        C0646d dVar = this.f3080D;
        if (dVar != null && dVar.mo3768b()) {
            this.f3077A = this.f3080D.f3115b;
        }
        mo3740b2();
        this.f3086t.f3102a = false;
        m3370I2();
        View Z = mo4111Z();
        C0643a aVar = this.f3081E;
        if (!aVar.f3097e || this.f3077A != -1 || this.f3080D != null) {
            aVar.mo3760e();
            C0643a aVar2 = this.f3081E;
            aVar2.f3096d = this.f3090x ^ this.f3091y;
            m3373P2(vVar, a0Var, aVar2);
            this.f3081E.f3097e = true;
        } else if (Z != null && (this.f3087u.mo4439g(Z) >= this.f3087u.mo4441i() || this.f3087u.mo4436d(Z) <= this.f3087u.mo4445m())) {
            this.f3081E.mo3758c(Z, mo4133l0(Z));
        }
        C0645c cVar = this.f3086t;
        cVar.f3107f = cVar.f3112k >= 0 ? 1 : -1;
        int[] iArr = this.f3084H;
        iArr[0] = 0;
        iArr[1] = 0;
        mo3736U1(a0Var, iArr);
        int max = Math.max(0, this.f3084H[0]) + this.f3087u.mo4445m();
        int max2 = Math.max(0, this.f3084H[1]) + this.f3087u.mo4442j();
        if (!(!a0Var.mo3950h() || (i6 = this.f3077A) == -1 || this.f3078B == Integer.MIN_VALUE || (F = mo3728F(i6)) == null)) {
            if (this.f3090x) {
                i7 = this.f3087u.mo4441i() - this.f3087u.mo4436d(F);
                i8 = this.f3078B;
            } else {
                i8 = this.f3087u.mo4439g(F) - this.f3087u.mo4445m();
                i7 = this.f3078B;
            }
            int i10 = i7 - i8;
            if (i10 > 0) {
                max += i10;
            } else {
                max2 -= i10;
            }
        }
        C0643a aVar3 = this.f3081E;
        if (!aVar3.f3096d ? !this.f3090x : this.f3090x) {
            i9 = 1;
        }
        mo3704C2(vVar, a0Var, aVar3, i9);
        mo4153x(vVar);
        this.f3086t.f3114m = mo3729H2();
        this.f3086t.f3111j = a0Var.mo3950h();
        this.f3086t.f3110i = 0;
        C0643a aVar4 = this.f3081E;
        if (aVar4.f3096d) {
            m3378U2(aVar4);
            C0645c cVar2 = this.f3086t;
            cVar2.f3109h = max;
            mo3741c2(vVar, cVar2, a0Var, false);
            C0645c cVar3 = this.f3086t;
            i2 = cVar3.f3103b;
            int i11 = cVar3.f3105d;
            int i12 = cVar3.f3104c;
            if (i12 > 0) {
                max2 += i12;
            }
            m3376S2(this.f3081E);
            C0645c cVar4 = this.f3086t;
            cVar4.f3109h = max2;
            cVar4.f3105d += cVar4.f3106e;
            mo3741c2(vVar, cVar4, a0Var, false);
            C0645c cVar5 = this.f3086t;
            i = cVar5.f3103b;
            int i13 = cVar5.f3104c;
            if (i13 > 0) {
                m3377T2(i11, i2);
                C0645c cVar6 = this.f3086t;
                cVar6.f3109h = i13;
                mo3741c2(vVar, cVar6, a0Var, false);
                i2 = this.f3086t.f3103b;
            }
        } else {
            m3376S2(aVar4);
            C0645c cVar7 = this.f3086t;
            cVar7.f3109h = max2;
            mo3741c2(vVar, cVar7, a0Var, false);
            C0645c cVar8 = this.f3086t;
            i = cVar8.f3103b;
            int i14 = cVar8.f3105d;
            int i15 = cVar8.f3104c;
            if (i15 > 0) {
                max += i15;
            }
            m3378U2(this.f3081E);
            C0645c cVar9 = this.f3086t;
            cVar9.f3109h = max;
            cVar9.f3105d += cVar9.f3106e;
            mo3741c2(vVar, cVar9, a0Var, false);
            C0645c cVar10 = this.f3086t;
            i2 = cVar10.f3103b;
            int i16 = cVar10.f3104c;
            if (i16 > 0) {
                m3375R2(i14, i);
                C0645c cVar11 = this.f3086t;
                cVar11.f3109h = i16;
                mo3741c2(vVar, cVar11, a0Var, false);
                i = this.f3086t.f3103b;
            }
        }
        if (mo4098M() > 0) {
            if (this.f3090x ^ this.f3091y) {
                int s2 = m3390s2(i, vVar, a0Var, true);
                i4 = i2 + s2;
                i3 = i + s2;
                i5 = m3391t2(i4, vVar, a0Var, false);
            } else {
                int t2 = m3391t2(i2, vVar, a0Var, true);
                i4 = i2 + t2;
                i3 = i + t2;
                i5 = m3390s2(i3, vVar, a0Var, false);
            }
            i2 = i4 + i5;
            i = i3 + i5;
        }
        m3365B2(vVar, a0Var, i2, i);
        if (!a0Var.mo3950h()) {
            this.f3087u.mo4451s();
        } else {
            this.f3081E.mo3760e();
        }
        this.f3088v = this.f3091y;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: e1 */
    public void mo3433e1(RecyclerView.C0649a0 a0Var) {
        super.mo3433e1(a0Var);
        this.f3080D = null;
        this.f3077A = -1;
        this.f3078B = Integer.MIN_VALUE;
        this.f3081E.mo3760e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f2 */
    public View mo3742f2(boolean z, boolean z2) {
        int M;
        int i;
        if (this.f3090x) {
            M = 0;
            i = mo4098M();
        } else {
            M = mo4098M() - 1;
            i = -1;
        }
        return mo3748m2(M, i, z, z2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: g */
    public void mo3743g(String str) {
        if (this.f3080D == null) {
            super.mo3743g(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g2 */
    public View mo3744g2(boolean z, boolean z2) {
        int i;
        int M;
        if (this.f3090x) {
            i = mo4098M() - 1;
            M = -1;
        } else {
            i = 0;
            M = mo4098M();
        }
        return mo3748m2(i, M, z, z2);
    }

    /* renamed from: h2 */
    public int mo3745h2() {
        View m2 = mo3748m2(0, mo4098M(), false, true);
        if (m2 == null) {
            return -1;
        }
        return mo4133l0(m2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: i1 */
    public void mo3445i1(Parcelable parcelable) {
        if (parcelable instanceof C0646d) {
            this.f3080D = (C0646d) parcelable;
            mo4077A1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: j1 */
    public Parcelable mo3447j1() {
        if (this.f3080D != null) {
            return new C0646d(this.f3080D);
        }
        C0646d dVar = new C0646d();
        if (mo4098M() > 0) {
            mo3740b2();
            boolean z = this.f3088v ^ this.f3090x;
            dVar.f3117d = z;
            if (z) {
                View u2 = m3392u2();
                dVar.f3116c = this.f3087u.mo4441i() - this.f3087u.mo4436d(u2);
                dVar.f3115b = mo4133l0(u2);
            } else {
                View v2 = m3393v2();
                dVar.f3115b = mo4133l0(v2);
                dVar.f3116c = this.f3087u.mo4439g(v2) - this.f3087u.mo4445m();
            }
        } else {
            dVar.mo3770g();
        }
        return dVar;
    }

    /* renamed from: k2 */
    public int mo3746k2() {
        View m2 = mo3748m2(mo4098M() - 1, -1, false, true);
        if (m2 == null) {
            return -1;
        }
        return mo4133l0(m2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: l */
    public boolean mo3451l() {
        return this.f3085s == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l2 */
    public View mo3747l2(int i, int i2) {
        int i3;
        int i4;
        mo3740b2();
        if ((i2 > i ? 1 : i2 < i ? (char) 65535 : 0) == 0) {
            return mo4096L(i);
        }
        if (this.f3087u.mo4439g(mo4096L(i)) < this.f3087u.mo4445m()) {
            i4 = 16644;
            i3 = 16388;
        } else {
            i4 = 4161;
            i3 = 4097;
        }
        return (this.f3085s == 0 ? this.f3265e : this.f3266f).mo4482a(i, i2, i4, i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: m */
    public boolean mo3454m() {
        return this.f3085s == 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m2 */
    public View mo3748m2(int i, int i2, boolean z, boolean z2) {
        mo3740b2();
        int i3 = 320;
        int i4 = z ? 24579 : 320;
        if (!z2) {
            i3 = 0;
        }
        return (this.f3085s == 0 ? this.f3265e : this.f3266f).mo4482a(i, i2, i4, i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: p */
    public void mo3462p(int i, int i2, RecyclerView.C0649a0 a0Var, RecyclerView.AbstractC0669o.AbstractC0672c cVar) {
        if (this.f3085s != 0) {
            i = i2;
        }
        if (mo4098M() != 0 && i != 0) {
            mo3740b2();
            m3374Q2(i > 0 ? 1 : -1, Math.abs(i), true, a0Var);
            mo3708V1(a0Var, this.f3086t, cVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p2 */
    public View mo3714p2(RecyclerView.C0681v vVar, RecyclerView.C0649a0 a0Var, int i, int i2, int i3) {
        mo3740b2();
        int m = this.f3087u.mo4445m();
        int i4 = this.f3087u.mo4441i();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View L = mo4096L(i);
            int l0 = mo4133l0(L);
            if (l0 >= 0 && l0 < i3) {
                if (((RecyclerView.C0674p) L.getLayoutParams()).mo4168d()) {
                    if (view2 == null) {
                        view2 = L;
                    }
                } else if (this.f3087u.mo4439g(L) < i4 && this.f3087u.mo4436d(L) >= m) {
                    return L;
                } else {
                    if (view == null) {
                        view = L;
                    }
                }
            }
            i += i5;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: q */
    public void mo3466q(int i, RecyclerView.AbstractC0669o.AbstractC0672c cVar) {
        boolean z;
        int i2;
        C0646d dVar = this.f3080D;
        int i3 = -1;
        if (dVar == null || !dVar.mo3768b()) {
            m3370I2();
            z = this.f3090x;
            i2 = this.f3077A;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            C0646d dVar2 = this.f3080D;
            z = dVar2.f3117d;
            i2 = dVar2.f3115b;
        }
        if (!z) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.f3083G && i2 >= 0 && i2 < i; i4++) {
            cVar.mo4164a(i2, 0);
            i2 += i3;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: r */
    public int mo3749r(RecyclerView.C0649a0 a0Var) {
        return m3379W1(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: s */
    public int mo3715s(RecyclerView.C0649a0 a0Var) {
        return m3380X1(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: t */
    public int mo3716t(RecyclerView.C0649a0 a0Var) {
        return m3381Y1(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: u */
    public int mo3750u(RecyclerView.C0649a0 a0Var) {
        return m3379W1(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: v */
    public int mo3717v(RecyclerView.C0649a0 a0Var) {
        return m3380X1(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: w */
    public int mo3718w(RecyclerView.C0649a0 a0Var) {
        return m3381Y1(a0Var);
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: w2 */
    public int mo3751w2(RecyclerView.C0649a0 a0Var) {
        if (a0Var.mo3949g()) {
            return this.f3087u.mo4446n();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: x0 */
    public boolean mo3752x0() {
        return true;
    }

    /* renamed from: x2 */
    public int mo3753x2() {
        return this.f3085s;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y2 */
    public boolean mo3754y2() {
        return mo4118d0() == 1;
    }

    /* renamed from: z2 */
    public boolean mo3755z2() {
        return this.f3092z;
    }
}
