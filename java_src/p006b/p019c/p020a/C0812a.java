package p006b.p019c.p020a;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: b.c.a.a */
public class C0812a extends FrameLayout {

    /* renamed from: b */
    private static final int[] f4028b = {16842801};

    /* renamed from: c */
    private static final AbstractC0819f f4029c;

    /* renamed from: d */
    private boolean f4030d;

    /* renamed from: e */
    private boolean f4031e;

    /* renamed from: f */
    int f4032f;

    /* renamed from: g */
    int f4033g;

    /* renamed from: h */
    final Rect f4034h;

    /* renamed from: i */
    private final AbstractC0818e f4035i;

    static {
        int i = Build.VERSION.SDK_INT;
        f4029c = i >= 21 ? new C0815c() : i >= 17 ? new C0813b() : new C0816d();
        f4029c.mo4806m();
    }

    public ColorStateList getCardBackgroundColor() {
        return f4029c.mo4813f(this.f4035i);
    }

    public float getCardElevation() {
        return f4029c.mo4818k(this.f4035i);
    }

    public int getContentPaddingBottom() {
        return this.f4034h.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f4034h.left;
    }

    public int getContentPaddingRight() {
        return this.f4034h.right;
    }

    public int getContentPaddingTop() {
        return this.f4034h.top;
    }

    public float getMaxCardElevation() {
        return f4029c.mo4808a(this.f4035i);
    }

    public boolean getPreventCornerOverlap() {
        return this.f4031e;
    }

    public float getRadius() {
        return f4029c.mo4809b(this.f4035i);
    }

    public boolean getUseCompatPadding() {
        return this.f4030d;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        AbstractC0819f fVar = f4029c;
        if (!(fVar instanceof C0815c)) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) fVar.mo4811d(this.f4035i)), View.MeasureSpec.getSize(i)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) fVar.mo4810c(this.f4035i)), View.MeasureSpec.getSize(i2)), mode2);
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        f4029c.mo4817j(this.f4035i, ColorStateList.valueOf(i));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f4029c.mo4817j(this.f4035i, colorStateList);
    }

    public void setCardElevation(float f) {
        f4029c.mo4814g(this.f4035i, f);
    }

    public void setMaxCardElevation(float f) {
        f4029c.mo4819l(this.f4035i, f);
    }

    public void setMinimumHeight(int i) {
        this.f4033g = i;
        super.setMinimumHeight(i);
    }

    public void setMinimumWidth(int i) {
        this.f4032f = i;
        super.setMinimumWidth(i);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f4031e) {
            this.f4031e = z;
            f4029c.mo4816i(this.f4035i);
        }
    }

    public void setRadius(float f) {
        f4029c.mo4815h(this.f4035i, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f4030d != z) {
            this.f4030d = z;
            f4029c.mo4812e(this.f4035i);
        }
    }
}
