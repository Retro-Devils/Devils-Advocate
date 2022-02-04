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
    private static final String[] f5027L = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: M */
    private static final Property<Drawable, PointF> f5028M = new C1102b(PointF.class, "boundsOrigin");

    /* renamed from: N */
    private static final Property<C1111k, PointF> f5029N = new C1103c(PointF.class, "topLeft");

    /* renamed from: O */
    private static final Property<C1111k, PointF> f5030O = new C1104d(PointF.class, "bottomRight");

    /* renamed from: P */
    private static final Property<View, PointF> f5031P = new C1105e(PointF.class, "bottomRight");

    /* renamed from: Q */
    private static final Property<View, PointF> f5032Q = new C1106f(PointF.class, "topLeft");

    /* renamed from: R */
    private static final Property<View, PointF> f5033R = new C1107g(PointF.class, "position");

    /* renamed from: S */
    private static C1138k f5034S = new C1138k();

    /* renamed from: T */
    private int[] f5035T = new int[2];

    /* renamed from: U */
    private boolean f5036U = false;

    /* renamed from: V */
    private boolean f5037V = false;

    /* renamed from: b.q.c$a */
    class C1101a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f5038a;

        /* renamed from: b */
        final /* synthetic */ BitmapDrawable f5039b;

        /* renamed from: c */
        final /* synthetic */ View f5040c;

        /* renamed from: d */
        final /* synthetic */ float f5041d;

        C1101a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f) {
            this.f5038a = viewGroup;
            this.f5039b = bitmapDrawable;
            this.f5040c = view;
            this.f5041d = f;
        }

        public void onAnimationEnd(Animator animator) {
            C1112c0.m6168b(this.f5038a).mo5730d(this.f5039b);
            C1112c0.m6173g(this.f5040c, this.f5041d);
        }
    }

    /* renamed from: b.q.c$b */
    static class C1102b extends Property<Drawable, PointF> {

        /* renamed from: a */
        private Rect f5043a = new Rect();

        C1102b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f5043a);
            Rect rect = this.f5043a;
            return new PointF((float) rect.left, (float) rect.top);
        }

        /* renamed from: b */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f5043a);
            this.f5043a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f5043a);
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
        final /* synthetic */ C1111k f5044a;
        private C1111k mViewBounds;

        C1108h(C1111k kVar) {
            this.f5044a = kVar;
            this.mViewBounds = kVar;
        }
    }

    /* renamed from: b.q.c$i */
    class C1109i extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f5046a;

        /* renamed from: b */
        final /* synthetic */ View f5047b;

        /* renamed from: c */
        final /* synthetic */ Rect f5048c;

        /* renamed from: d */
        final /* synthetic */ int f5049d;

        /* renamed from: e */
        final /* synthetic */ int f5050e;

        /* renamed from: f */
        final /* synthetic */ int f5051f;

        /* renamed from: g */
        final /* synthetic */ int f5052g;

        C1109i(View view, Rect rect, int i, int i2, int i3, int i4) {
            this.f5047b = view;
            this.f5048c = rect;
            this.f5049d = i;
            this.f5050e = i2;
            this.f5051f = i3;
            this.f5052g = i4;
        }

        public void onAnimationCancel(Animator animator) {
            this.f5046a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f5046a) {
                C1013s.m5778o0(this.f5047b, this.f5048c);
                C1112c0.m6172f(this.f5047b, this.f5049d, this.f5050e, this.f5051f, this.f5052g);
            }
        }
    }

    /* renamed from: b.q.c$j */
    class C1110j extends C1150n {

        /* renamed from: a */
        boolean f5054a = false;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f5055b;

        C1110j(ViewGroup viewGroup) {
            this.f5055b = viewGroup;
        }

        @Override // p006b.p060q.AbstractC1142m.AbstractC1148f, p006b.p060q.C1150n
        /* renamed from: a */
        public void mo5762a(AbstractC1142m mVar) {
            C1164x.m6385c(this.f5055b, false);
        }

        @Override // p006b.p060q.AbstractC1142m.AbstractC1148f, p006b.p060q.C1150n
        /* renamed from: b */
        public void mo5763b(AbstractC1142m mVar) {
            C1164x.m6385c(this.f5055b, true);
        }

        @Override // p006b.p060q.AbstractC1142m.AbstractC1148f, p006b.p060q.C1150n
        /* renamed from: d */
        public void mo5764d(AbstractC1142m mVar) {
            C1164x.m6385c(this.f5055b, false);
            this.f5054a = true;
        }

        @Override // p006b.p060q.AbstractC1142m.AbstractC1148f
        /* renamed from: e */
        public void mo5765e(AbstractC1142m mVar) {
            if (!this.f5054a) {
                C1164x.m6385c(this.f5055b, false);
            }
            mVar.mo5816P(this);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b.q.c$k */
    public static class C1111k {

        /* renamed from: a */
        private int f5057a;

        /* renamed from: b */
        private int f5058b;

        /* renamed from: c */
        private int f5059c;

        /* renamed from: d */
        private int f5060d;

        /* renamed from: e */
        private View f5061e;

        /* renamed from: f */
        private int f5062f;

        /* renamed from: g */
        private int f5063g;

        C1111k(View view) {
            this.f5061e = view;
        }

        /* renamed from: b */
        private void m6164b() {
            C1112c0.m6172f(this.f5061e, this.f5057a, this.f5058b, this.f5059c, this.f5060d);
            this.f5062f = 0;
            this.f5063g = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5766a(PointF pointF) {
            this.f5059c = Math.round(pointF.x);
            this.f5060d = Math.round(pointF.y);
            int i = this.f5063g + 1;
            this.f5063g = i;
            if (this.f5062f == i) {
                m6164b();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo5767c(PointF pointF) {
            this.f5057a = Math.round(pointF.x);
            this.f5058b = Math.round(pointF.y);
            int i = this.f5062f + 1;
            this.f5062f = i;
            if (i == this.f5063g) {
                m6164b();
            }
        }
    }

    /* renamed from: c0 */
    private void m6142c0(C1159s sVar) {
        View view = sVar.f5186b;
        if (C1013s.m5737O(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            sVar.f5185a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            sVar.f5185a.put("android:changeBounds:parent", sVar.f5186b.getParent());
            if (this.f5037V) {
                sVar.f5186b.getLocationInWindow(this.f5035T);
                sVar.f5185a.put("android:changeBounds:windowX", Integer.valueOf(this.f5035T[0]));
                sVar.f5185a.put("android:changeBounds:windowY", Integer.valueOf(this.f5035T[1]));
            }
            if (this.f5036U) {
                sVar.f5185a.put("android:changeBounds:clip", C1013s.m5783r(view));
            }
        }
    }

    /* renamed from: d0 */
    private boolean m6143d0(View view, View view2) {
        if (!this.f5037V) {
            return true;
        }
        C1159s t = mo5842t(view, true);
        if (t == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == t.f5186b) {
            return true;
        }
        return false;
    }

    @Override // p006b.p060q.AbstractC1142m
    /* renamed from: D */
    public String[] mo5731D() {
        return f5027L;
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
        Map<String, Object> map = sVar.f5185a;
        Map<String, Object> map2 = sVar2.f5185a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = sVar2.f5186b;
        if (m6143d0(viewGroup2, viewGroup3)) {
            Rect rect2 = (Rect) sVar.f5185a.get("android:changeBounds:bounds");
            Rect rect3 = (Rect) sVar2.f5185a.get("android:changeBounds:bounds");
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
            Rect rect4 = (Rect) sVar.f5185a.get("android:changeBounds:clip");
            Rect rect5 = (Rect) sVar2.f5185a.get("android:changeBounds:clip");
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
            if (!this.f5036U) {
                view = view2;
                C1112c0.m6172f(view, i3, i5, i7, i9);
                if (i == 2) {
                    if (i11 == i13 && i12 == i14) {
                        path = mo5845v().mo5788a((float) i3, (float) i5, (float) i4, (float) i6);
                        property = f5033R;
                    } else {
                        C1111k kVar = new C1111k(view);
                        ObjectAnimator a = C1125f.m6217a(kVar, f5029N, mo5845v().mo5788a((float) i3, (float) i5, (float) i4, (float) i6));
                        ObjectAnimator a2 = C1125f.m6217a(kVar, f5030O, mo5845v().mo5788a((float) i7, (float) i9, (float) i8, (float) i10));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(a, a2);
                        animatorSet.addListener(new C1108h(kVar));
                        animator = animatorSet;
                    }
                } else if (i3 == i4 && i5 == i6) {
                    path = mo5845v().mo5788a((float) i7, (float) i9, (float) i8, (float) i10);
                    property = f5031P;
                } else {
                    path = mo5845v().mo5788a((float) i3, (float) i5, (float) i4, (float) i6);
                    property = f5032Q;
                }
                animator = C1125f.m6217a(view, property, path);
            } else {
                view = view2;
                C1112c0.m6172f(view, i3, i5, Math.max(i11, i13) + i3, Math.max(i12, i14) + i5);
                ObjectAnimator a3 = (i3 == i4 && i5 == i6) ? null : C1125f.m6217a(view, f5033R, mo5845v().mo5788a((float) i3, (float) i5, (float) i4, (float) i6));
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
                    C1138k kVar2 = f5034S;
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
        int intValue = ((Integer) sVar.f5185a.get("android:changeBounds:windowX")).intValue();
        int intValue2 = ((Integer) sVar.f5185a.get("android:changeBounds:windowY")).intValue();
        int intValue3 = ((Integer) sVar2.f5185a.get("android:changeBounds:windowX")).intValue();
        int intValue4 = ((Integer) sVar2.f5185a.get("android:changeBounds:windowY")).intValue();
        if (intValue == intValue3 && intValue2 == intValue4) {
            return null;
        }
        viewGroup.getLocationInWindow(this.f5035T);
        Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
        view2.draw(new Canvas(createBitmap));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
        float c = C1112c0.m6169c(view2);
        C1112c0.m6173g(view2, 0.0f);
        C1112c0.m6168b(viewGroup).mo5729b(bitmapDrawable);
        AbstractC1127g v = mo5845v();
        int[] iArr = this.f5035T;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, C1131i.m6229a(f5028M, v.mo5788a((float) (intValue - iArr[0]), (float) (intValue2 - iArr[1]), (float) (intValue3 - iArr[0]), (float) (intValue4 - iArr[1]))));
        ofPropertyValuesHolder.addListener(new C1101a(viewGroup, bitmapDrawable, view2, c));
        return ofPropertyValuesHolder;
    }
}
