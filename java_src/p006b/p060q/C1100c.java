package p006b.p060q;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import p006b.p030g.p039k.C1013s;

/* renamed from: b.q.c */
public class C1100c extends AbstractC1142m {

    /* renamed from: L */
    private static final String[] f5034L = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: M */
    private static final Property<Drawable, PointF> f5035M = new C1102b(PointF.class, "boundsOrigin");

    /* renamed from: N */
    private static final Property<C1111k, PointF> f5036N = new C1103c(PointF.class, "topLeft");

    /* renamed from: O */
    private static final Property<C1111k, PointF> f5037O = new C1104d(PointF.class, "bottomRight");

    /* renamed from: P */
    private static final Property<View, PointF> f5038P = new C1105e(PointF.class, "bottomRight");

    /* renamed from: Q */
    private static final Property<View, PointF> f5039Q = new C1106f(PointF.class, "topLeft");

    /* renamed from: R */
    private static final Property<View, PointF> f5040R = new C1107g(PointF.class, "position");

    /* renamed from: S */
    private static C1138k f5041S = new C1138k();

    /* renamed from: T */
    private int[] f5042T = new int[2];

    /* renamed from: U */
    private boolean f5043U = false;

    /* renamed from: V */
    private boolean f5044V = false;

    /* renamed from: b.q.c$a */
    class C1101a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f5045a;

        /* renamed from: b */
        final /* synthetic */ BitmapDrawable f5046b;

        /* renamed from: c */
        final /* synthetic */ View f5047c;

        /* renamed from: d */
        final /* synthetic */ float f5048d;

