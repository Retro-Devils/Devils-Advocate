package androidx.leanback.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.leanback.widget.AbstractC0559e;
import androidx.leanback.widget.C0554a0;
import androidx.leanback.widget.C0576j;
import androidx.recyclerview.widget.AbstractC0729j;
import androidx.recyclerview.widget.C0725g;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p006b.p021d.C0828d;
import p006b.p030g.p039k.C1013s;
import p006b.p030g.p039k.p040b0.C0979c;

/* access modifiers changed from: package-private */
/* renamed from: androidx.leanback.widget.f */
public final class C0562f extends RecyclerView.AbstractC0669o {

    /* renamed from: s */
    private static final Rect f2832s = new Rect();

    /* renamed from: t */
    static int[] f2833t = new int[2];

    /* renamed from: A */
    int f2834A;

    /* renamed from: B */
    final SparseIntArray f2835B = new SparseIntArray();

    /* renamed from: C */
    int[] f2836C;

    /* renamed from: D */
    RecyclerView.C0681v f2837D;

    /* renamed from: E */
    int f2838E = 221696;

    /* renamed from: F */
    private AbstractC0581n f2839F = null;

    /* renamed from: G */
    private ArrayList<AbstractC0582o> f2840G = null;

    /* renamed from: H */
    AbstractC0580m f2841H = null;

    /* renamed from: I */
    int f2842I = -1;

    /* renamed from: J */
    int f2843J = 0;

    /* renamed from: K */
    AbstractC0566d f2844K;

    /* renamed from: L */
    C0569g f2845L;

    /* renamed from: M */
    private int f2846M = 0;

    /* renamed from: N */
    private int f2847N;

    /* renamed from: O */
    int f2848O;

    /* renamed from: P */
    int f2849P;

    /* renamed from: Q */
    private int f2850Q;

    /* renamed from: R */
    private int f2851R;

    /* renamed from: S */
    private int[] f2852S;

    /* renamed from: T */
    private int f2853T;

    /* renamed from: U */
    private int f2854U;

    /* renamed from: V */
    private int f2855V;

    /* renamed from: W */
    private int f2856W;

    /* renamed from: X */
    private int f2857X;

    /* renamed from: Y */
    private int f2858Y = 8388659;

    /* renamed from: Z */
    int f2859Z;

    /* renamed from: a0 */
    private int f2860a0 = 1;

    /* renamed from: b0 */
    AbstractC0559e f2861b0;

    /* renamed from: c0 */
    private int f2862c0 = 0;

    /* renamed from: d0 */
    final C0554a0 f2863d0 = new C0554a0();

    /* renamed from: e0 */
    private final C0574i f2864e0 = new C0574i();

    /* renamed from: f0 */
    private int f2865f0;

    /* renamed from: g0 */
    private int f2866g0;

    /* renamed from: h0 */
    private int[] f2867h0 = new int[2];

    /* renamed from: i0 */
    final C0605z f2868i0 = new C0605z();

    /* renamed from: j0 */
    private AbstractC0557c f2869j0;

    /* renamed from: k0 */
    private final Runnable f2870k0 = new RunnableC0563a();

    /* renamed from: l0 */
    private AbstractC0559e.AbstractC0561b f2871l0 = new C0564b();

    /* renamed from: m0 */
    C0568f f2872m0;

    /* renamed from: u */
    int f2873u = 10;

    /* renamed from: v */
    final AbstractC0548a f2874v;

    /* renamed from: w */
    int f2875w = 0;

    /* renamed from: x */
    private AbstractC0729j f2876x = AbstractC0729j.m4296a(this);

    /* renamed from: y */
    RecyclerView.C0649a0 f2877y;

    /* renamed from: z */
    int f2878z;

    /* renamed from: androidx.leanback.widget.f$a */
    class RunnableC0563a implements Runnable {
        RunnableC0563a() {
        }

        public void run() {
            C0562f.this.mo4077A1();
        }
    }

    /* renamed from: androidx.leanback.widget.f$b */
    class C0564b implements AbstractC0559e.AbstractC0561b {
        C0564b() {
        }

        @Override // androidx.leanback.widget.AbstractC0559e.AbstractC0561b
        /* renamed from: a */
        public int mo3349a(int i) {
            C0562f fVar = C0562f.this;
            return fVar.mo3393S2(fVar.mo3728F(i - fVar.f2878z));
        }

        @Override // androidx.leanback.widget.AbstractC0559e.AbstractC0561b
        /* renamed from: b */
        public int mo3350b(int i) {
            C0562f fVar = C0562f.this;
            View F = fVar.mo3728F(i - fVar.f2878z);
            C0562f fVar2 = C0562f.this;
            return (fVar2.f2838E & 262144) != 0 ? fVar2.mo3386Q2(F) : fVar2.mo3390R2(F);
        }

        @Override // androidx.leanback.widget.AbstractC0559e.AbstractC0561b
        /* renamed from: c */
        public void mo3351c(Object obj, int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            C0569g gVar;
            View view = (View) obj;
            if (i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE) {
                i4 = !C0562f.this.f2861b0.mo3343u() ? C0562f.this.f2863d0.mo3282a().mo3295g() : C0562f.this.f2863d0.mo3282a().mo3297i() - C0562f.this.f2863d0.mo3282a().mo3294f();
            }
            if (!C0562f.this.f2861b0.mo3343u()) {
                i5 = i2 + i4;
                i6 = i4;
            } else {
                i6 = i4 - i2;
                i5 = i4;
            }
            int B2 = C0562f.this.mo3356B2(i3) + C0562f.this.f2863d0.mo3284c().mo3295g();
            C0562f fVar = C0562f.this;
            int i7 = B2 - fVar.f2849P;
            fVar.f2868i0.mo3632g(view, i);
            C0562f.this.mo3443h3(i3, view, i6, i5, i7);
            if (!C0562f.this.f2877y.mo3950h()) {
                C0562f.this.mo3474t4();
            }
            C0562f fVar2 = C0562f.this;
            if (!((fVar2.f2838E & 3) == 1 || (gVar = fVar2.f2845L) == null)) {
                gVar.mo3504E();
            }
            C0562f fVar3 = C0562f.this;
            if (fVar3.f2841H != null) {
                RecyclerView.AbstractC0655d0 f0 = fVar3.f2874v.mo3838f0(view);
                C0562f fVar4 = C0562f.this;
                fVar4.f2841H.mo3536a(fVar4.f2874v, view, i, f0 == null ? -1 : f0.mo3986k());
            }
        }

