.class Lcom/digdroid/alman/dig/TextureVideoView$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/media/MediaPlayer$OnPreparedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/TextureVideoView;->p()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/TextureVideoView;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/TextureVideoView;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/TextureVideoView$d;->a:Lcom/digdroid/alman/dig/TextureVideoView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPrepared(Landroid/media/MediaPlayer;)V
    .locals 1

    iget-object p1, p0, Lcom/digdroid/alman/dig/TextureVideoView$d;->a:Lcom/digdroid/alman/dig/TextureVideoView;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/digdroid/alman/dig/TextureVideoView;->h(Lcom/digdroid/alman/dig/TextureVideoView;Z)Z

    iget-object p1, p0, Lcom/digdroid/alman/dig/TextureVideoView$d;->a:Lcom/digdroid/alman/dig/TextureVideoView;

    invoke-static {p1}, Lcom/digdroid/alman/dig/TextureVideoView;->i(Lcom/digdroid/alman/dig/TextureVideoView;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/digdroid/alman/dig/TextureVideoView$d;->a:Lcom/digdroid/alman/dig/TextureVideoView;

    invoke-static {p1}, Lcom/digdroid/alman/dig/TextureVideoView;->j(Lcom/digdroid/alman/dig/TextureVideoView;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "Player is prepared and play() was called."

    invoke-static {p1}, Lcom/digdroid/alman/dig/TextureVideoView;->m(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/TextureVideoView$d;->a:Lcom/digdroid/alman/dig/TextureVideoView;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/TextureVideoView;->o()V

    :cond_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/TextureVideoView$d;->a:Lcom/digdroid/alman/dig/TextureVideoView;

    invoke-static {p1}, Lcom/digdroid/alman/dig/TextureVideoView;->f(Lcom/digdroid/alman/dig/TextureVideoView;)Lcom/digdroid/alman/dig/TextureVideoView$f;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/digdroid/alman/dig/TextureVideoView$d;->a:Lcom/digdroid/alman/dig/TextureVideoView;

    invoke-static {p1}, Lcom/digdroid/alman/dig/TextureVideoView;->f(Lcom/digdroid/alman/dig/TextureVideoView;)Lcom/digdroid/alman/dig/TextureVideoView$f;

    move-result-object p1

    invoke-interface {p1}, Lcom/digdroid/alman/dig/TextureVideoView$f;->c()V

    :cond_1
    return-void
.end method
