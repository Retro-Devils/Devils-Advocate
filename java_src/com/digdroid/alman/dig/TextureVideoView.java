package com.digdroid.alman.dig;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import java.io.IOException;

public class TextureVideoView extends TextureView implements TextureView.SurfaceTextureListener {

    /* renamed from: b */
    private static final String f7757b = TextureVideoView.class.getName();

    /* renamed from: c */
    private MediaPlayer f7758c;

    /* renamed from: d */
    private float f7759d;

    /* renamed from: e */
    private float f7760e;

    /* renamed from: f */
    private boolean f7761f;

    /* renamed from: g */
    private boolean f7762g;

    /* renamed from: h */
    private boolean f7763h;

    /* renamed from: i */
    private boolean f7764i;

    /* renamed from: j */
    private EnumC2158g f7765j;

    /* renamed from: k */
    private EnumC2159h f7766k;

    /* renamed from: l */
    private String f7767l = "";

    /* renamed from: m */
    private Surface f7768m = null;

    /* renamed from: n */
    private SurfaceTexture f7769n = null;

    /* renamed from: o */
    private int f7770o;

    /* renamed from: p */
    private AbstractC2157f f7771p;

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.TextureVideoView$a */
    public class C2151a implements MediaPlayer.OnVideoSizeChangedListener {
        C2151a() {
        }

        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            TextureVideoView.this.f7760e = (float) i;
            TextureVideoView.this.f7759d = (float) i2;
            TextureVideoView.this.m9630s();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.TextureVideoView$b */
    public class C2152b implements MediaPlayer.OnCompletionListener {
        C2152b() {
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            if (TextureVideoView.this.f7766k != EnumC2159h.UNINITIALIZED) {
                TextureVideoView.m9628m("Video has ended.");
                if (TextureVideoView.this.f7766k == EnumC2159h.PLAY && TextureVideoView.this.f7771p != null) {
                    TextureVideoView.this.f7771p.mo8015r0();
                }
                TextureVideoView.this.f7766k = EnumC2159h.END;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.TextureVideoView$c */
    public class C2153c implements MediaPlayer.OnSeekCompleteListener {

        /* renamed from: com.digdroid.alman.dig.TextureVideoView$c$a */
        class RunnableC2154a implements Runnable {
            RunnableC2154a() {
            }

            public void run() {
                if (TextureVideoView.this.f7758c != null) {
                    TextureVideoView.this.f7758c.start();
                }
            }
        }

        C2153c() {
        }

        public void onSeekComplete(MediaPlayer mediaPlayer) {
            new Handler().postDelayed(new RunnableC2154a(), 200);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.TextureVideoView$d */
    public class C2155d implements MediaPlayer.OnPreparedListener {
        C2155d() {
        }

        public void onPrepared(MediaPlayer mediaPlayer) {
            TextureVideoView.this.f7763h = true;
            if (TextureVideoView.this.f7764i && TextureVideoView.this.f7762g) {
                TextureVideoView.m9628m("Player is prepared and play() was called.");
                TextureVideoView.this.mo7997o();
            }
            if (TextureVideoView.this.f7771p != null) {
                TextureVideoView.this.f7771p.mo8014c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.TextureVideoView$e */
    public static /* synthetic */ class C2156e {

        /* renamed from: a */
        static final /* synthetic */ int[] f7777a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.digdroid.alman.dig.TextureVideoView$g[] r0 = com.digdroid.alman.dig.TextureVideoView.EnumC2158g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.digdroid.alman.dig.TextureVideoView.C2156e.f7777a = r0
                com.digdroid.alman.dig.TextureVideoView$g r1 = com.digdroid.alman.dig.TextureVideoView.EnumC2158g.TOP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.digdroid.alman.dig.TextureVideoView.C2156e.f7777a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.digdroid.alman.dig.TextureVideoView$g r1 = com.digdroid.alman.dig.TextureVideoView.EnumC2158g.BOTTOM     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.digdroid.alman.dig.TextureVideoView.C2156e.f7777a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.digdroid.alman.dig.TextureVideoView$g r1 = com.digdroid.alman.dig.TextureVideoView.EnumC2158g.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.TextureVideoView.C2156e.<clinit>():void");
        }
    }

    /* renamed from: com.digdroid.alman.dig.TextureVideoView$f */
    public interface AbstractC2157f {
        /* renamed from: c */
        void mo8014c();

        /* renamed from: r0 */
        void mo8015r0();
    }

    /* renamed from: com.digdroid.alman.dig.TextureVideoView$g */
    public enum EnumC2158g {
        CENTER_CROP,
        TOP,
        BOTTOM,
        FIT_CENTER
    }

    /* renamed from: com.digdroid.alman.dig.TextureVideoView$h */
    public enum EnumC2159h {
        UNINITIALIZED,
        PLAY,
        STOP,
        PAUSE,
        END
    }

    public TextureVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m9627l();
    }

    /* renamed from: k */
    private void m9626k() {
        MediaPlayer mediaPlayer = this.f7758c;
        if (mediaPlayer == null) {
            this.f7758c = new MediaPlayer();
            if (isAvailable()) {
                onSurfaceTextureAvailable(getSurfaceTexture(), getWidth(), getHeight());
            }
        } else {
            mediaPlayer.reset();
        }
        this.f7763h = false;
        this.f7764i = false;
        this.f7761f = false;
        this.f7766k = EnumC2159h.UNINITIALIZED;
    }

    /* renamed from: l */
    private void m9627l() {
        m9626k();
        setScaleType(EnumC2158g.CENTER_CROP);
        setSurfaceTextureListener(this);
    }

    /* renamed from: m */
    static void m9628m(String str) {
    }

    /* renamed from: p */
    private void m9629p() {
        String str;
        String str2;
        try {
            this.f7758c.setOnVideoSizeChangedListener(new C2151a());
            this.f7758c.setOnCompletionListener(new C2152b());
            this.f7758c.setOnSeekCompleteListener(new C2153c());
            this.f7758c.setOnPreparedListener(new C2155d());
            this.f7758c.prepareAsync();
            return;
        } catch (IllegalArgumentException e) {
            str = f7757b;
            str2 = e.getMessage();
        } catch (SecurityException e2) {
            str = f7757b;
            str2 = e2.getMessage();
        } catch (IllegalStateException e3) {
            str = f7757b;
            str2 = e3.toString();
        }
        Log.d(str, str2);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
        if (r2 > r3) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001f, code lost:
        r6 = r3 / r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        if (r2 > r3) goto L_0x001f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m9630s() {
        /*
            r8 = this;
            int r0 = r8.getWidth()
            float r0 = (float) r0
            int r1 = r8.getHeight()
            float r1 = (float) r1
            float r2 = r0 / r1
            float r3 = r8.f7760e
            float r4 = r8.f7759d
            float r3 = r3 / r4
            com.digdroid.alman.dig.TextureVideoView$g r4 = r8.f7765j
            com.digdroid.alman.dig.TextureVideoView$g r5 = com.digdroid.alman.dig.TextureVideoView.EnumC2158g.CENTER_CROP
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r4 != r5) goto L_0x0022
            int r5 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x001f
        L_0x001d:
            float r2 = r2 / r3
            goto L_0x002d
        L_0x001f:
            float r3 = r3 / r2
            r6 = r3
            goto L_0x002b
        L_0x0022:
            com.digdroid.alman.dig.TextureVideoView$g r5 = com.digdroid.alman.dig.TextureVideoView.EnumC2158g.FIT_CENTER
            if (r4 != r5) goto L_0x002b
            int r5 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x001d
            goto L_0x001f
        L_0x002b:
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x002d:
            int[] r3 = com.digdroid.alman.dig.TextureVideoView.C2156e.f7777a
            int r4 = r4.ordinal()
            r3 = r3[r4]
            r4 = 1
            r5 = 0
            if (r3 == r4) goto L_0x004a
            r4 = 2
            if (r3 == r4) goto L_0x0047
            r4 = 3
            r5 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r5
            int r0 = (int) r0
            float r1 = r1 / r5
            int r5 = (int) r1
            r7 = r5
            r5 = r0
            r0 = r7
            goto L_0x004b
        L_0x0047:
            int r5 = (int) r0
            int r0 = (int) r1
            goto L_0x004b
        L_0x004a:
            r0 = 0
        L_0x004b:
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            float r3 = (float) r5
            float r0 = (float) r0
            r1.setScale(r6, r2, r3, r0)
            r8.setTransform(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.TextureVideoView.m9630s():void");
    }

    public int getDuration() {
        return this.f7758c.getDuration();
    }

    public int getPosition() {
        return this.f7758c.getCurrentPosition();
    }

    /* renamed from: n */
    public void mo7996n() {
        String str;
        EnumC2159h hVar = this.f7766k;
        EnumC2159h hVar2 = EnumC2159h.PAUSE;
        if (hVar == hVar2) {
            str = "pause() was called but video already paused.";
        } else if (hVar == EnumC2159h.STOP) {
            str = "pause() was called but video already stopped.";
        } else if (hVar == EnumC2159h.END) {
            str = "pause() was called but video already ended.";
        } else {
            this.f7766k = hVar2;
            if (this.f7758c.isPlaying()) {
                this.f7758c.pause();
                return;
            }
            return;
        }
        m9628m(str);
    }

    /* renamed from: o */
    public void mo7997o() {
        if (!this.f7761f) {
            m9628m("play() was called but data source was not set.");
            return;
        }
        this.f7764i = true;
        if (!this.f7763h) {
            m9628m("play() was called but video is not prepared yet, waiting.");
        } else if (!this.f7762g) {
            m9628m("play() was called but view is not available yet, waiting.");
        } else {
            EnumC2159h hVar = this.f7766k;
            EnumC2159h hVar2 = EnumC2159h.PLAY;
            if (hVar == hVar2) {
                m9628m("play() was called but video is already playing.");
            } else if (hVar == EnumC2159h.PAUSE) {
                m9628m("play() was called but video is paused, resuming.");
                this.f7766k = hVar2;
                this.f7758c.start();
            } else {
                this.f7766k = hVar2;
                this.f7758c.seekTo(this.f7770o);
            }
        }
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.f7758c == null) {
            m9626k();
        }
        if (surfaceTexture != null) {
            this.f7769n = surfaceTexture;
            Surface surface = new Surface(surfaceTexture);
            this.f7768m = surface;
            if (surface != null) {
                this.f7758c.setSurface(surface);
                this.f7762g = true;
                if (this.f7761f && this.f7764i && this.f7763h) {
                    m9628m("View is available and play() was called.");
                    mo7997o();
                }
            }
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        onSurfaceTextureAvailable(surfaceTexture, i, i2);
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    /* renamed from: q */
    public void mo8002q(int i) {
        this.f7770o = i;
    }

    /* renamed from: r */
    public void mo8003r() {
        EnumC2159h hVar = this.f7766k;
        EnumC2159h hVar2 = EnumC2159h.STOP;
        if (hVar == hVar2) {
            m9628m("stop() was called but video already stopped.");
        } else if (hVar == EnumC2159h.END) {
            m9628m("stop() was called but video already ended.");
        } else {
            MediaPlayer mediaPlayer = this.f7758c;
            if (mediaPlayer != null) {
                this.f7766k = hVar2;
                if (mediaPlayer.isPlaying()) {
                    this.f7758c.stop();
                }
                this.f7758c.release();
                this.f7758c = null;
            }
        }
    }

    public void setDataSource(AssetFileDescriptor assetFileDescriptor) {
        m9626k();
        try {
            this.f7758c.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
            this.f7761f = true;
            m9629p();
        } catch (IOException e) {
            Log.d(f7757b, e.getMessage());
        }
    }

    public void setDataSource(String str) {
        m9626k();
        try {
            this.f7758c.setDataSource(str);
            this.f7761f = true;
            m9629p();
        } catch (IOException e) {
            Log.d(f7757b, e.getMessage());
        }
    }

    public void setListener(AbstractC2157f fVar) {
        this.f7771p = fVar;
    }

    public void setLooping(boolean z) {
        this.f7758c.setLooping(z);
    }

    public void setScaleType(EnumC2158g gVar) {
        this.f7765j = gVar;
    }
}
