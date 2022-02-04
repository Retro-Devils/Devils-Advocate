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
    private String f11571A;

    /* renamed from: B */
    private String f11572B;

    /* renamed from: C */
    private int f11573C;

    /* renamed from: D */
    private AbstractC3440a f11574D;

    /* renamed from: E */
    private AbstractC3442c f11575E;

    /* renamed from: F */
    private List<EnumC3448f> f11576F = new ArrayList();

    /* renamed from: G */
    private C3447e f11577G = new C3447e("", "", "", new ArrayList());

    /* renamed from: a */
    private final String f11578a = C3428a.class.getSimpleName();

    /* renamed from: b */
    private WebView f11579b;

    /* renamed from: c */
    private boolean f11580c;

    /* renamed from: d */
    private ProgressBar f11581d;

    /* renamed from: e */
    private ImageView f11582e;

    /* renamed from: f */
    private Handler f11583f;

    /* renamed from: g */
    private ConditionVariable f11584g;

    /* renamed from: h */
    private int f11585h;

    /* renamed from: i */
    private boolean f11586i;

    /* renamed from: j */
    private int f11587j;

    /* renamed from: k */
    private EnumC3449g f11588k;

    /* renamed from: l */
    private List<Integer> f11589l = new ArrayList();

    /* renamed from: m */
    private List<String> f11590m = new ArrayList();

    /* renamed from: n */
    private float f11591n;

    /* renamed from: o */
    private boolean f11592o;

    /* renamed from: p */
    private List<AbstractC3441b> f11593p = new ArrayList();

    /* renamed from: q */
    private YoutubeTvView f11594q;

    /* renamed from: r */
    private String f11595r = C3439f.f11673e.mo11523c();

    /* renamed from: s */
    private boolean f11596s;

    /* renamed from: t */
    private int f11597t;

    /* renamed from: u */
    private int f11598u;

    /* renamed from: v */
    private float f11599v;

    /* renamed from: w */
    private float f11600w;

    /* renamed from: x */
    private EnumC3448f f11601x;

    /* renamed from: y */
    private String f11602y;

    /* renamed from: z */
    private String f11603z;

    /* renamed from: fr.bmartel.youtubetv.a$a */
    class RunnableC3429a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ String f11604b;

        /* renamed from: c */
        final /* synthetic */ String f11605c;

        /* renamed from: d */
        final /* synthetic */ String f11606d;

        /* renamed from: e */
        final /* synthetic */ String f11607e;

        RunnableC3429a(String str, String str2, String str3, String str4) {
            this.f11604b = str;
            this.f11605c = str2;
            this.f11606d = str3;
            this.f11607e = str4;
        }

        public void run() {
            C3447e eVar = new C3447e(this.f11604b, this.f11605c, this.f11606d, C3450a.m14201h(this.f11607e));
            for (AbstractC3441b bVar : C3428a.this.f11593p) {
                bVar.mo8878b(eVar);
            }
        }
    }

    /* renamed from: fr.bmartel.youtubetv.a$b */
    class RunnableC3430b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ float f11609b;

        RunnableC3430b(float f) {
            this.f11609b = f;
        }

        public void run() {
            if (C3428a.this.f11575E != null) {
                C3428a.this.f11575E.mo11521a(this.f11609b);
            }
        }
    }

    /* renamed from: fr.bmartel.youtubetv.a$c */
    class RunnableC3431c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ int f11611b;

        /* renamed from: c */
        final /* synthetic */ float f11612c;

        /* renamed from: d */
        final /* synthetic */ float f11613d;

        /* renamed from: e */
        final /* synthetic */ String f11614e;

        /* renamed from: f */
        final /* synthetic */ long f11615f;

        /* renamed from: g */
        final /* synthetic */ float f11616g;

        /* renamed from: h */
        final /* synthetic */ String f11617h;

        /* renamed from: i */
        final /* synthetic */ String f11618i;

        /* renamed from: j */
        final /* synthetic */ String f11619j;

        RunnableC3431c(int i, float f, float f2, String str, long j, float f3, String str2, String str3, String str4) {
            this.f11611b = i;
            this.f11612c = f;
            this.f11613d = f2;
            this.f11614e = str;
            this.f11615f = j;
            this.f11616g = f3;
            this.f11617h = str2;
            this.f11618i = str3;
            this.f11619j = str4;
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        public void run() {
            int i;
            boolean z;
            EnumC3449g b = EnumC3449g.m14192b(this.f11611b);
            if (C3428a.this.f11594q.mo11431e()) {
                switch (C3434f.f11630a[b.ordinal()]) {
                    case 1:
                        C3428a.this.f11592o = false;
                        z = true;
                        i = 1;
                        break;
                    case 2:
                        if (C3428a.this.f11594q.getPlaylistIndex() != -1) {
                            C3428a.this.f11594q.mo11453l();
                        }
                        C3428a.this.f11592o = false;
                        z = true;
                        i = 1;
                        break;
                    case 3:
                        C3428a.this.f11592o = true;
                        z = !C3428a.this.f11592o;
                        i = 3;
                        break;
                    case 4:
                        C3428a.this.f11592o = true;
                        z = !C3428a.this.f11592o;
                        i = 2;
                        break;
                    case 5:
                        C3428a.this.f11592o = false;
                        if (C3428a.this.f11574D != null) {
                            C3428a.this.f11574D.mo11520a(this.f11612c, this.f11613d);
                        }
                        z = true;
                        i = 6;
                        break;
                    case 6:
                        C3428a.this.f11592o = false;
                        z = true;
                        i = 3;
                        break;
                    default:
                        z = true;
                        i = 1;
                        break;
                }
                C3428a aVar = C3428a.this;
                aVar.m14139G(this.f11614e, z, i, this.f11615f, this.f11616g, this.f11617h, aVar.f11594q.getMediaSession());
            }
            for (AbstractC3441b bVar : C3428a.this.f11593p) {
                bVar.mo8877a(b, this.f11615f, this.f11616g, this.f11612c, new C3447e(this.f11614e, this.f11618i, this.f11617h, C3450a.m14201h(this.f11619j)));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: fr.bmartel.youtubetv.a$d */
    public class AsyncTaskC3432d extends AsyncTask<String, Void, Void> {

        /* renamed from: a */
        final /* synthetic */ boolean f11621a;

        /* renamed from: b */
        final /* synthetic */ String f11622b;

        /* renamed from: c */
        final /* synthetic */ MediaSession f11623c;

        /* renamed from: d */
        final /* synthetic */ int f11624d;

        /* renamed from: e */
        final /* synthetic */ long f11625e;

        /* renamed from: f */
        final /* synthetic */ float f11626f;

        AsyncTaskC3432d(boolean z, String str, MediaSession mediaSession, int i, long j, float f) {
            this.f11621a = z;
            this.f11622b = str;
            this.f11623c = mediaSession;
            this.f11624d = i;
            this.f11625e = j;
            this.f11626f = f;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(String... strArr) {
            MediaMetadata.Builder builder;
            boolean z;
            Bitmap bitmap;
            String d = C3450a.m14197d(strArr[0], C3428a.this.f11595r);
            try {
                d = C3450a.m14196c(strArr[0], C3428a.this.f11595r);
            } catch (IOException e) {
                Log.e(C3428a.this.f11578a, "getThumbnailQuality", e);
            }
            if (this.f11621a) {
                try {
                    bitmap = BitmapFactory.decodeStream(new URL(d).openConnection().getInputStream());
                } catch (IOException e2) {
                    Log.e(C3428a.this.f11578a, "BitmapFactory.decodeStream", e2);
                    bitmap = null;
                }
                MediaMetadata.Builder builder2 = new MediaMetadata.Builder();
                builder2.putString("android.media.metadata.TITLE", this.f11622b);
                if (bitmap != null) {
                    builder2.putBitmap("android.media.metadata.ART", bitmap);
                }
                builder = builder2;
                z = true;
            } else {
                builder = null;
                z = false;
            }
            C3450a.m14202i(z, builder, this.f11623c, this.f11624d, this.f11625e, this.f11626f);
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
        final /* synthetic */ boolean f11628b;

        RunnableC3433e(boolean z) {
            this.f11628b = z;
        }

        public void run() {
            ImageView imageView;
            int i = 8;
            C3428a.this.f11581d.setVisibility(8);
            if (this.f11628b) {
                imageView = C3428a.this.f11582e;
                i = 0;
            } else {
                imageView = C3428a.this.f11582e;
            }
            imageView.setVisibility(i);
        }
    }

    /* renamed from: fr.bmartel.youtubetv.a$f */
    static /* synthetic */ class C3434f {

        /* renamed from: a */
        static final /* synthetic */ int[] f11630a;

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
                p171fr.bmartel.youtubetv.C3428a.C3434f.f11630a = r0
                fr.bmartel.youtubetv.h.g r1 = p171fr.bmartel.youtubetv.p173h.EnumC3449g.UNSTARTED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = p171fr.bmartel.youtubetv.C3428a.C3434f.f11630a     // Catch:{ NoSuchFieldError -> 0x001d }
                fr.bmartel.youtubetv.h.g r1 = p171fr.bmartel.youtubetv.p173h.EnumC3449g.ENDED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = p171fr.bmartel.youtubetv.C3428a.C3434f.f11630a     // Catch:{ NoSuchFieldError -> 0x0028 }
                fr.bmartel.youtubetv.h.g r1 = p171fr.bmartel.youtubetv.p173h.EnumC3449g.PLAYING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = p171fr.bmartel.youtubetv.C3428a.C3434f.f11630a     // Catch:{ NoSuchFieldError -> 0x0033 }
                fr.bmartel.youtubetv.h.g r1 = p171fr.bmartel.youtubetv.p173h.EnumC3449g.PAUSED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = p171fr.bmartel.youtubetv.C3428a.C3434f.f11630a     // Catch:{ NoSuchFieldError -> 0x003e }
                fr.bmartel.youtubetv.h.g r1 = p171fr.bmartel.youtubetv.p173h.EnumC3449g.BUFFERING     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = p171fr.bmartel.youtubetv.C3428a.C3434f.f11630a     // Catch:{ NoSuchFieldError -> 0x0049 }
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
        this.f11593p = list;
        this.f11579b = webView;
        this.f11581d = progressBar;
        this.f11583f = handler;
        this.f11582e = imageView;
        this.f11594q = youtubeTvView;
        this.f11595r = str;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: G */
    private void m14139G(String str, boolean z, int i, long j, float f, String str2, MediaSession mediaSession) {
        new AsyncTaskC3432d(z, str2, mediaSession, i, j, f).execute(str);
    }

    /* renamed from: A */
    public int mo11467A() {
        return this.f11585h;
    }

    /* renamed from: B */
    public boolean mo11468B() {
        return this.f11580c;
    }

    /* renamed from: C */
    public void mo11469C(ConditionVariable conditionVariable) {
        this.f11584g = conditionVariable;
    }

    /* renamed from: D */
    public void mo11470D(AbstractC3440a aVar) {
        this.f11574D = aVar;
    }

    /* renamed from: E */
    public void mo11471E(AbstractC3442c cVar) {
        this.f11575E = cVar;
    }

    /* renamed from: F */
    public void mo11472F(int i, int i2) {
        this.f11596s = true;
        this.f11597t = i;
        this.f11598u = i2;
    }

    @JavascriptInterface
    public String getThumbnailQuality(String str, String str2) {
        try {
            return C3450a.m14196c(str, str2);
        } catch (IOException e) {
            Log.e(this.f11578a, "getThumbnailQuality", e);
            return "";
        }
    }

    @JavascriptInterface
    public void hideLoading(boolean z) {
        if (this.f11581d != null) {
            this.f11583f.post(new RunnableC3433e(z));
        }
    }

    /* renamed from: l */
    public List<Integer> mo11475l() {
        return this.f11589l;
    }

    @JavascriptInterface
    public void log(String str, String str2) {
        Log.v(str, str2);
    }

    /* renamed from: m */
    public List<EnumC3448f> mo11477m() {
        return this.f11576F;
    }

    /* renamed from: n */
    public float mo11478n() {
        return this.f11600w;
    }

    /* renamed from: o */
    public float mo11479o() {
        return this.f11591n;
    }

    @JavascriptInterface
    public void onAvailableQualityLevelsReceived(String str) {
        this.f11576F = C3450a.m14201h(str);
        ConditionVariable conditionVariable = this.f11584g;
        if (conditionVariable != null) {
            conditionVariable.open();
        }
    }

    @JavascriptInterface
    public void onCurrentTimeReceived(float f) {
        this.f11600w = f;
        this.f11584g.open();
    }

    @JavascriptInterface
    public void onDurationReceived(float f) {
        this.f11591n = f;
        this.f11584g.open();
    }

    @JavascriptInterface
    public void onMuteReceived(boolean z) {
        this.f11586i = z;
        ConditionVariable conditionVariable = this.f11584g;
        if (conditionVariable != null) {
            conditionVariable.open();
        }
    }

    @JavascriptInterface
    public void onPageLoaded() {
        this.f11580c = true;
        if (this.f11596s) {
            C3450a.m14195b(this.f11579b, "setSize", Integer.valueOf(this.f11597t), Integer.valueOf(this.f11598u));
        }
    }

    @JavascriptInterface
    public void onPlaybackQualityReceived(String str) {
        this.f11601x = EnumC3448f.m14189d(str);
        this.f11584g.open();
    }

    @JavascriptInterface
    public void onPlaybackRateReceived(int i) {
        this.f11587j = i;
        ConditionVariable conditionVariable = this.f11584g;
        if (conditionVariable != null) {
            conditionVariable.open();
        }
    }

    @JavascriptInterface
    public void onPlaybackRatesListReceived(String str) {
        this.f11589l = C3450a.m14199f(str);
        ConditionVariable conditionVariable = this.f11584g;
        if (conditionVariable != null) {
            conditionVariable.open();
        }
    }

    @JavascriptInterface
    public void onPlayerReady(String str, String str2, String str3, String str4) {
        this.f11583f.post(new RunnableC3429a(str3, str2, str, str4));
    }

    @JavascriptInterface
    public void onPlayerStateChange(int i, long j, float f, String str, String str2, String str3, float f2, float f3, String str4) {
        this.f11583f.post(new RunnableC3431c(i, f2, f3, str2, j, f, str, str3, str4));
    }

    @JavascriptInterface
    public void onPlayerStateReceived(int i) {
        this.f11588k = EnumC3449g.m14192b(i);
        ConditionVariable conditionVariable = this.f11584g;
        if (conditionVariable != null) {
            conditionVariable.open();
        }
    }

    @JavascriptInterface
    public void onPlaylistIndexReceived(int i) {
        this.f11573C = i;
        this.f11584g.open();
    }

    @JavascriptInterface
    public void onPlaylistReceived(String str) {
        this.f11590m = C3450a.m14200g(str);
        this.f11584g.open();
    }

    @JavascriptInterface
    public void onProgressUpdate(float f) {
        this.f11583f.post(new RunnableC3430b(f));
    }

    @JavascriptInterface
    public void onVideoEmbedCodeReceived(String str) {
        this.f11572B = str;
        this.f11584g.open();
    }

    @JavascriptInterface
    public void onVideoIdReceived(String str) {
        this.f11603z = str;
        this.f11584g.open();
    }

    @JavascriptInterface
    public void onVideoInfoReceived(String str, String str2, String str3, String str4) {
        this.f11577G = new C3447e(str3, str2, str, C3450a.m14201h(str4));
        this.f11584g.open();
    }

    @JavascriptInterface
    public void onVideoLoadedFractionReceived(float f) {
        this.f11599v = f;
        ConditionVariable conditionVariable = this.f11584g;
        if (conditionVariable != null) {
            conditionVariable.open();
        }
    }

    @JavascriptInterface
    public void onVideoTitleReceived(String str) {
        this.f11571A = str;
        this.f11584g.open();
    }

    @JavascriptInterface
    public void onVideoUrlReceived(String str) {
        this.f11602y = str;
        this.f11584g.open();
    }

    @JavascriptInterface
    public void onVolumeReceived(int i) {
        this.f11585h = i;
        ConditionVariable conditionVariable = this.f11584g;
        if (conditionVariable != null) {
            conditionVariable.open();
        }
    }

    /* renamed from: p */
    public EnumC3448f mo11501p() {
        return this.f11601x;
    }

    /* renamed from: q */
    public int mo11502q() {
        return this.f11587j;
    }

    /* renamed from: r */
    public EnumC3449g mo11503r() {
        return this.f11588k;
    }

    /* renamed from: s */
    public List<String> mo11504s() {
        return this.f11590m;
    }

    /* renamed from: t */
    public int mo11505t() {
        return this.f11573C;
    }

    /* renamed from: u */
    public String mo11506u() {
        return this.f11572B;
    }

    /* renamed from: v */
    public String mo11507v() {
        return this.f11603z;
    }

    /* renamed from: w */
    public C3447e mo11508w() {
        return this.f11577G;
    }

    /* renamed from: x */
    public float mo11509x() {
        return this.f11599v;
    }

    /* renamed from: y */
    public String mo11510y() {
        return this.f11571A;
    }

    /* renamed from: z */
    public String mo11511z() {
        return this.f11602y;
    }
}
