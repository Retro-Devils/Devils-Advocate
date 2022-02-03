.class Lcom/digdroid/alman/dig/w2$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/w2;->onResume()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:J

.field final synthetic c:Lcom/digdroid/alman/dig/w2;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/w2;JJ)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/w2$d;->c:Lcom/digdroid/alman/dig/w2;

    iput-wide p2, p0, Lcom/digdroid/alman/dig/w2$d;->a:J

    iput-wide p4, p0, Lcom/digdroid/alman/dig/w2$d;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public call()Ljava/lang/Object;
    .locals 8

    iget-object v1, p0, Lcom/digdroid/alman/dig/w2$d;->c:Lcom/digdroid/alman/dig/w2;

    iget-object v0, v1, Lcom/digdroid/alman/dig/t;->z:Lcom/digdroid/alman/dig/b0;

    iget-wide v2, p0, Lcom/digdroid/alman/dig/w2$d;->a:J

    iget-wide v4, p0, Lcom/digdroid/alman/dig/w2$d;->b:J

    iget-boolean v6, v1, Lcom/digdroid/alman/dig/t;->E:Z

    invoke-virtual/range {v0 .. v6}, Lcom/digdroid/alman/dig/b0;->v(Landroid/app/Activity;JJZ)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/w2$d;->c:Lcom/digdroid/alman/dig/w2;

    iget-boolean v1, v0, Lcom/digdroid/alman/dig/t;->E:Z

    if-eqz v1, :cond_1

    :try_start_0
    iget-object v0, v0, Lcom/digdroid/alman/dig/t;->D:Ljava/lang/String;

    const-string v1, "mame"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Covers"

    goto :goto_0

    :cond_0
    const-string v0, "Screenshots"

    :goto_0
    move-object v3, v0

    new-instance v0, Lcom/digdroid/alman/dig/x2;

    iget-object v1, p0, Lcom/digdroid/alman/dig/w2$d;->c:Lcom/digdroid/alman/dig/w2;

    invoke-direct {v0, v1}, Lcom/digdroid/alman/dig/x2;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/w2$d;->c:Lcom/digdroid/alman/dig/w2;

    iget-object v1, v1, Lcom/digdroid/alman/dig/t;->A:Lcom/digdroid/alman/dig/t1;

    new-instance v2, Ljava/io/File;

    const-string v4, "screenshot_directory"

    invoke-virtual {v0, v4}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iget-wide v4, p0, Lcom/digdroid/alman/dig/w2$d;->a:J

    iget-object v0, p0, Lcom/digdroid/alman/dig/w2$d;->c:Lcom/digdroid/alman/dig/w2;

    iget-wide v6, v0, Lcom/digdroid/alman/dig/t;->B:J

    invoke-virtual/range {v1 .. v7}, Lcom/digdroid/alman/dig/t1;->v(Ljava/io/File;Ljava/lang/String;JJ)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method
