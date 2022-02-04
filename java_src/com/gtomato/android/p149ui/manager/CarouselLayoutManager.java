package com.gtomato.android.p149ui.manager;

import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import p069c.p111c.p112a.p113a.p114a.C1536b;
import p069c.p111c.p112a.p113a.p115b.C1539c;
import p069c.p111c.p112a.p113a.p115b.C1541e;
import p069c.p111c.p112a.p113a.p116c.C1546a;
import p069c.p111c.p112a.p117b.C1559a;

/* renamed from: com.gtomato.android.ui.manager.CarouselLayoutManager */
public class CarouselLayoutManager extends RecyclerView.AbstractC0669o {

    /* renamed from: s */
    private static final String f11030s = "CarouselLayoutManager";

    /* renamed from: t */
    public static final C1546a.AbstractC1558l f11031t = new C1539c(new C1541e());

    /* renamed from: u */
    public static final C1546a.AbstractC1557k f11032u = new C1536b();

    /* renamed from: A */
    private int f11033A = 1;

    /* renamed from: B */
    private Queue<Runnable> f11034B = new LinkedList();

    /* renamed from: C */
    private Handler f11035C = new Handler();

    /* renamed from: D */
    private RecyclerView f11036D = null;

    /* renamed from: E */
    private int f11037E;

    /* renamed from: F */
    private int f11038F;

    /* renamed from: G */
    private int f11039G = 0;

    /* renamed from: H */
    private int f11040H = 0;

    /* renamed from: I */
    private int f11041I = 0;

    /* renamed from: J */
    private int f11042J = 0;

    /* renamed from: K */
    private boolean f11043K = false;

    /* renamed from: L */
    private boolean f11044L = false;

    /* renamed from: M */
    private int f11045M = 0;

    /* renamed from: N */
    private C1546a.AbstractC1558l f11046N = f11031t;

    /* renamed from: O */
    private C1546a.AbstractC1557k f11047O;

    /* renamed from: v */
    private C1546a.AbstractC1553g f11048v = null;

    /* renamed from: w */
    private C1546a.AbstractC1554h f11049w = null;

    /* renamed from: x */
    private boolean f11050x = true;

    /* renamed from: y */
    private C1546a.EnumC1552f f11051y = C1546a.EnumC1552f.FirstBack;

    /* renamed from: z */
    private int f11052z = 0;

    /* access modifiers changed from: package-private */
    /* renamed from: com.gtomato.android.ui.manager.CarouselLayoutManager$a */
    public class RunnableC3299a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Queue f11053b;

        RunnableC3299a(Queue queue) {
            this.f11053b = queue;
        }

