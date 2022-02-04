package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.C0222f;
import androidx.core.graphics.drawable.C0398a;
import androidx.core.widget.C0418i;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p006b.p007a.p008k.p009a.C0764a;
import p006b.p030g.p039k.C1013s;
import p006b.p043i.p044a.AbstractC1041a;
import p069c.p073b.p074a.p090b.C1391b;
import p069c.p073b.p074a.p090b.C1399j;
import p069c.p073b.p074a.p090b.p107z.AbstractC1477n;
import p069c.p073b.p074a.p090b.p107z.C1459h;
import p069c.p073b.p074a.p090b.p107z.C1462k;

public class MaterialButton extends C0222f implements Checkable, AbstractC1477n {

    /* renamed from: d */
    private static final int[] f10237d = {16842911};

    /* renamed from: e */
    private static final int[] f10238e = {16842912};

    /* renamed from: f */
    private static final int f10239f = C1399j.Widget_MaterialComponents_Button;

    /* renamed from: g */
    private final C3091a f10240g;

    /* renamed from: h */
    private final LinkedHashSet<AbstractC3087a> f10241h;

    /* renamed from: i */
    private AbstractC3088b f10242i;

    /* renamed from: j */
    private PorterDuff.Mode f10243j;

    /* renamed from: k */
    private ColorStateList f10244k;

    /* renamed from: l */
    private Drawable f10245l;

    /* renamed from: m */
    private int f10246m;

    /* renamed from: n */
    private int f10247n;

    /* renamed from: o */
    private int f10248o;

    /* renamed from: p */
    private boolean f10249p;

    /* renamed from: q */
    private boolean f10250q;

    /* renamed from: r */
    private int f10251r;

    /* renamed from: com.google.android.material.button.MaterialButton$a */
    public interface AbstractC3087a {
        /* renamed from: a */
        void mo10055a(MaterialButton materialButton, boolean z);
    }

    /* renamed from: com.google.android.material.button.MaterialButton$b */
    interface AbstractC3088b {
        /* renamed from: a */
        void mo10056a(MaterialButton materialButton, boolean z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.button.MaterialButton$c */
    public static class C3089c extends AbstractC1041a {
        public static final Parcelable.Creator<C3089c> CREATOR = new C3090a();

        /* renamed from: d */
        boolean f10252d;

        /* renamed from: com.google.android.material.button.MaterialButton$c$a */
        static class C3090a implements Parcelable.ClassLoaderCreator<C3089c> {
            C3090a() {
            }

            /* renamed from: a */
            public C3089c createFromParcel(Parcel parcel) {
                return new C3089c(parcel, null);
            }

            /* renamed from: b */
            public C3089c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C3089c(parcel, classLoader);
            }

            /* renamed from: c */
            public C3089c[] newArray(int i) {
                return new C3089c[i];
            }
        }

        public C3089c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                C3089c.class.getClassLoader();
            }
            m12749g(parcel);
        }

