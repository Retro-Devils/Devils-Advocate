package androidx.leanback.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class ScaleFrameLayout extends FrameLayout {

    /* renamed from: b */
    private float f2686b;

    /* renamed from: c */
    private float f2687c;

    /* renamed from: d */
    private float f2688d;

    public ScaleFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScaleFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2686b = 1.0f;
        this.f2687c = 1.0f;
        this.f2688d = 1.0f;
    }

    /* renamed from: a */
    private static int m2751a(int i, float f) {
        return f == 1.0f ? i : View.MeasureSpec.makeMeasureSpec((int) ((((float) View.MeasureSpec.getSize(i)) / f) + 0.5f), View.MeasureSpec.getMode(i));
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        view.setScaleX(this.f2688d);
        view.setScaleY(this.f2688d);
    }

    /* access modifiers changed from: protected */
    public boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        boolean addViewInLayout = super.addViewInLayout(view, i, layoutParams, z);
        if (addViewInLayout) {
            view.setScaleX(this.f2688d);
            view.setScaleY(this.f2688d);
        }
        return addViewInLayout;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
        /*
        // Method dump skipped, instructions count: 240
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.ScaleFrameLayout.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        float f = this.f2686b;
        if (f == 1.0f && this.f2687c == 1.0f) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(m2751a(i, f), m2751a(i2, this.f2687c));
        setMeasuredDimension((int) ((((float) getMeasuredWidth()) * this.f2686b) + 0.5f), (int) ((((float) getMeasuredHeight()) * this.f2687c) + 0.5f));
    }

    public void setChildScale(float f) {
        if (this.f2688d != f) {
            this.f2688d = f;
            for (int i = 0; i < getChildCount(); i++) {
                getChildAt(i).setScaleX(f);
                getChildAt(i).setScaleY(f);
            }
        }
    }

    public void setForeground(Drawable drawable) {
        throw new UnsupportedOperationException();
    }

    public void setLayoutScaleX(float f) {
        if (f != this.f2686b) {
            this.f2686b = f;
            requestLayout();
        }
    }

    public void setLayoutScaleY(float f) {
        if (f != this.f2687c) {
            this.f2687c = f;
            requestLayout();
        }
    }
}
