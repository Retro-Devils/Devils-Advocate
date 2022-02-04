package com.jaredrummler.android.colorpicker;

import android.content.Context;
import android.util.TypedValue;

/* renamed from: com.jaredrummler.android.colorpicker.e */
final class C3328e {
    /* renamed from: a */
    static int m13920a(Context context, float f) {
        float applyDimension = TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
        double d = (double) applyDimension;
        Double.isNaN(d);
        int i = (int) (d + 0.5d);
        if (i != 0 || applyDimension <= 0.0f) {
            return i;
        }
        return 1;
    }
}
