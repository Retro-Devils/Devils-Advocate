package android.support.p004v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.p004v4.media.session.MediaSessionCompat;
import java.util.ArrayList;
import p000a.p001a.p002a.p003a.C0003b;

/* renamed from: android.support.v4.media.MediaBrowserCompat$SearchResultReceiver */
class MediaBrowserCompat$SearchResultReceiver extends C0003b {
    /* access modifiers changed from: protected */
    @Override // p000a.p001a.p002a.p003a.C0003b
    /* renamed from: b */
    public void mo5b(int i, Bundle bundle) {
        MediaSessionCompat.m57a(bundle);
        if (i != 0 || bundle == null || !bundle.containsKey("search_results")) {
            throw null;
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
        if (parcelableArray != null) {
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add((MediaBrowserCompat$MediaItem) parcelable);
            }
        }
        throw null;
    }
}
