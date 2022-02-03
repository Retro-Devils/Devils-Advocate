.class Lcom/digdroid/alman/dig/v3$k;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/v3;->onResume()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/v3;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/v3;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/v3$k;->b:Lcom/digdroid/alman/dig/v3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/v3$k;->b:Lcom/digdroid/alman/dig/v3;

    iget-object v0, v0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/c3;->v()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/v3$k;->b:Lcom/digdroid/alman/dig/v3;

    iget-boolean v1, v0, Lcom/digdroid/alman/dig/v3;->w0:Z

    xor-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/v3$k;->b:Lcom/digdroid/alman/dig/v3;

    const/4 v1, 0x0

    :goto_0
    iput-boolean v1, v0, Lcom/digdroid/alman/dig/v3;->w0:Z

    iget-object v0, p0, Lcom/digdroid/alman/dig/v3$k;->b:Lcom/digdroid/alman/dig/v3;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/v3;->K1()V

    iget-object v0, p0, Lcom/digdroid/alman/dig/v3$k;->b:Lcom/digdroid/alman/dig/v3;

    iget-object v0, v0, Lcom/digdroid/alman/dig/v3;->s0:Landroid/os/Handler;

    const-wide/16 v1, 0x1f4

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
