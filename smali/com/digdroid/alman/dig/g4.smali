.class Lcom/digdroid/alman/dig/g4;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/digdroid/alman/dig/g4$a;
    }
.end annotation


# static fields
.field static a:Ljava/util/regex/Pattern;


# instance fields
.field b:Ljava/lang/String;

.field c:Ljava/lang/String;

.field d:Le/a/a/a/b/b/l;

.field e:Ljava/util/zip/ZipFile;

.field f:Landroid/net/Uri;

.field g:Ljava/util/Enumeration;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Enumeration<",
            "+",
            "Ljava/util/zip/ZipEntry;",
            ">;"
        }
    .end annotation
.end field

.field h:Landroid/content/Context;

.field i:Ljava/io/InputStream;

.field j:Ljava/io/FileInputStream;

.field k:Ljava/io/BufferedInputStream;

.field l:Ljava/util/zip/ZipInputStream;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, ".+\\.(zip|7z)$"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/digdroid/alman/dig/g4;->a:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/digdroid/alman/dig/g4;->i:Ljava/io/InputStream;

    iput-object v0, p0, Lcom/digdroid/alman/dig/g4;->j:Ljava/io/FileInputStream;

    iput-object v0, p0, Lcom/digdroid/alman/dig/g4;->k:Ljava/io/BufferedInputStream;

    iput-object v0, p0, Lcom/digdroid/alman/dig/g4;->l:Ljava/util/zip/ZipInputStream;

    iput-object p1, p0, Lcom/digdroid/alman/dig/g4;->h:Landroid/content/Context;

    iput-object p2, p0, Lcom/digdroid/alman/dig/g4;->b:Ljava/lang/String;

    iput-object v0, p0, Lcom/digdroid/alman/dig/g4;->d:Le/a/a/a/b/b/l;

    iput-object v0, p0, Lcom/digdroid/alman/dig/g4;->e:Ljava/util/zip/ZipFile;

    iput-object v0, p0, Lcom/digdroid/alman/dig/g4;->f:Landroid/net/Uri;

    sget-object v1, Lcom/digdroid/alman/dig/g4;->a:Ljava/util/regex/Pattern;

    invoke-virtual {p2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    move-result v2

    if-nez v2, :cond_0

    return-void

    :cond_0
    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/digdroid/alman/dig/g4;->c:Ljava/lang/String;

    const-string v2, "zip"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    :try_start_0
    const-string v1, "://"

    invoke-virtual {p2, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {p1, p2}, Lcom/digdroid/alman/dig/i2;->d(Landroid/content/Context;Ljava/lang/String;)Lcom/digdroid/alman/dig/i2;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/i2;->m()Landroid/net/Uri;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/g4;->f:Landroid/net/Uri;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/g4;->f()V

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/util/zip/ZipFile;

    invoke-direct {p1, p2}, Ljava/util/zip/ZipFile;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/digdroid/alman/dig/g4;->e:Ljava/util/zip/ZipFile;

    invoke-virtual {p1}, Ljava/util/zip/ZipFile;->entries()Ljava/util/Enumeration;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/g4;->g:Ljava/util/Enumeration;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    iget-object p1, p0, Lcom/digdroid/alman/dig/g4;->e:Ljava/util/zip/ZipFile;

    if-eqz p1, :cond_2

    :try_start_1
    invoke-virtual {p1}, Ljava/util/zip/ZipFile;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    iput-object v0, p0, Lcom/digdroid/alman/dig/g4;->e:Ljava/util/zip/ZipFile;

    :cond_2
    :goto_0
    return-void

    :cond_3
    iget-object p1, p0, Lcom/digdroid/alman/dig/g4;->c:Ljava/lang/String;

    const-string v1, "7z"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    :try_start_2
    new-instance p1, Le/a/a/a/b/b/l;

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v1}, Le/a/a/a/b/b/l;-><init>(Ljava/io/File;)V

    iput-object p1, p0, Lcom/digdroid/alman/dig/g4;->d:Le/a/a/a/b/b/l;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_1

    :catch_2
    nop

    iget-object p1, p0, Lcom/digdroid/alman/dig/g4;->d:Le/a/a/a/b/b/l;

    if-eqz p1, :cond_4

    :try_start_3
    invoke-virtual {p1}, Le/a/a/a/b/b/l;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    :cond_4
    iput-object v0, p0, Lcom/digdroid/alman/dig/g4;->d:Le/a/a/a/b/b/l;

    :cond_5
    :goto_1
    return-void
.end method

.method static declared-synchronized c(Ljava/lang/String;)Z
    .locals 5

    const-class v0, Lcom/digdroid/alman/dig/g4;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/digdroid/alman/dig/g4;->a:Ljava/util/regex/Pattern;

    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    const-string v4, "7z"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    :try_start_1
    new-instance v1, Le/a/a/a/b/b/l;

    new-instance v4, Ljava/io/File;

    invoke-direct {v4, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v4}, Le/a/a/a/b/b/l;-><init>(Ljava/io/File;)V

    invoke-virtual {v1}, Le/a/a/a/b/b/l;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    monitor-exit v0

    return v3

    :cond_0
    :goto_0
    monitor-exit v0

    return v2

    :cond_1
    monitor-exit v0

    return v3

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/g4;->l:Ljava/util/zip/ZipInputStream;

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {v0}, Ljava/util/zip/ZipInputStream;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/g4;->k:Ljava/io/BufferedInputStream;

    if-eqz v0, :cond_1

    :try_start_1
    invoke-virtual {v0}, Ljava/io/BufferedInputStream;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    nop

    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/digdroid/alman/dig/g4;->j:Ljava/io/FileInputStream;

    if-eqz v0, :cond_2

    :try_start_2
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    :catch_2
    nop

    :cond_2
    :goto_2
    iget-object v0, p0, Lcom/digdroid/alman/dig/g4;->e:Ljava/util/zip/ZipFile;

    if-eqz v0, :cond_3

    :try_start_3
    invoke-virtual {v0}, Ljava/util/zip/ZipFile;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_3

    :catch_3
    nop

    :cond_3
    :goto_3
    iget-object v0, p0, Lcom/digdroid/alman/dig/g4;->d:Le/a/a/a/b/b/l;

    if-eqz v0, :cond_4

    :try_start_4
    invoke-virtual {v0}, Le/a/a/a/b/b/l;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    :catch_4
    :cond_4
    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/g4;->c:Ljava/lang/String;

    return-object v0
.end method

.method public d()Lcom/digdroid/alman/dig/g4$a;
    .locals 5

    iget-object v0, p0, Lcom/digdroid/alman/dig/g4;->e:Ljava/util/zip/ZipFile;

    const/4 v1, 0x0

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/digdroid/alman/dig/g4;->f:Landroid/net/Uri;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/g4;->d:Le/a/a/a/b/b/l;

    if-eqz v0, :cond_3

    :try_start_0
    invoke-virtual {v0}, Le/a/a/a/b/b/l;->e()Le/a/a/a/b/b/k;

    move-result-object v0

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    new-instance v2, Lcom/digdroid/alman/dig/g4$a;

    invoke-direct {v2, p0}, Lcom/digdroid/alman/dig/g4$a;-><init>(Lcom/digdroid/alman/dig/g4;)V

    invoke-virtual {v0}, Le/a/a/a/b/b/k;->i()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, Lcom/digdroid/alman/dig/g4$a;->a:Ljava/lang/String;

    invoke-virtual {v0}, Le/a/a/a/b/b/k;->b()J

    move-result-wide v3

    iput-wide v3, v2, Lcom/digdroid/alman/dig/g4$a;->b:J

    invoke-virtual {v0}, Le/a/a/a/b/b/k;->e()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v0}, Le/a/a/a/b/b/k;->c()J

    move-result-wide v3

    iput-wide v3, v2, Lcom/digdroid/alman/dig/g4$a;->c:J

    goto :goto_0

    :cond_2
    const-wide/16 v3, 0x0

    iput-wide v3, v2, Lcom/digdroid/alman/dig/g4$a;->c:J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object v2

    :catch_0
    :cond_3
    return-object v1

    :cond_4
    :goto_1
    :try_start_1
    iget-object v0, p0, Lcom/digdroid/alman/dig/g4;->l:Ljava/util/zip/ZipInputStream;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/util/zip/ZipInputStream;->getNextEntry()Ljava/util/zip/ZipEntry;

    move-result-object v0

    goto :goto_2

    :cond_5
    iget-object v0, p0, Lcom/digdroid/alman/dig/g4;->g:Ljava/util/Enumeration;

    if-eqz v0, :cond_6

    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/digdroid/alman/dig/g4;->g:Ljava/util/Enumeration;

    invoke-interface {v0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/zip/ZipEntry;

    goto :goto_2

    :cond_6
    move-object v0, v1

    :goto_2
    if-nez v0, :cond_7

    return-object v1

    :cond_7
    new-instance v2, Lcom/digdroid/alman/dig/g4$a;

    invoke-direct {v2, p0}, Lcom/digdroid/alman/dig/g4$a;-><init>(Lcom/digdroid/alman/dig/g4;)V

    invoke-virtual {v0}, Ljava/util/zip/ZipEntry;->getName()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v2, Lcom/digdroid/alman/dig/g4$a;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/util/zip/ZipEntry;->getSize()J

    move-result-wide v3

    iput-wide v3, v2, Lcom/digdroid/alman/dig/g4$a;->b:J

    invoke-virtual {v0}, Ljava/util/zip/ZipEntry;->getCrc()J

    move-result-wide v3

    iput-wide v3, v2, Lcom/digdroid/alman/dig/g4$a;->c:J
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    return-object v2

    :catch_1
    return-object v1
.end method

.method public e()Ljava/util/zip/ZipEntry;
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/g4;->e:Ljava/util/zip/ZipFile;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/g4;->g:Ljava/util/Enumeration;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/g4;->g:Ljava/util/Enumeration;

    invoke-interface {v0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/zip/ZipEntry;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public f()V
    .locals 4

    iget-object v0, p0, Lcom/digdroid/alman/dig/g4;->e:Ljava/util/zip/ZipFile;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    new-instance v2, Ljava/io/File;

    iget-object v3, p0, Lcom/digdroid/alman/dig/g4;->b:Ljava/lang/String;

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    iput-object v0, p0, Lcom/digdroid/alman/dig/g4;->j:Ljava/io/FileInputStream;

    new-instance v0, Ljava/io/BufferedInputStream;

    iget-object v2, p0, Lcom/digdroid/alman/dig/g4;->j:Ljava/io/FileInputStream;

    invoke-direct {v0, v2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    iput-object v0, p0, Lcom/digdroid/alman/dig/g4;->k:Ljava/io/BufferedInputStream;

    new-instance v0, Ljava/util/zip/ZipInputStream;

    iget-object v2, p0, Lcom/digdroid/alman/dig/g4;->k:Ljava/io/BufferedInputStream;

    invoke-direct {v0, v2}, Ljava/util/zip/ZipInputStream;-><init>(Ljava/io/InputStream;)V

    iput-object v0, p0, Lcom/digdroid/alman/dig/g4;->l:Ljava/util/zip/ZipInputStream;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    nop

    iget-object v0, p0, Lcom/digdroid/alman/dig/g4;->l:Ljava/util/zip/ZipInputStream;

    if-eqz v0, :cond_0

    :try_start_1
    invoke-virtual {v0}, Ljava/util/zip/ZipInputStream;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    nop

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/g4;->k:Ljava/io/BufferedInputStream;

    if-eqz v0, :cond_1

    :try_start_2
    invoke-virtual {v0}, Ljava/io/BufferedInputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_1

    :catch_2
    nop

    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/digdroid/alman/dig/g4;->j:Ljava/io/FileInputStream;

    if-eqz v0, :cond_2

    :try_start_3
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    :cond_2
    iput-object v1, p0, Lcom/digdroid/alman/dig/g4;->l:Ljava/util/zip/ZipInputStream;

    iput-object v1, p0, Lcom/digdroid/alman/dig/g4;->k:Ljava/io/BufferedInputStream;

    iput-object v1, p0, Lcom/digdroid/alman/dig/g4;->j:Ljava/io/FileInputStream;

    :cond_3
    :goto_2
    iget-object v0, p0, Lcom/digdroid/alman/dig/g4;->f:Landroid/net/Uri;

    if-eqz v0, :cond_7

    :try_start_4
    iget-object v0, p0, Lcom/digdroid/alman/dig/g4;->h:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iget-object v2, p0, Lcom/digdroid/alman/dig/g4;->f:Landroid/net/Uri;

    invoke-virtual {v0, v2}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/g4;->i:Ljava/io/InputStream;

    new-instance v0, Ljava/io/BufferedInputStream;

    iget-object v2, p0, Lcom/digdroid/alman/dig/g4;->i:Ljava/io/InputStream;

    invoke-direct {v0, v2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    iput-object v0, p0, Lcom/digdroid/alman/dig/g4;->k:Ljava/io/BufferedInputStream;

    new-instance v0, Ljava/util/zip/ZipInputStream;

    iget-object v2, p0, Lcom/digdroid/alman/dig/g4;->k:Ljava/io/BufferedInputStream;

    invoke-direct {v0, v2}, Ljava/util/zip/ZipInputStream;-><init>(Ljava/io/InputStream;)V

    iput-object v0, p0, Lcom/digdroid/alman/dig/g4;->l:Ljava/util/zip/ZipInputStream;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    goto :goto_5

    :catch_4
    nop

    iget-object v0, p0, Lcom/digdroid/alman/dig/g4;->l:Ljava/util/zip/ZipInputStream;

    if-eqz v0, :cond_4

    :try_start_5
    invoke-virtual {v0}, Ljava/util/zip/ZipInputStream;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    goto :goto_3

    :catch_5
    nop

    :cond_4
    :goto_3
    iget-object v0, p0, Lcom/digdroid/alman/dig/g4;->k:Ljava/io/BufferedInputStream;

    if-eqz v0, :cond_5

    :try_start_6
    invoke-virtual {v0}, Ljava/io/BufferedInputStream;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_6

    goto :goto_4

    :catch_6
    nop

    :cond_5
    :goto_4
    iget-object v0, p0, Lcom/digdroid/alman/dig/g4;->i:Ljava/io/InputStream;

    if-eqz v0, :cond_6

    :try_start_7
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_7

    :catch_7
    :cond_6
    iput-object v1, p0, Lcom/digdroid/alman/dig/g4;->l:Ljava/util/zip/ZipInputStream;

    iput-object v1, p0, Lcom/digdroid/alman/dig/g4;->k:Ljava/io/BufferedInputStream;

    iput-object v1, p0, Lcom/digdroid/alman/dig/g4;->i:Ljava/io/InputStream;

    :cond_7
    :goto_5
    return-void
.end method

.method g([B)I
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/g4;->l:Ljava/util/zip/ZipInputStream;

    const/4 v1, -0x1

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {v0, p1}, Ljava/util/zip/ZipInputStream;->read([B)I

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    return v1

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/g4;->d:Le/a/a/a/b/b/l;

    if-eqz v0, :cond_1

    :try_start_1
    invoke-virtual {v0, p1}, Le/a/a/a/b/b/l;->f([B)I

    move-result p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    return p1

    :catch_1
    :cond_1
    return v1
.end method
