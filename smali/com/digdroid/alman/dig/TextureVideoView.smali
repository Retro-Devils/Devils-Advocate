.class public Lcom/digdroid/alman/dig/TextureVideoView;
.super Landroid/view/TextureView;
.source ""

# interfaces
.implements Landroid/view/TextureView$SurfaceTextureListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/digdroid/alman/dig/TextureVideoView$f;,
        Lcom/digdroid/alman/dig/TextureVideoView$h;,
        Lcom/digdroid/alman/dig/TextureVideoView$g;
    }
.end annotation


# static fields
.field private static final b:Ljava/lang/String;


# instance fields
.field private c:Landroid/media/MediaPlayer;

.field private d:F

.field private e:F

.field private f:Z

.field private g:Z

.field private h:Z

.field private i:Z

.field private j:Lcom/digdroid/alman/dig/TextureVideoView$g;

.field private k:Lcom/digdroid/alman/dig/TextureVideoView$h;

.field private l:Ljava/lang/String;

.field private m:Landroid/view/Surface;

.field private n:Landroid/graphics/SurfaceTexture;

.field private o:I

.field private p:Lcom/digdroid/alman/dig/TextureVideoView$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/digdroid/alman/dig/TextureVideoView;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/digdroid/alman/dig/TextureVideoView;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroid/view/TextureView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const-string p1, ""

    iput-object p1, p0, Lcom/digdroid/alman/dig/TextureVideoView;->l:Ljava/lang/String;

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/digdroid/alman/dig/TextureVideoView;->m:Landroid/view/Surface;

    iput-object p1, p0, Lcom/digdroid/alman/dig/TextureVideoView;->n:Landroid/graphics/SurfaceTexture;

    invoke-direct {p0}, Lcom/digdroid/alman/dig/TextureVideoView;->l()V

    return-void
.end method

.method static synthetic a(Lcom/digdroid/alman/dig/TextureVideoView;F)F
    .locals 0

    iput p1, p0, Lcom/digdroid/alman/dig/TextureVideoView;->e:F

    return p1
.end method

.method static synthetic b(Lcom/digdroid/alman/dig/TextureVideoView;F)F
    .locals 0

    iput p1, p0, Lcom/digdroid/alman/dig/TextureVideoView;->d:F

    return p1
.end method

.method static synthetic c(Lcom/digdroid/alman/dig/TextureVideoView;)V
    .locals 0

    invoke-direct {p0}, Lcom/digdroid/alman/dig/TextureVideoView;->s()V

    return-void
.end method

.method static synthetic d(Lcom/digdroid/alman/dig/TextureVideoView;)Lcom/digdroid/alman/dig/TextureVideoView$h;
    .locals 0

    iget-object p0, p0, Lcom/digdroid/alman/dig/TextureVideoView;->k:Lcom/digdroid/alman/dig/TextureVideoView$h;

    return-object p0
.end method

.method static synthetic e(Lcom/digdroid/alman/dig/TextureVideoView;Lcom/digdroid/alman/dig/TextureVideoView$h;)Lcom/digdroid/alman/dig/TextureVideoView$h;
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/TextureVideoView;->k:Lcom/digdroid/alman/dig/TextureVideoView$h;

    return-object p1
.end method

.method static synthetic f(Lcom/digdroid/alman/dig/TextureVideoView;)Lcom/digdroid/alman/dig/TextureVideoView$f;
    .locals 0

    iget-object p0, p0, Lcom/digdroid/alman/dig/TextureVideoView;->p:Lcom/digdroid/alman/dig/TextureVideoView$f;

    return-object p0
.end method

.method static synthetic g(Lcom/digdroid/alman/dig/TextureVideoView;)Landroid/media/MediaPlayer;
    .locals 0

    iget-object p0, p0, Lcom/digdroid/alman/dig/TextureVideoView;->c:Landroid/media/MediaPlayer;

    return-object p0
.end method

