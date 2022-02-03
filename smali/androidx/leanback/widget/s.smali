.class Landroidx/leanback/widget/s;
.super Landroidx/leanback/widget/e;
.source ""


# instance fields
.field private final j:Landroidx/leanback/widget/e$a;


# direct methods
.method constructor <init>()V
    .locals 2

    invoke-direct {p0}, Landroidx/leanback/widget/e;-><init>()V

    new-instance v0, Landroidx/leanback/widget/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/leanback/widget/e$a;-><init>(I)V

    iput-object v0, p0, Landroidx/leanback/widget/s;->j:Landroidx/leanback/widget/e$a;

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/leanback/widget/e;->C(I)V

    return-void
.end method


# virtual methods
.method H()I
    .locals 2

    iget v0, p0, Landroidx/leanback/widget/e;->g:I

    if-ltz v0, :cond_0

    add-int/lit8 v0, v0, 0x1

    return v0

    :cond_0
    iget v0, p0, Landroidx/leanback/widget/e;->i:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    iget-object v1, p0, Landroidx/leanback/widget/e;->b:Landroidx/leanback/widget/e$b;

    invoke-interface {v1}, Landroidx/leanback/widget/e$b;->getCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method I()I
    .locals 2

    iget v0, p0, Landroidx/leanback/widget/e;->f:I

    if-ltz v0, :cond_0

    add-int/lit8 v0, v0, -0x1

    return v0

    :cond_0
    iget v0, p0, Landroidx/leanback/widget/e;->i:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    iget-object v1, p0, Landroidx/leanback/widget/e;->b:Landroidx/leanback/widget/e$b;

    invoke-interface {v1}, Landroidx/leanback/widget/e$b;->getCount()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    return v0

    :cond_1
    iget-object v0, p0, Landroidx/leanback/widget/e;->b:Landroidx/leanback/widget/e$b;

    invoke-interface {v0}, Landroidx/leanback/widget/e$b;->getCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method protected final c(IZ)Z
    .locals 9

    iget-object v0, p0, Landroidx/leanback/widget/e;->b:Landroidx/leanback/widget/e$b;

    invoke-interface {v0}, Landroidx/leanback/widget/e$b;->getCount()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    if-nez p2, :cond_1

    invoke-virtual {p0, p1}, Landroidx/leanback/widget/e;->d(I)Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    :cond_1
    invoke-virtual {p0}, Landroidx/leanback/widget/s;->H()I

    move-result v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    :goto_0
    iget-object v4, p0, Landroidx/leanback/widget/e;->b:Landroidx/leanback/widget/e$b;

    invoke-interface {v4}, Landroidx/leanback/widget/e$b;->getCount()I

    move-result v4

    if-ge v0, v4, :cond_7

    iget-object v3, p0, Landroidx/leanback/widget/e;->b:Landroidx/leanback/widget/e$b;

    iget-object v4, p0, Landroidx/leanback/widget/e;->a:[Ljava/lang/Object;

    invoke-interface {v3, v0, v2, v4, v1}, Landroidx/leanback/widget/e$b;->e(IZ[Ljava/lang/Object;Z)I

    move-result v6

    iget v3, p0, Landroidx/leanback/widget/e;->f:I

    if-ltz v3, :cond_4

    iget v3, p0, Landroidx/leanback/widget/e;->g:I

    if-gez v3, :cond_2

    goto :goto_1

    :cond_2
    iget-boolean v3, p0, Landroidx/leanback/widget/e;->c:Z

    if-eqz v3, :cond_3

    iget-object v3, p0, Landroidx/leanback/widget/e;->b:Landroidx/leanback/widget/e$b;

    add-int/lit8 v4, v0, -0x1

    invoke-interface {v3, v4}, Landroidx/leanback/widget/e$b;->b(I)I

    move-result v3

    iget-object v5, p0, Landroidx/leanback/widget/e;->b:Landroidx/leanback/widget/e$b;

    invoke-interface {v5, v4}, Landroidx/leanback/widget/e$b;->a(I)I

    move-result v4

    sub-int/2addr v3, v4

    iget v4, p0, Landroidx/leanback/widget/e;->d:I

    sub-int/2addr v3, v4

    goto :goto_3

    :cond_3
    iget-object v3, p0, Landroidx/leanback/widget/e;->b:Landroidx/leanback/widget/e$b;

    add-int/lit8 v4, v0, -0x1

    invoke-interface {v3, v4}, Landroidx/leanback/widget/e$b;->b(I)I

    move-result v3

    iget-object v5, p0, Landroidx/leanback/widget/e;->b:Landroidx/leanback/widget/e$b;

    invoke-interface {v5, v4}, Landroidx/leanback/widget/e$b;->a(I)I

    move-result v4

    add-int/2addr v3, v4

    iget v4, p0, Landroidx/leanback/widget/e;->d:I

    add-int/2addr v3, v4

    goto :goto_3

    :cond_4
    :goto_1
    iget-boolean v3, p0, Landroidx/leanback/widget/e;->c:Z

    if-eqz v3, :cond_5

    const v3, 0x7fffffff

    goto :goto_2

    :cond_5
    const/high16 v3, -0x80000000

    :goto_2
    iput v0, p0, Landroidx/leanback/widget/e;->f:I

    :goto_3
    iput v0, p0, Landroidx/leanback/widget/e;->g:I

    move v8, v3

    iget-object v3, p0, Landroidx/leanback/widget/e;->b:Landroidx/leanback/widget/e$b;

    iget-object v4, p0, Landroidx/leanback/widget/e;->a:[Ljava/lang/Object;

    aget-object v4, v4, v1

    const/4 v7, 0x0

    move v5, v0

    invoke-interface/range {v3 .. v8}, Landroidx/leanback/widget/e$b;->c(Ljava/lang/Object;IIII)V

    if-nez p2, :cond_8

    invoke-virtual {p0, p1}, Landroidx/leanback/widget/e;->d(I)Z

    move-result v3

    if-eqz v3, :cond_6

    goto :goto_4

    :cond_6
    add-int/lit8 v0, v0, 0x1

    const/4 v3, 0x1

    goto :goto_0

    :cond_7
    move v2, v3

    :cond_8
    :goto_4
    return v2
.end method

.method public f(IILandroidx/recyclerview/widget/RecyclerView$o$c;)V
    .locals 3

    iget-boolean v0, p0, Landroidx/leanback/widget/e;->c:Z

    if-eqz v0, :cond_0

    if-lez p2, :cond_3

    goto :goto_0

    :cond_0
    if-gez p2, :cond_3

    :goto_0
    invoke-virtual {p0}, Landroidx/leanback/widget/e;->m()I

    move-result p2

    if-nez p2, :cond_1

    return-void

    :cond_1
    invoke-virtual {p0}, Landroidx/leanback/widget/s;->I()I

    move-result p2

    iget-object v0, p0, Landroidx/leanback/widget/e;->b:Landroidx/leanback/widget/e$b;

    iget v1, p0, Landroidx/leanback/widget/e;->f:I

    invoke-interface {v0, v1}, Landroidx/leanback/widget/e$b;->b(I)I

    move-result v0

    iget-boolean v1, p0, Landroidx/leanback/widget/e;->c:Z

    if-eqz v1, :cond_2

    iget v1, p0, Landroidx/leanback/widget/e;->d:I

    goto :goto_1

    :cond_2
    iget v1, p0, Landroidx/leanback/widget/e;->d:I

    neg-int v1, v1

    :goto_1
    add-int/2addr v0, v1

    goto :goto_2

    :cond_3
    invoke-virtual {p0}, Landroidx/leanback/widget/e;->p()I

    move-result p2

    iget-object v0, p0, Landroidx/leanback/widget/e;->b:Landroidx/leanback/widget/e$b;

    invoke-interface {v0}, Landroidx/leanback/widget/e$b;->getCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p2, v0, :cond_4

    return-void

    :cond_4
    invoke-virtual {p0}, Landroidx/leanback/widget/s;->H()I

    move-result p2

    iget-object v0, p0, Landroidx/leanback/widget/e;->b:Landroidx/leanback/widget/e$b;

    iget v1, p0, Landroidx/leanback/widget/e;->g:I

    invoke-interface {v0, v1}, Landroidx/leanback/widget/e$b;->a(I)I

    move-result v0

    iget v1, p0, Landroidx/leanback/widget/e;->d:I

    add-int/2addr v0, v1

    iget-object v1, p0, Landroidx/leanback/widget/e;->b:Landroidx/leanback/widget/e$b;

    iget v2, p0, Landroidx/leanback/widget/e;->g:I

    invoke-interface {v1, v2}, Landroidx/leanback/widget/e$b;->b(I)I

    move-result v1

    iget-boolean v2, p0, Landroidx/leanback/widget/e;->c:Z

    if-eqz v2, :cond_5

    neg-int v0, v0

    :cond_5
    add-int/2addr v0, v1

    :goto_2
    sub-int/2addr v0, p1

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result p1

    invoke-interface {p3, p2, p1}, Landroidx/recyclerview/widget/RecyclerView$o$c;->a(II)V

    return-void
.end method

.method protected final i(ZI[I)I
    .locals 0

    if-eqz p3, :cond_0

    const/4 p1, 0x0

    aput p1, p3, p1

    const/4 p1, 0x1

    aput p2, p3, p1

    :cond_0
    iget-boolean p1, p0, Landroidx/leanback/widget/e;->c:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, Landroidx/leanback/widget/e;->b:Landroidx/leanback/widget/e$b;

    invoke-interface {p1, p2}, Landroidx/leanback/widget/e$b;->b(I)I

    move-result p1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Landroidx/leanback/widget/e;->b:Landroidx/leanback/widget/e$b;

    invoke-interface {p1, p2}, Landroidx/leanback/widget/e$b;->b(I)I

    move-result p1

    iget-object p3, p0, Landroidx/leanback/widget/e;->b:Landroidx/leanback/widget/e$b;

    invoke-interface {p3, p2}, Landroidx/leanback/widget/e$b;->a(I)I

    move-result p2

    add-int/2addr p1, p2

    :goto_0
    return p1
.end method

.method protected final k(ZI[I)I
    .locals 0

    if-eqz p3, :cond_0

    const/4 p1, 0x0

    aput p1, p3, p1

    const/4 p1, 0x1

    aput p2, p3, p1

    :cond_0
    iget-boolean p1, p0, Landroidx/leanback/widget/e;->c:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, Landroidx/leanback/widget/e;->b:Landroidx/leanback/widget/e$b;

    invoke-interface {p1, p2}, Landroidx/leanback/widget/e$b;->b(I)I

    move-result p1

    iget-object p3, p0, Landroidx/leanback/widget/e;->b:Landroidx/leanback/widget/e$b;

    invoke-interface {p3, p2}, Landroidx/leanback/widget/e$b;->a(I)I

    move-result p2

    sub-int/2addr p1, p2

    goto :goto_0

    :cond_1
    iget-object p1, p0, Landroidx/leanback/widget/e;->b:Landroidx/leanback/widget/e$b;

    invoke-interface {p1, p2}, Landroidx/leanback/widget/e$b;->b(I)I

    move-result p1

    :goto_0
    return p1
.end method

.method public final o(II)[Lb/d/d;
    .locals 2

    iget-object v0, p0, Landroidx/leanback/widget/e;->h:[Lb/d/d;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, Lb/d/d;->b()V

    iget-object v0, p0, Landroidx/leanback/widget/e;->h:[Lb/d/d;

    aget-object v0, v0, v1

    invoke-virtual {v0, p1}, Lb/d/d;->a(I)V

    iget-object p1, p0, Landroidx/leanback/widget/e;->h:[Lb/d/d;

    aget-object p1, p1, v1

    invoke-virtual {p1, p2}, Lb/d/d;->a(I)V

    iget-object p1, p0, Landroidx/leanback/widget/e;->h:[Lb/d/d;

    return-object p1
.end method

.method public final q(I)Landroidx/leanback/widget/e$a;
    .locals 0

    iget-object p1, p0, Landroidx/leanback/widget/s;->j:Landroidx/leanback/widget/e$a;

    return-object p1
.end method

.method protected final x(IZ)Z
    .locals 10

    iget-object v0, p0, Landroidx/leanback/widget/e;->b:Landroidx/leanback/widget/e$b;

    invoke-interface {v0}, Landroidx/leanback/widget/e$b;->getCount()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    if-nez p2, :cond_1

    invoke-virtual {p0, p1}, Landroidx/leanback/widget/e;->e(I)Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    :cond_1
    iget-object v0, p0, Landroidx/leanback/widget/e;->b:Landroidx/leanback/widget/e$b;

    invoke-interface {v0}, Landroidx/leanback/widget/e$b;->d()I

    move-result v0

    invoke-virtual {p0}, Landroidx/leanback/widget/s;->I()I

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    :goto_0
    if-lt v2, v0, :cond_7

    iget-object v4, p0, Landroidx/leanback/widget/e;->b:Landroidx/leanback/widget/e$b;

    iget-object v5, p0, Landroidx/leanback/widget/e;->a:[Ljava/lang/Object;

    invoke-interface {v4, v2, v1, v5, v1}, Landroidx/leanback/widget/e$b;->e(IZ[Ljava/lang/Object;Z)I

    move-result v7

    iget v4, p0, Landroidx/leanback/widget/e;->f:I

    if-ltz v4, :cond_4

    iget v4, p0, Landroidx/leanback/widget/e;->g:I

    if-gez v4, :cond_2

    goto :goto_2

    :cond_2
    iget-boolean v4, p0, Landroidx/leanback/widget/e;->c:Z

    if-eqz v4, :cond_3

    iget-object v4, p0, Landroidx/leanback/widget/e;->b:Landroidx/leanback/widget/e$b;

    add-int/lit8 v5, v2, 0x1

    invoke-interface {v4, v5}, Landroidx/leanback/widget/e$b;->b(I)I

    move-result v4

    iget v5, p0, Landroidx/leanback/widget/e;->d:I

    add-int/2addr v4, v5

    add-int/2addr v4, v7

    goto :goto_1

    :cond_3
    iget-object v4, p0, Landroidx/leanback/widget/e;->b:Landroidx/leanback/widget/e$b;

    add-int/lit8 v5, v2, 0x1

    invoke-interface {v4, v5}, Landroidx/leanback/widget/e$b;->b(I)I

    move-result v4

    iget v5, p0, Landroidx/leanback/widget/e;->d:I

    sub-int/2addr v4, v5

    sub-int/2addr v4, v7

    :goto_1
    iput v2, p0, Landroidx/leanback/widget/e;->f:I

    goto :goto_4

    :cond_4
    :goto_2
    iget-boolean v4, p0, Landroidx/leanback/widget/e;->c:Z

    if-eqz v4, :cond_5

    const/high16 v4, -0x80000000

    goto :goto_3

    :cond_5
    const v4, 0x7fffffff

    :goto_3
    iput v2, p0, Landroidx/leanback/widget/e;->f:I

    iput v2, p0, Landroidx/leanback/widget/e;->g:I

    :goto_4
    move v9, v4

    iget-object v4, p0, Landroidx/leanback/widget/e;->b:Landroidx/leanback/widget/e$b;

    iget-object v5, p0, Landroidx/leanback/widget/e;->a:[Ljava/lang/Object;

    aget-object v5, v5, v1

    const/4 v8, 0x0

    move v6, v2

    invoke-interface/range {v4 .. v9}, Landroidx/leanback/widget/e$b;->c(Ljava/lang/Object;IIII)V

    if-nez p2, :cond_8

    invoke-virtual {p0, p1}, Landroidx/leanback/widget/e;->e(I)Z

    move-result v4

    if-eqz v4, :cond_6

    goto :goto_5

    :cond_6
    add-int/lit8 v2, v2, -0x1

    const/4 v4, 0x1

    goto :goto_0

    :cond_7
    move v3, v4

    :cond_8
    :goto_5
    return v3
.end method
