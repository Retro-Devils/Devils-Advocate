.class public Lcom/digdroid/alman/dig/c4;
.super Lcom/digdroid/alman/dig/l;
.source ""


# instance fields
.field private M:Z

.field protected N:I

.field protected O:I

.field protected P:I

.field protected Q:I

.field protected R:I

.field protected S:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/digdroid/alman/dig/l;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/c4;->M:Z

    return-void
.end method


# virtual methods
.method public g(Z)Landroid/graphics/Point;
    .locals 3

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/c4;->h1()V

    new-instance v0, Landroid/graphics/Point;

    iget v1, p0, Lcom/digdroid/alman/dig/c4;->N:I

    iget v2, p0, Lcom/digdroid/alman/dig/c4;->O:I

    invoke-direct {v0, v1, v2}, Landroid/graphics/Point;-><init>(II)V

    if-nez p1, :cond_0

    iget p1, v0, Landroid/graphics/Point;->y:I

    move-object v1, p0

    check-cast v1, Lcom/digdroid/alman/dig/MainActivity;

    invoke-static {v1}, Lcom/digdroid/alman/dig/a4;->D(Lcom/digdroid/alman/dig/MainActivity;)I

    move-result v1

    sub-int/2addr p1, v1

    iput p1, v0, Landroid/graphics/Point;->y:I

    :cond_0
    return-object v0
.end method

