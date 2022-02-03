.class Lcom/digdroid/alman/dig/TextureVideoView$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/media/MediaPlayer$OnSeekCompleteListener;


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

    iput-object p1, p0, Lcom/digdroid/alman/dig/TextureVideoView$c;->a:Lcom/digdroid/alman/dig/TextureVideoView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onSeekComplete(Landroid/media/MediaPlayer;)V
    .locals 3

    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    new-instance v0, Lcom/digdroid/alman/dig/TextureVideoView$c$a;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/TextureVideoView$c$a;-><init>(Lcom/digdroid/alman/dig/TextureVideoView$c;)V

    const-wide/16 v1, 0xc8

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
