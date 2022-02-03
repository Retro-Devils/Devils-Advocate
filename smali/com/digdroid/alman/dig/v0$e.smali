.class Lcom/digdroid/alman/dig/v0$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/v0;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field b:Landroid/os/Handler;

.field final synthetic c:Lcom/digdroid/alman/dig/v0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/v0;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/v0$e;->c:Lcom/digdroid/alman/dig/v0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/digdroid/alman/dig/v0$e;->b:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 2

    iget-object p2, p0, Lcom/digdroid/alman/dig/v0$e;->b:Landroid/os/Handler;

    if-nez p2, :cond_0

    new-instance p2, Landroid/os/Handler;

    invoke-direct {p2}, Landroid/os/Handler;-><init>()V

    iput-object p2, p0, Lcom/digdroid/alman/dig/v0$e;->b:Landroid/os/Handler;

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    invoke-virtual {p2, p3}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    :goto_0
    iget-object p2, p0, Lcom/digdroid/alman/dig/v0$e;->b:Landroid/os/Handler;

    new-instance p3, Lcom/digdroid/alman/dig/v0$e$a;

    invoke-direct {p3, p0, p1}, Lcom/digdroid/alman/dig/v0$e$a;-><init>(Lcom/digdroid/alman/dig/v0$e;Landroid/widget/SeekBar;)V

    const-wide/16 v0, 0x1f4

    invoke-virtual {p2, p3, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    return-void
.end method

.method public onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    return-void
.end method
