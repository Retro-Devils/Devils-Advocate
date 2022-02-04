package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.AbstractC0150p;
import androidx.core.widget.C0417h;
import java.lang.reflect.Method;
import p006b.p007a.C0754a;
import p006b.p007a.C0763j;
import p006b.p030g.p039k.C1013s;

/* renamed from: androidx.appcompat.widget.i0 */
public class C0233i0 implements AbstractC0150p {

    /* renamed from: b */
    private static Method f1038b;

    /* renamed from: c */
    private static Method f1039c;

    /* renamed from: d */
    private static Method f1040d;

    /* renamed from: A */
    final RunnableC0240g f1041A;

    /* renamed from: B */
    private final View$OnTouchListenerC0239f f1042B;

    /* renamed from: C */
    private final C0238e f1043C;

    /* renamed from: D */
    private final RunnableC0236c f1044D;

    /* renamed from: E */
    private Runnable f1045E;

    /* renamed from: F */
    final Handler f1046F;

    /* renamed from: G */
    private final Rect f1047G;

    /* renamed from: H */
    private Rect f1048H;

    /* renamed from: I */
    private boolean f1049I;

    /* renamed from: J */
    PopupWindow f1050J;

    /* renamed from: e */
    private Context f1051e;

    /* renamed from: f */
    private ListAdapter f1052f;

    /* renamed from: g */
    C0219e0 f1053g;

    /* renamed from: h */
    private int f1054h;

    /* renamed from: i */
    private int f1055i;

    /* renamed from: j */
    private int f1056j;

    /* renamed from: k */
    private int f1057k;

    /* renamed from: l */
    private int f1058l;

    /* renamed from: m */
    private boolean f1059m;

    /* renamed from: n */
    private boolean f1060n;

    /* renamed from: o */
    private boolean f1061o;

    /* renamed from: p */
    private int f1062p;

    /* renamed from: q */
    private boolean f1063q;

    /* renamed from: r */
    private boolean f1064r;

    /* renamed from: s */
    int f1065s;

    /* renamed from: t */
    private View f1066t;

    /* renamed from: u */
    private int f1067u;

    /* renamed from: v */
    private DataSetObserver f1068v;

    /* renamed from: w */
    private View f1069w;

    /* renamed from: x */
    private Drawable f1070x;

    /* renamed from: y */
    private AdapterView.OnItemClickListener f1071y;

    /* renamed from: z */
    private AdapterView.OnItemSelectedListener f1072z;

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.i0$a */
    public class RunnableC0234a implements Runnable {
        RunnableC0234a() {
        }

