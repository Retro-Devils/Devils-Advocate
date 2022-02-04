package com.google.android.material.chip;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.C0225g;
import com.google.android.material.chip.C3100a;
import com.google.android.material.internal.C3202o;
import com.google.android.material.internal.C3203p;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import p006b.p030g.p039k.C1013s;
import p006b.p030g.p039k.p040b0.C0979c;
import p006b.p043i.p045b.AbstractC1044a;
import p069c.p073b.p074a.p090b.C1391b;
import p069c.p073b.p074a.p090b.C1398i;
import p069c.p073b.p074a.p090b.C1399j;
import p069c.p073b.p074a.p090b.C1400k;
import p069c.p073b.p074a.p090b.p092l.C1408h;
import p069c.p073b.p074a.p090b.p104w.AbstractC1442f;
import p069c.p073b.p074a.p090b.p104w.C1438d;
import p069c.p073b.p074a.p090b.p105x.C1446b;
import p069c.p073b.p074a.p090b.p107z.AbstractC1477n;
import p069c.p073b.p074a.p090b.p107z.C1459h;
import p069c.p073b.p074a.p090b.p107z.C1462k;

public class Chip extends C0225g implements C3100a.AbstractC3101a, AbstractC1477n {

    /* renamed from: e */
    private static final int f10280e = C1399j.Widget_MaterialComponents_Chip_Action;

    /* renamed from: f */
    private static final Rect f10281f = new Rect();

    /* renamed from: g */
    private static final int[] f10282g = {16842913};

    /* renamed from: h */
    private static final int[] f10283h = {16842911};

    /* renamed from: i */
    private C3100a f10284i;

    /* renamed from: j */
    private InsetDrawable f10285j;

    /* renamed from: k */
    private RippleDrawable f10286k;

    /* renamed from: l */
    private View.OnClickListener f10287l;

    /* renamed from: m */
    private CompoundButton.OnCheckedChangeListener f10288m;

    /* renamed from: n */
    private boolean f10289n;

    /* renamed from: o */
    private boolean f10290o;

    /* renamed from: p */
    private boolean f10291p;

    /* renamed from: q */
    private boolean f10292q;

    /* renamed from: r */
    private boolean f10293r;

    /* renamed from: s */
    private int f10294s;

    /* renamed from: t */
    private int f10295t;

    /* renamed from: u */
    private final C3094c f10296u;

    /* renamed from: v */
    private final Rect f10297v;

    /* renamed from: w */
    private final RectF f10298w;

    /* renamed from: x */
    private final AbstractC1442f f10299x;

    /* renamed from: com.google.android.material.chip.Chip$a */
    class C3092a extends AbstractC1442f {
        C3092a() {
        }

        @Override // p069c.p073b.p074a.p090b.p104w.AbstractC1442f
        /* renamed from: a */
        public void mo6555a(int i) {
        }

