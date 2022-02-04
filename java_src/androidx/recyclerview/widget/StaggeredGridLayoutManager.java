package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import p006b.p030g.p039k.p040b0.C0979c;

public class StaggeredGridLayoutManager extends RecyclerView.AbstractC0669o implements RecyclerView.AbstractC0686z.AbstractC0688b {

    /* renamed from: A */
    boolean f3321A = false;

    /* renamed from: B */
    private BitSet f3322B;

    /* renamed from: C */
    int f3323C = -1;

    /* renamed from: D */
    int f3324D = Integer.MIN_VALUE;

    /* renamed from: E */
    C0692d f3325E = new C0692d();

    /* renamed from: F */
    private int f3326F = 2;

    /* renamed from: G */
    private boolean f3327G;

    /* renamed from: H */
    private boolean f3328H;

    /* renamed from: I */
    private C0695e f3329I;

    /* renamed from: J */
    private int f3330J;

    /* renamed from: K */
    private final Rect f3331K = new Rect();

    /* renamed from: L */
    private final C0690b f3332L = new C0690b();

    /* renamed from: M */
    private boolean f3333M = false;

    /* renamed from: N */
    private boolean f3334N = true;

    /* renamed from: O */
    private int[] f3335O;

    /* renamed from: P */
    private final Runnable f3336P = new RunnableC0689a();

    /* renamed from: s */
    private int f3337s = -1;

    /* renamed from: t */
    C0697f[] f3338t;

    /* renamed from: u */
    AbstractC0729j f3339u;

    /* renamed from: v */
    AbstractC0729j f3340v;

    /* renamed from: w */
    private int f3341w;

    /* renamed from: x */
    private int f3342x;

    /* renamed from: y */
    private final C0724f f3343y;

    /* renamed from: z */
    boolean f3344z = false;

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$a */
    class RunnableC0689a implements Runnable {
        RunnableC0689a() {
        }

