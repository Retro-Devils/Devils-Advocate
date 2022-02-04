package androidx.leanback.widget;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import p006b.p030g.p039k.C1013s;
import p006b.p053m.C1069a;
import p006b.p053m.C1070b;
import p006b.p053m.C1071c;
import p006b.p053m.C1072d;
import p006b.p053m.C1073e;
import p006b.p053m.C1074f;
import p006b.p053m.C1075g;
import p006b.p053m.C1076h;
import p006b.p053m.C1080l;

public class SearchOrbView extends FrameLayout implements View.OnClickListener {

    /* renamed from: b */
    private View.OnClickListener f2735b;

    /* renamed from: c */
    private View f2736c;

    /* renamed from: d */
    private View f2737d;

    /* renamed from: e */
    private ImageView f2738e;

    /* renamed from: f */
    private Drawable f2739f;

    /* renamed from: g */
    private C0545c f2740g;

    /* renamed from: h */
    private final float f2741h;

    /* renamed from: i */
    private final int f2742i;

    /* renamed from: j */
    private final int f2743j;

    /* renamed from: k */
    private final float f2744k;

    /* renamed from: l */
    private final float f2745l;

    /* renamed from: m */
    private ValueAnimator f2746m;

    /* renamed from: n */
    private boolean f2747n;

    /* renamed from: o */
    private boolean f2748o;

    /* renamed from: p */
    private final ArgbEvaluator f2749p;

    /* renamed from: q */
    private final ValueAnimator.AnimatorUpdateListener f2750q;

    /* renamed from: r */
    private ValueAnimator f2751r;

    /* renamed from: s */
    private final ValueAnimator.AnimatorUpdateListener f2752s;

    /* renamed from: androidx.leanback.widget.SearchOrbView$a */
    class C0543a implements ValueAnimator.AnimatorUpdateListener {
        C0543a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SearchOrbView.this.setOrbViewColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* renamed from: androidx.leanback.widget.SearchOrbView$b */
    class C0544b implements ValueAnimator.AnimatorUpdateListener {
        C0544b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            SearchOrbView.this.setSearchOrbZ(valueAnimator.getAnimatedFraction());
        }
    }

    /* renamed from: androidx.leanback.widget.SearchOrbView$c */
    public static class C0545c {

        /* renamed from: a */
        public int f2755a;

        /* renamed from: b */
        public int f2756b;

        /* renamed from: c */
        public int f2757c;

        public C0545c(int i, int i2, int i3) {
            this.f2755a = i;
            this.f2756b = i2 == i ? m2779a(i) : i2;
            this.f2757c = i3;
        }

        /* renamed from: a */
        public static int m2779a(int i) {
            return Color.argb((int) ((((float) Color.alpha(i)) * 0.85f) + 38.25f), (int) ((((float) Color.red(i)) * 0.85f) + 38.25f), (int) ((((float) Color.green(i)) * 0.85f) + 38.25f), (int) ((((float) Color.blue(i)) * 0.85f) + 38.25f));
        }
    }