        @Override // p069c.p073b.p074a.p090b.p104w.AbstractC1442f
        /* renamed from: b */
        public void mo6556b(Typeface typeface, boolean z) {
            Chip chip = Chip.this;
            chip.setText(chip.f10284i.mo10284G2() ? Chip.this.f10284i.mo10327c1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.chip.Chip$b */
    public class C3093b extends ViewOutlineProvider {
        C3093b() {
        }

        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            if (Chip.this.f10284i != null) {
                Chip.this.f10284i.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.material.chip.Chip$c */
    public class C3094c extends AbstractC1044a {
        C3094c(Chip chip) {
            super(chip);
        }

        /* access modifiers changed from: protected */
        @Override // p006b.p043i.p045b.AbstractC1044a
        /* renamed from: B */
        public int mo5617B(float f, float f2) {
            return (!Chip.this.m12797n() || !Chip.this.getCloseIconTouchBounds().contains(f, f2)) ? 0 : 1;
        }

        /* access modifiers changed from: protected */
        @Override // p006b.p043i.p045b.AbstractC1044a
        /* renamed from: C */
        public void mo5618C(List<Integer> list) {
            list.add(0);
            if (Chip.this.m12797n() && Chip.this.mo10131s() && Chip.this.f10287l != null) {
                list.add(1);
            }
        }

        /* access modifiers changed from: protected */
        @Override // p006b.p043i.p045b.AbstractC1044a
        /* renamed from: J */
        public boolean mo5621J(int i, int i2, Bundle bundle) {
            if (i2 != 16) {
                return false;
            }
            if (i == 0) {
                return Chip.this.performClick();
            }
            if (i == 1) {
                return Chip.this.mo10226t();
            }
            return false;
        }

        /* access modifiers changed from: protected */
        @Override // p006b.p043i.p045b.AbstractC1044a
        /* renamed from: M */
        public void mo5624M(C0979c cVar) {
            cVar.mo5467Y(Chip.this.mo10130r());
            cVar.mo5472b0(Chip.this.isClickable());
            cVar.mo5470a0((Chip.this.mo10130r() || Chip.this.isClickable()) ? Chip.this.mo10130r() ? "android.widget.CompoundButton" : "android.widget.Button" : "android.view.View");
            CharSequence text = Chip.this.getText();
            if (Build.VERSION.SDK_INT >= 23) {
                cVar.mo5512y0(text);
            } else {
                cVar.mo5477e0(text);
            }
        }

        /* access modifiers changed from: protected */
        @Override // p006b.p043i.p045b.AbstractC1044a
        /* renamed from: N */
        public void mo5625N(int i, C0979c cVar) {
            CharSequence charSequence = "";
            if (i == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription == null) {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    int i2 = C1398i.mtrl_chip_close_icon_content_description;
                    Object[] objArr = new Object[1];
                    if (!TextUtils.isEmpty(text)) {
                        charSequence = text;
                    }
                    objArr[0] = charSequence;
                    closeIconContentDescription = context.getString(i2, objArr).trim();
                }
                cVar.mo5477e0(closeIconContentDescription);
                cVar.mo5465W(Chip.this.getCloseIconTouchBoundsInt());
                cVar.mo5471b(C0979c.C0980a.f4709e);
                cVar.mo5481g0(Chip.this.isEnabled());
                return;
            }
            cVar.mo5477e0(charSequence);
            cVar.mo5465W(Chip.f10281f);
        }

        /* access modifiers changed from: protected */
        @Override // p006b.p043i.p045b.AbstractC1044a
        /* renamed from: O */
        public void mo5626O(int i, boolean z) {
            if (i == 1) {
                Chip.this.f10292q = z;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1391b.chipStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Chip(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
        // Method dump skipped, instructions count: 169
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* renamed from: A */
    private void m12783A() {
        C3100a aVar;
        if (!TextUtils.isEmpty(getText()) && (aVar = this.f10284i) != null) {
            int G0 = (int) (aVar.mo10282G0() + this.f10284i.mo10331e1() + this.f10284i.mo10352n0());
            int L0 = (int) (this.f10284i.mo10293L0() + this.f10284i.mo10333f1() + this.f10284i.mo10344j0());
            if (this.f10285j != null) {
                Rect rect = new Rect();
                this.f10285j.getPadding(rect);
                L0 += rect.left;
                G0 += rect.right;
            }
            C1013s.m5792v0(this, L0, getPaddingTop(), G0, getPaddingBottom());
        }
    }

    /* renamed from: B */
    private void m12784B() {
        TextPaint paint = getPaint();
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        C1438d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.mo6563i(getContext(), paint, this.f10299x);
        }
    }

    /* renamed from: C */
    private void m12785C(AttributeSet attributeSet) {
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            } else if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private RectF getCloseIconTouchBounds() {
        this.f10298w.setEmpty();
        if (m12797n()) {
            this.f10284i.mo10313V0(this.f10298w);
        }
        return this.f10298w;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f10297v.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f10297v;
    }

    private C1438d getTextAppearance() {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            return aVar.mo10329d1();
        }
        return null;
    }

    /* renamed from: i */
    private void m12793i(C3100a aVar) {
        aVar.mo10348k2(this);
    }

    /* renamed from: j */
    private int[] m12794j() {
        int i = 0;
        int i2 = isEnabled() ? 1 : 0;
        if (this.f10292q) {
            i2++;
        }
        if (this.f10291p) {
            i2++;
        }
        if (this.f10290o) {
            i2++;
        }
        if (isChecked()) {
            i2++;
        }
        int[] iArr = new int[i2];
        if (isEnabled()) {
            iArr[0] = 16842910;
            i = 1;
        }
        if (this.f10292q) {
            iArr[i] = 16842908;
            i++;
        }
        if (this.f10291p) {
            iArr[i] = 16843623;
            i++;
        }
        if (this.f10290o) {
            iArr[i] = 16842919;
            i++;
        }
        if (isChecked()) {
            iArr[i] = 16842913;
        }
        return iArr;
    }

    /* renamed from: l */
    private void m12795l() {
        if (getBackgroundDrawable() == this.f10285j && this.f10284i.getCallback() == null) {
            this.f10284i.setCallback(this.f10285j);
        }
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: m */
    private boolean m12796m(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 10) {
            try {
                Field declaredField = AbstractC1044a.class.getDeclaredField("p");
                declaredField.setAccessible(true);
                if (((Integer) declaredField.get(this.f10296u)).intValue() != Integer.MIN_VALUE) {
                    Method declaredMethod = AbstractC1044a.class.getDeclaredMethod("V", Integer.TYPE);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this.f10296u, Integer.MIN_VALUE);
                    return true;
                }
            } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e);
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: n */
    private boolean m12797n() {
        C3100a aVar = this.f10284i;
        return (aVar == null || aVar.mo10299O0() == null) ? false : true;
    }

    /* renamed from: o */
    private void m12798o(Context context, AttributeSet attributeSet, int i) {
        TypedArray h = C3202o.m13430h(context, attributeSet, C1400k.f5756M, i, f10280e, new int[0]);
        this.f10293r = h.getBoolean(C1400k.f5967s0, false);
        this.f10295t = (int) Math.ceil((double) h.getDimension(C1400k.f5883g0, (float) Math.ceil((double) C3203p.m13433b(getContext(), 48))));
        h.recycle();
    }

    /* renamed from: p */
    private void m12799p() {
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new C3093b());
        }
    }

    /* renamed from: q */
    private void m12800q(int i, int i2, int i3, int i4) {
        this.f10285j = new InsetDrawable((Drawable) this.f10284i, i, i2, i3, i4);
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f10291p != z) {
            this.f10291p = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f10290o != z) {
            this.f10290o = z;
            refreshDrawableState();
        }
    }

    /* renamed from: u */
    private void m12801u() {
        if (this.f10285j != null) {
            this.f10285j = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            m12804y();
        }
    }

    /* renamed from: w */
    private void m12802w(C3100a aVar) {
        if (aVar != null) {
            aVar.mo10348k2(null);
        }
    }

    /* renamed from: x */
    private void m12803x() {
        C1013s.m5766i0(this, (!m12797n() || !mo10131s() || this.f10287l == null) ? null : this.f10296u);
    }

    /* renamed from: y */
    private void m12804y() {
        if (C1446b.f6096a) {
            m12805z();
            return;
        }
        this.f10284i.mo10281F2(true);
        C1013s.m5772l0(this, getBackgroundDrawable());
        m12783A();
        m12795l();
    }

    /* renamed from: z */
    private void m12805z() {
        this.f10286k = new RippleDrawable(C1446b.m7103a(this.f10284i.mo10323a1()), getBackgroundDrawable(), null);
        this.f10284i.mo10281F2(false);
        C1013s.m5772l0(this, this.f10286k);
        m12783A();
    }

    @Override // com.google.android.material.chip.C3100a.AbstractC3101a
    /* renamed from: a */
    public void mo10087a() {
        mo10121k(this.f10295t);
        requestLayout();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    /* access modifiers changed from: protected */
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return m12796m(motionEvent) || this.f10296u.mo5631v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f10296u.mo5632w(keyEvent) || this.f10296u.mo5616A() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C0225g
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C3100a aVar = this.f10284i;
        if ((aVar == null || !aVar.mo10347k1()) ? false : this.f10284i.mo10335g2(m12794j())) {
            invalidate();
        }
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f10285j;
        return insetDrawable == null ? this.f10284i : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            return aVar.mo10270C0();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            return aVar.mo10273D0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            return aVar.mo10276E0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            return Math.max(0.0f, aVar.mo10279F0());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f10284i;
    }

    public float getChipEndPadding() {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            return aVar.mo10282G0();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            return aVar.mo10285H0();
        }
        return null;
    }

    public float getChipIconSize() {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            return aVar.mo10287I0();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            return aVar.mo10289J0();
        }
        return null;
    }

