package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: androidx.constraintlayout.widget.e */
public class C0328e extends ViewGroup {

    /* renamed from: b */
    C0322d f1556b;

    /* renamed from: androidx.constraintlayout.widget.e$a */
    public static class C0329a extends ConstraintLayout.C0312b {

        /* renamed from: A0 */
        public float f1557A0;

        /* renamed from: B0 */
        public float f1558B0;

        /* renamed from: p0 */
        public float f1559p0;

        /* renamed from: q0 */
        public boolean f1560q0;

        /* renamed from: r0 */
        public float f1561r0;

        /* renamed from: s0 */
        public float f1562s0;

        /* renamed from: t0 */
        public float f1563t0;

        /* renamed from: u0 */
        public float f1564u0;

        /* renamed from: v0 */
        public float f1565v0;

        /* renamed from: w0 */
        public float f1566w0;

        /* renamed from: x0 */
        public float f1567x0;

        /* renamed from: y0 */
        public float f1568y0;

        /* renamed from: z0 */
        public float f1569z0;

        public C0329a(int i, int i2) {
            super(i, i2);
            this.f1559p0 = 1.0f;
            this.f1560q0 = false;
            this.f1561r0 = 0.0f;
            this.f1562s0 = 0.0f;
            this.f1563t0 = 0.0f;
            this.f1564u0 = 0.0f;
            this.f1565v0 = 1.0f;
            this.f1566w0 = 1.0f;
            this.f1567x0 = 0.0f;
            this.f1568y0 = 0.0f;
            this.f1569z0 = 0.0f;
            this.f1557A0 = 0.0f;
            this.f1558B0 = 0.0f;
        }

        public C0329a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1559p0 = 1.0f;
            this.f1560q0 = false;
            this.f1561r0 = 0.0f;
            this.f1562s0 = 0.0f;
            this.f1563t0 = 0.0f;
            this.f1564u0 = 0.0f;
            this.f1565v0 = 1.0f;
            this.f1566w0 = 1.0f;
            this.f1567x0 = 0.0f;
            this.f1568y0 = 0.0f;
            this.f1569z0 = 0.0f;
            this.f1557A0 = 0.0f;
            this.f1558B0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0333i.f1825o2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0333i.f1831p2) {
                    this.f1559p0 = obtainStyledAttributes.getFloat(index, this.f1559p0);
                } else if (index == C0333i.f1576A2) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        this.f1561r0 = obtainStyledAttributes.getFloat(index, this.f1561r0);
                        this.f1560q0 = true;
                    }
                } else if (index == C0333i.f1879x2) {
                    this.f1563t0 = obtainStyledAttributes.getFloat(index, this.f1563t0);
                } else if (index == C0333i.f1885y2) {
                    this.f1564u0 = obtainStyledAttributes.getFloat(index, this.f1564u0);
                } else if (index == C0333i.f1873w2) {
                    this.f1562s0 = obtainStyledAttributes.getFloat(index, this.f1562s0);
                } else if (index == C0333i.f1861u2) {
                    this.f1565v0 = obtainStyledAttributes.getFloat(index, this.f1565v0);
                } else if (index == C0333i.f1867v2) {
                    this.f1566w0 = obtainStyledAttributes.getFloat(index, this.f1566w0);
                } else if (index == C0333i.f1837q2) {
                    this.f1567x0 = obtainStyledAttributes.getFloat(index, this.f1567x0);
                } else if (index == C0333i.f1843r2) {
                    this.f1568y0 = obtainStyledAttributes.getFloat(index, this.f1568y0);
                } else if (index == C0333i.f1849s2) {
                    this.f1569z0 = obtainStyledAttributes.getFloat(index, this.f1569z0);
                } else if (index == C0333i.f1855t2) {
                    this.f1557A0 = obtainStyledAttributes.getFloat(index, this.f1557A0);
                } else if (index == C0333i.f1891z2 && Build.VERSION.SDK_INT >= 21) {
                    this.f1558B0 = obtainStyledAttributes.getFloat(index, this.f1558B0);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0329a generateDefaultLayoutParams() {
        return new C0329a(-2, -2);
    }

    /* renamed from: b */
    public C0329a generateLayoutParams(AttributeSet attributeSet) {
        return new C0329a(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.C0312b(layoutParams);
    }

    public C0322d getConstraintSet() {
        if (this.f1556b == null) {
            this.f1556b = new C0322d();
        }
        this.f1556b.mo1998g(this);
        return this.f1556b;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
