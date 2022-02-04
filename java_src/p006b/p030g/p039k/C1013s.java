package p006b.p030g.p039k;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p006b.p030g.C0899b;
import p006b.p030g.p039k.C0962a;
import p006b.p030g.p039k.p040b0.AbstractC0987f;
import p006b.p030g.p039k.p040b0.C0979c;

/* renamed from: b.g.k.s */
public class C1013s {

    /* renamed from: a */
    private static final AtomicInteger f4753a = new AtomicInteger(1);

    /* renamed from: b */
    private static Field f4754b;

    /* renamed from: c */
    private static boolean f4755c;

    /* renamed from: d */
    private static Field f4756d;

    /* renamed from: e */
    private static boolean f4757e;

    /* renamed from: f */
    private static WeakHashMap<View, String> f4758f;

    /* renamed from: g */
    private static WeakHashMap<View, C1028w> f4759g = null;

    /* renamed from: h */
    private static Field f4760h;

    /* renamed from: i */
    private static boolean f4761i = false;

    /* renamed from: j */
    private static ThreadLocal<Rect> f4762j;

    /* renamed from: k */
    private static final int[] f4763k = {C0899b.accessibility_custom_action_0, C0899b.accessibility_custom_action_1, C0899b.accessibility_custom_action_2, C0899b.accessibility_custom_action_3, C0899b.accessibility_custom_action_4, C0899b.accessibility_custom_action_5, C0899b.accessibility_custom_action_6, C0899b.accessibility_custom_action_7, C0899b.accessibility_custom_action_8, C0899b.accessibility_custom_action_9, C0899b.accessibility_custom_action_10, C0899b.accessibility_custom_action_11, C0899b.accessibility_custom_action_12, C0899b.accessibility_custom_action_13, C0899b.accessibility_custom_action_14, C0899b.accessibility_custom_action_15, C0899b.accessibility_custom_action_16, C0899b.accessibility_custom_action_17, C0899b.accessibility_custom_action_18, C0899b.accessibility_custom_action_19, C0899b.accessibility_custom_action_20, C0899b.accessibility_custom_action_21, C0899b.accessibility_custom_action_22, C0899b.accessibility_custom_action_23, C0899b.accessibility_custom_action_24, C0899b.accessibility_custom_action_25, C0899b.accessibility_custom_action_26, C0899b.accessibility_custom_action_27, C0899b.accessibility_custom_action_28, C0899b.accessibility_custom_action_29, C0899b.accessibility_custom_action_30, C0899b.accessibility_custom_action_31};

    /* renamed from: l */
    private static ViewTreeObserver$OnGlobalLayoutListenerC1018e f4764l = new ViewTreeObserver$OnGlobalLayoutListenerC1018e();

    /* access modifiers changed from: package-private */
    /* renamed from: b.g.k.s$a */
    public class View$OnApplyWindowInsetsListenerC1014a implements View.OnApplyWindowInsetsListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC1010p f4765a;

