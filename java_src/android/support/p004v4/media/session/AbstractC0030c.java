package android.support.p004v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.support.p004v4.media.MediaMetadataCompat;
import android.support.p004v4.media.session.AbstractC0025a;
import android.support.p004v4.media.session.C0035e;
import android.support.p004v4.media.session.MediaSessionCompat;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: android.support.v4.media.session.c */
public abstract class AbstractC0030c implements IBinder.DeathRecipient {

    /* renamed from: a */
    final Object f72a;

    /* renamed from: b */
    HandlerC0031a f73b;

    /* renamed from: c */
    AbstractC0025a f74c;

    /* access modifiers changed from: private */
    /* renamed from: android.support.v4.media.session.c$a */
    public class HandlerC0031a extends Handler {
    }

    /* renamed from: android.support.v4.media.session.c$b */
    private static class C0032b implements C0035e.AbstractC0036a {

        /* renamed from: a */
        private final WeakReference<AbstractC0030c> f75a;

        C0032b(AbstractC0030c cVar) {
            this.f75a = new WeakReference<>(cVar);
        }

        @Override // android.support.p004v4.media.session.C0035e.AbstractC0036a
        /* renamed from: a */
        public void mo123a(Object obj) {
            AbstractC0030c cVar = this.f75a.get();
            if (cVar != null && cVar.f74c == null) {
                cVar.mo117d(PlaybackStateCompat.m71b(obj));
            }
        }

        @Override // android.support.p004v4.media.session.C0035e.AbstractC0036a
        /* renamed from: b */
        public void mo124b(Object obj) {
            AbstractC0030c cVar = this.f75a.get();
            if (cVar != null) {
                cVar.mo116c(MediaMetadataCompat.m24b(obj));
            }
        }

        @Override // android.support.p004v4.media.session.C0035e.AbstractC0036a
        /* renamed from: c */
        public void mo125c(int i, int i2, int i3, int i4, int i5) {
            AbstractC0030c cVar = this.f75a.get();
            if (cVar != null) {
                cVar.mo113a(new C0034d(i, i2, i3, i4, i5));
            }
        }

        @Override // android.support.p004v4.media.session.C0035e.AbstractC0036a
        /* renamed from: d */
        public void mo126d(List<?> list) {
            AbstractC0030c cVar = this.f75a.get();
            if (cVar != null) {
                cVar.mo118e(MediaSessionCompat.QueueItem.m59g(list));
            }
        }

        @Override // android.support.p004v4.media.session.C0035e.AbstractC0036a
        /* renamed from: e */
        public void mo127e(CharSequence charSequence) {
            AbstractC0030c cVar = this.f75a.get();
            if (cVar != null) {
                cVar.mo119f(charSequence);
            }
        }

        @Override // android.support.p004v4.media.session.C0035e.AbstractC0036a
        /* renamed from: f */
        public void mo128f(String str, Bundle bundle) {
            AbstractC0030c cVar = this.f75a.get();
            if (cVar == null) {
                return;
            }
            if (cVar.f74c == null || Build.VERSION.SDK_INT >= 23) {
                cVar.mo121h(str, bundle);
            }
        }

        @Override // android.support.p004v4.media.session.C0035e.AbstractC0036a
        /* renamed from: g */
        public void mo129g() {
            AbstractC0030c cVar = this.f75a.get();
            if (cVar != null) {
                cVar.mo120g();
            }
        }

