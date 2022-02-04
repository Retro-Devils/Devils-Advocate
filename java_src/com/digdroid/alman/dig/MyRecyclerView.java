package com.digdroid.alman.dig;

import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;

class MyRecyclerView extends RecyclerView {

    /* renamed from: I0 */
    int f7663I0 = 0;

    public MyRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: A1 */
    public void mo7948A1(Point point) {
        this.f7663I0 = Math.min(point.x, point.y);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    /* renamed from: a0 */
    public boolean mo3814a0(int i, int i2) {
        if (this.f7663I0 > 0 && ((float) Math.abs(i2)) / ((float) this.f7663I0) > 2.0f) {
            i2 *= 10;
        }
        return super.mo3814a0(i, i2);
    }
}
