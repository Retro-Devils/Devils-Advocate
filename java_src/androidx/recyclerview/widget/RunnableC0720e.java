package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import p006b.p030g.p035g.C0921a;

/* access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.e */
public final class RunnableC0720e implements Runnable {

    /* renamed from: b */
    static final ThreadLocal<RunnableC0720e> f3481b = new ThreadLocal<>();

    /* renamed from: c */
    static Comparator<C0723c> f3482c = new C0721a();

    /* renamed from: d */
    ArrayList<RecyclerView> f3483d = new ArrayList<>();

    /* renamed from: e */
    long f3484e;

    /* renamed from: f */
    long f3485f;

    /* renamed from: g */
    private ArrayList<C0723c> f3486g = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.e$a */
    static class C0721a implements Comparator<C0723c> {
        C0721a() {
        }

        /* renamed from: a */
        public int compare(C0723c cVar, C0723c cVar2) {
            RecyclerView recyclerView = cVar.f3494d;
            if ((recyclerView == null) != (cVar2.f3494d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z = cVar.f3491a;
            if (z != cVar2.f3491a) {
                return z ? -1 : 1;
            }
            int i = cVar2.f3492b - cVar.f3492b;
            if (i != 0) {
                return i;
            }
            int i2 = cVar.f3493c - cVar2.f3493c;
            if (i2 != 0) {
                return i2;
            }
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"VisibleForTests"})
    /* renamed from: androidx.recyclerview.widget.e$b */
    public static class C0722b implements RecyclerView.AbstractC0669o.AbstractC0672c {

        /* renamed from: a */
        int f3487a;

        /* renamed from: b */
        int f3488b;

        /* renamed from: c */
        int[] f3489c;

        /* renamed from: d */
        int f3490d;

        C0722b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o.AbstractC0672c
        /* renamed from: a */
        public void mo4164a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i2 >= 0) {
                int i3 = this.f3490d * 2;
                int[] iArr = this.f3489c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f3489c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i3 >= iArr.length) {
                    int[] iArr3 = new int[(i3 * 2)];
                    this.f3489c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f3489c;
                iArr4[i3] = i;
                iArr4[i3 + 1] = i2;
                this.f3490d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4415b() {
            int[] iArr = this.f3489c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f3490d = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4416c(RecyclerView recyclerView, boolean z) {
            this.f3490d = 0;
            int[] iArr = this.f3489c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.AbstractC0669o oVar = recyclerView.f3192w;
            if (recyclerView.f3190v != null && oVar != null && oVar.mo4157z0()) {
                if (z) {
                    if (!recyclerView.f3174n.mo4336p()) {
                        oVar.mo3466q(recyclerView.f3190v.mo3580c(), this);
                    }
                } else if (!recyclerView.mo3877o0()) {
                    oVar.mo3462p(this.f3487a, this.f3488b, recyclerView.f3183r0, this);
                }
                int i = this.f3490d;
                if (i > oVar.f3273m) {
                    oVar.f3273m = i;
                    oVar.f3274n = z;
                    recyclerView.f3170l.mo4199K();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo4417d(int i) {
            if (this.f3489c != null) {
                int i2 = this.f3490d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f3489c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo4418e(int i, int i2) {
            this.f3487a = i;
            this.f3488b = i2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.e$c */
    public static class C0723c {

        /* renamed from: a */
        public boolean f3491a;

        /* renamed from: b */
        public int f3492b;

        /* renamed from: c */
        public int f3493c;

        /* renamed from: d */
        public RecyclerView f3494d;

        /* renamed from: e */
        public int f3495e;

        C0723c() {
        }

        /* renamed from: a */
        public void mo4419a() {
            this.f3491a = false;
            this.f3492b = 0;
            this.f3493c = 0;
            this.f3494d = null;
            this.f3495e = 0;
        }
    }

    RunnableC0720e() {
    }

    /* renamed from: b */
    private void m4245b() {
        C0723c cVar;
        int size = this.f3483d.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView = this.f3483d.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f3181q0.mo4416c(recyclerView, false);
                i += recyclerView.f3181q0.f3490d;
            }
        }
        this.f3486g.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = this.f3483d.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                C0722b bVar = recyclerView2.f3181q0;
                int abs = Math.abs(bVar.f3487a) + Math.abs(bVar.f3488b);
                for (int i5 = 0; i5 < bVar.f3490d * 2; i5 += 2) {
                    if (i3 >= this.f3486g.size()) {
                        cVar = new C0723c();
                        this.f3486g.add(cVar);
                    } else {
                        cVar = this.f3486g.get(i3);
                    }
                    int[] iArr = bVar.f3489c;
                    int i6 = iArr[i5 + 1];
                    cVar.f3491a = i6 <= abs;
                    cVar.f3492b = abs;
                    cVar.f3493c = i6;
                    cVar.f3494d = recyclerView2;
                    cVar.f3495e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.f3486g, f3482c);
    }

    /* renamed from: c */
    private void m4246c(C0723c cVar, long j) {
        RecyclerView.AbstractC0655d0 i = m4250i(cVar.f3494d, cVar.f3495e, cVar.f3491a ? Long.MAX_VALUE : j);
        if (i != null && i.f3229c != null && i.mo3994s() && !i.mo3995t()) {
            m4249h(i.f3229c.get(), j);
        }
    }

    /* renamed from: d */
    private void m4247d(long j) {
        for (int i = 0; i < this.f3486g.size(); i++) {
            C0723c cVar = this.f3486g.get(i);
            if (cVar.f3494d != null) {
                m4246c(cVar, j);
                cVar.mo4419a();
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    static boolean m4248e(RecyclerView recyclerView, int i) {
        int j = recyclerView.f3176o.mo4353j();
        for (int i2 = 0; i2 < j; i2++) {
            RecyclerView.AbstractC0655d0 g0 = RecyclerView.m3485g0(recyclerView.f3176o.mo4352i(i2));
            if (g0.f3230d == i && !g0.mo3995t()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    private void m4249h(RecyclerView recyclerView, long j) {
        if (recyclerView != null) {
            if (recyclerView.f3148N && recyclerView.f3176o.mo4353j() != 0) {
                recyclerView.mo3806W0();
            }
            C0722b bVar = recyclerView.f3181q0;
            bVar.mo4416c(recyclerView, true);
            if (bVar.f3490d != 0) {
                try {
                    C0921a.m5394a("RV Nested Prefetch");
                    recyclerView.f3183r0.mo3951i(recyclerView.f3190v);
                    for (int i = 0; i < bVar.f3490d * 2; i += 2) {
                        m4250i(recyclerView, bVar.f3489c[i], j);
                    }
                } finally {
                    C0921a.m5395b();
                }
            }
        }
    }

    /* renamed from: i */
    private RecyclerView.AbstractC0655d0 m4250i(RecyclerView recyclerView, int i, long j) {
        if (m4248e(recyclerView, i)) {
            return null;
        }
        RecyclerView.C0681v vVar = recyclerView.f3170l;
        try {
            recyclerView.mo3789I0();
            RecyclerView.AbstractC0655d0 I = vVar.mo4197I(i, false, j);
            if (I != null) {
                if (!I.mo3994s() || I.mo3995t()) {
                    vVar.mo4202a(I, false);
                } else {
                    vVar.mo4191B(I.f3228b);
                }
            }
            return I;
        } finally {
            recyclerView.mo3792K0(false);
        }
    }

    /* renamed from: a */
    public void mo4408a(RecyclerView recyclerView) {
        this.f3483d.add(recyclerView);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo4409f(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f3484e == 0) {
            this.f3484e = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.f3181q0.mo4418e(i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo4410g(long j) {
        m4245b();
        m4247d(j);
    }

    /* renamed from: j */
    public void mo4411j(RecyclerView recyclerView) {
        this.f3483d.remove(recyclerView);
    }

    public void run() {
        try {
            C0921a.m5394a("RV Prefetch");
            if (!this.f3483d.isEmpty()) {
                int size = this.f3483d.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = this.f3483d.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    mo4410g(TimeUnit.MILLISECONDS.toNanos(j) + this.f3485f);
                    this.f3484e = 0;
                    C0921a.m5395b();
                }
            }
        } finally {
            this.f3484e = 0;
            C0921a.m5395b();
        }
    }
}
