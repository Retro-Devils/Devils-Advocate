package p006b.p030g.p035g;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: b.g.g.a */
public final class C0921a {

    /* renamed from: a */
    private static long f4558a;

    /* renamed from: b */
    private static Method f4559b;

    /* renamed from: c */
    private static Method f4560c;

    /* renamed from: d */
    private static Method f4561d;

    /* renamed from: e */
    private static Method f4562e;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 18 && i < 29) {
            try {
                f4558a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f4559b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f4560c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f4561d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f4562e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e);
            }
        }
    }

    /* renamed from: a */
    public static void m5394a(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }

    /* renamed from: b */
    public static void m5395b() {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }
}
