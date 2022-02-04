package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.core.content.C0378a;
import androidx.core.graphics.drawable.C0398a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p006b.p029f.C0895a;
import p006b.p029f.C0896b;
import p006b.p029f.C0897c;
import p006b.p030g.p038j.AbstractC0958f;
import p006b.p030g.p038j.C0956d;
import p006b.p030g.p038j.C0960h;
import p006b.p030g.p039k.AbstractC1006l;
import p006b.p030g.p039k.AbstractC1007m;
import p006b.p030g.p039k.AbstractC1010p;
import p006b.p030g.p039k.C0964a0;
import p006b.p030g.p039k.C0997d;
import p006b.p030g.p039k.C1009o;
import p006b.p030g.p039k.C1013s;
import p006b.p043i.p044a.AbstractC1041a;

public class CoordinatorLayout extends ViewGroup implements AbstractC1006l, AbstractC1007m {

    /* renamed from: b */
    static final String f1896b;

    /* renamed from: c */
    static final Class<?>[] f1897c = {Context.class, AttributeSet.class};

    /* renamed from: d */
    static final ThreadLocal<Map<String, Constructor<AbstractC0337c>>> f1898d = new ThreadLocal<>();

    /* renamed from: e */
    static final Comparator<View> f1899e;

    /* renamed from: f */
    private static final AbstractC0958f<Rect> f1900f = new C0960h(12);

    /* renamed from: g */
    private final List<View> f1901g;

    /* renamed from: h */
    private final C0345a<View> f1902h;

    /* renamed from: i */
    private final List<View> f1903i;

    /* renamed from: j */
    private final List<View> f1904j;

    /* renamed from: k */
    private Paint f1905k;

    /* renamed from: l */
    private final int[] f1906l;

    /* renamed from: m */
    private final int[] f1907m;

    /* renamed from: n */
    private boolean f1908n;

    /* renamed from: o */
    private boolean f1909o;

    /* renamed from: p */
    private int[] f1910p;

    /* renamed from: q */
    private View f1911q;

    /* renamed from: r */
    private View f1912r;

    /* renamed from: s */
    private ViewTreeObserver$OnPreDrawListenerC0341g f1913s;

    /* renamed from: t */
    private boolean f1914t;

    /* renamed from: u */
    private C0964a0 f1915u;

    /* renamed from: v */
    private boolean f1916v;

    /* renamed from: w */
    private Drawable f1917w;

    /* renamed from: x */
    ViewGroup.OnHierarchyChangeListener f1918x;

    /* renamed from: y */
    private AbstractC1010p f1919y;

    /* renamed from: z */
    private final C1009o f1920z;

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$a */
    public class C0335a implements AbstractC1010p {
        C0335a() {
        }

