package p006b.p061r.p062a.p063a;

import android.content.ContentValues;
import android.net.Uri;
import android.os.Build;

/* renamed from: b.r.a.a.b */
public abstract class AbstractC1171b {

    /* renamed from: a */
    public static final String[] f5208a = m6405a();

    /* renamed from: b */
    protected ContentValues f5209b;

    /* renamed from: b.r.a.a.b$a */
    public static abstract class AbstractC1172a<T extends AbstractC1172a> {

        /* renamed from: a */
        protected ContentValues f5210a = new ContentValues();

        /* renamed from: a */
        public T mo5889a(String str) {
            this.f5210a.put("short_description", str);
            return this;
        }

        /* renamed from: b */
        public T mo5890b(Uri uri) {
            this.f5210a.put("poster_art_uri", uri == null ? null : uri.toString());
            return this;
        }

        /* renamed from: c */
        public T mo5891c(String str) {
            this.f5210a.put("title", str);
            return this;
        }
    }

    AbstractC1171b(AbstractC1172a aVar) {
        this.f5209b = aVar.f5210a;
    }

    /* renamed from: a */
    private static String[] m6405a() {
        Object[] a;
        String[] strArr = new String[16];
        strArr[0] = "_id";
        strArr[1] = "package_name";
        strArr[2] = "title";
        strArr[3] = "episode_title";
        int i = Build.VERSION.SDK_INT;
        strArr[4] = i >= 24 ? "season_display_number" : "season_number";
        strArr[5] = i >= 24 ? "episode_display_number" : "episode_number";
        strArr[6] = "short_description";
        strArr[7] = "long_description";
        strArr[8] = "poster_art_uri";
        strArr[9] = "thumbnail_uri";
        strArr[10] = "audio_language";
        strArr[11] = "canonical_genre";
        strArr[12] = "content_rating";
        strArr[13] = "video_width";
        strArr[14] = "video_height";
        strArr[15] = "internal_provider_data";
        String[] strArr2 = {"searchable", "internal_provider_flag1", "internal_provider_flag2", "internal_provider_flag3", "internal_provider_flag4"};
        String[] strArr3 = {"season_title"};
        String[] strArr4 = {"review_rating", "review_rating_style"};
        if (i >= 26) {
            a = C1176e.m6419a(strArr, strArr2, strArr3, strArr4);
        } else if (i >= 24) {
            a = C1176e.m6419a(strArr, strArr2, strArr3);
        } else if (i < 23) {
            return strArr;
        } else {
            a = C1176e.m6419a(strArr, strArr2);
        }
        return (String[]) a;
    }

    /* renamed from: b */
    public ContentValues mo5887b() {
        ContentValues contentValues = new ContentValues(this.f5209b);
        int i = Build.VERSION.SDK_INT;
        if (i < 23) {
            contentValues.remove("searchable");
            contentValues.remove("internal_provider_flag1");
            contentValues.remove("internal_provider_flag2");
            contentValues.remove("internal_provider_flag3");
            contentValues.remove("internal_provider_flag4");
        }
        if (i < 24) {
            contentValues.remove("season_title");
        }
        if (i < 26) {
            contentValues.remove("review_rating_style");
            contentValues.remove("review_rating");
        }
        return contentValues;
    }

    public int hashCode() {
        return this.f5209b.hashCode();
    }
}
