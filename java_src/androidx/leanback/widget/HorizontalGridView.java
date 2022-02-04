package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import p006b.p053m.C1080l;

public class HorizontalGridView extends AbstractC0548a {

    /* renamed from: S0 */
    private boolean f2608S0;

    /* renamed from: T0 */
    private boolean f2609T0;

    /* renamed from: U0 */
    private Paint f2610U0;

    /* renamed from: V0 */
    private Bitmap f2611V0;

    /* renamed from: W0 */
    private LinearGradient f2612W0;

    /* renamed from: X0 */
    private int f2613X0;

    /* renamed from: Y0 */
    private int f2614Y0;

    /* renamed from: Z0 */
    private Bitmap f2615Z0;

    /* renamed from: a1 */
    private LinearGradient f2616a1;

    /* renamed from: b1 */
    private int f2617b1;

    /* renamed from: c1 */
    private int f2618c1;

    /* renamed from: d1 */
    private Rect f2619d1;

    public HorizontalGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HorizontalGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2610U0 = new Paint();
        this.f2619d1 = new Rect();
        this.f2793I0.mo3420Z3(0);
        mo2998C1(context, attributeSet);
    }

    /* renamed from: D1 */
    private boolean m2714D1() {
        if (!this.f2609T0) {
            return false;
        }
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (this.f2793I0.mo3479y2(getChildAt(childCount)) > (getWidth() - getPaddingRight()) + this.f2618c1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: E1 */
    private boolean m2715E1() {
        if (!this.f2608S0) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (this.f2793I0.mo3477x2(getChildAt(i)) < getPaddingLeft() - this.f2614Y0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: F1 */
    private void m2716F1() {
        if (this.f2608S0 || this.f2609T0) {
            setLayerType(2, null);
            setWillNotDraw(false);
            return;
        }
        setLayerType(0, null);
        setWillNotDraw(true);
    }

    private Bitmap getTempBitmapHigh() {
        Bitmap bitmap = this.f2615Z0;
        if (!(bitmap != null && bitmap.getWidth() == this.f2617b1 && this.f2615Z0.getHeight() == getHeight())) {
            this.f2615Z0 = Bitmap.createBitmap(this.f2617b1, getHeight(), Bitmap.Config.ARGB_8888);
        }
        return this.f2615Z0;
    }

    private Bitmap getTempBitmapLow() {
        Bitmap bitmap = this.f2611V0;
        if (!(bitmap != null && bitmap.getWidth() == this.f2613X0 && this.f2611V0.getHeight() == getHeight())) {
            this.f2611V0 = Bitmap.createBitmap(this.f2613X0, getHeight(), Bitmap.Config.ARGB_8888);
        }
        return this.f2611V0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C1 */
    public void mo2998C1(Context context, AttributeSet attributeSet) {
        mo3207A1(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1080l.f4938K);
        setRowHeight(obtainStyledAttributes);
        setNumRows(obtainStyledAttributes.getInt(C1080l.f4939L, 1));
        obtainStyledAttributes.recycle();
        m2716F1();
        Paint paint = new Paint();
        this.f2610U0 = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void draw(Canvas canvas) {
        boolean E1 = m2715E1();
        boolean D1 = m2714D1();
        if (!E1) {
            this.f2611V0 = null;
        }
        if (!D1) {
            this.f2615Z0 = null;
        }
        if (E1 || D1) {
            int paddingLeft = this.f2608S0 ? (getPaddingLeft() - this.f2614Y0) - this.f2613X0 : 0;
            int width = this.f2609T0 ? (getWidth() - getPaddingRight()) + this.f2618c1 + this.f2617b1 : getWidth();
            int save = canvas.save();
            canvas.clipRect((this.f2608S0 ? this.f2613X0 : 0) + paddingLeft, 0, width - (this.f2609T0 ? this.f2617b1 : 0), getHeight());
            super.draw(canvas);
            canvas.restoreToCount(save);
            Canvas canvas2 = new Canvas();
            Rect rect = this.f2619d1;
            rect.top = 0;
            rect.bottom = getHeight();
            if (E1 && this.f2613X0 > 0) {
                Bitmap tempBitmapLow = getTempBitmapLow();
                tempBitmapLow.eraseColor(0);
                canvas2.setBitmap(tempBitmapLow);
                int save2 = canvas2.save();
                canvas2.clipRect(0, 0, this.f2613X0, getHeight());
                float f = (float) (-paddingLeft);
                canvas2.translate(f, 0.0f);
                super.draw(canvas2);
                canvas2.restoreToCount(save2);
                this.f2610U0.setShader(this.f2612W0);
                canvas2.drawRect(0.0f, 0.0f, (float) this.f2613X0, (float) getHeight(), this.f2610U0);
                Rect rect2 = this.f2619d1;
                rect2.left = 0;
                rect2.right = this.f2613X0;
                canvas.translate((float) paddingLeft, 0.0f);
                Rect rect3 = this.f2619d1;
                canvas.drawBitmap(tempBitmapLow, rect3, rect3, (Paint) null);
                canvas.translate(f, 0.0f);
            }
            if (D1 && this.f2617b1 > 0) {
                Bitmap tempBitmapHigh = getTempBitmapHigh();
                tempBitmapHigh.eraseColor(0);
                canvas2.setBitmap(tempBitmapHigh);
                int save3 = canvas2.save();
                canvas2.clipRect(0, 0, this.f2617b1, getHeight());
                canvas2.translate((float) (-(width - this.f2617b1)), 0.0f);
                super.draw(canvas2);
                canvas2.restoreToCount(save3);
                this.f2610U0.setShader(this.f2616a1);
                canvas2.drawRect(0.0f, 0.0f, (float) this.f2617b1, (float) getHeight(), this.f2610U0);
                Rect rect4 = this.f2619d1;
                rect4.left = 0;
                int i = this.f2617b1;
                rect4.right = i;
                canvas.translate((float) (width - i), 0.0f);
                Rect rect5 = this.f2619d1;
                canvas.drawBitmap(tempBitmapHigh, rect5, rect5, (Paint) null);
                canvas.translate((float) (-(width - this.f2617b1)), 0.0f);
                return;
            }
            return;
        }
        super.draw(canvas);
    }

    public final boolean getFadingLeftEdge() {
        return this.f2608S0;
    }

    public final int getFadingLeftEdgeLength() {
        return this.f2613X0;
    }

    public final int getFadingLeftEdgeOffset() {
        return this.f2614Y0;
    }

    public final boolean getFadingRightEdge() {
        return this.f2609T0;
    }

    public final int getFadingRightEdgeLength() {
        return this.f2617b1;
    }

    public final int getFadingRightEdgeOffset() {
        return this.f2618c1;
    }

    public final void setFadingLeftEdge(boolean z) {
        if (this.f2608S0 != z) {
            this.f2608S0 = z;
            if (!z) {
                this.f2611V0 = null;
            }
            invalidate();
            m2716F1();
        }
    }

    public final void setFadingLeftEdgeLength(int i) {
        if (this.f2613X0 != i) {
            this.f2613X0 = i;
            this.f2612W0 = i != 0 ? new LinearGradient(0.0f, 0.0f, (float) this.f2613X0, 0.0f, 0, -16777216, Shader.TileMode.CLAMP) : null;
            invalidate();
        }
    }

    public final void setFadingLeftEdgeOffset(int i) {
        if (this.f2614Y0 != i) {
            this.f2614Y0 = i;
            invalidate();
        }
    }

    public final void setFadingRightEdge(boolean z) {
        if (this.f2609T0 != z) {
            this.f2609T0 = z;
            if (!z) {
                this.f2615Z0 = null;
            }
            invalidate();
            m2716F1();
        }
    }

    public final void setFadingRightEdgeLength(int i) {
        if (this.f2617b1 != i) {
            this.f2617b1 = i;
            this.f2616a1 = i != 0 ? new LinearGradient(0.0f, 0.0f, (float) this.f2617b1, 0.0f, -16777216, 0, Shader.TileMode.CLAMP) : null;
            invalidate();
        }
    }

    public final void setFadingRightEdgeOffset(int i) {
        if (this.f2618c1 != i) {
            this.f2618c1 = i;
            invalidate();
        }
    }

    public void setNumRows(int i) {
        this.f2793I0.mo3405V3(i);
        requestLayout();
    }

    public void setRowHeight(int i) {
        this.f2793I0.mo3427b4(i);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void setRowHeight(TypedArray typedArray) {
        int i = C1080l.f4940M;
        if (typedArray.peekValue(i) != null) {
            setRowHeight(typedArray.getLayoutDimension(i, 0));
        }
    }
}
