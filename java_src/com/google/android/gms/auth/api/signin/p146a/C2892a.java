package com.google.android.gms.auth.api.signin.p146a;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.C3027r;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;

/* renamed from: com.google.android.gms.auth.api.signin.a.a */
public class C2892a {

    /* renamed from: a */
    private static final Lock f9738a = new ReentrantLock();
    @GuardedBy("sLk")

    /* renamed from: b */
    private static C2892a f9739b;

    /* renamed from: c */
    private final Lock f9740c = new ReentrantLock();
    @GuardedBy("mLk")

    /* renamed from: d */
    private final SharedPreferences f9741d;

    private C2892a(Context context) {
        this.f9741d = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    /* renamed from: a */
    public static C2892a m11994a(Context context) {
        C3027r.m12376h(context);
        Lock lock = f9738a;
        lock.lock();
        try {
            if (f9739b == null) {
                f9739b = new C2892a(context.getApplicationContext());
            }
            C2892a aVar = f9739b;
            lock.unlock();
            return aVar;
        } catch (Throwable th) {
            f9738a.unlock();
            throw th;
        }
    }

    /* renamed from: c */
    private static String m11995c(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    @Nullable
    /* renamed from: d */
    private final GoogleSignInAccount m11996d(String str) {
        String e;
        if (!TextUtils.isEmpty(str) && (e = m11997e(m11995c("googleSignInAccount", str))) != null) {
            try {
                return GoogleSignInAccount.m11982r(e);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: e */
    private final String m11997e(String str) {
        this.f9740c.lock();
        try {
            return this.f9741d.getString(str, null);
        } finally {
            this.f9740c.unlock();
        }
    }

    @Nullable
    /* renamed from: b */
    public GoogleSignInAccount mo9540b() {
        return m11996d(m11997e("defaultGoogleSignInAccount"));
    }
}
