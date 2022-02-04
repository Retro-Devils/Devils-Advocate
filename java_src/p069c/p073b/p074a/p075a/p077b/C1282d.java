package p069c.p073b.p074a.p075a.p077b;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.app.C0364h;
import androidx.fragment.app.ActivityC0447d;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.AbstractDialogInterface$OnClickListenerC2998f;
import com.google.android.gms.common.internal.C2996e;
import com.google.android.gms.common.internal.C3027r;
import com.google.android.gms.common.util.C3043e;
import com.google.android.gms.common.util.C3044f;
import p069c.p073b.p074a.p075a.p076a.C1277a;
import p069c.p073b.p074a.p075a.p076a.C1278b;
import p069c.p073b.p074a.p075a.p081d.p082a.HandlerC1308d;

/* renamed from: c.b.a.a.b.d */
public class C1282d extends C1284e {

    /* renamed from: c */
    private static final Object f5538c = new Object();

    /* renamed from: d */
    private static final C1282d f5539d = new C1282d();

    /* renamed from: e */
    public static final int f5540e = C1284e.f5544a;

    /* renamed from: f */
    private String f5541f;

    /* access modifiers changed from: private */
    @SuppressLint({"HandlerLeak"})
    /* renamed from: c.b.a.a.b.d$a */
    public class HandlerC1283a extends HandlerC1308d {

        /* renamed from: a */
        private final Context f5542a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public HandlerC1283a(Context context) {
            super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
            this.f5542a = context.getApplicationContext();
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                StringBuilder sb = new StringBuilder(50);
                sb.append("Don't know how to handle this message: ");
                sb.append(i);
                Log.w("GoogleApiAvailability", sb.toString());
                return;
            }
            int e = C1282d.this.mo6281e(this.f5542a);
            if (C1282d.this.mo6283g(e)) {
                C1282d.this.mo6287m(this.f5542a, e);
            }
        }
    }

    /* renamed from: k */
    public static C1282d m6764k() {
        return f5539d;
    }

    /* renamed from: n */
    static Dialog m6765n(Context context, int i, AbstractDialogInterface$OnClickListenerC2998f fVar, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(C2996e.m12299d(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String c = C2996e.m12298c(context, i);
        if (c != null) {
            builder.setPositiveButton(c, fVar);
        }
        String g = C2996e.m12302g(context, i);
        if (g != null) {
            builder.setTitle(g);
        }
        return builder.create();
    }

    /* renamed from: o */
    static void m6766o(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        if (activity instanceof ActivityC0447d) {
            C1289j.m6801u2(dialog, onCancelListener).mo2665t2(((ActivityC0447d) activity).mo2668C0(), str);
            return;
        }
        DialogFragmentC1280b.m6761a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    @TargetApi(20)
    /* renamed from: q */
    private final void m6767q(Context context, int i, String str, PendingIntent pendingIntent) {
        int i2;
        if (i == 18) {
            mo6288p(context);
        } else if (pendingIntent != null) {
            String f = C2996e.m12301f(context, i);
            String e = C2996e.m12300e(context, i);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            C0364h.C0368d n = new C0364h.C0368d(context).mo2193k(true).mo2188e(true).mo2192i(f).mo2196n(new C0364h.C0366b().mo2184g(e));
            if (C3043e.m12439b(context)) {
                C3027r.m12378j(C3044f.m12446e());
                n.mo2195m(context.getApplicationInfo().icon).mo2194l(2);
                if (C3043e.m12440c(context)) {
                    n.mo2185a(C1277a.APKTOOL_DUMMY_6b, resources.getString(C1278b.common_open_on_phone), pendingIntent);
                } else {
                    n.mo2190g(pendingIntent);
                }
            } else {
                n.mo2195m(17301642).mo2197o(resources.getString(C1278b.common_google_play_services_notification_ticker)).mo2198p(System.currentTimeMillis()).mo2190g(pendingIntent).mo2191h(e);
            }
            if (C3044f.m12449h()) {
                C3027r.m12378j(C3044f.m12449h());
                String s = m6768s();
                if (s == null) {
                    s = "com.google.android.gms.availability";
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel(s);
                    String b = C2996e.m12297b(context);
                    if (notificationChannel == null) {
                        notificationChannel = new NotificationChannel(s, b, 4);
                    } else if (!b.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(b);
                    }
                    notificationManager.createNotificationChannel(notificationChannel);
                }
                n.mo2189f(s);
            }
            Notification b2 = n.mo2186b();
            if (i == 1 || i == 2 || i == 3) {
                i2 = 10436;
                C1286g.f5548b.set(false);
            } else {
                i2 = 39789;
            }
            notificationManager.notify(i2, b2);
        } else if (i == 6) {
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }

    /* renamed from: s */
    private final String m6768s() {
        String str;
        synchronized (f5538c) {
            str = this.f5541f;
        }
        return str;
    }

    @Override // p069c.p073b.p074a.p075a.p077b.C1284e
    /* renamed from: a */
    public Intent mo6278a(Context context, int i, String str) {
        return super.mo6278a(context, i, str);
    }

    @Override // p069c.p073b.p074a.p075a.p077b.C1284e
    /* renamed from: b */
    public PendingIntent mo6279b(Context context, int i, int i2) {
        return super.mo6279b(context, i, i2);
    }

    @Override // p069c.p073b.p074a.p075a.p077b.C1284e
    /* renamed from: d */
    public final String mo6280d(int i) {
        return super.mo6280d(i);
    }

    @Override // p069c.p073b.p074a.p075a.p077b.C1284e
    /* renamed from: e */
    public int mo6281e(Context context) {
        return super.mo6281e(context);
    }

    @Override // p069c.p073b.p074a.p075a.p077b.C1284e
    /* renamed from: f */
    public int mo6282f(Context context, int i) {
        return super.mo6282f(context, i);
    }

    @Override // p069c.p073b.p074a.p075a.p077b.C1284e
    /* renamed from: g */
    public final boolean mo6283g(int i) {
        return super.mo6283g(i);
    }

    /* renamed from: i */
    public Dialog mo6284i(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return m6765n(activity, i, AbstractDialogInterface$OnClickListenerC2998f.m12305a(activity, mo6278a(activity, i, "d"), i2), onCancelListener);
    }

    /* renamed from: j */
    public PendingIntent mo6285j(Context context, C1279a aVar) {
        return aVar.mo6265k() ? aVar.mo6264j() : mo6279b(context, aVar.mo6261h(), 0);
    }

    /* renamed from: l */
    public boolean mo6286l(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog i3 = mo6284i(activity, i, i2, onCancelListener);
        if (i3 == null) {
            return false;
        }
        m6766o(activity, i3, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    /* renamed from: m */
    public void mo6287m(Context context, int i) {
        m6767q(context, i, null, mo6291c(context, i, 0, "n"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final void mo6288p(Context context) {
        new HandlerC1283a(context).sendEmptyMessageDelayed(1, 120000);
    }

    /* renamed from: r */
    public final boolean mo6289r(Context context, C1279a aVar, int i) {
        PendingIntent j = mo6285j(context, aVar);
        if (j == null) {
            return false;
        }
        m6767q(context, aVar.mo6261h(), null, GoogleApiActivity.m11999a(context, j, i));
        return true;
    }
}
