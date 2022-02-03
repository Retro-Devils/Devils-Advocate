.class Lcom/digdroid/alman/dig/i2;
.super Ljava/io/File;
.source ""


# static fields
.field private static b:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lb/j/a/a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private c:Lb/j/a/a;

.field private d:Z

.field private e:Z

.field private f:Ljava/lang/String;

.field private g:I

.field private h:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/digdroid/alman/dig/i2;->b:Ljava/util/HashMap;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const-string v0, ""

    invoke-direct {p0, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/i2;->d:Z

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/i2;->e:Z

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/lang/String;

    iput v0, p0, Lcom/digdroid/alman/dig/i2;->g:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/net/Uri;)V
    .locals 2

    const-string v0, ""

    invoke-direct {p0, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/i2;->d:Z

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/i2;->e:Z

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/lang/String;

    iput v0, p0, Lcom/digdroid/alman/dig/i2;->g:I

    iput-object p1, p0, Lcom/digdroid/alman/dig/i2;->h:Landroid/content/Context;

    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lcom/digdroid/alman/dig/i2;->t(I)Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lb/j/a/a;)V
    .locals 2

    const-string v0, ""

    invoke-direct {p0, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/i2;->d:Z

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/i2;->e:Z

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/lang/String;

    iput v0, p0, Lcom/digdroid/alman/dig/i2;->g:I

    iput-object p1, p0, Lcom/digdroid/alman/dig/i2;->h:Landroid/content/Context;

    invoke-virtual {p2}, Lb/j/a/a;->k()Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lcom/digdroid/alman/dig/i2;->t(I)Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    const-string v0, ""

    invoke-direct {p0, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/i2;->d:Z

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/i2;->e:Z

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/lang/String;

    iput v0, p0, Lcom/digdroid/alman/dig/i2;->g:I

    iput-object p1, p0, Lcom/digdroid/alman/dig/i2;->h:Landroid/content/Context;

    iput-object p2, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lcom/digdroid/alman/dig/i2;->t(I)Z

    return-void
.end method

.method public constructor <init>(Ljava/io/File;Ljava/lang/String;)V
    .locals 4

    instance-of v0, p1, Lcom/digdroid/alman/dig/i2;

    const-string v1, "/"

    if-eqz v0, :cond_0

    move-object v2, p1

    check-cast v2, Lcom/digdroid/alman/dig/i2;

    iget-object v2, v2, Lcom/digdroid/alman/dig/i2;->f:Ljava/lang/String;

    if-eqz v2, :cond_0

    const-string v2, ""

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_0
    invoke-direct {p0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x0

    iput-boolean v2, p0, Lcom/digdroid/alman/dig/i2;->d:Z

    iput-boolean v2, p0, Lcom/digdroid/alman/dig/i2;->e:Z

    const/4 v3, 0x0

    iput-object v3, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/lang/String;

    iput v2, p0, Lcom/digdroid/alman/dig/i2;->g:I

    if-nez v0, :cond_1

    return-void

    :cond_1
    check-cast p1, Lcom/digdroid/alman/dig/i2;

    iget-object v0, p1, Lcom/digdroid/alman/dig/i2;->f:Ljava/lang/String;

    if-nez v0, :cond_2

    return-void

    :cond_2
    iget-object p1, p1, Lcom/digdroid/alman/dig/i2;->h:Landroid/content/Context;

    iput-object p1, p0, Lcom/digdroid/alman/dig/i2;->h:Landroid/content/Context;

    iput-object v0, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/lang/String;

    const-string p1, "/document/"

    invoke-virtual {v0, p1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    if-gez v0, :cond_4

    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/lang/String;

    const-string v2, "/tree/"

    invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    if-gez v0, :cond_3

    return-void

    :cond_3
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/lang/String;

    add-int/lit8 v0, v0, 0x6

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/lang/String;

    :cond_4
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lcom/digdroid/alman/dig/i2;->t(I)Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/digdroid/alman/dig/i2;->d:Z

    iput-boolean p1, p0, Lcom/digdroid/alman/dig/i2;->e:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/lang/String;

    iput p1, p0, Lcom/digdroid/alman/dig/i2;->g:I

    return-void
.end method

.method private a(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const/4 v1, 0x2

    new-array v2, v1, [Ljava/lang/String;

    const/4 v6, 0x0

    const-string v7, "_display_name"

    aput-object v7, v2, v6

    const/4 v1, 0x1

    const-string v8, "_size"

    aput-object v8, v2, v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p2

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    invoke-interface {v0, v7}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v0, v8}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    const-string v0, ""

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v2, "/"

    if-nez v0, :cond_1

    new-instance v0, Ljava/io/File;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->mkdir()Z

    :cond_0
    new-instance v0, Ljava/io/File;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {v0, p3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/io/File;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v3

    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {v0, p3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    :goto_0
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object p1

    new-instance p2, Ljava/io/FileOutputStream;

    invoke-direct {p2, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    const/16 p3, 0x400

    new-array p3, p3, [B

    :goto_1
    invoke-virtual {p1, p3}, Ljava/io/InputStream;->read([B)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_2

    invoke-virtual {p2, p3, v6, v1}, Ljava/io/FileOutputStream;->write([BII)V

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    invoke-virtual {p2}, Ljava/io/FileOutputStream;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    const-string p2, "Exception"

    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_2
    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private b(Ljava/lang/String;)Z
    .locals 1

    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result p1

    return p1
.end method

.method public static c(Ljava/io/File;)Lcom/digdroid/alman/dig/i2;
    .locals 2

    instance-of v0, p0, Lcom/digdroid/alman/dig/i2;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lcom/digdroid/alman/dig/i2;

    iget-object v1, v0, Lcom/digdroid/alman/dig/i2;->f:Ljava/lang/String;

    if-eqz v1, :cond_0

    new-instance p0, Lcom/digdroid/alman/dig/i2;

    invoke-direct {p0}, Lcom/digdroid/alman/dig/i2;-><init>()V

    iget-object v1, v0, Lcom/digdroid/alman/dig/i2;->h:Landroid/content/Context;

    iput-object v1, p0, Lcom/digdroid/alman/dig/i2;->h:Landroid/content/Context;

    iget-object v1, v0, Lcom/digdroid/alman/dig/i2;->c:Lb/j/a/a;

    iput-object v1, p0, Lcom/digdroid/alman/dig/i2;->c:Lb/j/a/a;

    iget-boolean v1, v0, Lcom/digdroid/alman/dig/i2;->d:Z

    iput-boolean v1, p0, Lcom/digdroid/alman/dig/i2;->d:Z

    iget-boolean v1, v0, Lcom/digdroid/alman/dig/i2;->e:Z

    iput-boolean v1, p0, Lcom/digdroid/alman/dig/i2;->e:Z

    iget-object v0, v0, Lcom/digdroid/alman/dig/i2;->f:Ljava/lang/String;

    iput-object v0, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/lang/String;

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/digdroid/alman/dig/i2;

    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/i2;-><init>(Ljava/lang/String;)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method

.method public static d(Landroid/content/Context;Ljava/lang/String;)Lcom/digdroid/alman/dig/i2;
    .locals 1

    const-string v0, "://"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/digdroid/alman/dig/i2;

    invoke-direct {v0, p0, p1}, Lcom/digdroid/alman/dig/i2;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/digdroid/alman/dig/i2;

    invoke-direct {v0, p1}, Lcom/digdroid/alman/dig/i2;-><init>(Ljava/lang/String;)V

    :goto_0
    return-object v0
.end method

.method private e(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    const/4 v0, 0x1

    new-array v3, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    const-string v7, "_data"

    aput-object v7, v3, v0

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    const/4 v6, 0x0

    move-object v2, p2

    move-object v4, p3

    move-object v5, p4

    invoke-virtual/range {v1 .. v6}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz p1, :cond_0

    :try_start_1
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1, v7}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result p2

    invoke-interface {p1, p2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    return-object p2

    :catchall_0
    move-exception p2

    move-object v0, p1

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    :cond_1
    return-object v0

    :catchall_1
    move-exception p2

    :goto_0
    if-eqz v0, :cond_2

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    :cond_2
    throw p2
.end method

.method private f(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;
    .locals 8

    const-string v0, "Size "

    const-string v1, "File Size"

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v3, p2

    invoke-virtual/range {v2 .. v7}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2

    const-string v3, "_display_name"

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    const-string v4, "_size"

    invoke-interface {v2, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v4}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    new-instance v2, Ljava/io/File;

    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v4

    invoke-direct {v2, v4, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object p1

    new-instance p2, Ljava/io/FileOutputStream;

    invoke-direct {p2, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    const/high16 v3, 0x100000

    invoke-virtual {p1}, Ljava/io/InputStream;->available()I

    move-result v4

    invoke-static {v4, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    new-array v3, v3, [B

    :goto_0
    invoke-virtual {p1, v3}, Ljava/io/InputStream;->read([B)I

    move-result v4

    const/4 v5, -0x1

    if-eq v4, v5, :cond_0

    const/4 v5, 0x0

    invoke-virtual {p2, v3, v5, v4}, Ljava/io/FileOutputStream;->write([BII)V

    goto :goto_0

    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/io/File;->length()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    invoke-virtual {p2}, Ljava/io/FileOutputStream;->close()V

    const-string p1, "File Path"

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Path "

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/io/File;->length()J

    move-result-wide v3

    invoke-virtual {p1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    const-string p2, "Exception"

    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_1
    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private h(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;
    .locals 1

    const-string v0, "whatsapp"

    invoke-direct {p0, p1, p2, v0}, Lcom/digdroid/alman/dig/i2;->a(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private l([Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    aget-object v0, p1, v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v2, 0x1

    aget-object p1, p1, v2

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "primary"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/digdroid/alman/dig/i2;->b(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SECONDARY_STORAGE"

    invoke-static {v1}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/digdroid/alman/dig/i2;->b(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "EXTERNAL_STORAGE"

    invoke-static {v1}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/digdroid/alman/dig/i2;->b(Ljava/lang/String;)Z

    move-result v0

    return-object p1
.end method

.method private n(Landroid/net/Uri;)Z
    .locals 1

    invoke-virtual {p1}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object p1

    const-string v0, "com.android.providers.downloads.documents"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method private o(Landroid/net/Uri;)Z
    .locals 1

    invoke-virtual {p1}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object p1

    const-string v0, "com.android.externalstorage.documents"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method private p(Landroid/net/Uri;)Z
    .locals 2

    invoke-virtual {p1}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.google.android.apps.docs.storage"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object p1

    const-string v0, "com.google.android.apps.docs.storage.legacy"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method private q(Landroid/net/Uri;)Z
    .locals 1

    invoke-virtual {p1}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object p1

    const-string v0, "com.google.android.apps.photos.content"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method private r(Landroid/net/Uri;)Z
    .locals 1

    invoke-virtual {p1}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object p1

    const-string v0, "com.android.providers.media.documents"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method private declared-synchronized t(I)Z
    .locals 10

    monitor-enter p0

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p1, v0, :cond_6

    :try_start_0
    iget-object v2, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/lang/String;

    const-string v3, "/document/"

    invoke-virtual {v2, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    if-gez v2, :cond_2

    sget-object p1, Lcom/digdroid/alman/dig/i2;->b:Ljava/util/HashMap;

    iget-object v2, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb/j/a/a;

    iput-object p1, p0, Lcom/digdroid/alman/dig/i2;->c:Lb/j/a/a;

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/digdroid/alman/dig/i2;->h:Landroid/content/Context;

    iget-object v2, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/lang/String;

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-static {p1, v2}, Lb/j/a/a;->i(Landroid/content/Context;Landroid/net/Uri;)Lb/j/a/a;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/i2;->c:Lb/j/a/a;

    :cond_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/i2;->c:Lb/j/a/a;

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-direct {p0, v0}, Lcom/digdroid/alman/dig/i2;->u(Z)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return p1

    :cond_2
    :try_start_1
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x15

    if-lt v3, v4, :cond_6

    iget-object v3, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/lang/String;

    invoke-virtual {v3, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    if-nez v3, :cond_3

    invoke-direct {p0, v1}, Lcom/digdroid/alman/dig/i2;->u(Z)Z

    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return p1

    :cond_3
    :try_start_2
    iget-object v4, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/lang/String;

    add-int/lit8 v2, v2, 0xa

    invoke-virtual {v4, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Landroid/provider/DocumentsContract;->buildDocumentUriUsingTree(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    if-nez v2, :cond_4

    invoke-direct {p0, v1}, Lcom/digdroid/alman/dig/i2;->u(Z)Z

    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return p1

    :cond_4
    :try_start_3
    iget-object v3, p0, Lcom/digdroid/alman/dig/i2;->h:Landroid/content/Context;

    invoke-static {v3, v2}, Lb/j/a/a;->h(Landroid/content/Context;Landroid/net/Uri;)Lb/j/a/a;

    move-result-object v2

    iput-object v2, p0, Lcom/digdroid/alman/dig/i2;->c:Lb/j/a/a;

    if-nez v2, :cond_5

    invoke-direct {p0, v1}, Lcom/digdroid/alman/dig/i2;->u(Z)Z

    move-result p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit p0

    return p1

    :cond_5
    :try_start_4
    invoke-virtual {v2}, Lb/j/a/a;->l()Z

    move-result v2

    if-nez v2, :cond_6

    invoke-direct {p0, v0}, Lcom/digdroid/alman/dig/i2;->u(Z)Z

    move-result p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit p0

    return p1

    :cond_6
    :try_start_5
    iget-object v2, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/lang/String;

    invoke-static {v2}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, ":"

    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    array-length v3, v2

    sub-int/2addr v3, v0

    aget-object v3, v2, v3

    const-string v4, "/"

    invoke-virtual {v3, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    aget-object v5, v2, v1

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ":"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v2, v2, v0

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "%3A"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_1
    array-length v6, v3

    if-ge v4, v6, :cond_a

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v4, 0x1

    aget-object v4, v3, v4

    invoke-static {v4}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lcom/digdroid/alman/dig/i2;->b:Ljava/util/HashMap;

    invoke-virtual {v5, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lb/j/a/a;

    iput-object v5, p0, Lcom/digdroid/alman/dig/i2;->c:Lb/j/a/a;

    if-nez v5, :cond_7

    iget-object v5, p0, Lcom/digdroid/alman/dig/i2;->h:Landroid/content/Context;

    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v6

    invoke-static {v5, v6}, Lb/j/a/a;->i(Landroid/content/Context;Landroid/net/Uri;)Lb/j/a/a;

    move-result-object v5

    iput-object v5, p0, Lcom/digdroid/alman/dig/i2;->c:Lb/j/a/a;

    if-eqz v5, :cond_7

    invoke-virtual {v5}, Lb/j/a/a;->a()Z

    move-result v5

    if-eqz v5, :cond_7

    sget-object v5, Lcom/digdroid/alman/dig/i2;->b:Ljava/util/HashMap;

    iget-object v6, p0, Lcom/digdroid/alman/dig/i2;->c:Lb/j/a/a;

    invoke-virtual {v5, v4, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    iget-object v5, p0, Lcom/digdroid/alman/dig/i2;->c:Lb/j/a/a;

    if-nez v5, :cond_8

    invoke-direct {p0, v1}, Lcom/digdroid/alman/dig/i2;->u(Z)Z

    move-result p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    monitor-exit p0

    return p1

    :cond_8
    :try_start_6
    invoke-virtual {v5}, Lb/j/a/a;->a()Z

    move-result v5

    if-eqz v5, :cond_9

    move-object v9, v4

    move v4, v2

    move-object v2, v9

    goto :goto_2

    :cond_9
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "%2F"

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    move-object v9, v4

    move v4, v2

    move-object v2, v9

    goto :goto_1

    :cond_a
    :goto_2
    if-nez v5, :cond_b

    invoke-direct {p0, v1}, Lcom/digdroid/alman/dig/i2;->u(Z)Z

    move-result p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    monitor-exit p0

    return p1

    :cond_b
    :try_start_7
    array-length v5, v3

    if-ne v4, v5, :cond_c

    invoke-direct {p0, v0}, Lcom/digdroid/alman/dig/i2;->u(Z)Z

    move-result p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    monitor-exit p0

    return p1

    :cond_c
    :goto_3
    :try_start_8
    array-length v5, v3

    if-ge v4, v5, :cond_14

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "%2F"

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v2, v3, v4

    invoke-static {v2}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    sget-object v5, Lcom/digdroid/alman/dig/i2;->b:Ljava/util/HashMap;

    invoke-virtual {v5, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lb/j/a/a;

    if-nez v5, :cond_d

    iget-object v5, p0, Lcom/digdroid/alman/dig/i2;->c:Lb/j/a/a;

    aget-object v6, v3, v4

    invoke-virtual {v5, v6}, Lb/j/a/a;->g(Ljava/lang/String;)Lb/j/a/a;

    move-result-object v5

    if-eqz v5, :cond_d

    invoke-virtual {v5}, Lb/j/a/a;->l()Z

    move-result v6

    if-eqz v6, :cond_d

    sget-object v6, Lcom/digdroid/alman/dig/i2;->b:Ljava/util/HashMap;

    invoke-virtual {v6, v2, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_d
    const/4 v6, 0x3

    const/4 v7, 0x2

    if-eq p1, v6, :cond_e

    if-ne p1, v7, :cond_f

    :cond_e
    if-eqz v5, :cond_f

    invoke-virtual {v5}, Lb/j/a/a;->f()Z

    move-result v8

    if-nez v8, :cond_f

    const/4 v5, 0x0

    :cond_f
    if-nez v5, :cond_12

    if-eq p1, v6, :cond_11

    if-ne p1, v7, :cond_10

    array-length v6, v3

    sub-int/2addr v6, v0

    if-ge v4, v6, :cond_10

    goto :goto_4

    :cond_10
    if-ne p1, v7, :cond_12

    iget-object v5, p0, Lcom/digdroid/alman/dig/i2;->c:Lb/j/a/a;

    const-string v6, "*/*"

    aget-object v7, v3, v4

    invoke-virtual {v5, v6, v7}, Lb/j/a/a;->d(Ljava/lang/String;Ljava/lang/String;)Lb/j/a/a;

    move-result-object v5

    goto :goto_5

    :cond_11
    :goto_4
    iget-object v5, p0, Lcom/digdroid/alman/dig/i2;->c:Lb/j/a/a;

    aget-object v6, v3, v4

    invoke-virtual {v5, v6}, Lb/j/a/a;->c(Ljava/lang/String;)Lb/j/a/a;

    move-result-object v5

    if-eqz v5, :cond_12

    sget-object v6, Lcom/digdroid/alman/dig/i2;->b:Ljava/util/HashMap;

    invoke-virtual {v6, v2, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_12
    :goto_5
    if-nez v5, :cond_13

    invoke-direct {p0, v1}, Lcom/digdroid/alman/dig/i2;->u(Z)Z

    move-result p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    monitor-exit p0

    return p1

    :cond_13
    :try_start_9
    iput-object v5, p0, Lcom/digdroid/alman/dig/i2;->c:Lb/j/a/a;

    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_14
    invoke-direct {p0, v0}, Lcom/digdroid/alman/dig/i2;->u(Z)Z

    move-result p1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    goto :goto_7

    :goto_6
    throw p1

    :goto_7
    goto :goto_6
.end method

.method private u(Z)Z
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/i2;->e:Z

    iput-boolean p1, p0, Lcom/digdroid/alman/dig/i2;->d:Z

    const/4 v0, 0x0

    iput v0, p0, Lcom/digdroid/alman/dig/i2;->g:I

    return p1
.end method


# virtual methods
.method public canExecute()Z
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/lang/String;

    if-nez v0, :cond_0

    invoke-super {p0}, Ljava/io/File;->canExecute()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0
.end method

.method public canRead()Z
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/lang/String;

    if-nez v0, :cond_0

    invoke-super {p0}, Ljava/io/File;->canRead()Z

    move-result v0

    return v0

    :cond_0
    iget-boolean v0, p0, Lcom/digdroid/alman/dig/i2;->d:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->c:Lb/j/a/a;

    invoke-virtual {v0}, Lb/j/a/a;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public canWrite()Z
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/lang/String;

    if-nez v0, :cond_0

    invoke-super {p0}, Ljava/io/File;->canWrite()Z

    move-result v0

    return v0

    :cond_0
    iget-boolean v0, p0, Lcom/digdroid/alman/dig/i2;->d:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->c:Lb/j/a/a;

    invoke-virtual {v0}, Lb/j/a/a;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public declared-synchronized delete()Z
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/lang/String;

    if-nez v0, :cond_0

    invoke-super {p0}, Ljava/io/File;->delete()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :cond_0
    :try_start_1
    iget-boolean v0, p0, Lcom/digdroid/alman/dig/i2;->d:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->c:Lb/j/a/a;

    invoke-virtual {v0}, Lb/j/a/a;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iput-boolean v1, p0, Lcom/digdroid/alman/dig/i2;->e:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public exists()Z
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/lang/String;

    if-nez v0, :cond_0

    invoke-super {p0}, Ljava/io/File;->exists()Z

    move-result v0

    return v0

    :cond_0
    iget-boolean v0, p0, Lcom/digdroid/alman/dig/i2;->d:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->c:Lb/j/a/a;

    invoke-virtual {v0}, Lb/j/a/a;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public g()Ljava/lang/String;
    .locals 15

    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/lang/String;

    if-nez v0, :cond_0

    invoke-super {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/digdroid/alman/dig/i2;->t(I)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return-object v2

    :cond_1
    iget-object v1, p0, Lcom/digdroid/alman/dig/i2;->c:Lb/j/a/a;

    invoke-virtual {v1}, Lb/j/a/a;->k()Landroid/net/Uri;

    move-result-object v1

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x13

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-string v9, "content"

    const/4 v10, 0x0

    if-lt v3, v4, :cond_15

    invoke-direct {p0, v1}, Lcom/digdroid/alman/dig/i2;->o(Landroid/net/Uri;)Z

    move-result v4

    const-string v11, ":"

    const-string v12, ""

    if-eqz v4, :cond_3

    invoke-static {v1}, Landroid/provider/DocumentsContract;->getDocumentId(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    aget-object v1, v0, v10

    invoke-direct {p0, v0}, Lcom/digdroid/alman/dig/i2;->l([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eq v0, v12, :cond_2

    return-object v0

    :cond_2
    return-object v2

    :cond_3
    invoke-direct {p0, v1}, Lcom/digdroid/alman/dig/i2;->n(Landroid/net/Uri;)Z

    move-result v4

    if-eqz v4, :cond_a

    const/16 v4, 0x17

    const-string v13, "content://downloads/public_downloads"

    const-string v14, "raw:"

    if-lt v3, v4, :cond_8

    :try_start_0
    iget-object v3, p0, Lcom/digdroid/alman/dig/i2;->h:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v3

    new-array v5, v0, [Ljava/lang/String;

    const-string v4, "_display_name"

    aput-object v4, v5, v10

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v4, v1

    invoke-virtual/range {v3 .. v8}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v3, :cond_4

    :try_start_1
    invoke-interface {v3}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v3, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v6

    invoke-virtual {v6}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "/Download/"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v5, :cond_4

    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    return-object v4

    :catchall_0
    move-exception v0

    move-object v2, v3

    goto :goto_0

    :cond_4
    if-eqz v3, :cond_5

    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    :cond_5
    invoke-static {v1}, Landroid/provider/DocumentsContract;->getDocumentId(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_a

    invoke-virtual {v3, v14}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-virtual {v3, v14, v12}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_6
    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/String;

    aput-object v13, v4, v10

    const-string v5, "content://downloads/my_downloads"

    aput-object v5, v4, v0

    aget-object v0, v4, v10

    :try_start_2
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-static {v3}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-static {v0, v3, v4}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    move-result-object v0

    iget-object v3, p0, Lcom/digdroid/alman/dig/i2;->h:Landroid/content/Context;

    invoke-direct {p0, v3, v0, v2, v2}, Lcom/digdroid/alman/dig/i2;->e(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_0

    return-object v0

    :catch_0
    invoke-virtual {v1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    const-string v1, "^/document/raw:"

    invoke-virtual {v0, v1, v12}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "^raw:"

    invoke-virtual {v0, v1, v12}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :catchall_1
    move-exception v0

    :goto_0
    if-eqz v2, :cond_7

    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    :cond_7
    throw v0

    :cond_8
    invoke-static {v1}, Landroid/provider/DocumentsContract;->getDocumentId(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v14}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-virtual {v3, v14, v12}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_9
    :try_start_3
    invoke-static {v13}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    invoke-static {v4, v5, v6}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    move-result-object v3
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_1

    :catch_1
    move-exception v3

    invoke-virtual {v3}, Ljava/lang/NumberFormatException;->printStackTrace()V

    move-object v3, v2

    :goto_1
    if-eqz v3, :cond_a

    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->h:Landroid/content/Context;

    invoke-direct {p0, v0, v3, v2, v2}, Lcom/digdroid/alman/dig/i2;->e(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_a
    invoke-direct {p0, v1}, Lcom/digdroid/alman/dig/i2;->r(Landroid/net/Uri;)Z

    move-result v3

    if-eqz v3, :cond_e

    invoke-static {v1}, Landroid/provider/DocumentsContract;->getDocumentId(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v11}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    aget-object v3, v1, v10

    const-string v4, "image"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_b

    sget-object v2, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    goto :goto_2

    :cond_b
    const-string v4, "video"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_c

    sget-object v2, Landroid/provider/MediaStore$Video$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    goto :goto_2

    :cond_c
    const-string v4, "audio"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_d

    sget-object v2, Landroid/provider/MediaStore$Audio$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    :cond_d
    :goto_2
    new-array v3, v0, [Ljava/lang/String;

    aget-object v0, v1, v0

    aput-object v0, v3, v10

    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->h:Landroid/content/Context;

    const-string v1, "_id=?"

    invoke-direct {p0, v0, v2, v1, v3}, Lcom/digdroid/alman/dig/i2;->e(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_e
    invoke-direct {p0, v1}, Lcom/digdroid/alman/dig/i2;->p(Landroid/net/Uri;)Z

    move-result v0

    if-eqz v0, :cond_f

    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->h:Landroid/content/Context;

    invoke-direct {p0, v0, v1}, Lcom/digdroid/alman/dig/i2;->f(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_f
    invoke-virtual {p0, v1}, Lcom/digdroid/alman/dig/i2;->s(Landroid/net/Uri;)Z

    move-result v0

    if-eqz v0, :cond_10

    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->h:Landroid/content/Context;

    invoke-direct {p0, v0, v1}, Lcom/digdroid/alman/dig/i2;->h(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_10
    invoke-virtual {v1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_14

    invoke-direct {p0, v1}, Lcom/digdroid/alman/dig/i2;->q(Landroid/net/Uri;)Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-virtual {v1}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_11
    invoke-direct {p0, v1}, Lcom/digdroid/alman/dig/i2;->p(Landroid/net/Uri;)Z

    move-result v0

    if-eqz v0, :cond_12

    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->h:Landroid/content/Context;

    invoke-direct {p0, v0, v1}, Lcom/digdroid/alman/dig/i2;->f(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_12
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1d

    if-lt v0, v3, :cond_13

    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->h:Landroid/content/Context;

    const-string v2, "userfiles"

    invoke-direct {p0, v0, v1, v2}, Lcom/digdroid/alman/dig/i2;->a(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_13
    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->h:Landroid/content/Context;

    invoke-direct {p0, v0, v1, v2, v2}, Lcom/digdroid/alman/dig/i2;->e(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_14
    invoke-virtual {v1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    const-string v3, "file"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_17

    invoke-virtual {v1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_15
    invoke-virtual {p0, v1}, Lcom/digdroid/alman/dig/i2;->s(Landroid/net/Uri;)Z

    move-result v3

    if-eqz v3, :cond_16

    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->h:Landroid/content/Context;

    invoke-direct {p0, v0, v1}, Lcom/digdroid/alman/dig/i2;->h(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_16
    invoke-virtual {v1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v9, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_17

    new-array v5, v0, [Ljava/lang/String;

    const-string v0, "_data"

    aput-object v0, v5, v10

    :try_start_4
    iget-object v3, p0, Lcom/digdroid/alman/dig/i2;->h:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v3

    const/4 v8, 0x0

    move-object v4, v1

    invoke-virtual/range {v3 .. v8}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v3

    if-eqz v3, :cond_17

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    return-object v0

    :catch_2
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_17
    return-object v2
.end method

.method public getAbsolutePath()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/lang/String;

    if-nez v0, :cond_0

    invoke-super {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/lang/String;

    if-nez v0, :cond_0

    invoke-super {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    iget-boolean v0, p0, Lcom/digdroid/alman/dig/i2;->d:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->c:Lb/j/a/a;

    invoke-virtual {v0}, Lb/j/a/a;->j()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    const-string v0, ""

    :goto_0
    return-object v0
.end method

.method public bridge synthetic getParentFile()Ljava/io/File;
    .locals 1

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/i2;->k()Lcom/digdroid/alman/dig/i2;

    move-result-object v0

    return-object v0
.end method

.method public getPath()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/lang/String;

    if-nez v0, :cond_0

    invoke-super {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public i()Ljava/io/InputStream;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/lang/String;

    if-nez v0, :cond_0

    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    return-object v0

    :cond_0
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/digdroid/alman/dig/i2;->t(I)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->h:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/i2;->c:Lb/j/a/a;

    invoke-virtual {v1}, Lb/j/a/a;->k()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public isDirectory()Z
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/lang/String;

    if-nez v0, :cond_0

    invoke-super {p0}, Ljava/io/File;->isDirectory()Z

    move-result v0

    return v0

    :cond_0
    iget-boolean v0, p0, Lcom/digdroid/alman/dig/i2;->d:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->c:Lb/j/a/a;

    invoke-virtual {v0}, Lb/j/a/a;->l()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public declared-synchronized j()Ljava/io/OutputStream;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/lang/String;

    if-nez v0, :cond_0

    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, p0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :cond_0
    const/4 v0, 0x2

    :try_start_1
    invoke-direct {p0, v0}, Lcom/digdroid/alman/dig/i2;->t(I)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->h:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/i2;->c:Lb/j/a/a;

    invoke-virtual {v1}, Lb/j/a/a;->k()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;)Ljava/io/OutputStream;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_1
    const/4 v0, 0x0

    monitor-exit p0

    return-object v0

    :goto_0
    monitor-exit p0

    throw v0
.end method

.method public k()Lcom/digdroid/alman/dig/i2;
    .locals 5

    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/lang/String;

    if-nez v0, :cond_0

    new-instance v0, Lcom/digdroid/alman/dig/i2;

    invoke-virtual {p0}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/digdroid/alman/dig/i2;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_0
    const-string v1, "%2F"

    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v0

    if-gez v0, :cond_1

    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/lang/String;

    const-string v1, "%2f"

    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v0

    :cond_1
    if-gez v0, :cond_2

    const/4 v0, 0x0

    goto :goto_0

    :cond_2
    new-instance v1, Lcom/digdroid/alman/dig/i2;

    iget-object v2, p0, Lcom/digdroid/alman/dig/i2;->h:Landroid/content/Context;

    iget-object v3, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/lang/String;

    const/4 v4, 0x0

    invoke-virtual {v3, v4, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/digdroid/alman/dig/i2;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    move-object v0, v1

    :goto_0
    return-object v0
.end method

.method public lastModified()J
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/lang/String;

    if-nez v0, :cond_0

    invoke-super {p0}, Ljava/io/File;->lastModified()J

    move-result-wide v0

    return-wide v0

    :cond_0
    iget-boolean v0, p0, Lcom/digdroid/alman/dig/i2;->d:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->c:Lb/j/a/a;

    invoke-virtual {v0}, Lb/j/a/a;->m()J

    move-result-wide v0

    goto :goto_0

    :cond_1
    const-wide/16 v0, 0x0

    :goto_0
    return-wide v0
.end method

.method public length()J
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/lang/String;

    if-nez v0, :cond_0

    invoke-super {p0}, Ljava/io/File;->length()J

    move-result-wide v0

    return-wide v0

    :cond_0
    iget-boolean v0, p0, Lcom/digdroid/alman/dig/i2;->d:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->c:Lb/j/a/a;

    invoke-virtual {v0}, Lb/j/a/a;->n()J

    move-result-wide v0

    goto :goto_0

    :cond_1
    const-wide/16 v0, 0x0

    :goto_0
    return-wide v0
.end method

.method public declared-synchronized listFiles()[Ljava/io/File;
    .locals 6

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/lang/String;

    if-nez v0, :cond_0

    invoke-super {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :cond_0
    :try_start_1
    iget-boolean v0, p0, Lcom/digdroid/alman/dig/i2;->d:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    monitor-exit p0

    return-object v1

    :cond_1
    :try_start_2
    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->c:Lb/j/a/a;

    invoke-virtual {v0}, Lb/j/a/a;->o()[Lb/j/a/a;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez v0, :cond_2

    monitor-exit p0

    return-object v1

    :cond_2
    :try_start_3
    array-length v1, v0

    new-array v1, v1, [Lcom/digdroid/alman/dig/i2;

    const/4 v2, 0x0

    :goto_0
    array-length v3, v0

    if-ge v2, v3, :cond_3

    new-instance v3, Lcom/digdroid/alman/dig/i2;

    iget-object v4, p0, Lcom/digdroid/alman/dig/i2;->h:Landroid/content/Context;

    aget-object v5, v0, v2

    invoke-direct {v3, v4, v5}, Lcom/digdroid/alman/dig/i2;-><init>(Landroid/content/Context;Lb/j/a/a;)V

    aput-object v3, v1, v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    monitor-exit p0

    return-object v1

    :catchall_0
    move-exception v0

    monitor-exit p0

    goto :goto_2

    :goto_1
    throw v0

    :goto_2
    goto :goto_1
.end method

.method public declared-synchronized listFiles(Ljava/io/FileFilter;)[Ljava/io/File;
    .locals 8

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/lang/String;

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Ljava/io/File;->listFiles(Ljava/io/FileFilter;)[Ljava/io/File;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :cond_0
    :try_start_1
    iget-boolean v0, p0, Lcom/digdroid/alman/dig/i2;->d:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    monitor-exit p0

    return-object v1

    :cond_1
    :try_start_2
    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->c:Lb/j/a/a;

    invoke-virtual {v0}, Lb/j/a/a;->o()[Lb/j/a/a;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez v0, :cond_2

    monitor-exit p0

    return-object v1

    :cond_2
    :try_start_3
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    array-length v2, v0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_4

    aget-object v5, v0, v4

    new-instance v6, Lcom/digdroid/alman/dig/i2;

    iget-object v7, p0, Lcom/digdroid/alman/dig/i2;->h:Landroid/content/Context;

    invoke-direct {v6, v7, v5}, Lcom/digdroid/alman/dig/i2;-><init>(Landroid/content/Context;Lb/j/a/a;)V

    invoke-interface {p1, v6}, Ljava/io/FileFilter;->accept(Ljava/io/File;)Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_4
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result p1

    new-array p1, p1, [Lcom/digdroid/alman/dig/i2;

    :goto_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v3, v0, :cond_5

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/digdroid/alman/dig/i2;

    aput-object v0, p1, v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_5
    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    goto :goto_3

    :goto_2
    throw p1

    :goto_3
    goto :goto_2
.end method

.method public m()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/lang/String;

    if-nez v0, :cond_0

    invoke-static {p0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    return-object v0

    :cond_0
    iget-boolean v0, p0, Lcom/digdroid/alman/dig/i2;->d:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->c:Lb/j/a/a;

    invoke-virtual {v0}, Lb/j/a/a;->k()Landroid/net/Uri;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public declared-synchronized mkdirs()Z
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/lang/String;

    if-nez v0, :cond_0

    invoke-super {p0}, Ljava/io/File;->mkdirs()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :cond_0
    const/4 v0, 0x3

    :try_start_1
    invoke-direct {p0, v0}, Lcom/digdroid/alman/dig/i2;->t(I)Z

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public s(Landroid/net/Uri;)Z
    .locals 1

    invoke-virtual {p1}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object p1

    const-string v0, "com.whatsapp.provider.media"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/lang/String;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-super {p0}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method
