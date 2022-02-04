package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.core.widget.AbstractC0411b;
import androidx.core.widget.AbstractC0421k;
import androidx.core.widget.C0418i;
import p006b.p007a.C0754a;
import p006b.p030g.p039k.AbstractC1012r;

/* renamed from: androidx.appcompat.widget.f */
public class C0222f extends Button implements AbstractC1012r, AbstractC0411b, AbstractC0421k {

    /* renamed from: b */
    private final C0218e f997b;

    /* renamed from: c */
    private final C0297x f998c;

    public C0222f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0754a.buttonStyle);
    }

    public C0222f(Context context, AttributeSet attributeSet, int i) {
        super(C0279t0.m1381b(context), attributeSet, i);
        C0275r0.m1374a(this, getContext());
        C0218e eVar = new C0218e(this);
        this.f997b = eVar;
        eVar.mo1386e(attributeSet, i);
        C0297x xVar = new C0297x(this);
        this.f998c = xVar;
        xVar.mo1834m(attributeSet, i);
        xVar.mo1824b();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0218e eVar = this.f997b;
        if (eVar != null) {
            eVar.mo1383b();
        }
        C0297x xVar = this.f998c;
        if (xVar != null) {
            xVar.mo1824b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (AbstractC0411b.f2170a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0297x xVar = this.f998c;
        if (xVar != null) {
            return xVar.mo1826e();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (AbstractC0411b.f2170a) {
            return super.getAutoSizeMinTextSize();
        }
        C0297x xVar = this.f998c;
        if (xVar != null) {
            return xVar.mo1827f();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (AbstractC0411b.f2170a) {
            return super.getAutoSizeStepGranularity();
        }
        C0297x xVar = this.f998c;
        if (xVar != null) {
            return xVar.mo1828g();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (AbstractC0411b.f2170a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0297x xVar = this.f998c;
        return xVar != null ? xVar.mo1829h() : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (AbstractC0411b.f2170a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0297x xVar = this.f998c;
        if (xVar != null) {
            return xVar.mo1830i();
        }
        return 0;
    }

    @Override // p006b.p030g.p039k.AbstractC1012r
    public ColorStateList getSupportBackgroundTintList() {
        C0218e eVar = this.f997b;
        if (eVar != null) {
            return eVar.mo1384c();
        }
        return null;
    }

    @Override // p006b.p030g.p039k.AbstractC1012r
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0218e eVar = this.f997b;
        if (eVar != null) {
            return eVar.mo1385d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f998c.mo1831j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f998c.mo1832k();
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0297x xVar = this.f998c;
        if (xVar != null) {
            xVar.mo1836o(z, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0297x xVar = this.f998c;
        if (xVar != null && !AbstractC0411b.f2170a && xVar.mo1833l()) {
            this.f998c.mo1825c();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (AbstractC0411b.f2170a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0297x xVar = this.f998c;
        if (xVar != null) {
            xVar.mo1840s(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (AbstractC0411b.f2170a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0297x xVar = this.f998c;
        if (xVar != null) {
            xVar.mo1841t(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (AbstractC0411b.f2170a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0297x xVar = this.f998c;
        if (xVar != null) {
            xVar.mo1842u(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0218e eVar = this.f997b;
        if (eVar != null) {
            eVar.mo1387f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0218e eVar = this.f997b;
        if (eVar != null) {
            eVar.mo1388g(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0418i.m2108p(this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        C0297x xVar = this.f998c;
        if (xVar != null) {
            xVar.mo1839r(z);
        }
    }

    @Override // p006b.p030g.p039k.AbstractC1012r
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0218e eVar = this.f997b;
        if (eVar != null) {
            eVar.mo1390i(colorStateList);
        }
    }

    @Override // p006b.p030g.p039k.AbstractC1012r
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0218e eVar = this.f997b;
        if (eVar != null) {
            eVar.mo1391j(mode);
        }
    }

    @Override // androidx.core.widget.AbstractC0421k
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f998c.mo1843v(colorStateList);
        this.f998c.mo1824b();
    }

    @Override // androidx.core.widget.AbstractC0421k
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f998c.mo1844w(mode);
        this.f998c.mo1824b();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0297x xVar = this.f998c;
        if (xVar != null) {
            xVar.mo1838q(context, i);
        }
    }

    public void setTextSize(int i, float f) {
        if (AbstractC0411b.f2170a) {
            super.setTextSize(i, f);
            return;
        }
        C0297x xVar = this.f998c;
        if (xVar != null) {
            xVar.mo1845z(i, f);
        }
    }
}
