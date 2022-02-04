package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import p006b.p053m.C1071c;

public final class SeekBar extends View {

    /* renamed from: b */
    private final RectF f2758b = new RectF();

    /* renamed from: c */
    private final RectF f2759c = new RectF();

    /* renamed from: d */
    private final RectF f2760d = new RectF();

    /* renamed from: e */
    private final Paint f2761e;

    /* renamed from: f */
    private final Paint f2762f;

    /* renamed from: g */
    private final Paint f2763g;

    /* renamed from: h */
    private final Paint f2764h;

    /* renamed from: i */
    private int f2765i;

    /* renamed from: j */
    private int f2766j;

    /* renamed from: k */
    private int f2767k;

    /* renamed from: l */
    private int f2768l;

    /* renamed from: m */
    private int f2769m;

    /* renamed from: n */
    private int f2770n;

    /* renamed from: o */
    private int f2771o;

    /* renamed from: p */
    private AbstractC0546a f2772p;

    /* renamed from: androidx.leanback.widget.SeekBar$a */
    public static abstract class AbstractC0546a {
    }

    public SeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint(1);
        this.f2761e = paint;
        Paint paint2 = new Paint(1);
        this.f2762f = paint2;
        Paint paint3 = new Paint(1);
        this.f2763g = paint3;
        Paint paint4 = new Paint(1);
        this.f2764h = paint4;
        setWillNotDraw(false);
        paint3.setColor(-7829368);
        paint.setColor(-3355444);
        paint2.setColor(-65536);
        paint4.setColor(-1);
        this.f2770n = context.getResources().getDimensionPixelSize(C1071c.lb_playback_transport_progressbar_bar_height);
        this.f2771o = context.getResources().getDimensionPixelSize(C1071c.lb_playback_transport_progressbar_active_bar_height);
        this.f2769m = context.getResources().getDimensionPixelSize(C1071c.lb_playback_transport_progressbar_active_radius);
    }

    /* renamed from: a */
    private void m2780a() {
        int i = isFocused() ? this.f2771o : this.f2770n;
        int width = getWidth();
        int height = getHeight();
        int i2 = (height - i) / 2;
        RectF rectF = this.f2760d;
        int i3 = this.f2770n;
        float f = (float) i2;
        float f2 = (float) (height - i2);
        rectF.set((float) (i3 / 2), f, (float) (width - (i3 / 2)), f2);
        int i4 = isFocused() ? this.f2769m : this.f2770n / 2;
        float f3 = (float) (width - (i4 * 2));
        float f4 = (((float) this.f2765i) / ((float) this.f2767k)) * f3;
        RectF rectF2 = this.f2758b;
        int i5 = this.f2770n;
        rectF2.set((float) (i5 / 2), f, ((float) (i5 / 2)) + f4, f2);
        this.f2759c.set(this.f2758b.right, f, ((float) (this.f2770n / 2)) + ((((float) this.f2766j) / ((float) this.f2767k)) * f3), f2);
        this.f2768l = i4 + ((int) f4);
        invalidate();
    }

    public CharSequence getAccessibilityClassName() {
        return android.widget.SeekBar.class.getName();
    }

    public int getMax() {
        return this.f2767k;
    }

    public int getProgress() {
        return this.f2765i;
    }

    public int getSecondProgress() {
        return this.f2766j;
    }

    public int getSecondaryProgressColor() {
        return this.f2761e.getColor();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = (float) (isFocused() ? this.f2769m : this.f2770n / 2);
        canvas.drawRoundRect(this.f2760d, f, f, this.f2763g);
        RectF rectF = this.f2759c;
        if (rectF.right > rectF.left) {
            canvas.drawRoundRect(rectF, f, f, this.f2761e);
        }
        canvas.drawRoundRect(this.f2758b, f, f, this.f2762f);
        canvas.drawCircle((float) this.f2768l, (float) (getHeight() / 2), f, this.f2764h);
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        m2780a();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m2780a();
    }

    public boolean performAccessibilityAction(int i, Bundle bundle) {
        if (this.f2772p != null) {
            if (i == 4096) {
                throw null;
            } else if (i == 8192) {
                throw null;
            }
        }
        return super.performAccessibilityAction(i, bundle);
    }

    public void setAccessibilitySeekListener(AbstractC0546a aVar) {
    }

    public void setActiveBarHeight(int i) {
        this.f2771o = i;
        m2780a();
    }

    public void setActiveRadius(int i) {
        this.f2769m = i;
        m2780a();
    }

    public void setBarHeight(int i) {
        this.f2770n = i;
        m2780a();
    }

    public void setMax(int i) {
        this.f2767k = i;
        m2780a();
    }

    public void setProgress(int i) {
        int i2 = this.f2767k;
        if (i > i2) {
            i = i2;
        } else if (i < 0) {
            i = 0;
        }
        this.f2765i = i;
        m2780a();
    }

    public void setProgressColor(int i) {
        this.f2762f.setColor(i);
    }

    public void setSecondaryProgress(int i) {
        int i2 = this.f2767k;
        if (i > i2) {
            i = i2;
        } else if (i < 0) {
            i = 0;
        }
        this.f2766j = i;
        m2780a();
    }

    public void setSecondaryProgressColor(int i) {
        this.f2761e.setColor(i);
    }
}
