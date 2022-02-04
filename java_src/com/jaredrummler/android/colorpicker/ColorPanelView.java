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
    private Drawable f11059b;

    /* renamed from: c */
    private Paint f11060c;

    /* renamed from: d */
    private Paint f11061d;

    /* renamed from: e */
    private Paint f11062e;

    /* renamed from: f */
    private Paint f11063f;

    /* renamed from: g */
    private Rect f11064g;

    /* renamed from: h */
    private Rect f11065h;

    /* renamed from: i */
    private RectF f11066i;

    /* renamed from: j */
    private boolean f11067j;

    /* renamed from: k */
    private int f11068k;

    /* renamed from: l */
    private int f11069l;

    /* renamed from: m */
    private int f11070m;

    /* renamed from: n */
    private int f11071n;

    public ColorPanelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ColorPanelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11066i = new RectF();
        this.f11069l = -9539986;
        this.f11070m = -16777216;
        m13866a(context, attributeSet);
    }

    /* renamed from: a */
    private void m13866a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C3334k.f11204m);
        this.f11071n = obtainStyledAttributes.getInt(C3334k.f11206o, 1);
        boolean z = obtainStyledAttributes.getBoolean(C3334k.f11207p, false);
        this.f11067j = z;
        if (!z || this.f11071n == 1) {
            this.f11069l = obtainStyledAttributes.getColor(C3334k.f11205n, -9539986);
            obtainStyledAttributes.recycle();
            if (this.f11069l == -9539986) {
                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(new TypedValue().data, new int[]{16842808});
                this.f11069l = obtainStyledAttributes2.getColor(0, this.f11069l);
                obtainStyledAttributes2.recycle();
            }
            this.f11068k = C3328e.m13920a(context, 1.0f);
            Paint paint = new Paint();
            this.f11060c = paint;
            paint.setAntiAlias(true);
            Paint paint2 = new Paint();
            this.f11061d = paint2;
            paint2.setAntiAlias(true);
            if (this.f11067j) {
                this.f11063f = new Paint();
            }
            if (this.f11071n == 1) {
                Bitmap bitmap = ((BitmapDrawable) context.getResources().getDrawable(C3330g.APKTOOL_DUMMY_7e)).getBitmap();
                Paint paint3 = new Paint();
                this.f11062e = paint3;
                paint3.setAntiAlias(true);
                Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                this.f11062e.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                return;
            }
            return;
        }
        throw new IllegalStateException("Color preview is only available in circle mode");
    }

    /* renamed from: b */
    private void m13867b() {
        Rect rect = this.f11064g;
        int i = rect.left;
        int i2 = this.f11068k;
        this.f11066i = new RectF((float) (i + i2), (float) (rect.top + i2), (float) (rect.right - i2), (float) (rect.bottom - i2));
    }

    /* renamed from: c */
    private void m13868c() {
        Rect rect = this.f11064g;
        int i = rect.left;
        int i2 = this.f11068k;
        this.f11065h = new Rect(i + i2, rect.top + i2, rect.right - i2, rect.bottom - i2);
        C3310a aVar = new C3310a(C3328e.m13920a(getContext(), 4.0f));
        this.f11059b = aVar;
        aVar.setBounds(Math.round((float) this.f11065h.left), Math.round((float) this.f11065h.top), Math.round((float) this.f11065h.right), Math.round((float) this.f11065h.bottom));
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
        if (Color.alpha(this.f11070m) != 255) {
            str = Integer.toHexString(this.f11070m);
        } else {
            str = String.format("%06X", Integer.valueOf(16777215 & this.f11070m));
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
        return this.f11069l;
    }

    public int getColor() {
        return this.f11070m;
    }

    public int getShape() {
        return this.f11071n;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        this.f11060c.setColor(this.f11069l);
        this.f11061d.setColor(this.f11070m);
        int i = this.f11071n;
        if (i == 0) {
            if (this.f11068k > 0) {
                canvas.drawRect(this.f11064g, this.f11060c);
            }
            Drawable drawable = this.f11059b;
            if (drawable != null) {
                drawable.draw(canvas);
            }
            canvas.drawRect(this.f11065h, this.f11061d);
        } else if (i == 1) {
            int measuredWidth = getMeasuredWidth() / 2;
            if (this.f11068k > 0) {
                canvas.drawCircle((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2), (float) measuredWidth, this.f11060c);
            }
            if (Color.alpha(this.f11070m) < 255) {
                canvas.drawCircle((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2), (float) (measuredWidth - this.f11068k), this.f11062e);
            }
            if (this.f11067j) {
                canvas.drawArc(this.f11066i, 90.0f, 180.0f, true, this.f11063f);
                canvas.drawArc(this.f11066i, 270.0f, 180.0f, true, this.f11061d);
                return;
            }
            canvas.drawCircle((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2), (float) (measuredWidth - this.f11068k), this.f11061d);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int measuredWidth;
        int measuredWidth2;
        int i3 = this.f11071n;
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
            this.f11070m = bundle.getInt("color");
            parcelable = bundle.getParcelable("instanceState");
        }
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt("color", this.f11070m);
        return bundle;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f11071n == 0 || this.f11067j) {
            Rect rect = new Rect();
            this.f11064g = rect;
            rect.left = getPaddingLeft();
            this.f11064g.right = i - getPaddingRight();
            this.f11064g.top = getPaddingTop();
            this.f11064g.bottom = i2 - getPaddingBottom();
            if (this.f11067j) {
                m13867b();
            } else {
                m13868c();
            }
        }
    }

    public void setBorderColor(int i) {
        this.f11069l = i;
        invalidate();
    }

    public void setColor(int i) {
        this.f11070m = i;
        invalidate();
    }

    public void setOriginalColor(int i) {
        Paint paint = this.f11063f;
        if (paint != null) {
            paint.setColor(i);
        }
    }

    public void setShape(int i) {
        this.f11071n = i;
        invalidate();
    }
}
