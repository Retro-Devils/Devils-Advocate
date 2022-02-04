package android.support.p004v4.media.session;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.p004v4.media.MediaMetadataCompat;
import android.support.p004v4.media.session.AbstractC0027b;
import android.support.p004v4.media.session.AbstractC0030c;
import android.support.p004v4.media.session.MediaSessionCompat;
import android.util.Log;
import androidx.core.app.C0359d;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

/* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 */
class MediaControllerCompat$MediaControllerImplApi21 {

    /* renamed from: a */
    final Object f37a;

    /* renamed from: b */
    private final List<AbstractC0030c> f38b;

    /* renamed from: c */
    private HashMap<AbstractC0030c, BinderC0018a> f39c;

    /* renamed from: d */
    final MediaSessionCompat.Token f40d;

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

        /* renamed from: b */
        private WeakReference<MediaControllerCompat$MediaControllerImplApi21> f41b;

        /* access modifiers changed from: protected */
        public void onReceiveResult(int i, Bundle bundle) {
            MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21 = this.f41b.get();
            if (mediaControllerCompat$MediaControllerImplApi21 != null && bundle != null) {
                synchronized (mediaControllerCompat$MediaControllerImplApi21.f37a) {
                    mediaControllerCompat$MediaControllerImplApi21.f40d.mo74g(AbstractC0027b.AbstractBinderC0028a.m91i(C0359d.m1796a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                    mediaControllerCompat$MediaControllerImplApi21.f40d.mo75h(bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE"));
                    mediaControllerCompat$MediaControllerImplApi21.mo50a();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a */
    public static class BinderC0018a extends AbstractC0030c.BinderC0033c {
        BinderC0018a(AbstractC0030c cVar) {
            super(cVar);
        }

        @Override // android.support.p004v4.media.session.AbstractC0025a, android.support.p004v4.media.session.AbstractC0030c.BinderC0033c
        /* renamed from: B */
        public void mo52B(MediaMetadataCompat mediaMetadataCompat) {
            throw new AssertionError();
        }

        @Override // android.support.p004v4.media.session.AbstractC0025a, android.support.p004v4.media.session.AbstractC0030c.BinderC0033c
        /* renamed from: d */
        public void mo53d(List<MediaSessionCompat.QueueItem> list) {
            throw new AssertionError();
        }

        @Override // android.support.p004v4.media.session.AbstractC0025a, android.support.p004v4.media.session.AbstractC0030c.BinderC0033c
        /* renamed from: e */
        public void mo54e(CharSequence charSequence) {
            throw new AssertionError();
        }

        @Override // android.support.p004v4.media.session.AbstractC0025a, android.support.p004v4.media.session.AbstractC0030c.BinderC0033c
        /* renamed from: g */
        public void mo55g() {
            throw new AssertionError();
        }

        @Override // android.support.p004v4.media.session.AbstractC0025a, android.support.p004v4.media.session.AbstractC0030c.BinderC0033c
        /* renamed from: l */
        public void mo56l(Bundle bundle) {
            throw new AssertionError();
        }

        @Override // android.support.p004v4.media.session.AbstractC0025a, android.support.p004v4.media.session.AbstractC0030c.BinderC0033c
        /* renamed from: u0 */
        public void mo57u0(ParcelableVolumeInfo parcelableVolumeInfo) {
            throw new AssertionError();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo50a() {
        if (this.f40d.mo71b() != null) {
            for (AbstractC0030c cVar : this.f38b) {
                BinderC0018a aVar = new BinderC0018a(cVar);
                this.f39c.put(cVar, aVar);
                cVar.f74c = aVar;
                try {
                    this.f40d.mo71b().mo111y(aVar);
                    cVar.mo122i(13, null, null);
                } catch (RemoteException e) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                }
            }
            this.f38b.clear();
        }
    }
}
