.class Lcom/digdroid/alman/dig/g$b;
.super Landroid/os/AsyncTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/digdroid/alman/dig/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/String;",
        "Ljava/lang/Void;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/g;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/g;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/g$b;->a:Lcom/digdroid/alman/dig/g;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 26

    move-object/from16 v1, p0

    const-string v0, "games.db"

    const/4 v2, 0x0

    aget-object v3, p1, v2

    iget-object v4, v1, Lcom/digdroid/alman/dig/g$b;->a:Lcom/digdroid/alman/dig/g;

    iget-object v4, v4, Lcom/digdroid/alman/dig/g;->c:Landroid/content/Context;

    invoke-static {v4}, Lcom/digdroid/alman/dig/u;->e(Landroid/content/Context;)Lcom/digdroid/alman/dig/u;

    move-result-object v4

    invoke-virtual {v4}, Lcom/digdroid/alman/dig/u;->h()V

    invoke-virtual {v4}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v4

    const-string v5, "pragma wal_checkpoint;"

    const/4 v6, 0x0

    invoke-virtual {v4, v5, v6}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v4

    invoke-interface {v4}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x2

    invoke-interface {v4, v5}, Landroid/database/Cursor;->getInt(I)I

    :cond_0
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    iget-object v4, v1, Lcom/digdroid/alman/dig/g$b;->a:Lcom/digdroid/alman/dig/g;

    iget-object v4, v4, Lcom/digdroid/alman/dig/g;->c:Landroid/content/Context;

    invoke-static {v4}, Lcom/digdroid/alman/dig/b3;->k(Landroid/content/Context;)Lcom/digdroid/alman/dig/b3;

    move-result-object v4

    const-string v5, "token"

    const-string v7, "0"

    invoke-virtual {v4, v5, v7}, Lcom/digdroid/alman/dig/b3;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "attest_retry_next"

    const-wide/16 v10, 0x0

    invoke-virtual {v4, v9, v10, v11}, Lcom/digdroid/alman/dig/b3;->n(Ljava/lang/String;J)J

    move-result-wide v12

    const-string v14, "attest_retry_in"

    move-object/from16 p1, v3

    const-wide/32 v2, 0x1b7740

    move-wide/from16 v16, v12

    invoke-virtual {v4, v14, v2, v3}, Lcom/digdroid/alman/dig/b3;->n(Ljava/lang/String;J)J

    move-result-wide v12

    invoke-virtual {v4, v5, v7}, Lcom/digdroid/alman/dig/b3;->z(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4, v9, v10, v11}, Lcom/digdroid/alman/dig/b3;->F(Ljava/lang/String;J)V

    invoke-virtual {v4, v14, v2, v3}, Lcom/digdroid/alman/dig/b3;->F(Ljava/lang/String;J)V

    :try_start_0
    new-instance v2, Ljava/io/FileInputStream;

    iget-object v3, v1, Lcom/digdroid/alman/dig/g$b;->a:Lcom/digdroid/alman/dig/g;

    iget-object v3, v3, Lcom/digdroid/alman/dig/g;->c:Landroid/content/Context;

    invoke-virtual {v3, v0}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1d
    .catchall {:try_start_0 .. :try_end_0} :catchall_13

    :try_start_1
    new-instance v3, Ljava/io/BufferedInputStream;

    invoke-direct {v3, v2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_17
    .catchall {:try_start_1 .. :try_end_1} :catchall_12

    :try_start_2
    new-instance v7, Ljava/io/FileOutputStream;

    move-object/from16 v10, p1

    invoke-direct {v7, v10}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_16
    .catchall {:try_start_2 .. :try_end_2} :catchall_11

    :try_start_3
    new-instance v10, Ljava/io/BufferedOutputStream;

    invoke-direct {v10, v7}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_15
    .catchall {:try_start_3 .. :try_end_3} :catchall_10

    :try_start_4
    new-instance v11, Ljava/util/zip/ZipOutputStream;

    invoke-direct {v11, v10}, Ljava/util/zip/ZipOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_14
    .catchall {:try_start_4 .. :try_end_4} :catchall_f

    :try_start_5
    iget-object v15, v1, Lcom/digdroid/alman/dig/g$b;->a:Lcom/digdroid/alman/dig/g;

    invoke-virtual {v15, v3, v11, v0}, Lcom/digdroid/alman/dig/g;->i(Ljava/io/BufferedInputStream;Ljava/util/zip/ZipOutputStream;Ljava/lang/String;)Z

    move-result v0

    invoke-virtual {v3}, Ljava/io/BufferedInputStream;->close()V

    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V

    new-instance v15, Ljava/io/File;

    iget-object v6, v1, Lcom/digdroid/alman/dig/g$b;->a:Lcom/digdroid/alman/dig/g;

    iget-object v6, v6, Lcom/digdroid/alman/dig/g;->c:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v6

    move/from16 v19, v0

    const-string v0, "../shared_prefs"

    invoke-direct {v15, v6, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v15}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {v15}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_3

    array-length v6, v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_11
    .catchall {:try_start_5 .. :try_end_5} :catchall_e

    const/4 v15, 0x0

    :goto_0
    if-ge v15, v6, :cond_2

    move-object/from16 v20, v2

    :try_start_6
    aget-object v2, v0, v15
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_5
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    move-object/from16 v21, v3

    :try_start_7
    new-instance v3, Ljava/io/FileInputStream;

    invoke-direct {v3, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_4
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    move/from16 v22, v6

    :try_start_8
    new-instance v6, Ljava/io/BufferedInputStream;

    invoke-direct {v6, v3}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_3
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    move-object/from16 v23, v0

    :try_start_9
    iget-object v0, v1, Lcom/digdroid/alman/dig/g$b;->a:Lcom/digdroid/alman/dig/g;
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_0
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    move-object/from16 v24, v3

    :try_start_a
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_1
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    move-object/from16 v25, v7

    :try_start_b
    const-string v7, "shared_prefs/"

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v6, v11, v2}, Lcom/digdroid/alman/dig/g;->i(Ljava/io/BufferedInputStream;Ljava/util/zip/ZipOutputStream;Ljava/lang/String;)Z

    move-result v0
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_2
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    if-nez v0, :cond_1

    const/16 v19, 0x0

    :cond_1
    add-int/lit8 v15, v15, 0x1

    move-object v3, v6

    move/from16 v6, v22

    move-object/from16 v0, v23

    move-object/from16 v2, v24

    move-object/from16 v7, v25

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :catchall_1
    move-exception v0

    goto :goto_1

    :catchall_2
    move-exception v0

    move-object/from16 v24, v3

    :goto_1
    move-object/from16 v25, v7

    :goto_2
    move-object v3, v6

    move-wide/from16 v6, v16

    goto :goto_3

    :catch_0
    move-object/from16 v24, v3

    :catch_1
    move-object/from16 v25, v7

    :catch_2
    move-object v3, v6

    move-wide/from16 v6, v16

    goto :goto_4

    :catchall_3
    move-exception v0

    move-object/from16 v24, v3

    move-object/from16 v25, v7

    move-wide/from16 v6, v16

    move-object/from16 v3, v21

    :goto_3
    move-object/from16 v2, v24

    move-object/from16 v24, v10

    goto/16 :goto_13

    :catch_3
    move-object/from16 v24, v3

    move-object/from16 v25, v7

    move-wide/from16 v6, v16

    move-object/from16 v3, v21

    :goto_4
    move-object/from16 v2, v24

    move-object/from16 v24, v10

    goto/16 :goto_1a

    :catchall_4
    move-exception v0

    move-object/from16 v25, v7

    move-object/from16 v24, v10

    move-wide/from16 v6, v16

    move-object/from16 v2, v20

    :goto_5
    move-object/from16 v3, v21

    goto/16 :goto_13

    :catch_4
    move-object/from16 v25, v7

    move-object/from16 v24, v10

    move-wide/from16 v6, v16

    move-object/from16 v2, v20

    :goto_6
    move-object/from16 v3, v21

    goto/16 :goto_1a

    :catchall_5
    move-exception v0

    move-object/from16 v21, v3

    move-object/from16 v25, v7

    :goto_7
    move-object/from16 v24, v10

    move-wide/from16 v6, v16

    move-object/from16 v2, v20

    goto/16 :goto_13

    :catch_5
    move-object/from16 v21, v3

    move-object/from16 v25, v7

    :goto_8
    move-object/from16 v24, v10

    move-wide/from16 v6, v16

    move-object/from16 v2, v20

    goto/16 :goto_1a

    :cond_2
    move-object/from16 v20, v2

    move-object/from16 v21, v3

    :cond_3
    move-object/from16 v25, v7

    move/from16 v0, v19

    :try_start_c
    new-instance v6, Ljava/io/File;

    iget-object v7, v1, Lcom/digdroid/alman/dig/g$b;->a:Lcom/digdroid/alman/dig/g;

    iget-object v7, v7, Lcom/digdroid/alman/dig/g;->c:Landroid/content/Context;

    const/4 v15, 0x0

    invoke-virtual {v7, v15}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v7

    const-string v15, "Themes"

    invoke-direct {v6, v7, v15}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-virtual {v6}, Ljava/io/File;->isDirectory()Z

    move-result v7

    if-nez v7, :cond_6

    invoke-virtual {v6}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v6

    if-eqz v6, :cond_6

    array-length v7, v6
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_12
    .catchall {:try_start_c .. :try_end_c} :catchall_d

    const/4 v15, 0x0

    :goto_9
    if-ge v15, v7, :cond_5

    move/from16 v19, v0

    :try_start_d
    aget-object v0, v6, v15
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_8
    .catchall {:try_start_d .. :try_end_d} :catchall_8

    move-object/from16 v20, v2

    :try_start_e
    new-instance v2, Ljava/io/FileInputStream;

    invoke-direct {v2, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_7
    .catchall {:try_start_e .. :try_end_e} :catchall_7

    move-object/from16 v21, v3

    :try_start_f
    new-instance v3, Ljava/io/BufferedInputStream;

    invoke-direct {v3, v2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_6
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    move-object/from16 v22, v6

    :try_start_10
    iget-object v6, v1, Lcom/digdroid/alman/dig/g$b;->a:Lcom/digdroid/alman/dig/g;

    move/from16 v23, v7

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_12
    .catchall {:try_start_10 .. :try_end_10} :catchall_d

    move-object/from16 v24, v10

    :try_start_11
    const-string v10, "Themes/"

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v3, v11, v0}, Lcom/digdroid/alman/dig/g;->i(Ljava/io/BufferedInputStream;Ljava/util/zip/ZipOutputStream;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    const/4 v0, 0x0

    goto :goto_a

    :cond_4
    move/from16 v0, v19

    :goto_a
    invoke-virtual {v3}, Ljava/io/BufferedInputStream;->close()V

    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V

    add-int/lit8 v15, v15, 0x1

    move-object/from16 v6, v22

    move/from16 v7, v23

    move-object/from16 v10, v24

    goto :goto_9

    :catchall_6
    move-exception v0

    move-object/from16 v24, v10

    move-wide/from16 v6, v16

    goto/16 :goto_5

    :catch_6
    move-object/from16 v24, v10

    move-wide/from16 v6, v16

    goto/16 :goto_6

    :catchall_7
    move-exception v0

    move-object/from16 v21, v3

    goto/16 :goto_7

    :catch_7
    move-object/from16 v21, v3

    goto/16 :goto_8

    :catchall_8
    move-exception v0

    move-object/from16 v20, v2

    move-object/from16 v21, v3

    goto/16 :goto_d

    :catch_8
    move-object/from16 v20, v2

    move-object/from16 v21, v3

    goto/16 :goto_f

    :cond_5
    move/from16 v19, v0

    move-object/from16 v20, v2

    move-object/from16 v21, v3

    :cond_6
    move-object/from16 v24, v10

    new-instance v6, Ljava/io/File;

    iget-object v7, v1, Lcom/digdroid/alman/dig/g$b;->a:Lcom/digdroid/alman/dig/g;

    iget-object v7, v7, Lcom/digdroid/alman/dig/g;->c:Landroid/content/Context;

    const/4 v10, 0x0

    invoke-virtual {v7, v10}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v7

    const-string v10, "Retroarch/config"

    invoke-direct {v6, v7, v10}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v7

    if-eqz v7, :cond_9

    invoke-virtual {v6}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v6

    if-eqz v6, :cond_9

    array-length v7, v6
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_13
    .catchall {:try_start_11 .. :try_end_11} :catchall_c

    const/4 v10, 0x0

    :goto_b
    if-ge v10, v7, :cond_8

    :try_start_12
    aget-object v15, v6, v10
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_b
    .catchall {:try_start_12 .. :try_end_12} :catchall_b

    move-object/from16 v18, v2

    :try_start_13
    new-instance v2, Ljava/io/FileInputStream;

    invoke-direct {v2, v15}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_a
    .catchall {:try_start_13 .. :try_end_13} :catchall_a

    move-object/from16 v19, v3

    :try_start_14
    new-instance v3, Ljava/io/BufferedInputStream;

    invoke-direct {v3, v2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_9
    .catchall {:try_start_14 .. :try_end_14} :catchall_9

    move/from16 v20, v0

    :try_start_15
    iget-object v0, v1, Lcom/digdroid/alman/dig/g$b;->a:Lcom/digdroid/alman/dig/g;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v21, v6

    const-string v6, "Retroarch/config/"

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v3, v11, v1}, Lcom/digdroid/alman/dig/g;->i(Ljava/io/BufferedInputStream;Ljava/util/zip/ZipOutputStream;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_7

    const/4 v0, 0x0

    goto :goto_c

    :cond_7
    move/from16 v0, v20

    :goto_c
    invoke-virtual {v3}, Ljava/io/BufferedInputStream;->close()V

    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_13
    .catchall {:try_start_15 .. :try_end_15} :catchall_c

    add-int/lit8 v10, v10, 0x1

    move-object/from16 v1, p0

    move-object/from16 v6, v21

    goto :goto_b

    :catchall_9
    move-exception v0

    move-wide/from16 v6, v16

    move-object/from16 v3, v19

    goto/16 :goto_13

    :catch_9
    move-wide/from16 v6, v16

    move-object/from16 v3, v19

    goto/16 :goto_1a

    :catchall_a
    move-exception v0

    move-object/from16 v19, v3

    move-wide/from16 v6, v16

    move-object/from16 v2, v18

    goto/16 :goto_13

    :catch_a
    move-object/from16 v19, v3

    move-wide/from16 v6, v16

    move-object/from16 v2, v18

    goto/16 :goto_1a

    :catchall_b
    move-exception v0

    move-object/from16 v18, v2

    move-object/from16 v19, v3

    goto :goto_e

    :catch_b
    move-object/from16 v18, v2

    move-object/from16 v19, v3

    goto :goto_10

    :cond_8
    move/from16 v20, v0

    move-object/from16 v18, v2

    move-object/from16 v19, v3

    :cond_9
    invoke-virtual {v4, v5, v8}, Lcom/digdroid/alman/dig/b3;->z(Ljava/lang/String;Ljava/lang/String;)V

    move-wide/from16 v6, v16

    invoke-virtual {v4, v9, v6, v7}, Lcom/digdroid/alman/dig/b3;->F(Ljava/lang/String;J)V

    invoke-virtual {v4, v14, v12, v13}, Lcom/digdroid/alman/dig/b3;->F(Ljava/lang/String;J)V

    :try_start_16
    invoke-virtual {v11}, Ljava/util/zip/ZipOutputStream;->flush()V

    invoke-virtual {v11}, Ljava/util/zip/ZipOutputStream;->close()V
    :try_end_16
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_16} :catch_c

    :catch_c
    :try_start_17
    invoke-virtual/range {v24 .. v24}, Ljava/io/BufferedOutputStream;->flush()V

    invoke-virtual/range {v24 .. v24}, Ljava/io/BufferedOutputStream;->close()V
    :try_end_17
    .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_17} :catch_d

    :catch_d
    :try_start_18
    invoke-virtual/range {v25 .. v25}, Ljava/io/FileOutputStream;->flush()V

    invoke-virtual/range {v25 .. v25}, Ljava/io/FileOutputStream;->close()V
    :try_end_18
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_18} :catch_e

    :catch_e
    :try_start_19
    invoke-virtual {v3}, Ljava/io/BufferedInputStream;->close()V
    :try_end_19
    .catch Ljava/lang/Exception; {:try_start_19 .. :try_end_19} :catch_f

    :catch_f
    :try_start_1a
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_1a
    .catch Ljava/lang/Exception; {:try_start_1a .. :try_end_1a} :catch_10

    :catch_10
    move v2, v0

    goto/16 :goto_1f

    :catchall_c
    move-exception v0

    goto :goto_e

    :catchall_d
    move-exception v0

    goto :goto_d

    :catchall_e
    move-exception v0

    move-object/from16 v25, v7

    :goto_d
    move-object/from16 v24, v10

    :goto_e
    move-wide/from16 v6, v16

    goto/16 :goto_13

    :catch_11
    move-object/from16 v25, v7

    :catch_12
    :goto_f
    move-object/from16 v24, v10

    :catch_13
    :goto_10
    move-wide/from16 v6, v16

    goto/16 :goto_1a

    :catchall_f
    move-exception v0

    move-object/from16 v25, v7

    move-object/from16 v24, v10

    move-object v10, v6

    move-wide/from16 v6, v16

    move-object v11, v10

    goto/16 :goto_13

    :catch_14
    move-object/from16 v25, v7

    move-object/from16 v24, v10

    move-object v10, v6

    move-wide/from16 v6, v16

    move-object v11, v10

    goto/16 :goto_1a

    :catchall_10
    move-exception v0

    move-object v10, v6

    move-object/from16 v25, v7

    move-wide/from16 v6, v16

    move-object v11, v10

    move-object/from16 v24, v11

    goto :goto_13

    :catch_15
    move-object v10, v6

    move-object/from16 v25, v7

    move-wide/from16 v6, v16

    move-object v11, v10

    move-object/from16 v24, v11

    goto/16 :goto_1a

    :catchall_11
    move-exception v0

    move-object v10, v6

    move-wide/from16 v6, v16

    move-object v11, v10

    goto :goto_12

    :catch_16
    move-object v10, v6

    move-wide/from16 v6, v16

    move-object v11, v10

    goto/16 :goto_19

    :catchall_12
    move-exception v0

    move-object v10, v6

    move-wide/from16 v6, v16

    move-object v3, v10

    goto :goto_11

    :catch_17
    move-object v10, v6

    move-wide/from16 v6, v16

    move-object v3, v10

    goto :goto_18

    :catchall_13
    move-exception v0

    move-object v10, v6

    move-wide/from16 v6, v16

    move-object v2, v10

    move-object v3, v2

    :goto_11
    move-object v11, v3

    :goto_12
    move-object/from16 v24, v11

    move-object/from16 v25, v24

    :goto_13
    invoke-virtual {v4, v5, v8}, Lcom/digdroid/alman/dig/b3;->z(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4, v9, v6, v7}, Lcom/digdroid/alman/dig/b3;->F(Ljava/lang/String;J)V

    invoke-virtual {v4, v14, v12, v13}, Lcom/digdroid/alman/dig/b3;->F(Ljava/lang/String;J)V

    if-eqz v11, :cond_a

    :try_start_1b
    invoke-virtual {v11}, Ljava/util/zip/ZipOutputStream;->flush()V

    invoke-virtual {v11}, Ljava/util/zip/ZipOutputStream;->close()V
    :try_end_1b
    .catch Ljava/lang/Exception; {:try_start_1b .. :try_end_1b} :catch_18

    goto :goto_14

    :catch_18
    nop

    :cond_a
    :goto_14
    if-eqz v24, :cond_b

    :try_start_1c
    invoke-virtual/range {v24 .. v24}, Ljava/io/BufferedOutputStream;->flush()V

    invoke-virtual/range {v24 .. v24}, Ljava/io/BufferedOutputStream;->close()V
    :try_end_1c
    .catch Ljava/lang/Exception; {:try_start_1c .. :try_end_1c} :catch_19

    goto :goto_15

    :catch_19
    nop

    :cond_b
    :goto_15
    if-eqz v25, :cond_c

    :try_start_1d
    invoke-virtual/range {v25 .. v25}, Ljava/io/FileOutputStream;->flush()V

    invoke-virtual/range {v25 .. v25}, Ljava/io/FileOutputStream;->close()V
    :try_end_1d
    .catch Ljava/lang/Exception; {:try_start_1d .. :try_end_1d} :catch_1a

    goto :goto_16

    :catch_1a
    nop

    :cond_c
    :goto_16
    if-eqz v3, :cond_d

    :try_start_1e
    invoke-virtual {v3}, Ljava/io/BufferedInputStream;->close()V
    :try_end_1e
    .catch Ljava/lang/Exception; {:try_start_1e .. :try_end_1e} :catch_1b

    goto :goto_17

    :catch_1b
    nop

    :cond_d
    :goto_17
    if-eqz v2, :cond_e

    :try_start_1f
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_1f
    .catch Ljava/lang/Exception; {:try_start_1f .. :try_end_1f} :catch_1c

    :catch_1c
    :cond_e
    throw v0

    :catch_1d
    move-object v10, v6

    move-wide/from16 v6, v16

    move-object v2, v10

    move-object v3, v2

    :goto_18
    move-object v11, v3

    :goto_19
    move-object/from16 v24, v11

    move-object/from16 v25, v24

    :goto_1a
    invoke-virtual {v4, v5, v8}, Lcom/digdroid/alman/dig/b3;->z(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4, v9, v6, v7}, Lcom/digdroid/alman/dig/b3;->F(Ljava/lang/String;J)V

    invoke-virtual {v4, v14, v12, v13}, Lcom/digdroid/alman/dig/b3;->F(Ljava/lang/String;J)V

    if-eqz v11, :cond_f

    :try_start_20
    invoke-virtual {v11}, Ljava/util/zip/ZipOutputStream;->flush()V

    invoke-virtual {v11}, Ljava/util/zip/ZipOutputStream;->close()V
    :try_end_20
    .catch Ljava/lang/Exception; {:try_start_20 .. :try_end_20} :catch_1e

    goto :goto_1b

    :catch_1e
    nop

    :cond_f
    :goto_1b
    if-eqz v24, :cond_10

    :try_start_21
    invoke-virtual/range {v24 .. v24}, Ljava/io/BufferedOutputStream;->flush()V

    invoke-virtual/range {v24 .. v24}, Ljava/io/BufferedOutputStream;->close()V
    :try_end_21
    .catch Ljava/lang/Exception; {:try_start_21 .. :try_end_21} :catch_1f

    goto :goto_1c

    :catch_1f
    nop

    :cond_10
    :goto_1c
    if-eqz v25, :cond_11

    :try_start_22
    invoke-virtual/range {v25 .. v25}, Ljava/io/FileOutputStream;->flush()V

    invoke-virtual/range {v25 .. v25}, Ljava/io/FileOutputStream;->close()V
    :try_end_22
    .catch Ljava/lang/Exception; {:try_start_22 .. :try_end_22} :catch_20

    goto :goto_1d

    :catch_20
    nop

    :cond_11
    :goto_1d
    if-eqz v3, :cond_12

    :try_start_23
    invoke-virtual {v3}, Ljava/io/BufferedInputStream;->close()V
    :try_end_23
    .catch Ljava/lang/Exception; {:try_start_23 .. :try_end_23} :catch_21

    goto :goto_1e

    :catch_21
    nop

    :cond_12
    :goto_1e
    if-eqz v2, :cond_13

    :try_start_24
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_24
    .catch Ljava/lang/Exception; {:try_start_24 .. :try_end_24} :catch_22

    :catch_22
    :cond_13
    const/4 v2, 0x0

    :goto_1f
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method protected b(Ljava/lang/Boolean;)V
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/g$b;->a:Lcom/digdroid/alman/dig/g;

    invoke-static {v0}, Lcom/digdroid/alman/dig/g;->a(Lcom/digdroid/alman/dig/g;)Lcom/digdroid/alman/dig/g$a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/g$b;->a:Lcom/digdroid/alman/dig/g;

    invoke-static {v0}, Lcom/digdroid/alman/dig/g;->a(Lcom/digdroid/alman/dig/g;)Lcom/digdroid/alman/dig/g$a;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-interface {v0, p1}, Lcom/digdroid/alman/dig/g$a;->a(Z)V

    :cond_0
    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/g$b;->a([Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/g$b;->b(Ljava/lang/Boolean;)V

    return-void
.end method
