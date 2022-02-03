.class Lcom/digdroid/alman/dig/x3$c;
.super Landroid/os/AsyncTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/digdroid/alman/dig/x3;
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
.field a:Ljava/io/OutputStream;

.field b:Ljava/io/BufferedOutputStream;

.field c:Lcom/digdroid/alman/dig/a;

.field d:Lcom/digdroid/alman/dig/y3;

.field e:J

.field final synthetic f:Lcom/digdroid/alman/dig/x3;


# direct methods
.method private constructor <init>(Lcom/digdroid/alman/dig/x3;)V
    .locals 2

    iput-object p1, p0, Lcom/digdroid/alman/dig/x3$c;->f:Lcom/digdroid/alman/dig/x3;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/digdroid/alman/dig/x3$c;->a:Ljava/io/OutputStream;

    iput-object p1, p0, Lcom/digdroid/alman/dig/x3$c;->b:Ljava/io/BufferedOutputStream;

    iput-object p1, p0, Lcom/digdroid/alman/dig/x3$c;->c:Lcom/digdroid/alman/dig/a;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/digdroid/alman/dig/x3$c;->e:J

    return-void
.end method

.method synthetic constructor <init>(Lcom/digdroid/alman/dig/x3;Lcom/digdroid/alman/dig/x3$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/digdroid/alman/dig/x3$c;-><init>(Lcom/digdroid/alman/dig/x3;)V

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Ljava/lang/Boolean;
    .locals 17

    move-object/from16 v1, p0

    iget-object v0, v1, Lcom/digdroid/alman/dig/x3$c;->f:Lcom/digdroid/alman/dig/x3;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->j0()Landroid/content/Context;

    move-result-object v2

    iget-object v0, v1, Lcom/digdroid/alman/dig/x3$c;->f:Lcom/digdroid/alman/dig/x3;

    iget-boolean v0, v0, Lcom/digdroid/alman/dig/x3;->f0:Z

    if-eqz v0, :cond_0

    invoke-static {v2}, Lcom/digdroid/alman/dig/y3;->y(Landroid/content/Context;)Lcom/digdroid/alman/dig/y3;

    move-result-object v0

    iput-object v0, v1, Lcom/digdroid/alman/dig/x3$c;->d:Lcom/digdroid/alman/dig/y3;

    :cond_0
    iget-object v0, v1, Lcom/digdroid/alman/dig/x3$c;->f:Lcom/digdroid/alman/dig/x3;

    iget-object v0, v0, Lcom/digdroid/alman/dig/x3;->c0:Ljava/lang/String;

    invoke-static {v2, v0}, Lcom/digdroid/alman/dig/i2;->d(Landroid/content/Context;Ljava/lang/String;)Lcom/digdroid/alman/dig/i2;

    move-result-object v3

    const-wide/16 v4, 0x0

    const-string v6, "/"

    const/4 v8, 0x0

    if-eqz v3, :cond_5

    invoke-virtual {v3}, Lcom/digdroid/alman/dig/i2;->exists()Z

    move-result v0

    if-eqz v0, :cond_5

    new-instance v0, Lcom/digdroid/alman/dig/a;

    iget-object v9, v1, Lcom/digdroid/alman/dig/x3$c;->f:Lcom/digdroid/alman/dig/x3;

    iget-object v10, v9, Lcom/digdroid/alman/dig/x3;->b0:Ljava/lang/String;

    iget-object v9, v9, Lcom/digdroid/alman/dig/x3;->d0:Ljava/lang/String;

    invoke-direct {v0, v2, v10, v9}, Lcom/digdroid/alman/dig/a;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, v1, Lcom/digdroid/alman/dig/x3$c;->c:Lcom/digdroid/alman/dig/a;

    :cond_1
    iget-object v0, v1, Lcom/digdroid/alman/dig/x3$c;->c:Lcom/digdroid/alman/dig/a;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/a;->d()Lcom/digdroid/alman/dig/g4$a;

    move-result-object v0

    if-eqz v0, :cond_3

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v10, v0, Lcom/digdroid/alman/dig/g4$a;->a:Ljava/lang/String;

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v2, v9}, Lcom/digdroid/alman/dig/i2;->d(Landroid/content/Context;Ljava/lang/String;)Lcom/digdroid/alman/dig/i2;

    move-result-object v9

    if-eqz v9, :cond_2

    invoke-virtual {v9}, Ljava/io/File;->exists()Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-virtual {v9}, Ljava/io/File;->length()J

    move-result-wide v9

    iget-wide v11, v0, Lcom/digdroid/alman/dig/g4$a;->b:J

    cmp-long v0, v9, v11

    if-eqz v0, :cond_1

    :cond_2
    const/4 v0, 0x0

    goto :goto_0

    :cond_3
    const/4 v0, 0x1

    :goto_0
    if-eqz v0, :cond_5

    iget-object v0, v1, Lcom/digdroid/alman/dig/x3$c;->f:Lcom/digdroid/alman/dig/x3;

    iget-boolean v2, v0, Lcom/digdroid/alman/dig/x3;->f0:Z

    if-eqz v2, :cond_4

    iget-object v2, v1, Lcom/digdroid/alman/dig/x3$c;->d:Lcom/digdroid/alman/dig/y3;

    iget-object v0, v0, Lcom/digdroid/alman/dig/x3;->c0:Ljava/lang/String;

    invoke-virtual {v2, v0, v4, v5}, Lcom/digdroid/alman/dig/y3;->u(Ljava/lang/String;J)V

    :cond_4
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    :cond_5
    const/16 v0, 0x800

    new-array v9, v0, [B

    :try_start_0
    new-instance v0, Lcom/digdroid/alman/dig/a;

    iget-object v10, v1, Lcom/digdroid/alman/dig/x3$c;->f:Lcom/digdroid/alman/dig/x3;

    invoke-virtual {v10}, Landroidx/fragment/app/Fragment;->j0()Landroid/content/Context;

    move-result-object v10

    iget-object v11, v1, Lcom/digdroid/alman/dig/x3$c;->f:Lcom/digdroid/alman/dig/x3;

    iget-object v12, v11, Lcom/digdroid/alman/dig/x3;->b0:Ljava/lang/String;

    iget-object v11, v11, Lcom/digdroid/alman/dig/x3;->d0:Ljava/lang/String;

    invoke-direct {v0, v10, v12, v11}, Lcom/digdroid/alman/dig/a;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, v1, Lcom/digdroid/alman/dig/x3$c;->c:Lcom/digdroid/alman/dig/a;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/a;->f()V

    :goto_1
    iget-object v0, v1, Lcom/digdroid/alman/dig/x3$c;->c:Lcom/digdroid/alman/dig/a;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/a;->d()Lcom/digdroid/alman/dig/g4$a;

    move-result-object v10

    if-eqz v10, :cond_f

    iget-object v0, v1, Lcom/digdroid/alman/dig/x3$c;->f:Lcom/digdroid/alman/dig/x3;

    iget-boolean v0, v0, Lcom/digdroid/alman/dig/x3;->f0:Z

    if-eqz v0, :cond_6

    iget-object v0, v1, Lcom/digdroid/alman/dig/x3$c;->d:Lcom/digdroid/alman/dig/y3;

    iget-wide v11, v10, Lcom/digdroid/alman/dig/g4$a;->b:J

    invoke-virtual {v0, v11, v12}, Lcom/digdroid/alman/dig/y3;->D(J)V

    :cond_6
    iget-wide v11, v1, Lcom/digdroid/alman/dig/x3$c;->e:J

    iget-wide v13, v10, Lcom/digdroid/alman/dig/g4$a;->b:J

    add-long/2addr v11, v13

    iput-wide v11, v1, Lcom/digdroid/alman/dig/x3$c;->e:J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    new-instance v0, Landroid/os/StatFs;

    invoke-virtual {v3}, Lcom/digdroid/alman/dig/i2;->k()Lcom/digdroid/alman/dig/i2;

    move-result-object v11

    invoke-virtual {v11}, Lcom/digdroid/alman/dig/i2;->g()Ljava/lang/String;

    move-result-object v11

    invoke-direct {v0, v11}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    sget v11, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v12, 0x12

    if-lt v11, v12, :cond_7

    invoke-virtual {v0}, Landroid/os/StatFs;->getBlockSizeLong()J

    move-result-wide v11

    invoke-virtual {v0}, Landroid/os/StatFs;->getAvailableBlocksLong()J

    move-result-wide v13

    goto :goto_2

    :cond_7
    invoke-virtual {v0}, Landroid/os/StatFs;->getBlockSize()I

    move-result v11

    int-to-long v11, v11

    invoke-virtual {v0}, Landroid/os/StatFs;->getAvailableBlocks()I

    move-result v0

    int-to-long v13, v0

    :goto_2
    iget-wide v4, v10, Lcom/digdroid/alman/dig/g4$a;->b:J

    const-wide/32 v15, 0x989680

    add-long/2addr v4, v15

    mul-long v11, v11, v13

    cmp-long v0, v4, v11

    if-lez v0, :cond_8

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_8
    invoke-virtual {v3}, Lcom/digdroid/alman/dig/i2;->exists()Z

    move-result v0

    if-nez v0, :cond_9

    invoke-virtual {v3}, Lcom/digdroid/alman/dig/i2;->mkdirs()Z

    :cond_9
    iget-object v0, v1, Lcom/digdroid/alman/dig/x3$c;->f:Lcom/digdroid/alman/dig/x3;

    iget-object v4, v10, Lcom/digdroid/alman/dig/g4$a;->a:Ljava/lang/String;

    iput-object v4, v0, Lcom/digdroid/alman/dig/x3;->e0:Ljava/lang/String;

    iget-boolean v4, v0, Lcom/digdroid/alman/dig/x3;->f0:Z

    if-nez v4, :cond_a

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->j0()Landroid/content/Context;

    move-result-object v0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, v1, Lcom/digdroid/alman/dig/x3$c;->f:Lcom/digdroid/alman/dig/x3;

    iget-object v5, v5, Lcom/digdroid/alman/dig/x3;->c0:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v1, Lcom/digdroid/alman/dig/x3$c;->f:Lcom/digdroid/alman/dig/x3;

    iget-object v5, v5, Lcom/digdroid/alman/dig/x3;->e0:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Lcom/digdroid/alman/dig/a4;->C(Landroid/content/Context;Ljava/lang/String;)V

    :cond_a
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, v1, Lcom/digdroid/alman/dig/x3$c;->f:Lcom/digdroid/alman/dig/x3;

    iget-object v4, v4, Lcom/digdroid/alman/dig/x3;->c0:Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v1, Lcom/digdroid/alman/dig/x3$c;->f:Lcom/digdroid/alman/dig/x3;

    iget-object v4, v4, Lcom/digdroid/alman/dig/x3;->e0:Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/digdroid/alman/dig/i2;->d(Landroid/content/Context;Ljava/lang/String;)Lcom/digdroid/alman/dig/i2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/i2;->j()Ljava/io/OutputStream;

    move-result-object v0

    iput-object v0, v1, Lcom/digdroid/alman/dig/x3$c;->a:Ljava/io/OutputStream;

    new-instance v0, Ljava/io/BufferedOutputStream;

    iget-object v4, v1, Lcom/digdroid/alman/dig/x3$c;->a:Ljava/io/OutputStream;

    invoke-direct {v0, v4}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    iput-object v0, v1, Lcom/digdroid/alman/dig/x3$c;->b:Ljava/io/BufferedOutputStream;

    iget-wide v4, v10, Lcom/digdroid/alman/dig/g4$a;->b:J

    const-wide/32 v10, 0x1e8481

    const-wide/16 v12, 0x0

    :goto_3
    iget-object v0, v1, Lcom/digdroid/alman/dig/x3$c;->c:Lcom/digdroid/alman/dig/a;

    invoke-virtual {v0, v9}, Lcom/digdroid/alman/dig/a;->g([B)I

    move-result v0

    if-lez v0, :cond_d

    invoke-virtual/range {p0 .. p0}, Landroid/os/AsyncTask;->isCancelled()Z

    move-result v14

    if-eqz v14, :cond_b

    goto :goto_4

    :cond_b
    iget-object v14, v1, Lcom/digdroid/alman/dig/x3$c;->b:Ljava/io/BufferedOutputStream;

    invoke-virtual {v14, v9, v8, v0}, Ljava/io/BufferedOutputStream;->write([BII)V

    int-to-long v7, v0

    add-long/2addr v12, v7

    add-long/2addr v10, v7

    const-wide/32 v7, 0x1e8480

    cmp-long v0, v10, v7

    if-lez v0, :cond_c

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Long;

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    const/4 v8, 0x0

    aput-object v7, v0, v8

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    const/4 v8, 0x1

    aput-object v7, v0, v8

    invoke-virtual {v1, v0}, Landroid/os/AsyncTask;->publishProgress([Ljava/lang/Object;)V

    const/4 v8, 0x0

    const-wide/16 v10, 0x0

    goto :goto_3

    :cond_c
    const/4 v8, 0x0

    goto :goto_3

    :cond_d
    :goto_4
    iget-object v0, v1, Lcom/digdroid/alman/dig/x3$c;->b:Ljava/io/BufferedOutputStream;

    invoke-virtual {v0}, Ljava/io/BufferedOutputStream;->flush()V

    iget-object v0, v1, Lcom/digdroid/alman/dig/x3$c;->b:Ljava/io/BufferedOutputStream;

    invoke-virtual {v0}, Ljava/io/BufferedOutputStream;->close()V

    iget-object v0, v1, Lcom/digdroid/alman/dig/x3$c;->a:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    invoke-virtual/range {p0 .. p0}, Landroid/os/AsyncTask;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_e

    goto :goto_5

    :cond_e
    const-wide/16 v4, 0x0

    const/4 v8, 0x0

    goto/16 :goto_1

    :cond_f
    :goto_5
    iget-object v0, v1, Lcom/digdroid/alman/dig/x3$c;->c:Lcom/digdroid/alman/dig/a;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/a;->a()V

    iget-object v0, v1, Lcom/digdroid/alman/dig/x3$c;->f:Lcom/digdroid/alman/dig/x3;

    iget-boolean v0, v0, Lcom/digdroid/alman/dig/x3;->f0:Z

    if-eqz v0, :cond_11

    invoke-virtual/range {p0 .. p0}, Landroid/os/AsyncTask;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_10

    iget-object v0, v1, Lcom/digdroid/alman/dig/x3$c;->d:Lcom/digdroid/alman/dig/y3;

    const/4 v2, 0x0

    invoke-virtual {v0, v3, v2}, Lcom/digdroid/alman/dig/y3;->v(Ljava/io/File;Z)V

    goto :goto_6

    :cond_10
    iget-object v0, v1, Lcom/digdroid/alman/dig/x3$c;->d:Lcom/digdroid/alman/dig/y3;

    iget-object v2, v1, Lcom/digdroid/alman/dig/x3$c;->f:Lcom/digdroid/alman/dig/x3;

    iget-object v2, v2, Lcom/digdroid/alman/dig/x3;->c0:Ljava/lang/String;

    iget-wide v3, v1, Lcom/digdroid/alman/dig/x3$c;->e:J

    invoke-virtual {v0, v2, v3, v4}, Lcom/digdroid/alman/dig/y3;->u(Ljava/lang/String;J)V

    :cond_11
    :goto_6
    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    return-object v0

    :catch_1
    nop

    iget-object v0, v1, Lcom/digdroid/alman/dig/x3$c;->b:Ljava/io/BufferedOutputStream;

    if-eqz v0, :cond_12

    :try_start_3
    invoke-virtual {v0}, Ljava/io/BufferedOutputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_7

    :catch_2
    nop

    :cond_12
    :goto_7
    iget-object v0, v1, Lcom/digdroid/alman/dig/x3$c;->a:Ljava/io/OutputStream;

    if-eqz v0, :cond_13

    :try_start_4
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    goto :goto_8

    :catch_3
    nop

    :cond_13
    :goto_8
    iget-object v0, v1, Lcom/digdroid/alman/dig/x3$c;->c:Lcom/digdroid/alman/dig/a;

    if-eqz v0, :cond_14

    :try_start_5
    invoke-virtual {v0}, Lcom/digdroid/alman/dig/a;->a()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4

    :catch_4
    :cond_14
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object v0
.end method

.method protected b(Ljava/lang/Boolean;)V
    .locals 0

    iget-object p1, p0, Lcom/digdroid/alman/dig/x3$c;->f:Lcom/digdroid/alman/dig/x3;

    invoke-static {p1}, Lcom/digdroid/alman/dig/x3;->p2(Lcom/digdroid/alman/dig/x3;)Lcom/digdroid/alman/dig/x3$b;

    move-result-object p1

    if-eqz p1, :cond_0

    :try_start_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/x3$c;->f:Lcom/digdroid/alman/dig/x3;

    invoke-static {p1}, Lcom/digdroid/alman/dig/x3;->p2(Lcom/digdroid/alman/dig/x3;)Lcom/digdroid/alman/dig/x3$b;

    move-result-object p1

    invoke-interface {p1}, Lcom/digdroid/alman/dig/x3$b;->j0()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method protected c(Ljava/lang/Boolean;)V
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/x3$c;->f:Lcom/digdroid/alman/dig/x3;

    invoke-static {v0}, Lcom/digdroid/alman/dig/x3;->p2(Lcom/digdroid/alman/dig/x3;)Lcom/digdroid/alman/dig/x3$b;

    move-result-object v0

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/x3$c;->f:Lcom/digdroid/alman/dig/x3;

    invoke-static {v0}, Lcom/digdroid/alman/dig/x3;->p2(Lcom/digdroid/alman/dig/x3;)Lcom/digdroid/alman/dig/x3$b;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-interface {v0, p1}, Lcom/digdroid/alman/dig/x3$b;->O(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method protected varargs d([Ljava/lang/Long;)V
    .locals 6

    iget-object v0, p0, Lcom/digdroid/alman/dig/x3$c;->f:Lcom/digdroid/alman/dig/x3;

    invoke-static {v0}, Lcom/digdroid/alman/dig/x3;->p2(Lcom/digdroid/alman/dig/x3;)Lcom/digdroid/alman/dig/x3$b;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :try_start_0
    aget-object v0, p1, v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const/4 v2, 0x0

    aget-object p1, p1, v2

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    iget-object p1, p0, Lcom/digdroid/alman/dig/x3$c;->f:Lcom/digdroid/alman/dig/x3;

    invoke-static {p1}, Lcom/digdroid/alman/dig/x3;->p2(Lcom/digdroid/alman/dig/x3;)Lcom/digdroid/alman/dig/x3$b;

    move-result-object p1

    iget-object v4, p0, Lcom/digdroid/alman/dig/x3$c;->c:Lcom/digdroid/alman/dig/a;

    invoke-virtual {v4}, Lcom/digdroid/alman/dig/a;->h()I

    move-result v4

    iget-object v5, p0, Lcom/digdroid/alman/dig/x3$c;->f:Lcom/digdroid/alman/dig/x3;

    iget-object v5, v5, Lcom/digdroid/alman/dig/x3;->e0:Ljava/lang/String;

    long-to-int v1, v0

    div-int/lit16 v1, v1, 0x400

    long-to-int v0, v2

    div-int/lit16 v0, v0, 0x400

    invoke-interface {p1, v4, v5, v1, v0}, Lcom/digdroid/alman/dig/x3$b;->Q(ILjava/lang/String;II)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/x3$c;->a([Ljava/lang/Void;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic onCancelled(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/x3$c;->b(Ljava/lang/Boolean;)V

    return-void
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/x3$c;->c(Ljava/lang/Boolean;)V

    return-void
.end method

.method protected onPreExecute()V
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/x3$c;->f:Lcom/digdroid/alman/dig/x3;

    invoke-static {v0}, Lcom/digdroid/alman/dig/x3;->p2(Lcom/digdroid/alman/dig/x3;)Lcom/digdroid/alman/dig/x3$b;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/x3$c;->f:Lcom/digdroid/alman/dig/x3;

    invoke-static {v0}, Lcom/digdroid/alman/dig/x3;->p2(Lcom/digdroid/alman/dig/x3;)Lcom/digdroid/alman/dig/x3$b;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/x3$c;->f:Lcom/digdroid/alman/dig/x3;

    iget-object v1, v1, Lcom/digdroid/alman/dig/x3;->e0:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/digdroid/alman/dig/x3$b;->b(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method protected bridge synthetic onProgressUpdate([Ljava/lang/Object;)V
    .locals 0

    check-cast p1, [Ljava/lang/Long;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/x3$c;->d([Ljava/lang/Long;)V

    return-void
.end method
