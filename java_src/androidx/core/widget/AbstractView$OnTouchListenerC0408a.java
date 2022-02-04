package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import p006b.p030g.p039k.C1013s;

/* renamed from: androidx.core.widget.a */
public abstract class AbstractView$OnTouchListenerC0408a implements View.OnTouchListener {

    /* renamed from: b */
    private static final int f2140b = ViewConfiguration.getTapTimeout();

    /* renamed from: c */
    final C0409a f2141c = new C0409a();

    /* renamed from: d */
    private final Interpolator f2142d = new AccelerateInterpolator();

    /* renamed from: e */
    final View f2143e;

    /* renamed from: f */
    private Runnable f2144f;

    /* renamed from: g */
    private float[] f2145g = {0.0f, 0.0f};

    /* renamed from: h */
    private float[] f2146h = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: i */
    private int f2147i;

    /* renamed from: j */
    private int f2148j;

    /* renamed from: k */
    private float[] f2149k = {0.0f, 0.0f};

    /* renamed from: l */
    private float[] f2150l = {0.0f, 0.0f};

    /* renamed from: m */
    private float[] f2151m = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: n */
    private boolean f2152n;

    /* renamed from: o */
    boolean f2153o;

    /* renamed from: p */
    boolean f2154p;

    /* renamed from: q */
    boolean f2155q;

    /* renamed from: r */
    private boolean f2156r;

    /* renamed from: s */
    private boolean f2157s;

    /* access modifiers changed from: private */
    /* renamed from: androidx.core.widget.a$a */
    public static class C0409a {

        /* renamed from: a */
        private int f2158a;

        /* renamed from: b */
        private int f2159b;

        /* renamed from: c */
        private float f2160c;

        /* renamed from: d */
        private float f2161d;

        /* renamed from: e */
        private long f2162e = Long.MIN_VALUE;

        /* renamed from: f */
        private long f2163f = 0;

        /* renamed from: g */
        private int f2164g = 0;

        /* renamed from: h */
        private int f2165h = 0;

        /* renamed from: i */
        private long f2166i = -1;

        /* renamed from: j */
        private float f2167j;

        /* renamed from: k */
        private int f2168k;

        C0409a() {
        }

        /* renamed from: e */
        private float m2064e(long j) {
            long j2 = this.f2162e;
            if (j < j2) {
                return 0.0f;
            }
            long j3 = this.f2166i;
            if (j3 < 0 || j < j3) {
                return AbstractView$OnTouchListenerC0408a.m2043e(((float) (j - j2)) / ((float) this.f2158a), 0.0f, 1.0f) * 0.5f;
            }
            float f = this.f2167j;
            return (1.0f - f) + (f * AbstractView$OnTouchListenerC0408a.m2043e(((float) (j - j3)) / ((float) this.f2168k), 0.0f, 1.0f));
        }

        /* renamed from: g */
        private float m2065g(float f) {
            return (-4.0f * f * f) + (f * 4.0f);
        }

