package p069c.p073b.p074a.p090b.p094n;

import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import p006b.p007a.p008k.p009a.C0764a;
import p006b.p019c.p020a.C0812a;
import p069c.p073b.p074a.p090b.C1391b;
import p069c.p073b.p074a.p090b.C1399j;
import p069c.p073b.p074a.p090b.p107z.AbstractC1477n;
import p069c.p073b.p074a.p090b.p107z.C1462k;

/* renamed from: c.b.a.b.n.a */
public class C1413a extends C0812a implements Checkable, AbstractC1477n {

    /* renamed from: j */
    private static final int[] f6037j = {16842911};

    /* renamed from: k */
    private static final int[] f6038k = {16842912};

    /* renamed from: l */
    private static final int[] f6039l = {C1391b.state_dragged};

    /* renamed from: m */
    private static final int f6040m = C1399j.Widget_MaterialComponents_CardView;

    /* renamed from: n */
    private final C1415b f6041n;

    /* renamed from: o */
    private boolean f6042o;

    /* renamed from: p */
    private boolean f6043p;

    /* renamed from: q */
    private boolean f6044q;

    /* renamed from: r */
    private AbstractC1414a f6045r;

    /* renamed from: c.b.a.b.n.a$a */
    public interface AbstractC1414a {
        /* renamed from: a */
        void mo6519a(C1413a aVar, boolean z);
    }

    /* renamed from: d */
    private void m7032d() {
        if (Build.VERSION.SDK_INT > 26) {
            throw null;
        }
    }

    private RectF getBoundsAsRectF() {
        new RectF();
        throw null;
    }

    /* renamed from: e */
    public boolean mo6482e() {
        if (this.f6041n == null) {
            return false;
        }
        throw null;
    }

    /* renamed from: f */
    public boolean mo6483f() {
        return this.f6044q;
    }

    @Override // p006b.p019c.p020a.C0812a
    public ColorStateList getCardBackgroundColor() {
        throw null;
    }

    public ColorStateList getCardForegroundColor() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        throw null;
    }

    public ColorStateList getCheckedIconTint() {
        throw null;
    }

    @Override // p006b.p019c.p020a.C0812a
    public int getContentPaddingBottom() {
        throw null;
    }

    @Override // p006b.p019c.p020a.C0812a
    public int getContentPaddingLeft() {
        throw null;
    }

    @Override // p006b.p019c.p020a.C0812a
    public int getContentPaddingRight() {
        throw null;
    }

    @Override // p006b.p019c.p020a.C0812a
    public int getContentPaddingTop() {
        throw null;
    }

    public float getProgress() {
        throw null;
    }

    @Override // p006b.p019c.p020a.C0812a
    public float getRadius() {
        throw null;
    }

    public ColorStateList getRippleColor() {
        throw null;
    }

    public C1462k getShapeAppearanceModel() {
        throw null;
    }

    @Deprecated
    public int getStrokeColor() {
        throw null;
    }

    public ColorStateList getStrokeColorStateList() {
        throw null;
    }

    public int getStrokeWidth() {
        throw null;
    }

    public boolean isChecked() {
        return this.f6043p;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        throw null;
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (mo6482e()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f6037j);
        }
        if (isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f6038k);
        }
        if (mo6483f()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f6039l);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(mo6482e());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    /* access modifiers changed from: protected */
    @Override // p006b.p019c.p020a.C0812a
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        getMeasuredWidth();
        getMeasuredHeight();
        throw null;
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f6042o) {
            throw null;
        }
    }

    /* access modifiers changed from: package-private */
    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // p006b.p019c.p020a.C0812a
    public void setCardBackgroundColor(int i) {
        ColorStateList.valueOf(i);
        throw null;
    }

    @Override // p006b.p019c.p020a.C0812a
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        throw null;
    }

    @Override // p006b.p019c.p020a.C0812a
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        throw null;
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setCheckable(boolean z) {
        throw null;
    }

    public void setChecked(boolean z) {
        if (this.f6043p != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        throw null;
    }

    public void setCheckedIconResource(int i) {
        C0764a.m4517d(getContext(), i);
        throw null;
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        throw null;
    }

    public void setClickable(boolean z) {
        super.setClickable(z);
        if (this.f6041n != null) {
            throw null;
        }
    }

    public void setDragged(boolean z) {
        if (this.f6044q != z) {
            this.f6044q = z;
            refreshDrawableState();
            m7032d();
            invalidate();
        }
    }

    @Override // p006b.p019c.p020a.C0812a
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        throw null;
    }

    public void setOnCheckedChangeListener(AbstractC1414a aVar) {
        this.f6045r = aVar;
    }

    @Override // p006b.p019c.p020a.C0812a
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        throw null;
    }

    public void setProgress(float f) {
        throw null;
    }

    @Override // p006b.p019c.p020a.C0812a
    public void setRadius(float f) {
        super.setRadius(f);
        throw null;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setRippleColorResource(int i) {
        C0764a.m4516c(getContext(), i);
        throw null;
    }

    @Override // p069c.p073b.p074a.p090b.p107z.AbstractC1477n
    public void setShapeAppearanceModel(C1462k kVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(kVar.mo6658u(getBoundsAsRectF()));
        }
        throw null;
    }

    public void setStrokeColor(int i) {
        ColorStateList.valueOf(i);
        throw null;
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setStrokeWidth(int i) {
        throw null;
    }

    @Override // p006b.p019c.p020a.C0812a
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        throw null;
    }

    public void toggle() {
        if (mo6482e() && isEnabled()) {
            this.f6043p = !this.f6043p;
            refreshDrawableState();
            m7032d();
            AbstractC1414a aVar = this.f6045r;
            if (aVar != null) {
                aVar.mo6519a(this, this.f6043p);
            }
        }
    }
}
