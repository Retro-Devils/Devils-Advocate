.class Lcom/digdroid/alman/dig/a;
.super Lcom/digdroid/alman/dig/g4;
.source ""


# instance fields
.field m:Z

.field n:Ljava/lang/String;

.field o:Lcom/digdroid/alman/dig/g4$a;

.field p:Ljava/io/FileInputStream;

.field q:Ljava/io/BufferedInputStream;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0, p1, p2}, Lcom/digdroid/alman/dig/g4;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/digdroid/alman/dig/a;->p:Ljava/io/FileInputStream;

    iput-object p1, p0, Lcom/digdroid/alman/dig/a;->q:Ljava/io/BufferedInputStream;

    iget-object p1, p0, Lcom/digdroid/alman/dig/g4;->e:Ljava/util/zip/ZipFile;

    const/4 v0, 0x0

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/digdroid/alman/dig/g4;->f:Landroid/net/Uri;

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/digdroid/alman/dig/g4;->d:Le/a/a/a/b/b/l;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    iput-boolean p1, p0, Lcom/digdroid/alman/dig/a;->m:Z

    if-eqz p3, :cond_2

    if-eqz p1, :cond_2

    invoke-super {p0}, Lcom/digdroid/alman/dig/g4;->a()V

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/a;->m:Z

    :cond_2
    iget-boolean p1, p0, Lcom/digdroid/alman/dig/a;->m:Z

    if-nez p1, :cond_3

    iput-object p2, p0, Lcom/digdroid/alman/dig/a;->n:Ljava/lang/String;

    new-instance p1, Ljava/io/File;

    invoke-direct {p1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    new-instance p2, Lcom/digdroid/alman/dig/g4$a;

    invoke-direct {p2, p0}, Lcom/digdroid/alman/dig/g4$a;-><init>(Lcom/digdroid/alman/dig/g4;)V

    iput-object p2, p0, Lcom/digdroid/alman/dig/a;->o:Lcom/digdroid/alman/dig/g4$a;

    iput-object p3, p2, Lcom/digdroid/alman/dig/g4$a;->a:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/io/File;->length()J

    move-result-wide v0

    iput-wide v0, p2, Lcom/digdroid/alman/dig/g4$a;->b:J

    iget-object p1, p0, Lcom/digdroid/alman/dig/a;->o:Lcom/digdroid/alman/dig/g4$a;

    const-wide/16 p2, 0x0

    iput-wide p2, p1, Lcom/digdroid/alman/dig/g4$a;->c:J

    :cond_3
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/a;->m:Z

    if-eqz v0, :cond_0

    invoke-super {p0}, Lcom/digdroid/alman/dig/g4;->a()V

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/a;->q:Ljava/io/BufferedInputStream;

    if-eqz v0, :cond_1

    :try_start_0
    invoke-virtual {v0}, Ljava/io/BufferedInputStream;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/a;->p:Ljava/io/FileInputStream;

    if-eqz v0, :cond_2

    :try_start_1
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :cond_2
    :goto_1
    return-void
.end method

.method public d()Lcom/digdroid/alman/dig/g4$a;
    .locals 2

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/a;->m:Z

    if-eqz v0, :cond_0

    invoke-super {p0}, Lcom/digdroid/alman/dig/g4;->d()Lcom/digdroid/alman/dig/g4$a;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/a;->o:Lcom/digdroid/alman/dig/g4$a;

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/digdroid/alman/dig/a;->o:Lcom/digdroid/alman/dig/g4$a;

    return-object v0
.end method

.method public f()V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/g4;->e:Ljava/util/zip/ZipFile;

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/digdroid/alman/dig/g4;->f:Landroid/net/Uri;

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/digdroid/alman/dig/g4;->d:Le/a/a/a/b/b/l;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lcom/digdroid/alman/dig/a;->n:Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    iput-object v0, p0, Lcom/digdroid/alman/dig/a;->p:Ljava/io/FileInputStream;

    new-instance v0, Ljava/io/BufferedInputStream;

    iget-object v1, p0, Lcom/digdroid/alman/dig/a;->p:Ljava/io/FileInputStream;

    invoke-direct {v0, v1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    iput-object v0, p0, Lcom/digdroid/alman/dig/a;->q:Ljava/io/BufferedInputStream;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    nop

    iget-object v0, p0, Lcom/digdroid/alman/dig/a;->q:Ljava/io/BufferedInputStream;

    if-eqz v0, :cond_1

    :try_start_1
    invoke-virtual {v0}, Ljava/io/BufferedInputStream;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    nop

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/a;->p:Ljava/io/FileInputStream;

    if-eqz v0, :cond_2

    :try_start_2
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    :cond_2
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/digdroid/alman/dig/a;->q:Ljava/io/BufferedInputStream;

    iput-object v0, p0, Lcom/digdroid/alman/dig/a;->p:Ljava/io/FileInputStream;

    goto :goto_2

    :cond_3
    :goto_1
    invoke-super {p0}, Lcom/digdroid/alman/dig/g4;->f()V

    :goto_2
    return-void
.end method

.method g([B)I
    .locals 2

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/a;->m:Z

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/g4;->g([B)I

    move-result p1

    return p1

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/a;->q:Ljava/io/BufferedInputStream;

    const/4 v1, -0x1

    if-eqz v0, :cond_1

    :try_start_0
    invoke-virtual {v0, p1}, Ljava/io/BufferedInputStream;->read([B)I

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    :cond_1
    return v1
.end method

.method h()I
    .locals 1

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/a;->m:Z

    if-eqz v0, :cond_0

    const v0, 0x7f1100e5

    goto :goto_0

    :cond_0
    const v0, 0x7f11009b

    :goto_0
    return v0
.end method
