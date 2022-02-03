.class Lcom/digdroid/alman/dig/g$d;
.super Landroid/os/AsyncTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/digdroid/alman/dig/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
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
.field final synthetic a:Lcom/digdroid/alman/dig/g;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/g;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/g$d;->a:Lcom/digdroid/alman/dig/g;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Ljava/lang/Boolean;
    .locals 19

    move-object/from16 v1, p0

    const-string v0, "shared_prefs"

    const-string v2, "Retroarch/config"

    const-string v3, "Themes"

    const-string v4, "games.db"

    const-string v5, ".x"

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    new-instance v7, Ljava/io/File;

    iget-object v8, v1, Lcom/digdroid/alman/dig/g$d;->a:Lcom/digdroid/alman/dig/g;

    iget-object v8, v8, Lcom/digdroid/alman/dig/g;->c:Landroid/content/Context;

    invoke-virtual {v8}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v8

    const-string v9, "dig_backup.bak"

    invoke-direct {v7, v8, v9}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    :try_start_0
    new-instance v10, Ljava/io/FileInputStream;

    invoke-direct {v10, v7}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_16
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    :try_start_1
    new-instance v11, Ljava/io/BufferedInputStream;

    invoke-direct {v11, v10}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_10
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    :try_start_2
    new-instance v12, Ljava/util/zip/ZipInputStream;

    invoke-direct {v12, v11}, Ljava/util/zip/ZipInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_f
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    const/4 v13, 0x0

    const/4 v14, 0x0

    :goto_0
    :try_start_3
    invoke-virtual {v12}, Ljava/util/zip/ZipInputStream;->getNextEntry()Ljava/util/zip/ZipEntry;

    move-result-object v15

    if-eqz v15, :cond_d

    invoke-virtual {v15}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v15, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v16
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_d
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-eqz v16, :cond_3

    :try_start_4
    iget-object v15, v1, Lcom/digdroid/alman/dig/g$d;->a:Lcom/digdroid/alman/dig/g;

    iget-object v15, v15, Lcom/digdroid/alman/dig/g;->c:Landroid/content/Context;

    invoke-virtual {v15, v4}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v15

    invoke-virtual {v15}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v15

    new-instance v9, Ljava/io/File;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v17, v4

    const-string v4, "-journal"

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v9, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9}, Ljava/io/File;->exists()Z

    move-result v4
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    if-eqz v4, :cond_0

    :try_start_5
    invoke-virtual {v9}, Ljava/io/File;->delete()Z
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catch_0
    :cond_0
    :try_start_6
    new-instance v4, Ljava/io/File;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, "-shm"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v4, v8}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v8
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    if-eqz v8, :cond_1

    :try_start_7
    invoke-virtual {v4}, Ljava/io/File;->delete()Z
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :catch_1
    :cond_1
    :try_start_8
    new-instance v4, Ljava/io/File;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, "-wal"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v4, v8}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v8
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_3
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    if-eqz v8, :cond_2

    :try_start_9
    invoke-virtual {v4}, Ljava/io/File;->delete()Z
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_2
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    :catch_2
    :cond_2
    move-object/from16 v18, v7

    goto/16 :goto_2

    :catch_3
    move-object/from16 v18, v7

    :catch_4
    move-object v9, v14

    const/4 v15, 0x0

    goto/16 :goto_12

    :cond_3
    move-object/from16 v17, v4

    const/4 v4, 0x6

    const/4 v8, 0x0

    :try_start_a
    invoke-virtual {v15, v8, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_d
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    const-string v8, "/"

    if-eqz v4, :cond_5

    :try_start_b
    iget-object v4, v1, Lcom/digdroid/alman/dig/g$d;->a:Lcom/digdroid/alman/dig/g;

    iget-object v4, v4, Lcom/digdroid/alman/dig/g;->c:Landroid/content/Context;

    const/4 v9, 0x0

    invoke-virtual {v4, v9}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v4

    new-instance v9, Ljava/io/File;
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_3
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    move-object/from16 v18, v7

    :try_start_c
    invoke-virtual {v4}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    move-result-object v7

    invoke-direct {v9, v7, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v9}, Ljava/io/File;->exists()Z

    move-result v7

    if-nez v7, :cond_4

    invoke-virtual {v9}, Ljava/io/File;->mkdirs()Z

    :cond_4
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_4
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    goto/16 :goto_2

    :cond_5
    move-object/from16 v18, v7

    const/16 v4, 0x10

    const/4 v7, 0x0

    :try_start_d
    invoke-virtual {v15, v7, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_e
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    if-eqz v4, :cond_7

    :try_start_e
    iget-object v4, v1, Lcom/digdroid/alman/dig/g$d;->a:Lcom/digdroid/alman/dig/g;

    iget-object v4, v4, Lcom/digdroid/alman/dig/g;->c:Landroid/content/Context;

    const/4 v7, 0x0

    invoke-virtual {v4, v7}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v4

    new-instance v9, Ljava/io/File;

    invoke-virtual {v4}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    move-result-object v7

    invoke-direct {v9, v7, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v9}, Ljava/io/File;->exists()Z

    move-result v7

    if-nez v7, :cond_6

    invoke-virtual {v9}, Ljava/io/File;->mkdirs()Z

    :cond_6
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_4
    .catchall {:try_start_e .. :try_end_e} :catchall_2

    goto :goto_1

    :cond_7
    const/16 v4, 0xc

    const/4 v7, 0x0

    :try_start_f
    invoke-virtual {v15, v7, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_c

    iget-object v4, v1, Lcom/digdroid/alman/dig/g$d;->a:Lcom/digdroid/alman/dig/g;

    iget-object v4, v4, Lcom/digdroid/alman/dig/g;->c:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v4

    invoke-virtual {v4}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v4

    new-instance v7, Ljava/io/File;

    invoke-virtual {v4}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    move-result-object v9

    invoke-direct {v7, v9, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v9
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_e
    .catchall {:try_start_f .. :try_end_f} :catchall_2

    if-nez v9, :cond_8

    :try_start_10
    invoke-virtual {v7}, Ljava/io/File;->mkdirs()Z
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_4
    .catchall {:try_start_10 .. :try_end_10} :catchall_2

    :cond_8
    :try_start_11
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    :goto_2
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, v15}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v7
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_e
    .catchall {:try_start_11 .. :try_end_11} :catchall_2

    if-eqz v7, :cond_a

    :try_start_12
    iget-object v7, v1, Lcom/digdroid/alman/dig/g$d;->a:Lcom/digdroid/alman/dig/g;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v15, v8}, Lcom/digdroid/alman/dig/g;->d(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_9

    goto :goto_4

    :cond_9
    invoke-virtual {v6, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_4
    .catchall {:try_start_12 .. :try_end_12} :catchall_2

    :try_start_13
    invoke-virtual {v4}, Ljava/io/File;->delete()Z
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_5
    .catchall {:try_start_13 .. :try_end_13} :catchall_2

    :catch_5
    :cond_a
    :try_start_14
    new-instance v9, Ljava/io/FileOutputStream;

    invoke-direct {v9, v15}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_e
    .catchall {:try_start_14 .. :try_end_14} :catchall_2

    :try_start_15
    new-instance v4, Ljava/io/BufferedOutputStream;

    invoke-direct {v4, v9}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_8
    .catchall {:try_start_15 .. :try_end_15} :catchall_1

    const/16 v7, 0x400

    :try_start_16
    new-array v7, v7, [B

    :goto_3
    invoke-virtual {v12, v7}, Ljava/util/zip/ZipInputStream;->read([B)I

    move-result v8
    :try_end_16
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_16} :catch_6
    .catchall {:try_start_16 .. :try_end_16} :catchall_0

    const/4 v15, 0x0

    if-lez v8, :cond_b

    :try_start_17
    invoke-virtual {v4, v7, v15, v8}, Ljava/io/BufferedOutputStream;->write([BII)V

    goto :goto_3

    :cond_b
    invoke-virtual {v4}, Ljava/io/BufferedOutputStream;->flush()V

    invoke-virtual {v4}, Ljava/io/BufferedOutputStream;->close()V

    invoke-virtual {v9}, Ljava/io/FileOutputStream;->flush()V

    invoke-virtual {v9}, Ljava/io/FileOutputStream;->close()V
    :try_end_17
    .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_17} :catch_7
    .catchall {:try_start_17 .. :try_end_17} :catchall_0

    move-object v14, v4

    move-object v13, v9

    move-object/from16 v4, v17

    move-object/from16 v7, v18

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    move-object v13, v9

    move-object v9, v4

    goto :goto_b

    :catch_6
    const/4 v15, 0x0

    :catch_7
    move-object v13, v9

    move-object v9, v4

    goto/16 :goto_12

    :catchall_1
    move-exception v0

    move-object v13, v9

    goto :goto_7

    :catch_8
    const/4 v15, 0x0

    move-object v13, v9

    goto :goto_8

    :cond_c
    const/4 v15, 0x0

    :goto_4
    const/4 v8, 0x0

    goto :goto_5

    :cond_d
    move-object/from16 v18, v7

    const/4 v0, 0x1

    const/4 v8, 0x1

    :goto_5
    if-eqz v14, :cond_e

    :try_start_18
    invoke-virtual {v14}, Ljava/io/BufferedOutputStream;->close()V
    :try_end_18
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_18} :catch_9

    goto :goto_6

    :catch_9
    nop

    :cond_e
    :goto_6
    if-eqz v13, :cond_f

    :try_start_19
    invoke-virtual {v13}, Ljava/io/FileOutputStream;->close()V
    :try_end_19
    .catch Ljava/lang/Exception; {:try_start_19 .. :try_end_19} :catch_a

    :catch_a
    :cond_f
    :try_start_1a
    invoke-virtual {v12}, Ljava/util/zip/ZipInputStream;->close()V
    :try_end_1a
    .catch Ljava/lang/Exception; {:try_start_1a .. :try_end_1a} :catch_b

    :catch_b
    :try_start_1b
    invoke-virtual {v11}, Ljava/io/BufferedInputStream;->close()V
    :try_end_1b
    .catch Ljava/lang/Exception; {:try_start_1b .. :try_end_1b} :catch_c

    :catch_c
    :try_start_1c
    invoke-virtual {v10}, Ljava/io/FileInputStream;->close()V
    :try_end_1c
    .catch Ljava/lang/Exception; {:try_start_1c .. :try_end_1c} :catch_1c

    goto/16 :goto_17

    :catchall_2
    move-exception v0

    :goto_7
    move-object v9, v14

    goto :goto_b

    :catch_d
    move-object/from16 v18, v7

    :catch_e
    const/4 v15, 0x0

    :goto_8
    move-object v9, v14

    goto :goto_12

    :catchall_3
    move-exception v0

    const/4 v9, 0x0

    goto :goto_a

    :catch_f
    move-object/from16 v18, v7

    const/4 v15, 0x0

    const/4 v9, 0x0

    goto :goto_11

    :catchall_4
    move-exception v0

    const/4 v9, 0x0

    goto :goto_9

    :catch_10
    move-object/from16 v18, v7

    const/4 v15, 0x0

    const/4 v9, 0x0

    goto :goto_10

    :catchall_5
    move-exception v0

    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_9
    const/4 v11, 0x0

    :goto_a
    const/4 v12, 0x0

    const/4 v13, 0x0

    :goto_b
    if-eqz v9, :cond_10

    :try_start_1d
    invoke-virtual {v9}, Ljava/io/BufferedOutputStream;->close()V
    :try_end_1d
    .catch Ljava/lang/Exception; {:try_start_1d .. :try_end_1d} :catch_11

    goto :goto_c

    :catch_11
    nop

    :cond_10
    :goto_c
    if-eqz v13, :cond_11

    :try_start_1e
    invoke-virtual {v13}, Ljava/io/FileOutputStream;->close()V
    :try_end_1e
    .catch Ljava/lang/Exception; {:try_start_1e .. :try_end_1e} :catch_12

    goto :goto_d

    :catch_12
    nop

    :cond_11
    :goto_d
    if-eqz v12, :cond_12

    :try_start_1f
    invoke-virtual {v12}, Ljava/util/zip/ZipInputStream;->close()V
    :try_end_1f
    .catch Ljava/lang/Exception; {:try_start_1f .. :try_end_1f} :catch_13

    goto :goto_e

    :catch_13
    nop

    :cond_12
    :goto_e
    if-eqz v11, :cond_13

    :try_start_20
    invoke-virtual {v11}, Ljava/io/BufferedInputStream;->close()V
    :try_end_20
    .catch Ljava/lang/Exception; {:try_start_20 .. :try_end_20} :catch_14

    goto :goto_f

    :catch_14
    nop

    :cond_13
    :goto_f
    if-eqz v10, :cond_14

    :try_start_21
    invoke-virtual {v10}, Ljava/io/FileInputStream;->close()V
    :try_end_21
    .catch Ljava/lang/Exception; {:try_start_21 .. :try_end_21} :catch_15

    :catch_15
    :cond_14
    throw v0

    :catch_16
    move-object/from16 v18, v7

    const/4 v15, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_10
    const/4 v11, 0x0

    :goto_11
    const/4 v12, 0x0

    const/4 v13, 0x0

    :goto_12
    if-eqz v9, :cond_15

    :try_start_22
    invoke-virtual {v9}, Ljava/io/BufferedOutputStream;->close()V
    :try_end_22
    .catch Ljava/lang/Exception; {:try_start_22 .. :try_end_22} :catch_17

    goto :goto_13

    :catch_17
    nop

    :cond_15
    :goto_13
    if-eqz v13, :cond_16

    :try_start_23
    invoke-virtual {v13}, Ljava/io/FileOutputStream;->close()V
    :try_end_23
    .catch Ljava/lang/Exception; {:try_start_23 .. :try_end_23} :catch_18

    goto :goto_14

    :catch_18
    nop

    :cond_16
    :goto_14
    if-eqz v12, :cond_17

    :try_start_24
    invoke-virtual {v12}, Ljava/util/zip/ZipInputStream;->close()V
    :try_end_24
    .catch Ljava/lang/Exception; {:try_start_24 .. :try_end_24} :catch_19

    goto :goto_15

    :catch_19
    nop

    :cond_17
    :goto_15
    if-eqz v11, :cond_18

    :try_start_25
    invoke-virtual {v11}, Ljava/io/BufferedInputStream;->close()V
    :try_end_25
    .catch Ljava/lang/Exception; {:try_start_25 .. :try_end_25} :catch_1a

    goto :goto_16

    :catch_1a
    nop

    :cond_18
    :goto_16
    if-eqz v10, :cond_19

    :try_start_26
    invoke-virtual {v10}, Ljava/io/FileInputStream;->close()V
    :try_end_26
    .catch Ljava/lang/Exception; {:try_start_26 .. :try_end_26} :catch_1b

    :catch_1b
    :cond_19
    const/4 v8, 0x0

    :catch_1c
    :goto_17
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1a
    :goto_18
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    new-instance v3, Ljava/io/File;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v4

    if-eqz v4, :cond_1a

    if-nez v8, :cond_1b

    iget-object v4, v1, Lcom/digdroid/alman/dig/g$d;->a:Lcom/digdroid/alman/dig/g;

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6, v2}, Lcom/digdroid/alman/dig/g;->d(Ljava/lang/String;Ljava/lang/String;)Z

    :cond_1b
    :try_start_27
    invoke-virtual {v3}, Ljava/io/File;->delete()Z
    :try_end_27
    .catch Ljava/lang/Exception; {:try_start_27 .. :try_end_27} :catch_1d

    goto :goto_18

    :catch_1d
    nop

    goto :goto_18

    :cond_1c
    :try_start_28
    invoke-virtual/range {v18 .. v18}, Ljava/io/File;->delete()Z
    :try_end_28
    .catch Ljava/lang/Exception; {:try_start_28 .. :try_end_28} :catch_1e

    :catch_1e
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method protected b(Ljava/lang/Boolean;)V
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/g$d;->a:Lcom/digdroid/alman/dig/g;

    invoke-static {v0}, Lcom/digdroid/alman/dig/g;->b(Lcom/digdroid/alman/dig/g;)Lcom/digdroid/alman/dig/g$c;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/g$d;->a:Lcom/digdroid/alman/dig/g;

    invoke-static {v0}, Lcom/digdroid/alman/dig/g;->b(Lcom/digdroid/alman/dig/g;)Lcom/digdroid/alman/dig/g$c;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-interface {v0, p1}, Lcom/digdroid/alman/dig/g$c;->X(Z)V

    :cond_0
    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/g$d;->a([Ljava/lang/Void;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/g$d;->b(Ljava/lang/Boolean;)V

    return-void
.end method
