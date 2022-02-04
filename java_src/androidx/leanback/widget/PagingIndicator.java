package androidx.leanback.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import p006b.p053m.C1070b;
import p006b.p053m.C1071c;
import p006b.p053m.C1072d;
import p006b.p053m.C1080l;

public class PagingIndicator extends View {

    /* renamed from: b */
    private static final TimeInterpolator f2633b = new DecelerateInterpolator();

    /* renamed from: c */
    private static final Property<C0524d, Float> f2634c = new C0521a(Float.class, "alpha");

    /* renamed from: d */
    private static final Property<C0524d, Float> f2635d = new C0522b(Float.class, "diameter");

    /* renamed from: e */
    private static final Property<C0524d, Float> f2636e = new C0523c(Float.class, "translation_x");

    /* renamed from: A */
    private final AnimatorSet f2637A;

    /* renamed from: B */
    Bitmap f2638B;

    /* renamed from: C */
    Paint f2639C;

    /* renamed from: D */
    final Rect f2640D;

    /* renamed from: E */
    final float f2641E;

    /* renamed from: f */
    boolean f2642f;

    /* renamed from: g */
    final int f2643g;

    /* renamed from: h */
    final int f2644h;

    /* renamed from: i */
    private final int f2645i;

    /* renamed from: j */
    final int f2646j;

    /* renamed from: k */
    final int f2647k;

    /* renamed from: l */
    private final int f2648l;

    /* renamed from: m */
    private final int f2649m;

    /* renamed from: n */
    private C0524d[] f2650n;

    /* renamed from: o */
    private int[] f2651o;

    /* renamed from: p */
    private int[] f2652p;

    /* renamed from: q */
    private int[] f2653q;

    /* renamed from: r */
    int f2654r;

    /* renamed from: s */
    private int f2655s;

    /* renamed from: t */
    private int f2656t;

    /* renamed from: u */
    private int f2657u;

    /* renamed from: v */
    int f2658v;

    /* renamed from: w */
    final Paint f2659w;

    /* renamed from: x */
    final Paint f2660x;

    /* renamed from: y */
    private final AnimatorSet f2661y;

    /* renamed from: z */
    private final AnimatorSet f2662z;

    /* renamed from: androidx.leanback.widget.PagingIndicator$a */
    static class C0521a extends Property<C0524d, Float> {
        C0521a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(C0524d dVar) {
            return Float.valueOf(dVar.mo3053d());
        }

        /* renamed from: b */
        public void set(C0524d dVar, Float f) {
            dVar.mo3058i(f.floatValue());
        }
    }

    /* renamed from: androidx.leanback.widget.PagingIndicator$b */
    static class C0522b extends Property<C0524d, Float> {
        C0522b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(C0524d dVar) {
            return Float.valueOf(dVar.mo3054e());
        }

        /* renamed from: b */
        public void set(C0524d dVar, Float f) {
            dVar.mo3059j(f.floatValue());
        }
    }

    /* renamed from: androidx.leanback.widget.PagingIndicator$c */
    static class C0523c extends Property<C0524d, Float> {
        C0523c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(C0524d dVar) {
            return Float.valueOf(dVar.mo3055f());
        }

        /* renamed from: b */
        public void set(C0524d dVar, Float f) {
            dVar.mo3060k(f.floatValue());
        }
    }

    /* renamed from: androidx.leanback.widget.PagingIndicator$d */
    public class C0524d {

        /* renamed from: a */
        float f2663a;

        /* renamed from: b */
        int f2664b;

        /* renamed from: c */
        float f2665c;

        /* renamed from: d */
        float f2666d;

        /* renamed from: e */
        float f2667e;

        /* renamed from: f */
        float f2668f;

        /* renamed from: g */
        float f2669g;

        /* renamed from: h */
        float f2670h = 1.0f;

        /* renamed from: i */
        float f2671i;

        public C0524d() {
            float f = 1.0f;
            this.f2671i = !PagingIndicator.this.f2642f ? -1.0f : f;
        }

