.class public Lfr/bmartel/youtubetv/a;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private A:Ljava/lang/String;

.field private B:Ljava/lang/String;

.field private C:I

.field private D:Lfr/bmartel/youtubetv/g/a;

.field private E:Lfr/bmartel/youtubetv/g/c;

.field private F:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lfr/bmartel/youtubetv/h/f;",
            ">;"
        }
    .end annotation
.end field

.field private G:Lfr/bmartel/youtubetv/h/e;

.field private final a:Ljava/lang/String;

.field private b:Landroid/webkit/WebView;

.field private c:Z

.field private d:Landroid/widget/ProgressBar;

.field private e:Landroid/widget/ImageView;

.field private f:Landroid/os/Handler;

.field private g:Landroid/os/ConditionVariable;

.field private h:I

.field private i:Z

.field private j:I

.field private k:Lfr/bmartel/youtubetv/h/g;

.field private l:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private n:F

.field private o:Z

.field private p:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lfr/bmartel/youtubetv/g/b;",
            ">;"
        }
    .end annotation
.end field

.field private q:Lfr/bmartel/youtubetv/YoutubeTvView;

.field private r:Ljava/lang/String;

.field private s:Z

.field private t:I

.field private u:I

.field private v:F

.field private w:F

.field private x:Lfr/bmartel/youtubetv/h/f;

.field private y:Ljava/lang/String;

.field private z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/util/List;Landroid/os/Handler;Landroid/widget/ProgressBar;Landroid/widget/ImageView;Landroid/webkit/WebView;Lfr/bmartel/youtubetv/YoutubeTvView;Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lfr/bmartel/youtubetv/g/b;",
            ">;",
            "Landroid/os/Handler;",
            "Landroid/widget/ProgressBar;",
            "Landroid/widget/ImageView;",
            "Landroid/webkit/WebView;",
            "Lfr/bmartel/youtubetv/YoutubeTvView;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-class v0, Lfr/bmartel/youtubetv/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lfr/bmartel/youtubetv/a;->a:Ljava/lang/String;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lfr/bmartel/youtubetv/a;->l:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lfr/bmartel/youtubetv/a;->m:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lfr/bmartel/youtubetv/a;->p:Ljava/util/List;

    sget-object v0, Lfr/bmartel/youtubetv/f;->e:Lfr/bmartel/youtubetv/h/a;

    invoke-virtual {v0}, Lfr/bmartel/youtubetv/h/a;->c()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lfr/bmartel/youtubetv/a;->r:Ljava/lang/String;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lfr/bmartel/youtubetv/a;->F:Ljava/util/List;

    new-instance v0, Lfr/bmartel/youtubetv/h/e;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const-string v2, ""

    invoke-direct {v0, v2, v2, v2, v1}, Lfr/bmartel/youtubetv/h/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    iput-object v0, p0, Lfr/bmartel/youtubetv/a;->G:Lfr/bmartel/youtubetv/h/e;

    iput-object p1, p0, Lfr/bmartel/youtubetv/a;->p:Ljava/util/List;

    iput-object p5, p0, Lfr/bmartel/youtubetv/a;->b:Landroid/webkit/WebView;

    iput-object p3, p0, Lfr/bmartel/youtubetv/a;->d:Landroid/widget/ProgressBar;

    iput-object p2, p0, Lfr/bmartel/youtubetv/a;->f:Landroid/os/Handler;

    iput-object p4, p0, Lfr/bmartel/youtubetv/a;->e:Landroid/widget/ImageView;

    iput-object p6, p0, Lfr/bmartel/youtubetv/a;->q:Lfr/bmartel/youtubetv/YoutubeTvView;

    iput-object p7, p0, Lfr/bmartel/youtubetv/a;->r:Ljava/lang/String;

    return-void
.end method

.method private G(Ljava/lang/String;ZIJFLjava/lang/String;Landroid/media/session/MediaSession;)V
    .locals 10

    new-instance v9, Lfr/bmartel/youtubetv/a$d;

    move-object v0, v9

    move-object v1, p0

    move v2, p2

    move-object/from16 v3, p7

    move-object/from16 v4, p8

    move v5, p3

    move-wide v6, p4

    move/from16 v8, p6

    invoke-direct/range {v0 .. v8}, Lfr/bmartel/youtubetv/a$d;-><init>(Lfr/bmartel/youtubetv/a;ZLjava/lang/String;Landroid/media/session/MediaSession;IJF)V

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    invoke-virtual {v9, v0}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

