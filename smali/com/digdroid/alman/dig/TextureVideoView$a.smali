.class Lcom/digdroid/alman/dig/TextureVideoView$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/media/MediaPlayer$OnVideoSizeChangedListener;


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

    iput-object p1, p0, Lcom/digdroid/alman/dig/TextureVideoView$a;->a:Lcom/digdroid/alman/dig/TextureVideoView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onVideoSizeChanged(Landroid/media/MediaPlayer;II)V
    .locals 0

    iget-object p1, p0, Lcom/digdroid/alman/dig/TextureVideoView$a;->a:Lcom/digdroid/alman/dig/TextureVideoView;

    int-to-float p2, p2

    invoke-static {p1, p2}, Lcom/digdroid/alman/dig/TextureVideoView;->a(Lcom/digdroid/alman/dig/TextureVideoView;F)F

    iget-object p1, p0, Lcom/digdroid/alman/dig/TextureVideoView$a;->a:Lcom/digdroid/alman/dig/TextureVideoView;

    int-to-float p2, p3

    invoke-static {p1, p2}, Lcom/digdroid/alman/dig/TextureVideoView;->b(Lcom/digdroid/alman/dig/TextureVideoView;F)F

    iget-object p1, p0, Lcom/digdroid/alman/dig/TextureVideoView$a;->a:Lcom/digdroid/alman/dig/TextureVideoView;

    invoke-static {p1}, Lcom/digdroid/alman/dig/TextureVideoView;->c(Lcom/digdroid/alman/dig/TextureVideoView;)V

    return-void
.end method
