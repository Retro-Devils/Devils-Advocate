package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import p006b.p007a.C0763j;
import p006b.p030g.p039k.C1013s;

/* renamed from: androidx.appcompat.widget.h0 */
public class C0230h0 extends ViewGroup {

    /* renamed from: b */
    private boolean f1015b;

    /* renamed from: c */
    private int f1016c;

    /* renamed from: d */
    private int f1017d;

    /* renamed from: e */
    private int f1018e;

    /* renamed from: f */
    private int f1019f;

    /* renamed from: g */
    private int f1020g;

    /* renamed from: h */
    private float f1021h;

    /* renamed from: i */
    private boolean f1022i;

    /* renamed from: j */
    private int[] f1023j;

    /* renamed from: k */
    private int[] f1024k;

    /* renamed from: l */
    private Drawable f1025l;

    /* renamed from: m */
    private int f1026m;

    /* renamed from: n */
    private int f1027n;

    /* renamed from: o */
    private int f1028o;

    /* renamed from: p */
    private int f1029p;

    /* renamed from: androidx.appcompat.widget.h0$a */
    public static class C0231a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public float f1030a;

        /* renamed from: b */
        public int f1031b;

        public C0231a(int i, int i2) {
            super(i, i2);
            this.f1031b = -1;
            this.f1030a = 0.0f;
        }

