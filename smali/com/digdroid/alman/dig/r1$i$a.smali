.class Lcom/digdroid/alman/dig/r1$i$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/r1$i;->b(Landroid/database/Cursor;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/database/Cursor;

.field final synthetic c:Lcom/digdroid/alman/dig/r1$i;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/r1$i;Landroid/database/Cursor;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/r1$i$a;->c:Lcom/digdroid/alman/dig/r1$i;

    iput-object p2, p0, Lcom/digdroid/alman/dig/r1$i$a;->b:Landroid/database/Cursor;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/r1$i$a;->c:Lcom/digdroid/alman/dig/r1$i;

    iget-object v1, v0, Lcom/digdroid/alman/dig/r1$i;->d:Lcom/digdroid/alman/dig/r1;

    iget-object v2, p0, Lcom/digdroid/alman/dig/r1$i$a;->b:Landroid/database/Cursor;

    iget-boolean v0, v0, Lcom/digdroid/alman/dig/r1$i;->a:Z

    invoke-virtual {v1, v2, v0}, Lcom/digdroid/alman/dig/r1;->r3(Landroid/database/Cursor;Z)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/r1$i$a;->c:Lcom/digdroid/alman/dig/r1$i;

    iget-object v0, v0, Lcom/digdroid/alman/dig/r1$i;->c:Ljava/util/concurrent/Callable;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/r1$i$a;->c:Lcom/digdroid/alman/dig/r1$i;

    iget-boolean v1, v0, Lcom/digdroid/alman/dig/r1$i;->b:Z

    if-eqz v1, :cond_1

    iget-object v0, v0, Lcom/digdroid/alman/dig/r1$i;->d:Lcom/digdroid/alman/dig/r1;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Landroid/app/Activity;->invalidateOptionsMenu()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_1
    :goto_0
    return-void
.end method
