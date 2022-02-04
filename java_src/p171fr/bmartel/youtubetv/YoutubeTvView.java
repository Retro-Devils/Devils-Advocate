package p171fr.bmartel.youtubetv;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.ConditionVariable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import java.util.ArrayList;
import java.util.List;
import p171fr.bmartel.youtubetv.p172g.AbstractC3440a;
import p171fr.bmartel.youtubetv.p172g.AbstractC3441b;
import p171fr.bmartel.youtubetv.p172g.AbstractC3442c;
import p171fr.bmartel.youtubetv.p173h.C3447e;
import p171fr.bmartel.youtubetv.p173h.EnumC3443a;
import p171fr.bmartel.youtubetv.p173h.EnumC3444b;
import p171fr.bmartel.youtubetv.p173h.EnumC3445c;
import p171fr.bmartel.youtubetv.p173h.EnumC3446d;
import p171fr.bmartel.youtubetv.p173h.EnumC3448f;
import p171fr.bmartel.youtubetv.p173h.EnumC3449g;
import p171fr.bmartel.youtubetv.p174i.C3450a;

/* renamed from: fr.bmartel.youtubetv.YoutubeTvView */
public class YoutubeTvView extends FrameLayout {

    /* renamed from: b */
    private static final String f11532b = YoutubeTvView.class.getSimpleName();

    /* renamed from: A */
    private final Object f11533A = new Object();

    /* renamed from: B */
    private MediaSession f11534B;

    /* renamed from: C */
    private boolean f11535C;

    /* renamed from: c */
    private EnumC3444b f11536c;

    /* renamed from: d */
    private String f11537d;

    /* renamed from: e */
    private EnumC3448f f11538e;

    /* renamed from: f */
    private int f11539f;

    /* renamed from: g */
    private int f11540g;

    /* renamed from: h */
    private EnumC3446d f11541h;

    /* renamed from: i */
    private EnumC3445c f11542i;

    /* renamed from: j */
    private int f11543j;

    /* renamed from: k */
    private int f11544k;

    /* renamed from: l */
    private int f11545l;

    /* renamed from: m */
    private int f11546m = 0;

    /* renamed from: n */
    private C3428a f11547n;

    /* renamed from: o */
    private WebView f11548o;

    /* renamed from: p */
    private int f11549p;

    /* renamed from: q */
    private boolean f11550q;

    /* renamed from: r */
    private int f11551r;

    /* renamed from: s */
    private int f11552s;

    /* renamed from: t */
    private String f11553t;

    /* renamed from: u */
    private String f11554u;

    /* renamed from: v */
    private String f11555v;

    /* renamed from: w */
    private EnumC3443a f11556w;

    /* renamed from: x */
    private ConditionVariable f11557x = new ConditionVariable();

    /* renamed from: y */
    private int f11558y = 1500;

    /* renamed from: z */
    private List<AbstractC3441b> f11559z = new ArrayList();

    /* access modifiers changed from: package-private */
    /* renamed from: fr.bmartel.youtubetv.YoutubeTvView$a */
    public class C3426a extends WebChromeClient {
        C3426a() {
        }

        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            jsResult.cancel();
            return true;
        }

