.class public final Le/b/a/v/c;
.super Le/b/a/v/b;
.source ""


# instance fields
.field private final c:[B

.field private d:I


# direct methods
.method public constructor <init>(ILe/b/a/c;)V
    .locals 1

    invoke-direct {p0}, Le/b/a/v/b;-><init>()V

    add-int/lit8 p1, p1, -0x5

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Le/b/a/c;->a(IZ)[B

    move-result-object p1

    iput-object p1, p0, Le/b/a/v/c;->c:[B

    array-length p1, p1

    iput p1, p0, Le/b/a/v/c;->d:I

    return-void
.end method


# virtual methods
.method public f()V
    .locals 5

    iget v0, p0, Le/b/a/v/b;->a:I

    const/high16 v1, -0x1000000

    and-int/2addr v1, v0

    if-nez v1, :cond_0

    :try_start_0
    iget v1, p0, Le/b/a/v/b;->b:I

    shl-int/lit8 v1, v1, 0x8

    iget-object v2, p0, Le/b/a/v/c;->c:[B

    iget v3, p0, Le/b/a/v/c;->d:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, Le/b/a/v/c;->d:I

    aget-byte v2, v2, v3

    and-int/lit16 v2, v2, 0xff

    or-int/2addr v1, v2

    iput v1, p0, Le/b/a/v/b;->b:I

    shl-int/lit8 v0, v0, 0x8

    iput v0, p0, Le/b/a/v/b;->a:I
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    new-instance v0, Le/b/a/e;

    invoke-direct {v0}, Le/b/a/e;-><init>()V

    throw v0

    :cond_0
    :goto_0
    return-void
.end method

.method public g()Z
    .locals 2

    iget v0, p0, Le/b/a/v/c;->d:I

    iget-object v1, p0, Le/b/a/v/c;->c:[B

    array-length v1, v1

    if-ne v0, v1, :cond_0

    iget v0, p0, Le/b/a/v/b;->b:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public h(Ljava/io/DataInputStream;I)V
    .locals 2

    const/4 v0, 0x5

    if-lt p2, v0, :cond_1

    invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedByte()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Ljava/io/DataInputStream;->readInt()I

    move-result v0

    iput v0, p0, Le/b/a/v/b;->b:I

    const/4 v0, -0x1

    iput v0, p0, Le/b/a/v/b;->a:I

    add-int/lit8 p2, p2, -0x5

    iget-object v0, p0, Le/b/a/v/c;->c:[B

    array-length v1, v0

    sub-int/2addr v1, p2

    iput v1, p0, Le/b/a/v/c;->d:I

    invoke-virtual {p1, v0, v1, p2}, Ljava/io/DataInputStream;->readFully([BII)V

    return-void

    :cond_0
    new-instance p1, Le/b/a/e;

    invoke-direct {p1}, Le/b/a/e;-><init>()V

    throw p1

    :cond_1
    new-instance p1, Le/b/a/e;

    invoke-direct {p1}, Le/b/a/e;-><init>()V

    throw p1
.end method

.method public i(Le/b/a/c;)V
    .locals 1

    iget-object v0, p0, Le/b/a/v/c;->c:[B

    invoke-virtual {p1, v0}, Le/b/a/c;->c([B)V

    return-void
.end method