        View$OnApplyWindowInsetsListenerC1014a(AbstractC1010p pVar) {
            this.f4765a = pVar;
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            return this.f4765a.mo340a(view, C0964a0.m5510p(windowInsets)).mo5425o();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.g.k.s$b */
    public class C1015b extends AbstractC1019f<Boolean> {
        C1015b(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public Boolean mo5557d(View view) {
            return Boolean.valueOf(view.isScreenReaderFocusable());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo5558e(View view, Boolean bool) {
            view.setScreenReaderFocusable(bool.booleanValue());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo5559h(Boolean bool, Boolean bool2) {
            return !mo5572a(bool, bool2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.g.k.s$c */
    public class C1016c extends AbstractC1019f<CharSequence> {
        C1016c(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public CharSequence mo5557d(View view) {
            return view.getAccessibilityPaneTitle();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo5558e(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo5559h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.g.k.s$d */
    public class C1017d extends AbstractC1019f<Boolean> {
        C1017d(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public Boolean mo5557d(View view) {
            return Boolean.valueOf(view.isAccessibilityHeading());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo5558e(View view, Boolean bool) {
            view.setAccessibilityHeading(bool.booleanValue());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo5559h(Boolean bool, Boolean bool2) {
            return !mo5572a(bool, bool2);
        }
    }

    /* renamed from: b.g.k.s$e */
    static class ViewTreeObserver$OnGlobalLayoutListenerC1018e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: b */
        private WeakHashMap<View, Boolean> f4766b = new WeakHashMap<>();

        ViewTreeObserver$OnGlobalLayoutListenerC1018e() {
        }

        /* renamed from: a */
        private void m5819a(View view, boolean z) {
            boolean z2 = view.getVisibility() == 0;
            if (z != z2) {
                if (z2) {
                    C1013s.m5741S(view, 16);
                }
                this.f4766b.put(view, Boolean.valueOf(z2));
            }
        }

        /* renamed from: b */
        private void m5820b(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        public void onGlobalLayout() {
            for (Map.Entry<View, Boolean> entry : this.f4766b.entrySet()) {
                m5819a(entry.getKey(), entry.getValue().booleanValue());
            }
        }

        public void onViewAttachedToWindow(View view) {
            m5820b(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.g.k.s$f */
    public static abstract class AbstractC1019f<T> {

        /* renamed from: a */
        private final int f4767a;

        /* renamed from: b */
        private final Class<T> f4768b;

        /* renamed from: c */
        private final int f4769c;

        AbstractC1019f(int i, Class<T> cls, int i2) {
            this(i, cls, 0, i2);
        }

        AbstractC1019f(int i, Class<T> cls, int i2, int i3) {
            this.f4767a = i;
            this.f4768b = cls;
            this.f4769c = i3;
        }

        /* renamed from: b */
        private boolean m5821b() {
            return Build.VERSION.SDK_INT >= 19;
        }

        /* renamed from: c */
        private boolean m5822c() {
            return Build.VERSION.SDK_INT >= this.f4769c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo5572a(Boolean bool, Boolean bool2) {
            return (bool == null ? false : bool.booleanValue()) == (bool2 == null ? false : bool2.booleanValue());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract T mo5557d(View view);

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public abstract void mo5558e(View view, T t);

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public T mo5573f(View view) {
            if (m5822c()) {
                return mo5557d(view);
            }
            if (!m5821b()) {
                return null;
            }
            T t = (T) view.getTag(this.f4767a);
            if (this.f4768b.isInstance(t)) {
                return t;
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo5574g(View view, T t) {
            if (m5822c()) {
                mo5558e(view, t);
            } else if (m5821b() && mo5559h(mo5573f(view), t)) {
                C1013s.m5724B(view);
                view.setTag(this.f4767a, t);
                C1013s.m5741S(view, 0);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public abstract boolean mo5559h(T t, T t2);
    }

    /* renamed from: b.g.k.s$g */
    private static class C1020g {
        /* renamed from: a */
        static C0964a0 m5829a(View view, C0964a0 a0Var, Rect rect) {
            WindowInsets o = a0Var.mo5425o();
            if (o != null) {
                return C0964a0.m5510p(view.computeSystemWindowInsets(o, rect));
            }
            rect.setEmpty();
            return a0Var;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b.g.k.s$h */
    public static class C1021h {
        /* renamed from: a */
        public static WindowInsets m5830a(View view) {
            return view.getRootWindowInsets();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b.g.k.s$i */
    public static class C1022i {
        /* renamed from: a */
        static void m5831a(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    /* renamed from: b.g.k.s$j */
    public interface AbstractC1023j {
        /* renamed from: a */
        boolean mo5575a(View view, KeyEvent keyEvent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.g.k.s$k */
    public static class C1024k {

        /* renamed from: a */
        private static final ArrayList<WeakReference<View>> f4770a = new ArrayList<>();

        /* renamed from: b */
        private WeakHashMap<View, Boolean> f4771b = null;

        /* renamed from: c */
        private SparseArray<WeakReference<View>> f4772c = null;

        /* renamed from: d */
        private WeakReference<KeyEvent> f4773d = null;

        C1024k() {
        }

        /* renamed from: a */
        static C1024k m5833a(View view) {
            int i = C0899b.tag_unhandled_key_event_manager;
            C1024k kVar = (C1024k) view.getTag(i);
            if (kVar != null) {
                return kVar;
            }
            C1024k kVar2 = new C1024k();
            view.setTag(i, kVar2);
            return kVar2;
        }

        /* renamed from: c */
        private View m5834c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f4771b;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c = m5834c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c != null) {
                            return c;
                        }
                    }
                }
                if (m5836e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /* renamed from: d */
        private SparseArray<WeakReference<View>> m5835d() {
            if (this.f4772c == null) {
                this.f4772c = new SparseArray<>();
            }
            return this.f4772c;
        }

        /* renamed from: e */
        private boolean m5836e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(C0899b.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((AbstractC1023j) arrayList.get(size)).mo5575a(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: g */
        private void m5837g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f4771b;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f4770a;
            if (!arrayList.isEmpty()) {
                synchronized (arrayList) {
                    if (this.f4771b == null) {
                        this.f4771b = new WeakHashMap<>();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList<WeakReference<View>> arrayList2 = f4770a;
                        View view = arrayList2.get(size).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f4771b.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f4771b.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo5576b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                m5837g();
            }
            View c = m5834c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c != null && !KeyEvent.isModifierKey(keyCode)) {
                    m5835d().put(keyCode, new WeakReference<>(c));
                }
            }
            return c != null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public boolean mo5577f(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.f4773d;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f4773d = new WeakReference<>(keyEvent);
            WeakReference<View> weakReference2 = null;
            SparseArray<WeakReference<View>> d = m5835d();
            if (keyEvent.getAction() == 1 && (indexOfKey = d.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReference2 = d.valueAt(indexOfKey);
                d.removeAt(indexOfKey);
            }
            if (weakReference2 == null) {
                weakReference2 = d.get(keyEvent.getKeyCode());
            }
            if (weakReference2 == null) {
                return false;
            }
            View view = weakReference2.get();
            if (view != null && C1013s.m5736N(view)) {
                m5836e(view, keyEvent);
            }
            return true;
        }
    }

    /* renamed from: A */
    public static int m5722A(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumWidth();
        }
        if (!f4755c) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinWidth");
                f4754b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f4755c = true;
        }
        Field field = f4754b;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    /* renamed from: A0 */
    private static void m5723A0(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    /* renamed from: B */
    static C0962a m5724B(View view) {
        C0962a j = m5767j(view);
        if (j == null) {
            j = new C0962a();
        }
        m5766i0(view, j);
        return j;
    }

    /* renamed from: C */
    public static int m5725C(View view) {
        return Build.VERSION.SDK_INT >= 17 ? view.getPaddingEnd() : view.getPaddingRight();
    }

    /* renamed from: D */
    public static int m5726D(View view) {
        return Build.VERSION.SDK_INT >= 17 ? view.getPaddingStart() : view.getPaddingLeft();
    }

    /* renamed from: E */
    public static ViewParent m5727E(View view) {
        return Build.VERSION.SDK_INT >= 16 ? view.getParentForAccessibility() : view.getParent();
    }

    /* renamed from: F */
    public static C0964a0 m5728F(View view) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C0964a0.m5510p(C1021h.m5830a(view));
        }
        return null;
    }

    /* renamed from: G */
    public static String m5729G(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap<View, String> weakHashMap = f4758f;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    /* renamed from: H */
    public static int m5730H(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getWindowSystemUiVisibility();
        }
        return 0;
    }

    /* renamed from: I */
    public static float m5731I(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }

    /* renamed from: J */
    public static boolean m5732J(View view) {
        if (Build.VERSION.SDK_INT >= 15) {
            return view.hasOnClickListeners();
        }
        return false;
    }

    /* renamed from: K */
    public static boolean m5733K(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasOverlappingRendering();
        }
        return true;
    }

    /* renamed from: L */
    public static boolean m5734L(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasTransientState();
        }
        return false;
    }

    /* renamed from: M */
    public static boolean m5735M(View view) {
        Boolean f = m5749a().mo5573f(view);
        if (f == null) {
            return false;
        }
        return f.booleanValue();
    }

    /* renamed from: N */
    public static boolean m5736N(View view) {
        return Build.VERSION.SDK_INT >= 19 ? view.isAttachedToWindow() : view.getWindowToken() != null;
    }

    /* renamed from: O */
    public static boolean m5737O(View view) {
        return Build.VERSION.SDK_INT >= 19 ? view.isLaidOut() : view.getWidth() > 0 && view.getHeight() > 0;
    }

    /* renamed from: P */
    public static boolean m5738P(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.isNestedScrollingEnabled();
        }
        if (view instanceof AbstractC1004j) {
            return ((AbstractC1004j) view).isNestedScrollingEnabled();
        }
        return false;
    }

    /* renamed from: Q */
    public static boolean m5739Q(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.isPaddingRelative();
        }
        return false;
    }

    /* renamed from: R */
    public static boolean m5740R(View view) {
        Boolean f = m5764h0().mo5573f(view);
        if (f == null) {
            return false;
        }
        return f.booleanValue();
    }

    /* renamed from: S */
    static void m5741S(View view, int i) {
        if (((AccessibilityManager) view.getContext().getSystemService("accessibility")).isEnabled()) {
            boolean z = m5775n(view) != null;
            if (m5773m(view) != 0 || (z && view.getVisibility() == 0)) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z ? 32 : 2048);
                obtain.setContentChangeTypes(i);
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                } catch (AbstractMethodError e) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e);
                }
            }
        }
    }

    /* renamed from: T */
    public static void m5742T(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetLeftAndRight(i);
        } else if (i2 >= 21) {
            Rect u = m5789u();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                u.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !u.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m5755d(view, i);
            if (z && u.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(u);
            }
        } else {
            m5755d(view, i);
        }
    }

    /* renamed from: U */
    public static void m5743U(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetTopAndBottom(i);
        } else if (i2 >= 21) {
            Rect u = m5789u();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                u.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !u.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m5757e(view, i);
            if (z && u.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(u);
            }
        } else {
            m5757e(view, i);
        }
    }

    /* renamed from: V */
    public static C0964a0 m5744V(View view, C0964a0 a0Var) {
        WindowInsets o;
        if (Build.VERSION.SDK_INT >= 21 && (o = a0Var.mo5425o()) != null) {
            WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(o);
            if (!onApplyWindowInsets.equals(o)) {
                return C0964a0.m5510p(onApplyWindowInsets);
            }
        }
        return a0Var;
    }

    /* renamed from: W */
    public static void m5745W(View view, C0979c cVar) {
        view.onInitializeAccessibilityNodeInfo(cVar.mo5448A0());
    }

    /* renamed from: X */
    private static AbstractC1019f<CharSequence> m5746X() {
        return new C1016c(C0899b.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    /* renamed from: Y */
    public static boolean m5747Y(View view, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.performAccessibilityAction(i, bundle);
        }
        return false;
    }

    /* renamed from: Z */
    public static void m5748Z(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidate();
        }
    }

    /* renamed from: a */
    private static AbstractC1019f<Boolean> m5749a() {
        return new C1017d(C0899b.tag_accessibility_heading, Boolean.class, 28);
    }

    /* renamed from: a0 */
    public static void m5750a0(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    /* renamed from: b */
    private static void m5751b(View view, C0979c.C0980a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            m5724B(view);
            m5756d0(aVar.mo5515b(), view);
            m5777o(view).add(aVar);
            m5741S(view, 0);
        }
    }

    /* renamed from: b0 */
    public static void m5752b0(View view, Runnable runnable, long j) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimationDelayed(runnable, j);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j);
        }
    }

    /* renamed from: c */
    public static C1028w m5753c(View view) {
        if (f4759g == null) {
            f4759g = new WeakHashMap<>();
        }
        C1028w wVar = f4759g.get(view);
        if (wVar != null) {
            return wVar;
        }
        C1028w wVar2 = new C1028w(view);
        f4759g.put(view, wVar2);
        return wVar2;
    }

    /* renamed from: c0 */
    public static void m5754c0(View view, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            m5756d0(i, view);
            m5741S(view, 0);
        }
    }

    /* renamed from: d */
    private static void m5755d(View view, int i) {
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            m5723A0(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m5723A0((View) parent);
            }
        }
    }

    /* renamed from: d0 */
    private static void m5756d0(int i, View view) {
        List<C0979c.C0980a> o = m5777o(view);
        for (int i2 = 0; i2 < o.size(); i2++) {
            if (o.get(i2).mo5515b() == i) {
                o.remove(i2);
                return;
            }
        }
    }

    /* renamed from: e */
    private static void m5757e(View view, int i) {
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            m5723A0(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m5723A0((View) parent);
            }
        }
    }

    /* renamed from: e0 */
    public static void m5758e0(View view, C0979c.C0980a aVar, CharSequence charSequence, AbstractC0987f fVar) {
        if (fVar == null && charSequence == null) {
            m5754c0(view, aVar.mo5515b());
        } else {
            m5751b(view, aVar.mo5514a(charSequence, fVar));
        }
    }

    /* renamed from: f */
    public static C0964a0 m5759f(View view, C0964a0 a0Var, Rect rect) {
        return Build.VERSION.SDK_INT >= 21 ? C1020g.m5829a(view, a0Var, rect) : a0Var;
    }

    /* renamed from: f0 */
    public static void m5760f0(View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            view.requestApplyInsets();
        } else if (i >= 16) {
            view.requestFitSystemWindows();
        }
    }

    /* renamed from: g */
    public static C0964a0 m5761g(View view, C0964a0 a0Var) {
        WindowInsets o;
        return (Build.VERSION.SDK_INT < 21 || (o = a0Var.mo5425o()) == null || view.dispatchApplyWindowInsets(o).equals(o)) ? a0Var : C0964a0.m5510p(o);
    }

    /* renamed from: g0 */
    public static void m5762g0(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            C1022i.m5831a(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    /* renamed from: h */
    static boolean m5763h(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C1024k.m5833a(view).mo5576b(view, keyEvent);
    }

    /* renamed from: h0 */
    private static AbstractC1019f<Boolean> m5764h0() {
        return new C1015b(C0899b.tag_screen_reader_focusable, Boolean.class, 28);
    }

    /* renamed from: i */
    static boolean m5765i(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C1024k.m5833a(view).mo5577f(keyEvent);
    }

    /* renamed from: i0 */
    public static void m5766i0(View view, C0962a aVar) {
        if (aVar == null && (m5769k(view) instanceof C0962a.C0963a)) {
            aVar = new C0962a();
        }
        view.setAccessibilityDelegate(aVar == null ? null : aVar.mo5400d());
    }

    /* renamed from: j */
    public static C0962a m5767j(View view) {
        View.AccessibilityDelegate k = m5769k(view);
        if (k == null) {
            return null;
        }
        return k instanceof C0962a.C0963a ? ((C0962a.C0963a) k).f4662a : new C0962a(k);
    }

    /* renamed from: j0 */
    public static void m5768j0(View view, boolean z) {
        m5749a().mo5574g(view, Boolean.valueOf(z));
    }

    /* renamed from: k */
    private static View.AccessibilityDelegate m5769k(View view) {
        return Build.VERSION.SDK_INT >= 29 ? view.getAccessibilityDelegate() : m5771l(view);
    }

    /* renamed from: k0 */
    public static void m5770k0(View view, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            view.setAccessibilityLiveRegion(i);
        }
    }

    /* renamed from: l */
    private static View.AccessibilityDelegate m5771l(View view) {
        if (f4761i) {
            return null;
        }
        if (f4760h == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f4760h = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f4761i = true;
                return null;
            }
        }
        try {
            Object obj = f4760h.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f4761i = true;
            return null;
        }
    }

    /* renamed from: l0 */
    public static void m5772l0(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    /* renamed from: m */
    public static int m5773m(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.getAccessibilityLiveRegion();
        }
        return 0;
    }

    /* renamed from: m0 */
    public static void m5774m0(View view, ColorStateList colorStateList) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            view.setBackgroundTintList(colorStateList);
            if (i == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof AbstractC1012r) {
            ((AbstractC1012r) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    /* renamed from: n */
    public static CharSequence m5775n(View view) {
        return m5746X().mo5573f(view);
    }

    /* renamed from: n0 */
    public static void m5776n0(View view, PorterDuff.Mode mode) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            view.setBackgroundTintMode(mode);
            if (i == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof AbstractC1012r) {
            ((AbstractC1012r) view).setSupportBackgroundTintMode(mode);
        }
    }

    /* renamed from: o */
    private static List<C0979c.C0980a> m5777o(View view) {
        int i = C0899b.tag_accessibility_actions;
        ArrayList arrayList = (ArrayList) view.getTag(i);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(i, arrayList2);
        return arrayList2;
    }

    /* renamed from: o0 */
    public static void m5778o0(View view, Rect rect) {
        if (Build.VERSION.SDK_INT >= 18) {
            view.setClipBounds(rect);
        }
    }

    /* renamed from: p */
    public static ColorStateList m5779p(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        if (view instanceof AbstractC1012r) {
            return ((AbstractC1012r) view).getSupportBackgroundTintList();
        }
        return null;
    }

    /* renamed from: p0 */
    public static void m5780p0(View view, float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setElevation(f);
        }
    }

    /* renamed from: q */
    public static PorterDuff.Mode m5781q(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintMode();
        }
        if (view instanceof AbstractC1012r) {
            return ((AbstractC1012r) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    @Deprecated
    /* renamed from: q0 */
    public static void m5782q0(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    /* renamed from: r */
    public static Rect m5783r(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return view.getClipBounds();
        }
        return null;
    }

    /* renamed from: r0 */
    public static void m5784r0(View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setHasTransientState(z);
        }
    }

    /* renamed from: s */
    public static Display m5785s(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getDisplay();
        }
        if (m5736N(view)) {
            return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        }
        return null;
    }

    /* renamed from: s0 */
    public static void m5786s0(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 19) {
            if (i2 < 16) {
                return;
            }
            if (i == 4) {
                i = 2;
            }
        }
        view.setImportantForAccessibility(i);
    }

    /* renamed from: t */
    public static float m5787t(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getElevation();
        }
        return 0.0f;
    }

    /* renamed from: t0 */
    public static void m5788t0(View view, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setImportantForAutofill(i);
        }
    }

    /* renamed from: u */
    private static Rect m5789u() {
        if (f4762j == null) {
            f4762j = new ThreadLocal<>();
        }
        Rect rect = f4762j.get();
        if (rect == null) {
            rect = new Rect();
            f4762j.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    /* renamed from: u0 */
    public static void m5790u0(View view, AbstractC1010p pVar) {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (pVar == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new View$OnApplyWindowInsetsListenerC1014a(pVar));
        }
    }

    /* renamed from: v */
    public static boolean m5791v(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getFitsSystemWindows();
        }
        return false;
    }

    /* renamed from: v0 */
    public static void m5792v0(View view, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setPaddingRelative(i, i2, i3, i4);
        } else {
            view.setPadding(i, i2, i3, i4);
        }
    }

    /* renamed from: w */
    public static int m5793w(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getImportantForAccessibility();
        }
        return 0;
    }

    /* renamed from: w0 */
    public static void m5794w0(View view, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i, i2);
        }
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: x */
    public static int m5795x(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.getImportantForAutofill();
        }
        return 0;
    }

    /* renamed from: x0 */
    public static void m5796x0(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (f4758f == null) {
            f4758f = new WeakHashMap<>();
        }
        f4758f.put(view, str);
    }

    /* renamed from: y */
    public static int m5797y(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }

    /* renamed from: y0 */
    public static void m5798y0(View view, float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setZ(f);
        }
    }

    /* renamed from: z */
    public static int m5799z(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumHeight();
        }
        if (!f4757e) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinHeight");
                f4756d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f4757e = true;
        }
        Field field = f4756d;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    /* renamed from: z0 */
    public static void m5800z0(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.stopNestedScroll();
        } else if (view instanceof AbstractC1004j) {
            ((AbstractC1004j) view).stopNestedScroll();
        }
    }
}
