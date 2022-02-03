.class public Lc/c/a/a/b/a;
.super Lc/c/a/a/b/f;
.source ""


# instance fields
.field private o:D


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lc/c/a/a/b/f;-><init>()V

    const-wide/high16 v0, 0x404e000000000000L    # 60.0

    iput-wide v0, p0, Lc/c/a/a/b/a;->o:D

    const v0, 0x3f4ccccd

    invoke-virtual {p0, v0}, Lc/c/a/a/b/a;->f(F)V

    const v0, -0x41b33333

    invoke-virtual {p0, v0}, Lc/c/a/a/b/a;->i(F)V

    return-void
.end method


# virtual methods
.method public b(Landroid/view/View;F)V
    .locals 8

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    int-to-float v0, v0

    const/high16 v2, 0x40000000    # 2.0f

    div-float v3, v0, v2

    invoke-virtual {p1, v3}, Landroid/view/View;->setPivotX(F)V

    int-to-float v1, v1

    div-float v2, v1, v2

    invoke-virtual {p1, v2}, Landroid/view/View;->setPivotY(F)V

    mul-float v0, v0, p2

    iget v2, p0, Lc/c/a/a/b/f;->a:F

    mul-float v0, v0, v2

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationX(F)V

    invoke-static {p2}, Ljava/lang/Math;->signum(F)F

    move-result v0

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    const/high16 v3, 0x3f800000    # 1.0f

    add-float/2addr v2, v3

    float-to-double v4, v2

    invoke-static {v4, v5}, Ljava/lang/Math;->log(D)D

    move-result-wide v4

    const-wide/high16 v6, 0x4008000000000000L    # 3.0

    invoke-static {v6, v7}, Ljava/lang/Math;->log(D)D

    move-result-wide v6

    div-double/2addr v4, v6

    iget-wide v6, p0, Lc/c/a/a/b/a;->o:D

    neg-double v6, v6

    mul-double v4, v4, v6

    double-to-float v2, v4

    mul-float v0, v0, v2

    invoke-virtual {p1, v0}, Landroid/view/View;->setRotationY(F)V

    iget v0, p0, Lc/c/a/a/b/f;->k:F

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p2

    mul-float v0, v0, p2

    add-float/2addr v0, v3

    invoke-virtual {p1, v0}, Landroid/view/View;->setScaleY(F)V

    invoke-virtual {p0, v1}, Lc/c/a/a/b/f;->d(F)F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/View;->setTranslationY(F)V

    return-void
.end method

.method public c(Lcom/gtomato/android/ui/manager/CarouselLayoutManager;)V
    .locals 1

    sget-object v0, Lc/c/a/a/c/a$f;->d:Lc/c/a/a/c/a$f;

    invoke-virtual {p1, v0}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->t2(Lc/c/a/a/c/a$f;)Lcom/gtomato/android/ui/manager/CarouselLayoutManager;

    return-void
.end method

.method public f(F)V
    .locals 0

    invoke-super {p0, p1}, Lc/c/a/a/b/f;->f(F)V

    return-void
.end method

.method public i(F)V
    .locals 0

    invoke-super {p0, p1}, Lc/c/a/a/b/f;->i(F)V

    return-void
.end method
