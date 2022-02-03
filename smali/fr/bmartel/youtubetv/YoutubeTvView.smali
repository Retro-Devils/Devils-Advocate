.class public Lfr/bmartel/youtubetv/YoutubeTvView;
.super Landroid/widget/FrameLayout;
.source ""


# static fields
.field private static final b:Ljava/lang/String;


# instance fields
.field private final A:Ljava/lang/Object;

.field private B:Landroid/media/session/MediaSession;

.field private C:Z

.field private c:Lfr/bmartel/youtubetv/h/b;

.field private d:Ljava/lang/String;

.field private e:Lfr/bmartel/youtubetv/h/f;

.field private f:I

.field private g:I

.field private h:Lfr/bmartel/youtubetv/h/d;

.field private i:Lfr/bmartel/youtubetv/h/c;

.field private j:I

.field private k:I

.field private l:I

.field private m:I

.field private n:Lfr/bmartel/youtubetv/a;

.field private o:Landroid/webkit/WebView;

.field private p:I

.field private q:Z

.field private r:I

.field private s:I

.field private t:Ljava/lang/String;

.field private u:Ljava/lang/String;

.field private v:Ljava/lang/String;

.field private w:Lfr/bmartel/youtubetv/h/a;

.field private x:Landroid/os/ConditionVariable;

.field private y:I

.field private z:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lfr/bmartel/youtubetv/g/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lfr/bmartel/youtubetv/YoutubeTvView;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lfr/bmartel/youtubetv/YoutubeTvView;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    iput v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->m:I

    new-instance v0, Landroid/os/ConditionVariable;

    invoke-direct {v0}, Landroid/os/ConditionVariable;-><init>()V

    iput-object v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->x:Landroid/os/ConditionVariable;

    const/16 v0, 0x5dc

    iput v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->y:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->z:Ljava/util/List;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->A:Ljava/lang/Object;

    invoke-direct {p0, p1, p2}, Lfr/bmartel/youtubetv/YoutubeTvView;->i(Landroid/content/Context;Landroid/util/AttributeSet;)V

    invoke-direct {p0}, Lfr/bmartel/youtubetv/YoutubeTvView;->d()V

    return-void
.end method

