.class public Lcom/digdroid/alman/dig/n2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/b/a/c/a/c$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/digdroid/alman/dig/n2$f;,
        Lcom/digdroid/alman/dig/n2$g;
    }
.end annotation


# static fields
.field private static a:Lcom/digdroid/alman/dig/n2;


# instance fields
.field private A:Z

.field b:Lcom/digdroid/alman/dig/n2$g;

.field c:Lcom/digdroid/alman/dig/p1;

.field d:Lcom/digdroid/alman/dig/n2$f;

.field e:Landroid/view/View;

.field f:Lcom/digdroid/alman/dig/MainActivity;

.field g:I

.field h:Z

.field private i:Z

.field private j:Ljava/lang/String;

.field private k:Ljava/lang/String;

.field private l:Ljava/lang/String;

.field private m:Lc/b/a/c/a/c;

.field private n:Lfr/bmartel/youtubetv/YoutubeTvView;

.field private o:Landroid/os/Handler;

.field private p:Landroid/widget/FrameLayout;

.field private q:Landroid/widget/RelativeLayout;

.field private r:Landroid/widget/RelativeLayout;

.field private s:I

.field private t:I

.field private u:Z

.field v:I

.field private w:I

.field private x:I

.field private y:I

.field z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Landroid/app/Activity;IIII)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/n2;->h:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/n2;->i:Z

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/digdroid/alman/dig/n2;->j:Ljava/lang/String;

    iput-object v1, p0, Lcom/digdroid/alman/dig/n2;->k:Ljava/lang/String;

    iput-object v1, p0, Lcom/digdroid/alman/dig/n2;->l:Ljava/lang/String;

    iput-object v1, p0, Lcom/digdroid/alman/dig/n2;->m:Lc/b/a/c/a/c;

    iput-object v1, p0, Lcom/digdroid/alman/dig/n2;->n:Lfr/bmartel/youtubetv/YoutubeTvView;

    iput-object v1, p0, Lcom/digdroid/alman/dig/n2;->o:Landroid/os/Handler;

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/n2;->u:Z

    const/16 v1, 0x3e8

    iput v1, p0, Lcom/digdroid/alman/dig/n2;->v:I

    iput v0, p0, Lcom/digdroid/alman/dig/n2;->w:I

    iput v0, p0, Lcom/digdroid/alman/dig/n2;->x:I

    const/16 v1, 0x8

    iput v1, p0, Lcom/digdroid/alman/dig/n2;->y:I

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/n2;->z:Z

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/n2;->A:Z

    move-object v0, p1

    check-cast v0, Lcom/digdroid/alman/dig/MainActivity;

    iput-object v0, p0, Lcom/digdroid/alman/dig/n2;->f:Lcom/digdroid/alman/dig/MainActivity;

    invoke-virtual {p1, p2}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/view/ViewStub;

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    :cond_0
    invoke-virtual {p1, p3}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout;

    iput-object p1, p0, Lcom/digdroid/alman/dig/n2;->p:Landroid/widget/FrameLayout;

    iput p4, p0, Lcom/digdroid/alman/dig/n2;->s:I

    iput p5, p0, Lcom/digdroid/alman/dig/n2;->t:I

    return-void
.end method

.method static synthetic c(Lcom/digdroid/alman/dig/n2;)V
    .locals 0

    invoke-direct {p0}, Lcom/digdroid/alman/dig/n2;->s()V

    return-void
.end method

