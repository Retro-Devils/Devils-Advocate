package com.jaredrummler.android.colorpicker;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;

public class ColorPickerView extends View {

    /* renamed from: A */
    private int f11072A;

    /* renamed from: B */
    private Rect f11073B;

    /* renamed from: C */
    private Rect f11074C;

    /* renamed from: D */
    private Rect f11075D;

    /* renamed from: E */
    private Rect f11076E;

    /* renamed from: F */
    private Point f11077F;

    /* renamed from: G */
    private C3310a f11078G;

    /* renamed from: H */
    private AbstractC3309c f11079H;

    /* renamed from: b */
    private int f11080b;

    /* renamed from: c */
    private int f11081c;

    /* renamed from: d */
    private int f11082d;

    /* renamed from: e */
    private int f11083e;

    /* renamed from: f */
    private int f11084f;

    /* renamed from: g */
    private int f11085g;

    /* renamed from: h */
    private Paint f11086h;

    /* renamed from: i */
    private Paint f11087i;

    /* renamed from: j */
    private Paint f11088j;

    /* renamed from: k */
    private Paint f11089k;

    /* renamed from: l */
    private Paint f11090l;

    /* renamed from: m */
    private Paint f11091m;

    /* renamed from: n */
    private Shader f11092n;

    /* renamed from: o */
    private Shader f11093o;

    /* renamed from: p */
    private Shader f11094p;

    /* renamed from: q */
    private C3308b f11095q;

    /* renamed from: r */
    private C3308b f11096r;

    /* renamed from: s */
    private int f11097s;

    /* renamed from: t */
    private float f11098t;

    /* renamed from: u */
    private float f11099u;

    /* renamed from: v */
    private float f11100v;

    /* renamed from: w */
    private boolean f11101w;

    /* renamed from: x */
    private String f11102x;

    /* renamed from: y */
    private int f11103y;

    /* renamed from: z */
    private int f11104z;

    /* access modifiers changed from: private */
    /* renamed from: com.jaredrummler.android.colorpicker.ColorPickerView$b */
    public class C3308b {

        /* renamed from: a */
        public Canvas f11105a;

        /* renamed from: b */
        public Bitmap f11106b;

        /* renamed from: c */
        public float f11107c;

        private C3308b() {
        }
    }

    /* renamed from: com.jaredrummler.android.colorpicker.ColorPickerView$c */
    public interface AbstractC3309c {
        /* renamed from: a */
        void mo11236a(int i);
    }

