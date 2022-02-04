package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: androidx.core.graphics.drawable.f */
final class C0403f extends Drawable.ConstantState {

    /* renamed from: a */
    int f2107a;

    /* renamed from: b */
    Drawable.ConstantState f2108b;

    /* renamed from: c */
    ColorStateList f2109c = null;

    /* renamed from: d */
    PorterDuff.Mode f2110d = C0401d.f2099b;

    C0403f(C0403f fVar) {
        if (fVar != null) {
            this.f2107a = fVar.f2107a;
            this.f2108b = fVar.f2108b;
            this.f2109c = fVar.f2109c;
            this.f2110d = fVar.f2110d;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo2292a() {
        return this.f2108b != null;
    }

    public int getChangingConfigurations() {
        int i = this.f2107a;
        Drawable.ConstantState constantState = this.f2108b;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    public Drawable newDrawable() {
        return newDrawable(null);
    }

    public Drawable newDrawable(Resources resources) {
        return Build.VERSION.SDK_INT >= 21 ? new C0402e(this, resources) : new C0401d(this, resources);
    }
}