    public SearchOrbView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1069a.searchOrbViewStyle);
    }

    public SearchOrbView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2749p = new ArgbEvaluator();
        this.f2750q = new C0543a();
        this.f2752s = new C0544b();
        Resources resources = context.getResources();
        View inflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(getLayoutResourceId(), (ViewGroup) this, true);
        this.f2736c = inflate;
        this.f2737d = inflate.findViewById(C1074f.search_orb);
        this.f2738e = (ImageView) this.f2736c.findViewById(C1074f.icon);
        this.f2741h = context.getResources().getFraction(C1073e.lb_search_orb_focused_zoom, 1, 1);
        this.f2742i = context.getResources().getInteger(C1075g.lb_search_orb_pulse_duration_ms);
        this.f2743j = context.getResources().getInteger(C1075g.lb_search_orb_scale_duration_ms);
        float dimensionPixelSize = (float) context.getResources().getDimensionPixelSize(C1071c.lb_search_orb_focused_z);
        this.f2745l = dimensionPixelSize;
        this.f2744k = (float) context.getResources().getDimensionPixelSize(C1071c.lb_search_orb_unfocused_z);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1080l.f4949V, i, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(C1080l.f4952Y);
        setOrbIcon(drawable == null ? resources.getDrawable(C1072d.f4925a) : drawable);
        int color = obtainStyledAttributes.getColor(C1080l.f4951X, resources.getColor(C1070b.lb_default_search_color));
        setOrbColors(new C0545c(color, obtainStyledAttributes.getColor(C1080l.f4950W, color), obtainStyledAttributes.getColor(C1080l.f4953Z, 0)));
        obtainStyledAttributes.recycle();
        setFocusable(true);
        setClipChildren(false);
        setOnClickListener(this);
        setSoundEffectsEnabled(false);
        setSearchOrbZ(0.0f);
        C1013s.m5798y0(this.f2738e, dimensionPixelSize);
    }

    /* renamed from: d */
    private void m2774d(boolean z, int i) {
        if (this.f2751r == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f2751r = ofFloat;
            ofFloat.addUpdateListener(this.f2752s);
        }
        if (z) {
            this.f2751r.start();
        } else {
            this.f2751r.reverse();
        }
        this.f2751r.setDuration((long) i);
    }

    /* renamed from: e */
    private void m2775e() {
        ValueAnimator valueAnimator = this.f2746m;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f2746m = null;
        }
        if (this.f2747n && this.f2748o) {
            ValueAnimator ofObject = ValueAnimator.ofObject(this.f2749p, Integer.valueOf(this.f2740g.f2755a), Integer.valueOf(this.f2740g.f2756b), Integer.valueOf(this.f2740g.f2755a));
            this.f2746m = ofObject;
            ofObject.setRepeatCount(-1);
            this.f2746m.setDuration((long) (this.f2742i * 2));
            this.f2746m.addUpdateListener(this.f2750q);
            this.f2746m.start();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3144a(boolean z) {
        float f = z ? this.f2741h : 1.0f;
        this.f2736c.animate().scaleX(f).scaleY(f).setDuration((long) this.f2743j).start();
        m2774d(z, this.f2743j);
        mo3145b(z);
    }

    /* renamed from: b */
    public void mo3145b(boolean z) {
        this.f2747n = z;
        m2775e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo3146c(float f) {
        this.f2737d.setScaleX(f);
        this.f2737d.setScaleY(f);
    }

    /* access modifiers changed from: package-private */
    public float getFocusedZoom() {
        return this.f2741h;
    }

    /* access modifiers changed from: package-private */
    public int getLayoutResourceId() {
        return C1076h.lb_search_orb;
    }

    public int getOrbColor() {
        return this.f2740g.f2755a;
    }

    public C0545c getOrbColors() {
        return this.f2740g;
    }

    public Drawable getOrbIcon() {
        return this.f2739f;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2748o = true;
        m2775e();
    }

    public void onClick(View view) {
        View.OnClickListener onClickListener = this.f2735b;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f2748o = false;
        m2775e();
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        mo3144a(z);
    }

    public void setOnOrbClickedListener(View.OnClickListener onClickListener) {
        this.f2735b = onClickListener;
    }

    public void setOrbColor(int i) {
        setOrbColors(new C0545c(i, i, 0));
    }

    public void setOrbColors(C0545c cVar) {
        this.f2740g = cVar;
        this.f2738e.setColorFilter(cVar.f2757c);
        if (this.f2746m == null) {
            setOrbViewColor(this.f2740g.f2755a);
        } else {
            mo3145b(true);
        }
    }

    public void setOrbIcon(Drawable drawable) {
        this.f2739f = drawable;
        this.f2738e.setImageDrawable(drawable);
    }

    /* access modifiers changed from: package-private */
    public void setOrbViewColor(int i) {
        if (this.f2737d.getBackground() instanceof GradientDrawable) {
            ((GradientDrawable) this.f2737d.getBackground()).setColor(i);
        }
    }

    /* access modifiers changed from: package-private */
    public void setSearchOrbZ(float f) {
        View view = this.f2737d;
        float f2 = this.f2744k;
        C1013s.m5798y0(view, f2 + (f * (this.f2745l - f2)));
    }
}
