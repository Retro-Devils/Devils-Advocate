package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.graphics.drawable.C0398a;
import com.google.android.material.internal.C3194l;
import java.util.ArrayList;
import java.util.Iterator;
import p006b.p030g.p038j.C0961i;
import p006b.p030g.p039k.C1013s;
import p069c.p073b.p074a.p090b.C1388a;
import p069c.p073b.p074a.p090b.p092l.C1401a;
import p069c.p073b.p074a.p090b.p092l.C1402b;
import p069c.p073b.p074a.p090b.p092l.C1406f;
import p069c.p073b.p074a.p090b.p092l.C1407g;
import p069c.p073b.p074a.p090b.p092l.C1408h;
import p069c.p073b.p074a.p090b.p105x.C1446b;
import p069c.p073b.p074a.p090b.p106y.AbstractC1448b;
import p069c.p073b.p074a.p090b.p107z.AbstractC1477n;
import p069c.p073b.p074a.p090b.p107z.C1455g;
import p069c.p073b.p074a.p090b.p107z.C1459h;
import p069c.p073b.p074a.p090b.p107z.C1462k;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.material.floatingactionbutton.b */
public class C3149b {

    /* renamed from: a */
    static final TimeInterpolator f10515a = C1401a.f6016c;

    /* renamed from: b */
    static final int[] f10516b = {16842919, 16842910};

    /* renamed from: c */
    static final int[] f10517c = {16843623, 16842908, 16842910};

    /* renamed from: d */
    static final int[] f10518d = {16842908, 16842910};

    /* renamed from: e */
    static final int[] f10519e = {16843623, 16842910};

    /* renamed from: f */
    static final int[] f10520f = {16842910};

    /* renamed from: g */
    static final int[] f10521g = new int[0];

    /* renamed from: A */
    private int f10522A;

    /* renamed from: B */
    private int f10523B = 0;

    /* renamed from: C */
    private ArrayList<Animator.AnimatorListener> f10524C;

    /* renamed from: D */
    private ArrayList<Animator.AnimatorListener> f10525D;

    /* renamed from: E */
    private ArrayList<AbstractC3158i> f10526E;

    /* renamed from: F */
    final FloatingActionButton f10527F;

    /* renamed from: G */
    final AbstractC1448b f10528G;

    /* renamed from: H */
    private final Rect f10529H = new Rect();

    /* renamed from: I */
    private final RectF f10530I = new RectF();

    /* renamed from: J */
    private final RectF f10531J = new RectF();

    /* renamed from: K */
    private final Matrix f10532K = new Matrix();

    /* renamed from: L */
    private ViewTreeObserver.OnPreDrawListener f10533L;

    /* renamed from: h */
    C1462k f10534h;

    /* renamed from: i */
    C1455g f10535i;

    /* renamed from: j */
    Drawable f10536j;

    /* renamed from: k */
    C3148a f10537k;

    /* renamed from: l */
    Drawable f10538l;

    /* renamed from: m */
    boolean f10539m;

    /* renamed from: n */
    boolean f10540n = true;

    /* renamed from: o */
    float f10541o;

    /* renamed from: p */
    float f10542p;

    /* renamed from: q */
    float f10543q;

    /* renamed from: r */
    int f10544r;

    /* renamed from: s */
    private final C3194l f10545s;

    /* renamed from: t */
    private C1408h f10546t;

    /* renamed from: u */
    private C1408h f10547u;

    /* renamed from: v */
    private Animator f10548v;

    /* renamed from: w */
    private C1408h f10549w;

    /* renamed from: x */
    private C1408h f10550x;

    /* renamed from: y */
    private float f10551y;

    /* renamed from: z */
    private float f10552z = 1.0f;

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.b$a */
    public class C3150a extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f10553a;

        /* renamed from: b */
        final /* synthetic */ boolean f10554b;

        /* renamed from: c */
        final /* synthetic */ AbstractC3159j f10555c;

        C3150a(boolean z, AbstractC3159j jVar) {
            this.f10554b = z;
            this.f10555c = jVar;
        }

        public void onAnimationCancel(Animator animator) {
            this.f10553a = true;
        }

