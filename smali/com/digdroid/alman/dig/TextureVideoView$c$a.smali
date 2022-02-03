.class Lcom/digdroid/alman/dig/TextureVideoView$c$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/TextureVideoView$c;->onSeekComplete(Landroid/media/MediaPlayer;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/TextureVideoView$c;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/TextureVideoView$c;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/TextureVideoView$c$a;->b:Lcom/digdroid/alman/dig/TextureVideoView$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/TextureVideoView$c$a;->b:Lcom/digdroid/alman/dig/TextureVideoView$c;

    iget-object v0, v0, Lcom/digdroid/alman/dig/TextureVideoView$c;->a:Lcom/digdroid/alman/dig/TextureVideoView;

    invoke-static {v0}, Lcom/digdroid/alman/dig/TextureVideoView;->g(Lcom/digdroid/alman/dig/TextureVideoView;)Landroid/media/MediaPlayer;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/TextureVideoView$c$a;->b:Lcom/digdroid/alman/dig/TextureVideoView$c;

    iget-object v0, v0, Lcom/digdroid/alman/dig/TextureVideoView$c;->a:Lcom/digdroid/alman/dig/TextureVideoView;

    invoke-static {v0}, Lcom/digdroid/alman/dig/TextureVideoView;->g(Lcom/digdroid/alman/dig/TextureVideoView;)Landroid/media/MediaPlayer;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V

    :cond_0
    return-void
.end method
