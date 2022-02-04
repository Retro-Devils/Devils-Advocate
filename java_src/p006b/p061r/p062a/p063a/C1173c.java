package p006b.p061r.p062a.p063a;

import android.content.ContentValues;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;

/* renamed from: b.r.a.a.c */
public final class C1173c {

    /* renamed from: a */
    public static final String[] f5211a = m6410a();

    /* renamed from: b */
    ContentValues f5212b;

    /* renamed from: b.r.a.a.c$a */
    public static final class C1174a {

        /* renamed from: a */
        ContentValues f5213a = new ContentValues();

        /* renamed from: a */
        public C1173c mo5897a() {
            return new C1173c(this);
        }

        /* renamed from: b */
        public C1174a mo5898b(Intent intent) {
            return mo5899c(Uri.parse(intent.toUri(1)));
        }

        /* renamed from: c */
        public C1174a mo5899c(Uri uri) {
            this.f5213a.put("app_link_intent_uri", uri == null ? null : uri.toString());
            return this;
        }

        /* renamed from: d */
        public C1174a mo5900d(String str) {
            this.f5213a.put("display_name", str);
            return this;
        }

        /* renamed from: e */
        public C1174a mo5901e(String str) {
            this.f5213a.put("type", str);
            return this;
        }
    }

    C1173c(C1174a aVar) {
        this.f5212b = aVar.f5213a;
    }

    /* renamed from: a */
    private static String[] m6410a() {
        Object[] a;
        String[] strArr = {"_id", "description", "display_name", "display_number", "input_id", "internal_provider_data", "network_affiliation", "original_network_id", "package_name", "searchable", "service_id", "service_type", "transport_stream_id", "type", "video_format", "browsable", "locked"};
        String[] strArr2 = {"app_link_color", "app_link_icon_uri", "app_link_intent_uri", "app_link_poster_art_uri", "app_link_text", "internal_provider_flag1", "internal_provider_flag2", "internal_provider_flag3", "internal_provider_flag4"};
        String[] strArr3 = {"internal_provider_id", "transient", "system_approved", "configuration_display_order", "system_channel_key"};
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            a = C1176e.m6419a(strArr, strArr2, strArr3);
        } else if (i < 23) {
            return strArr;
        } else {
            a = C1176e.m6419a(strArr, strArr2);
        }
        return (String[]) a;
    }

    /* renamed from: b */
    public ContentValues mo5892b() {
        return mo5893c(false);
    }

    /* renamed from: c */
    public ContentValues mo5893c(boolean z) {
        ContentValues contentValues = new ContentValues(this.f5212b);
        int i = Build.VERSION.SDK_INT;
        if (i < 23) {
            contentValues.remove("app_link_color");
            contentValues.remove("app_link_text");
            contentValues.remove("app_link_icon_uri");
            contentValues.remove("app_link_poster_art_uri");
            contentValues.remove("app_link_intent_uri");
            contentValues.remove("internal_provider_flag1");
            contentValues.remove("internal_provider_flag2");
            contentValues.remove("internal_provider_flag3");
            contentValues.remove("internal_provider_flag4");
        }
        if (i < 26) {
            contentValues.remove("internal_provider_id");
            contentValues.remove("transient");
            contentValues.remove("configuration_display_order");
            contentValues.remove("system_channel_key");
        }
        if (!z) {
            contentValues.remove("browsable");
            contentValues.remove("locked");
        }
        if (i < 26 || !z) {
            contentValues.remove("system_approved");
        }
        return contentValues;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1173c)) {
            return false;
        }
        return this.f5212b.equals(((C1173c) obj).f5212b);
    }

    public int hashCode() {
        return this.f5212b.hashCode();
    }

    public String toString() {
        return "Channel{" + this.f5212b.toString() + "}";
    }
}
