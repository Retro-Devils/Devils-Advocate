package com.digdroid.alman.dig;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.C0302y;

final class LetterBox extends C0302y {

    /* renamed from: f */
    private float f7641f = 1.0f;

    public LetterBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: f */
    public void mo7915f(float f) {
        this.f7641f = f;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C0302y
    public void onMeasure(int i, int i2) {
        float f;
        int size = View.MeasureSpec.getSize(i);
        float f2 = (float) size;
        setMeasuredDimension(size, Math.round(f2 / this.f7641f));
        boolean[] zArr = (boolean[]) getTag();
        boolean z = zArr[0];
        boolean z2 = zArr[1];
        boolean z3 = zArr[2];
        if (!z) {
            if (!z3) {
                f = 0.9f;
            } else if (!z2) {
                f = 1.065f;
            }
            f2 *= f;
        } else if (!z2) {
            setPadding(0, Math.round(f2 / 9.0f), 0, 0);
        }
        setTextSize(0, f2);
        if (z2) {
            setGravity(53);
        }
    }
}
