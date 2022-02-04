package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p006b.p007a.C0759f;
import p006b.p007a.C0763j;
import p006b.p030g.p039k.C1013s;

public class ActionBarContainer extends FrameLayout {

    /* renamed from: b */
    private boolean f651b;

    /* renamed from: c */
    private View f652c;

    /* renamed from: d */
    private View f653d;

    /* renamed from: e */
    private View f654e;

    /* renamed from: f */
    Drawable f655f;

    /* renamed from: g */
    Drawable f656g;

    /* renamed from: h */
    Drawable f657h;

    /* renamed from: i */
    boolean f658i;

    /* renamed from: j */
    boolean f659j;

    /* renamed from: k */
    private int f660k;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C1013s.m5772l0(this, new C0200b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0763j.f3702a);
        this.f655f = obtainStyledAttributes.getDrawable(C0763j.f3707b);
        this.f656g = obtainStyledAttributes.getDrawable(C0763j.f3717d);
        this.f660k = obtainStyledAttributes.getDimensionPixelSize(C0763j.f3747j, -1);
        boolean z = true;
        if (getId() == C0759f.split_action_bar) {
            this.f658i = true;
            this.f657h = obtainStyledAttributes.getDrawable(C0763j.f3712c);
        }
        obtainStyledAttributes.recycle();
        if (!this.f658i ? !(this.f655f == null && this.f656g == null) : this.f657h != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    /* renamed from: a */
    private int m830a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: b */
    private boolean m831b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f655f;
        if (drawable != null && drawable.isStateful()) {
            this.f655f.setState(getDrawableState());
        }
        Drawable drawable2 = this.f656g;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f656g.setState(getDrawableState());
        }
        Drawable drawable3 = this.f657h;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f657h.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f652c;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f655f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f656g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f657h;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f653d = findViewById(C0759f.action_bar);
        this.f654e = findViewById(C0759f.action_context_bar);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f651b || super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        Drawable drawable2;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z, i, i2, i3, i4);
        View view2 = this.f652c;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view2 == null || view2.getVisibility() == 8) ? false : true;
        if (!(view2 == null || view2.getVisibility() == 8)) {
            int measuredHeight = getMeasuredHeight();
            int i5 = ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin;
            view2.layout(i, (measuredHeight - view2.getMeasuredHeight()) - i5, i3, measuredHeight - i5);
        }
        if (this.f658i) {
            Drawable drawable3 = this.f657h;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f655f != null) {
                if (this.f653d.getVisibility() == 0) {
                    drawable2 = this.f655f;
                    left = this.f653d.getLeft();
                    top = this.f653d.getTop();
                    right = this.f653d.getRight();
                    view = this.f653d;
                } else {
                    View view3 = this.f654e;
                    if (view3 == null || view3.getVisibility() != 0) {
                        this.f655f.setBounds(0, 0, 0, 0);
                        z3 = true;
                    } else {
                        drawable2 = this.f655f;
                        left = this.f654e.getLeft();
                        top = this.f654e.getTop();
                        right = this.f654e.getRight();
                        view = this.f654e;
                    }
                }
                drawable2.setBounds(left, top, right, view.getBottom());
                z3 = true;
            }
            this.f659j = z4;
            if (!z4 || (drawable = this.f656g) == null) {
                z2 = z3;
            } else {
                drawable.setBounds(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            }
        }
        if (z2) {
            invalidate();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r4, int r5) {
        /*
        // Method dump skipped, instructions count: 112
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f655f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f655f);
        }
        this.f655f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f653d;
            if (view != null) {
                this.f655f.setBounds(view.getLeft(), this.f653d.getTop(), this.f653d.getRight(), this.f653d.getBottom());
            }
        }
        boolean z = true;
        if (!this.f658i ? !(this.f655f == null && this.f656g == null) : this.f657h != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f657h;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f657h);
        }
        this.f657h = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f658i && (drawable2 = this.f657h) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f658i ? this.f655f == null && this.f656g == null : this.f657h == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f656g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f656g);
        }
        this.f656g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f659j && (drawable2 = this.f656g) != null) {
                drawable2.setBounds(this.f652c.getLeft(), this.f652c.getTop(), this.f652c.getRight(), this.f652c.getBottom());
            }
        }
        boolean z = true;
        if (!this.f658i ? !(this.f655f == null && this.f656g == null) : this.f657h != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setTabContainer(C0266p0 p0Var) {
        View view = this.f652c;
        if (view != null) {
            removeView(view);
        }
        this.f652c = p0Var;
        if (p0Var != null) {
            addView(p0Var);
            ViewGroup.LayoutParams layoutParams = p0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            p0Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f651b = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f655f;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f656g;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f657h;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f655f && !this.f658i) || (drawable == this.f656g && this.f659j) || ((drawable == this.f657h && this.f658i) || super.verifyDrawable(drawable));
    }
}
