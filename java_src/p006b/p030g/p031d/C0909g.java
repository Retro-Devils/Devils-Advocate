package p006b.p030g.p031d;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.core.content.p005c.C0382c;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import p006b.p030g.p036h.C0923b;

/* renamed from: b.g.d.g */
public class C0909g extends C0907e {

    /* renamed from: g */
    protected final Class<?> f4548g;

    /* renamed from: h */
    protected final Constructor<?> f4549h;

    /* renamed from: i */
    protected final Method f4550i;

    /* renamed from: j */
    protected final Method f4551j;

    /* renamed from: k */
    protected final Method f4552k;

    /* renamed from: l */
    protected final Method f4553l;

    /* renamed from: m */
    protected final Method f4554m;

    public C0909g() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Constructor<?> constructor;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> y = mo5314y();
            constructor = mo5315z(y);
            method4 = mo5311v(y);
            method3 = mo5312w(y);
            method2 = mo5307A(y);
            method = mo5310u(y);
            method5 = mo5313x(y);
            cls = y;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e.getClass().getName(), e);
            method5 = null;
            constructor = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f4548g = cls;
        this.f4549h = constructor;
        this.f4550i = method4;
        this.f4551j = method3;
        this.f4552k = method2;
        this.f4553l = method;
        this.f4554m = method5;
    }

    /* renamed from: o */
    private Object m5339o() {
        try {
            return this.f4549h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: p */
    private void m5340p(Object obj) {
        try {
            this.f4553l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* renamed from: q */
    private boolean m5341q(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f4550i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: r */
    private boolean m5342r(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.f4551j.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: s */
    private boolean m5343s(Object obj) {
        try {
            return ((Boolean) this.f4552k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: t */
    private boolean m5344t() {
        if (this.f4550i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f4550i != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public Method mo5307A(Class<?> cls) {
        return cls.getMethod("freeze", new Class[0]);
    }

    @Override // p006b.p030g.p031d.C0907e, p006b.p030g.p031d.C0912j
    /* renamed from: b */
    public Typeface mo5305b(Context context, C0382c.C0384b bVar, Resources resources, int i) {
        if (!m5344t()) {
            return super.mo5305b(context, bVar, resources, i);
        }
        Object o = m5339o();
        if (o == null) {
            return null;
        }
        C0382c.C0385c[] a = bVar.mo2229a();
        for (C0382c.C0385c cVar : a) {
            if (!m5341q(context, o, cVar.mo2230a(), cVar.mo2232c(), cVar.mo2234e(), cVar.mo2235f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.mo2233d()))) {
                m5340p(o);
                return null;
            }
        }
        if (!m5343s(o)) {
            return null;
        }
        return mo5309l(o);
    }

    @Override // p006b.p030g.p031d.C0907e, p006b.p030g.p031d.C0912j
    /* renamed from: c */
    public Typeface mo5306c(Context context, CancellationSignal cancellationSignal, C0923b.C0929f[] fVarArr, int i) {
        Typeface l;
        if (fVarArr.length < 1) {
            return null;
        }
        if (!m5344t()) {
            C0923b.C0929f h = mo5317h(fVarArr, i);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(h.mo5343c(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(h.mo5344d()).setItalic(h.mo5345e()).build();
                    openFileDescriptor.close();
                    return build;
                } catch (Throwable unused) {
                }
            } catch (IOException unused2) {
                return null;
            }
        } else {
            Map<Uri, ByteBuffer> i2 = C0923b.m5410i(context, fVarArr, cancellationSignal);
            Object o = m5339o();
            if (o == null) {
                return null;
            }
            boolean z = false;
            for (C0923b.C0929f fVar : fVarArr) {
                ByteBuffer byteBuffer = i2.get(fVar.mo5343c());
                if (byteBuffer != null) {
                    if (!m5342r(o, byteBuffer, fVar.mo5342b(), fVar.mo5344d(), fVar.mo5345e() ? 1 : 0)) {
                        m5340p(o);
                        return null;
                    }
                    z = true;
                }
            }
            if (!z) {
                m5340p(o);
                return null;
            } else if (m5343s(o) && (l = mo5309l(o)) != null) {
                return Typeface.create(l, i);
            } else {
                return null;
            }
        }
        throw th;
    }

    @Override // p006b.p030g.p031d.C0912j
    /* renamed from: e */
    public Typeface mo5308e(Context context, Resources resources, int i, String str, int i2) {
        if (!m5344t()) {
            return super.mo5308e(context, resources, i, str, i2);
        }
        Object o = m5339o();
        if (o == null) {
            return null;
        }
        if (!m5341q(context, o, str, 0, -1, -1, null)) {
            m5340p(o);
            return null;
        } else if (!m5343s(o)) {
            return null;
        } else {
            return mo5309l(o);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public Typeface mo5309l(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f4548g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f4554m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public Method mo5310u(Class<?> cls) {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public Method mo5311v(Class<?> cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public Method mo5312w(Class<?> cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public Method mo5313x(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public Class<?> mo5314y() {
        return Class.forName("android.graphics.FontFamily");
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public Constructor<?> mo5315z(Class<?> cls) {
        return cls.getConstructor(new Class[0]);
    }
}
