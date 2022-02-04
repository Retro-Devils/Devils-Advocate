package android.support.p004v4.media;

import android.media.MediaDescription;
import android.net.Uri;

/* access modifiers changed from: package-private */
/* renamed from: android.support.v4.media.c */
public class C0015c {

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v4.media.c$a */
    public static class C0016a {
        /* renamed from: a */
        public static void m48a(Object obj, Uri uri) {
            ((MediaDescription.Builder) obj).setMediaUri(uri);
        }
    }

    /* renamed from: a */
    public static Uri m47a(Object obj) {
        return ((MediaDescription) obj).getMediaUri();
    }
}
