package android.support.p004v4.media.session;

import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.List;

/* renamed from: android.support.v4.media.session.e */
class C0035e {

    /* renamed from: android.support.v4.media.session.e$a */
    public interface AbstractC0036a {
        /* renamed from: a */
        void mo123a(Object obj);

        /* renamed from: b */
        void mo124b(Object obj);

        /* renamed from: c */
        void mo125c(int i, int i2, int i3, int i4, int i5);

        /* renamed from: d */
        void mo126d(List<?> list);

        /* renamed from: e */
        void mo127e(CharSequence charSequence);

        /* renamed from: f */
        void mo128f(String str, Bundle bundle);

        /* renamed from: g */
        void mo129g();

        /* renamed from: l */
        void mo130l(Bundle bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: android.support.v4.media.session.e$b */
    public static class C0037b<T extends AbstractC0036a> extends MediaController.Callback {

        /* renamed from: a */
        protected final T f82a;

        public C0037b(T t) {
            this.f82a = t;
        }

        public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
            this.f82a.mo125c(playbackInfo.getPlaybackType(), C0038c.m133b(playbackInfo), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
        }

        public void onExtrasChanged(Bundle bundle) {
            MediaSessionCompat.m57a(bundle);
            this.f82a.mo130l(bundle);
        }

        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            this.f82a.mo124b(mediaMetadata);
        }

        public void onPlaybackStateChanged(PlaybackState playbackState) {
            this.f82a.mo123a(playbackState);
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueChanged(List<MediaSession.QueueItem> list) {
            this.f82a.mo126d(list);
        }

        public void onQueueTitleChanged(CharSequence charSequence) {
            this.f82a.mo127e(charSequence);
        }

        public void onSessionDestroyed() {
            this.f82a.mo129g();
        }

        public void onSessionEvent(String str, Bundle bundle) {
            MediaSessionCompat.m57a(bundle);
            this.f82a.mo128f(str, bundle);
        }
    }

    /* renamed from: android.support.v4.media.session.e$c */
    public static class C0038c {
        /* renamed from: a */
        public static AudioAttributes m132a(Object obj) {
            return ((MediaController.PlaybackInfo) obj).getAudioAttributes();
        }

        /* renamed from: b */
        public static int m133b(Object obj) {
            return m134c(m132a(obj));
        }

        /* renamed from: c */
        private static int m134c(AudioAttributes audioAttributes) {
            if ((audioAttributes.getFlags() & 1) == 1) {
                return 7;
            }
            if ((audioAttributes.getFlags() & 4) == 4) {
                return 6;
            }
            int usage = audioAttributes.getUsage();
            if (usage == 13) {
                return 1;
            }
            switch (usage) {
                case 2:
                    return 0;
                case 3:
                    return 8;
                case 4:
                    return 4;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    return 5;
                case 6:
                    return 2;
                default:
                    return 3;
            }
        }
    }

    /* renamed from: a */
    public static Object m123a(AbstractC0036a aVar) {
        return new C0037b(aVar);
    }
}
