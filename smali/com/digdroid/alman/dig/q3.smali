.class public abstract Lcom/digdroid/alman/dig/q3;
.super Lcom/digdroid/alman/dig/w2;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/TextureVideoView$f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/digdroid/alman/dig/q3$p;,
        Lcom/digdroid/alman/dig/q3$q;,
        Lcom/digdroid/alman/dig/q3$v;,
        Lcom/digdroid/alman/dig/q3$m;,
        Lcom/digdroid/alman/dig/q3$k;,
        Lcom/digdroid/alman/dig/q3$o;,
        Lcom/digdroid/alman/dig/q3$n;,
        Lcom/digdroid/alman/dig/q3$s;,
        Lcom/digdroid/alman/dig/q3$t;,
        Lcom/digdroid/alman/dig/q3$r;,
        Lcom/digdroid/alman/dig/q3$l;,
        Lcom/digdroid/alman/dig/q3$u;
    }
.end annotation


# instance fields
.field T0:Lcom/digdroid/alman/dig/s3;

.field private U0:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private V0:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private W0:I

.field private X0:Ljava/lang/String;

.field private Y0:I

.field private Z0:Ljava/lang/String;

.field private a1:Ljava/lang/String;

.field private b1:I

.field private c1:Ljava/lang/String;

.field private d1:Ljava/lang/String;

.field private e1:Ljava/lang/String;

.field private f1:Ljava/lang/String;

.field private g1:Ljava/lang/String;

.field private h1:Landroid/media/MediaPlayer;

.field private i1:Ljava/lang/String;

.field private j1:I

.field private k1:Z

.field private l1:Lcom/digdroid/alman/dig/q3$m;

.field private m1:Lcom/digdroid/alman/dig/q3$v;

.field private n1:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private o1:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private p1:Lcom/digdroid/alman/dig/q3$p;

.field private q1:Landroid/os/Handler;

.field private r1:Ljava/lang/Runnable;

.field private s1:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/digdroid/alman/dig/w2;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/digdroid/alman/dig/q3;->l1:Lcom/digdroid/alman/dig/q3$m;

    iput-object v0, p0, Lcom/digdroid/alman/dig/q3;->m1:Lcom/digdroid/alman/dig/q3$v;

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/digdroid/alman/dig/q3;->q1:Landroid/os/Handler;

    new-instance v0, Lcom/digdroid/alman/dig/q3$f;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/q3$f;-><init>(Lcom/digdroid/alman/dig/q3;)V

    iput-object v0, p0, Lcom/digdroid/alman/dig/q3;->r1:Ljava/lang/Runnable;

    new-instance v0, Lcom/digdroid/alman/dig/q3$g;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/q3$g;-><init>(Lcom/digdroid/alman/dig/q3;)V

    iput-object v0, p0, Lcom/digdroid/alman/dig/q3;->s1:Ljava/lang/Runnable;

    return-void
.end method

