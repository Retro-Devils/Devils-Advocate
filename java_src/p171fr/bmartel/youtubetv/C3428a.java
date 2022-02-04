package p171fr.bmartel.youtubetv;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadata;
import android.media.session.MediaSession;
import android.os.AsyncTask;
import android.os.ConditionVariable;
import android.os.Handler;
import android.util.Log;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import p171fr.bmartel.youtubetv.p172g.AbstractC3440a;
import p171fr.bmartel.youtubetv.p172g.AbstractC3441b;
import p171fr.bmartel.youtubetv.p172g.AbstractC3442c;
import p171fr.bmartel.youtubetv.p173h.C3447e;
import p171fr.bmartel.youtubetv.p173h.EnumC3448f;
import p171fr.bmartel.youtubetv.p173h.EnumC3449g;
import p171fr.bmartel.youtubetv.p174i.C3450a;

/* renamed from: fr.bmartel.youtubetv.a */
public class C3428a {

    /* renamed from: A */
    private String f11562A;

    /* renamed from: B */
    private String f11563B;

    /* renamed from: C */
    private int f11564C;

    /* renamed from: D */
    private AbstractC3440a f11565D;

    /* renamed from: E */
    private AbstractC3442c f11566E;

    /* renamed from: F */
    private List<EnumC3448f> f11567F = new ArrayList();

    /* renamed from: G */
    private C3447e f11568G = new C3447e("", "", "", new ArrayList());

    /* renamed from: a */
    private final String f11569a = C3428a.class.getSimpleName();

    /* renamed from: b */
    private WebView f11570b;

    /* renamed from: c */
    private boolean f11571c;

    /* renamed from: d */
    private ProgressBar f11572d;

    /* renamed from: e */
    private ImageView f11573e;

    /* renamed from: f */
    private Handler f11574f;

    /* renamed from: g */
    private ConditionVariable f11575g;

    /* renamed from: h */
    private int f11576h;

    /* renamed from: i */
    private boolean f11577i;

    /* renamed from: j */
    private int f11578j;

    /* renamed from: k */
    private EnumC3449g f11579k;

    /* renamed from: l */
    private List<Integer> f11580l = new ArrayList();

    /* renamed from: m */
    private List<String> f11581m = new ArrayList();

    /* renamed from: n */
    private float f11582n;

    /* renamed from: o */
    private boolean f11583o;

    /* renamed from: p */
    private List<AbstractC3441b> f11584p = new ArrayList();

    /* renamed from: q */
    private YoutubeTvView f11585q;

    /* renamed from: r */
    private String f11586r = C3439f.f11664e.mo11523c();

    /* renamed from: s */
    private boolean f11587s;

    /* renamed from: t */
    private int f11588t;

    /* renamed from: u */
    private int f11589u;

    /* renamed from: v */
    private float f11590v;

    /* renamed from: w */
    private float f11591w;

    /* renamed from: x */
    private EnumC3448f f11592x;

    /* renamed from: y */
    private String f11593y;

    /* renamed from: z */
    private String f11594z;

    /* renamed from: fr.bmartel.youtubetv.a$a */
    class RunnableC3429a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ String f11595b;

        /* renamed from: c */
        final /* synthetic */ String f11596c;

        /* renamed from: d */
        final /* synthetic */ String f11597d;

        /* renamed from: e */
        final /* synthetic */ String f11598e;

        RunnableC3429a(String str, String str2, String str3, String str4) {
            this.f11595b = str;
            this.f11596c = str2;
            this.f11597d = str3;
            this.f11598e = str4;
        }

