.class public abstract Lc/c/a/a/b/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/c/a/a/c/a$l;


# instance fields
.field protected a:F

.field protected b:F

.field protected c:F

.field protected d:F

.field protected e:F

.field protected f:F

.field protected g:F

.field protected h:F

.field protected i:F

.field protected j:F

.field protected k:F

.field protected l:F

.field protected m:Z

.field protected n:F


# direct methods
.method protected constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lc/c/a/a/b/f;->a:F

    iput v0, p0, Lc/c/a/a/b/f;->b:F

    iput v0, p0, Lc/c/a/a/b/f;->c:F

    const/high16 v0, 0x7fc00000    # Float.NaN

    iput v0, p0, Lc/c/a/a/b/f;->d:F

    iput v0, p0, Lc/c/a/a/b/f;->e:F

    iput v0, p0, Lc/c/a/a/b/f;->f:F

    iput v0, p0, Lc/c/a/a/b/f;->g:F

    iput v0, p0, Lc/c/a/a/b/f;->h:F

    iput v0, p0, Lc/c/a/a/b/f;->i:F

    iput v0, p0, Lc/c/a/a/b/f;->j:F

    iput v0, p0, Lc/c/a/a/b/f;->k:F

    iput v0, p0, Lc/c/a/a/b/f;->l:F

    const/4 v1, 0x0

    iput-boolean v1, p0, Lc/c/a/a/b/f;->m:Z

    iput v0, p0, Lc/c/a/a/b/f;->n:F

    return-void
.end method

.method private static e(F)Z
    .locals 1

    const v0, 0x3a83126f

    cmpl-float v0, p0, v0

    if-gtz v0, :cond_1

    const v0, -0x457ced91

    cmpg-float p0, p0, v0

    if-gez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method


# virtual methods
.method public a(F)V
    .locals 1

    const/high16 v0, 0x3f800000    # 1.0f

    sub-float/2addr p1, v0

    iput p1, p0, Lc/c/a/a/b/f;->c:F

    return-void
.end method

