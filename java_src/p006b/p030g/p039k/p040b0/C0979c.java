package p006b.p030g.p039k.p040b0;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p006b.p030g.C0899b;
import p006b.p030g.p039k.p040b0.AbstractC0987f;

/* renamed from: b.g.k.b0.c */
public class C0979c {

    /* renamed from: a */
    private static int f4686a;

    /* renamed from: b */
    private final AccessibilityNodeInfo f4687b;

    /* renamed from: c */
    public int f4688c = -1;

    /* renamed from: d */
    private int f4689d = -1;

    /* renamed from: b.g.k.b0.c$a */
    public static class C0980a {

        /* renamed from: A */
        public static final C0980a f4690A;

        /* renamed from: B */
        public static final C0980a f4691B;

        /* renamed from: C */
        public static final C0980a f4692C;

        /* renamed from: D */
        public static final C0980a f4693D;

        /* renamed from: E */
        public static final C0980a f4694E;

        /* renamed from: F */
        public static final C0980a f4695F;

        /* renamed from: G */
        public static final C0980a f4696G;

        /* renamed from: H */
        public static final C0980a f4697H;

        /* renamed from: I */
        public static final C0980a f4698I;

        /* renamed from: J */
        public static final C0980a f4699J;

        /* renamed from: K */
        public static final C0980a f4700K;

        /* renamed from: a */
        public static final C0980a f4701a = new C0980a(1, null);

        /* renamed from: b */
        public static final C0980a f4702b = new C0980a(2, null);

        /* renamed from: c */
        public static final C0980a f4703c = new C0980a(4, null);

        /* renamed from: d */
        public static final C0980a f4704d = new C0980a(8, null);

        /* renamed from: e */
        public static final C0980a f4705e = new C0980a(16, null);

        /* renamed from: f */
        public static final C0980a f4706f = new C0980a(32, null);

        /* renamed from: g */
        public static final C0980a f4707g = new C0980a(64, null);

        /* renamed from: h */
        public static final C0980a f4708h = new C0980a(128, null);

        /* renamed from: i */
        public static final C0980a f4709i = new C0980a(256, null, AbstractC0987f.C0989b.class);

        /* renamed from: j */
        public static final C0980a f4710j = new C0980a(512, null, AbstractC0987f.C0989b.class);

        /* renamed from: k */
        public static final C0980a f4711k = new C0980a(1024, null, AbstractC0987f.C0990c.class);

        /* renamed from: l */
        public static final C0980a f4712l = new C0980a(2048, null, AbstractC0987f.C0990c.class);

        /* renamed from: m */
        public static final C0980a f4713m = new C0980a(4096, null);

        /* renamed from: n */
        public static final C0980a f4714n = new C0980a(8192, null);

        /* renamed from: o */
        public static final C0980a f4715o = new C0980a(16384, null);

        /* renamed from: p */
        public static final C0980a f4716p = new C0980a(32768, null);

        /* renamed from: q */
        public static final C0980a f4717q = new C0980a(65536, null);

        /* renamed from: r */
        public static final C0980a f4718r = new C0980a(131072, null, AbstractC0987f.C0994g.class);

        /* renamed from: s */
        public static final C0980a f4719s = new C0980a(262144, null);

        /* renamed from: t */
        public static final C0980a f4720t = new C0980a(524288, null);

        /* renamed from: u */
        public static final C0980a f4721u = new C0980a(1048576, null);

        /* renamed from: v */
        public static final C0980a f4722v = new C0980a(2097152, null, AbstractC0987f.C0995h.class);

        /* renamed from: w */
        public static final C0980a f4723w;

        /* renamed from: x */
        public static final C0980a f4724x;

        /* renamed from: y */
        public static final C0980a f4725y;

        /* renamed from: z */
        public static final C0980a f4726z;

        /* renamed from: L */
        final Object f4727L;

        /* renamed from: M */
        private final int f4728M;

        /* renamed from: N */
        private final Class<? extends AbstractC0987f.AbstractC0988a> f4729N;

