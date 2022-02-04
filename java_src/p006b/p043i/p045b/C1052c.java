package p006b.p043i.p045b;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;
import p006b.p030g.p039k.C1013s;

/* renamed from: b.i.b.c */
public class C1052c {

    /* renamed from: a */
    private static final Interpolator f4821a = new animationInterpolatorC1053a();

    /* renamed from: b */
    private int f4822b;

    /* renamed from: c */
    private int f4823c;

    /* renamed from: d */
    private int f4824d = -1;

    /* renamed from: e */
    private float[] f4825e;

    /* renamed from: f */
    private float[] f4826f;

    /* renamed from: g */
    private float[] f4827g;

    /* renamed from: h */
    private float[] f4828h;

    /* renamed from: i */
    private int[] f4829i;

    /* renamed from: j */
    private int[] f4830j;

    /* renamed from: k */
    private int[] f4831k;

    /* renamed from: l */
    private int f4832l;

    /* renamed from: m */
    private VelocityTracker f4833m;

    /* renamed from: n */
    private float f4834n;

    /* renamed from: o */
    private float f4835o;

    /* renamed from: p */
    private int f4836p;

    /* renamed from: q */
    private int f4837q;

    /* renamed from: r */
    private OverScroller f4838r;

    /* renamed from: s */
    private final AbstractC1055c f4839s;

    /* renamed from: t */
    private View f4840t;

    /* renamed from: u */
    private boolean f4841u;

    /* renamed from: v */
    private final ViewGroup f4842v;

    /* renamed from: w */
    private final Runnable f4843w = new RunnableC1054b();

    /* renamed from: b.i.b.c$a  reason: invalid class name */
    static class animationInterpolatorC1053a implements Interpolator {
        animationInterpolatorC1053a() {
        }

        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: b.i.b.c$b */
    class RunnableC1054b implements Runnable {
        RunnableC1054b() {
        }

        public void run() {
            C1052c.this.mo5645J(0);
        }
    }

    /* renamed from: b.i.b.c$c */
    public static abstract class AbstractC1055c {
        /* renamed from: a */
        public abstract int mo2480a(View view, int i, int i2);

        /* renamed from: b */
        public abstract int mo2481b(View view, int i, int i2);

        /* renamed from: c */
        public int mo5664c(int i) {
            return i;
        }

        /* renamed from: d */
        public int mo2482d(View view) {
            return 0;
        }

        /* renamed from: e */
        public int mo5665e(View view) {
            return 0;
        }

        /* renamed from: f */
        public void mo2483f(int i, int i2) {
        }

        /* renamed from: g */
        public boolean mo2484g(int i) {
            return false;
        }

        /* renamed from: h */
        public void mo2485h(int i, int i2) {
        }

        /* renamed from: i */
        public void mo2486i(View view, int i) {
        }

        /* renamed from: j */
        public abstract void mo2487j(int i);

        /* renamed from: k */
        public abstract void mo2488k(View view, int i, int i2, int i3, int i4);

        /* renamed from: l */
        public abstract void mo2489l(View view, float f, float f2);

        /* renamed from: m */
        public abstract boolean mo2490m(View view, int i);
    }

    private C1052c(Context context, ViewGroup viewGroup, AbstractC1055c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (cVar != null) {
            this.f4842v = viewGroup;
            this.f4839s = cVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f4836p = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f4823c = viewConfiguration.getScaledTouchSlop();
            this.f4834n = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f4835o = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f4838r = new OverScroller(context, f4821a);
        } else {
            throw new IllegalArgumentException("Callback may not be null");
        }
    }

