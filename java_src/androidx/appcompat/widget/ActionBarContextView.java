package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import p006b.p007a.C0754a;
import p006b.p007a.C0759f;
import p006b.p007a.C0760g;
import p006b.p007a.C0763j;
import p006b.p007a.p014o.AbstractC0785b;
import p006b.p030g.p039k.C1013s;
import p006b.p030g.p039k.C1028w;

public class ActionBarContextView extends AbstractC0196a {

    /* renamed from: j */
    private CharSequence f661j;

    /* renamed from: k */
    private CharSequence f662k;

    /* renamed from: l */
    private View f663l;

    /* renamed from: m */
    private View f664m;

    /* renamed from: n */
    private LinearLayout f665n;

    /* renamed from: o */
    private TextView f666o;

    /* renamed from: p */
    private TextView f667p;

    /* renamed from: q */
    private int f668q;

    /* renamed from: r */
    private int f669r;

    /* renamed from: s */
    private boolean f670s;

    /* renamed from: t */
    private int f671t;

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.ActionBarContextView$a */
    public class View$OnClickListenerC0156a implements View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ AbstractC0785b f672b;

        View$OnClickListenerC0156a(AbstractC0785b bVar) {
            this.f672b = bVar;
        }

        public void onClick(View view) {
            this.f672b.mo432c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0754a.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0296w0 v = C0296w0.m1432v(context, attributeSet, C0763j.f3826y, i, 0);
        C1013s.m5772l0(this, v.mo1810g(C0763j.f3831z));
        this.f668q = v.mo1817n(C0763j.f3592D, 0);
        this.f669r = v.mo1817n(C0763j.f3587C, 0);
        this.f919f = v.mo1816m(C0763j.f3582B, 0);
        this.f671t = v.mo1817n(C0763j.f3577A, C0760g.abc_action_mode_close_item_material);
        v.mo1823w();
    }

    /* renamed from: i */
    private void m832i() {
        if (this.f665n == null) {
            LayoutInflater.from(getContext()).inflate(C0760g.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f665n = linearLayout;
            this.f666o = (TextView) linearLayout.findViewById(C0759f.action_bar_title);
            this.f667p = (TextView) this.f665n.findViewById(C0759f.action_bar_subtitle);
            if (this.f668q != 0) {
                this.f666o.setTextAppearance(getContext(), this.f668q);
            }
            if (this.f669r != 0) {
                this.f667p.setTextAppearance(getContext(), this.f669r);
            }
        }
        this.f666o.setText(this.f661j);
        this.f667p.setText(this.f662k);
        boolean z = !TextUtils.isEmpty(this.f661j);
        boolean z2 = !TextUtils.isEmpty(this.f662k);
        int i = 0;
        this.f667p.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.f665n;
        if (!z && !z2) {
            i = 8;
        }
        linearLayout2.setVisibility(i);
        if (this.f665n.getParent() == null) {
            addView(this.f665n);
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0196a
    /* renamed from: f */
    public /* bridge */ /* synthetic */ C1028w mo902f(int i, long j) {
        return super.mo902f(i, j);
    }

    /* renamed from: g */
    public void mo903g() {
        if (this.f663l == null) {
            mo912k();
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.AbstractC0196a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.AbstractC0196a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f662k;
    }

    public CharSequence getTitle() {
        return this.f661j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x003c  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo910h(p006b.p007a.p014o.AbstractC0785b r4) {
        /*
        // Method dump skipped, instructions count: 112
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.mo910h(b.a.o.b):void");
    }

    /* renamed from: j */
    public boolean mo911j() {
        return this.f670s;
    }

    /* renamed from: k */
    public void mo912k() {
        removeAllViews();
        this.f664m = null;
        this.f917d = null;
    }

    /* renamed from: l */
    public boolean mo913l() {
        C0203c cVar = this.f918e;
        if (cVar != null) {
            return cVar.mo1330N();
        }
        return false;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0203c cVar = this.f918e;
        if (cVar != null) {
            cVar.mo1321E();
            this.f918e.mo1322F();
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0196a
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f661j);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean b = C0214c1.m1132b(this);
        int paddingRight = b ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f663l;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f663l.getLayoutParams();
            int i5 = b ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = b ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int d = AbstractC0196a.m1036d(paddingRight, i5, b);
            paddingRight = AbstractC0196a.m1036d(d + mo1305e(this.f663l, d, paddingTop, paddingTop2, b), i6, b);
        }
        int i7 = paddingRight;
        LinearLayout linearLayout = this.f665n;
        if (!(linearLayout == null || this.f664m != null || linearLayout.getVisibility() == 8)) {
            i7 += mo1305e(this.f665n, i7, paddingTop, paddingTop2, b);
        }
        View view2 = this.f664m;
        if (view2 != null) {
            mo1305e(view2, i7, paddingTop, paddingTop2, b);
        }
        int paddingLeft = b ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f917d;
        if (actionMenuView != null) {
            mo1305e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !b);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i2) != 0) {
            int size = View.MeasureSpec.getSize(i);
            int i4 = this.f919f;
            if (i4 <= 0) {
                i4 = View.MeasureSpec.getSize(i2);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i5 = i4 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
            View view = this.f663l;
            if (view != null) {
                int c = mo1304c(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f663l.getLayoutParams();
                paddingLeft = c - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f917d;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = mo1304c(this.f917d, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.f665n;
            if (linearLayout != null && this.f664m == null) {
                if (this.f670s) {
                    this.f665n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f665n.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f665n.setVisibility(z ? 0 : 8);
                } else {
                    paddingLeft = mo1304c(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.f664m;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i6 = layoutParams.width;
                int i7 = i6 != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (i6 >= 0) {
                    paddingLeft = Math.min(i6, paddingLeft);
                }
                int i8 = layoutParams.height;
                if (i8 == -2) {
                    i3 = Integer.MIN_VALUE;
                }
                if (i8 >= 0) {
                    i5 = Math.min(i8, i5);
                }
                this.f664m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i7), View.MeasureSpec.makeMeasureSpec(i5, i3));
            }
            if (this.f919f <= 0) {
                int childCount = getChildCount();
                int i9 = 0;
                for (int i10 = 0; i10 < childCount; i10++) {
                    int measuredHeight = getChildAt(i10).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i9) {
                        i9 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i9);
                return;
            }
            setMeasuredDimension(size, i4);
        } else {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0196a
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.AbstractC0196a
    public void setContentHeight(int i) {
        this.f919f = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f664m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f664m = view;
        if (!(view == null || (linearLayout = this.f665n) == null)) {
            removeView(linearLayout);
            this.f665n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f662k = charSequence;
        m832i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f661j = charSequence;
        m832i();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f670s) {
            requestLayout();
        }
        this.f670s = z;
    }

    @Override // androidx.appcompat.widget.AbstractC0196a
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
