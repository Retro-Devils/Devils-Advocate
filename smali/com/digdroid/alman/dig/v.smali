.class Lcom/digdroid/alman/dig/v;
.super Ljava/lang/Object;
.source ""


# instance fields
.field a:Landroid/content/Context;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/digdroid/alman/dig/v;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/digdroid/alman/dig/v;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/digdroid/alman/dig/v;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 22

    move-object/from16 v0, p0

    const/16 v1, 0x400

    new-array v1, v1, [B

    const/4 v2, 0x0

    :try_start_0
    iget-object v4, v0, Lcom/digdroid/alman/dig/v;->a:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v4

    iget-object v5, v0, Lcom/digdroid/alman/dig/v;->b:Ljava/lang/String;

    invoke-virtual {v4, v5}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_9

    :try_start_1
    new-instance v5, Ljava/io/BufferedInputStream;

    invoke-direct {v5, v4}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_8

    :try_start_2
    new-instance v6, Ljava/io/File;

    iget-object v7, v0, Lcom/digdroid/alman/dig/v;->a:Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v7

    const-string v8, "masterbase.7z"

    invoke-direct {v6, v7, v8}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance v7, Ljava/io/FileOutputStream;

    invoke-direct {v7, v6}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_7

    :try_start_3
    new-instance v8, Ljava/io/BufferedOutputStream;

    invoke-direct {v8, v7}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_6

    const-wide/32 v9, 0xb9c213

    long-to-float v9, v9

    const/high16 v10, 0x41200000    # 10.0f

    div-float v11, v9, v10

    :try_start_4
    invoke-static {v11}, Ljava/lang/Math;->round(F)I

    move-result v11

    int-to-long v11, v11

    const-wide/16 v15, 0x0

    const-wide/16 v17, 0x0

    :goto_0
    invoke-virtual {v5, v1}, Ljava/io/BufferedInputStream;->read([B)I

    move-result v3
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    const-string v13, "progress"

    const-string v14, "INSTALL_PROGRESS"

    const-string v10, "."

    if-lez v3, :cond_1

    :try_start_5
    invoke-virtual {v8, v1, v2, v3}, Ljava/io/BufferedOutputStream;->write([BII)V

    int-to-long v2, v3

    add-long/2addr v15, v2

    cmp-long v2, v15, v11

    if-ltz v2, :cond_0

    add-long v2, v17, v15

    new-instance v15, Landroid/content/Intent;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    move-object/from16 v20, v4

    :try_start_6
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_4

    move-object/from16 v21, v5

    :try_start_7
    iget-object v5, v0, Lcom/digdroid/alman/dig/v;->a:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v15, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    long-to-float v4, v2

    const/high16 v5, 0x41200000    # 10.0f

    mul-float v4, v4, v5

    div-float/2addr v4, v9

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    add-int/lit8 v4, v4, 0x28

    invoke-virtual {v15, v13, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    iget-object v4, v0, Lcom/digdroid/alman/dig/v;->a:Landroid/content/Context;

    invoke-static {v4}, Lb/n/a/a;->b(Landroid/content/Context;)Lb/n/a/a;

    move-result-object v4

    invoke-virtual {v4, v15}, Lb/n/a/a;->d(Landroid/content/Intent;)Z

    move-wide/from16 v17, v2

    move-object/from16 v4, v20

    move-object/from16 v5, v21

    const/4 v2, 0x0

    const/high16 v10, 0x41200000    # 10.0f

    const-wide/16 v15, 0x0

    goto :goto_0

    :cond_0
    move-object/from16 v21, v5

    const/4 v2, 0x0

    const/high16 v10, 0x41200000    # 10.0f

    goto :goto_0

    :cond_1
    move-object/from16 v20, v4

    move-object/from16 v21, v5

    invoke-virtual {v8}, Ljava/io/BufferedOutputStream;->flush()V

    invoke-virtual {v8}, Ljava/io/BufferedOutputStream;->close()V

    invoke-virtual {v7}, Ljava/io/FileOutputStream;->close()V

    new-instance v2, Le/a/a/a/b/b/l;

    invoke-direct {v2, v6}, Le/a/a/a/b/b/l;-><init>(Ljava/io/File;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_5

    move-object v3, v7

    :goto_1
    :try_start_8
    invoke-virtual {v2}, Le/a/a/a/b/b/l;->e()Le/a/a/a/b/b/k;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-interface {v4}, Le/a/a/a/b/a;->b()J

    move-result-wide v4

    long-to-float v4, v4

    const/high16 v5, 0x42480000    # 50.0f

    div-float v7, v4, v5

    invoke-static {v7}, Ljava/lang/Math;->round(F)I

    move-result v7

    int-to-long v11, v7

    new-instance v7, Ljava/io/FileOutputStream;

    iget-object v9, v0, Lcom/digdroid/alman/dig/v;->c:Ljava/lang/String;

    invoke-direct {v7, v9}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_2

    :try_start_9
    new-instance v3, Ljava/io/BufferedOutputStream;

    invoke-direct {v3, v7}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_1

    const-wide/16 v8, 0x0

    const-wide/16 v15, 0x0

    :goto_2
    :try_start_a
    invoke-virtual {v2, v1}, Le/a/a/a/b/b/l;->f([B)I

    move-result v5

    move-object/from16 v18, v6

    if-lez v5, :cond_3

    const/4 v6, 0x0

    invoke-virtual {v3, v1, v6, v5}, Ljava/io/BufferedOutputStream;->write([BII)V

    int-to-long v5, v5

    add-long/2addr v8, v5

    cmp-long v5, v8, v11

    if-ltz v5, :cond_2

    add-long v5, v15, v8

    new-instance v8, Landroid/content/Intent;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v15, v0, Lcom/digdroid/alman/dig/v;->a:Landroid/content/Context;

    invoke-virtual {v15}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v9, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    long-to-float v9, v5

    const/high16 v17, 0x42480000    # 50.0f

    mul-float v9, v9, v17

    div-float/2addr v9, v4

    invoke-static {v9}, Ljava/lang/Math;->round(F)I

    move-result v9

    add-int/lit8 v9, v9, 0x32

    invoke-virtual {v8, v13, v9}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    iget-object v9, v0, Lcom/digdroid/alman/dig/v;->a:Landroid/content/Context;

    invoke-static {v9}, Lb/n/a/a;->b(Landroid/content/Context;)Lb/n/a/a;

    move-result-object v9

    invoke-virtual {v9, v8}, Lb/n/a/a;->d(Landroid/content/Intent;)Z

    move-wide v15, v5

    move-object/from16 v6, v18

    const-wide/16 v8, 0x0

    goto :goto_2

    :cond_2
    const/high16 v17, 0x42480000    # 50.0f

    move-object/from16 v6, v18

    goto :goto_2

    :cond_3
    invoke-virtual {v3}, Ljava/io/BufferedOutputStream;->flush()V

    invoke-virtual {v3}, Ljava/io/BufferedOutputStream;->close()V

    invoke-virtual {v7}, Ljava/io/FileOutputStream;->close()V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_0

    move-object v8, v3

    move-object v3, v7

    move-object/from16 v6, v18

    goto/16 :goto_1

    :catch_0
    move-object/from16 v19, v2

    goto :goto_6

    :catch_1
    move-object/from16 v19, v2

    goto :goto_3

    :cond_4
    move-object/from16 v18, v6

    :try_start_b
    invoke-virtual {v2}, Le/a/a/a/b/b/l;->close()V

    invoke-virtual/range {v18 .. v18}, Ljava/io/File;->delete()Z
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_2

    const/4 v1, 0x1

    return v1

    :catch_2
    move-object/from16 v19, v2

    move-object v7, v3

    :goto_3
    move-object v3, v8

    goto :goto_6

    :catch_3
    move-object/from16 v20, v4

    :catch_4
    move-object/from16 v21, v5

    :catch_5
    move-object v3, v8

    goto :goto_4

    :catch_6
    move-object/from16 v20, v4

    move-object/from16 v21, v5

    const/4 v3, 0x0

    goto :goto_4

    :catch_7
    move-object/from16 v20, v4

    move-object/from16 v21, v5

    const/4 v3, 0x0

    const/4 v7, 0x0

    :goto_4
    const/16 v19, 0x0

    goto :goto_6

    :catch_8
    move-object/from16 v20, v4

    const/4 v3, 0x0

    const/4 v7, 0x0

    const/16 v19, 0x0

    goto :goto_5

    :catch_9
    const/4 v3, 0x0

    const/4 v7, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    :goto_5
    const/16 v21, 0x0

    :goto_6
    if-eqz v3, :cond_5

    :try_start_c
    invoke-virtual {v3}, Ljava/io/BufferedOutputStream;->close()V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_a

    goto :goto_7

    :catch_a
    nop

    :cond_5
    :goto_7
    if-eqz v7, :cond_6

    :try_start_d
    invoke-virtual {v7}, Ljava/io/FileOutputStream;->close()V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_b

    goto :goto_8

    :catch_b
    nop

    :cond_6
    :goto_8
    if-eqz v19, :cond_7

    :try_start_e
    invoke-virtual/range {v19 .. v19}, Le/a/a/a/b/b/l;->close()V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_c

    goto :goto_9

    :catch_c
    nop

    :cond_7
    :goto_9
    if-eqz v21, :cond_8

    :try_start_f
    invoke-virtual/range {v21 .. v21}, Ljava/io/BufferedInputStream;->close()V
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_d

    goto :goto_a

    :catch_d
    nop

    :cond_8
    :goto_a
    if-eqz v20, :cond_9

    :try_start_10
    invoke-virtual/range {v20 .. v20}, Ljava/io/InputStream;->close()V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_e

    :catch_e
    :cond_9
    const/4 v1, 0x0

    return v1
.end method
