package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;

class ControlBar extends LinearLayout {

    /* renamed from: b */
    private int f2595b;

    /* renamed from: c */
    private AbstractC0518a f2596c;

    /* renamed from: d */
    int f2597d = -1;

    /* renamed from: e */
    boolean f2598e = true;

    /* renamed from: androidx.leanback.widget.ControlBar$a */
    public interface AbstractC0518a {
        /* renamed from: a */
        void mo2978a(View view, View view2);
    }

    public ControlBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo2973a() {
        if (this.f2598e) {
            return getChildCount() / 2;
        }
        return 0;
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        int i3;
        if (i == 33 || i == 130) {
            int i4 = this.f2597d;
            if (i4 >= 0 && i4 < getChildCount()) {
                i3 = this.f2597d;
            } else if (getChildCount() > 0) {
                i3 = mo2973a();
            } else {
                return;
            }
            arrayList.add(getChildAt(i3));
            return;
        }
        super.addFocusables(arrayList, i, i2);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f2595b > 0) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < getChildCount() - 1) {
                View childAt = getChildAt(i3);
                i3++;
                View childAt2 = getChildAt(i3);
                int measuredWidth = this.f2595b - ((childAt.getMeasuredWidth() + childAt2.getMeasuredWidth()) / 2);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt2.getLayoutParams();
                layoutParams.setMarginStart(measuredWidth);
                childAt2.setLayoutParams(layoutParams);
                i4 += measuredWidth - layoutParams.getMarginStart();
            }
            setMeasuredDimension(getMeasuredWidth() + i4, getMeasuredHeight());
        }
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (getChildCount() > 0) {
            int i2 = this.f2597d;
            if (getChildAt((i2 < 0 || i2 >= getChildCount()) ? mo2973a() : this.f2597d).requestFocus(i, rect)) {
                return true;
            }
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        this.f2597d = indexOfChild(view);
        AbstractC0518a aVar = this.f2596c;
        if (aVar != null) {
            aVar.mo2978a(view, view2);
        }
    }
}
