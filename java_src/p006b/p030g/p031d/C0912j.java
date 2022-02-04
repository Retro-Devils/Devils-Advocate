package p006b.p030g.p031d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.core.content.p005c.C0382c;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import p006b.p030g.p036h.C0923b;

/* access modifiers changed from: package-private */
/* renamed from: b.g.d.j */
public class C0912j {

    /* renamed from: a */
    private ConcurrentHashMap<Long, C0382c.C0384b> f4551a = new ConcurrentHashMap<>();

    /* access modifiers changed from: package-private */
    /* renamed from: b.g.d.j$a */
    public class C0913a implements AbstractC0915c<C0923b.C0929f> {
        C0913a() {
        }

        /* renamed from: c */
        public int mo5319a(C0923b.C0929f fVar) {
            return fVar.mo5344d();
        }

        /* renamed from: d */
        public boolean mo5320b(C0923b.C0929f fVar) {
            return fVar.mo5345e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.g.d.j$b */
    public class C0914b implements AbstractC0915c<C0382c.C0385c> {
        C0914b() {
        }

        /* renamed from: c */
        public int mo5319a(C0382c.C0385c cVar) {
            return cVar.mo2234e();
        }

        /* renamed from: d */
        public boolean mo5320b(C0382c.C0385c cVar) {
            return cVar.mo2235f();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b.g.d.j$c */
    public interface AbstractC0915c<T> {
        /* renamed from: a */
        int mo5319a(T t);

        /* renamed from: b */
        boolean mo5320b(T t);
    }

    C0912j() {
    }

    /* renamed from: a */
    private void m5363a(Typeface typeface, C0382c.C0384b bVar) {
        long j = m5366j(typeface);
        if (j != 0) {
            this.f4551a.put(Long.valueOf(j), bVar);
        }
    }

    /* renamed from: f */
    private C0382c.C0385c m5364f(C0382c.C0384b bVar, int i) {
        return (C0382c.C0385c) m5365g(bVar.mo2229a(), i, new C0914b());
    }

    /* renamed from: g */
    private static <T> T m5365g(T[] tArr, int i, AbstractC0915c<T> cVar) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = (Math.abs(cVar.mo5319a(t2) - i2) * 2) + (cVar.mo5320b(t2) == z ? 0 : 1);
            if (t == null || i3 > abs) {
                t = t2;
                i3 = abs;
            }
        }
        return t;
    }

    /* renamed from: j */
    private static long m5366j(Typeface typeface) {
        if (typeface == null) {
            return 0;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (NoSuchFieldException e) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e);
            return 0;
        } catch (IllegalAccessException e2) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e2);
            return 0;
        }
    }

    /* renamed from: b */
    public Typeface mo5305b(Context context, C0382c.C0384b bVar, Resources resources, int i) {
        C0382c.C0385c f = m5364f(bVar, i);
        if (f == null) {
            return null;
        }
        Typeface d = C0906d.m5322d(context, resources, f.mo2231b(), f.mo2230a(), i);
        m5363a(d, bVar);
        return d;
    }

    /* renamed from: c */
    public Typeface mo5306c(Context context, CancellationSignal cancellationSignal, C0923b.C0929f[] fVarArr, int i) {
        InputStream inputStream;
        Throwable th;
        InputStream inputStream2 = null;
        if (fVarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(mo5317h(fVarArr, i).mo5343c());
            try {
                Typeface d = mo5316d(context, inputStream);
                C0916k.m5383a(inputStream);
                return d;
            } catch (IOException unused) {
                C0916k.m5383a(inputStream);
                return null;
            } catch (Throwable th2) {
                th = th2;
                inputStream2 = inputStream;
                C0916k.m5383a(inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
            C0916k.m5383a(inputStream);
            return null;
        } catch (Throwable th3) {
            th = th3;
            C0916k.m5383a(inputStream2);
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Typeface mo5316d(Context context, InputStream inputStream) {
        File e = C0916k.m5387e(context);
        if (e == null) {
            return null;
        }
        try {
            if (!C0916k.m5386d(e, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(e.getPath());
            e.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e.delete();
        }
    }

    /* renamed from: e */
    public Typeface mo5308e(Context context, Resources resources, int i, String str, int i2) {
        File e = C0916k.m5387e(context);
        if (e == null) {
            return null;
        }
        try {
            if (!C0916k.m5385c(e, resources, i)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(e.getPath());
            e.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e.delete();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C0923b.C0929f mo5317h(C0923b.C0929f[] fVarArr, int i) {
        return (C0923b.C0929f) m5365g(fVarArr, i, new C0913a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C0382c.C0384b mo5318i(Typeface typeface) {
        long j = m5366j(typeface);
        if (j == 0) {
            return null;
        }
        return this.f4551a.get(Long.valueOf(j));
    }
}
