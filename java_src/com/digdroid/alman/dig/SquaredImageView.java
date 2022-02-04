package com.digdroid.alman.dig;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.C0263o;

final class SquaredImageView extends C0263o {

    /* renamed from: d */
    float f7756d = 1.0f;

    public SquaredImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: c */
    public void mo7992c(float f) {
        this.f7756d = f;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        setMeasuredDimension(size, Math.round(((float) size) / this.f7756d));
    }
}