        public void onAnimationEnd(Animator animator) {
            C3149b.this.f10523B = 0;
            C3149b.this.f10548v = null;
            if (!this.f10553a) {
                FloatingActionButton floatingActionButton = C3149b.this.f10527F;
                boolean z = this.f10554b;
                floatingActionButton.mo10802b(z ? 8 : 4, z);
                AbstractC3159j jVar = this.f10555c;
                if (jVar != null) {
                    jVar.mo10576b();
                }
            }
        }

        public void onAnimationStart(Animator animator) {
            C3149b.this.f10527F.mo10802b(0, this.f10554b);
            C3149b.this.f10523B = 1;
            C3149b.this.f10548v = animator;
            this.f10553a = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.b$b */
    public class C3151b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f10557a;

        /* renamed from: b */
        final /* synthetic */ AbstractC3159j f10558b;

        C3151b(boolean z, AbstractC3159j jVar) {
            this.f10557a = z;
            this.f10558b = jVar;
        }

        public void onAnimationEnd(Animator animator) {
            C3149b.this.f10523B = 0;
            C3149b.this.f10548v = null;
            AbstractC3159j jVar = this.f10558b;
            if (jVar != null) {
                jVar.mo10575a();
            }
        }

        public void onAnimationStart(Animator animator) {
            C3149b.this.f10527F.mo10802b(0, this.f10557a);
            C3149b.this.f10523B = 2;
            C3149b.this.f10548v = animator;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.b$c */
    public class C3152c extends C1407g {
        C3152c() {
        }

        @Override // p069c.p073b.p074a.p090b.p092l.C1407g
        /* renamed from: a */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            C3149b.this.f10552z = f;
            return super.mo6462a(f, matrix, matrix2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.b$d */
    public class C3153d implements TypeEvaluator<Float> {

        /* renamed from: a */
        FloatEvaluator f10561a = new FloatEvaluator();

        C3153d() {
        }

        /* renamed from: a */
        public Float evaluate(float f, Float f2, Float f3) {
            float floatValue = this.f10561a.evaluate(f, (Number) f2, (Number) f3).floatValue();
            if (floatValue < 0.1f) {
                floatValue = 0.0f;
            }
            return Float.valueOf(floatValue);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.b$e */
    public class ViewTreeObserver$OnPreDrawListenerC3154e implements ViewTreeObserver.OnPreDrawListener {
        ViewTreeObserver$OnPreDrawListenerC3154e() {
        }

        public boolean onPreDraw() {
            C3149b.this.mo10586F();
            return true;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$f */
    private class C3155f extends AbstractC3161l {
        C3155f() {
            super(C3149b.this, null);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.material.floatingactionbutton.C3149b.AbstractC3161l
        /* renamed from: a */
        public float mo10635a() {
            return 0.0f;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$g */
    private class C3156g extends AbstractC3161l {
        C3156g() {
            super(C3149b.this, null);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.material.floatingactionbutton.C3149b.AbstractC3161l
        /* renamed from: a */
        public float mo10635a() {
            C3149b bVar = C3149b.this;
            return bVar.f10541o + bVar.f10542p;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$h */
    private class C3157h extends AbstractC3161l {
        C3157h() {
            super(C3149b.this, null);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.material.floatingactionbutton.C3149b.AbstractC3161l
        /* renamed from: a */
        public float mo10635a() {
            C3149b bVar = C3149b.this;
            return bVar.f10541o + bVar.f10543q;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.b$i */
    public interface AbstractC3158i {
        /* renamed from: a */
        void mo10577a();

        /* renamed from: b */
        void mo10578b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.floatingactionbutton.b$j */
    public interface AbstractC3159j {
        /* renamed from: a */
        void mo10575a();

        /* renamed from: b */
        void mo10576b();
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$k */
    private class C3160k extends AbstractC3161l {
        C3160k() {
            super(C3149b.this, null);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.material.floatingactionbutton.C3149b.AbstractC3161l
        /* renamed from: a */
        public float mo10635a() {
            return C3149b.this.f10541o;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$l */
    private abstract class AbstractC3161l extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        private boolean f10568a;

        /* renamed from: b */
        private float f10569b;

        /* renamed from: c */
        private float f10570c;

        private AbstractC3161l() {
        }

        /* synthetic */ AbstractC3161l(C3149b bVar, C3150a aVar) {
            this();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract float mo10635a();

        public void onAnimationEnd(Animator animator) {
            C3149b.this.mo10608c0((float) ((int) this.f10570c));
            this.f10568a = false;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f10568a) {
                C1455g gVar = C3149b.this.f10535i;
                this.f10569b = gVar == null ? 0.0f : gVar.mo6635w();
                this.f10570c = mo10635a();
                this.f10568a = true;
            }
            C3149b bVar = C3149b.this;
            float f = this.f10569b;
            bVar.mo10608c0((float) ((int) (f + ((this.f10570c - f) * valueAnimator.getAnimatedFraction()))));
        }
    }

    C3149b(FloatingActionButton floatingActionButton, AbstractC1448b bVar) {
        this.f10527F = floatingActionButton;
        this.f10528G = bVar;
        C3194l lVar = new C3194l();
        this.f10545s = lVar;
        lVar.mo10782a(f10516b, m13172i(new C3157h()));
        lVar.mo10782a(f10517c, m13172i(new C3156g()));
        lVar.mo10782a(f10518d, m13172i(new C3156g()));
        lVar.mo10782a(f10519e, m13172i(new C3156g()));
        lVar.mo10782a(f10520f, m13172i(new C3160k()));
        lVar.mo10782a(f10521g, m13172i(new C3155f()));
        this.f10551y = floatingActionButton.getRotation();
    }

    /* renamed from: W */
    private boolean m13165W() {
        return C1013s.m5737O(this.f10527F) && !this.f10527F.isInEditMode();
    }

    /* renamed from: d0 */
    private void m13169d0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT == 26) {
            objectAnimator.setEvaluator(new C3153d());
        }
    }

    /* renamed from: g */
    private void m13170g(float f, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f10527F.getDrawable();
        if (drawable != null && this.f10522A != 0) {
            RectF rectF = this.f10530I;
            RectF rectF2 = this.f10531J;
            rectF.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            int i = this.f10522A;
            rectF2.set(0.0f, 0.0f, (float) i, (float) i);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            int i2 = this.f10522A;
            matrix.postScale(f, f, ((float) i2) / 2.0f, ((float) i2) / 2.0f);
        }
    }

    /* renamed from: h */
    private AnimatorSet m13171h(C1408h hVar, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f10527F, View.ALPHA, f);
        hVar.mo6463e("opacity").mo6471a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f10527F, View.SCALE_X, f2);
        hVar.mo6463e("scale").mo6471a(ofFloat2);
        m13169d0(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f10527F, View.SCALE_Y, f2);
        hVar.mo6463e("scale").mo6471a(ofFloat3);
        m13169d0(ofFloat3);
        arrayList.add(ofFloat3);
        m13170g(f3, this.f10532K);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f10527F, new C1406f(), new C3152c(), new Matrix(this.f10532K));
        hVar.mo6463e("iconScale").mo6471a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C1402b.m7001a(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: i */
    private ValueAnimator m13172i(AbstractC3161l lVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f10515a);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(lVar);
        valueAnimator.addUpdateListener(lVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    /* renamed from: k */
    private C1408h m13173k() {
        if (this.f10547u == null) {
            this.f10547u = C1408h.m7013c(this.f10527F.getContext(), C1388a.design_fab_hide_motion_spec);
        }
        return (C1408h) C0961i.m5494c(this.f10547u);
    }

    /* renamed from: l */
    private C1408h m13174l() {
        if (this.f10546t == null) {
            this.f10546t = C1408h.m7013c(this.f10527F.getContext(), C1388a.design_fab_show_motion_spec);
        }
        return (C1408h) C0961i.m5494c(this.f10546t);
    }

    /* renamed from: q */
    private ViewTreeObserver.OnPreDrawListener m13175q() {
        if (this.f10533L == null) {
            this.f10533L = new ViewTreeObserver$OnPreDrawListenerC3154e();
        }
        return this.f10533L;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo10581A() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo10582B() {
        ViewTreeObserver viewTreeObserver = this.f10527F.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.f10533L;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.f10533L = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo10583C(int[] iArr) {
        this.f10545s.mo10784d(iArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo10584D(float f, float f2, float f3) {
        mo10607b0();
        mo10608c0(f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo10585E(Rect rect) {
        AbstractC1448b bVar;
        Drawable drawable;
        C0961i.m5495d(this.f10538l, "Didn't initialize content background");
        if (mo10602V()) {
            drawable = new InsetDrawable(this.f10538l, rect.left, rect.top, rect.right, rect.bottom);
            bVar = this.f10528G;
        } else {
            bVar = this.f10528G;
            drawable = this.f10538l;
        }
        bVar.mo6584b(drawable);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo10586F() {
        float rotation = this.f10527F.getRotation();
        if (this.f10551y != rotation) {
            this.f10551y = rotation;
            mo10605Z();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo10587G() {
        ArrayList<AbstractC3158i> arrayList = this.f10526E;
        if (arrayList != null) {
            Iterator<AbstractC3158i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo10577a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo10588H() {
        ArrayList<AbstractC3158i> arrayList = this.f10526E;
        if (arrayList != null) {
            Iterator<AbstractC3158i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo10578b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public boolean mo10589I() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo10590J(ColorStateList colorStateList) {
        C1455g gVar = this.f10535i;
        if (gVar != null) {
            gVar.setTintList(colorStateList);
        }
        if (this.f10537k != null) {
            throw null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public void mo10591K(PorterDuff.Mode mode) {
        C1455g gVar = this.f10535i;
        if (gVar != null) {
            gVar.setTintMode(mode);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public final void mo10592L(float f) {
        if (this.f10541o != f) {
            this.f10541o = f;
            mo10584D(f, this.f10542p, this.f10543q);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public void mo10593M(boolean z) {
        this.f10539m = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public final void mo10594N(C1408h hVar) {
        this.f10550x = hVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public final void mo10595O(float f) {
        if (this.f10542p != f) {
            this.f10542p = f;
            mo10584D(this.f10541o, f, this.f10543q);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public final void mo10596P(float f) {
        this.f10552z = f;
        Matrix matrix = this.f10532K;
        m13170g(f, matrix);
        this.f10527F.setImageMatrix(matrix);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public final void mo10597Q(float f) {
        if (this.f10543q != f) {
            this.f10543q = f;
            mo10584D(this.f10541o, this.f10542p, f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo10598R(ColorStateList colorStateList) {
        Drawable drawable = this.f10536j;
        if (drawable != null) {
            C0398a.m1978o(drawable, C1446b.m7103a(colorStateList));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public void mo10599S(boolean z) {
        this.f10540n = z;
        mo10607b0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public final void mo10600T(C1462k kVar) {
        this.f10534h = kVar;
        C1455g gVar = this.f10535i;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
        Drawable drawable = this.f10536j;
        if (drawable instanceof AbstractC1477n) {
            ((AbstractC1477n) drawable).setShapeAppearanceModel(kVar);
        }
        if (this.f10537k != null) {
            throw null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public final void mo10601U(C1408h hVar) {
        this.f10549w = hVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public boolean mo10602V() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public final boolean mo10603X() {
        return !this.f10539m || this.f10527F.getSizeDimension() >= this.f10544r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public void mo10604Y(AbstractC3159j jVar, boolean z) {
        if (!mo10623x()) {
            Animator animator = this.f10548v;
            if (animator != null) {
                animator.cancel();
            }
            if (m13165W()) {
                if (this.f10527F.getVisibility() != 0) {
                    this.f10527F.setAlpha(0.0f);
                    this.f10527F.setScaleY(0.0f);
                    this.f10527F.setScaleX(0.0f);
                    mo10596P(0.0f);
                }
                C1408h hVar = this.f10549w;
                if (hVar == null) {
                    hVar = m13174l();
                }
                AnimatorSet h = m13171h(hVar, 1.0f, 1.0f, 1.0f);
                h.addListener(new C3151b(z, jVar));
                ArrayList<Animator.AnimatorListener> arrayList = this.f10524C;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        h.addListener(it.next());
                    }
                }
                h.start();
                return;
            }
            this.f10527F.mo10802b(0, z);
            this.f10527F.setAlpha(1.0f);
            this.f10527F.setScaleY(1.0f);
            this.f10527F.setScaleX(1.0f);
            mo10596P(1.0f);
            if (jVar != null) {
                jVar.mo10575a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public void mo10605Z() {
        int i;
        FloatingActionButton floatingActionButton;
        if (Build.VERSION.SDK_INT == 19) {
            if (this.f10551y % 90.0f != 0.0f) {
                i = 1;
                if (this.f10527F.getLayerType() != 1) {
                    floatingActionButton = this.f10527F;
                }
            } else if (this.f10527F.getLayerType() != 0) {
                floatingActionButton = this.f10527F;
                i = 0;
            }
            floatingActionButton.setLayerType(i, null);
        }
        C1455g gVar = this.f10535i;
        if (gVar != null) {
            gVar.mo6612Z((int) this.f10551y);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a0 */
    public final void mo10606a0() {
        mo10596P(this.f10552z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public final void mo10607b0() {
        Rect rect = this.f10529H;
        mo10617r(rect);
        mo10585E(rect);
        this.f10528G.mo6583a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public void mo10608c0(float f) {
        C1455g gVar = this.f10535i;
        if (gVar != null) {
            gVar.mo6607U(f);
        }
    }

    /* renamed from: d */
    public void mo10609d(Animator.AnimatorListener animatorListener) {
        if (this.f10525D == null) {
            this.f10525D = new ArrayList<>();
        }
        this.f10525D.add(animatorListener);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo10610e(Animator.AnimatorListener animatorListener) {
        if (this.f10524C == null) {
            this.f10524C = new ArrayList<>();
        }
        this.f10524C.add(animatorListener);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo10611f(AbstractC3158i iVar) {
        if (this.f10526E == null) {
            this.f10526E = new ArrayList<>();
        }
        this.f10526E.add(iVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final Drawable mo10612j() {
        return this.f10538l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public float mo10613m() {
        return this.f10541o;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo10614n() {
        return this.f10539m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final C1408h mo10615o() {
        return this.f10550x;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public float mo10616p() {
        return this.f10542p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo10617r(Rect rect) {
        int sizeDimension = this.f10539m ? (this.f10544r - this.f10527F.getSizeDimension()) / 2 : 0;
        float m = this.f10540n ? mo10613m() + this.f10543q : 0.0f;
        int max = Math.max(sizeDimension, (int) Math.ceil((double) m));
        int max2 = Math.max(sizeDimension, (int) Math.ceil((double) (m * 1.5f)));
        rect.set(max, max2, max, max2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public float mo10618s() {
        return this.f10543q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final C1462k mo10619t() {
        return this.f10534h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final C1408h mo10620u() {
        return this.f10549w;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo10621v(AbstractC3159j jVar, boolean z) {
        if (!mo10622w()) {
            Animator animator = this.f10548v;
            if (animator != null) {
                animator.cancel();
            }
            if (m13165W()) {
                C1408h hVar = this.f10550x;
                if (hVar == null) {
                    hVar = m13173k();
                }
                AnimatorSet h = m13171h(hVar, 0.0f, 0.0f, 0.0f);
                h.addListener(new C3150a(z, jVar));
                ArrayList<Animator.AnimatorListener> arrayList = this.f10525D;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        h.addListener(it.next());
                    }
                }
                h.start();
                return;
            }
            this.f10527F.mo10802b(z ? 8 : 4, z);
            if (jVar != null) {
                jVar.mo10576b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public boolean mo10622w() {
        return this.f10527F.getVisibility() == 0 ? this.f10523B == 1 : this.f10523B != 2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean mo10623x() {
        return this.f10527F.getVisibility() != 0 ? this.f10523B == 2 : this.f10523B != 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo10624y() {
        this.f10545s.mo10783c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo10625z() {
        C1455g gVar = this.f10535i;
        if (gVar != null) {
            C1459h.m7186f(this.f10527F, gVar);
        }
        if (mo10589I()) {
            this.f10527F.getViewTreeObserver().addOnPreDrawListener(m13175q());
        }
    }
}
