package p006b.p019c.p020a;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: b.c.a.a */
public class C0812a extends FrameLayout {

    /* renamed from: b */
    private static final int[] f4024b = {16842801};

    /* renamed from: c */
    private static final AbstractC0819f f4025c;

    /* renamed from: d */
    private boolean f4026d;

    /* renamed from: e */
    private boolean f4027e;

    /* renamed from: f */
    int f4028f;

    /* renamed from: g */
    int f4029g;

    /* renamed from: h */
    final Rect f4030h;

    /* renamed from: i */
    private final AbstractC0818e f4031i;

    static {
        int i = Build.VERSION.SDK_INT;
        f4025c = i >= 21 ? new C0815c() : i >= 17 ? new C0813b() : new C0816d();
        f4025c.mo4806m();
    }

    public ColorStateList getCardBackgroundColor() {
        return f4025c.mo4813f(this.f4031i);
    }

    public float getCardElevation() {
        return f4025c.mo4818k(this.f4031i);
    }

    public int getContentPaddingBottom() {
        return this.f4030h.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f4030h.left;
    }

    public int getContentPaddingRight() {
        return this.f4030h.right;
    }

    public int getContentPaddingTop() {
        return this.f4030h.top;
    }

    public float getMaxCardElevation() {
        return f4025c.mo4808a(this.f4031i);
    }

    public boolean getPreventCornerOverlap() {
        return this.f4027e;
    }

    public float getRadius() {
        return f4025c.mo4809b(this.f4031i);
    }

    public boolean getUseCompatPadding() {
        return this.f4026d;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        AbstractC0819f fVar = f4025c;
        if (!(fVar instanceof C0815c)) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) fVar.mo4811d(this.f4031i)), View.MeasureSpec.getSize(i)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) fVar.mo4810c(this.f4031i)), View.MeasureSpec.getSize(i2)), mode2);
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        f4025c.mo4817j(this.f4031i, ColorStateList.valueOf(i));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f4025c.mo4817j(this.f4031i, colorStateList);
    }

    public void setCardElevation(float f) {
        f4025c.mo4814g(this.f4031i, f);
    }

    public void setMaxCardElevation(float f) {
        f4025c.mo4819l(this.f4031i, f);
    }

    public void setMinimumHeight(int i) {
        this.f4029g = i;
        super.setMinimumHeight(i);
    }

    public void setMinimumWidth(int i) {
        this.f4028f = i;
        super.setMinimumWidth(i);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f4027e) {
            this.f4027e = z;
            f4025c.mo4816i(this.f4031i);
        }
    }

    public void setRadius(float f) {
        f4025c.mo4815h(this.f4031i, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f4026d != z) {
            this.f4026d = z;
            f4025c.mo4812e(this.f4031i);
        }
    }
}
