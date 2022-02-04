package p006b.p030g.p031d;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.content.p005c.C0382c;
import androidx.core.content.p005c.C0390f;
import p006b.p021d.C0831g;
import p006b.p030g.p036h.C0923b;

@SuppressLint({"NewApi"})
/* renamed from: b.g.d.d */
public class C0906d {

    /* renamed from: a */
    private static final C0912j f4533a;

    /* renamed from: b */
    private static final C0831g<String, Typeface> f4534b = new C0831g<>(16);

    static {
        int i = Build.VERSION.SDK_INT;
        f4533a = i >= 29 ? new C0911i() : i >= 28 ? new C0910h() : i >= 26 ? new C0909g() : (i < 24 || !C0908f.m5335m()) ? i >= 21 ? new C0907e() : new C0912j() : new C0908f();
    }

    /* renamed from: a */
    public static Typeface m5319a(Context context, Typeface typeface, int i) {
        Typeface g;
        if (context != null) {
            return (Build.VERSION.SDK_INT >= 21 || (g = m5325g(context, typeface, i)) == null) ? Typeface.create(typeface, i) : g;
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    /* renamed from: b */
    public static Typeface m5320b(Context context, CancellationSignal cancellationSignal, C0923b.C0929f[] fVarArr, int i) {
        return f4533a.mo5306c(context, cancellationSignal, fVarArr, i);
    }

    /* renamed from: c */
    public static Typeface m5321c(Context context, C0382c.AbstractC0383a aVar, Resources resources, int i, int i2, C0390f.AbstractC0391a aVar2, Handler handler, boolean z) {
        Typeface typeface;
        if (aVar instanceof C0382c.C0386d) {
            C0382c.C0386d dVar = (C0382c.C0386d) aVar;
            boolean z2 = false;
            if (!z ? aVar2 == null : dVar.mo2236a() == 0) {
                z2 = true;
            }
            typeface = C0923b.m5408g(context, dVar.mo2237b(), aVar2, handler, z2, z ? dVar.mo2238c() : -1, i2);
        } else {
            typeface = f4533a.mo5305b(context, (C0382c.C0384b) aVar, resources, i2);
            if (aVar2 != null) {
                if (typeface != null) {
                    aVar2.mo2240b(typeface, handler);
                } else {
                    aVar2.mo2239a(-3, handler);
                }
            }
        }
        if (typeface != null) {
            f4534b.mo4930f(m5323e(resources, i, i2), typeface);
        }
        return typeface;
    }

    /* renamed from: d */
    public static Typeface m5322d(Context context, Resources resources, int i, String str, int i2) {
        Typeface e = f4533a.mo5308e(context, resources, i, str, i2);
        if (e != null) {
            f4534b.mo4930f(m5323e(resources, i, i2), e);
        }
        return e;
    }

    /* renamed from: e */
    private static String m5323e(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }

    /* renamed from: f */
    public static Typeface m5324f(Resources resources, int i, int i2) {
        return f4534b.mo4928d(m5323e(resources, i, i2));
    }

    /* renamed from: g */
    private static Typeface m5325g(Context context, Typeface typeface, int i) {
        C0912j jVar = f4533a;
        C0382c.C0384b i2 = jVar.mo5318i(typeface);
        if (i2 == null) {
            return null;
        }
        return jVar.mo5305b(context, i2, context.getResources(), i);
    }
}
