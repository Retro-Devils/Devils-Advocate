.class Lcom/digdroid/alman/dig/m;
.super Ljava/lang/Object;
.source ""


# instance fields
.field final a:Z

.field final b:I

.field final c:I

.field final d:I

.field final e:I

.field final f:I

.field final g:I

.field final h:I

.field i:I


# direct methods
.method public constructor <init>(ZIII)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/digdroid/alman/dig/m;->a:Z

    shr-int/lit8 v0, p2, 0x10

    and-int/lit16 v0, v0, 0xff

    iput v0, p0, Lcom/digdroid/alman/dig/m;->b:I

    shr-int/lit8 v0, p3, 0x10

    and-int/lit16 v0, v0, 0xff

    iput v0, p0, Lcom/digdroid/alman/dig/m;->c:I

    shr-int/lit8 v0, p2, 0x8

    and-int/lit16 v0, v0, 0xff

    iput v0, p0, Lcom/digdroid/alman/dig/m;->d:I

    shr-int/lit8 v0, p3, 0x8

    and-int/lit16 v0, v0, 0xff

    iput v0, p0, Lcom/digdroid/alman/dig/m;->e:I

    and-int/lit16 p2, p2, 0xff

    iput p2, p0, Lcom/digdroid/alman/dig/m;->f:I

    and-int/lit16 p2, p3, 0xff

    iput p2, p0, Lcom/digdroid/alman/dig/m;->g:I

    iput p4, p0, Lcom/digdroid/alman/dig/m;->h:I

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/m;->c()V

    :cond_0
    return-void
.end method


# virtual methods
.method a(I)I
    .locals 1

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/m;->a:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/m;->b(I)I

    move-result p1

    goto :goto_0

    :cond_0
    iget p1, p0, Lcom/digdroid/alman/dig/m;->i:I

    :goto_0
    return p1
.end method

.method b(I)I
    .locals 5

    iget v0, p0, Lcom/digdroid/alman/dig/m;->h:I

    mul-int/lit8 v1, v0, 0x2

    add-int/lit8 v2, v1, -0x2

    rem-int/2addr p1, v2

    if-ge p1, v0, :cond_0

    int-to-float p1, p1

    goto :goto_0

    :cond_0
    sub-int/2addr v1, p1

    add-int/lit8 v1, v1, -0x2

    int-to-float p1, v1

    :goto_0
    add-int/lit8 v0, v0, -0x1

    int-to-float v0, v0

    div-float/2addr p1, v0

    iget v0, p0, Lcom/digdroid/alman/dig/m;->b:I

    int-to-float v1, v0

    iget v2, p0, Lcom/digdroid/alman/dig/m;->c:I

    sub-int/2addr v2, v0

    int-to-float v0, v2

    mul-float v0, v0, p1

    add-float/2addr v1, v0

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v0

    iget v1, p0, Lcom/digdroid/alman/dig/m;->d:I

    int-to-float v2, v1

    iget v3, p0, Lcom/digdroid/alman/dig/m;->e:I

    sub-int/2addr v3, v1

    int-to-float v1, v3

    mul-float v1, v1, p1

    add-float/2addr v2, v1

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v1

    iget v2, p0, Lcom/digdroid/alman/dig/m;->f:I

    int-to-float v3, v2

    iget v4, p0, Lcom/digdroid/alman/dig/m;->g:I

    sub-int/2addr v4, v2

    int-to-float v2, v4

    mul-float v2, v2, p1

    add-float/2addr v3, v2

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result p1

    const/16 v2, 0xff

    invoke-static {v2, v0, v1, p1}, Landroid/graphics/Color;->argb(IIII)I

    move-result p1

    return p1
.end method

.method c()V
    .locals 8

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    iget v1, p0, Lcom/digdroid/alman/dig/m;->b:I

    iget v2, p0, Lcom/digdroid/alman/dig/m;->d:I

    iget v3, p0, Lcom/digdroid/alman/dig/m;->f:I

    iget v4, p0, Lcom/digdroid/alman/dig/m;->c:I

    iget v5, p0, Lcom/digdroid/alman/dig/m;->e:I

    iget v6, p0, Lcom/digdroid/alman/dig/m;->g:I

    if-le v1, v4, :cond_0

    move v7, v4

    move v4, v1

    move v1, v7

    :cond_0
    if-le v2, v5, :cond_1

    move v7, v5

    move v5, v2

    move v2, v7

    :cond_1
    if-le v3, v6, :cond_2

    move v7, v6

    move v6, v3

    move v3, v7

    :cond_2
    sub-int/2addr v4, v1

    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v0, v4}, Ljava/util/Random;->nextInt(I)I

    move-result v4

    add-int/2addr v1, v4

    sub-int/2addr v5, v2

    invoke-static {v5}, Ljava/lang/Math;->abs(I)I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v0, v4}, Ljava/util/Random;->nextInt(I)I

    move-result v4

    add-int/2addr v2, v4

    sub-int/2addr v6, v3

    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v0, v4}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    add-int/2addr v3, v0

    const/16 v0, 0xff

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    iput v0, p0, Lcom/digdroid/alman/dig/m;->i:I

    return-void
.end method
