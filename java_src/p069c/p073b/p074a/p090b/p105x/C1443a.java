package p069c.p073b.p074a.p090b.p105x;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.AbstractC0399b;
import p069c.p073b.p074a.p090b.p107z.AbstractC1477n;
import p069c.p073b.p074a.p090b.p107z.C1455g;
import p069c.p073b.p074a.p090b.p107z.C1462k;

/* renamed from: c.b.a.b.x.a */
public class C1443a extends Drawable implements AbstractC1477n, AbstractC0399b {

    /* renamed from: b */
    private C1445b f6093b;

    /* access modifiers changed from: package-private */
    /* renamed from: c.b.a.b.x.a$b */
    public static final class C1445b extends Drawable.ConstantState {

        /* renamed from: a */
        C1455g f6094a;

        /* renamed from: b */
        boolean f6095b;

        public C1445b(C1445b bVar) {
            this.f6094a = (C1455g) bVar.f6094a.getConstantState().newDrawable();
            this.f6095b = bVar.f6095b;
        }

        public C1445b(C1455g gVar) {
            this.f6094a = gVar;
            this.f6095b = false;
        }

        /* renamed from: a */
        public C1443a newDrawable() {
            return new C1443a(new C1445b(this));
        }

        public int getChangingConfigurations() {
            return 0;
        }
    }

    private C1443a(C1445b bVar) {
        this.f6093b = bVar;
    }

    public C1443a(C1462k kVar) {
        this(new C1445b(new C1455g(kVar)));
    }

    /* renamed from: a */
    public C1443a mutate() {
        this.f6093b = new C1445b(this.f6093b);
        return this;
    }

    public void draw(Canvas canvas) {
        C1445b bVar = this.f6093b;
        if (bVar.f6095b) {
            bVar.f6094a.draw(canvas);
        }
    }

    public Drawable.ConstantState getConstantState() {
        return this.f6093b;
    }

    public int getOpacity() {
        return this.f6093b.f6094a.getOpacity();
    }

    public boolean isStateful() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f6093b.f6094a.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f6093b.f6094a.setState(iArr)) {
            onStateChange = true;
        }
        boolean b = C1446b.m7104b(iArr);
        C1445b bVar = this.f6093b;
        if (bVar.f6095b == b) {
            return onStateChange;
        }
        bVar.f6095b = b;
        return true;
    }

    public void setAlpha(int i) {
        this.f6093b.f6094a.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f6093b.f6094a.setColorFilter(colorFilter);
    }

    @Override // p069c.p073b.p074a.p090b.p107z.AbstractC1477n
    public void setShapeAppearanceModel(C1462k kVar) {
        this.f6093b.f6094a.setShapeAppearanceModel(kVar);
    }

    @Override // androidx.core.graphics.drawable.AbstractC0399b
    public void setTint(int i) {
        this.f6093b.f6094a.setTint(i);
    }

    @Override // androidx.core.graphics.drawable.AbstractC0399b
    public void setTintList(ColorStateList colorStateList) {
        this.f6093b.f6094a.setTintList(colorStateList);
    }

    @Override // androidx.core.graphics.drawable.AbstractC0399b
    public void setTintMode(PorterDuff.Mode mode) {
        this.f6093b.f6094a.setTintMode(mode);
    }
}
