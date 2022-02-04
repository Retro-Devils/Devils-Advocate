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
    private int f11117a = 10;

    /* renamed from: b */
    private Paint f11118b = new Paint();

    /* renamed from: c */
    private Paint f11119c = new Paint();

    /* renamed from: d */
    private Paint f11120d = new Paint();

    /* renamed from: e */
    private int f11121e;

    /* renamed from: f */
    private int f11122f;

    /* renamed from: g */
    private Bitmap f11123g;

    C3310a(int i) {
        this.f11117a = i;
        this.f11119c.setColor(-1);
        this.f11120d.setColor(-3421237);
    }

    /* renamed from: a */
    private void m13888a() {
        if (getBounds().width() > 0 && getBounds().height() > 0) {
            this.f11123g = Bitmap.createBitmap(getBounds().width(), getBounds().height(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.f11123g);
            Rect rect = new Rect();
            boolean z = true;
            for (int i = 0; i <= this.f11122f; i++) {
                boolean z2 = z;
                for (int i2 = 0; i2 <= this.f11121e; i2++) {
                    int i3 = this.f11117a;
                    int i4 = i * i3;
                    rect.top = i4;
                    int i5 = i2 * i3;
                    rect.left = i5;
                    rect.bottom = i4 + i3;
                    rect.right = i5 + i3;
                    canvas.drawRect(rect, z2 ? this.f11119c : this.f11120d);
                    z2 = !z2;
                }
                z = !z;
            }
        }
    }

    public void draw(Canvas canvas) {
        Bitmap bitmap = this.f11123g;
        if (bitmap != null && !bitmap.isRecycled()) {
            canvas.drawBitmap(this.f11123g, (Rect) null, getBounds(), this.f11118b);
        }
    }

    public int getOpacity() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        int height = rect.height();
        this.f11121e = (int) Math.ceil((double) (rect.width() / this.f11117a));
        this.f11122f = (int) Math.ceil((double) (height / this.f11117a));
        m13888a();
    }

    public void setAlpha(int i) {
        throw new UnsupportedOperationException("Alpha is not supported by this drawable.");
    }

    public void setColorFilter(ColorFilter colorFilter) {
        throw new UnsupportedOperationException("ColorFilter is not supported by this drawable.");
    }
}