        public void run() {
            StaggeredGridLayoutManager.this.mo4263a2();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$b */
    public class C0690b {

        /* renamed from: a */
        int f3346a;

        /* renamed from: b */
        int f3347b;

        /* renamed from: c */
        boolean f3348c;

        /* renamed from: d */
        boolean f3349d;

        /* renamed from: e */
        boolean f3350e;

        /* renamed from: f */
        int[] f3351f;

        C0690b() {
            mo4273c();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4271a() {
            this.f3347b = this.f3348c ? StaggeredGridLayoutManager.this.f3339u.mo4441i() : StaggeredGridLayoutManager.this.f3339u.mo4445m();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4272b(int i) {
            this.f3347b = this.f3348c ? StaggeredGridLayoutManager.this.f3339u.mo4441i() - i : StaggeredGridLayoutManager.this.f3339u.mo4445m() + i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4273c() {
            this.f3346a = -1;
            this.f3347b = Integer.MIN_VALUE;
            this.f3348c = false;
            this.f3349d = false;
            this.f3350e = false;
            int[] iArr = this.f3351f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo4274d(C0697f[] fVarArr) {
            int length = fVarArr.length;
            int[] iArr = this.f3351f;
            if (iArr == null || iArr.length < length) {
                this.f3351f = new int[StaggeredGridLayoutManager.this.f3338t.length];
            }
            for (int i = 0; i < length; i++) {
                this.f3351f[i] = fVarArr[i].mo4320p(Integer.MIN_VALUE);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c */
    public static class C0691c extends RecyclerView.C0674p {

        /* renamed from: e */
        C0697f f3353e;

        /* renamed from: f */
        boolean f3354f;

        public C0691c(int i, int i2) {
            super(i, i2);
        }

        public C0691c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0691c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0691c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        /* renamed from: g */
        public final int mo4275g() {
            C0697f fVar = this.f3353e;
            if (fVar == null) {
                return -1;
            }
            return fVar.f3375e;
        }

        /* renamed from: h */
        public boolean mo4276h() {
            return this.f3354f;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d */
    public static class C0692d {

        /* renamed from: a */
        int[] f3355a;

        /* renamed from: b */
        List<C0693a> f3356b;

        /* access modifiers changed from: package-private */
        @SuppressLint({"BanParcelableUsage"})
        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a */
        public static class C0693a implements Parcelable {
            public static final Parcelable.Creator<C0693a> CREATOR = new C0694a();

            /* renamed from: b */
            int f3357b;

            /* renamed from: c */
            int f3358c;

            /* renamed from: d */
            int[] f3359d;

            /* renamed from: e */
            boolean f3360e;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a */
            static class C0694a implements Parcelable.Creator<C0693a> {
                C0694a() {
                }

                /* renamed from: a */
                public C0693a createFromParcel(Parcel parcel) {
                    return new C0693a(parcel);
                }

                /* renamed from: b */
                public C0693a[] newArray(int i) {
                    return new C0693a[i];
                }
            }

            C0693a() {
            }

            C0693a(Parcel parcel) {
                this.f3357b = parcel.readInt();
                this.f3358c = parcel.readInt();
                this.f3360e = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f3359d = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public int mo4289b(int i) {
                int[] iArr = this.f3359d;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i];
            }

            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f3357b + ", mGapDir=" + this.f3358c + ", mHasUnwantedGapAfter=" + this.f3360e + ", mGapPerSpan=" + Arrays.toString(this.f3359d) + '}';
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f3357b);
                parcel.writeInt(this.f3358c);
                parcel.writeInt(this.f3360e ? 1 : 0);
                int[] iArr = this.f3359d;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f3359d);
            }
        }

        C0692d() {
        }

        /* renamed from: i */
        private int m4087i(int i) {
            if (this.f3356b == null) {
                return -1;
            }
            C0693a f = mo4282f(i);
            if (f != null) {
                this.f3356b.remove(f);
            }
            int size = this.f3356b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (this.f3356b.get(i2).f3357b >= i) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                return -1;
            }
            this.f3356b.remove(i2);
            return this.f3356b.get(i2).f3357b;
        }

        /* renamed from: l */
        private void m4088l(int i, int i2) {
            List<C0693a> list = this.f3356b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    C0693a aVar = this.f3356b.get(size);
                    int i3 = aVar.f3357b;
                    if (i3 >= i) {
                        aVar.f3357b = i3 + i2;
                    }
                }
            }
        }

        /* renamed from: m */
        private void m4089m(int i, int i2) {
            List<C0693a> list = this.f3356b;
            if (list != null) {
                int i3 = i + i2;
                for (int size = list.size() - 1; size >= 0; size--) {
                    C0693a aVar = this.f3356b.get(size);
                    int i4 = aVar.f3357b;
                    if (i4 >= i) {
                        if (i4 < i3) {
                            this.f3356b.remove(size);
                        } else {
                            aVar.f3357b = i4 - i2;
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo4277a(C0693a aVar) {
            if (this.f3356b == null) {
                this.f3356b = new ArrayList();
            }
            int size = this.f3356b.size();
            for (int i = 0; i < size; i++) {
                C0693a aVar2 = this.f3356b.get(i);
                if (aVar2.f3357b == aVar.f3357b) {
                    this.f3356b.remove(i);
                }
                if (aVar2.f3357b >= aVar.f3357b) {
                    this.f3356b.add(i, aVar);
                    return;
                }
            }
            this.f3356b.add(aVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4278b() {
            int[] iArr = this.f3355a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f3356b = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4279c(int i) {
            int[] iArr = this.f3355a;
            if (iArr == null) {
                int[] iArr2 = new int[(Math.max(i, 10) + 1)];
                this.f3355a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int[] iArr3 = new int[mo4288o(i)];
                this.f3355a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f3355a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public int mo4280d(int i) {
            List<C0693a> list = this.f3356b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f3356b.get(size).f3357b >= i) {
                        this.f3356b.remove(size);
                    }
                }
            }
            return mo4284h(i);
        }

        /* renamed from: e */
        public C0693a mo4281e(int i, int i2, int i3, boolean z) {
            List<C0693a> list = this.f3356b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                C0693a aVar = this.f3356b.get(i4);
                int i5 = aVar.f3357b;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || aVar.f3358c == i3 || (z && aVar.f3360e))) {
                    return aVar;
                }
            }
            return null;
        }

        /* renamed from: f */
        public C0693a mo4282f(int i) {
            List<C0693a> list = this.f3356b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                C0693a aVar = this.f3356b.get(size);
                if (aVar.f3357b == i) {
                    return aVar;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public int mo4283g(int i) {
            int[] iArr = this.f3355a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            return iArr[i];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public int mo4284h(int i) {
            int[] iArr = this.f3355a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            int i2 = m4087i(i);
            if (i2 == -1) {
                int[] iArr2 = this.f3355a;
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.f3355a.length;
            }
            int i3 = i2 + 1;
            Arrays.fill(this.f3355a, i, i3, -1);
            return i3;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo4285j(int i, int i2) {
            int[] iArr = this.f3355a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                mo4279c(i3);
                int[] iArr2 = this.f3355a;
                System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
                Arrays.fill(this.f3355a, i, i3, -1);
                m4088l(i, i2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo4286k(int i, int i2) {
            int[] iArr = this.f3355a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                mo4279c(i3);
                int[] iArr2 = this.f3355a;
                System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
                int[] iArr3 = this.f3355a;
                Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
                m4089m(i, i2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public void mo4287n(int i, C0697f fVar) {
            mo4279c(i);
            this.f3355a[i] = fVar.f3375e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public int mo4288o(int i) {
            int length = this.f3355a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e */
    public static class C0695e implements Parcelable {
        public static final Parcelable.Creator<C0695e> CREATOR = new C0696a();

        /* renamed from: b */
        int f3361b;

        /* renamed from: c */
        int f3362c;

        /* renamed from: d */
        int f3363d;

        /* renamed from: e */
        int[] f3364e;

        /* renamed from: f */
        int f3365f;

        /* renamed from: g */
        int[] f3366g;

        /* renamed from: h */
        List<C0692d.C0693a> f3367h;

        /* renamed from: i */
        boolean f3368i;

        /* renamed from: j */
        boolean f3369j;

        /* renamed from: k */
        boolean f3370k;

        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e$a */
        static class C0696a implements Parcelable.Creator<C0695e> {
            C0696a() {
            }

            /* renamed from: a */
            public C0695e createFromParcel(Parcel parcel) {
                return new C0695e(parcel);
            }

            /* renamed from: b */
            public C0695e[] newArray(int i) {
                return new C0695e[i];
            }
        }

        public C0695e() {
        }

        C0695e(Parcel parcel) {
            this.f3361b = parcel.readInt();
            this.f3362c = parcel.readInt();
            int readInt = parcel.readInt();
            this.f3363d = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f3364e = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f3365f = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f3366g = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z = false;
            this.f3368i = parcel.readInt() == 1;
            this.f3369j = parcel.readInt() == 1;
            this.f3370k = parcel.readInt() == 1 ? true : z;
            this.f3367h = parcel.readArrayList(C0692d.C0693a.class.getClassLoader());
        }

        public C0695e(C0695e eVar) {
            this.f3363d = eVar.f3363d;
            this.f3361b = eVar.f3361b;
            this.f3362c = eVar.f3362c;
            this.f3364e = eVar.f3364e;
            this.f3365f = eVar.f3365f;
            this.f3366g = eVar.f3366g;
            this.f3368i = eVar.f3368i;
            this.f3369j = eVar.f3369j;
            this.f3370k = eVar.f3370k;
            this.f3367h = eVar.f3367h;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4297b() {
            this.f3364e = null;
            this.f3363d = 0;
            this.f3361b = -1;
            this.f3362c = -1;
        }

        public int describeContents() {
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo4299g() {
            this.f3364e = null;
            this.f3363d = 0;
            this.f3365f = 0;
            this.f3366g = null;
            this.f3367h = null;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f3361b);
            parcel.writeInt(this.f3362c);
            parcel.writeInt(this.f3363d);
            if (this.f3363d > 0) {
                parcel.writeIntArray(this.f3364e);
            }
            parcel.writeInt(this.f3365f);
            if (this.f3365f > 0) {
                parcel.writeIntArray(this.f3366g);
            }
            parcel.writeInt(this.f3368i ? 1 : 0);
            parcel.writeInt(this.f3369j ? 1 : 0);
            parcel.writeInt(this.f3370k ? 1 : 0);
            parcel.writeList(this.f3367h);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$f */
    public class C0697f {

        /* renamed from: a */
        ArrayList<View> f3371a = new ArrayList<>();

        /* renamed from: b */
        int f3372b = Integer.MIN_VALUE;

        /* renamed from: c */
        int f3373c = Integer.MIN_VALUE;

        /* renamed from: d */
        int f3374d = 0;

        /* renamed from: e */
        final int f3375e;

        C0697f(int i) {
            this.f3375e = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4305a(View view) {
            C0691c n = mo4318n(view);
            n.f3353e = this;
            this.f3371a.add(view);
            this.f3373c = Integer.MIN_VALUE;
            if (this.f3371a.size() == 1) {
                this.f3372b = Integer.MIN_VALUE;
            }
            if (n.mo4168d() || n.mo4167c()) {
                this.f3374d += StaggeredGridLayoutManager.this.f3339u.mo4437e(view);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4306b(boolean z, int i) {
            int l = z ? mo4316l(Integer.MIN_VALUE) : mo4320p(Integer.MIN_VALUE);
            mo4309e();
            if (l != Integer.MIN_VALUE) {
                if (z && l < StaggeredGridLayoutManager.this.f3339u.mo4441i()) {
                    return;
                }
                if (z || l <= StaggeredGridLayoutManager.this.f3339u.mo4445m()) {
                    if (i != Integer.MIN_VALUE) {
                        l += i;
                    }
                    this.f3373c = l;
                    this.f3372b = l;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4307c() {
            C0692d.C0693a f;
            ArrayList<View> arrayList = this.f3371a;
            View view = arrayList.get(arrayList.size() - 1);
            C0691c n = mo4318n(view);
            this.f3373c = StaggeredGridLayoutManager.this.f3339u.mo4436d(view);
            if (n.f3354f && (f = StaggeredGridLayoutManager.this.f3325E.mo4282f(n.mo4166b())) != null && f.f3358c == 1) {
                this.f3373c += f.mo4289b(this.f3375e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo4308d() {
            C0692d.C0693a f;
            View view = this.f3371a.get(0);
            C0691c n = mo4318n(view);
            this.f3372b = StaggeredGridLayoutManager.this.f3339u.mo4439g(view);
            if (n.f3354f && (f = StaggeredGridLayoutManager.this.f3325E.mo4282f(n.mo4166b())) != null && f.f3358c == -1) {
                this.f3372b -= f.mo4289b(this.f3375e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo4309e() {
            this.f3371a.clear();
            mo4321q();
            this.f3374d = 0;
        }

        /* renamed from: f */
        public int mo4310f() {
            int i;
            int i2;
            if (StaggeredGridLayoutManager.this.f3344z) {
                i2 = this.f3371a.size() - 1;
                i = -1;
            } else {
                i2 = 0;
                i = this.f3371a.size();
            }
            return mo4313i(i2, i, true);
        }

        /* renamed from: g */
        public int mo4311g() {
            int i;
            int i2;
            if (StaggeredGridLayoutManager.this.f3344z) {
                i2 = 0;
                i = this.f3371a.size();
            } else {
                i2 = this.f3371a.size() - 1;
                i = -1;
            }
            return mo4313i(i2, i, true);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public int mo4312h(int i, int i2, boolean z, boolean z2, boolean z3) {
            int m = StaggeredGridLayoutManager.this.f3339u.mo4445m();
            int i3 = StaggeredGridLayoutManager.this.f3339u.mo4441i();
            int i4 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.f3371a.get(i);
                int g = StaggeredGridLayoutManager.this.f3339u.mo4439g(view);
                int d = StaggeredGridLayoutManager.this.f3339u.mo4436d(view);
                boolean z4 = false;
                boolean z5 = !z3 ? g < i3 : g <= i3;
                if (!z3 ? d > m : d >= m) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (!z || !z2) {
                        if (!z2 && g >= m && d <= i3) {
                        }
                    } else if (g >= m && d <= i3) {
                    }
                    return StaggeredGridLayoutManager.this.mo4133l0(view);
                }
                i += i4;
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public int mo4313i(int i, int i2, boolean z) {
            return mo4312h(i, i2, false, false, z);
        }

        /* renamed from: j */
        public int mo4314j() {
            return this.f3374d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public int mo4315k() {
            int i = this.f3373c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            mo4307c();
            return this.f3373c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public int mo4316l(int i) {
            int i2 = this.f3373c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f3371a.size() == 0) {
                return i;
            }
            mo4307c();
            return this.f3373c;
        }

        /* renamed from: m */
        public View mo4317m(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.f3371a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f3371a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f3344z && staggeredGridLayoutManager.mo4133l0(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f3344z && staggeredGridLayoutManager2.mo4133l0(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f3371a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = this.f3371a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f3344z && staggeredGridLayoutManager3.mo4133l0(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f3344z && staggeredGridLayoutManager4.mo4133l0(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public C0691c mo4318n(View view) {
            return (C0691c) view.getLayoutParams();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public int mo4319o() {
            int i = this.f3372b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            mo4308d();
            return this.f3372b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public int mo4320p(int i) {
            int i2 = this.f3372b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f3371a.size() == 0) {
                return i;
            }
            mo4308d();
            return this.f3372b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public void mo4321q() {
            this.f3372b = Integer.MIN_VALUE;
            this.f3373c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo4322r(int i) {
            int i2 = this.f3372b;
            if (i2 != Integer.MIN_VALUE) {
                this.f3372b = i2 + i;
            }
            int i3 = this.f3373c;
            if (i3 != Integer.MIN_VALUE) {
                this.f3373c = i3 + i;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public void mo4323s() {
            int size = this.f3371a.size();
            View remove = this.f3371a.remove(size - 1);
            C0691c n = mo4318n(remove);
            n.f3353e = null;
            if (n.mo4168d() || n.mo4167c()) {
                this.f3374d -= StaggeredGridLayoutManager.this.f3339u.mo4437e(remove);
            }
            if (size == 1) {
                this.f3372b = Integer.MIN_VALUE;
            }
            this.f3373c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public void mo4324t() {
            View remove = this.f3371a.remove(0);
            C0691c n = mo4318n(remove);
            n.f3353e = null;
            if (this.f3371a.size() == 0) {
                this.f3373c = Integer.MIN_VALUE;
            }
            if (n.mo4168d() || n.mo4167c()) {
                this.f3374d -= StaggeredGridLayoutManager.this.f3339u.mo4437e(remove);
            }
            this.f3372b = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: u */
        public void mo4325u(View view) {
            C0691c n = mo4318n(view);
            n.f3353e = this;
            this.f3371a.add(0, view);
            this.f3372b = Integer.MIN_VALUE;
            if (this.f3371a.size() == 1) {
                this.f3373c = Integer.MIN_VALUE;
            }
            if (n.mo4168d() || n.mo4167c()) {
                this.f3374d += StaggeredGridLayoutManager.this.f3339u.mo4437e(view);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public void mo4326v(int i) {
            this.f3372b = i;
            this.f3373c = i;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.AbstractC0669o.C0673d m0 = RecyclerView.AbstractC0669o.m3735m0(context, attributeSet, i, i2);
        mo4255P2(m0.f3281a);
        mo4257R2(m0.f3282b);
        mo4256Q2(m0.f3283c);
        this.f3343y = new C0724f();
        m4010i2();
    }

    /* renamed from: C2 */
    private void m3983C2(View view, int i, int i2, boolean z) {
        mo4130k(view, this.f3331K);
        C0691c cVar = (C0691c) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect = this.f3331K;
        int Z2 = m4002Z2(i, i3 + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int i4 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect2 = this.f3331K;
        int Z22 = m4002Z2(i2, i4 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (z ? mo4103P1(view, Z2, Z22, cVar) : mo4102N1(view, Z2, Z22, cVar)) {
            view.measure(Z2, Z22);
        }
    }

    /* renamed from: D2 */
    private void m3984D2(View view, C0691c cVar, boolean z) {
        int i;
        int i2;
        if (cVar.f3354f) {
            if (this.f3341w == 1) {
                i2 = this.f3330J;
            } else {
                m3983C2(view, RecyclerView.AbstractC0669o.m3731N(mo4143s0(), mo4145t0(), mo4127i0() + mo4129j0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), this.f3330J, z);
                return;
            }
        } else if (this.f3341w == 1) {
            i2 = RecyclerView.AbstractC0669o.m3731N(this.f3342x, mo4145t0(), 0, ((ViewGroup.MarginLayoutParams) cVar).width, false);
        } else {
            i2 = RecyclerView.AbstractC0669o.m3731N(mo4143s0(), mo4145t0(), mo4127i0() + mo4129j0(), ((ViewGroup.MarginLayoutParams) cVar).width, true);
            i = RecyclerView.AbstractC0669o.m3731N(this.f3342x, mo4114b0(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false);
            m3983C2(view, i2, i, z);
        }
        i = RecyclerView.AbstractC0669o.m3731N(mo4112a0(), mo4114b0(), mo4131k0() + mo4124h0(), ((ViewGroup.MarginLayoutParams) cVar).height, true);
        m3983C2(view, i2, i, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x014b, code lost:
        if (mo4263a2() != false) goto L_0x014f;
     */
    /* renamed from: E2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3985E2(androidx.recyclerview.widget.RecyclerView.C0681v r9, androidx.recyclerview.widget.RecyclerView.C0649a0 r10, boolean r11) {
        /*
        // Method dump skipped, instructions count: 367
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m3985E2(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0, boolean):void");
    }

    /* renamed from: F2 */
    private boolean m3986F2(int i) {
        if (this.f3341w == 0) {
            return (i == -1) != this.f3321A;
        }
        return ((i == -1) == this.f3321A) == mo4252B2();
    }

    /* renamed from: H2 */
    private void m3987H2(View view) {
        for (int i = this.f3337s - 1; i >= 0; i--) {
            this.f3338t[i].mo4325u(view);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        if (r4.f3500e == -1) goto L_0x0012;
     */
    /* renamed from: I2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3988I2(androidx.recyclerview.widget.RecyclerView.C0681v r3, androidx.recyclerview.widget.C0724f r4) {
        /*
            r2 = this;
            boolean r0 = r4.f3496a
            if (r0 == 0) goto L_0x004d
            boolean r0 = r4.f3504i
            if (r0 == 0) goto L_0x0009
            goto L_0x004d
        L_0x0009:
            int r0 = r4.f3497b
            r1 = -1
            if (r0 != 0) goto L_0x001e
            int r0 = r4.f3500e
            if (r0 != r1) goto L_0x0018
        L_0x0012:
            int r4 = r4.f3502g
        L_0x0014:
            r2.m3989J2(r3, r4)
            goto L_0x004d
        L_0x0018:
            int r4 = r4.f3501f
        L_0x001a:
            r2.m3990K2(r3, r4)
            goto L_0x004d
        L_0x001e:
            int r0 = r4.f3500e
            if (r0 != r1) goto L_0x0037
            int r0 = r4.f3501f
            int r1 = r2.m4017u2(r0)
            int r0 = r0 - r1
            if (r0 >= 0) goto L_0x002c
            goto L_0x0012
        L_0x002c:
            int r1 = r4.f3502g
            int r4 = r4.f3497b
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r1 - r4
            goto L_0x0014
        L_0x0037:
            int r0 = r4.f3502g
            int r0 = r2.m4018v2(r0)
            int r1 = r4.f3502g
            int r0 = r0 - r1
            if (r0 >= 0) goto L_0x0043
            goto L_0x0018
        L_0x0043:
            int r1 = r4.f3501f
            int r4 = r4.f3497b
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r4 + r1
            goto L_0x001a
        L_0x004d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m3988I2(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.f):void");
    }

    /* renamed from: J2 */
    private void m3989J2(RecyclerView.C0681v vVar, int i) {
        for (int M = mo4098M() - 1; M >= 0; M--) {
            View L = mo4096L(M);
            if (this.f3339u.mo4439g(L) >= i && this.f3339u.mo4449q(L) >= i) {
                C0691c cVar = (C0691c) L.getLayoutParams();
                if (cVar.f3354f) {
                    for (int i2 = 0; i2 < this.f3337s; i2++) {
                        if (this.f3338t[i2].f3371a.size() == 1) {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f3337s; i3++) {
                        this.f3338t[i3].mo4323s();
                    }
                } else if (cVar.f3353e.f3371a.size() != 1) {
                    cVar.f3353e.mo4323s();
                } else {
                    return;
                }
                mo4146t1(L, vVar);
            } else {
                return;
            }
        }
    }

    /* renamed from: K2 */
    private void m3990K2(RecyclerView.C0681v vVar, int i) {
        while (mo4098M() > 0) {
            View L = mo4096L(0);
            if (this.f3339u.mo4436d(L) <= i && this.f3339u.mo4448p(L) <= i) {
                C0691c cVar = (C0691c) L.getLayoutParams();
                if (cVar.f3354f) {
                    for (int i2 = 0; i2 < this.f3337s; i2++) {
                        if (this.f3338t[i2].f3371a.size() == 1) {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f3337s; i3++) {
                        this.f3338t[i3].mo4324t();
                    }
                } else if (cVar.f3353e.f3371a.size() != 1) {
                    cVar.f3353e.mo4324t();
                } else {
                    return;
                }
                mo4146t1(L, vVar);
            } else {
                return;
            }
        }
    }

    /* renamed from: L2 */
    private void m3991L2() {
        if (this.f3340v.mo4443k() != 1073741824) {
            float f = 0.0f;
            int M = mo4098M();
            for (int i = 0; i < M; i++) {
                View L = mo4096L(i);
                float e = (float) this.f3340v.mo4437e(L);
                if (e >= f) {
                    if (((C0691c) L.getLayoutParams()).mo4276h()) {
                        e = (e * 1.0f) / ((float) this.f3337s);
                    }
                    f = Math.max(f, e);
                }
            }
            int i2 = this.f3342x;
            int round = Math.round(f * ((float) this.f3337s));
            if (this.f3340v.mo4443k() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f3340v.mo4446n());
            }
            mo4262X2(round);
            if (this.f3342x != i2) {
                for (int i3 = 0; i3 < M; i3++) {
                    View L2 = mo4096L(i3);
                    C0691c cVar = (C0691c) L2.getLayoutParams();
                    if (!cVar.f3354f) {
                        if (!mo4252B2() || this.f3341w != 1) {
                            int i4 = cVar.f3353e.f3375e;
                            int i5 = this.f3341w;
                            int i6 = (this.f3342x * i4) - (i4 * i2);
                            if (i5 == 1) {
                                L2.offsetLeftAndRight(i6);
                            } else {
                                L2.offsetTopAndBottom(i6);
                            }
                        } else {
                            int i7 = this.f3337s;
                            int i8 = cVar.f3353e.f3375e;
                            L2.offsetLeftAndRight(((-((i7 - 1) - i8)) * this.f3342x) - ((-((i7 - 1) - i8)) * i2));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: M2 */
    private void m3992M2() {
        this.f3321A = (this.f3341w == 1 || !mo4252B2()) ? this.f3344z : !this.f3344z;
    }

    /* renamed from: O2 */
    private void m3993O2(int i) {
        C0724f fVar = this.f3343y;
        fVar.f3500e = i;
        int i2 = 1;
        if (this.f3321A != (i == -1)) {
            i2 = -1;
        }
        fVar.f3499d = i2;
    }

    /* renamed from: S2 */
    private void m3994S2(int i, int i2) {
        for (int i3 = 0; i3 < this.f3337s; i3++) {
            if (!this.f3338t[i3].f3371a.isEmpty()) {
                m4000Y2(this.f3338t[i3], i, i2);
            }
        }
    }

    /* renamed from: T2 */
    private boolean m3995T2(RecyclerView.C0649a0 a0Var, C0690b bVar) {
        boolean z = this.f3327G;
        int c = a0Var.mo3945c();
        bVar.f3346a = z ? m4013o2(c) : m4012k2(c);
        bVar.f3347b = Integer.MIN_VALUE;
        return true;
    }

    /* renamed from: U1 */
    private void m3996U1(View view) {
        for (int i = this.f3337s - 1; i >= 0; i--) {
            this.f3338t[i].mo4305a(view);
        }
    }

    /* renamed from: V1 */
    private void m3997V1(C0690b bVar) {
        boolean z;
        C0695e eVar = this.f3329I;
        int i = eVar.f3363d;
        if (i > 0) {
            if (i == this.f3337s) {
                for (int i2 = 0; i2 < this.f3337s; i2++) {
                    this.f3338t[i2].mo4309e();
                    C0695e eVar2 = this.f3329I;
                    int i3 = eVar2.f3364e[i2];
                    if (i3 != Integer.MIN_VALUE) {
                        i3 += eVar2.f3369j ? this.f3339u.mo4441i() : this.f3339u.mo4445m();
                    }
                    this.f3338t[i2].mo4326v(i3);
                }
            } else {
                eVar.mo4299g();
                C0695e eVar3 = this.f3329I;
                eVar3.f3361b = eVar3.f3362c;
            }
        }
        C0695e eVar4 = this.f3329I;
        this.f3328H = eVar4.f3370k;
        mo4256Q2(eVar4.f3368i);
        m3992M2();
        C0695e eVar5 = this.f3329I;
        int i4 = eVar5.f3361b;
        if (i4 != -1) {
            this.f3323C = i4;
            z = eVar5.f3369j;
        } else {
            z = this.f3321A;
        }
        bVar.f3348c = z;
        if (eVar5.f3365f > 1) {
            C0692d dVar = this.f3325E;
            dVar.f3355a = eVar5.f3366g;
            dVar.f3356b = eVar5.f3367h;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* renamed from: W2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3998W2(int r5, androidx.recyclerview.widget.RecyclerView.C0649a0 r6) {
        /*
        // Method dump skipped, instructions count: 119
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m3998W2(int, androidx.recyclerview.widget.RecyclerView$a0):void");
    }

    /* renamed from: Y1 */
    private void m3999Y1(View view, C0691c cVar, C0724f fVar) {
        if (fVar.f3500e == 1) {
            if (cVar.f3354f) {
                m3996U1(view);
            } else {
                cVar.f3353e.mo4305a(view);
            }
        } else if (cVar.f3354f) {
            m3987H2(view);
        } else {
            cVar.f3353e.mo4325u(view);
        }
    }

    /* renamed from: Y2 */
    private void m4000Y2(C0697f fVar, int i, int i2) {
        int j = fVar.mo4314j();
        if (i == -1) {
            if (fVar.mo4319o() + j > i2) {
                return;
            }
        } else if (fVar.mo4315k() - j < i2) {
            return;
        }
        this.f3322B.set(fVar.f3375e, false);
    }

    /* renamed from: Z1 */
    private int m4001Z1(int i) {
        if (mo4098M() == 0) {
            return this.f3321A ? 1 : -1;
        }
        return (i < mo4267r2()) != this.f3321A ? -1 : 1;
    }

    /* renamed from: Z2 */
    private int m4002Z2(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    /* renamed from: b2 */
    private boolean m4003b2(C0697f fVar) {
        if (this.f3321A) {
            if (fVar.mo4315k() < this.f3339u.mo4441i()) {
                ArrayList<View> arrayList = fVar.f3371a;
                return !fVar.mo4318n(arrayList.get(arrayList.size() - 1)).f3354f;
            }
        } else if (fVar.mo4319o() > this.f3339u.mo4445m()) {
            return !fVar.mo4318n(fVar.f3371a.get(0)).f3354f;
        }
        return false;
    }

    /* renamed from: c2 */
    private int m4004c2(RecyclerView.C0649a0 a0Var) {
        if (mo4098M() == 0) {
            return 0;
        }
        return C0734l.m4359a(a0Var, this.f3339u, mo4265m2(!this.f3334N), mo4264l2(!this.f3334N), this, this.f3334N);
    }

    /* renamed from: d2 */
    private int m4005d2(RecyclerView.C0649a0 a0Var) {
        if (mo4098M() == 0) {
            return 0;
        }
        return C0734l.m4360b(a0Var, this.f3339u, mo4265m2(!this.f3334N), mo4264l2(!this.f3334N), this, this.f3334N, this.f3321A);
    }

    /* renamed from: e2 */
    private int m4006e2(RecyclerView.C0649a0 a0Var) {
        if (mo4098M() == 0) {
            return 0;
        }
        return C0734l.m4361c(a0Var, this.f3339u, mo4265m2(!this.f3334N), mo4264l2(!this.f3334N), this, this.f3334N);
    }

    /* renamed from: f2 */
    private int m4007f2(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f3341w == 1) ? 1 : Integer.MIN_VALUE : this.f3341w == 0 ? 1 : Integer.MIN_VALUE : this.f3341w == 1 ? -1 : Integer.MIN_VALUE : this.f3341w == 0 ? -1 : Integer.MIN_VALUE : (this.f3341w != 1 && mo4252B2()) ? -1 : 1 : (this.f3341w != 1 && mo4252B2()) ? 1 : -1;
    }

    /* renamed from: g2 */
    private C0692d.C0693a m4008g2(int i) {
        C0692d.C0693a aVar = new C0692d.C0693a();
        aVar.f3359d = new int[this.f3337s];
        for (int i2 = 0; i2 < this.f3337s; i2++) {
            aVar.f3359d[i2] = i - this.f3338t[i2].mo4316l(i);
        }
        return aVar;
    }

    /* renamed from: h2 */
    private C0692d.C0693a m4009h2(int i) {
        C0692d.C0693a aVar = new C0692d.C0693a();
        aVar.f3359d = new int[this.f3337s];
        for (int i2 = 0; i2 < this.f3337s; i2++) {
            aVar.f3359d[i2] = this.f3338t[i2].mo4320p(i) - i;
        }
        return aVar;
    }

    /* renamed from: i2 */
    private void m4010i2() {
        this.f3339u = AbstractC0729j.m4297b(this, this.f3341w);
        this.f3340v = AbstractC0729j.m4297b(this, 1 - this.f3341w);
    }

    /* renamed from: j2 */
    private int m4011j2(RecyclerView.C0681v vVar, C0724f fVar, RecyclerView.C0649a0 a0Var) {
        int i;
        C0697f fVar2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        View view;
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        boolean z = false;
        this.f3322B.set(0, this.f3337s, true);
        if (this.f3343y.f3504i) {
            i = fVar.f3500e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i = fVar.f3500e == 1 ? fVar.f3502g + fVar.f3497b : fVar.f3501f - fVar.f3497b;
        }
        m3994S2(fVar.f3500e, i);
        int i8 = this.f3321A ? this.f3339u.mo4441i() : this.f3339u.mo4445m();
        boolean z2 = false;
        while (fVar.mo4420a(a0Var) && (this.f3343y.f3504i || !this.f3322B.isEmpty())) {
            View b = fVar.mo4421b(vVar);
            C0691c cVar = (C0691c) b.getLayoutParams();
            int b2 = cVar.mo4166b();
            int g = this.f3325E.mo4283g(b2);
            boolean z3 = g == -1;
            if (z3) {
                if (cVar.f3354f) {
                    C0697f[] fVarArr = this.f3338t;
                    char c = z ? 1 : 0;
                    char c2 = z ? 1 : 0;
                    char c3 = z ? 1 : 0;
                    fVar2 = fVarArr[c];
                } else {
                    fVar2 = m4020x2(fVar);
                }
                this.f3325E.mo4287n(b2, fVar2);
            } else {
                fVar2 = this.f3338t[g];
            }
            cVar.f3353e = fVar2;
            if (fVar.f3500e == 1) {
                mo4117d(b);
            } else {
                int i9 = z ? 1 : 0;
                int i10 = z ? 1 : 0;
                int i11 = z ? 1 : 0;
                mo4119e(b, i9);
            }
            m3984D2(b, cVar, z);
            if (fVar.f3500e == 1) {
                int t2 = cVar.f3354f ? m4016t2(i8) : fVar2.mo4316l(i8);
                int e = this.f3339u.mo4437e(b) + t2;
                if (z3 && cVar.f3354f) {
                    C0692d.C0693a g2 = m4008g2(t2);
                    g2.f3358c = -1;
                    g2.f3357b = b2;
                    this.f3325E.mo4277a(g2);
                }
                i2 = e;
                i3 = t2;
            } else {
                int w2 = cVar.f3354f ? m4019w2(i8) : fVar2.mo4320p(i8);
                i3 = w2 - this.f3339u.mo4437e(b);
                if (z3 && cVar.f3354f) {
                    C0692d.C0693a h2 = m4009h2(w2);
                    h2.f3358c = 1;
                    h2.f3357b = b2;
                    this.f3325E.mo4277a(h2);
                }
                i2 = w2;
            }
            if (cVar.f3354f && fVar.f3499d == -1) {
                if (!z3) {
                    if (!(fVar.f3500e == 1 ? mo4260W1() : mo4261X1())) {
                        C0692d.C0693a f = this.f3325E.mo4282f(b2);
                        if (f != null) {
                            f.f3360e = true;
                        }
                    }
                }
                this.f3333M = true;
            }
            m3999Y1(b, cVar, fVar);
            if (!mo4252B2() || this.f3341w != 1) {
                int m = cVar.f3354f ? this.f3340v.mo4445m() : (fVar2.f3375e * this.f3342x) + this.f3340v.mo4445m();
                i5 = m;
                i4 = this.f3340v.mo4437e(b) + m;
            } else {
                int i12 = cVar.f3354f ? this.f3340v.mo4441i() : this.f3340v.mo4441i() - (((this.f3337s - 1) - fVar2.f3375e) * this.f3342x);
                i4 = i12;
                i5 = i12 - this.f3340v.mo4437e(b);
            }
            if (this.f3341w == 1) {
                staggeredGridLayoutManager = this;
                view = b;
                i7 = i5;
                i5 = i3;
                i6 = i4;
            } else {
                staggeredGridLayoutManager = this;
                view = b;
                i7 = i3;
                i6 = i2;
                i2 = i4;
            }
            staggeredGridLayoutManager.mo4085F0(view, i7, i5, i6, i2);
            if (cVar.f3354f) {
                m3994S2(this.f3343y.f3500e, i);
            } else {
                m4000Y2(fVar2, this.f3343y.f3500e, i);
            }
            m3988I2(vVar, this.f3343y);
            if (this.f3343y.f3503h && b.hasFocusable()) {
                if (cVar.f3354f) {
                    this.f3322B.clear();
                } else {
                    this.f3322B.set(fVar2.f3375e, false);
                    z2 = true;
                    z = false;
                }
            }
            z2 = true;
            z = false;
        }
        if (!z2) {
            m3988I2(vVar, this.f3343y);
        }
        int m2 = this.f3343y.f3500e == -1 ? this.f3339u.mo4445m() - m4019w2(this.f3339u.mo4445m()) : m4016t2(this.f3339u.mo4441i()) - this.f3339u.mo4441i();
        if (m2 > 0) {
            return Math.min(fVar.f3497b, m2);
        }
        return 0;
    }

    /* renamed from: k2 */
    private int m4012k2(int i) {
        int M = mo4098M();
        for (int i2 = 0; i2 < M; i2++) {
            int l0 = mo4133l0(mo4096L(i2));
            if (l0 >= 0 && l0 < i) {
                return l0;
            }
        }
        return 0;
    }

    /* renamed from: o2 */
    private int m4013o2(int i) {
        for (int M = mo4098M() - 1; M >= 0; M--) {
            int l0 = mo4133l0(mo4096L(M));
            if (l0 >= 0 && l0 < i) {
                return l0;
            }
        }
        return 0;
    }

    /* renamed from: p2 */
    private void m4014p2(RecyclerView.C0681v vVar, RecyclerView.C0649a0 a0Var, boolean z) {
        int i;
        int t2 = m4016t2(Integer.MIN_VALUE);
        if (t2 != Integer.MIN_VALUE && (i = this.f3339u.mo4441i() - t2) > 0) {
            int i2 = i - (-mo4254N2(-i, vVar, a0Var));
            if (z && i2 > 0) {
                this.f3339u.mo4450r(i2);
            }
        }
    }

    /* renamed from: q2 */
    private void m4015q2(RecyclerView.C0681v vVar, RecyclerView.C0649a0 a0Var, boolean z) {
        int m;
        int w2 = m4019w2(Integer.MAX_VALUE);
        if (w2 != Integer.MAX_VALUE && (m = w2 - this.f3339u.mo4445m()) > 0) {
            int N2 = m - mo4254N2(m, vVar, a0Var);
            if (z && N2 > 0) {
                this.f3339u.mo4450r(-N2);
            }
        }
    }

    /* renamed from: t2 */
    private int m4016t2(int i) {
        int l = this.f3338t[0].mo4316l(i);
        for (int i2 = 1; i2 < this.f3337s; i2++) {
            int l2 = this.f3338t[i2].mo4316l(i);
            if (l2 > l) {
                l = l2;
            }
        }
        return l;
    }

    /* renamed from: u2 */
    private int m4017u2(int i) {
        int p = this.f3338t[0].mo4320p(i);
        for (int i2 = 1; i2 < this.f3337s; i2++) {
            int p2 = this.f3338t[i2].mo4320p(i);
            if (p2 > p) {
                p = p2;
            }
        }
        return p;
    }

    /* renamed from: v2 */
    private int m4018v2(int i) {
        int l = this.f3338t[0].mo4316l(i);
        for (int i2 = 1; i2 < this.f3337s; i2++) {
            int l2 = this.f3338t[i2].mo4316l(i);
            if (l2 < l) {
                l = l2;
            }
        }
        return l;
    }

    /* renamed from: w2 */
    private int m4019w2(int i) {
        int p = this.f3338t[0].mo4320p(i);
        for (int i2 = 1; i2 < this.f3337s; i2++) {
            int p2 = this.f3338t[i2].mo4320p(i);
            if (p2 < p) {
                p = p2;
            }
        }
        return p;
    }

    /* renamed from: x2 */
    private C0697f m4020x2(C0724f fVar) {
        int i;
        int i2;
        int i3 = -1;
        if (m3986F2(fVar.f3500e)) {
            i2 = this.f3337s - 1;
            i = -1;
        } else {
            i2 = 0;
            i3 = this.f3337s;
            i = 1;
        }
        C0697f fVar2 = null;
        if (fVar.f3500e == 1) {
            int i4 = Integer.MAX_VALUE;
            int m = this.f3339u.mo4445m();
            while (i2 != i3) {
                C0697f fVar3 = this.f3338t[i2];
                int l = fVar3.mo4316l(m);
                if (l < i4) {
                    fVar2 = fVar3;
                    i4 = l;
                }
                i2 += i;
            }
            return fVar2;
        }
        int i5 = Integer.MIN_VALUE;
        int i6 = this.f3339u.mo4441i();
        while (i2 != i3) {
            C0697f fVar4 = this.f3338t[i2];
            int p = fVar4.mo4320p(i6);
            if (p > i5) {
                fVar2 = fVar4;
                i5 = p;
            }
            i2 += i;
        }
        return fVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* renamed from: y2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4021y2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f3321A
            if (r0 == 0) goto L_0x0009
            int r0 = r6.mo4268s2()
            goto L_0x000d
        L_0x0009:
            int r0 = r6.mo4267r2()
        L_0x000d:
            r1 = 8
            if (r9 != r1) goto L_0x001a
            if (r7 >= r8) goto L_0x0016
            int r2 = r8 + 1
            goto L_0x001c
        L_0x0016:
            int r2 = r7 + 1
            r3 = r8
            goto L_0x001d
        L_0x001a:
            int r2 = r7 + r8
        L_0x001c:
            r3 = r7
        L_0x001d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.f3325E
            r4.mo4284h(r3)
            r4 = 1
            if (r9 == r4) goto L_0x003c
            r5 = 2
            if (r9 == r5) goto L_0x0036
            if (r9 == r1) goto L_0x002b
            goto L_0x0041
        L_0x002b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f3325E
            r9.mo4286k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.f3325E
            r7.mo4285j(r8, r4)
            goto L_0x0041
        L_0x0036:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f3325E
            r9.mo4286k(r7, r8)
            goto L_0x0041
        L_0x003c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f3325E
            r9.mo4285j(r7, r8)
        L_0x0041:
            if (r2 > r0) goto L_0x0044
            return
        L_0x0044:
            boolean r7 = r6.f3321A
            if (r7 == 0) goto L_0x004d
            int r7 = r6.mo4267r2()
            goto L_0x0051
        L_0x004d:
            int r7 = r6.mo4268s2()
        L_0x0051:
            if (r3 > r7) goto L_0x0056
            r6.mo4077A1()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m4021y2(int, int, int):void");
    }

    /* renamed from: A2 */
    public void mo4251A2() {
        this.f3325E.mo4278b();
        mo4077A1();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B2 */
    public boolean mo4252B2() {
        return mo4118d0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: D1 */
    public int mo3359D1(int i, RecyclerView.C0681v vVar, RecyclerView.C0649a0 a0Var) {
        return mo4254N2(i, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: E1 */
    public void mo3360E1(int i) {
        C0695e eVar = this.f3329I;
        if (!(eVar == null || eVar.f3361b == i)) {
            eVar.mo4297b();
        }
        this.f3323C = i;
        this.f3324D = Integer.MIN_VALUE;
        mo4077A1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: F1 */
    public int mo3362F1(int i, RecyclerView.C0681v vVar, RecyclerView.C0649a0 a0Var) {
        return mo4254N2(i, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: G */
    public RecyclerView.C0674p mo3364G() {
        return this.f3341w == 0 ? new C0691c(-2, -1) : new C0691c(-1, -2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G2 */
    public void mo4253G2(int i, RecyclerView.C0649a0 a0Var) {
        int i2;
        int i3;
        if (i > 0) {
            i3 = mo4268s2();
            i2 = 1;
        } else {
            i3 = mo4267r2();
            i2 = -1;
        }
        this.f3343y.f3496a = true;
        m3998W2(i3, a0Var);
        m3993O2(i2);
        C0724f fVar = this.f3343y;
        fVar.f3498c = i3 + fVar.f3499d;
        fVar.f3497b = Math.abs(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: H */
    public RecyclerView.C0674p mo3367H(Context context, AttributeSet attributeSet) {
        return new C0691c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: I */
    public RecyclerView.C0674p mo3370I(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0691c((ViewGroup.MarginLayoutParams) layoutParams) : new C0691c(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: I0 */
    public void mo4090I0(int i) {
        super.mo4090I0(i);
        for (int i2 = 0; i2 < this.f3337s; i2++) {
            this.f3338t[i2].mo4322r(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: J0 */
    public void mo4093J0(int i) {
        super.mo4093J0(i);
        for (int i2 = 0; i2 < this.f3337s; i2++) {
            this.f3338t[i2].mo4322r(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: K1 */
    public void mo3705K1(Rect rect, int i, int i2) {
        int i3;
        int i4;
        int i0 = mo4127i0() + mo4129j0();
        int k0 = mo4131k0() + mo4124h0();
        if (this.f3341w == 1) {
            i4 = RecyclerView.AbstractC0669o.m3736o(i2, rect.height() + k0, mo4121f0());
            i3 = RecyclerView.AbstractC0669o.m3736o(i, (this.f3342x * this.f3337s) + i0, mo4122g0());
        } else {
            i3 = RecyclerView.AbstractC0669o.m3736o(i, rect.width() + i0, mo4122g0());
            i4 = RecyclerView.AbstractC0669o.m3736o(i2, (this.f3342x * this.f3337s) + k0, mo4121f0());
        }
        mo4094J1(i3, i4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N2 */
    public int mo4254N2(int i, RecyclerView.C0681v vVar, RecyclerView.C0649a0 a0Var) {
        if (mo4098M() == 0 || i == 0) {
            return 0;
        }
        mo4253G2(i, a0Var);
        int j2 = m4011j2(vVar, this.f3343y, a0Var);
        if (this.f3343y.f3497b >= j2) {
            i = i < 0 ? -j2 : j2;
        }
        this.f3339u.mo4450r(-i);
        this.f3327G = this.f3321A;
        C0724f fVar = this.f3343y;
        fVar.f3497b = 0;
        m3988I2(vVar, fVar);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: O0 */
    public void mo3733O0(RecyclerView recyclerView, RecyclerView.C0681v vVar) {
        super.mo3733O0(recyclerView, vVar);
        mo4150v1(this.f3336P);
        for (int i = 0; i < this.f3337s; i++) {
            this.f3338t[i].mo4309e();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: P0 */
    public View mo3707P0(View view, int i, RecyclerView.C0681v vVar, RecyclerView.C0649a0 a0Var) {
        View E;
        View m;
        if (mo4098M() == 0 || (E = mo4083E(view)) == null) {
            return null;
        }
        m3992M2();
        int f2 = m4007f2(i);
        if (f2 == Integer.MIN_VALUE) {
            return null;
        }
        C0691c cVar = (C0691c) E.getLayoutParams();
        boolean z = cVar.f3354f;
        C0697f fVar = cVar.f3353e;
        int s2 = f2 == 1 ? mo4268s2() : mo4267r2();
        m3998W2(s2, a0Var);
        m3993O2(f2);
        C0724f fVar2 = this.f3343y;
        fVar2.f3498c = fVar2.f3499d + s2;
        fVar2.f3497b = (int) (((float) this.f3339u.mo4446n()) * 0.33333334f);
        C0724f fVar3 = this.f3343y;
        fVar3.f3503h = true;
        fVar3.f3496a = false;
        m4011j2(vVar, fVar3, a0Var);
        this.f3327G = this.f3321A;
        if (!(z || (m = fVar.mo4317m(s2, f2)) == null || m == E)) {
            return m;
        }
        if (m3986F2(f2)) {
            for (int i2 = this.f3337s - 1; i2 >= 0; i2--) {
                View m2 = this.f3338t[i2].mo4317m(s2, f2);
                if (!(m2 == null || m2 == E)) {
                    return m2;
                }
            }
        } else {
            for (int i3 = 0; i3 < this.f3337s; i3++) {
                View m3 = this.f3338t[i3].mo4317m(s2, f2);
                if (!(m3 == null || m3 == E)) {
                    return m3;
                }
            }
        }
        boolean z2 = (this.f3344z ^ true) == (f2 == -1);
        if (!z) {
            View F = mo3728F(z2 ? fVar.mo4310f() : fVar.mo4311g());
            if (!(F == null || F == E)) {
                return F;
            }
        }
        if (m3986F2(f2)) {
            for (int i4 = this.f3337s - 1; i4 >= 0; i4--) {
                if (i4 != fVar.f3375e) {
                    C0697f[] fVarArr = this.f3338t;
                    View F2 = mo3728F(z2 ? fVarArr[i4].mo4310f() : fVarArr[i4].mo4311g());
                    if (!(F2 == null || F2 == E)) {
                        return F2;
                    }
                }
            }
        } else {
            for (int i5 = 0; i5 < this.f3337s; i5++) {
                C0697f[] fVarArr2 = this.f3338t;
                View F3 = mo3728F(z2 ? fVarArr2[i5].mo4310f() : fVarArr2[i5].mo4311g());
                if (!(F3 == null || F3 == E)) {
                    return F3;
                }
            }
        }
        return null;
    }

    /* renamed from: P2 */
    public void mo4255P2(int i) {
        if (i == 0 || i == 1) {
            mo3743g(null);
            if (i != this.f3341w) {
                this.f3341w = i;
                AbstractC0729j jVar = this.f3339u;
                this.f3339u = this.f3340v;
                this.f3340v = jVar;
                mo4077A1();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: Q0 */
    public void mo3735Q0(AccessibilityEvent accessibilityEvent) {
        super.mo3735Q0(accessibilityEvent);
        if (mo4098M() > 0) {
            View m2 = mo4265m2(false);
            View l2 = mo4264l2(false);
            if (m2 != null && l2 != null) {
                int l0 = mo4133l0(m2);
                int l02 = mo4133l0(l2);
                if (l0 < l02) {
                    accessibilityEvent.setFromIndex(l0);
                    accessibilityEvent.setToIndex(l02);
                    return;
                }
                accessibilityEvent.setFromIndex(l02);
                accessibilityEvent.setToIndex(l0);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: Q1 */
    public void mo3385Q1(RecyclerView recyclerView, RecyclerView.C0649a0 a0Var, int i) {
        C0725g gVar = new C0725g(recyclerView.getContext());
        gVar.mo4244p(i);
        mo3389R1(gVar);
    }

    /* renamed from: Q2 */
    public void mo4256Q2(boolean z) {
        mo3743g(null);
        C0695e eVar = this.f3329I;
        if (!(eVar == null || eVar.f3368i == z)) {
            eVar.f3368i = z;
        }
        this.f3344z = z;
        mo4077A1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: R */
    public int mo3388R(RecyclerView.C0681v vVar, RecyclerView.C0649a0 a0Var) {
        return this.f3341w == 1 ? this.f3337s : super.mo3388R(vVar, a0Var);
    }

    /* renamed from: R2 */
    public void mo4257R2(int i) {
        mo3743g(null);
        if (i != this.f3337s) {
            mo4251A2();
            this.f3337s = i;
            this.f3322B = new BitSet(this.f3337s);
            this.f3338t = new C0697f[this.f3337s];
            for (int i2 = 0; i2 < this.f3337s; i2++) {
                this.f3338t[i2] = new C0697f(i2);
            }
            mo4077A1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: T1 */
    public boolean mo3397T1() {
        return this.f3329I == null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U2 */
    public boolean mo4258U2(RecyclerView.C0649a0 a0Var, C0690b bVar) {
        int i;
        int i2;
        int i3;
        boolean z = false;
        if (!a0Var.mo3950h() && (i = this.f3323C) != -1) {
            if (i < 0 || i >= a0Var.mo3945c()) {
                this.f3323C = -1;
                this.f3324D = Integer.MIN_VALUE;
            } else {
                C0695e eVar = this.f3329I;
                if (eVar == null || eVar.f3361b == -1 || eVar.f3363d < 1) {
                    View F = mo3728F(this.f3323C);
                    if (F != null) {
                        bVar.f3346a = this.f3321A ? mo4268s2() : mo4267r2();
                        if (this.f3324D != Integer.MIN_VALUE) {
                            if (bVar.f3348c) {
                                i3 = this.f3339u.mo4441i() - this.f3324D;
                                i2 = this.f3339u.mo4436d(F);
                            } else {
                                i3 = this.f3339u.mo4445m() + this.f3324D;
                                i2 = this.f3339u.mo4439g(F);
                            }
                            bVar.f3347b = i3 - i2;
                            return true;
                        } else if (this.f3339u.mo4437e(F) > this.f3339u.mo4446n()) {
                            bVar.f3347b = bVar.f3348c ? this.f3339u.mo4441i() : this.f3339u.mo4445m();
                            return true;
                        } else {
                            int g = this.f3339u.mo4439g(F) - this.f3339u.mo4445m();
                            if (g < 0) {
                                bVar.f3347b = -g;
                                return true;
                            }
                            int i4 = this.f3339u.mo4441i() - this.f3339u.mo4436d(F);
                            if (i4 < 0) {
                                bVar.f3347b = i4;
                                return true;
                            }
                            bVar.f3347b = Integer.MIN_VALUE;
                        }
                    } else {
                        int i5 = this.f3323C;
                        bVar.f3346a = i5;
                        int i6 = this.f3324D;
                        if (i6 == Integer.MIN_VALUE) {
                            if (m4001Z1(i5) == 1) {
                                z = true;
                            }
                            bVar.f3348c = z;
                            bVar.mo4271a();
                        } else {
                            bVar.mo4272b(i6);
                        }
                        bVar.f3349d = true;
                    }
                } else {
                    bVar.f3347b = Integer.MIN_VALUE;
                    bVar.f3346a = this.f3323C;
                }
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: V0 */
    public void mo3403V0(RecyclerView.C0681v vVar, RecyclerView.C0649a0 a0Var, View view, C0979c cVar) {
        int i;
        int i2;
        int i3;
        int i4;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0691c)) {
            super.mo4108U0(view, cVar);
            return;
        }
        C0691c cVar2 = (C0691c) layoutParams;
        if (this.f3341w == 0) {
            i4 = cVar2.mo4275g();
            i3 = cVar2.f3354f ? this.f3337s : 1;
            i2 = -1;
            i = -1;
        } else {
            i4 = -1;
            i3 = -1;
            i2 = cVar2.mo4275g();
            i = cVar2.f3354f ? this.f3337s : 1;
        }
        cVar.mo5476d0(C0979c.C0982c.m5656a(i4, i3, i2, i, false, false));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V2 */
    public void mo4259V2(RecyclerView.C0649a0 a0Var, C0690b bVar) {
        if (!mo4258U2(a0Var, bVar) && !m3995T2(a0Var, bVar)) {
            bVar.mo4271a();
            bVar.f3346a = 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W1 */
    public boolean mo4260W1() {
        int l = this.f3338t[0].mo4316l(Integer.MIN_VALUE);
        for (int i = 1; i < this.f3337s; i++) {
            if (this.f3338t[i].mo4316l(Integer.MIN_VALUE) != l) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: X0 */
    public void mo3411X0(RecyclerView recyclerView, int i, int i2) {
        m4021y2(i, i2, 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X1 */
    public boolean mo4261X1() {
        int p = this.f3338t[0].mo4320p(Integer.MIN_VALUE);
        for (int i = 1; i < this.f3337s; i++) {
            if (this.f3338t[i].mo4320p(Integer.MIN_VALUE) != p) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X2 */
    public void mo4262X2(int i) {
        this.f3342x = i / this.f3337s;
        this.f3330J = View.MeasureSpec.makeMeasureSpec(i, this.f3340v.mo4443k());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: Y0 */
    public void mo3414Y0(RecyclerView recyclerView) {
        this.f3325E.mo4278b();
        mo4077A1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: Z0 */
    public void mo3417Z0(RecyclerView recyclerView, int i, int i2, int i3) {
        m4021y2(i, i2, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0686z.AbstractC0688b
    /* renamed from: a */
    public PointF mo3738a(int i) {
        int Z1 = m4001Z1(i);
        PointF pointF = new PointF();
        if (Z1 == 0) {
            return null;
        }
        if (this.f3341w == 0) {
            pointF.x = (float) Z1;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) Z1;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: a1 */
    public void mo3421a1(RecyclerView recyclerView, int i, int i2) {
        m4021y2(i, i2, 2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a2 */
    public boolean mo4263a2() {
        int i;
        int i2;
        if (mo4098M() == 0 || this.f3326F == 0 || !mo4151w0()) {
            return false;
        }
        if (this.f3321A) {
            i2 = mo4268s2();
            i = mo4267r2();
        } else {
            i2 = mo4267r2();
            i = mo4268s2();
        }
        if (i2 == 0 && mo4269z2() != null) {
            this.f3325E.mo4278b();
        } else if (!this.f3333M) {
            return false;
        } else {
            int i3 = this.f3321A ? -1 : 1;
            int i4 = i + 1;
            C0692d.C0693a e = this.f3325E.mo4281e(i2, i4, i3, true);
            if (e == null) {
                this.f3333M = false;
                this.f3325E.mo4280d(i4);
                return false;
            }
            C0692d.C0693a e2 = this.f3325E.mo4281e(i2, e.f3357b, i3 * -1, true);
            if (e2 == null) {
                this.f3325E.mo4280d(e.f3357b);
            } else {
                this.f3325E.mo4280d(e2.f3357b + 1);
            }
        }
        mo4078B1();
        mo4077A1();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: c1 */
    public void mo3709c1(RecyclerView recyclerView, int i, int i2, Object obj) {
        m4021y2(i, i2, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: d1 */
    public void mo3430d1(RecyclerView.C0681v vVar, RecyclerView.C0649a0 a0Var) {
        m3985E2(vVar, a0Var, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: e1 */
    public void mo3433e1(RecyclerView.C0649a0 a0Var) {
        super.mo3433e1(a0Var);
        this.f3323C = -1;
        this.f3324D = Integer.MIN_VALUE;
        this.f3329I = null;
        this.f3332L.mo4273c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: g */
    public void mo3743g(String str) {
        if (this.f3329I == null) {
            super.mo3743g(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: i1 */
    public void mo3445i1(Parcelable parcelable) {
        if (parcelable instanceof C0695e) {
            this.f3329I = (C0695e) parcelable;
            mo4077A1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: j1 */
    public Parcelable mo3447j1() {
        int i;
        int i2;
        int[] iArr;
        if (this.f3329I != null) {
            return new C0695e(this.f3329I);
        }
        C0695e eVar = new C0695e();
        eVar.f3368i = this.f3344z;
        eVar.f3369j = this.f3327G;
        eVar.f3370k = this.f3328H;
        C0692d dVar = this.f3325E;
        if (dVar == null || (iArr = dVar.f3355a) == null) {
            eVar.f3365f = 0;
        } else {
            eVar.f3366g = iArr;
            eVar.f3365f = iArr.length;
            eVar.f3367h = dVar.f3356b;
        }
        if (mo4098M() > 0) {
            eVar.f3361b = this.f3327G ? mo4268s2() : mo4267r2();
            eVar.f3362c = mo4266n2();
            int i3 = this.f3337s;
            eVar.f3363d = i3;
            eVar.f3364e = new int[i3];
            for (int i4 = 0; i4 < this.f3337s; i4++) {
                if (this.f3327G) {
                    i = this.f3338t[i4].mo4316l(Integer.MIN_VALUE);
                    if (i != Integer.MIN_VALUE) {
                        i2 = this.f3339u.mo4441i();
                    } else {
                        eVar.f3364e[i4] = i;
                    }
                } else {
                    i = this.f3338t[i4].mo4320p(Integer.MIN_VALUE);
                    if (i != Integer.MIN_VALUE) {
                        i2 = this.f3339u.mo4445m();
                    } else {
                        eVar.f3364e[i4] = i;
                    }
                }
                i -= i2;
                eVar.f3364e[i4] = i;
            }
        } else {
            eVar.f3361b = -1;
            eVar.f3362c = -1;
            eVar.f3363d = 0;
        }
        return eVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: k1 */
    public void mo4132k1(int i) {
        if (i == 0) {
            mo4263a2();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: l */
    public boolean mo3451l() {
        return this.f3341w == 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l2 */
    public View mo4264l2(boolean z) {
        int m = this.f3339u.mo4445m();
        int i = this.f3339u.mo4441i();
        View view = null;
        for (int M = mo4098M() - 1; M >= 0; M--) {
            View L = mo4096L(M);
            int g = this.f3339u.mo4439g(L);
            int d = this.f3339u.mo4436d(L);
            if (d > m && g < i) {
                if (d <= i || !z) {
                    return L;
                }
                if (view == null) {
                    view = L;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: m */
    public boolean mo3454m() {
        return this.f3341w == 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m2 */
    public View mo4265m2(boolean z) {
        int m = this.f3339u.mo4445m();
        int i = this.f3339u.mo4441i();
        int M = mo4098M();
        View view = null;
        for (int i2 = 0; i2 < M; i2++) {
            View L = mo4096L(i2);
            int g = this.f3339u.mo4439g(L);
            if (this.f3339u.mo4436d(L) > m && g < i) {
                if (g >= m || !z) {
                    return L;
                }
                if (view == null) {
                    view = L;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: n */
    public boolean mo3713n(RecyclerView.C0674p pVar) {
        return pVar instanceof C0691c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n2 */
    public int mo4266n2() {
        View l2 = this.f3321A ? mo4264l2(true) : mo4265m2(true);
        if (l2 == null) {
            return -1;
        }
        return mo4133l0(l2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: o0 */
    public int mo3459o0(RecyclerView.C0681v vVar, RecyclerView.C0649a0 a0Var) {
        return this.f3341w == 0 ? this.f3337s : super.mo3459o0(vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: p */
    public void mo3462p(int i, int i2, RecyclerView.C0649a0 a0Var, RecyclerView.AbstractC0669o.AbstractC0672c cVar) {
        int i3;
        int i4;
        if (this.f3341w != 0) {
            i = i2;
        }
        if (!(mo4098M() == 0 || i == 0)) {
            mo4253G2(i, a0Var);
            int[] iArr = this.f3335O;
            if (iArr == null || iArr.length < this.f3337s) {
                this.f3335O = new int[this.f3337s];
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.f3337s; i6++) {
                C0724f fVar = this.f3343y;
                if (fVar.f3499d == -1) {
                    i4 = fVar.f3501f;
                    i3 = this.f3338t[i6].mo4320p(i4);
                } else {
                    i4 = this.f3338t[i6].mo4316l(fVar.f3502g);
                    i3 = this.f3343y.f3502g;
                }
                int i7 = i4 - i3;
                if (i7 >= 0) {
                    this.f3335O[i5] = i7;
                    i5++;
                }
            }
            Arrays.sort(this.f3335O, 0, i5);
            for (int i8 = 0; i8 < i5 && this.f3343y.mo4420a(a0Var); i8++) {
                cVar.mo4164a(this.f3343y.f3498c, this.f3335O[i8]);
                C0724f fVar2 = this.f3343y;
                fVar2.f3498c += fVar2.f3499d;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: r */
    public int mo3749r(RecyclerView.C0649a0 a0Var) {
        return m4004c2(a0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r2 */
    public int mo4267r2() {
        if (mo4098M() == 0) {
            return 0;
        }
        return mo4133l0(mo4096L(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: s */
    public int mo3715s(RecyclerView.C0649a0 a0Var) {
        return m4005d2(a0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s2 */
    public int mo4268s2() {
        int M = mo4098M();
        if (M == 0) {
            return 0;
        }
        return mo4133l0(mo4096L(M - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: t */
    public int mo3716t(RecyclerView.C0649a0 a0Var) {
        return m4006e2(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: u */
    public int mo3750u(RecyclerView.C0649a0 a0Var) {
        return m4004c2(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: v */
    public int mo3717v(RecyclerView.C0649a0 a0Var) {
        return m4005d2(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: w */
    public int mo3718w(RecyclerView.C0649a0 a0Var) {
        return m4006e2(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0669o
    /* renamed from: x0 */
    public boolean mo3752x0() {
        return this.f3326F != 0;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0086, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008a, code lost:
        r10 = false;
     */
    /* renamed from: z2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo4269z2() {
        /*
        // Method dump skipped, instructions count: 173
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo4269z2():android.view.View");
    }
}
