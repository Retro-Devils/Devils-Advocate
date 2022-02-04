package com.jaredrummler.android.colorpicker;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.Toast;
import java.util.Locale;
import p006b.p030g.p039k.C1013s;

public class ColorPanelView extends View {

    /* renamed from: b */
    private Drawable f11067b;

    /* renamed from: c */
    private Paint f11068c;

    /* renamed from: d */
    private Paint f11069d;

    /* renamed from: e */
    private Paint f11070e;

    /* renamed from: f */
    private Paint f11071f;

    /* renamed from: g */
    private Rect f11072g;

    /* renamed from: h */
    private Rect f11073h;

    /* renamed from: i */
    private RectF f11074i;

    /* renamed from: j */
    private boolean f11075j;

    /* renamed from: k */
    private int f11076k;

    /* renamed from: l */
    private int f11077l;

    /* renamed from: m */
    private int f11078m;

    /* renamed from: n */
    private int f11079n;

    public ColorPanelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ColorPanelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11074i = new RectF();
        this.f11077l = -9539986;
        this.f11078m = -16777216;
        m13866a(context, attributeSet);
    }

    /* renamed from: a */
    private void m13866a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C3334k.f11213m);
        this.f11079n = obtainStyledAttributes.getInt(C3334k.f11215o, 1);
        boolean z = obtainStyledAttributes.getBoolean(C3334k.f11216p, false);
        this.f11075j = z;
        if (!z || this.f11079n == 1) {
            this.f11077l = obtainStyledAttributes.getColor(C3334k.f11214n, -9539986);
            obtainStyledAttributes.recycle();
            if (this.f11077l == -9539986) {
                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(new TypedValue().data, new int[]{16842808});
                this.f11077l = obtainStyledAttributes2.getColor(0, this.f11077l);
                obtainStyledAttributes2.recycle();
            }
            this.f11076k = C3328e.m13920a(context, 1.0f);
            Paint paint = new Paint();
            this.f11068c = paint;
            paint.setAntiAlias(true);
            Paint paint2 = new Paint();
            this.f11069d = paint2;
            paint2.setAntiAlias(true);
            if (this.f11075j) {
                this.f11071f = new Paint();
            }
            if (this.f11079n == 1) {
                Bitmap bitmap = ((BitmapDrawable) context.getResources().getDrawable(C3330g.f11182a)).getBitmap();
                Paint paint3 = new Paint();
                this.f11070e = paint3;
                paint3.setAntiAlias(true);
                Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                this.f11070e.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                return;
            }
            return;
        }
        throw new IllegalStateException("Color preview is only available in circle mode");
    }

    /* renamed from: b */
    private void m13867b() {
        Rect rect = this.f11072g;
        int i = rect.left;
        int i2 = this.f11076k;
        this.f11074i = new RectF((float) (i + i2), (float) (rect.top + i2), (float) (rect.right - i2), (float) (rect.bottom - i2));
    }

    /* renamed from: c */
    private void m13868c() {
        Rect rect = this.f11072g;
        int i = rect.left;
        int i2 = this.f11076k;
        this.f11073h = new Rect(i + i2, rect.top + i2, rect.right - i2, rect.bottom - i2);
        C3310a aVar = new C3310a(C3328e.m13920a(getContext(), 4.0f));
        this.f11067b = aVar;
        aVar.setBounds(Math.round((float) this.f11073h.left), Math.round((float) this.f11073h.top), Math.round((float) this.f11073h.right), Math.round((float) this.f11073h.bottom));
    }

    /* renamed from: d */
    public void mo11201d() {
        String str;
        int[] iArr = new int[2];
        Rect rect = new Rect();
        getLocationOnScreen(iArr);
        getWindowVisibleDisplayFrame(rect);
        Context context = getContext();
        int width = getWidth();
        int height = getHeight();
        int i = iArr[1] + (height / 2);
        int i2 = iArr[0] + (width / 2);
        if (C1013s.m5797y(this) == 0) {
            i2 = context.getResources().getDisplayMetrics().widthPixels - i2;
        }
        StringBuilder sb = new StringBuilder("#");
        if (Color.alpha(this.f11078m) != 255) {
            str = Integer.toHexString(this.f11078m);
        } else {
            str = String.format("%06X", Integer.valueOf(16777215 & this.f11078m));
        }
        sb.append(str.toUpperCase(Locale.ENGLISH));
        Toast makeText = Toast.makeText(context, sb.toString(), 0);
        if (i < rect.height()) {
            makeText.setGravity(8388661, i2, (iArr[1] + height) - rect.top);
        } else {
            makeText.setGravity(81, 0, height);
        }
        makeText.show();
    }

    public int getBorderColor() {
        return this.f11077l;
    }

    public int getColor() {
        return this.f11078m;
    }

    public int getShape() {
        return this.f11079n;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        this.f11068c.setColor(this.f11077l);
        this.f11069d.setColor(this.f11078m);
        int i = this.f11079n;
        if (i == 0) {
            if (this.f11076k > 0) {
                canvas.drawRect(this.f11072g, this.f11068c);
            }
            Drawable drawable = this.f11067b;
            if (drawable != null) {
                drawable.draw(canvas);
            }
            canvas.drawRect(this.f11073h, this.f11069d);
        } else if (i == 1) {
            int measuredWidth = getMeasuredWidth() / 2;
            if (this.f11076k > 0) {
                canvas.drawCircle((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2), (float) measuredWidth, this.f11068c);
            }
            if (Color.alpha(this.f11078m) < 255) {
                canvas.drawCircle((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2), (float) (measuredWidth - this.f11076k), this.f11070e);
            }
            if (this.f11075j) {
                canvas.drawArc(this.f11074i, 90.0f, 180.0f, true, this.f11071f);
                canvas.drawArc(this.f11074i, 270.0f, 180.0f, true, this.f11069d);
                return;
            }
            canvas.drawCircle((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2), (float) (measuredWidth - this.f11076k), this.f11069d);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int measuredWidth;
        int measuredWidth2;
        int i3 = this.f11079n;
        if (i3 == 0) {
            measuredWidth = View.MeasureSpec.getSize(i);
            measuredWidth2 = View.MeasureSpec.getSize(i2);
        } else if (i3 == 1) {
            super.onMeasure(i, i);
            measuredWidth = getMeasuredWidth();
            measuredWidth2 = getMeasuredWidth();
        } else {
            super.onMeasure(i, i2);
            return;
        }
        setMeasuredDimension(measuredWidth, measuredWidth2);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f11078m = bundle.getInt("color");
            parcelable = bundle.getParcelable("instanceState");
        }
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt("color", this.f11078m);
        return bundle;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f11079n == 0 || this.f11075j) {
            Rect rect = new Rect();
            this.f11072g = rect;
            rect.left = getPaddingLeft();
            this.f11072g.right = i - getPaddingRight();
            this.f11072g.top = getPaddingTop();
            this.f11072g.bottom = i2 - getPaddingBottom();
            if (this.f11075j) {
                m13867b();
            } else {
                m13868c();
            }
        }
    }

    public void setBorderColor(int i) {
        this.f11077l = i;
        invalidate();
    }

    public void setColor(int i) {
        this.f11078m = i;
        invalidate();
    }

    public void setOriginalColor(int i) {
        Paint paint = this.f11071f;
        if (paint != null) {
            paint.setColor(i);
        }
    }

    public void setShape(int i) {
        this.f11079n = i;
        invalidate();
    }
}
