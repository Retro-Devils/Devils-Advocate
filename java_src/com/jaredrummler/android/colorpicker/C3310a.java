package com.jaredrummler.android.colorpicker;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: com.jaredrummler.android.colorpicker.a */
class C3310a extends Drawable {

    /* renamed from: a */
    private int f11109a = 10;

    /* renamed from: b */
    private Paint f11110b = new Paint();

    /* renamed from: c */
    private Paint f11111c = new Paint();

    /* renamed from: d */
    private Paint f11112d = new Paint();

    /* renamed from: e */
    private int f11113e;

    /* renamed from: f */
    private int f11114f;

    /* renamed from: g */
    private Bitmap f11115g;

    C3310a(int i) {
        this.f11109a = i;
        this.f11111c.setColor(-1);
        this.f11112d.setColor(-3421237);
    }

    /* renamed from: a */
    private void m13888a() {
        if (getBounds().width() > 0 && getBounds().height() > 0) {
            this.f11115g = Bitmap.createBitmap(getBounds().width(), getBounds().height(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.f11115g);
            Rect rect = new Rect();
            boolean z = true;
            for (int i = 0; i <= this.f11114f; i++) {
                boolean z2 = z;
                for (int i2 = 0; i2 <= this.f11113e; i2++) {
                    int i3 = this.f11109a;
                    int i4 = i * i3;
                    rect.top = i4;
                    int i5 = i2 * i3;
                    rect.left = i5;
                    rect.bottom = i4 + i3;
                    rect.right = i5 + i3;
                    canvas.drawRect(rect, z2 ? this.f11111c : this.f11112d);
                    z2 = !z2;
                }
                z = !z;
            }
        }
    }

    public void draw(Canvas canvas) {
        Bitmap bitmap = this.f11115g;
        if (bitmap != null && !bitmap.isRecycled()) {
            canvas.drawBitmap(this.f11115g, (Rect) null, getBounds(), this.f11110b);
        }
    }

    public int getOpacity() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        int height = rect.height();
        this.f11113e = (int) Math.ceil((double) (rect.width() / this.f11109a));
        this.f11114f = (int) Math.ceil((double) (height / this.f11109a));
        m13888a();
    }

    public void setAlpha(int i) {
        throw new UnsupportedOperationException("Alpha is not supported by this drawable.");
    }

    public void setColorFilter(ColorFilter colorFilter) {
        throw new UnsupportedOperationException("ColorFilter is not supported by this drawable.");
    }
}
