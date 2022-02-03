.class Lcom/digdroid/alman/dig/p3$g;
.super Landroid/os/AsyncTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/digdroid/alman/dig/p3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field a:Lcom/digdroid/alman/dig/MainActivity;

.field b:Landroid/content/Context;

.field c:Ljava/lang/String;

.field d:Lcom/digdroid/alman/dig/b3;

.field e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/digdroid/alman/dig/MainActivity;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/digdroid/alman/dig/p3$g;->e:Ljava/lang/String;

    iput-object p1, p0, Lcom/digdroid/alman/dig/p3$g;->a:Lcom/digdroid/alman/dig/MainActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/p3$g;->b:Landroid/content/Context;

    invoke-static {p1}, Lcom/digdroid/alman/dig/b3;->k(Landroid/content/Context;)Lcom/digdroid/alman/dig/b3;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/p3$g;->d:Lcom/digdroid/alman/dig/b3;

    iput-object p2, p0, Lcom/digdroid/alman/dig/p3$g;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Ljava/lang/Boolean;
    .locals 22

    move-object/from16 v1, p0

    const-string v0, "^[^\\/]+\\.cfg$"

    const/4 v2, 0x2

    invoke-static {v0, v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v0

    new-instance v2, Lcom/digdroid/alman/dig/e4;

    iget-object v3, v1, Lcom/digdroid/alman/dig/p3$g;->c:Ljava/lang/String;

    invoke-direct {v2, v3}, Lcom/digdroid/alman/dig/e4;-><init>(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {v2}, Lcom/digdroid/alman/dig/e4;->d()Lcom/digdroid/alman/dig/e4$a;

    move-result-object v3

    const-string v4, " "

    const v5, 0x7f1100e3

    const/4 v6, 0x0

    if-eqz v3, :cond_1

    iget-object v7, v1, Lcom/digdroid/alman/dig/p3$g;->b:Landroid/content/Context;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v9, v1, Lcom/digdroid/alman/dig/p3$g;->b:Landroid/content/Context;

    invoke-virtual {v9, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v9, v3, Lcom/digdroid/alman/dig/e4$a;->a:Ljava/lang/String;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8, v6}, Lcom/digdroid/alman/dig/p3;->n(Landroid/content/Context;Ljava/lang/String;I)V

    iget-object v7, v3, Lcom/digdroid/alman/dig/e4$a;->a:Ljava/lang/String;

    invoke-virtual {v0, v7}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v7

    invoke-virtual {v7}, Ljava/util/regex/Matcher;->find()Z

    move-result v7

    if-eqz v7, :cond_0

    iget-object v0, v3, Lcom/digdroid/alman/dig/e4$a;->a:Ljava/lang/String;

    iput-object v0, v1, Lcom/digdroid/alman/dig/p3$g;->e:Ljava/lang/String;

    :cond_1
    invoke-virtual {v2}, Lcom/digdroid/alman/dig/e4;->a()V

    iget-object v0, v1, Lcom/digdroid/alman/dig/p3$g;->e:Ljava/lang/String;

    if-nez v0, :cond_2

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object v0

    :cond_2
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, -0x4

    invoke-virtual {v0, v6, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    sget-object v2, Lcom/digdroid/alman/dig/p3;->a:Lcom/digdroid/alman/dig/s3;

    iget-object v2, v2, Lcom/digdroid/alman/dig/s3;->a:Lcom/digdroid/alman/dig/r3;

    invoke-virtual {v2}, Lcom/digdroid/alman/dig/r3;->C()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_3

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object v0

    :cond_3
    iget-object v3, v1, Lcom/digdroid/alman/dig/p3$g;->b:Landroid/content/Context;

    invoke-static {v3}, Lcom/digdroid/alman/dig/r3;->J(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    new-instance v7, Lcom/digdroid/alman/dig/e4;

    iget-object v8, v1, Lcom/digdroid/alman/dig/p3$g;->c:Ljava/lang/String;

    invoke-direct {v7, v8}, Lcom/digdroid/alman/dig/e4;-><init>(Ljava/lang/String;)V

    iget-object v8, v1, Lcom/digdroid/alman/dig/p3$g;->d:Lcom/digdroid/alman/dig/b3;

    iput-boolean v6, v8, Lcom/digdroid/alman/dig/b3;->g:Z

    const/4 v8, 0x1

    const/4 v9, 0x1

    :goto_0
    invoke-virtual {v7}, Lcom/digdroid/alman/dig/e4;->e()Ljava/util/zip/ZipEntry;

    move-result-object v10

    if-eqz v10, :cond_14

    if-eqz v9, :cond_14

    iget-object v11, v1, Lcom/digdroid/alman/dig/p3$g;->d:Lcom/digdroid/alman/dig/b3;

    iget-boolean v11, v11, Lcom/digdroid/alman/dig/b3;->g:Z

    if-eqz v11, :cond_4

    const/4 v9, 0x0

    :cond_4
    invoke-virtual {v10}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v12

    sub-int/2addr v12, v8

    invoke-virtual {v11, v12}, Ljava/lang/String;->charAt(I)C

    move-result v11

    const/16 v12, 0x2f

    if-ne v11, v12, :cond_5

    goto :goto_0

    :cond_5
    iget-object v11, v1, Lcom/digdroid/alman/dig/p3$g;->b:Landroid/content/Context;

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v13, v1, Lcom/digdroid/alman/dig/p3$g;->b:Landroid/content/Context;

    invoke-virtual {v13, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-static {v11, v12, v6}, Lcom/digdroid/alman/dig/p3;->n(Landroid/content/Context;Ljava/lang/String;I)V

    invoke-virtual {v10}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    move-result-object v11

    iget-object v12, v1, Lcom/digdroid/alman/dig/p3$g;->e:Ljava/lang/String;

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    const-string v12, "/"

    if-eqz v11, :cond_6

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_6
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    new-instance v12, Ljava/io/File;

    invoke-direct {v12, v11}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    new-instance v11, Ljava/io/File;

    invoke-virtual {v12}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v13

    invoke-direct {v11, v13}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11}, Ljava/io/File;->exists()Z

    move-result v13

    if-nez v13, :cond_7

    :try_start_0
    invoke-virtual {v11}, Ljava/io/File;->mkdirs()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    const/4 v9, 0x0

    :cond_7
    :goto_2
    const/4 v11, 0x0

    :try_start_1
    iget-object v13, v7, Lcom/digdroid/alman/dig/e4;->e:Ljava/util/zip/ZipFile;

    invoke-virtual {v13, v10}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;

    move-result-object v13
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_10
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    :try_start_2
    new-instance v14, Ljava/io/BufferedInputStream;

    invoke-direct {v14, v13}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_b
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    :try_start_3
    new-instance v15, Ljava/io/FileOutputStream;

    invoke-direct {v15, v12}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_a
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :try_start_4
    new-instance v12, Ljava/io/BufferedOutputStream;

    invoke-direct {v12, v15}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_9
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    const/16 v11, 0x400

    :try_start_5
    new-array v11, v11, [B

    invoke-virtual {v10}, Ljava/util/zip/ZipEntry;->getSize()J

    move-result-wide v16

    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v16

    move/from16 v17, v9

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    long-to-float v8, v8

    const/high16 v9, 0x42c80000    # 100.0f

    div-float/2addr v8, v9

    invoke-static {v8}, Ljava/lang/Math;->round(F)I

    move-result v8

    const/16 v9, 0x2710

    invoke-static {v8, v9}, Ljava/lang/Math;->max(II)I

    move-result v8

    move/from16 v9, v17

    const/16 v17, 0x0

    const/16 v19, 0x0

    :goto_3
    invoke-virtual {v14, v11}, Ljava/io/BufferedInputStream;->read([B)I

    move-result v5

    if-lez v5, :cond_a

    if-eqz v9, :cond_a

    invoke-virtual {v12, v11, v6, v5}, Ljava/io/BufferedOutputStream;->write([BII)V

    add-int v6, v17, v5

    add-int v5, v19, v5

    if-lt v5, v8, :cond_8

    iget-object v5, v1, Lcom/digdroid/alman/dig/p3$g;->b:Landroid/content/Context;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    move-object/from16 v17, v0

    :try_start_6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_5
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    move-object/from16 v19, v2

    :try_start_7
    iget-object v2, v1, Lcom/digdroid/alman/dig/p3$g;->b:Landroid/content/Context;
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_6
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    move-object/from16 v21, v3

    const v3, 0x7f1100e3

    :try_start_8
    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_7
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    int-to-float v2, v6

    const/high16 v18, 0x42c80000    # 100.0f

    mul-float v2, v2, v18

    move-object/from16 v20, v4

    :try_start_9
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    long-to-float v3, v3

    div-float/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    invoke-static {v5, v0, v2}, Lcom/digdroid/alman/dig/p3;->n(Landroid/content/Context;Ljava/lang/String;I)V

    const/4 v5, 0x0

    goto :goto_4

    :cond_8
    move-object/from16 v17, v0

    move-object/from16 v19, v2

    move-object/from16 v21, v3

    move-object/from16 v20, v4

    const/high16 v18, 0x42c80000    # 100.0f

    :goto_4
    iget-object v0, v1, Lcom/digdroid/alman/dig/p3$g;->d:Lcom/digdroid/alman/dig/b3;

    iget-boolean v0, v0, Lcom/digdroid/alman/dig/b3;->g:Z
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_8
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    if-eqz v0, :cond_9

    move-object/from16 v0, v17

    move-object/from16 v2, v19

    move-object/from16 v4, v20

    move-object/from16 v3, v21

    const/4 v9, 0x0

    goto :goto_5

    :cond_9
    move-object/from16 v0, v17

    move-object/from16 v2, v19

    move-object/from16 v4, v20

    move-object/from16 v3, v21

    :goto_5
    move/from16 v19, v5

    move/from16 v17, v6

    const/4 v6, 0x0

    goto :goto_3

    :cond_a
    move-object/from16 v17, v0

    move-object/from16 v19, v2

    move-object/from16 v21, v3

    move-object/from16 v20, v4

    :try_start_a
    invoke-virtual {v12}, Ljava/io/BufferedOutputStream;->flush()V

    invoke-virtual {v12}, Ljava/io/BufferedOutputStream;->close()V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_1

    :catch_1
    :try_start_b
    invoke-virtual {v15}, Ljava/io/FileOutputStream;->flush()V

    invoke-virtual {v15}, Ljava/io/FileOutputStream;->close()V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_2

    :catch_2
    :try_start_c
    invoke-virtual {v14}, Ljava/io/BufferedInputStream;->close()V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_3

    goto :goto_6

    :catch_3
    nop

    :goto_6
    if-eqz v13, :cond_13

    :try_start_d
    invoke-virtual {v13}, Ljava/io/InputStream;->close()V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_15

    goto/16 :goto_11

    :catchall_0
    move-exception v0

    move-object v11, v12

    goto :goto_8

    :catch_4
    move-object/from16 v17, v0

    :catch_5
    move-object/from16 v19, v2

    :catch_6
    move-object/from16 v21, v3

    :catch_7
    move-object/from16 v20, v4

    :catch_8
    move-object v11, v12

    goto/16 :goto_d

    :catchall_1
    move-exception v0

    goto :goto_8

    :catch_9
    move-object/from16 v17, v0

    move-object/from16 v19, v2

    move-object/from16 v21, v3

    move-object/from16 v20, v4

    goto :goto_d

    :catchall_2
    move-exception v0

    move-object v15, v11

    goto :goto_8

    :catch_a
    move-object/from16 v17, v0

    move-object/from16 v19, v2

    move-object/from16 v21, v3

    move-object/from16 v20, v4

    move-object v15, v11

    goto :goto_d

    :catchall_3
    move-exception v0

    move-object v14, v11

    goto :goto_7

    :catch_b
    move-object/from16 v17, v0

    move-object/from16 v19, v2

    move-object/from16 v21, v3

    move-object/from16 v20, v4

    move-object v14, v11

    goto :goto_c

    :catchall_4
    move-exception v0

    move-object v13, v11

    move-object v14, v13

    :goto_7
    move-object v15, v14

    :goto_8
    if-eqz v11, :cond_b

    :try_start_e
    invoke-virtual {v11}, Ljava/io/BufferedOutputStream;->flush()V

    invoke-virtual {v11}, Ljava/io/BufferedOutputStream;->close()V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_c

    goto :goto_9

    :catch_c
    nop

    :cond_b
    :goto_9
    if-eqz v15, :cond_c

    :try_start_f
    invoke-virtual {v15}, Ljava/io/FileOutputStream;->flush()V

    invoke-virtual {v15}, Ljava/io/FileOutputStream;->close()V
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_d

    goto :goto_a

    :catch_d
    nop

    :cond_c
    :goto_a
    if-eqz v14, :cond_d

    :try_start_10
    invoke-virtual {v14}, Ljava/io/BufferedInputStream;->close()V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_e

    goto :goto_b

    :catch_e
    nop

    :cond_d
    :goto_b
    if-eqz v13, :cond_e

    :try_start_11
    invoke-virtual {v13}, Ljava/io/InputStream;->close()V
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_f

    :catch_f
    :cond_e
    throw v0

    :catch_10
    move-object/from16 v17, v0

    move-object/from16 v19, v2

    move-object/from16 v21, v3

    move-object/from16 v20, v4

    move-object v13, v11

    move-object v14, v13

    :goto_c
    move-object v15, v14

    :goto_d
    if-eqz v11, :cond_f

    :try_start_12
    invoke-virtual {v11}, Ljava/io/BufferedOutputStream;->flush()V

    invoke-virtual {v11}, Ljava/io/BufferedOutputStream;->close()V
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_11

    goto :goto_e

    :catch_11
    nop

    :cond_f
    :goto_e
    if-eqz v15, :cond_10

    :try_start_13
    invoke-virtual {v15}, Ljava/io/FileOutputStream;->flush()V

    invoke-virtual {v15}, Ljava/io/FileOutputStream;->close()V
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_12

    goto :goto_f

    :catch_12
    nop

    :cond_10
    :goto_f
    if-eqz v14, :cond_11

    :try_start_14
    invoke-virtual {v14}, Ljava/io/BufferedInputStream;->close()V
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_13

    goto :goto_10

    :catch_13
    nop

    :cond_11
    :goto_10
    if-eqz v13, :cond_12

    :try_start_15
    invoke-virtual {v13}, Ljava/io/InputStream;->close()V
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_14

    :catch_14
    :cond_12
    const/4 v9, 0x0

    :catch_15
    :cond_13
    :goto_11
    move-object/from16 v0, v17

    move-object/from16 v2, v19

    move-object/from16 v4, v20

    move-object/from16 v3, v21

    const v5, 0x7f1100e3

    const/4 v6, 0x0

    const/4 v8, 0x1

    goto/16 :goto_0

    :cond_14
    invoke-virtual {v7}, Lcom/digdroid/alman/dig/e4;->a()V

    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method protected b(Ljava/lang/Boolean;)V
    .locals 5

    iget-object v0, p0, Lcom/digdroid/alman/dig/p3$g;->b:Landroid/content/Context;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/digdroid/alman/dig/p3;->n(Landroid/content/Context;Ljava/lang/String;I)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/p3$g;->d:Lcom/digdroid/alman/dig/b3;

    iget-boolean v0, v0, Lcom/digdroid/alman/dig/b3;->g:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/p3$g;->a:Lcom/digdroid/alman/dig/MainActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Landroidx/appcompat/app/b$a;

    iget-object v3, p0, Lcom/digdroid/alman/dig/p3$g;->a:Lcom/digdroid/alman/dig/MainActivity;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->c()I

    move-result v4

    invoke-direct {v0, v3, v4}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    const v3, 0x7f11026c

    invoke-virtual {v0, v3}, Landroidx/appcompat/app/b$a;->h(I)Landroidx/appcompat/app/b$a;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroidx/appcompat/app/b$a;->d(Z)Landroidx/appcompat/app/b$a;

    move-result-object v0

    const v2, 0x7f1101d8

    invoke-virtual {v0, v2, v1}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Landroid/content/Intent;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/digdroid/alman/dig/p3$g;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "request_refresh"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/p3$g;->b:Landroid/content/Context;

    invoke-static {v0}, Lb/n/a/a;->b(Landroid/content/Context;)Lb/n/a/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lb/n/a/a;->d(Landroid/content/Intent;)Z

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/digdroid/alman/dig/p3$g;->e:Ljava/lang/String;

    if-eqz p1, :cond_2

    new-instance v0, Lcom/digdroid/alman/dig/r3;

    iget-object v1, p0, Lcom/digdroid/alman/dig/p3$g;->a:Lcom/digdroid/alman/dig/MainActivity;

    invoke-direct {v0, v1, p1}, Lcom/digdroid/alman/dig/r3;-><init>(Lcom/digdroid/alman/dig/a4;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/r3;->u()V

    :cond_2
    :goto_0
    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/p3$g;->a([Ljava/lang/Void;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/p3$g;->b(Ljava/lang/Boolean;)V

    return-void
.end method
