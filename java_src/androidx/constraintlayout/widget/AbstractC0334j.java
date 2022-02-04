package androidx.constraintlayout.widget;

import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import p006b.p022e.p026b.p027k.C0873k;

/* renamed from: androidx.constraintlayout.widget.j */
public abstract class AbstractC0334j extends AbstractC0318b {

    /* renamed from: j */
    private boolean f1894j;

    /* renamed from: k */
    private boolean f1895k;

    /* access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.AbstractC0318b
    /* renamed from: g */
    public void mo1919g(AttributeSet attributeSet) {
        super.mo1919g(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0333i.f1731a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0333i.f1745c1) {
                    this.f1894j = true;
                } else if (index == C0333i.f1780h1) {
                    this.f1895k = true;
                }
            }
        }
    }

    /* renamed from: n */
    public void mo2028n(C0873k kVar, int i, int i2) {
    }

    @Override // androidx.constraintlayout.widget.AbstractC0318b
    public void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.f1894j || this.f1895k) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
            for (int i = 0; i < this.f1433c; i++) {
                View g = constraintLayout.mo1936g(this.f1432b[i]);
                if (g != null) {
                    if (this.f1894j) {
                        g.setVisibility(visibility);
                    }
                    if (this.f1895k && elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                        g.setTranslationZ(g.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        mo1979c();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        mo1979c();
    }
}