    public ColorPickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ColorPickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11097s = 255;
        this.f11098t = 360.0f;
        this.f11099u = 0.0f;
        this.f11100v = 0.0f;
        this.f11101w = false;
        this.f11102x = null;
        this.f11103y = -4342339;
        this.f11104z = -9539986;
        this.f11077F = null;
        m13876g(context, attributeSet);
    }

    /* renamed from: a */
    private Point m13870a(int i) {
        Rect rect = this.f11076E;
        float width = (float) rect.width();
        Point point = new Point();
        point.x = (int) ((width - ((((float) i) * width) / 255.0f)) + ((float) rect.left));
        point.y = rect.top;
        return point;
    }

    /* renamed from: b */
    private void m13871b(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new TypedValue().data, new int[]{16842808});
        if (this.f11104z == -9539986) {
            this.f11104z = obtainStyledAttributes.getColor(0, -9539986);
        }
        if (this.f11103y == -4342339) {
            this.f11103y = obtainStyledAttributes.getColor(0, -4342339);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: c */
    private void m13872c(Canvas canvas) {
        Rect rect;
        if (this.f11101w && (rect = this.f11076E) != null && this.f11078G != null) {
            this.f11091m.setColor(this.f11104z);
            canvas.drawRect((float) (rect.left - 1), (float) (rect.top - 1), (float) (rect.right + 1), (float) (rect.bottom + 1), this.f11091m);
            this.f11078G.draw(canvas);
            float[] fArr = {this.f11098t, this.f11099u, this.f11100v};
            int HSVToColor = Color.HSVToColor(fArr);
            int HSVToColor2 = Color.HSVToColor(0, fArr);
            float f = (float) rect.left;
            int i = rect.top;
            LinearGradient linearGradient = new LinearGradient(f, (float) i, (float) rect.right, (float) i, HSVToColor, HSVToColor2, Shader.TileMode.CLAMP);
            this.f11094p = linearGradient;
            this.f11088j.setShader(linearGradient);
            canvas.drawRect(rect, this.f11088j);
            String str = this.f11102x;
            if (str != null && !str.equals("")) {
                canvas.drawText(this.f11102x, (float) rect.centerX(), (float) (rect.centerY() + C3328e.m13920a(getContext(), 4.0f)), this.f11089k);
            }
            Point a = m13870a(this.f11097s);
            RectF rectF = new RectF();
            int i2 = a.x;
            int i3 = this.f11085g;
            rectF.left = (float) (i2 - (i3 / 2));
            rectF.right = (float) (i2 + (i3 / 2));
            int i4 = rect.top;
            int i5 = this.f11084f;
            rectF.top = (float) (i4 - i5);
            rectF.bottom = (float) (rect.bottom + i5);
            canvas.drawRoundRect(rectF, 2.0f, 2.0f, this.f11090l);
        }
    }

    /* renamed from: d */
    private void m13873d(Canvas canvas) {
        Rect rect = this.f11075D;
        this.f11091m.setColor(this.f11104z);
        canvas.drawRect((float) (rect.left - 1), (float) (rect.top - 1), (float) (rect.right + 1), (float) (rect.bottom + 1), this.f11091m);
        if (this.f11096r == null) {
            C3308b bVar = new C3308b();
            this.f11096r = bVar;
            bVar.f11106b = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
            this.f11096r.f11105a = new Canvas(this.f11096r.f11106b);
            int height = (int) (((float) rect.height()) + 0.5f);
            int[] iArr = new int[height];
            float f = 360.0f;
            for (int i = 0; i < height; i++) {
                iArr[i] = Color.HSVToColor(new float[]{f, 1.0f, 1.0f});
                f -= 360.0f / ((float) height);
            }
            Paint paint = new Paint();
            paint.setStrokeWidth(0.0f);
            for (int i2 = 0; i2 < height; i2++) {
                paint.setColor(iArr[i2]);
                C3308b bVar2 = this.f11096r;
                float f2 = (float) i2;
                bVar2.f11105a.drawLine(0.0f, f2, (float) bVar2.f11106b.getWidth(), f2, paint);
            }
        }
        canvas.drawBitmap(this.f11096r.f11106b, (Rect) null, rect, (Paint) null);
        Point f3 = m13875f(this.f11098t);
        RectF rectF = new RectF();
        int i3 = rect.left;
        int i4 = this.f11084f;
        rectF.left = (float) (i3 - i4);
        rectF.right = (float) (rect.right + i4);
        int i5 = f3.y;
        int i6 = this.f11085g;
        rectF.top = (float) (i5 - (i6 / 2));
        rectF.bottom = (float) (i5 + (i6 / 2));
        canvas.drawRoundRect(rectF, 2.0f, 2.0f, this.f11090l);
    }

    /* renamed from: e */
    private void m13874e(Canvas canvas) {
        Rect rect = this.f11074C;
        this.f11091m.setColor(this.f11104z);
        Rect rect2 = this.f11073B;
        canvas.drawRect((float) rect2.left, (float) rect2.top, (float) (rect.right + 1), (float) (rect.bottom + 1), this.f11091m);
        if (this.f11092n == null) {
            int i = rect.left;
            this.f11092n = new LinearGradient((float) i, (float) rect.top, (float) i, (float) rect.bottom, -1, -16777216, Shader.TileMode.CLAMP);
        }
        C3308b bVar = this.f11095q;
        if (bVar == null || bVar.f11107c != this.f11098t) {
            if (bVar == null) {
                this.f11095q = new C3308b();
            }
            C3308b bVar2 = this.f11095q;
            if (bVar2.f11106b == null) {
                bVar2.f11106b = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
            }
            C3308b bVar3 = this.f11095q;
            if (bVar3.f11105a == null) {
                bVar3.f11105a = new Canvas(this.f11095q.f11106b);
            }
            int HSVToColor = Color.HSVToColor(new float[]{this.f11098t, 1.0f, 1.0f});
            float f = (float) rect.left;
            int i2 = rect.top;
            this.f11093o = new LinearGradient(f, (float) i2, (float) rect.right, (float) i2, -1, HSVToColor, Shader.TileMode.CLAMP);
            this.f11086h.setShader(new ComposeShader(this.f11092n, this.f11093o, PorterDuff.Mode.MULTIPLY));
            C3308b bVar4 = this.f11095q;
            bVar4.f11105a.drawRect(0.0f, 0.0f, (float) bVar4.f11106b.getWidth(), (float) this.f11095q.f11106b.getHeight(), this.f11086h);
            this.f11095q.f11107c = this.f11098t;
        }
        canvas.drawBitmap(this.f11095q.f11106b, (Rect) null, rect, (Paint) null);
        Point m = m13882m(this.f11099u, this.f11100v);
        this.f11087i.setColor(-16777216);
        canvas.drawCircle((float) m.x, (float) m.y, (float) (this.f11083e - C3328e.m13920a(getContext(), 1.0f)), this.f11087i);
        this.f11087i.setColor(-2236963);
        canvas.drawCircle((float) m.x, (float) m.y, (float) this.f11083e, this.f11087i);
    }

    /* renamed from: f */
    private Point m13875f(float f) {
        Rect rect = this.f11075D;
        float height = (float) rect.height();
        Point point = new Point();
        point.y = (int) ((height - ((f * height) / 360.0f)) + ((float) rect.top));
        point.x = rect.left;
        return point;
    }

    /* renamed from: g */
    private void m13876g(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C3334k.f11208q);
        this.f11101w = obtainStyledAttributes.getBoolean(C3334k.f11210s, false);
        this.f11102x = obtainStyledAttributes.getString(C3334k.f11209r);
        this.f11103y = obtainStyledAttributes.getColor(C3334k.f11212u, -4342339);
        this.f11104z = obtainStyledAttributes.getColor(C3334k.f11211t, -9539986);
        obtainStyledAttributes.recycle();
        m13871b(context);
        this.f11080b = C3328e.m13920a(getContext(), 30.0f);
        this.f11081c = C3328e.m13920a(getContext(), 20.0f);
        this.f11082d = C3328e.m13920a(getContext(), 10.0f);
        this.f11083e = C3328e.m13920a(getContext(), 5.0f);
        this.f11085g = C3328e.m13920a(getContext(), 4.0f);
        this.f11084f = C3328e.m13920a(getContext(), 2.0f);
        this.f11072A = getResources().getDimensionPixelSize(C3329f.cpv_required_padding);
        m13877h();
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    private int getPreferredHeight() {
        int a = C3328e.m13920a(getContext(), 200.0f);
        return this.f11101w ? a + this.f11082d + this.f11081c : a;
    }

    private int getPreferredWidth() {
        return C3328e.m13920a(getContext(), 200.0f) + this.f11080b + this.f11082d;
    }

    /* renamed from: h */
    private void m13877h() {
        this.f11086h = new Paint();
        this.f11087i = new Paint();
        this.f11090l = new Paint();
        this.f11088j = new Paint();
        this.f11089k = new Paint();
        this.f11091m = new Paint();
        this.f11087i.setStyle(Paint.Style.STROKE);
        this.f11087i.setStrokeWidth((float) C3328e.m13920a(getContext(), 2.0f));
        this.f11087i.setAntiAlias(true);
        this.f11090l.setColor(this.f11103y);
        this.f11090l.setStyle(Paint.Style.STROKE);
        this.f11090l.setStrokeWidth((float) C3328e.m13920a(getContext(), 2.0f));
        this.f11090l.setAntiAlias(true);
        this.f11089k.setColor(-14935012);
        this.f11089k.setTextSize((float) C3328e.m13920a(getContext(), 14.0f));
        this.f11089k.setAntiAlias(true);
        this.f11089k.setTextAlign(Paint.Align.CENTER);
        this.f11089k.setFakeBoldText(true);
    }

    /* renamed from: i */
    private boolean m13878i(MotionEvent motionEvent) {
        Point point = this.f11077F;
        if (point == null) {
            return false;
        }
        int i = point.x;
        int i2 = point.y;
        if (this.f11075D.contains(i, i2)) {
            this.f11098t = m13880k(motionEvent.getY());
        } else if (this.f11074C.contains(i, i2)) {
            float[] l = m13881l(motionEvent.getX(), motionEvent.getY());
            this.f11099u = l[0];
            this.f11100v = l[1];
        } else {
            Rect rect = this.f11076E;
            if (rect == null || !rect.contains(i, i2)) {
                return false;
            }
            this.f11097s = m13879j((int) motionEvent.getX());
        }
        return true;
    }

    /* renamed from: j */
    private int m13879j(int i) {
        Rect rect = this.f11076E;
        int width = rect.width();
        int i2 = rect.left;
        return 255 - (((i < i2 ? 0 : i > rect.right ? width : i - i2) * 255) / width);
    }

    /* renamed from: k */
    private float m13880k(float f) {
        Rect rect = this.f11075D;
        float height = (float) rect.height();
        int i = rect.top;
        return 360.0f - (((f < ((float) i) ? 0.0f : f > ((float) rect.bottom) ? height : f - ((float) i)) * 360.0f) / height);
    }

    /* renamed from: l */
    private float[] m13881l(float f, float f2) {
        Rect rect = this.f11074C;
        float[] fArr = new float[2];
        float width = (float) rect.width();
        float height = (float) rect.height();
        int i = rect.left;
        float f3 = 0.0f;
        float f4 = f < ((float) i) ? 0.0f : f > ((float) rect.right) ? width : f - ((float) i);
        int i2 = rect.top;
        if (f2 >= ((float) i2)) {
            f3 = f2 > ((float) rect.bottom) ? height : f2 - ((float) i2);
        }
        fArr[0] = (1.0f / width) * f4;
        fArr[1] = 1.0f - ((1.0f / height) * f3);
        return fArr;
    }

    /* renamed from: m */
    private Point m13882m(float f, float f2) {
        Rect rect = this.f11074C;
        Point point = new Point();
        point.x = (int) ((f * ((float) rect.width())) + ((float) rect.left));
        point.y = (int) (((1.0f - f2) * ((float) rect.height())) + ((float) rect.top));
        return point;
    }

    /* renamed from: o */
    private void m13883o() {
        if (this.f11101w) {
            Rect rect = this.f11073B;
            int i = rect.bottom;
            this.f11076E = new Rect(rect.left + 1, (i - this.f11081c) + 1, rect.right - 1, i - 1);
            C3310a aVar = new C3310a(C3328e.m13920a(getContext(), 4.0f));
            this.f11078G = aVar;
            aVar.setBounds(Math.round((float) this.f11076E.left), Math.round((float) this.f11076E.top), Math.round((float) this.f11076E.right), Math.round((float) this.f11076E.bottom));
        }
    }

    /* renamed from: p */
    private void m13884p() {
        Rect rect = this.f11073B;
        int i = rect.right;
        this.f11075D = new Rect((i - this.f11080b) + 1, rect.top + 1, i - 1, (rect.bottom - 1) - (this.f11101w ? this.f11082d + this.f11081c : 0));
    }

    /* renamed from: q */
    private void m13885q() {
        Rect rect = this.f11073B;
        int i = rect.left + 1;
        int i2 = rect.top + 1;
        int i3 = rect.bottom - 1;
        int i4 = this.f11082d;
        int i5 = ((rect.right - 1) - i4) - this.f11080b;
        if (this.f11101w) {
            i3 -= this.f11081c + i4;
        }
        this.f11074C = new Rect(i, i2, i5, i3);
    }

    public String getAlphaSliderText() {
        return this.f11102x;
    }

    public int getBorderColor() {
        return this.f11104z;
    }

    public int getColor() {
        return Color.HSVToColor(this.f11097s, new float[]{this.f11098t, this.f11099u, this.f11100v});
    }

    public int getPaddingBottom() {
        return Math.max(super.getPaddingBottom(), this.f11072A);
    }

    public int getPaddingLeft() {
        return Math.max(super.getPaddingLeft(), this.f11072A);
    }

    public int getPaddingRight() {
        return Math.max(super.getPaddingRight(), this.f11072A);
    }

    public int getPaddingTop() {
        return Math.max(super.getPaddingTop(), this.f11072A);
    }

    public int getSliderTrackerColor() {
        return this.f11103y;
    }

    /* renamed from: n */
    public void mo11222n(int i, boolean z) {
        AbstractC3309c cVar;
        int alpha = Color.alpha(i);
        float[] fArr = new float[3];
        Color.RGBToHSV(Color.red(i), Color.green(i), Color.blue(i), fArr);
        this.f11097s = alpha;
        float f = fArr[0];
        this.f11098t = f;
        float f2 = fArr[1];
        this.f11099u = f2;
        float f3 = fArr[2];
        this.f11100v = f3;
        if (z && (cVar = this.f11079H) != null) {
            cVar.mo11236a(Color.HSVToColor(alpha, new float[]{f, f2, f3}));
        }
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f11073B.width() > 0 && this.f11073B.height() > 0) {
            m13874e(canvas);
            m13873d(canvas);
            m13872c(canvas);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0058, code lost:
        if (r0 != false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0087, code lost:
        if (r1 > r6) goto L_0x0089;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r6, int r7) {
        /*
        // Method dump skipped, instructions count: 161
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jaredrummler.android.colorpicker.ColorPickerView.onMeasure(int, int):void");
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f11097s = bundle.getInt("alpha");
            this.f11098t = bundle.getFloat("hue");
            this.f11099u = bundle.getFloat("sat");
            this.f11100v = bundle.getFloat("val");
            this.f11101w = bundle.getBoolean("show_alpha");
            this.f11102x = bundle.getString("alpha_text");
            parcelable = bundle.getParcelable("instanceState");
        }
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt("alpha", this.f11097s);
        bundle.putFloat("hue", this.f11098t);
        bundle.putFloat("sat", this.f11099u);
        bundle.putFloat("val", this.f11100v);
        bundle.putBoolean("show_alpha", this.f11101w);
        bundle.putString("alpha_text", this.f11102x);
        return bundle;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Rect rect = new Rect();
        this.f11073B = rect;
        rect.left = getPaddingLeft();
        this.f11073B.right = i - getPaddingRight();
        this.f11073B.top = getPaddingTop();
        this.f11073B.bottom = i2 - getPaddingBottom();
        this.f11092n = null;
        this.f11093o = null;
        this.f11094p = null;
        this.f11095q = null;
        this.f11096r = null;
        m13885q();
        m13884p();
        m13883o();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getAction()
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0011
            if (r0 == r3) goto L_0x000f
            if (r0 == r1) goto L_0x0022
            r0 = 0
            goto L_0x0026
        L_0x000f:
            r0 = 0
            goto L_0x0020
        L_0x0011:
            android.graphics.Point r0 = new android.graphics.Point
            float r4 = r7.getX()
            int r4 = (int) r4
            float r5 = r7.getY()
            int r5 = (int) r5
            r0.<init>(r4, r5)
        L_0x0020:
            r6.f11077F = r0
        L_0x0022:
            boolean r0 = r6.m13878i(r7)
        L_0x0026:
            if (r0 == 0) goto L_0x0048
            com.jaredrummler.android.colorpicker.ColorPickerView$c r7 = r6.f11079H
            if (r7 == 0) goto L_0x0044
            int r0 = r6.f11097s
            r4 = 3
            float[] r4 = new float[r4]
            float r5 = r6.f11098t
            r4[r2] = r5
            float r2 = r6.f11099u
            r4[r3] = r2
            float r2 = r6.f11100v
            r4[r1] = r2
            int r0 = android.graphics.Color.HSVToColor(r0, r4)
            r7.mo11236a(r0)
        L_0x0044:
            r6.invalidate()
            return r3
        L_0x0048:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jaredrummler.android.colorpicker.ColorPickerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAlphaSliderText(int i) {
        setAlphaSliderText(getContext().getString(i));
    }

    public void setAlphaSliderText(String str) {
        this.f11102x = str;
        invalidate();
    }

    public void setAlphaSliderVisible(boolean z) {
        if (this.f11101w != z) {
            this.f11101w = z;
            this.f11092n = null;
            this.f11093o = null;
            this.f11094p = null;
            this.f11096r = null;
            this.f11095q = null;
            requestLayout();
        }
    }

    public void setBorderColor(int i) {
        this.f11104z = i;
        invalidate();
    }

    public void setColor(int i) {
        mo11222n(i, false);
    }

    public void setOnColorChangedListener(AbstractC3309c cVar) {
        this.f11079H = cVar;
    }

    public void setSliderTrackerColor(int i) {
        this.f11103y = i;
        this.f11090l.setColor(i);
        invalidate();
    }
}
