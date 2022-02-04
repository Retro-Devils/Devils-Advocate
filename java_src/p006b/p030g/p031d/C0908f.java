package p006b.p030g.p031d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.core.content.p005c.C0382c;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import p006b.p021d.C0838i;
import p006b.p030g.p036h.C0923b;

/* renamed from: b.g.d.f */
class C0908f extends C0912j {

    /* renamed from: b */
    private static final Class<?> f4540b;

    /* renamed from: c */
    private static final Constructor<?> f4541c;

    /* renamed from: d */
    private static final Method f4542d;

    /* renamed from: e */
    private static final Method f4543e;

    static {
        Method method;
        Method method2;
        Class<?> cls;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method2 = null;
            method = null;
        }
        f4541c = constructor;
        f4540b = cls;
        f4542d = method;
        f4543e = method2;
    }

    C0908f() {
    }

    /* renamed from: k */
    private static boolean m5333k(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f4542d.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: l */
    private static Typeface m5334l(Object obj) {
        try {
            Object newInstance = Array.newInstance(f4540b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f4543e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: m */
    public static boolean m5335m() {
        Method method = f4542d;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    /* renamed from: n */
    private static Object m5336n() {
        try {
            return f4541c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // p006b.p030g.p031d.C0912j
    /* renamed from: b */
    public Typeface mo5305b(Context context, C0382c.C0384b bVar, Resources resources, int i) {
        Object n = m5336n();
        if (n == null) {
            return null;
        }
        C0382c.C0385c[] a = bVar.mo2229a();
        for (C0382c.C0385c cVar : a) {
            ByteBuffer b = C0916k.m5384b(context, resources, cVar.mo2231b());
            if (b == null || !m5333k(n, b, cVar.mo2232c(), cVar.mo2234e(), cVar.mo2235f())) {
                return null;
            }
        }
        return m5334l(n);
    }

    @Override // p006b.p030g.p031d.C0912j
    /* renamed from: c */
    public Typeface mo5306c(Context context, CancellationSignal cancellationSignal, C0923b.C0929f[] fVarArr, int i) {
        Object n = m5336n();
        if (n == null) {
            return null;
        }
        C0838i iVar = new C0838i();
        for (C0923b.C0929f fVar : fVarArr) {
            Uri c = fVar.mo5343c();
            ByteBuffer byteBuffer = (ByteBuffer) iVar.get(c);
            if (byteBuffer == null) {
                byteBuffer = C0916k.m5388f(context, cancellationSignal, c);
                iVar.put(c, byteBuffer);
            }
            if (byteBuffer == null || !m5333k(n, byteBuffer, fVar.mo5342b(), fVar.mo5344d(), fVar.mo5345e())) {
                return null;
            }
        }
        Typeface l = m5334l(n);
        if (l == null) {
            return null;
        }
        return Typeface.create(l, i);
    }
}