    /* renamed from: C */
    private boolean m5958C(int i) {
        if (mo5642B(i)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received " + "for this pointer before ACTION_MOVE. It likely happened because " + " ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* renamed from: F */
    private void m5959F() {
        this.f4833m.computeCurrentVelocity(1000, this.f4834n);
        m5973p(m5965g(this.f4833m.getXVelocity(this.f4824d), this.f4835o, this.f4834n), m5965g(this.f4833m.getYVelocity(this.f4824d), this.f4835o, this.f4834n));
    }

    /* renamed from: G */
    private void m5960G(float f, float f2, int i) {
        int i2 = 1;
        if (!m5963c(f, f2, i, 1)) {
            i2 = 0;
        }
        if (m5963c(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (m5963c(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (m5963c(f2, f, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.f4830j;
            iArr[i] = iArr[i] | i2;
            this.f4839s.mo2483f(i2, i);
        }
    }

    /* renamed from: H */
    private void m5961H(float f, float f2, int i) {
        m5976s(i);
        float[] fArr = this.f4825e;
        this.f4827g[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.f4826f;
        this.f4828h[i] = f2;
        fArr2[i] = f2;
        this.f4829i[i] = m5978x((int) f, (int) f2);
        this.f4832l |= 1 << i;
    }

    /* renamed from: I */
    private void m5962I(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m5958C(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f4827g[pointerId] = x;
                this.f4828h[pointerId] = y;
            }
        }
    }

    /* renamed from: c */
    private boolean m5963c(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f4829i[i] & i2) != i2 || (this.f4837q & i2) == 0 || (this.f4831k[i] & i2) == i2 || (this.f4830j[i] & i2) == i2) {
            return false;
        }
        int i3 = this.f4823c;
        if (abs <= ((float) i3) && abs2 <= ((float) i3)) {
            return false;
        }
        if (abs >= abs2 * 0.5f || !this.f4839s.mo2484g(i2)) {
            return (this.f4830j[i] & i2) == 0 && abs > ((float) this.f4823c);
        }
        int[] iArr = this.f4831k;
        iArr[i] = iArr[i] | i2;
        return false;
    }

    /* renamed from: f */
    private boolean m5964f(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.f4839s.mo2482d(view) > 0;
        boolean z2 = this.f4839s.mo5665e(view) > 0;
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.f4823c) : z2 && Math.abs(f2) > ((float) this.f4823c);
        }
        int i = this.f4823c;
        return (f * f) + (f2 * f2) > ((float) (i * i));
    }

    /* renamed from: g */
    private float m5965g(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        return abs > f3 ? f > 0.0f ? f3 : -f3 : f;
    }

    /* renamed from: h */
    private int m5966h(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        return abs > i3 ? i > 0 ? i3 : -i3 : i;
    }

    /* renamed from: i */
    private void m5967i() {
        float[] fArr = this.f4825e;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f4826f, 0.0f);
            Arrays.fill(this.f4827g, 0.0f);
            Arrays.fill(this.f4828h, 0.0f);
            Arrays.fill(this.f4829i, 0);
            Arrays.fill(this.f4830j, 0);
            Arrays.fill(this.f4831k, 0);
            this.f4832l = 0;
        }
    }

    /* renamed from: j */
    private void m5968j(int i) {
        if (this.f4825e != null && mo5642B(i)) {
            this.f4825e[i] = 0.0f;
            this.f4826f[i] = 0.0f;
            this.f4827g[i] = 0.0f;
            this.f4828h[i] = 0.0f;
            this.f4829i[i] = 0;
            this.f4830j[i] = 0;
            this.f4831k[i] = 0;
            this.f4832l = ((1 << i) ^ -1) & this.f4832l;
        }
    }

    /* renamed from: k */
    private int m5969k(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.f4842v.getWidth();
        float f = (float) (width / 2);
        float q = f + (m5974q(Math.min(1.0f, ((float) Math.abs(i)) / ((float) width))) * f);
        int abs = Math.abs(i2);
        return Math.min(abs > 0 ? Math.round(Math.abs(q / ((float) abs)) * 1000.0f) * 4 : (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f), 600);
    }

    /* renamed from: l */
    private int m5970l(View view, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int h = m5966h(i3, (int) this.f4835o, (int) this.f4834n);
        int h2 = m5966h(i4, (int) this.f4835o, (int) this.f4834n);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(h);
        int abs4 = Math.abs(h2);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        if (h != 0) {
            f2 = (float) abs3;
            f = (float) i5;
        } else {
            f2 = (float) abs;
            f = (float) i6;
        }
        float f5 = f2 / f;
        if (h2 != 0) {
            f4 = (float) abs4;
            f3 = (float) i5;
        } else {
            f4 = (float) abs2;
            f3 = (float) i6;
        }
        float f6 = f4 / f3;
        return (int) ((((float) m5969k(i, h, this.f4839s.mo2482d(view))) * f5) + (((float) m5969k(i2, h2, this.f4839s.mo5665e(view))) * f6));
    }

    /* renamed from: n */
    public static C1052c m5971n(ViewGroup viewGroup, float f, AbstractC1055c cVar) {
        C1052c o = m5972o(viewGroup, cVar);
        o.f4823c = (int) (((float) o.f4823c) * (1.0f / f));
        return o;
    }

    /* renamed from: o */
    public static C1052c m5972o(ViewGroup viewGroup, AbstractC1055c cVar) {
        return new C1052c(viewGroup.getContext(), viewGroup, cVar);
    }

    /* renamed from: p */
    private void m5973p(float f, float f2) {
        this.f4841u = true;
        this.f4839s.mo2489l(this.f4840t, f, f2);
        this.f4841u = false;
        if (this.f4822b == 1) {
            mo5645J(0);
        }
    }

    /* renamed from: q */
    private float m5974q(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    /* renamed from: r */
    private void m5975r(int i, int i2, int i3, int i4) {
        int left = this.f4840t.getLeft();
        int top = this.f4840t.getTop();
        if (i3 != 0) {
            i = this.f4839s.mo2480a(this.f4840t, i, i3);
            C1013s.m5742T(this.f4840t, i - left);
        }
        if (i4 != 0) {
            i2 = this.f4839s.mo2481b(this.f4840t, i2, i4);
            C1013s.m5743U(this.f4840t, i2 - top);
        }
        if (i3 != 0 || i4 != 0) {
            this.f4839s.mo2488k(this.f4840t, i, i2, i - left, i2 - top);
        }
    }

    /* renamed from: s */
    private void m5976s(int i) {
        float[] fArr = this.f4825e;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f4826f;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f4827g;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f4828h;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f4829i;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f4830j;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f4831k;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f4825e = fArr2;
            this.f4826f = fArr3;
            this.f4827g = fArr4;
            this.f4828h = fArr5;
            this.f4829i = iArr;
            this.f4830j = iArr2;
            this.f4831k = iArr3;
        }
    }

    /* renamed from: u */
    private boolean m5977u(int i, int i2, int i3, int i4) {
        int left = this.f4840t.getLeft();
        int top = this.f4840t.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f4838r.abortAnimation();
            mo5645J(0);
            return false;
        }
        this.f4838r.startScroll(left, top, i5, i6, m5970l(this.f4840t, i5, i6, i3, i4));
        mo5645J(2);
        return true;
    }

