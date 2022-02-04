package p006b.p043i.p045b;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.List;
import p006b.p021d.C0839j;
import p006b.p030g.p039k.C0962a;
import p006b.p030g.p039k.C1013s;
import p006b.p030g.p039k.C1027v;
import p006b.p030g.p039k.p040b0.C0979c;
import p006b.p030g.p039k.p040b0.C0983d;
import p006b.p030g.p039k.p040b0.C0986e;
import p006b.p043i.p045b.C1048b;

/* renamed from: b.i.b.a */
public abstract class AbstractC1044a extends C0962a {

    /* renamed from: d */
    private static final Rect f4803d = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: e */
    private static final C1048b.AbstractC1049a<C0979c> f4804e = new C1045a();

    /* renamed from: f */
    private static final C1048b.AbstractC1050b<C0839j<C0979c>, C0979c> f4805f = new C1046b();

    /* renamed from: g */
    private final Rect f4806g = new Rect();

    /* renamed from: h */
    private final Rect f4807h = new Rect();

    /* renamed from: i */
    private final Rect f4808i = new Rect();

    /* renamed from: j */
    private final int[] f4809j = new int[2];

    /* renamed from: k */
    private final AccessibilityManager f4810k;

    /* renamed from: l */
    private final View f4811l;

    /* renamed from: m */
    private C1047c f4812m;

    /* renamed from: n */
    int f4813n = Integer.MIN_VALUE;

    /* renamed from: o */
    int f4814o = Integer.MIN_VALUE;

    /* renamed from: p */
    private int f4815p = Integer.MIN_VALUE;

    /* renamed from: b.i.b.a$a */
    static class C1045a implements C1048b.AbstractC1049a<C0979c> {
        C1045a() {
        }

        /* renamed from: b */
        public void mo5634a(C0979c cVar, Rect rect) {
            cVar.mo5490m(rect);
        }
    }

    /* renamed from: b.i.b.a$b */
    static class C1046b implements C1048b.AbstractC1050b<C0839j<C0979c>, C0979c> {
        C1046b() {
        }

        /* renamed from: c */
        public C0979c mo5637b(C0839j<C0979c> jVar, int i) {
            return jVar.mo5037m(i);
        }

        /* renamed from: d */
        public int mo5636a(C0839j<C0979c> jVar) {
            return jVar.mo5036l();
        }
    }

    /* renamed from: b.i.b.a$c */
    private class C1047c extends C0983d {
        C1047c() {
        }

        @Override // p006b.p030g.p039k.p040b0.C0983d
        /* renamed from: a */
        public C0979c mo5520a(int i) {
            return C0979c.m5573P(AbstractC1044a.this.mo5619H(i));
        }

        @Override // p006b.p030g.p039k.p040b0.C0983d
        /* renamed from: c */
        public C0979c mo5522c(int i) {
            int i2 = i == 2 ? AbstractC1044a.this.f4813n : AbstractC1044a.this.f4814o;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return mo5520a(i2);
        }

        @Override // p006b.p030g.p039k.p040b0.C0983d
        /* renamed from: e */
        public boolean mo5524e(int i, int i2, Bundle bundle) {
            return AbstractC1044a.this.mo5627P(i, i2, bundle);
        }
    }