        @Override // androidx.leanback.widget.AbstractC0559e.AbstractC0561b
        /* renamed from: d */
        public int mo3352d() {
            return C0562f.this.f2878z;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0079, code lost:
            if (r9.f2845L == null) goto L_0x007b;
         */
        @Override // androidx.leanback.widget.AbstractC0559e.AbstractC0561b
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo3353e(int r6, boolean r7, java.lang.Object[] r8, boolean r9) {
            /*
            // Method dump skipped, instructions count: 194
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C0562f.C0564b.mo3353e(int, boolean, java.lang.Object[], boolean):int");
        }

        @Override // androidx.leanback.widget.AbstractC0559e.AbstractC0561b
        public int getCount() {
            return C0562f.this.f2877y.mo3945c() + C0562f.this.f2878z;
        }

        @Override // androidx.leanback.widget.AbstractC0559e.AbstractC0561b
        public void removeItem(int i) {
            C0562f fVar = C0562f.this;
            View F = fVar.mo3728F(i - fVar.f2878z);
            C0562f fVar2 = C0562f.this;
            if ((fVar2.f2838E & 3) == 1) {
                fVar2.mo4155y(F, fVar2.f2837D);
            } else {
                fVar2.mo4146t1(F, fVar2.f2837D);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.leanback.widget.f$c */
    public class C0565c extends AbstractC0566d {
        C0565c() {
            super();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0686z
        /* renamed from: a */
        public PointF mo3481a(int i) {
            if (mo4233c() == 0) {
                return null;
            }
            C0562f fVar = C0562f.this;
            boolean z = false;
            int l0 = fVar.mo4133l0(fVar.mo4096L(0));
            C0562f fVar2 = C0562f.this;
            int i2 = 1;
            if ((fVar2.f2838E & 262144) == 0 ? i < l0 : i > l0) {
                z = true;
            }
            if (z) {
                i2 = -1;
            }
            return fVar2.f2875w == 0 ? new PointF((float) i2, 0.0f) : new PointF(0.0f, (float) i2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.leanback.widget.f$d */
    public abstract class AbstractC0566d extends C0725g {

        /* renamed from: q */
        boolean f2882q;

        AbstractC0566d() {
            super(C0562f.this.f2874v.getContext());
        }

        /* access modifiers changed from: protected */
        /* renamed from: D */
        public void mo3482D() {
            View b = mo4232b(mo4236f());
            if (b != null) {
                if (C0562f.this.f2842I != mo4236f()) {
                    C0562f.this.f2842I = mo4236f();
                }
                if (C0562f.this.mo4149v0()) {
                    C0562f.this.f2838E |= 32;
                    b.requestFocus();
                    C0562f.this.f2838E &= -33;
                }
                C0562f.this.mo3415Y1();
                C0562f.this.mo3418Z1();
            } else if (mo4236f() >= 0) {
                C0562f.this.mo3358C3(mo4236f(), 0, false, 0);
            }
        }

        /* access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.C0725g, androidx.recyclerview.widget.RecyclerView.AbstractC0686z
        /* renamed from: n */
        public void mo3483n() {
            super.mo3483n();
            if (!this.f2882q) {
                mo3482D();
            }
            C0562f fVar = C0562f.this;
            if (fVar.f2844K == this) {
                fVar.f2844K = null;
            }
            if (fVar.f2845L == this) {
                fVar.f2845L = null;
            }
        }

        /* access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.C0725g, androidx.recyclerview.widget.RecyclerView.AbstractC0686z
        /* renamed from: o */
        public void mo3484o(View view, RecyclerView.C0649a0 a0Var, RecyclerView.AbstractC0686z.C0687a aVar) {
            int i;
            int i2;
            if (C0562f.this.mo3357C2(view, null, C0562f.f2833t)) {
                if (C0562f.this.f2875w == 0) {
                    int[] iArr = C0562f.f2833t;
                    i = iArr[0];
                    i2 = iArr[1];
                } else {
                    int[] iArr2 = C0562f.f2833t;
                    int i3 = iArr2[1];
                    i2 = iArr2[0];
                    i = i3;
                }
                aVar.mo4250d(i, i2, mo4428w((int) Math.sqrt((double) ((i * i) + (i2 * i2)))), this.f3506j);
            }
        }

        /* access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.C0725g
        /* renamed from: x */
        public int mo3485x(int i) {
            int x = super.mo3485x(i);
            if (C0562f.this.f2863d0.mo3282a().mo3297i() <= 0) {
                return x;
            }
            float i2 = (30.0f / ((float) C0562f.this.f2863d0.mo3282a().mo3297i())) * ((float) i);
            return ((float) x) < i2 ? (int) i2 : x;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.leanback.widget.f$e */
    public static final class C0567e extends RecyclerView.C0674p {

        /* renamed from: e */
        int f2884e;

        /* renamed from: f */
        int f2885f;

        /* renamed from: g */
        int f2886g;

        /* renamed from: h */
        int f2887h;

        /* renamed from: i */
        private int f2888i;

        /* renamed from: j */
        private int f2889j;

        /* renamed from: k */
        private int[] f2890k;

        /* renamed from: l */
        private C0576j f2891l;

        public C0567e(int i, int i2) {
            super(i, i2);
        }

        public C0567e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0567e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0567e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0567e(C0567e eVar) {
            super((RecyclerView.C0674p) eVar);
        }

        public C0567e(RecyclerView.C0674p pVar) {
            super(pVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo3486g(int i, View view) {
            C0576j.C0577a[] a = this.f2891l.mo3519a();
            int[] iArr = this.f2890k;
            if (iArr == null || iArr.length != a.length) {
                this.f2890k = new int[a.length];
            }
            for (int i2 = 0; i2 < a.length; i2++) {
                this.f2890k[i2] = C0578k.m3093a(view, a[i2], i);
            }
            if (i == 0) {
                this.f2888i = this.f2890k[0];
            } else {
                this.f2889j = this.f2890k[0];
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public int[] mo3487h() {
            return this.f2890k;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public int mo3488i() {
            return this.f2888i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public int mo3489j() {
            return this.f2889j;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public C0576j mo3490k() {
            return this.f2891l;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public int mo3491l(View view) {
            return (view.getHeight() - this.f2885f) - this.f2887h;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public int mo3492m(View view) {
            return view.getLeft() + this.f2884e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public int mo3493n() {
            return this.f2884e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public int mo3494o(View view) {
            return view.getRight() - this.f2886g;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public int mo3495p() {
            return this.f2886g;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public int mo3496q(View view) {
            return view.getTop() + this.f2885f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public int mo3497r() {
            return this.f2885f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public int mo3498s(View view) {
            return (view.getWidth() - this.f2884e) - this.f2886g;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public void mo3499t(int i) {
            this.f2888i = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: u */
        public void mo3500u(int i) {
            this.f2889j = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public void mo3501v(C0576j jVar) {
            this.f2891l = jVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public void mo3502w(int i, int i2, int i3, int i4) {
            this.f2884e = i;
            this.f2885f = i2;
            this.f2886g = i3;
            this.f2887h = i4;
        }
    }

    /* renamed from: androidx.leanback.widget.f$f */
    public static class C0568f {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.leanback.widget.f$g */
    public final class C0569g extends AbstractC0566d {

        /* renamed from: s */
        private final boolean f2892s;

        /* renamed from: t */
        private int f2893t;

        C0569g(int i, boolean z) {
            super();
            this.f2893t = i;
            this.f2892s = z;
            mo4244p(-2);
        }

        /* access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.C0725g
        /* renamed from: C */
        public void mo3503C(RecyclerView.AbstractC0686z.C0687a aVar) {
            if (this.f2893t != 0) {
                super.mo3503C(aVar);
            }
        }

        /* access modifiers changed from: protected */
        @Override // androidx.leanback.widget.C0562f.AbstractC0566d
        /* renamed from: D */
        public void mo3482D() {
            super.mo3482D();
            this.f2893t = 0;
            View b = mo4232b(mo4236f());
            if (b != null) {
                C0562f.this.mo3363F3(b, true);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: E */
        public void mo3504E() {
            int i;
            if (this.f2892s && (i = this.f2893t) != 0) {
                this.f2893t = C0562f.this.mo3476v3(true, i);
            }
            int i2 = this.f2893t;
            if (i2 == 0 || ((i2 > 0 && C0562f.this.mo3422a3()) || (this.f2893t < 0 && C0562f.this.mo3419Z2()))) {
                mo4244p(C0562f.this.f2842I);
                mo4246r();
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x001f  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x004e  */
        /* JADX WARNING: Removed duplicated region for block: B:31:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
        /* renamed from: F */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo3505F() {
            /*
            // Method dump skipped, instructions count: 106
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C0562f.C0569g.mo3505F():void");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: G */
        public void mo3506G() {
            int i = this.f2893t;
            if (i > (-C0562f.this.f2873u)) {
                this.f2893t = i - 1;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: H */
        public void mo3507H() {
            int i = this.f2893t;
            if (i < C0562f.this.f2873u) {
                this.f2893t = i + 1;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0686z
        /* renamed from: a */
        public PointF mo3481a(int i) {
            int i2 = this.f2893t;
            if (i2 == 0) {
                return null;
            }
            C0562f fVar = C0562f.this;
            int i3 = ((fVar.f2838E & 262144) == 0 ? i2 >= 0 : i2 <= 0) ? 1 : -1;
            return fVar.f2875w == 0 ? new PointF((float) i3, 0.0f) : new PointF(0.0f, (float) i3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.leanback.widget.f$h */
    public static final class C0570h implements Parcelable {
        public static final Parcelable.Creator<C0570h> CREATOR = new C0571a();

        /* renamed from: b */
        int f2895b;

        /* renamed from: c */
        Bundle f2896c = Bundle.EMPTY;

        /* renamed from: androidx.leanback.widget.f$h$a */
        static class C0571a implements Parcelable.Creator<C0570h> {
            C0571a() {
            }

            /* renamed from: a */
            public C0570h createFromParcel(Parcel parcel) {
                return new C0570h(parcel);
            }

            /* renamed from: b */
            public C0570h[] newArray(int i) {
                return new C0570h[i];
            }
        }

        C0570h() {
        }

        C0570h(Parcel parcel) {
            this.f2895b = parcel.readInt();
            this.f2896c = parcel.readBundle(C0562f.class.getClassLoader());
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f2895b);
            parcel.writeBundle(this.f2896c);
        }
    }

    public C0562f(AbstractC0548a aVar) {
        this.f2874v = aVar;
        this.f2848O = -1;
        mo4089H1(false);
    }

    /* renamed from: A2 */
    private int m2872A2(int i) {
        int i2 = this.f2851R;
        if (i2 != 0) {
            return i2;
        }
        int[] iArr = this.f2852S;
        if (iArr == null) {
            return 0;
        }
        return iArr[i];
    }

    /* renamed from: A3 */
    private int m2873A3(int i) {
        if (i == 0) {
            return 0;
        }
        m2901n3(-i);
        this.f2849P += i;
        m2910u4();
        this.f2874v.invalidate();
        return i;
    }

    /* renamed from: B3 */
    private void m2874B3(int i, int i2, boolean z) {
        if ((this.f2838E & 3) == 1) {
            m2917z3(i);
            m2873A3(i2);
            return;
        }
        if (this.f2875w != 0) {
            i2 = i;
            i = i2;
        }
        if (z) {
            this.f2874v.mo3878o1(i, i2);
            return;
        }
        this.f2874v.scrollBy(i, i2);
        mo3418Z1();
    }

    /* renamed from: D2 */
    private int m2875D2(View view) {
        return this.f2863d0.mo3284c().mo3296h(m2880M2(view));
    }

    /* renamed from: D3 */
    private void m2876D3(View view, View view2, boolean z) {
        m2877E3(view, view2, z, 0, 0);
    }

    /* renamed from: E3 */
    private void m2877E3(View view, View view2, boolean z, int i, int i2) {
        if ((this.f2838E & 64) == 0) {
            int i22 = m2894i2(view);
            int H2 = mo3368H2(view, view2);
            if (!(i22 == this.f2842I && H2 == this.f2843J)) {
                this.f2842I = i22;
                this.f2843J = H2;
                this.f2846M = 0;
                if ((this.f2838E & 3) != 1) {
                    mo3415Y1();
                }
                if (this.f2874v.mo3208B1()) {
                    this.f2874v.invalidate();
                }
            }
            if (view != null) {
                if (!view.hasFocus() && this.f2874v.hasFocus()) {
                    view.requestFocus();
                }
                if ((this.f2838E & 131072) == 0 && z) {
                    return;
                }
                if (mo3357C2(view, view2, f2833t) || i != 0 || i2 != 0) {
                    int[] iArr = f2833t;
                    m2874B3(iArr[0] + i, iArr[1] + i2, z);
                }
            }
        }
    }

    /* renamed from: F2 */
    private int m2878F2() {
        int i = (this.f2838E & 524288) != 0 ? 0 : this.f2859Z - 1;
        return mo3356B2(i) + m2872A2(i);
    }

    /* renamed from: L2 */
    private int m2879L2(View view) {
        return this.f2875w == 0 ? m2881N2(view) : m2882O2(view);
    }

    /* renamed from: M2 */
    private int m2880M2(View view) {
        return this.f2875w == 0 ? m2882O2(view) : m2881N2(view);
    }

    /* renamed from: N2 */
    private int m2881N2(View view) {
        C0567e eVar = (C0567e) view.getLayoutParams();
        return eVar.mo3492m(view) + eVar.mo3488i();
    }

    /* renamed from: O2 */
    private int m2882O2(View view) {
        C0567e eVar = (C0567e) view.getLayoutParams();
        return eVar.mo3496q(view) + eVar.mo3489j();
    }

    /* renamed from: U1 */
    private boolean m2883U1() {
        return this.f2861b0.mo3324a();
    }

    /* renamed from: V1 */
    private void m2884V1() {
        this.f2861b0.mo3325b((this.f2838E & 262144) != 0 ? (-this.f2866g0) - this.f2834A : this.f2865f0 + this.f2866g0 + this.f2834A);
    }

    /* renamed from: X1 */
    private void m2885X1() {
        this.f2861b0 = null;
        this.f2852S = null;
        this.f2838E &= -1025;
    }

    /* renamed from: X2 */
    private boolean m2886X2(RecyclerView recyclerView, int i, Rect rect) {
        View F = mo3728F(this.f2842I);
        if (F != null) {
            return F.requestFocus(i, rect);
        }
        return false;
    }

    /* renamed from: Y2 */
    private boolean m2887Y2(RecyclerView recyclerView, int i, Rect rect) {
        int i2;
        int i3;
        int M = mo4098M();
        int i4 = -1;
        if ((i & 2) != 0) {
            i4 = M;
            i2 = 0;
            i3 = 1;
        } else {
            i2 = M - 1;
            i3 = -1;
        }
        int g = this.f2863d0.mo3282a().mo3295g();
        int c = this.f2863d0.mo3282a().mo3291c() + g;
        while (i2 != i4) {
            View L = mo4096L(i2);
            if (L.getVisibility() == 0 && mo3390R2(L) >= g && mo3386Q2(L) <= c && L.requestFocus(i, rect)) {
                return true;
            }
            i2 += i3;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c3 A[LOOP:3: B:30:0x00c3->B:33:0x00d1, LOOP_START] */
    /* renamed from: a2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m2888a2() {
        /*
        // Method dump skipped, instructions count: 219
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C0562f.m2888a2():void");
    }

    /* renamed from: c2 */
    private int m2889c2(View view) {
        View E;
        AbstractC0548a aVar = this.f2874v;
        if (aVar == null || view == aVar || (E = mo4083E(view)) == null) {
            return -1;
        }
        int M = mo4098M();
        for (int i = 0; i < M; i++) {
            if (mo4096L(i) == E) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: d3 */
    private void m2890d3() {
        this.f2863d0.mo3283b();
        this.f2863d0.f2806c.mo3313x(mo4143s0());
        this.f2863d0.f2805b.mo3313x(mo4112a0());
        this.f2863d0.f2806c.mo3308t(mo4127i0(), mo4129j0());
        this.f2863d0.f2805b.mo3308t(mo4131k0(), mo4124h0());
        this.f2865f0 = this.f2863d0.mo3282a().mo3297i();
        this.f2849P = 0;
    }

    /* renamed from: f2 */
    private void m2891f2(boolean z, boolean z2, int i, int i2) {
        View F = mo3728F(this.f2842I);
        if (F != null && z2) {
            mo3366G3(F, false, i, i2);
        }
        if (F != null && z && !F.hasFocus()) {
            F.requestFocus();
        } else if (!z && !this.f2874v.hasFocus()) {
            if (F == null || !F.hasFocusable()) {
                int M = mo4098M();
                int i3 = 0;
                while (true) {
                    if (i3 < M) {
                        F = mo4096L(i3);
                        if (F != null && F.hasFocusable()) {
                            break;
                        }
                        i3++;
                    } else {
                        break;
                    }
                }
                if (z2 && F != null && F.hasFocus()) {
                    mo3366G3(F, false, i, i2);
                    return;
                }
                return;
            }
            this.f2874v.focusableViewAvailable(F);
            if (z2) {
            }
        }
    }

    /* renamed from: g2 */
    private void m2892g2() {
        C1013s.m5750a0(this.f2874v, this.f2870k0);
    }

    /* renamed from: h2 */
    private int m2893h2(int i) {
        return m2894i2(mo4096L(i));
    }

    /* renamed from: i2 */
    private int m2894i2(View view) {
        C0567e eVar;
        if (view == null || (eVar = (C0567e) view.getLayoutParams()) == null || eVar.mo4168d()) {
            return -1;
        }
        return eVar.mo4165a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0071, code lost:
        if (((r5.f2838E & 262144) == 0) == r5.f2861b0.mo3343u()) goto L_0x008c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006a  */
    /* renamed from: i3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m2895i3() {
        /*
        // Method dump skipped, instructions count: 182
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C0562f.m2895i3():boolean");
    }

    /* renamed from: j2 */
    private int m2896j2(int i, View view, View view2) {
        int H2 = mo3368H2(view, view2);
        if (H2 == 0) {
            return i;
        }
        C0567e eVar = (C0567e) view.getLayoutParams();
        return i + (eVar.mo3487h()[H2] - eVar.mo3487h()[0]);
    }

    /* renamed from: j3 */
    private void m2897j3() {
        this.f2837D = null;
        this.f2877y = null;
        this.f2878z = 0;
        this.f2834A = 0;
    }

    /* renamed from: k2 */
    private boolean m2898k2(View view, View view2, int[] iArr) {
        int z2 = m2916z2(view);
        if (view2 != null) {
            z2 = m2896j2(z2, view, view2);
        }
        int D2 = m2875D2(view);
        int i = z2 + this.f2847N;
        if (i == 0 && D2 == 0) {
            iArr[0] = 0;
            iArr[1] = 0;
            return false;
        }
        iArr[0] = i;
        iArr[1] = D2;
        return true;
    }

    /* renamed from: l3 */
    private void m2899l3(int i, int i2, int i3, int[] iArr) {
        View o = this.f2837D.mo4215o(i);
        if (o != null) {
            C0567e eVar = (C0567e) o.getLayoutParams();
            Rect rect = f2832s;
            mo4130k(o, rect);
            o.measure(ViewGroup.getChildMeasureSpec(i2, mo4127i0() + mo4129j0() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin + rect.left + rect.right, ((ViewGroup.MarginLayoutParams) eVar).width), ViewGroup.getChildMeasureSpec(i3, mo4131k0() + mo4124h0() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin + rect.top + rect.bottom, ((ViewGroup.MarginLayoutParams) eVar).height));
            iArr[0] = mo3458n2(o);
            iArr[1] = mo3455m2(o);
            this.f2837D.mo4191B(o);
        }
    }

    /* renamed from: m3 */
    private void m2900m3(int i) {
        int M = mo4098M();
        int i2 = 0;
        if (this.f2875w == 1) {
            while (i2 < M) {
                mo4096L(i2).offsetTopAndBottom(i);
                i2++;
            }
            return;
        }
        while (i2 < M) {
            mo4096L(i2).offsetLeftAndRight(i);
            i2++;
        }
    }

    /* renamed from: n3 */
    private void m2901n3(int i) {
        int M = mo4098M();
        int i2 = 0;
        if (this.f2875w == 0) {
            while (i2 < M) {
                mo4096L(i2).offsetTopAndBottom(i);
                i2++;
            }
            return;
        }
        while (i2 < M) {
            mo4096L(i2).offsetLeftAndRight(i);
            i2++;
        }
    }

    /* renamed from: n4 */
    private void m2902n4() {
        int M = mo4098M();
        for (int i = 0; i < M; i++) {
            m2903o4(mo4096L(i));
        }
    }

    /* renamed from: o4 */
    private void m2903o4(View view) {
        C0567e eVar = (C0567e) view.getLayoutParams();
        if (eVar.mo3490k() == null) {
            eVar.mo3499t(this.f2864e0.f2899c.mo3518j(view));
        } else {
            eVar.mo3486g(this.f2875w, view);
            if (this.f2875w != 0) {
                eVar.mo3499t(this.f2864e0.f2899c.mo3518j(view));
                return;
            }
        }
        eVar.mo3500u(this.f2864e0.f2898b.mo3518j(view));
    }

    /* renamed from: r3 */
    private boolean m2904r3() {
        return this.f2861b0.mo3344v();
    }

    /* renamed from: r4 */
    private void m2905r4() {
        int i = this.f2838E & -1025;
        int i2 = 0;
        if (m2909u3(false)) {
            i2 = 1024;
        }
        int i3 = i | i2;
        this.f2838E = i3;
        if ((i3 & 1024) != 0) {
            m2892g2();
        }
    }

    /* renamed from: s3 */
    private void m2906s3() {
        this.f2861b0.mo3345w((this.f2838E & 262144) != 0 ? this.f2865f0 + this.f2866g0 + this.f2834A : (-this.f2866g0) - this.f2834A);
    }

    /* renamed from: s4 */
    private void m2907s4() {
        this.f2863d0.f2806c.mo3313x(mo4143s0());
        this.f2863d0.f2805b.mo3313x(mo4112a0());
        this.f2863d0.f2806c.mo3308t(mo4127i0(), mo4129j0());
        this.f2863d0.f2805b.mo3308t(mo4131k0(), mo4124h0());
        this.f2865f0 = this.f2863d0.mo3282a().mo3297i();
    }

    /* renamed from: t3 */
    private void m2908t3(boolean z) {
        if (z) {
            if (mo3422a3()) {
                return;
            }
        } else if (mo3419Z2()) {
            return;
        }
        C0569g gVar = this.f2845L;
        if (gVar == null) {
            this.f2874v.mo3936x1();
            boolean z2 = true;
            int i = z ? 1 : -1;
            if (this.f2859Z <= 1) {
                z2 = false;
            }
            C0569g gVar2 = new C0569g(i, z2);
            this.f2846M = 0;
            mo3389R1(gVar2);
        } else if (z) {
            gVar.mo3507H();
        } else {
            gVar.mo3506G();
        }
    }

    /* renamed from: u3 */
    private boolean m2909u3(boolean z) {
        if (this.f2851R != 0 || this.f2852S == null) {
            return false;
        }
        AbstractC0559e eVar = this.f2861b0;
        C0828d[] n = eVar == null ? null : eVar.mo3336n();
        boolean z2 = false;
        int i = -1;
        for (int i2 = 0; i2 < this.f2859Z; i2++) {
            C0828d dVar = n == null ? null : n[i2];
            int g = dVar == null ? 0 : dVar.mo4910g();
            int i3 = -1;
            for (int i4 = 0; i4 < g; i4 += 2) {
                int d = dVar.mo4907d(i4 + 1);
                for (int d2 = dVar.mo4907d(i4); d2 <= d; d2++) {
                    View F = mo3728F(d2 - this.f2878z);
                    if (F != null) {
                        if (z) {
                            mo3449k3(F);
                        }
                        int m2 = this.f2875w == 0 ? mo3455m2(F) : mo3458n2(F);
                        if (m2 > i3) {
                            i3 = m2;
                        }
                    }
                }
            }
            int c = this.f2877y.mo3945c();
            if (!this.f2874v.mo3874n0() && z && i3 < 0 && c > 0) {
                if (i < 0) {
                    int i5 = this.f2842I;
                    if (i5 < 0) {
                        i5 = 0;
                    } else if (i5 >= c) {
                        i5 = c - 1;
                    }
                    if (mo4098M() > 0) {
                        int m = this.f2874v.mo3838f0(mo4096L(0)).mo3988m();
                        int m3 = this.f2874v.mo3838f0(mo4096L(mo4098M() - 1)).mo3988m();
                        if (i5 >= m && i5 <= m3) {
                            i5 = i5 - m <= m3 - i5 ? m - 1 : m3 + 1;
                            if (i5 < 0 && m3 < c - 1) {
                                i5 = m3 + 1;
                            } else if (i5 >= c && m > 0) {
                                i5 = m - 1;
                            }
                        }
                    }
                    if (i5 >= 0 && i5 < c) {
                        m2899l3(i5, View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0), this.f2867h0);
                        i = this.f2875w == 0 ? this.f2867h0[1] : this.f2867h0[0];
                    }
                }
                if (i >= 0) {
                    i3 = i;
                }
            }
            if (i3 < 0) {
                i3 = 0;
            }
            int[] iArr = this.f2852S;
            if (iArr[i2] != i3) {
                iArr[i2] = i3;
                z2 = true;
            }
        }
        return z2;
    }

    /* renamed from: u4 */
    private void m2910u4() {
        C0554a0.C0555a c = this.f2863d0.mo3284c();
        int g = c.mo3295g() - this.f2849P;
        int F2 = m2878F2() + g;
        c.mo3288B(g, F2, g, F2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023 A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0038 A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0046 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: v2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m2911v2(int r10) {
        /*
            r9 = this;
            int r0 = r9.f2875w
            r1 = 130(0x82, float:1.82E-43)
            r2 = 66
            r3 = 33
            r4 = 0
            r5 = 3
            r6 = 2
            r7 = 17
            r8 = 1
            if (r0 != 0) goto L_0x002b
            r0 = 262144(0x40000, float:3.67342E-40)
            if (r10 == r7) goto L_0x0025
            if (r10 == r3) goto L_0x0023
            if (r10 == r2) goto L_0x001d
            if (r10 == r1) goto L_0x001b
            goto L_0x0046
        L_0x001b:
            r4 = 3
            goto L_0x0048
        L_0x001d:
            int r10 = r9.f2838E
            r10 = r10 & r0
            if (r10 != 0) goto L_0x0048
            goto L_0x0038
        L_0x0023:
            r4 = 2
            goto L_0x0048
        L_0x0025:
            int r10 = r9.f2838E
            r10 = r10 & r0
            if (r10 != 0) goto L_0x0038
            goto L_0x0048
        L_0x002b:
            if (r0 != r8) goto L_0x0046
            r0 = 524288(0x80000, float:7.34684E-40)
            if (r10 == r7) goto L_0x0040
            if (r10 == r3) goto L_0x0048
            if (r10 == r2) goto L_0x003a
            if (r10 == r1) goto L_0x0038
            goto L_0x0046
        L_0x0038:
            r4 = 1
            goto L_0x0048
        L_0x003a:
            int r10 = r9.f2838E
            r10 = r10 & r0
            if (r10 != 0) goto L_0x0023
            goto L_0x001b
        L_0x0040:
            int r10 = r9.f2838E
            r10 = r10 & r0
            if (r10 != 0) goto L_0x001b
            goto L_0x0023
        L_0x0046:
            r4 = 17
        L_0x0048:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C0562f.m2911v2(int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009f, code lost:
        if (r2 != null) goto L_0x00a5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c3 A[ADDED_TO_REGION] */
    /* renamed from: w2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m2912w2(android.view.View r13, int[] r14) {
        /*
        // Method dump skipped, instructions count: 204
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C0562f.m2912w2(android.view.View, int[]):boolean");
    }

    /* renamed from: w3 */
    private void m2913w3() {
        int i = this.f2838E;
        if ((65600 & i) == 65536) {
            this.f2861b0.mo3347y(this.f2842I, (i & 262144) != 0 ? -this.f2866g0 : this.f2865f0 + this.f2866g0);
        }
    }

    /* renamed from: x3 */
    private void m2914x3() {
        int i = this.f2838E;
        if ((65600 & i) == 65536) {
            this.f2861b0.mo3348z(this.f2842I, (i & 262144) != 0 ? this.f2865f0 + this.f2866g0 : -this.f2866g0);
        }
    }

    /* renamed from: y3 */
    private void m2915y3(RecyclerView.C0681v vVar, RecyclerView.C0649a0 a0Var) {
        if (!(this.f2837D == null && this.f2877y == null)) {
            Log.e("GridLayoutManager", "Recycler information was not released, bug!");
        }
        this.f2837D = vVar;
        this.f2877y = a0Var;
        this.f2878z = 0;
        this.f2834A = 0;
    }

    /* renamed from: z2 */
    private int m2916z2(View view) {
        return this.f2863d0.mo3282a().mo3296h(m2879L2(view));
    }

    /* renamed from: z3 */
    private int m2917z3(int i) {
        int i2;
        int i3 = this.f2838E;
        boolean z = true;
        if ((i3 & 64) == 0 && (i3 & 3) != 1 && (i <= 0 ? !(i >= 0 || this.f2863d0.mo3282a().mo3304p() || i >= (i2 = this.f2863d0.mo3282a().mo3293e())) : !(this.f2863d0.mo3282a().mo3303o() || i <= (i2 = this.f2863d0.mo3282a().mo3292d())))) {
            i = i2;
        }
        if (i == 0) {
            return 0;
        }
        m2900m3(-i);
        if ((this.f2838E & 3) == 1) {
            mo3474t4();
            return i;
        }
        int M = mo4098M();
        if ((this.f2838E & 262144) == 0 ? i >= 0 : i <= 0) {
            m2884V1();
        } else {
            m2906s3();
        }
        boolean z2 = mo4098M() > M;
        int M2 = mo4098M();
        if ((262144 & this.f2838E) == 0 ? i >= 0 : i <= 0) {
            m2914x3();
        } else {
            m2913w3();
        }
        if (mo4098M() >= M2) {
            z = false;
        }
        if (z2 || z) {
            m2905r4();
        }
        this.f2874v.invalidate();
        mo3474t4();
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B2 */
    public int mo3356B2(int i) {
        int i2 = 0;
        if ((this.f2838E & 524288) != 0) {
            for (int i3 = this.f2859Z - 1; i3 > i; i3--) {
                i2 += m2872A2(i3) + this.f2857X;
            }
            return i2;
        }
        int i4 = 0;
        while (i2 < i) {
            i4 += m2872A2(i2) + this.f2857X;
            i2++;
        }
        return i4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C2 */
    public boolean mo3357C2(View view, View view2, int[] iArr) {
        int i = this.f2862c0;
        return (i == 1 || i == 2) ? m2912w2(view, iArr) : m2898k2(view, view2, iArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C3 */
    public void mo3358C3(int i, int i2, boolean z, int i3) {
        this.f2847N = i3;
        View F = mo3728F(i);
        boolean z2 = !mo4080C0();
        if (!z2 || this.f2874v.isLayoutRequested() || F == null || m2894i2(F) != i) {
            int i4 = this.f2838E;
            if ((i4 & 512) == 0 || (i4 & 64) != 0) {
                this.f2842I = i;
                this.f2843J = i2;
                this.f2846M = Integer.MIN_VALUE;
                return;
            } else if (!z || this.f2874v.isLayoutRequested()) {
                if (!z2) {
                    mo3453l4();
                    this.f2874v.mo3936x1();
                }
                if (this.f2874v.isLayoutRequested() || F == null || m2894i2(F) != i) {
                    this.f2842I = i;
                    this.f2843J = i2;
                    this.f2846M = Integer.MIN_VALUE;
                    this.f2838E |= 256;
                    mo4077A1();
                    return;
                }
            } else {
                this.f2842I = i;
                this.f2843J = i2;
                this.f2846M = Integer.MIN_VALUE;
                if (!mo3426b3()) {
                    Log.w(mo3373J2(), "setSelectionSmooth should not be called before first layout pass");
                    return;
                }
                int m4 = mo3456m4(i);
                if (m4 != this.f2842I) {
                    this.f2842I = m4;
                    this.f2843J = 0;
                    return;
                }
                return;
            }
        }
        this.f2838E |= 32;
        mo3363F3(F, z);
        this.f2838E &= -33;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: D1 */
    public int mo3359D1(int i, RecyclerView.C0681v vVar, RecyclerView.C0649a0 a0Var) {
        if ((this.f2838E & 512) == 0 || !mo3426b3()) {
            return 0;
        }
        m2915y3(vVar, a0Var);
        this.f2838E = (this.f2838E & -4) | 2;
        int z3 = this.f2875w == 0 ? m2917z3(i) : m2873A3(i);
        m2897j3();
        this.f2838E &= -4;
        return z3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: E1 */
    public void mo3360E1(int i) {
        mo3436e4(i, 0, false, 0);
    }

    /* renamed from: E2 */
    public int mo3361E2() {
        return this.f2842I;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: F1 */
    public int mo3362F1(int i, RecyclerView.C0681v vVar, RecyclerView.C0649a0 a0Var) {
        if ((this.f2838E & 512) == 0 || !mo3426b3()) {
            return 0;
        }
        this.f2838E = (this.f2838E & -4) | 2;
        m2915y3(vVar, a0Var);
        int z3 = this.f2875w == 1 ? m2917z3(i) : m2873A3(i);
        m2897j3();
        this.f2838E &= -4;
        return z3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F3 */
    public void mo3363F3(View view, boolean z) {
        m2876D3(view, view == null ? null : view.findFocus(), z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: G */
    public RecyclerView.C0674p mo3364G() {
        return new C0567e(-2, -2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G2 */
    public int mo3365G2() {
        int i;
        int i2;
        int right;
        if (this.f2875w == 1) {
            i2 = -mo4112a0();
            if (mo4098M() <= 0 || (i = mo4096L(0).getTop()) >= 0) {
                return i2;
            }
        } else if ((this.f2838E & 262144) != 0) {
            int s0 = mo4143s0();
            return (mo4098M() <= 0 || (right = mo4096L(0).getRight()) <= s0) ? s0 : right;
        } else {
            i2 = -mo4143s0();
            if (mo4098M() <= 0 || (i = mo4096L(0).getLeft()) >= 0) {
                return i2;
            }
        }
        return i2 + i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G3 */
    public void mo3366G3(View view, boolean z, int i, int i2) {
        m2877E3(view, view == null ? null : view.findFocus(), z, i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: H */
    public RecyclerView.C0674p mo3367H(Context context, AttributeSet attributeSet) {
        return new C0567e(context, attributeSet);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H2 */
    public int mo3368H2(View view, View view2) {
        C0576j k;
        if (!(view == null || view2 == null || (k = ((C0567e) view.getLayoutParams()).mo3490k()) == null)) {
            C0576j.C0577a[] a = k.mo3519a();
            if (a.length > 1) {
                while (view2 != view) {
                    int id = view2.getId();
                    if (id != -1) {
                        for (int i = 1; i < a.length; i++) {
                            if (a[i].mo3520a() == id) {
                                return i;
                            }
                        }
                        continue;
                    }
                    view2 = (View) view2.getParent();
                }
            }
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H3 */
    public void mo3369H3(int i) {
        this.f2848O = i;
        if (i != -1) {
            int M = mo4098M();
            for (int i2 = 0; i2 < M; i2++) {
                mo4096L(i2).setVisibility(this.f2848O);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: I */
    public RecyclerView.C0674p mo3370I(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0567e ? new C0567e((C0567e) layoutParams) : layoutParams instanceof RecyclerView.C0674p ? new C0567e((RecyclerView.C0674p) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0567e((ViewGroup.MarginLayoutParams) layoutParams) : new C0567e(layoutParams);
    }

    /* renamed from: I2 */
    public int mo3371I2() {
        return this.f2843J;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I3 */
    public void mo3372I3(int i) {
        int i2 = this.f2866g0;
        if (i2 != i) {
            if (i2 >= 0) {
                this.f2866g0 = i;
                mo4077A1();
                return;
            }
            throw new IllegalArgumentException("ExtraLayoutSpace must >= 0");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J2 */
    public String mo3373J2() {
        return "GridLayoutManager:" + this.f2874v.getId();
    }

    /* renamed from: J3 */
    public void mo3374J3(boolean z, boolean z2) {
        int i = 0;
        int i2 = (z ? 2048 : 0) | (this.f2838E & -6145);
        if (z2) {
            i = 4096;
        }
        this.f2838E = i2 | i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: K0 */
    public void mo3375K0(RecyclerView.AbstractC0658g gVar, RecyclerView.AbstractC0658g gVar2) {
        if (gVar != null) {
            m2885X1();
            this.f2842I = -1;
            this.f2846M = 0;
            this.f2868i0.mo3628b();
        }
        this.f2869j0 = gVar2 instanceof AbstractC0557c ? (AbstractC0557c) gVar2 : null;
        super.mo3375K0(gVar, gVar2);
    }

    /* renamed from: K2 */
    public int mo3376K2() {
        return this.f2855V;
    }

    /* renamed from: K3 */
    public void mo3377K3(boolean z, boolean z2) {
        int i = 0;
        int i2 = (z ? 8192 : 0) | (this.f2838E & -24577);
        if (z2) {
            i = 16384;
        }
        this.f2838E = i2 | i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: L0 */
    public boolean mo3378L0(RecyclerView recyclerView, ArrayList<View> arrayList, int i, int i2) {
        int i3;
        if ((this.f2838E & 32768) != 0) {
            return true;
        }
        if (!recyclerView.hasFocus()) {
            int size = arrayList.size();
            if (this.f2862c0 != 0) {
                int g = this.f2863d0.mo3282a().mo3295g();
                int c = this.f2863d0.mo3282a().mo3291c() + g;
                int M = mo4098M();
                for (int i4 = 0; i4 < M; i4++) {
                    View L = mo4096L(i4);
                    if (L.getVisibility() == 0 && mo3390R2(L) >= g && mo3386Q2(L) <= c) {
                        L.addFocusables(arrayList, i, i2);
                    }
                }
                if (arrayList.size() == size) {
                    int M2 = mo4098M();
                    for (int i5 = 0; i5 < M2; i5++) {
                        View L2 = mo4096L(i5);
                        if (L2.getVisibility() == 0) {
                            L2.addFocusables(arrayList, i, i2);
                        }
                    }
                }
            } else {
                View F = mo3728F(this.f2842I);
                if (F != null) {
                    F.addFocusables(arrayList, i, i2);
                }
            }
            if (arrayList.size() == size && recyclerView.isFocusable()) {
                arrayList.add(recyclerView);
            }
        } else if (this.f2845L != null) {
            return true;
        } else {
            int v2 = m2911v2(i);
            int c2 = m2889c2(recyclerView.findFocus());
            int h2 = m2893h2(c2);
            View F2 = h2 == -1 ? null : mo3728F(h2);
            if (F2 != null) {
                F2.addFocusables(arrayList, i, i2);
            }
            if (this.f2861b0 == null || mo4098M() == 0) {
                return true;
            }
            if ((v2 == 3 || v2 == 2) && this.f2861b0.mo3340r() <= 1) {
                return true;
            }
            AbstractC0559e eVar = this.f2861b0;
            int i6 = (eVar == null || F2 == null) ? -1 : eVar.mo3339q(h2).f2831a;
            int size2 = arrayList.size();
            int i7 = (v2 == 1 || v2 == 3) ? 1 : -1;
            int M3 = i7 > 0 ? mo4098M() - 1 : 0;
            int M4 = c2 == -1 ? i7 > 0 ? 0 : mo4098M() - 1 : c2 + i7;
            while (true) {
                if (i7 > 0) {
                    if (M4 > M3) {
                        break;
                    }
                } else if (M4 < M3) {
                    break;
                }
                View L3 = mo4096L(M4);
                if (L3.getVisibility() == 0 && L3.hasFocusable()) {
                    if (F2 == null) {
                        L3.addFocusables(arrayList, i, i2);
                        if (arrayList.size() > size2) {
                            break;
                        }
                    } else {
                        int h22 = m2893h2(M4);
                        AbstractC0559e.C0560a q = this.f2861b0.mo3339q(h22);
                        if (q != null) {
                            if (v2 == 1) {
                                if (q.f2831a == i6 && h22 > h2) {
                                    L3.addFocusables(arrayList, i, i2);
                                    if (arrayList.size() > size2) {
                                        break;
                                    }
                                }
                            } else if (v2 == 0) {
                                if (q.f2831a == i6 && h22 < h2) {
                                    L3.addFocusables(arrayList, i, i2);
                                    if (arrayList.size() > size2) {
                                        break;
                                    }
                                }
                            } else if (v2 == 3) {
                                int i8 = q.f2831a;
                                if (i8 != i6) {
                                    if (i8 < i6) {
                                        break;
                                    }
                                    L3.addFocusables(arrayList, i, i2);
                                }
                            } else if (v2 == 2 && (i3 = q.f2831a) != i6) {
                                if (i3 > i6) {
                                    break;
                                }
                                L3.addFocusables(arrayList, i, i2);
                            }
                        }
                    }
                }
                M4 += i7;
            }
        }
        return true;
    }

    /* renamed from: L3 */
    public void mo3379L3(int i) {
        this.f2862c0 = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M3 */
    public void mo3380M3(boolean z) {
        this.f2838E = (z ? 32768 : 0) | (this.f2838E & -32769);
    }

    /* renamed from: N3 */
    public void mo3381N3(int i) {
        this.f2858Y = i;
    }

    /* renamed from: O3 */
    public void mo3382O3(int i) {
        int i2 = this.f2875w;
        this.f2854U = i;
        if (i2 == 0) {
            this.f2856W = i;
        } else {
            this.f2857X = i;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: P2 */
    public View mo3383P2(int i) {
        return this.f2837D.mo4215o(i);
    }

    /* renamed from: P3 */
    public void mo3384P3(int i) {
        this.f2864e0.mo3516a().mo3525f(i);
        m2902n4();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: Q1 */
    public void mo3385Q1(RecyclerView recyclerView, RecyclerView.C0649a0 a0Var, int i) {
        mo3436e4(i, 0, true, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q2 */
    public int mo3386Q2(View view) {
        return this.f2876x.mo4436d(view);
    }

    /* renamed from: Q3 */
    public void mo3387Q3(float f) {
        this.f2864e0.mo3516a().mo3526g(f);
        m2902n4();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: R */
    public int mo3388R(RecyclerView.C0681v vVar, RecyclerView.C0649a0 a0Var) {
        AbstractC0559e eVar;
        return (this.f2875w != 1 || (eVar = this.f2861b0) == null) ? super.mo3388R(vVar, a0Var) : eVar.mo3340r();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: R1 */
    public void mo3389R1(RecyclerView.AbstractC0686z zVar) {
        mo3453l4();
        super.mo3389R1(zVar);
        if (!zVar.mo4238h() || !(zVar instanceof AbstractC0566d)) {
            this.f2844K = null;
        } else {
            AbstractC0566d dVar = (AbstractC0566d) zVar;
            this.f2844K = dVar;
            if (dVar instanceof C0569g) {
                this.f2845L = (C0569g) dVar;
                return;
            }
        }
        this.f2845L = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R2 */
    public int mo3390R2(View view) {
        return this.f2876x.mo4439g(view);
    }

    /* renamed from: R3 */
    public void mo3391R3(boolean z) {
        this.f2864e0.mo3516a().mo3527h(z);
        m2902n4();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: S */
    public int mo3392S(View view) {
        return super.mo3392S(view) - ((C0567e) view.getLayoutParams()).f2887h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S2 */
    public int mo3393S2(View view) {
        Rect rect = f2832s;
        mo3395T(view, rect);
        return this.f2875w == 0 ? rect.width() : rect.height();
    }

    /* renamed from: S3 */
    public void mo3394S3(int i) {
        this.f2864e0.mo3516a().mo3528i(i);
        m2902n4();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: T */
    public void mo3395T(View view, Rect rect) {
        super.mo3395T(view, rect);
        C0567e eVar = (C0567e) view.getLayoutParams();
        rect.left += eVar.f2884e;
        rect.top += eVar.f2885f;
        rect.right -= eVar.f2886g;
        rect.bottom -= eVar.f2887h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: T0 */
    public void mo3396T0(RecyclerView.C0681v vVar, RecyclerView.C0649a0 a0Var, C0979c cVar) {
        m2915y3(vVar, a0Var);
        int c = a0Var.mo3945c();
        boolean z = (this.f2838E & 262144) != 0;
        if (c > 1 && !mo3435e3(0)) {
            if (Build.VERSION.SDK_INT >= 23) {
                cVar.mo5471b(this.f2875w == 0 ? z ? C0979c.C0980a.f4691B : C0979c.C0980a.f4726z : C0979c.C0980a.f4725y);
            } else {
                cVar.mo5469a(8192);
            }
            cVar.mo5503t0(true);
        }
        if (c > 1 && !mo3435e3(c - 1)) {
            if (Build.VERSION.SDK_INT >= 23) {
                cVar.mo5471b(this.f2875w == 0 ? z ? C0979c.C0980a.f4726z : C0979c.C0980a.f4691B : C0979c.C0980a.f4690A);
            } else {
                cVar.mo5469a(4096);
            }
            cVar.mo5503t0(true);
        }
        cVar.mo5474c0(C0979c.C0981b.m5655b(mo3459o0(vVar, a0Var), mo3388R(vVar, a0Var), mo4076A0(vVar, a0Var), mo4138p0(vVar, a0Var)));
        m2897j3();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: T1 */
    public boolean mo3397T1() {
        return true;
    }

    /* renamed from: T2 */
    public int mo3398T2() {
        return this.f2863d0.mo3282a().mo3298j();
    }

    /* renamed from: T3 */
    public void mo3399T3(int i) {
        this.f2854U = i;
        this.f2855V = i;
        this.f2857X = i;
        this.f2856W = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: U */
    public int mo3400U(View view) {
        return super.mo3400U(view) + ((C0567e) view.getLayoutParams()).f2884e;
    }

    /* renamed from: U2 */
    public int mo3401U2() {
        return this.f2863d0.mo3282a().mo3299k();
    }

    /* renamed from: U3 */
    public void mo3402U3(boolean z) {
        int i = this.f2838E;
        int i2 = 0;
        if (((i & 512) != 0) != z) {
            int i3 = i & -513;
            if (z) {
                i2 = 512;
            }
            this.f2838E = i3 | i2;
            mo4077A1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: V0 */
    public void mo3403V0(RecyclerView.C0681v vVar, RecyclerView.C0649a0 a0Var, View view, C0979c cVar) {
        int i;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (this.f2861b0 != null && (layoutParams instanceof C0567e)) {
            int a = ((C0567e) layoutParams).mo4165a();
            int s = a >= 0 ? this.f2861b0.mo3341s(a) : -1;
            if (s >= 0) {
                int r = a / this.f2861b0.mo3340r();
                if (this.f2875w == 0) {
                    i = s;
                    s = r;
                } else {
                    i = r;
                }
                cVar.mo5476d0(C0979c.C0982c.m5656a(i, 1, s, 1, false, false));
            }
        }
    }

    /* renamed from: V2 */
    public float mo3404V2() {
        return this.f2863d0.mo3282a().mo3300l();
    }

    /* renamed from: V3 */
    public void mo3405V3(int i) {
        if (i >= 0) {
            this.f2860a0 = i;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARNING: Removed duplicated region for block: B:70:0x00ca A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00cb  */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: W0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo3406W0(android.view.View r8, int r9) {
        /*
        // Method dump skipped, instructions count: 222
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C0562f.mo3406W0(android.view.View, int):android.view.View");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W1 */
    public boolean mo3407W1(View view) {
        return view.getVisibility() == 0 && (!mo4149v0() || view.hasFocusable());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W2 */
    public boolean mo3408W2(RecyclerView recyclerView, int i, Rect rect) {
        int i2 = this.f2862c0;
        return (i2 == 1 || i2 == 2) ? m2887Y2(recyclerView, i, rect) : m2886X2(recyclerView, i, rect);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W3 */
    public void mo3409W3(AbstractC0580m mVar) {
        this.f2841H = mVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: X */
    public int mo3410X(View view) {
        return super.mo3410X(view) - ((C0567e) view.getLayoutParams()).f2886g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: X0 */
    public void mo3411X0(RecyclerView recyclerView, int i, int i2) {
        AbstractC0559e eVar;
        int i3;
        if (!(this.f2842I == -1 || (eVar = this.f2861b0) == null || eVar.mo3335m() < 0 || (i3 = this.f2846M) == Integer.MIN_VALUE || i > this.f2842I + i3)) {
            this.f2846M = i3 + i2;
        }
        this.f2868i0.mo3628b();
    }

    /* renamed from: X3 */
    public void mo3412X3(AbstractC0581n nVar) {
        this.f2839F = nVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: Y */
    public int mo3413Y(View view) {
        return super.mo3413Y(view) + ((C0567e) view.getLayoutParams()).f2885f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: Y0 */
    public void mo3414Y0(RecyclerView recyclerView) {
        this.f2846M = 0;
        this.f2868i0.mo3628b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y1 */
    public void mo3415Y1() {
        if (this.f2839F != null || mo3428c3()) {
            int i = this.f2842I;
            View F = i == -1 ? null : mo3728F(i);
            if (F != null) {
                RecyclerView.AbstractC0655d0 f0 = this.f2874v.mo3838f0(F);
                AbstractC0581n nVar = this.f2839F;
                if (nVar != null) {
                    nVar.mo3537a(this.f2874v, F, this.f2842I, f0 == null ? -1 : f0.mo3986k());
                }
                mo3431d2(this.f2874v, f0, this.f2842I, this.f2843J);
            } else {
                AbstractC0581n nVar2 = this.f2839F;
                if (nVar2 != null) {
                    nVar2.mo3537a(this.f2874v, null, -1, -1);
                }
                mo3431d2(this.f2874v, null, -1, 0);
            }
            if (!((this.f2838E & 3) == 1 || this.f2874v.isLayoutRequested())) {
                int M = mo4098M();
                for (int i2 = 0; i2 < M; i2++) {
                    if (mo4096L(i2).isLayoutRequested()) {
                        m2892g2();
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: Y3 */
    public void mo3416Y3(AbstractC0582o oVar) {
        if (oVar == null) {
            this.f2840G = null;
            return;
        }
        ArrayList<AbstractC0582o> arrayList = this.f2840G;
        if (arrayList == null) {
            this.f2840G = new ArrayList<>();
        } else {
            arrayList.clear();
        }
        this.f2840G.add(oVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: Z0 */
    public void mo3417Z0(RecyclerView recyclerView, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6 = this.f2842I;
        if (!(i6 == -1 || (i4 = this.f2846M) == Integer.MIN_VALUE)) {
            int i7 = i6 + i4;
            if (i <= i7 && i7 < i + i3) {
                i5 = i4 + (i2 - i);
            } else if (i < i7 && i2 > i7 - i3) {
                i5 = i4 - i3;
            } else if (i > i7 && i2 < i7) {
                i5 = i4 + i3;
            }
            this.f2846M = i5;
        }
        this.f2868i0.mo3628b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z1 */
    public void mo3418Z1() {
        if (mo3428c3()) {
            int i = this.f2842I;
            View F = i == -1 ? null : mo3728F(i);
            if (F != null) {
                mo3434e2(this.f2874v, this.f2874v.mo3838f0(F), this.f2842I, this.f2843J);
                return;
            }
            AbstractC0581n nVar = this.f2839F;
            if (nVar != null) {
                nVar.mo3537a(this.f2874v, null, -1, -1);
            }
            mo3434e2(this.f2874v, null, -1, 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z2 */
    public boolean mo3419Z2() {
        return mo4116c0() == 0 || this.f2874v.mo3807X(0) != null;
    }

    /* renamed from: Z3 */
    public void mo3420Z3(int i) {
        if (i == 0 || i == 1) {
            this.f2875w = i;
            this.f2876x = AbstractC0729j.m4297b(this, i);
            this.f2863d0.mo3285d(i);
            this.f2864e0.mo3517b(i);
            this.f2838E |= 256;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: a1 */
    public void mo3421a1(RecyclerView recyclerView, int i, int i2) {
        AbstractC0559e eVar;
        int i3;
        int i4;
        int i5;
        if (!(this.f2842I == -1 || (eVar = this.f2861b0) == null || eVar.mo3335m() < 0 || (i3 = this.f2846M) == Integer.MIN_VALUE || i > (i5 = (i4 = this.f2842I) + i3))) {
            if (i + i2 > i5) {
                int i6 = i3 + (i - i5);
                this.f2846M = i6;
                this.f2842I = i4 + i6;
                this.f2846M = Integer.MIN_VALUE;
            } else {
                this.f2846M = i3 - i2;
            }
        }
        this.f2868i0.mo3628b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a3 */
    public boolean mo3422a3() {
        int c0 = mo4116c0();
        return c0 == 0 || this.f2874v.mo3807X(c0 - 1) != null;
    }

    /* renamed from: a4 */
    public void mo3423a4(boolean z) {
        int i = this.f2838E;
        int i2 = 65536;
        if (((i & 65536) != 0) != z) {
            int i3 = i & -65537;
            if (!z) {
                i2 = 0;
            }
            this.f2838E = i3 | i2;
            if (z) {
                mo4077A1();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: b1 */
    public void mo3424b1(RecyclerView recyclerView, int i, int i2) {
        int i3 = i2 + i;
        while (i < i3) {
            this.f2868i0.mo3633h(i);
            i++;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b2 */
    public void mo3425b2() {
        List<RecyclerView.AbstractC0655d0> k = this.f2837D.mo4211k();
        int size = k.size();
        if (size != 0) {
            int[] iArr = this.f2836C;
            if (iArr == null || size > iArr.length) {
                int length = iArr == null ? 16 : iArr.length;
                while (length < size) {
                    length <<= 1;
                }
                this.f2836C = new int[length];
            }
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                int j = k.get(i2).mo3985j();
                if (j >= 0) {
                    this.f2836C[i] = j;
                    i++;
                }
            }
            if (i > 0) {
                Arrays.sort(this.f2836C, 0, i);
                this.f2861b0.mo3330h(this.f2836C, i, this.f2835B);
            }
            this.f2835B.clear();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b3 */
    public boolean mo3426b3() {
        return this.f2861b0 != null;
    }

    /* renamed from: b4 */
    public void mo3427b4(int i) {
        if (i >= 0 || i == -2) {
            this.f2850Q = i;
            return;
        }
        throw new IllegalArgumentException("Invalid row height: " + i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c3 */
    public boolean mo3428c3() {
        ArrayList<AbstractC0582o> arrayList = this.f2840G;
        return arrayList != null && arrayList.size() > 0;
    }

    /* renamed from: c4 */
    public void mo3429c4(boolean z) {
        int i;
        int i2 = this.f2838E;
        int i3 = 0;
        if (((i2 & 131072) != 0) != z) {
            int i4 = i2 & -131073;
            if (z) {
                i3 = 131072;
            }
            int i5 = i4 | i3;
            this.f2838E = i5;
            if ((i5 & 131072) != 0 && this.f2862c0 == 0 && (i = this.f2842I) != -1) {
                mo3358C3(i, this.f2843J, true, this.f2847N);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:86:0x0172 A[LOOP:1: B:86:0x0172->B:89:0x017c, LOOP_START] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: d1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3430d1(androidx.recyclerview.widget.RecyclerView.C0681v r13, androidx.recyclerview.widget.RecyclerView.C0649a0 r14) {
        /*
        // Method dump skipped, instructions count: 516
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C0562f.mo3430d1(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d2 */
    public void mo3431d2(RecyclerView recyclerView, RecyclerView.AbstractC0655d0 d0Var, int i, int i2) {
        ArrayList<AbstractC0582o> arrayList = this.f2840G;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                this.f2840G.get(size).mo3538a(recyclerView, d0Var, i, i2);
            }
        }
    }

    /* renamed from: d4 */
    public void mo3432d4(int i, int i2) {
        mo3436e4(i, 0, false, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: e1 */
    public void mo3433e1(RecyclerView.C0649a0 a0Var) {
        if (this.f2872m0 != null) {
            throw null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e2 */
    public void mo3434e2(RecyclerView recyclerView, RecyclerView.AbstractC0655d0 d0Var, int i, int i2) {
        ArrayList<AbstractC0582o> arrayList = this.f2840G;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                this.f2840G.get(size).mo3539b(recyclerView, d0Var, i, i2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e3 */
    public boolean mo3435e3(int i) {
        RecyclerView.AbstractC0655d0 X = this.f2874v.mo3807X(i);
        return X != null && X.f3228b.getLeft() >= 0 && X.f3228b.getRight() <= this.f2874v.getWidth() && X.f3228b.getTop() >= 0 && X.f3228b.getBottom() <= this.f2874v.getHeight();
    }

    /* renamed from: e4 */
    public void mo3436e4(int i, int i2, boolean z, int i3) {
        if ((this.f2842I != i && i != -1) || i2 != this.f2843J || i3 != this.f2847N) {
            mo3358C3(i, i2, z, i3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d5  */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: f1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3437f1(androidx.recyclerview.widget.RecyclerView.C0681v r7, androidx.recyclerview.widget.RecyclerView.C0649a0 r8, int r9, int r10) {
        /*
        // Method dump skipped, instructions count: 244
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C0562f.mo3437f1(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0, int, int):void");
    }

    /* renamed from: f3 */
    public boolean mo3438f3() {
        return (this.f2838E & 131072) != 0;
    }

    /* renamed from: f4 */
    public void mo3439f4(int i) {
        mo3436e4(i, 0, true, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: g1 */
    public boolean mo3440g1(RecyclerView recyclerView, View view, View view2) {
        if ((this.f2838E & 32768) == 0 && m2894i2(view) != -1 && (this.f2838E & 35) == 0) {
            m2876D3(view, view2, true);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g3 */
    public boolean mo3441g3() {
        return (this.f2838E & 64) != 0;
    }

    /* renamed from: g4 */
    public void mo3442g4(int i, int i2, int i3) {
        mo3436e4(i, i2, false, i3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h3 */
    public void mo3443h3(int i, View view, int i2, int i3, int i4) {
        int i5;
        int m2 = this.f2875w == 0 ? mo3455m2(view) : mo3458n2(view);
        int i6 = this.f2851R;
        if (i6 > 0) {
            m2 = Math.min(m2, i6);
        }
        int i7 = this.f2858Y;
        int i8 = i7 & 112;
        int absoluteGravity = (this.f2838E & 786432) != 0 ? Gravity.getAbsoluteGravity(i7 & 8388615, 1) : i7 & 7;
        int i9 = this.f2875w;
        if (!((i9 == 0 && i8 == 48) || (i9 == 1 && absoluteGravity == 3))) {
            if ((i9 == 0 && i8 == 80) || (i9 == 1 && absoluteGravity == 5)) {
                i5 = m2872A2(i) - m2;
            } else if ((i9 == 0 && i8 == 16) || (i9 == 1 && absoluteGravity == 1)) {
                i5 = (m2872A2(i) - m2) / 2;
            }
            i4 += i5;
        }
        int i10 = m2 + i4;
        if (this.f2875w != 0) {
            i4 = i2;
            i2 = i4;
            i10 = i3;
            i3 = i10;
        }
        mo4085F0(view, i2, i4, i3, i10);
        Rect rect = f2832s;
        super.mo3395T(view, rect);
        ((C0567e) view.getLayoutParams()).mo3502w(i2 - rect.left, i4 - rect.top, rect.right - i3, rect.bottom - i10);
        m2903o4(view);
    }

    /* renamed from: h4 */
    public void mo3444h4(int i) {
        int i2 = this.f2875w;
        this.f2855V = i;
        if (i2 == 1) {
            this.f2856W = i;
        } else {
            this.f2857X = i;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: i1 */
    public void mo3445i1(Parcelable parcelable) {
        if (parcelable instanceof C0570h) {
            C0570h hVar = (C0570h) parcelable;
            this.f2842I = hVar.f2895b;
            this.f2846M = 0;
            this.f2868i0.mo3631f(hVar.f2896c);
            this.f2838E |= 256;
            mo4077A1();
        }
    }

    /* renamed from: i4 */
    public void mo3446i4(int i) {
        this.f2863d0.mo3282a().mo3314y(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: j1 */
    public Parcelable mo3447j1() {
        C0570h hVar = new C0570h();
        hVar.f2895b = mo3361E2();
        Bundle i = this.f2868i0.mo3634i();
        int M = mo4098M();
        for (int i2 = 0; i2 < M; i2++) {
            View L = mo4096L(i2);
            int i22 = m2894i2(L);
            if (i22 != -1) {
                i = this.f2868i0.mo3636k(i, L, i22);
            }
        }
        hVar.f2896c = i;
        return hVar;
    }

    /* renamed from: j4 */
    public void mo3448j4(int i) {
        this.f2863d0.mo3282a().mo3315z(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k3 */
    public void mo3449k3(View view) {
        int i;
        int i2;
        C0567e eVar = (C0567e) view.getLayoutParams();
        Rect rect = f2832s;
        mo4130k(view, rect);
        int i3 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin + rect.left + rect.right;
        int i4 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin + rect.top + rect.bottom;
        int makeMeasureSpec = this.f2850Q == -2 ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(this.f2851R, 1073741824);
        int i5 = this.f2875w;
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        if (i5 == 0) {
            i = ViewGroup.getChildMeasureSpec(makeMeasureSpec2, i3, ((ViewGroup.MarginLayoutParams) eVar).width);
            i2 = ViewGroup.getChildMeasureSpec(makeMeasureSpec, i4, ((ViewGroup.MarginLayoutParams) eVar).height);
        } else {
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(makeMeasureSpec2, i4, ((ViewGroup.MarginLayoutParams) eVar).height);
            i = ViewGroup.getChildMeasureSpec(makeMeasureSpec, i3, ((ViewGroup.MarginLayoutParams) eVar).width);
            i2 = childMeasureSpec;
        }
        view.measure(i, i2);
    }

    /* renamed from: k4 */
    public void mo3450k4(float f) {
        this.f2863d0.mo3282a().mo3287A(f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: l */
    public boolean mo3451l() {
        return this.f2875w == 0 || this.f2859Z > 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l2 */
    public int mo3452l2(RecyclerView recyclerView, int i, int i2) {
        int indexOfChild;
        View F = mo3728F(this.f2842I);
        return (F != null && i2 >= (indexOfChild = recyclerView.indexOfChild(F))) ? i2 < i + -1 ? ((indexOfChild + i) - 1) - i2 : indexOfChild : i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l4 */
    public void mo3453l4() {
        AbstractC0566d dVar = this.f2844K;
        if (dVar != null) {
            dVar.f2882q = true;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: m */
    public boolean mo3454m() {
        return this.f2875w == 1 || this.f2859Z > 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m2 */
    public int mo3455m2(View view) {
        C0567e eVar = (C0567e) view.getLayoutParams();
        return mo4109V(view) + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m4 */
    public int mo3456m4(int i) {
        C0565c cVar = new C0565c();
        cVar.mo4244p(i);
        mo3389R1(cVar);
        return cVar.mo4236f();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        if (r5 != false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
        if (r5 != false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004e, code lost:
        if (r7 == p006b.p030g.p039k.p040b0.C0979c.C0980a.f4690A.mo5515b()) goto L_0x002e;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: n1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo3457n1(androidx.recyclerview.widget.RecyclerView.C0681v r5, androidx.recyclerview.widget.RecyclerView.C0649a0 r6, int r7, android.os.Bundle r8) {
        /*
        // Method dump skipped, instructions count: 104
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C0562f.mo3457n1(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0, int, android.os.Bundle):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n2 */
    public int mo3458n2(View view) {
        C0567e eVar = (C0567e) view.getLayoutParams();
        return mo4110W(view) + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: o0 */
    public int mo3459o0(RecyclerView.C0681v vVar, RecyclerView.C0649a0 a0Var) {
        AbstractC0559e eVar;
        return (this.f2875w != 0 || (eVar = this.f2861b0) == null) ? super.mo3459o0(vVar, a0Var) : eVar.mo3340r();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o2 */
    public int mo3460o2() {
        return this.f2866g0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o3 */
    public void mo3461o3(RecyclerView.AbstractC0655d0 d0Var) {
        int j = d0Var.mo3985j();
        if (j != -1) {
            this.f2868i0.mo3635j(d0Var.f3228b, j);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: p */
    public void mo3462p(int i, int i2, RecyclerView.C0649a0 a0Var, RecyclerView.AbstractC0669o.AbstractC0672c cVar) {
        try {
            m2915y3(null, a0Var);
            if (this.f2875w != 0) {
                i = i2;
            }
            if (mo4098M() != 0) {
                if (i != 0) {
                    this.f2861b0.mo3329f(i < 0 ? -this.f2866g0 : this.f2865f0 + this.f2866g0, i, cVar);
                    m2897j3();
                }
            }
        } finally {
            m2897j3();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p2 */
    public <E> E mo3463p2(RecyclerView.AbstractC0655d0 d0Var, Class<? extends E> cls) {
        AbstractC0557c cVar;
        AbstractC0556b a;
        E e = d0Var instanceof AbstractC0556b ? (E) ((AbstractC0556b) d0Var).mo3316a(cls) : null;
        return (e != null || (cVar = this.f2869j0) == null || (a = cVar.mo3317a(d0Var.mo3987l())) == null) ? e : (E) a.mo3316a(cls);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p3 */
    public void mo3464p3(boolean z, int i, Rect rect) {
        if (z) {
            int i2 = this.f2842I;
            while (true) {
                View F = mo3728F(i2);
                if (F != null) {
                    if (F.getVisibility() != 0 || !F.hasFocusable()) {
                        i2++;
                    } else {
                        F.requestFocus();
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p4 */
    public void mo3465p4() {
        int i = 0;
        if (mo4098M() > 0) {
            i = this.f2861b0.mo3335m() - ((C0567e) mo4096L(0).getLayoutParams()).mo4166b();
        }
        this.f2878z = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: q */
    public void mo3466q(int i, RecyclerView.AbstractC0669o.AbstractC0672c cVar) {
        int i2 = this.f2874v.f2802R0;
        if (i != 0 && i2 != 0) {
            int max = Math.max(0, Math.min(this.f2842I - ((i2 - 1) / 2), i - i2));
            int i3 = max;
            while (i3 < i && i3 < max + i2) {
                cVar.mo4164a(i3, 0);
                i3++;
            }
        }
    }

    /* renamed from: q2 */
    public int mo3467q2() {
        return this.f2862c0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0019  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0018 A[RETURN] */
    /* renamed from: q3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3468q3(int r6) {
        /*
            r5 = this;
            int r0 = r5.f2875w
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x000d
            if (r6 != r2) goto L_0x000b
            r0 = 262144(0x40000, float:3.67342E-40)
            goto L_0x0011
        L_0x000b:
            r0 = 0
            goto L_0x0011
        L_0x000d:
            if (r6 != r2) goto L_0x000b
            r0 = 524288(0x80000, float:7.34684E-40)
        L_0x0011:
            int r3 = r5.f2838E
            r4 = 786432(0xc0000, float:1.102026E-39)
            r4 = r4 & r3
            if (r4 != r0) goto L_0x0019
            return
        L_0x0019:
            r4 = -786433(0xfffffffffff3ffff, float:NaN)
            r3 = r3 & r4
            r0 = r0 | r3
            r5.f2838E = r0
            r0 = r0 | 256(0x100, float:3.59E-43)
            r5.f2838E = r0
            androidx.leanback.widget.a0 r0 = r5.f2863d0
            androidx.leanback.widget.a0$a r0 = r0.f2806c
            if (r6 != r2) goto L_0x002b
            r1 = 1
        L_0x002b:
            r0.mo3312w(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.C0562f.mo3468q3(int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q4 */
    public void mo3469q4() {
        AbstractC0559e.C0560a q;
        this.f2835B.clear();
        int M = mo4098M();
        for (int i = 0; i < M; i++) {
            int n = this.f2874v.mo3838f0(mo4096L(i)).mo3989n();
            if (n >= 0 && (q = this.f2861b0.mo3339q(n)) != null) {
                this.f2835B.put(n, q.f2831a);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: r1 */
    public void mo3470r1(RecyclerView.C0681v vVar) {
        for (int M = mo4098M() - 1; M >= 0; M--) {
            mo4148u1(M, vVar);
        }
    }

    /* renamed from: r2 */
    public int mo3471r2() {
        return this.f2854U;
    }

    /* renamed from: s2 */
    public int mo3472s2() {
        return this.f2864e0.mo3516a().mo3521b();
    }

    /* renamed from: t2 */
    public float mo3473t2() {
        return this.f2864e0.mo3516a().mo3522c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t4 */
    public void mo3474t4() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.f2877y.mo3945c() != 0) {
            if ((this.f2838E & 262144) == 0) {
                i4 = this.f2861b0.mo3338p();
                i3 = this.f2877y.mo3945c() - 1;
                i = this.f2861b0.mo3335m();
                i2 = 0;
            } else {
                i4 = this.f2861b0.mo3335m();
                i = this.f2861b0.mo3338p();
                i2 = this.f2877y.mo3945c() - 1;
                i3 = 0;
            }
            if (i4 >= 0 && i >= 0) {
                boolean z = i4 == i3;
                boolean z2 = i == i2;
                if (z || !this.f2863d0.mo3282a().mo3303o() || z2 || !this.f2863d0.mo3282a().mo3304p()) {
                    int i7 = Integer.MAX_VALUE;
                    if (z) {
                        i7 = this.f2861b0.mo3332j(true, f2833t);
                        View F = mo3728F(f2833t[1]);
                        i5 = m2879L2(F);
                        int[] h = ((C0567e) F.getLayoutParams()).mo3487h();
                        if (h != null && h.length > 0) {
                            i5 += h[h.length - 1] - h[0];
                        }
                    } else {
                        i5 = Integer.MAX_VALUE;
                    }
                    int i8 = Integer.MIN_VALUE;
                    if (z2) {
                        i8 = this.f2861b0.mo3334l(false, f2833t);
                        i6 = m2879L2(mo3728F(f2833t[1]));
                    } else {
                        i6 = Integer.MIN_VALUE;
                    }
                    this.f2863d0.mo3282a().mo3288B(i8, i7, i6, i5);
                }
            }
        }
    }

    /* renamed from: u2 */
    public int mo3475u2() {
        return this.f2864e0.mo3516a().mo3523d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v3 */
    public int mo3476v3(boolean z, int i) {
        AbstractC0559e eVar = this.f2861b0;
        if (eVar == null) {
            return i;
        }
        int i2 = this.f2842I;
        int s = i2 != -1 ? eVar.mo3341s(i2) : -1;
        View view = null;
        int M = mo4098M();
        for (int i3 = 0; i3 < M && i != 0; i3++) {
            int i4 = i > 0 ? i3 : (M - 1) - i3;
            View L = mo4096L(i4);
            if (mo3407W1(L)) {
                int h2 = m2893h2(i4);
                int s2 = this.f2861b0.mo3341s(h2);
                if (s == -1) {
                    i2 = h2;
                    view = L;
                    s = s2;
                } else if (s2 == s && ((i > 0 && h2 > i2) || (i < 0 && h2 < i2))) {
                    i = i > 0 ? i - 1 : i + 1;
                    i2 = h2;
                    view = L;
                }
            }
        }
        if (view != null) {
            if (z) {
                if (mo4149v0()) {
                    this.f2838E |= 32;
                    view.requestFocus();
                    this.f2838E &= -33;
                }
                this.f2842I = i2;
                this.f2843J = 0;
            } else {
                mo3363F3(view, true);
            }
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x2 */
    public final int mo3477x2(View view) {
        return ((C0567e) view.getLayoutParams()).mo3492m(view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: y1 */
    public boolean mo3478y1(RecyclerView recyclerView, View view, Rect rect, boolean z) {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y2 */
    public final int mo3479y2(View view) {
        return ((C0567e) view.getLayoutParams()).mo3494o(view);
    }
}