        public void run() {
            C3447e eVar = new C3447e(this.f11595b, this.f11596c, this.f11597d, C3450a.m14201h(this.f11598e));
            for (AbstractC3441b bVar : C3428a.this.f11584p) {
                bVar.mo8878b(eVar);
            }
        }
    }

    /* renamed from: fr.bmartel.youtubetv.a$b */
    class RunnableC3430b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ float f11600b;

        RunnableC3430b(float f) {
            this.f11600b = f;
        }

        public void run() {
            if (C3428a.this.f11566E != null) {
                C3428a.this.f11566E.mo11521a(this.f11600b);
            }
        }
    }

    /* renamed from: fr.bmartel.youtubetv.a$c */
    class RunnableC3431c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ int f11602b;

        /* renamed from: c */
        final /* synthetic */ float f11603c;

        /* renamed from: d */
        final /* synthetic */ float f11604d;

        /* renamed from: e */
        final /* synthetic */ String f11605e;

        /* renamed from: f */
        final /* synthetic */ long f11606f;

        /* renamed from: g */
        final /* synthetic */ float f11607g;

        /* renamed from: h */
        final /* synthetic */ String f11608h;

        /* renamed from: i */
        final /* synthetic */ String f11609i;

        /* renamed from: j */
        final /* synthetic */ String f11610j;

        RunnableC3431c(int i, float f, float f2, String str, long j, float f3, String str2, String str3, String str4) {
            this.f11602b = i;
            this.f11603c = f;
            this.f11604d = f2;
            this.f11605e = str;
            this.f11606f = j;
            this.f11607g = f3;
            this.f11608h = str2;
            this.f11609i = str3;
            this.f11610j = str4;
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        public void run() {
            int i;
            boolean z;
            EnumC3449g b = EnumC3449g.m14192b(this.f11602b);
            if (C3428a.this.f11585q.mo11431e()) {
                switch (C3434f.f11621a[b.ordinal()]) {
                    case 1:
                        C3428a.this.f11583o = false;
                        z = true;
                        i = 1;
                        break;
                    case 2:
                        if (C3428a.this.f11585q.getPlaylistIndex() != -1) {
                            C3428a.this.f11585q.mo11453l();
                        }
                        C3428a.this.f11583o = false;
                        z = true;
                        i = 1;
                        break;
                    case 3:
                        C3428a.this.f11583o = true;
                        z = !C3428a.this.f11583o;
                        i = 3;
                        break;
                    case 4:
                        C3428a.this.f11583o = true;
                        z = !C3428a.this.f11583o;
                        i = 2;
                        break;
                    case 5:
                        C3428a.this.f11583o = false;
                        if (C3428a.this.f11565D != null) {
                            C3428a.this.f11565D.mo11520a(this.f11603c, this.f11604d);
                        }
                        z = true;
                        i = 6;
                        break;
                    case 6:
                        C3428a.this.f11583o = false;
                        z = true;
                        i = 3;
                        break;
                    default:
                        z = true;
                        i = 1;
                        break;
                }
                C3428a aVar = C3428a.this;
                aVar.m14139G(this.f11605e, z, i, this.f11606f, this.f11607g, this.f11608h, aVar.f11585q.getMediaSession());
            }
            for (AbstractC3441b bVar : C3428a.this.f11584p) {
                bVar.mo8877a(b, this.f11606f, this.f11607g, this.f11603c, new C3447e(this.f11605e, this.f11609i, this.f11608h, C3450a.m14201h(this.f11610j)));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: fr.bmartel.youtubetv.a$d */
    public class AsyncTaskC3432d extends AsyncTask<String, Void, Void> {

        /* renamed from: a */
        final /* synthetic */ boolean f11612a;

        /* renamed from: b */
        final /* synthetic */ String f11613b;

        /* renamed from: c */
        final /* synthetic */ MediaSession f11614c;

        /* renamed from: d */
        final /* synthetic */ int f11615d;

        /* renamed from: e */
        final /* synthetic */ long f11616e;

        /* renamed from: f */
        final /* synthetic */ float f11617f;

        AsyncTaskC3432d(boolean z, String str, MediaSession mediaSession, int i, long j, float f) {
            this.f11612a = z;
            this.f11613b = str;
            this.f11614c = mediaSession;
            this.f11615d = i;
            this.f11616e = j;
            this.f11617f = f;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(String... strArr) {
            MediaMetadata.Builder builder;
            boolean z;
            Bitmap bitmap;
            String d = C3450a.m14197d(strArr[0], C3428a.this.f11586r);
            try {
                d = C3450a.m14196c(strArr[0], C3428a.this.f11586r);
            } catch (IOException e) {
                Log.e(C3428a.this.f11569a, "getThumbnailQuality", e);
            }
            if (this.f11612a) {
                try {
                    bitmap = BitmapFactory.decodeStream(new URL(d).openConnection().getInputStream());
                } catch (IOException e2) {
                    Log.e(C3428a.this.f11569a, "BitmapFactory.decodeStream", e2);
                    bitmap = null;
                }
                MediaMetadata.Builder builder2 = new MediaMetadata.Builder();
                builder2.putString("android.media.metadata.TITLE", this.f11613b);
                if (bitmap != null) {
                    builder2.putBitmap("android.media.metadata.ART", bitmap);
                }
                builder = builder2;
                z = true;
            } else {
                builder = null;
                z = false;
            }
            C3450a.m14202i(z, builder, this.f11614c, this.f11615d, this.f11616e, this.f11617f);
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Void r1) {
            super.onPostExecute(r1);
        }
    }

    /* renamed from: fr.bmartel.youtubetv.a$e */
    class RunnableC3433e implements Runnable {

        /* renamed from: b */
        final /* synthetic */ boolean f11619b;

        RunnableC3433e(boolean z) {
            this.f11619b = z;
        }

        public void run() {
            ImageView imageView;
            int i = 8;
            C3428a.this.f11572d.setVisibility(8);
            if (this.f11619b) {
                imageView = C3428a.this.f11573e;
                i = 0;
            } else {
                imageView = C3428a.this.f11573e;
            }
            imageView.setVisibility(i);
        }
    }

    /* renamed from: fr.bmartel.youtubetv.a$f */
    static /* synthetic */ class C3434f {

        /* renamed from: a */
        static final /* synthetic */ int[] f11621a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                fr.bmartel.youtubetv.h.g[] r0 = p171fr.bmartel.youtubetv.p173h.EnumC3449g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                p171fr.bmartel.youtubetv.C3428a.C3434f.f11621a = r0
                fr.bmartel.youtubetv.h.g r1 = p171fr.bmartel.youtubetv.p173h.EnumC3449g.UNSTARTED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = p171fr.bmartel.youtubetv.C3428a.C3434f.f11621a     // Catch:{ NoSuchFieldError -> 0x001d }
                fr.bmartel.youtubetv.h.g r1 = p171fr.bmartel.youtubetv.p173h.EnumC3449g.ENDED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = p171fr.bmartel.youtubetv.C3428a.C3434f.f11621a     // Catch:{ NoSuchFieldError -> 0x0028 }
                fr.bmartel.youtubetv.h.g r1 = p171fr.bmartel.youtubetv.p173h.EnumC3449g.PLAYING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = p171fr.bmartel.youtubetv.C3428a.C3434f.f11621a     // Catch:{ NoSuchFieldError -> 0x0033 }
                fr.bmartel.youtubetv.h.g r1 = p171fr.bmartel.youtubetv.p173h.EnumC3449g.PAUSED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = p171fr.bmartel.youtubetv.C3428a.C3434f.f11621a     // Catch:{ NoSuchFieldError -> 0x003e }
                fr.bmartel.youtubetv.h.g r1 = p171fr.bmartel.youtubetv.p173h.EnumC3449g.BUFFERING     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = p171fr.bmartel.youtubetv.C3428a.C3434f.f11621a     // Catch:{ NoSuchFieldError -> 0x0049 }
                fr.bmartel.youtubetv.h.g r1 = p171fr.bmartel.youtubetv.p173h.EnumC3449g.VIDEO_CUED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p171fr.bmartel.youtubetv.C3428a.C3434f.<clinit>():void");
        }
    }

    public C3428a(List<AbstractC3441b> list, Handler handler, ProgressBar progressBar, ImageView imageView, WebView webView, YoutubeTvView youtubeTvView, String str) {
        this.f11584p = list;
        this.f11570b = webView;
        this.f11572d = progressBar;
        this.f11574f = handler;
        this.f11573e = imageView;
        this.f11585q = youtubeTvView;
        this.f11586r = str;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: G */
    private void m14139G(String str, boolean z, int i, long j, float f, String str2, MediaSession mediaSession) {
        new AsyncTaskC3432d(z, str2, mediaSession, i, j, f).execute(str);
    }

    /* renamed from: A */
    public int mo11467A() {
        return this.f11576h;
    }

    /* renamed from: B */
    public boolean mo11468B() {
        return this.f11571c;
    }

    /* renamed from: C */
    public void mo11469C(ConditionVariable conditionVariable) {
        this.f11575g = conditionVariable;
    }

    /* renamed from: D */
    public void mo11470D(AbstractC3440a aVar) {
        this.f11565D = aVar;
    }

    /* renamed from: E */
    public void mo11471E(AbstractC3442c cVar) {
        this.f11566E = cVar;
    }

    /* renamed from: F */
    public void mo11472F(int i, int i2) {
        this.f11587s = true;
        this.f11588t = i;
        this.f11589u = i2;
    }

    @JavascriptInterface
    public String getThumbnailQuality(String str, String str2) {
        try {
            return C3450a.m14196c(str, str2);
        } catch (IOException e) {
            Log.e(this.f11569a, "getThumbnailQuality", e);
            return "";
        }
    }

    @JavascriptInterface
    public void hideLoading(boolean z) {
        if (this.f11572d != null) {
            this.f11574f.post(new RunnableC3433e(z));
        }
    }

    /* renamed from: l */
    public List<Integer> mo11475l() {
        return this.f11580l;
    }

    @JavascriptInterface
    public void log(String str, String str2) {
        Log.v(str, str2);
    }

    /* renamed from: m */
    public List<EnumC3448f> mo11477m() {
        return this.f11567F;
    }

    /* renamed from: n */
    public float mo11478n() {
        return this.f11591w;
    }

    /* renamed from: o */
    public float mo11479o() {
        return this.f11582n;
    }

    @JavascriptInterface
    public void onAvailableQualityLevelsReceived(String str) {
        this.f11567F = C3450a.m14201h(str);
        ConditionVariable conditionVariable = this.f11575g;
        if (conditionVariable != null) {
            conditionVariable.open();
        }
    }

    @JavascriptInterface
    public void onCurrentTimeReceived(float f) {
        this.f11591w = f;
        this.f11575g.open();
    }

    @JavascriptInterface
    public void onDurationReceived(float f) {
        this.f11582n = f;
        this.f11575g.open();
    }

    @JavascriptInterface
    public void onMuteReceived(boolean z) {
        this.f11577i = z;
        ConditionVariable conditionVariable = this.f11575g;
        if (conditionVariable != null) {
            conditionVariable.open();
        }
    }

    @JavascriptInterface
    public void onPageLoaded() {
        this.f11571c = true;
        if (this.f11587s) {
            C3450a.m14195b(this.f11570b, "setSize", Integer.valueOf(this.f11588t), Integer.valueOf(this.f11589u));
        }
    }

    @JavascriptInterface
    public void onPlaybackQualityReceived(String str) {
        this.f11592x = EnumC3448f.m14189d(str);
        this.f11575g.open();
    }

    @JavascriptInterface
    public void onPlaybackRateReceived(int i) {
        this.f11578j = i;
        ConditionVariable conditionVariable = this.f11575g;
        if (conditionVariable != null) {
            conditionVariable.open();
        }
    }

    @JavascriptInterface
    public void onPlaybackRatesListReceived(String str) {
        this.f11580l = C3450a.m14199f(str);
        ConditionVariable conditionVariable = this.f11575g;
        if (conditionVariable != null) {
            conditionVariable.open();
        }
    }

    @JavascriptInterface
    public void onPlayerReady(String str, String str2, String str3, String str4) {
        this.f11574f.post(new RunnableC3429a(str3, str2, str, str4));
    }

    @JavascriptInterface
    public void onPlayerStateChange(int i, long j, float f, String str, String str2, String str3, float f2, float f3, String str4) {
        this.f11574f.post(new RunnableC3431c(i, f2, f3, str2, j, f, str, str3, str4));
    }

    @JavascriptInterface
    public void onPlayerStateReceived(int i) {
        this.f11579k = EnumC3449g.m14192b(i);
        ConditionVariable conditionVariable = this.f11575g;
        if (conditionVariable != null) {
            conditionVariable.open();
        }
    }

    @JavascriptInterface
    public void onPlaylistIndexReceived(int i) {
        this.f11564C = i;
        this.f11575g.open();
    }

    @JavascriptInterface
    public void onPlaylistReceived(String str) {
        this.f11581m = C3450a.m14200g(str);
        this.f11575g.open();
    }

    @JavascriptInterface
    public void onProgressUpdate(float f) {
        this.f11574f.post(new RunnableC3430b(f));
    }

    @JavascriptInterface
    public void onVideoEmbedCodeReceived(String str) {
        this.f11563B = str;
        this.f11575g.open();
    }

    @JavascriptInterface
    public void onVideoIdReceived(String str) {
        this.f11594z = str;
        this.f11575g.open();
    }

    @JavascriptInterface
    public void onVideoInfoReceived(String str, String str2, String str3, String str4) {
        this.f11568G = new C3447e(str3, str2, str, C3450a.m14201h(str4));
        this.f11575g.open();
    }

    @JavascriptInterface
    public void onVideoLoadedFractionReceived(float f) {
        this.f11590v = f;
        ConditionVariable conditionVariable = this.f11575g;
        if (conditionVariable != null) {
            conditionVariable.open();
        }
    }

    @JavascriptInterface
    public void onVideoTitleReceived(String str) {
        this.f11562A = str;
        this.f11575g.open();
    }

    @JavascriptInterface
    public void onVideoUrlReceived(String str) {
        this.f11593y = str;
        this.f11575g.open();
    }

    @JavascriptInterface
    public void onVolumeReceived(int i) {
        this.f11576h = i;
        ConditionVariable conditionVariable = this.f11575g;
        if (conditionVariable != null) {
            conditionVariable.open();
        }
    }

    /* renamed from: p */
    public EnumC3448f mo11501p() {
        return this.f11592x;
    }

    /* renamed from: q */
    public int mo11502q() {
        return this.f11578j;
    }

    /* renamed from: r */
    public EnumC3449g mo11503r() {
        return this.f11579k;
    }

    /* renamed from: s */
    public List<String> mo11504s() {
        return this.f11581m;
    }

    /* renamed from: t */
    public int mo11505t() {
        return this.f11564C;
    }

    /* renamed from: u */
    public String mo11506u() {
        return this.f11563B;
    }

    /* renamed from: v */
    public String mo11507v() {
        return this.f11594z;
    }

    /* renamed from: w */
    public C3447e mo11508w() {
        return this.f11568G;
    }

    /* renamed from: x */
    public float mo11509x() {
        return this.f11590v;
    }

    /* renamed from: y */
    public String mo11510y() {
        return this.f11562A;
    }

    /* renamed from: z */
    public String mo11511z() {
        return this.f11593y;
    }
}