        public void run() {
            View t = C0233i0.this.mo1530t();
            if (t != null && t.getWindowToken() != null) {
                C0233i0.this.mo565a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.i0$b */
    public class C0235b implements AdapterView.OnItemSelectedListener {
        C0235b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            C0219e0 e0Var;
            if (i != -1 && (e0Var = C0233i0.this.f1053g) != null) {
                e0Var.setListSelectionHidden(false);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.i0$c */
    public class RunnableC0236c implements Runnable {
        RunnableC0236c() {
        }

        public void run() {
            C0233i0.this.mo1528r();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.i0$d */
    public class C0237d extends DataSetObserver {
        C0237d() {
        }

        public void onChanged() {
            if (C0233i0.this.mo566c()) {
                C0233i0.this.mo565a();
            }
        }

        public void onInvalidated() {
            C0233i0.this.dismiss();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.i0$e */
    public class C0238e implements AbsListView.OnScrollListener {
        C0238e() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1 && !C0233i0.this.mo1506A() && C0233i0.this.f1050J.getContentView() != null) {
                C0233i0 i0Var = C0233i0.this;
                i0Var.f1046F.removeCallbacks(i0Var.f1041A);
                C0233i0.this.f1041A.run();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.i0$f */
    public class View$OnTouchListenerC0239f implements View.OnTouchListener {
        View$OnTouchListenerC0239f() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = C0233i0.this.f1050J) != null && popupWindow.isShowing() && x >= 0 && x < C0233i0.this.f1050J.getWidth() && y >= 0 && y < C0233i0.this.f1050J.getHeight()) {
                C0233i0 i0Var = C0233i0.this;
                i0Var.f1046F.postDelayed(i0Var.f1041A, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                C0233i0 i0Var2 = C0233i0.this;
                i0Var2.f1046F.removeCallbacks(i0Var2.f1041A);
                return false;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.i0$g */
    public class RunnableC0240g implements Runnable {
        RunnableC0240g() {
        }

        public void run() {
            C0219e0 e0Var = C0233i0.this.f1053g;
            if (e0Var != null && C1013s.m5736N(e0Var) && C0233i0.this.f1053g.getCount() > C0233i0.this.f1053g.getChildCount()) {
                int childCount = C0233i0.this.f1053g.getChildCount();
                C0233i0 i0Var = C0233i0.this;
                if (childCount <= i0Var.f1065s) {
                    i0Var.f1050J.setInputMethodMode(2);
                    C0233i0.this.mo565a();
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f1038b = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f1040d = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f1039c = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public C0233i0(Context context) {
        this(context, null, C0754a.listPopupWindowStyle);
    }

    public C0233i0(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public C0233i0(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1054h = -2;
        this.f1055i = -2;
        this.f1058l = 1002;
        this.f1062p = 0;
        this.f1063q = false;
        this.f1064r = false;
        this.f1065s = Integer.MAX_VALUE;
        this.f1067u = 0;
        this.f1041A = new RunnableC0240g();
        this.f1042B = new View$OnTouchListenerC0239f();
        this.f1043C = new C0238e();
        this.f1044D = new RunnableC0236c();
        this.f1047G = new Rect();
        this.f1051e = context;
        this.f1046F = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0763j.f3778o1, i, i2);
        this.f1056j = obtainStyledAttributes.getDimensionPixelOffset(C0763j.f3783p1, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(C0763j.f3788q1, 0);
        this.f1057k = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1059m = true;
        }
        obtainStyledAttributes.recycle();
        C0271q qVar = new C0271q(context, attributeSet, i, i2);
        this.f1050J = qVar;
        qVar.setInputMethodMode(1);
    }

    /* renamed from: C */
    private void m1205C() {
        View view = this.f1066t;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f1066t);
            }
        }
    }

    /* renamed from: N */
    private void m1206N(boolean z) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f1038b;
            if (method != null) {
                try {
                    method.invoke(this.f1050J, Boolean.valueOf(z));
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.f1050J.setIsClippedToScreen(z);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v3, resolved type: android.widget.LinearLayout */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0151  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m1207q() {
        /*
        // Method dump skipped, instructions count: 356
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0233i0.m1207q():int");
    }

    /* renamed from: u */
    private int m1208u(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT > 23) {
            return this.f1050J.getMaxAvailableHeight(view, i, z);
        }
        Method method = f1039c;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.f1050J, view, Integer.valueOf(i), Boolean.valueOf(z))).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.f1050J.getMaxAvailableHeight(view, i);
    }

    /* renamed from: A */
    public boolean mo1506A() {
        return this.f1050J.getInputMethodMode() == 2;
    }

    /* renamed from: B */
    public boolean mo1507B() {
        return this.f1049I;
    }

    /* renamed from: D */
    public void mo1508D(View view) {
        this.f1069w = view;
    }

    /* renamed from: E */
    public void mo1509E(int i) {
        this.f1050J.setAnimationStyle(i);
    }

    /* renamed from: F */
    public void mo1510F(int i) {
        Drawable background = this.f1050J.getBackground();
        if (background != null) {
            background.getPadding(this.f1047G);
            Rect rect = this.f1047G;
            this.f1055i = rect.left + rect.right + i;
            return;
        }
        mo1520Q(i);
    }

    /* renamed from: G */
    public void mo1511G(int i) {
        this.f1062p = i;
    }

    /* renamed from: H */
    public void mo1512H(Rect rect) {
        this.f1048H = rect != null ? new Rect(rect) : null;
    }

    /* renamed from: I */
    public void mo1513I(int i) {
        this.f1050J.setInputMethodMode(i);
    }

    /* renamed from: J */
    public void mo1514J(boolean z) {
        this.f1049I = z;
        this.f1050J.setFocusable(z);
    }

    /* renamed from: K */
    public void mo1515K(PopupWindow.OnDismissListener onDismissListener) {
        this.f1050J.setOnDismissListener(onDismissListener);
    }

    /* renamed from: L */
    public void mo1516L(AdapterView.OnItemClickListener onItemClickListener) {
        this.f1071y = onItemClickListener;
    }

    /* renamed from: M */
    public void mo1517M(boolean z) {
        this.f1061o = true;
        this.f1060n = z;
    }

    /* renamed from: O */
    public void mo1518O(int i) {
        this.f1067u = i;
    }

    /* renamed from: P */
    public void mo1519P(int i) {
        C0219e0 e0Var = this.f1053g;
        if (mo566c() && e0Var != null) {
            e0Var.setListSelectionHidden(false);
            e0Var.setSelection(i);
            if (e0Var.getChoiceMode() != 0) {
                e0Var.setItemChecked(i, true);
            }
        }
    }

    /* renamed from: Q */
    public void mo1520Q(int i) {
        this.f1055i = i;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0150p
    /* renamed from: a */
    public void mo565a() {
        int q = m1207q();
        boolean A = mo1506A();
        C0417h.m2091b(this.f1050J, this.f1058l);
        boolean z = true;
        if (!this.f1050J.isShowing()) {
            int i = this.f1055i;
            if (i == -1) {
                i = -1;
            } else if (i == -2) {
                i = mo1530t().getWidth();
            }
            int i2 = this.f1054h;
            if (i2 == -1) {
                q = -1;
            } else if (i2 != -2) {
                q = i2;
            }
            this.f1050J.setWidth(i);
            this.f1050J.setHeight(q);
            m1206N(true);
            this.f1050J.setOutsideTouchable(!this.f1064r && !this.f1063q);
            this.f1050J.setTouchInterceptor(this.f1042B);
            if (this.f1061o) {
                C0417h.m2090a(this.f1050J, this.f1060n);
            }
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = f1040d;
                if (method != null) {
                    try {
                        method.invoke(this.f1050J, this.f1048H);
                    } catch (Exception e) {
                        Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                    }
                }
            } else {
                this.f1050J.setEpicenterBounds(this.f1048H);
            }
            C0417h.m2092c(this.f1050J, mo1530t(), this.f1056j, this.f1057k, this.f1062p);
            this.f1053g.setSelection(-1);
            if (!this.f1049I || this.f1053g.isInTouchMode()) {
                mo1528r();
            }
            if (!this.f1049I) {
                this.f1046F.post(this.f1044D);
            }
        } else if (C1013s.m5736N(mo1530t())) {
            int i3 = this.f1055i;
            if (i3 == -1) {
                i3 = -1;
            } else if (i3 == -2) {
                i3 = mo1530t().getWidth();
            }
            int i4 = this.f1054h;
            if (i4 == -1) {
                if (!A) {
                    q = -1;
                }
                if (A) {
                    this.f1050J.setWidth(this.f1055i == -1 ? -1 : 0);
                    this.f1050J.setHeight(0);
                } else {
                    this.f1050J.setWidth(this.f1055i == -1 ? -1 : 0);
                    this.f1050J.setHeight(-1);
                }
            } else if (i4 != -2) {
                q = i4;
            }
            PopupWindow popupWindow = this.f1050J;
            if (this.f1064r || this.f1063q) {
                z = false;
            }
            popupWindow.setOutsideTouchable(z);
            this.f1050J.update(mo1530t(), this.f1056j, this.f1057k, i3 < 0 ? -1 : i3, q < 0 ? -1 : q);
        }
    }

    /* renamed from: b */
    public void mo1521b(Drawable drawable) {
        this.f1050J.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0150p
    /* renamed from: c */
    public boolean mo566c() {
        return this.f1050J.isShowing();
    }

    /* renamed from: d */
    public void mo1522d(int i) {
        this.f1056j = i;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0150p
    public void dismiss() {
        this.f1050J.dismiss();
        m1205C();
        this.f1050J.setContentView(null);
        this.f1053g = null;
        this.f1046F.removeCallbacks(this.f1041A);
    }

    /* renamed from: e */
    public int mo1523e() {
        return this.f1056j;
    }

    /* renamed from: h */
    public int mo1524h() {
        if (!this.f1059m) {
            return 0;
        }
        return this.f1057k;
    }

    /* renamed from: j */
    public Drawable mo1525j() {
        return this.f1050J.getBackground();
    }

    @Override // androidx.appcompat.view.menu.AbstractC0150p
    /* renamed from: l */
    public ListView mo571l() {
        return this.f1053g;
    }

    /* renamed from: n */
    public void mo1526n(int i) {
        this.f1057k = i;
        this.f1059m = true;
    }

    /* renamed from: o */
    public void mo1527o(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f1068v;
        if (dataSetObserver == null) {
            this.f1068v = new C0237d();
        } else {
            ListAdapter listAdapter2 = this.f1052f;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1052f = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1068v);
        }
        C0219e0 e0Var = this.f1053g;
        if (e0Var != null) {
            e0Var.setAdapter(this.f1052f);
        }
    }

    /* renamed from: r */
    public void mo1528r() {
        C0219e0 e0Var = this.f1053g;
        if (e0Var != null) {
            e0Var.setListSelectionHidden(true);
            e0Var.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public C0219e0 mo1529s(Context context, boolean z) {
        return new C0219e0(context, z);
    }

    /* renamed from: t */
    public View mo1530t() {
        return this.f1069w;
    }

    /* renamed from: v */
    public Object mo1531v() {
        if (!mo566c()) {
            return null;
        }
        return this.f1053g.getSelectedItem();
    }

    /* renamed from: w */
    public long mo1532w() {
        if (!mo566c()) {
            return Long.MIN_VALUE;
        }
        return this.f1053g.getSelectedItemId();
    }

    /* renamed from: x */
    public int mo1533x() {
        if (!mo566c()) {
            return -1;
        }
        return this.f1053g.getSelectedItemPosition();
    }

    /* renamed from: y */
    public View mo1534y() {
        if (!mo566c()) {
            return null;
        }
        return this.f1053g.getSelectedView();
    }

    /* renamed from: z */
    public int mo1535z() {
        return this.f1055i;
    }
}
