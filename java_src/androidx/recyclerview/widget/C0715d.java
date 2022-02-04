package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import p006b.p030g.p039k.C1013s;

/* access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.d */
public class C0715d extends RecyclerView.AbstractC0668n implements RecyclerView.AbstractC0677s {

    /* renamed from: a */
    private static final int[] f3445a = {16842919};

    /* renamed from: b */
    private static final int[] f3446b = new int[0];

    /* renamed from: A */
    private final int[] f3447A = new int[2];

    /* renamed from: B */
    final ValueAnimator f3448B;

    /* renamed from: C */
    int f3449C;

    /* renamed from: D */
    private final Runnable f3450D;

    /* renamed from: E */
    private final RecyclerView.AbstractC0678t f3451E;

    /* renamed from: c */
    private final int f3452c;

    /* renamed from: d */
    private final int f3453d;

    /* renamed from: e */
    final StateListDrawable f3454e;

    /* renamed from: f */
    final Drawable f3455f;

    /* renamed from: g */
    private final int f3456g;

    /* renamed from: h */
    private final int f3457h;

    /* renamed from: i */
    private final StateListDrawable f3458i;

    /* renamed from: j */
    private final Drawable f3459j;

    /* renamed from: k */
    private final int f3460k;

    /* renamed from: l */
    private final int f3461l;

    /* renamed from: m */
    int f3462m;

    /* renamed from: n */
    int f3463n;

    /* renamed from: o */
    float f3464o;

    /* renamed from: p */
    int f3465p;

    /* renamed from: q */
    int f3466q;

    /* renamed from: r */
    float f3467r;

    /* renamed from: s */
    private int f3468s = 0;

    /* renamed from: t */
    private int f3469t = 0;

    /* renamed from: u */
    private RecyclerView f3470u;

    /* renamed from: v */
    private boolean f3471v = false;

    /* renamed from: w */
    private boolean f3472w = false;

    /* renamed from: x */
    private int f3473x = 0;

    /* renamed from: y */
    private int f3474y = 0;

    /* renamed from: z */
    private final int[] f3475z = new int[2];

    /* renamed from: androidx.recyclerview.widget.d$a */
    class RunnableC0716a implements Runnable {
        RunnableC0716a() {
        }

