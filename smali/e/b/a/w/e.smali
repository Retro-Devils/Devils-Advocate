.class public final Le/b/a/w/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Le/b/a/w/f;


# instance fields
.field private final a:Z

.field private b:I


# direct methods
.method public constructor <init>(ZI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Le/b/a/w/e;->a:Z

    iput p2, p0, Le/b/a/w/e;->b:I

    return-void
.end method


# virtual methods
.method public a([BII)I
    .locals 7

    add-int/2addr p3, p2

    add-int/lit8 p3, p3, -0x4

    move v0, p2

    :goto_0
    if-gt v0, p3, :cond_4

    aget-byte v1, p1, v0

    const/16 v2, 0x40

    const/16 v3, 0xc0

    if-ne v1, v2, :cond_0

    add-int/lit8 v1, v0, 0x1

    aget-byte v1, p1, v1

    and-int/2addr v1, v3

    if-eqz v1, :cond_1

    :cond_0
    aget-byte v1, p1, v0

    const/16 v2, 0x7f

    if-ne v1, v2, :cond_3

    add-int/lit8 v1, v0, 0x1

    aget-byte v1, p1, v1

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_3

    :cond_1
    aget-byte v1, p1, v0

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x18

    add-int/lit8 v2, v0, 0x1

    aget-byte v3, p1, v2

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x10

    or-int/2addr v1, v3

    add-int/lit8 v3, v0, 0x2

    aget-byte v4, p1, v3

    and-int/lit16 v4, v4, 0xff

    shl-int/lit8 v4, v4, 0x8

    or-int/2addr v1, v4

    add-int/lit8 v4, v0, 0x3

    aget-byte v5, p1, v4

    and-int/lit16 v5, v5, 0xff

    or-int/2addr v1, v5

    shl-int/lit8 v1, v1, 0x2

    iget-boolean v5, p0, Le/b/a/w/e;->a:Z

    if-eqz v5, :cond_2

    iget v5, p0, Le/b/a/w/e;->b:I

    add-int/2addr v5, v0

    sub-int/2addr v5, p2

    add-int/2addr v1, v5

    goto :goto_1

    :cond_2
    iget v5, p0, Le/b/a/w/e;->b:I

    add-int/2addr v5, v0

    sub-int/2addr v5, p2

    sub-int/2addr v1, v5

    :goto_1
    ushr-int/lit8 v1, v1, 0x2

    ushr-int/lit8 v5, v1, 0x16

    and-int/lit8 v5, v5, 0x1

    rsub-int/lit8 v5, v5, 0x0

    shl-int/lit8 v5, v5, 0x16

    const v6, 0x3fffffff

    and-int/2addr v5, v6

    const v6, 0x3fffff

    and-int/2addr v1, v6

    or-int/2addr v1, v5

    const/high16 v5, 0x40000000    # 2.0f

    or-int/2addr v1, v5

    ushr-int/lit8 v5, v1, 0x18

    int-to-byte v5, v5

    aput-byte v5, p1, v0

    ushr-int/lit8 v5, v1, 0x10

    int-to-byte v5, v5

    aput-byte v5, p1, v2

    ushr-int/lit8 v2, v1, 0x8

    int-to-byte v2, v2

    aput-byte v2, p1, v3

    int-to-byte v1, v1

    aput-byte v1, p1, v4

    :cond_3
    add-int/lit8 v0, v0, 0x4

    goto :goto_0

    :cond_4
    sub-int/2addr v0, p2

    iget p1, p0, Le/b/a/w/e;->b:I

    add-int/2addr p1, v0

    iput p1, p0, Le/b/a/w/e;->b:I

    return v0
.end method
