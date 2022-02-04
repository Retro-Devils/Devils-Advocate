package p006b.p030g.p035g;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: b.g.g.a */
public final class C0921a {

    /* renamed from: a */
    private static long f4554a;

    /* renamed from: b */
    private static Method f4555b;

    /* renamed from: c */
    private static Method f4556c;

    /* renamed from: d */
    private static Method f4557d;

    /* renamed from: e */
    private static Method f4558e;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 18 && i < 29) {
            try {
                f4554a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f4555b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f4556c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f4557d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f4558e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
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
