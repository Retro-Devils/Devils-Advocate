package p006b.p061r.p062a.p063a;

import android.content.ContentValues;
import android.net.Uri;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import p006b.p061r.p062a.p063a.AbstractC1171b;

/* renamed from: b.r.a.a.a */
public abstract class AbstractC1169a extends AbstractC1171b {

    /* renamed from: c */
    public static final String[] f5213c = m6399a();

    /* renamed from: b.r.a.a.a$a */
    public static abstract class AbstractC1170a<T extends AbstractC1170a> extends AbstractC1171b.AbstractC1172a<T> {

        /* renamed from: b */
        private static final SimpleDateFormat f5214b;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
            f5214b = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT-0"));
        }

        /* renamed from: d */
        public T mo5883d(Uri uri) {
            this.f5217a.put("intent_uri", uri == null ? null : uri.toString());
            return this;
        }

        /* renamed from: e */
        public T mo5884e(String str) {
            this.f5217a.put("internal_provider_id", str);
            return this;
        }

        /* renamed from: f */
        public T mo5885f(int i) {
            this.f5217a.put("poster_art_aspect_ratio", Integer.valueOf(i));
            return this;
        }

        /* renamed from: g */
        public T mo5886g(int i) {
            this.f5217a.put("type", Integer.valueOf(i));
            return this;
        }
    }

    AbstractC1169a(AbstractC1170a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    private static String[] m6399a() {
        return (String[]) C1176e.m6419a(AbstractC1171b.f5215a, new String[]{"internal_provider_id", "preview_video_uri", "last_playback_position_millis", "duration_millis", "intent_uri", "transient", "type", "poster_art_aspect_ratio", "poster_thumbnail_aspect_ratio", "logo_uri", "availability", "starting_price", "offer_price", "release_date", "item_count", "live", "interaction_type", "interaction_count", "author", "browsable", "content_id", "logo_content_description", "genre", "start_time_utc_millis", "end_time_utc_millis", "preview_audio_uri", "tv_series_item_type"});
    }

    /* renamed from: c */
    public ContentValues mo5882c(boolean z) {
        ContentValues b = super.mo5887b();
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            b.remove("internal_provider_id");
            b.remove("preview_video_uri");
            b.remove("last_playback_position_millis");
            b.remove("duration_millis");
            b.remove("intent_uri");
            b.remove("transient");
            b.remove("type");
            b.remove("poster_art_aspect_ratio");
            b.remove("poster_thumbnail_aspect_ratio");
            b.remove("logo_uri");
            b.remove("availability");
            b.remove("starting_price");
            b.remove("offer_price");
            b.remove("release_date");
            b.remove("item_count");
            b.remove("live");
            b.remove("interaction_count");
            b.remove("author");
            b.remove("content_id");
            b.remove("logo_content_description");
            b.remove("genre");
            b.remove("start_time_utc_millis");
            b.remove("end_time_utc_millis");
            b.remove("preview_audio_uri");
            b.remove("tv_series_item_type");
        }
        if (i < 26 || !z) {
            b.remove("browsable");
        }
        return b;
    }
}
