package p069c.p073b.p074a.p108c.p109a.p110f;

import android.content.Context;
import android.content.res.Resources;
import java.util.Locale;
import java.util.Map;

/* renamed from: c.b.a.c.a.f.j */
public final class C1510j {

    /* renamed from: a */
    public final String f6298a;

    /* renamed from: b */
    public final String f6299b;

    /* renamed from: c */
    public final String f6300c;

    /* renamed from: d */
    public final String f6301d;

    /* renamed from: e */
    public final String f6302e;

    /* renamed from: f */
    public final String f6303f;

    /* renamed from: g */
    public final String f6304g;

    /* renamed from: h */
    public final String f6305h;

    /* renamed from: i */
    public final String f6306i;

    /* renamed from: j */
    public final String f6307j;

    public C1510j(Context context) {
        Resources resources = context.getResources();
        Map<String, String> a = C1532t.m7511a((resources == null || resources.getConfiguration() == null || resources.getConfiguration().locale == null) ? Locale.getDefault() : resources.getConfiguration().locale);
        this.f6298a = a.get("error_initializing_player");
        this.f6299b = a.get("get_youtube_app_title");
        this.f6300c = a.get("get_youtube_app_text");
        this.f6301d = a.get("get_youtube_app_action");
        this.f6302e = a.get("enable_youtube_app_title");
        this.f6303f = a.get("enable_youtube_app_text");
        this.f6304g = a.get("enable_youtube_app_action");
        this.f6305h = a.get("update_youtube_app_title");
        this.f6306i = a.get("update_youtube_app_text");
        this.f6307j = a.get("update_youtube_app_action");
    }
}
