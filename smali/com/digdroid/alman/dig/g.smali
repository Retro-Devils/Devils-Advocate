.class public Lcom/digdroid/alman/dig/g;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/digdroid/alman/dig/g$d;,
        Lcom/digdroid/alman/dig/g$b;,
        Lcom/digdroid/alman/dig/g$c;,
        Lcom/digdroid/alman/dig/g$a;
    }
.end annotation


# instance fields
.field private a:Lcom/digdroid/alman/dig/g$a;

.field private b:Lcom/digdroid/alman/dig/g$c;

.field c:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/digdroid/alman/dig/g;->a:Lcom/digdroid/alman/dig/g$a;

    iput-object v0, p0, Lcom/digdroid/alman/dig/g;->b:Lcom/digdroid/alman/dig/g$c;

    iput-object p1, p0, Lcom/digdroid/alman/dig/g;->c:Landroid/content/Context;

    return-void
.end method

.method static synthetic a(Lcom/digdroid/alman/dig/g;)Lcom/digdroid/alman/dig/g$a;
    .locals 0

    iget-object p0, p0, Lcom/digdroid/alman/dig/g;->a:Lcom/digdroid/alman/dig/g$a;

    return-object p0
.end method

.method static synthetic b(Lcom/digdroid/alman/dig/g;)Lcom/digdroid/alman/dig/g$c;
    .locals 0

    iget-object p0, p0, Lcom/digdroid/alman/dig/g;->b:Lcom/digdroid/alman/dig/g$c;

    return-object p0
.end method


# virtual methods
.method c()V
    .locals 5

    sget-object v0, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    invoke-static {v0}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    new-instance v1, Lcom/digdroid/alman/dig/g$b;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/g$b;-><init>(Lcom/digdroid/alman/dig/g;)V

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/dig_backup_"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v4, "yyyyMMddHHmmss"

    invoke-direct {v0, v4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    new-instance v4, Ljava/util/Date;

    invoke-direct {v4}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0, v4}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ".bak"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    aput-object v0, v2, v3

    invoke-virtual {v1, v2}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

.method d(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x0

    :try_start_0
    new-instance v2, Ljava/io/FileInputStream;

    invoke-direct {v2, p1}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4

    :try_start_1
    new-instance p1, Ljava/io/BufferedInputStream;

    invoke-direct {p1, v2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    :try_start_2
    new-instance v3, Ljava/io/FileOutputStream;

    invoke-direct {v3, p2}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    :try_start_3
    new-instance v4, Ljava/io/BufferedOutputStream;

    invoke-direct {v4, v3}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    const/16 v1, 0x400

    :try_start_4
    new-array v1, v1, [B

    :goto_0
    invoke-virtual {p1, v1}, Ljava/io/BufferedInputStream;->read([B)I

    move-result v5

    if-lez v5, :cond_0

    invoke-virtual {v4, v1, v0, v5}, Ljava/io/BufferedOutputStream;->write([BII)V

    goto :goto_0

    :cond_0
    invoke-virtual {v4}, Ljava/io/BufferedOutputStream;->flush()V

    invoke-virtual {v4}, Ljava/io/BufferedOutputStream;->close()V

    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V

    invoke-virtual {p1}, Ljava/io/BufferedInputStream;->close()V

    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    const/4 p1, 0x1

    return p1

    :catch_0
    move-object v1, v4

    goto :goto_1

    :catch_1
    nop

    goto :goto_1

    :catch_2
    move-object v3, v1

    goto :goto_1

    :catch_3
    move-object p1, v1

    move-object v3, p1

    goto :goto_1

    :catch_4
    move-object p1, v1

    move-object v2, p1

    move-object v3, v2

    :goto_1
    if-eqz v1, :cond_1

    :try_start_5
    invoke-virtual {v1}, Ljava/io/BufferedOutputStream;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    goto :goto_2

    :catch_5
    nop

    :cond_1
    :goto_2
    if-eqz v3, :cond_2

    :try_start_6
    invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_6

    goto :goto_3

    :catch_6
    nop

    :cond_2
    :goto_3
    if-eqz p1, :cond_3

    :try_start_7
    invoke-virtual {p1}, Ljava/io/BufferedInputStream;->close()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_7

    goto :goto_4

    :catch_7
    nop

    :cond_3
    :goto_4
    if-eqz v2, :cond_4

    :try_start_8
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_8

    goto :goto_5

    :catch_8
    nop

    :cond_4
    :goto_5
    new-instance p1, Ljava/io/File;

    invoke-direct {p1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result p2

    if-eqz p2, :cond_5

    :try_start_9
    invoke-virtual {p1}, Ljava/io/File;->delete()Z
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_9

    :catch_9
    :cond_5
    return v0
.end method

.method e()V
    .locals 6

    iget-object v0, p0, Lcom/digdroid/alman/dig/g;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/digdroid/alman/dig/h2;->b(Landroid/content/Context;)[Ljava/io/File;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    array-length v2, v0

    if-lez v2, :cond_1

    new-instance v2, Ljava/io/File;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    aget-object v0, v0, v1

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    const-string v4, "\\/Android.*"

    const-string v5, ""

    invoke-virtual {v0, v4, v5}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/Dig/backup"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    :try_start_0
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    new-instance v0, Lcom/digdroid/alman/dig/g$b;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/g$b;-><init>(Lcom/digdroid/alman/dig/g;)V

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/dig_backup.bak"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v3, v1

    invoke-virtual {v0, v3}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/digdroid/alman/dig/g;->a:Lcom/digdroid/alman/dig/g$a;

    if-eqz v0, :cond_2

    invoke-interface {v0, v1}, Lcom/digdroid/alman/dig/g$a;->a(Z)V

    :cond_2
    :goto_0
    return-void
.end method

.method f()V
    .locals 2

    new-instance v0, Lcom/digdroid/alman/dig/g$d;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/g$d;-><init>(Lcom/digdroid/alman/dig/g;)V

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

.method public g(Lcom/digdroid/alman/dig/g$a;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/g;->a:Lcom/digdroid/alman/dig/g$a;

    return-void
.end method

.method public h(Lcom/digdroid/alman/dig/g$c;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/g;->b:Lcom/digdroid/alman/dig/g$c;

    return-void
.end method

.method i(Ljava/io/BufferedInputStream;Ljava/util/zip/ZipOutputStream;Ljava/lang/String;)Z
    .locals 3

    const/16 v0, 0x400

    new-array v0, v0, [B

    const/4 v1, 0x0

    :try_start_0
    new-instance v2, Ljava/util/zip/ZipEntry;

    invoke-direct {v2, p3}, Ljava/util/zip/ZipEntry;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v2}, Ljava/util/zip/ZipOutputStream;->putNextEntry(Ljava/util/zip/ZipEntry;)V

    :goto_0
    invoke-virtual {p1, v0}, Ljava/io/BufferedInputStream;->read([B)I

    move-result p3

    if-lez p3, :cond_0

    invoke-virtual {p2, v0, v1, p3}, Ljava/util/zip/ZipOutputStream;->write([BII)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Ljava/util/zip/ZipOutputStream;->closeEntry()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    return p1

    :catch_0
    return v1
.end method