        public void run() {
            while (!this.f11053b.isEmpty()) {
                ((Runnable) this.f11053b.poll()).run();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.gtomato.android.ui.manager.CarouselLayoutManager$b */
    public class View$OnClickListenerC3300b implements View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ int f11055b;

        View$OnClickListenerC3300b(int i) {
            this.f11055b = i;
        }

        public void onClick(View view) {
            if (CarouselLayoutManager.this.f11048v != null) {
                C1546a.AbstractC1553g gVar = CarouselLayoutManager.this.f11048v;
                int i = this.f11055b;
                gVar.mo6857a(null, view, i, CarouselLayoutManager.this.mo11169B2(i));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.gtomato.android.ui.manager.CarouselLayoutManager$c */
    public class View$OnLongClickListenerC3301c implements View.OnLongClickListener {

        /* renamed from: b */
        final /* synthetic */ int f11057b;

        View$OnLongClickListenerC3301c(int i) {
            this.f11057b = i;
        }

        public boolean onLongClick(View view) {
            if (CarouselLayoutManager.this.f11049w == null) {
                return false;
            }
            C1546a.AbstractC1554h hVar = CarouselLayoutManager.this.f11049w;
            int i = this.f11057b;
            return hVar.mo6858a(null, view, i, CarouselLayoutManager.this.mo11169B2(i));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.gtomato.android.ui.manager.CarouselLayoutManager$d */
    public class RunnableC3302d implements Runnable {

        /* renamed from: b */
        final /* synthetic */ int f11059b;

        RunnableC3302d(int i) {
            this.f11059b = i;
        }

        public void run() {
            CarouselLayoutManager.this.mo3360E1(this.f11059b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.gtomato.android.ui.manager.CarouselLayoutManager$e */
    public class RunnableC3303e implements Runnable {

        /* renamed from: b */
        final /* synthetic */ RecyclerView f11061b;

        /* renamed from: c */
        final /* synthetic */ RecyclerView.C0649a0 f11062c;

        /* renamed from: d */
        final /* synthetic */ int f11063d;

        RunnableC3303e(RecyclerView recyclerView, RecyclerView.C0649a0 a0Var, int i) {
            this.f11061b = recyclerView;
            this.f11062c = a0Var;
            this.f11063d = i;
        }

        public void run() {
            CarouselLayoutManager.this.mo3385Q1(this.f11061b, this.f11062c, this.f11063d);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.gtomato.android.ui.manager.CarouselLayoutManager$f */
    public static /* synthetic */ class C3304f {

        /* renamed from: a */
        static final /* synthetic */ int[] f11065a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                c.c.a.a.c.a$f[] r0 = p069c.p111c.p112a.p113a.p116c.C1546a.EnumC1552f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.gtomato.android.p149ui.manager.CarouselLayoutManager.C3304f.f11065a = r0
                c.c.a.a.c.a$f r1 = p069c.p111c.p112a.p113a.p116c.C1546a.EnumC1552f.FirstBack     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.gtomato.android.p149ui.manager.CarouselLayoutManager.C3304f.f11065a     // Catch:{ NoSuchFieldError -> 0x001d }
                c.c.a.a.c.a$f r1 = p069c.p111c.p112a.p113a.p116c.C1546a.EnumC1552f.FirstFront     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.gtomato.android.p149ui.manager.CarouselLayoutManager.C3304f.f11065a     // Catch:{ NoSuchFieldError -> 0x0028 }
                c.c.a.a.c.a$f r1 = p069c.p111c.p112a.p113a.p116c.C1546a.EnumC1552f.CenterFront     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.gtomato.android.p149ui.manager.CarouselLayoutManager.C3304f.f11065a     // Catch:{ NoSuchFieldError -> 0x0033 }
                c.c.a.a.c.a$f r1 = p069c.p111c.p112a.p113a.p116c.C1546a.EnumC1552f.CenterBack     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.gtomato.android.p149ui.manager.CarouselLayoutManager.C3304f.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.gtomato.android.ui.manager.CarouselLayoutManager$g */
    public static class C3305g implements Parcelable {
        public static final Parcelable.Creator<C3305g> CREATOR = new C3306a();

        /* renamed from: b */
        int f11066b;

        /* renamed from: com.gtomato.android.ui.manager.CarouselLayoutManager$g$a */
        class C3306a implements Parcelable.Creator<C3305g> {
            C3306a() {
            }

            /* renamed from: a */
            public C3305g createFromParcel(Parcel parcel) {
                return new C3305g(parcel, null);
            }

            /* renamed from: b */
            public C3305g[] newArray(int i) {
                return new C3305g[i];
            }
        }

        C3305g() {
        }

        private C3305g(Parcel parcel) {
            this.f11066b = parcel.readInt();
        }

        /* synthetic */ C3305g(Parcel parcel, RunnableC3299a aVar) {
            this(parcel);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f11066b);
        }
    }

    public CarouselLayoutManager() {
        mo11168A2(null);
        mo11182s2();
    }

    /* renamed from: C2 */
    private void m13809C2() {
        int i = this.f11033A & 7;
        this.f11039G = i != 3 ? i != 5 ? ((((this.f11041I - mo4127i0()) - mo4129j0()) - this.f11037E) / 2) + mo4127i0() : (this.f11041I - mo4129j0()) - this.f11037E : mo4127i0();
        int i2 = this.f11033A & 112;
        this.f11040H = i2 != 16 ? i2 != 80 ? mo4131k0() : (this.f11042J - mo4124h0()) - this.f11038F : ((((this.f11042J - mo4131k0()) - mo4124h0()) - this.f11038F) / 2) + mo4131k0();
    }

    /* renamed from: X1 */
    private void m13812X1(int i, C1559a<View> aVar, RecyclerView.C0681v vVar, RecyclerView.C0649a0 a0Var) {
        m13819o2(String.format("drawChild (%d)", Integer.valueOf(i)), new Object[0]);
        int B2 = mo11169B2(i);
        View b = aVar.mo6868b(B2);
        if (b == null) {
            b = vVar.mo4215o(B2);
            b.setOnClickListener(new View$OnClickListenerC3300b(i));
            b.setOnLongClickListener(new View$OnLongClickListenerC3301c(i));
            mo4117d(b);
            m13819o2(String.format("addView (%d [%d]) %s", Integer.valueOf(i), Integer.valueOf(B2), b), new Object[0]);
        } else {
            mo4123h(b);
        }
        mo4086G0(b, 0, 0);
        if (!a0Var.mo3950h()) {
            int i2 = this.f11039G;
            int i3 = this.f11040H;
            mo4084E0(b, i2, i3, i2 + this.f11037E, i3 + this.f11038F);
            this.f11046N.mo6829b(b, -(mo11180q2(this.f11045M) - ((float) i)));
        }
    }

    /* renamed from: Z1 */
    private int m13813Z1() {
        return this.f11045M - (m13815b2() / 2);
    }

    /* renamed from: a2 */
    private int m13814a2() {
        return this.f11045M + (m13815b2() / 2);
    }

    /* renamed from: b2 */
    private int m13815b2() {
        return (this.f11041I - mo4129j0()) - mo4127i0();
    }

    /* renamed from: h2 */
    private int m13816h2() {
        int floor = ((int) Math.floor((double) mo11180q2(m13813Z1()))) - this.f11052z;
        return this.f11050x ? floor : Math.max(floor, 0);
    }

    /* renamed from: i2 */
    private int m13817i2() {
        int ceil = ((int) Math.ceil((double) mo11180q2(m13814a2()))) + this.f11052z;
        return this.f11050x ? ceil : Math.min(ceil, mo4116c0() - 1);
    }

    /* renamed from: n2 */
    private static void m13818n2(String str, Object... objArr) {
        if (!C1546a.m7570O1()) {
            return;
        }
        if (objArr.length > 0) {
            Log.d(f11030s, String.format(str, objArr));
        } else {
            Log.d(f11030s, str);
        }
    }

    /* renamed from: o2 */
    private static void m13819o2(String str, Object... objArr) {
        if (!C1546a.m7570O1()) {
            return;
        }
        if (objArr.length > 0) {
            Log.v(f11030s, String.format(str, objArr));
        } else {
            Log.v(f11030s, str);
        }
    }

    /* renamed from: p2 */
    private void m13820p2(RecyclerView.C0681v vVar) {
        if (mo4116c0() <= 0) {
            return;
        }
        if (mo4098M() == 0 || this.f11037E * this.f11038F == 0) {
            View o = vVar.mo4215o(0);
            mo4117d(o);
            mo4086G0(o, 0, 0);
            this.f11037E = mo4110W(o);
            this.f11038F = mo4109V(o);
            m13818n2("child width = " + this.f11037E + ", height = " + this.f11038F + ", my width = " + mo4143s0(), new Object[0]);
            StringBuilder sb = new StringBuilder();
            sb.append("scrap width = ");
            sb.append(o.getMeasuredWidth());
            sb.append(", height = ");
            sb.append(o.getMeasuredHeight());
            m13818n2(sb.toString(), new Object[0]);
            mo4155y(o, vVar);
        }
    }

    /* renamed from: A2 */
    public CarouselLayoutManager mo11168A2(C1546a.AbstractC1558l lVar) {
        C1546a.AbstractC1558l lVar2 = this.f11046N;
        C1546a.AbstractC1558l lVar3 = lVar != null ? lVar : f11031t;
        this.f11046N = lVar3;
        if (lVar3 != lVar2) {
            mo11182s2();
            lVar.mo6830c(this);
        }
        return this;
    }

    /* renamed from: B2 */
    public int mo11169B2(int i) {
        if (!this.f11050x) {
            return i;
        }
        int c0 = mo4116c0();
        int i2 = i % c0;
        return i2 < 0 ? i2 + c0 : i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: D1 */
    public int mo3359D1(int i, RecyclerView.C0681v vVar, RecyclerView.C0649a0 a0Var) {
        C1546a.AbstractC1557k kVar = this.f11047O;
        if (kVar != null) {
            i = kVar.mo6828c(i);
        }
        if (!this.f11050x) {
            int i2 = this.f11045M;
            if (i2 + i >= 0) {
                int c0 = this.f11037E * (mo4116c0() - 1);
                int i3 = this.f11045M;
                if (i3 + i > c0) {
                    if (i3 < c0) {
                        i = c0 - i3;
                    }
                }
            } else if (i2 > 0) {
                i = -i2;
            }
            i = 0;
        }
        if (i != 0) {
            this.f11045M += i;
            mo8437Y1(vVar, a0Var);
        }
        C1546a.AbstractC1557k kVar2 = this.f11047O;
        return kVar2 != null ? kVar2.mo6827b(i) : i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: E1 */
    public void mo3360E1(int i) {
        RecyclerView recyclerView;
        if (this.f11037E != 0 || mo4116c0() <= 0) {
            int i2 = this.f11037E * i;
            m13818n2("scrollToPosition " + i + "scrollOffset " + this.f11045M + " -> " + i2, new Object[0]);
            double abs = (double) Math.abs(i2 - this.f11045M);
            double d = (double) this.f11037E;
            Double.isNaN(d);
            if (abs > d * 1.5d) {
                this.f11044L = true;
                m13818n2("scrollToPosition " + i + "set mScrollPositionUpdated", new Object[0]);
            }
            this.f11045M = i2;
            if (Build.VERSION.SDK_INT >= 18 && (recyclerView = this.f11036D) != null && !recyclerView.isInLayout()) {
                mo4077A1();
                return;
            }
            return;
        }
        this.f11034B.add(new RunnableC3302d(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: G */
    public RecyclerView.C0674p mo3364G() {
        return new RecyclerView.C0674p(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: G0 */
    public void mo4086G0(View view, int i, int i2) {
        RecyclerView.C0674p pVar = (RecyclerView.C0674p) view.getLayoutParams();
        Rect rect = new Rect();
        mo4130k(view, rect);
        int i3 = i + rect.left + rect.right;
        int i4 = i2 + rect.top + rect.bottom;
        RecyclerView recyclerView = this.f11036D;
        int width = recyclerView != null ? recyclerView.getWidth() : this.f11041I;
        RecyclerView recyclerView2 = this.f11036D;
        view.measure(RecyclerView.AbstractC0669o.m3732O(width, mo4127i0() + mo4129j0() + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin + i3, ((ViewGroup.MarginLayoutParams) pVar).width, false), RecyclerView.AbstractC0669o.m3732O(recyclerView2 != null ? recyclerView2.getHeight() : this.f11042J, mo4131k0() + mo4124h0() + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) pVar).height, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: J1 */
    public void mo4094J1(int i, int i2) {
        super.mo4094J1(i, i2);
        this.f11041I = i;
        this.f11042J = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: K0 */
    public void mo3375K0(RecyclerView.AbstractC0658g gVar, RecyclerView.AbstractC0658g gVar2) {
        super.mo3375K0(gVar, gVar2);
        mo4141q1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: M0 */
    public void mo4099M0(RecyclerView recyclerView) {
        super.mo4099M0(recyclerView);
        this.f11036D = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: O0 */
    public void mo3733O0(RecyclerView recyclerView, RecyclerView.C0681v vVar) {
        super.mo3733O0(recyclerView, vVar);
        this.f11036D = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: Q1 */
    public void mo3385Q1(RecyclerView recyclerView, RecyclerView.C0649a0 a0Var, int i) {
        m13818n2("smoothScrollToPosition " + i + " " + recyclerView, new Object[0]);
        int c0 = mo4116c0();
        int i2 = this.f11037E;
        if (i2 == 0 && c0 > 0) {
            this.f11034B.add(new RunnableC3303e(recyclerView, a0Var, i));
        } else if (i2 * c0 != 0) {
            int max = !mo11178l2() ? Math.max(0, Math.min(c0 - 1, i)) : i % c0;
            int i3 = Integer.MAX_VALUE;
            for (int i4 = -1; i4 <= 1; i4++) {
                if (mo11178l2() || i4 == 0) {
                    int i5 = this.f11037E;
                    int i6 = (((i4 * c0) + max) * i5) - (this.f11045M % (i5 * c0));
                    if (Math.abs(i6) < Math.abs(i3)) {
                        i3 = i6;
                    }
                }
            }
            recyclerView.mo3878o1(i3, 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W1 */
    public void mo11170W1(RecyclerView.C0681v vVar, RecyclerView.C0649a0 a0Var, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.f11041I = 0;
        this.f11042J = 0;
        m13820p2(vVar);
        int max = Math.max(this.f11037E, mo4122g0());
        int max2 = Math.max(this.f11038F, mo4121f0());
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(max, size);
        } else if (mode != 1073741824) {
            size = max;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(max2, size2);
        } else if (mode2 != 1073741824) {
            size2 = max2;
        }
        this.f11041I = size;
        this.f11042J = size2;
        mo4094J1(size, size2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: X0 */
    public void mo3411X0(RecyclerView recyclerView, int i, int i2) {
        super.mo3411X0(recyclerView, i, i2);
        this.f11043K = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: Y0 */
    public void mo3414Y0(RecyclerView recyclerView) {
        super.mo3414Y0(recyclerView);
        this.f11043K = true;
    }

    /* renamed from: Y1 */
    public void mo8437Y1(RecyclerView.C0681v vVar, RecyclerView.C0649a0 a0Var) {
        int i;
        int i2;
        m13819o2("fillChildrenView ==============", new Object[0]);
        C1559a<View> aVar = new C1559a<>(mo4098M());
        m13819o2("getChildCount() = " + mo4098M(), new Object[0]);
        for (int M = mo4098M() - 1; M >= 0; M--) {
            View L = mo4096L(M);
            int l0 = mo4133l0(L);
            aVar.mo6869c(l0, L);
            m13819o2(String.format("viewCache[%d] = %s", Integer.valueOf(l0), L), new Object[0]);
            mo4156z(L);
        }
        int h2 = m13816h2();
        int i22 = m13817i2();
        int d2 = mo11172d2();
        if (h2 <= i22) {
            int i3 = C3304f.f11065a[this.f11051y.ordinal()];
            if (i3 == 1 || i3 == 2) {
                if (this.f11051y == C1546a.EnumC1552f.FirstFront) {
                    i = -1;
                    i22 = h2;
                    h2 = i22;
                } else {
                    i = 1;
                }
                int i4 = h2 - i;
                do {
                    i4 += i;
                    m13812X1(i4, aVar, vVar, a0Var);
                } while (i4 != i22);
            } else if (i3 == 3) {
                while (true) {
                    i2 = d2 - h2;
                    if (i2 <= i22 - d2) {
                        break;
                    }
                    m13812X1(h2, aVar, vVar, a0Var);
                    h2++;
                }
                while (i2 < i22 - d2) {
                    m13812X1(i22, aVar, vVar, a0Var);
                    i22--;
                }
                while (h2 < i22) {
                    m13812X1(h2, aVar, vVar, a0Var);
                    m13812X1(i22, aVar, vVar, a0Var);
                    h2++;
                    i22--;
                }
                m13812X1(d2, aVar, vVar, a0Var);
            } else if (i3 == 4) {
                m13812X1(d2, aVar, vVar, a0Var);
                int i5 = d2 - 1;
                int i6 = i22;
                while (true) {
                    if (i5 < h2 && i6 > i22) {
                        break;
                    }
                    if (i5 >= h2) {
                        m13812X1(i5, aVar, vVar, a0Var);
                        i5--;
                    }
                    if (i6 <= i22) {
                        m13812X1(i6, aVar, vVar, a0Var);
                        i6++;
                    }
                }
            }
        }
        for (int d = aVar.mo6870d() - 1; d >= 0; d--) {
            m13819o2(String.format("recycleView (%d) %s", Integer.valueOf(aVar.mo6867a(d)), aVar.mo6871e(d)), new Object[0]);
            Iterator<View> it = aVar.mo6871e(d).iterator();
            while (it.hasNext()) {
                vVar.mo4191B(it.next());
            }
        }
        m13819o2("getChildCount() = " + mo4098M(), new Object[0]);
        m13819o2("fillChildrenView ============== end", new Object[0]);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: Z0 */
    public void mo3417Z0(RecyclerView recyclerView, int i, int i2, int i3) {
        super.mo3417Z0(recyclerView, i, i2, i3);
        this.f11043K = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: a1 */
    public void mo3421a1(RecyclerView recyclerView, int i, int i2) {
        super.mo3421a1(recyclerView, i, i2);
        this.f11043K = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: b1 */
    public void mo3424b1(RecyclerView recyclerView, int i, int i2) {
        super.mo3424b1(recyclerView, i, i2);
        this.f11043K = true;
        for (int i3 = 0; i3 < i2; i3++) {
            View F = mo3728F(i + i3);
            if (F != null) {
                F.forceLayout();
            }
        }
    }

    /* renamed from: c2 */
    public float mo11171c2() {
        float q2 = mo11180q2(this.f11045M);
        return Math.abs(q2 - ((float) Math.floor((double) q2)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: d1 */
    public void mo3430d1(RecyclerView.C0681v vVar, RecyclerView.C0649a0 a0Var) {
        Queue<Runnable> queue;
        if (mo4116c0() == 0) {
            mo4153x(vVar);
            return;
        }
        m13819o2("onLayoutChildren ==============", new Exception());
        m13820p2(vVar);
        m13809C2();
        if (a0Var.mo3944b() || this.f11043K || this.f11044L) {
            mo4153x(vVar);
            this.f11043K = false;
            this.f11044L = false;
        }
        mo8437Y1(vVar, a0Var);
        m13819o2("onLayoutChildren : Queue Pending Tasks", new Object[0]);
        synchronized (this) {
            queue = this.f11034B;
            this.f11034B = new LinkedList();
        }
        mo11181r2(new RunnableC3299a(queue));
        m13819o2("onLayoutChildren ============== end", new Object[0]);
    }

    /* renamed from: d2 */
    public int mo11172d2() {
        return Math.round(mo11180q2(this.f11045M));
    }

    /* renamed from: e2 */
    public float mo11173e2() {
        return mo11180q2(this.f11045M);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: f1 */
    public void mo3437f1(RecyclerView.C0681v vVar, RecyclerView.C0649a0 a0Var, int i, int i2) {
        this.f11037E = 0;
        this.f11038F = 0;
        super.mo3437f1(vVar, a0Var, i, i2);
        mo11170W1(vVar, a0Var, i, i2);
        m13818n2("carousel width = " + this.f11041I + ", height = " + this.f11042J, new Object[0]);
        if (C1546a.m7570O1()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            Log.d(f11030s, String.format("carousel onMeasure %d %d %d %d", Integer.valueOf(mode), Integer.valueOf(mode2), Integer.valueOf(size), Integer.valueOf(size2)));
        }
    }

    /* renamed from: f2 */
    public int mo11174f2() {
        return this.f11052z;
    }

    /* renamed from: g2 */
    public int mo11175g2() {
        return this.f11033A;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: i1 */
    public void mo3445i1(Parcelable parcelable) {
        super.mo3445i1(parcelable);
        if (parcelable instanceof C3305g) {
            this.f11045M = ((C3305g) parcelable).f11066b;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: j1 */
    public Parcelable mo3447j1() {
        C3305g gVar = new C3305g();
        gVar.f11066b = this.f11045M;
        return gVar;
    }

    /* renamed from: j2 */
    public C1546a.AbstractC1557k mo11176j2() {
        return this.f11047O;
    }

    /* renamed from: k2 */
    public C1546a.AbstractC1558l mo11177k2() {
        return this.f11046N;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: l */
    public boolean mo3451l() {
        return true;
    }

    /* renamed from: l2 */
    public boolean mo11178l2() {
        return this.f11050x;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: m */
    public boolean mo3454m() {
        return false;
    }

    /* renamed from: m2 */
    public boolean mo11179m2(int i) {
        int c0 = mo4116c0();
        if (c0 == 0) {
            return false;
        }
        return this.f11050x || (i >= 0 && i < c0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q2 */
    public float mo11180q2(int i) {
        int i2 = this.f11037E;
        if (i2 != 0) {
            return ((float) i) / ((float) i2);
        }
        return 0.0f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r2 */
    public boolean mo11181r2(Runnable runnable) {
        RecyclerView recyclerView = this.f11036D;
        if (recyclerView == null) {
            return false;
        }
        recyclerView.post(runnable);
        return true;
    }

    /* renamed from: s2 */
    public void mo11182s2() {
        mo11189z2(null);
        mo11183t2(C1546a.EnumC1552f.FirstBack);
    }

    /* renamed from: t2 */
    public CarouselLayoutManager mo11183t2(C1546a.EnumC1552f fVar) {
        this.f11051y = fVar;
        return this;
    }

    /* renamed from: u2 */
    public CarouselLayoutManager mo11184u2(C1546a aVar, int i) {
        this.f11052z = i;
        aVar.setItemViewCacheSize(((i + 2) * 2) + 1);
        return this;
    }

    /* renamed from: v2 */
    public void mo11185v2(int i) {
        this.f11033A = i;
        mo4077A1();
    }

    /* renamed from: w2 */
    public CarouselLayoutManager mo11186w2(boolean z) {
        this.f11050x = z;
        return this;
    }

    /* renamed from: x2 */
    public CarouselLayoutManager mo11187x2(C1546a.AbstractC1553g gVar) {
        this.f11048v = gVar;
        return this;
    }

    /* renamed from: y2 */
    public CarouselLayoutManager mo11188y2(C1546a.AbstractC1554h hVar) {
        this.f11049w = hVar;
        return this;
    }

    /* renamed from: z2 */
    public CarouselLayoutManager mo11189z2(C1546a.AbstractC1557k kVar) {
        if (kVar == null) {
            kVar = f11032u;
        }
        this.f11047O = kVar;
        return this;
    }
}
