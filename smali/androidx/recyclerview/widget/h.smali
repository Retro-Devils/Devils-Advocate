.class public Landroidx/recyclerview/widget/h;
.super Landroidx/recyclerview/widget/n;
.source ""


# instance fields
.field private d:Landroidx/recyclerview/widget/j;

.field private e:Landroidx/recyclerview/widget/j;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/recyclerview/widget/n;-><init>()V

    return-void
.end method

.method private m(Landroidx/recyclerview/widget/RecyclerView$o;Landroidx/recyclerview/widget/j;)F
    .locals 10

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$o;->M()I

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v2, 0x0

    const/4 v3, 0x0

    const v4, 0x7fffffff

    const/high16 v5, -0x80000000

    move-object v4, v3

    const v5, 0x7fffffff

    const/high16 v6, -0x80000000

    :goto_0
    if-ge v2, v0, :cond_4

    invoke-virtual {p1, v2}, Landroidx/recyclerview/widget/RecyclerView$o;->L(I)Landroid/view/View;

    move-result-object v7

    invoke-virtual {p1, v7}, Landroidx/recyclerview/widget/RecyclerView$o;->l0(Landroid/view/View;)I

    move-result v8

    const/4 v9, -0x1

    if-ne v8, v9, :cond_1

    goto :goto_1

    :cond_1
    if-ge v8, v5, :cond_2

    move-object v3, v7

    move v5, v8

    :cond_2
    if-le v8, v6, :cond_3

    move-object v4, v7

    move v6, v8

    :cond_3
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    if-eqz v3, :cond_7

    if-nez v4, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {p2, v3}, Landroidx/recyclerview/widget/j;->g(Landroid/view/View;)I

    move-result p1

    invoke-virtual {p2, v4}, Landroidx/recyclerview/widget/j;->g(Landroid/view/View;)I

    move-result v0

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-virtual {p2, v3}, Landroidx/recyclerview/widget/j;->d(Landroid/view/View;)I

    move-result v0

    invoke-virtual {p2, v4}, Landroidx/recyclerview/widget/j;->d(Landroid/view/View;)I

    move-result p2

    invoke-static {v0, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    sub-int/2addr p2, p1

    if-nez p2, :cond_6

    return v1

    :cond_6
    int-to-float p1, p2

    mul-float p1, p1, v1

    sub-int/2addr v6, v5

    add-int/lit8 v6, v6, 0x1

    int-to-float p2, v6

    div-float/2addr p1, p2

    return p1

    :cond_7
    :goto_2
    return v1
.end method

.method private n(Landroidx/recyclerview/widget/RecyclerView$o;Landroid/view/View;Landroidx/recyclerview/widget/j;)I
    .locals 0

    invoke-virtual {p3, p2}, Landroidx/recyclerview/widget/j;->g(Landroid/view/View;)I

    move-result p1

    invoke-virtual {p3, p2}, Landroidx/recyclerview/widget/j;->e(Landroid/view/View;)I

    move-result p2

    div-int/lit8 p2, p2, 0x2

    add-int/2addr p1, p2

    invoke-virtual {p3}, Landroidx/recyclerview/widget/j;->m()I

    move-result p2

    invoke-virtual {p3}, Landroidx/recyclerview/widget/j;->n()I

    move-result p3

    div-int/lit8 p3, p3, 0x2

    add-int/2addr p2, p3

    sub-int/2addr p1, p2

    return p1
.end method

.method private o(Landroidx/recyclerview/widget/RecyclerView$o;Landroidx/recyclerview/widget/j;II)I
    .locals 2

    invoke-virtual {p0, p3, p4}, Landroidx/recyclerview/widget/n;->d(II)[I

    move-result-object p3

    invoke-direct {p0, p1, p2}, Landroidx/recyclerview/widget/h;->m(Landroidx/recyclerview/widget/RecyclerView$o;Landroidx/recyclerview/widget/j;)F

    move-result p1

    const/4 p2, 0x0

    const/4 p4, 0x0

    cmpg-float p4, p1, p4

    if-gtz p4, :cond_0

    return p2

    :cond_0
    aget p4, p3, p2

    invoke-static {p4}, Ljava/lang/Math;->abs(I)I

    move-result p4

    const/4 v0, 0x1

    aget v1, p3, v0

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    if-le p4, v1, :cond_1

    aget p2, p3, p2

    goto :goto_0

    :cond_1
    aget p2, p3, v0

    :goto_0
    int-to-float p2, p2

    div-float/2addr p2, p1

    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    move-result p1

    return p1
.end method

.method private p(Landroidx/recyclerview/widget/RecyclerView$o;Landroidx/recyclerview/widget/j;)Landroid/view/View;
    .locals 8

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$o;->M()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {p2}, Landroidx/recyclerview/widget/j;->m()I

    move-result v2

    invoke-virtual {p2}, Landroidx/recyclerview/widget/j;->n()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    add-int/2addr v2, v3

    const v3, 0x7fffffff

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v0, :cond_2

    invoke-virtual {p1, v4}, Landroidx/recyclerview/widget/RecyclerView$o;->L(I)Landroid/view/View;

    move-result-object v5

    invoke-virtual {p2, v5}, Landroidx/recyclerview/widget/j;->g(Landroid/view/View;)I

    move-result v6

    invoke-virtual {p2, v5}, Landroidx/recyclerview/widget/j;->e(Landroid/view/View;)I

    move-result v7

    div-int/lit8 v7, v7, 0x2

    add-int/2addr v6, v7

    sub-int/2addr v6, v2

    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    move-result v6

    if-ge v6, v3, :cond_1

    move-object v1, v5

    move v3, v6

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method private q(Landroidx/recyclerview/widget/RecyclerView$o;)Landroidx/recyclerview/widget/j;
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/h;->e:Landroidx/recyclerview/widget/j;

    if-eqz v0, :cond_0

    iget-object v0, v0, Landroidx/recyclerview/widget/j;->a:Landroidx/recyclerview/widget/RecyclerView$o;

    if-eq v0, p1, :cond_1

    :cond_0
    invoke-static {p1}, Landroidx/recyclerview/widget/j;->a(Landroidx/recyclerview/widget/RecyclerView$o;)Landroidx/recyclerview/widget/j;

    move-result-object p1

    iput-object p1, p0, Landroidx/recyclerview/widget/h;->e:Landroidx/recyclerview/widget/j;

    :cond_1
    iget-object p1, p0, Landroidx/recyclerview/widget/h;->e:Landroidx/recyclerview/widget/j;

    return-object p1
.end method

.method private r(Landroidx/recyclerview/widget/RecyclerView$o;)Landroidx/recyclerview/widget/j;
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/h;->d:Landroidx/recyclerview/widget/j;

    if-eqz v0, :cond_0

    iget-object v0, v0, Landroidx/recyclerview/widget/j;->a:Landroidx/recyclerview/widget/RecyclerView$o;

    if-eq v0, p1, :cond_1

    :cond_0
    invoke-static {p1}, Landroidx/recyclerview/widget/j;->c(Landroidx/recyclerview/widget/RecyclerView$o;)Landroidx/recyclerview/widget/j;

    move-result-object p1

    iput-object p1, p0, Landroidx/recyclerview/widget/h;->d:Landroidx/recyclerview/widget/j;

    :cond_1
    iget-object p1, p0, Landroidx/recyclerview/widget/h;->d:Landroidx/recyclerview/widget/j;

    return-object p1
.end method


# virtual methods
.method public c(Landroidx/recyclerview/widget/RecyclerView$o;Landroid/view/View;)[I
    .locals 4

    const/4 v0, 0x2

    new-array v0, v0, [I

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$o;->l()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/h;->q(Landroidx/recyclerview/widget/RecyclerView$o;)Landroidx/recyclerview/widget/j;

    move-result-object v1

    invoke-direct {p0, p1, p2, v1}, Landroidx/recyclerview/widget/h;->n(Landroidx/recyclerview/widget/RecyclerView$o;Landroid/view/View;Landroidx/recyclerview/widget/j;)I

    move-result v1

    aput v1, v0, v2

    goto :goto_0

    :cond_0
    aput v2, v0, v2

    :goto_0
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$o;->m()Z

    move-result v1

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/h;->r(Landroidx/recyclerview/widget/RecyclerView$o;)Landroidx/recyclerview/widget/j;

    move-result-object v1

    invoke-direct {p0, p1, p2, v1}, Landroidx/recyclerview/widget/h;->n(Landroidx/recyclerview/widget/RecyclerView$o;Landroid/view/View;Landroidx/recyclerview/widget/j;)I

    move-result p1

    aput p1, v0, v3

    goto :goto_1

    :cond_1
    aput v2, v0, v3

    :goto_1
    return-object v0
.end method

.method public h(Landroidx/recyclerview/widget/RecyclerView$o;)Landroid/view/View;
    .locals 1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$o;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/h;->r(Landroidx/recyclerview/widget/RecyclerView$o;)Landroidx/recyclerview/widget/j;

    move-result-object v0

    :goto_0
    invoke-direct {p0, p1, v0}, Landroidx/recyclerview/widget/h;->p(Landroidx/recyclerview/widget/RecyclerView$o;Landroidx/recyclerview/widget/j;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$o;->l()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/h;->q(Landroidx/recyclerview/widget/RecyclerView$o;)Landroidx/recyclerview/widget/j;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public i(Landroidx/recyclerview/widget/RecyclerView$o;II)I
    .locals 8

    instance-of v0, p1, Landroidx/recyclerview/widget/RecyclerView$z$b;

    const/4 v1, -0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$o;->c0()I

    move-result v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/h;->h(Landroidx/recyclerview/widget/RecyclerView$o;)Landroid/view/View;

    move-result-object v2

    if-nez v2, :cond_2

    return v1

    :cond_2
    invoke-virtual {p1, v2}, Landroidx/recyclerview/widget/RecyclerView$o;->l0(Landroid/view/View;)I

    move-result v2

    if-ne v2, v1, :cond_3

    return v1

    :cond_3
    move-object v3, p1

    check-cast v3, Landroidx/recyclerview/widget/RecyclerView$z$b;

    add-int/lit8 v4, v0, -0x1

    invoke-interface {v3, v4}, Landroidx/recyclerview/widget/RecyclerView$z$b;->a(I)Landroid/graphics/PointF;

    move-result-object v3

    if-nez v3, :cond_4

    return v1

    :cond_4
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$o;->l()Z

    move-result v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    if-eqz v5, :cond_5

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/h;->q(Landroidx/recyclerview/widget/RecyclerView$o;)Landroidx/recyclerview/widget/j;

    move-result-object v5

    invoke-direct {p0, p1, v5, p2, v7}, Landroidx/recyclerview/widget/h;->o(Landroidx/recyclerview/widget/RecyclerView$o;Landroidx/recyclerview/widget/j;II)I

    move-result p2

    iget v5, v3, Landroid/graphics/PointF;->x:F

    cmpg-float v5, v5, v6

    if-gez v5, :cond_6

    neg-int p2, p2

    goto :goto_0

    :cond_5
    const/4 p2, 0x0

    :cond_6
    :goto_0
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$o;->m()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/h;->r(Landroidx/recyclerview/widget/RecyclerView$o;)Landroidx/recyclerview/widget/j;

    move-result-object v5

    invoke-direct {p0, p1, v5, v7, p3}, Landroidx/recyclerview/widget/h;->o(Landroidx/recyclerview/widget/RecyclerView$o;Landroidx/recyclerview/widget/j;II)I

    move-result p3

    iget v3, v3, Landroid/graphics/PointF;->y:F

    cmpg-float v3, v3, v6

    if-gez v3, :cond_8

    neg-int p3, p3

    goto :goto_1

    :cond_7
    const/4 p3, 0x0

    :cond_8
    :goto_1
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$o;->m()Z

    move-result p1

    if-eqz p1, :cond_9

    move p2, p3

    :cond_9
    if-nez p2, :cond_a

    return v1

    :cond_a
    add-int/2addr v2, p2

    if-gez v2, :cond_b

    goto :goto_2

    :cond_b
    move v7, v2

    :goto_2
    if-lt v7, v0, :cond_c

    goto :goto_3

    :cond_c
    move v4, v7

    :goto_3
    return v4
.end method