.method private c()V
    .locals 13

    invoke-direct {p0}, Lfr/bmartel/youtubetv/YoutubeTvView;->j()V

    sget v0, Lfr/bmartel/youtubetv/c;->d:I

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    iput-object v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->o:Landroid/webkit/WebView;

    sget v0, Lfr/bmartel/youtubetv/c;->a:I

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/ImageView;

    sget v0, Lfr/bmartel/youtubetv/c;->b:I

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/ProgressBar;

    new-instance v3, Landroid/os/Handler;

    invoke-direct {v3}, Landroid/os/Handler;-><init>()V

    iget-object v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->o:Landroid/webkit/WebView;

    iget v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->m:I

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setBackgroundColor(I)V

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getMeasuredWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getMeasuredHeight()I

    move-result v9

    iget-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->o:Landroid/webkit/WebView;

    invoke-virtual {v1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v1

    const/4 v10, 0x1

    invoke-virtual {v1, v10}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    invoke-virtual {v1, v10}, Landroid/webkit/WebSettings;->setJavaScriptCanOpenWindowsAutomatically(Z)V

    sget-object v2, Landroid/webkit/WebSettings$PluginState;->ON:Landroid/webkit/WebSettings$PluginState;

    invoke-virtual {v1, v2}, Landroid/webkit/WebSettings;->setPluginState(Landroid/webkit/WebSettings$PluginState;)V

    invoke-virtual {v1, v10}, Landroid/webkit/WebSettings;->setLoadWithOverviewMode(Z)V

    invoke-virtual {v1, v10}, Landroid/webkit/WebSettings;->setUseWideViewPort(Z)V

    invoke-virtual {v1, v10}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V

    const/4 v11, 0x0

    invoke-virtual {v1, v11}, Landroid/webkit/WebSettings;->setMediaPlaybackRequiresUserGesture(Z)V

    iget-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->o:Landroid/webkit/WebView;

    new-instance v2, Landroid/webkit/WebViewClient;

    invoke-direct {v2}, Landroid/webkit/WebViewClient;-><init>()V

    invoke-virtual {v1, v2}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    iget-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->o:Landroid/webkit/WebView;

    new-instance v2, Lfr/bmartel/youtubetv/YoutubeTvView$a;

    invoke-direct {v2, p0}, Lfr/bmartel/youtubetv/YoutubeTvView$a;-><init>(Lfr/bmartel/youtubetv/YoutubeTvView;)V

    invoke-virtual {v1, v2}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V

    iget-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->o:Landroid/webkit/WebView;

    invoke-virtual {v1, v11, v11, v11, v11}, Landroid/webkit/WebView;->setPadding(IIII)V

    iget-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->o:Landroid/webkit/WebView;

    invoke-virtual {v1, v10}, Landroid/webkit/WebView;->setScrollbarFadingEnabled(Z)V

    new-instance v12, Lfr/bmartel/youtubetv/a;

    iget-object v2, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->z:Ljava/util/List;

    iget-object v6, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->o:Landroid/webkit/WebView;

    iget-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->w:Lfr/bmartel/youtubetv/h/a;

    invoke-virtual {v1}, Lfr/bmartel/youtubetv/h/a;->c()Ljava/lang/String;

    move-result-object v8

    move-object v1, v12

    move-object v7, p0

    invoke-direct/range {v1 .. v8}, Lfr/bmartel/youtubetv/a;-><init>(Ljava/util/List;Landroid/os/Handler;Landroid/widget/ProgressBar;Landroid/widget/ImageView;Landroid/webkit/WebView;Lfr/bmartel/youtubetv/YoutubeTvView;Ljava/lang/String;)V

    iput-object v12, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->n:Lfr/bmartel/youtubetv/a;

    iget-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->o:Landroid/webkit/WebView;

    const-string v2, "JSInterface"

    invoke-virtual {v1, v12, v2}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->o:Landroid/webkit/WebView;

    invoke-virtual {v1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v1

    iget-object v2, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->c:Lfr/bmartel/youtubetv/h/b;

    invoke-virtual {v2}, Lfr/bmartel/youtubetv/h/b;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/webkit/WebSettings;->setUserAgentString(Ljava/lang/String;)V

    iget-boolean v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->C:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->B:Landroid/media/session/MediaSession;

    if-eqz v1, :cond_0

    invoke-virtual {v1, v11}, Landroid/media/session/MediaSession;->setActive(Z)V

    iget-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->B:Landroid/media/session/MediaSession;

    invoke-virtual {v1}, Landroid/media/session/MediaSession;->release()V

    :cond_0
    new-instance v1, Landroid/media/session/MediaSession;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "fr.bmartel.youtubetv.MediaSession"

    invoke-direct {v1, v2, v3}, Landroid/media/session/MediaSession;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->B:Landroid/media/session/MediaSession;

    new-instance v2, Lfr/bmartel/youtubetv/YoutubeTvView$b;

    invoke-direct {v2, p0}, Lfr/bmartel/youtubetv/YoutubeTvView$b;-><init>(Lfr/bmartel/youtubetv/YoutubeTvView;)V

    invoke-virtual {v1, v2}, Landroid/media/session/MediaSession;->setCallback(Landroid/media/session/MediaSession$Callback;)V

    iget-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->B:Landroid/media/session/MediaSession;

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Landroid/media/session/MediaSession;->setFlags(I)V

    iget-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->B:Landroid/media/session/MediaSession;

    invoke-virtual {v1}, Landroid/media/session/MediaSession;->isActive()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->B:Landroid/media/session/MediaSession;

    invoke-virtual {v1, v10}, Landroid/media/session/MediaSession;->setActive(Z)V

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "file:///android_asset/youtube.html?videoId="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->d:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "&videoQuality="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->e:Lfr/bmartel/youtubetv/h/f;

    invoke-virtual {v2}, Lfr/bmartel/youtubetv/h/f;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "&playerHeight="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "&playerWidth="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "&rel="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->f:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "&showinfo="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->g:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "&controls="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->h:Lfr/bmartel/youtubetv/h/d;

    invoke-virtual {v0}, Lfr/bmartel/youtubetv/h/d;->a()I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "&autohide="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->i:Lfr/bmartel/youtubetv/h/c;

    invoke-virtual {v0}, Lfr/bmartel/youtubetv/h/c;->a()I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "&cc_load_policy="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->j:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "&iv_load_policy="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->k:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "&autoplay="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->p:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "&thumbnailQuality="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->w:Lfr/bmartel/youtubetv/h/a;

    invoke-virtual {v0}, Lfr/bmartel/youtubetv/h/a;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "&cc_lang_pref="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->t:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "&hl="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->v:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "&playlist_id="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->u:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "&debug="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->l:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lfr/bmartel/youtubetv/YoutubeTvView;->b:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "videoUrl : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->o:Landroid/webkit/WebView;

    invoke-virtual {v1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    return-void
.end method

.method private d()V
    .locals 2

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lfr/bmartel/youtubetv/d;->a:I

    invoke-static {v0, v1, p0}, Landroid/widget/FrameLayout;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    invoke-direct {p0}, Lfr/bmartel/youtubetv/YoutubeTvView;->c()V

    return-void
.end method

.method private i(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    sget-object v0, Lfr/bmartel/youtubetv/e;->f:[I

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, v1, v1}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    :try_start_0
    sget p2, Lfr/bmartel/youtubetv/e;->z:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->d:Ljava/lang/String;

    sget p2, Lfr/bmartel/youtubetv/e;->A:I

    sget-object v0, Lfr/bmartel/youtubetv/f;->a:Lfr/bmartel/youtubetv/h/f;

    invoke-virtual {v0}, Lfr/bmartel/youtubetv/h/f;->a()I

    move-result v0

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p2

    invoke-static {p2}, Lfr/bmartel/youtubetv/h/f;->c(I)Lfr/bmartel/youtubetv/h/f;

    move-result-object p2

    iput-object p2, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->e:Lfr/bmartel/youtubetv/h/f;

    sget p2, Lfr/bmartel/youtubetv/e;->u:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    const/4 v0, 0x1

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    iput p2, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->f:I

    sget p2, Lfr/bmartel/youtubetv/e;->v:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    if-eqz p2, :cond_1

    const/4 p2, 0x1

    goto :goto_1

    :cond_1
    const/4 p2, 0x0

    :goto_1
    iput p2, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->g:I

    sget p2, Lfr/bmartel/youtubetv/e;->s:I

    sget-object v2, Lfr/bmartel/youtubetv/f;->b:Lfr/bmartel/youtubetv/h/d;

    invoke-virtual {v2}, Lfr/bmartel/youtubetv/h/d;->a()I

    move-result v2

    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p2

    invoke-static {p2}, Lfr/bmartel/youtubetv/h/d;->b(I)Lfr/bmartel/youtubetv/h/d;

    move-result-object p2

    iput-object p2, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->h:Lfr/bmartel/youtubetv/h/d;

    sget p2, Lfr/bmartel/youtubetv/e;->l:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    if-eqz p2, :cond_2

    const/4 p2, 0x1

    goto :goto_2

    :cond_2
    const/4 p2, 0x0

    :goto_2
    iput p2, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->j:I

    sget p2, Lfr/bmartel/youtubetv/e;->y:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    if-eqz p2, :cond_3

    const/4 p2, 0x1

    goto :goto_3

    :cond_3
    const/4 p2, 0x3

    :goto_3
    iput p2, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->k:I

    sget p2, Lfr/bmartel/youtubetv/e;->g:I

    sget-object v2, Lfr/bmartel/youtubetv/f;->c:Lfr/bmartel/youtubetv/h/c;

    invoke-virtual {v2}, Lfr/bmartel/youtubetv/h/c;->a()I

    move-result v2

    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p2

    invoke-static {p2}, Lfr/bmartel/youtubetv/h/c;->b(I)Lfr/bmartel/youtubetv/h/c;

    move-result-object p2

    iput-object p2, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->i:Lfr/bmartel/youtubetv/h/c;

    sget p2, Lfr/bmartel/youtubetv/e;->m:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    if-eqz p2, :cond_4

    const/4 p2, 0x1

    goto :goto_4

    :cond_4
    const/4 p2, 0x0

    :goto_4
    iput p2, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->l:I

    sget p2, Lfr/bmartel/youtubetv/e;->o:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p2

    iput p2, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->m:I

    sget p2, Lfr/bmartel/youtubetv/e;->h:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    if-eqz p2, :cond_5

    const/4 p2, 0x1

    goto :goto_5

    :cond_5
    const/4 p2, 0x0

    :goto_5
    iput p2, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->p:I

    sget p2, Lfr/bmartel/youtubetv/e;->x:I

    sget-object v2, Lfr/bmartel/youtubetv/f;->d:Lfr/bmartel/youtubetv/h/b;

    invoke-virtual {v2}, Lfr/bmartel/youtubetv/h/b;->a()I

    move-result v2

    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p2

    invoke-static {p2}, Lfr/bmartel/youtubetv/h/b;->b(I)Lfr/bmartel/youtubetv/h/b;

    move-result-object p2

    iput-object p2, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->c:Lfr/bmartel/youtubetv/h/b;

    sget p2, Lfr/bmartel/youtubetv/e;->r:I

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->q:Z

    sget p2, Lfr/bmartel/youtubetv/e;->j:I

    const/4 v1, 0x2

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p2

    iput p2, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->r:I

    sget p2, Lfr/bmartel/youtubetv/e;->i:I

    const v1, -0xffff01

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->s:I

    sget p2, Lfr/bmartel/youtubetv/e;->w:I

    sget-object v1, Lfr/bmartel/youtubetv/f;->e:Lfr/bmartel/youtubetv/h/a;

    invoke-virtual {v1}, Lfr/bmartel/youtubetv/h/a;->a()I

    move-result v1

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p2

    invoke-static {p2}, Lfr/bmartel/youtubetv/h/a;->b(I)Lfr/bmartel/youtubetv/h/a;

    move-result-object p2

    iput-object p2, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->w:Lfr/bmartel/youtubetv/h/a;

    sget p2, Lfr/bmartel/youtubetv/e;->k:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->t:Ljava/lang/String;

    sget p2, Lfr/bmartel/youtubetv/e;->p:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->v:Ljava/lang/String;

    sget p2, Lfr/bmartel/youtubetv/e;->n:I

    const/16 v1, 0x5dc

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p2

    iput p2, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->y:I

    sget p2, Lfr/bmartel/youtubetv/e;->q:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->u:Ljava/lang/String;

    sget p2, Lfr/bmartel/youtubetv/e;->t:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->C:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void

    :catchall_0
    move-exception p2

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    throw p2
.end method

.method private j()V
    .locals 3

    iget-boolean v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->q:Z

    if-eqz v0, :cond_0

    sget v0, Lfr/bmartel/youtubetv/c;->c:I

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iget v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->r:I

    invoke-virtual {v0, v1, v1, v1, v1}, Landroid/widget/FrameLayout;->setPadding(IIII)V

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lfr/bmartel/youtubetv/b;->a:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/StateListDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/StateListDrawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/DrawableContainer$DrawableContainerState;

    invoke-virtual {v0}, Landroid/graphics/drawable/DrawableContainer$DrawableContainerState;->getChildren()[Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    check-cast v0, Landroid/graphics/drawable/GradientDrawable;

    iget v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->r:I

    iget v2, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->s:I

    invoke-virtual {v0, v1, v2}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    :cond_0
    return-void
.end method


# virtual methods
.method public a(Lfr/bmartel/youtubetv/g/b;)V
    .locals 1

    iget-object v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->z:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public b()V
    .locals 5

    invoke-virtual {p0}, Lfr/bmartel/youtubetv/YoutubeTvView;->m()V

    new-instance v0, Landroid/media/session/PlaybackState$Builder;

    invoke-direct {v0}, Landroid/media/session/PlaybackState$Builder;-><init>()V

    const/4 v1, 0x2

    const-wide/16 v2, 0xc

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/media/session/PlaybackState$Builder;->setState(IJF)Landroid/media/session/PlaybackState$Builder;

    iget-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->B:Landroid/media/session/MediaSession;

    invoke-virtual {v0}, Landroid/media/session/PlaybackState$Builder;->build()Landroid/media/session/PlaybackState;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/media/session/MediaSession;->setPlaybackState(Landroid/media/session/PlaybackState;)V

    iget-object v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->B:Landroid/media/session/MediaSession;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/media/session/MediaSession;->setActive(Z)V

    sget-object v0, Lfr/bmartel/youtubetv/YoutubeTvView;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "closePlayer : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->B:Landroid/media/session/MediaSession;

    invoke-virtual {v2}, Landroid/media/session/MediaSession;->isActive()Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 4

    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result v0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v1

    if-nez v1, :cond_4

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result p1

    const/16 v1, 0x17

    const-string v2, "playPause"

    const/4 v3, 0x0

    if-eq p1, v1, :cond_3

    const/16 v1, 0x55

    if-eq p1, v1, :cond_3

    const/16 v1, 0x57

    if-eq p1, v1, :cond_2

    const/16 v1, 0x7e

    if-eq p1, v1, :cond_1

    const/16 v1, 0x7f

    if-eq p1, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->o:Landroid/webkit/WebView;

    new-array v1, v3, [Ljava/lang/Object;

    invoke-static {p1, v2, v1}, Lfr/bmartel/youtubetv/i/a;->a(Landroid/webkit/WebView;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->o:Landroid/webkit/WebView;

    new-array v1, v3, [Ljava/lang/Object;

    const-string v2, "playVideo"

    invoke-static {p1, v2, v1}, Lfr/bmartel/youtubetv/i/a;->a(Landroid/webkit/WebView;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->o:Landroid/webkit/WebView;

    new-array v1, v3, [Ljava/lang/Object;

    const-string v2, "nextVideo"

    invoke-static {p1, v2, v1}, Lfr/bmartel/youtubetv/i/a;->a(Landroid/webkit/WebView;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->o:Landroid/webkit/WebView;

    new-array v1, v3, [Ljava/lang/Object;

    invoke-static {p1, v2, v1}, Lfr/bmartel/youtubetv/i/a;->a(Landroid/webkit/WebView;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_4
    :goto_0
    return v0
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->C:Z

    return v0
.end method

.method public f()V
    .locals 3

    iget-object v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->o:Landroid/webkit/WebView;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "pauseVideo"

    invoke-static {v0, v2, v1}, Lfr/bmartel/youtubetv/i/a;->b(Landroid/webkit/WebView;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public g()V
    .locals 3

    iget-object v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->o:Landroid/webkit/WebView;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "playPause"

    invoke-static {v0, v2, v1}, Lfr/bmartel/youtubetv/i/a;->b(Landroid/webkit/WebView;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public getAvailablePlaybackRates()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->A:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    new-instance v1, Landroid/os/ConditionVariable;

    invoke-direct {v1}, Landroid/os/ConditionVariable;-><init>()V

    iput-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->x:Landroid/os/ConditionVariable;

    iget-object v2, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->n:Lfr/bmartel/youtubetv/a;

    invoke-virtual {v2, v1}, Lfr/bmartel/youtubetv/a;->C(Landroid/os/ConditionVariable;)V

    iget-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->o:Landroid/webkit/WebView;

    const-string v2, "getAvailablePlaybackRateList"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v1, v2, v3}, Lfr/bmartel/youtubetv/i/a;->b(Landroid/webkit/WebView;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->x:Landroid/os/ConditionVariable;

    iget v2, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->y:I

    int-to-long v2, v2

    invoke-virtual {v1, v2, v3}, Landroid/os/ConditionVariable;->block(J)Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->n:Lfr/bmartel/youtubetv/a;

    invoke-virtual {v0}, Lfr/bmartel/youtubetv/a;->l()Ljava/util/List;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public getAvailableQualityLevels()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lfr/bmartel/youtubetv/h/f;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->A:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    new-instance v1, Landroid/os/ConditionVariable;

    invoke-direct {v1}, Landroid/os/ConditionVariable;-><init>()V

    iput-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->x:Landroid/os/ConditionVariable;

    iget-object v2, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->n:Lfr/bmartel/youtubetv/a;

    invoke-virtual {v2, v1}, Lfr/bmartel/youtubetv/a;->C(Landroid/os/ConditionVariable;)V

    iget-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->o:Landroid/webkit/WebView;

    const-string v2, "getAvailableQualityLevels"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v1, v2, v3}, Lfr/bmartel/youtubetv/i/a;->b(Landroid/webkit/WebView;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->x:Landroid/os/ConditionVariable;

    iget v2, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->y:I

    int-to-long v2, v2

    invoke-virtual {v1, v2, v3}, Landroid/os/ConditionVariable;->block(J)Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->n:Lfr/bmartel/youtubetv/a;

    invoke-virtual {v0}, Lfr/bmartel/youtubetv/a;->m()Ljava/util/List;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public getCurrentPosition()F
    .locals 4

    iget-object v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->A:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    new-instance v1, Landroid/os/ConditionVariable;

    invoke-direct {v1}, Landroid/os/ConditionVariable;-><init>()V

    iput-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->x:Landroid/os/ConditionVariable;

    iget-object v2, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->n:Lfr/bmartel/youtubetv/a;

    invoke-virtual {v2, v1}, Lfr/bmartel/youtubetv/a;->C(Landroid/os/ConditionVariable;)V

    iget-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->o:Landroid/webkit/WebView;

    const-string v2, "getCurrentTime"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v1, v2, v3}, Lfr/bmartel/youtubetv/i/a;->b(Landroid/webkit/WebView;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->x:Landroid/os/ConditionVariable;

    iget v2, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->y:I

    int-to-long v2, v2

    invoke-virtual {v1, v2, v3}, Landroid/os/ConditionVariable;->block(J)Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->n:Lfr/bmartel/youtubetv/a;

    invoke-virtual {v0}, Lfr/bmartel/youtubetv/a;->n()F

    move-result v0

    return v0

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public getDuration()F
    .locals 4

    iget-object v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->A:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    new-instance v1, Landroid/os/ConditionVariable;

    invoke-direct {v1}, Landroid/os/ConditionVariable;-><init>()V

    iput-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->x:Landroid/os/ConditionVariable;

    iget-object v2, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->n:Lfr/bmartel/youtubetv/a;

    invoke-virtual {v2, v1}, Lfr/bmartel/youtubetv/a;->C(Landroid/os/ConditionVariable;)V

    iget-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->o:Landroid/webkit/WebView;

    const-string v2, "getDuration"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v1, v2, v3}, Lfr/bmartel/youtubetv/i/a;->b(Landroid/webkit/WebView;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->x:Landroid/os/ConditionVariable;

    iget v2, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->y:I

    int-to-long v2, v2

    invoke-virtual {v1, v2, v3}, Landroid/os/ConditionVariable;->block(J)Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->n:Lfr/bmartel/youtubetv/a;

    invoke-virtual {v0}, Lfr/bmartel/youtubetv/a;->o()F

    move-result v0

    return v0

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public getMediaSession()Landroid/media/session/MediaSession;
    .locals 1

    iget-object v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->B:Landroid/media/session/MediaSession;

    return-object v0
.end method

.method public getPlaybackQuality()Lfr/bmartel/youtubetv/h/f;
    .locals 4

    iget-object v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->A:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    new-instance v1, Landroid/os/ConditionVariable;

    invoke-direct {v1}, Landroid/os/ConditionVariable;-><init>()V

    iput-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->x:Landroid/os/ConditionVariable;

    iget-object v2, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->n:Lfr/bmartel/youtubetv/a;

    invoke-virtual {v2, v1}, Lfr/bmartel/youtubetv/a;->C(Landroid/os/ConditionVariable;)V

    iget-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->o:Landroid/webkit/WebView;

    const-string v2, "getPlaybackQuality"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v1, v2, v3}, Lfr/bmartel/youtubetv/i/a;->b(Landroid/webkit/WebView;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->x:Landroid/os/ConditionVariable;

    iget v2, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->y:I

    int-to-long v2, v2

    invoke-virtual {v1, v2, v3}, Landroid/os/ConditionVariable;->block(J)Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->n:Lfr/bmartel/youtubetv/a;

    invoke-virtual {v0}, Lfr/bmartel/youtubetv/a;->p()Lfr/bmartel/youtubetv/h/f;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public getPlaybackRate()I
    .locals 4

    iget-object v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->A:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    new-instance v1, Landroid/os/ConditionVariable;

    invoke-direct {v1}, Landroid/os/ConditionVariable;-><init>()V

    iput-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->x:Landroid/os/ConditionVariable;

    iget-object v2, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->n:Lfr/bmartel/youtubetv/a;

    invoke-virtual {v2, v1}, Lfr/bmartel/youtubetv/a;->C(Landroid/os/ConditionVariable;)V

    iget-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->o:Landroid/webkit/WebView;

    const-string v2, "getPlaybackRate"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v1, v2, v3}, Lfr/bmartel/youtubetv/i/a;->b(Landroid/webkit/WebView;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->x:Landroid/os/ConditionVariable;

    iget v2, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->y:I

    int-to-long v2, v2

    invoke-virtual {v1, v2, v3}, Landroid/os/ConditionVariable;->block(J)Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->n:Lfr/bmartel/youtubetv/a;

    invoke-virtual {v0}, Lfr/bmartel/youtubetv/a;->q()I

    move-result v0

    return v0

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public getPlayerState()Lfr/bmartel/youtubetv/h/g;
    .locals 4

    iget-object v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->A:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    new-instance v1, Landroid/os/ConditionVariable;

    invoke-direct {v1}, Landroid/os/ConditionVariable;-><init>()V

    iput-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->x:Landroid/os/ConditionVariable;

    iget-object v2, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->n:Lfr/bmartel/youtubetv/a;

    invoke-virtual {v2, v1}, Lfr/bmartel/youtubetv/a;->C(Landroid/os/ConditionVariable;)V

    iget-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->o:Landroid/webkit/WebView;

    const-string v2, "getPlayerState"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v1, v2, v3}, Lfr/bmartel/youtubetv/i/a;->b(Landroid/webkit/WebView;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->x:Landroid/os/ConditionVariable;

    iget v2, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->y:I

    int-to-long v2, v2

    invoke-virtual {v1, v2, v3}, Landroid/os/ConditionVariable;->block(J)Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->n:Lfr/bmartel/youtubetv/a;

    invoke-virtual {v0}, Lfr/bmartel/youtubetv/a;->r()Lfr/bmartel/youtubetv/h/g;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public getPlaylist()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->A:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    new-instance v1, Landroid/os/ConditionVariable;

    invoke-direct {v1}, Landroid/os/ConditionVariable;-><init>()V

    iput-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->x:Landroid/os/ConditionVariable;

    iget-object v2, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->n:Lfr/bmartel/youtubetv/a;

    invoke-virtual {v2, v1}, Lfr/bmartel/youtubetv/a;->C(Landroid/os/ConditionVariable;)V

    iget-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->o:Landroid/webkit/WebView;

    const-string v2, "getPlaylist"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v1, v2, v3}, Lfr/bmartel/youtubetv/i/a;->b(Landroid/webkit/WebView;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->x:Landroid/os/ConditionVariable;

    iget v2, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->y:I

    int-to-long v2, v2

    invoke-virtual {v1, v2, v3}, Landroid/os/ConditionVariable;->block(J)Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->n:Lfr/bmartel/youtubetv/a;

    invoke-virtual {v0}, Lfr/bmartel/youtubetv/a;->s()Ljava/util/List;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public getPlaylistIndex()I
    .locals 4

    iget-object v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->A:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    new-instance v1, Landroid/os/ConditionVariable;

    invoke-direct {v1}, Landroid/os/ConditionVariable;-><init>()V

    iput-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->x:Landroid/os/ConditionVariable;

    iget-object v2, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->n:Lfr/bmartel/youtubetv/a;

    invoke-virtual {v2, v1}, Lfr/bmartel/youtubetv/a;->C(Landroid/os/ConditionVariable;)V

    iget-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->o:Landroid/webkit/WebView;

    const-string v2, "getPlaylistIndex"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v1, v2, v3}, Lfr/bmartel/youtubetv/i/a;->b(Landroid/webkit/WebView;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->x:Landroid/os/ConditionVariable;

    iget v2, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->y:I

    int-to-long v2, v2

    invoke-virtual {v1, v2, v3}, Landroid/os/ConditionVariable;->block(J)Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->n:Lfr/bmartel/youtubetv/a;

    invoke-virtual {v0}, Lfr/bmartel/youtubetv/a;->t()I

    move-result v0

    return v0

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public getVideoEmbedCode()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->A:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    new-instance v1, Landroid/os/ConditionVariable;

    invoke-direct {v1}, Landroid/os/ConditionVariable;-><init>()V

    iput-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->x:Landroid/os/ConditionVariable;

    iget-object v2, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->n:Lfr/bmartel/youtubetv/a;

    invoke-virtual {v2, v1}, Lfr/bmartel/youtubetv/a;->C(Landroid/os/ConditionVariable;)V

    iget-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->o:Landroid/webkit/WebView;

    const-string v2, "getVideoEmbedCode"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v1, v2, v3}, Lfr/bmartel/youtubetv/i/a;->b(Landroid/webkit/WebView;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->x:Landroid/os/ConditionVariable;

    iget v2, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->y:I

    int-to-long v2, v2

    invoke-virtual {v1, v2, v3}, Landroid/os/ConditionVariable;->block(J)Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->n:Lfr/bmartel/youtubetv/a;

    invoke-virtual {v0}, Lfr/bmartel/youtubetv/a;->u()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public getVideoId()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->A:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    new-instance v1, Landroid/os/ConditionVariable;

    invoke-direct {v1}, Landroid/os/ConditionVariable;-><init>()V

    iput-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->x:Landroid/os/ConditionVariable;

    iget-object v2, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->n:Lfr/bmartel/youtubetv/a;

    invoke-virtual {v2, v1}, Lfr/bmartel/youtubetv/a;->C(Landroid/os/ConditionVariable;)V

    iget-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->o:Landroid/webkit/WebView;

    const-string v2, "getVideoId"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v1, v2, v3}, Lfr/bmartel/youtubetv/i/a;->b(Landroid/webkit/WebView;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->x:Landroid/os/ConditionVariable;

    iget v2, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->y:I

    int-to-long v2, v2

    invoke-virtual {v1, v2, v3}, Landroid/os/ConditionVariable;->block(J)Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->n:Lfr/bmartel/youtubetv/a;

    invoke-virtual {v0}, Lfr/bmartel/youtubetv/a;->v()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public getVideoInfo()Lfr/bmartel/youtubetv/h/e;
    .locals 4

    iget-object v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->A:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    new-instance v1, Landroid/os/ConditionVariable;

    invoke-direct {v1}, Landroid/os/ConditionVariable;-><init>()V

    iput-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->x:Landroid/os/ConditionVariable;

    iget-object v2, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->n:Lfr/bmartel/youtubetv/a;

    invoke-virtual {v2, v1}, Lfr/bmartel/youtubetv/a;->C(Landroid/os/ConditionVariable;)V

    iget-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->o:Landroid/webkit/WebView;

    const-string v2, "getVideoInfo"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v1, v2, v3}, Lfr/bmartel/youtubetv/i/a;->b(Landroid/webkit/WebView;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->x:Landroid/os/ConditionVariable;

    iget v2, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->y:I

    int-to-long v2, v2

    invoke-virtual {v1, v2, v3}, Landroid/os/ConditionVariable;->block(J)Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->n:Lfr/bmartel/youtubetv/a;

    invoke-virtual {v0}, Lfr/bmartel/youtubetv/a;->w()Lfr/bmartel/youtubetv/h/e;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public getVideoLoadedFraction()F
    .locals 4

    iget-object v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->A:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    new-instance v1, Landroid/os/ConditionVariable;

    invoke-direct {v1}, Landroid/os/ConditionVariable;-><init>()V

    iput-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->x:Landroid/os/ConditionVariable;

    iget-object v2, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->n:Lfr/bmartel/youtubetv/a;

    invoke-virtual {v2, v1}, Lfr/bmartel/youtubetv/a;->C(Landroid/os/ConditionVariable;)V

    iget-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->o:Landroid/webkit/WebView;

    const-string v2, "getVideoLoadedFraction"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v1, v2, v3}, Lfr/bmartel/youtubetv/i/a;->b(Landroid/webkit/WebView;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->x:Landroid/os/ConditionVariable;

    iget v2, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->y:I

    int-to-long v2, v2

    invoke-virtual {v1, v2, v3}, Landroid/os/ConditionVariable;->block(J)Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->n:Lfr/bmartel/youtubetv/a;

    invoke-virtual {v0}, Lfr/bmartel/youtubetv/a;->x()F

    move-result v0

    return v0

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public getVideoTitle()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->A:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    new-instance v1, Landroid/os/ConditionVariable;

    invoke-direct {v1}, Landroid/os/ConditionVariable;-><init>()V

    iput-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->x:Landroid/os/ConditionVariable;

    iget-object v2, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->n:Lfr/bmartel/youtubetv/a;

    invoke-virtual {v2, v1}, Lfr/bmartel/youtubetv/a;->C(Landroid/os/ConditionVariable;)V

    iget-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->o:Landroid/webkit/WebView;

    const-string v2, "getVideoTitle"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v1, v2, v3}, Lfr/bmartel/youtubetv/i/a;->b(Landroid/webkit/WebView;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->x:Landroid/os/ConditionVariable;

    iget v2, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->y:I

    int-to-long v2, v2

    invoke-virtual {v1, v2, v3}, Landroid/os/ConditionVariable;->block(J)Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->n:Lfr/bmartel/youtubetv/a;

    invoke-virtual {v0}, Lfr/bmartel/youtubetv/a;->y()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public getVideoUrl()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->A:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    new-instance v1, Landroid/os/ConditionVariable;

    invoke-direct {v1}, Landroid/os/ConditionVariable;-><init>()V

    iput-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->x:Landroid/os/ConditionVariable;

    iget-object v2, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->n:Lfr/bmartel/youtubetv/a;

    invoke-virtual {v2, v1}, Lfr/bmartel/youtubetv/a;->C(Landroid/os/ConditionVariable;)V

    iget-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->o:Landroid/webkit/WebView;

    const-string v2, "getVideoUrl"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v1, v2, v3}, Lfr/bmartel/youtubetv/i/a;->b(Landroid/webkit/WebView;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->x:Landroid/os/ConditionVariable;

    iget v2, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->y:I

    int-to-long v2, v2

    invoke-virtual {v1, v2, v3}, Landroid/os/ConditionVariable;->block(J)Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->n:Lfr/bmartel/youtubetv/a;

    invoke-virtual {v0}, Lfr/bmartel/youtubetv/a;->z()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public getVolume()I
    .locals 4

    iget-object v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->A:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    new-instance v1, Landroid/os/ConditionVariable;

    invoke-direct {v1}, Landroid/os/ConditionVariable;-><init>()V

    iput-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->x:Landroid/os/ConditionVariable;

    iget-object v2, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->n:Lfr/bmartel/youtubetv/a;

    invoke-virtual {v2, v1}, Lfr/bmartel/youtubetv/a;->C(Landroid/os/ConditionVariable;)V

    iget-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->o:Landroid/webkit/WebView;

    const-string v2, "getVolume"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v1, v2, v3}, Lfr/bmartel/youtubetv/i/a;->b(Landroid/webkit/WebView;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->x:Landroid/os/ConditionVariable;

    iget v2, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->y:I

    int-to-long v2, v2

    invoke-virtual {v1, v2, v3}, Landroid/os/ConditionVariable;->block(J)Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->n:Lfr/bmartel/youtubetv/a;

    invoke-virtual {v0}, Lfr/bmartel/youtubetv/a;->A()I

    move-result v0

    return v0

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public h(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->d:Ljava/lang/String;

    invoke-direct {p0}, Lfr/bmartel/youtubetv/YoutubeTvView;->c()V

    return-void
.end method

.method public k(II)V
    .locals 3

    iget-object v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->o:Landroid/webkit/WebView;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 p2, 0x1

    aput-object p1, v1, p2

    const-string p1, "setSize"

    invoke-static {v0, p1, v1}, Lfr/bmartel/youtubetv/i/a;->b(Landroid/webkit/WebView;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public l()V
    .locals 3

    iget-object v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->o:Landroid/webkit/WebView;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "playVideo"

    invoke-static {v0, v2, v1}, Lfr/bmartel/youtubetv/i/a;->b(Landroid/webkit/WebView;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public m()V
    .locals 3

    iget-object v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->o:Landroid/webkit/WebView;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stopVideo"

    invoke-static {v0, v2, v1}, Lfr/bmartel/youtubetv/i/a;->b(Landroid/webkit/WebView;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public onWindowFocusChanged(Z)V
    .locals 4

    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onWindowFocusChanged(Z)V

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getWidth()I

    move-result p1

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v0

    iget-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->n:Lfr/bmartel/youtubetv/a;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lfr/bmartel/youtubetv/a;->B()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->o:Landroid/webkit/WebView;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v2, v3

    const/4 p1, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v2, p1

    const-string p1, "setSize"

    invoke-static {v1, p1, v2}, Lfr/bmartel/youtubetv/i/a;->a(Landroid/webkit/WebView;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->n:Lfr/bmartel/youtubetv/a;

    invoke-virtual {v1, p1, v0}, Lfr/bmartel/youtubetv/a;->F(II)V

    :goto_0
    return-void
.end method

.method public setLoop(Z)V
    .locals 3

    iget-object v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->o:Landroid/webkit/WebView;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "setLoop"

    invoke-static {v0, p1, v1}, Lfr/bmartel/youtubetv/i/a;->b(Landroid/webkit/WebView;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public setOnBufferingUpdateListener(Lfr/bmartel/youtubetv/g/a;)V
    .locals 1

    iget-object v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->n:Lfr/bmartel/youtubetv/a;

    invoke-virtual {v0, p1}, Lfr/bmartel/youtubetv/a;->D(Lfr/bmartel/youtubetv/g/a;)V

    return-void
.end method

.method public setOnProgressUpdateListener(Lfr/bmartel/youtubetv/g/c;)V
    .locals 1

    iget-object v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->n:Lfr/bmartel/youtubetv/a;

    invoke-virtual {v0, p1}, Lfr/bmartel/youtubetv/a;->E(Lfr/bmartel/youtubetv/g/c;)V

    return-void
.end method

.method public setPlaybackQuality(Lfr/bmartel/youtubetv/h/f;)V
    .locals 3

    iget-object v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->o:Landroid/webkit/WebView;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1}, Lfr/bmartel/youtubetv/h/f;->b()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "setPlaybackQuality"

    invoke-static {v0, p1, v1}, Lfr/bmartel/youtubetv/i/a;->b(Landroid/webkit/WebView;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public setPlaybackRate(I)V
    .locals 3

    iget-object v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->o:Landroid/webkit/WebView;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "setPlaybackRate"

    invoke-static {v0, p1, v1}, Lfr/bmartel/youtubetv/i/a;->b(Landroid/webkit/WebView;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public setShuffle(Z)V
    .locals 3

    iget-object v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->o:Landroid/webkit/WebView;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "setShuffle"

    invoke-static {v0, p1, v1}, Lfr/bmartel/youtubetv/i/a;->b(Landroid/webkit/WebView;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public setVolume(I)V
    .locals 3

    iget-object v0, p0, Lfr/bmartel/youtubetv/YoutubeTvView;->o:Landroid/webkit/WebView;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "setVolume"

    invoke-static {v0, p1, v1}, Lfr/bmartel/youtubetv/i/a;->b(Landroid/webkit/WebView;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
