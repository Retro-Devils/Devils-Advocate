.class Lcom/digdroid/alman/dig/o2$e$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/o2$e;->a(Lfr/bmartel/youtubetv/h/g;JFFLfr/bmartel/youtubetv/h/e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/o2$e;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/o2$e;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/o2$e$a;->b:Lcom/digdroid/alman/dig/o2$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/o2$e$a;->b:Lcom/digdroid/alman/dig/o2$e;

    iget-object v0, v0, Lcom/digdroid/alman/dig/o2$e;->a:Lcom/digdroid/alman/dig/o2;

    iget-boolean v1, v0, Lcom/digdroid/alman/dig/o2;->h:Z

    if-eqz v1, :cond_0

    invoke-static {v0}, Lcom/digdroid/alman/dig/o2;->i(Lcom/digdroid/alman/dig/o2;)Lfr/bmartel/youtubetv/YoutubeTvView;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/o2$e$a;->b:Lcom/digdroid/alman/dig/o2$e;

    iget-object v1, v1, Lcom/digdroid/alman/dig/o2$e;->a:Lcom/digdroid/alman/dig/o2;

    invoke-static {v1}, Lcom/digdroid/alman/dig/o2;->k(Lcom/digdroid/alman/dig/o2;)Landroid/widget/RelativeLayout;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/RelativeLayout;->getWidth()I

    move-result v1

    iget-object v2, p0, Lcom/digdroid/alman/dig/o2$e$a;->b:Lcom/digdroid/alman/dig/o2$e;

    iget-object v2, v2, Lcom/digdroid/alman/dig/o2$e;->a:Lcom/digdroid/alman/dig/o2;

    invoke-static {v2}, Lcom/digdroid/alman/dig/o2;->k(Lcom/digdroid/alman/dig/o2;)Landroid/widget/RelativeLayout;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/RelativeLayout;->getHeight()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lfr/bmartel/youtubetv/YoutubeTvView;->k(II)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/o2$e$a;->b:Lcom/digdroid/alman/dig/o2$e;

    iget-object v0, v0, Lcom/digdroid/alman/dig/o2$e;->a:Lcom/digdroid/alman/dig/o2;

    invoke-static {v0}, Lcom/digdroid/alman/dig/o2;->i(Lcom/digdroid/alman/dig/o2;)Lfr/bmartel/youtubetv/YoutubeTvView;

    move-result-object v0

    new-instance v1, Lcom/digdroid/alman/dig/o2$e$a$a;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/o2$e$a$a;-><init>(Lcom/digdroid/alman/dig/o2$e$a;)V

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method