.method protected declared-synchronized h1()V
    .locals 13

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/digdroid/alman/dig/c4;->M:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    invoke-static {p0}, Lcom/digdroid/alman/dig/a4;->k(Landroid/app/Activity;)Landroid/graphics/Point;

    move-result-object v0

    iget v1, v0, Landroid/graphics/Point;->x:I

    iput v1, p0, Lcom/digdroid/alman/dig/c4;->N:I

    iget v1, v0, Landroid/graphics/Point;->y:I

    iput v1, p0, Lcom/digdroid/alman/dig/c4;->O:I

    invoke-static {p0}, Lcom/digdroid/alman/dig/c3;->k(Landroid/content/Context;)Lcom/digdroid/alman/dig/c3;

    move-result-object v1

    iput-object v1, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    const-string v2, "orientation"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Lcom/digdroid/alman/dig/c3;->l(Ljava/lang/String;I)I

    move-result v1

    const/4 v2, 0x3

    const/4 v4, 0x0

    const/high16 v5, -0x40800000    # -1.0f

    const/4 v6, 0x1

    const/4 v7, 0x2

    if-ne v1, v2, :cond_1

    iget v1, p0, Lcom/digdroid/alman/dig/c4;->O:I

    div-int/2addr v1, v7

    iput v1, p0, Lcom/digdroid/alman/dig/c4;->O:I

    move v2, v1

    const/4 v1, 0x0

    goto/16 :goto_2

    :cond_1
    iget-object v1, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/c3;->u()Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    const-string v2, "overscan"

    invoke-virtual {v1, v2, v3}, Lcom/digdroid/alman/dig/c3;->l(Ljava/lang/String;I)I

    move-result v1

    if-eq v1, v6, :cond_3

    if-eq v1, v7, :cond_2

    const/4 v1, 0x0

    const/4 v2, 0x0

    goto :goto_1

    :cond_2
    const/high16 v1, 0x42400000    # 48.0f

    invoke-static {p0, v1}, Lcom/digdroid/alman/dig/a4;->e(Landroid/content/Context;F)I

    move-result v1

    const/high16 v2, 0x41d80000    # 27.0f

    invoke-static {p0, v2}, Lcom/digdroid/alman/dig/a4;->e(Landroid/content/Context;F)I

    move-result v2

    goto :goto_0

    :cond_3
    const/high16 v1, 0x41c00000    # 24.0f

    invoke-static {p0, v1}, Lcom/digdroid/alman/dig/a4;->e(Landroid/content/Context;F)I

    move-result v1

    const/high16 v2, 0x41500000    # 13.0f

    invoke-static {p0, v2}, Lcom/digdroid/alman/dig/a4;->e(Landroid/content/Context;F)I

    move-result v2

    :goto_0
    move v12, v2

    move v2, v1

    move v1, v12

    :goto_1
    iget v7, p0, Lcom/digdroid/alman/dig/c4;->O:I

    mul-int/lit8 v8, v1, 0x2

    sub-int/2addr v7, v8

    iput v7, p0, Lcom/digdroid/alman/dig/c4;->O:I

    iget v7, p0, Lcom/digdroid/alman/dig/c4;->N:I

    mul-int/lit8 v8, v2, 0x2

    sub-int/2addr v7, v8

    iput v7, p0, Lcom/digdroid/alman/dig/c4;->N:I

    invoke-virtual {p0}, Landroidx/appcompat/app/c;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    iget v8, p0, Lcom/digdroid/alman/dig/c4;->N:I

    int-to-float v8, v8

    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v7

    iget v7, v7, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v8, v7

    iget-object v7, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    const-string v9, "vertical_spacing"

    invoke-virtual {v7, v9, v5}, Lcom/digdroid/alman/dig/c3;->f(Ljava/lang/String;F)F

    move-result v7

    cmpg-float v7, v7, v4

    if-gez v7, :cond_4

    iget-object v7, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    float-to-double v8, v8

    const-wide v10, 0x401699999999999aL    # 5.65

    invoke-static {v8, v9}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v8, v10

    :try_start_2
    invoke-virtual {v7, v8, v9}, Lcom/digdroid/alman/dig/c3;->O(D)V

    iget-object v7, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    invoke-virtual {v7, v8, v9}, Lcom/digdroid/alman/dig/c3;->X(D)V

    iget-object v7, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    const-string v8, "vertical_spacing"

    const/high16 v9, 0x41a00000    # 20.0f

    invoke-virtual {v7, v8, v9}, Lcom/digdroid/alman/dig/c3;->w(Ljava/lang/String;F)V

    :cond_4
    move v7, v2

    move v8, v7

    move v2, v1

    goto :goto_3

    :cond_5
    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_2
    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_3
    iget v9, p0, Lcom/digdroid/alman/dig/c4;->N:I

    int-to-float v9, v9

    iget v10, p0, Lcom/digdroid/alman/dig/c4;->O:I

    int-to-float v10, v10

    div-float/2addr v9, v10

    iget-object v10, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    const-string v11, "main_aspect_ratio"

    invoke-virtual {v10, v11, v5}, Lcom/digdroid/alman/dig/c3;->f(Ljava/lang/String;F)F

    move-result v5

    cmpl-float v4, v5, v4

    if-lez v4, :cond_7

    const/high16 v4, 0x40000000    # 2.0f

    cmpl-float v10, v5, v9

    if-lez v10, :cond_6

    iget v9, p0, Lcom/digdroid/alman/dig/c4;->O:I

    int-to-float v9, v9

    iget v10, p0, Lcom/digdroid/alman/dig/c4;->N:I

    int-to-float v10, v10

    div-float/2addr v10, v5

    sub-float/2addr v9, v10

    div-float/2addr v9, v4

    invoke-static {v9}, Ljava/lang/Math;->round(F)I

    move-result v4

    move v3, v4

    goto :goto_4

    :cond_6
    cmpg-float v9, v5, v9

    if-gez v9, :cond_7

    iget v9, p0, Lcom/digdroid/alman/dig/c4;->N:I

    int-to-float v9, v9

    iget v10, p0, Lcom/digdroid/alman/dig/c4;->O:I

    int-to-float v10, v10

    mul-float v10, v10, v5

    sub-float/2addr v9, v10

    div-float/2addr v9, v4

    invoke-static {v9}, Ljava/lang/Math;->round(F)I

    move-result v4

    move v5, v4

    move v9, v5

    const/4 v4, 0x0

    goto :goto_5

    :cond_7
    const/4 v4, 0x0

    :goto_4
    const/4 v5, 0x0

    const/4 v9, 0x0

    :goto_5
    add-int/2addr v3, v1

    add-int/2addr v4, v2

    add-int/2addr v5, v7

    add-int/2addr v9, v8

    iput v3, p0, Lcom/digdroid/alman/dig/c4;->Q:I

    iput v5, p0, Lcom/digdroid/alman/dig/c4;->P:I

    iput v4, p0, Lcom/digdroid/alman/dig/c4;->R:I

    iput v9, p0, Lcom/digdroid/alman/dig/c4;->S:I

    iget v1, v0, Landroid/graphics/Point;->x:I

    sub-int/2addr v1, v9

    sub-int/2addr v1, v5

    iput v1, p0, Lcom/digdroid/alman/dig/c4;->N:I

    iget v0, v0, Landroid/graphics/Point;->y:I

    sub-int/2addr v0, v4

    sub-int/2addr v0, v3

    iput v0, p0, Lcom/digdroid/alman/dig/c4;->O:I

    iput-boolean v6, p0, Lcom/digdroid/alman/dig/c4;->M:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public i1()Landroid/graphics/Point;
    .locals 3

    new-instance v0, Landroid/graphics/Point;

    iget v1, p0, Lcom/digdroid/alman/dig/c4;->P:I

    iget v2, p0, Lcom/digdroid/alman/dig/c4;->Q:I

    invoke-direct {v0, v1, v2}, Landroid/graphics/Point;-><init>(II)V

    return-object v0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/z3;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/digdroid/alman/dig/c3;->k(Landroid/content/Context;)Lcom/digdroid/alman/dig/c3;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    iget-object v0, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    const-string v1, "hide_navbar"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/c3;->c(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    const-string v1, "orientation"

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/c3;->l(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    :cond_0
    const/16 v0, 0xf06

    invoke-virtual {p1, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    :cond_1
    new-instance v0, Lcom/digdroid/alman/dig/c4$a;

    invoke-direct {v0, p0, p1}, Lcom/digdroid/alman/dig/c4$a;-><init>(Lcom/digdroid/alman/dig/c4;Landroid/view/View;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnSystemUiVisibilityChangeListener(Landroid/view/View$OnSystemUiVisibilityChangeListener;)V

    return-void
.end method