        C1101a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f) {
            this.f5045a = viewGroup;
            this.f5046b = bitmapDrawable;
            this.f5047c = view;
            this.f5048d = f;
        }

        public void onAnimationEnd(Animator animator) {
            C1112c0.m6168b(this.f5045a).mo5730d(this.f5046b);
            C1112c0.m6173g(this.f5047c, this.f5048d);
        }
    }

    /* renamed from: b.q.c$b */
    static class C1102b extends Property<Drawable, PointF> {

        /* renamed from: a */
        private Rect f5050a = new Rect();

        C1102b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f5050a);
            Rect rect = this.f5050a;
            return new PointF((float) rect.left, (float) rect.top);
        }

        /* renamed from: b */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f5050a);
            this.f5050a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f5050a);
        }
    }

    /* renamed from: b.q.c$c */
    static class C1103c extends Property<C1111k, PointF> {
        C1103c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(C1111k kVar) {
            return null;
        }

        /* renamed from: b */
        public void set(C1111k kVar, PointF pointF) {
            kVar.mo5767c(pointF);
        }
    }

    /* renamed from: b.q.c$d */
    static class C1104d extends Property<C1111k, PointF> {
        C1104d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(C1111k kVar) {
            return null;
        }

        /* renamed from: b */
        public void set(C1111k kVar, PointF pointF) {
            kVar.mo5766a(pointF);
        }
    }

    /* renamed from: b.q.c$e */
    static class C1105e extends Property<View, PointF> {
        C1105e(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            C1112c0.m6172f(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* renamed from: b.q.c$f */
    static class C1106f extends Property<View, PointF> {
        C1106f(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            C1112c0.m6172f(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: b.q.c$g */
    static class C1107g extends Property<View, PointF> {
        C1107g(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            C1112c0.m6172f(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* renamed from: b.q.c$h */
    class C1108h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C1111k f5051a;
        private C1111k mViewBounds;

        C1108h(C1111k kVar) {
            this.f5051a = kVar;
            this.mViewBounds = kVar;
        }
    }

    /* renamed from: b.q.c$i */
    class C1109i extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f5053a;

        /* renamed from: b */
        final /* synthetic */ View f5054b;

        /* renamed from: c */
        final /* synthetic */ Rect f5055c;

        /* renamed from: d */
        final /* synthetic */ int f5056d;

        /* renamed from: e */
        final /* synthetic */ int f5057e;

        /* renamed from: f */
        final /* synthetic */ int f5058f;

        /* renamed from: g */
        final /* synthetic */ int f5059g;

        C1109i(View view, Rect rect, int i, int i2, int i3, int i4) {
            this.f5054b = view;
            this.f5055c = rect;
            this.f5056d = i;
            this.f5057e = i2;
            this.f5058f = i3;
            this.f5059g = i4;
        }

        public void onAnimationCancel(Animator animator) {
            this.f5053a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f5053a) {
                C1013s.m5778o0(this.f5054b, this.f5055c);
                C1112c0.m6172f(this.f5054b, this.f5056d, this.f5057e, this.f5058f, this.f5059g);
            }
        }
    }

    /* renamed from: b.q.c$j */
    class C1110j extends C1150n {

        /* renamed from: a */
        boolean f5061a = false;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f5062b;

        C1110j(ViewGroup viewGroup) {
            this.f5062b = viewGroup;
        }

        @Override // p006b.p060q.AbstractC1142m.AbstractC1148f, p006b.p060q.C1150n
        /* renamed from: a */
        public void mo5762a(AbstractC1142m mVar) {
            C1164x.m6385c(this.f5062b, false);
        }

        @Override // p006b.p060q.AbstractC1142m.AbstractC1148f, p006b.p060q.C1150n
        /* renamed from: b */
        public void mo5763b(AbstractC1142m mVar) {
            C1164x.m6385c(this.f5062b, true);
        }

        @Override // p006b.p060q.AbstractC1142m.AbstractC1148f, p006b.p060q.C1150n
        /* renamed from: d */
        public void mo5764d(AbstractC1142m mVar) {
            C1164x.m6385c(this.f5062b, false);
            this.f5061a = true;
        }

        @Override // p006b.p060q.AbstractC1142m.AbstractC1148f
        /* renamed from: e */
        public void mo5765e(AbstractC1142m mVar) {
            if (!this.f5061a) {
                C1164x.m6385c(this.f5062b, false);
            }
            mVar.mo5816P(this);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b.q.c$k */
    public static class C1111k {

        /* renamed from: a */
        private int f5064a;

        /* renamed from: b */
        private int f5065b;

        /* renamed from: c */
        private int f5066c;

        /* renamed from: d */
        private int f5067d;

        /* renamed from: e */
        private View f5068e;

        /* renamed from: f */
        private int f5069f;

        /* renamed from: g */
        private int f5070g;

        C1111k(View view) {
            this.f5068e = view;
        }

        /* renamed from: b */
        private void m6164b() {
            C1112c0.m6172f(this.f5068e, this.f5064a, this.f5065b, this.f5066c, this.f5067d);
            this.f5069f = 0;
            this.f5070g = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5766a(PointF pointF) {
            this.f5066c = Math.round(pointF.x);
            this.f5067d = Math.round(pointF.y);
            int i = this.f5070g + 1;
            this.f5070g = i;
            if (this.f5069f == i) {
                m6164b();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo5767c(PointF pointF) {
            this.f5064a = Math.round(pointF.x);
            this.f5065b = Math.round(pointF.y);
            int i = this.f5069f + 1;
            this.f5069f = i;
            if (i == this.f5070g) {
                m6164b();
            }
        }
    }

    /* renamed from: c0 */
    private void m6142c0(C1159s sVar) {
        View view = sVar.f5193b;
        if (C1013s.m5737O(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            sVar.f5192a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            sVar.f5192a.put("android:changeBounds:parent", sVar.f5193b.getParent());
            if (this.f5044V) {
                sVar.f5193b.getLocationInWindow(this.f5042T);
                sVar.f5192a.put("android:changeBounds:windowX", Integer.valueOf(this.f5042T[0]));
                sVar.f5192a.put("android:changeBounds:windowY", Integer.valueOf(this.f5042T[1]));
            }
            if (this.f5043U) {
                sVar.f5192a.put("android:changeBounds:clip", C1013s.m5783r(view));
            }
        }
    }

    /* renamed from: d0 */
    private boolean m6143d0(View view, View view2) {
        if (!this.f5044V) {
            return true;
        }
        C1159s t = mo5842t(view, true);
        if (t == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == t.f5193b) {
            return true;
        }
        return false;
    }

    @Override // p006b.p060q.AbstractC1142m
    /* renamed from: D */
    public String[] mo5731D() {
        return f5034L;
    }

    @Override // p006b.p060q.AbstractC1142m
    /* renamed from: g */
    public void mo5732g(C1159s sVar) {
        m6142c0(sVar);
    }

    @Override // p006b.p060q.AbstractC1142m
    /* renamed from: j */
    public void mo5733j(C1159s sVar) {
        m6142c0(sVar);
    }

    @Override // p006b.p060q.AbstractC1142m
    /* renamed from: n */
    public Animator mo5734n(ViewGroup viewGroup, C1159s sVar, C1159s sVar2) {
        int i;
        View view;
        Animator animator;
        int i2;
        Rect rect;
        ObjectAnimator objectAnimator;
        Property<View, PointF> property;
        Path path;
        if (sVar == null || sVar2 == null) {
            return null;
        }
        Map<String, Object> map = sVar.f5192a;
        Map<String, Object> map2 = sVar2.f5192a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = sVar2.f5193b;
        if (m6143d0(viewGroup2, viewGroup3)) {
            Rect rect2 = (Rect) sVar.f5192a.get("android:changeBounds:bounds");
            Rect rect3 = (Rect) sVar2.f5192a.get("android:changeBounds:bounds");
            int i3 = rect2.left;
            int i4 = rect3.left;
            int i5 = rect2.top;
            int i6 = rect3.top;
            int i7 = rect2.right;
            int i8 = rect3.right;
            int i9 = rect2.bottom;
            int i10 = rect3.bottom;
            int i11 = i7 - i3;
            int i12 = i9 - i5;
            int i13 = i8 - i4;
            int i14 = i10 - i6;
            Rect rect4 = (Rect) sVar.f5192a.get("android:changeBounds:clip");
            Rect rect5 = (Rect) sVar2.f5192a.get("android:changeBounds:clip");
            if ((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0)) {
                i = 0;
            } else {
                i = (i3 == i4 && i5 == i6) ? 0 : 1;
                if (!(i7 == i8 && i9 == i10)) {
                    i++;
                }
            }
            if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
                i++;
            }
            if (i <= 0) {
                return null;
            }
            if (!this.f5043U) {
                view = view2;
                C1112c0.m6172f(view, i3, i5, i7, i9);
                if (i == 2) {
                    if (i11 == i13 && i12 == i14) {
                        path = mo5845v().mo5788a((float) i3, (float) i5, (float) i4, (float) i6);
                        property = f5040R;
                    } else {
                        C1111k kVar = new C1111k(view);
                        ObjectAnimator a = C1125f.m6217a(kVar, f5036N, mo5845v().mo5788a((float) i3, (float) i5, (float) i4, (float) i6));
                        ObjectAnimator a2 = C1125f.m6217a(kVar, f5037O, mo5845v().mo5788a((float) i7, (float) i9, (float) i8, (float) i10));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(a, a2);
                        animatorSet.addListener(new C1108h(kVar));
                        animator = animatorSet;
                    }
                } else if (i3 == i4 && i5 == i6) {
                    path = mo5845v().mo5788a((float) i7, (float) i9, (float) i8, (float) i10);
                    property = f5038P;
                } else {
                    path = mo5845v().mo5788a((float) i3, (float) i5, (float) i4, (float) i6);
                    property = f5039Q;
                }
                animator = C1125f.m6217a(view, property, path);
            } else {
                view = view2;
                C1112c0.m6172f(view, i3, i5, Math.max(i11, i13) + i3, Math.max(i12, i14) + i5);
                ObjectAnimator a3 = (i3 == i4 && i5 == i6) ? null : C1125f.m6217a(view, f5040R, mo5845v().mo5788a((float) i3, (float) i5, (float) i4, (float) i6));
                if (rect4 == null) {
                    i2 = 0;
                    rect = new Rect(0, 0, i11, i12);
                } else {
                    i2 = 0;
                    rect = rect4;
                }
                Rect rect6 = rect5 == null ? new Rect(i2, i2, i13, i14) : rect5;
                if (!rect.equals(rect6)) {
                    C1013s.m5778o0(view, rect);
                    C1138k kVar2 = f5041S;
                    Object[] objArr = new Object[2];
                    objArr[i2] = rect;
                    objArr[1] = rect6;
                    ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", kVar2, objArr);
                    ofObject.addListener(new C1109i(view, rect5, i4, i6, i8, i10));
                    objectAnimator = ofObject;
                } else {
                    objectAnimator = null;
                }
                animator = C1158r.m6373c(a3, objectAnimator);
            }
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                C1164x.m6385c(viewGroup4, true);
                mo5826a(new C1110j(viewGroup4));
            }
            return animator;
        }
        int intValue = ((Integer) sVar.f5192a.get("android:changeBounds:windowX")).intValue();
        int intValue2 = ((Integer) sVar.f5192a.get("android:changeBounds:windowY")).intValue();
        int intValue3 = ((Integer) sVar2.f5192a.get("android:changeBounds:windowX")).intValue();
        int intValue4 = ((Integer) sVar2.f5192a.get("android:changeBounds:windowY")).intValue();
        if (intValue == intValue3 && intValue2 == intValue4) {
            return null;
        }
        viewGroup.getLocationInWindow(this.f5042T);
        Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
        view2.draw(new Canvas(createBitmap));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
        float c = C1112c0.m6169c(view2);
        C1112c0.m6173g(view2, 0.0f);
        C1112c0.m6168b(viewGroup).mo5729b(bitmapDrawable);
        AbstractC1127g v = mo5845v();
        int[] iArr = this.f5042T;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, C1131i.m6229a(f5035M, v.mo5788a((float) (intValue - iArr[0]), (float) (intValue2 - iArr[1]), (float) (intValue3 - iArr[0]), (float) (intValue4 - iArr[1]))));
        ofPropertyValuesHolder.addListener(new C1101a(viewGroup, bitmapDrawable, view2, c));
        return ofPropertyValuesHolder;
    }
}
