package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.v0 */
public class C0294v0 extends C0262n0 {

    /* renamed from: b */
    private final WeakReference<Context> f1237b;

    public C0294v0(Context context, Resources resources) {
        super(resources);
        this.f1237b = new WeakReference<>(context);
    }

    @Override // androidx.appcompat.widget.C0262n0, android.content.res.Resources
    public Drawable getDrawable(int i) {
        Drawable drawable = super.getDrawable(i);
        Context context = this.f1237b.get();
        if (!(drawable == null || context == null)) {
            C0254m0.m1289h().mo1596x(context, i, drawable);
        }
        return drawable;
    }
}
