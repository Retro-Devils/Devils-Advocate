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

.field d:Lcom/digdroid/alman/dig/x3;

.field e:J

.field final synthetic f:Lcom/digdroid/alman/dig/w3;


# direct methods
.method private constructor <init>(Lcom/digdroid/alman/dig/w3;)V
    .locals 2

    iput-object p1, p0, Lcom/digdroid/alman/dig/w3$c;->f:Lcom/digdroid/alman/dig/w3;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/digdroid/alman/dig/w3$c;->a:Ljava/io/FileOutputStream;

    iput-object p1, p0, Lcom/digdroid/alman/dig/w3$c;->b:Ljava/io/BufferedOutputStream;

    iput-object p1, p0, Lcom/digdroid/alman/dig/w3$c;->c:Lcom/digdroid/alman/dig/a;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/digdroid/alman/dig/w3$c;->e:J

    return-void
.end method

.method synthetic constructor <init>(Lcom/digdroid/alman/dig/w3;Lcom/digdroid/alman/dig/w3$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/digdroid/alman/dig/w3$c;-><init>(Lcom/digdroid/alman/dig/w3;)V

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Ljava/lang/Boolean;
    .locals 17

    move-object/from16 v1, p0

    iget-object v0, v1, Lcom/digdroid/alman/dig/w3$c;->f:Lcom/digdroid/alman/dig/w3;

    iget-boolean v2, v0, Lcom/digdroid/alman/dig/w3;->f0:Z

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->j0()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/digdroid/alman/dig/x3;->y(Landroid/content/Context;)Lcom/digdroid/alman/dig/x3;

    move-result-object v0

    iput-object v0, v1, Lcom/digdroid/alman/dig/w3$c;->d:Lcom/digdroid/alman/dig/x3;

    :cond_0
    new-instance v2, Ljava/io/File;

    iget-object v0, v1, Lcom/digdroid/alman/dig/w3$c;->f:Lcom/digdroid/alman/dig/w3;

    iget-object v0, v0, Lcom/digdroid/alman/dig/w3;->c0:Ljava/lang/String;

    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    const-wide/16 v3, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v0, :cond_5

    new-instance v0, Lcom/digdroid/alman/dig/a;

    iget-object v7, v1, Lcom/digdroid/alman/dig/w3$c;->f:Lcom/digdroid/alman/dig/w3;

    iget-object v8, v7, Lcom/digdroid/alman/dig/w3;->b0:Ljava/lang/String;

    iget-object v7, v7, Lcom/digdroid/alman/dig/w3;->d0:Ljava/lang/String;

    invoke-direct {v0, v8, v7}, Lcom/digdroid/alman/dig/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, v1, Lcom/digdroid/alman/dig/w3$c;->c:Lcom/digdroid/alman/dig/a;

    :cond_1
    iget-object v0, v1, Lcom/digdroid/alman/dig/w3$c;->c:Lcom/digdroid/alman/dig/a;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/a;->d()Lcom/digdroid/alman/dig/f4$a;

    move-result-object v0

    if-eqz v0, :cond_3

    new-instance v7, Ljava/io/File;

    iget-object v8, v0, Lcom/digdroid/alman/dig/f4$a;->a:Ljava/lang/String;

    invoke-direct {v7, v2, v8}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-virtual {v7}, Ljava/io/File;->length()J

    move-result-wide v7

    iget-wide v9, v0, Lcom/digdroid/alman/dig/f4$a;->b:J

    cmp-long v0, v7, v9

    if-eqz v0, :cond_1

    :cond_2
    const/4 v0, 0x0

    goto :goto_0

    :cond_3
    const/4 v0, 0x1

    :goto_0
    if-eqz v0, :cond_5

    iget-object v0, v1, Lcom/digdroid/alman/dig/w3$c;->f:Lcom/digdroid/alman/dig/w3;

    iget-boolean v2, v0, Lcom/digdroid/alman/dig/w3;->f0:Z

    if-eqz v2, :cond_4

    iget-object v2, v1, Lcom/digdroid/alman/dig/w3$c;->d:Lcom/digdroid/alman/dig/x3;

    iget-object v0, v0, Lcom/digdroid/alman/dig/w3;->c0:Ljava/lang/String;

    invoke-virtual {v2, v0, v3, v4}, Lcom/digdroid/alman/dig/x3;->u(Ljava/lang/String;J)V

    :cond_4
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    :cond_5
    const/16 v0, 0x800

    new-array v7, v0, [B

    :try_start_0
    new-instance v0, Lcom/digdroid/alman/dig/a;

    iget-object v8, v1, Lcom/digdroid/alman/dig/w3$c;->f:Lcom/digdroid/alman/dig/w3;

    iget-object v9, v8, Lcom/digdroid/alman/dig/w3;->b0:Ljava/lang/String;

    iget-object v8, v8, Lcom/digdroid/alman/dig/w3;->d0:Ljava/lang/String;

    invoke-direct {v0, v9, v8}, Lcom/digdroid/alman/dig/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, v1, Lcom/digdroid/alman/dig/w3$c;->c:Lcom/digdroid/alman/dig/a;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/a;->f()V

    :cond_6
    iget-object v0, v1, Lcom/digdroid/alman/dig/w3$c;->c:Lcom/digdroid/alman/dig/a;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/a;->d()Lcom/digdroid/alman/dig/f4$a;

    move-result-object v8

    if-eqz v8, :cond_f

    iget-object v0, v1, Lcom/digdroid/alman/dig/w3$c;->f:Lcom/digdroid/alman/dig/w3;

    iget-boolean v0, v0, Lcom/digdroid/alman/dig/w3;->f0:Z

    if-eqz v0, :cond_7

    iget-object v0, v1, Lcom/digdroid/alman/dig/w3$c;->d:Lcom/digdroid/alman/dig/x3;

    iget-wide v9, v8, Lcom/digdroid/alman/dig/f4$a;->b:J

    invoke-virtual {v0, v9, v10}, Lcom/digdroid/alman/dig/x3;->D(J)V

    :cond_7
    iget-wide v9, v1, Lcom/digdroid/alman/dig/w3$c;->e:J

    iget-wide v11, v8, Lcom/digdroid/alman/dig/f4$a;->b:J

    add-long/2addr v9, v11

    iput-wide v9, v1, Lcom/digdroid/alman/dig/w3$c;->e:J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    new-instance v0, Landroid/os/StatFs;

    invoke-virtual {v2}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v0, v9}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v10, 0x12

    if-lt v9, v10, :cond_8

    invoke-virtual {v0}, Landroid/os/StatFs;->getBlockSizeLong()J

    move-result-wide v9

    invoke-virtual {v0}, Landroid/os/StatFs;->getAvailableBlocksLong()J

    move-result-wide v11

    goto :goto_1

    :cond_8
    invoke-virtual {v0}, Landroid/os/StatFs;->getBlockSize()I

    move-result v9

    int-to-long v9, v9

    invoke-virtual {v0}, Landroid/os/StatFs;->getAvailableBlocks()I

    move-result v0

    int-to-long v11, v0

    :goto_1
    iget-wide v13, v8, Lcom/digdroid/alman/dig/f4$a;->b:J

    const-wide/32 v15, 0x989680

    add-long/2addr v13, v15

    mul-long v9, v9, v11

    cmp-long v0, v13, v9

    if-lez v0, :cond_9

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_9
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_a

    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    :cond_a
    iget-object v0, v1, Lcom/digdroid/alman/dig/w3$c;->f:Lcom/digdroid/alman/dig/w3;

    iget-object v9, v8, Lcom/digdroid/alman/dig/f4$a;->a:Ljava/lang/String;

    iput-object v9, v0, Lcom/digdroid/alman/dig/w3;->e0:Ljava/lang/String;

    iget-boolean v9, v0, Lcom/digdroid/alman/dig/w3;->f0:Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    const-string v10, "/"

    if-nez v9, :cond_b

    :try_start_3
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->j0()Landroid/content/Context;

    move-result-object v0

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v11, v1, Lcom/digdroid/alman/dig/w3$c;->f:Lcom/digdroid/alman/dig/w3;

    iget-object v11, v11, Lcom/digdroid/alman/dig/w3;->c0:Ljava/lang/String;

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v11, v1, Lcom/digdroid/alman/dig/w3$c;->f:Lcom/digdroid/alman/dig/w3;

    iget-object v11, v11, Lcom/digdroid/alman/dig/w3;->e0:Ljava/lang/String;

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v0, v9}, Lcom/digdroid/alman/dig/z3;->A(Landroid/content/Context;Ljava/lang/String;)V

    :cond_b
    new-instance v0, Ljava/io/FileOutputStream;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v11, v1, Lcom/digdroid/alman/dig/w3$c;->f:Lcom/digdroid/alman/dig/w3;

    iget-object v11, v11, Lcom/digdroid/alman/dig/w3;->c0:Ljava/lang/String;

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v10, v1, Lcom/digdroid/alman/dig/w3$c;->f:Lcom/digdroid/alman/dig/w3;

    iget-object v10, v10, Lcom/digdroid/alman/dig/w3;->e0:Ljava/lang/String;

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v0, v9}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V

    iput-object v0, v1, Lcom/digdroid/alman/dig/w3$c;->a:Ljava/io/FileOutputStream;

    new-instance v0, Ljava/io/BufferedOutputStream;

    iget-object v9, v1, Lcom/digdroid/alman/dig/w3$c;->a:Ljava/io/FileOutputStream;

    invoke-direct {v0, v9}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    iput-object v0, v1, Lcom/digdroid/alman/dig/w3$c;->b:Ljava/io/BufferedOutputStream;

    iget-wide v8, v8, Lcom/digdroid/alman/dig/f4$a;->b:J

    const-wide/32 v10, 0x1e8481

    move-wide v12, v3

    :cond_c
    :goto_2
    iget-object v0, v1, Lcom/digdroid/alman/dig/w3$c;->c:Lcom/digdroid/alman/dig/a;

    invoke-virtual {v0, v7}, Lcom/digdroid/alman/dig/a;->g([B)I

    move-result v0

    if-lez v0, :cond_e

    invoke-virtual/range {p0 .. p0}, Landroid/os/AsyncTask;->isCancelled()Z

    move-result v14

    if-eqz v14, :cond_d

    goto :goto_3

    :cond_d
    iget-object v14, v1, Lcom/digdroid/alman/dig/w3$c;->b:Ljava/io/BufferedOutputStream;

    invoke-virtual {v14, v7, v6, v0}, Ljava/io/BufferedOutputStream;->write([BII)V

    int-to-long v14, v0

    add-long/2addr v12, v14

    add-long/2addr v10, v14

    const-wide/32 v14, 0x1e8480

    cmp-long v0, v10, v14

    if-lez v0, :cond_c

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Long;

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    aput-object v10, v0, v6

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    aput-object v10, v0, v5

    invoke-virtual {v1, v0}, Landroid/os/AsyncTask;->publishProgress([Ljava/lang/Object;)V

    move-wide v10, v3

    goto :goto_2

    :cond_e
    :goto_3
    iget-object v0, v1, Lcom/digdroid/alman/dig/w3$c;->b:Ljava/io/BufferedOutputStream;

    invoke-virtual {v0}, Ljava/io/BufferedOutputStream;->flush()V

    iget-object v0, v1, Lcom/digdroid/alman/dig/w3$c;->b:Ljava/io/BufferedOutputStream;

    invoke-virtual {v0}, Ljava/io/BufferedOutputStream;->close()V

    iget-object v0, v1, Lcom/digdroid/alman/dig/w3$c;->a:Ljava/io/FileOutputStream;

    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V

    invoke-virtual/range {p0 .. p0}, Landroid/os/AsyncTask;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_6

    :cond_f
    iget-object v0, v1, Lcom/digdroid/alman/dig/w3$c;->c:Lcom/digdroid/alman/dig/a;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/a;->a()V

    iget-object v0, v1, Lcom/digdroid/alman/dig/w3$c;->f:Lcom/digdroid/alman/dig/w3;

    iget-boolean v0, v0, Lcom/digdroid/alman/dig/w3;->f0:Z

    if-eqz v0, :cond_11

    invoke-virtual/range {p0 .. p0}, Landroid/os/AsyncTask;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_10

    iget-object v0, v1, Lcom/digdroid/alman/dig/w3$c;->d:Lcom/digdroid/alman/dig/x3;

    invoke-virtual {v0, v2, v6}, Lcom/digdroid/alman/dig/x3;->v(Ljava/io/File;Z)V

    goto :goto_4

    :cond_10
    iget-object v0, v1, Lcom/digdroid/alman/dig/w3$c;->d:Lcom/digdroid/alman/dig/x3;

    iget-object v2, v1, Lcom/digdroid/alman/dig/w3$c;->f:Lcom/digdroid/alman/dig/w3;

    iget-object v2, v2, Lcom/digdroid/alman/dig/w3;->c0:Ljava/lang/String;

    iget-wide v3, v1, Lcom/digdroid/alman/dig/w3$c;->e:J

    invoke-virtual {v0, v2, v3, v4}, Lcom/digdroid/alman/dig/x3;->u(Ljava/lang/String;J)V

    :cond_11
    :goto_4
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    return-object v0

    :catch_1
    nop

    iget-object v0, v1, Lcom/digdroid/alman/dig/w3$c;->b:Ljava/io/BufferedOutputStream;

    if-eqz v0, :cond_12

    :try_start_4
    invoke-virtual {v0}, Ljava/io/BufferedOutputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_5

    :catch_2
    nop

    :cond_12
    :goto_5
    iget-object v0, v1, Lcom/digdroid/alman/dig/w3$c;->a:Ljava/io/FileOutputStream;

    if-eqz v0, :cond_13

    :try_start_5
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    goto :goto_6

    :catch_3
    nop

    :cond_13
    :goto_6
    iget-object v0, v1, Lcom/digdroid/alman/dig/w3$c;->c:Lcom/digdroid/alman/dig/a;

    if-eqz v0, :cond_14

    :try_start_6
    invoke-virtual {v0}, Lcom/digdroid/alman/dig/a;->a()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_4

    :catch_4
    :cond_14
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object v0
.end method

.method protected b(Ljava/lang/Boolean;)V
    .locals 0

    iget-object p1, p0, Lcom/digdroid/alman/dig/w3$c;->f:Lcom/digdroid/alman/dig/w3;

    invoke-static {p1}, Lcom/digdroid/alman/dig/w3;->p2(Lcom/digdroid/alman/dig/w3;)Lcom/digdroid/alman/dig/w3$b;

    move-result-object p1

    if-eqz p1, :cond_0

    :try_start_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/w3$c;->f:Lcom/digdroid/alman/dig/w3;

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

    iget-object v0, p0, Lcom/digdroid/alman/dig/w3$c;->f:Lcom/digdroid/alman/dig/w3;

    invoke-static {v0}, Lcom/digdroid/alman/dig/w3;->p2(Lcom/digdroid/alman/dig/w3;)Lcom/digdroid/alman/dig/w3$b;

    move-result-object v0

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/w3$c;->f:Lcom/digdroid/alman/dig/w3;

    invoke-static {v0}, Lcom/digdroid/alman/dig/w3;->p2(Lcom/digdroid/alman/dig/w3;)Lcom/digdroid/alman/dig/w3$b;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-interface {v0, p1}, Lcom/digdroid/alman/dig/w3$b;->O(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method protected varargs d([Ljava/lang/Long;)V
    .locals 6

    iget-object v0, p0, Lcom/digdroid/alman/dig/w3$c;->f:Lcom/digdroid/alman/dig/w3;

    invoke-static {v0}, Lcom/digdroid/alman/dig/w3;->p2(Lcom/digdroid/alman/dig/w3;)Lcom/digdroid/alman/dig/w3$b;

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

    iget-object p1, p0, Lcom/digdroid/alman/dig/w3$c;->f:Lcom/digdroid/alman/dig/w3;

    invoke-static {p1}, Lcom/digdroid/alman/dig/w3;->p2(Lcom/digdroid/alman/dig/w3;)Lcom/digdroid/alman/dig/w3$b;

    move-result-object p1

    iget-object v4, p0, Lcom/digdroid/alman/dig/w3$c;->c:Lcom/digdroid/alman/dig/a;

    invoke-virtual {v4}, Lcom/digdroid/alman/dig/a;->h()I

    move-result v4

    iget-object v5, p0, Lcom/digdroid/alman/dig/w3$c;->f:Lcom/digdroid/alman/dig/w3;

    iget-object v5, v5, Lcom/digdroid/alman/dig/w3;->e0:Ljava/lang/String;

    long-to-int v1, v0

    div-int/lit16 v1, v1, 0x400

    long-to-int v0, v2

    div-int/lit16 v0, v0, 0x400

    invoke-interface {p1, v4, v5, v1, v0}, Lcom/digdroid/alman/dig/w3$b;->Q(ILjava/lang/String;II)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

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

    iget-object v0, p0, Lcom/digdroid/alman/dig/w3$c;->f:Lcom/digdroid/alman/dig/w3;

    invoke-static {v0}, Lcom/digdroid/alman/dig/w3;->p2(Lcom/digdroid/alman/dig/w3;)Lcom/digdroid/alman/dig/w3$b;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/w3$c;->f:Lcom/digdroid/alman/dig/w3;

    invoke-static {v0}, Lcom/digdroid/alman/dig/w3;->p2(Lcom/digdroid/alman/dig/w3;)Lcom/digdroid/alman/dig/w3$b;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/w3$c;->f:Lcom/digdroid/alman/dig/w3;

    iget-object v1, v1, Lcom/digdroid/alman/dig/w3;->e0:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/digdroid/alman/dig/w3$b;->b(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method protected bridge synthetic onProgressUpdate([Ljava/lang/Object;)V
    .locals 0

    check-cast p1, [Ljava/lang/Long;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/w3$c;->d([Ljava/lang/Long;)V

    return-void
.end method