.method static synthetic d(Lcom/digdroid/alman/dig/n2;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/digdroid/alman/dig/n2;->j:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic e(Lcom/digdroid/alman/dig/n2;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/digdroid/alman/dig/n2;->l:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic f(Lcom/digdroid/alman/dig/n2;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/n2;->l:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic g(Lcom/digdroid/alman/dig/n2;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/digdroid/alman/dig/n2;->x(I)V

    return-void
.end method

.method static synthetic h(Lcom/digdroid/alman/dig/n2;)Lc/b/a/c/a/c;
    .locals 0

    iget-object p0, p0, Lcom/digdroid/alman/dig/n2;->m:Lc/b/a/c/a/c;

    return-object p0
.end method

.method static synthetic i(Lcom/digdroid/alman/dig/n2;)Lfr/bmartel/youtubetv/YoutubeTvView;
    .locals 0

    iget-object p0, p0, Lcom/digdroid/alman/dig/n2;->n:Lfr/bmartel/youtubetv/YoutubeTvView;

    return-object p0
.end method

.method static synthetic j(Lcom/digdroid/alman/dig/n2;)Landroid/widget/RelativeLayout;
    .locals 0

    iget-object p0, p0, Lcom/digdroid/alman/dig/n2;->r:Landroid/widget/RelativeLayout;

    return-object p0
.end method

.method static synthetic k(Lcom/digdroid/alman/dig/n2;)Landroid/widget/RelativeLayout;
    .locals 0

    iget-object p0, p0, Lcom/digdroid/alman/dig/n2;->q:Landroid/widget/RelativeLayout;

    return-object p0
.end method

.method public static declared-synchronized m()V
    .locals 3

    const-class v0, Lcom/digdroid/alman/dig/n2;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/digdroid/alman/dig/n2;->a:Lcom/digdroid/alman/dig/n2;

    if-eqz v1, :cond_2

    const/4 v2, 0x0

    iput-boolean v2, v1, Lcom/digdroid/alman/dig/n2;->h:Z

    iget-object v1, v1, Lcom/digdroid/alman/dig/n2;->m:Lc/b/a/c/a/c;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lc/b/a/c/a/c;->a()V

    :cond_0
    sget-object v1, Lcom/digdroid/alman/dig/n2;->a:Lcom/digdroid/alman/dig/n2;

    iget-object v1, v1, Lcom/digdroid/alman/dig/n2;->n:Lfr/bmartel/youtubetv/YoutubeTvView;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lfr/bmartel/youtubetv/YoutubeTvView;->b()V

    :cond_1
    const/4 v1, 0x0

    sput-object v1, Lcom/digdroid/alman/dig/n2;->a:Lcom/digdroid/alman/dig/n2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static declared-synchronized o(Landroid/app/Activity;IIII)Lcom/digdroid/alman/dig/n2;
    .locals 8

    const-class v0, Lcom/digdroid/alman/dig/n2;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/digdroid/alman/dig/n2;->a:Lcom/digdroid/alman/dig/n2;

    if-nez v1, :cond_0

    new-instance v1, Lcom/digdroid/alman/dig/n2;

    move-object v2, v1

    move-object v3, p0

    move v4, p1

    move v5, p2

    move v6, p3

    move v7, p4

    invoke-direct/range {v2 .. v7}, Lcom/digdroid/alman/dig/n2;-><init>(Landroid/app/Activity;IIII)V

    sput-object v1, Lcom/digdroid/alman/dig/n2;->a:Lcom/digdroid/alman/dig/n2;

    :cond_0
    sget-object p0, Lcom/digdroid/alman/dig/n2;->a:Lcom/digdroid/alman/dig/n2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method private s()V
    .locals 4

    const/4 v0, 0x4

    invoke-direct {p0, v0}, Lcom/digdroid/alman/dig/n2;->x(I)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/n2;->r:Landroid/widget/RelativeLayout;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/n2;->m:Lc/b/a/c/a/c;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    iget-object v0, p0, Lcom/digdroid/alman/dig/n2;->o:Landroid/os/Handler;

    if-nez v0, :cond_0

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/digdroid/alman/dig/n2;->o:Landroid/os/Handler;

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    :goto_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/n2;->o:Landroid/os/Handler;

    new-instance v1, Lcom/digdroid/alman/dig/n2$b;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/n2$b;-><init>(Lcom/digdroid/alman/dig/n2;)V

    :goto_1
    iget v2, p0, Lcom/digdroid/alman/dig/n2;->v:I

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_3

    :cond_1
    iget-object v1, p0, Lcom/digdroid/alman/dig/n2;->n:Lfr/bmartel/youtubetv/YoutubeTvView;

    if-eqz v1, :cond_3

    iget-object v0, p0, Lcom/digdroid/alman/dig/n2;->o:Landroid/os/Handler;

    if-nez v0, :cond_2

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/digdroid/alman/dig/n2;->o:Landroid/os/Handler;

    goto :goto_2

    :cond_2
    invoke-virtual {v0, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    :goto_2
    iget-object v0, p0, Lcom/digdroid/alman/dig/n2;->o:Landroid/os/Handler;

    new-instance v1, Lcom/digdroid/alman/dig/n2$c;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/n2$c;-><init>(Lcom/digdroid/alman/dig/n2;)V

    goto :goto_1

    :cond_3
    iget-boolean v1, p0, Lcom/digdroid/alman/dig/n2;->i:Z

    if-nez v1, :cond_4

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/digdroid/alman/dig/n2;->i:Z

    iget-object v1, p0, Lcom/digdroid/alman/dig/n2;->q:Landroid/widget/RelativeLayout;

    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    invoke-static {}, Lc/b/a/c/a/d;->r2()Lc/b/a/c/a/d;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/n2;->f:Lcom/digdroid/alman/dig/MainActivity;

    invoke-virtual {v1}, Landroidx/fragment/app/d;->C0()Landroidx/fragment/app/i;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/fragment/app/i;->a()Landroidx/fragment/app/n;

    move-result-object v1

    iget v2, p0, Lcom/digdroid/alman/dig/n2;->s:I

    invoke-virtual {v1, v2, v0}, Landroidx/fragment/app/n;->i(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/n;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/fragment/app/n;->e()I

    const-string v1, "AIzaSyDGCqzc_ofIxkqj_pcbmg-CaCi0-rIa5-o"

    invoke-virtual {v0, v1, p0}, Lc/b/a/c/a/d;->q2(Ljava/lang/String;Lc/b/a/c/a/c$b;)V

    :cond_4
    :goto_3
    return-void
.end method

.method private x(I)V
    .locals 1

    iput p1, p0, Lcom/digdroid/alman/dig/n2;->y:I

    iget v0, p0, Lcom/digdroid/alman/dig/n2;->w:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/n2;->p:Landroid/widget/FrameLayout;

    invoke-virtual {v0, p1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    :cond_0
    return-void
.end method


# virtual methods
.method public a(Lc/b/a/c/a/c$d;Lc/b/a/c/a/b;)V
    .locals 1

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/digdroid/alman/dig/n2;->i:Z

    iget-object p2, p0, Lcom/digdroid/alman/dig/n2;->f:Lcom/digdroid/alman/dig/MainActivity;

    const v0, 0x7f090456

    invoke-virtual {p2, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object p2

    const/16 v0, 0x8

    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x15

    if-lt p2, v0, :cond_1

    iget-object p2, p0, Lcom/digdroid/alman/dig/n2;->n:Lfr/bmartel/youtubetv/YoutubeTvView;

    if-nez p2, :cond_0

    const/4 p2, 0x4

    invoke-direct {p0, p2}, Lcom/digdroid/alman/dig/n2;->x(I)V

    iget-object p2, p0, Lcom/digdroid/alman/dig/n2;->f:Lcom/digdroid/alman/dig/MainActivity;

    iget v0, p0, Lcom/digdroid/alman/dig/n2;->t:I

    invoke-virtual {p2, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lfr/bmartel/youtubetv/YoutubeTvView;

    iput-object p2, p0, Lcom/digdroid/alman/dig/n2;->n:Lfr/bmartel/youtubetv/YoutubeTvView;

    invoke-virtual {p2, p1}, Lfr/bmartel/youtubetv/YoutubeTvView;->setLoop(Z)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/n2;->n:Lfr/bmartel/youtubetv/YoutubeTvView;

    new-instance p2, Lcom/digdroid/alman/dig/n2$e;

    invoke-direct {p2, p0}, Lcom/digdroid/alman/dig/n2$e;-><init>(Lcom/digdroid/alman/dig/n2;)V

    invoke-virtual {p1, p2}, Lfr/bmartel/youtubetv/YoutubeTvView;->a(Lfr/bmartel/youtubetv/g/b;)V

    :cond_0
    iget-boolean p1, p0, Lcom/digdroid/alman/dig/n2;->h:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/digdroid/alman/dig/n2;->b:Lcom/digdroid/alman/dig/n2$g;

    invoke-interface {p1}, Lcom/digdroid/alman/dig/n2$g;->b()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/digdroid/alman/dig/n2;->j:Ljava/lang/String;

    if-eqz p1, :cond_1

    iget-object p2, p0, Lcom/digdroid/alman/dig/n2;->n:Lfr/bmartel/youtubetv/YoutubeTvView;

    invoke-virtual {p2, p1}, Lfr/bmartel/youtubetv/YoutubeTvView;->h(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public b(Lc/b/a/c/a/c$d;Lc/b/a/c/a/c;Z)V
    .locals 0

    iput-object p2, p0, Lcom/digdroid/alman/dig/n2;->m:Lc/b/a/c/a/c;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/digdroid/alman/dig/n2;->i:Z

    new-instance p1, Lcom/digdroid/alman/dig/n2$d;

    invoke-direct {p1, p0}, Lcom/digdroid/alman/dig/n2$d;-><init>(Lcom/digdroid/alman/dig/n2;)V

    invoke-interface {p2, p1}, Lc/b/a/c/a/c;->f(Lc/b/a/c/a/c$c;)V

    iget-boolean p1, p0, Lcom/digdroid/alman/dig/n2;->h:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/digdroid/alman/dig/n2;->b:Lcom/digdroid/alman/dig/n2$g;

    invoke-interface {p1}, Lcom/digdroid/alman/dig/n2$g;->b()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/digdroid/alman/dig/n2;->j:Ljava/lang/String;

    if-eqz p1, :cond_0

    invoke-interface {p2, p1}, Lc/b/a/c/a/c;->c(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method l(Lcom/digdroid/alman/dig/p1;)V
    .locals 1

    iget v0, p0, Lcom/digdroid/alman/dig/n2;->w:I

    if-nez v0, :cond_1

    iget v0, p0, Lcom/digdroid/alman/dig/n2;->x:I

    if-nez v0, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/n2;->z:Z

    iget-object v0, p0, Lcom/digdroid/alman/dig/n2;->c:Lcom/digdroid/alman/dig/p1;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lcom/digdroid/alman/dig/n2;->p:Landroid/widget/FrameLayout;

    iget v0, p0, Lcom/digdroid/alman/dig/n2;->y:I

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setVisibility(I)V

    :cond_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/n2;->k:Ljava/lang/String;

    if-eqz p1, :cond_2

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/n2;->t(Ljava/lang/String;)Z

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/digdroid/alman/dig/n2;->k:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iget-boolean p1, p0, Lcom/digdroid/alman/dig/n2;->z:Z

    if-nez p1, :cond_2

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/digdroid/alman/dig/n2;->z:Z

    iget-object p1, p0, Lcom/digdroid/alman/dig/n2;->p:Landroid/widget/FrameLayout;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setVisibility(I)V

    :cond_2
    :goto_0
    return-void
.end method

.method public n()Lcom/digdroid/alman/dig/n2$f;
    .locals 1

    new-instance v0, Lcom/digdroid/alman/dig/n2$f;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/n2$f;-><init>(Lcom/digdroid/alman/dig/n2;)V

    return-object v0
.end method

.method public p()V
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/n2;->o:Landroid/os/Handler;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    :cond_0
    invoke-virtual {p0}, Lcom/digdroid/alman/dig/n2;->r()V

    const/4 v0, 0x4

    invoke-direct {p0, v0}, Lcom/digdroid/alman/dig/n2;->x(I)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/n2;->r:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    return-void
.end method

.method public q(Lcom/digdroid/alman/dig/p1;I)V
    .locals 0

    iput p2, p0, Lcom/digdroid/alman/dig/n2;->w:I

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/n2;->l(Lcom/digdroid/alman/dig/p1;)V

    return-void
.end method

.method public r()V
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/n2;->m:Lc/b/a/c/a/c;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lc/b/a/c/a/c;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/n2;->m:Lc/b/a/c/a/c;

    invoke-interface {v0}, Lc/b/a/c/a/c;->b()V

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/n2;->n:Lfr/bmartel/youtubetv/YoutubeTvView;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lfr/bmartel/youtubetv/YoutubeTvView;->f()V

    :cond_1
    return-void
.end method

.method public t(Ljava/lang/String;)Z
    .locals 4

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/n2;->p()V

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    iget-object v2, p0, Lcom/digdroid/alman/dig/n2;->l:Ljava/lang/String;

    if-eqz v2, :cond_0

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    iput-boolean v2, p0, Lcom/digdroid/alman/dig/n2;->A:Z

    iput-object p1, p0, Lcom/digdroid/alman/dig/n2;->j:Ljava/lang/String;

    if-nez p1, :cond_1

    return v1

    :cond_1
    iget-object v2, p0, Lcom/digdroid/alman/dig/n2;->b:Lcom/digdroid/alman/dig/n2$g;

    invoke-interface {v2}, Lcom/digdroid/alman/dig/n2$g;->b()Z

    move-result v2

    if-nez v2, :cond_2

    return v1

    :cond_2
    iget v2, p0, Lcom/digdroid/alman/dig/n2;->g:I

    const/16 v3, 0x8

    if-ne v2, v3, :cond_3

    return v1

    :cond_3
    iget-boolean v3, p0, Lcom/digdroid/alman/dig/n2;->u:Z

    if-nez v3, :cond_4

    if-eq v2, v0, :cond_4

    const/16 v3, 0x9

    if-eq v2, v3, :cond_4

    return v1

    :cond_4
    iget-boolean v1, p0, Lcom/digdroid/alman/dig/n2;->z:Z

    if-eqz v1, :cond_5

    iput-object p1, p0, Lcom/digdroid/alman/dig/n2;->k:Ljava/lang/String;

    return v0

    :cond_5
    iget-object p1, p0, Lcom/digdroid/alman/dig/n2;->q:Landroid/widget/RelativeLayout;

    new-instance v1, Lcom/digdroid/alman/dig/n2$a;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/n2$a;-><init>(Lcom/digdroid/alman/dig/n2;)V

    invoke-virtual {p1, v1}, Landroid/widget/RelativeLayout;->post(Ljava/lang/Runnable;)Z

    return v0
.end method

.method public u(Lcom/digdroid/alman/dig/p1;)V
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/n2;->c:Lcom/digdroid/alman/dig/p1;

    if-eq p1, v0, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/n2;->o:Landroid/os/Handler;

    if-eqz p1, :cond_1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/digdroid/alman/dig/n2;->o:Landroid/os/Handler;

    :cond_1
    invoke-virtual {p0}, Lcom/digdroid/alman/dig/n2;->r()V

    const/16 p1, 0x8

    invoke-direct {p0, p1}, Lcom/digdroid/alman/dig/n2;->x(I)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/digdroid/alman/dig/n2;->i:Z

    return-void
.end method

.method public v(Lcom/digdroid/alman/dig/p1;Lcom/digdroid/alman/dig/n2$f;)V
    .locals 1

    iput-object p1, p0, Lcom/digdroid/alman/dig/n2;->c:Lcom/digdroid/alman/dig/p1;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->F0()Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/n2;->e:Landroid/view/View;

    iput-object p2, p0, Lcom/digdroid/alman/dig/n2;->d:Lcom/digdroid/alman/dig/n2$f;

    iget-object v0, p2, Lcom/digdroid/alman/dig/n2$f;->a:Lcom/digdroid/alman/dig/n2$g;

    iput-object v0, p0, Lcom/digdroid/alman/dig/n2;->b:Lcom/digdroid/alman/dig/n2$g;

    iget p2, p2, Lcom/digdroid/alman/dig/n2$f;->b:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iput-object p1, p0, Lcom/digdroid/alman/dig/n2;->q:Landroid/widget/RelativeLayout;

    iget-object p1, p0, Lcom/digdroid/alman/dig/n2;->e:Landroid/view/View;

    iget-object p2, p0, Lcom/digdroid/alman/dig/n2;->d:Lcom/digdroid/alman/dig/n2$f;

    iget p2, p2, Lcom/digdroid/alman/dig/n2$f;->c:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iput-object p1, p0, Lcom/digdroid/alman/dig/n2;->r:Landroid/widget/RelativeLayout;

    iget-object p1, p0, Lcom/digdroid/alman/dig/n2;->d:Lcom/digdroid/alman/dig/n2$f;

    iget-boolean p1, p1, Lcom/digdroid/alman/dig/n2$f;->d:Z

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/n2;->y(Z)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/n2;->d:Lcom/digdroid/alman/dig/n2$f;

    iget p1, p1, Lcom/digdroid/alman/dig/n2$f;->e:I

    iput p1, p0, Lcom/digdroid/alman/dig/n2;->v:I

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/n2;->w()V

    return-void
.end method

.method public w()V
    .locals 5

    iget-object v0, p0, Lcom/digdroid/alman/dig/n2;->d:Lcom/digdroid/alman/dig/n2$f;

    iget-boolean v0, v0, Lcom/digdroid/alman/dig/n2$f;->f:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/digdroid/alman/dig/n2;->q:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getWidth()I

    move-result v0

    iget-object v2, p0, Lcom/digdroid/alman/dig/n2;->d:Lcom/digdroid/alman/dig/n2$f;

    iget v2, v2, Lcom/digdroid/alman/dig/n2$f;->i:I

    if-ne v0, v2, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/n2;->q:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getHeight()I

    move-result v0

    iget-object v2, p0, Lcom/digdroid/alman/dig/n2;->d:Lcom/digdroid/alman/dig/n2$f;

    iget v2, v2, Lcom/digdroid/alman/dig/n2$f;->j:I

    if-eq v0, v2, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/n2;->d:Lcom/digdroid/alman/dig/n2$f;

    iput-boolean v1, v0, Lcom/digdroid/alman/dig/n2$f;->f:Z

    :cond_1
    iget-object v0, p0, Lcom/digdroid/alman/dig/n2;->d:Lcom/digdroid/alman/dig/n2$f;

    iget-boolean v0, v0, Lcom/digdroid/alman/dig/n2$f;->f:Z

    if-nez v0, :cond_2

    const/4 v0, 0x2

    new-array v0, v0, [I

    iget-object v2, p0, Lcom/digdroid/alman/dig/n2;->q:Landroid/widget/RelativeLayout;

    invoke-virtual {v2, v0}, Landroid/widget/RelativeLayout;->getLocationOnScreen([I)V

    iget-object v2, p0, Lcom/digdroid/alman/dig/n2;->d:Lcom/digdroid/alman/dig/n2$f;

    aget v1, v0, v1

    iput v1, v2, Lcom/digdroid/alman/dig/n2$f;->h:I

    const/4 v1, 0x1

    aget v0, v0, v1

    iput v0, v2, Lcom/digdroid/alman/dig/n2$f;->g:I

    iget-object v0, p0, Lcom/digdroid/alman/dig/n2;->q:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getWidth()I

    move-result v0

    iput v0, v2, Lcom/digdroid/alman/dig/n2$f;->i:I

    iget-object v0, p0, Lcom/digdroid/alman/dig/n2;->d:Lcom/digdroid/alman/dig/n2$f;

    iget-object v2, p0, Lcom/digdroid/alman/dig/n2;->q:Landroid/widget/RelativeLayout;

    invoke-virtual {v2}, Landroid/widget/RelativeLayout;->getHeight()I

    move-result v2

    iput v2, v0, Lcom/digdroid/alman/dig/n2$f;->j:I

    iget-object v0, p0, Lcom/digdroid/alman/dig/n2;->d:Lcom/digdroid/alman/dig/n2$f;

    iput-boolean v1, v0, Lcom/digdroid/alman/dig/n2$f;->f:Z

    :cond_2
    iget-object v0, p0, Lcom/digdroid/alman/dig/n2;->f:Lcom/digdroid/alman/dig/MainActivity;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/a4;->g1()Landroid/graphics/Point;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/n2;->p:Landroid/widget/FrameLayout;

    invoke-virtual {v1}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/FrameLayout$LayoutParams;

    iget-object v2, p0, Lcom/digdroid/alman/dig/n2;->d:Lcom/digdroid/alman/dig/n2$f;

    iget v3, v2, Lcom/digdroid/alman/dig/n2$f;->h:I

    iget v4, v0, Landroid/graphics/Point;->x:I

    sub-int/2addr v3, v4

    iput v3, v1, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    iget v3, v2, Lcom/digdroid/alman/dig/n2$f;->g:I

    iget v0, v0, Landroid/graphics/Point;->y:I

    sub-int/2addr v3, v0

    iput v3, v1, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    iget v0, v2, Lcom/digdroid/alman/dig/n2$f;->i:I

    iput v0, v1, Landroid/widget/FrameLayout$LayoutParams;->width:I

    iget v0, v2, Lcom/digdroid/alman/dig/n2$f;->j:I

    iput v0, v1, Landroid/widget/FrameLayout$LayoutParams;->height:I

    return-void
.end method

.method public y(Z)V
    .locals 1

    iput-boolean p1, p0, Lcom/digdroid/alman/dig/n2;->u:Z

    iget-object p1, p0, Lcom/digdroid/alman/dig/n2;->f:Lcom/digdroid/alman/dig/MainActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "connectivity"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/net/ConnectivityManager;

    invoke-virtual {p1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/net/NetworkInfo;->isConnectedOrConnecting()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroid/net/NetworkInfo;->getType()I

    move-result p1

    goto :goto_1

    :cond_1
    const/16 p1, 0x8

    :goto_1
    iput p1, p0, Lcom/digdroid/alman/dig/n2;->g:I

    return-void
.end method

.method public z(Lcom/digdroid/alman/dig/p1;I)V
    .locals 0

    iput p2, p0, Lcom/digdroid/alman/dig/n2;->x:I

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/n2;->l(Lcom/digdroid/alman/dig/p1;)V

    return-void
.end method
