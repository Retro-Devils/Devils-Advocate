package p006b.p061r.p062a.p063a;

import android.content.ContentUris;
import android.content.Context;
import android.media.tv.TvContract;
import android.net.Uri;
import android.os.Build;
import android.provider.BaseColumns;
import java.util.HashMap;
import java.util.Map;

/* renamed from: b.r.a.a.g */
public final class C1179g {

    /* renamed from: b.r.a.a.g$a */
    public static final class C1180a implements BaseColumns {

        /* renamed from: a */
        public static final Uri f5215a = Uri.parse("content://android.media.tv/channel");

        /* renamed from: b */
        private static final Map<String, String> f5216b;

        static {
            HashMap hashMap = new HashMap();
            f5216b = hashMap;
            hashMap.put("VIDEO_FORMAT_480I", "VIDEO_RESOLUTION_SD");
            hashMap.put("VIDEO_FORMAT_480P", "VIDEO_RESOLUTION_ED");
            hashMap.put("VIDEO_FORMAT_576I", "VIDEO_RESOLUTION_SD");
            hashMap.put("VIDEO_FORMAT_576P", "VIDEO_RESOLUTION_ED");
            hashMap.put("VIDEO_FORMAT_720P", "VIDEO_RESOLUTION_HD");
            hashMap.put("VIDEO_FORMAT_1080I", "VIDEO_RESOLUTION_HD");
            hashMap.put("VIDEO_FORMAT_1080P", "VIDEO_RESOLUTION_FHD");
            hashMap.put("VIDEO_FORMAT_2160P", "VIDEO_RESOLUTION_UHD");
            hashMap.put("VIDEO_FORMAT_4320P", "VIDEO_RESOLUTION_UHD");
        }
    }

    /* renamed from: b.r.a.a.g$b */
    public static final class C1181b implements BaseColumns {

        /* renamed from: a */
        public static final Uri f5217a = Uri.parse("content://android.media.tv/preview_program");
    }

    /* renamed from: a */
    public static Uri m6426a(long j) {
        return ContentUris.withAppendedId(C1181b.f5217a, j);
    }

    /* renamed from: b */
    public static void m6427b(Context context, long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            TvContract.requestChannelBrowsable(context, j);
        }
    }
}
