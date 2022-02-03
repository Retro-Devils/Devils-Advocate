.class Lcom/digdroid/alman/dig/w3$c;
.super Landroid/os/AsyncTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/digdroid/alman/dig/w3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Long;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field a:Ljava/io/FileOutputStream;

.field b:Ljava/io/BufferedOutputStream;

.field c:Lcom/digdroid/alman/dig/a;

.field final synthetic d:Lcom/digdroid/alman/dig/w3;


# direct methods
.method private constructor <init>(Lcom/digdroid/alman/dig/w3;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/w3$c;->d:Lcom/digdroid/alman/dig/w3;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/digdroid/alman/dig/w3$c;->a:Ljava/io/FileOutputStream;

    iput-object p1, p0, Lcom/digdroid/alman/dig/w3$c;->b:Ljava/io/BufferedOutputStream;

    iput-object p1, p0, Lcom/digdroid/alman/dig/w3$c;->c:Lcom/digdroid/alman/dig/a;

    return-void
.end method

.method synthetic constructor <init>(Lcom/digdroid/alman/dig/w3;Lcom/digdroid/alman/dig/w3$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/digdroid/alman/dig/w3$c;-><init>(Lcom/digdroid/alman/dig/w3;)V

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Ljava/lang/Boolean;
    .locals 15

    move-object v0, p0

    const-string v1, "/"

    const/16 v2, 0x800

    new-array v2, v2, [B

    :try_start_0
    new-instance v3, Lcom/digdroid/alman/dig/a;

    iget-object v4, v0, Lcom/digdroid/alman/dig/w3$c;->d:Lcom/digdroid/alman/dig/w3;

    iget-object v5, v4, Lcom/digdroid/alman/dig/w3;->b0:Ljava/lang/String;

    iget-object v4, v4, Lcom/digdroid/alman/dig/w3;->d0:Ljava/lang/String;

    invoke-direct {v3, v5, v4}, Lcom/digdroid/alman/dig/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v3, v0, Lcom/digdroid/alman/dig/w3$c;->c:Lcom/digdroid/alman/dig/a;

    invoke-virtual {v3}, Lcom/digdroid/alman/dig/a;->f()V

    :cond_0
    iget-object v3, v0, Lcom/digdroid/alman/dig/w3$c;->c:Lcom/digdroid/alman/dig/a;

    invoke-virtual {v3}, Lcom/digdroid/alman/dig/a;->d()Lcom/digdroid/alman/dig/e4$a;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    const/4 v4, 0x1

    if-eqz v3, :cond_6

    :try_start_1
    new-instance v5, Landroid/os/StatFs;

    iget-object v6, v0, Lcom/digdroid/alman/dig/w3$c;->d:Lcom/digdroid/alman/dig/w3;

    iget-object v6, v6, Lcom/digdroid/alman/dig/w3;->c0:Ljava/lang/String;

    invoke-direct {v5, v6}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x12

    if-lt v6, v7, :cond_1

    invoke-virtual {v5}, Landroid/os/StatFs;->getBlockSizeLong()J

    move-result-wide v6

    invoke-virtual {v5}, Landroid/os/StatFs;->getAvailableBlocksLong()J

    move-result-wide v8

    goto :goto_0

    :cond_1
    invoke-virtual {v5}, Landroid/os/StatFs;->getBlockSize()I

    move-result v6

    int-to-long v6, v6

    invoke-virtual {v5}, Landroid/os/StatFs;->getAvailableBlocks()I

    move-result v5

    int-to-long v8, v5

    :goto_0
    iget-wide v10, v3, Lcom/digdroid/alman/dig/e4$a;->b:J

    const-wide/32 v12, 0x989680

    add-long/2addr v10, v12

    mul-long v6, v6, v8

    cmp-long v5, v10, v6

    if-lez v5, :cond_2

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object v1

    :catch_0
    :cond_2
    :try_start_2
    iget-object v5, v0, Lcom/digdroid/alman/dig/w3$c;->d:Lcom/digdroid/alman/dig/w3;

    iget-object v6, v3, Lcom/digdroid/alman/dig/e4$a;->a:Ljava/lang/String;

    iput-object v6, v5, Lcom/digdroid/alman/dig/w3;->e0:Ljava/lang/String;

    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->j0()Landroid/content/Context;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v7, v0, Lcom/digdroid/alman/dig/w3$c;->d:Lcom/digdroid/alman/dig/w3;

    iget-object v7, v7, Lcom/digdroid/alman/dig/w3;->c0:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v7, v0, Lcom/digdroid/alman/dig/w3$c;->d:Lcom/digdroid/alman/dig/w3;

    iget-object v7, v7, Lcom/digdroid/alman/dig/w3;->e0:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/digdroid/alman/dig/y3;->z(Landroid/content/Context;Ljava/lang/String;)V

    new-instance v5, Ljava/io/FileOutputStream;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v7, v0, Lcom/digdroid/alman/dig/w3$c;->d:Lcom/digdroid/alman/dig/w3;

    iget-object v7, v7, Lcom/digdroid/alman/dig/w3;->c0:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v7, v0, Lcom/digdroid/alman/dig/w3$c;->d:Lcom/digdroid/alman/dig/w3;

    iget-object v7, v7, Lcom/digdroid/alman/dig/w3;->e0:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V

    iput-object v5, v0, Lcom/digdroid/alman/dig/w3$c;->a:Ljava/io/FileOutputStream;

    new-instance v5, Ljava/io/BufferedOutputStream;

    iget-object v6, v0, Lcom/digdroid/alman/dig/w3$c;->a:Ljava/io/FileOutputStream;

    invoke-direct {v5, v6}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    iput-object v5, v0, Lcom/digdroid/alman/dig/w3$c;->b:Ljava/io/BufferedOutputStream;

    iget-wide v5, v3, Lcom/digdroid/alman/dig/e4$a;->b:J

    const-wide/32 v7, 0x1e8481

    const-wide/16 v11, 0x0

    :cond_3
    :goto_1
    iget-object v3, v0, Lcom/digdroid/alman/dig/w3$c;->c:Lcom/digdroid/alman/dig/a;

    invoke-virtual {v3, v2}, Lcom/digdroid/alman/dig/a;->g([B)I

    move-result v3

    if-lez v3, :cond_5

    invoke-virtual {p0}, Landroid/os/AsyncTask;->isCancelled()Z

    move-result v13

    if-eqz v13, :cond_4

    goto :goto_2

    :cond_4
    iget-object v13, v0, Lcom/digdroid/alman/dig/w3$c;->b:Ljava/io/BufferedOutputStream;

    const/4 v14, 0x0

    invoke-virtual {v13, v2, v14, v3}, Ljava/io/BufferedOutputStream;->write([BII)V

    int-to-long v9, v3

    add-long/2addr v11, v9

    add-long/2addr v7, v9

    const-wide/32 v9, 0x1e8480

    cmp-long v3, v7, v9

    if-lez v3, :cond_3

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Long;

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    aput-object v7, v3, v14

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    aput-object v7, v3, v4

    invoke-virtual {p0, v3}, Landroid/os/AsyncTask;->publishProgress([Ljava/lang/Object;)V

    const-wide/16 v7, 0x0

    goto :goto_1

    :cond_5
    :goto_2
    iget-object v3, v0, Lcom/digdroid/alman/dig/w3$c;->b:Ljava/io/BufferedOutputStream;

    invoke-virtual {v3}, Ljava/io/BufferedOutputStream;->flush()V

    iget-object v3, v0, Lcom/digdroid/alman/dig/w3$c;->b:Ljava/io/BufferedOutputStream;

    invoke-virtual {v3}, Ljava/io/BufferedOutputStream;->close()V

    iget-object v3, v0, Lcom/digdroid/alman/dig/w3$c;->a:Ljava/io/FileOutputStream;

    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V

    invoke-virtual {p0}, Landroid/os/AsyncTask;->isCancelled()Z

    move-result v3

    if-eqz v3, :cond_0

    :cond_6
    iget-object v1, v0, Lcom/digdroid/alman/dig/w3$c;->c:Lcom/digdroid/alman/dig/a;

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/a;->a()V

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    return-object v1

    :catch_1
    nop

    iget-object v1, v0, Lcom/digdroid/alman/dig/w3$c;->b:Ljava/io/BufferedOutputStream;

    if-eqz v1, :cond_7

    :try_start_3
    invoke-virtual {v1}, Ljava/io/BufferedOutputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_3

    :catch_2
    nop

    :cond_7
    :goto_3
    iget-object v1, v0, Lcom/digdroid/alman/dig/w3$c;->a:Ljava/io/FileOutputStream;

    if-eqz v1, :cond_8

    :try_start_4
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    goto :goto_4

    :catch_3
    nop

    :cond_8
    :goto_4
    iget-object v1, v0, Lcom/digdroid/alman/dig/w3$c;->c:Lcom/digdroid/alman/dig/a;

    if-eqz v1, :cond_9

    :try_start_5
    invoke-virtual {v1}, Lcom/digdroid/alman/dig/a;->a()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4

    :catch_4
    :cond_9
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object v1
.end method

.method protected b(Ljava/lang/Boolean;)V
    .locals 0

    iget-object p1, p0, Lcom/digdroid/alman/dig/w3$c;->d:Lcom/digdroid/alman/dig/w3;

    invoke-static {p1}, Lcom/digdroid/alman/dig/w3;->p2(Lcom/digdroid/alman/dig/w3;)Lcom/digdroid/alman/dig/w3$b;

    move-result-object p1

    if-eqz p1, :cond_0

    :try_start_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/w3$c;->d:Lcom/digdroid/alman/dig/w3;

    invoke-static {p1}, Lcom/digdroid/alman/dig/w3;->p2(Lcom/digdroid/alman/dig/w3;)Lcom/digdroid/alman/dig/w3$b;

    move-result-object p1

    invoke-interface {p1}, Lcom/digdroid/alman/dig/w3$b;->j0()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method protected c(Ljava/lang/Boolean;)V
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/w3$c;->d:Lcom/digdroid/alman/dig/w3;

    invoke-static {v0}, Lcom/digdroid/alman/dig/w3;->p2(Lcom/digdroid/alman/dig/w3;)Lcom/digdroid/alman/dig/w3$b;

    move-result-object v0

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/w3$c;->d:Lcom/digdroid/alman/dig/w3;

    invoke-static {v0}, Lcom/digdroid/alman/dig/w3;->p2(Lcom/digdroid/alman/dig/w3;)Lcom/digdroid/alman/dig/w3$b;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-interface {v0, p1}, Lcom/digdroid/alman/dig/w3$b;->P(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method protected varargs d([Ljava/lang/Long;)V
    .locals 7

    iget-object v0, p0, Lcom/digdroid/alman/dig/w3$c;->d:Lcom/digdroid/alman/dig/w3;

    invoke-static {v0}, Lcom/digdroid/alman/dig/w3;->p2(Lcom/digdroid/alman/dig/w3;)Lcom/digdroid/alman/dig/w3$b;

    move-result-object v0

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/w3$c;->d:Lcom/digdroid/alman/dig/w3;

    invoke-static {v0}, Lcom/digdroid/alman/dig/w3;->p2(Lcom/digdroid/alman/dig/w3;)Lcom/digdroid/alman/dig/w3$b;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/w3$c;->c:Lcom/digdroid/alman/dig/a;

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/a;->h()I

    move-result v1

    iget-object v2, p0, Lcom/digdroid/alman/dig/w3$c;->d:Lcom/digdroid/alman/dig/w3;

    iget-object v2, v2, Lcom/digdroid/alman/dig/w3;->e0:Ljava/lang/String;

    const-wide/high16 v3, 0x4059000000000000L    # 100.0

    const/4 v5, 0x1

    aget-object v5, p1, v5

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    long-to-double v5, v5

    invoke-static {v5, v6}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v5, v5, v3

    const/4 v3, 0x0

    :try_start_1
    aget-object p1, p1, v3

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    long-to-double v3, v3

    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v5, v3

    double-to-int p1, v5

    :try_start_2
    invoke-interface {v0, v1, v2, p1}, Lcom/digdroid/alman/dig/w3$b;->b(ILjava/lang/String;I)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/w3$c;->a([Ljava/lang/Void;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic onCancelled(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/w3$c;->b(Ljava/lang/Boolean;)V

    return-void
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/w3$c;->c(Ljava/lang/Boolean;)V

    return-void
.end method

.method protected onPreExecute()V
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/w3$c;->d:Lcom/digdroid/alman/dig/w3;

    invoke-static {v0}, Lcom/digdroid/alman/dig/w3;->p2(Lcom/digdroid/alman/dig/w3;)Lcom/digdroid/alman/dig/w3$b;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/w3$c;->d:Lcom/digdroid/alman/dig/w3;

    invoke-static {v0}, Lcom/digdroid/alman/dig/w3;->p2(Lcom/digdroid/alman/dig/w3;)Lcom/digdroid/alman/dig/w3$b;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/w3$c;->d:Lcom/digdroid/alman/dig/w3;

    iget-object v1, v1, Lcom/digdroid/alman/dig/w3;->e0:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/digdroid/alman/dig/w3$b;->c(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method protected bridge synthetic onProgressUpdate([Ljava/lang/Object;)V
    .locals 0

    check-cast p1, [Ljava/lang/Long;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/w3$c;->d([Ljava/lang/Long;)V

    return-void
.end method
