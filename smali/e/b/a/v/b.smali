.class public abstract Le/b/a/v/b;
.super Le/b/a/v/a;
.source ""


# instance fields
.field a:I

.field b:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Le/b/a/v/a;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Le/b/a/v/b;->a:I

    iput v0, p0, Le/b/a/v/b;->b:I

    return-void
.end method


# virtual methods
.method public b([SI)I
    .locals 6

    invoke-virtual {p0}, Le/b/a/v/b;->f()V

    aget-short v0, p1, p2

    iget v1, p0, Le/b/a/v/b;->a:I

    ushr-int/lit8 v2, v1, 0xb

    mul-int v2, v2, v0

    iget v3, p0, Le/b/a/v/b;->b:I

    const/high16 v4, -0x80000000

    xor-int v5, v3, v4

    xor-int/2addr v4, v2

    if-ge v5, v4, :cond_0

    iput v2, p0, Le/b/a/v/b;->a:I

    rsub-int v1, v0, 0x800

    ushr-int/lit8 v1, v1, 0x5

    add-int/2addr v0, v1

    int-to-short v0, v0

    aput-short v0, p1, p2

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    sub-int/2addr v1, v2

    iput v1, p0, Le/b/a/v/b;->a:I

    sub-int/2addr v3, v2

    iput v3, p0, Le/b/a/v/b;->b:I

    ushr-int/lit8 v1, v0, 0x5

    sub-int/2addr v0, v1

    int-to-short v0, v0

    aput-short v0, p1, p2

    const/4 p1, 0x1

    :goto_0
    return p1
.end method

.method public c([S)I
    .locals 2

    const/4 v0, 0x1

    :cond_0
    shl-int/lit8 v1, v0, 0x1

    invoke-virtual {p0, p1, v0}, Le/b/a/v/b;->b([SI)I

    move-result v0

    or-int/2addr v0, v1

    array-length v1, p1

    if-lt v0, v1, :cond_0

    array-length p1, p1

    sub-int/2addr v0, p1

    return v0
.end method

.method public d(I)I
    .locals 5

    const/4 v0, 0x0

    :cond_0
    invoke-virtual {p0}, Le/b/a/v/b;->f()V

    iget v1, p0, Le/b/a/v/b;->a:I

    ushr-int/lit8 v1, v1, 0x1

    iput v1, p0, Le/b/a/v/b;->a:I

    iget v2, p0, Le/b/a/v/b;->b:I

    sub-int v3, v2, v1

    ushr-int/lit8 v3, v3, 0x1f

    add-int/lit8 v4, v3, -0x1

    and-int/2addr v1, v4

    sub-int/2addr v2, v1

    iput v2, p0, Le/b/a/v/b;->b:I

    shl-int/lit8 v0, v0, 0x1

    rsub-int/lit8 v1, v3, 0x1

    or-int/2addr v0, v1

    add-int/lit8 p1, p1, -0x1

    if-nez p1, :cond_0

    return v0
.end method

.method public e([S)I
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x1

    :goto_0
    invoke-virtual {p0, p1, v3}, Le/b/a/v/b;->b([SI)I

    move-result v4

    shl-int/2addr v3, v1

    or-int/2addr v3, v4

    add-int/lit8 v5, v2, 0x1

    shl-int v2, v4, v2

    or-int/2addr v0, v2

    array-length v2, p1

    if-lt v3, v2, :cond_0

    return v0

    :cond_0
    move v2, v5

    goto :goto_0
.end method

.method public abstract f()V
.end method
