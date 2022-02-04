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
    private static final String f11541b = YoutubeTvView.class.getSimpleName();

    /* renamed from: A */
    private final Object f11542A = new Object();

    /* renamed from: B */
    private MediaSession f11543B;

    /* renamed from: C */
    private boolean f11544C;

    /* renamed from: c */
    private EnumC3444b f11545c;

    /* renamed from: d */
    private String f11546d;

    /* renamed from: e */
    private EnumC3448f f11547e;

    /* renamed from: f */
    private int f11548f;

    /* renamed from: g */
    private int f11549g;

    /* renamed from: h */
    private EnumC3446d f11550h;

    /* renamed from: i */
    private EnumC3445c f11551i;

    /* renamed from: j */
    private int f11552j;

    /* renamed from: k */
    private int f11553k;

    /* renamed from: l */
    private int f11554l;

    /* renamed from: m */
    private int f11555m = 0;

    /* renamed from: n */
    private C3428a f11556n;

    /* renamed from: o */
    private WebView f11557o;

    /* renamed from: p */
    private int f11558p;

    /* renamed from: q */
    private boolean f11559q;

    /* renamed from: r */
    private int f11560r;

    /* renamed from: s */
    private int f11561s;

    /* renamed from: t */
    private String f11562t;

    /* renamed from: u */
    private String f11563u;

    /* renamed from: v */
    private String f11564v;

    /* renamed from: w */
    private EnumC3443a f11565w;

    /* renamed from: x */
    private ConditionVariable f11566x = new ConditionVariable();

    /* renamed from: y */
    private int f11567y = 1500;

    /* renamed from: z */
    private List<AbstractC3441b> f11568z = new ArrayList();

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
        this.f11557o = (WebView) findViewById(C3436c.youtube_view);
        ImageView imageView = (ImageView) findViewById(C3436c.play_icon);
        ProgressBar progressBar = (ProgressBar) findViewById(C3436c.progress_bar);
        Handler handler = new Handler();
        this.f11557o.setBackgroundColor(this.f11555m);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        WebSettings settings = this.f11557o.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setPluginState(WebSettings.PluginState.ON);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setDomStorageEnabled(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        this.f11557o.setWebViewClient(new WebViewClient());
        this.f11557o.setWebChromeClient(new C3426a());
        this.f11557o.setPadding(0, 0, 0, 0);
        this.f11557o.setScrollbarFadingEnabled(true);
        C3428a aVar = new C3428a(this.f11568z, handler, progressBar, imageView, this.f11557o, this, this.f11565w.mo11523c());
        this.f11556n = aVar;
        this.f11557o.addJavascriptInterface(aVar, "JSInterface");
        this.f11557o.getSettings().setUserAgentString(this.f11545c.mo11525c());
        if (this.f11544C) {
            MediaSession mediaSession = this.f11543B;
            if (mediaSession != null) {
                mediaSession.setActive(false);
                this.f11543B.release();
            }
            MediaSession mediaSession2 = new MediaSession(getContext(), "fr.bmartel.youtubetv.MediaSession");
            this.f11543B = mediaSession2;
            mediaSession2.setCallback(new C3427b());
            this.f11543B.setFlags(3);
            if (!this.f11543B.isActive()) {
                this.f11543B.setActive(true);
            }
        }
        String str = "file:///android_asset/youtube.html?videoId=" + this.f11546d + "&videoQuality=" + this.f11547e.mo11529b() + "&playerHeight=" + measuredHeight + "&playerWidth=" + measuredWidth + "&rel=" + this.f11548f + "&showinfo=" + this.f11549g + "&controls=" + this.f11550h.mo11527a() + "&autohide=" + this.f11551i.mo11526a() + "&cc_load_policy=" + this.f11552j + "&iv_load_policy=" + this.f11553k + "&autoplay=" + this.f11558p + "&thumbnailQuality=" + this.f11565w.mo11523c() + "&cc_lang_pref=" + this.f11562t + "&hl=" + this.f11564v + "&playlist_id=" + this.f11563u + "&debug=" + this.f11554l;
        Log.v(f11541b, "videoUrl : " + str);
        this.f11557o.loadUrl(str);
    }

    /* renamed from: d */
    private void m14127d() {
        FrameLayout.inflate(getContext(), C3437d.youtube_view, this);
        m14126c();
    }

    /* renamed from: i */
    private void m14128i(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C3438e.f11648f, 0, 0);
        try {
            this.f11546d = obtainStyledAttributes.getString(C3438e.f11668z);
            this.f11547e = EnumC3448f.m14188c(obtainStyledAttributes.getInteger(C3438e.f11631A, C3439f.f11669a.mo11528a()));
            this.f11548f = obtainStyledAttributes.getBoolean(C3438e.f11663u, false) ? 1 : 0;
            this.f11549g = obtainStyledAttributes.getBoolean(C3438e.f11664v, false) ? 1 : 0;
            this.f11550h = EnumC3446d.m14186b(obtainStyledAttributes.getInteger(C3438e.f11661s, C3439f.f11670b.mo11527a()));
            this.f11552j = obtainStyledAttributes.getBoolean(C3438e.f11654l, false) ? 1 : 0;
            this.f11553k = obtainStyledAttributes.getBoolean(C3438e.f11667y, false) ? 1 : 3;
            this.f11551i = EnumC3445c.m14184b(obtainStyledAttributes.getInteger(C3438e.f11649g, C3439f.f11671c.mo11526a()));
            this.f11554l = obtainStyledAttributes.getBoolean(C3438e.f11655m, false) ? 1 : 0;
            this.f11555m = obtainStyledAttributes.getInteger(C3438e.f11657o, 0);
            this.f11558p = obtainStyledAttributes.getBoolean(C3438e.f11650h, true) ? 1 : 0;
            this.f11545c = EnumC3444b.m14181b(obtainStyledAttributes.getInteger(C3438e.f11666x, C3439f.f11672d.mo11524a()));
            this.f11559q = obtainStyledAttributes.getBoolean(C3438e.f11660r, false);
            this.f11560r = obtainStyledAttributes.getInteger(C3438e.f11652j, 2);
            this.f11561s = obtainStyledAttributes.getColor(C3438e.f11651i, -16776961);
            this.f11565w = EnumC3443a.m14178b(obtainStyledAttributes.getInteger(C3438e.f11665w, C3439f.f11673e.mo11522a()));
            this.f11562t = obtainStyledAttributes.getString(C3438e.f11653k);
            this.f11564v = obtainStyledAttributes.getString(C3438e.f11658p);
            this.f11567y = obtainStyledAttributes.getInteger(C3438e.f11656n, 1500);
            this.f11563u = obtainStyledAttributes.getString(C3438e.f11659q);
            this.f11544C = obtainStyledAttributes.getBoolean(C3438e.f11662t, true);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: j */
    private void m14129j() {
        if (this.f11559q) {
            FrameLayout frameLayout = (FrameLayout) findViewById(C3436c.youtube_frame);
            int i = this.f11560r;
            frameLayout.setPadding(i, i, i, i);
            frameLayout.setBackground(getResources().getDrawable(C3435b.webview_selector));
            ((GradientDrawable) ((DrawableContainer.DrawableContainerState) ((StateListDrawable) frameLayout.getBackground()).getConstantState()).getChildren()[0]).setStroke(this.f11560r, this.f11561s);
        }
    }

    /* renamed from: a */
    public void mo11428a(AbstractC3441b bVar) {
        this.f11568z.add(bVar);
    }

    /* renamed from: b */
    public void mo11429b() {
        mo11454m();
        PlaybackState.Builder builder = new PlaybackState.Builder();
        builder.setState(2, 12, 1.0f);
        this.f11543B.setPlaybackState(builder.build());
        this.f11543B.setActive(false);
        String str = f11541b;
        Log.i(str, "closePlayer : " + this.f11543B.isActive());
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 23 || keyCode == 85) {
                C3450a.m14194a(this.f11557o, "playPause", new Object[0]);
            } else if (keyCode == 87) {
                C3450a.m14194a(this.f11557o, "nextVideo", new Object[0]);
            } else if (keyCode == 126) {
                C3450a.m14194a(this.f11557o, "playVideo", new Object[0]);
            } else if (keyCode == 127) {
                C3450a.m14194a(this.f11557o, "playPause", new Object[0]);
            }
        }
        return dispatchKeyEvent;
    }

    /* renamed from: e */
    public boolean mo11431e() {
        return this.f11544C;
    }

    /* renamed from: f */
    public void mo11432f() {
        C3450a.m14195b(this.f11557o, "pauseVideo", new Object[0]);
    }

    /* renamed from: g */
    public void mo11433g() {
        C3450a.m14195b(this.f11557o, "playPause", new Object[0]);
    }

    public List<Integer> getAvailablePlaybackRates() {
        synchronized (this.f11542A) {
            ConditionVariable conditionVariable = new ConditionVariable();
            this.f11566x = conditionVariable;
            this.f11556n.mo11469C(conditionVariable);
            C3450a.m14195b(this.f11557o, "getAvailablePlaybackRateList", new Object[0]);
            this.f11566x.block((long) this.f11567y);
        }
        return this.f11556n.mo11475l();
    }

    public List<EnumC3448f> getAvailableQualityLevels() {
        synchronized (this.f11542A) {
            ConditionVariable conditionVariable = new ConditionVariable();
            this.f11566x = conditionVariable;
            this.f11556n.mo11469C(conditionVariable);
            C3450a.m14195b(this.f11557o, "getAvailableQualityLevels", new Object[0]);
            this.f11566x.block((long) this.f11567y);
        }
        return this.f11556n.mo11477m();
    }

    public float getCurrentPosition() {
        synchronized (this.f11542A) {
            ConditionVariable conditionVariable = new ConditionVariable();
            this.f11566x = conditionVariable;
            this.f11556n.mo11469C(conditionVariable);
            C3450a.m14195b(this.f11557o, "getCurrentTime", new Object[0]);
            this.f11566x.block((long) this.f11567y);
        }
        return this.f11556n.mo11478n();
    }

    public float getDuration() {
        synchronized (this.f11542A) {
            ConditionVariable conditionVariable = new ConditionVariable();
            this.f11566x = conditionVariable;
            this.f11556n.mo11469C(conditionVariable);
            C3450a.m14195b(this.f11557o, "getDuration", new Object[0]);
            this.f11566x.block((long) this.f11567y);
        }
        return this.f11556n.mo11479o();
    }

    public MediaSession getMediaSession() {
        return this.f11543B;
    }

    public EnumC3448f getPlaybackQuality() {
        synchronized (this.f11542A) {
            ConditionVariable conditionVariable = new ConditionVariable();
            this.f11566x = conditionVariable;
            this.f11556n.mo11469C(conditionVariable);
            C3450a.m14195b(this.f11557o, "getPlaybackQuality", new Object[0]);
            this.f11566x.block((long) this.f11567y);
        }
        return this.f11556n.mo11501p();
    }

    public int getPlaybackRate() {
        synchronized (this.f11542A) {
            ConditionVariable conditionVariable = new ConditionVariable();
            this.f11566x = conditionVariable;
            this.f11556n.mo11469C(conditionVariable);
            C3450a.m14195b(this.f11557o, "getPlaybackRate", new Object[0]);
            this.f11566x.block((long) this.f11567y);
        }
        return this.f11556n.mo11502q();
    }

    public EnumC3449g getPlayerState() {
        synchronized (this.f11542A) {
            ConditionVariable conditionVariable = new ConditionVariable();
            this.f11566x = conditionVariable;
            this.f11556n.mo11469C(conditionVariable);
            C3450a.m14195b(this.f11557o, "getPlayerState", new Object[0]);
            this.f11566x.block((long) this.f11567y);
        }
        return this.f11556n.mo11503r();
    }

    public List<String> getPlaylist() {
        synchronized (this.f11542A) {
            ConditionVariable conditionVariable = new ConditionVariable();
            this.f11566x = conditionVariable;
            this.f11556n.mo11469C(conditionVariable);
            C3450a.m14195b(this.f11557o, "getPlaylist", new Object[0]);
            this.f11566x.block((long) this.f11567y);
        }
        return this.f11556n.mo11504s();
    }

    public int getPlaylistIndex() {
        synchronized (this.f11542A) {
            ConditionVariable conditionVariable = new ConditionVariable();
            this.f11566x = conditionVariable;
            this.f11556n.mo11469C(conditionVariable);
            C3450a.m14195b(this.f11557o, "getPlaylistIndex", new Object[0]);
            this.f11566x.block((long) this.f11567y);
        }
        return this.f11556n.mo11505t();
    }

    public String getVideoEmbedCode() {
        synchronized (this.f11542A) {
            ConditionVariable conditionVariable = new ConditionVariable();
            this.f11566x = conditionVariable;
            this.f11556n.mo11469C(conditionVariable);
            C3450a.m14195b(this.f11557o, "getVideoEmbedCode", new Object[0]);
            this.f11566x.block((long) this.f11567y);
        }
        return this.f11556n.mo11506u();
    }

    public String getVideoId() {
        synchronized (this.f11542A) {
            ConditionVariable conditionVariable = new ConditionVariable();
            this.f11566x = conditionVariable;
            this.f11556n.mo11469C(conditionVariable);
            C3450a.m14195b(this.f11557o, "getVideoId", new Object[0]);
            this.f11566x.block((long) this.f11567y);
        }
        return this.f11556n.mo11507v();
    }

    public C3447e getVideoInfo() {
        synchronized (this.f11542A) {
            ConditionVariable conditionVariable = new ConditionVariable();
            this.f11566x = conditionVariable;
            this.f11556n.mo11469C(conditionVariable);
            C3450a.m14195b(this.f11557o, "getVideoInfo", new Object[0]);
            this.f11566x.block((long) this.f11567y);
        }
        return this.f11556n.mo11508w();
    }

    public float getVideoLoadedFraction() {
        synchronized (this.f11542A) {
            ConditionVariable conditionVariable = new ConditionVariable();
            this.f11566x = conditionVariable;
            this.f11556n.mo11469C(conditionVariable);
            C3450a.m14195b(this.f11557o, "getVideoLoadedFraction", new Object[0]);
            this.f11566x.block((long) this.f11567y);
        }
        return this.f11556n.mo11509x();
    }

    public String getVideoTitle() {
        synchronized (this.f11542A) {
            ConditionVariable conditionVariable = new ConditionVariable();
            this.f11566x = conditionVariable;
            this.f11556n.mo11469C(conditionVariable);
            C3450a.m14195b(this.f11557o, "getVideoTitle", new Object[0]);
            this.f11566x.block((long) this.f11567y);
        }
        return this.f11556n.mo11510y();
    }

    public String getVideoUrl() {
        synchronized (this.f11542A) {
            ConditionVariable conditionVariable = new ConditionVariable();
            this.f11566x = conditionVariable;
            this.f11556n.mo11469C(conditionVariable);
            C3450a.m14195b(this.f11557o, "getVideoUrl", new Object[0]);
            this.f11566x.block((long) this.f11567y);
        }
        return this.f11556n.mo11511z();
    }

    public int getVolume() {
        synchronized (this.f11542A) {
            ConditionVariable conditionVariable = new ConditionVariable();
            this.f11566x = conditionVariable;
            this.f11556n.mo11469C(conditionVariable);
            C3450a.m14195b(this.f11557o, "getVolume", new Object[0]);
            this.f11566x.block((long) this.f11567y);
        }
        return this.f11556n.mo11467A();
    }

    /* renamed from: h */
    public void mo11451h(String str) {
        this.f11546d = str;
        m14126c();
    }

    /* renamed from: k */
    public void mo11452k(int i, int i2) {
        C3450a.m14195b(this.f11557o, "setSize", Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* renamed from: l */
    public void mo11453l() {
        C3450a.m14195b(this.f11557o, "playVideo", new Object[0]);
    }

    /* renamed from: m */
    public void mo11454m() {
        C3450a.m14195b(this.f11557o, "stopVideo", new Object[0]);
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        int width = getWidth();
        int height = getHeight();
        C3428a aVar = this.f11556n;
        if (aVar == null || !aVar.mo11468B()) {
            this.f11556n.mo11472F(width, height);
            return;
        }
        C3450a.m14194a(this.f11557o, "setSize", Integer.valueOf(width), Integer.valueOf(height));
    }

    public void setLoop(boolean z) {
        C3450a.m14195b(this.f11557o, "setLoop", Boolean.valueOf(z));
    }

    public void setOnBufferingUpdateListener(AbstractC3440a aVar) {
        this.f11556n.mo11470D(aVar);
    }

    public void setOnProgressUpdateListener(AbstractC3442c cVar) {
        this.f11556n.mo11471E(cVar);
    }

    public void setPlaybackQuality(EnumC3448f fVar) {
        C3450a.m14195b(this.f11557o, "setPlaybackQuality", fVar.mo11529b());
    }

    public void setPlaybackRate(int i) {
        C3450a.m14195b(this.f11557o, "setPlaybackRate", Integer.valueOf(i));
    }

    public void setShuffle(boolean z) {
        C3450a.m14195b(this.f11557o, "setShuffle", Boolean.valueOf(z));
    }

    public void setVolume(int i) {
        C3450a.m14195b(this.f11557o, "setVolume", Integer.valueOf(i));
    }
}
