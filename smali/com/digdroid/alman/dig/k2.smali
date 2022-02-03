.class Lcom/digdroid/alman/dig/k2;
.super Landroidx/recyclerview/widget/RecyclerView$n;
.source ""


# instance fields
.field a:F

.field b:F

.field c:I

.field d:I

.field e:I

.field f:I

.field g:I

.field h:[I


# direct methods
.method public constructor <init>(FF[I)V
    .locals 1

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$n;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/digdroid/alman/dig/k2;->c:I

    iput v0, p0, Lcom/digdroid/alman/dig/k2;->d:I

    iput v0, p0, Lcom/digdroid/alman/dig/k2;->e:I

    iput v0, p0, Lcom/digdroid/alman/dig/k2;->f:I

    iput v0, p0, Lcom/digdroid/alman/dig/k2;->g:I

    const/high16 v0, 0x3f800000    # 1.0f

    sub-float/2addr p1, v0

    iput p1, p0, Lcom/digdroid/alman/dig/k2;->a:F

    iput p2, p0, Lcom/digdroid/alman/dig/k2;->b:F

    iput-object p3, p0, Lcom/digdroid/alman/dig/k2;->h:[I

    return-void
.end method


# virtual methods
.method public e(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$a0;)V
    .locals 5

    invoke-super {p0, p1, p2, p3, p4}, Landroidx/recyclerview/widget/RecyclerView$n;->e(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$a0;)V

    iget v0, p0, Lcom/digdroid/alman/dig/k2;->c:I

    const/4 v1, 0x1

    if-nez v0, :cond_1

    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$g;

    move-result-object v0

    check-cast v0, Lcom/digdroid/alman/dig/h;

    iget v0, v0, Lcom/digdroid/alman/dig/h;->f:I

    int-to-float v0, v0

    iget v2, p0, Lcom/digdroid/alman/dig/k2;->b:F

    mul-float v0, v0, v2

    const/high16 v2, 0x41200000    # 10.0f

    div-float/2addr v0, v2

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v0, v2

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    iput v0, p0, Lcom/digdroid/alman/dig/k2;->e:I

    invoke-virtual {p0, p2, p3}, Lcom/digdroid/alman/dig/k2;->j(Landroid/view/View;Landroid/view/ViewGroup;)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/k2;->h:[I

    const/4 v3, 0x0

    aget v0, v0, v3

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    iput v0, p0, Lcom/digdroid/alman/dig/k2;->c:I

    iget v0, p0, Lcom/digdroid/alman/dig/k2;->e:I

    mul-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/digdroid/alman/dig/k2;->d:I

    const/4 v0, 0x1

    :goto_0
    iget-object v3, p0, Lcom/digdroid/alman/dig/k2;->h:[I

    array-length v4, v3

    if-ge v0, v4, :cond_0

    iget v4, p0, Lcom/digdroid/alman/dig/k2;->d:I

    aget v3, v3, v0

    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v3

    add-int/2addr v4, v3

    iput v4, p0, Lcom/digdroid/alman/dig/k2;->d:I

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p3}, Landroid/view/ViewGroup;->getWidth()I

    move-result v0

    iget v3, p0, Lcom/digdroid/alman/dig/k2;->c:I

    sub-int/2addr v0, v3

    int-to-float v0, v0

    div-float/2addr v0, v2

    float-to-int v0, v0

    iget v3, p0, Lcom/digdroid/alman/dig/k2;->a:F

    invoke-virtual {p3}, Landroid/view/ViewGroup;->getWidth()I

    move-result v4

    int-to-float v4, v4

    mul-float v3, v3, v4

    div-float/2addr v3, v2

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v2

    add-int/2addr v0, v2

    iput v0, p0, Lcom/digdroid/alman/dig/k2;->f:I

    invoke-virtual {p3}, Landroid/view/ViewGroup;->getHeight()I

    move-result v0

    iput v0, p0, Lcom/digdroid/alman/dig/k2;->g:I

    :cond_1
    iget v0, p0, Lcom/digdroid/alman/dig/k2;->f:I

    iput v0, p1, Landroid/graphics/Rect;->left:I

    invoke-virtual {p3, p2}, Landroidx/recyclerview/widget/RecyclerView;->d0(Landroid/view/View;)I

    move-result p2

    if-nez p2, :cond_2

    iget p2, p0, Lcom/digdroid/alman/dig/k2;->g:I

    iget p3, p0, Lcom/digdroid/alman/dig/k2;->d:I

    sub-int/2addr p2, p3

    div-int/lit8 p2, p2, 0x2

    iput p2, p1, Landroid/graphics/Rect;->top:I

    goto :goto_1

    :cond_2
    invoke-virtual {p4}, Landroidx/recyclerview/widget/RecyclerView$a0;->c()I

    move-result p3

    sub-int/2addr p3, v1

    if-ne p2, p3, :cond_3

    iget p2, p0, Lcom/digdroid/alman/dig/k2;->g:I

    iget p3, p0, Lcom/digdroid/alman/dig/k2;->d:I

    sub-int/2addr p2, p3

    div-int/lit8 p2, p2, 0x2

    iput p2, p1, Landroid/graphics/Rect;->bottom:I

    :cond_3
    :goto_1
    iget p2, p1, Landroid/graphics/Rect;->top:I

    iget p3, p0, Lcom/digdroid/alman/dig/k2;->e:I

    add-int/2addr p2, p3

    iput p2, p1, Landroid/graphics/Rect;->top:I

    iget p2, p1, Landroid/graphics/Rect;->bottom:I

    add-int/2addr p2, p3

    iput p2, p1, Landroid/graphics/Rect;->bottom:I

    return-void
.end method

.method j(Landroid/view/View;Landroid/view/ViewGroup;)V
    .locals 5

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    invoke-virtual {p2}, Landroid/view/ViewGroup;->getWidth()I

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    invoke-virtual {p2}, Landroid/view/ViewGroup;->getHeight()I

    move-result v1

    const/4 v2, 0x0

    invoke-static {v1, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    invoke-virtual {p2}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v3

    invoke-virtual {p2}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v4

    add-int/2addr v3, v4

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    iget v4, v4, Landroid/view/ViewGroup$LayoutParams;->width:I

    invoke-static {v0, v3, v4}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v0

    invoke-virtual {p2}, Landroid/view/ViewGroup;->getPaddingTop()I

    move-result v3

    invoke-virtual {p2}, Landroid/view/ViewGroup;->getPaddingBottom()I

    move-result p2

    add-int/2addr v3, p2

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    iget p2, p2, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-static {v1, v3, p2}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result p2

    invoke-virtual {p1, v0, p2}, Landroid/view/View;->measure(II)V

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result p2

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    invoke-virtual {p1, v2, v2, p2, v0}, Landroid/view/View;->layout(IIII)V

    return-void
.end method

.method public k(FF)V
    .locals 1

    const/high16 v0, 0x3f800000    # 1.0f

    sub-float/2addr p1, v0

    iput p1, p0, Lcom/digdroid/alman/dig/k2;->a:F

    iput p2, p0, Lcom/digdroid/alman/dig/k2;->b:F

    const/4 p1, 0x0

    iput p1, p0, Lcom/digdroid/alman/dig/k2;->c:I

    return-void
.end method
