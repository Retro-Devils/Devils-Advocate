.class public Lc/c/a/a/b/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/c/a/a/c/a$l;


# instance fields
.field private a:I

.field private b:D

.field private c:D

.field private d:D

.field private e:D

.field private f:D

.field private g:F


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x7

    iput v0, p0, Lc/c/a/a/b/b;->a:I

    int-to-double v0, v0

    const-wide v2, 0x401921fb54442d18L    # 6.283185307179586

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v2, v0

    iput-wide v2, p0, Lc/c/a/a/b/b;->b:D

    const-wide v0, 0x3fe999999999999aL    # 0.8

    iput-wide v0, p0, Lc/c/a/a/b/b;->c:D

    const-wide v0, 0x3fe3333333333333L    # 0.6

    iput-wide v0, p0, Lc/c/a/a/b/b;->d:D

    const-wide v0, 0x3fd6666666666666L    # 0.35

    iput-wide v0, p0, Lc/c/a/a/b/b;->e:D

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lc/c/a/a/b/b;->f:D

    const/4 v0, 0x0

    iput v0, p0, Lc/c/a/a/b/b;->g:F

    return-void
.end method


# virtual methods
.method public a(F)V
    .locals 1

    const/high16 v0, 0x3f800000    # 1.0f

    sub-float/2addr p1, v0

    iput p1, p0, Lc/c/a/a/b/b;->g:F

    return-void
.end method

.method public b(Landroid/view/View;F)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getMeasuredWidth()I

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getMeasuredHeight()I

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    move/from16 v4, p2

    float-to-double v4, v4

    iget-wide v6, v0, Lc/c/a/a/b/b;->b:D

    invoke-static {v4, v5}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v4, v4, v6

    const-wide v6, 0x4012d97c7f3321d2L    # 4.71238898038469

    add-double/2addr v4, v6

    int-to-double v6, v2

    iget-wide v8, v0, Lc/c/a/a/b/b;->c:D

    invoke-static {v6, v7}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v6, v6, v8

    const-wide/high16 v8, 0x4000000000000000L    # 2.0

    div-double/2addr v6, v8

    iget-wide v10, v0, Lc/c/a/a/b/b;->d:D

    mul-double v10, v10, v6

    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    move-result-wide v12

    mul-double v6, v6, v12

    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v4

    const-wide/high16 v12, 0x3ff0000000000000L    # 1.0

    sub-double v4, v12, v4

    mul-double v4, v4, v10

    mul-double v10, v10, v8

    iget-wide v14, v0, Lc/c/a/a/b/b;->e:D

    sub-double/2addr v14, v12

    sub-double v16, v4, v10

    mul-double v14, v14, v16

    const-wide/16 v8, 0x0

    sub-double v18, v8, v10

    div-double v14, v14, v18

    add-double/2addr v14, v12

    invoke-static {v8, v9, v14, v15}, Ljava/lang/Math;->max(DD)D

    move-result-wide v14

    iget-wide v8, v0, Lc/c/a/a/b/b;->f:D

    sub-double/2addr v8, v12

    mul-double v8, v8, v16

    div-double v8, v8, v18

    add-double/2addr v8, v12

    const-wide/16 v12, 0x0

    invoke-static {v12, v13, v8, v9}, Ljava/lang/Math;->max(DD)D

    move-result-wide v8

    const-wide/high16 v12, 0x4000000000000000L    # 2.0

    div-double/2addr v10, v12

    sub-double/2addr v4, v10

    double-to-float v2, v6

    invoke-virtual {v1, v2}, Landroid/view/View;->setTranslationX(F)V

    double-to-float v2, v4

    int-to-float v3, v3

    invoke-virtual {v0, v3}, Lc/c/a/a/b/b;->d(F)F

    move-result v3

    add-float/2addr v2, v3

    invoke-virtual {v1, v2}, Landroid/view/View;->setTranslationY(F)V

    double-to-float v2, v14

    invoke-virtual {v1, v2}, Landroid/view/View;->setScaleX(F)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setScaleY(F)V

    double-to-float v2, v8

    invoke-virtual {v1, v2}, Landroid/view/View;->setAlpha(F)V

    return-void
.end method

.method public c(Lcom/gtomato/android/ui/manager/CarouselLayoutManager;)V
    .locals 1

    sget-object v0, Lc/c/a/a/c/a$f;->d:Lc/c/a/a/c/a$f;

    invoke-virtual {p1, v0}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->t2(Lc/c/a/a/c/a$f;)Lcom/gtomato/android/ui/manager/CarouselLayoutManager;

    return-void
.end method

.method public d(F)F
    .locals 1

    iget v0, p0, Lc/c/a/a/b/b;->g:F

    mul-float p1, p1, v0

    return p1
.end method

.method public e(D)V
    .locals 0

    iput-wide p1, p0, Lc/c/a/a/b/b;->c:D

    return-void
.end method
