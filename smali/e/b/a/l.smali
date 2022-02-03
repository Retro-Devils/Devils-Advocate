.class public Le/b/a/l;
.super Ljava/io/InputStream;
.source ""


# instance fields
.field private b:Ljava/io/InputStream;

.field private c:Le/b/a/c;

.field private d:Le/b/a/t/a;

.field private e:Le/b/a/v/d;

.field private f:Le/b/a/u/b;

.field private g:Z

.field private final h:[B

.field private i:J

.field private j:Ljava/io/IOException;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Le/b/a/l;

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;JBI)V
    .locals 9

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Le/b/a/l;->g:Z

    const/4 v0, 0x1

    new-array v0, v0, [B

    iput-object v0, p0, Le/b/a/l;->h:[B

    const/4 v0, 0x0

    iput-object v0, p0, Le/b/a/l;->j:Ljava/io/IOException;

    invoke-static {}, Le/b/a/c;->b()Le/b/a/c;

    move-result-object v8

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move-wide v3, p2

    move v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v8}, Le/b/a/l;->b(Ljava/io/InputStream;JBI[BLe/b/a/c;)V

    return-void
.end method

.method private static a(I)I
    .locals 1

    if-ltz p0, :cond_1

    const v0, 0x7ffffff0

    if-gt p0, v0, :cond_1

    const/16 v0, 0x1000

    if-ge p0, v0, :cond_0

    const/16 p0, 0x1000

    :cond_0
    add-int/lit8 p0, p0, 0xf

    and-int/lit8 p0, p0, -0x10

    return p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "LZMA dictionary is too big for this implementation"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private b(Ljava/io/InputStream;JBI[BLe/b/a/c;)V
    .locals 10

    move v7, p5

    const-wide/16 v0, -0x1

    cmp-long v2, p2, v0

    if-ltz v2, :cond_2

    move v0, p4

    and-int/lit16 v0, v0, 0xff

    const/16 v1, 0xe0

    if-gt v0, v1, :cond_1

    div-int/lit8 v6, v0, 0x2d

    mul-int/lit8 v1, v6, 0x9

    mul-int/lit8 v1, v1, 0x5

    sub-int/2addr v0, v1

    div-int/lit8 v5, v0, 0x9

    mul-int/lit8 v1, v5, 0x9

    sub-int v4, v0, v1

    if-ltz v7, :cond_0

    const v0, 0x7ffffff0

    if-gt v7, v0, :cond_0

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    invoke-direct/range {v0 .. v9}, Le/b/a/l;->c(Ljava/io/InputStream;JIIII[BLe/b/a/c;)V

    return-void

    :cond_0
    new-instance v0, Le/b/a/p;

    const-string v1, "LZMA dictionary is too big for this implementation"

    invoke-direct {v0, v1}, Le/b/a/p;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Le/b/a/e;

    const-string v1, "Invalid LZMA properties byte"

    invoke-direct {v0, v1}, Le/b/a/e;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Le/b/a/p;

    const-string v1, "Uncompressed size is too big"

    invoke-direct {v0, v1}, Le/b/a/p;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private c(Ljava/io/InputStream;JIIII[BLe/b/a/c;)V
    .locals 12

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move/from16 v7, p4

    move/from16 v8, p5

    move/from16 v9, p6

    move-object/from16 v4, p9

    const-wide/16 v5, -0x1

    cmp-long v10, v2, v5

    if-ltz v10, :cond_1

    if-ltz v7, :cond_1

    const/16 v5, 0x8

    if-gt v7, v5, :cond_1

    if-ltz v8, :cond_1

    const/4 v5, 0x4

    if-gt v8, v5, :cond_1

    if-ltz v9, :cond_1

    if-gt v9, v5, :cond_1

    iput-object v1, v0, Le/b/a/l;->b:Ljava/io/InputStream;

    iput-object v4, v0, Le/b/a/l;->c:Le/b/a/c;

    invoke-static/range {p7 .. p7}, Le/b/a/l;->a(I)I

    move-result v5

    const-wide/16 v10, 0x0

    cmp-long v6, v2, v10

    if-ltz v6, :cond_0

    int-to-long v10, v5

    cmp-long v6, v10, v2

    if-lez v6, :cond_0

    long-to-int v5, v2

    invoke-static {v5}, Le/b/a/l;->a(I)I

    move-result v5

    :cond_0
    new-instance v6, Le/b/a/t/a;

    invoke-static {v5}, Le/b/a/l;->a(I)I

    move-result v5

    move-object/from16 v10, p8

    invoke-direct {v6, v5, v10, v4}, Le/b/a/t/a;-><init>(I[BLe/b/a/c;)V

    iput-object v6, v0, Le/b/a/l;->d:Le/b/a/t/a;

    new-instance v6, Le/b/a/v/d;

    invoke-direct {v6, p1}, Le/b/a/v/d;-><init>(Ljava/io/InputStream;)V

    iput-object v6, v0, Le/b/a/l;->e:Le/b/a/v/d;

    new-instance v1, Le/b/a/u/b;

    iget-object v5, v0, Le/b/a/l;->d:Le/b/a/t/a;

    move-object v4, v1

    move/from16 v7, p4

    move/from16 v8, p5

    move/from16 v9, p6

    invoke-direct/range {v4 .. v9}, Le/b/a/u/b;-><init>(Le/b/a/t/a;Le/b/a/v/b;III)V

    iput-object v1, v0, Le/b/a/l;->f:Le/b/a/u/b;

    iput-wide v2, v0, Le/b/a/l;->i:J

    return-void

    :cond_1
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v1
.end method

.method private d()V
    .locals 2

    iget-object v0, p0, Le/b/a/l;->d:Le/b/a/t/a;

    if-eqz v0, :cond_0

    iget-object v1, p0, Le/b/a/l;->c:Le/b/a/c;

    invoke-virtual {v0, v1}, Le/b/a/t/a;->g(Le/b/a/c;)V

    const/4 v0, 0x0

    iput-object v0, p0, Le/b/a/l;->d:Le/b/a/t/a;

    :cond_0
    return-void
.end method


# virtual methods
.method public close()V
    .locals 2

    iget-object v0, p0, Le/b/a/l;->b:Ljava/io/InputStream;

    if-eqz v0, :cond_0

    invoke-direct {p0}, Le/b/a/l;->d()V

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Le/b/a/l;->b:Ljava/io/InputStream;

    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-object v0, p0, Le/b/a/l;->b:Ljava/io/InputStream;

    goto :goto_0

    :catchall_0
    move-exception v1

    iput-object v0, p0, Le/b/a/l;->b:Ljava/io/InputStream;

    throw v1

    :cond_0
    :goto_0
    return-void
.end method

.method public read()I
    .locals 3

    iget-object v0, p0, Le/b/a/l;->h:[B

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v1, v2}, Le/b/a/l;->read([BII)I

    move-result v0

    const/4 v2, -0x1

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Le/b/a/l;->h:[B

    aget-byte v0, v0, v1

    and-int/lit16 v2, v0, 0xff

    :goto_0
    return v2
.end method

.method public read([BII)I
    .locals 11

    if-ltz p2, :cond_a

    if-ltz p3, :cond_a

    add-int v0, p2, p3

    if-ltz v0, :cond_a

    array-length v1, p1

    if-gt v0, v1, :cond_a

    const/4 v0, 0x0

    if-nez p3, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, Le/b/a/l;->b:Ljava/io/InputStream;

    if-eqz v1, :cond_9

    iget-object v1, p0, Le/b/a/l;->j:Ljava/io/IOException;

    if-nez v1, :cond_8

    iget-boolean v1, p0, Le/b/a/l;->g:Z

    const/4 v2, -0x1

    if-eqz v1, :cond_1

    return v2

    :cond_1
    if-lez p3, :cond_7

    :try_start_0
    iget-wide v3, p0, Le/b/a/l;->i:J

    const-wide/16 v5, 0x0

    cmp-long v1, v3, v5

    if-ltz v1, :cond_2

    int-to-long v7, p3

    cmp-long v1, v3, v7

    if-gez v1, :cond_2

    long-to-int v1, v3

    goto :goto_0

    :cond_2
    move v1, p3

    :goto_0
    iget-object v3, p0, Le/b/a/l;->d:Le/b/a/t/a;

    invoke-virtual {v3, v1}, Le/b/a/t/a;->l(I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    const/4 v1, 0x1

    :try_start_1
    iget-object v3, p0, Le/b/a/l;->f:Le/b/a/u/b;

    invoke-virtual {v3}, Le/b/a/u/b;->e()V
    :try_end_1
    .catch Le/b/a/e; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_0
    move-exception v3

    :try_start_2
    iget-wide v7, p0, Le/b/a/l;->i:J

    const-wide/16 v9, -0x1

    cmp-long v4, v7, v9

    if-nez v4, :cond_6

    iget-object v4, p0, Le/b/a/l;->f:Le/b/a/u/b;

    invoke-virtual {v4}, Le/b/a/u/b;->h()Z

    move-result v4

    if-eqz v4, :cond_6

    iput-boolean v1, p0, Le/b/a/l;->g:Z

    iget-object v3, p0, Le/b/a/l;->e:Le/b/a/v/d;

    invoke-virtual {v3}, Le/b/a/v/d;->f()V

    :goto_1
    iget-object v3, p0, Le/b/a/l;->d:Le/b/a/t/a;

    invoke-virtual {v3, p1, p2}, Le/b/a/t/a;->b([BI)I

    move-result v3

    add-int/2addr p2, v3

    sub-int/2addr p3, v3

    add-int/2addr v0, v3

    iget-wide v7, p0, Le/b/a/l;->i:J

    cmp-long v4, v7, v5

    if-ltz v4, :cond_3

    int-to-long v3, v3

    sub-long/2addr v7, v3

    iput-wide v7, p0, Le/b/a/l;->i:J

    cmp-long v3, v7, v5

    if-nez v3, :cond_3

    iput-boolean v1, p0, Le/b/a/l;->g:Z

    :cond_3
    iget-boolean v1, p0, Le/b/a/l;->g:Z

    if-eqz v1, :cond_1

    iget-object p1, p0, Le/b/a/l;->e:Le/b/a/v/d;

    invoke-virtual {p1}, Le/b/a/v/d;->g()Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Le/b/a/l;->d:Le/b/a/t/a;

    invoke-virtual {p1}, Le/b/a/t/a;->e()Z

    move-result p1

    if-nez p1, :cond_5

    invoke-direct {p0}, Le/b/a/l;->d()V

    if-nez v0, :cond_4

    goto :goto_2

    :cond_4
    move v2, v0

    :goto_2
    return v2

    :cond_5
    new-instance p1, Le/b/a/e;

    invoke-direct {p1}, Le/b/a/e;-><init>()V

    throw p1

    :cond_6
    throw v3
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    move-exception p1

    iput-object p1, p0, Le/b/a/l;->j:Ljava/io/IOException;

    throw p1

    :cond_7
    return v0

    :cond_8
    throw v1

    :cond_9
    new-instance p1, Le/b/a/r;

    const-string p2, "Stream closed"

    invoke-direct {p1, p2}, Le/b/a/r;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    goto :goto_4

    :goto_3
    throw p1

    :goto_4
    goto :goto_3
.end method