        public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            jsResult.cancel();
            return true;
        }

        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            jsPromptResult.cancel();
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: fr.bmartel.youtubetv.YoutubeTvView$b */
    public class C3427b extends MediaSession.Callback {
        C3427b() {
        }

        public boolean onMediaButtonEvent(Intent intent) {
            return true;
        }
    }

    public YoutubeTvView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m14128i(context, attributeSet);
        m14127d();
    }

    /* renamed from: c */
    private void m14126c() {
        m14129j();
        this.f11548o = (WebView) findViewById(C3436c.youtube_view);
        ImageView imageView = (ImageView) findViewById(C3436c.play_icon);
        ProgressBar progressBar = (ProgressBar) findViewById(C3436c.progress_bar);
        Handler handler = new Handler();
        this.f11548o.setBackgroundColor(this.f11546m);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        WebSettings settings = this.f11548o.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setPluginState(WebSettings.PluginState.ON);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setDomStorageEnabled(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        this.f11548o.setWebViewClient(new WebViewClient());
        this.f11548o.setWebChromeClient(new C3426a());
        this.f11548o.setPadding(0, 0, 0, 0);
        this.f11548o.setScrollbarFadingEnabled(true);
        C3428a aVar = new C3428a(this.f11559z, handler, progressBar, imageView, this.f11548o, this, this.f11556w.mo11523c());
        this.f11547n = aVar;
        this.f11548o.addJavascriptInterface(aVar, "JSInterface");
        this.f11548o.getSettings().setUserAgentString(this.f11536c.mo11525c());
        if (this.f11535C) {
            MediaSession mediaSession = this.f11534B;
            if (mediaSession != null) {
                mediaSession.setActive(false);
                this.f11534B.release();
            }
            MediaSession mediaSession2 = new MediaSession(getContext(), "fr.bmartel.youtubetv.MediaSession");
            this.f11534B = mediaSession2;
            mediaSession2.setCallback(new C3427b());
            this.f11534B.setFlags(3);
            if (!this.f11534B.isActive()) {
                this.f11534B.setActive(true);
            }
        }
        String str = "file:///android_asset/youtube.html?videoId=" + this.f11537d + "&videoQuality=" + this.f11538e.mo11529b() + "&playerHeight=" + measuredHeight + "&playerWidth=" + measuredWidth + "&rel=" + this.f11539f + "&showinfo=" + this.f11540g + "&controls=" + this.f11541h.mo11527a() + "&autohide=" + this.f11542i.mo11526a() + "&cc_load_policy=" + this.f11543j + "&iv_load_policy=" + this.f11544k + "&autoplay=" + this.f11549p + "&thumbnailQuality=" + this.f11556w.mo11523c() + "&cc_lang_pref=" + this.f11553t + "&hl=" + this.f11555v + "&playlist_id=" + this.f11554u + "&debug=" + this.f11545l;
        Log.v(f11532b, "videoUrl : " + str);
        this.f11548o.loadUrl(str);
    }

    /* renamed from: d */
    private void m14127d() {
        FrameLayout.inflate(getContext(), C3437d.youtube_view, this);
        m14126c();
    }

    /* renamed from: i */
    private void m14128i(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C3438e.f11639f, 0, 0);
        try {
            this.f11537d = obtainStyledAttributes.getString(C3438e.f11659z);
            this.f11538e = EnumC3448f.m14188c(obtainStyledAttributes.getInteger(C3438e.f11622A, C3439f.f11660a.mo11528a()));
            this.f11539f = obtainStyledAttributes.getBoolean(C3438e.f11654u, false) ? 1 : 0;
            this.f11540g = obtainStyledAttributes.getBoolean(C3438e.f11655v, false) ? 1 : 0;
            this.f11541h = EnumC3446d.m14186b(obtainStyledAttributes.getInteger(C3438e.f11652s, C3439f.f11661b.mo11527a()));
            this.f11543j = obtainStyledAttributes.getBoolean(C3438e.f11645l, false) ? 1 : 0;
            this.f11544k = obtainStyledAttributes.getBoolean(C3438e.f11658y, false) ? 1 : 3;
            this.f11542i = EnumC3445c.m14184b(obtainStyledAttributes.getInteger(C3438e.f11640g, C3439f.f11662c.mo11526a()));
            this.f11545l = obtainStyledAttributes.getBoolean(C3438e.f11646m, false) ? 1 : 0;
            this.f11546m = obtainStyledAttributes.getInteger(C3438e.f11648o, 0);
            this.f11549p = obtainStyledAttributes.getBoolean(C3438e.f11641h, true) ? 1 : 0;
            this.f11536c = EnumC3444b.m14181b(obtainStyledAttributes.getInteger(C3438e.f11657x, C3439f.f11663d.mo11524a()));
            this.f11550q = obtainStyledAttributes.getBoolean(C3438e.f11651r, false);
            this.f11551r = obtainStyledAttributes.getInteger(C3438e.f11643j, 2);
            this.f11552s = obtainStyledAttributes.getColor(C3438e.f11642i, -16776961);
            this.f11556w = EnumC3443a.m14178b(obtainStyledAttributes.getInteger(C3438e.f11656w, C3439f.f11664e.mo11522a()));
            this.f11553t = obtainStyledAttributes.getString(C3438e.f11644k);
            this.f11555v = obtainStyledAttributes.getString(C3438e.f11649p);
            this.f11558y = obtainStyledAttributes.getInteger(C3438e.f11647n, 1500);
            this.f11554u = obtainStyledAttributes.getString(C3438e.f11650q);
            this.f11535C = obtainStyledAttributes.getBoolean(C3438e.f11653t, true);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: j */
    private void m14129j() {
        if (this.f11550q) {
            FrameLayout frameLayout = (FrameLayout) findViewById(C3436c.youtube_frame);
            int i = this.f11551r;
            frameLayout.setPadding(i, i, i, i);
            frameLayout.setBackground(getResources().getDrawable(C3435b.webview_selector));
            ((GradientDrawable) ((DrawableContainer.DrawableContainerState) ((StateListDrawable) frameLayout.getBackground()).getConstantState()).getChildren()[0]).setStroke(this.f11551r, this.f11552s);
        }
    }

    /* renamed from: a */
    public void mo11428a(AbstractC3441b bVar) {
        this.f11559z.add(bVar);
    }

    /* renamed from: b */
    public void mo11429b() {
        mo11454m();
        PlaybackState.Builder builder = new PlaybackState.Builder();
        builder.setState(2, 12, 1.0f);
        this.f11534B.setPlaybackState(builder.build());
        this.f11534B.setActive(false);
        String str = f11532b;
        Log.i(str, "closePlayer : " + this.f11534B.isActive());
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 23 || keyCode == 85) {
                C3450a.m14194a(this.f11548o, "playPause", new Object[0]);
            } else if (keyCode == 87) {
                C3450a.m14194a(this.f11548o, "nextVideo", new Object[0]);
            } else if (keyCode == 126) {
                C3450a.m14194a(this.f11548o, "playVideo", new Object[0]);
            } else if (keyCode == 127) {
                C3450a.m14194a(this.f11548o, "playPause", new Object[0]);
            }
        }
        return dispatchKeyEvent;
    }

    /* renamed from: e */
    public boolean mo11431e() {
        return this.f11535C;
    }

    /* renamed from: f */
    public void mo11432f() {
        C3450a.m14195b(this.f11548o, "pauseVideo", new Object[0]);
    }

    /* renamed from: g */
    public void mo11433g() {
        C3450a.m14195b(this.f11548o, "playPause", new Object[0]);
    }

    public List<Integer> getAvailablePlaybackRates() {
        synchronized (this.f11533A) {
            ConditionVariable conditionVariable = new ConditionVariable();
            this.f11557x = conditionVariable;
            this.f11547n.mo11469C(conditionVariable);
            C3450a.m14195b(this.f11548o, "getAvailablePlaybackRateList", new Object[0]);
            this.f11557x.block((long) this.f11558y);
        }
        return this.f11547n.mo11475l();
    }

    public List<EnumC3448f> getAvailableQualityLevels() {
        synchronized (this.f11533A) {
            ConditionVariable conditionVariable = new ConditionVariable();
            this.f11557x = conditionVariable;
            this.f11547n.mo11469C(conditionVariable);
            C3450a.m14195b(this.f11548o, "getAvailableQualityLevels", new Object[0]);
            this.f11557x.block((long) this.f11558y);
        }
        return this.f11547n.mo11477m();
    }

    public float getCurrentPosition() {
        synchronized (this.f11533A) {
            ConditionVariable conditionVariable = new ConditionVariable();
            this.f11557x = conditionVariable;
            this.f11547n.mo11469C(conditionVariable);
            C3450a.m14195b(this.f11548o, "getCurrentTime", new Object[0]);
            this.f11557x.block((long) this.f11558y);
        }
        return this.f11547n.mo11478n();
    }

    public float getDuration() {
        synchronized (this.f11533A) {
            ConditionVariable conditionVariable = new ConditionVariable();
            this.f11557x = conditionVariable;
            this.f11547n.mo11469C(conditionVariable);
            C3450a.m14195b(this.f11548o, "getDuration", new Object[0]);
            this.f11557x.block((long) this.f11558y);
        }
        return this.f11547n.mo11479o();
    }

    public MediaSession getMediaSession() {
        return this.f11534B;
    }

    public EnumC3448f getPlaybackQuality() {
        synchronized (this.f11533A) {
            ConditionVariable conditionVariable = new ConditionVariable();
            this.f11557x = conditionVariable;
            this.f11547n.mo11469C(conditionVariable);
            C3450a.m14195b(this.f11548o, "getPlaybackQuality", new Object[0]);
            this.f11557x.block((long) this.f11558y);
        }
        return this.f11547n.mo11501p();
    }

    public int getPlaybackRate() {
        synchronized (this.f11533A) {
            ConditionVariable conditionVariable = new ConditionVariable();
            this.f11557x = conditionVariable;
            this.f11547n.mo11469C(conditionVariable);
            C3450a.m14195b(this.f11548o, "getPlaybackRate", new Object[0]);
            this.f11557x.block((long) this.f11558y);
        }
        return this.f11547n.mo11502q();
    }

    public EnumC3449g getPlayerState() {
        synchronized (this.f11533A) {
            ConditionVariable conditionVariable = new ConditionVariable();
            this.f11557x = conditionVariable;
            this.f11547n.mo11469C(conditionVariable);
            C3450a.m14195b(this.f11548o, "getPlayerState", new Object[0]);
            this.f11557x.block((long) this.f11558y);
        }
        return this.f11547n.mo11503r();
    }

    public List<String> getPlaylist() {
        synchronized (this.f11533A) {
            ConditionVariable conditionVariable = new ConditionVariable();
            this.f11557x = conditionVariable;
            this.f11547n.mo11469C(conditionVariable);
            C3450a.m14195b(this.f11548o, "getPlaylist", new Object[0]);
            this.f11557x.block((long) this.f11558y);
        }
        return this.f11547n.mo11504s();
    }

    public int getPlaylistIndex() {
        synchronized (this.f11533A) {
            ConditionVariable conditionVariable = new ConditionVariable();
            this.f11557x = conditionVariable;
            this.f11547n.mo11469C(conditionVariable);
            C3450a.m14195b(this.f11548o, "getPlaylistIndex", new Object[0]);
            this.f11557x.block((long) this.f11558y);
        }
        return this.f11547n.mo11505t();
    }

    public String getVideoEmbedCode() {
        synchronized (this.f11533A) {
            ConditionVariable conditionVariable = new ConditionVariable();
            this.f11557x = conditionVariable;
            this.f11547n.mo11469C(conditionVariable);
            C3450a.m14195b(this.f11548o, "getVideoEmbedCode", new Object[0]);
            this.f11557x.block((long) this.f11558y);
        }
        return this.f11547n.mo11506u();
    }

    public String getVideoId() {
        synchronized (this.f11533A) {
            ConditionVariable conditionVariable = new ConditionVariable();
            this.f11557x = conditionVariable;
            this.f11547n.mo11469C(conditionVariable);
            C3450a.m14195b(this.f11548o, "getVideoId", new Object[0]);
            this.f11557x.block((long) this.f11558y);
        }
        return this.f11547n.mo11507v();
    }

    public C3447e getVideoInfo() {
        synchronized (this.f11533A) {
            ConditionVariable conditionVariable = new ConditionVariable();
            this.f11557x = conditionVariable;
            this.f11547n.mo11469C(conditionVariable);
            C3450a.m14195b(this.f11548o, "getVideoInfo", new Object[0]);
            this.f11557x.block((long) this.f11558y);
        }
        return this.f11547n.mo11508w();
    }

    public float getVideoLoadedFraction() {
        synchronized (this.f11533A) {
            ConditionVariable conditionVariable = new ConditionVariable();
            this.f11557x = conditionVariable;
            this.f11547n.mo11469C(conditionVariable);
            C3450a.m14195b(this.f11548o, "getVideoLoadedFraction", new Object[0]);
            this.f11557x.block((long) this.f11558y);
        }
        return this.f11547n.mo11509x();
    }

    public String getVideoTitle() {
        synchronized (this.f11533A) {
            ConditionVariable conditionVariable = new ConditionVariable();
            this.f11557x = conditionVariable;
            this.f11547n.mo11469C(conditionVariable);
            C3450a.m14195b(this.f11548o, "getVideoTitle", new Object[0]);
            this.f11557x.block((long) this.f11558y);
        }
        return this.f11547n.mo11510y();
    }

    public String getVideoUrl() {
        synchronized (this.f11533A) {
            ConditionVariable conditionVariable = new ConditionVariable();
            this.f11557x = conditionVariable;
            this.f11547n.mo11469C(conditionVariable);
            C3450a.m14195b(this.f11548o, "getVideoUrl", new Object[0]);
            this.f11557x.block((long) this.f11558y);
        }
        return this.f11547n.mo11511z();
    }

    public int getVolume() {
        synchronized (this.f11533A) {
            ConditionVariable conditionVariable = new ConditionVariable();
            this.f11557x = conditionVariable;
            this.f11547n.mo11469C(conditionVariable);
            C3450a.m14195b(this.f11548o, "getVolume", new Object[0]);
            this.f11557x.block((long) this.f11558y);
        }
        return this.f11547n.mo11467A();
    }

    /* renamed from: h */
    public void mo11451h(String str) {
        this.f11537d = str;
        m14126c();
    }

    /* renamed from: k */
    public void mo11452k(int i, int i2) {
        C3450a.m14195b(this.f11548o, "setSize", Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* renamed from: l */
    public void mo11453l() {
        C3450a.m14195b(this.f11548o, "playVideo", new Object[0]);
    }

    /* renamed from: m */
    public void mo11454m() {
        C3450a.m14195b(this.f11548o, "stopVideo", new Object[0]);
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        int width = getWidth();
        int height = getHeight();
        C3428a aVar = this.f11547n;
        if (aVar == null || !aVar.mo11468B()) {
            this.f11547n.mo11472F(width, height);
            return;
        }
        C3450a.m14194a(this.f11548o, "setSize", Integer.valueOf(width), Integer.valueOf(height));
    }

    public void setLoop(boolean z) {
        C3450a.m14195b(this.f11548o, "setLoop", Boolean.valueOf(z));
    }

    public void setOnBufferingUpdateListener(AbstractC3440a aVar) {
        this.f11547n.mo11470D(aVar);
    }

    public void setOnProgressUpdateListener(AbstractC3442c cVar) {
        this.f11547n.mo11471E(cVar);
    }

    public void setPlaybackQuality(EnumC3448f fVar) {
        C3450a.m14195b(this.f11548o, "setPlaybackQuality", fVar.mo11529b());
    }

    public void setPlaybackRate(int i) {
        C3450a.m14195b(this.f11548o, "setPlaybackRate", Integer.valueOf(i));
    }

    public void setShuffle(boolean z) {
        C3450a.m14195b(this.f11548o, "setShuffle", Boolean.valueOf(z));
    }

    public void setVolume(int i) {
        C3450a.m14195b(this.f11548o, "setVolume", Integer.valueOf(i));
    }
}