.method public b(Landroid/view/View;F)V
    .locals 6

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    iget v2, p0, Lc/c/a/a/b/f;->g:F

    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v2

    const/high16 v3, 0x3f800000    # 1.0f

    const/high16 v4, 0x40000000    # 2.0f

    if-nez v2, :cond_4

    iget-boolean v2, p0, Lc/c/a/a/b/f;->m:Z

    if-eqz v2, :cond_0

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    sub-float v2, v3, v2

    goto :goto_0

    :cond_0
    move v2, p2

    :goto_0
    iget v5, p0, Lc/c/a/a/b/f;->g:F

    mul-float v2, v2, v5

    iget v5, p0, Lc/c/a/a/b/f;->f:F

    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    move-result v5

    if-nez v5, :cond_1

    iget v5, p0, Lc/c/a/a/b/f;->f:F

    add-float/2addr v2, v5

    :cond_1
    iget v5, p0, Lc/c/a/a/b/f;->d:F

    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    move-result v5

    if-nez v5, :cond_2

    iget v5, p0, Lc/c/a/a/b/f;->d:F

    invoke-static {v5, v2}, Ljava/lang/Math;->max(FF)F

    move-result v2

    :cond_2
    iget v5, p0, Lc/c/a/a/b/f;->e:F

    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    move-result v5

    if-nez v5, :cond_3

    iget v5, p0, Lc/c/a/a/b/f;->e:F

    invoke-static {v5, v2}, Ljava/lang/Math;->min(FF)F

    move-result v2

    :cond_3
    int-to-float v5, v0

    div-float/2addr v5, v4

    invoke-virtual {p1, v5}, Landroid/view/View;->setPivotX(F)V

    int-to-float v5, v1

    div-float/2addr v5, v4

    invoke-virtual {p1, v5}, Landroid/view/View;->setPivotY(F)V

    invoke-virtual {p1, v2}, Landroid/view/View;->setScaleX(F)V

    :cond_4
    iget v2, p0, Lc/c/a/a/b/f;->k:F

    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v2

    if-nez v2, :cond_9

    iget-boolean v2, p0, Lc/c/a/a/b/f;->m:Z

    if-eqz v2, :cond_5

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    sub-float/2addr v3, v2

    goto :goto_1

    :cond_5
    move v3, p2

    :goto_1
    iget v2, p0, Lc/c/a/a/b/f;->k:F

    mul-float v3, v3, v2

    iget v2, p0, Lc/c/a/a/b/f;->j:F

    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v2

    if-nez v2, :cond_6

    iget v2, p0, Lc/c/a/a/b/f;->j:F

    add-float/2addr v3, v2

    :cond_6
    iget v2, p0, Lc/c/a/a/b/f;->h:F

    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v2

    if-nez v2, :cond_7

    iget v2, p0, Lc/c/a/a/b/f;->h:F

    invoke-static {v2, v3}, Ljava/lang/Math;->max(FF)F

    move-result v3

    :cond_7
    iget v2, p0, Lc/c/a/a/b/f;->i:F

    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v2

    if-nez v2, :cond_8

    iget v2, p0, Lc/c/a/a/b/f;->i:F

    invoke-static {v2, v3}, Ljava/lang/Math;->min(FF)F

    move-result v3

    :cond_8
    int-to-float v2, v0

    div-float/2addr v2, v4

    invoke-virtual {p1, v2}, Landroid/view/View;->setPivotX(F)V

    int-to-float v2, v1

    div-float/2addr v2, v4

    invoke-virtual {p1, v2}, Landroid/view/View;->setPivotY(F)V

    invoke-virtual {p1, v3}, Landroid/view/View;->setScaleY(F)V

    :cond_9
    iget v2, p0, Lc/c/a/a/b/f;->l:F

    invoke-static {v2}, Lc/c/a/a/b/f;->e(F)Z

    move-result v2

    if-eqz v2, :cond_a

    int-to-float v2, v0

    div-float v3, v2, v4

    invoke-virtual {p1, v3}, Landroid/view/View;->setPivotX(F)V

    int-to-float v3, v1

    iget v4, p0, Lc/c/a/a/b/f;->n:F

    mul-float v2, v2, v4

    add-float/2addr v3, v2

    invoke-virtual {p1, v3}, Landroid/view/View;->setPivotY(F)V

    iget v2, p0, Lc/c/a/a/b/f;->l:F

    mul-float v2, v2, p2

    invoke-virtual {p1, v2}, Landroid/view/View;->setRotation(F)V

    :cond_a
    iget v2, p0, Lc/c/a/a/b/f;->a:F

    invoke-static {v2}, Lc/c/a/a/b/f;->e(F)Z

    move-result v2

    if-eqz v2, :cond_b

    int-to-float v0, v0

    mul-float v0, v0, p2

    iget v2, p0, Lc/c/a/a/b/f;->a:F

    mul-float v0, v0, v2

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationX(F)V

    :cond_b
    iget v0, p0, Lc/c/a/a/b/f;->b:F

    invoke-static {v0}, Lc/c/a/a/b/f;->e(F)Z

    move-result v0

    if-eqz v0, :cond_c

    int-to-float v0, v1

    mul-float p2, p2, v0

    iget v1, p0, Lc/c/a/a/b/f;->b:F

    mul-float p2, p2, v1

    invoke-virtual {p0, v0}, Lc/c/a/a/b/f;->d(F)F

    move-result v0

    add-float/2addr p2, v0

    goto :goto_2

    :cond_c
    int-to-float p2, v1

    invoke-virtual {p0, p2}, Lc/c/a/a/b/f;->d(F)F

    move-result p2

    :goto_2
    invoke-virtual {p1, p2}, Landroid/view/View;->setTranslationY(F)V

    return-void
.end method

.method public c(Lcom/gtomato/android/ui/manager/CarouselLayoutManager;)V
    .locals 0

    return-void
.end method

.method public d(F)F
    .locals 1

    iget v0, p0, Lc/c/a/a/b/f;->c:F

    mul-float p1, p1, v0

    return p1
.end method

.method protected f(F)V
    .locals 0

    iput p1, p0, Lc/c/a/a/b/f;->a:F

    return-void
.end method

.method protected g(F)V
    .locals 0

    iput p1, p0, Lc/c/a/a/b/f;->b:F

    return-void
.end method

.method protected h(F)V
    .locals 4

    iput p1, p0, Lc/c/a/a/b/f;->l:F

    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_0

    const/high16 p1, 0x7fc00000    # Float.NaN

    :goto_0
    iput p1, p0, Lc/c/a/a/b/f;->n:F

    goto :goto_1

    :cond_0
    invoke-static {p1}, Lc/c/a/a/b/f;->e(F)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    float-to-double v2, p1

    invoke-static {v2, v3}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    div-double/2addr v0, v2

    double-to-float p1, v0

    goto :goto_0

    :goto_1
    return-void
.end method

.method protected i(F)V
    .locals 0

    iput p1, p0, Lc/c/a/a/b/f;->k:F

    return-void
.end method
