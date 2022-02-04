package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p006b.p030g.p039k.p040b0.C0979c;

public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: I */
    boolean f3062I = false;

    /* renamed from: J */
    int f3063J = -1;

    /* renamed from: K */
    int[] f3064K;

    /* renamed from: L */
    View[] f3065L;

    /* renamed from: M */
    final SparseIntArray f3066M = new SparseIntArray();

    /* renamed from: N */
    final SparseIntArray f3067N = new SparseIntArray();

    /* renamed from: O */
    AbstractC0642c f3068O = new C0640a();

    /* renamed from: P */
    final Rect f3069P = new Rect();

    /* renamed from: Q */
    private boolean f3070Q;

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$a */
    public static final class C0640a extends AbstractC0642c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0642c
        /* renamed from: e */
        public int mo3719e(int i, int i2) {
            return i % i2;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0642c
        /* renamed from: f */
        public int mo3720f(int i) {
            return 1;
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$b */
    public static class C0641b extends RecyclerView.C0674p {

        /* renamed from: e */
        int f3071e = -1;

        /* renamed from: f */
        int f3072f = 0;

        public C0641b(int i, int i2) {
            super(i, i2);
        }

        public C0641b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0641b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0641b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        /* renamed from: g */
        public int mo3721g() {
            return this.f3071e;
        }

        /* renamed from: h */
        public int mo3722h() {
            return this.f3072f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$c */
    public static abstract class AbstractC0642c {

        /* renamed from: a */
        final SparseIntArray f3073a = new SparseIntArray();

        /* renamed from: b */
        final SparseIntArray f3074b = new SparseIntArray();

        /* renamed from: c */
        private boolean f3075c = false;

        /* renamed from: d */
        private boolean f3076d = false;

        /* renamed from: a */
        static int m3357a(SparseIntArray sparseIntArray, int i) {
            int size = sparseIntArray.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (sparseIntArray.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 < 0 || i4 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i4);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo3723b(int i, int i2) {
            if (!this.f3076d) {
                return mo3725d(i, i2);
            }
            int i3 = this.f3074b.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int d = mo3725d(i, i2);
            this.f3074b.put(i, d);
            return d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo3724c(int i, int i2) {
            if (!this.f3075c) {
                return mo3719e(i, i2);
            }
            int i3 = this.f3073a.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int e = mo3719e(i, i2);
            this.f3073a.put(i, e);
            return e;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0043  */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo3725d(int r7, int r8) {
            /*
                r6 = this;
                boolean r0 = r6.f3076d
                r1 = 0
                if (r0 == 0) goto L_0x0024
                android.util.SparseIntArray r0 = r6.f3074b
                int r0 = m3357a(r0, r7)
                r2 = -1
                if (r0 == r2) goto L_0x0024
                android.util.SparseIntArray r2 = r6.f3074b
                int r2 = r2.get(r0)
                int r3 = r0 + 1
                int r4 = r6.mo3724c(r0, r8)
                int r0 = r6.mo3720f(r0)
                int r4 = r4 + r0
                if (r4 != r8) goto L_0x0027
                int r2 = r2 + 1
                goto L_0x0026
            L_0x0024:
                r2 = 0
                r3 = 0
            L_0x0026:
                r4 = 0
            L_0x0027:
                int r0 = r6.mo3720f(r7)
            L_0x002b:
                if (r3 >= r7) goto L_0x0040
                int r5 = r6.mo3720f(r3)
                int r4 = r4 + r5
                if (r4 != r8) goto L_0x0038
                int r2 = r2 + 1
                r4 = 0
                goto L_0x003d
            L_0x0038:
                if (r4 <= r8) goto L_0x003d
                int r2 = r2 + 1
                r4 = r5
            L_0x003d:
                int r3 = r3 + 1
                goto L_0x002b
            L_0x0040:
                int r4 = r4 + r0
                if (r4 <= r8) goto L_0x0045
                int r2 = r2 + 1
            L_0x0045:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.AbstractC0642c.mo3725d(int, int):int");
        }

        /* renamed from: e */
        public abstract int mo3719e(int i, int i2);

        /* renamed from: f */
        public abstract int mo3720f(int i);

        /* renamed from: g */
        public void mo3726g() {
            this.f3074b.clear();
        }

        /* renamed from: h */
        public void mo3727h() {
            this.f3073a.clear();
        }
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        mo3712m3(i);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo3712m3(RecyclerView.AbstractC0669o.m3735m0(context, attributeSet, i, i2).f3282b);
    }

    /* renamed from: V2 */
    private void m3306V2(RecyclerView.C0681v vVar, RecyclerView.C0649a0 a0Var, int i, boolean z) {
        int i2;
        int i3;
        int i4 = 0;
        int i5 = -1;
        if (z) {
            i5 = i;
            i3 = 0;
            i2 = 1;
        } else {
            i3 = i - 1;
            i2 = -1;
        }
        while (i3 != i5) {
            View view = this.f3065L[i3];
            C0641b bVar = (C0641b) view.getLayoutParams();
            int i32 = m3317i3(vVar, a0Var, mo4133l0(view));
            bVar.f3072f = i32;
            bVar.f3071e = i4;
            i4 += i32;
            i3 += i2;
        }
    }

    /* renamed from: W2 */
    private void m3307W2() {
        int M = mo4098M();
        for (int i = 0; i < M; i++) {
            C0641b bVar = (C0641b) mo4096L(i).getLayoutParams();
            int b = bVar.mo4166b();
            this.f3066M.put(b, bVar.mo3722h());
            this.f3067N.put(b, bVar.mo3721g());
        }
    }

    /* renamed from: X2 */
    private void m3308X2(int i) {
        this.f3064K = m3309Y2(this.f3064K, this.f3063J, i);
    }

    /* renamed from: Y2 */
    static int[] m3309Y2(int[] iArr, int i, int i2) {
        int i3;
        if (!(iArr != null && iArr.length == i + 1 && iArr[iArr.length - 1] == i2)) {
            iArr = new int[(i + 1)];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    /* renamed from: Z2 */
    private void m3310Z2() {
        this.f3066M.clear();
        this.f3067N.clear();
    }

    /* renamed from: a3 */
    private int m3311a3(RecyclerView.C0649a0 a0Var) {
        if (!(mo4098M() == 0 || a0Var.mo3945c() == 0)) {
            mo3740b2();
            boolean z2 = mo3755z2();
            View g2 = mo3744g2(!z2, true);
            View f2 = mo3742f2(!z2, true);
            if (!(g2 == null || f2 == null)) {
                int b = this.f3068O.mo3723b(mo4133l0(g2), this.f3063J);
                int b2 = this.f3068O.mo3723b(mo4133l0(f2), this.f3063J);
                int min = Math.min(b, b2);
                int max = this.f3090x ? Math.max(0, ((this.f3068O.mo3723b(a0Var.mo3945c() - 1, this.f3063J) + 1) - Math.max(b, b2)) - 1) : Math.max(0, min);
                if (!z2) {
                    return max;
                }
                return Math.round((((float) max) * (((float) Math.abs(this.f3087u.mo4436d(f2) - this.f3087u.mo4439g(g2))) / ((float) ((this.f3068O.mo3723b(mo4133l0(f2), this.f3063J) - this.f3068O.mo3723b(mo4133l0(g2), this.f3063J)) + 1)))) + ((float) (this.f3087u.mo4445m() - this.f3087u.mo4439g(g2))));
            }
        }
        return 0;
    }

    /* renamed from: b3 */
    private int m3312b3(RecyclerView.C0649a0 a0Var) {
        if (!(mo4098M() == 0 || a0Var.mo3945c() == 0)) {
            mo3740b2();
            View g2 = mo3744g2(!mo3755z2(), true);
            View f2 = mo3742f2(!mo3755z2(), true);
            if (!(g2 == null || f2 == null)) {
                if (!mo3755z2()) {
                    return this.f3068O.mo3723b(a0Var.mo3945c() - 1, this.f3063J) + 1;
                }
                int d = this.f3087u.mo4436d(f2) - this.f3087u.mo4439g(g2);
                int b = this.f3068O.mo3723b(mo4133l0(g2), this.f3063J);
                return (int) ((((float) d) / ((float) ((this.f3068O.mo3723b(mo4133l0(f2), this.f3063J) - b) + 1))) * ((float) (this.f3068O.mo3723b(a0Var.mo3945c() - 1, this.f3063J) + 1)));
            }
        }
        return 0;
    }

    /* renamed from: c3 */
    private void m3313c3(RecyclerView.C0681v vVar, RecyclerView.C0649a0 a0Var, LinearLayoutManager.C0643a aVar, int i) {
        boolean z = i == 1;
        int h3 = m3316h3(vVar, a0Var, aVar.f3094b);
        if (z) {
            while (h3 > 0) {
                int i2 = aVar.f3094b;
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    aVar.f3094b = i3;
                    h3 = m3316h3(vVar, a0Var, i3);
                } else {
                    return;
                }
            }
            return;
        }
        int c = a0Var.mo3945c() - 1;
        int i4 = aVar.f3094b;
        while (i4 < c) {
            int i5 = i4 + 1;
            int h32 = m3316h3(vVar, a0Var, i5);
            if (h32 <= h3) {
                break;
            }
            i4 = i5;
            h3 = h32;
        }
        aVar.f3094b = i4;
    }

    /* renamed from: d3 */
    private void m3314d3() {
        View[] viewArr = this.f3065L;
        if (viewArr == null || viewArr.length != this.f3063J) {
            this.f3065L = new View[this.f3063J];
        }
    }

    /* renamed from: g3 */
    private int m3315g3(RecyclerView.C0681v vVar, RecyclerView.C0649a0 a0Var, int i) {
        if (!a0Var.mo3950h()) {
            return this.f3068O.mo3723b(i, this.f3063J);
        }
        int f = vVar.mo4206f(i);
        if (f != -1) {
            return this.f3068O.mo3723b(f, this.f3063J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    /* renamed from: h3 */
    private int m3316h3(RecyclerView.C0681v vVar, RecyclerView.C0649a0 a0Var, int i) {
        if (!a0Var.mo3950h()) {
            return this.f3068O.mo3724c(i, this.f3063J);
        }
        int i2 = this.f3067N.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int f = vVar.mo4206f(i);
        if (f != -1) {
            return this.f3068O.mo3724c(f, this.f3063J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    /* renamed from: i3 */
    private int m3317i3(RecyclerView.C0681v vVar, RecyclerView.C0649a0 a0Var, int i) {
        if (!a0Var.mo3950h()) {
            return this.f3068O.mo3720f(i);
        }
        int i2 = this.f3066M.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int f = vVar.mo4206f(i);
        if (f != -1) {
            return this.f3068O.mo3720f(f);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    /* renamed from: j3 */
    private void m3318j3(float f, int i) {
        m3308X2(Math.max(Math.round(f * ((float) this.f3063J)), i));
    }

    /* renamed from: k3 */
    private void m3319k3(View view, int i, boolean z) {
        int i2;
        int i3;
        C0641b bVar = (C0641b) view.getLayoutParams();
        Rect rect = bVar.f3286b;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int e3 = mo3710e3(bVar.f3071e, bVar.f3072f);
        if (this.f3085s == 1) {
            i2 = RecyclerView.AbstractC0669o.m3731N(e3, i, i5, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            i3 = RecyclerView.AbstractC0669o.m3731N(this.f3087u.mo4446n(), mo4114b0(), i4, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int N = RecyclerView.AbstractC0669o.m3731N(e3, i, i4, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int N2 = RecyclerView.AbstractC0669o.m3731N(this.f3087u.mo4446n(), mo4145t0(), i5, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            i3 = N;
            i2 = N2;
        }
        m3320l3(view, i2, i3, z);
    }

    /* renamed from: l3 */
    private void m3320l3(View view, int i, int i2, boolean z) {
        RecyclerView.C0674p pVar = (RecyclerView.C0674p) view.getLayoutParams();
        if (z ? mo4103P1(view, i, i2, pVar) : mo4102N1(view, i, i2, pVar)) {
            view.measure(i, i2);
        }
    }

    /* renamed from: n3 */
    private void m3321n3() {
        int i;
        int i2;
        if (mo3753x2() == 1) {
            i2 = mo4143s0() - mo4129j0();
            i = mo4127i0();
        } else {
            i2 = mo4112a0() - mo4124h0();
            i = mo4131k0();
        }
        m3308X2(i2 - i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r17v0, resolved type: androidx.recyclerview.widget.GridLayoutManager */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: A2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3703A2(androidx.recyclerview.widget.RecyclerView.C0681v r18, androidx.recyclerview.widget.RecyclerView.C0649a0 r19, androidx.recyclerview.widget.LinearLayoutManager.C0645c r20, androidx.recyclerview.widget.LinearLayoutManager.C0644b r21) {
        /*
        // Method dump skipped, instructions count: 564
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo3703A2(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0, androidx.recyclerview.widget.LinearLayoutManager$c, androidx.recyclerview.widget.LinearLayoutManager$b):void");
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: C2 */
    public void mo3704C2(RecyclerView.C0681v vVar, RecyclerView.C0649a0 a0Var, LinearLayoutManager.C0643a aVar, int i) {
        super.mo3704C2(vVar, a0Var, aVar, i);
        m3321n3();
        if (a0Var.mo3945c() > 0 && !a0Var.mo3950h()) {
            m3313c3(vVar, a0Var, aVar, i);
        }
        m3314d3();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o, androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: D1 */
    public int mo3359D1(int i, RecyclerView.C0681v vVar, RecyclerView.C0649a0 a0Var) {
        m3321n3();
        m3314d3();
        return super.mo3359D1(i, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o, androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: F1 */
    public int mo3362F1(int i, RecyclerView.C0681v vVar, RecyclerView.C0649a0 a0Var) {
        m3321n3();
        m3314d3();
        return super.mo3362F1(i, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o, androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: G */
    public RecyclerView.C0674p mo3364G() {
        return this.f3085s == 0 ? new C0641b(-2, -1) : new C0641b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: H */
    public RecyclerView.C0674p mo3367H(Context context, AttributeSet attributeSet) {
        return new C0641b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: I */
    public RecyclerView.C0674p mo3370I(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0641b((ViewGroup.MarginLayoutParams) layoutParams) : new C0641b(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: K1 */
    public void mo3705K1(Rect rect, int i, int i2) {
        int i3;
        int i4;
        if (this.f3064K == null) {
            super.mo3705K1(rect, i, i2);
        }
        int i0 = mo4127i0() + mo4129j0();
        int k0 = mo4131k0() + mo4124h0();
        if (this.f3085s == 1) {
            i4 = RecyclerView.AbstractC0669o.m3736o(i2, rect.height() + k0, mo4121f0());
            int[] iArr = this.f3064K;
            i3 = RecyclerView.AbstractC0669o.m3736o(i, iArr[iArr.length - 1] + i0, mo4122g0());
        } else {
            i3 = RecyclerView.AbstractC0669o.m3736o(i, rect.width() + i0, mo4122g0());
            int[] iArr2 = this.f3064K;
            i4 = RecyclerView.AbstractC0669o.m3736o(i2, iArr2[iArr2.length - 1] + k0, mo4121f0());
        }
        mo4094J1(i3, i4);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: M2 */
    public void mo3706M2(boolean z) {
        if (!z) {
            super.mo3706M2(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d6, code lost:
        if (r13 == (r2 > r15)) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f6, code lost:
        if (r13 == r11) goto L_0x00b8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0107  */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o, androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: P0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo3707P0(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.C0681v r26, androidx.recyclerview.widget.RecyclerView.C0649a0 r27) {
        /*
        // Method dump skipped, instructions count: 337
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo3707P0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: R */
    public int mo3388R(RecyclerView.C0681v vVar, RecyclerView.C0649a0 a0Var) {
        if (this.f3085s == 1) {
            return this.f3063J;
        }
        if (a0Var.mo3945c() < 1) {
            return 0;
        }
        return m3315g3(vVar, a0Var, a0Var.mo3945c() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o, androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: T1 */
    public boolean mo3397T1() {
        return this.f3080D == null && !this.f3062I;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: V0 */
    public void mo3403V0(RecyclerView.C0681v vVar, RecyclerView.C0649a0 a0Var, View view, C0979c cVar) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0641b)) {
            super.mo4108U0(view, cVar);
            return;
        }
        C0641b bVar = (C0641b) layoutParams;
        int g3 = m3315g3(vVar, a0Var, bVar.mo4166b());
        if (this.f3085s == 0) {
            i4 = bVar.mo3721g();
            i3 = bVar.mo3722h();
            i = 1;
            z2 = false;
            z = false;
            i2 = g3;
        } else {
            i3 = 1;
            i2 = bVar.mo3721g();
            i = bVar.mo3722h();
            z2 = false;
            z = false;
            i4 = g3;
        }
        cVar.mo5476d0(C0979c.C0982c.m5656a(i4, i3, i2, i, z2, z));
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: V1 */
    public void mo3708V1(RecyclerView.C0649a0 a0Var, LinearLayoutManager.C0645c cVar, RecyclerView.AbstractC0669o.AbstractC0672c cVar2) {
        int i = this.f3063J;
        for (int i2 = 0; i2 < this.f3063J && cVar.mo3765c(a0Var) && i > 0; i2++) {
            int i3 = cVar.f3105d;
            cVar2.mo4164a(i3, Math.max(0, cVar.f3108g));
            i -= this.f3068O.mo3720f(i3);
            cVar.f3105d += cVar.f3106e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: X0 */
    public void mo3411X0(RecyclerView recyclerView, int i, int i2) {
        this.f3068O.mo3727h();
        this.f3068O.mo3726g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: Y0 */
    public void mo3414Y0(RecyclerView recyclerView) {
        this.f3068O.mo3727h();
        this.f3068O.mo3726g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: Z0 */
    public void mo3417Z0(RecyclerView recyclerView, int i, int i2, int i3) {
        this.f3068O.mo3727h();
        this.f3068O.mo3726g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: a1 */
    public void mo3421a1(RecyclerView recyclerView, int i, int i2) {
        this.f3068O.mo3727h();
        this.f3068O.mo3726g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: c1 */
    public void mo3709c1(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.f3068O.mo3727h();
        this.f3068O.mo3726g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o, androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: d1 */
    public void mo3430d1(RecyclerView.C0681v vVar, RecyclerView.C0649a0 a0Var) {
        if (a0Var.mo3950h()) {
            m3307W2();
        }
        super.mo3430d1(vVar, a0Var);
        m3310Z2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o, androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: e1 */
    public void mo3433e1(RecyclerView.C0649a0 a0Var) {
        super.mo3433e1(a0Var);
        this.f3062I = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e3 */
    public int mo3710e3(int i, int i2) {
        if (this.f3085s != 1 || !mo3754y2()) {
            int[] iArr = this.f3064K;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f3064K;
        int i3 = this.f3063J;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    /* renamed from: f3 */
    public int mo3711f3() {
        return this.f3063J;
    }

    /* renamed from: m3 */
    public void mo3712m3(int i) {
        if (i != this.f3063J) {
            this.f3062I = true;
            if (i >= 1) {
                this.f3063J = i;
                this.f3068O.mo3727h();
                mo4077A1();
                return;
            }
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: n */
    public boolean mo3713n(RecyclerView.C0674p pVar) {
        return pVar instanceof C0641b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: o0 */
    public int mo3459o0(RecyclerView.C0681v vVar, RecyclerView.C0649a0 a0Var) {
        if (this.f3085s == 0) {
            return this.f3063J;
        }
        if (a0Var.mo3945c() < 1) {
            return 0;
        }
        return m3315g3(vVar, a0Var, a0Var.mo3945c() - 1) + 1;
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
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
            if (l0 >= 0 && l0 < i3 && m3316h3(vVar, a0Var, l0) == 0) {
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

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o, androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: s */
    public int mo3715s(RecyclerView.C0649a0 a0Var) {
        return this.f3070Q ? m3311a3(a0Var) : super.mo3715s(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o, androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: t */
    public int mo3716t(RecyclerView.C0649a0 a0Var) {
        return this.f3070Q ? m3312b3(a0Var) : super.mo3716t(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o, androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: v */
    public int mo3717v(RecyclerView.C0649a0 a0Var) {
        return this.f3070Q ? m3311a3(a0Var) : super.mo3717v(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o, androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: w */
    public int mo3718w(RecyclerView.C0649a0 a0Var) {
        return this.f3070Q ? m3312b3(a0Var) : super.mo3718w(a0Var);
    }
}
