package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import p006b.p030g.p039k.C1013s;
import p069c.p073b.p074a.p090b.C1395f;
import p069c.p073b.p074a.p090b.p092l.C1401a;
import p069c.p073b.p074a.p090b.p092l.C1402b;
import p069c.p073b.p074a.p090b.p092l.C1403c;
import p069c.p073b.p074a.p090b.p092l.C1404d;
import p069c.p073b.p074a.p090b.p092l.C1405e;
import p069c.p073b.p074a.p090b.p092l.C1408h;
import p069c.p073b.p074a.p090b.p092l.C1409i;
import p069c.p073b.p074a.p090b.p092l.C1410j;
import p069c.p073b.p074a.p090b.p096p.AbstractC1421d;
import p069c.p073b.p074a.p090b.p096p.C1417a;
import p069c.p073b.p074a.p090b.p096p.C1420c;
import p069c.p073b.p074a.p090b.p102u.C1432a;

@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    private final Rect f10997c;

    /* renamed from: d */
    private final RectF f10998d;

    /* renamed from: e */
    private final RectF f10999e;

    /* renamed from: f */
    private final int[] f11000f;

    /* renamed from: g */
    private float f11001g;

    /* renamed from: h */
    private float f11002h;

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$a */
    class C3291a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f11003a;

        /* renamed from: b */
        final /* synthetic */ View f11004b;

        /* renamed from: c */
        final /* synthetic */ View f11005c;

        C3291a(boolean z, View view, View view2) {
            this.f11003a = z;
            this.f11004b = view;
            this.f11005c = view2;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f11003a) {
                this.f11004b.setVisibility(4);
                this.f11005c.setAlpha(1.0f);
                this.f11005c.setVisibility(0);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.f11003a) {
                this.f11004b.setVisibility(0);
                this.f11005c.setAlpha(0.0f);
                this.f11005c.setVisibility(4);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$b */
    public class C3292b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f11007a;

        C3292b(View view) {
            this.f11007a = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f11007a.invalidate();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$c */
    public class C3293c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ AbstractC1421d f11009a;

        /* renamed from: b */
        final /* synthetic */ Drawable f11010b;

        C3293c(AbstractC1421d dVar, Drawable drawable) {
            this.f11009a = dVar;
            this.f11010b = drawable;
        }

        public void onAnimationEnd(Animator animator) {
            this.f11009a.setCircularRevealOverlayDrawable(null);
        }

        public void onAnimationStart(Animator animator) {
            this.f11009a.setCircularRevealOverlayDrawable(this.f11010b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$d */
    public class C3294d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ AbstractC1421d f11012a;

        C3294d(AbstractC1421d dVar) {
            this.f11012a = dVar;
        }

        public void onAnimationEnd(Animator animator) {
            AbstractC1421d.C1426e revealInfo = this.f11012a.getRevealInfo();
            revealInfo.f6051c = Float.MAX_VALUE;
            this.f11012a.setRevealInfo(revealInfo);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$e */
    public static class C3295e {

        /* renamed from: a */
        public C1408h f11014a;

        /* renamed from: b */
        public C1410j f11015b;

        protected C3295e() {
        }
    }

    public FabTransformationBehavior() {
        this.f10997c = new Rect();
        this.f10998d = new RectF();
        this.f10999e = new RectF();
        this.f11000f = new int[2];
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10997c = new Rect();
        this.f10998d = new RectF();
        this.f10999e = new RectF();
        this.f11000f = new int[2];
    }

    /* renamed from: K */
    private ViewGroup m13777K(View view) {
        View findViewById = view.findViewById(C1395f.mtrl_child_content_container);
        return findViewById != null ? m13797f0(findViewById) : ((view instanceof C3298b) || (view instanceof C3297a)) ? m13797f0(((ViewGroup) view).getChildAt(0)) : m13797f0(view);
    }

    /* renamed from: L */
    private void m13778L(View view, C3295e eVar, C1409i iVar, C1409i iVar2, float f, float f2, float f3, float f4, RectF rectF) {
        float S = m13785S(eVar, iVar, f, f3);
        float S2 = m13785S(eVar, iVar2, f2, f4);
        Rect rect = this.f10997c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f10998d;
        rectF2.set(rect);
        RectF rectF3 = this.f10999e;
        m13786T(view, rectF3);
        rectF3.offset(S, S2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    /* renamed from: M */
    private void m13779M(View view, RectF rectF) {
        m13786T(view, rectF);
        rectF.offset(this.f11001g, this.f11002h);
    }

    /* renamed from: N */
    private Pair<C1409i, C1409i> m13780N(float f, float f2, boolean z, C3295e eVar) {
        String str;
        C1408h hVar;
        C1409i iVar;
        if (f == 0.0f || f2 == 0.0f) {
            iVar = eVar.f11014a.mo6463e("translationXLinear");
            hVar = eVar.f11014a;
            str = "translationYLinear";
        } else if ((!z || f2 >= 0.0f) && (z || f2 <= 0.0f)) {
            iVar = eVar.f11014a.mo6463e("translationXCurveDownwards");
            hVar = eVar.f11014a;
            str = "translationYCurveDownwards";
        } else {
            iVar = eVar.f11014a.mo6463e("translationXCurveUpwards");
            hVar = eVar.f11014a;
            str = "translationYCurveUpwards";
        }
        return new Pair<>(iVar, hVar.mo6463e(str));
    }

    /* renamed from: O */
    private float m13781O(View view, View view2, C1410j jVar) {
        RectF rectF = this.f10998d;
        RectF rectF2 = this.f10999e;
        m13779M(view, rectF);
        m13786T(view2, rectF2);
        rectF2.offset(-m13783Q(view, view2, jVar), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    /* renamed from: P */
    private float m13782P(View view, View view2, C1410j jVar) {
        RectF rectF = this.f10998d;
        RectF rectF2 = this.f10999e;
        m13779M(view, rectF);
        m13786T(view2, rectF2);
        rectF2.offset(0.0f, -m13784R(view, view2, jVar));
        return rectF.centerY() - rectF2.top;
    }

    /* renamed from: Q */
    private float m13783Q(View view, View view2, C1410j jVar) {
        float f;
        float f2;
        float f3;
        RectF rectF = this.f10998d;
        RectF rectF2 = this.f10999e;
        m13779M(view, rectF);
        m13786T(view2, rectF2);
        int i = jVar.f6026a & 7;
        if (i == 1) {
            f3 = rectF2.centerX();
            f2 = rectF.centerX();
        } else if (i == 3) {
            f3 = rectF2.left;
            f2 = rectF.left;
        } else if (i != 5) {
            f = 0.0f;
            return f + jVar.f6027b;
        } else {
            f3 = rectF2.right;
            f2 = rectF.right;
        }
        f = f3 - f2;
        return f + jVar.f6027b;
    }

    /* renamed from: R */
    private float m13784R(View view, View view2, C1410j jVar) {
        float f;
        float f2;
        float f3;
        RectF rectF = this.f10998d;
        RectF rectF2 = this.f10999e;
        m13779M(view, rectF);
        m13786T(view2, rectF2);
        int i = jVar.f6026a & 112;
        if (i == 16) {
            f3 = rectF2.centerY();
            f2 = rectF.centerY();
        } else if (i == 48) {
            f3 = rectF2.top;
            f2 = rectF.top;
        } else if (i != 80) {
            f = 0.0f;
            return f + jVar.f6028c;
        } else {
            f3 = rectF2.bottom;
            f2 = rectF.bottom;
        }
        f = f3 - f2;
        return f + jVar.f6028c;
    }

    /* renamed from: S */
    private float m13785S(C3295e eVar, C1409i iVar, float f, float f2) {
        long c = iVar.mo6472c();
        long d = iVar.mo6473d();
        C1409i e = eVar.f11014a.mo6463e("expansion");
        return C1401a.m7000a(f, f2, iVar.mo6474e().getInterpolation(((float) (((e.mo6472c() + e.mo6473d()) + 17) - c)) / ((float) d)));
    }

    /* renamed from: T */
    private void m13786T(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.f11000f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    /* renamed from: U */
    private void m13787U(View view, View view2, boolean z, boolean z2, C3295e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup K;
        ObjectAnimator objectAnimator;
        if (view2 instanceof ViewGroup) {
            if ((!(view2 instanceof AbstractC1421d) || C1420c.f6044a != 0) && (K = m13777K(view2)) != null) {
                if (z) {
                    if (!z2) {
                        C1404d.f6012a.set(K, Float.valueOf(0.0f));
                    }
                    objectAnimator = ObjectAnimator.ofFloat(K, C1404d.f6012a, 1.0f);
                } else {
                    objectAnimator = ObjectAnimator.ofFloat(K, C1404d.f6012a, 0.0f);
                }
                eVar.f11014a.mo6463e("contentFade").mo6471a(objectAnimator);
                list.add(objectAnimator);
            }
        }
    }

    /* renamed from: V */
    private void m13788V(View view, View view2, boolean z, boolean z2, C3295e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if (view2 instanceof AbstractC1421d) {
            AbstractC1421d dVar = (AbstractC1421d) view2;
            int d0 = m13796d0(view);
            int i = 16777215 & d0;
            if (z) {
                if (!z2) {
                    dVar.setCircularRevealScrimColor(d0);
                }
                objectAnimator = ObjectAnimator.ofInt(dVar, AbstractC1421d.C1425d.f6048a, i);
            } else {
                objectAnimator = ObjectAnimator.ofInt(dVar, AbstractC1421d.C1425d.f6048a, d0);
            }
            objectAnimator.setEvaluator(C1403c.m7002b());
            eVar.f11014a.mo6463e("color").mo6471a(objectAnimator);
            list.add(objectAnimator);
        }
    }

    /* renamed from: W */
    private void m13789W(View view, View view2, boolean z, C3295e eVar, List<Animator> list) {
        float Q = m13783Q(view, view2, eVar.f11015b);
        float R = m13784R(view, view2, eVar.f11015b);
        Pair<C1409i, C1409i> N = m13780N(Q, R, z, eVar);
        C1409i iVar = (C1409i) N.first;
        C1409i iVar2 = (C1409i) N.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z) {
            Q = this.f11001g;
        }
        fArr[0] = Q;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z) {
            R = this.f11002h;
        }
        fArr2[0] = R;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, property2, fArr2);
        iVar.mo6471a(ofFloat);
        iVar2.mo6471a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    @TargetApi(21)
    /* renamed from: X */
    private void m13790X(View view, View view2, boolean z, boolean z2, C3295e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        float t = C1013s.m5787t(view2) - C1013s.m5787t(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-t);
            }
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, -t);
        }
        eVar.f11014a.mo6463e("elevation").mo6471a(objectAnimator);
        list.add(objectAnimator);
    }

    /* renamed from: Y */
    private void m13791Y(View view, View view2, boolean z, boolean z2, C3295e eVar, float f, float f2, List<Animator> list, List<Animator.AnimatorListener> list2) {
        Animator animator;
        if (view2 instanceof AbstractC1421d) {
            AbstractC1421d dVar = (AbstractC1421d) view2;
            float O = m13781O(view, view2, eVar.f11015b);
            float P = m13782P(view, view2, eVar.f11015b);
            ((FloatingActionButton) view).mo10525i(this.f10997c);
            float width = ((float) this.f10997c.width()) / 2.0f;
            C1409i e = eVar.f11014a.mo6463e("expansion");
            if (z) {
                if (!z2) {
                    dVar.setRevealInfo(new AbstractC1421d.C1426e(O, P, width));
                }
                if (z2) {
                    width = dVar.getRevealInfo().f6051c;
                }
                animator = C1417a.m7036a(dVar, O, P, C1432a.m7065b(O, P, 0.0f, 0.0f, f, f2));
                animator.addListener(new C3294d(dVar));
                m13794b0(view2, e.mo6472c(), (int) O, (int) P, width, list);
            } else {
                float f3 = dVar.getRevealInfo().f6051c;
                Animator a = C1417a.m7036a(dVar, O, P, width);
                int i = (int) O;
                int i2 = (int) P;
                m13794b0(view2, e.mo6472c(), i, i2, f3, list);
                m13793a0(view2, e.mo6472c(), e.mo6473d(), eVar.f11014a.mo6465f(), i, i2, width, list);
                animator = a;
            }
            e.mo6471a(animator);
            list.add(animator);
            list2.add(C1417a.m7037b(dVar));
        }
    }

    /* renamed from: Z */
    private void m13792Z(View view, View view2, boolean z, boolean z2, C3295e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if ((view2 instanceof AbstractC1421d) && (view instanceof ImageView)) {
            AbstractC1421d dVar = (AbstractC1421d) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable != null) {
                drawable.mutate();
                if (z) {
                    if (!z2) {
                        drawable.setAlpha(255);
                    }
                    objectAnimator = ObjectAnimator.ofInt(drawable, C1405e.f6013a, 0);
                } else {
                    objectAnimator = ObjectAnimator.ofInt(drawable, C1405e.f6013a, 255);
                }
                objectAnimator.addUpdateListener(new C3292b(view2));
                eVar.f11014a.mo6463e("iconFade").mo6471a(objectAnimator);
                list.add(objectAnimator);
                list2.add(new C3293c(dVar, drawable));
            }
        }
    }

    /* renamed from: a0 */
    private void m13793a0(View view, long j, long j2, long j3, int i, int i2, float f, List<Animator> list) {
        if (Build.VERSION.SDK_INT >= 21) {
            long j4 = j + j2;
            if (j4 < j3) {
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
                createCircularReveal.setStartDelay(j4);
                createCircularReveal.setDuration(j3 - j4);
                list.add(createCircularReveal);
            }
        }
    }

    /* renamed from: b0 */
    private void m13794b0(View view, long j, int i, int i2, float f, List<Animator> list) {
        if (Build.VERSION.SDK_INT >= 21 && j > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            createCircularReveal.setStartDelay(0);
            createCircularReveal.setDuration(j);
            list.add(createCircularReveal);
        }
    }

    /* renamed from: c0 */
    private void m13795c0(View view, View view2, boolean z, boolean z2, C3295e eVar, List<Animator> list, List<Animator.AnimatorListener> list2, RectF rectF) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        float Q = m13783Q(view, view2, eVar.f11015b);
        float R = m13784R(view, view2, eVar.f11015b);
        Pair<C1409i, C1409i> N = m13780N(Q, R, z, eVar);
        C1409i iVar = (C1409i) N.first;
        C1409i iVar2 = (C1409i) N.second;
        if (z) {
            if (!z2) {
                view2.setTranslationX(-Q);
                view2.setTranslationY(-R);
            }
            objectAnimator2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, 0.0f);
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, 0.0f);
            m13778L(view2, eVar, iVar, iVar2, -Q, -R, 0.0f, 0.0f, rectF);
        } else {
            objectAnimator2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, -Q);
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, -R);
        }
        iVar.mo6471a(objectAnimator2);
        iVar2.mo6471a(objectAnimator);
        list.add(objectAnimator2);
        list.add(objectAnimator);
    }

    /* renamed from: d0 */
    private int m13796d0(View view) {
        ColorStateList p = C1013s.m5779p(view);
        if (p != null) {
            return p.getColorForState(view.getDrawableState(), p.getDefaultColor());
        }
        return 0;
    }

    /* renamed from: f0 */
    private ViewGroup m13797f0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* renamed from: J */
    public AnimatorSet mo11157J(View view, View view2, boolean z, boolean z2) {
        C3295e e0 = mo11159e0(view2.getContext(), z);
        if (z) {
            this.f11001g = view.getTranslationX();
            this.f11002h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (Build.VERSION.SDK_INT >= 21) {
            m13790X(view, view2, z, z2, e0, arrayList, arrayList2);
        }
        RectF rectF = this.f10998d;
        m13795c0(view, view2, z, z2, e0, arrayList, arrayList2, rectF);
        float width = rectF.width();
        float height = rectF.height();
        m13789W(view, view2, z, e0, arrayList);
        m13792Z(view, view2, z, z2, e0, arrayList, arrayList2);
        m13791Y(view, view2, z, z2, e0, width, height, arrayList, arrayList2);
        m13788V(view, view2, z, z2, e0, arrayList, arrayList2);
        m13787U(view, view2, z, z2, e0, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        C1402b.m7001a(animatorSet, arrayList);
        animatorSet.addListener(new C3291a(z, view2, view));
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            animatorSet.addListener(arrayList2.get(i));
        }
        return animatorSet;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0337c
    /* renamed from: e */
    public boolean mo2091e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof FloatingActionButton)) {
            return false;
        } else {
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e0 */
    public abstract C3295e mo11159e0(Context context, boolean z);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0337c
    /* renamed from: g */
    public void mo2093g(CoordinatorLayout.C0340f fVar) {
        if (fVar.f1930h == 0) {
            fVar.f1930h = 80;
        }
    }
}