        /* renamed from: O */
        protected final AbstractC0987f f4730O;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
            int i = Build.VERSION.SDK_INT;
            f4723w = new C0980a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, 16908342, null, null, null);
            f4724x = new C0980a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, 16908343, null, null, AbstractC0987f.C0992e.class);
            f4725y = new C0980a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, null, null, null);
            f4726z = new C0980a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, 16908345, null, null, null);
            f4690A = new C0980a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346, null, null, null);
            f4691B = new C0980a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, 16908347, null, null, null);
            f4692C = new C0980a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, null, null, null);
            f4693D = new C0980a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, null, null, null);
            f4694E = new C0980a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, null, null, null);
            f4695F = new C0980a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, null, null, null);
            f4696G = new C0980a(i >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, 16908348, null, null, null);
            f4697H = new C0980a(i >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, null, null, AbstractC0987f.C0993f.class);
            f4698I = new C0980a(i >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, null, null, AbstractC0987f.C0991d.class);
            f4699J = new C0980a(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, null, null, null);
            if (i >= 28) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            }
            f4700K = new C0980a(accessibilityAction, 16908357, null, null, null);
        }

        public C0980a(int i, CharSequence charSequence) {
            this(null, i, charSequence, null, null);
        }

        private C0980a(int i, CharSequence charSequence, Class<? extends AbstractC0987f.AbstractC0988a> cls) {
            this(null, i, charSequence, null, cls);
        }

        C0980a(Object obj) {
            this(obj, 0, null, null, null);
        }

        C0980a(Object obj, int i, CharSequence charSequence, AbstractC0987f fVar, Class<? extends AbstractC0987f.AbstractC0988a> cls) {
            this.f4728M = i;
            this.f4730O = fVar;
            if (Build.VERSION.SDK_INT >= 21 && obj == null) {
                obj = new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
            }
            this.f4727L = obj;
            this.f4729N = cls;
        }

        /* renamed from: a */
        public C0980a mo5514a(CharSequence charSequence, AbstractC0987f fVar) {
            return new C0980a(null, this.f4728M, charSequence, fVar, this.f4729N);
        }

        /* renamed from: b */
        public int mo5515b() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f4727L).getId();
            }
            return 0;
        }

        /* renamed from: c */
        public CharSequence mo5516c() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f4727L).getLabel();
            }
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0025  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0028  */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo5517d(android.view.View r5, android.os.Bundle r6) {
            /*
                r4 = this;
                b.g.k.b0.f r0 = r4.f4730O
                r1 = 0
                if (r0 == 0) goto L_0x0049
                r0 = 0
                java.lang.Class<? extends b.g.k.b0.f$a> r2 = r4.f4729N
                if (r2 == 0) goto L_0x0042
                java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0020 }
                java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch:{ Exception -> 0x0020 }
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0020 }
                java.lang.Object r1 = r2.newInstance(r1)     // Catch:{ Exception -> 0x0020 }
                b.g.k.b0.f$a r1 = (p006b.p030g.p039k.p040b0.AbstractC0987f.AbstractC0988a) r1     // Catch:{ Exception -> 0x0020 }
                r1.mo5530a(r6)     // Catch:{ Exception -> 0x001d }
                r0 = r1
                goto L_0x0042
            L_0x001d:
                r6 = move-exception
                r0 = r1
                goto L_0x0021
            L_0x0020:
                r6 = move-exception
            L_0x0021:
                java.lang.Class<? extends b.g.k.b0.f$a> r1 = r4.f4729N
                if (r1 != 0) goto L_0x0028
                java.lang.String r1 = "null"
                goto L_0x002c
            L_0x0028:
                java.lang.String r1 = r1.getName()
            L_0x002c:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Failed to execute command with argument class ViewCommandArgument: "
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                java.lang.String r2 = "A11yActionCompat"
                android.util.Log.e(r2, r1, r6)
            L_0x0042:
                b.g.k.b0.f r6 = r4.f4730O
                boolean r5 = r6.mo5529a(r5, r0)
                return r5
            L_0x0049:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p006b.p030g.p039k.p040b0.C0979c.C0980a.mo5517d(android.view.View, android.os.Bundle):boolean");
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof C0980a)) {
                return false;
            }
            Object obj2 = this.f4727L;
            Object obj3 = ((C0980a) obj).f4727L;
            return obj2 == null ? obj3 == null : obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.f4727L;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
    }

    /* renamed from: b.g.k.b0.c$b */
    public static class C0981b {

        /* renamed from: a */
        final Object f4731a;

        C0981b(Object obj) {
            this.f4731a = obj;
        }

        /* renamed from: a */
        public static C0981b m5654a(int i, int i2, boolean z) {
            return Build.VERSION.SDK_INT >= 19 ? new C0981b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z)) : new C0981b(null);
        }

        /* renamed from: b */
        public static C0981b m5655b(int i, int i2, boolean z, int i3) {
            int i4 = Build.VERSION.SDK_INT;
            return i4 >= 21 ? new C0981b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3)) : i4 >= 19 ? new C0981b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z)) : new C0981b(null);
        }
    }

    /* renamed from: b.g.k.b0.c$c */
    public static class C0982c {

        /* renamed from: a */
        final Object f4732a;

        C0982c(Object obj) {
            this.f4732a = obj;
        }

        /* renamed from: a */
        public static C0982c m5656a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            int i5 = Build.VERSION.SDK_INT;
            return i5 >= 21 ? new C0982c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2)) : i5 >= 19 ? new C0982c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z)) : new C0982c(null);
        }
    }

    private C0979c(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f4687b = accessibilityNodeInfo;
    }

    /* renamed from: B0 */
    public static C0979c m5570B0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C0979c(accessibilityNodeInfo);
    }

    /* renamed from: N */
    public static C0979c m5571N() {
        return m5570B0(AccessibilityNodeInfo.obtain());
    }

    /* renamed from: O */
    public static C0979c m5572O(View view) {
        return m5570B0(AccessibilityNodeInfo.obtain(view));
    }

    /* renamed from: P */
    public static C0979c m5573P(C0979c cVar) {
        return m5570B0(AccessibilityNodeInfo.obtain(cVar.f4687b));
    }

    /* renamed from: T */
    private void m5574T(View view) {
        SparseArray<WeakReference<ClickableSpan>> v = m5583v(view);
        if (v != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < v.size(); i++) {
                if (v.valueAt(i).get() == null) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                v.remove(((Integer) arrayList.get(i2)).intValue());
            }
        }
    }

    /* renamed from: V */
    private void m5575V(int i, boolean z) {
        Bundle s = mo5501s();
        if (s != null) {
            int i2 = s.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (i ^ -1);
            if (!z) {
                i = 0;
            }
            s.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    /* renamed from: e */
    private void m5576e(ClickableSpan clickableSpan, Spanned spanned, int i) {
        m5578h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        m5578h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        m5578h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        m5578h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
    }

    /* renamed from: g */
    private void m5577g() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f4687b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            this.f4687b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            this.f4687b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            this.f4687b.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        }
    }

    /* renamed from: h */
    private List<Integer> m5578h(String str) {
        if (Build.VERSION.SDK_INT < 19) {
            return new ArrayList();
        }
        ArrayList<Integer> integerArrayList = this.f4687b.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f4687b.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    /* renamed from: j */
    private static String m5579j(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case 16908354:
                return "ACTION_MOVE_WINDOW";
            default:
                switch (i) {
                    case 16908342:
                        return "ACTION_SHOW_ON_SCREEN";
                    case 16908343:
                        return "ACTION_SCROLL_TO_POSITION";
                    case 16908344:
                        return "ACTION_SCROLL_UP";
                    case 16908345:
                        return "ACTION_SCROLL_LEFT";
                    case 16908346:
                        return "ACTION_SCROLL_DOWN";
                    case 16908347:
                        return "ACTION_SCROLL_RIGHT";
                    case 16908348:
                        return "ACTION_CONTEXT_CLICK";
                    case 16908349:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case 16908356:
                                return "ACTION_SHOW_TOOLTIP";
                            case 16908357:
                                return "ACTION_HIDE_TOOLTIP";
                            case 16908358:
                                return "ACTION_PAGE_UP";
                            case 16908359:
                                return "ACTION_PAGE_DOWN";
                            case 16908360:
                                return "ACTION_PAGE_LEFT";
                            case 16908361:
                                return "ACTION_PAGE_RIGHT";
                            default:
                                return "ACTION_UNKNOWN";
                        }
                }
        }
    }

    /* renamed from: l */
    private boolean m5580l(int i) {
        Bundle s = mo5501s();
        return s != null && (s.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i;
    }

    /* renamed from: q */
    public static ClickableSpan[] m5581q(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    /* renamed from: t */
    private SparseArray<WeakReference<ClickableSpan>> m5582t(View view) {
        SparseArray<WeakReference<ClickableSpan>> v = m5583v(view);
        if (v != null) {
            return v;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(C0899b.tag_accessibility_clickable_spans, sparseArray);
        return sparseArray;
    }

    /* renamed from: v */
    private SparseArray<WeakReference<ClickableSpan>> m5583v(View view) {
        return (SparseArray) view.getTag(C0899b.tag_accessibility_clickable_spans);
    }

    /* renamed from: y */
    private boolean m5584y() {
        return !m5578h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    /* renamed from: z */
    private int m5585z(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                if (clickableSpan.equals(sparseArray.valueAt(i).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        int i2 = f4686a;
        f4686a = i2 + 1;
        return i2;
    }

    /* renamed from: A */
    public boolean mo5447A() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f4687b.isAccessibilityFocused();
        }
        return false;
    }

    /* renamed from: A0 */
    public AccessibilityNodeInfo mo5448A0() {
        return this.f4687b;
    }

    /* renamed from: B */
    public boolean mo5449B() {
        return this.f4687b.isCheckable();
    }

    /* renamed from: C */
    public boolean mo5450C() {
        return this.f4687b.isChecked();
    }

    /* renamed from: D */
    public boolean mo5451D() {
        return this.f4687b.isClickable();
    }

    /* renamed from: E */
    public boolean mo5452E() {
        return this.f4687b.isEnabled();
    }

    /* renamed from: F */
    public boolean mo5453F() {
        return this.f4687b.isFocusable();
    }

    /* renamed from: G */
    public boolean mo5454G() {
        return this.f4687b.isFocused();
    }

    /* renamed from: H */
    public boolean mo5455H() {
        return this.f4687b.isLongClickable();
    }

    /* renamed from: I */
    public boolean mo5456I() {
        return this.f4687b.isPassword();
    }

    /* renamed from: J */
    public boolean mo5457J() {
        return this.f4687b.isScrollable();
    }

    /* renamed from: K */
    public boolean mo5458K() {
        return this.f4687b.isSelected();
    }

    /* renamed from: L */
    public boolean mo5459L() {
        return Build.VERSION.SDK_INT >= 26 ? this.f4687b.isShowingHintText() : m5580l(4);
    }

    /* renamed from: M */
    public boolean mo5460M() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f4687b.isVisibleToUser();
        }
        return false;
    }

    /* renamed from: Q */
    public boolean mo5461Q(int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f4687b.performAction(i, bundle);
        }
        return false;
    }

    /* renamed from: R */
    public void mo5462R() {
        this.f4687b.recycle();
    }

    /* renamed from: S */
    public boolean mo5463S(C0980a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.f4687b.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f4727L);
        }
        return false;
    }

    /* renamed from: U */
    public void mo5464U(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f4687b.setAccessibilityFocused(z);
        }
    }

    @Deprecated
    /* renamed from: W */
    public void mo5465W(Rect rect) {
        this.f4687b.setBoundsInParent(rect);
    }

    /* renamed from: X */
    public void mo5466X(Rect rect) {
        this.f4687b.setBoundsInScreen(rect);
    }

    /* renamed from: Y */
    public void mo5467Y(boolean z) {
        this.f4687b.setCheckable(z);
    }

    /* renamed from: Z */
    public void mo5468Z(boolean z) {
        this.f4687b.setChecked(z);
    }

    /* renamed from: a */
    public void mo5469a(int i) {
        this.f4687b.addAction(i);
    }

    /* renamed from: a0 */
    public void mo5470a0(CharSequence charSequence) {
        this.f4687b.setClassName(charSequence);
    }

    /* renamed from: b */
    public void mo5471b(C0980a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f4687b.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f4727L);
        }
    }

    /* renamed from: b0 */
    public void mo5472b0(boolean z) {
        this.f4687b.setClickable(z);
    }

    /* renamed from: c */
    public void mo5473c(View view) {
        this.f4687b.addChild(view);
    }

    /* renamed from: c0 */
    public void mo5474c0(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f4687b.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((C0981b) obj).f4731a);
        }
    }

    /* renamed from: d */
    public void mo5475d(View view, int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f4687b.addChild(view, i);
        }
    }

    /* renamed from: d0 */
    public void mo5476d0(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f4687b.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((C0982c) obj).f4732a);
        }
    }

    /* renamed from: e0 */
    public void mo5477e0(CharSequence charSequence) {
        this.f4687b.setContentDescription(charSequence);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0979c)) {
            return false;
        }
        C0979c cVar = (C0979c) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f4687b;
        if (accessibilityNodeInfo == null) {
            if (cVar.f4687b != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(cVar.f4687b)) {
            return false;
        }
        return this.f4689d == cVar.f4689d && this.f4688c == cVar.f4688c;
    }

    /* renamed from: f */
    public void mo5479f(CharSequence charSequence, View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19 && i < 26) {
            m5577g();
            m5574T(view);
            ClickableSpan[] q = m5581q(charSequence);
            if (q != null && q.length > 0) {
                mo5501s().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", C0899b.accessibility_action_clickable_span);
                SparseArray<WeakReference<ClickableSpan>> t = m5582t(view);
                for (int i2 = 0; i2 < q.length; i2++) {
                    int z = m5585z(q[i2], t);
                    t.put(z, new WeakReference<>(q[i2]));
                    m5576e(q[i2], (Spanned) charSequence, z);
                }
            }
        }
    }

    /* renamed from: f0 */
    public void mo5480f0(boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f4687b.setDismissable(z);
        }
    }

    /* renamed from: g0 */
    public void mo5481g0(boolean z) {
        this.f4687b.setEnabled(z);
    }

    /* renamed from: h0 */
    public void mo5482h0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f4687b.setError(charSequence);
        }
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f4687b;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* renamed from: i */
    public List<C0980a> mo5484i() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = Build.VERSION.SDK_INT >= 21 ? this.f4687b.getActionList() : null;
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new C0980a(actionList.get(i)));
        }
        return arrayList;
    }

    /* renamed from: i0 */
    public void mo5485i0(boolean z) {
        this.f4687b.setFocusable(z);
    }

    /* renamed from: j0 */
    public void mo5486j0(boolean z) {
        this.f4687b.setFocused(z);
    }

    /* renamed from: k */
    public int mo5487k() {
        return this.f4687b.getActions();
    }

    /* renamed from: k0 */
    public void mo5488k0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f4687b.setHeading(z);
        } else {
            m5575V(2, z);
        }
    }

    /* renamed from: l0 */
    public void mo5489l0(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.f4687b.setHintText(charSequence);
        } else if (i >= 19) {
            this.f4687b.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    @Deprecated
    /* renamed from: m */
    public void mo5490m(Rect rect) {
        this.f4687b.getBoundsInParent(rect);
    }

    /* renamed from: m0 */
    public void mo5491m0(boolean z) {
        this.f4687b.setLongClickable(z);
    }

    /* renamed from: n */
    public void mo5492n(Rect rect) {
        this.f4687b.getBoundsInScreen(rect);
    }

    /* renamed from: n0 */
    public void mo5493n0(int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f4687b.setMaxTextLength(i);
        }
    }

    /* renamed from: o */
    public int mo5494o() {
        return this.f4687b.getChildCount();
    }

    /* renamed from: o0 */
    public void mo5495o0(CharSequence charSequence) {
        this.f4687b.setPackageName(charSequence);
    }

    /* renamed from: p */
    public CharSequence mo5496p() {
        return this.f4687b.getClassName();
    }

    /* renamed from: p0 */
    public void mo5497p0(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f4687b.setPaneTitle(charSequence);
        } else if (i >= 19) {
            this.f4687b.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    /* renamed from: q0 */
    public void mo5498q0(View view) {
        this.f4688c = -1;
        this.f4687b.setParent(view);
    }

    /* renamed from: r */
    public CharSequence mo5499r() {
        return this.f4687b.getContentDescription();
    }

    /* renamed from: r0 */
    public void mo5500r0(View view, int i) {
        this.f4688c = i;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f4687b.setParent(view, i);
        }
    }

    /* renamed from: s */
    public Bundle mo5501s() {
        return Build.VERSION.SDK_INT >= 19 ? this.f4687b.getExtras() : new Bundle();
    }

    /* renamed from: s0 */
    public void mo5502s0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f4687b.setScreenReaderFocusable(z);
        } else {
            m5575V(1, z);
        }
    }

    /* renamed from: t0 */
    public void mo5503t0(boolean z) {
        this.f4687b.setScrollable(z);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        mo5490m(rect);
        sb.append("; boundsInParent: " + rect);
        mo5492n(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(mo5505u());
        sb.append("; className: ");
        sb.append(mo5496p());
        sb.append("; text: ");
        sb.append(mo5508w());
        sb.append("; contentDescription: ");
        sb.append(mo5499r());
        sb.append("; viewId: ");
        sb.append(mo5510x());
        sb.append("; checkable: ");
        sb.append(mo5449B());
        sb.append("; checked: ");
        sb.append(mo5450C());
        sb.append("; focusable: ");
        sb.append(mo5453F());
        sb.append("; focused: ");
        sb.append(mo5454G());
        sb.append("; selected: ");
        sb.append(mo5458K());
        sb.append("; clickable: ");
        sb.append(mo5451D());
        sb.append("; longClickable: ");
        sb.append(mo5455H());
        sb.append("; enabled: ");
        sb.append(mo5452E());
        sb.append("; password: ");
        sb.append(mo5456I());
        sb.append("; scrollable: " + mo5457J());
        sb.append("; [");
        if (Build.VERSION.SDK_INT >= 21) {
            List<C0980a> i = mo5484i();
            for (int i2 = 0; i2 < i.size(); i2++) {
                C0980a aVar = i.get(i2);
                String j = m5579j(aVar.mo5515b());
                if (j.equals("ACTION_UNKNOWN") && aVar.mo5516c() != null) {
                    j = aVar.mo5516c().toString();
                }
                sb.append(j);
                if (i2 != i.size() - 1) {
                    sb.append(", ");
                }
            }
        } else {
            int k = mo5487k();
            while (k != 0) {
                int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(k);
                k &= numberOfTrailingZeros ^ -1;
                sb.append(m5579j(numberOfTrailingZeros));
                if (k != 0) {
                    sb.append(", ");
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: u */
    public CharSequence mo5505u() {
        return this.f4687b.getPackageName();
    }

    /* renamed from: u0 */
    public void mo5506u0(boolean z) {
        this.f4687b.setSelected(z);
    }

    /* renamed from: v0 */
    public void mo5507v0(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f4687b.setShowingHintText(z);
        } else {
            m5575V(4, z);
        }
    }

    /* renamed from: w */
    public CharSequence mo5508w() {
        if (!m5584y()) {
            return this.f4687b.getText();
        }
        List<Integer> h = m5578h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> h2 = m5578h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> h3 = m5578h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> h4 = m5578h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f4687b.getText(), 0, this.f4687b.getText().length()));
        for (int i = 0; i < h.size(); i++) {
            spannableString.setSpan(new C0977a(h4.get(i).intValue(), this, mo5501s().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), h.get(i).intValue(), h2.get(i).intValue(), h3.get(i).intValue());
        }
        return spannableString;
    }

    /* renamed from: w0 */
    public void mo5509w0(View view) {
        this.f4689d = -1;
        this.f4687b.setSource(view);
    }

    /* renamed from: x */
    public String mo5510x() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.f4687b.getViewIdResourceName();
        }
        return null;
    }

    /* renamed from: x0 */
    public void mo5511x0(View view, int i) {
        this.f4689d = i;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f4687b.setSource(view, i);
        }
    }

    /* renamed from: y0 */
    public void mo5512y0(CharSequence charSequence) {
        this.f4687b.setText(charSequence);
    }

    /* renamed from: z0 */
    public void mo5513z0(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f4687b.setVisibleToUser(z);
        }
    }
}
