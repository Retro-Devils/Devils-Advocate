package androidx.recyclerview.widget;

import android.view.View;

/* access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.o */
public class C0739o {

    /* renamed from: a */
    final AbstractC0741b f3530a;

    /* renamed from: b */
    C0740a f3531b = new C0740a();

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.o$a */
    public static class C0740a {

        /* renamed from: a */
        int f3532a = 0;

        /* renamed from: b */
        int f3533b;

        /* renamed from: c */
        int f3534c;

        /* renamed from: d */
        int f3535d;

        /* renamed from: e */
        int f3536e;

        C0740a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4484a(int i) {
            this.f3532a = i | this.f3532a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo4485b() {
            int i = this.f3532a;
            if ((i & 7) != 0 && (i & (mo4486c(this.f3535d, this.f3533b) << 0)) == 0) {
                return false;
            }
            int i2 = this.f3532a;
            if ((i2 & 112) != 0 && (i2 & (mo4486c(this.f3535d, this.f3534c) << 4)) == 0) {
                return false;
            }
            int i3 = this.f3532a;
            if ((i3 & 1792) != 0 && (i3 & (mo4486c(this.f3536e, this.f3533b) << 8)) == 0) {
                return false;
            }
            int i4 = this.f3532a;
            return (i4 & 28672) == 0 || (i4 & (mo4486c(this.f3536e, this.f3534c) << 12)) != 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo4486c(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo4487d() {
            this.f3532a = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo4488e(int i, int i2, int i3, int i4) {
            this.f3533b = i;
            this.f3534c = i2;
            this.f3535d = i3;
            this.f3536e = i4;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.o$b */
    public interface AbstractC0741b {
        /* renamed from: a */
        View mo4159a(int i);

        /* renamed from: b */
        int mo4160b();

        /* renamed from: c */
        int mo4161c();

        /* renamed from: d */
        int mo4162d(View view);

        /* renamed from: e */
        int mo4163e(View view);
    }

    C0739o(AbstractC0741b bVar) {
        this.f3530a = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo4482a(int i, int i2, int i3, int i4) {
        int c = this.f3530a.mo4161c();
        int b = this.f3530a.mo4160b();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View a = this.f3530a.mo4159a(i);
            this.f3531b.mo4488e(c, b, this.f3530a.mo4163e(a), this.f3530a.mo4162d(a));
            if (i3 != 0) {
                this.f3531b.mo4487d();
                this.f3531b.mo4484a(i3);
                if (this.f3531b.mo4485b()) {
                    return a;
                }
            }
            if (i4 != 0) {
                this.f3531b.mo4487d();
                this.f3531b.mo4484a(i4);
                if (this.f3531b.mo4485b()) {
                    view = a;
                }
            }
            i += i5;
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo4483b(View view, int i) {
        this.f3531b.mo4488e(this.f3530a.mo4161c(), this.f3530a.mo4160b(), this.f3530a.mo4163e(view), this.f3530a.mo4162d(view));
        if (i == 0) {
            return false;
        }
        this.f3531b.mo4487d();
        this.f3531b.mo4484a(i);
        return this.f3531b.mo4485b();
    }
}