        public C0231a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1031b = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0763j.f3759l1);
            this.f1030a = obtainStyledAttributes.getFloat(C0763j.f3769n1, 0.0f);
            this.f1031b = obtainStyledAttributes.getInt(C0763j.f3764m1, -1);
            obtainStyledAttributes.recycle();
        }

        public C0231a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1031b = -1;
        }
    }

    public C0230h0(Context context) {
        this(context, null);
    }

    public C0230h0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0230h0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1015b = true;
        this.f1016c = -1;
        this.f1017d = 0;
        this.f1019f = 8388659;
        int[] iArr = C0763j.f3709b1;
        C0296w0 v = C0296w0.m1432v(context, attributeSet, iArr, i, 0);
        C1013s.m5762g0(this, context, iArr, attributeSet, v.mo1821r(), i, 0);
        int k = v.mo1814k(C0763j.f3719d1, -1);
        if (k >= 0) {
            setOrientation(k);
        }
        int k2 = v.mo1814k(C0763j.f3714c1, -1);
        if (k2 >= 0) {
            setGravity(k2);
        }
        boolean a = v.mo1804a(C0763j.f3724e1, true);
        if (!a) {
            setBaselineAligned(a);
        }
        this.f1021h = v.mo1812i(C0763j.f3734g1, -1.0f);
        this.f1016c = v.mo1814k(C0763j.f3729f1, -1);
        this.f1022i = v.mo1804a(C0763j.f3749j1, false);
        setDividerDrawable(v.mo1810g(C0763j.f3739h1));
        this.f1028o = v.mo1814k(C0763j.f3754k1, 0);
        this.f1029p = v.mo1809f(C0763j.f3744i1, 0);
        v.mo1823w();
    }

    /* renamed from: A */
    private void m1176A(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    /* renamed from: k */
    private void m1177k(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View s = mo1478s(i3);
            if (s.getVisibility() != 8) {
                C0231a aVar = (C0231a) s.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) aVar).height == -1) {
                    int i4 = ((ViewGroup.MarginLayoutParams) aVar).width;
                    ((ViewGroup.MarginLayoutParams) aVar).width = s.getMeasuredWidth();
                    measureChildWithMargins(s, i2, 0, makeMeasureSpec, 0);
                    ((ViewGroup.MarginLayoutParams) aVar).width = i4;
                }
            }
        }
    }

    /* renamed from: l */
    private void m1178l(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View s = mo1478s(i3);
            if (s.getVisibility() != 8) {
                C0231a aVar = (C0231a) s.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) aVar).width == -1) {
                    int i4 = ((ViewGroup.MarginLayoutParams) aVar).height;
                    ((ViewGroup.MarginLayoutParams) aVar).height = s.getMeasuredHeight();
                    measureChildWithMargins(s, makeMeasureSpec, 0, i2, 0);
                    ((ViewGroup.MarginLayoutParams) aVar).height = i4;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0231a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo1458g(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int virtualChildCount = getVirtualChildCount();
        boolean b = C0214c1.m1132b(this);
        for (int i4 = 0; i4 < virtualChildCount; i4++) {
            View s = mo1478s(i4);
            if (!(s == null || s.getVisibility() == 8 || !mo1491t(i4))) {
                C0231a aVar = (C0231a) s.getLayoutParams();
                mo1471j(canvas, b ? s.getRight() + ((ViewGroup.MarginLayoutParams) aVar).rightMargin : (s.getLeft() - ((ViewGroup.MarginLayoutParams) aVar).leftMargin) - this.f1026m);
            }
        }
        if (mo1491t(virtualChildCount)) {
            View s2 = mo1478s(virtualChildCount - 1);
            if (s2 != null) {
                C0231a aVar2 = (C0231a) s2.getLayoutParams();
                if (b) {
                    i3 = s2.getLeft();
                    i2 = ((ViewGroup.MarginLayoutParams) aVar2).leftMargin;
                } else {
                    i = s2.getRight() + ((ViewGroup.MarginLayoutParams) aVar2).rightMargin;
                    mo1471j(canvas, i);
                }
            } else if (b) {
                i = getPaddingLeft();
                mo1471j(canvas, i);
            } else {
                i3 = getWidth();
                i2 = getPaddingRight();
            }
            i = (i3 - i2) - this.f1026m;
            mo1471j(canvas, i);
        }
    }

    public int getBaseline() {
        int i;
        if (this.f1016c < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.f1016c;
        if (childCount > i2) {
            View childAt = getChildAt(i2);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i3 = this.f1017d;
                if (this.f1018e == 1 && (i = this.f1019f & 112) != 48) {
                    if (i == 16) {
                        i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f1020g) / 2;
                    } else if (i == 80) {
                        i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f1020g;
                    }
                }
                return i3 + ((ViewGroup.MarginLayoutParams) ((C0231a) childAt.getLayoutParams())).topMargin + baseline;
            } else if (this.f1016c == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.f1016c;
    }

    public Drawable getDividerDrawable() {
        return this.f1025l;
    }

    public int getDividerPadding() {
        return this.f1029p;
    }

    public int getDividerWidth() {
        return this.f1026m;
    }

    public int getGravity() {
        return this.f1019f;
    }

    public int getOrientation() {
        return this.f1018e;
    }

    public int getShowDividers() {
        return this.f1028o;
    }

    /* access modifiers changed from: package-private */
    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f1021h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo1469h(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i = 0; i < virtualChildCount; i++) {
            View s = mo1478s(i);
            if (!(s == null || s.getVisibility() == 8 || !mo1491t(i))) {
                mo1470i(canvas, (s.getTop() - ((ViewGroup.MarginLayoutParams) ((C0231a) s.getLayoutParams())).topMargin) - this.f1027n);
            }
        }
        if (mo1491t(virtualChildCount)) {
            View s2 = mo1478s(virtualChildCount - 1);
            mo1470i(canvas, s2 == null ? (getHeight() - getPaddingBottom()) - this.f1027n : s2.getBottom() + ((ViewGroup.MarginLayoutParams) ((C0231a) s2.getLayoutParams())).bottomMargin);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo1470i(Canvas canvas, int i) {
        this.f1025l.setBounds(getPaddingLeft() + this.f1029p, i, (getWidth() - getPaddingRight()) - this.f1029p, this.f1027n + i);
        this.f1025l.draw(canvas);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo1471j(Canvas canvas, int i) {
        this.f1025l.setBounds(i, getPaddingTop() + this.f1029p, this.f1026m + i, (getHeight() - getPaddingBottom()) - this.f1029p);
        this.f1025l.draw(canvas);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public C0231a generateDefaultLayoutParams() {
        int i = this.f1018e;
        if (i == 0) {
            return new C0231a(-2, -2);
        }
        if (i == 1) {
            return new C0231a(-1, -2);
        }
        return null;
    }

    /* renamed from: n */
    public C0231a generateLayoutParams(AttributeSet attributeSet) {
        return new C0231a(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public C0231a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0231a(layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f1025l != null) {
            if (this.f1018e == 1) {
                mo1469h(canvas);
            } else {
                mo1458g(canvas);
            }
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f1018e == 1) {
            mo1493v(i, i2, i3, i4);
        } else {
            mo1492u(i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f1018e == 1) {
            mo1497z(i, i2);
        } else {
            mo1495x(i, i2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public int mo1475p(View view, int i) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public int mo1476q(View view) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public int mo1477r(View view) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public View mo1478s(int i) {
        return getChildAt(i);
    }

    public void setBaselineAligned(boolean z) {
        this.f1015b = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
        }
        this.f1016c = i;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.f1025l) {
            this.f1025l = drawable;
            boolean z = false;
            if (drawable != null) {
                this.f1026m = drawable.getIntrinsicWidth();
                this.f1027n = drawable.getIntrinsicHeight();
            } else {
                this.f1026m = 0;
                this.f1027n = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int i) {
        this.f1029p = i;
    }

    public void setGravity(int i) {
        if (this.f1019f != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f1019f = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.f1019f;
        if ((8388615 & i3) != i2) {
            this.f1019f = i2 | (-8388616 & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f1022i = z;
    }

    public void setOrientation(int i) {
        if (this.f1018e != i) {
            this.f1018e = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f1028o) {
            requestLayout();
        }
        this.f1028o = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.f1019f;
        if ((i3 & 112) != i2) {
            this.f1019f = i2 | (i3 & -113);
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f1021h = Math.max(0.0f, f);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public boolean mo1491t(int i) {
        if (i == 0) {
            return (this.f1028o & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.f1028o & 4) != 0;
        }
        if ((this.f1028o & 2) == 0) {
            return false;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (getChildAt(i2).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f7  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1492u(int r25, int r26, int r27, int r28) {
        /*
        // Method dump skipped, instructions count: 320
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0230h0.mo1492u(int, int, int, int):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009d  */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1493v(int r18, int r19, int r20, int r21) {
        /*
        // Method dump skipped, instructions count: 199
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0230h0.mo1493v(int, int, int, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo1494w(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x03a1, code lost:
        if (r8 > 0) goto L_0x03af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03ac, code lost:
        if (r8 < 0) goto L_0x03ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03ae, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03af, code lost:
        r14.measure(android.view.View.MeasureSpec.makeMeasureSpec(r8, r3), r0);
        r9 = android.view.View.combineMeasuredStates(r9, r14.getMeasuredState() & -16777216);
        r0 = r0;
        r3 = r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x043a  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01ce  */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1495x(int r38, int r39) {
        /*
        // Method dump skipped, instructions count: 1269
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0230h0.mo1495x(int, int):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public int mo1496y(int i) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02ce, code lost:
        if (r15 > 0) goto L_0x02dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02d9, code lost:
        if (r15 < 0) goto L_0x02db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02db, code lost:
        r15 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02dc, code lost:
        r13.measure(r0, android.view.View.MeasureSpec.makeMeasureSpec(r15, r10));
        r1 = android.view.View.combineMeasuredStates(r1, r13.getMeasuredState() & -256);
        r0 = r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0319  */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1497z(int r34, int r35) {
        /*
        // Method dump skipped, instructions count: 901
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0230h0.mo1497z(int, int):void");
    }
}