        @Override // android.support.p004v4.media.session.C0035e.AbstractC0036a
        /* renamed from: l */
        public void mo130l(Bundle bundle) {
            AbstractC0030c cVar = this.f75a.get();
            if (cVar != null) {
                cVar.mo114b(bundle);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: android.support.v4.media.session.c$c */
    public static class BinderC0033c extends AbstractC0025a.AbstractBinderC0026a {

        /* renamed from: a */
        private final WeakReference<AbstractC0030c> f76a;

        BinderC0033c(AbstractC0030c cVar) {
            this.f76a = new WeakReference<>(cVar);
        }

        @Override // android.support.p004v4.media.session.AbstractC0025a
        /* renamed from: B */
        public void mo52B(MediaMetadataCompat mediaMetadataCompat) {
            AbstractC0030c cVar = this.f76a.get();
            if (cVar != null) {
                cVar.mo122i(3, mediaMetadataCompat, null);
            }
        }

        @Override // android.support.p004v4.media.session.AbstractC0025a
        /* renamed from: N */
        public void mo102N(int i) {
            AbstractC0030c cVar = this.f76a.get();
            if (cVar != null) {
                cVar.mo122i(9, Integer.valueOf(i), null);
            }
        }

        @Override // android.support.p004v4.media.session.AbstractC0025a
        /* renamed from: U */
        public void mo103U(boolean z) {
            AbstractC0030c cVar = this.f76a.get();
            if (cVar != null) {
                cVar.mo122i(11, Boolean.valueOf(z), null);
            }
        }

        @Override // android.support.p004v4.media.session.AbstractC0025a
        /* renamed from: d */
        public void mo53d(List<MediaSessionCompat.QueueItem> list) {
            AbstractC0030c cVar = this.f76a.get();
            if (cVar != null) {
                cVar.mo122i(5, list, null);
            }
        }

        @Override // android.support.p004v4.media.session.AbstractC0025a
        /* renamed from: e */
        public void mo54e(CharSequence charSequence) {
            AbstractC0030c cVar = this.f76a.get();
            if (cVar != null) {
                cVar.mo122i(6, charSequence, null);
            }
        }

        @Override // android.support.p004v4.media.session.AbstractC0025a
        /* renamed from: f0 */
        public void mo104f0(int i) {
            AbstractC0030c cVar = this.f76a.get();
            if (cVar != null) {
                cVar.mo122i(12, Integer.valueOf(i), null);
            }
        }

        @Override // android.support.p004v4.media.session.AbstractC0025a
        /* renamed from: g */
        public void mo55g() {
            AbstractC0030c cVar = this.f76a.get();
            if (cVar != null) {
                cVar.mo122i(8, null, null);
            }
        }

        @Override // android.support.p004v4.media.session.AbstractC0025a
        /* renamed from: h0 */
        public void mo105h0() {
            AbstractC0030c cVar = this.f76a.get();
            if (cVar != null) {
                cVar.mo122i(13, null, null);
            }
        }

        @Override // android.support.p004v4.media.session.AbstractC0025a
        /* renamed from: k0 */
        public void mo106k0(PlaybackStateCompat playbackStateCompat) {
            AbstractC0030c cVar = this.f76a.get();
            if (cVar != null) {
                cVar.mo122i(2, playbackStateCompat, null);
            }
        }

        @Override // android.support.p004v4.media.session.AbstractC0025a
        /* renamed from: l */
        public void mo56l(Bundle bundle) {
            AbstractC0030c cVar = this.f76a.get();
            if (cVar != null) {
                cVar.mo122i(7, bundle, null);
            }
        }

        @Override // android.support.p004v4.media.session.AbstractC0025a
        /* renamed from: l0 */
        public void mo107l0(String str, Bundle bundle) {
            AbstractC0030c cVar = this.f76a.get();
            if (cVar != null) {
                cVar.mo122i(1, str, bundle);
            }
        }

        @Override // android.support.p004v4.media.session.AbstractC0025a
        /* renamed from: o */
        public void mo108o(boolean z) {
        }

        @Override // android.support.p004v4.media.session.AbstractC0025a
        /* renamed from: u0 */
        public void mo57u0(ParcelableVolumeInfo parcelableVolumeInfo) {
            AbstractC0030c cVar = this.f76a.get();
            if (cVar != null) {
                cVar.mo122i(4, parcelableVolumeInfo != null ? new C0034d(parcelableVolumeInfo.f49b, parcelableVolumeInfo.f50c, parcelableVolumeInfo.f51d, parcelableVolumeInfo.f52e, parcelableVolumeInfo.f53f) : null, null);
            }
        }
    }

    public AbstractC0030c() {
        BinderC0033c cVar;
        if (Build.VERSION.SDK_INT >= 21) {
            cVar = C0035e.m123a(new C0032b(this));
        } else {
            BinderC0033c cVar2 = new BinderC0033c(this);
            this.f74c = cVar2;
            cVar = cVar2;
        }
        this.f72a = cVar;
    }

    /* renamed from: a */
    public void mo113a(C0034d dVar) {
    }

    /* renamed from: b */
    public void mo114b(Bundle bundle) {
    }

    public void binderDied() {
        mo122i(8, null, null);
    }

    /* renamed from: c */
    public void mo116c(MediaMetadataCompat mediaMetadataCompat) {
    }

    /* renamed from: d */
    public void mo117d(PlaybackStateCompat playbackStateCompat) {
    }

    /* renamed from: e */
    public void mo118e(List<MediaSessionCompat.QueueItem> list) {
    }

    /* renamed from: f */
    public void mo119f(CharSequence charSequence) {
    }

    /* renamed from: g */
    public void mo120g() {
    }

    /* renamed from: h */
    public void mo121h(String str, Bundle bundle) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo122i(int i, Object obj, Bundle bundle) {
        if (this.f73b != null) {
            throw null;
        }
    }
}
