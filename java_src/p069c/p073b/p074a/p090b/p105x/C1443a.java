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
    private C1445b f6085b;

    /* access modifiers changed from: package-private */
    /* renamed from: c.b.a.b.x.a$b */
    public static final class C1445b extends Drawable.ConstantState {

        /* renamed from: a */
        C1455g f6086a;

        /* renamed from: b */
        boolean f6087b;

        public C1445b(C1445b bVar) {
            this.f6086a = (C1455g) bVar.f6086a.getConstantState().newDrawable();
            this.f6087b = bVar.f6087b;
        }

        public C1445b(C1455g gVar) {
            this.f6086a = gVar;
            this.f6087b = false;
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
        this.f6085b = bVar;
    }

    public C1443a(C1462k kVar) {
        this(new C1445b(new C1455g(kVar)));
    }

    /* renamed from: a */
    public C1443a mutate() {
        this.f6085b = new C1445b(this.f6085b);
        return this;
    }

    public void draw(Canvas canvas) {
        C1445b bVar = this.f6085b;
        if (bVar.f6087b) {
            bVar.f6086a.draw(canvas);
        }
    }

    public Drawable.ConstantState getConstantState() {
        return this.f6085b;
    }

    public int getOpacity() {
        return this.f6085b.f6086a.getOpacity();
    }

    public boolean isStateful() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f6085b.f6086a.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f6085b.f6086a.setState(iArr)) {
            onStateChange = true;
        }
        boolean b = C1446b.m7104b(iArr);
        C1445b bVar = this.f6085b;
        if (bVar.f6087b == b) {
            return onStateChange;
        }
        bVar.f6087b = b;
        return true;
    }

    public void setAlpha(int i) {
        this.f6085b.f6086a.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f6085b.f6086a.setColorFilter(colorFilter);
    }

    @Override // p069c.p073b.p074a.p090b.p107z.AbstractC1477n
    public void setShapeAppearanceModel(C1462k kVar) {
        this.f6085b.f6086a.setShapeAppearanceModel(kVar);
    }

    @Override // androidx.core.graphics.drawable.AbstractC0399b
    public void setTint(int i) {
        this.f6085b.f6086a.setTint(i);
    }

    @Override // androidx.core.graphics.drawable.AbstractC0399b
    public void setTintList(ColorStateList colorStateList) {
        this.f6085b.f6086a.setTintList(colorStateList);
    }

    @Override // androidx.core.graphics.drawable.AbstractC0399b
    public void setTintMode(PorterDuff.Mode mode) {
        this.f6085b.f6086a.setTintMode(mode);
    }
}
