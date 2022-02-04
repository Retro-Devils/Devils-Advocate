package com.digdroid.alman.dig;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.digdroid.alman.dig.k2 */
class C2453k2 extends RecyclerView.AbstractC0668n {

    /* renamed from: a */
    float f8560a;

    /* renamed from: b */
    float f8561b;

    /* renamed from: c */
    int f8562c = 0;

    /* renamed from: d */
    int f8563d = 0;

    /* renamed from: e */
    int f8564e = 0;

    /* renamed from: f */
    int f8565f = 0;

    /* renamed from: g */
    int f8566g = 0;

    /* renamed from: h */
    int[] f8567h;

    public C2453k2(float f, float f2, int[] iArr) {
        this.f8560a = f - 1.0f;
        this.f8561b = f2;
        this.f8567h = iArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0668n
    /* renamed from: e */
    public void mo4070e(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0649a0 a0Var) {
        super.mo4070e(rect, view, recyclerView, a0Var);
        if (this.f8562c == 0) {
            this.f8564e = Math.round(((((float) ((AbstractC2365h) recyclerView.getAdapter()).f8291f) * this.f8561b) / 10.0f) / 2.0f);
            mo8704j(view, recyclerView);
            this.f8562c = view.findViewById(this.f8567h[0]).getWidth();
            this.f8563d = this.f8564e * 2;
            int i = 1;
            while (true) {
                int[] iArr = this.f8567h;
                if (i >= iArr.length) {
                    break;
                }
                this.f8563d += view.findViewById(iArr[i]).getHeight();
                i++;
            }
            this.f8565f = ((int) (((float) (recyclerView.getWidth() - this.f8562c)) / 2.0f)) + Math.round((this.f8560a * ((float) recyclerView.getWidth())) / 2.0f);
            this.f8566g = recyclerView.getHeight();
        }
        rect.left = this.f8565f;
        int d0 = recyclerView.mo3828d0(view);
        if (d0 == 0) {
            rect.top = (this.f8566g - this.f8563d) / 2;
        } else if (d0 == a0Var.mo3945c() - 1) {
            rect.bottom = (this.f8566g - this.f8563d) / 2;
        }
        int i2 = rect.top;
        int i3 = this.f8564e;
        rect.top = i2 + i3;
        rect.bottom += i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo8704j(View view, ViewGroup viewGroup) {
        if (view.getLayoutParams() == null) {
            view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        }
        view.measure(ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(viewGroup.getWidth(), 1073741824), viewGroup.getPaddingLeft() + viewGroup.getPaddingRight(), view.getLayoutParams().width), ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(viewGroup.getHeight(), 0), viewGroup.getPaddingTop() + viewGroup.getPaddingBottom(), view.getLayoutParams().height));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    /* renamed from: k */
    public void mo8705k(float f, float f2) {
        this.f8560a = f - 1.0f;
        this.f8561b = f2;
        this.f8562c = 0;
    }
}