    public float getChipMinHeight() {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            return aVar.mo10291K0();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            return aVar.mo10293L0();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            return aVar.mo10295M0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            return aVar.mo10297N0();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            return aVar.mo10299O0();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            return aVar.mo10301P0();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            return aVar.mo10303Q0();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            return aVar.mo10305R0();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            return aVar.mo10307S0();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            return aVar.mo10311U0();
        }
        return null;
    }

    public TextUtils.TruncateAt getEllipsize() {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            return aVar.mo10315W0();
        }
        return null;
    }

    public void getFocusedRect(Rect rect) {
        if (this.f10296u.mo5616A() == 1 || this.f10296u.mo5633x() == 1) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public C1408h getHideMotionSpec() {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            return aVar.mo10316X0();
        }
        return null;
    }

    public float getIconEndPadding() {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            return aVar.mo10318Y0();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            return aVar.mo10320Z0();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            return aVar.mo10323a1();
        }
        return null;
    }

    public C1462k getShapeAppearanceModel() {
        return this.f10284i.mo6597C();
    }

    public C1408h getShowMotionSpec() {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            return aVar.mo10325b1();
        }
        return null;
    }

    public float getTextEndPadding() {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            return aVar.mo10331e1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            return aVar.mo10333f1();
        }
        return 0.0f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007d, code lost:
        if (getMinWidth() != r6) goto L_0x0083;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo10121k(int r6) {
        /*
        // Method dump skipped, instructions count: 141
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.mo10121k(int):boolean");
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C1459h.m7186f(this, this.f10284i);
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f10282g);
        }
        if (mo10130r()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f10283h);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        this.f10296u.mo5620I(z, i, rect);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                z = false;
            }
            return super.onHoverEvent(motionEvent);
        }
        z = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        setCloseIconHovered(z);
        return super.onHoverEvent(motionEvent);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((mo10130r() || isClickable()) ? mo10130r() ? "android.widget.CompoundButton" : "android.widget.Button" : "android.view.View");
        accessibilityNodeInfo.setCheckable(mo10130r());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            C0979c.m5570B0(accessibilityNodeInfo).mo5476d0(C0979c.C0982c.m5656a(chipGroup.mo10710b(this), 1, chipGroup.mo10230c() ? chipGroup.mo10240n(this) : -1, 1, false, isChecked()));
        }
    }

    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    @TargetApi(17)
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f10294s != i) {
            this.f10294s = i;
            m12783A();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0 != 3) goto L_0x0040;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0043  */
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0039
            if (r0 == r3) goto L_0x002b
            r4 = 2
            if (r0 == r4) goto L_0x0021
            r1 = 3
            if (r0 == r1) goto L_0x0034
            goto L_0x0040
        L_0x0021:
            boolean r0 = r5.f10290o
            if (r0 == 0) goto L_0x0040
            if (r1 != 0) goto L_0x003e
            r5.setCloseIconPressed(r2)
            goto L_0x003e
        L_0x002b:
            boolean r0 = r5.f10290o
            if (r0 == 0) goto L_0x0034
            r5.mo10226t()
            r0 = 1
            goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            r5.setCloseIconPressed(r2)
            goto L_0x0041
        L_0x0039:
            if (r1 == 0) goto L_0x0040
            r5.setCloseIconPressed(r3)
        L_0x003e:
            r0 = 1
            goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            if (r0 != 0) goto L_0x0049
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L_0x004a
        L_0x0049:
            r2 = 1
        L_0x004a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: r */
    public boolean mo10130r() {
        C3100a aVar = this.f10284i;
        return aVar != null && aVar.mo10345j1();
    }

    /* renamed from: s */
    public boolean mo10131s() {
        C3100a aVar = this.f10284i;
        return aVar != null && aVar.mo10349l1();
    }

    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f10286k) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.C0225g
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f10286k) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.C0225g
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            aVar.mo10362s1(z);
        }
    }

    public void setCheckableResource(int i) {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            aVar.mo10366t1(i);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        C3100a aVar = this.f10284i;
        if (aVar == null) {
            this.f10289n = z;
        } else if (aVar.mo10345j1()) {
            boolean isChecked = isChecked();
            super.setChecked(z);
            if (isChecked != z && (onCheckedChangeListener = this.f10288m) != null) {
                onCheckedChangeListener.onCheckedChanged(this, z);
            }
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            aVar.mo10368u1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            aVar.mo10371v1(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            aVar.mo10373w1(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            aVar.mo10375x1(i);
        }
    }

    public void setCheckedIconVisible(int i) {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            aVar.mo10377y1(i);
        }
    }

    public void setCheckedIconVisible(boolean z) {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            aVar.mo10379z1(z);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            aVar.mo10266A1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i) {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            aVar.mo10268B1(i);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            aVar.mo10271C1(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            aVar.mo10274D1(i);
        }
    }

    public void setChipDrawable(C3100a aVar) {
        C3100a aVar2 = this.f10284i;
        if (aVar2 != aVar) {
            m12802w(aVar2);
            this.f10284i = aVar;
            aVar.mo10372v2(false);
            m12793i(this.f10284i);
            mo10121k(this.f10295t);
        }
    }

    public void setChipEndPadding(float f) {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            aVar.mo10277E1(f);
        }
    }

    public void setChipEndPaddingResource(int i) {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            aVar.mo10280F1(i);
        }
    }

    public void setChipIcon(Drawable drawable) {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            aVar.mo10283G1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            aVar.mo10286H1(i);
        }
    }

    public void setChipIconSize(float f) {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            aVar.mo10288I1(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            aVar.mo10290J1(i);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            aVar.mo10292K1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            aVar.mo10294L1(i);
        }
    }

    public void setChipIconVisible(int i) {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            aVar.mo10296M1(i);
        }
    }

    public void setChipIconVisible(boolean z) {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            aVar.mo10298N1(z);
        }
    }

    public void setChipMinHeight(float f) {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            aVar.mo10300O1(f);
        }
    }

    public void setChipMinHeightResource(int i) {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            aVar.mo10302P1(i);
        }
    }

    public void setChipStartPadding(float f) {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            aVar.mo10304Q1(f);
        }
    }

    public void setChipStartPaddingResource(int i) {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            aVar.mo10306R1(i);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            aVar.mo10308S1(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            aVar.mo10310T1(i);
        }
    }

    public void setChipStrokeWidth(float f) {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            aVar.mo10312U1(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            aVar.mo10314V1(i);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            aVar.mo10317X1(drawable);
        }
        m12803x();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            aVar.mo10319Y1(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            aVar.mo10321Z1(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            aVar.mo10324a2(i);
        }
    }

    public void setCloseIconResource(int i) {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            aVar.mo10326b2(i);
        }
        m12803x();
    }

    public void setCloseIconSize(float f) {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            aVar.mo10328c2(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            aVar.mo10330d2(i);
        }
    }

    public void setCloseIconStartPadding(float f) {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            aVar.mo10332e2(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            aVar.mo10334f2(i);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            aVar.mo10341h2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            aVar.mo10342i2(i);
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    public void setCloseIconVisible(boolean z) {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            aVar.mo10346j2(z);
        }
        m12803x();
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            aVar.mo6607U(f);
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f10284i != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                C3100a aVar = this.f10284i;
                if (aVar != null) {
                    aVar.mo10350l2(truncateAt);
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.f10293r = z;
        mo10121k(this.f10295t);
    }

    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(C1408h hVar) {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            aVar.mo10351m2(hVar);
        }
    }

    public void setHideMotionSpecResource(int i) {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            aVar.mo10353n2(i);
        }
    }

    public void setIconEndPadding(float f) {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            aVar.mo10354o2(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            aVar.mo10357p2(i);
        }
    }

    public void setIconStartPadding(float f) {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            aVar.mo10360q2(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            aVar.mo10361r2(i);
        }
    }

    public void setLayoutDirection(int i) {
        if (this.f10284i != null && Build.VERSION.SDK_INT >= 17) {
            super.setLayoutDirection(i);
        }
    }

    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            aVar.mo10363s2(i);
        }
    }

    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    /* access modifiers changed from: package-private */
    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f10288m = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f10287l = onClickListener;
        m12803x();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            aVar.mo10367t2(colorStateList);
        }
        if (!this.f10284i.mo10340h1()) {
            m12805z();
        }
    }

    public void setRippleColorResource(int i) {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            aVar.mo10369u2(i);
            if (!this.f10284i.mo10340h1()) {
                m12805z();
            }
        }
    }

    @Override // p069c.p073b.p074a.p090b.p107z.AbstractC1477n
    public void setShapeAppearanceModel(C1462k kVar) {
        this.f10284i.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(C1408h hVar) {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            aVar.mo10374w2(hVar);
        }
    }

    public void setShowMotionSpecResource(int i) {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            aVar.mo10376x2(i);
        }
    }

    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            super.setText(aVar.mo10284G2() ? null : charSequence, bufferType);
            C3100a aVar2 = this.f10284i;
            if (aVar2 != null) {
                aVar2.mo10378y2(charSequence);
            }
        }
    }

    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            aVar.mo10267A2(i);
        }
        m12784B();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            aVar.mo10267A2(i);
        }
        m12784B();
    }

    public void setTextAppearance(C1438d dVar) {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            aVar.mo10380z2(dVar);
        }
        m12784B();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            aVar.mo10269B2(f);
        }
    }

    public void setTextEndPaddingResource(int i) {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            aVar.mo10272C2(i);
        }
    }

    public void setTextStartPadding(float f) {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            aVar.mo10275D2(f);
        }
    }

    public void setTextStartPaddingResource(int i) {
        C3100a aVar = this.f10284i;
        if (aVar != null) {
            aVar.mo10278E2(i);
        }
    }

    /* renamed from: t */
    public boolean mo10226t() {
        boolean z = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f10287l;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z = true;
        }
        this.f10296u.mo5629U(1, 1);
        return z;
    }

    /* renamed from: v */
    public boolean mo10227v() {
        return this.f10293r;
    }
}