.method static synthetic a(Lfr/bmartel/youtubetv/a;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lfr/bmartel/youtubetv/a;->p:Ljava/util/List;

    return-object p0
.end method

.method static synthetic b(Lfr/bmartel/youtubetv/a;)Lfr/bmartel/youtubetv/g/c;
    .locals 0

    iget-object p0, p0, Lfr/bmartel/youtubetv/a;->E:Lfr/bmartel/youtubetv/g/c;

    return-object p0
.end method

.method static synthetic c(Lfr/bmartel/youtubetv/a;)Lfr/bmartel/youtubetv/YoutubeTvView;
    .locals 0

    iget-object p0, p0, Lfr/bmartel/youtubetv/a;->q:Lfr/bmartel/youtubetv/YoutubeTvView;

    return-object p0
.end method

.method static synthetic d(Lfr/bmartel/youtubetv/a;)Z
    .locals 0

    iget-boolean p0, p0, Lfr/bmartel/youtubetv/a;->o:Z

    return p0
.end method

.method static synthetic e(Lfr/bmartel/youtubetv/a;Z)Z
    .locals 0

    iput-boolean p1, p0, Lfr/bmartel/youtubetv/a;->o:Z

    return p1
.end method

.method static synthetic f(Lfr/bmartel/youtubetv/a;)Lfr/bmartel/youtubetv/g/a;
    .locals 0

    iget-object p0, p0, Lfr/bmartel/youtubetv/a;->D:Lfr/bmartel/youtubetv/g/a;

    return-object p0
.end method

.method static synthetic g(Lfr/bmartel/youtubetv/a;Ljava/lang/String;ZIJFLjava/lang/String;Landroid/media/session/MediaSession;)V
    .locals 0

    invoke-direct/range {p0 .. p8}, Lfr/bmartel/youtubetv/a;->G(Ljava/lang/String;ZIJFLjava/lang/String;Landroid/media/session/MediaSession;)V

    return-void
.end method

.method static synthetic h(Lfr/bmartel/youtubetv/a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lfr/bmartel/youtubetv/a;->r:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic i(Lfr/bmartel/youtubetv/a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lfr/bmartel/youtubetv/a;->a:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic j(Lfr/bmartel/youtubetv/a;)Landroid/widget/ProgressBar;
    .locals 0

    iget-object p0, p0, Lfr/bmartel/youtubetv/a;->d:Landroid/widget/ProgressBar;

    return-object p0
.end method

.method static synthetic k(Lfr/bmartel/youtubetv/a;)Landroid/widget/ImageView;
    .locals 0

    iget-object p0, p0, Lfr/bmartel/youtubetv/a;->e:Landroid/widget/ImageView;

    return-object p0
.end method


# virtual methods
.method public A()I
    .locals 1

    iget v0, p0, Lfr/bmartel/youtubetv/a;->h:I

    return v0
.end method

.method public B()Z
    .locals 1

    iget-boolean v0, p0, Lfr/bmartel/youtubetv/a;->c:Z

    return v0
.end method

.method public C(Landroid/os/ConditionVariable;)V
    .locals 0

    iput-object p1, p0, Lfr/bmartel/youtubetv/a;->g:Landroid/os/ConditionVariable;

    return-void
.end method

.method public D(Lfr/bmartel/youtubetv/g/a;)V
    .locals 0

    iput-object p1, p0, Lfr/bmartel/youtubetv/a;->D:Lfr/bmartel/youtubetv/g/a;

    return-void
.end method

.method public E(Lfr/bmartel/youtubetv/g/c;)V
    .locals 0

    iput-object p1, p0, Lfr/bmartel/youtubetv/a;->E:Lfr/bmartel/youtubetv/g/c;

    return-void
.end method

.method public F(II)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lfr/bmartel/youtubetv/a;->s:Z

    iput p1, p0, Lfr/bmartel/youtubetv/a;->t:I

    iput p2, p0, Lfr/bmartel/youtubetv/a;->u:I

    return-void
.end method

.method public getThumbnailQuality(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    :try_start_0
    invoke-static {p1, p2}, Lfr/bmartel/youtubetv/i/a;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    iget-object p2, p0, Lfr/bmartel/youtubetv/a;->a:Ljava/lang/String;

    const-string v0, "getThumbnailQuality"

    invoke-static {p2, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const-string p1, ""

    :goto_0
    return-object p1
.end method

.method public hideLoading(Z)V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    iget-object v0, p0, Lfr/bmartel/youtubetv/a;->d:Landroid/widget/ProgressBar;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lfr/bmartel/youtubetv/a;->f:Landroid/os/Handler;

    new-instance v1, Lfr/bmartel/youtubetv/a$e;

    invoke-direct {v1, p0, p1}, Lfr/bmartel/youtubetv/a$e;-><init>(Lfr/bmartel/youtubetv/a;Z)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public l()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lfr/bmartel/youtubetv/a;->l:Ljava/util/List;

    return-object v0
.end method

.method public log(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    invoke-static {p1, p2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public m()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lfr/bmartel/youtubetv/h/f;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lfr/bmartel/youtubetv/a;->F:Ljava/util/List;

    return-object v0
.end method

.method public n()F
    .locals 1

    iget v0, p0, Lfr/bmartel/youtubetv/a;->w:F

    return v0
.end method

.method public o()F
    .locals 1

    iget v0, p0, Lfr/bmartel/youtubetv/a;->n:F

    return v0
.end method

.method public onAvailableQualityLevelsReceived(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    invoke-static {p1}, Lfr/bmartel/youtubetv/i/a;->h(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lfr/bmartel/youtubetv/a;->F:Ljava/util/List;

    iget-object p1, p0, Lfr/bmartel/youtubetv/a;->g:Landroid/os/ConditionVariable;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/os/ConditionVariable;->open()V

    :cond_0
    return-void
.end method

.method public onCurrentTimeReceived(F)V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    iput p1, p0, Lfr/bmartel/youtubetv/a;->w:F

    iget-object p1, p0, Lfr/bmartel/youtubetv/a;->g:Landroid/os/ConditionVariable;

    invoke-virtual {p1}, Landroid/os/ConditionVariable;->open()V

    return-void
.end method

.method public onDurationReceived(F)V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    iput p1, p0, Lfr/bmartel/youtubetv/a;->n:F

    iget-object p1, p0, Lfr/bmartel/youtubetv/a;->g:Landroid/os/ConditionVariable;

    invoke-virtual {p1}, Landroid/os/ConditionVariable;->open()V

    return-void
.end method

.method public onMuteReceived(Z)V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    iput-boolean p1, p0, Lfr/bmartel/youtubetv/a;->i:Z

    iget-object p1, p0, Lfr/bmartel/youtubetv/a;->g:Landroid/os/ConditionVariable;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/os/ConditionVariable;->open()V

    :cond_0
    return-void
.end method

.method public onPageLoaded()V
    .locals 5
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    const/4 v0, 0x1

    iput-boolean v0, p0, Lfr/bmartel/youtubetv/a;->c:Z

    iget-boolean v1, p0, Lfr/bmartel/youtubetv/a;->s:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lfr/bmartel/youtubetv/a;->b:Landroid/webkit/WebView;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget v4, p0, Lfr/bmartel/youtubetv/a;->t:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    iget v3, p0, Lfr/bmartel/youtubetv/a;->u:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v0

    const-string v0, "setSize"

    invoke-static {v1, v0, v2}, Lfr/bmartel/youtubetv/i/a;->b(Landroid/webkit/WebView;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public onPlaybackQualityReceived(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    invoke-static {p1}, Lfr/bmartel/youtubetv/h/f;->d(Ljava/lang/String;)Lfr/bmartel/youtubetv/h/f;

    move-result-object p1

    iput-object p1, p0, Lfr/bmartel/youtubetv/a;->x:Lfr/bmartel/youtubetv/h/f;

    iget-object p1, p0, Lfr/bmartel/youtubetv/a;->g:Landroid/os/ConditionVariable;

    invoke-virtual {p1}, Landroid/os/ConditionVariable;->open()V

    return-void
.end method

.method public onPlaybackRateReceived(I)V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    iput p1, p0, Lfr/bmartel/youtubetv/a;->j:I

    iget-object p1, p0, Lfr/bmartel/youtubetv/a;->g:Landroid/os/ConditionVariable;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/os/ConditionVariable;->open()V

    :cond_0
    return-void
.end method

.method public onPlaybackRatesListReceived(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    invoke-static {p1}, Lfr/bmartel/youtubetv/i/a;->f(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lfr/bmartel/youtubetv/a;->l:Ljava/util/List;

    iget-object p1, p0, Lfr/bmartel/youtubetv/a;->g:Landroid/os/ConditionVariable;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/os/ConditionVariable;->open()V

    :cond_0
    return-void
.end method

.method public onPlayerReady(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    iget-object v0, p0, Lfr/bmartel/youtubetv/a;->f:Landroid/os/Handler;

    new-instance v7, Lfr/bmartel/youtubetv/a$a;

    move-object v1, v7

    move-object v2, p0

    move-object v3, p3

    move-object v4, p2

    move-object v5, p1

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lfr/bmartel/youtubetv/a$a;-><init>(Lfr/bmartel/youtubetv/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public onPlayerStateChange(IJFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;FFLjava/lang/String;)V
    .locals 15
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    move-object v12, p0

    iget-object v13, v12, Lfr/bmartel/youtubetv/a;->f:Landroid/os/Handler;

    new-instance v14, Lfr/bmartel/youtubetv/a$c;

    move-object v0, v14

    move-object v1, p0

    move/from16 v2, p1

    move/from16 v3, p8

    move/from16 v4, p9

    move-object/from16 v5, p6

    move-wide/from16 v6, p2

    move/from16 v8, p4

    move-object/from16 v9, p5

    move-object/from16 v10, p7

    move-object/from16 v11, p10

    invoke-direct/range {v0 .. v11}, Lfr/bmartel/youtubetv/a$c;-><init>(Lfr/bmartel/youtubetv/a;IFFLjava/lang/String;JFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v13, v14}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public onPlayerStateReceived(I)V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    invoke-static {p1}, Lfr/bmartel/youtubetv/h/g;->b(I)Lfr/bmartel/youtubetv/h/g;

    move-result-object p1

    iput-object p1, p0, Lfr/bmartel/youtubetv/a;->k:Lfr/bmartel/youtubetv/h/g;

    iget-object p1, p0, Lfr/bmartel/youtubetv/a;->g:Landroid/os/ConditionVariable;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/os/ConditionVariable;->open()V

    :cond_0
    return-void
.end method

.method public onPlaylistIndexReceived(I)V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    iput p1, p0, Lfr/bmartel/youtubetv/a;->C:I

    iget-object p1, p0, Lfr/bmartel/youtubetv/a;->g:Landroid/os/ConditionVariable;

    invoke-virtual {p1}, Landroid/os/ConditionVariable;->open()V

    return-void
.end method

.method public onPlaylistReceived(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    invoke-static {p1}, Lfr/bmartel/youtubetv/i/a;->g(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lfr/bmartel/youtubetv/a;->m:Ljava/util/List;

    iget-object p1, p0, Lfr/bmartel/youtubetv/a;->g:Landroid/os/ConditionVariable;

    invoke-virtual {p1}, Landroid/os/ConditionVariable;->open()V

    return-void
.end method

.method public onProgressUpdate(F)V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    iget-object v0, p0, Lfr/bmartel/youtubetv/a;->f:Landroid/os/Handler;

    new-instance v1, Lfr/bmartel/youtubetv/a$b;

    invoke-direct {v1, p0, p1}, Lfr/bmartel/youtubetv/a$b;-><init>(Lfr/bmartel/youtubetv/a;F)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public onVideoEmbedCodeReceived(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    iput-object p1, p0, Lfr/bmartel/youtubetv/a;->B:Ljava/lang/String;

    iget-object p1, p0, Lfr/bmartel/youtubetv/a;->g:Landroid/os/ConditionVariable;

    invoke-virtual {p1}, Landroid/os/ConditionVariable;->open()V

    return-void
.end method

.method public onVideoIdReceived(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    iput-object p1, p0, Lfr/bmartel/youtubetv/a;->z:Ljava/lang/String;

    iget-object p1, p0, Lfr/bmartel/youtubetv/a;->g:Landroid/os/ConditionVariable;

    invoke-virtual {p1}, Landroid/os/ConditionVariable;->open()V

    return-void
.end method

.method public onVideoInfoReceived(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    new-instance v0, Lfr/bmartel/youtubetv/h/e;

    invoke-static {p4}, Lfr/bmartel/youtubetv/i/a;->h(Ljava/lang/String;)Ljava/util/List;

    move-result-object p4

    invoke-direct {v0, p3, p2, p1, p4}, Lfr/bmartel/youtubetv/h/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    iput-object v0, p0, Lfr/bmartel/youtubetv/a;->G:Lfr/bmartel/youtubetv/h/e;

    iget-object p1, p0, Lfr/bmartel/youtubetv/a;->g:Landroid/os/ConditionVariable;

    invoke-virtual {p1}, Landroid/os/ConditionVariable;->open()V

    return-void
.end method

.method public onVideoLoadedFractionReceived(F)V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    iput p1, p0, Lfr/bmartel/youtubetv/a;->v:F

    iget-object p1, p0, Lfr/bmartel/youtubetv/a;->g:Landroid/os/ConditionVariable;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/os/ConditionVariable;->open()V

    :cond_0
    return-void
.end method

.method public onVideoTitleReceived(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    iput-object p1, p0, Lfr/bmartel/youtubetv/a;->A:Ljava/lang/String;

    iget-object p1, p0, Lfr/bmartel/youtubetv/a;->g:Landroid/os/ConditionVariable;

    invoke-virtual {p1}, Landroid/os/ConditionVariable;->open()V

    return-void
.end method

.method public onVideoUrlReceived(Ljava/lang/String;)V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    iput-object p1, p0, Lfr/bmartel/youtubetv/a;->y:Ljava/lang/String;

    iget-object p1, p0, Lfr/bmartel/youtubetv/a;->g:Landroid/os/ConditionVariable;

    invoke-virtual {p1}, Landroid/os/ConditionVariable;->open()V

    return-void
.end method

.method public onVolumeReceived(I)V
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    iput p1, p0, Lfr/bmartel/youtubetv/a;->h:I

    iget-object p1, p0, Lfr/bmartel/youtubetv/a;->g:Landroid/os/ConditionVariable;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/os/ConditionVariable;->open()V

    :cond_0
    return-void
.end method

.method public p()Lfr/bmartel/youtubetv/h/f;
    .locals 1

    iget-object v0, p0, Lfr/bmartel/youtubetv/a;->x:Lfr/bmartel/youtubetv/h/f;

    return-object v0
.end method

.method public q()I
    .locals 1

    iget v0, p0, Lfr/bmartel/youtubetv/a;->j:I

    return v0
.end method

.method public r()Lfr/bmartel/youtubetv/h/g;
    .locals 1

    iget-object v0, p0, Lfr/bmartel/youtubetv/a;->k:Lfr/bmartel/youtubetv/h/g;

    return-object v0
.end method

.method public s()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lfr/bmartel/youtubetv/a;->m:Ljava/util/List;

    return-object v0
.end method

.method public t()I
    .locals 1

    iget v0, p0, Lfr/bmartel/youtubetv/a;->C:I

    return v0
.end method

.method public u()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lfr/bmartel/youtubetv/a;->B:Ljava/lang/String;

    return-object v0
.end method

.method public v()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lfr/bmartel/youtubetv/a;->z:Ljava/lang/String;

    return-object v0
.end method

.method public w()Lfr/bmartel/youtubetv/h/e;
    .locals 1

    iget-object v0, p0, Lfr/bmartel/youtubetv/a;->G:Lfr/bmartel/youtubetv/h/e;

    return-object v0
.end method

.method public x()F
    .locals 1

    iget v0, p0, Lfr/bmartel/youtubetv/a;->v:F

    return v0
.end method

.method public y()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lfr/bmartel/youtubetv/a;->A:Ljava/lang/String;

    return-object v0
.end method

.method public z()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lfr/bmartel/youtubetv/a;->y:Ljava/lang/String;

    return-object v0
.end method
