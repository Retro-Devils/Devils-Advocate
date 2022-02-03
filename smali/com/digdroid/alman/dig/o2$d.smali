.class Lcom/digdroid/alman/dig/o2$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/o2;->W1(FF)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/o2;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/o2;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/o2$d;->b:Lcom/digdroid/alman/dig/o2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/o2$d;->b:Lcom/digdroid/alman/dig/o2;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/e0;->i1()Lcom/digdroid/alman/dig/p1;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/digdroid/alman/dig/o2$d;->b:Lcom/digdroid/alman/dig/o2;

    iget v1, v1, Lcom/digdroid/alman/dig/o2;->M0:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/p1;->y2(II)Z

    iget-object v0, p0, Lcom/digdroid/alman/dig/o2$d;->b:Lcom/digdroid/alman/dig/o2;

    iget-object v0, v0, Lcom/digdroid/alman/dig/o2;->L0:Landroid/os/Handler;

    const-wide/16 v1, 0x64

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method
