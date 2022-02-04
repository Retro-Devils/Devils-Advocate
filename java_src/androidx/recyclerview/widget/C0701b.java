package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.b */
public class C0701b {

    /* renamed from: a */
    final AbstractC0703b f3389a;

    /* renamed from: b */
    final C0702a f3390b = new C0702a();

    /* renamed from: c */
    final List<View> f3391c = new ArrayList();

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.b$a */
    public static class C0702a {

        /* renamed from: a */
        long f3392a = 0;

        /* renamed from: b */
        C0702a f3393b;

        C0702a() {
        }

        /* renamed from: c */
        private void m4182c() {
            if (this.f3393b == null) {
                this.f3393b = new C0702a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4363a(int i) {
            if (i >= 64) {
                C0702a aVar = this.f3393b;
                if (aVar != null) {
                    aVar.mo4363a(i - 64);
                    return;
                }
                return;
            }
            this.f3392a &= (1 << i) ^ -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo4364b(int i) {
            C0702a aVar = this.f3393b;
            return aVar == null ? i >= 64 ? Long.bitCount(this.f3392a) : Long.bitCount(this.f3392a & ((1 << i) - 1)) : i < 64 ? Long.bitCount(this.f3392a & ((1 << i) - 1)) : aVar.mo4364b(i - 64) + Long.bitCount(this.f3392a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo4365d(int i) {
            if (i < 64) {
                return (this.f3392a & (1 << i)) != 0;
            }
            m4182c();
            return this.f3393b.mo4365d(i - 64);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo4366e(int i, boolean z) {
            if (i >= 64) {
                m4182c();
                this.f3393b.mo4366e(i - 64, z);
                return;
            }
            long j = this.f3392a;
            boolean z2 = (Long.MIN_VALUE & j) != 0;
            long j2 = (1 << i) - 1;
            this.f3392a = ((j & (j2 ^ -1)) << 1) | (j & j2);
            if (z) {
                mo4369h(i);
            } else {
                mo4363a(i);
            }
            if (z2 || this.f3393b != null) {
                m4182c();
                this.f3393b.mo4366e(0, z2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public boolean mo4367f(int i) {
            if (i >= 64) {
                m4182c();
                return this.f3393b.mo4367f(i - 64);
            }
            long j = 1 << i;
            long j2 = this.f3392a;
            boolean z = (j2 & j) != 0;
            long j3 = j2 & (j ^ -1);
            this.f3392a = j3;
            long j4 = j - 1;
            this.f3392a = (j3 & j4) | Long.rotateRight((j4 ^ -1) & j3, 1);
            C0702a aVar = this.f3393b;
            if (aVar != null) {
                if (aVar.mo4365d(0)) {
                    mo4369h(63);
                }
                this.f3393b.mo4367f(0);
            }
            return z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo4368g() {
            this.f3392a = 0;
            C0702a aVar = this.f3393b;
            if (aVar != null) {
                aVar.mo4368g();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo4369h(int i) {
            if (i >= 64) {
                m4182c();
                this.f3393b.mo4369h(i - 64);
                return;
            }
            this.f3392a |= 1 << i;
        }

        public String toString() {
            if (this.f3393b == null) {
                return Long.toBinaryString(this.f3392a);
            }
            return this.f3393b.toString() + "xx" + Long.toBinaryString(this.f3392a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.b$b */
    public interface AbstractC0703b {
        /* renamed from: a */
        View mo4003a(int i);

        /* renamed from: b */
        void mo4004b(View view);

        /* renamed from: c */
        void mo4005c(int i);

        /* renamed from: d */
        void mo4006d();

        /* renamed from: e */
        RecyclerView.AbstractC0655d0 mo4007e(View view);

        /* renamed from: f */
        void mo4008f(int i);

        /* renamed from: g */
        void mo4009g(View view);

        /* renamed from: h */
        void mo4010h(View view, int i, ViewGroup.LayoutParams layoutParams);

        /* renamed from: i */
        void mo4011i(View view, int i);

        /* renamed from: j */
        int mo4012j(View view);

        /* renamed from: k */
        int mo4013k();
    }

    C0701b(AbstractC0703b bVar) {
        this.f3389a = bVar;
    }

    /* renamed from: h */
    private int m4162h(int i) {
        if (i < 0) {
            return -1;
        }
        int k = this.f3389a.mo4013k();
        int i2 = i;
        while (i2 < k) {
            int b = i - (i2 - this.f3390b.mo4364b(i2));
            if (b == 0) {
                while (this.f3390b.mo4365d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b;
        }
        return -1;
    }

    /* renamed from: l */
    private void m4163l(View view) {
        this.f3391c.add(view);
        this.f3389a.mo4004b(view);
    }

    /* renamed from: t */
    private boolean m4164t(View view) {
        if (!this.f3391c.remove(view)) {
            return false;
        }
        this.f3389a.mo4009g(view);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4345a(View view, int i, boolean z) {
        int k = i < 0 ? this.f3389a.mo4013k() : m4162h(i);
        this.f3390b.mo4366e(k, z);
        if (z) {
            m4163l(view);
        }
        this.f3389a.mo4011i(view, k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4346b(View view, boolean z) {
        mo4345a(view, -1, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo4347c(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int k = i < 0 ? this.f3389a.mo4013k() : m4162h(i);
        this.f3390b.mo4366e(k, z);
        if (z) {
            m4163l(view);
        }
        this.f3389a.mo4010h(view, k, layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo4348d(int i) {
        int h = m4162h(i);
        this.f3390b.mo4367f(h);
        this.f3389a.mo4008f(h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public View mo4349e(int i) {
        int size = this.f3391c.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.f3391c.get(i2);
            RecyclerView.AbstractC0655d0 e = this.f3389a.mo4007e(view);
            if (!(e.mo3988m() != i || e.mo3995t() || e.mo3998v())) {
                return view;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public View mo4350f(int i) {
        return this.f3389a.mo4003a(m4162h(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo4351g() {
        return this.f3389a.mo4013k() - this.f3391c.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public View mo4352i(int i) {
        return this.f3389a.mo4003a(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo4353j() {
        return this.f3389a.mo4013k();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo4354k(View view) {
        int j = this.f3389a.mo4012j(view);
        if (j >= 0) {
            this.f3390b.mo4369h(j);
            m4163l(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public int mo4355m(View view) {
        int j = this.f3389a.mo4012j(view);
        if (j != -1 && !this.f3390b.mo4365d(j)) {
            return j - this.f3390b.mo4364b(j);
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo4356n(View view) {
        return this.f3391c.contains(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo4357o() {
        this.f3390b.mo4368g();
        for (int size = this.f3391c.size() - 1; size >= 0; size--) {
            this.f3389a.mo4009g(this.f3391c.get(size));
            this.f3391c.remove(size);
        }
        this.f3389a.mo4006d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo4358p(View view) {
        int j = this.f3389a.mo4012j(view);
        if (j >= 0) {
            if (this.f3390b.mo4367f(j)) {
                m4164t(view);
            }
            this.f3389a.mo4005c(j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo4359q(int i) {
        int h = m4162h(i);
        View a = this.f3389a.mo4003a(h);
        if (a != null) {
            if (this.f3390b.mo4367f(h)) {
                m4164t(a);
            }
            this.f3389a.mo4005c(h);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean mo4360r(View view) {
        int j = this.f3389a.mo4012j(view);
        if (j == -1) {
            m4164t(view);
            return true;
        } else if (!this.f3390b.mo4365d(j)) {
            return false;
        } else {
            this.f3390b.mo4367f(j);
            m4164t(view);
            this.f3389a.mo4005c(j);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo4361s(View view) {
        int j = this.f3389a.mo4012j(view);
        if (j < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        } else if (this.f3390b.mo4365d(j)) {
            this.f3390b.mo4363a(j);
            m4164t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f3390b.toString() + ", hidden list:" + this.f3391c.size();
    }
}
