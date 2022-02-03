.class public Le/b/a/j;
.super Ljava/io/InputStream;
.source ""


# instance fields
.field private final b:Le/b/a/c;

.field private c:Ljava/io/DataInputStream;

.field private d:Le/b/a/t/a;

.field private e:Le/b/a/v/c;

.field private f:Le/b/a/u/b;

.field private g:I

.field private h:Z

.field private i:Z

.field private j:Z

.field private k:Z

.field private l:Ljava/io/IOException;

.field private final m:[B


# direct methods
.method public constructor <init>(Ljava/io/InputStream;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Le/b/a/j;-><init>(Ljava/io/InputStream;I[B)V

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;I[B)V
    .locals 1

    invoke-static {}, Le/b/a/c;->b()Le/b/a/c;

    move-result-object v0

    invoke-direct {p0, p1, p2, p3, v0}, Le/b/a/j;-><init>(Ljava/io/InputStream;I[BLe/b/a/c;)V

    return-void
.end method

.method constructor <init>(Ljava/io/InputStream;I[BLe/b/a/c;)V
    .locals 3

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Le/b/a/j;->g:I

    iput-boolean v0, p0, Le/b/a/j;->h:Z

    const/4 v1, 0x1

    iput-boolean v1, p0, Le/b/a/j;->i:Z

    iput-boolean v1, p0, Le/b/a/j;->j:Z

    iput-boolean v0, p0, Le/b/a/j;->k:Z

    const/4 v2, 0x0

    iput-object v2, p0, Le/b/a/j;->l:Ljava/io/IOException;

    new-array v1, v1, [B

    iput-object v1, p0, Le/b/a/j;->m:[B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p4, p0, Le/b/a/j;->b:Le/b/a/c;

    new-instance v1, Ljava/io/DataInputStream;

    invoke-direct {v1, p1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    iput-object v1, p0, Le/b/a/j;->c:Ljava/io/DataInputStream;

    new-instance p1, Le/b/a/v/c;

    const/high16 v1, 0x10000

    invoke-direct {p1, v1, p4}, Le/b/a/v/c;-><init>(ILe/b/a/c;)V

    iput-object p1, p0, Le/b/a/j;->e:Le/b/a/v/c;

    new-instance p1, Le/b/a/t/a;

    invoke-static {p2}, Le/b/a/j;->c(I)I

    move-result p2

    invoke-direct {p1, p2, p3, p4}, Le/b/a/t/a;-><init>(I[BLe/b/a/c;)V

    iput-object p1, p0, Le/b/a/j;->d:Le/b/a/t/a;

    if-eqz p3, :cond_0

    array-length p1, p3

    if-lez p1, :cond_0

    iput-boolean v0, p0, Le/b/a/j;->i:Z

    :cond_0
    return-void
.end method

.method private a()V
    .locals 5

    iget-object v0, p0, Le/b/a/j;->c:Ljava/io/DataInputStream;

    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedByte()I

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    iput-boolean v1, p0, Le/b/a/j;->k:Z

    invoke-direct {p0}, Le/b/a/j;->d()V

    return-void

    :cond_0
    const/16 v2, 0xe0

    const/4 v3, 0x0

    if-ge v0, v2, :cond_3

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    iget-boolean v2, p0, Le/b/a/j;->i:Z

    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    new-instance v0, Le/b/a/e;

    invoke-direct {v0}, Le/b/a/e;-><init>()V

    throw v0

    :cond_3
    :goto_0
    iput-boolean v1, p0, Le/b/a/j;->j:Z

    iput-boolean v3, p0, Le/b/a/j;->i:Z

    iget-object v2, p0, Le/b/a/j;->d:Le/b/a/t/a;

    invoke-virtual {v2}, Le/b/a/t/a;->k()V

    :goto_1
    const/16 v2, 0x80

    if-lt v0, v2, :cond_7

    iput-boolean v1, p0, Le/b/a/j;->h:Z

    and-int/lit8 v2, v0, 0x1f

    shl-int/lit8 v2, v2, 0x10

    iput v2, p0, Le/b/a/j;->g:I

    iget-object v4, p0, Le/b/a/j;->c:Ljava/io/DataInputStream;

    invoke-virtual {v4}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v4

    add-int/2addr v4, v1

    add-int/2addr v2, v4

    iput v2, p0, Le/b/a/j;->g:I

    iget-object v2, p0, Le/b/a/j;->c:Ljava/io/DataInputStream;

    invoke-virtual {v2}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v2

    add-int/2addr v2, v1

    const/16 v1, 0xc0

    if-lt v0, v1, :cond_4

    iput-boolean v3, p0, Le/b/a/j;->j:Z

    invoke-direct {p0}, Le/b/a/j;->b()V

    goto :goto_2

    :cond_4
    iget-boolean v1, p0, Le/b/a/j;->j:Z

    if-nez v1, :cond_6

    const/16 v1, 0xa0

    if-lt v0, v1, :cond_5

    iget-object v0, p0, Le/b/a/j;->f:Le/b/a/u/b;

    invoke-virtual {v0}, Le/b/a/u/b;->b()V

    :cond_5
    :goto_2
    iget-object v0, p0, Le/b/a/j;->e:Le/b/a/v/c;

    iget-object v1, p0, Le/b/a/j;->c:Ljava/io/DataInputStream;

    invoke-virtual {v0, v1, v2}, Le/b/a/v/c;->h(Ljava/io/DataInputStream;I)V

    goto :goto_3

    :cond_6
    new-instance v0, Le/b/a/e;

    invoke-direct {v0}, Le/b/a/e;-><init>()V

    throw v0

    :cond_7
    const/4 v2, 0x2

    if-gt v0, v2, :cond_8

    iput-boolean v3, p0, Le/b/a/j;->h:Z

    iget-object v0, p0, Le/b/a/j;->c:Ljava/io/DataInputStream;

    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedShort()I

    move-result v0

    add-int/2addr v0, v1

    iput v0, p0, Le/b/a/j;->g:I

    :goto_3
    return-void

    :cond_8
    new-instance v0, Le/b/a/e;

    invoke-direct {v0}, Le/b/a/e;-><init>()V

    throw v0
.end method

.method private b()V
    .locals 8

    iget-object v0, p0, Le/b/a/j;->c:Ljava/io/DataInputStream;

    invoke-virtual {v0}, Ljava/io/DataInputStream;->readUnsignedByte()I

    move-result v0

    const/16 v1, 0xe0

    if-gt v0, v1, :cond_1

    div-int/lit8 v7, v0, 0x2d

    mul-int/lit8 v1, v7, 0x9

    mul-int/lit8 v1, v1, 0x5

    sub-int/2addr v0, v1

    div-int/lit8 v6, v0, 0x9

    mul-int/lit8 v1, v6, 0x9

    sub-int v5, v0, v1

    add-int v0, v5, v6

    const/4 v1, 0x4

    if-gt v0, v1, :cond_0

    new-instance v0, Le/b/a/u/b;

    iget-object v3, p0, Le/b/a/j;->d:Le/b/a/t/a;

    iget-object v4, p0, Le/b/a/j;->e:Le/b/a/v/c;

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, Le/b/a/u/b;-><init>(Le/b/a/t/a;Le/b/a/v/b;III)V

    iput-object v0, p0, Le/b/a/j;->f:Le/b/a/u/b;

    return-void

    :cond_0
    new-instance v0, Le/b/a/e;

    invoke-direct {v0}, Le/b/a/e;-><init>()V

    throw v0

    :cond_1
    new-instance v0, Le/b/a/e;

    invoke-direct {v0}, Le/b/a/e;-><init>()V

    throw v0
.end method

.method private static c(I)I
    .locals 3

    const/16 v0, 0x1000

    if-lt p0, v0, :cond_0

    const v0, 0x7ffffff0

    if-gt p0, v0, :cond_0

    add-int/lit8 p0, p0, 0xf

    and-int/lit8 p0, p0, -0x10

    return p0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unsupported dictionary size "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private d()V
    .locals 3

    iget-object v0, p0, Le/b/a/j;->d:Le/b/a/t/a;

    if-eqz v0, :cond_0

    iget-object v1, p0, Le/b/a/j;->b:Le/b/a/c;

    invoke-virtual {v0, v1}, Le/b/a/t/a;->g(Le/b/a/c;)V

    const/4 v0, 0x0

    iput-object v0, p0, Le/b/a/j;->d:Le/b/a/t/a;

    iget-object v1, p0, Le/b/a/j;->e:Le/b/a/v/c;

    iget-object v2, p0, Le/b/a/j;->b:Le/b/a/c;

    invoke-virtual {v1, v2}, Le/b/a/v/c;->i(Le/b/a/c;)V

    iput-object v0, p0, Le/b/a/j;->e:Le/b/a/v/c;

    :cond_0
    return-void
.end method


# virtual methods
.method public available()I
    .locals 2

    iget-object v0, p0, Le/b/a/j;->c:Ljava/io/DataInputStream;

    if-eqz v0, :cond_2

    iget-object v1, p0, Le/b/a/j;->l:Ljava/io/IOException;

    if-nez v1, :cond_1

    iget-boolean v1, p0, Le/b/a/j;->h:Z

    if-eqz v1, :cond_0

    iget v0, p0, Le/b/a/j;->g:I

    goto :goto_0

    :cond_0
    iget v1, p0, Le/b/a/j;->g:I

    invoke-virtual {v0}, Ljava/io/DataInputStream;->available()I

    move-result v0

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    :goto_0
    return v0

    :cond_1
    throw v1

    :cond_2
    new-instance v0, Le/b/a/r;

    const-string v1, "Stream closed"

    invoke-direct {v0, v1}, Le/b/a/r;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public close()V
    .locals 2

    iget-object v0, p0, Le/b/a/j;->c:Ljava/io/DataInputStream;

    if-eqz v0, :cond_0

    invoke-direct {p0}, Le/b/a/j;->d()V

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Le/b/a/j;->c:Ljava/io/DataInputStream;

    invoke-virtual {v1}, Ljava/io/DataInputStream;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-object v0, p0, Le/b/a/j;->c:Ljava/io/DataInputStream;

    goto :goto_0

    :catchall_0
    move-exception v1

    iput-object v0, p0, Le/b/a/j;->c:Ljava/io/DataInputStream;

    throw v1

    :cond_0
    :goto_0
    return-void
.end method

.method public read()I
    .locals 3

    iget-object v0, p0, Le/b/a/j;->m:[B

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v1, v2}, Le/b/a/j;->read([BII)I

    move-result v0

    const/4 v2, -0x1

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Le/b/a/j;->m:[B

    aget-byte v0, v0, v1

    and-int/lit16 v2, v0, 0xff

    :goto_0
    return v2
.end method

.method public read([BII)I
    .locals 5

    if-ltz p2, :cond_9

    if-ltz p3, :cond_9

    add-int v0, p2, p3

    if-ltz v0, :cond_9

    array-length v1, p1

    if-gt v0, v1, :cond_9

    const/4 v0, 0x0

    if-nez p3, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, Le/b/a/j;->c:Ljava/io/DataInputStream;

    if-eqz v1, :cond_8

    iget-object v1, p0, Le/b/a/j;->l:Ljava/io/IOException;

    if-nez v1, :cond_7

    iget-boolean v1, p0, Le/b/a/j;->k:Z

    const/4 v2, -0x1

    if-eqz v1, :cond_1

    return v2

    :cond_1
    :goto_0
    if-lez p3, :cond_6

    :try_start_0
    iget v1, p0, Le/b/a/j;->g:I

    if-nez v1, :cond_3

    invoke-direct {p0}, Le/b/a/j;->a()V

    iget-boolean v1, p0, Le/b/a/j;->k:Z

    if-eqz v1, :cond_3

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    move v2, v0

    :goto_1
    return v2

    :cond_3
    iget v1, p0, Le/b/a/j;->g:I

    invoke-static {v1, p3}, Ljava/lang/Math;->min(II)I

    move-result v1

    iget-boolean v3, p0, Le/b/a/j;->h:Z

    if-nez v3, :cond_4

    iget-object v3, p0, Le/b/a/j;->d:Le/b/a/t/a;

    iget-object v4, p0, Le/b/a/j;->c:Ljava/io/DataInputStream;

    invoke-virtual {v3, v4, v1}, Le/b/a/t/a;->a(Ljava/io/DataInputStream;I)V

    goto :goto_2

    :cond_4
    iget-object v3, p0, Le/b/a/j;->d:Le/b/a/t/a;

    invoke-virtual {v3, v1}, Le/b/a/t/a;->l(I)V

    iget-object v1, p0, Le/b/a/j;->f:Le/b/a/u/b;

    invoke-virtual {v1}, Le/b/a/u/b;->e()V

    :goto_2
    iget-object v1, p0, Le/b/a/j;->d:Le/b/a/t/a;

    invoke-virtual {v1, p1, p2}, Le/b/a/t/a;->b([BI)I

    move-result v1

    add-int/2addr p2, v1

    sub-int/2addr p3, v1

    add-int/2addr v0, v1

    iget v3, p0, Le/b/a/j;->g:I

    sub-int/2addr v3, v1

    iput v3, p0, Le/b/a/j;->g:I

    if-nez v3, :cond_1

    iget-object v1, p0, Le/b/a/j;->e:Le/b/a/v/c;

    invoke-virtual {v1}, Le/b/a/v/c;->g()Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, p0, Le/b/a/j;->d:Le/b/a/t/a;

    invoke-virtual {v1}, Le/b/a/t/a;->e()Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_0

    :cond_5
    new-instance p1, Le/b/a/e;

    invoke-direct {p1}, Le/b/a/e;-><init>()V

    throw p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p1

    iput-object p1, p0, Le/b/a/j;->l:Ljava/io/IOException;

    throw p1

    :cond_6
    return v0

    :cond_7
    throw v1

    :cond_8
    new-instance p1, Le/b/a/r;

    const-string p2, "Stream closed"

    invoke-direct {p1, p2}, Le/b/a/r;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    goto :goto_4

    :goto_3
    throw p1

    :goto_4
    goto :goto_3
.end method