        public C3089c(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: g */
        private void m12749g(Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f10252d = z;
        }

        @Override // p006b.p043i.p044a.AbstractC1041a
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f10252d ? 1 : 0);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1391b.materialButtonStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialButton(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
        // Method dump skipped, instructions count: 136
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* renamed from: b */
    private boolean m12741b() {
        return C1013s.m5797y(this) == 1;
    }

    /* renamed from: c */
    private boolean m12742c() {
        C3091a aVar = this.f10240g;
        return aVar != null && !aVar.mo10073m();
    }

    /* renamed from: d */
    private void m12743d(boolean z) {
        if (z) {
            C0418i.m2101i(this, this.f10245l, null, null, null);
        } else {
            C0418i.m2101i(this, null, null, this.f10245l, null);
        }
    }

    /* renamed from: e */
    private void m12744e(boolean z) {
        Drawable drawable = this.f10245l;
        boolean z2 = false;
        if (drawable != null) {
            Drawable mutate = C0398a.m1981r(drawable).mutate();
            this.f10245l = mutate;
            C0398a.m1978o(mutate, this.f10244k);
            PorterDuff.Mode mode = this.f10243j;
            if (mode != null) {
                C0398a.m1979p(this.f10245l, mode);
            }
            int i = this.f10246m;
            if (i == 0) {
                i = this.f10245l.getIntrinsicWidth();
            }
            int i2 = this.f10246m;
            if (i2 == 0) {
                i2 = this.f10245l.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f10245l;
            int i3 = this.f10247n;
            drawable2.setBounds(i3, 0, i + i3, i2);
        }
        int i4 = this.f10251r;
        boolean z3 = i4 == 1 || i4 == 2;
        if (z) {
            m12743d(z3);
            return;
        }
        Drawable[] a = C0418i.m2093a(this);
        Drawable drawable3 = a[0];
        Drawable drawable4 = a[2];
        if ((z3 && drawable3 != this.f10245l) || (!z3 && drawable4 != this.f10245l)) {
            z2 = true;
        }
        if (z2) {
            m12743d(z3);
        }
    }

    /* renamed from: f */
    private void m12745f() {
        if (this.f10245l != null && getLayout() != null) {
            int i = this.f10251r;
            boolean z = true;
            if (i == 1 || i == 3) {
                this.f10247n = 0;
                m12744e(false);
                return;
            }
            TextPaint paint = getPaint();
            String charSequence = getText().toString();
            if (getTransformationMethod() != null) {
                charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
            }
            int min = Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
            int i2 = this.f10246m;
            if (i2 == 0) {
                i2 = this.f10245l.getIntrinsicWidth();
            }
            int measuredWidth = (((((getMeasuredWidth() - min) - C1013s.m5725C(this)) - i2) - this.f10248o) - C1013s.m5726D(this)) / 2;
            boolean b = m12741b();
            if (this.f10251r != 4) {
                z = false;
            }
            if (b != z) {
                measuredWidth = -measuredWidth;
            }
            if (this.f10247n != measuredWidth) {
                this.f10247n = measuredWidth;
                m12744e(false);
            }
        }
    }

    private String getA11yClassName() {
        return (mo10006a() ? CompoundButton.class : Button.class).getName();
    }

    /* renamed from: a */
    public boolean mo10006a() {
        C3091a aVar = this.f10240g;
        return aVar != null && aVar.mo10074n();
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (m12742c()) {
            return this.f10240g.mo10064b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f10245l;
    }

    public int getIconGravity() {
        return this.f10251r;
    }

    public int getIconPadding() {
        return this.f10248o;
    }

    public int getIconSize() {
        return this.f10246m;
    }

    public ColorStateList getIconTint() {
        return this.f10244k;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f10243j;
    }

    public ColorStateList getRippleColor() {
        if (m12742c()) {
            return this.f10240g.mo10067f();
        }
        return null;
    }

    public C1462k getShapeAppearanceModel() {
        if (m12742c()) {
            return this.f10240g.mo10068g();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m12742c()) {
            return this.f10240g.mo10069h();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m12742c()) {
            return this.f10240g.mo10070i();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.C0222f, p006b.p030g.p039k.AbstractC1012r
    public ColorStateList getSupportBackgroundTintList() {
        return m12742c() ? this.f10240g.mo10071j() : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.C0222f, p006b.p030g.p039k.AbstractC1012r
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return m12742c() ? this.f10240g.mo10072k() : super.getSupportBackgroundTintMode();
    }

    public boolean isChecked() {
        return this.f10249p;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m12742c()) {
            C1459h.m7186f(this, this.f10240g.mo10066d());
        }
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (mo10006a()) {
            Button.mergeDrawableStates(onCreateDrawableState, f10237d);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(onCreateDrawableState, f10238e);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.C0222f
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.C0222f
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(mo10006a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C0222f
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C3091a aVar;
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT == 21 && (aVar = this.f10240g) != null) {
            aVar.mo10063B(i4 - i2, i3 - i);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m12745f();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C3089c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C3089c cVar = (C3089c) parcelable;
        super.onRestoreInstanceState(cVar.mo5608b());
        setChecked(cVar.f10252d);
    }

    public Parcelable onSaveInstanceState() {
        C3089c cVar = new C3089c(super.onSaveInstanceState());
        cVar.f10252d = this.f10249p;
        return cVar;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C0222f
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        m12745f();
    }

    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i) {
        if (m12742c()) {
            this.f10240g.mo10076p(i);
        } else {
            super.setBackgroundColor(i);
        }
    }

    @Override // androidx.appcompat.widget.C0222f
    public void setBackgroundDrawable(Drawable drawable) {
        if (m12742c()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "Do not set the background; MaterialButton manages its own background drawable.");
                this.f10240g.mo10077q();
            } else {
                getBackground().setState(drawable.getState());
                return;
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.C0222f
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? C0764a.m4517d(getContext(), i) : null);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (m12742c()) {
            this.f10240g.mo10078r(z);
        }
    }

    public void setChecked(boolean z) {
        if (mo10006a() && isEnabled() && this.f10249p != z) {
            this.f10249p = z;
            refreshDrawableState();
            if (!this.f10250q) {
                this.f10250q = true;
                Iterator<AbstractC3087a> it = this.f10241h.iterator();
                while (it.hasNext()) {
                    it.next().mo10055a(this, this.f10249p);
                }
                this.f10250q = false;
            }
        }
    }

    public void setCornerRadius(int i) {
        if (m12742c()) {
            this.f10240g.mo10079s(i);
        }
    }

    public void setCornerRadiusResource(int i) {
        if (m12742c()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        if (m12742c()) {
            this.f10240g.mo10066d().mo6607U(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f10245l != drawable) {
            this.f10245l = drawable;
            m12744e(true);
        }
    }

    public void setIconGravity(int i) {
        if (this.f10251r != i) {
            this.f10251r = i;
            m12745f();
        }
    }

    public void setIconPadding(int i) {
        if (this.f10248o != i) {
            this.f10248o = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? C0764a.m4517d(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.f10246m != i) {
            this.f10246m = i;
            m12744e(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f10244k != colorStateList) {
            this.f10244k = colorStateList;
            m12744e(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f10243j != mode) {
            this.f10243j = mode;
            m12744e(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(C0764a.m4516c(getContext(), i));
    }

    /* access modifiers changed from: package-private */
    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    /* access modifiers changed from: package-private */
    public void setOnPressedChangeListenerInternal(AbstractC3088b bVar) {
        this.f10242i = bVar;
    }

    public void setPressed(boolean z) {
        AbstractC3088b bVar = this.f10242i;
        if (bVar != null) {
            bVar.mo10056a(this, z);
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m12742c()) {
            this.f10240g.mo10080t(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        if (m12742c()) {
            setRippleColor(C0764a.m4516c(getContext(), i));
        }
    }

    @Override // p069c.p073b.p074a.p090b.p107z.AbstractC1477n
    public void setShapeAppearanceModel(C1462k kVar) {
        if (m12742c()) {
            this.f10240g.mo10081u(kVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    /* access modifiers changed from: package-private */
    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (m12742c()) {
            this.f10240g.mo10082v(z);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m12742c()) {
            this.f10240g.mo10083w(colorStateList);
        }
    }

    public void setStrokeColorResource(int i) {
        if (m12742c()) {
            setStrokeColor(C0764a.m4516c(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (m12742c()) {
            this.f10240g.mo10084x(i);
        }
    }

    public void setStrokeWidthResource(int i) {
        if (m12742c()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // androidx.appcompat.widget.C0222f, p006b.p030g.p039k.AbstractC1012r
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (m12742c()) {
            this.f10240g.mo10085y(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.C0222f, p006b.p030g.p039k.AbstractC1012r
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (m12742c()) {
            this.f10240g.mo10086z(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    public void toggle() {
        setChecked(!this.f10249p);
    }
}
