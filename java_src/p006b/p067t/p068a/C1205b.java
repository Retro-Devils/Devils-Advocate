package p006b.p067t.p068a;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.core.content.C0378a;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p006b.p030g.p039k.AbstractC1010p;
import p006b.p030g.p039k.C0962a;
import p006b.p030g.p039k.C0964a0;
import p006b.p030g.p039k.C1013s;
import p006b.p030g.p039k.p040b0.C0979c;
import p006b.p043i.p044a.AbstractC1041a;

/* renamed from: b.t.a.b */
public class C1205b extends ViewGroup {

    /* renamed from: b */
    static final int[] f5326b = {16842931};

    /* renamed from: c */
    private static final Comparator<C1211f> f5327c = new C1206a();

    /* renamed from: d */
    private static final Interpolator f5328d = new animationInterpolatorC1207b();

    /* renamed from: e */
    private static final C1220n f5329e = new C1220n();

    /* renamed from: A */
    private boolean f5330A;

    /* renamed from: B */
    private boolean f5331B;

    /* renamed from: C */
    private int f5332C = 1;

    /* renamed from: D */
    private boolean f5333D;

    /* renamed from: E */
    private boolean f5334E;

    /* renamed from: F */
    private int f5335F;

    /* renamed from: G */
    private int f5336G;

    /* renamed from: H */
    private int f5337H;

    /* renamed from: I */
    private float f5338I;

    /* renamed from: J */
    private float f5339J;

    /* renamed from: K */
    private float f5340K;

    /* renamed from: L */
    private float f5341L;

    /* renamed from: M */
    private int f5342M = -1;

    /* renamed from: N */
    private VelocityTracker f5343N;

    /* renamed from: O */
    private int f5344O;

    /* renamed from: P */
    private int f5345P;

    /* renamed from: Q */
    private int f5346Q;

    /* renamed from: R */
    private int f5347R;

    /* renamed from: S */
    private boolean f5348S;

    /* renamed from: T */
    private EdgeEffect f5349T;

    /* renamed from: U */
    private EdgeEffect f5350U;

    /* renamed from: V */
    private boolean f5351V = true;

    /* renamed from: W */
    private boolean f5352W = false;

    /* renamed from: a0 */
    private boolean f5353a0;

    /* renamed from: b0 */
    private int f5354b0;

    /* renamed from: c0 */
    private List<AbstractC1215j> f5355c0;

    /* renamed from: d0 */
    private AbstractC1215j f5356d0;

    /* renamed from: e0 */
    private AbstractC1215j f5357e0;

    /* renamed from: f */
    private int f5358f;

    /* renamed from: f0 */
    private List<AbstractC1214i> f5359f0;

    /* renamed from: g */
    private final ArrayList<C1211f> f5360g = new ArrayList<>();

    /* renamed from: g0 */
    private AbstractC1216k f5361g0;

    /* renamed from: h */
    private final C1211f f5362h = new C1211f();

    /* renamed from: h0 */
    private int f5363h0;

    /* renamed from: i */
    private final Rect f5364i = new Rect();

    /* renamed from: i0 */
    private int f5365i0;

    /* renamed from: j */
    AbstractC1204a f5366j;

    /* renamed from: j0 */
    private ArrayList<View> f5367j0;

    /* renamed from: k */
    int f5368k;

    /* renamed from: k0 */
    private final Runnable f5369k0 = new RunnableC1208c();

    /* renamed from: l */
    private int f5370l = -1;

    /* renamed from: l0 */
    private int f5371l0 = 0;

    /* renamed from: m */
    private Parcelable f5372m = null;

    /* renamed from: n */
    private ClassLoader f5373n = null;

    /* renamed from: o */
    private Scroller f5374o;

    /* renamed from: p */
    private boolean f5375p;

    /* renamed from: q */
    private C1217l f5376q;

    /* renamed from: r */
    private int f5377r;

    /* renamed from: s */
    private Drawable f5378s;

    /* renamed from: t */
    private int f5379t;

    /* renamed from: u */
    private int f5380u;

    /* renamed from: v */
    private float f5381v = -3.4028235E38f;

    /* renamed from: w */
    private float f5382w = Float.MAX_VALUE;

    /* renamed from: x */
    private int f5383x;

    /* renamed from: y */
    private int f5384y;

    /* renamed from: z */
    private boolean f5385z;

    /* renamed from: b.t.a.b$a */
    static class C1206a implements Comparator<C1211f> {
        C1206a() {
        }

        /* renamed from: a */
        public int compare(C1211f fVar, C1211f fVar2) {
            return fVar.f5390b - fVar2.f5390b;
        }
    }

    /* renamed from: b.t.a.b$b  reason: invalid class name */
    static class animationInterpolatorC1207b implements Interpolator {
        animationInterpolatorC1207b() {
        }

        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: b.t.a.b$c */
    class RunnableC1208c implements Runnable {
        RunnableC1208c() {
        }

