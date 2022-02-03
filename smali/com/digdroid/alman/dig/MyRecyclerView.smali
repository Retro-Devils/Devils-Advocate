.class Lcom/digdroid/alman/dig/MyRecyclerView;
.super Landroidx/recyclerview/widget/RecyclerView;
.source ""


# instance fields
.field I0:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x0

    iput p1, p0, Lcom/digdroid/alman/dig/MyRecyclerView;->I0:I

    return-void
.end method


# virtual methods
.method public A1(Landroid/graphics/Point;)V
    .locals 1

    iget v0, p1, Landroid/graphics/Point;->x:I

    iget p1, p1, Landroid/graphics/Point;->y:I

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, Lcom/digdroid/alman/dig/MyRecyclerView;->I0:I

    return-void
.end method

.method public a0(II)Z
    .locals 2

    iget v0, p0, Lcom/digdroid/alman/dig/MyRecyclerView;->I0:I

    if-lez v0, :cond_0

    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Lcom/digdroid/alman/dig/MyRecyclerView;->I0:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    mul-int/lit8 p2, p2, 0xa

    :cond_0
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->a0(II)Z

    move-result p1

    return p1
.end method
