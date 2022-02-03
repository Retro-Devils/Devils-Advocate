.class Lcom/digdroid/alman/dig/j0$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/digdroid/alman/dig/j0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/j0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/j0;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/j0$a;->b:Lcom/digdroid/alman/dig/j0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/j0$a;->b:Lcom/digdroid/alman/dig/j0;

    iget-boolean v1, v0, Lcom/digdroid/alman/dig/p1;->j0:Z

    if-eqz v1, :cond_0

    iget-boolean v1, v0, Lcom/digdroid/alman/dig/j0;->u0:Z

    if-nez v1, :cond_0

    iget-boolean v1, v0, Lcom/digdroid/alman/dig/j0;->D1:Z

    xor-int/lit8 v1, v1, 0x1

    iput-boolean v1, v0, Lcom/digdroid/alman/dig/j0;->D1:Z

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/j0;->k3(Z)Ljava/io/File;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/j0$a;->b:Lcom/digdroid/alman/dig/j0;

    iget-object v2, v1, Lcom/digdroid/alman/dig/j0;->E1:Ljava/io/File;

    if-eq v0, v2, :cond_0

    iget-object v1, v1, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    invoke-interface {v1}, Lcom/digdroid/alman/dig/p1$a;->m()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/digdroid/alman/dig/j0$a;->b:Lcom/digdroid/alman/dig/j0;

    iput-object v0, v1, Lcom/digdroid/alman/dig/j0;->E1:Ljava/io/File;

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lcom/digdroid/alman/dig/j0;->y3(Z)V

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/j0$a;->b:Lcom/digdroid/alman/dig/j0;

    iget-object v0, v0, Lcom/digdroid/alman/dig/j0;->C1:Landroid/os/Handler;

    const-wide/16 v1, 0xbb8

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
