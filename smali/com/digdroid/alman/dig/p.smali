.class abstract Lcom/digdroid/alman/dig/p;
.super Ljava/lang/Object;
.source ""


# instance fields
.field a:I

.field b:I

.field c:I

.field d:J


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/digdroid/alman/dig/p;->a:I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/digdroid/alman/dig/p;->d:J

    const/4 v0, 0x5

    iput v0, p0, Lcom/digdroid/alman/dig/p;->b:I

    const v0, 0x927c0

    iput v0, p0, Lcom/digdroid/alman/dig/p;->c:I

    return-void
.end method


# virtual methods
.method a()V
    .locals 2

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p;->e()Z

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, Lcom/digdroid/alman/dig/p;->a:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/digdroid/alman/dig/p;->a:I

    :cond_0
    iget v0, p0, Lcom/digdroid/alman/dig/p;->a:I

    iget v1, p0, Lcom/digdroid/alman/dig/p;->b:I

    if-ne v0, v1, :cond_1

    const/4 v0, 0x0

    iput v0, p0, Lcom/digdroid/alman/dig/p;->a:I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/digdroid/alman/dig/p;->d:J

    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method b(J)Ljava/lang/String;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method abstract c(ILjava/lang/String;JJLjava/lang/String;)Ljava/lang/String;
.end method

.method d(I)Ljava/lang/String;
    .locals 1

    const/16 v0, 0x8

    if-ne p1, v0, :cond_0

    const-string p1, "gif"

    return-object p1

    :cond_0
    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    const-string p1, "png"

    return-object p1

    :cond_1
    const-string p1, "jpg"

    return-object p1
.end method

.method e()Z
    .locals 5

    monitor-enter p0

    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/digdroid/alman/dig/p;->d:J

    sub-long/2addr v0, v2

    iget v2, p0, Lcom/digdroid/alman/dig/p;->c:I

    int-to-long v2, v2

    cmp-long v4, v0, v2

    if-gez v4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
