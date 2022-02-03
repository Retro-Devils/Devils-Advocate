.class Le/a/a/a/b/b/g$g;
.super Le/a/a/a/b/b/f;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le/a/a/a/b/b/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "g"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Class;

    invoke-direct {p0, v0}, Le/a/a/a/b/b/f;-><init>([Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method b(Ljava/lang/String;Ljava/io/InputStream;JLe/a/a/a/b/b/e;[B)Ljava/io/InputStream;
    .locals 12

    move-object/from16 v0, p5

    iget-object v1, v0, Le/a/a/a/b/b/e;->d:[B

    const/4 v2, 0x0

    aget-byte v7, v1, v2

    const/4 v2, 0x1

    aget-byte v1, v1, v2

    int-to-long v3, v1

    :goto_0
    const/4 v1, 0x4

    if-ge v2, v1, :cond_0

    iget-object v1, v0, Le/a/a/a/b/b/e;->d:[B

    add-int/lit8 v5, v2, 0x1

    aget-byte v1, v1, v5

    int-to-long v8, v1

    const-wide/16 v10, 0xff

    and-long/2addr v8, v10

    mul-int/lit8 v2, v2, 0x8

    shl-long v1, v8, v2

    or-long/2addr v3, v1

    move v2, v5

    goto :goto_0

    :cond_0
    const-wide/32 v0, 0x7ffffff0

    cmp-long v2, v3, v0

    if-gtz v2, :cond_1

    new-instance v0, Le/b/a/l;

    long-to-int v8, v3

    move-object v3, v0

    move-object v4, p2

    move-wide v5, p3

    invoke-direct/range {v3 .. v8}, Le/b/a/l;-><init>(Ljava/io/InputStream;JBI)V

    return-object v0

    :cond_1
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Dictionary larger than 4GiB maximum size used in "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v2, p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :goto_1
    throw v0

    :goto_2
    goto :goto_1
.end method
