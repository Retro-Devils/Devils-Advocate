.class Lcom/digdroid/alman/dig/TextureVideoView$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/media/MediaPlayer$OnCompletionListener;


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

    iput-object p1, p0, Lcom/digdroid/alman/dig/TextureVideoView$b;->a:Lcom/digdroid/alman/dig/TextureVideoView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCompletion(Landroid/media/MediaPlayer;)V
    .locals 1

    iget-object p1, p0, Lcom/digdroid/alman/dig/TextureVideoView$b;->a:Lcom/digdroid/alman/dig/TextureVideoView;

    invoke-static {p1}, Lcom/digdroid/alman/dig/TextureVideoView;->d(Lcom/digdroid/alman/dig/TextureVideoView;)Lcom/digdroid/alman/dig/TextureVideoView$h;

    move-result-object p1

    sget-object v0, Lcom/digdroid/alman/dig/TextureVideoView$h;->b:Lcom/digdroid/alman/dig/TextureVideoView$h;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    const-string p1, "Video has ended."

    invoke-static {p1}, Lcom/digdroid/alman/dig/TextureVideoView;->m(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/TextureVideoView$b;->a:Lcom/digdroid/alman/dig/TextureVideoView;

    invoke-static {p1}, Lcom/digdroid/alman/dig/TextureVideoView;->d(Lcom/digdroid/alman/dig/TextureVideoView;)Lcom/digdroid/alman/dig/TextureVideoView$h;

    move-result-object p1

    sget-object v0, Lcom/digdroid/alman/dig/TextureVideoView$h;->c:Lcom/digdroid/alman/dig/TextureVideoView$h;

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lcom/digdroid/alman/dig/TextureVideoView$b;->a:Lcom/digdroid/alman/dig/TextureVideoView;

    invoke-static {p1}, Lcom/digdroid/alman/dig/TextureVideoView;->f(Lcom/digdroid/alman/dig/TextureVideoView;)Lcom/digdroid/alman/dig/TextureVideoView$f;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/digdroid/alman/dig/TextureVideoView$b;->a:Lcom/digdroid/alman/dig/TextureVideoView;

    invoke-static {p1}, Lcom/digdroid/alman/dig/TextureVideoView;->f(Lcom/digdroid/alman/dig/TextureVideoView;)Lcom/digdroid/alman/dig/TextureVideoView$f;

    move-result-object p1

    invoke-interface {p1}, Lcom/digdroid/alman/dig/TextureVideoView$f;->r0()V

    :cond_1
    iget-object p1, p0, Lcom/digdroid/alman/dig/TextureVideoView$b;->a:Lcom/digdroid/alman/dig/TextureVideoView;

    sget-object v0, Lcom/digdroid/alman/dig/TextureVideoView$h;->f:Lcom/digdroid/alman/dig/TextureVideoView$h;

    invoke-static {p1, v0}, Lcom/digdroid/alman/dig/TextureVideoView;->e(Lcom/digdroid/alman/dig/TextureVideoView;Lcom/digdroid/alman/dig/TextureVideoView$h;)Lcom/digdroid/alman/dig/TextureVideoView$h;

    return-void
.end method
