package p006b.p046j.p047a;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;

/* renamed from: b.j.a.b */
class C1057b {
    /* renamed from: a */
    public static boolean m6028a(Context context, Uri uri) {
        return context.checkCallingOrSelfUriPermission(uri, 1) == 0 && !TextUtils.isEmpty(m6033f(context, uri));
    }

    /* renamed from: b */
    public static boolean m6029b(Context context, Uri uri) {
        if (context.checkCallingOrSelfUriPermission(uri, 2) != 0) {
            return false;
        }
        String f = m6033f(context, uri);
        int j = m6037j(context, uri, "flags", 0);
        if (TextUtils.isEmpty(f)) {
            return false;
        }
        if ((j & 4) != 0) {
            return true;
        }
        if (!"vnd.android.document/directory".equals(f) || (j & 8) == 0) {
            return !TextUtils.isEmpty(f) && (j & 2) != 0;
        }
        return true;
    }

    /* renamed from: c */
    private static void m6030c(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: d */
    public static boolean m6031d(Context context, Uri uri) {
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = true;
        Cursor cursor = null;
        try {
            cursor = contentResolver.query(uri, new String[]{"document_id"}, null, null, null);
            if (cursor.getCount() <= 0) {
                z = false;
            }
            return z;
        } catch (Exception e) {
            Log.w("DocumentFile", "Failed query: " + e);
            return false;
        } finally {
            m6030c(cursor);
        }
    }

    /* renamed from: e */
    public static String m6032e(Context context, Uri uri) {
        return m6039l(context, uri, "_display_name", null);
    }

    /* renamed from: f */
    private static String m6033f(Context context, Uri uri) {
        return m6039l(context, uri, "mime_type", null);
    }

    /* renamed from: g */
    public static boolean m6034g(Context context, Uri uri) {
        return "vnd.android.document/directory".equals(m6033f(context, uri));
    }

    /* renamed from: h */
    public static long m6035h(Context context, Uri uri) {
        return m6038k(context, uri, "last_modified", 0);
    }

    /* renamed from: i */
    public static long m6036i(Context context, Uri uri) {
        return m6038k(context, uri, "_size", 0);
    }

    /* renamed from: j */
    private static int m6037j(Context context, Uri uri, String str, int i) {
        return (int) m6038k(context, uri, str, (long) i);
    }

    /* renamed from: k */
    private static long m6038k(Context context, Uri uri, String str, long j) {
        AutoCloseable autoCloseable = null;
        try {
            autoCloseable = context.getContentResolver().query(uri, new String[]{str}, null, null, null);
            if (autoCloseable.moveToFirst() && !autoCloseable.isNull(0)) {
                return autoCloseable.getLong(0);
            }
            m6030c(autoCloseable);
            return j;
        } catch (Exception e) {
            Log.w("DocumentFile", "Failed query: " + e);
            return j;
        } finally {
            m6030c(autoCloseable);
        }
    }

    /* renamed from: l */
    private static String m6039l(Context context, Uri uri, String str, String str2) {
        AutoCloseable autoCloseable = null;
        try {
            autoCloseable = context.getContentResolver().query(uri, new String[]{str}, null, null, null);
            if (autoCloseable.moveToFirst() && !autoCloseable.isNull(0)) {
                return autoCloseable.getString(0);
            }
            m6030c(autoCloseable);
            return str2;
        } catch (Exception e) {
            Log.w("DocumentFile", "Failed query: " + e);
            return str2;
        } finally {
            m6030c(autoCloseable);
        }
    }
}
