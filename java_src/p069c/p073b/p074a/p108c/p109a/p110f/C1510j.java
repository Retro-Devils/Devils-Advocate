package p069c.p073b.p074a.p108c.p109a.p110f;

import android.content.Context;
import android.content.res.Resources;
import java.util.Locale;
import java.util.Map;

/* renamed from: c.b.a.c.a.f.j */
public final class C1510j {

    /* renamed from: a */
    public final String f6290a;

    /* renamed from: b */
    public final String f6291b;

    /* renamed from: c */
    public final String f6292c;

    /* renamed from: d */
    public final String f6293d;

    /* renamed from: e */
    public final String f6294e;

    /* renamed from: f */
    public final String f6295f;

    /* renamed from: g */
    public final String f6296g;

    /* renamed from: h */
    public final String f6297h;

    /* renamed from: i */
    public final String f6298i;

    /* renamed from: j */
    public final String f6299j;

    public C1510j(Context context) {
        Resources resources = context.getResources();
        Map<String, String> a = C1532t.m7511a((resources == null || resources.getConfiguration() == null || resources.getConfiguration().locale == null) ? Locale.getDefault() : resources.getConfiguration().locale);
        this.f6290a = a.get("error_initializing_player");
        this.f6291b = a.get("get_youtube_app_title");
        this.f6292c = a.get("get_youtube_app_text");
        this.f6293d = a.get("get_youtube_app_action");
        this.f6294e = a.get("enable_youtube_app_title");
        this.f6295f = a.get("enable_youtube_app_text");
        this.f6296g = a.get("enable_youtube_app_action");
        this.f6297h = a.get("update_youtube_app_title");
        this.f6298i = a.get("update_youtube_app_text");
        this.f6299j = a.get("update_youtube_app_action");
    }
}
