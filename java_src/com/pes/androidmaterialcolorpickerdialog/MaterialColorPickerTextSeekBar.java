package com.pes.androidmaterialcolorpickerdialog;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.C0278t;

class MaterialColorPickerTextSeekBar extends C0278t {

    /* renamed from: c */
    private Paint f11227c;

    /* renamed from: d */
    private Rect f11228d;

    /* renamed from: e */
    private int f11229e;

    /* renamed from: f */
    private float f11230f;

    /* renamed from: g */
    private String f11231g;

    public MaterialColorPickerTextSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m13921a(attributeSet);
    }

    /* renamed from: a */
    private void m13921a(AttributeSet attributeSet) {
        this.f11227c = new Paint(65);
        this.f11228d = new Rect();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C3343g.f11276s);
            try {
                this.f11229e = obtainStyledAttributes.getColor(C3343g.f11278u, -16777216);
                this.f11230f = obtainStyledAttributes.getDimension(C3343g.f11277t, TypedValue.applyDimension(2, 18.0f, getResources().getDisplayMetrics()));
                this.f11231g = obtainStyledAttributes.getString(C3343g.f11279v);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f11227c.setColor(this.f11229e);
        this.f11227c.setTypeface(Typeface.DEFAULT_BOLD);
        this.f11227c.setTextSize(this.f11230f);
        this.f11227c.setTextAlign(Paint.Align.CENTER);
        this.f11227c.getTextBounds("255", 0, 3, this.f11228d);
        int paddingLeft = getPaddingLeft();
        double height = (double) this.f11228d.height();
        Double.isNaN(height);
        setPadding(paddingLeft, (int) TypedValue.applyDimension(1, (float) (height * 0.6d), getResources().getDisplayMetrics()), getPaddingRight(), getPaddingBottom());
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C0278t
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        String str = this.f11231g;
        if (str == null) {
            str = String.valueOf(getProgress());
        }
        canvas.drawText(str, (float) (getThumb().getBounds().left + getPaddingLeft()), (float) (this.f11228d.height() + (getPaddingTop() >> 2)), this.f11227c);
    }
}
