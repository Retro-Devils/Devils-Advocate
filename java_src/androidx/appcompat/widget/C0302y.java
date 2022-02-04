package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.widget.AbstractC0411b;
import androidx.core.widget.AbstractC0421k;
import androidx.core.widget.C0418i;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p006b.p007a.p008k.p009a.C0764a;
import p006b.p030g.p031d.C0906d;
import p006b.p030g.p037i.C0941c;
import p006b.p030g.p039k.AbstractC1012r;

/* renamed from: androidx.appcompat.widget.y */
public class C0302y extends TextView implements AbstractC1012r, AbstractC0421k, AbstractC0411b {

    /* renamed from: b */
    private final C0218e f1282b;

    /* renamed from: c */
    private final C0297x f1283c;

    /* renamed from: d */
    private final C0295w f1284d;

    /* renamed from: e */
    private Future<C0941c> f1285e;

    public C0302y(Context context) {
        this(context, null);
    }

    public C0302y(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public C0302y(Context context, AttributeSet attributeSet, int i) {
        super(C0279t0.m1381b(context), attributeSet, i);
        C0275r0.m1374a(this, getContext());
        C0218e eVar = new C0218e(this);
        this.f1282b = eVar;
        eVar.mo1386e(attributeSet, i);
        C0297x xVar = new C0297x(this);
        this.f1283c = xVar;
        xVar.mo1834m(attributeSet, i);
        xVar.mo1824b();
        this.f1284d = new C0295w(this);
    }

    /* renamed from: c */
    private void m1524c() {
        Future<C0941c> future = this.f1285e;
        if (future != null) {
            try {
                this.f1285e = null;
                C0418i.m2105m(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0218e eVar = this.f1282b;
        if (eVar != null) {
            eVar.mo1383b();
        }
        C0297x xVar = this.f1283c;
        if (xVar != null) {
            xVar.mo1824b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (AbstractC0411b.f2170a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0297x xVar = this.f1283c;
        if (xVar != null) {
            return xVar.mo1826e();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (AbstractC0411b.f2170a) {
            return super.getAutoSizeMinTextSize();
        }
        C0297x xVar = this.f1283c;
        if (xVar != null) {
            return xVar.mo1827f();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (AbstractC0411b.f2170a) {
            return super.getAutoSizeStepGranularity();
        }
        C0297x xVar = this.f1283c;
        if (xVar != null) {
            return xVar.mo1828g();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (AbstractC0411b.f2170a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0297x xVar = this.f1283c;
        return xVar != null ? xVar.mo1829h() : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (AbstractC0411b.f2170a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0297x xVar = this.f1283c;
        if (xVar != null) {
            return xVar.mo1830i();
        }
        return 0;
    }

    public int getFirstBaselineToTopHeight() {
        return C0418i.m2094b(this);
    }

    public int getLastBaselineToBottomHeight() {
        return C0418i.m2095c(this);
    }

    @Override // p006b.p030g.p039k.AbstractC1012r
    public ColorStateList getSupportBackgroundTintList() {
        C0218e eVar = this.f1282b;
        if (eVar != null) {
            return eVar.mo1384c();
        }
        return null;
    }

    @Override // p006b.p030g.p039k.AbstractC1012r
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0218e eVar = this.f1282b;
        if (eVar != null) {
            return eVar.mo1385d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1283c.mo1831j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1283c.mo1832k();
    }

    public CharSequence getText() {
        m1524c();
        return super.getText();
    }

    public TextClassifier getTextClassifier() {
        C0295w wVar;
        return (Build.VERSION.SDK_INT >= 28 || (wVar = this.f1284d) == null) ? super.getTextClassifier() : wVar.mo1802a();
    }

    public C0941c.C0942a getTextMetricsParamsCompat() {
        return C0418i.m2098f(this);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0247l.m1274a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0297x xVar = this.f1283c;
        if (xVar != null) {
            xVar.mo1836o(z, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        m1524c();
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0297x xVar = this.f1283c;
        if (xVar != null && !AbstractC0411b.f2170a && xVar.mo1833l()) {
            this.f1283c.mo1825c();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (AbstractC0411b.f2170a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0297x xVar = this.f1283c;
        if (xVar != null) {
            xVar.mo1840s(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (AbstractC0411b.f2170a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0297x xVar = this.f1283c;
        if (xVar != null) {
            xVar.mo1841t(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (AbstractC0411b.f2170a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0297x xVar = this.f1283c;
        if (xVar != null) {
            xVar.mo1842u(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0218e eVar = this.f1282b;
        if (eVar != null) {
            eVar.mo1387f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0218e eVar = this.f1282b;
        if (eVar != null) {
            eVar.mo1388g(i);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0297x xVar = this.f1283c;
        if (xVar != null) {
            xVar.mo1837p();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0297x xVar = this.f1283c;
        if (xVar != null) {
            xVar.mo1837p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable d = i != 0 ? C0764a.m4517d(context, i) : null;
        Drawable d2 = i2 != 0 ? C0764a.m4517d(context, i2) : null;
        Drawable d3 = i3 != 0 ? C0764a.m4517d(context, i3) : null;
        if (i4 != 0) {
            drawable = C0764a.m4517d(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(d, d2, d3, drawable);
        C0297x xVar = this.f1283c;
        if (xVar != null) {
            xVar.mo1837p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0297x xVar = this.f1283c;
        if (xVar != null) {
            xVar.mo1837p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable d = i != 0 ? C0764a.m4517d(context, i) : null;
        Drawable d2 = i2 != 0 ? C0764a.m4517d(context, i2) : null;
        Drawable d3 = i3 != 0 ? C0764a.m4517d(context, i3) : null;
        if (i4 != 0) {
            drawable = C0764a.m4517d(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(d, d2, d3, drawable);
        C0297x xVar = this.f1283c;
        if (xVar != null) {
            xVar.mo1837p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0297x xVar = this.f1283c;
        if (xVar != null) {
            xVar.mo1837p();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0418i.m2108p(this, callback));
    }

    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            C0418i.m2102j(this, i);
        }
    }

    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            C0418i.m2103k(this, i);
        }
    }

    public void setLineHeight(int i) {
        C0418i.m2104l(this, i);
    }

    public void setPrecomputedText(C0941c cVar) {
        C0418i.m2105m(this, cVar);
    }

    @Override // p006b.p030g.p039k.AbstractC1012r
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0218e eVar = this.f1282b;
        if (eVar != null) {
            eVar.mo1390i(colorStateList);
        }
    }

    @Override // p006b.p030g.p039k.AbstractC1012r
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0218e eVar = this.f1282b;
        if (eVar != null) {
            eVar.mo1391j(mode);
        }
    }

    @Override // androidx.core.widget.AbstractC0421k
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1283c.mo1843v(colorStateList);
        this.f1283c.mo1824b();
    }

    @Override // androidx.core.widget.AbstractC0421k
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1283c.mo1844w(mode);
        this.f1283c.mo1824b();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0297x xVar = this.f1283c;
        if (xVar != null) {
            xVar.mo1838q(context, i);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        C0295w wVar;
        if (Build.VERSION.SDK_INT >= 28 || (wVar = this.f1284d) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            wVar.mo1803b(textClassifier);
        }
    }

    public void setTextFuture(Future<C0941c> future) {
        this.f1285e = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C0941c.C0942a aVar) {
        C0418i.m2107o(this, aVar);
    }

    public void setTextSize(int i, float f) {
        if (AbstractC0411b.f2170a) {
            super.setTextSize(i, f);
            return;
        }
        C0297x xVar = this.f1283c;
        if (xVar != null) {
            xVar.mo1845z(i, f);
        }
    }

    public void setTypeface(Typeface typeface, int i) {
        Typeface a = (typeface == null || i <= 0) ? null : C0906d.m5319a(getContext(), typeface, i);
        if (a != null) {
            typeface = a;
        }
        super.setTypeface(typeface, i);
    }
}
