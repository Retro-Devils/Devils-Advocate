package p069c.p070a.p071a;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: c.a.a.v */
public class C1253v {

    /* renamed from: a */
    public static String f5487a = "Volley";

    /* renamed from: b */
    public static boolean f5488b = Log.isLoggable("Volley", 2);

    /* renamed from: c */
    private static final String f5489c = C1253v.class.getName();

    /* access modifiers changed from: package-private */
    /* renamed from: c.a.a.v$a */
    public static class C1254a {

        /* renamed from: a */
        public static final boolean f5490a = C1253v.f5488b;

        /* renamed from: b */
        private final List<C1255a> f5491b = new ArrayList();

        /* renamed from: c */
        private boolean f5492c = false;

        /* access modifiers changed from: private */
        /* renamed from: c.a.a.v$a$a */
        public static class C1255a {

            /* renamed from: a */
            public final String f5493a;

            /* renamed from: b */
            public final long f5494b;

            /* renamed from: c */
            public final long f5495c;

            public C1255a(String str, long j, long j2) {
                this.f5493a = str;
                this.f5494b = j;
                this.f5495c = j2;
            }
        }

        C1254a() {
        }

        /* renamed from: c */
        private long m6671c() {
            if (this.f5491b.size() == 0) {
                return 0;
            }
            long j = this.f5491b.get(0).f5495c;
            List<C1255a> list = this.f5491b;
            return list.get(list.size() - 1).f5495c - j;
        }

        /* renamed from: a */
        public synchronized void mo6228a(String str, long j) {
            if (!this.f5492c) {
                this.f5491b.add(new C1255a(str, j, SystemClock.elapsedRealtime()));
            } else {
                throw new IllegalStateException("Marker added to finished log");
            }
        }

        /* renamed from: b */
        public synchronized void mo6229b(String str) {
            this.f5492c = true;
            long c = m6671c();
            if (c > 0) {
                long j = this.f5491b.get(0).f5495c;
                C1253v.m6666b("(%-4d ms) %s", Long.valueOf(c), str);
                for (C1255a aVar : this.f5491b) {
                    long j2 = aVar.f5495c;
                    C1253v.m6666b("(+%-4d) [%2d] %s", Long.valueOf(j2 - j), Long.valueOf(aVar.f5494b), aVar.f5493a);
                    j = j2;
                }
            }
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            if (!this.f5492c) {
                mo6229b("Request on the loose");
                C1253v.m6667c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
            }
        }
    }

    /* renamed from: a */
    private static String m6665a(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            } else if (!stackTrace[i].getClassName().equals(f5489c)) {
                String className = stackTrace[i].getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                str2 = substring.substring(substring.lastIndexOf(36) + 1) + "." + stackTrace[i].getMethodName();
                break;
            } else {
                i++;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), str2, str);
    }

    /* renamed from: b */
    public static void m6666b(String str, Object... objArr) {
        Log.d(f5487a, m6665a(str, objArr));
    }

    /* renamed from: c */
    public static void m6667c(String str, Object... objArr) {
        Log.e(f5487a, m6665a(str, objArr));
    }

    /* renamed from: d */
    public static void m6668d(Throwable th, String str, Object... objArr) {
        Log.e(f5487a, m6665a(str, objArr), th);
    }

    /* renamed from: e */
    public static void m6669e(String str, Object... objArr) {
        if (f5488b) {
            Log.v(f5487a, m6665a(str, objArr));
        }
    }

    /* renamed from: f */
    public static void m6670f(String str, Object... objArr) {
        Log.wtf(f5487a, m6665a(str, objArr));
    }
}
