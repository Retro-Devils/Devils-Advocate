package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import p006b.p053m.C1074f;
import p006b.p053m.C1080l;

class GuidanceStylingRelativeLayout extends RelativeLayout {

    /* renamed from: b */
    private float f2599b;

    public GuidanceStylingRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GuidanceStylingRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2599b = m2712a(context);
    }

    /* renamed from: a */
    public static float m2712a(Context context) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(C1080l.f4968h);
        float f = obtainStyledAttributes.getFloat(C1080l.f4970i, 40.0f);
        obtainStyledAttributes.recycle();
        return f;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View findViewById = getRootView().findViewById(C1074f.guidance_title);
        View findViewById2 = getRootView().findViewById(C1074f.guidance_breadcrumb);
        View findViewById3 = getRootView().findViewById(C1074f.guidance_description);
        ImageView imageView = (ImageView) getRootView().findViewById(C1074f.guidance_icon);
        int measuredHeight = (int) ((((float) getMeasuredHeight()) * this.f2599b) / 100.0f);
        if (findViewById != null && findViewById.getParent() == this) {
            int baseline = (((measuredHeight - findViewById.getBaseline()) - findViewById2.getMeasuredHeight()) - findViewById.getPaddingTop()) - findViewById2.getTop();
            if (findViewById2.getParent() == this) {
                findViewById2.offsetTopAndBottom(baseline);
            }
            findViewById.offsetTopAndBottom(baseline);
            if (findViewById3 != null && findViewById3.getParent() == this) {
                findViewById3.offsetTopAndBottom(baseline);
            }
        }
        if (imageView != null && imageView.getParent() == this && imageView.getDrawable() != null) {
            imageView.offsetTopAndBottom(measuredHeight - (imageView.getMeasuredHeight() / 2));
        }
    }
}
