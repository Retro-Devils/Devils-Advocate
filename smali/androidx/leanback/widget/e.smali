.class abstract Landroidx/leanback/widget/e;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/leanback/widget/e$a;,
        Landroidx/leanback/widget/e$b;
    }
.end annotation


# instance fields
.field a:[Ljava/lang/Object;

.field protected b:Landroidx/leanback/widget/e$b;

.field protected c:Z

.field protected d:I

.field protected e:I

.field protected f:I

.field protected g:I

.field protected h:[Lb/d/d;

.field protected i:I


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    iput-object v0, p0, Landroidx/leanback/widget/e;->a:[Ljava/lang/Object;

    const/4 v0, -0x1

    iput v0, p0, Landroidx/leanback/widget/e;->f:I

    iput v0, p0, Landroidx/leanback/widget/e;->g:I

    iput v0, p0, Landroidx/leanback/widget/e;->i:I

    return-void
.end method

.method private B()V
    .locals 2

    iget v0, p0, Landroidx/leanback/widget/e;->g:I

    iget v1, p0, Landroidx/leanback/widget/e;->f:I

    if-ge v0, v1, :cond_0

    invoke-virtual {p0}, Landroidx/leanback/widget/e;->A()V

    :cond_0
    return-void
.end method

.method public static g(I)Landroidx/leanback/widget/e;
    .locals 1

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    new-instance p0, Landroidx/leanback/widget/s;

    invoke-direct {p0}, Landroidx/leanback/widget/s;-><init>()V

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/leanback/widget/v;

    invoke-direct {v0}, Landroidx/leanback/widget/v;-><init>()V

    invoke-virtual {v0, p0}, Landroidx/leanback/widget/e;->C(I)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method


# virtual methods
.method public A()V
    .locals 1

    const/4 v0, -0x1

    iput v0, p0, Landroidx/leanback/widget/e;->g:I

    iput v0, p0, Landroidx/leanback/widget/e;->f:I

    return-void
.end method

.method C(I)V
    .locals 2

    if-lez p1, :cond_2

    iget v0, p0, Landroidx/leanback/widget/e;->e:I

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput p1, p0, Landroidx/leanback/widget/e;->e:I

    new-array p1, p1, [Lb/d/d;

    iput-object p1, p0, Landroidx/leanback/widget/e;->h:[Lb/d/d;

    const/4 p1, 0x0

    :goto_0
    iget v0, p0, Landroidx/leanback/widget/e;->e:I

    if-ge p1, v0, :cond_1

    iget-object v0, p0, Landroidx/leanback/widget/e;->h:[Lb/d/d;

    new-instance v1, Lb/d/d;

    invoke-direct {v1}, Lb/d/d;-><init>()V

    aput-object v1, v0, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method

.method public D(Landroidx/leanback/widget/e$b;)V
    .locals 0

    iput-object p1, p0, Landroidx/leanback/widget/e;->b:Landroidx/leanback/widget/e$b;

    return-void
.end method

.method public final E(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/leanback/widget/e;->c:Z

    return-void
.end method

.method public final F(I)V
    .locals 0

    iput p1, p0, Landroidx/leanback/widget/e;->d:I

    return-void
.end method

.method public G(I)V
    .locals 0

    iput p1, p0, Landroidx/leanback/widget/e;->i:I

    return-void
.end method

.method public a()Z
    .locals 2

    iget-boolean v0, p0, Landroidx/leanback/widget/e;->c:Z

    if-eqz v0, :cond_0

    const v0, 0x7fffffff

    goto :goto_0

    :cond_0
    const/high16 v0, -0x80000000

    :goto_0
    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Landroidx/leanback/widget/e;->c(IZ)Z

    move-result v0

    return v0
.end method

.method public final b(I)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroidx/leanback/widget/e;->c(IZ)Z

    return-void
.end method

.method protected abstract c(IZ)Z
.end method

.method protected final d(I)Z
    .locals 4

    iget v0, p0, Landroidx/leanback/widget/e;->g:I

    const/4 v1, 0x0

    if-gez v0, :cond_0

    return v1

    :cond_0
    iget-boolean v0, p0, Landroidx/leanback/widget/e;->c:Z

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_1

    invoke-virtual {p0, v3, v2}, Landroidx/leanback/widget/e;->l(Z[I)I

    move-result v0

    iget v2, p0, Landroidx/leanback/widget/e;->d:I

    add-int/2addr p1, v2

    if-gt v0, p1, :cond_2

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v1, v2}, Landroidx/leanback/widget/e;->j(Z[I)I

    move-result v0

    iget v2, p0, Landroidx/leanback/widget/e;->d:I

    sub-int/2addr p1, v2

    if-lt v0, p1, :cond_2

    :goto_0
    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method protected final e(I)Z
    .locals 4

    iget v0, p0, Landroidx/leanback/widget/e;->g:I

    const/4 v1, 0x0

    if-gez v0, :cond_0

    return v1

    :cond_0
    iget-boolean v0, p0, Landroidx/leanback/widget/e;->c:Z

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_1

    invoke-virtual {p0, v1, v2}, Landroidx/leanback/widget/e;->j(Z[I)I

    move-result v0

    iget v2, p0, Landroidx/leanback/widget/e;->d:I

    sub-int/2addr p1, v2

    if-lt v0, p1, :cond_2

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v3, v2}, Landroidx/leanback/widget/e;->l(Z[I)I

    move-result v0

    iget v2, p0, Landroidx/leanback/widget/e;->d:I

    add-int/2addr p1, v2

    if-gt v0, p1, :cond_2

    :goto_0
    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method public f(IILandroidx/recyclerview/widget/RecyclerView$o$c;)V
    .locals 0

    return-void
.end method

.method public h([IILandroid/util/SparseIntArray;)V
    .locals 11

    invoke-virtual {p0}, Landroidx/leanback/widget/e;->p()I

    move-result v0

    const/4 v1, 0x0

    if-ltz v0, :cond_0

    invoke-static {p1, v1, p2, v0}, Ljava/util/Arrays;->binarySearch([IIII)I

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x1

    if-gez v2, :cond_4

    neg-int v2, v2

    sub-int/2addr v2, v3

    iget-boolean v4, p0, Landroidx/leanback/widget/e;->c:Z

    if-eqz v4, :cond_1

    iget-object v4, p0, Landroidx/leanback/widget/e;->b:Landroidx/leanback/widget/e$b;

    invoke-interface {v4, v0}, Landroidx/leanback/widget/e$b;->b(I)I

    move-result v4

    iget-object v5, p0, Landroidx/leanback/widget/e;->b:Landroidx/leanback/widget/e$b;

    invoke-interface {v5, v0}, Landroidx/leanback/widget/e$b;->a(I)I

    move-result v0

    sub-int/2addr v4, v0

    iget v0, p0, Landroidx/leanback/widget/e;->d:I

    sub-int/2addr v4, v0

    goto :goto_1

    :cond_1
    iget-object v4, p0, Landroidx/leanback/widget/e;->b:Landroidx/leanback/widget/e$b;

    invoke-interface {v4, v0}, Landroidx/leanback/widget/e$b;->b(I)I

    move-result v4

    iget-object v5, p0, Landroidx/leanback/widget/e;->b:Landroidx/leanback/widget/e$b;

    invoke-interface {v5, v0}, Landroidx/leanback/widget/e$b;->a(I)I

    move-result v0

    add-int/2addr v4, v0

    iget v0, p0, Landroidx/leanback/widget/e;->d:I

    add-int/2addr v4, v0

    :goto_1
    move v0, v4

    :goto_2
    if-ge v2, p2, :cond_4

    aget v6, p1, v2

    invoke-virtual {p3, v6}, Landroid/util/SparseIntArray;->get(I)I

    move-result v4

    if-gez v4, :cond_2

    const/4 v8, 0x0

    goto :goto_3

    :cond_2
    move v8, v4

    :goto_3
    iget-object v4, p0, Landroidx/leanback/widget/e;->b:Landroidx/leanback/widget/e$b;

    iget-object v5, p0, Landroidx/leanback/widget/e;->a:[Ljava/lang/Object;

    invoke-interface {v4, v6, v3, v5, v3}, Landroidx/leanback/widget/e$b;->e(IZ[Ljava/lang/Object;Z)I

    move-result v10

    iget-object v4, p0, Landroidx/leanback/widget/e;->b:Landroidx/leanback/widget/e$b;

    iget-object v5, p0, Landroidx/leanback/widget/e;->a:[Ljava/lang/Object;

    aget-object v5, v5, v1

    move v7, v10

    move v9, v0

    invoke-interface/range {v4 .. v9}, Landroidx/leanback/widget/e$b;->c(Ljava/lang/Object;IIII)V

    iget-boolean v4, p0, Landroidx/leanback/widget/e;->c:Z

    if-eqz v4, :cond_3

    sub-int/2addr v0, v10

    iget v4, p0, Landroidx/leanback/widget/e;->d:I

    sub-int/2addr v0, v4

    goto :goto_4

    :cond_3
    add-int/2addr v0, v10

    iget v4, p0, Landroidx/leanback/widget/e;->d:I

    add-int/2addr v0, v4

    :goto_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_4
    invoke-virtual {p0}, Landroidx/leanback/widget/e;->m()I

    move-result v0

    if-ltz v0, :cond_5

    invoke-static {p1, v1, p2, v0}, Ljava/util/Arrays;->binarySearch([IIII)I

    move-result p2

    goto :goto_5

    :cond_5
    const/4 p2, 0x0

    :goto_5
    if-gez p2, :cond_8

    neg-int p2, p2

    add-int/lit8 p2, p2, -0x2

    iget-boolean v2, p0, Landroidx/leanback/widget/e;->c:Z

    iget-object v2, p0, Landroidx/leanback/widget/e;->b:Landroidx/leanback/widget/e$b;

    invoke-interface {v2, v0}, Landroidx/leanback/widget/e$b;->b(I)I

    move-result v0

    :goto_6
    if-ltz p2, :cond_8

    aget v6, p1, p2

    invoke-virtual {p3, v6}, Landroid/util/SparseIntArray;->get(I)I

    move-result v2

    if-gez v2, :cond_6

    const/4 v8, 0x0

    goto :goto_7

    :cond_6
    move v8, v2

    :goto_7
    iget-object v2, p0, Landroidx/leanback/widget/e;->b:Landroidx/leanback/widget/e$b;

    iget-object v4, p0, Landroidx/leanback/widget/e;->a:[Ljava/lang/Object;

    invoke-interface {v2, v6, v1, v4, v3}, Landroidx/leanback/widget/e$b;->e(IZ[Ljava/lang/Object;Z)I

    move-result v7

    iget-boolean v2, p0, Landroidx/leanback/widget/e;->c:Z

    if-eqz v2, :cond_7

    iget v2, p0, Landroidx/leanback/widget/e;->d:I

    add-int/2addr v0, v2

    add-int/2addr v0, v7

    goto :goto_8

    :cond_7
    iget v2, p0, Landroidx/leanback/widget/e;->d:I

    sub-int/2addr v0, v2

    sub-int/2addr v0, v7

    :goto_8
    iget-object v4, p0, Landroidx/leanback/widget/e;->b:Landroidx/leanback/widget/e$b;

    iget-object v2, p0, Landroidx/leanback/widget/e;->a:[Ljava/lang/Object;

    aget-object v5, v2, v1

    move v9, v0

    invoke-interface/range {v4 .. v9}, Landroidx/leanback/widget/e$b;->c(Ljava/lang/Object;IIII)V

    add-int/lit8 p2, p2, -0x1

    goto :goto_6

    :cond_8
    return-void
.end method

.method protected abstract i(ZI[I)I
.end method

.method public final j(Z[I)I
    .locals 1

    iget-boolean v0, p0, Landroidx/leanback/widget/e;->c:Z

    if-eqz v0, :cond_0

    iget v0, p0, Landroidx/leanback/widget/e;->f:I

    goto :goto_0

    :cond_0
    iget v0, p0, Landroidx/leanback/widget/e;->g:I

    :goto_0
    invoke-virtual {p0, p1, v0, p2}, Landroidx/leanback/widget/e;->i(ZI[I)I

    move-result p1

    return p1
.end method

.method protected abstract k(ZI[I)I
.end method

.method public final l(Z[I)I
    .locals 1

    iget-boolean v0, p0, Landroidx/leanback/widget/e;->c:Z

    if-eqz v0, :cond_0

    iget v0, p0, Landroidx/leanback/widget/e;->g:I

    goto :goto_0

    :cond_0
    iget v0, p0, Landroidx/leanback/widget/e;->f:I

    :goto_0
    invoke-virtual {p0, p1, v0, p2}, Landroidx/leanback/widget/e;->k(ZI[I)I

    move-result p1

    return p1
.end method

.method public final m()I
    .locals 1

    iget v0, p0, Landroidx/leanback/widget/e;->f:I

    return v0
.end method

.method public final n()[Lb/d/d;
    .locals 2

    invoke-virtual {p0}, Landroidx/leanback/widget/e;->m()I

    move-result v0

    invoke-virtual {p0}, Landroidx/leanback/widget/e;->p()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Landroidx/leanback/widget/e;->o(II)[Lb/d/d;

    move-result-object v0

    return-object v0
.end method

.method public abstract o(II)[Lb/d/d;
.end method

.method public final p()I
    .locals 1

    iget v0, p0, Landroidx/leanback/widget/e;->g:I

    return v0
.end method

.method public abstract q(I)Landroidx/leanback/widget/e$a;
.end method

.method public r()I
    .locals 1

    iget v0, p0, Landroidx/leanback/widget/e;->e:I

    return v0
.end method

.method public final s(I)I
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/leanback/widget/e;->q(I)Landroidx/leanback/widget/e$a;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    iget p1, p1, Landroidx/leanback/widget/e$a;->a:I

    return p1
.end method

.method public t(I)V
    .locals 1

    if-gez p1, :cond_0

    return-void

    :cond_0
    iget v0, p0, Landroidx/leanback/widget/e;->g:I

    if-gez v0, :cond_1

    return-void

    :cond_1
    if-lt v0, p1, :cond_2

    add-int/lit8 v0, p1, -0x1

    iput v0, p0, Landroidx/leanback/widget/e;->g:I

    :cond_2
    invoke-direct {p0}, Landroidx/leanback/widget/e;->B()V

    invoke-virtual {p0}, Landroidx/leanback/widget/e;->m()I

    move-result v0

    if-gez v0, :cond_3

    invoke-virtual {p0, p1}, Landroidx/leanback/widget/e;->G(I)V

    :cond_3
    return-void
.end method

.method public u()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/leanback/widget/e;->c:Z

    return v0
.end method

.method public final v()Z
    .locals 2

    iget-boolean v0, p0, Landroidx/leanback/widget/e;->c:Z

    if-eqz v0, :cond_0

    const/high16 v0, -0x80000000

    goto :goto_0

    :cond_0
    const v0, 0x7fffffff

    :goto_0
    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Landroidx/leanback/widget/e;->x(IZ)Z

    move-result v0

    return v0
.end method

.method public final w(I)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroidx/leanback/widget/e;->x(IZ)Z

    return-void
.end method

.method protected abstract x(IZ)Z
.end method

.method public y(II)V
    .locals 4

    :goto_0
    iget v0, p0, Landroidx/leanback/widget/e;->g:I

    iget v1, p0, Landroidx/leanback/widget/e;->f:I

    if-lt v0, v1, :cond_2

    if-le v0, p1, :cond_2

    iget-boolean v1, p0, Landroidx/leanback/widget/e;->c:Z

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_0

    iget-object v1, p0, Landroidx/leanback/widget/e;->b:Landroidx/leanback/widget/e$b;

    invoke-interface {v1, v0}, Landroidx/leanback/widget/e$b;->b(I)I

    move-result v0

    if-lt v0, p2, :cond_1

    goto :goto_1

    :cond_0
    iget-object v1, p0, Landroidx/leanback/widget/e;->b:Landroidx/leanback/widget/e$b;

    invoke-interface {v1, v0}, Landroidx/leanback/widget/e$b;->b(I)I

    move-result v0

    if-gt v0, p2, :cond_1

    :goto_1
    const/4 v2, 0x1

    :cond_1
    if-eqz v2, :cond_2

    iget-object v0, p0, Landroidx/leanback/widget/e;->b:Landroidx/leanback/widget/e$b;

    iget v1, p0, Landroidx/leanback/widget/e;->g:I

    invoke-interface {v0, v1}, Landroidx/leanback/widget/e$b;->removeItem(I)V

    iget v0, p0, Landroidx/leanback/widget/e;->g:I

    sub-int/2addr v0, v3

    iput v0, p0, Landroidx/leanback/widget/e;->g:I

    goto :goto_0

    :cond_2
    invoke-direct {p0}, Landroidx/leanback/widget/e;->B()V

    return-void
.end method

.method public z(II)V
    .locals 5

    :goto_0
    iget v0, p0, Landroidx/leanback/widget/e;->g:I

    iget v1, p0, Landroidx/leanback/widget/e;->f:I

    if-lt v0, v1, :cond_2

    if-ge v1, p1, :cond_2

    iget-object v0, p0, Landroidx/leanback/widget/e;->b:Landroidx/leanback/widget/e$b;

    invoke-interface {v0, v1}, Landroidx/leanback/widget/e$b;->a(I)I

    move-result v0

    iget-boolean v1, p0, Landroidx/leanback/widget/e;->c:Z

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_0

    iget-object v1, p0, Landroidx/leanback/widget/e;->b:Landroidx/leanback/widget/e$b;

    iget v4, p0, Landroidx/leanback/widget/e;->f:I

    invoke-interface {v1, v4}, Landroidx/leanback/widget/e$b;->b(I)I

    move-result v1

    add-int/2addr v1, v0

    if-gt v1, p2, :cond_1

    goto :goto_1

    :cond_0
    iget-object v1, p0, Landroidx/leanback/widget/e;->b:Landroidx/leanback/widget/e$b;

    iget v4, p0, Landroidx/leanback/widget/e;->f:I

    invoke-interface {v1, v4}, Landroidx/leanback/widget/e$b;->b(I)I

    move-result v1

    sub-int/2addr v1, v0

    if-lt v1, p2, :cond_1

    :goto_1
    const/4 v2, 0x1

    :cond_1
    if-eqz v2, :cond_2

    iget-object v0, p0, Landroidx/leanback/widget/e;->b:Landroidx/leanback/widget/e$b;

    iget v1, p0, Landroidx/leanback/widget/e;->f:I

    invoke-interface {v0, v1}, Landroidx/leanback/widget/e$b;->removeItem(I)V

    iget v0, p0, Landroidx/leanback/widget/e;->f:I

    add-int/2addr v0, v3

    iput v0, p0, Landroidx/leanback/widget/e;->f:I

    goto :goto_0

    :cond_2
    invoke-direct {p0}, Landroidx/leanback/widget/e;->B()V

    return-void
.end method