.method static synthetic h(Lcom/digdroid/alman/dig/TextureVideoView;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/digdroid/alman/dig/TextureVideoView;->h:Z

    return p1
.end method

.method static synthetic i(Lcom/digdroid/alman/dig/TextureVideoView;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/digdroid/alman/dig/TextureVideoView;->i:Z

    return p0
.end method

.method static synthetic j(Lcom/digdroid/alman/dig/TextureVideoView;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/digdroid/alman/dig/TextureVideoView;->g:Z

    return p0
.end method

.method private k()V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/TextureVideoView;->c:Landroid/media/MediaPlayer;

    if-nez v0, :cond_0

    new-instance v0, Landroid/media/MediaPlayer;

    invoke-direct {v0}, Landroid/media/MediaPlayer;-><init>()V

    iput-object v0, p0, Lcom/digdroid/alman/dig/TextureVideoView;->c:Landroid/media/MediaPlayer;

    invoke-virtual {p0}, Landroid/view/TextureView;->isAvailable()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/view/TextureView;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    move-result-object v0

    invoke-virtual {p0}, Landroid/view/TextureView;->getWidth()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/TextureView;->getHeight()I

    move-result v2

    invoke-virtual {p0, v0, v1, v2}, Lcom/digdroid/alman/dig/TextureVideoView;->onSurfaceTextureAvailable(Landroid/graphics/SurfaceTexture;II)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/media/MediaPlayer;->reset()V

    :cond_1
    :goto_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/TextureVideoView;->h:Z

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/TextureVideoView;->i:Z

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/TextureVideoView;->f:Z

    sget-object v0, Lcom/digdroid/alman/dig/TextureVideoView$h;->b:Lcom/digdroid/alman/dig/TextureVideoView$h;

    iput-object v0, p0, Lcom/digdroid/alman/dig/TextureVideoView;->k:Lcom/digdroid/alman/dig/TextureVideoView$h;

    return-void
.end method

.method private l()V
    .locals 1

    invoke-direct {p0}, Lcom/digdroid/alman/dig/TextureVideoView;->k()V

    sget-object v0, Lcom/digdroid/alman/dig/TextureVideoView$g;->b:Lcom/digdroid/alman/dig/TextureVideoView$g;

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/TextureVideoView;->setScaleType(Lcom/digdroid/alman/dig/TextureVideoView$g;)V

    invoke-virtual {p0, p0}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    return-void
.end method

.method static m(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method private p()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/TextureVideoView;->c:Landroid/media/MediaPlayer;

    new-instance v1, Lcom/digdroid/alman/dig/TextureVideoView$a;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/TextureVideoView$a;-><init>(Lcom/digdroid/alman/dig/TextureVideoView;)V

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnVideoSizeChangedListener(Landroid/media/MediaPlayer$OnVideoSizeChangedListener;)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/TextureVideoView;->c:Landroid/media/MediaPlayer;

    new-instance v1, Lcom/digdroid/alman/dig/TextureVideoView$b;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/TextureVideoView$b;-><init>(Lcom/digdroid/alman/dig/TextureVideoView;)V

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/TextureVideoView;->c:Landroid/media/MediaPlayer;

    new-instance v1, Lcom/digdroid/alman/dig/TextureVideoView$c;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/TextureVideoView$c;-><init>(Lcom/digdroid/alman/dig/TextureVideoView;)V

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnSeekCompleteListener(Landroid/media/MediaPlayer$OnSeekCompleteListener;)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/TextureVideoView;->c:Landroid/media/MediaPlayer;

    new-instance v1, Lcom/digdroid/alman/dig/TextureVideoView$d;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/TextureVideoView$d;-><init>(Lcom/digdroid/alman/dig/TextureVideoView;)V

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/TextureVideoView;->c:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->prepareAsync()V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    sget-object v1, Lcom/digdroid/alman/dig/TextureVideoView;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/IllegalStateException;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :catch_1
    move-exception v0

    sget-object v1, Lcom/digdroid/alman/dig/TextureVideoView;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/SecurityException;->getMessage()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :catch_2
    move-exception v0

    sget-object v1, Lcom/digdroid/alman/dig/TextureVideoView;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :goto_1
    return-void
.end method

.method private s()V
    .locals 8

    invoke-virtual {p0}, Landroid/view/TextureView;->getWidth()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0}, Landroid/view/TextureView;->getHeight()I

    move-result v1

    int-to-float v1, v1

    div-float v2, v0, v1

    iget v3, p0, Lcom/digdroid/alman/dig/TextureVideoView;->e:F

    iget v4, p0, Lcom/digdroid/alman/dig/TextureVideoView;->d:F

    div-float/2addr v3, v4

    iget-object v4, p0, Lcom/digdroid/alman/dig/TextureVideoView;->j:Lcom/digdroid/alman/dig/TextureVideoView$g;

    sget-object v5, Lcom/digdroid/alman/dig/TextureVideoView$g;->b:Lcom/digdroid/alman/dig/TextureVideoView$g;

    const/high16 v6, 0x3f800000    # 1.0f

    if-ne v4, v5, :cond_2

    cmpl-float v5, v2, v3

    if-lez v5, :cond_1

    :cond_0
    div-float/2addr v2, v3

    goto :goto_2

    :cond_1
    :goto_0
    div-float/2addr v3, v2

    move v6, v3

    goto :goto_1

    :cond_2
    sget-object v5, Lcom/digdroid/alman/dig/TextureVideoView$g;->e:Lcom/digdroid/alman/dig/TextureVideoView$g;

    if-ne v4, v5, :cond_3

    cmpl-float v5, v2, v3

    if-lez v5, :cond_0

    goto :goto_0

    :cond_3
    :goto_1
    const/high16 v2, 0x3f800000    # 1.0f

    :goto_2
    sget-object v3, Lcom/digdroid/alman/dig/TextureVideoView$e;->a:[I

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v3, v3, v4

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eq v3, v4, :cond_5

    const/4 v4, 0x2

    if-eq v3, v4, :cond_4

    const/4 v4, 0x3

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v0, v5

    float-to-int v0, v0

    div-float/2addr v1, v5

    float-to-int v5, v1

    move v7, v5

    move v5, v0

    move v0, v7

    goto :goto_3

    :cond_4
    float-to-int v5, v0

    float-to-int v0, v1

    goto :goto_3

    :cond_5
    const/4 v0, 0x0

    :goto_3
    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    int-to-float v3, v5

    int-to-float v0, v0

    invoke-virtual {v1, v6, v2, v3, v0}, Landroid/graphics/Matrix;->setScale(FFFF)V

    invoke-virtual {p0, v1}, Landroid/view/TextureView;->setTransform(Landroid/graphics/Matrix;)V

    return-void
.end method


# virtual methods
.method public getDuration()I
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/TextureVideoView;->c:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getDuration()I

    move-result v0

    return v0
.end method

.method public getPosition()I
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/TextureVideoView;->c:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    move-result v0

    return v0
.end method

.method public n()V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/TextureVideoView;->k:Lcom/digdroid/alman/dig/TextureVideoView$h;

    sget-object v1, Lcom/digdroid/alman/dig/TextureVideoView$h;->e:Lcom/digdroid/alman/dig/TextureVideoView$h;

    if-ne v0, v1, :cond_0

    const-string v0, "pause() was called but video already paused."

    :goto_0
    invoke-static {v0}, Lcom/digdroid/alman/dig/TextureVideoView;->m(Ljava/lang/String;)V

    return-void

    :cond_0
    sget-object v2, Lcom/digdroid/alman/dig/TextureVideoView$h;->d:Lcom/digdroid/alman/dig/TextureVideoView$h;

    if-ne v0, v2, :cond_1

    const-string v0, "pause() was called but video already stopped."

    goto :goto_0

    :cond_1
    sget-object v2, Lcom/digdroid/alman/dig/TextureVideoView$h;->f:Lcom/digdroid/alman/dig/TextureVideoView$h;

    if-ne v0, v2, :cond_2

    const-string v0, "pause() was called but video already ended."

    goto :goto_0

    :cond_2
    iput-object v1, p0, Lcom/digdroid/alman/dig/TextureVideoView;->k:Lcom/digdroid/alman/dig/TextureVideoView$h;

    iget-object v0, p0, Lcom/digdroid/alman/dig/TextureVideoView;->c:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/digdroid/alman/dig/TextureVideoView;->c:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V

    :cond_3
    return-void
.end method

.method public o()V
    .locals 3

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/TextureVideoView;->f:Z

    if-nez v0, :cond_0

    const-string v0, "play() was called but data source was not set."

    invoke-static {v0}, Lcom/digdroid/alman/dig/TextureVideoView;->m(Ljava/lang/String;)V

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/TextureVideoView;->i:Z

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/TextureVideoView;->h:Z

    if-nez v0, :cond_1

    const-string v0, "play() was called but video is not prepared yet, waiting."

    invoke-static {v0}, Lcom/digdroid/alman/dig/TextureVideoView;->m(Ljava/lang/String;)V

    return-void

    :cond_1
    iget-boolean v0, p0, Lcom/digdroid/alman/dig/TextureVideoView;->g:Z

    if-nez v0, :cond_2

    const-string v0, "play() was called but view is not available yet, waiting."

    invoke-static {v0}, Lcom/digdroid/alman/dig/TextureVideoView;->m(Ljava/lang/String;)V

    return-void

    :cond_2
    iget-object v0, p0, Lcom/digdroid/alman/dig/TextureVideoView;->k:Lcom/digdroid/alman/dig/TextureVideoView$h;

    sget-object v1, Lcom/digdroid/alman/dig/TextureVideoView$h;->c:Lcom/digdroid/alman/dig/TextureVideoView$h;

    if-ne v0, v1, :cond_3

    const-string v0, "play() was called but video is already playing."

    invoke-static {v0}, Lcom/digdroid/alman/dig/TextureVideoView;->m(Ljava/lang/String;)V

    return-void

    :cond_3
    sget-object v2, Lcom/digdroid/alman/dig/TextureVideoView$h;->e:Lcom/digdroid/alman/dig/TextureVideoView$h;

    if-ne v0, v2, :cond_4

    const-string v0, "play() was called but video is paused, resuming."

    invoke-static {v0}, Lcom/digdroid/alman/dig/TextureVideoView;->m(Ljava/lang/String;)V

    iput-object v1, p0, Lcom/digdroid/alman/dig/TextureVideoView;->k:Lcom/digdroid/alman/dig/TextureVideoView$h;

    iget-object v0, p0, Lcom/digdroid/alman/dig/TextureVideoView;->c:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    return-void

    :cond_4
    iput-object v1, p0, Lcom/digdroid/alman/dig/TextureVideoView;->k:Lcom/digdroid/alman/dig/TextureVideoView$h;

    iget-object v0, p0, Lcom/digdroid/alman/dig/TextureVideoView;->c:Landroid/media/MediaPlayer;

    iget v1, p0, Lcom/digdroid/alman/dig/TextureVideoView;->o:I

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->seekTo(I)V

    return-void
.end method

.method public onSurfaceTextureAvailable(Landroid/graphics/SurfaceTexture;II)V
    .locals 0

    iget-object p2, p0, Lcom/digdroid/alman/dig/TextureVideoView;->c:Landroid/media/MediaPlayer;

    if-nez p2, :cond_0

    invoke-direct {p0}, Lcom/digdroid/alman/dig/TextureVideoView;->k()V

    :cond_0
    if-eqz p1, :cond_1

    iput-object p1, p0, Lcom/digdroid/alman/dig/TextureVideoView;->n:Landroid/graphics/SurfaceTexture;

    new-instance p2, Landroid/view/Surface;

    invoke-direct {p2, p1}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    iput-object p2, p0, Lcom/digdroid/alman/dig/TextureVideoView;->m:Landroid/view/Surface;

    if-eqz p2, :cond_1

    iget-object p1, p0, Lcom/digdroid/alman/dig/TextureVideoView;->c:Landroid/media/MediaPlayer;

    invoke-virtual {p1, p2}, Landroid/media/MediaPlayer;->setSurface(Landroid/view/Surface;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/digdroid/alman/dig/TextureVideoView;->g:Z

    iget-boolean p1, p0, Lcom/digdroid/alman/dig/TextureVideoView;->f:Z

    if-eqz p1, :cond_1

    iget-boolean p1, p0, Lcom/digdroid/alman/dig/TextureVideoView;->i:Z

    if-eqz p1, :cond_1

    iget-boolean p1, p0, Lcom/digdroid/alman/dig/TextureVideoView;->h:Z

    if-eqz p1, :cond_1

    const-string p1, "View is available and play() was called."

    invoke-static {p1}, Lcom/digdroid/alman/dig/TextureVideoView;->m(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/TextureVideoView;->o()V

    :cond_1
    return-void
.end method

.method public onSurfaceTextureDestroyed(Landroid/graphics/SurfaceTexture;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public onSurfaceTextureSizeChanged(Landroid/graphics/SurfaceTexture;II)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lcom/digdroid/alman/dig/TextureVideoView;->onSurfaceTextureAvailable(Landroid/graphics/SurfaceTexture;II)V

    return-void
.end method

.method public onSurfaceTextureUpdated(Landroid/graphics/SurfaceTexture;)V
    .locals 0

    return-void
.end method

.method public q(I)V
    .locals 0

    iput p1, p0, Lcom/digdroid/alman/dig/TextureVideoView;->o:I

    return-void
.end method

.method public r()V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/TextureVideoView;->k:Lcom/digdroid/alman/dig/TextureVideoView$h;

    sget-object v1, Lcom/digdroid/alman/dig/TextureVideoView$h;->d:Lcom/digdroid/alman/dig/TextureVideoView$h;

    if-ne v0, v1, :cond_0

    const-string v0, "stop() was called but video already stopped."

    invoke-static {v0}, Lcom/digdroid/alman/dig/TextureVideoView;->m(Ljava/lang/String;)V

    return-void

    :cond_0
    sget-object v2, Lcom/digdroid/alman/dig/TextureVideoView$h;->f:Lcom/digdroid/alman/dig/TextureVideoView$h;

    if-ne v0, v2, :cond_1

    const-string v0, "stop() was called but video already ended."

    invoke-static {v0}, Lcom/digdroid/alman/dig/TextureVideoView;->m(Ljava/lang/String;)V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/digdroid/alman/dig/TextureVideoView;->c:Landroid/media/MediaPlayer;

    if-nez v0, :cond_2

    return-void

    :cond_2
    iput-object v1, p0, Lcom/digdroid/alman/dig/TextureVideoView;->k:Lcom/digdroid/alman/dig/TextureVideoView$h;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/digdroid/alman/dig/TextureVideoView;->c:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V

    :cond_3
    iget-object v0, p0, Lcom/digdroid/alman/dig/TextureVideoView;->c:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/digdroid/alman/dig/TextureVideoView;->c:Landroid/media/MediaPlayer;

    return-void
.end method

.method public setDataSource(Landroid/content/res/AssetFileDescriptor;)V
    .locals 6

    invoke-direct {p0}, Lcom/digdroid/alman/dig/TextureVideoView;->k()V

    :try_start_0
    invoke-virtual {p1}, Landroid/content/res/AssetFileDescriptor;->getStartOffset()J

    move-result-wide v2

    invoke-virtual {p1}, Landroid/content/res/AssetFileDescriptor;->getLength()J

    move-result-wide v4

    iget-object v0, p0, Lcom/digdroid/alman/dig/TextureVideoView;->c:Landroid/media/MediaPlayer;

    invoke-virtual {p1}, Landroid/content/res/AssetFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v1

    invoke-virtual/range {v0 .. v5}, Landroid/media/MediaPlayer;->setDataSource(Ljava/io/FileDescriptor;JJ)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/digdroid/alman/dig/TextureVideoView;->f:Z

    invoke-direct {p0}, Lcom/digdroid/alman/dig/TextureVideoView;->p()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    sget-object v0, Lcom/digdroid/alman/dig/TextureVideoView;->b:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method

.method public setDataSource(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Lcom/digdroid/alman/dig/TextureVideoView;->k()V

    :try_start_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/TextureVideoView;->c:Landroid/media/MediaPlayer;

    invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->setDataSource(Ljava/lang/String;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/digdroid/alman/dig/TextureVideoView;->f:Z

    invoke-direct {p0}, Lcom/digdroid/alman/dig/TextureVideoView;->p()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    sget-object v0, Lcom/digdroid/alman/dig/TextureVideoView;->b:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method

.method public setListener(Lcom/digdroid/alman/dig/TextureVideoView$f;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/TextureVideoView;->p:Lcom/digdroid/alman/dig/TextureVideoView$f;

    return-void
.end method

.method public setLooping(Z)V
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/TextureVideoView;->c:Landroid/media/MediaPlayer;

    invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->setLooping(Z)V

    return-void
.end method

.method public setScaleType(Lcom/digdroid/alman/dig/TextureVideoView$g;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/TextureVideoView;->j:Lcom/digdroid/alman/dig/TextureVideoView$g;

    return-void
.end method
