.class Le/b/a/o;
.super Ljava/io/InputStream;
.source ""


# instance fields
.field private b:Ljava/io/InputStream;

.field private final c:Le/b/a/w/f;

.field private final d:[B

.field private e:I

.field private f:I

.field private g:I

.field private h:Z

.field private i:Ljava/io/IOException;

.field private final j:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Le/b/a/o;

    return-void
.end method

.method constructor <init>(Ljava/io/InputStream;Le/b/a/w/f;)V
    .locals 1

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const/16 v0, 0x1000

    new-array v0, v0, [B

    iput-object v0, p0, Le/b/a/o;->d:[B

    const/4 v0, 0x0

    iput v0, p0, Le/b/a/o;->e:I

    iput v0, p0, Le/b/a/o;->f:I

    iput v0, p0, Le/b/a/o;->g:I

    iput-boolean v0, p0, Le/b/a/o;->h:Z

    const/4 v0, 0x0

    iput-object v0, p0, Le/b/a/o;->i:Ljava/io/IOException;

    const/4 v0, 0x1

    new-array v0, v0, [B

    iput-object v0, p0, Le/b/a/o;->j:[B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Le/b/a/o;->b:Ljava/io/InputStream;

    iput-object p2, p0, Le/b/a/o;->c:Le/b/a/w/f;

    return-void
.end method


# virtual methods
.method public available()I
    .locals 2

    iget-object v0, p0, Le/b/a/o;->b:Ljava/io/InputStream;

    if-eqz v0, :cond_1

    iget-object v0, p0, Le/b/a/o;->i:Ljava/io/IOException;

    if-nez v0, :cond_0

    iget v0, p0, Le/b/a/o;->f:I

    return v0

    :cond_0
    throw v0

    :cond_1
    new-instance v0, Le/b/a/r;

    const-string v1, "Stream closed"

    invoke-direct {v0, v1}, Le/b/a/r;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public close()V
    .locals 2

    iget-object v0, p0, Le/b/a/o;->b:Ljava/io/InputStream;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-object v1, p0, Le/b/a/o;->b:Ljava/io/InputStream;

    goto :goto_0

    :catchall_0
    move-exception v0

    iput-object v1, p0, Le/b/a/o;->b:Ljava/io/InputStream;

    throw v0

    :cond_0
    :goto_0
    return-void
.end method

.method public read()I
    .locals 3

    iget-object v0, p0, Le/b/a/o;->j:[B

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v1, v2}, Le/b/a/o;->read([BII)I

    move-result v0

    const/4 v2, -0x1

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Le/b/a/o;->j:[B

    aget-byte v0, v0, v1

    and-int/lit16 v2, v0, 0xff

    :goto_0
    return v2
.end method

.method public read([BII)I
    .locals 9

    if-ltz p2, :cond_8

    if-ltz p3, :cond_8

    add-int v0, p2, p3

    if-ltz v0, :cond_8

    array-length v1, p1

    if-gt v0, v1, :cond_8

    const/4 v0, 0x0

    if-nez p3, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, Le/b/a/o;->b:Ljava/io/InputStream;

    if-eqz v1, :cond_7

    iget-object v1, p0, Le/b/a/o;->i:Ljava/io/IOException;

    if-nez v1, :cond_6

    const/4 v1, 0x0

    :goto_0
    :try_start_0
    iget v2, p0, Le/b/a/o;->f:I

    invoke-static {v2, p3}, Ljava/lang/Math;->min(II)I

    move-result v2

    iget-object v3, p0, Le/b/a/o;->d:[B

    iget v4, p0, Le/b/a/o;->e:I

    invoke-static {v3, v4, p1, p2, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v3, p0, Le/b/a/o;->e:I

    add-int/2addr v3, v2

    iput v3, p0, Le/b/a/o;->e:I

    iget v4, p0, Le/b/a/o;->f:I

    sub-int/2addr v4, v2

    iput v4, p0, Le/b/a/o;->f:I

    add-int/2addr p2, v2

    sub-int/2addr p3, v2

    add-int/2addr v1, v2

    add-int v2, v3, v4

    iget v5, p0, Le/b/a/o;->g:I

    add-int/2addr v2, v5

    const/16 v6, 0x1000

    if-ne v2, v6, :cond_1

    iget-object v2, p0, Le/b/a/o;->d:[B

    add-int/2addr v4, v5

    invoke-static {v2, v3, v2, v0, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput v0, p0, Le/b/a/o;->e:I

    :cond_1
    const/4 v2, -0x1

    if-eqz p3, :cond_4

    iget-boolean v3, p0, Le/b/a/o;->h:Z

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    iget v3, p0, Le/b/a/o;->e:I

    iget v4, p0, Le/b/a/o;->f:I

    add-int v5, v3, v4

    iget v7, p0, Le/b/a/o;->g:I

    add-int/2addr v5, v7

    sub-int/2addr v6, v5

    iget-object v5, p0, Le/b/a/o;->b:Ljava/io/InputStream;

    iget-object v8, p0, Le/b/a/o;->d:[B

    add-int/2addr v3, v4

    add-int/2addr v3, v7

    invoke-virtual {v5, v8, v3, v6}, Ljava/io/InputStream;->read([BII)I

    move-result v3

    if-ne v3, v2, :cond_3

    const/4 v2, 0x1

    iput-boolean v2, p0, Le/b/a/o;->h:Z

    iget v2, p0, Le/b/a/o;->g:I

    iput v2, p0, Le/b/a/o;->f:I

    iput v0, p0, Le/b/a/o;->g:I

    goto :goto_0

    :cond_3
    iget v2, p0, Le/b/a/o;->g:I

    add-int/2addr v2, v3

    iput v2, p0, Le/b/a/o;->g:I

    iget-object v3, p0, Le/b/a/o;->c:Le/b/a/w/f;

    iget-object v4, p0, Le/b/a/o;->d:[B

    iget v5, p0, Le/b/a/o;->e:I

    invoke-interface {v3, v4, v5, v2}, Le/b/a/w/f;->a([BII)I

    move-result v2

    iput v2, p0, Le/b/a/o;->f:I

    iget v3, p0, Le/b/a/o;->g:I

    sub-int/2addr v3, v2

    iput v3, p0, Le/b/a/o;->g:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_4
    :goto_1
    if-lez v1, :cond_5

    goto :goto_2

    :cond_5
    const/4 v1, -0x1

    :goto_2
    return v1

    :catch_0
    move-exception p1

    iput-object p1, p0, Le/b/a/o;->i:Ljava/io/IOException;

    throw p1

    :cond_6
    throw v1

    :cond_7
    new-instance p1, Le/b/a/r;

    const-string p2, "Stream closed"

    invoke-direct {p1, p2}, Le/b/a/r;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    goto :goto_4

    :goto_3
    throw p1

    :goto_4
    goto :goto_3
.end method
