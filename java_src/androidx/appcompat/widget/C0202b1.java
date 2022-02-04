package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.ref.WeakReference;

/* renamed from: androidx.appcompat.widget.b1 */
public class C0202b1 extends Resources {

    /* renamed from: a */
    private static boolean f935a = false;

    /* renamed from: b */
    private final WeakReference<Context> f936b;

    public C0202b1(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f936b = new WeakReference<>(context);
    }

    /* renamed from: a */
    public static boolean m1058a() {
        return f935a;
    }

    /* renamed from: b */
    public static void m1059b(boolean z) {
        f935a = z;
    }

    /* renamed from: c */
    public static boolean m1060c() {
        return m1058a() && Build.VERSION.SDK_INT <= 20;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final Drawable mo1317d(int i) {
        return super.getDrawable(i);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i) {
        Context context = this.f936b.get();
        return context != null ? C0254m0.m1289h().mo1594t(context, this, i) : super.getDrawable(i);
    }
}
