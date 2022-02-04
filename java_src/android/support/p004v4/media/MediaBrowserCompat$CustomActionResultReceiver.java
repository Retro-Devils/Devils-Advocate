package android.support.p004v4.media;

import android.os.Bundle;
import android.support.p004v4.media.session.MediaSessionCompat;
import android.util.Log;
import p000a.p001a.p002a.p003a.C0003b;

/* renamed from: android.support.v4.media.MediaBrowserCompat$CustomActionResultReceiver */
class MediaBrowserCompat$CustomActionResultReceiver extends C0003b {

    /* renamed from: e */
    private final Bundle f8e;

    /* renamed from: f */
    private final AbstractC0012a f9f;

    /* access modifiers changed from: protected */
    @Override // p000a.p001a.p002a.p003a.C0003b
    /* renamed from: b */
    public void mo5b(int i, Bundle bundle) {
        if (this.f9f != null) {
            MediaSessionCompat.m57a(bundle);
            if (i == -1) {
                throw null;
            } else if (i == 0) {
                throw null;
            } else if (i != 1) {
                Log.w("MediaBrowserCompat", "Unknown result code: " + i + " (extras=" + this.f8e + ", resultData=" + bundle + ")");
            } else {
                throw null;
            }
        }
    }
}
