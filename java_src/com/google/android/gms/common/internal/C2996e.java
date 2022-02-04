package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.util.C3043e;
import javax.annotation.concurrent.GuardedBy;
import p006b.p021d.C0838i;
import p069c.p073b.p074a.p075a.p076a.C1278b;
import p069c.p073b.p074a.p075a.p077b.C1285f;
import p069c.p073b.p074a.p075a.p077b.C1288i;
import p069c.p073b.p074a.p075a.p077b.p079l.C1292b;

/* renamed from: com.google.android.gms.common.internal.e */
public final class C2996e {
    @GuardedBy("sCache")

    /* renamed from: a */
    private static final C0838i<String, String> f9974a = new C0838i<>();

    /* renamed from: a */
    public static String m12296a(Context context) {
        String packageName = context.getPackageName();
        try {
            return C1292b.m6810a(context).mo6296b(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    /* renamed from: b */
    public static String m12297b(Context context) {
        return context.getResources().getString(C1278b.common_google_play_services_notification_channel_name);
    }

    /* renamed from: c */
    public static String m12298c(Context context, int i) {
        return context.getResources().getString(i != 1 ? i != 2 ? i != 3 ? 17039370 : C1278b.common_google_play_services_enable_button : C1278b.common_google_play_services_update_button : C1278b.common_google_play_services_install_button);
    }

    /* renamed from: d */
    public static String m12299d(Context context, int i) {
        Resources resources = context.getResources();
        String a = m12296a(context);
        if (i == 1) {
            return resources.getString(C1278b.common_google_play_services_install_text, a);
        } else if (i != 2) {
            if (i == 3) {
                return resources.getString(C1278b.common_google_play_services_enable_text, a);
            } else if (i == 5) {
                return m12304i(context, "common_google_play_services_invalid_account_text", a);
            } else {
                if (i == 7) {
                    return m12304i(context, "common_google_play_services_network_error_text", a);
                }
                if (i == 9) {
                    return resources.getString(C1278b.common_google_play_services_unsupported_text, a);
                } else if (i == 20) {
                    return m12304i(context, "common_google_play_services_restricted_profile_text", a);
                } else {
                    switch (i) {
                        case 16:
                            return m12304i(context, "common_google_play_services_api_unavailable_text", a);
                        case 17:
                            return m12304i(context, "common_google_play_services_sign_in_failed_text", a);
                        case 18:
                            return resources.getString(C1278b.common_google_play_services_updating_text, a);
                        default:
                            return resources.getString(C1288i.common_google_play_services_unknown_issue, a);
                    }
                }
            }
        } else if (C3043e.m12440c(context)) {
            return resources.getString(C1278b.common_google_play_services_wear_update_text);
        } else {
            return resources.getString(C1278b.common_google_play_services_update_text, a);
        }
    }

    /* renamed from: e */
    public static String m12300e(Context context, int i) {
        return i == 6 ? m12304i(context, "common_google_play_services_resolution_required_text", m12296a(context)) : m12299d(context, i);
    }

    /* renamed from: f */
    public static String m12301f(Context context, int i) {
        String h = i == 6 ? m12303h(context, "common_google_play_services_resolution_required_title") : m12302g(context, i);
        return h == null ? context.getResources().getString(C1278b.common_google_play_services_notification_ticker) : h;
    }

    /* renamed from: g */
    public static String m12302g(Context context, int i) {
        String str;
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(C1278b.common_google_play_services_install_title);
            case 2:
                return resources.getString(C1278b.common_google_play_services_update_title);
            case 3:
                return resources.getString(C1278b.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return m12303h(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return m12303h(context, "common_google_play_services_network_error_title");
            case 8:
                str = "Internal error occurred. Please see logs for detailed information";
                break;
            case 9:
                str = "Google Play services is invalid. Cannot recover.";
                break;
            case 10:
                str = "Developer error occurred. Please see logs for detailed information";
                break;
            case 11:
                str = "The application is not licensed to the user.";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i);
                str = sb.toString();
                break;
            case 16:
                str = "One of the API components you attempted to connect to is not available.";
                break;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return m12303h(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return m12303h(context, "common_google_play_services_restricted_profile_title");
        }
        Log.e("GoogleApiAvailability", str);
        return null;
    }

    /* renamed from: h */
    private static String m12303h(Context context, String str) {
        C0838i<String, String> iVar = f9974a;
        synchronized (iVar) {
            String str2 = iVar.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources b = C1285f.m6789b(context);
            if (b == null) {
                return null;
            }
            int identifier = b.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                String valueOf = String.valueOf(str);
                Log.w("GoogleApiAvailability", valueOf.length() != 0 ? "Missing resource: ".concat(valueOf) : new String("Missing resource: "));
                return null;
            }
            String string = b.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                String valueOf2 = String.valueOf(str);
                Log.w("GoogleApiAvailability", valueOf2.length() != 0 ? "Got empty resource: ".concat(valueOf2) : new String("Got empty resource: "));
                return null;
            }
            iVar.put(str, string);
            return string;
        }
    }

    /* renamed from: i */
    private static String m12304i(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String h = m12303h(context, str);
        if (h == null) {
            h = resources.getString(C1288i.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, h, str2);
    }
}
