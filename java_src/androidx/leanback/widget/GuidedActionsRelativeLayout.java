package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import p006b.p053m.C1074f;

class GuidedActionsRelativeLayout extends RelativeLayout {

    /* renamed from: b */
    private float f2605b;

    /* renamed from: c */
    private boolean f2606c;

    /* renamed from: d */
    private AbstractC0520a f2607d;

    /* renamed from: androidx.leanback.widget.GuidedActionsRelativeLayout$a */
    interface AbstractC0520a {
        /* renamed from: a */
        boolean mo2997a(KeyEvent keyEvent);
    }

    public GuidedActionsRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GuidedActionsRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2606c = false;
        this.f2605b = GuidanceStylingRelativeLayout.m2712a(context);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        AbstractC0520a aVar = this.f2607d;
        if (aVar == null || !aVar.mo2997a(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f2606c = false;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        View findViewById;
        int size = View.MeasureSpec.getSize(i2);
        if (size > 0 && (findViewById = findViewById(C1074f.guidedactions_sub_list)) != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById.getLayoutParams();
            if (marginLayoutParams.topMargin < 0 && !this.f2606c) {
                this.f2606c = true;
            }
            if (this.f2606c) {
                marginLayoutParams.topMargin = (int) ((this.f2605b * ((float) size)) / 100.0f);
            }
        }
        super.onMeasure(i, i2);
    }
}
