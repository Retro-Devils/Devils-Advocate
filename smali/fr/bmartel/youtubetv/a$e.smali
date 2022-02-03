.class Lfr/bmartel/youtubetv/a$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfr/bmartel/youtubetv/a;->hideLoading(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Z

.field final synthetic c:Lfr/bmartel/youtubetv/a;


# direct methods
.method constructor <init>(Lfr/bmartel/youtubetv/a;Z)V
    .locals 0

    iput-object p1, p0, Lfr/bmartel/youtubetv/a$e;->c:Lfr/bmartel/youtubetv/a;

    iput-boolean p2, p0, Lfr/bmartel/youtubetv/a$e;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lfr/bmartel/youtubetv/a$e;->c:Lfr/bmartel/youtubetv/a;

    invoke-static {v0}, Lfr/bmartel/youtubetv/a;->j(Lfr/bmartel/youtubetv/a;)Landroid/widget/ProgressBar;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    iget-boolean v0, p0, Lfr/bmartel/youtubetv/a$e;->b:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lfr/bmartel/youtubetv/a$e;->c:Lfr/bmartel/youtubetv/a;

    invoke-static {v0}, Lfr/bmartel/youtubetv/a;->k(Lfr/bmartel/youtubetv/a;)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lfr/bmartel/youtubetv/a$e;->c:Lfr/bmartel/youtubetv/a;

    invoke-static {v0}, Lfr/bmartel/youtubetv/a;->k(Lfr/bmartel/youtubetv/a;)Landroid/widget/ImageView;

    move-result-object v0

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void
.end method
