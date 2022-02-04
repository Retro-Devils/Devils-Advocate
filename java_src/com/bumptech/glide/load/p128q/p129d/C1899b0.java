package com.bumptech.glide.load.p128q.p129d;

import android.annotation.TargetApi;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.AbstractC1649k;
import com.bumptech.glide.load.C1644h;
import com.bumptech.glide.load.C1647i;
import com.bumptech.glide.load.p122o.AbstractC1794v;
import com.bumptech.glide.load.p122o.p123a0.AbstractC1695e;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.q.d.b0 */
public class C1899b0<T> implements AbstractC1649k<T, Bitmap> {

    /* renamed from: a */
    public static final C1644h<Long> f7167a = C1644h.m7869a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new C1900a());

    /* renamed from: b */
    public static final C1644h<Integer> f7168b = C1644h.m7869a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new C1901b());

    /* renamed from: c */
    private static final C1905e f7169c = new C1905e();

    /* renamed from: d */
    private final AbstractC1906f<T> f7170d;

    /* renamed from: e */
    private final AbstractC1695e f7171e;

    /* renamed from: f */
    private final C1905e f7172f;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.q.d.b0$a */
    public class C1900a implements C1644h.AbstractC1646b<Long> {

        /* renamed from: a */
        private final ByteBuffer f7173a = ByteBuffer.allocate(8);

        C1900a() {
        }

        /* renamed from: b */
        public void mo7083a(byte[] bArr, Long l, MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f7173a) {
                this.f7173a.position(0);
                messageDigest.update(this.f7173a.putLong(l.longValue()).array());
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.q.d.b0$b */
    class C1901b implements C1644h.AbstractC1646b<Integer> {

        /* renamed from: a */
        private final ByteBuffer f7174a = ByteBuffer.allocate(4);

        C1901b() {
        }

        /* renamed from: b */
        public void mo7083a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            if (num != null) {
                messageDigest.update(bArr);
                synchronized (this.f7174a) {
                    this.f7174a.position(0);
                    messageDigest.update(this.f7174a.putInt(num.intValue()).array());
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.q.d.b0$c */
    public static final class C1902c implements AbstractC1906f<AssetFileDescriptor> {
        private C1902c() {
        }

        /* synthetic */ C1902c(C1900a aVar) {
            this();
        }

        /* renamed from: b */
        public void mo7491a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.q.d.b0$d */
    public static final class C1903d implements AbstractC1906f<ByteBuffer> {

        /* access modifiers changed from: package-private */
        /* renamed from: com.bumptech.glide.load.q.d.b0$d$a */
        public class C1904a extends MediaDataSource {

            /* renamed from: b */
            final /* synthetic */ ByteBuffer f7175b;

            C1904a(ByteBuffer byteBuffer) {
                this.f7175b = byteBuffer;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // android.media.MediaDataSource
            public long getSize() {
                return (long) this.f7175b.limit();
            }

            @Override // android.media.MediaDataSource
            public int readAt(long j, byte[] bArr, int i, int i2) {
                if (j >= ((long) this.f7175b.limit())) {
                    return -1;
                }
                this.f7175b.position((int) j);
                int min = Math.min(i2, this.f7175b.remaining());
                this.f7175b.get(bArr, i, min);
                return min;
            }
        }

        C1903d() {
        }

        /* renamed from: b */
        public void mo7491a(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(new C1904a(byteBuffer));
        }
    }

    /* renamed from: com.bumptech.glide.load.q.d.b0$e */
    static class C1905e {
        C1905e() {
        }

        /* renamed from: a */
        public MediaMetadataRetriever mo7497a() {
            return new MediaMetadataRetriever();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.q.d.b0$f */
    public interface AbstractC1906f<T> {
        /* renamed from: a */
        void mo7491a(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.q.d.b0$g */
    public static final class C1907g implements AbstractC1906f<ParcelFileDescriptor> {
        C1907g() {
        }

        /* renamed from: b */
        public void mo7491a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    C1899b0(AbstractC1695e eVar, AbstractC1906f<T> fVar) {
        this(eVar, fVar, f7169c);
    }

    C1899b0(AbstractC1695e eVar, AbstractC1906f<T> fVar, C1905e eVar2) {
        this.f7171e = eVar;
        this.f7170d = fVar;
        this.f7172f = eVar2;
    }

    /* renamed from: c */
    public static AbstractC1649k<AssetFileDescriptor, Bitmap> m8648c(AbstractC1695e eVar) {
        return new C1899b0(eVar, new C1902c(null));
    }

    /* renamed from: d */
    public static AbstractC1649k<ByteBuffer, Bitmap> m8649d(AbstractC1695e eVar) {
        return new C1899b0(eVar, new C1903d());
    }

    /* renamed from: e */
    private static Bitmap m8650e(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, AbstractC1922l lVar) {
        Bitmap g = (Build.VERSION.SDK_INT < 27 || i2 == Integer.MIN_VALUE || i3 == Integer.MIN_VALUE || lVar == AbstractC1922l.f7197f) ? null : m8652g(mediaMetadataRetriever, j, i, i2, i3, lVar);
        return g == null ? m8651f(mediaMetadataRetriever, j, i) : g;
    }

    /* renamed from: f */
    private static Bitmap m8651f(MediaMetadataRetriever mediaMetadataRetriever, long j, int i) {
        return mediaMetadataRetriever.getFrameAtTime(j, i);
    }

    @TargetApi(27)
    /* renamed from: g */
    private static Bitmap m8652g(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, AbstractC1922l lVar) {
        try {
            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (parseInt3 == 90 || parseInt3 == 270) {
                parseInt2 = parseInt;
                parseInt = parseInt2;
            }
            float b = lVar.mo7515b(parseInt, parseInt2, i2, i3);
            return mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(((float) parseInt) * b), Math.round(b * ((float) parseInt2)));
        } catch (Throwable th) {
            if (!Log.isLoggable("VideoDecoder", 3)) {
                return null;
            }
            Log.d("VideoDecoder", "Exception trying to decode frame on oreo+", th);
            return null;
        }
    }

    /* renamed from: h */
    public static AbstractC1649k<ParcelFileDescriptor, Bitmap> m8653h(AbstractC1695e eVar) {
        return new C1899b0(eVar, new C1907g());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: com.bumptech.glide.load.i */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.load.AbstractC1649k
    /* renamed from: a */
    public AbstractC1794v<Bitmap> mo7088a(T t, int i, int i2, C1647i iVar) {
        long longValue = ((Long) iVar.mo7084c(f7167a)).longValue();
        if (longValue >= 0 || longValue == -1) {
            Integer num = (Integer) iVar.mo7084c(f7168b);
            if (num == null) {
                num = 2;
            }
            AbstractC1922l lVar = (AbstractC1922l) iVar.mo7084c(AbstractC1922l.f7199h);
            if (lVar == null) {
                lVar = AbstractC1922l.f7198g;
            }
            MediaMetadataRetriever a = this.f7172f.mo7497a();
            try {
                this.f7170d.mo7491a(a, t);
                Bitmap e = m8650e(a, longValue, num.intValue(), i, i2, lVar);
                a.release();
                return C1910e.m8673g(e, this.f7171e);
            } catch (RuntimeException e2) {
                throw new IOException(e2);
            } catch (Throwable th) {
                a.release();
                throw th;
            }
        } else {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + longValue);
        }
    }

    @Override // com.bumptech.glide.load.AbstractC1649k
    /* renamed from: b */
    public boolean mo7089b(T t, C1647i iVar) {
        return true;
    }
}