        public void run() {
            C0715d.this.mo4399q(500);
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$b */
    class C0717b extends RecyclerView.AbstractC0678t {
        C0717b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0678t
        /* renamed from: b */
        public void mo4178b(RecyclerView recyclerView, int i, int i2) {
            C0715d.this.mo4397B(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$c */
    private class C0718c extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f3478a = false;

        C0718c() {
        }

        public void onAnimationCancel(Animator animator) {
            this.f3478a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.f3478a) {
                this.f3478a = false;
            } else if (((Float) C0715d.this.f3448B.getAnimatedValue()).floatValue() == 0.0f) {
                C0715d dVar = C0715d.this;
                dVar.f3449C = 0;
                dVar.mo4403y(0);
            } else {
                C0715d dVar2 = C0715d.this;
                dVar2.f3449C = 2;
                dVar2.mo4402v();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$d */
    private class C0719d implements ValueAnimator.AnimatorUpdateListener {
        C0719d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C0715d.this.f3454e.setAlpha(floatValue);
            C0715d.this.f3455f.setAlpha(floatValue);
            C0715d.this.mo4402v();
        }
    }

    C0715d(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f3448B = ofFloat;
        this.f3449C = 0;
        this.f3450D = new RunnableC0716a();
        this.f3451E = new C0717b();
        this.f3454e = stateListDrawable;
        this.f3455f = drawable;
        this.f3458i = stateListDrawable2;
        this.f3459j = drawable2;
        this.f3456g = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f3457h = Math.max(i, drawable.getIntrinsicWidth());
        this.f3460k = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f3461l = Math.max(i, drawable2.getIntrinsicWidth());
        this.f3452c = i2;
        this.f3453d = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C0718c());
        ofFloat.addUpdateListener(new C0719d());
        mo4398j(recyclerView);
    }

    /* renamed from: C */
    private void m4220C(float f) {
        int[] p = m4226p();
        float max = Math.max((float) p[0], Math.min((float) p[1], f));
        if (Math.abs(((float) this.f3463n) - max) >= 2.0f) {
            int x = m4230x(this.f3464o, max, p, this.f3470u.computeVerticalScrollRange(), this.f3470u.computeVerticalScrollOffset(), this.f3469t);
            if (x != 0) {
                this.f3470u.scrollBy(0, x);
            }
            this.f3464o = max;
        }
    }

    /* renamed from: k */
    private void m4221k() {
        this.f3470u.removeCallbacks(this.f3450D);
    }

    /* renamed from: l */
    private void m4222l() {
        this.f3470u.mo3810Y0(this);
        this.f3470u.mo3815a1(this);
        this.f3470u.mo3818b1(this.f3451E);
        m4221k();
    }

    /* renamed from: m */
    private void m4223m(Canvas canvas) {
        int i = this.f3469t;
        int i2 = this.f3460k;
        int i3 = i - i2;
        int i4 = this.f3466q;
        int i5 = this.f3465p;
        int i6 = i4 - (i5 / 2);
        this.f3458i.setBounds(0, 0, i5, i2);
        this.f3459j.setBounds(0, 0, this.f3468s, this.f3461l);
        canvas.translate(0.0f, (float) i3);
        this.f3459j.draw(canvas);
        canvas.translate((float) i6, 0.0f);
        this.f3458i.draw(canvas);
        canvas.translate((float) (-i6), (float) (-i3));
    }

    /* renamed from: n */
    private void m4224n(Canvas canvas) {
        int i = this.f3468s;
        int i2 = this.f3456g;
        int i3 = i - i2;
        int i4 = this.f3463n;
        int i5 = this.f3462m;
        int i6 = i4 - (i5 / 2);
        this.f3454e.setBounds(0, 0, i2, i5);
        this.f3455f.setBounds(0, 0, this.f3457h, this.f3469t);
        if (m4228s()) {
            this.f3455f.draw(canvas);
            canvas.translate((float) this.f3456g, (float) i6);
            canvas.scale(-1.0f, 1.0f);
            this.f3454e.draw(canvas);
            canvas.scale(1.0f, 1.0f);
            i3 = this.f3456g;
        } else {
            canvas.translate((float) i3, 0.0f);
            this.f3455f.draw(canvas);
            canvas.translate(0.0f, (float) i6);
            this.f3454e.draw(canvas);
        }
        canvas.translate((float) (-i3), (float) (-i6));
    }

    /* renamed from: o */
    private int[] m4225o() {
        int[] iArr = this.f3447A;
        int i = this.f3453d;
        iArr[0] = i;
        iArr[1] = this.f3468s - i;
        return iArr;
    }

    /* renamed from: p */
    private int[] m4226p() {
        int[] iArr = this.f3475z;
        int i = this.f3453d;
        iArr[0] = i;
        iArr[1] = this.f3469t - i;
        return iArr;
    }

    /* renamed from: r */
    private void m4227r(float f) {
        int[] o = m4225o();
        float max = Math.max((float) o[0], Math.min((float) o[1], f));
        if (Math.abs(((float) this.f3466q) - max) >= 2.0f) {
            int x = m4230x(this.f3467r, max, o, this.f3470u.computeHorizontalScrollRange(), this.f3470u.computeHorizontalScrollOffset(), this.f3468s);
            if (x != 0) {
                this.f3470u.scrollBy(x, 0);
            }
            this.f3467r = max;
        }
    }

    /* renamed from: s */
    private boolean m4228s() {
        return C1013s.m5797y(this.f3470u) == 1;
    }

    /* renamed from: w */
    private void m4229w(int i) {
        m4221k();
        this.f3470u.postDelayed(this.f3450D, (long) i);
    }

    /* renamed from: x */
    private int m4230x(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / ((float) i4)) * ((float) i5));
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    /* renamed from: z */
    private void m4231z() {
        this.f3470u.mo3859h(this);
        this.f3470u.mo3866j(this);
        this.f3470u.mo3868k(this.f3451E);
    }

    /* renamed from: A */
    public void mo4396A() {
        int i = this.f3449C;
        if (i != 0) {
            if (i == 3) {
                this.f3448B.cancel();
            } else {
                return;
            }
        }
        this.f3449C = 1;
        ValueAnimator valueAnimator = this.f3448B;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f3448B.setDuration(500L);
        this.f3448B.setStartDelay(0);
        this.f3448B.start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo4397B(int i, int i2) {
        int computeVerticalScrollRange = this.f3470u.computeVerticalScrollRange();
        int i3 = this.f3469t;
        this.f3471v = computeVerticalScrollRange - i3 > 0 && i3 >= this.f3452c;
        int computeHorizontalScrollRange = this.f3470u.computeHorizontalScrollRange();
        int i4 = this.f3468s;
        boolean z = computeHorizontalScrollRange - i4 > 0 && i4 >= this.f3452c;
        this.f3472w = z;
        boolean z2 = this.f3471v;
        if (z2 || z) {
            if (z2) {
                float f = (float) i3;
                this.f3463n = (int) ((f * (((float) i2) + (f / 2.0f))) / ((float) computeVerticalScrollRange));
                this.f3462m = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
            }
            if (this.f3472w) {
                float f2 = (float) i4;
                this.f3466q = (int) ((f2 * (((float) i) + (f2 / 2.0f))) / ((float) computeHorizontalScrollRange));
                this.f3465p = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
            }
            int i5 = this.f3473x;
            if (i5 == 0 || i5 == 1) {
                mo4403y(1);
            }
        } else if (this.f3473x != 0) {
            mo4403y(0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677s
    /* renamed from: a */
    public boolean mo4174a(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.f3473x;
        if (i != 1) {
            return i == 2;
        }
        boolean u = mo4401u(motionEvent.getX(), motionEvent.getY());
        boolean t = mo4400t(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!u && !t) {
            return false;
        }
        if (t) {
            this.f3474y = 1;
            this.f3467r = (float) ((int) motionEvent.getX());
        } else if (u) {
            this.f3474y = 2;
            this.f3464o = (float) ((int) motionEvent.getY());
        }
        mo4403y(2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677s
    /* renamed from: b */
    public void mo4175b(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f3473x != 0) {
            if (motionEvent.getAction() == 0) {
                boolean u = mo4401u(motionEvent.getX(), motionEvent.getY());
                boolean t = mo4400t(motionEvent.getX(), motionEvent.getY());
                if (u || t) {
                    if (t) {
                        this.f3474y = 1;
                        this.f3467r = (float) ((int) motionEvent.getX());
                    } else if (u) {
                        this.f3474y = 2;
                        this.f3464o = (float) ((int) motionEvent.getY());
                    }
                    mo4403y(2);
                }
            } else if (motionEvent.getAction() == 1 && this.f3473x == 2) {
                this.f3464o = 0.0f;
                this.f3467r = 0.0f;
                mo4403y(1);
                this.f3474y = 0;
            } else if (motionEvent.getAction() == 2 && this.f3473x == 2) {
                mo4396A();
                if (this.f3474y == 1) {
                    m4227r(motionEvent.getX());
                }
                if (this.f3474y == 2) {
                    m4220C(motionEvent.getY());
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0677s
    /* renamed from: c */
    public void mo4176c(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0668n
    /* renamed from: i */
    public void mo4074i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0649a0 a0Var) {
        if (this.f3468s != this.f3470u.getWidth() || this.f3469t != this.f3470u.getHeight()) {
            this.f3468s = this.f3470u.getWidth();
            this.f3469t = this.f3470u.getHeight();
            mo4403y(0);
        } else if (this.f3449C != 0) {
            if (this.f3471v) {
                m4224n(canvas);
            }
            if (this.f3472w) {
                m4223m(canvas);
            }
        }
    }

    /* renamed from: j */
    public void mo4398j(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f3470u;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                m4222l();
            }
            this.f3470u = recyclerView;
            if (recyclerView != null) {
                m4231z();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo4399q(int i) {
        int i2 = this.f3449C;
        if (i2 == 1) {
            this.f3448B.cancel();
        } else if (i2 != 2) {
            return;
        }
        this.f3449C = 3;
        ValueAnimator valueAnimator = this.f3448B;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f3448B.setDuration((long) i);
        this.f3448B.start();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public boolean mo4400t(float f, float f2) {
        if (f2 >= ((float) (this.f3469t - this.f3460k))) {
            int i = this.f3466q;
            int i2 = this.f3465p;
            return f >= ((float) (i - (i2 / 2))) && f <= ((float) (i + (i2 / 2)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public boolean mo4401u(float f, float f2) {
        if (!m4228s() ? f >= ((float) (this.f3468s - this.f3456g)) : f <= ((float) (this.f3456g / 2))) {
            int i = this.f3463n;
            int i2 = this.f3462m;
            return f2 >= ((float) (i - (i2 / 2))) && f2 <= ((float) (i + (i2 / 2)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo4402v() {
        this.f3470u.invalidate();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo4403y(int i) {
        int i2;
        if (i == 2 && this.f3473x != 2) {
            this.f3454e.setState(f3445a);
            m4221k();
        }
        if (i == 0) {
            mo4402v();
        } else {
            mo4396A();
        }
        if (this.f3473x != 2 || i == 2) {
            if (i == 1) {
                i2 = 1500;
            }
            this.f3473x = i;
        }
        this.f3454e.setState(f3446b);
        i2 = 1200;
        m4229w(i2);
        this.f3473x = i;
    }
}