        public void run() {
            C1205b.this.setScrollState(0);
            C1205b.this.mo6070D();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.t.a.b$d */
    public class C1209d implements AbstractC1010p {

        /* renamed from: a */
        private final Rect f5387a = new Rect();

        C1209d() {
        }

        @Override // p006b.p030g.p039k.AbstractC1010p
        /* renamed from: a */
        public C0964a0 mo340a(View view, C0964a0 a0Var) {
            C0964a0 V = C1013s.m5744V(view, a0Var);
            if (V.mo5423m()) {
                return V;
            }
            Rect rect = this.f5387a;
            rect.left = V.mo5416f();
            rect.top = V.mo5418h();
            rect.right = V.mo5417g();
            rect.bottom = V.mo5414e();
            int childCount = C1205b.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                C0964a0 g = C1013s.m5761g(C1205b.this.getChildAt(i), V);
                rect.left = Math.min(g.mo5416f(), rect.left);
                rect.top = Math.min(g.mo5418h(), rect.top);
                rect.right = Math.min(g.mo5417g(), rect.right);
                rect.bottom = Math.min(g.mo5414e(), rect.bottom);
            }
            return V.mo5424n(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: b.t.a.b$e */
    public @interface AbstractC1210e {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.t.a.b$f */
    public static class C1211f {

        /* renamed from: a */
        Object f5389a;

        /* renamed from: b */
        int f5390b;

        /* renamed from: c */
        boolean f5391c;

        /* renamed from: d */
        float f5392d;

        /* renamed from: e */
        float f5393e;

        C1211f() {
        }
    }

    /* renamed from: b.t.a.b$g */
    public static class C1212g extends ViewGroup.LayoutParams {

        /* renamed from: a */
        public boolean f5394a;

        /* renamed from: b */
        public int f5395b;

        /* renamed from: c */
        float f5396c = 0.0f;

        /* renamed from: d */
        boolean f5397d;

        /* renamed from: e */
        int f5398e;

        /* renamed from: f */
        int f5399f;

        public C1212g() {
            super(-1, -1);
        }

        public C1212g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1205b.f5326b);
            this.f5395b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.t.a.b$h */
    public class C1213h extends C0962a {
        C1213h() {
        }

        /* renamed from: n */
        private boolean m6561n() {
            AbstractC1204a aVar = C1205b.this.f5366j;
            return aVar != null && aVar.mo6058c() > 1;
        }

        @Override // p006b.p030g.p039k.C0962a
        /* renamed from: f */
        public void mo2361f(View view, AccessibilityEvent accessibilityEvent) {
            AbstractC1204a aVar;
            super.mo2361f(view, accessibilityEvent);
            accessibilityEvent.setClassName(C1205b.class.getName());
            accessibilityEvent.setScrollable(m6561n());
            if (accessibilityEvent.getEventType() == 4096 && (aVar = C1205b.this.f5366j) != null) {
                accessibilityEvent.setItemCount(aVar.mo6058c());
                accessibilityEvent.setFromIndex(C1205b.this.f5368k);
                accessibilityEvent.setToIndex(C1205b.this.f5368k);
            }
        }

        @Override // p006b.p030g.p039k.C0962a
        /* renamed from: g */
        public void mo2362g(View view, C0979c cVar) {
            super.mo2362g(view, cVar);
            cVar.mo5470a0(C1205b.class.getName());
            cVar.mo5503t0(m6561n());
            if (C1205b.this.canScrollHorizontally(1)) {
                cVar.mo5469a(4096);
            }
            if (C1205b.this.canScrollHorizontally(-1)) {
                cVar.mo5469a(8192);
            }
        }

        @Override // p006b.p030g.p039k.C0962a
        /* renamed from: j */
        public boolean mo2363j(View view, int i, Bundle bundle) {
            C1205b bVar;
            int i2;
            if (super.mo2363j(view, i, bundle)) {
                return true;
            }
            if (i != 4096) {
                if (i != 8192 || !C1205b.this.canScrollHorizontally(-1)) {
                    return false;
                }
                bVar = C1205b.this;
                i2 = bVar.f5368k - 1;
            } else if (!C1205b.this.canScrollHorizontally(1)) {
                return false;
            } else {
                bVar = C1205b.this;
                i2 = bVar.f5368k + 1;
            }
            bVar.setCurrentItem(i2);
            return true;
        }
    }

    /* renamed from: b.t.a.b$i */
    public interface AbstractC1214i {
        /* renamed from: a */
        void mo6132a(C1205b bVar, AbstractC1204a aVar, AbstractC1204a aVar2);
    }

    /* renamed from: b.t.a.b$j */
    public interface AbstractC1215j {
        /* renamed from: a */
        void mo6133a(int i, float f, int i2);

        /* renamed from: b */
        void mo6134b(int i);

        /* renamed from: c */
        void mo6135c(int i);
    }

    /* renamed from: b.t.a.b$k */
    public interface AbstractC1216k {
        /* renamed from: a */
        void mo6136a(View view, float f);
    }

    /* renamed from: b.t.a.b$l */
    private class C1217l extends DataSetObserver {
        C1217l() {
        }

        public void onChanged() {
            C1205b.this.mo6090g();
        }

        public void onInvalidated() {
            C1205b.this.mo6090g();
        }
    }

    /* renamed from: b.t.a.b$m */
    public static class C1218m extends AbstractC1041a {
        public static final Parcelable.Creator<C1218m> CREATOR = new C1219a();

        /* renamed from: d */
        int f5402d;

        /* renamed from: e */
        Parcelable f5403e;

        /* renamed from: f */
        ClassLoader f5404f;

        /* renamed from: b.t.a.b$m$a */
        static class C1219a implements Parcelable.ClassLoaderCreator<C1218m> {
            C1219a() {
            }

            /* renamed from: a */
            public C1218m createFromParcel(Parcel parcel) {
                return new C1218m(parcel, null);
            }

            /* renamed from: b */
            public C1218m createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C1218m(parcel, classLoader);
            }

            /* renamed from: c */
            public C1218m[] newArray(int i) {
                return new C1218m[i];
            }
        }

        C1218m(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? C1218m.class.getClassLoader() : classLoader;
            this.f5402d = parcel.readInt();
            this.f5403e = parcel.readParcelable(classLoader);
            this.f5404f = classLoader;
        }

        public C1218m(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f5402d + "}";
        }

        @Override // p006b.p043i.p044a.AbstractC1041a
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f5402d);
            parcel.writeParcelable(this.f5403e, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.t.a.b$n */
    public static class C1220n implements Comparator<View> {
        C1220n() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            C1212g gVar = (C1212g) view.getLayoutParams();
            C1212g gVar2 = (C1212g) view2.getLayoutParams();
            boolean z = gVar.f5394a;
            return z != gVar2.f5394a ? z ? 1 : -1 : gVar.f5398e - gVar2.f5398e;
        }
    }

    public C1205b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo6124u();
    }

    /* renamed from: B */
    private boolean m6518B(int i) {
        if (this.f5360g.size() != 0) {
            C1211f s = m6535s();
            int clientWidth = getClientWidth();
            int i2 = this.f5377r;
            int i3 = clientWidth + i2;
            float f = (float) clientWidth;
            int i4 = s.f5390b;
            float f2 = ((((float) i) / f) - s.f5393e) / (s.f5392d + (((float) i2) / f));
            this.f5353a0 = false;
            mo6126x(i4, f2, (int) (((float) i3) * f2));
            if (this.f5353a0) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.f5351V) {
            return false;
        } else {
            this.f5353a0 = false;
            mo6126x(0, 0.0f, 0);
            if (this.f5353a0) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    /* renamed from: C */
    private boolean m6519C(float f) {
        boolean z;
        boolean z2;
        float f2 = this.f5338I - f;
        this.f5338I = f;
        float scrollX = ((float) getScrollX()) + f2;
        float clientWidth = (float) getClientWidth();
        float f3 = this.f5381v * clientWidth;
        float f4 = this.f5382w * clientWidth;
        boolean z3 = false;
        C1211f fVar = this.f5360g.get(0);
        ArrayList<C1211f> arrayList = this.f5360g;
        C1211f fVar2 = arrayList.get(arrayList.size() - 1);
        if (fVar.f5390b != 0) {
            f3 = fVar.f5393e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (fVar2.f5390b != this.f5366j.mo6058c() - 1) {
            f4 = fVar2.f5393e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.f5349T.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.f5350U.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.f5338I += scrollX - ((float) i);
        scrollTo(i, getScrollY());
        m6518B(i);
        return z3;
    }

    /* renamed from: F */
    private void m6520F(int i, int i2, int i3, int i4) {
        int min;
        if (i2 <= 0 || this.f5360g.isEmpty()) {
            C1211f t = mo6123t(this.f5368k);
            min = (int) ((t != null ? Math.min(t.f5393e, this.f5382w) : 0.0f) * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                m6527f(false);
            } else {
                return;
            }
        } else if (!this.f5374o.isFinished()) {
            this.f5374o.setFinalX(getCurrentItem() * getClientWidth());
            return;
        } else {
            min = (int) ((((float) getScrollX()) / ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))) * ((float) (((i - getPaddingLeft()) - getPaddingRight()) + i3)));
        }
        scrollTo(min, getScrollY());
    }

    /* renamed from: G */
    private void m6521G() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((C1212g) getChildAt(i).getLayoutParams()).f5394a) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    /* renamed from: H */
    private void m6522H(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* renamed from: I */
    private boolean m6523I() {
        this.f5342M = -1;
        m6533n();
        this.f5349T.onRelease();
        this.f5350U.onRelease();
        return this.f5349T.isFinished() || this.f5350U.isFinished();
    }

    /* renamed from: J */
    private void m6524J(int i, boolean z, int i2, boolean z2) {
        C1211f t = mo6123t(i);
        int clientWidth = t != null ? (int) (((float) getClientWidth()) * Math.max(this.f5381v, Math.min(t.f5393e, this.f5382w))) : 0;
        if (z) {
            mo6075N(clientWidth, 0, i2);
            if (z2) {
                m6530j(i);
                return;
            }
            return;
        }
        if (z2) {
            m6530j(i);
        }
        m6527f(false);
        scrollTo(clientWidth, 0);
        m6518B(clientWidth);
    }

    /* renamed from: O */
    private void m6525O() {
        if (this.f5365i0 != 0) {
            ArrayList<View> arrayList = this.f5367j0;
            if (arrayList == null) {
                this.f5367j0 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f5367j0.add(getChildAt(i));
            }
            Collections.sort(this.f5367j0, f5329e);
        }
    }

    /* renamed from: d */
    private void m6526d(C1211f fVar, int i, C1211f fVar2) {
        int i2;
        int i3;
        C1211f fVar3;
        C1211f fVar4;
        int c = this.f5366j.mo6058c();
        int clientWidth = getClientWidth();
        float f = clientWidth > 0 ? ((float) this.f5377r) / ((float) clientWidth) : 0.0f;
        if (fVar2 != null) {
            int i4 = fVar2.f5390b;
            int i5 = fVar.f5390b;
            if (i4 < i5) {
                float f2 = fVar2.f5393e + fVar2.f5392d + f;
                int i6 = i4 + 1;
                int i7 = 0;
                while (i6 <= fVar.f5390b && i7 < this.f5360g.size()) {
                    while (true) {
                        fVar4 = this.f5360g.get(i7);
                        if (i6 > fVar4.f5390b && i7 < this.f5360g.size() - 1) {
                            i7++;
                        }
                    }
                    while (i6 < fVar4.f5390b) {
                        f2 += this.f5366j.mo6060e(i6) + f;
                        i6++;
                    }
                    fVar4.f5393e = f2;
                    f2 += fVar4.f5392d + f;
                    i6++;
                }
            } else if (i4 > i5) {
                int size = this.f5360g.size() - 1;
                float f3 = fVar2.f5393e;
                while (true) {
                    i4--;
                    if (i4 < fVar.f5390b || size < 0) {
                        break;
                    }
                    while (true) {
                        fVar3 = this.f5360g.get(size);
                        if (i4 < fVar3.f5390b && size > 0) {
                            size--;
                        }
                    }
                    while (i4 > fVar3.f5390b) {
                        f3 -= this.f5366j.mo6060e(i4) + f;
                        i4--;
                    }
                    f3 -= fVar3.f5392d + f;
                    fVar3.f5393e = f3;
                }
            }
        }
        int size2 = this.f5360g.size();
        float f4 = fVar.f5393e;
        int i8 = fVar.f5390b;
        int i9 = i8 - 1;
        this.f5381v = i8 == 0 ? f4 : -3.4028235E38f;
        int i10 = c - 1;
        this.f5382w = i8 == i10 ? (fVar.f5392d + f4) - 1.0f : Float.MAX_VALUE;
        int i11 = i - 1;
        while (i11 >= 0) {
            C1211f fVar5 = this.f5360g.get(i11);
            while (true) {
                i3 = fVar5.f5390b;
                if (i9 <= i3) {
                    break;
                }
                f4 -= this.f5366j.mo6060e(i9) + f;
                i9--;
            }
            f4 -= fVar5.f5392d + f;
            fVar5.f5393e = f4;
            if (i3 == 0) {
                this.f5381v = f4;
            }
            i11--;
            i9--;
        }
        float f5 = fVar.f5393e + fVar.f5392d + f;
        int i12 = fVar.f5390b + 1;
        int i13 = i + 1;
        while (i13 < size2) {
            C1211f fVar6 = this.f5360g.get(i13);
            while (true) {
                i2 = fVar6.f5390b;
                if (i12 >= i2) {
                    break;
                }
                f5 += this.f5366j.mo6060e(i12) + f;
                i12++;
            }
            if (i2 == i10) {
                this.f5382w = (fVar6.f5392d + f5) - 1.0f;
            }
            fVar6.f5393e = f5;
            f5 += fVar6.f5392d + f;
            i13++;
            i12++;
        }
        this.f5352W = false;
    }

    /* renamed from: f */
    private void m6527f(boolean z) {
        boolean z2 = this.f5371l0 == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.f5374o.isFinished()) {
                this.f5374o.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f5374o.getCurrX();
                int currY = this.f5374o.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m6518B(currX);
                    }
                }
            }
        }
        this.f5331B = false;
        for (int i = 0; i < this.f5360g.size(); i++) {
            C1211f fVar = this.f5360g.get(i);
            if (fVar.f5391c) {
                fVar.f5391c = false;
                z2 = true;
            }
        }
        if (!z2) {
            return;
        }
        if (z) {
            C1013s.m5750a0(this, this.f5369k0);
        } else {
            this.f5369k0.run();
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* renamed from: h */
    private int m6528h(int i, float f, int i2, int i3) {
        if (Math.abs(i3) <= this.f5346Q || Math.abs(i2) <= this.f5344O) {
            i += (int) (f + (i >= this.f5368k ? 0.4f : 0.6f));
        } else if (i2 <= 0) {
            i++;
        }
        if (this.f5360g.size() <= 0) {
            return i;
        }
        ArrayList<C1211f> arrayList = this.f5360g;
        return Math.max(this.f5360g.get(0).f5390b, Math.min(i, arrayList.get(arrayList.size() - 1).f5390b));
    }

    /* renamed from: i */
    private void m6529i(int i, float f, int i2) {
        AbstractC1215j jVar = this.f5356d0;
        if (jVar != null) {
            jVar.mo6133a(i, f, i2);
        }
        List<AbstractC1215j> list = this.f5355c0;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                AbstractC1215j jVar2 = this.f5355c0.get(i3);
                if (jVar2 != null) {
                    jVar2.mo6133a(i, f, i2);
                }
            }
        }
        AbstractC1215j jVar3 = this.f5357e0;
        if (jVar3 != null) {
            jVar3.mo6133a(i, f, i2);
        }
    }