    public AbstractC1044a(View view) {
        if (view != null) {
            this.f4811l = view;
            this.f4810k = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (C1013s.m5793w(view) == 0) {
                C1013s.m5786s0(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    /* renamed from: D */
    private static Rect m5893D(View view, int i, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i == 17) {
            rect.set(width, 0, width, height);
        } else if (i == 33) {
            rect.set(0, height, width, height);
        } else if (i == 66) {
            rect.set(-1, 0, -1, height);
        } else if (i == 130) {
            rect.set(0, -1, width, -1);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return rect;
    }

    /* renamed from: E */
    private boolean m5894E(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f4811l.getWindowVisibility() != 0) {
            return false;
        }
        View view = this.f4811l;
        do {
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                view = (View) parent;
                if (view.getAlpha() <= 0.0f) {
                    break;
                }
            } else {
                return parent != null;
            }
        } while (view.getVisibility() == 0);
        return false;
    }

    /* renamed from: F */
    private static int m5895F(int i) {
        if (i == 19) {
            return 33;
        }
        if (i != 21) {
            return i != 22 ? 130 : 66;
        }
        return 17;
    }

    /* renamed from: G */
    private boolean m5896G(int i, Rect rect) {
        Object obj;
        C0839j<C0979c> y = m5908y();
        int i2 = this.f4814o;
        int i3 = Integer.MIN_VALUE;
        C0979c e = i2 == Integer.MIN_VALUE ? null : y.mo5029e(i2);
        if (i == 1 || i == 2) {
            obj = C1048b.m5943d(y, f4805f, f4804e, e, i, C1013s.m5797y(this.f4811l) == 1, false);
        } else if (i == 17 || i == 33 || i == 66 || i == 130) {
            Rect rect2 = new Rect();
            int i4 = this.f4814o;
            if (i4 != Integer.MIN_VALUE) {
                m5909z(i4, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                m5893D(this.f4811l, i, rect2);
            }
            obj = C1048b.m5942c(y, f4805f, f4804e, e, rect2, i);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        C0979c cVar = (C0979c) obj;
        if (cVar != null) {
            i3 = y.mo5033i(y.mo5032h(cVar));
        }
        return mo5628T(i3);
    }

    /* renamed from: Q */
    private boolean m5897Q(int i, int i2, Bundle bundle) {
        return i2 != 1 ? i2 != 2 ? i2 != 64 ? i2 != 128 ? mo5621J(i, i2, bundle) : m5901n(i) : m5899S(i) : mo5630o(i) : mo5628T(i);
    }

    /* renamed from: R */
    private boolean m5898R(int i, Bundle bundle) {
        return C1013s.m5747Y(this.f4811l, i, bundle);
    }

    /* renamed from: S */
    private boolean m5899S(int i) {
        int i2;
        if (!this.f4810k.isEnabled() || !this.f4810k.isTouchExplorationEnabled() || (i2 = this.f4813n) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            m5901n(i2);
        }
        this.f4813n = i;
        this.f4811l.invalidate();
        mo5629U(i, 32768);
        return true;
    }

    /* renamed from: V */
    private void m5900V(int i) {
        int i2 = this.f4815p;
        if (i2 != i) {
            this.f4815p = i;
            mo5629U(i, 128);
            mo5629U(i2, 256);
        }
    }

    /* renamed from: n */
    private boolean m5901n(int i) {
        if (this.f4813n != i) {
            return false;
        }
        this.f4813n = Integer.MIN_VALUE;
        this.f4811l.invalidate();
        mo5629U(i, 65536);
        return true;
    }

    /* renamed from: p */
    private boolean m5902p() {
        int i = this.f4814o;
        return i != Integer.MIN_VALUE && mo5621J(i, 16, null);
    }

    /* renamed from: q */
    private AccessibilityEvent m5903q(int i, int i2) {
        return i != -1 ? m5904r(i, i2) : m5905s(i2);
    }

    /* renamed from: r */
    private AccessibilityEvent m5904r(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        C0979c H = mo5619H(i);
        obtain.getText().add(H.mo5508w());
        obtain.setContentDescription(H.mo5499r());
        obtain.setScrollable(H.mo5457J());
        obtain.setPassword(H.mo5456I());
        obtain.setEnabled(H.mo5452E());
        obtain.setChecked(H.mo5450C());
        mo5623L(i, obtain);
        if (!obtain.getText().isEmpty() || obtain.getContentDescription() != null) {
            obtain.setClassName(H.mo5496p());
            C0986e.m5664c(obtain, this.f4811l, i);
            obtain.setPackageName(this.f4811l.getContext().getPackageName());
            return obtain;
        }
        throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
    }

    /* renamed from: s */
    private AccessibilityEvent m5905s(int i) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i);
        this.f4811l.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    /* renamed from: t */
    private C0979c m5906t(int i) {
        C0979c N = C0979c.m5571N();
        N.mo5481g0(true);
        N.mo5485i0(true);
        N.mo5470a0("android.view.View");
        Rect rect = f4803d;
        N.mo5465W(rect);
        N.mo5466X(rect);
        N.mo5498q0(this.f4811l);
        mo5625N(i, N);
        if (N.mo5508w() == null && N.mo5499r() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        N.mo5490m(this.f4807h);
        if (!this.f4807h.equals(rect)) {
            int k = N.mo5487k();
            if ((k & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((k & 128) == 0) {
                N.mo5495o0(this.f4811l.getContext().getPackageName());
                N.mo5511x0(this.f4811l, i);
                if (this.f4813n == i) {
                    N.mo5464U(true);
                    N.mo5469a(128);
                } else {
                    N.mo5464U(false);
                    N.mo5469a(64);
                }
                boolean z = this.f4814o == i;
                if (z) {
                    N.mo5469a(2);
                } else if (N.mo5453F()) {
                    N.mo5469a(1);
                }
                N.mo5486j0(z);
                this.f4811l.getLocationOnScreen(this.f4809j);
                N.mo5492n(this.f4806g);
                if (this.f4806g.equals(rect)) {
                    N.mo5490m(this.f4806g);
                    if (N.f4688c != -1) {
                        C0979c N2 = C0979c.m5571N();
                        for (int i2 = N.f4688c; i2 != -1; i2 = N2.f4688c) {
                            N2.mo5500r0(this.f4811l, -1);
                            N2.mo5465W(f4803d);
                            mo5625N(i2, N2);
                            N2.mo5490m(this.f4807h);
                            Rect rect2 = this.f4806g;
                            Rect rect3 = this.f4807h;
                            rect2.offset(rect3.left, rect3.top);
                        }
                        N2.mo5462R();
                    }
                    this.f4806g.offset(this.f4809j[0] - this.f4811l.getScrollX(), this.f4809j[1] - this.f4811l.getScrollY());
                }
                if (this.f4811l.getLocalVisibleRect(this.f4808i)) {
                    this.f4808i.offset(this.f4809j[0] - this.f4811l.getScrollX(), this.f4809j[1] - this.f4811l.getScrollY());
                    if (this.f4806g.intersect(this.f4808i)) {
                        N.mo5466X(this.f4806g);
                        if (m5894E(this.f4806g)) {
                            N.mo5513z0(true);
                        }
                    }
                }
                return N;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    /* renamed from: u */
    private C0979c m5907u() {
        C0979c O = C0979c.m5572O(this.f4811l);
        C1013s.m5745W(this.f4811l, O);
        ArrayList arrayList = new ArrayList();
        mo5618C(arrayList);
        if (O.mo5494o() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                O.mo5475d(this.f4811l, ((Integer) arrayList.get(i)).intValue());
            }
            return O;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    /* renamed from: y */
    private C0839j<C0979c> m5908y() {
        ArrayList arrayList = new ArrayList();
        mo5618C(arrayList);
        C0839j<C0979c> jVar = new C0839j<>();
        for (int i = 0; i < arrayList.size(); i++) {
            jVar.mo5034j(i, m5906t(i));
        }
        return jVar;
    }

    /* renamed from: z */
    private void m5909z(int i, Rect rect) {
        mo5619H(i).mo5490m(rect);
    }

    /* renamed from: A */
    public final int mo5616A() {
        return this.f4814o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public abstract int mo5617B(float f, float f2);

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public abstract void mo5618C(List<Integer> list);

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public C0979c mo5619H(int i) {
        return i == -1 ? m5907u() : m5906t(i);
    }

    /* renamed from: I */
    public final void mo5620I(boolean z, int i, Rect rect) {
        int i2 = this.f4814o;
        if (i2 != Integer.MIN_VALUE) {
            mo5630o(i2);
        }
        if (z) {
            m5896G(i, rect);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public abstract boolean mo5621J(int i, int i2, Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public void mo5622K(AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public void mo5623L(int i, AccessibilityEvent accessibilityEvent) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public void mo5624M(C0979c cVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public abstract void mo5625N(int i, C0979c cVar);

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public void mo5626O(int i, boolean z) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public boolean mo5627P(int i, int i2, Bundle bundle) {
        return i != -1 ? m5897Q(i, i2, bundle) : m5898R(i2, bundle);
    }

    /* renamed from: T */
    public final boolean mo5628T(int i) {
        int i2;
        if ((!this.f4811l.isFocused() && !this.f4811l.requestFocus()) || (i2 = this.f4814o) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            mo5630o(i2);
        }
        this.f4814o = i;
        mo5626O(i, true);
        mo5629U(i, 8);
        return true;
    }

    /* renamed from: U */
    public final boolean mo5629U(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.f4810k.isEnabled() || (parent = this.f4811l.getParent()) == null) {
            return false;
        }
        return C1027v.m5853h(parent, this.f4811l, m5903q(i, i2));
    }

    @Override // p006b.p030g.p039k.C0962a
    /* renamed from: b */
    public C0983d mo4454b(View view) {
        if (this.f4812m == null) {
            this.f4812m = new C1047c();
        }
        return this.f4812m;
    }

    @Override // p006b.p030g.p039k.C0962a
    /* renamed from: f */
    public void mo2361f(View view, AccessibilityEvent accessibilityEvent) {
        super.mo2361f(view, accessibilityEvent);
        mo5622K(accessibilityEvent);
    }

    @Override // p006b.p030g.p039k.C0962a
    /* renamed from: g */
    public void mo2362g(View view, C0979c cVar) {
        super.mo2362g(view, cVar);
        mo5624M(cVar);
    }

    /* renamed from: o */
    public final boolean mo5630o(int i) {
        if (this.f4814o != i) {
            return false;
        }
        this.f4814o = Integer.MIN_VALUE;
        mo5626O(i, false);
        mo5629U(i, 8);
        return true;
    }

    /* renamed from: v */
    public final boolean mo5631v(MotionEvent motionEvent) {
        if (!this.f4810k.isEnabled() || !this.f4810k.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int B = mo5617B(motionEvent.getX(), motionEvent.getY());
            m5900V(B);
            return B != Integer.MIN_VALUE;
        } else if (action != 10 || this.f4815p == Integer.MIN_VALUE) {
            return false;
        } else {
            m5900V(Integer.MIN_VALUE);
            return true;
        }
    }

    /* renamed from: w */
    public final boolean mo5632w(KeyEvent keyEvent) {
        int i = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 61) {
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        if (!keyEvent.hasNoModifiers()) {
                            return false;
                        }
                        int F = m5895F(keyCode);
                        int repeatCount = keyEvent.getRepeatCount() + 1;
                        boolean z = false;
                        while (i < repeatCount && m5896G(F, null)) {
                            i++;
                            z = true;
                        }
                        return z;
                    case 23:
                        break;
                    default:
                        return false;
                }
            }
            if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
                return false;
            }
            m5902p();
            return true;
        } else if (keyEvent.hasNoModifiers()) {
            return m5896G(2, null);
        } else {
            if (keyEvent.hasModifiers(1)) {
                return m5896G(1, null);
            }
            return false;
        }
    }

    /* renamed from: x */
    public final int mo5633x() {
        return this.f4813n;
    }
}