.method static synthetic A2(Lcom/digdroid/alman/dig/q3;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/q3;->f1:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic B2(Lcom/digdroid/alman/dig/q3;)Lcom/digdroid/alman/dig/q3$v;
    .locals 0

    iget-object p0, p0, Lcom/digdroid/alman/dig/q3;->m1:Lcom/digdroid/alman/dig/q3$v;

    return-object p0
.end method

.method static synthetic C2(Lcom/digdroid/alman/dig/q3;Lcom/digdroid/alman/dig/q3$v;)Lcom/digdroid/alman/dig/q3$v;
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/q3;->m1:Lcom/digdroid/alman/dig/q3$v;

    return-object p1
.end method

.method static synthetic D2(Lcom/digdroid/alman/dig/q3;)Ljava/util/ArrayList;
    .locals 0

    iget-object p0, p0, Lcom/digdroid/alman/dig/q3;->o1:Ljava/util/ArrayList;

    return-object p0
.end method

.method static synthetic E2(Lcom/digdroid/alman/dig/q3;)V
    .locals 0

    invoke-direct {p0}, Lcom/digdroid/alman/dig/q3;->W2()V

    return-void
.end method

.method static synthetic F2(Lcom/digdroid/alman/dig/q3;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/digdroid/alman/dig/q3;->k1:Z

    return p0
.end method

.method static synthetic G2(Lcom/digdroid/alman/dig/q3;Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/digdroid/alman/dig/q3;->U2(Ljava/lang/String;I)V

    return-void
.end method

.method static synthetic H2(Lcom/digdroid/alman/dig/q3;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/q3;->c1:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic I2(Lcom/digdroid/alman/dig/q3;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/q3;->d1:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic J2(Lcom/digdroid/alman/dig/q3;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/digdroid/alman/dig/q3;->Z0:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic K2(Lcom/digdroid/alman/dig/q3;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/q3;->Z0:Ljava/lang/String;

    return-object p1
.end method

.method private L2()V
    .locals 3

    const v0, 0x7f090445

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    instance-of v2, v1, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v2, :cond_0

    check-cast v1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    :cond_0
    return-void
.end method

.method private M2(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const/16 v0, 0x2e

    invoke-virtual {p1, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    const-string v1, "none"

    if-gez v0, :cond_0

    return-object v1

    :cond_0
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    move-result-object v2

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    return-object v1

    :cond_1
    const/16 v0, 0x2f

    invoke-virtual {p1, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    if-lez v0, :cond_2

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    :cond_2
    return-object p1
.end method

.method private N2()V
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/q3;->q1:Landroid/os/Handler;

    iget-object v1, p0, Lcom/digdroid/alman/dig/q3;->r1:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/q3;->q1:Landroid/os/Handler;

    iget-object v1, p0, Lcom/digdroid/alman/dig/q3;->s1:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    invoke-direct {p0}, Lcom/digdroid/alman/dig/q3;->W2()V

    return-void
.end method

.method private O2(Ljava/lang/String;I)V
    .locals 1

    iput-object p1, p0, Lcom/digdroid/alman/dig/q3;->i1:Ljava/lang/String;

    iput p2, p0, Lcom/digdroid/alman/dig/q3;->j1:I

    iget-object p2, p0, Lcom/digdroid/alman/dig/q3;->h1:Landroid/media/MediaPlayer;

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/digdroid/alman/dig/q3;->h1:Landroid/media/MediaPlayer;

    invoke-virtual {p2}, Landroid/media/MediaPlayer;->stop()V

    :cond_0
    iget-object p2, p0, Lcom/digdroid/alman/dig/q3;->h1:Landroid/media/MediaPlayer;

    invoke-virtual {p2}, Landroid/media/MediaPlayer;->release()V

    :cond_1
    new-instance p2, Landroid/media/MediaPlayer;

    invoke-direct {p2}, Landroid/media/MediaPlayer;-><init>()V

    iput-object p2, p0, Lcom/digdroid/alman/dig/q3;->h1:Landroid/media/MediaPlayer;

    new-instance v0, Lcom/digdroid/alman/dig/q3$i;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/q3$i;-><init>(Lcom/digdroid/alman/dig/q3;)V

    invoke-virtual {p2, v0}, Landroid/media/MediaPlayer;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V

    iget-object p2, p0, Lcom/digdroid/alman/dig/q3;->h1:Landroid/media/MediaPlayer;

    new-instance v0, Lcom/digdroid/alman/dig/q3$j;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/q3$j;-><init>(Lcom/digdroid/alman/dig/q3;)V

    invoke-virtual {p2, v0}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    iget-object p2, p0, Lcom/digdroid/alman/dig/q3;->h1:Landroid/media/MediaPlayer;

    new-instance v0, Lcom/digdroid/alman/dig/q3$a;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/q3$a;-><init>(Lcom/digdroid/alman/dig/q3;)V

    invoke-virtual {p2, v0}, Landroid/media/MediaPlayer;->setOnSeekCompleteListener(Landroid/media/MediaPlayer$OnSeekCompleteListener;)V

    :try_start_0
    iget-object p2, p0, Lcom/digdroid/alman/dig/q3;->h1:Landroid/media/MediaPlayer;

    invoke-virtual {p2, p1}, Landroid/media/MediaPlayer;->setDataSource(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/q3;->h1:Landroid/media/MediaPlayer;

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->prepareAsync()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    invoke-virtual {p0}, Lcom/digdroid/alman/dig/u3;->I1()V

    return-void
.end method

.method private P2(Ljava/lang/String;)V
    .locals 3

    iput-object p1, p0, Lcom/digdroid/alman/dig/q3;->g1:Ljava/lang/String;

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/digdroid/alman/dig/q3;->T0:Lcom/digdroid/alman/dig/s3;

    iget-object v0, p1, Lcom/digdroid/alman/dig/s3;->n:Ljava/lang/String;

    iget-object p1, p1, Lcom/digdroid/alman/dig/s3;->o:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string v0, "file"

    :goto_0
    iget-object v1, p0, Lcom/digdroid/alman/dig/q3;->p1:Lcom/digdroid/alman/dig/q3$p;

    new-instance v2, Lcom/digdroid/alman/dig/q3$h;

    invoke-direct {v2, p0, v0, p1}, Lcom/digdroid/alman/dig/q3$h;-><init>(Lcom/digdroid/alman/dig/q3;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v0, p1, v2}, Lcom/digdroid/alman/dig/q3$p;->a(Ljava/lang/String;Ljava/lang/String;Lcom/digdroid/alman/dig/q3$q;)V

    return-void
.end method

.method private Q2()V
    .locals 2

    new-instance v0, Lcom/digdroid/alman/dig/q3$r;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/q3$r;-><init>(Lcom/digdroid/alman/dig/q3;)V

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

.method private T2()Z
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/q3;->h1:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private U2(Ljava/lang/String;I)V
    .locals 2

    const v0, 0x7f090437

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/digdroid/alman/dig/TextureVideoView;

    iput-object p1, p0, Lcom/digdroid/alman/dig/q3;->X0:Ljava/lang/String;

    iput p2, p0, Lcom/digdroid/alman/dig/q3;->Y0:I

    const p2, 0x7f090445

    invoke-virtual {p0, p2}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {p2, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    const/4 p2, 0x0

    invoke-virtual {v0, p2}, Landroid/view/TextureView;->setVisibility(I)V

    iget-object p2, p0, Lcom/digdroid/alman/dig/q3;->T0:Lcom/digdroid/alman/dig/s3;

    invoke-static {p2}, Lcom/digdroid/alman/dig/p3;->k(Lcom/digdroid/alman/dig/s3;)F

    move-result p2

    invoke-virtual {v0, p2}, Landroid/view/TextureView;->setAlpha(F)V

    invoke-virtual {v0, p0}, Lcom/digdroid/alman/dig/TextureVideoView;->setListener(Lcom/digdroid/alman/dig/TextureVideoView$f;)V

    iget-object p2, p0, Lcom/digdroid/alman/dig/q3;->T0:Lcom/digdroid/alman/dig/s3;

    iget-object p2, p2, Lcom/digdroid/alman/dig/s3;->p:Ljava/lang/String;

    const-string v1, "fillscreen"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    sget-object p2, Lcom/digdroid/alman/dig/TextureVideoView$g;->b:Lcom/digdroid/alman/dig/TextureVideoView$g;

    goto :goto_0

    :cond_0
    sget-object p2, Lcom/digdroid/alman/dig/TextureVideoView$g;->e:Lcom/digdroid/alman/dig/TextureVideoView$g;

    :goto_0
    invoke-virtual {v0, p2}, Lcom/digdroid/alman/dig/TextureVideoView;->setScaleType(Lcom/digdroid/alman/dig/TextureVideoView$g;)V

    invoke-virtual {v0, p1}, Lcom/digdroid/alman/dig/TextureVideoView;->setDataSource(Ljava/lang/String;)V

    iget p1, p0, Lcom/digdroid/alman/dig/q3;->Y0:I

    invoke-virtual {v0, p1}, Lcom/digdroid/alman/dig/TextureVideoView;->q(I)V

    iget-boolean p1, p0, Lcom/digdroid/alman/dig/q3;->k1:Z

    if-nez p1, :cond_1

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/TextureVideoView;->o()V

    :cond_1
    invoke-virtual {p0}, Lcom/digdroid/alman/dig/u3;->I1()V

    return-void
.end method

.method private V2()V
    .locals 6

    const-string v0, ""

    iget-object v1, p0, Lcom/digdroid/alman/dig/q3;->h1:Landroid/media/MediaPlayer;

    if-eqz v1, :cond_2

    :try_start_0
    invoke-virtual {v1}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    move-result v1

    iput v1, p0, Lcom/digdroid/alman/dig/q3;->j1:I

    iget-object v1, p0, Lcom/digdroid/alman/dig/q3;->i1:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/digdroid/alman/dig/q3;->p1:Lcom/digdroid/alman/dig/q3$p;

    iget-object v2, p0, Lcom/digdroid/alman/dig/q3;->e1:Ljava/lang/String;

    iget-object v3, p0, Lcom/digdroid/alman/dig/q3;->f1:Ljava/lang/String;

    iget-object v4, p0, Lcom/digdroid/alman/dig/q3;->i1:Ljava/lang/String;

    iget v5, p0, Lcom/digdroid/alman/dig/q3;->j1:I

    invoke-virtual {v1, v2, v3, v4, v5}, Lcom/digdroid/alman/dig/q3$p;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    :cond_0
    iput-object v0, p0, Lcom/digdroid/alman/dig/q3;->i1:Ljava/lang/String;

    iget-object v0, p0, Lcom/digdroid/alman/dig/q3;->h1:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/digdroid/alman/dig/q3;->h1:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V

    :cond_1
    iget-object v0, p0, Lcom/digdroid/alman/dig/q3;->h1:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/digdroid/alman/dig/q3;->h1:Landroid/media/MediaPlayer;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_2
    return-void
.end method

.method private W2()V
    .locals 7

    iget-object v0, p0, Lcom/digdroid/alman/dig/q3;->X0:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const v0, 0x7f090437

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/digdroid/alman/dig/TextureVideoView;

    :try_start_0
    iget-object v2, p0, Lcom/digdroid/alman/dig/q3;->p1:Lcom/digdroid/alman/dig/q3$p;

    iget-object v3, p0, Lcom/digdroid/alman/dig/q3;->c1:Ljava/lang/String;

    iget-object v4, p0, Lcom/digdroid/alman/dig/q3;->d1:Ljava/lang/String;

    iget-object v5, p0, Lcom/digdroid/alman/dig/q3;->X0:Ljava/lang/String;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/TextureVideoView;->getPosition()I

    move-result v6

    invoke-virtual {v2, v3, v4, v5, v6}, Lcom/digdroid/alman/dig/q3$p;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/TextureVideoView;->r()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    iput-object v1, p0, Lcom/digdroid/alman/dig/q3;->X0:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method static synthetic Y1(Lcom/digdroid/alman/dig/q3;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/q3;->a1:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic Z1(Lcom/digdroid/alman/dig/q3;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/digdroid/alman/dig/q3;->X0:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic a2(Lcom/digdroid/alman/dig/q3;)Ljava/util/ArrayList;
    .locals 0

    iget-object p0, p0, Lcom/digdroid/alman/dig/q3;->V0:Ljava/util/ArrayList;

    return-object p0
.end method

.method static synthetic b2(Lcom/digdroid/alman/dig/q3;Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/q3;->V0:Ljava/util/ArrayList;

    return-object p1
.end method

.method static synthetic c2(Lcom/digdroid/alman/dig/q3;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/q3;->X0:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic d2(Lcom/digdroid/alman/dig/q3;)Ljava/util/ArrayList;
    .locals 0

    iget-object p0, p0, Lcom/digdroid/alman/dig/q3;->U0:Ljava/util/ArrayList;

    return-object p0
.end method

.method static synthetic e2(Lcom/digdroid/alman/dig/q3;Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/q3;->U0:Ljava/util/ArrayList;

    return-object p1
.end method

.method static synthetic f2(Lcom/digdroid/alman/dig/q3;)I
    .locals 0

    iget p0, p0, Lcom/digdroid/alman/dig/q3;->W0:I

    return p0
.end method

.method static synthetic g2(Lcom/digdroid/alman/dig/q3;I)I
    .locals 0

    iput p1, p0, Lcom/digdroid/alman/dig/q3;->W0:I

    return p1
.end method

.method static synthetic h2(Lcom/digdroid/alman/dig/q3;I)I
    .locals 1

    iget v0, p0, Lcom/digdroid/alman/dig/q3;->W0:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/digdroid/alman/dig/q3;->W0:I

    return v0
.end method

.method static synthetic i2(Lcom/digdroid/alman/dig/q3;)Ljava/lang/Runnable;
    .locals 0

    iget-object p0, p0, Lcom/digdroid/alman/dig/q3;->r1:Ljava/lang/Runnable;

    return-object p0
.end method

.method static synthetic j2(Lcom/digdroid/alman/dig/q3;)V
    .locals 0

    invoke-direct {p0}, Lcom/digdroid/alman/dig/q3;->Q2()V

    return-void
.end method

.method static synthetic k2(Lcom/digdroid/alman/dig/q3;)Lcom/digdroid/alman/dig/q3$m;
    .locals 0

    iget-object p0, p0, Lcom/digdroid/alman/dig/q3;->l1:Lcom/digdroid/alman/dig/q3$m;

    return-object p0
.end method

.method static synthetic l2(Lcom/digdroid/alman/dig/q3;Lcom/digdroid/alman/dig/q3$m;)Lcom/digdroid/alman/dig/q3$m;
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/q3;->l1:Lcom/digdroid/alman/dig/q3$m;

    return-object p1
.end method

.method static synthetic m2(Lcom/digdroid/alman/dig/q3;)Ljava/util/ArrayList;
    .locals 0

    iget-object p0, p0, Lcom/digdroid/alman/dig/q3;->n1:Ljava/util/ArrayList;

    return-object p0
.end method

.method static synthetic n2(Lcom/digdroid/alman/dig/q3;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, Lcom/digdroid/alman/dig/q3;->M2(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic o2(Lcom/digdroid/alman/dig/q3;)Ljava/lang/Runnable;
    .locals 0

    iget-object p0, p0, Lcom/digdroid/alman/dig/q3;->s1:Ljava/lang/Runnable;

    return-object p0
.end method

.method static synthetic p2(Lcom/digdroid/alman/dig/q3;)Z
    .locals 0

    invoke-direct {p0}, Lcom/digdroid/alman/dig/q3;->T2()Z

    move-result p0

    return p0
.end method

.method static synthetic q2(Lcom/digdroid/alman/dig/q3;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/digdroid/alman/dig/q3;->q1:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic r2(Lcom/digdroid/alman/dig/q3;)I
    .locals 0

    iget p0, p0, Lcom/digdroid/alman/dig/q3;->j1:I

    return p0
.end method

.method static synthetic s2(Lcom/digdroid/alman/dig/q3;I)I
    .locals 0

    iput p1, p0, Lcom/digdroid/alman/dig/q3;->j1:I

    return p1
.end method

.method static synthetic t2(Lcom/digdroid/alman/dig/q3;)Landroid/media/MediaPlayer;
    .locals 0

    iget-object p0, p0, Lcom/digdroid/alman/dig/q3;->h1:Landroid/media/MediaPlayer;

    return-object p0
.end method

.method static synthetic u2(Lcom/digdroid/alman/dig/q3;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/digdroid/alman/dig/q3;->i1:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic v2(Lcom/digdroid/alman/dig/q3;)V
    .locals 0

    invoke-direct {p0}, Lcom/digdroid/alman/dig/q3;->V2()V

    return-void
.end method

.method static synthetic w2(Lcom/digdroid/alman/dig/q3;Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/digdroid/alman/dig/q3;->O2(Ljava/lang/String;I)V

    return-void
.end method

.method static synthetic x2(Lcom/digdroid/alman/dig/q3;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/digdroid/alman/dig/q3;->e1:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic y2(Lcom/digdroid/alman/dig/q3;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/q3;->e1:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic z2(Lcom/digdroid/alman/dig/q3;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/digdroid/alman/dig/q3;->f1:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method A1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/q3;->k1:Z

    return v0
.end method

.method B1()Z
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/q3;->X0:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/digdroid/alman/dig/q3;->i1:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public G(Lcom/digdroid/alman/dig/s3;Ljava/lang/String;Ljava/lang/String;)V
    .locals 10

    iput-object p1, p0, Lcom/digdroid/alman/dig/q3;->T0:Lcom/digdroid/alman/dig/s3;

    iget-object v0, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/b3;

    const-string v1, "show_foreground"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/b3;->c(Ljava/lang/String;Z)Z

    move-result v0

    const-string v3, ""

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/digdroid/alman/dig/s3;->w:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v0, v3

    :goto_0
    iget-object v4, p0, Lcom/digdroid/alman/dig/q3;->a1:Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    const/4 v5, 0x0

    const/high16 v6, 0x3f800000    # 1.0f

    const v7, 0x7f09019f

    if-nez v4, :cond_2

    invoke-virtual {p0, v7}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    const/16 v8, 0x8

    invoke-virtual {v4, v8}, Landroid/widget/ImageView;->setVisibility(I)V

    iput-object v0, p0, Lcom/digdroid/alman/dig/q3;->a1:Ljava/lang/String;

    goto :goto_1

    :cond_1
    new-instance v8, Lcom/digdroid/alman/dig/q3$s;

    new-instance v9, Lcom/digdroid/alman/dig/q3$b;

    invoke-direct {v9, p0, v0}, Lcom/digdroid/alman/dig/q3$b;-><init>(Lcom/digdroid/alman/dig/q3;Ljava/lang/String;)V

    invoke-direct {v8, p0, v4, v6, v9}, Lcom/digdroid/alman/dig/q3$s;-><init>(Lcom/digdroid/alman/dig/q3;Landroid/widget/ImageView;FLcom/digdroid/alman/dig/q3$t;)V

    new-array v4, v2, [Ljava/io/File;

    new-instance v9, Ljava/io/File;

    invoke-direct {v9, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    aput-object v9, v4, v5

    invoke-virtual {v8, v4}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    :cond_2
    :goto_1
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    const/4 v4, 0x0

    if-nez v3, :cond_3

    iget-object v3, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {v3, v1, v2}, Lcom/digdroid/alman/dig/b3;->c(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_3

    new-instance v1, Lcom/digdroid/alman/dig/q3$s;

    invoke-virtual {p0, v7}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    invoke-direct {v1, p0, v3, v6, v4}, Lcom/digdroid/alman/dig/q3$s;-><init>(Lcom/digdroid/alman/dig/q3;Landroid/widget/ImageView;FLcom/digdroid/alman/dig/q3$t;)V

    new-array v2, v2, [Ljava/io/File;

    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    aput-object v3, v2, v5

    invoke-virtual {v1, v2}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    :cond_3
    const v0, 0x7f09026d

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iget v1, p1, Lcom/digdroid/alman/dig/s3;->c:I

    const/high16 v2, -0x1000000

    or-int/2addr v1, v2

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setBackgroundColor(I)V

    if-eqz p2, :cond_5

    invoke-direct {p0, p2}, Lcom/digdroid/alman/dig/q3;->M2(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "image"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_2

    :cond_4
    const-string v0, "file"

    goto :goto_3

    :cond_5
    :goto_2
    iget-object v0, p1, Lcom/digdroid/alman/dig/s3;->l:Ljava/lang/String;

    iget-object v2, p1, Lcom/digdroid/alman/dig/s3;->m:Ljava/lang/String;

    move-object v4, p2

    move-object p2, v2

    :goto_3
    iget-object v2, p0, Lcom/digdroid/alman/dig/q3;->p1:Lcom/digdroid/alman/dig/q3$p;

    new-instance v3, Lcom/digdroid/alman/dig/q3$c;

    invoke-direct {v3, p0, v0, p2, v4}, Lcom/digdroid/alman/dig/q3$c;-><init>(Lcom/digdroid/alman/dig/q3;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2, v0, p2, v3}, Lcom/digdroid/alman/dig/q3$p;->a(Ljava/lang/String;Ljava/lang/String;Lcom/digdroid/alman/dig/q3$q;)V

    new-instance v2, Lcom/digdroid/alman/dig/q3$d;

    invoke-direct {v2, p0, v0, p2}, Lcom/digdroid/alman/dig/q3$d;-><init>(Lcom/digdroid/alman/dig/q3;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v0, p2, v4, v2}, Lcom/digdroid/alman/dig/q3;->R2(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/digdroid/alman/dig/q3$u;)V

    iget p2, p0, Lcom/digdroid/alman/dig/q3;->b1:I

    if-eq v1, p2, :cond_6

    const p2, 0x7f090445

    invoke-virtual {p0, p2}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    invoke-static {p1}, Lcom/digdroid/alman/dig/p3;->k(Lcom/digdroid/alman/dig/s3;)F

    move-result v0

    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setAlpha(F)V

    const p2, 0x7f090437

    invoke-virtual {p0, p2}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/digdroid/alman/dig/TextureVideoView;

    invoke-static {p1}, Lcom/digdroid/alman/dig/p3;->k(Lcom/digdroid/alman/dig/s3;)F

    move-result p1

    invoke-virtual {p2, p1}, Landroid/view/TextureView;->setAlpha(F)V

    iput v1, p0, Lcom/digdroid/alman/dig/q3;->b1:I

    :cond_6
    invoke-direct {p0, p3}, Lcom/digdroid/alman/dig/q3;->P2(Ljava/lang/String;)V

    return-void
.end method

.method P1()V
    .locals 4

    iget-object v0, p0, Lcom/digdroid/alman/dig/q3;->T0:Lcom/digdroid/alman/dig/s3;

    iget-object v0, v0, Lcom/digdroid/alman/dig/s3;->n:Ljava/lang/String;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-string v3, "folder"

    if-eqz v0, :cond_0

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/digdroid/alman/dig/q3$o;

    invoke-direct {v0, p0, v2}, Lcom/digdroid/alman/dig/q3$o;-><init>(Lcom/digdroid/alman/dig/q3;Lcom/digdroid/alman/dig/q3$b;)V

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/q3;->T0:Lcom/digdroid/alman/dig/s3;

    iget-object v0, v0, Lcom/digdroid/alman/dig/s3;->l:Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lcom/digdroid/alman/dig/q3$n;

    invoke-direct {v0, p0, v2}, Lcom/digdroid/alman/dig/q3$n;-><init>(Lcom/digdroid/alman/dig/q3;Lcom/digdroid/alman/dig/q3$b;)V

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    :cond_1
    :goto_0
    return-void
.end method

.method public R2(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/digdroid/alman/dig/q3$u;)V
    .locals 10

    const/4 v0, 0x0

    if-nez p3, :cond_2

    iget-object p3, p0, Lcom/digdroid/alman/dig/q3;->Z0:Ljava/lang/String;

    if-eqz p3, :cond_1

    const/4 p3, 0x0

    iput-object p3, p0, Lcom/digdroid/alman/dig/q3;->Z0:Ljava/lang/String;

    iget-object v1, p0, Lcom/digdroid/alman/dig/q3;->X0:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const p1, 0x7f090445

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setVisibility(I)V

    const p1, 0x7f090437

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/digdroid/alman/dig/TextureVideoView;

    invoke-virtual {p1, v0}, Landroid/view/TextureView;->setVisibility(I)V

    goto :goto_0

    :cond_0
    invoke-interface {p4}, Lcom/digdroid/alman/dig/q3$u;->a()V

    invoke-virtual {p0, p1, p2, p3}, Lcom/digdroid/alman/dig/q3;->S2(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    :goto_0
    invoke-interface {p4}, Lcom/digdroid/alman/dig/q3$u;->b()V

    goto :goto_1

    :cond_2
    new-instance v1, Lcom/digdroid/alman/dig/q3$s;

    const/high16 v2, 0x3f800000    # 1.0f

    new-instance v9, Lcom/digdroid/alman/dig/q3$e;

    move-object v3, v9

    move-object v4, p0

    move-object v5, p3

    move-object v6, p4

    move-object v7, p1

    move-object v8, p2

    invoke-direct/range {v3 .. v8}, Lcom/digdroid/alman/dig/q3$e;-><init>(Lcom/digdroid/alman/dig/q3;Ljava/lang/String;Lcom/digdroid/alman/dig/q3$u;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {v1, p0, v2, v9}, Lcom/digdroid/alman/dig/q3$s;-><init>(Lcom/digdroid/alman/dig/q3;FLcom/digdroid/alman/dig/q3$t;)V

    const/4 p1, 0x1

    new-array p1, p1, [Ljava/io/File;

    new-instance p2, Ljava/io/File;

    invoke-direct {p2, p3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    aput-object p2, p1, v0

    invoke-virtual {v1, p1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    :goto_1
    return-void
.end method

.method S1()V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/q3;->i1:Ljava/lang/String;

    const/4 v1, 0x1

    const-string v2, ""

    if-eqz v0, :cond_0

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/q3;->h1:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V

    iput-boolean v1, p0, Lcom/digdroid/alman/dig/q3;->k1:Z

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/q3;->X0:Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const v0, 0x7f090437

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/digdroid/alman/dig/TextureVideoView;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/TextureVideoView;->n()V

    iput-boolean v1, p0, Lcom/digdroid/alman/dig/q3;->k1:Z

    :cond_1
    return-void
.end method

.method S2(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const-string v1, "file"

    const/4 v2, 0x1

    const-string v3, "folder"

    const-string v4, "covers"

    const/4 v5, 0x0

    const/4 v6, -0x1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "none"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v6, 0x3

    goto :goto_0

    :sswitch_1
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v6, 0x2

    goto :goto_0

    :sswitch_2
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v6, 0x1

    goto :goto_0

    :sswitch_3
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v6, 0x0

    :goto_0
    const/4 p1, 0x0

    packed-switch v6, :pswitch_data_0

    goto/16 :goto_1

    :pswitch_0
    iget-object p2, p0, Lcom/digdroid/alman/dig/q3;->q1:Landroid/os/Handler;

    invoke-virtual {p2, p1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/digdroid/alman/dig/q3;->W2()V

    const/16 p1, 0x8

    if-nez p3, :cond_4

    const p2, 0x7f090445

    invoke-virtual {p0, p2}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    invoke-virtual {p2, p1}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_4
    const p2, 0x7f090437

    invoke-virtual {p0, p2}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/digdroid/alman/dig/TextureVideoView;

    invoke-virtual {p2, p1}, Landroid/view/TextureView;->setVisibility(I)V

    goto/16 :goto_1

    :pswitch_1
    iget-object v0, p0, Lcom/digdroid/alman/dig/q3;->q1:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    invoke-direct {p0, p2}, Lcom/digdroid/alman/dig/q3;->M2(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "image"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-direct {p0}, Lcom/digdroid/alman/dig/q3;->W2()V

    if-nez p3, :cond_9

    iget-object p3, p0, Lcom/digdroid/alman/dig/q3;->c1:Ljava/lang/String;

    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_5

    iget-object p3, p0, Lcom/digdroid/alman/dig/q3;->d1:Ljava/lang/String;

    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_9

    :cond_5
    new-instance p3, Lcom/digdroid/alman/dig/q3$s;

    iget-object v0, p0, Lcom/digdroid/alman/dig/q3;->T0:Lcom/digdroid/alman/dig/s3;

    invoke-static {v0}, Lcom/digdroid/alman/dig/p3;->k(Lcom/digdroid/alman/dig/s3;)F

    move-result v0

    invoke-direct {p3, p0, v0, p1}, Lcom/digdroid/alman/dig/q3$s;-><init>(Lcom/digdroid/alman/dig/q3;FLcom/digdroid/alman/dig/q3$t;)V

    new-array p1, v2, [Ljava/io/File;

    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    aput-object v0, p1, v5

    invoke-virtual {p3, p1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_1

    :cond_6
    const-string p1, "video"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    iget-object p1, p0, Lcom/digdroid/alman/dig/q3;->X0:Ljava/lang/String;

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    invoke-direct {p0}, Lcom/digdroid/alman/dig/q3;->W2()V

    invoke-direct {p0, p2, v5}, Lcom/digdroid/alman/dig/q3;->U2(Ljava/lang/String;I)V

    goto :goto_1

    :pswitch_2
    if-nez p3, :cond_9

    iget-object p3, p0, Lcom/digdroid/alman/dig/q3;->c1:Ljava/lang/String;

    invoke-virtual {p3, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_7

    iget-object p3, p0, Lcom/digdroid/alman/dig/q3;->d1:Ljava/lang/String;

    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_9

    :cond_7
    iget-object p2, p0, Lcom/digdroid/alman/dig/q3;->q1:Landroid/os/Handler;

    invoke-virtual {p2, p1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/digdroid/alman/dig/q3;->W2()V

    new-instance p2, Lcom/digdroid/alman/dig/q3$n;

    invoke-direct {p2, p0, p1}, Lcom/digdroid/alman/dig/q3$n;-><init>(Lcom/digdroid/alman/dig/q3;Lcom/digdroid/alman/dig/q3$b;)V

    new-array p1, v5, [Ljava/lang/Void;

    invoke-virtual {p2, p1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_1

    :pswitch_3
    if-nez p3, :cond_9

    iget-object p2, p0, Lcom/digdroid/alman/dig/q3;->c1:Ljava/lang/String;

    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_9

    iget-object p2, p0, Lcom/digdroid/alman/dig/q3;->q1:Landroid/os/Handler;

    invoke-virtual {p2, p1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/digdroid/alman/dig/q3;->W2()V

    iget p2, p0, Lcom/digdroid/alman/dig/q3;->W0:I

    if-nez p2, :cond_8

    new-instance p2, Lcom/digdroid/alman/dig/q3$l;

    invoke-direct {p2, p0, p1}, Lcom/digdroid/alman/dig/q3$l;-><init>(Lcom/digdroid/alman/dig/q3;Lcom/digdroid/alman/dig/q3$b;)V

    sget-object p1, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    new-array p3, v5, [Ljava/lang/Void;

    invoke-virtual {p2, p1, p3}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_1

    :cond_8
    iget-object p1, p0, Lcom/digdroid/alman/dig/q3;->q1:Landroid/os/Handler;

    iget-object p2, p0, Lcom/digdroid/alman/dig/q3;->r1:Ljava/lang/Runnable;

    const-wide/16 v0, 0x0

    invoke-virtual {p1, p2, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_9
    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x50bcdc64 -> :sswitch_3
        -0x4ba2e392 -> :sswitch_2
        0x2ff57c -> :sswitch_1
        0x33af38 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method T1()V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/q3;->i1:Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, ""

    if-eqz v0, :cond_0

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/q3;->h1:Landroid/media/MediaPlayer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    iput-boolean v1, p0, Lcom/digdroid/alman/dig/q3;->k1:Z

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/q3;->X0:Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const v0, 0x7f090437

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/digdroid/alman/dig/TextureVideoView;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/TextureVideoView;->o()V

    iput-boolean v1, p0, Lcom/digdroid/alman/dig/q3;->k1:Z

    :cond_1
    return-void
.end method

.method public d()V
    .locals 1

    const v0, 0x7f090437

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/digdroid/alman/dig/TextureVideoView;

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 5

    move-object v0, p0

    check-cast v0, Lcom/digdroid/alman/dig/MainActivity;

    invoke-static {v0}, Lcom/digdroid/alman/dig/p3;->f(Lcom/digdroid/alman/dig/a4;)V

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->v()I

    move-result v0

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->setTheme(I)V

    sget-object v0, Lcom/digdroid/alman/dig/p3;->a:Lcom/digdroid/alman/dig/s3;

    iput-object v0, p0, Lcom/digdroid/alman/dig/q3;->T0:Lcom/digdroid/alman/dig/s3;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/digdroid/alman/dig/b3;->k(Landroid/content/Context;)Lcom/digdroid/alman/dig/b3;

    move-result-object v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/b3;

    const-string v1, "language"

    const-string v2, "device"

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/b3;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x11

    if-lt v1, v2, :cond_1

    invoke-virtual {p0}, Landroidx/appcompat/app/c;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v3

    const-string v4, "device"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/content/res/Configuration;->setLocale(Ljava/util/Locale;)V

    goto :goto_0

    :cond_0
    new-instance v4, Ljava/util/Locale;

    invoke-direct {v4, v0}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Landroid/content/res/Configuration;->setLocale(Ljava/util/Locale;)V

    :goto_0
    invoke-virtual {v1, v3, v2}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V

    :cond_1
    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/o2;->onCreate(Landroid/os/Bundle;)V

    const v0, 0x7f09026d

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iget-object v1, p0, Lcom/digdroid/alman/dig/q3;->T0:Lcom/digdroid/alman/dig/s3;

    iget v1, v1, Lcom/digdroid/alman/dig/s3;->c:I

    const/high16 v2, -0x1000000

    or-int/2addr v1, v2

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setBackgroundColor(I)V

    new-instance v0, Lcom/digdroid/alman/dig/q3$p;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/q3$p;-><init>(Lcom/digdroid/alman/dig/q3;)V

    iput-object v0, p0, Lcom/digdroid/alman/dig/q3;->p1:Lcom/digdroid/alman/dig/q3$p;

    const-string v0, ""

    iput-object v0, p0, Lcom/digdroid/alman/dig/q3;->X0:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, Lcom/digdroid/alman/dig/q3;->i1:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, Lcom/digdroid/alman/dig/q3;->c1:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, Lcom/digdroid/alman/dig/q3;->d1:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, Lcom/digdroid/alman/dig/q3;->e1:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, Lcom/digdroid/alman/dig/q3;->f1:Ljava/lang/String;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/digdroid/alman/dig/q3;->Z0:Ljava/lang/String;

    iput-object v0, p0, Lcom/digdroid/alman/dig/q3;->g1:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, Lcom/digdroid/alman/dig/q3;->a1:Ljava/lang/String;

    iget-object v0, p0, Lcom/digdroid/alman/dig/q3;->T0:Lcom/digdroid/alman/dig/s3;

    iget v0, v0, Lcom/digdroid/alman/dig/s3;->c:I

    or-int/2addr v0, v2

    iput v0, p0, Lcom/digdroid/alman/dig/q3;->b1:I

    const-class v0, Lcom/digdroid/alman/dig/q3;

    monitor-enter v0

    if-nez p1, :cond_2

    :try_start_0
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/digdroid/alman/dig/q3;->U0:Ljava/util/ArrayList;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/digdroid/alman/dig/q3;->V0:Ljava/util/ArrayList;

    const/4 p1, 0x0

    iput p1, p0, Lcom/digdroid/alman/dig/q3;->W0:I

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/digdroid/alman/dig/q3;->n1:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/digdroid/alman/dig/q3;->o1:Ljava/util/ArrayList;

    :goto_1
    iput-boolean p1, p0, Lcom/digdroid/alman/dig/q3;->k1:Z

    goto :goto_2

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_2
    :try_start_2
    const-string v1, "cover_systems"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    iput-object v1, p0, Lcom/digdroid/alman/dig/q3;->U0:Ljava/util/ArrayList;

    const-string v1, "cover_counts"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getIntegerArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    iput-object v1, p0, Lcom/digdroid/alman/dig/q3;->V0:Ljava/util/ArrayList;

    const-string v1, "cover_total"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/digdroid/alman/dig/q3;->W0:I

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    iget-object v0, p0, Lcom/digdroid/alman/dig/q3;->p1:Lcom/digdroid/alman/dig/q3$p;

    invoke-virtual {v0, p1}, Lcom/digdroid/alman/dig/q3$p;->b(Landroid/os/Bundle;)V

    const-string v0, "last_videos"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/q3;->n1:Ljava/util/ArrayList;

    const-string v0, "last_sounds"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/q3;->o1:Ljava/util/ArrayList;

    const-string v0, "media_paused"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    goto :goto_1

    :goto_2
    return-void

    :catchall_1
    move-exception p1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_4

    :goto_3
    throw p1

    :goto_4
    goto :goto_3
.end method

.method protected onDestroy()V
    .locals 1

    invoke-super {p0}, Lcom/digdroid/alman/dig/o2;->onDestroy()V

    sget-object v0, Lcom/digdroid/alman/dig/p3;->a:Lcom/digdroid/alman/dig/s3;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/digdroid/alman/dig/s3;->a:Lcom/digdroid/alman/dig/r3;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/r3;->R()V

    :cond_0
    return-void
.end method

.method public onPause()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/o2;->onPause()V

    invoke-direct {p0}, Lcom/digdroid/alman/dig/q3;->L2()V

    invoke-direct {p0}, Lcom/digdroid/alman/dig/q3;->N2()V

    invoke-direct {p0}, Lcom/digdroid/alman/dig/q3;->V2()V

    return-void
.end method

.method public onResume()V
    .locals 2

    invoke-super {p0}, Lcom/digdroid/alman/dig/w2;->onResume()V

    const-string v0, ""

    iput-object v0, p0, Lcom/digdroid/alman/dig/q3;->X0:Ljava/lang/String;

    iput-object v0, p0, Lcom/digdroid/alman/dig/q3;->i1:Ljava/lang/String;

    iput-object v0, p0, Lcom/digdroid/alman/dig/q3;->c1:Ljava/lang/String;

    iput-object v0, p0, Lcom/digdroid/alman/dig/q3;->d1:Ljava/lang/String;

    iput-object v0, p0, Lcom/digdroid/alman/dig/q3;->e1:Ljava/lang/String;

    iput-object v0, p0, Lcom/digdroid/alman/dig/q3;->f1:Ljava/lang/String;

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/digdroid/alman/dig/q3;->Z0:Ljava/lang/String;

    iput-object v1, p0, Lcom/digdroid/alman/dig/q3;->g1:Ljava/lang/String;

    iput-object v0, p0, Lcom/digdroid/alman/dig/q3;->a1:Ljava/lang/String;

    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 3

    invoke-direct {p0}, Lcom/digdroid/alman/dig/q3;->V2()V

    invoke-direct {p0}, Lcom/digdroid/alman/dig/q3;->W2()V

    const-class v0, Lcom/digdroid/alman/dig/q3;

    monitor-enter v0

    :try_start_0
    const-string v1, "cover_systems"

    iget-object v2, p0, Lcom/digdroid/alman/dig/q3;->U0:Ljava/util/ArrayList;

    invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    const-string v1, "cover_counts"

    iget-object v2, p0, Lcom/digdroid/alman/dig/q3;->V0:Ljava/util/ArrayList;

    invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->putIntegerArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    const-string v1, "cover_total"

    iget v2, p0, Lcom/digdroid/alman/dig/q3;->W0:I

    invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v0, "last_videos"

    iget-object v1, p0, Lcom/digdroid/alman/dig/q3;->n1:Ljava/util/ArrayList;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    const-string v0, "last_sounds"

    iget-object v1, p0, Lcom/digdroid/alman/dig/q3;->o1:Ljava/util/ArrayList;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/q3;->p1:Lcom/digdroid/alman/dig/q3$p;

    invoke-virtual {v0, p1}, Lcom/digdroid/alman/dig/q3$p;->d(Landroid/os/Bundle;)V

    const-string v0, "media_paused"

    iget-boolean v1, p0, Lcom/digdroid/alman/dig/q3;->k1:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/e0;->onSaveInstanceState(Landroid/os/Bundle;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public r0()V
    .locals 4

    const v0, 0x7f090437

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/digdroid/alman/dig/TextureVideoView;

    iget-object v1, p0, Lcom/digdroid/alman/dig/q3;->c1:Ljava/lang/String;

    const-string v2, "file"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/q3;->d1:Ljava/lang/String;

    invoke-direct {p0, v0, v2}, Lcom/digdroid/alman/dig/q3;->U2(Ljava/lang/String;I)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/digdroid/alman/dig/q3;->c1:Ljava/lang/String;

    const-string v3, "folder"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/TextureVideoView;->r()V

    new-instance v0, Lcom/digdroid/alman/dig/q3$n;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/digdroid/alman/dig/q3$n;-><init>(Lcom/digdroid/alman/dig/q3;Lcom/digdroid/alman/dig/q3$b;)V

    new-array v1, v2, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    :cond_1
    :goto_0
    return-void
.end method

.method z1()Z
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/q3;->T0:Lcom/digdroid/alman/dig/s3;

    iget-object v0, v0, Lcom/digdroid/alman/dig/s3;->l:Ljava/lang/String;

    const-string v1, "folder"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v2, ""

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/q3;->X0:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/q3;->T0:Lcom/digdroid/alman/dig/s3;

    iget-object v0, v0, Lcom/digdroid/alman/dig/s3;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/digdroid/alman/dig/q3;->i1:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