    /* renamed from: j */
    private void m6530j(int i) {
        AbstractC1215j jVar = this.f5356d0;
        if (jVar != null) {
            jVar.mo6135c(i);
        }
        List<AbstractC1215j> list = this.f5355c0;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                AbstractC1215j jVar2 = this.f5355c0.get(i2);
                if (jVar2 != null) {
                    jVar2.mo6135c(i);
                }
            }
        }
        AbstractC1215j jVar3 = this.f5357e0;
        if (jVar3 != null) {
            jVar3.mo6135c(i);
        }
    }

    /* renamed from: k */
    private void m6531k(int i) {
        AbstractC1215j jVar = this.f5356d0;
        if (jVar != null) {
            jVar.mo6134b(i);
        }
        List<AbstractC1215j> list = this.f5355c0;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                AbstractC1215j jVar2 = this.f5355c0.get(i2);
                if (jVar2 != null) {
                    jVar2.mo6134b(i);
                }
            }
        }
        AbstractC1215j jVar3 = this.f5357e0;
        if (jVar3 != null) {
            jVar3.mo6134b(i);
        }
    }

    /* renamed from: m */
    private void m6532m(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setLayerType(z ? this.f5363h0 : 0, null);
        }
    }

    /* renamed from: n */
    private void m6533n() {
        this.f5333D = false;
        this.f5334E = false;
        VelocityTracker velocityTracker = this.f5343N;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f5343N = null;
        }
    }

    /* renamed from: p */
    private Rect m6534p(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    /* renamed from: s */
    private C1211f m6535s() {
        int i;
        int clientWidth = getClientWidth();
        float f = 0.0f;
        float scrollX = clientWidth > 0 ? ((float) getScrollX()) / ((float) clientWidth) : 0.0f;
        float f2 = clientWidth > 0 ? ((float) this.f5377r) / ((float) clientWidth) : 0.0f;
        C1211f fVar = null;
        float f3 = 0.0f;
        int i2 = -1;
        int i3 = 0;
        boolean z = true;
        while (i3 < this.f5360g.size()) {
            C1211f fVar2 = this.f5360g.get(i3);
            if (!z && fVar2.f5390b != (i = i2 + 1)) {
                fVar2 = this.f5362h;
                fVar2.f5393e = f + f3 + f2;
                fVar2.f5390b = i;
                fVar2.f5392d = this.f5366j.mo6060e(i);
                i3--;
            }
            f = fVar2.f5393e;
            float f4 = fVar2.f5392d + f + f2;
            if (!z && scrollX < f) {
                return fVar;
            }
            if (scrollX < f4 || i3 == this.f5360g.size() - 1) {
                return fVar2;
            }
            i2 = fVar2.f5390b;
            f3 = fVar2.f5392d;
            i3++;
            fVar = fVar2;
            z = false;
        }
        return fVar;
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f5330A != z) {
            this.f5330A = z;
        }
    }

    /* renamed from: v */
    private static boolean m6536v(View view) {
        return view.getClass().getAnnotation(AbstractC1210e.class) != null;
    }

    /* renamed from: w */
    private boolean m6537w(float f, float f2) {
        return (f < ((float) this.f5336G) && f2 > 0.0f) || (f > ((float) (getWidth() - this.f5336G)) && f2 < 0.0f);
    }

    /* renamed from: y */
    private void m6538y(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f5342M) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f5338I = motionEvent.getX(i);
            this.f5342M = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f5343N;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public boolean mo6069A() {
        AbstractC1204a aVar = this.f5366j;
        if (aVar == null || this.f5368k >= aVar.mo6058c() - 1) {
            return false;
        }
        mo6072K(this.f5368k + 1, true);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo6070D() {
        mo6071E(this.f5368k);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        if (r9 == r10) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c0, code lost:
        if (r10 >= 0) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ce, code lost:
        if (r10 >= 0) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00dc, code lost:
        if (r10 >= 0) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e7, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x013c, code lost:
        if (r4 < r17.f5360g.size()) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0147, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x015a, code lost:
        if (r4 < r17.f5360g.size()) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x016c, code lost:
        if (r4 < r17.f5360g.size()) goto L_0x013e;
     */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6071E(int r18) {
        /*
        // Method dump skipped, instructions count: 585
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p067t.p068a.C1205b.mo6071E(int):void");
    }

    /* renamed from: K */
    public void mo6072K(int i, boolean z) {
        this.f5331B = false;
        mo6073L(i, z, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public void mo6073L(int i, boolean z, boolean z2) {
        mo6074M(i, z, z2, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public void mo6074M(int i, boolean z, boolean z2, int i2) {
        AbstractC1204a aVar = this.f5366j;
        boolean z3 = false;
        if (aVar == null || aVar.mo6058c() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z2 || this.f5368k != i || this.f5360g.size() == 0) {
            if (i < 0) {
                i = 0;
            } else if (i >= this.f5366j.mo6058c()) {
                i = this.f5366j.mo6058c() - 1;
            }
            int i3 = this.f5332C;
            int i4 = this.f5368k;
            if (i > i4 + i3 || i < i4 - i3) {
                for (int i5 = 0; i5 < this.f5360g.size(); i5++) {
                    this.f5360g.get(i5).f5391c = true;
                }
            }
            if (this.f5368k != i) {
                z3 = true;
            }
            if (this.f5351V) {
                this.f5368k = i;
                if (z3) {
                    m6530j(i);
                }
                requestLayout();
                return;
            }
            mo6071E(i);
            m6524J(i, z, i2, z3);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public void mo6075N(int i, int i2, int i3) {
        int i4;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f5374o;
        if (scroller != null && !scroller.isFinished()) {
            i4 = this.f5375p ? this.f5374o.getCurrX() : this.f5374o.getStartX();
            this.f5374o.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            i4 = getScrollX();
        }
        int scrollY = getScrollY();
        int i5 = i - i4;
        int i6 = i2 - scrollY;
        if (i5 == 0 && i6 == 0) {
            m6527f(false);
            mo6070D();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i7 = clientWidth / 2;
        float f = (float) clientWidth;
        float f2 = (float) i7;
        float l = f2 + (mo6099l(Math.min(1.0f, (((float) Math.abs(i5)) * 1.0f) / f)) * f2);
        int abs = Math.abs(i3);
        int min = Math.min(abs > 0 ? Math.round(Math.abs(l / ((float) abs)) * 1000.0f) * 4 : (int) (((((float) Math.abs(i5)) / ((f * this.f5366j.mo6060e(this.f5368k)) + ((float) this.f5377r))) + 1.0f) * 100.0f), 600);
        this.f5375p = false;
        this.f5374o.startScroll(i4, scrollY, i5, i6, min);
        C1013s.m5748Z(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C1211f mo6076a(int i, int i2) {
        C1211f fVar = new C1211f();
        fVar.f5390b = i;
        fVar.f5389a = this.f5366j.mo6061f(this, i);
        fVar.f5392d = this.f5366j.mo6060e(i);
        if (i2 < 0 || i2 >= this.f5360g.size()) {
            this.f5360g.add(fVar);
        } else {
            this.f5360g.add(i2, fVar);
        }
        return fVar;
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C1211f r;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (r = mo6113r(childAt)) != null && r.f5390b == this.f5368k) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if ((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) {
            arrayList.add(this);
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addTouchables(ArrayList<View> arrayList) {
        C1211f r;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (r = mo6113r(childAt)) != null && r.f5390b == this.f5368k) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C1212g gVar = (C1212g) layoutParams;
        boolean v = gVar.f5394a | m6536v(view);
        gVar.f5394a = v;
        if (!this.f5385z) {
            super.addView(view, i, layoutParams);
        } else if (!v) {
            gVar.f5397d = true;
            addViewInLayout(view, i, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    /* renamed from: b */
    public void mo6080b(AbstractC1215j jVar) {
        if (this.f5355c0 == null) {
            this.f5355c0 = new ArrayList();
        }
        this.f5355c0.add(jVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ca  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo6081c(int r7) {
        /*
        // Method dump skipped, instructions count: 210
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p067t.p068a.C1205b.mo6081c(int):boolean");
    }

    public boolean canScrollHorizontally(int i) {
        if (this.f5366j == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i < 0 ? scrollX > ((int) (((float) clientWidth) * this.f5381v)) : i > 0 && scrollX < ((int) (((float) clientWidth) * this.f5382w));
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C1212g) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        this.f5375p = true;
        if (this.f5374o.isFinished() || !this.f5374o.computeScrollOffset()) {
            m6527f(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f5374o.getCurrX();
        int currY = this.f5374o.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!m6518B(currX)) {
                this.f5374o.abortAnimation();
                scrollTo(0, currY);
            }
        }
        C1013s.m5748Z(this);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || mo6100o(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C1211f r;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (r = mo6113r(childAt)) != null && r.f5390b == this.f5368k && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public void draw(Canvas canvas) {
        AbstractC1204a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.f5366j) != null && aVar.mo6058c() > 1)) {
            if (!this.f5349T.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) ((-height) + getPaddingTop()), this.f5381v * ((float) width));
                this.f5349T.setSize(height, width);
                z = false | this.f5349T.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.f5350U.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.f5382w + 1.0f)) * ((float) width2));
                this.f5350U.setSize(height2, width2);
                z |= this.f5350U.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.f5349T.finish();
            this.f5350U.finish();
        }
        if (z) {
            C1013s.m5748Z(this);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f5378s;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo6089e(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && mo6089e(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo6090g() {
        int c = this.f5366j.mo6058c();
        this.f5358f = c;
        boolean z = this.f5360g.size() < (this.f5332C * 2) + 1 && this.f5360g.size() < c;
        int i = this.f5368k;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.f5360g.size()) {
            C1211f fVar = this.f5360g.get(i2);
            int d = this.f5366j.mo6059d(fVar.f5389a);
            if (d != -1) {
                if (d == -2) {
                    this.f5360g.remove(i2);
                    i2--;
                    if (!z2) {
                        this.f5366j.mo6068m(this);
                        z2 = true;
                    }
                    this.f5366j.mo6056a(this, fVar.f5390b, fVar.f5389a);
                    int i3 = this.f5368k;
                    if (i3 == fVar.f5390b) {
                        i = Math.max(0, Math.min(i3, c - 1));
                    }
                } else {
                    int i4 = fVar.f5390b;
                    if (i4 != d) {
                        if (i4 == this.f5368k) {
                            i = d;
                        }
                        fVar.f5390b = d;
                    }
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.f5366j.mo6057b(this);
        }
        Collections.sort(this.f5360g, f5327c);
        if (z) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                C1212g gVar = (C1212g) getChildAt(i5).getLayoutParams();
                if (!gVar.f5394a) {
                    gVar.f5396c = 0.0f;
                }
            }
            mo6073L(i, false, true);
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1212g();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1212g(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public AbstractC1204a getAdapter() {
        return this.f5366j;
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        if (this.f5365i0 == 2) {
            i2 = (i - 1) - i2;
        }
        return ((C1212g) this.f5367j0.get(i2).getLayoutParams()).f5399f;
    }

    public int getCurrentItem() {
        return this.f5368k;
    }

    public int getOffscreenPageLimit() {
        return this.f5332C;
    }

    public int getPageMargin() {
        return this.f5377r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public float mo6099l(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    /* renamed from: o */
    public boolean mo6100o(KeyEvent keyEvent) {
        int i;
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return mo6081c(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return mo6081c(1);
                        }
                    }
                } else if (keyEvent.hasModifiers(2)) {
                    return mo6069A();
                } else {
                    i = 66;
                }
            } else if (keyEvent.hasModifiers(2)) {
                return mo6127z();
            } else {
                i = 17;
            }
            return mo6081c(i);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5351V = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f5369k0);
        Scroller scroller = this.f5374o;
        if (scroller != null && !scroller.isFinished()) {
            this.f5374o.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r18) {
        /*
        // Method dump skipped, instructions count: 171
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p067t.p068a.C1205b.onDraw(android.graphics.Canvas):void");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            m6523I();
            return false;
        }
        if (action != 0) {
            if (this.f5333D) {
                return true;
            }
            if (this.f5334E) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.f5340K = x;
            this.f5338I = x;
            float y = motionEvent.getY();
            this.f5341L = y;
            this.f5339J = y;
            this.f5342M = motionEvent.getPointerId(0);
            this.f5334E = false;
            this.f5375p = true;
            this.f5374o.computeScrollOffset();
            if (this.f5371l0 != 2 || Math.abs(this.f5374o.getFinalX() - this.f5374o.getCurrX()) <= this.f5347R) {
                m6527f(false);
                this.f5333D = false;
            } else {
                this.f5374o.abortAnimation();
                this.f5331B = false;
                mo6070D();
                this.f5333D = true;
                m6522H(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.f5342M;
            if (i != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i);
                float x2 = motionEvent.getX(findPointerIndex);
                float f = x2 - this.f5338I;
                float abs = Math.abs(f);
                float y2 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.f5341L);
                if (f == 0.0f || m6537w(this.f5338I, f) || !mo6089e(this, false, (int) f, (int) x2, (int) y2)) {
                    int i2 = this.f5337H;
                    if (abs > ((float) i2) && abs * 0.5f > abs2) {
                        this.f5333D = true;
                        m6522H(true);
                        setScrollState(1);
                        this.f5338I = f > 0.0f ? this.f5340K + ((float) this.f5337H) : this.f5340K - ((float) this.f5337H);
                        this.f5339J = y2;
                        setScrollingCacheEnabled(true);
                    } else if (abs2 > ((float) i2)) {
                        this.f5334E = true;
                    }
                    if (this.f5333D && m6519C(x2)) {
                        C1013s.m5748Z(this);
                    }
                } else {
                    this.f5338I = x2;
                    this.f5339J = y2;
                    this.f5334E = true;
                    return false;
                }
            }
        } else if (action == 6) {
            m6538y(motionEvent);
        }
        if (this.f5343N == null) {
            this.f5343N = VelocityTracker.obtain();
        }
        this.f5343N.addMovement(motionEvent);
        return this.f5333D;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
        // Method dump skipped, instructions count: 286
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p067t.p068a.C1205b.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r14, int r15) {
        /*
        // Method dump skipped, instructions count: 244
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p067t.p068a.C1205b.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        C1211f r;
        int childCount = getChildCount();
        int i4 = -1;
        if ((i & 2) != 0) {
            i4 = childCount;
            i3 = 0;
            i2 = 1;
        } else {
            i3 = childCount - 1;
            i2 = -1;
        }
        while (i3 != i4) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0 && (r = mo6113r(childAt)) != null && r.f5390b == this.f5368k && childAt.requestFocus(i, rect)) {
                return true;
            }
            i3 += i2;
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1218m)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1218m mVar = (C1218m) parcelable;
        super.onRestoreInstanceState(mVar.mo5608b());
        AbstractC1204a aVar = this.f5366j;
        if (aVar != null) {
            aVar.mo6064i(mVar.f5403e, mVar.f5404f);
            mo6073L(mVar.f5402d, false, true);
            return;
        }
        this.f5370l = mVar.f5402d;
        this.f5372m = mVar.f5403e;
        this.f5373n = mVar.f5404f;
    }

    public Parcelable onSaveInstanceState() {
        C1218m mVar = new C1218m(super.onSaveInstanceState());
        mVar.f5402d = this.f5368k;
        AbstractC1204a aVar = this.f5366j;
        if (aVar != null) {
            mVar.f5403e = aVar.mo6065j();
        }
        return mVar;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.f5377r;
            m6520F(i, i3, i5, i5);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x0151  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
        // Method dump skipped, instructions count: 342
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p067t.p068a.C1205b.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public C1211f mo6112q(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return mo6113r(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public C1211f mo6113r(View view) {
        for (int i = 0; i < this.f5360g.size(); i++) {
            C1211f fVar = this.f5360g.get(i);
            if (this.f5366j.mo6062g(view, fVar.f5389a)) {
                return fVar;
            }
        }
        return null;
    }

    public void removeView(View view) {
        if (this.f5385z) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(AbstractC1204a aVar) {
        AbstractC1204a aVar2 = this.f5366j;
        if (aVar2 != null) {
            aVar2.mo6067l(null);
            this.f5366j.mo6068m(this);
            for (int i = 0; i < this.f5360g.size(); i++) {
                C1211f fVar = this.f5360g.get(i);
                this.f5366j.mo6056a(this, fVar.f5390b, fVar.f5389a);
            }
            this.f5366j.mo6057b(this);
            this.f5360g.clear();
            m6521G();
            this.f5368k = 0;
            scrollTo(0, 0);
        }
        AbstractC1204a aVar3 = this.f5366j;
        this.f5366j = aVar;
        this.f5358f = 0;
        if (aVar != null) {
            if (this.f5376q == null) {
                this.f5376q = new C1217l();
            }
            this.f5366j.mo6067l(this.f5376q);
            this.f5331B = false;
            boolean z = this.f5351V;
            this.f5351V = true;
            this.f5358f = this.f5366j.mo6058c();
            if (this.f5370l >= 0) {
                this.f5366j.mo6064i(this.f5372m, this.f5373n);
                mo6073L(this.f5370l, false, true);
                this.f5370l = -1;
                this.f5372m = null;
                this.f5373n = null;
            } else if (!z) {
                mo6070D();
            } else {
                requestLayout();
            }
        }
        List<AbstractC1214i> list = this.f5359f0;
        if (!(list == null || list.isEmpty())) {
            int size = this.f5359f0.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f5359f0.get(i2).mo6132a(this, aVar3, aVar);
            }
        }
    }

    public void setCurrentItem(int i) {
        this.f5331B = false;
        mo6073L(i, !this.f5351V, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to " + 1);
            i = 1;
        }
        if (i != this.f5332C) {
            this.f5332C = i;
            mo6070D();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(AbstractC1215j jVar) {
        this.f5356d0 = jVar;
    }

    public void setPageMargin(int i) {
        int i2 = this.f5377r;
        this.f5377r = i;
        int width = getWidth();
        m6520F(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(C0378a.m1874d(getContext(), i));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f5378s = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i) {
        if (this.f5371l0 != i) {
            this.f5371l0 = i;
            if (this.f5361g0 != null) {
                m6532m(i != 0);
            }
            m6531k(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public C1211f mo6123t(int i) {
        for (int i2 = 0; i2 < this.f5360g.size(); i2++) {
            C1211f fVar = this.f5360g.get(i2);
            if (fVar.f5390b == i) {
                return fVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo6124u() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f5374o = new Scroller(context, f5328d);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.f5337H = viewConfiguration.getScaledPagingTouchSlop();
        this.f5344O = (int) (400.0f * f);
        this.f5345P = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f5349T = new EdgeEffect(context);
        this.f5350U = new EdgeEffect(context);
        this.f5346Q = (int) (25.0f * f);
        this.f5347R = (int) (2.0f * f);
        this.f5335F = (int) (f * 16.0f);
        C1013s.m5766i0(this, new C1213h());
        if (C1013s.m5793w(this) == 0) {
            C1013s.m5786s0(this, 1);
        }
        C1013s.m5790u0(this, new C1209d());
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f5378s;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6126x(int r13, float r14, int r15) {
        /*
        // Method dump skipped, instructions count: 162
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p067t.p068a.C1205b.mo6126x(int, float, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public boolean mo6127z() {
        int i = this.f5368k;
        if (i <= 0) {
            return false;
        }
        mo6072K(i - 1, true);
        return true;
    }
}