        /* renamed from: a */
        public void mo2386a() {
            if (this.f2163f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float g = m2065g(m2064e(currentAnimationTimeMillis));
                this.f2163f = currentAnimationTimeMillis;
                float f = ((float) (currentAnimationTimeMillis - this.f2163f)) * g;
                this.f2164g = (int) (this.f2160c * f);
                this.f2165h = (int) (f * this.f2161d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        /* renamed from: b */
        public int mo2387b() {
            return this.f2164g;
        }

        /* renamed from: c */
        public int mo2388c() {
            return this.f2165h;
        }

        /* renamed from: d */
        public int mo2389d() {
            float f = this.f2160c;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: f */
        public int mo2390f() {
            float f = this.f2161d;
            return (int) (f / Math.abs(f));
        }

        /* renamed from: h */
        public boolean mo2391h() {
            return this.f2166i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f2166i + ((long) this.f2168k);
        }

        /* renamed from: i */
        public void mo2392i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f2168k = AbstractView$OnTouchListenerC0408a.m2044f((int) (currentAnimationTimeMillis - this.f2162e), 0, this.f2159b);
            this.f2167j = m2064e(currentAnimationTimeMillis);
            this.f2166i = currentAnimationTimeMillis;
        }

        /* renamed from: j */
        public void mo2393j(int i) {
            this.f2159b = i;
        }

        /* renamed from: k */
        public void mo2394k(int i) {
            this.f2158a = i;
        }

        /* renamed from: l */
        public void mo2395l(float f, float f2) {
            this.f2160c = f;
            this.f2161d = f2;
        }

        /* renamed from: m */
        public void mo2396m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f2162e = currentAnimationTimeMillis;
            this.f2166i = -1;
            this.f2163f = currentAnimationTimeMillis;
            this.f2167j = 0.5f;
            this.f2164g = 0;
            this.f2165h = 0;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.core.widget.a$b */
    public class RunnableC0410b implements Runnable {
        RunnableC0410b() {
        }

        public void run() {
            AbstractView$OnTouchListenerC0408a aVar = AbstractView$OnTouchListenerC0408a.this;
            if (aVar.f2155q) {
                if (aVar.f2153o) {
                    aVar.f2153o = false;
                    aVar.f2141c.mo2396m();
                }
                C0409a aVar2 = AbstractView$OnTouchListenerC0408a.this.f2141c;
                if (aVar2.mo2391h() || !AbstractView$OnTouchListenerC0408a.this.mo2385u()) {
                    AbstractView$OnTouchListenerC0408a.this.f2155q = false;
                    return;
                }
                AbstractView$OnTouchListenerC0408a aVar3 = AbstractView$OnTouchListenerC0408a.this;
                if (aVar3.f2154p) {
                    aVar3.f2154p = false;
                    aVar3.mo2372c();
                }
                aVar2.mo2386a();
                AbstractView$OnTouchListenerC0408a.this.mo2373j(aVar2.mo2387b(), aVar2.mo2388c());
                C1013s.m5750a0(AbstractView$OnTouchListenerC0408a.this.f2143e, this);
            }
        }
    }

    public AbstractView$OnTouchListenerC0408a(View view) {
        this.f2143e = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = (float) ((int) ((1575.0f * f) + 0.5f));
        mo2378o(f2, f2);
        float f3 = (float) ((int) ((f * 315.0f) + 0.5f));
        mo2380p(f3, f3);
        mo2375l(1);
        mo2377n(Float.MAX_VALUE, Float.MAX_VALUE);
        mo2383s(0.2f, 0.2f);
        mo2384t(1.0f, 1.0f);
        mo2374k(f2140b);
        mo2382r(500);
        mo2381q(500);
    }

    /* renamed from: d */
    private float m2042d(int i, float f, float f2, float f3) {
        float h = m2046h(this.f2145g[i], f2, this.f2146h[i], f);
        if (h == 0.0f) {
            return 0.0f;
        }
        float f4 = this.f2149k[i];
        float f5 = this.f2150l[i];
        float f6 = this.f2151m[i];
        float f7 = f4 * f3;
        return h > 0.0f ? m2043e(h * f7, f5, f6) : -m2043e((-h) * f7, f5, f6);
    }

    /* renamed from: e */
    static float m2043e(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* renamed from: f */
    static int m2044f(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    /* renamed from: g */
    private float m2045g(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.f2147i;
        if (i == 0 || i == 1) {
            if (f < f2) {
                return f >= 0.0f ? 1.0f - (f / f2) : (!this.f2155q || i != 1) ? 0.0f : 1.0f;
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
    }

    /* renamed from: h */
    private float m2046h(float f, float f2, float f3, float f4) {
        float f5;
        float e = m2043e(f * f2, 0.0f, f3);
        float g = m2045g(f2 - f4, e) - m2045g(f4, e);
        if (g < 0.0f) {
            f5 = -this.f2142d.getInterpolation(-g);
        } else if (g <= 0.0f) {
            return 0.0f;
        } else {
            f5 = this.f2142d.getInterpolation(g);
        }
        return m2043e(f5, -1.0f, 1.0f);
    }

    /* renamed from: i */
    private void m2047i() {
        if (this.f2153o) {
            this.f2155q = false;
        } else {
            this.f2141c.mo2392i();
        }
    }

    /* renamed from: v */
    private void m2048v() {
        int i;
        if (this.f2144f == null) {
            this.f2144f = new RunnableC0410b();
        }
        this.f2155q = true;
        this.f2153o = true;
        if (this.f2152n || (i = this.f2148j) <= 0) {
            this.f2144f.run();
        } else {
            C1013s.m5752b0(this.f2143e, this.f2144f, (long) i);
        }
        this.f2152n = true;
    }

    /* renamed from: a */
    public abstract boolean mo2370a(int i);

    /* renamed from: b */
    public abstract boolean mo2371b(int i);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2372c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f2143e.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: j */
    public abstract void mo2373j(int i, int i2);

    /* renamed from: k */
    public AbstractView$OnTouchListenerC0408a mo2374k(int i) {
        this.f2148j = i;
        return this;
    }

    /* renamed from: l */
    public AbstractView$OnTouchListenerC0408a mo2375l(int i) {
        this.f2147i = i;
        return this;
    }

    /* renamed from: m */
    public AbstractView$OnTouchListenerC0408a mo2376m(boolean z) {
        if (this.f2156r && !z) {
            m2047i();
        }
        this.f2156r = z;
        return this;
    }

    /* renamed from: n */
    public AbstractView$OnTouchListenerC0408a mo2377n(float f, float f2) {
        float[] fArr = this.f2146h;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: o */
    public AbstractView$OnTouchListenerC0408a mo2378o(float f, float f2) {
        float[] fArr = this.f2151m;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f2156r
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x0058
        L_0x0016:
            r5.m2047i()
            goto L_0x0058
        L_0x001a:
            r5.f2154p = r2
            r5.f2152n = r1
        L_0x001e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f2143e
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.m2042d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f2143e
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.m2042d(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f2141c
            r7.mo2395l(r0, r6)
            boolean r6 = r5.f2155q
            if (r6 != 0) goto L_0x0058
            boolean r6 = r5.mo2385u()
            if (r6 == 0) goto L_0x0058
            r5.m2048v()
        L_0x0058:
            boolean r6 = r5.f2157s
            if (r6 == 0) goto L_0x0061
            boolean r6 = r5.f2155q
            if (r6 == 0) goto L_0x0061
            r1 = 1
        L_0x0061:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.AbstractView$OnTouchListenerC0408a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public AbstractView$OnTouchListenerC0408a mo2380p(float f, float f2) {
        float[] fArr = this.f2150l;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: q */
    public AbstractView$OnTouchListenerC0408a mo2381q(int i) {
        this.f2141c.mo2393j(i);
        return this;
    }

    /* renamed from: r */
    public AbstractView$OnTouchListenerC0408a mo2382r(int i) {
        this.f2141c.mo2394k(i);
        return this;
    }

    /* renamed from: s */
    public AbstractView$OnTouchListenerC0408a mo2383s(float f, float f2) {
        float[] fArr = this.f2145g;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* renamed from: t */
    public AbstractView$OnTouchListenerC0408a mo2384t(float f, float f2) {
        float[] fArr = this.f2149k;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public boolean mo2385u() {
        C0409a aVar = this.f2141c;
        int f = aVar.mo2390f();
        int d = aVar.mo2389d();
        return (f != 0 && mo2371b(f)) || (d != 0 && mo2370a(d));
    }
}
