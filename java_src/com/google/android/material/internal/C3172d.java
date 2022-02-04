package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import p006b.p030g.p039k.C1001g;
import p006b.p030g.p039k.C1013s;
import p069c.p073b.p074a.p090b.C1395f;
import p069c.p073b.p074a.p090b.C1400k;

/* renamed from: com.google.android.material.internal.d */
public class C3172d extends ViewGroup {

    /* renamed from: b */
    private int f10647b;

    /* renamed from: c */
    private int f10648c;

    /* renamed from: d */
    private boolean f10649d;

    /* renamed from: e */
    private int f10650e;

    public C3172d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C3172d(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10649d = false;
        m13328d(context, attributeSet);
    }

    /* renamed from: a */
    private static int m13327a(int i, int i2, int i3) {
        return i2 != Integer.MIN_VALUE ? i2 != 1073741824 ? i3 : i : Math.min(i3, i);
    }

    /* renamed from: d */
    private void m13328d(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C1400k.f5823X0, 0, 0);
        this.f10647b = obtainStyledAttributes.getDimensionPixelSize(C1400k.f5835Z0, 0);
        this.f10648c = obtainStyledAttributes.getDimensionPixelSize(C1400k.f5829Y0, 0);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    public int mo10710b(View view) {
        Object tag = view.getTag(C1395f.row_index_key);
        if (!(tag instanceof Integer)) {
            return -1;
        }
        return ((Integer) tag).intValue();
    }

    /* renamed from: c */
    public boolean mo10230c() {
        return this.f10649d;
    }

    /* access modifiers changed from: protected */
    public int getItemSpacing() {
        return this.f10648c;
    }

    /* access modifiers changed from: protected */
    public int getLineSpacing() {
        return this.f10647b;
    }

    /* access modifiers changed from: protected */
    public int getRowCount() {
        return this.f10650e;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (getChildCount() == 0) {
            this.f10650e = 0;
            return;
        }
        this.f10650e = 1;
        boolean z2 = C1013s.m5797y(this) == 1;
        int paddingRight = z2 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z2 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i7 = (i3 - i) - paddingLeft;
        int i8 = paddingRight;
        int i9 = paddingTop;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(C1395f.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i5 = C1001g.m5680b(marginLayoutParams);
                    i6 = C1001g.m5679a(marginLayoutParams);
                } else {
                    i6 = 0;
                    i5 = 0;
                }
                int measuredWidth = i8 + i5 + childAt.getMeasuredWidth();
                if (!this.f10649d && measuredWidth > i7) {
                    i9 = this.f10647b + paddingTop;
                    this.f10650e++;
                    i8 = paddingRight;
                }
                childAt.setTag(C1395f.row_index_key, Integer.valueOf(this.f10650e - 1));
                int i11 = i8 + i5;
                int measuredWidth2 = childAt.getMeasuredWidth() + i11;
                int measuredHeight = childAt.getMeasuredHeight() + i9;
                if (z2) {
                    i11 = i7 - measuredWidth2;
                    measuredWidth2 = (i7 - i8) - i5;
                }
                childAt.layout(i11, i9, measuredWidth2, measuredHeight);
                i8 += i5 + i6 + childAt.getMeasuredWidth() + this.f10648c;
                paddingTop = measuredHeight;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i6 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i6 - getPaddingRight();
        int i7 = paddingTop;
        int i8 = 0;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i2);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i4 = marginLayoutParams.leftMargin + 0;
                    i3 = marginLayoutParams.rightMargin + 0;
                } else {
                    i4 = 0;
                    i3 = 0;
                }
                if (paddingLeft + i4 + childAt.getMeasuredWidth() <= paddingRight || mo10230c()) {
                    i5 = paddingLeft;
                } else {
                    i5 = getPaddingLeft();
                    i7 = this.f10647b + paddingTop;
                }
                int measuredWidth = i5 + i4 + childAt.getMeasuredWidth();
                int measuredHeight = i7 + childAt.getMeasuredHeight();
                if (measuredWidth > i8) {
                    i8 = measuredWidth;
                }
                paddingLeft = i5 + i4 + i3 + childAt.getMeasuredWidth() + this.f10648c;
                if (i9 == getChildCount() - 1) {
                    i8 += i3;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(m13327a(size, mode, i8 + getPaddingRight()), m13327a(size2, mode2, paddingTop + getPaddingBottom()));
    }

    /* access modifiers changed from: protected */
    public void setItemSpacing(int i) {
        this.f10648c = i;
    }

    /* access modifiers changed from: protected */
    public void setLineSpacing(int i) {
        this.f10647b = i;
    }

    public void setSingleLine(boolean z) {
        this.f10649d = z;
    }
}
