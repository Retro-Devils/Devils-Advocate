.class public Lc/c/a/a/b/h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/c/a/a/c/a$l;


# instance fields
.field a:F


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lc/c/a/a/b/h;->a:F

    return-void
.end method


# virtual methods
.method public a(F)V
    .locals 1

    const/high16 v0, 0x3f800000    # 1.0f

    sub-float/2addr p1, v0

    iput p1, p0, Lc/c/a/a/b/h;->a:F

    return-void
.end method

.method public b(Landroid/view/View;F)V
    .locals 3

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    int-to-float v0, v0

    mul-float v0, v0, p2

    const/high16 v1, -0x41000000    # -0.5f

    mul-float v0, v0, v1

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result v1

    const/high16 v2, 0x40000000    # 2.0f

    add-float/2addr v1, v2

    div-float v1, v2, v1

    mul-float v0, v0, v1

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationX(F)V

    add-float v0, p2, v2

    div-float/2addr v2, v0

    invoke-virtual {p1, v2}, Landroid/view/View;->setScaleX(F)V

    invoke-virtual {p1, v2}, Landroid/view/View;->setScaleY(F)V

    const/high16 v0, 0x3f800000    # 1.0f

    const/4 v1, 0x0

    cmpg-float v2, p2, v1

    if-gez v2, :cond_0

    add-float/2addr p2, v0

    invoke-static {p2, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    :cond_0
    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    return-void
.end method

.method public c(Lcom/gtomato/android/ui/manager/CarouselLayoutManager;)V
    .locals 1

    new-instance v0, Lc/c/a/a/a/a;

    invoke-direct {v0}, Lc/c/a/a/a/a;-><init>()V

    invoke-virtual {p1, v0}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->z2(Lc/c/a/a/c/a$k;)Lcom/gtomato/android/ui/manager/CarouselLayoutManager;

    sget-object v0, Lc/c/a/a/c/a$f;->c:Lc/c/a/a/c/a$f;

    invoke-virtual {p1, v0}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->t2(Lc/c/a/a/c/a$f;)Lcom/gtomato/android/ui/manager/CarouselLayoutManager;

    return-void
.end method