        /* renamed from: a */
        public void mo3050a() {
            this.f2664b = Color.argb(Math.round(this.f2663a * 255.0f), Color.red(PagingIndicator.this.f2658v), Color.green(PagingIndicator.this.f2658v), Color.blue(PagingIndicator.this.f2658v));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo3051b() {
            this.f2665c = 0.0f;
            this.f2666d = 0.0f;
            PagingIndicator pagingIndicator = PagingIndicator.this;
            this.f2667e = (float) pagingIndicator.f2643g;
            float f = (float) pagingIndicator.f2644h;
            this.f2668f = f;
            this.f2669g = f * pagingIndicator.f2641E;
            this.f2663a = 0.0f;
            mo3050a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo3052c(Canvas canvas) {
            float f = this.f2666d + this.f2665c;
            PagingIndicator pagingIndicator = PagingIndicator.this;
            canvas.drawCircle(f, (float) pagingIndicator.f2654r, this.f2668f, pagingIndicator.f2659w);
            if (this.f2663a > 0.0f) {
                PagingIndicator.this.f2660x.setColor(this.f2664b);
                PagingIndicator pagingIndicator2 = PagingIndicator.this;
                canvas.drawCircle(f, (float) pagingIndicator2.f2654r, this.f2668f, pagingIndicator2.f2660x);
                PagingIndicator pagingIndicator3 = PagingIndicator.this;
                Bitmap bitmap = pagingIndicator3.f2638B;
                Rect rect = pagingIndicator3.f2640D;
                float f2 = this.f2669g;
                int i = PagingIndicator.this.f2654r;
                canvas.drawBitmap(bitmap, rect, new Rect((int) (f - f2), (int) (((float) i) - f2), (int) (f + f2), (int) (((float) i) + f2)), PagingIndicator.this.f2639C);
            }
        }

        /* renamed from: d */
        public float mo3053d() {
            return this.f2663a;
        }

        /* renamed from: e */
        public float mo3054e() {
            return this.f2667e;
        }

        /* renamed from: f */
        public float mo3055f() {
            return this.f2665c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo3056g() {
            this.f2671i = PagingIndicator.this.f2642f ? 1.0f : -1.0f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo3057h() {
            this.f2665c = 0.0f;
            this.f2666d = 0.0f;
            PagingIndicator pagingIndicator = PagingIndicator.this;
            this.f2667e = (float) pagingIndicator.f2646j;
            float f = (float) pagingIndicator.f2647k;
            this.f2668f = f;
            this.f2669g = f * pagingIndicator.f2641E;
            this.f2663a = 1.0f;
            mo3050a();
        }

        /* renamed from: i */
        public void mo3058i(float f) {
            this.f2663a = f;
            mo3050a();
            PagingIndicator.this.invalidate();
        }

        /* renamed from: j */
        public void mo3059j(float f) {
            this.f2667e = f;
            float f2 = f / 2.0f;
            this.f2668f = f2;
            PagingIndicator pagingIndicator = PagingIndicator.this;
            this.f2669g = f2 * pagingIndicator.f2641E;
            pagingIndicator.invalidate();
        }

        /* renamed from: k */
        public void mo3060k(float f) {
            this.f2665c = f * this.f2670h * this.f2671i;
            PagingIndicator.this.invalidate();
        }
    }

    public PagingIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PagingIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f2637A = animatorSet;
        Resources resources = getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1080l.f4967l, i, 0);
        int g = m2729g(obtainStyledAttributes, C1080l.f4974s, C1071c.lb_page_indicator_dot_radius);
        this.f2644h = g;
        this.f2643g = g * 2;
        int g2 = m2729g(obtainStyledAttributes, C1080l.f4970o, C1071c.lb_page_indicator_arrow_radius);
        this.f2647k = g2;
        int i2 = g2 * 2;
        this.f2646j = i2;
        this.f2645i = m2729g(obtainStyledAttributes, C1080l.f4973r, C1071c.lb_page_indicator_dot_gap);
        this.f2648l = m2729g(obtainStyledAttributes, C1080l.f4972q, C1071c.lb_page_indicator_arrow_gap);
        int f = m2728f(obtainStyledAttributes, C1080l.f4971p, C1070b.lb_page_indicator_dot);
        Paint paint = new Paint(1);
        this.f2659w = paint;
        paint.setColor(f);
        this.f2658v = m2728f(obtainStyledAttributes, C1080l.f4968m, C1070b.lb_page_indicator_arrow_background);
        if (this.f2639C == null) {
            int i3 = C1080l.f4969n;
            if (obtainStyledAttributes.hasValue(i3)) {
                setArrowColor(obtainStyledAttributes.getColor(i3, 0));
            }
        }
        obtainStyledAttributes.recycle();
        this.f2642f = resources.getConfiguration().getLayoutDirection() == 0;
        int color = resources.getColor(C1070b.lb_page_indicator_arrow_shadow);
        int dimensionPixelSize = resources.getDimensionPixelSize(C1071c.lb_page_indicator_arrow_shadow_radius);
        this.f2649m = dimensionPixelSize;
        Paint paint2 = new Paint(1);
        this.f2660x = paint2;
        float dimensionPixelSize2 = (float) resources.getDimensionPixelSize(C1071c.lb_page_indicator_arrow_shadow_offset);
        paint2.setShadowLayer((float) dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize2, color);
        this.f2638B = m2730h();
        this.f2640D = new Rect(0, 0, this.f2638B.getWidth(), this.f2638B.getHeight());
        this.f2641E = ((float) this.f2638B.getWidth()) / ((float) i2);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f2661y = animatorSet2;
        animatorSet2.playTogether(m2725c(0.0f, 1.0f), m2726d((float) (g * 2), (float) (g2 * 2)), m2727e());
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f2662z = animatorSet3;
        animatorSet3.playTogether(m2725c(1.0f, 0.0f), m2726d((float) (g2 * 2), (float) (g * 2)), m2727e());
        animatorSet.playTogether(animatorSet2, animatorSet3);
        setLayerType(1, null);
    }

    /* renamed from: a */
    private void m2723a() {
        int i;
        float f;
        int i2 = 0;
        while (true) {
            i = this.f2656t;
            f = -1.0f;
            if (i2 >= i) {
                break;
            }
            this.f2650n[i2].mo3051b();
            C0524d[] dVarArr = this.f2650n;
            C0524d dVar = dVarArr[i2];
            if (i2 != this.f2657u) {
                f = 1.0f;
            }
            dVar.f2670h = f;
            dVarArr[i2].f2666d = (float) this.f2652p[i2];
            i2++;
        }
        this.f2650n[i].mo3057h();
        C0524d[] dVarArr2 = this.f2650n;
        int i3 = this.f2656t;
        C0524d dVar2 = dVarArr2[i3];
        if (this.f2657u >= i3) {
            f = 1.0f;
        }
        dVar2.f2670h = f;
        C0524d dVar3 = dVarArr2[i3];
        int i4 = this.f2651o[i3];
        while (true) {
            dVar3.f2666d = (float) i4;
            i3++;
            if (i3 < this.f2655s) {
                this.f2650n[i3].mo3051b();
                C0524d[] dVarArr3 = this.f2650n;
                dVarArr3[i3].f2670h = 1.0f;
                dVar3 = dVarArr3[i3];
                i4 = this.f2653q[i3];
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    private void m2724b() {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int requiredWidth = getRequiredWidth();
        int i = (paddingLeft + width) / 2;
        int i2 = this.f2655s;
        int[] iArr = new int[i2];
        this.f2651o = iArr;
        int[] iArr2 = new int[i2];
        this.f2652p = iArr2;
        int[] iArr3 = new int[i2];
        this.f2653q = iArr3;
        int i3 = 1;
        int i4 = requiredWidth / 2;
        if (this.f2642f) {
            int i5 = i - i4;
            int i6 = this.f2644h;
            int i7 = this.f2645i;
            int i8 = this.f2648l;
            iArr[0] = ((i5 + i6) - i7) + i8;
            iArr2[0] = i5 + i6;
            iArr3[0] = ((i5 + i6) - (i7 * 2)) + (i8 * 2);
            while (i3 < this.f2655s) {
                int[] iArr4 = this.f2651o;
                int[] iArr5 = this.f2652p;
                int i9 = i3 - 1;
                int i10 = iArr5[i9];
                int i11 = this.f2648l;
                iArr4[i3] = i10 + i11;
                iArr5[i3] = iArr5[i9] + this.f2645i;
                this.f2653q[i3] = iArr4[i9] + i11;
                i3++;
            }
        } else {
            int i12 = i + i4;
            int i13 = this.f2644h;
            int i14 = this.f2645i;
            int i15 = this.f2648l;
            iArr[0] = ((i12 - i13) + i14) - i15;
            iArr2[0] = i12 - i13;
            iArr3[0] = ((i12 - i13) + (i14 * 2)) - (i15 * 2);
            while (i3 < this.f2655s) {
                int[] iArr6 = this.f2651o;
                int[] iArr7 = this.f2652p;
                int i16 = i3 - 1;
                int i17 = iArr7[i16];
                int i18 = this.f2648l;
                iArr6[i3] = i17 - i18;
                iArr7[i3] = iArr7[i16] - this.f2645i;
                this.f2653q[i3] = iArr6[i16] - i18;
                i3++;
            }
        }
        this.f2654r = paddingTop + this.f2647k;
        m2723a();
    }

    /* renamed from: c */
    private Animator m2725c(float f, float f2) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object) null, f2634c, f, f2);
        ofFloat.setDuration(167L);
        ofFloat.setInterpolator(f2633b);
        return ofFloat;
    }

    /* renamed from: d */
    private Animator m2726d(float f, float f2) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object) null, f2635d, f, f2);
        ofFloat.setDuration(417L);
        ofFloat.setInterpolator(f2633b);
        return ofFloat;
    }

    /* renamed from: e */
    private Animator m2727e() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object) null, f2636e, (float) ((-this.f2648l) + this.f2645i), 0.0f);
        ofFloat.setDuration(417L);
        ofFloat.setInterpolator(f2633b);
        return ofFloat;
    }

    /* renamed from: f */
    private int m2728f(TypedArray typedArray, int i, int i2) {
        return typedArray.getColor(i, getResources().getColor(i2));
    }

    /* renamed from: g */
    private int m2729g(TypedArray typedArray, int i, int i2) {
        return typedArray.getDimensionPixelOffset(i, getResources().getDimensionPixelOffset(i2));
    }

    private int getDesiredHeight() {
        return getPaddingTop() + this.f2646j + getPaddingBottom() + this.f2649m;
    }

    private int getDesiredWidth() {
        return getPaddingLeft() + getRequiredWidth() + getPaddingRight();
    }

    private int getRequiredWidth() {
        return (this.f2644h * 2) + (this.f2648l * 2) + ((this.f2655s - 3) * this.f2645i);
    }

    /* renamed from: h */
    private Bitmap m2730h() {
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), C1072d.lb_ic_nav_arrow);
        if (this.f2642f) {
            return decodeResource;
        }
        Matrix matrix = new Matrix();
        matrix.preScale(-1.0f, 1.0f);
        return Bitmap.createBitmap(decodeResource, 0, 0, decodeResource.getWidth(), decodeResource.getHeight(), matrix, false);
    }

    private void setSelectedPage(int i) {
        if (i != this.f2656t) {
            this.f2656t = i;
            m2723a();
        }
    }

    /* access modifiers changed from: package-private */
    public int[] getDotSelectedLeftX() {
        return this.f2652p;
    }

    /* access modifiers changed from: package-private */
    public int[] getDotSelectedRightX() {
        return this.f2653q;
    }

    /* access modifiers changed from: package-private */
    public int[] getDotSelectedX() {
        return this.f2651o;
    }

    /* access modifiers changed from: package-private */
    public int getPageCount() {
        return this.f2655s;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        for (int i = 0; i < this.f2655s; i++) {
            this.f2650n[i].mo3052c(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int desiredHeight = getDesiredHeight();
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            desiredHeight = Math.min(desiredHeight, View.MeasureSpec.getSize(i2));
        } else if (mode == 1073741824) {
            desiredHeight = View.MeasureSpec.getSize(i2);
        }
        int desiredWidth = getDesiredWidth();
        int mode2 = View.MeasureSpec.getMode(i);
        if (mode2 == Integer.MIN_VALUE) {
            desiredWidth = Math.min(desiredWidth, View.MeasureSpec.getSize(i));
        } else if (mode2 == 1073741824) {
            desiredWidth = View.MeasureSpec.getSize(i);
        }
        setMeasuredDimension(desiredWidth, desiredHeight);
    }

    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 0;
        if (this.f2642f != z) {
            this.f2642f = z;
            this.f2638B = m2730h();
            C0524d[] dVarArr = this.f2650n;
            if (dVarArr != null) {
                for (C0524d dVar : dVarArr) {
                    dVar.mo3056g();
                }
            }
            m2724b();
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        setMeasuredDimension(i, i2);
        m2724b();
    }

    public void setArrowBackgroundColor(int i) {
        this.f2658v = i;
    }

    public void setArrowColor(int i) {
        if (this.f2639C == null) {
            this.f2639C = new Paint();
        }
        this.f2639C.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
    }

    public void setDotBackgroundColor(int i) {
        this.f2659w.setColor(i);
    }

    public void setPageCount(int i) {
        if (i > 0) {
            this.f2655s = i;
            this.f2650n = new C0524d[i];
            for (int i2 = 0; i2 < this.f2655s; i2++) {
                this.f2650n[i2] = new C0524d();
            }
            m2724b();
            setSelectedPage(0);
            return;
        }
        throw new IllegalArgumentException("The page count should be a positive integer");
    }
}
