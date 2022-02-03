.class Lcom/digdroid/alman/dig/q3$d;
.super Landroid/os/AsyncTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/digdroid/alman/dig/q3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
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
.field a:Landroid/app/Activity;

.field b:Landroid/content/Context;

.field c:Lcom/digdroid/alman/dig/s3;

.field d:Ljava/io/File;

.field e:Ljava/io/FileInputStream;

.field f:Ljava/io/BufferedInputStream;

.field g:Ljava/io/FileOutputStream;

.field h:Ljava/io/BufferedOutputStream;

.field i:Ljava/util/zip/ZipOutputStream;

.field j:Lcom/digdroid/alman/dig/c3;

.field k:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lcom/digdroid/alman/dig/s3;)V
    .locals 1

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/digdroid/alman/dig/q3$d;->d:Ljava/io/File;

    iput-object v0, p0, Lcom/digdroid/alman/dig/q3$d;->e:Ljava/io/FileInputStream;

    iput-object v0, p0, Lcom/digdroid/alman/dig/q3$d;->f:Ljava/io/BufferedInputStream;

    iput-object v0, p0, Lcom/digdroid/alman/dig/q3$d;->g:Ljava/io/FileOutputStream;

    iput-object v0, p0, Lcom/digdroid/alman/dig/q3$d;->h:Ljava/io/BufferedOutputStream;

    iput-object v0, p0, Lcom/digdroid/alman/dig/q3$d;->i:Ljava/util/zip/ZipOutputStream;

    iput-object p1, p0, Lcom/digdroid/alman/dig/q3$d;->a:Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/q3$d;->b:Landroid/content/Context;

    iput-object p2, p0, Lcom/digdroid/alman/dig/q3$d;->c:Lcom/digdroid/alman/dig/s3;

    invoke-static {p1}, Lcom/digdroid/alman/dig/c3;->k(Landroid/content/Context;)Lcom/digdroid/alman/dig/c3;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/q3$d;->j:Lcom/digdroid/alman/dig/c3;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/digdroid/alman/dig/q3$d;->k:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Ljava/lang/Boolean;
    .locals 12

    const-string p1, "none"

    const-string v0, "default"

    const-string v1, ""

    iget-object v2, p0, Lcom/digdroid/alman/dig/q3$d;->j:Lcom/digdroid/alman/dig/c3;

    const/4 v3, 0x0

    iput-boolean v3, v2, Lcom/digdroid/alman/dig/c3;->g:Z

    :try_start_0
    sget-object v2, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    invoke-static {v2}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    iget-object v4, p0, Lcom/digdroid/alman/dig/q3$d;->c:Lcom/digdroid/alman/dig/s3;

    const-string v5, "name"

    invoke-virtual {v4, v5}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/digdroid/alman/dig/a4;->w(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const-string v4, "theme"

    :cond_0
    new-instance v5, Ljava/io/File;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, ".zip"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v2, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v5, p0, Lcom/digdroid/alman/dig/q3$d;->d:Ljava/io/File;

    new-instance v2, Ljava/io/FileOutputStream;

    iget-object v5, p0, Lcom/digdroid/alman/dig/q3$d;->d:Ljava/io/File;

    invoke-direct {v2, v5}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    iput-object v2, p0, Lcom/digdroid/alman/dig/q3$d;->g:Ljava/io/FileOutputStream;

    new-instance v2, Ljava/io/BufferedOutputStream;

    iget-object v5, p0, Lcom/digdroid/alman/dig/q3$d;->g:Ljava/io/FileOutputStream;

    invoke-direct {v2, v5}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    iput-object v2, p0, Lcom/digdroid/alman/dig/q3$d;->h:Ljava/io/BufferedOutputStream;

    new-instance v2, Ljava/util/zip/ZipOutputStream;

    iget-object v5, p0, Lcom/digdroid/alman/dig/q3$d;->h:Ljava/io/BufferedOutputStream;

    invoke-direct {v2, v5}, Ljava/util/zip/ZipOutputStream;-><init>(Ljava/io/OutputStream;)V

    iput-object v2, p0, Lcom/digdroid/alman/dig/q3$d;->i:Ljava/util/zip/ZipOutputStream;

    const-string v2, "screenshots"

    const-string v5, "Screenshots"

    invoke-virtual {p0, v2, v5}, Lcom/digdroid/alman/dig/q3$d;->d(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    const/4 v5, 0x1

    if-eqz v2, :cond_1

    const-string v2, "tool_icons"

    const-string v6, "Toolbar"

    invoke-virtual {p0, v2, v6}, Lcom/digdroid/alman/dig/q3$d;->d(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_2

    const-string v2, "default_covers"

    const-string v6, "Default covers"

    invoke-virtual {p0, v2, v6}, Lcom/digdroid/alman/dig/q3$d;->d(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, 0x1

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    :goto_1
    const/4 v6, 0x0

    :goto_2
    sget-object v7, Lcom/digdroid/alman/dig/s;->q0:[Ljava/lang/String;

    array-length v8, v7

    if-ge v6, v8, :cond_f

    aget-object v7, v7, v6

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    move-object v8, v1

    goto :goto_3

    :cond_3
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, "_"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    :goto_3
    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    move-object v7, v1

    goto :goto_4

    :cond_4
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v9, p0, Lcom/digdroid/alman/dig/q3$d;->a:Landroid/app/Activity;

    sget-object v10, Lcom/digdroid/alman/dig/s;->p0:[I

    aget v10, v10, v6

    invoke-virtual {v9, v10}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, " "

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    :goto_4
    invoke-virtual {v7, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_5

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v3, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    :cond_5
    iget-object v9, p0, Lcom/digdroid/alman/dig/q3$d;->c:Lcom/digdroid/alman/dig/s3;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v11, "media"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_7

    if-eqz v2, :cond_6

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, "media_path"

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, "Background"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {p0, v2, v9}, Lcom/digdroid/alman/dig/q3$d;->d(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    const/4 v2, 0x1

    goto :goto_5

    :cond_6
    const/4 v2, 0x0

    :cond_7
    :goto_5
    iget-object v9, p0, Lcom/digdroid/alman/dig/q3$d;->c:Lcom/digdroid/alman/dig/s3;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v11, "sound"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_9

    if-eqz v2, :cond_8

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, "sound_path"

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, "Audio"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {p0, v2, v9}, Lcom/digdroid/alman/dig/q3$d;->d(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_8

    const/4 v2, 0x1

    goto :goto_6

    :cond_8
    const/4 v2, 0x0

    :cond_9
    :goto_6
    if-eqz v2, :cond_a

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, "icons"

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, "Icons"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {p0, v2, v9}, Lcom/digdroid/alman/dig/q3$d;->d(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_a

    const/4 v2, 0x1

    goto :goto_7

    :cond_a
    const/4 v2, 0x0

    :goto_7
    if-eqz v2, :cond_b

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, "system_backgrounds"

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, "System backgrounds"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {p0, v2, v9}, Lcom/digdroid/alman/dig/q3$d;->d(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_b

    const/4 v2, 0x1

    goto :goto_8

    :cond_b
    const/4 v2, 0x0

    :goto_8
    if-eqz v2, :cond_c

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, "system_audio"

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, "System audio"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {p0, v2, v9}, Lcom/digdroid/alman/dig/q3$d;->d(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_c

    const/4 v2, 0x1

    goto :goto_9

    :cond_c
    const/4 v2, 0x0

    :goto_9
    if-eqz v2, :cond_d

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, "foreground"

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v9, "Foreground"

    invoke-virtual {p0, v2, v9}, Lcom/digdroid/alman/dig/q3$d;->d(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_d

    const/4 v2, 0x1

    goto :goto_a

    :cond_d
    const/4 v2, 0x0

    :goto_a
    if-eqz v2, :cond_e

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "play_button"

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "Play button"

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0, v2, v7}, Lcom/digdroid/alman/dig/q3$d;->d(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_e

    const/4 v2, 0x1

    goto :goto_b

    :cond_e
    const/4 v2, 0x0

    :goto_b
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_2

    :cond_f
    if-eqz v2, :cond_10

    iget-object p1, p0, Lcom/digdroid/alman/dig/q3$d;->c:Lcom/digdroid/alman/dig/s3;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/n;->d()Ljava/lang/String;

    move-result-object p1

    const-string v0, "UTF-8"

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p1

    iget-object v0, p0, Lcom/digdroid/alman/dig/q3$d;->i:Ljava/util/zip/ZipOutputStream;

    new-instance v1, Ljava/util/zip/ZipEntry;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ".cfg"

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v4}, Ljava/util/zip/ZipEntry;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/zip/ZipOutputStream;->putNextEntry(Ljava/util/zip/ZipEntry;)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/q3$d;->i:Ljava/util/zip/ZipOutputStream;

    invoke-virtual {v0, p1}, Ljava/util/zip/ZipOutputStream;->write([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_6
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_10
    iget-object p1, p0, Lcom/digdroid/alman/dig/q3$d;->i:Ljava/util/zip/ZipOutputStream;

    if-eqz p1, :cond_11

    :try_start_1
    invoke-virtual {p1}, Ljava/util/zip/ZipOutputStream;->flush()V

    iget-object p1, p0, Lcom/digdroid/alman/dig/q3$d;->i:Ljava/util/zip/ZipOutputStream;

    invoke-virtual {p1}, Ljava/util/zip/ZipOutputStream;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_c

    :catch_0
    nop

    :cond_11
    :goto_c
    iget-object p1, p0, Lcom/digdroid/alman/dig/q3$d;->h:Ljava/io/BufferedOutputStream;

    if-eqz p1, :cond_12

    :try_start_2
    invoke-virtual {p1}, Ljava/io/BufferedOutputStream;->flush()V

    iget-object p1, p0, Lcom/digdroid/alman/dig/q3$d;->h:Ljava/io/BufferedOutputStream;

    invoke-virtual {p1}, Ljava/io/BufferedOutputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_d

    :catch_1
    nop

    :cond_12
    :goto_d
    iget-object p1, p0, Lcom/digdroid/alman/dig/q3$d;->g:Ljava/io/FileOutputStream;

    if-eqz p1, :cond_13

    :try_start_3
    invoke-virtual {p1}, Ljava/io/FileOutputStream;->flush()V

    iget-object p1, p0, Lcom/digdroid/alman/dig/q3$d;->g:Ljava/io/FileOutputStream;

    invoke-virtual {p1}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    :catch_2
    :cond_13
    move v3, v2

    goto :goto_12

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lcom/digdroid/alman/dig/q3$d;->i:Ljava/util/zip/ZipOutputStream;

    if-eqz v0, :cond_14

    :try_start_4
    invoke-virtual {v0}, Ljava/util/zip/ZipOutputStream;->flush()V

    iget-object v0, p0, Lcom/digdroid/alman/dig/q3$d;->i:Ljava/util/zip/ZipOutputStream;

    invoke-virtual {v0}, Ljava/util/zip/ZipOutputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    goto :goto_e

    :catch_3
    nop

    :cond_14
    :goto_e
    iget-object v0, p0, Lcom/digdroid/alman/dig/q3$d;->h:Ljava/io/BufferedOutputStream;

    if-eqz v0, :cond_15

    :try_start_5
    invoke-virtual {v0}, Ljava/io/BufferedOutputStream;->flush()V

    iget-object v0, p0, Lcom/digdroid/alman/dig/q3$d;->h:Ljava/io/BufferedOutputStream;

    invoke-virtual {v0}, Ljava/io/BufferedOutputStream;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4

    goto :goto_f

    :catch_4
    nop

    :cond_15
    :goto_f
    iget-object v0, p0, Lcom/digdroid/alman/dig/q3$d;->g:Ljava/io/FileOutputStream;

    if-eqz v0, :cond_16

    :try_start_6
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->flush()V

    iget-object v0, p0, Lcom/digdroid/alman/dig/q3$d;->g:Ljava/io/FileOutputStream;

    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_5

    :catch_5
    :cond_16
    throw p1

    :catch_6
    nop

    iget-object p1, p0, Lcom/digdroid/alman/dig/q3$d;->i:Ljava/util/zip/ZipOutputStream;

    if-eqz p1, :cond_17

    :try_start_7
    invoke-virtual {p1}, Ljava/util/zip/ZipOutputStream;->flush()V

    iget-object p1, p0, Lcom/digdroid/alman/dig/q3$d;->i:Ljava/util/zip/ZipOutputStream;

    invoke-virtual {p1}, Ljava/util/zip/ZipOutputStream;->close()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_7

    goto :goto_10

    :catch_7
    nop

    :cond_17
    :goto_10
    iget-object p1, p0, Lcom/digdroid/alman/dig/q3$d;->h:Ljava/io/BufferedOutputStream;

    if-eqz p1, :cond_18

    :try_start_8
    invoke-virtual {p1}, Ljava/io/BufferedOutputStream;->flush()V

    iget-object p1, p0, Lcom/digdroid/alman/dig/q3$d;->h:Ljava/io/BufferedOutputStream;

    invoke-virtual {p1}, Ljava/io/BufferedOutputStream;->close()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_8

    goto :goto_11

    :catch_8
    nop

    :cond_18
    :goto_11
    iget-object p1, p0, Lcom/digdroid/alman/dig/q3$d;->g:Ljava/io/FileOutputStream;

    if-eqz p1, :cond_19

    :try_start_9
    invoke-virtual {p1}, Ljava/io/FileOutputStream;->flush()V

    iget-object p1, p0, Lcom/digdroid/alman/dig/q3$d;->g:Ljava/io/FileOutputStream;

    invoke-virtual {p1}, Ljava/io/FileOutputStream;->close()V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_9

    :catch_9
    :cond_19
    :goto_12
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method protected b(Ljava/lang/Boolean;)V
    .locals 4

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/q3$d;->d:Ljava/io/File;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/q3$d;->d:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->delete()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    :cond_0
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    const/4 v0, 0x0

    const/4 v1, 0x0

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/digdroid/alman/dig/q3$d;->j:Lcom/digdroid/alman/dig/c3;

    iget-boolean p1, p1, Lcom/digdroid/alman/dig/c3;->g:Z

    if-nez p1, :cond_1

    :try_start_1
    iget-object p1, p0, Lcom/digdroid/alman/dig/q3$d;->a:Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result p1

    if-nez p1, :cond_1

    new-instance p1, Landroidx/appcompat/app/b$a;

    iget-object v2, p0, Lcom/digdroid/alman/dig/q3$d;->a:Landroid/app/Activity;

    invoke-static {}, Lcom/digdroid/alman/dig/q3;->c()I

    move-result v3

    invoke-direct {p1, v2, v3}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    const v2, 0x7f110056

    invoke-virtual {p1, v2}, Landroidx/appcompat/app/b$a;->h(I)Landroidx/appcompat/app/b$a;

    move-result-object p1

    const v2, 0x7f1101da

    invoke-virtual {p1, v2, v1}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroidx/appcompat/app/b$a;->d(Z)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :cond_1
    iget-object p1, p0, Lcom/digdroid/alman/dig/q3$d;->b:Landroid/content/Context;

    invoke-static {p1, v1, v0}, Lcom/digdroid/alman/dig/q3;->n(Landroid/content/Context;Ljava/lang/String;I)V

    return-void
.end method

.method c(Ljava/io/File;Ljava/lang/String;)Z
    .locals 8

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/digdroid/alman/dig/q3$d;->a:Landroid/app/Activity;

    const v2, 0x7f110021

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/q3$d;->a:Landroid/app/Activity;

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Lcom/digdroid/alman/dig/q3;->n(Landroid/content/Context;Ljava/lang/String;I)V

    const/16 v1, 0x400

    new-array v1, v1, [B

    invoke-virtual {p1}, Ljava/io/File;->length()J

    move-result-wide v3

    long-to-float v3, v3

    const/high16 v4, 0x42c80000    # 100.0f

    div-float v5, v3, v4

    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v5

    const/16 v6, 0x2710

    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    move-result v5

    :try_start_0
    new-instance v6, Ljava/io/FileInputStream;

    invoke-direct {v6, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    iput-object v6, p0, Lcom/digdroid/alman/dig/q3$d;->e:Ljava/io/FileInputStream;

    new-instance v6, Ljava/io/BufferedInputStream;

    iget-object v7, p0, Lcom/digdroid/alman/dig/q3$d;->e:Ljava/io/FileInputStream;

    invoke-direct {v6, v7}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    iput-object v6, p0, Lcom/digdroid/alman/dig/q3$d;->f:Ljava/io/BufferedInputStream;

    new-instance v6, Ljava/util/zip/ZipEntry;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "/"

    invoke-virtual {v7, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v7, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v6, p2}, Ljava/util/zip/ZipEntry;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/io/File;->length()J

    move-result-wide p1

    invoke-virtual {v6, p1, p2}, Ljava/util/zip/ZipEntry;->setSize(J)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/q3$d;->i:Ljava/util/zip/ZipOutputStream;

    invoke-virtual {p1, v6}, Ljava/util/zip/ZipOutputStream;->putNextEntry(Ljava/util/zip/ZipEntry;)V

    const/4 p1, 0x0

    :goto_0
    const/4 p2, 0x0

    :cond_0
    iget-object v6, p0, Lcom/digdroid/alman/dig/q3$d;->f:Ljava/io/BufferedInputStream;

    invoke-virtual {v6, v1}, Ljava/io/BufferedInputStream;->read([B)I

    move-result v6

    if-lez v6, :cond_2

    iget-object v7, p0, Lcom/digdroid/alman/dig/q3$d;->j:Lcom/digdroid/alman/dig/c3;

    iget-boolean v7, v7, Lcom/digdroid/alman/dig/c3;->g:Z

    if-eqz v7, :cond_1

    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    iget-object v7, p0, Lcom/digdroid/alman/dig/q3$d;->i:Ljava/util/zip/ZipOutputStream;

    invoke-virtual {v7, v1, v2, v6}, Ljava/util/zip/ZipOutputStream;->write([BII)V

    add-int/2addr p1, v6

    add-int/2addr p2, v6

    if-lt p2, v5, :cond_0

    iget-object p2, p0, Lcom/digdroid/alman/dig/q3$d;->b:Landroid/content/Context;

    int-to-float v6, p1

    mul-float v6, v6, v4

    div-float/2addr v6, v3

    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    move-result v6

    int-to-float v6, v6

    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    move-result v6

    invoke-static {p2, v0, v6}, Lcom/digdroid/alman/dig/q3;->n(Landroid/content/Context;Ljava/lang/String;I)V

    goto :goto_0

    :cond_2
    const/4 p1, 0x1

    :goto_1
    iget-object p2, p0, Lcom/digdroid/alman/dig/q3$d;->i:Ljava/util/zip/ZipOutputStream;

    invoke-virtual {p2}, Ljava/util/zip/ZipOutputStream;->closeEntry()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p2, p0, Lcom/digdroid/alman/dig/q3$d;->f:Ljava/io/BufferedInputStream;

    if-eqz p2, :cond_3

    :try_start_1
    invoke-virtual {p2}, Ljava/io/BufferedInputStream;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    nop

    :cond_3
    :goto_2
    iget-object p2, p0, Lcom/digdroid/alman/dig/q3$d;->e:Ljava/io/FileInputStream;

    if-eqz p2, :cond_4

    :try_start_2
    invoke-virtual {p2}, Ljava/io/FileInputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    :cond_4
    move v2, p1

    goto :goto_5

    :catchall_0
    move-exception p1

    iget-object p2, p0, Lcom/digdroid/alman/dig/q3$d;->f:Ljava/io/BufferedInputStream;

    if-eqz p2, :cond_5

    :try_start_3
    invoke-virtual {p2}, Ljava/io/BufferedInputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_3

    :catch_2
    nop

    :cond_5
    :goto_3
    iget-object p2, p0, Lcom/digdroid/alman/dig/q3$d;->e:Ljava/io/FileInputStream;

    if-eqz p2, :cond_6

    :try_start_4
    invoke-virtual {p2}, Ljava/io/FileInputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    :catch_3
    :cond_6
    throw p1

    :catch_4
    nop

    iget-object p1, p0, Lcom/digdroid/alman/dig/q3$d;->f:Ljava/io/BufferedInputStream;

    if-eqz p1, :cond_7

    :try_start_5
    invoke-virtual {p1}, Ljava/io/BufferedInputStream;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    goto :goto_4

    :catch_5
    nop

    :cond_7
    :goto_4
    iget-object p1, p0, Lcom/digdroid/alman/dig/q3$d;->e:Ljava/io/FileInputStream;

    if-eqz p1, :cond_8

    :try_start_6
    invoke-virtual {p1}, Ljava/io/FileInputStream;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_6

    :catch_6
    :cond_8
    :goto_5
    return v2
.end method

.method d(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 8

    iget-object v0, p0, Lcom/digdroid/alman/dig/q3$d;->c:Lcom/digdroid/alman/dig/s3;

    invoke-virtual {v0, p1}, Lcom/digdroid/alman/dig/s3;->I(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    return v2

    :cond_0
    iget-object v1, p0, Lcom/digdroid/alman/dig/q3$d;->k:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object p2, p0, Lcom/digdroid/alman/dig/q3$d;->c:Lcom/digdroid/alman/dig/s3;

    iget-object v1, p0, Lcom/digdroid/alman/dig/q3$d;->k:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p2, p1, v0}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    return v2

    :cond_1
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_2

    return v2

    :cond_2
    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_6

    iget-object v3, p0, Lcom/digdroid/alman/dig/q3$d;->c:Lcom/digdroid/alman/dig/s3;

    invoke-virtual {v3, p1, p2}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object p1

    array-length v1, p1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_5

    aget-object v5, p1, v3

    iget-object v6, p0, Lcom/digdroid/alman/dig/q3$d;->j:Lcom/digdroid/alman/dig/c3;

    iget-boolean v6, v6, Lcom/digdroid/alman/dig/c3;->g:Z

    if-eqz v6, :cond_3

    return v4

    :cond_3
    invoke-virtual {v5}, Ljava/io/File;->isDirectory()Z

    move-result v6

    if-nez v6, :cond_4

    invoke-virtual {p0, v5, p2}, Lcom/digdroid/alman/dig/q3$d;->c(Ljava/io/File;Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_4

    return v4

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_5
    iget-object p1, p0, Lcom/digdroid/alman/dig/q3$d;->k:Ljava/util/HashMap;

    goto :goto_1

    :cond_6
    iget-object v3, p0, Lcom/digdroid/alman/dig/q3$d;->c:Lcom/digdroid/alman/dig/s3;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "/"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, p1, v5}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v1, p2}, Lcom/digdroid/alman/dig/q3$d;->c(Ljava/io/File;Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_7

    return v4

    :cond_7
    iget-object p1, p0, Lcom/digdroid/alman/dig/q3$d;->k:Ljava/util/HashMap;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    :goto_1
    invoke-virtual {p1, v0, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return v2
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/q3$d;->a([Ljava/lang/Void;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/q3$d;->b(Ljava/lang/Boolean;)V

    return-void
.end method