        @Override // p006b.p030g.p039k.AbstractC1010p
        /* renamed from: a */
        public C0964a0 mo340a(View view, C0964a0 a0Var) {
            return CoordinatorLayout.this.mo2038W(a0Var);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$b */
    public interface AbstractC0336b {
        AbstractC0337c getBehavior();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$c */
    public static abstract class AbstractC0337c<V extends View> {
        public AbstractC0337c() {
        }

        public AbstractC0337c(Context context, AttributeSet attributeSet) {
        }

        /* renamed from: A */
        public boolean mo2083A(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                return mo2112z(coordinatorLayout, v, view, view2, i);
            }
            return false;
        }

        @Deprecated
        /* renamed from: B */
        public void mo2084B(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        /* renamed from: C */
        public void mo2085C(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
            if (i == 0) {
                mo2084B(coordinatorLayout, v, view);
            }
        }

        /* renamed from: D */
        public boolean mo2086D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: a */
        public boolean mo2087a(CoordinatorLayout coordinatorLayout, V v) {
            return mo2090d(coordinatorLayout, v) > 0.0f;
        }

        /* renamed from: b */
        public boolean mo2088b(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        /* renamed from: c */
        public int mo2089c(CoordinatorLayout coordinatorLayout, V v) {
            return -16777216;
        }

        /* renamed from: d */
        public float mo2090d(CoordinatorLayout coordinatorLayout, V v) {
            return 0.0f;
        }

        /* renamed from: e */
        public boolean mo2091e(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: f */
        public C0964a0 mo2092f(CoordinatorLayout coordinatorLayout, V v, C0964a0 a0Var) {
            return a0Var;
        }

        /* renamed from: g */
        public void mo2093g(C0340f fVar) {
        }

        /* renamed from: h */
        public boolean mo2094h(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        /* renamed from: i */
        public void mo2095i(CoordinatorLayout coordinatorLayout, V v, View view) {
        }

        /* renamed from: j */
        public void mo2096j() {
        }

        /* renamed from: k */
        public boolean mo2097k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: l */
        public boolean mo2098l(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        /* renamed from: m */
        public boolean mo2099m(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        /* renamed from: n */
        public boolean mo2100n(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, boolean z) {
            return false;
        }

        /* renamed from: o */
        public boolean mo2101o(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        @Deprecated
        /* renamed from: p */
        public void mo2102p(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        }

        /* renamed from: q */
        public void mo2103q(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
            if (i3 == 0) {
                mo2102p(coordinatorLayout, v, view, i, i2, iArr);
            }
        }

        @Deprecated
        /* renamed from: r */
        public void mo2104r(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        }

        @Deprecated
        /* renamed from: s */
        public void mo2105s(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5) {
            if (i5 == 0) {
                mo2104r(coordinatorLayout, v, view, i, i2, i3, i4);
            }
        }

        /* renamed from: t */
        public void mo2106t(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            mo2105s(coordinatorLayout, v, view, i, i2, i3, i4, i5);
        }

        @Deprecated
        /* renamed from: u */
        public void mo2107u(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        }

        /* renamed from: v */
        public void mo2108v(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
                mo2107u(coordinatorLayout, v, view, view2, i);
            }
        }

        /* renamed from: w */
        public boolean mo2109w(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        /* renamed from: x */
        public void mo2110x(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        /* renamed from: y */
        public Parcelable mo2111y(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        /* renamed from: z */
        public boolean mo2112z(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
            return false;
        }
    }

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$d */
    public @interface AbstractC0338d {
        Class<? extends AbstractC0337c> value();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$e */
    private class ViewGroup$OnHierarchyChangeListenerC0339e implements ViewGroup.OnHierarchyChangeListener {
        ViewGroup$OnHierarchyChangeListenerC0339e() {
        }

        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f1918x;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.mo2033H(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f1918x;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$f */
    public static class C0340f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        AbstractC0337c f1923a;

        /* renamed from: b */
        boolean f1924b = false;

        /* renamed from: c */
        public int f1925c = 0;

        /* renamed from: d */
        public int f1926d = 0;

        /* renamed from: e */
        public int f1927e = -1;

        /* renamed from: f */
        int f1928f = -1;

        /* renamed from: g */
        public int f1929g = 0;

        /* renamed from: h */
        public int f1930h = 0;

        /* renamed from: i */
        int f1931i;

        /* renamed from: j */
        int f1932j;

        /* renamed from: k */
        View f1933k;

        /* renamed from: l */
        View f1934l;

        /* renamed from: m */
        private boolean f1935m;

        /* renamed from: n */
        private boolean f1936n;

        /* renamed from: o */
        private boolean f1937o;

        /* renamed from: p */
        private boolean f1938p;

        /* renamed from: q */
        final Rect f1939q = new Rect();

        /* renamed from: r */
        Object f1940r;

        public C0340f(int i, int i2) {
            super(i, i2);
        }

        C0340f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0897c.f4477e);
            this.f1925c = obtainStyledAttributes.getInteger(C0897c.f4478f, 0);
            this.f1928f = obtainStyledAttributes.getResourceId(C0897c.f4479g, -1);
            this.f1926d = obtainStyledAttributes.getInteger(C0897c.f4480h, 0);
            this.f1927e = obtainStyledAttributes.getInteger(C0897c.f4484l, -1);
            this.f1929g = obtainStyledAttributes.getInt(C0897c.f4483k, 0);
            this.f1930h = obtainStyledAttributes.getInt(C0897c.f4482j, 0);
            int i = C0897c.f4481i;
            boolean hasValue = obtainStyledAttributes.hasValue(i);
            this.f1924b = hasValue;
            if (hasValue) {
                this.f1923a = CoordinatorLayout.m1660K(context, attributeSet, obtainStyledAttributes.getString(i));
            }
            obtainStyledAttributes.recycle();
            AbstractC0337c cVar = this.f1923a;
            if (cVar != null) {
                cVar.mo2093g(this);
            }
        }

        public C0340f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0340f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0340f(C0340f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
        }

        /* renamed from: n */
        private void m1736n(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.f1928f);
            this.f1933k = findViewById;
            if (findViewById != null) {
                if (findViewById != coordinatorLayout) {
                    ViewParent parent = findViewById.getParent();
                    while (parent != coordinatorLayout && parent != null) {
                        if (parent != view) {
                            if (parent instanceof View) {
                                findViewById = (View) parent;
                            }
                            parent = parent.getParent();
                        } else if (!coordinatorLayout.isInEditMode()) {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    this.f1934l = findViewById;
                    return;
                } else if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else if (!coordinatorLayout.isInEditMode()) {
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f1928f) + " to anchor view " + view);
            }
            this.f1934l = null;
            this.f1933k = null;
        }

        /* renamed from: s */
        private boolean m1737s(View view, int i) {
            int b = C0997d.m5669b(((C0340f) view.getLayoutParams()).f1929g, i);
            return b != 0 && (C0997d.m5669b(this.f1930h, i) & b) == b;
        }

        /* renamed from: t */
        private boolean m1738t(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f1933k.getId() != this.f1928f) {
                return false;
            }
            View view2 = this.f1933k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f1934l = null;
                    this.f1933k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
            this.f1934l = view2;
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo2116a() {
            return this.f1933k == null && this.f1928f != -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo2117b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            AbstractC0337c cVar;
            return view2 == this.f1934l || m1737s(view2, C1013s.m5797y(coordinatorLayout)) || ((cVar = this.f1923a) != null && cVar.mo2091e(coordinatorLayout, view, view2));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo2118c() {
            if (this.f1923a == null) {
                this.f1935m = false;
            }
            return this.f1935m;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public View mo2119d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f1928f == -1) {
                this.f1934l = null;
                this.f1933k = null;
                return null;
            }
            if (this.f1933k == null || !m1738t(view, coordinatorLayout)) {
                m1736n(view, coordinatorLayout);
            }
            return this.f1933k;
        }

        /* renamed from: e */
        public int mo2120e() {
            return this.f1928f;
        }

        /* renamed from: f */
        public AbstractC0337c mo2121f() {
            return this.f1923a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public boolean mo2122g() {
            return this.f1938p;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public Rect mo2123h() {
            return this.f1939q;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public boolean mo2124i(CoordinatorLayout coordinatorLayout, View view) {
            boolean z = this.f1935m;
            if (z) {
                return true;
            }
            AbstractC0337c cVar = this.f1923a;
            boolean a = (cVar != null ? cVar.mo2087a(coordinatorLayout, view) : false) | z;
            this.f1935m = a;
            return a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public boolean mo2125j(int i) {
            if (i == 0) {
                return this.f1936n;
            }
            if (i != 1) {
                return false;
            }
            return this.f1937o;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo2126k() {
            this.f1938p = false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public void mo2127l(int i) {
            mo2132r(i, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo2128m() {
            this.f1935m = false;
        }

        /* renamed from: o */
        public void mo2129o(AbstractC0337c cVar) {
            AbstractC0337c cVar2 = this.f1923a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.mo2096j();
                }
                this.f1923a = cVar;
                this.f1940r = null;
                this.f1924b = true;
                if (cVar != null) {
                    cVar.mo2093g(this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public void mo2130p(boolean z) {
            this.f1938p = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public void mo2131q(Rect rect) {
            this.f1939q.set(rect);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo2132r(int i, boolean z) {
            if (i == 0) {
                this.f1936n = z;
            } else if (i == 1) {
                this.f1937o = z;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$g */
    public class ViewTreeObserver$OnPreDrawListenerC0341g implements ViewTreeObserver.OnPreDrawListener {
        ViewTreeObserver$OnPreDrawListenerC0341g() {
        }

        public boolean onPreDraw() {
            CoordinatorLayout.this.mo2033H(0);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h */
    public static class C0342h extends AbstractC1041a {
        public static final Parcelable.Creator<C0342h> CREATOR = new C0343a();

        /* renamed from: d */
        SparseArray<Parcelable> f1942d;

        /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h$a */
        static class C0343a implements Parcelable.ClassLoaderCreator<C0342h> {
            C0343a() {
            }

            /* renamed from: a */
            public C0342h createFromParcel(Parcel parcel) {
                return new C0342h(parcel, null);
            }

            /* renamed from: b */
            public C0342h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0342h(parcel, classLoader);
            }

            /* renamed from: c */
            public C0342h[] newArray(int i) {
                return new C0342h[i];
            }
        }

        public C0342h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f1942d = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f1942d.append(iArr[i], readParcelableArray[i]);
            }
        }

        public C0342h(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // p006b.p043i.p044a.AbstractC1041a
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray<Parcelable> sparseArray = this.f1942d;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f1942d.keyAt(i2);
                parcelableArr[i2] = this.f1942d.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$i */
    static class C0344i implements Comparator<View> {
        C0344i() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            float I = C1013s.m5731I(view);
            float I2 = C1013s.m5731I(view2);
            if (I > I2) {
                return -1;
            }
            return I < I2 ? 1 : 0;
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        f1896b = r0 != null ? r0.getName() : null;
        if (Build.VERSION.SDK_INT >= 21) {
            f1899e = new C0344i();
        } else {
            f1899e = null;
        }
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0895a.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1901g = new ArrayList();
        this.f1902h = new C0345a<>();
        this.f1903i = new ArrayList();
        this.f1904j = new ArrayList();
        this.f1906l = new int[2];
        this.f1907m = new int[2];
        this.f1920z = new C1009o(this);
        int[] iArr = C0897c.f4474b;
        TypedArray obtainStyledAttributes = i == 0 ? context.obtainStyledAttributes(attributeSet, iArr, 0, C0896b.Widget_Support_CoordinatorLayout) : context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            int[] iArr2 = C0897c.f4474b;
            if (i == 0) {
                saveAttributeDataForStyleable(context, iArr2, attributeSet, obtainStyledAttributes, 0, C0896b.Widget_Support_CoordinatorLayout);
            } else {
                saveAttributeDataForStyleable(context, iArr2, attributeSet, obtainStyledAttributes, i, 0);
            }
        }
        int resourceId = obtainStyledAttributes.getResourceId(C0897c.f4475c, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f1910p = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.f1910p.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr3 = this.f1910p;
                iArr3[i2] = (int) (((float) iArr3[i2]) * f);
            }
        }
        this.f1917w = obtainStyledAttributes.getDrawable(C0897c.f4476d);
        obtainStyledAttributes.recycle();
        m1670X();
        super.setOnHierarchyChangeListener(new ViewGroup$OnHierarchyChangeListenerC0339e());
        if (C1013s.m5793w(this) == 0) {
            C1013s.m5786s0(this, 1);
        }
    }

    /* renamed from: A */
    private boolean m1655A(View view) {
        return this.f1902h.mo2149j(view);
    }

    /* renamed from: C */
    private void m1656C(View view, int i) {
        C0340f fVar = (C0340f) view.getLayoutParams();
        Rect a = m1671a();
        a.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        if (this.f1915u != null && C1013s.m5791v(this) && !C1013s.m5791v(view)) {
            a.left += this.f1915u.mo5416f();
            a.top += this.f1915u.mo5418h();
            a.right -= this.f1915u.mo5417g();
            a.bottom -= this.f1915u.mo5414e();
        }
        Rect a2 = m1671a();
        C0997d.m5668a(m1666S(fVar.f1925c), view.getMeasuredWidth(), view.getMeasuredHeight(), a, a2, i);
        view.layout(a2.left, a2.top, a2.right, a2.bottom);
        m1663O(a);
        m1663O(a2);
    }

    /* renamed from: D */
    private void m1657D(View view, View view2, int i) {
        Rect a = m1671a();
        Rect a2 = m1671a();
        try {
            mo2077t(view2, a);
            mo2078u(view, i, a, a2);
            view.layout(a2.left, a2.top, a2.right, a2.bottom);
        } finally {
            m1663O(a);
            m1663O(a2);
        }
    }

    /* renamed from: E */
    private void m1658E(View view, int i, int i2) {
        C0340f fVar = (C0340f) view.getLayoutParams();
        int b = C0997d.m5669b(m1667T(fVar.f1925c), i2);
        int i3 = b & 7;
        int i4 = b & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int w = m1676w(i) - measuredWidth;
        int i5 = 0;
        if (i3 == 1) {
            w += measuredWidth / 2;
        } else if (i3 == 5) {
            w += measuredWidth;
        }
        if (i4 == 16) {
            i5 = 0 + (measuredHeight / 2);
        } else if (i4 == 80) {
            i5 = measuredHeight + 0;
        }
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(w, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(i5, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    /* renamed from: F */
    private void m1659F(View view, Rect rect, int i) {
        boolean z;
        boolean z2;
        int width;
        int i2;
        int i3;
        int i4;
        int height;
        int i5;
        int i6;
        int i7;
        if (C1013s.m5737O(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            C0340f fVar = (C0340f) view.getLayoutParams();
            AbstractC0337c f = fVar.mo2121f();
            Rect a = m1671a();
            Rect a2 = m1671a();
            a2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (f == null || !f.mo2088b(this, view, a)) {
                a.set(a2);
            } else if (!a2.contains(a)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + a.toShortString() + " | Bounds:" + a2.toShortString());
            }
            m1663O(a2);
            if (a.isEmpty()) {
                m1663O(a);
                return;
            }
            int b = C0997d.m5669b(fVar.f1930h, i);
            boolean z3 = true;
            if ((b & 48) != 48 || (i6 = (a.top - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - fVar.f1932j) >= (i7 = rect.top)) {
                z = false;
            } else {
                m1669V(view, i7 - i6);
                z = true;
            }
            if ((b & 80) == 80 && (height = ((getHeight() - a.bottom) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) + fVar.f1932j) < (i5 = rect.bottom)) {
                m1669V(view, height - i5);
                z = true;
            }
            if (!z) {
                m1669V(view, 0);
            }
            if ((b & 3) != 3 || (i3 = (a.left - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - fVar.f1931i) >= (i4 = rect.left)) {
                z2 = false;
            } else {
                m1668U(view, i4 - i3);
                z2 = true;
            }
            if ((b & 5) != 5 || (width = ((getWidth() - a.right) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) + fVar.f1931i) >= (i2 = rect.right)) {
                z3 = z2;
            } else {
                m1668U(view, width - i2);
            }
            if (!z3) {
                m1668U(view, 0);
            }
            m1663O(a);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: java.lang.Class<?> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: K */
    static AbstractC0337c m1660K(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f1896b;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<AbstractC0337c>>> threadLocal = f1898d;
            Map<String, Constructor<AbstractC0337c>> map = threadLocal.get();
            if (map == null) {
                map = new HashMap<>();
                threadLocal.set(map);
            }
            Constructor<AbstractC0337c> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f1897c);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e);
        }
    }

    /* renamed from: L */
    private boolean m1661L(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f1903i;
        m1677z(list);
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            View view = list.get(i2);
            C0340f fVar = (C0340f) view.getLayoutParams();
            AbstractC0337c f = fVar.mo2121f();
            if (!(z || z2) || actionMasked == 0) {
                if (!z && f != null) {
                    if (i == 0) {
                        z = f.mo2097k(this, view, motionEvent);
                    } else if (i == 1) {
                        z = f.mo2086D(this, view, motionEvent);
                    }
                    if (z) {
                        this.f1911q = view;
                    }
                }
                boolean c = fVar.mo2118c();
                boolean i3 = fVar.mo2124i(this, view);
                z2 = i3 && !c;
                if (i3 && !z2) {
                    break;
                }
            } else if (f != null) {
                if (motionEvent2 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i == 0) {
                    f.mo2097k(this, view, motionEvent2);
                } else if (i == 1) {
                    f.mo2086D(this, view, motionEvent2);
                }
            }
        }
        list.clear();
        return z;
    }

    /* renamed from: M */
    private void m1662M() {
        this.f1901g.clear();
        this.f1902h.mo2144c();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0340f y = mo2081y(childAt);
            y.mo2119d(this, childAt);
            this.f1902h.mo2143b(childAt);
            for (int i2 = 0; i2 < childCount; i2++) {
                if (i2 != i) {
                    View childAt2 = getChildAt(i2);
                    if (y.mo2117b(this, childAt, childAt2)) {
                        if (!this.f1902h.mo2145d(childAt2)) {
                            this.f1902h.mo2143b(childAt2);
                        }
                        this.f1902h.mo2142a(childAt2, childAt);
                    }
                }
            }
        }
        this.f1901g.addAll(this.f1902h.mo2148i());
        Collections.reverse(this.f1901g);
    }

    /* renamed from: O */
    private static void m1663O(Rect rect) {
        rect.setEmpty();
        f1900f.mo5398a(rect);
    }

    /* renamed from: Q */
    private void m1664Q(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            AbstractC0337c f = ((C0340f) childAt.getLayoutParams()).mo2121f();
            if (f != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    f.mo2097k(this, childAt, obtain);
                } else {
                    f.mo2086D(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C0340f) getChildAt(i2).getLayoutParams()).mo2128m();
        }
        this.f1911q = null;
        this.f1908n = false;
    }

    /* renamed from: R */
    private static int m1665R(int i) {
        if (i == 0) {
            return 17;
        }
        return i;
    }

    /* renamed from: S */
    private static int m1666S(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    /* renamed from: T */
    private static int m1667T(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    /* renamed from: U */
    private void m1668U(View view, int i) {
        C0340f fVar = (C0340f) view.getLayoutParams();
        int i2 = fVar.f1931i;
        if (i2 != i) {
            C1013s.m5742T(view, i - i2);
            fVar.f1931i = i;
        }
    }

    /* renamed from: V */
    private void m1669V(View view, int i) {
        C0340f fVar = (C0340f) view.getLayoutParams();
        int i2 = fVar.f1932j;
        if (i2 != i) {
            C1013s.m5743U(view, i - i2);
            fVar.f1932j = i;
        }
    }

    /* renamed from: X */
    private void m1670X() {
        if (Build.VERSION.SDK_INT >= 21) {
            if (C1013s.m5791v(this)) {
                if (this.f1919y == null) {
                    this.f1919y = new C0335a();
                }
                C1013s.m5790u0(this, this.f1919y);
                setSystemUiVisibility(1280);
                return;
            }
            C1013s.m5790u0(this, null);
        }
    }

    /* renamed from: a */
    private static Rect m1671a() {
        Rect b = f1900f.mo5399b();
        return b == null ? new Rect() : b;
    }

    /* renamed from: c */
    private static int m1672c(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* renamed from: d */
    private void m1673d(C0340f fVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    /* renamed from: e */
    private C0964a0 m1674e(C0964a0 a0Var) {
        AbstractC0337c f;
        if (a0Var.mo5423m()) {
            return a0Var;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (C1013s.m5791v(childAt) && (f = ((C0340f) childAt.getLayoutParams()).mo2121f()) != null) {
                a0Var = f.mo2092f(this, childAt, a0Var);
                if (a0Var.mo5423m()) {
                    break;
                }
            }
        }
        return a0Var;
    }

    /* renamed from: v */
    private void m1675v(View view, int i, Rect rect, Rect rect2, C0340f fVar, int i2, int i3) {
        int b = C0997d.m5669b(m1665R(fVar.f1925c), i);
        int b2 = C0997d.m5669b(m1666S(fVar.f1926d), i);
        int i4 = b & 7;
        int i5 = b & 112;
        int i6 = b2 & 7;
        int i7 = b2 & 112;
        int width = i6 != 1 ? i6 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i7 != 16 ? i7 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i4 == 1) {
            width -= i2 / 2;
        } else if (i4 != 5) {
            width -= i2;
        }
        if (i5 == 16) {
            height -= i3 / 2;
        } else if (i5 != 80) {
            height -= i3;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    /* renamed from: w */
    private int m1676w(int i) {
        StringBuilder sb;
        int[] iArr = this.f1910p;
        if (iArr == null) {
            sb = new StringBuilder();
            sb.append("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i);
        } else if (i >= 0 && i < iArr.length) {
            return iArr[i];
        } else {
            sb = new StringBuilder();
            sb.append("Keyline index ");
            sb.append(i);
            sb.append(" out of range for ");
            sb.append(this);
        }
        Log.e("CoordinatorLayout", sb.toString());
        return 0;
    }

    /* renamed from: z */
    private void m1677z(List<View> list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i = childCount - 1; i >= 0; i--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i) : i));
        }
        Comparator<View> comparator = f1899e;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    /* renamed from: B */
    public boolean mo2031B(View view, int i, int i2) {
        Rect a = m1671a();
        mo2077t(view, a);
        try {
            return a.contains(i, i2);
        } finally {
            m1663O(a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo2032G(View view, int i) {
        AbstractC0337c f;
        C0340f fVar = (C0340f) view.getLayoutParams();
        if (fVar.f1933k != null) {
            Rect a = m1671a();
            Rect a2 = m1671a();
            Rect a3 = m1671a();
            mo2077t(fVar.f1933k, a);
            boolean z = false;
            mo2066q(view, false, a2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            m1675v(view, i, a, a3, fVar, measuredWidth, measuredHeight);
            if (!(a3.left == a2.left && a3.top == a2.top)) {
                z = true;
            }
            m1673d(fVar, a3, measuredWidth, measuredHeight);
            int i2 = a3.left - a2.left;
            int i3 = a3.top - a2.top;
            if (i2 != 0) {
                C1013s.m5742T(view, i2);
            }
            if (i3 != 0) {
                C1013s.m5743U(view, i3);
            }
            if (z && (f = fVar.mo2121f()) != null) {
                f.mo2094h(this, view, fVar.f1933k);
            }
            m1663O(a);
            m1663O(a2);
            m1663O(a3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public final void mo2033H(int i) {
        boolean z;
        int y = C1013s.m5797y(this);
        int size = this.f1901g.size();
        Rect a = m1671a();
        Rect a2 = m1671a();
        Rect a3 = m1671a();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.f1901g.get(i2);
            C0340f fVar = (C0340f) view.getLayoutParams();
            if (i != 0 || view.getVisibility() != 8) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (fVar.f1934l == this.f1901g.get(i3)) {
                        mo2032G(view, y);
                    }
                }
                mo2066q(view, true, a2);
                if (fVar.f1929g != 0 && !a2.isEmpty()) {
                    int b = C0997d.m5669b(fVar.f1929g, y);
                    int i4 = b & 112;
                    if (i4 == 48) {
                        a.top = Math.max(a.top, a2.bottom);
                    } else if (i4 == 80) {
                        a.bottom = Math.max(a.bottom, getHeight() - a2.top);
                    }
                    int i5 = b & 7;
                    if (i5 == 3) {
                        a.left = Math.max(a.left, a2.right);
                    } else if (i5 == 5) {
                        a.right = Math.max(a.right, getWidth() - a2.left);
                    }
                }
                if (fVar.f1930h != 0 && view.getVisibility() == 0) {
                    m1659F(view, a, y);
                }
                if (i != 2) {
                    mo2080x(view, a3);
                    if (!a3.equals(a2)) {
                        mo2036N(view, a2);
                    }
                }
                for (int i6 = i2 + 1; i6 < size; i6++) {
                    View view2 = this.f1901g.get(i6);
                    C0340f fVar2 = (C0340f) view2.getLayoutParams();
                    AbstractC0337c f = fVar2.mo2121f();
                    if (f != null && f.mo2091e(this, view2, view)) {
                        if (i != 0 || !fVar2.mo2122g()) {
                            if (i != 2) {
                                z = f.mo2094h(this, view2, view);
                            } else {
                                f.mo2095i(this, view2, view);
                                z = true;
                            }
                            if (i == 1) {
                                fVar2.mo2130p(z);
                            }
                        } else {
                            fVar2.mo2126k();
                        }
                    }
                }
            }
        }
        m1663O(a);
        m1663O(a2);
        m1663O(a3);
    }

    /* renamed from: I */
    public void mo2034I(View view, int i) {
        C0340f fVar = (C0340f) view.getLayoutParams();
        if (!fVar.mo2116a()) {
            View view2 = fVar.f1933k;
            if (view2 != null) {
                m1657D(view, view2, i);
                return;
            }
            int i2 = fVar.f1927e;
            if (i2 >= 0) {
                m1658E(view, i2, i);
            } else {
                m1656C(view, i);
            }
        } else {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
    }

    /* renamed from: J */
    public void mo2035J(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public void mo2036N(View view, Rect rect) {
        ((C0340f) view.getLayoutParams()).mo2131q(rect);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public void mo2037P() {
        if (this.f1909o && this.f1913s != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f1913s);
        }
        this.f1914t = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public final C0964a0 mo2038W(C0964a0 a0Var) {
        if (C0956d.m5483a(this.f1915u, a0Var)) {
            return a0Var;
        }
        this.f1915u = a0Var;
        boolean z = true;
        boolean z2 = a0Var != null && a0Var.mo5418h() > 0;
        this.f1916v = z2;
        if (z2 || getBackground() != null) {
            z = false;
        }
        setWillNotDraw(z);
        C0964a0 e = m1674e(a0Var);
        requestLayout();
        return e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2039b() {
        if (this.f1909o) {
            if (this.f1913s == null) {
                this.f1913s = new ViewTreeObserver$OnPreDrawListenerC0341g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f1913s);
        }
        this.f1914t = true;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0340f) && super.checkLayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        C0340f fVar = (C0340f) view.getLayoutParams();
        AbstractC0337c cVar = fVar.f1923a;
        if (cVar != null) {
            float d = cVar.mo2090d(this, view);
            if (d > 0.0f) {
                if (this.f1905k == null) {
                    this.f1905k = new Paint();
                }
                this.f1905k.setColor(fVar.f1923a.mo2089c(this, view));
                this.f1905k.setAlpha(m1672c(Math.round(d * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), this.f1905k);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1917w;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* renamed from: f */
    public void mo2043f(View view) {
        List g = this.f1902h.mo2146g(view);
        if (!(g == null || g.isEmpty())) {
            for (int i = 0; i < g.size(); i++) {
                View view2 = (View) g.get(i);
                AbstractC0337c f = ((C0340f) view2.getLayoutParams()).mo2121f();
                if (f != null) {
                    f.mo2094h(this, view2, view);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo2044g() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (m1655A(getChildAt(i))) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z == this.f1914t) {
            return;
        }
        if (z) {
            mo2039b();
        } else {
            mo2037P();
        }
    }

    /* access modifiers changed from: package-private */
    public final List<View> getDependencySortedChildren() {
        m1662M();
        return Collections.unmodifiableList(this.f1901g);
    }

    public final C0964a0 getLastWindowInsets() {
        return this.f1915u;
    }

    public int getNestedScrollAxes() {
        return this.f1920z.mo5548a();
    }

    public Drawable getStatusBarBackground() {
        return this.f1917w;
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    /* access modifiers changed from: protected */
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    @Override // p006b.p030g.p039k.AbstractC1006l
    /* renamed from: h */
    public void mo944h(View view, View view2, int i, int i2) {
        AbstractC0337c f;
        this.f1920z.mo5550c(view, view2, i, i2);
        this.f1912r = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            C0340f fVar = (C0340f) childAt.getLayoutParams();
            if (fVar.mo2125j(i2) && (f = fVar.mo2121f()) != null) {
                f.mo2108v(this, childAt, view, view2, i, i2);
            }
        }
    }

    @Override // p006b.p030g.p039k.AbstractC1006l
    /* renamed from: i */
    public void mo945i(View view, int i) {
        this.f1920z.mo5551d(view, i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0340f fVar = (C0340f) childAt.getLayoutParams();
            if (fVar.mo2125j(i)) {
                AbstractC0337c f = fVar.mo2121f();
                if (f != null) {
                    f.mo2085C(this, childAt, view, i);
                }
                fVar.mo2127l(i);
                fVar.mo2126k();
            }
        }
        this.f1912r = null;
    }

    @Override // p006b.p030g.p039k.AbstractC1006l
    /* renamed from: j */
    public void mo946j(View view, int i, int i2, int[] iArr, int i3) {
        AbstractC0337c f;
        int childCount = getChildCount();
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C0340f fVar = (C0340f) childAt.getLayoutParams();
                if (fVar.mo2125j(i3) && (f = fVar.mo2121f()) != null) {
                    int[] iArr2 = this.f1906l;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f.mo2103q(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.f1906l;
                    i4 = i > 0 ? Math.max(i4, iArr3[0]) : Math.min(i4, iArr3[0]);
                    int[] iArr4 = this.f1906l;
                    i5 = i2 > 0 ? Math.max(i5, iArr4[1]) : Math.min(i5, iArr4[1]);
                    z = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z) {
            mo2033H(1);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C0340f generateDefaultLayoutParams() {
        return new C0340f(-2, -2);
    }

    /* renamed from: l */
    public C0340f generateLayoutParams(AttributeSet attributeSet) {
        return new C0340f(getContext(), attributeSet);
    }

    @Override // p006b.p030g.p039k.AbstractC1007m
    /* renamed from: m */
    public void mo949m(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        AbstractC0337c f;
        int childCount = getChildCount();
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C0340f fVar = (C0340f) childAt.getLayoutParams();
                if (fVar.mo2125j(i5) && (f = fVar.mo2121f()) != null) {
                    int[] iArr2 = this.f1906l;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    f.mo2106t(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.f1906l;
                    i6 = i3 > 0 ? Math.max(i6, iArr3[0]) : Math.min(i6, iArr3[0]);
                    i7 = i4 > 0 ? Math.max(i7, this.f1906l[1]) : Math.min(i7, this.f1906l[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (z) {
            mo2033H(1);
        }
    }

    @Override // p006b.p030g.p039k.AbstractC1006l
    /* renamed from: n */
    public void mo950n(View view, int i, int i2, int i3, int i4, int i5) {
        mo949m(view, i, i2, i3, i4, 0, this.f1907m);
    }

    @Override // p006b.p030g.p039k.AbstractC1006l
    /* renamed from: o */
    public boolean mo951o(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C0340f fVar = (C0340f) childAt.getLayoutParams();
                AbstractC0337c f = fVar.mo2121f();
                if (f != null) {
                    boolean A = f.mo2083A(this, childAt, view, view2, i, i2);
                    z |= A;
                    fVar.mo2132r(i2, A);
                } else {
                    fVar.mo2132r(i2, false);
                }
            }
        }
        return z;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m1664Q(false);
        if (this.f1914t) {
            if (this.f1913s == null) {
                this.f1913s = new ViewTreeObserver$OnPreDrawListenerC0341g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f1913s);
        }
        if (this.f1915u == null && C1013s.m5791v(this)) {
            C1013s.m5760f0(this);
        }
        this.f1909o = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1664Q(false);
        if (this.f1914t && this.f1913s != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f1913s);
        }
        View view = this.f1912r;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f1909o = false;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f1916v && this.f1917w != null) {
            C0964a0 a0Var = this.f1915u;
            int h = a0Var != null ? a0Var.mo5418h() : 0;
            if (h > 0) {
                this.f1917w.setBounds(0, 0, getWidth(), h);
                this.f1917w.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m1664Q(true);
        }
        boolean L = m1661L(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m1664Q(true);
        }
        return L;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AbstractC0337c f;
        int y = C1013s.m5797y(this);
        int size = this.f1901g.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.f1901g.get(i5);
            if (view.getVisibility() != 8 && ((f = ((C0340f) view.getLayoutParams()).mo2121f()) == null || !f.mo2098l(this, view, y))) {
                mo2034I(view, y);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x011a, code lost:
        if (r0.mo2099m(r30, r20, r11, r21, r23, 0) == false) goto L_0x012a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r31, int r32) {
        /*
        // Method dump skipped, instructions count: 391
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // p006b.p030g.p039k.AbstractC1008n
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        AbstractC0337c f3;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0340f fVar = (C0340f) childAt.getLayoutParams();
                if (fVar.mo2125j(0) && (f3 = fVar.mo2121f()) != null) {
                    z2 |= f3.mo2100n(this, childAt, view, f, f2, z);
                }
            }
        }
        if (z2) {
            mo2033H(1);
        }
        return z2;
    }

    @Override // p006b.p030g.p039k.AbstractC1008n
    public boolean onNestedPreFling(View view, float f, float f2) {
        AbstractC0337c f3;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0340f fVar = (C0340f) childAt.getLayoutParams();
                if (fVar.mo2125j(0) && (f3 = fVar.mo2121f()) != null) {
                    z |= f3.mo2101o(this, childAt, view, f, f2);
                }
            }
        }
        return z;
    }

    @Override // p006b.p030g.p039k.AbstractC1008n
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo946j(view, i, i2, iArr, 0);
    }

    @Override // p006b.p030g.p039k.AbstractC1008n
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo950n(view, i, i2, i3, i4, 0);
    }

    @Override // p006b.p030g.p039k.AbstractC1008n
    public void onNestedScrollAccepted(View view, View view2, int i) {
        mo944h(view, view2, i, 0);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0342h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0342h hVar = (C0342h) parcelable;
        super.onRestoreInstanceState(hVar.mo5608b());
        SparseArray<Parcelable> sparseArray = hVar.f1942d;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC0337c f = mo2081y(childAt).mo2121f();
            if (!(id == -1 || f == null || (parcelable2 = sparseArray.get(id)) == null)) {
                f.mo2110x(this, childAt, parcelable2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable y;
        C0342h hVar = new C0342h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC0337c f = ((C0340f) childAt.getLayoutParams()).mo2121f();
            if (!(id == -1 || f == null || (y = f.mo2111y(this, childAt)) == null)) {
                sparseArray.append(id, y);
            }
        }
        hVar.f1942d = sparseArray;
        return hVar;
    }

    @Override // p006b.p030g.p039k.AbstractC1008n
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return mo951o(view, view2, i, 0);
    }

    @Override // p006b.p030g.p039k.AbstractC1008n
    public void onStopNestedScroll(View view) {
        mo945i(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f1911q
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0015
            boolean r3 = r0.m1661L(r1, r4)
            if (r3 == 0) goto L_0x002b
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            android.view.View r6 = r0.f1911q
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0340f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.mo2121f()
            if (r6 == 0) goto L_0x002b
            android.view.View r7 = r0.f1911q
            boolean r6 = r6.mo2086D(r0, r7, r1)
            goto L_0x002c
        L_0x002b:
            r6 = 0
        L_0x002c:
            android.view.View r7 = r0.f1911q
            r8 = 0
            if (r7 != 0) goto L_0x0037
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x004a
        L_0x0037:
            if (r3 == 0) goto L_0x004a
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x004a:
            if (r8 == 0) goto L_0x004f
            r8.recycle()
        L_0x004f:
            if (r2 == r4) goto L_0x0054
            r1 = 3
            if (r2 != r1) goto L_0x0057
        L_0x0054:
            r0.m1664Q(r5)
        L_0x0057:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public C0340f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0340f ? new C0340f((C0340f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0340f((ViewGroup.MarginLayoutParams) layoutParams) : new C0340f(layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo2066q(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            mo2077t(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: r */
    public List<View> mo2067r(View view) {
        List<View> h = this.f1902h.mo2147h(view);
        this.f1904j.clear();
        if (h != null) {
            this.f1904j.addAll(h);
        }
        return this.f1904j;
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        AbstractC0337c f = ((C0340f) view.getLayoutParams()).mo2121f();
        if (f == null || !f.mo2109w(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.f1908n) {
            m1664Q(false);
            this.f1908n = true;
        }
    }

    /* renamed from: s */
    public List<View> mo2070s(View view) {
        List g = this.f1902h.mo2146g(view);
        this.f1904j.clear();
        if (g != null) {
            this.f1904j.addAll(g);
        }
        return this.f1904j;
    }

    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m1670X();
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f1918x = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f1917w;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f1917w = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f1917w.setState(getDrawableState());
                }
                C0398a.m1976m(this.f1917w, C1013s.m5797y(this));
                this.f1917w.setVisible(getVisibility() == 0, false);
                this.f1917w.setCallback(this);
            }
            C1013s.m5748Z(this);
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? C0378a.m1874d(getContext(), i) : null);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f1917w;
        if (drawable != null && drawable.isVisible() != z) {
            this.f1917w.setVisible(z, false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo2077t(View view, Rect rect) {
        C0346b.m1771a(this, view, rect);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo2078u(View view, int i, Rect rect, Rect rect2) {
        C0340f fVar = (C0340f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        m1675v(view, i, rect, rect2, fVar, measuredWidth, measuredHeight);
        m1673d(fVar, rect2, measuredWidth, measuredHeight);
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1917w;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo2080x(View view, Rect rect) {
        rect.set(((C0340f) view.getLayoutParams()).mo2123h());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public C0340f mo2081y(View view) {
        C0340f fVar = (C0340f) view.getLayoutParams();
        if (!fVar.f1924b) {
            if (view instanceof AbstractC0336b) {
                AbstractC0337c behavior = ((AbstractC0336b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.mo2129o(behavior);
            } else {
                AbstractC0338d dVar = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (AbstractC0338d) cls.getAnnotation(AbstractC0338d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        fVar.mo2129o((AbstractC0337c) dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e) {
                        Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                    }
                }
            }
            fVar.f1924b = true;
        }
        return fVar;
    }
}