    /* renamed from: x */
    private int m5978x(int i, int i2) {
        int i3 = i < this.f4842v.getLeft() + this.f4836p ? 1 : 0;
        if (i2 < this.f4842v.getTop() + this.f4836p) {
            i3 |= 4;
        }
        if (i > this.f4842v.getRight() - this.f4836p) {
            i3 |= 2;
        }
        return i2 > this.f4842v.getBottom() - this.f4836p ? i3 | 8 : i3;
    }

    /* renamed from: A */
    public boolean mo5641A(int i, int i2) {
        return mo5643D(this.f4840t, i, i2);
    }

    /* renamed from: B */
    public boolean mo5642B(int i) {
        return ((1 << i) & this.f4832l) != 0;
    }

    /* renamed from: D */
    public boolean mo5643D(View view, int i, int i2) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    /* renamed from: E */
    public void mo5644E(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            mo5652a();
        }
        if (this.f4833m == null) {
            this.f4833m = VelocityTracker.obtain();
        }
        this.f4833m.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f4822b != 1) {
                        int pointerCount = motionEvent.getPointerCount();
                        while (i2 < pointerCount) {
                            int pointerId = motionEvent.getPointerId(i2);
                            if (m5958C(pointerId)) {
                                float x = motionEvent.getX(i2);
                                float y = motionEvent.getY(i2);
                                float f = x - this.f4825e[pointerId];
                                float f2 = y - this.f4826f[pointerId];
                                m5960G(f, f2, pointerId);
                                if (this.f4822b != 1) {
                                    View t = mo5657t((int) x, (int) y);
                                    if (m5964f(t, f, f2) && mo5651P(t, pointerId)) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            i2++;
                        }
                    } else if (m5958C(this.f4824d)) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f4824d);
                        float x2 = motionEvent.getX(findPointerIndex);
                        float y2 = motionEvent.getY(findPointerIndex);
                        float[] fArr = this.f4827g;
                        int i3 = this.f4824d;
                        int i4 = (int) (x2 - fArr[i3]);
                        int i5 = (int) (y2 - this.f4828h[i3]);
                        m5975r(this.f4840t.getLeft() + i4, this.f4840t.getTop() + i5, i4, i5);
                    } else {
                        return;
                    }
                    m5962I(motionEvent);
                    return;
                } else if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        int pointerId2 = motionEvent.getPointerId(actionIndex);
                        float x3 = motionEvent.getX(actionIndex);
                        float y3 = motionEvent.getY(actionIndex);
                        m5961H(x3, y3, pointerId2);
                        if (this.f4822b == 0) {
                            mo5651P(mo5657t((int) x3, (int) y3), pointerId2);
                            int i6 = this.f4829i[pointerId2];
                            int i7 = this.f4837q;
                            if ((i6 & i7) != 0) {
                                this.f4839s.mo2485h(i6 & i7, pointerId2);
                                return;
                            }
                            return;
                        } else if (mo5641A((int) x3, (int) y3)) {
                            mo5651P(this.f4840t, pointerId2);
                            return;
                        } else {
                            return;
                        }
                    } else if (actionMasked == 6) {
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        if (this.f4822b == 1 && pointerId3 == this.f4824d) {
                            int pointerCount2 = motionEvent.getPointerCount();
                            while (true) {
                                if (i2 >= pointerCount2) {
                                    i = -1;
                                    break;
                                }
                                int pointerId4 = motionEvent.getPointerId(i2);
                                if (pointerId4 != this.f4824d) {
                                    View t2 = mo5657t((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                                    View view = this.f4840t;
                                    if (t2 == view && mo5651P(view, pointerId4)) {
                                        i = this.f4824d;
                                        break;
                                    }
                                }
                                i2++;
                            }
                            if (i == -1) {
                                m5959F();
                            }
                        }
                        m5968j(pointerId3);
                        return;
                    } else {
                        return;
                    }
                } else if (this.f4822b == 1) {
                    m5973p(0.0f, 0.0f);
                }
            } else if (this.f4822b == 1) {
                m5959F();
            }
            mo5652a();
            return;
        }
        float x4 = motionEvent.getX();
        float y4 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View t3 = mo5657t((int) x4, (int) y4);
        m5961H(x4, y4, pointerId5);
        mo5651P(t3, pointerId5);
        int i8 = this.f4829i[pointerId5];
        int i9 = this.f4837q;
        if ((i8 & i9) != 0) {
            this.f4839s.mo2485h(i8 & i9, pointerId5);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo5645J(int i) {
        this.f4842v.removeCallbacks(this.f4843w);
        if (this.f4822b != i) {
            this.f4822b = i;
            this.f4839s.mo2487j(i);
            if (this.f4822b == 0) {
                this.f4840t = null;
            }
        }
    }

    /* renamed from: K */
    public void mo5646K(int i) {
        this.f4837q = i;
    }

    /* renamed from: L */
    public void mo5647L(float f) {
        this.f4835o = f;
    }

    /* renamed from: M */
    public boolean mo5648M(int i, int i2) {
        if (this.f4841u) {
            return m5977u(i, i2, (int) this.f4833m.getXVelocity(this.f4824d), (int) this.f4833m.getYVelocity(this.f4824d));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dd, code lost:
        if (r12 != r11) goto L_0x00e6;
     */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo5649N(android.view.MotionEvent r17) {
        /*
        // Method dump skipped, instructions count: 315
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p043i.p045b.C1052c.mo5649N(android.view.MotionEvent):boolean");
    }

    /* renamed from: O */
    public boolean mo5650O(View view, int i, int i2) {
        this.f4840t = view;
        this.f4824d = -1;
        boolean u = m5977u(i, i2, 0, 0);
        if (!u && this.f4822b == 0 && this.f4840t != null) {
            this.f4840t = null;
        }
        return u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public boolean mo5651P(View view, int i) {
        if (view == this.f4840t && this.f4824d == i) {
            return true;
        }
        if (view == null || !this.f4839s.mo2490m(view, i)) {
            return false;
        }
        this.f4824d = i;
        mo5653b(view, i);
        return true;
    }

    /* renamed from: a */
    public void mo5652a() {
        this.f4824d = -1;
        m5967i();
        VelocityTracker velocityTracker = this.f4833m;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f4833m = null;
        }
    }

    /* renamed from: b */
    public void mo5653b(View view, int i) {
        if (view.getParent() == this.f4842v) {
            this.f4840t = view;
            this.f4824d = i;
            this.f4839s.mo2486i(view, i);
            mo5645J(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f4842v + ")");
    }

    /* renamed from: d */
    public boolean mo5654d(int i) {
        int length = this.f4825e.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (mo5655e(i, i2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public boolean mo5655e(int i, int i2) {
        if (!mo5642B(i2)) {
            return false;
        }
        boolean z = (i & 1) == 1;
        boolean z2 = (i & 2) == 2;
        float f = this.f4827g[i2] - this.f4825e[i2];
        float f2 = this.f4828h[i2] - this.f4826f[i2];
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.f4823c) : z2 && Math.abs(f2) > ((float) this.f4823c);
        }
        int i3 = this.f4823c;
        return (f * f) + (f2 * f2) > ((float) (i3 * i3));
    }

    /* renamed from: m */
    public boolean mo5656m(boolean z) {
        if (this.f4822b == 2) {
            boolean computeScrollOffset = this.f4838r.computeScrollOffset();
            int currX = this.f4838r.getCurrX();
            int currY = this.f4838r.getCurrY();
            int left = currX - this.f4840t.getLeft();
            int top = currY - this.f4840t.getTop();
            if (left != 0) {
                C1013s.m5742T(this.f4840t, left);
            }
            if (top != 0) {
                C1013s.m5743U(this.f4840t, top);
            }
            if (!(left == 0 && top == 0)) {
                this.f4839s.mo2488k(this.f4840t, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f4838r.getFinalX() && currY == this.f4838r.getFinalY()) {
                this.f4838r.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.f4842v.post(this.f4843w);
                } else {
                    mo5645J(0);
                }
            }
        }
        return this.f4822b == 2;
    }

    /* renamed from: t */
    public View mo5657t(int i, int i2) {
        for (int childCount = this.f4842v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f4842v.getChildAt(this.f4839s.mo5664c(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: v */
    public View mo5658v() {
        return this.f4840t;
    }

    /* renamed from: w */
    public int mo5659w() {
        return this.f4836p;
    }

    /* renamed from: y */
    public int mo5660y() {
        return this.f4823c;
    }

    /* renamed from: z */
    public int mo5661z() {
        return this.f4822b;
    }
}
