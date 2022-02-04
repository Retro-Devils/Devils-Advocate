package p006b.p030g.p031d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.core.content.p005c.C0382c;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p006b.p030g.p036h.C0923b;

/* renamed from: b.g.d.e */
class C0907e extends C0912j {

    /* renamed from: b */
    private static Class<?> f4539b = null;

    /* renamed from: c */
    private static Constructor<?> f4540c = null;

    /* renamed from: d */
    private static Method f4541d = null;

    /* renamed from: e */
    private static Method f4542e = null;

    /* renamed from: f */
    private static boolean f4543f = false;

    C0907e() {
    }

    /* renamed from: k */
    private static boolean m5326k(Object obj, String str, int i, boolean z) {
        m5329n();
        try {
            return ((Boolean) f4541d.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: l */
    private static Typeface mo5309l(Object obj) {
        m5329n();
        try {
            Object newInstance = Array.newInstance(f4539b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f4542e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: m */
    private File m5328m(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    /* renamed from: n */
    private static void m5329n() {
        Method method;
        Class<?> cls;
        Method method2;
        if (!f4543f) {
            f4543f = true;
            Constructor<?> constructor = null;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
                method = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
                constructor = constructor2;
            } catch (ClassNotFoundException | NoSuchMethodException e) {
                Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
                method2 = null;
                cls = null;
                method = null;
            }
            f4540c = constructor;
            f4539b = cls;
            f4541d = method;
            f4542e = method2;
        }
    }

    /* renamed from: o */
    private static Object m5330o() {
        m5329n();
        try {
            return f4540c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // p006b.p030g.p031d.C0912j
    /* renamed from: b */
    public Typeface mo5305b(Context context, C0382c.C0384b bVar, Resources resources, int i) {
        Object o = m5330o();
        C0382c.C0385c[] a = bVar.mo2229a();
        for (C0382c.C0385c cVar : a) {
            File e = C0916k.m5387e(context);
            if (e == null) {
                return null;
            }
            try {
                if (!C0916k.m5385c(e, resources, cVar.mo2231b())) {
                    e.delete();
                    return null;
                }
                if (!m5326k(o, e.getPath(), cVar.mo2234e(), cVar.mo2235f())) {
                    return null;
                }
            } catch (RuntimeException unused) {
                return null;
            } finally {
                e.delete();
            }
        }
        return mo5309l(o);
    }

    @Override // p006b.p030g.p031d.C0912j
    /* renamed from: c */
    public Typeface mo5306c(Context context, CancellationSignal cancellationSignal, C0923b.C0929f[] fVarArr, int i) {
        if (fVarArr.length < 1) {
            return null;
        }
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
                File m = m5328m(openFileDescriptor);
                if (m != null) {
                    if (m.canRead()) {
                        Typeface createFromFile = Typeface.createFromFile(m);
                        openFileDescriptor.close();
                        return createFromFile;
                    }
                }
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                try {
                    Typeface d = super.mo5316d(context, fileInputStream);
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return d;
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
            }
        } catch (IOException unused3) {
            return null;
        }
        throw th;
        throw th;
    }
}
