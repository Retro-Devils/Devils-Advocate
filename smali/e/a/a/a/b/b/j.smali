.class Le/a/a/a/b/b/j;
.super Le/a/a/a/b/b/f;
.source ""


# direct methods
.method constructor <init>()V
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Class;

    const/4 v1, 0x0

    const-class v2, Le/b/a/k;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-class v2, Ljava/lang/Number;

    aput-object v2, v0, v1

    invoke-direct {p0, v0}, Le/a/a/a/b/b/f;-><init>([Ljava/lang/Class;)V

    return-void
.end method

.method private d(Le/a/a/a/b/b/e;)I
    .locals 1

    iget-object p1, p1, Le/a/a/a/b/b/e;->d:[B

    const/4 v0, 0x0

    aget-byte p1, p1, v0

    and-int/lit16 p1, p1, 0xff

    and-int/lit8 v0, p1, -0x40

    if-nez v0, :cond_2

    const/16 v0, 0x28

    if-gt p1, v0, :cond_1

    if-ne p1, v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    and-int/lit8 v0, p1, 0x1

    or-int/lit8 v0, v0, 0x2

    div-int/lit8 p1, p1, 0x2

    add-int/lit8 p1, p1, 0xb

    shl-int p1, v0, p1

    return p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Dictionary larger than 4GiB maximum size"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unsupported LZMA2 property bits"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method b(Ljava/lang/String;Ljava/io/InputStream;JLe/a/a/a/b/b/e;[B)Ljava/io/InputStream;
    .locals 0

    :try_start_0
    invoke-direct {p0, p5}, Le/a/a/a/b/b/j;->d(Le/a/a/a/b/b/e;)I

    move-result p1

    new-instance p3, Le/b/a/j;

    invoke-direct {p3, p2, p1}, Le/b/a/j;-><init>(Ljava/io/InputStream;I)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p3

    :catch_0
    move-exception p1

    new-instance p2, Ljava/io/IOException;

    invoke-virtual {p1}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method c(Le/a/a/a/b/b/e;Ljava/io/InputStream;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Le/a/a/a/b/b/j;->d(Le/a/a/a/b/b/e;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
