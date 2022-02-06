.class public Lcom/digdroid/alman/dig/e2;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/digdroid/alman/dig/e2$t;,
        Lcom/digdroid/alman/dig/e2$u;,
        Lcom/digdroid/alman/dig/e2$x;,
        Lcom/digdroid/alman/dig/e2$w;,
        Lcom/digdroid/alman/dig/e2$v;,
        Lcom/digdroid/alman/dig/e2$s;
    }
.end annotation


# instance fields
.field A:Z

.field B:J

.field a:Lcom/digdroid/alman/dig/e2$s;

.field b:Lcom/digdroid/alman/dig/e2$v;

.field c:Lcom/digdroid/alman/dig/e2$w;

.field d:Lcom/digdroid/alman/dig/e2$x;

.field e:Lcom/digdroid/alman/dig/MainActivity;

.field f:Landroid/widget/GridView;

.field g:Lcom/digdroid/alman/dig/MyListView;

.field h:Landroid/widget/AbsListView;

.field i:Lcom/digdroid/alman/dig/MyCarouselView;

.field j:Lcom/digdroid/alman/dig/MyRecyclerView;

.field k:Landroidx/recyclerview/widget/RecyclerView;

.field l:Landroidx/recyclerview/widget/LinearLayoutManager;

.field m:Landroidx/recyclerview/widget/h;

.field n:Lcom/digdroid/alman/dig/j2;

.field o:Landroid/view/View;

.field p:Lcom/digdroid/alman/dig/b3;

.field q:Z

.field r:Landroid/view/ScaleGestureDetector;

.field s:Z

.field t:Z

.field u:Z

.field v:Z

.field w:Z

.field x:I

.field private y:Z

.field private z:Z


# direct methods
.method public constructor <init>(Lcom/digdroid/alman/dig/MainActivity;Landroid/view/View;Ljava/lang/String;Lcom/digdroid/alman/dig/e2$s;)V
    .locals 9

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/digdroid/alman/dig/e2;->d:Lcom/digdroid/alman/dig/e2$x;

    iput-object v0, p0, Lcom/digdroid/alman/dig/e2;->f:Landroid/widget/GridView;

    iput-object v0, p0, Lcom/digdroid/alman/dig/e2;->g:Lcom/digdroid/alman/dig/MyListView;

    iput-object v0, p0, Lcom/digdroid/alman/dig/e2;->h:Landroid/widget/AbsListView;

    iput-object v0, p0, Lcom/digdroid/alman/dig/e2;->i:Lcom/digdroid/alman/dig/MyCarouselView;

    iput-object v0, p0, Lcom/digdroid/alman/dig/e2;->j:Lcom/digdroid/alman/dig/MyRecyclerView;

    iput-object v0, p0, Lcom/digdroid/alman/dig/e2;->k:Landroidx/recyclerview/widget/RecyclerView;

    iput-object v0, p0, Lcom/digdroid/alman/dig/e2;->o:Landroid/view/View;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/digdroid/alman/dig/e2;->q:Z

    iput-boolean v1, p0, Lcom/digdroid/alman/dig/e2;->s:Z

    iput-boolean v1, p0, Lcom/digdroid/alman/dig/e2;->t:Z

    iput-boolean v1, p0, Lcom/digdroid/alman/dig/e2;->u:Z

    iput-boolean v1, p0, Lcom/digdroid/alman/dig/e2;->w:Z

    iput v1, p0, Lcom/digdroid/alman/dig/e2;->x:I

    iput-boolean v1, p0, Lcom/digdroid/alman/dig/e2;->y:Z

    iput-boolean v1, p0, Lcom/digdroid/alman/dig/e2;->z:Z

    iput-boolean v1, p0, Lcom/digdroid/alman/dig/e2;->A:Z

    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lcom/digdroid/alman/dig/e2;->B:J

    iput-object p1, p0, Lcom/digdroid/alman/dig/e2;->e:Lcom/digdroid/alman/dig/MainActivity;

    iput-object p4, p0, Lcom/digdroid/alman/dig/e2;->a:Lcom/digdroid/alman/dig/e2$s;

    invoke-static {p1}, Lcom/digdroid/alman/dig/b3;->k(Landroid/content/Context;)Lcom/digdroid/alman/dig/b3;

    move-result-object v2

    iput-object v2, p0, Lcom/digdroid/alman/dig/e2;->p:Lcom/digdroid/alman/dig/b3;

    const-string v2, "list"

    invoke-virtual {p3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const-string v3, "vertical"

    const v4, 0x7f0901ab

    if-eqz v2, :cond_2

    invoke-virtual {p2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/digdroid/alman/dig/MyListView;

    iput-object p2, p0, Lcom/digdroid/alman/dig/e2;->g:Lcom/digdroid/alman/dig/MyListView;

    invoke-interface {p4}, Lcom/digdroid/alman/dig/e2$s;->Q()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/e2;->s()V

    :cond_0
    iget-object p2, p0, Lcom/digdroid/alman/dig/e2;->g:Lcom/digdroid/alman/dig/MyListView;

    iput-object p2, p0, Lcom/digdroid/alman/dig/e2;->h:Landroid/widget/AbsListView;

    iget-object p2, p0, Lcom/digdroid/alman/dig/e2;->p:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {p2}, Lcom/digdroid/alman/dig/b3;->t()Z

    move-result p2

    if-nez p2, :cond_1

    new-instance p2, Landroid/view/ScaleGestureDetector;

    new-instance p3, Lcom/digdroid/alman/dig/e2$t;

    invoke-direct {p3, p0}, Lcom/digdroid/alman/dig/e2$t;-><init>(Lcom/digdroid/alman/dig/e2;)V

    invoke-direct {p2, p1, p3}, Landroid/view/ScaleGestureDetector;-><init>(Landroid/content/Context;Landroid/view/ScaleGestureDetector$OnScaleGestureListener;)V

    iput-object p2, p0, Lcom/digdroid/alman/dig/e2;->r:Landroid/view/ScaleGestureDetector;

    :cond_1
    iget-object p2, p0, Lcom/digdroid/alman/dig/e2;->g:Lcom/digdroid/alman/dig/MyListView;

    new-instance p3, Lcom/digdroid/alman/dig/e2$j;

    invoke-direct {p3, p0, p4, p1}, Lcom/digdroid/alman/dig/e2$j;-><init>(Lcom/digdroid/alman/dig/e2;Lcom/digdroid/alman/dig/e2$s;Lcom/digdroid/alman/dig/MainActivity;)V

    invoke-virtual {p2, p3}, Landroid/widget/ListView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    goto/16 :goto_2

    :cond_2
    const-string v2, "grid"

    invoke-virtual {p3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const p3, 0x7f090269

    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/GridView;

    iput-object p2, p0, Lcom/digdroid/alman/dig/e2;->f:Landroid/widget/GridView;

    iput-object p2, p0, Lcom/digdroid/alman/dig/e2;->h:Landroid/widget/AbsListView;

    iget-object p2, p0, Lcom/digdroid/alman/dig/e2;->p:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {p2}, Lcom/digdroid/alman/dig/b3;->t()Z

    move-result p2

    if-nez p2, :cond_3

    new-instance p2, Landroid/view/ScaleGestureDetector;

    new-instance p3, Lcom/digdroid/alman/dig/e2$u;

    invoke-direct {p3, p0}, Lcom/digdroid/alman/dig/e2$u;-><init>(Lcom/digdroid/alman/dig/e2;)V

    invoke-direct {p2, p1, p3}, Landroid/view/ScaleGestureDetector;-><init>(Landroid/content/Context;Landroid/view/ScaleGestureDetector$OnScaleGestureListener;)V

    iput-object p2, p0, Lcom/digdroid/alman/dig/e2;->r:Landroid/view/ScaleGestureDetector;

    :cond_3
    invoke-interface {p4}, Lcom/digdroid/alman/dig/e2$s;->P()D

    move-result-wide p2

    double-to-float p2, p2

    invoke-static {p2}, Lcom/digdroid/alman/dig/p3;->d(F)F

    move-result p2

    iget-object p3, p0, Lcom/digdroid/alman/dig/e2;->f:Landroid/widget/GridView;

    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    move-result p2

    invoke-virtual {p3, p2}, Landroid/widget/GridView;->setColumnWidth(I)V

    iget-object p2, p0, Lcom/digdroid/alman/dig/e2;->p:Lcom/digdroid/alman/dig/b3;

    const/high16 p3, 0x42100000    # 36.0f

    const-string v0, "vertical_spacing"

    invoke-virtual {p2, v0, p3}, Lcom/digdroid/alman/dig/b3;->f(Ljava/lang/String;F)F

    move-result p2

    invoke-static {p2}, Lcom/digdroid/alman/dig/p3;->e(F)F

    move-result p2

    iget-object p3, p0, Lcom/digdroid/alman/dig/e2;->f:Landroid/widget/GridView;

    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    move-result p2

    invoke-virtual {p3, p2}, Landroid/widget/GridView;->setVerticalSpacing(I)V

    iget-object p2, p0, Lcom/digdroid/alman/dig/e2;->f:Landroid/widget/GridView;

    new-instance p3, Lcom/digdroid/alman/dig/e2$k;

    invoke-direct {p3, p0, p4, p1}, Lcom/digdroid/alman/dig/e2$k;-><init>(Lcom/digdroid/alman/dig/e2;Lcom/digdroid/alman/dig/e2$s;Lcom/digdroid/alman/dig/MainActivity;)V

    invoke-virtual {p2, p3}, Landroid/widget/GridView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    goto/16 :goto_2

    :cond_4
    const-string v2, "carousel"

    invoke-virtual {p3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const-wide/high16 v5, 0x4012000000000000L    # 4.5

    const/high16 v7, 0x40000000    # 2.0f

    const v8, 0x7f0902af

    if-eqz v2, :cond_5

    invoke-virtual {p2, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/digdroid/alman/dig/MyCarouselView;

    iput-object p1, p0, Lcom/digdroid/alman/dig/e2;->i:Lcom/digdroid/alman/dig/MyCarouselView;

    iput-object p1, p0, Lcom/digdroid/alman/dig/e2;->k:Landroidx/recyclerview/widget/RecyclerView;

    new-instance p1, Lc/c/a/a/b/b;

    invoke-direct {p1}, Lc/c/a/a/b/b;-><init>()V

    invoke-interface {p4, v1}, Lcom/digdroid/alman/dig/e2$s;->g(Z)Landroid/graphics/Point;

    move-result-object p2

    iget-object p3, p0, Lcom/digdroid/alman/dig/e2;->i:Lcom/digdroid/alman/dig/MyCarouselView;

    iget v0, p2, Landroid/graphics/Point;->y:I

    int-to-double v2, v0

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v2, v5

    invoke-static {v2, v3}, Ljava/lang/Math;->round(D)J

    move-result-wide v2

    long-to-int v0, v2

    invoke-virtual {p3, v1, v1, v1, v0}, Landroid/view/ViewGroup;->setPadding(IIII)V

    const-wide v2, 0x3ff199999999999aL    # 1.1

    iget p3, p2, Landroid/graphics/Point;->y:I

    int-to-double v4, p3

    invoke-static {v4, v5}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v4, v4, v2

    iget p2, p2, Landroid/graphics/Point;->x:I

    int-to-double p2, p2

    invoke-static {p2, p3}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v4, p2

    const-wide p2, 0x3fe999999999999aL    # 0.8

    invoke-static {v4, v5, p2, p3}, Ljava/lang/Math;->min(DD)D

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, Lc/c/a/a/b/b;->e(D)V

    iget-object p2, p0, Lcom/digdroid/alman/dig/e2;->i:Lcom/digdroid/alman/dig/MyCarouselView;

    invoke-virtual {p2, p1}, Lc/c/a/a/c/a;->setTransformer(Lc/c/a/a/c/a$l;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/e2;->i:Lcom/digdroid/alman/dig/MyCarouselView;

    invoke-interface {p4}, Lcom/digdroid/alman/dig/e2$s;->y()F

    move-result p2

    :goto_0
    sub-float/2addr v7, p2

    invoke-virtual {p1, v7}, Lc/c/a/a/c/a;->setYTranslation(F)V

    goto/16 :goto_2

    :cond_5
    const-string v2, "coverflow"

    invoke-virtual {p3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-virtual {p2, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/digdroid/alman/dig/MyCarouselView;

    iput-object p1, p0, Lcom/digdroid/alman/dig/e2;->i:Lcom/digdroid/alman/dig/MyCarouselView;

    iput-object p1, p0, Lcom/digdroid/alman/dig/e2;->k:Landroidx/recyclerview/widget/RecyclerView;

    new-instance p1, Lc/c/a/a/b/a;

    invoke-direct {p1}, Lc/c/a/a/b/a;-><init>()V

    iget-object p2, p0, Lcom/digdroid/alman/dig/e2;->i:Lcom/digdroid/alman/dig/MyCarouselView;

    invoke-virtual {p2, p1}, Lc/c/a/a/c/a;->setTransformer(Lc/c/a/a/c/a$l;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/e2;->i:Lcom/digdroid/alman/dig/MyCarouselView;

    invoke-interface {p4}, Lcom/digdroid/alman/dig/e2$s;->p()F

    move-result p2

    goto :goto_0

    :cond_6
    const-string v2, "wheel"

    invoke-virtual {p3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-virtual {p2, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/digdroid/alman/dig/MyCarouselView;

    iput-object p1, p0, Lcom/digdroid/alman/dig/e2;->i:Lcom/digdroid/alman/dig/MyCarouselView;

    iput-object p1, p0, Lcom/digdroid/alman/dig/e2;->k:Landroidx/recyclerview/widget/RecyclerView;

    new-instance p1, Lc/c/a/a/b/i;

    invoke-direct {p1}, Lc/c/a/a/b/i;-><init>()V

    invoke-interface {p4, v1}, Lcom/digdroid/alman/dig/e2$s;->g(Z)Landroid/graphics/Point;

    move-result-object p2

    iget-object p3, p0, Lcom/digdroid/alman/dig/e2;->i:Lcom/digdroid/alman/dig/MyCarouselView;

    iget p2, p2, Landroid/graphics/Point;->y:I

    int-to-double v2, p2

    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v2, v5

    invoke-static {v2, v3}, Ljava/lang/Math;->round(D)J

    move-result-wide v2

    long-to-int p2, v2

    invoke-virtual {p3, v1, v1, v1, p2}, Landroid/view/ViewGroup;->setPadding(IIII)V

    iget-object p2, p0, Lcom/digdroid/alman/dig/e2;->i:Lcom/digdroid/alman/dig/MyCarouselView;

    invoke-virtual {p2, p1}, Lc/c/a/a/c/a;->setTransformer(Lc/c/a/a/c/a$l;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/e2;->i:Lcom/digdroid/alman/dig/MyCarouselView;

    invoke-interface {p4}, Lcom/digdroid/alman/dig/e2$s;->M()F

    move-result p2

    goto :goto_0

    :cond_7
    const-string v2, "linear"

    invoke-virtual {p3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-virtual {p2, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/digdroid/alman/dig/MyCarouselView;

    iput-object p1, p0, Lcom/digdroid/alman/dig/e2;->i:Lcom/digdroid/alman/dig/MyCarouselView;

    iput-object p1, p0, Lcom/digdroid/alman/dig/e2;->k:Landroidx/recyclerview/widget/RecyclerView;

    new-instance p1, Lc/c/a/a/b/e;

    invoke-direct {p1}, Lc/c/a/a/b/e;-><init>()V

    iget-object p2, p0, Lcom/digdroid/alman/dig/e2;->i:Lcom/digdroid/alman/dig/MyCarouselView;

    invoke-virtual {p2, p1}, Lc/c/a/a/c/a;->setTransformer(Lc/c/a/a/c/a$l;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/e2;->i:Lcom/digdroid/alman/dig/MyCarouselView;

    invoke-interface {p4}, Lcom/digdroid/alman/dig/e2$s;->L()F

    move-result p2

    goto/16 :goto_0

    :cond_8
    invoke-virtual {p3, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_a

    invoke-virtual {p2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/digdroid/alman/dig/MyRecyclerView;

    iput-object p2, p0, Lcom/digdroid/alman/dig/e2;->j:Lcom/digdroid/alman/dig/MyRecyclerView;

    invoke-static {p1}, Lcom/digdroid/alman/dig/z3;->j(Landroid/app/Activity;)Landroid/graphics/Point;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/digdroid/alman/dig/MyRecyclerView;->A1(Landroid/graphics/Point;)V

    iget-object p2, p0, Lcom/digdroid/alman/dig/e2;->j:Lcom/digdroid/alman/dig/MyRecyclerView;

    iput-object p2, p0, Lcom/digdroid/alman/dig/e2;->k:Landroidx/recyclerview/widget/RecyclerView;

    new-instance p2, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {p2, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/digdroid/alman/dig/e2;->l:Landroidx/recyclerview/widget/LinearLayoutManager;

    iget-object p1, p0, Lcom/digdroid/alman/dig/e2;->j:Lcom/digdroid/alman/dig/MyRecyclerView;

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$o;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/e2;->j:Lcom/digdroid/alman/dig/MyRecyclerView;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    :goto_1
    iget-object p1, p0, Lcom/digdroid/alman/dig/e2;->j:Lcom/digdroid/alman/dig/MyRecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getItemDecorationCount()I

    move-result p1

    if-lez p1, :cond_9

    iget-object p1, p0, Lcom/digdroid/alman/dig/e2;->j:Lcom/digdroid/alman/dig/MyRecyclerView;

    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->Z0(I)V

    goto :goto_1

    :cond_9
    new-instance p1, Lcom/digdroid/alman/dig/j2;

    invoke-interface {p4}, Lcom/digdroid/alman/dig/e2$s;->S()F

    move-result p2

    invoke-interface {p4}, Lcom/digdroid/alman/dig/e2$s;->E()F

    move-result p3

    invoke-interface {p4}, Lcom/digdroid/alman/dig/e2$s;->G()[I

    move-result-object p4

    invoke-direct {p1, p2, p3, p4}, Lcom/digdroid/alman/dig/j2;-><init>(FF[I)V

    iput-object p1, p0, Lcom/digdroid/alman/dig/e2;->n:Lcom/digdroid/alman/dig/j2;

    iget-object p2, p0, Lcom/digdroid/alman/dig/e2;->j:Lcom/digdroid/alman/dig/MyRecyclerView;

    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView;->h(Landroidx/recyclerview/widget/RecyclerView$n;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/e2;->j:Lcom/digdroid/alman/dig/MyRecyclerView;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setOnFlingListener(Landroidx/recyclerview/widget/RecyclerView$r;)V

    new-instance p1, Landroidx/recyclerview/widget/h;

    invoke-direct {p1}, Landroidx/recyclerview/widget/h;-><init>()V

    iput-object p1, p0, Lcom/digdroid/alman/dig/e2;->m:Landroidx/recyclerview/widget/h;

    iget-object p2, p0, Lcom/digdroid/alman/dig/e2;->j:Lcom/digdroid/alman/dig/MyRecyclerView;

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/n;->b(Landroidx/recyclerview/widget/RecyclerView;)V

    :cond_a
    :goto_2
    iget-object p1, p0, Lcom/digdroid/alman/dig/e2;->h:Landroid/widget/AbsListView;

    if-eqz p1, :cond_b

    new-instance p2, Lcom/digdroid/alman/dig/e2$l;

    invoke-direct {p2, p0}, Lcom/digdroid/alman/dig/e2$l;-><init>(Lcom/digdroid/alman/dig/e2;)V

    invoke-virtual {p1, p2}, Landroid/widget/AbsListView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/e2;->h:Landroid/widget/AbsListView;

    new-instance p2, Lcom/digdroid/alman/dig/e2$m;

    invoke-direct {p2, p0}, Lcom/digdroid/alman/dig/e2$m;-><init>(Lcom/digdroid/alman/dig/e2;)V

    invoke-virtual {p1, p2}, Landroid/widget/AbsListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    goto :goto_4

    :cond_b
    iget-object p1, p0, Lcom/digdroid/alman/dig/e2;->i:Lcom/digdroid/alman/dig/MyCarouselView;

    if-eqz p1, :cond_c

    const/16 p2, 0x11

    invoke-virtual {p1, p2}, Lc/c/a/a/c/a;->setGravity(I)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/e2;->i:Lcom/digdroid/alman/dig/MyCarouselView;

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/e2;->i:Lcom/digdroid/alman/dig/MyCarouselView;

    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->setClipToPadding(Z)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/e2;->i:Lcom/digdroid/alman/dig/MyCarouselView;

    new-instance p2, Lcom/digdroid/alman/dig/e2$n;

    invoke-direct {p2, p0}, Lcom/digdroid/alman/dig/e2$n;-><init>(Lcom/digdroid/alman/dig/e2;)V

    invoke-virtual {p1, p2}, Lc/c/a/a/c/a;->T1(Lc/c/a/a/c/a$j;)Lc/c/a/a/c/a;

    :goto_3
    invoke-virtual {p0}, Lcom/digdroid/alman/dig/e2;->m()V

    goto :goto_4

    :cond_c
    iget-object p1, p0, Lcom/digdroid/alman/dig/e2;->j:Lcom/digdroid/alman/dig/MyRecyclerView;

    if-eqz p1, :cond_d

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/e2;->j:Lcom/digdroid/alman/dig/MyRecyclerView;

    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->setClipToPadding(Z)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/e2;->j:Lcom/digdroid/alman/dig/MyRecyclerView;

    new-instance p2, Lcom/digdroid/alman/dig/e2$o;

    invoke-direct {p2, p0}, Lcom/digdroid/alman/dig/e2$o;-><init>(Lcom/digdroid/alman/dig/e2;)V

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setOnScrollListener(Landroidx/recyclerview/widget/RecyclerView$t;)V

    goto :goto_3

    :cond_d
    :goto_4
    return-void
.end method

.method public static e(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Ljava/lang/String;)Landroid/view/View;
    .locals 3

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, -0x1

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "coverflow"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x7

    goto :goto_0

    :sswitch_1
    const-string v0, "wheel"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x6

    goto :goto_0

    :sswitch_2
    const-string v0, "title"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    goto :goto_0

    :cond_2
    const/4 v2, 0x5

    goto :goto_0

    :sswitch_3
    const-string v0, "list"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    goto :goto_0

    :cond_3
    const/4 v2, 0x4

    goto :goto_0

    :sswitch_4
    const-string v0, "grid"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_4

    goto :goto_0

    :cond_4
    const/4 v2, 0x3

    goto :goto_0

    :sswitch_5
    const-string v0, "carousel"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_5

    goto :goto_0

    :cond_5
    const/4 v2, 0x2

    goto :goto_0

    :sswitch_6
    const-string v0, "linear"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_6

    goto :goto_0

    :cond_6
    const/4 v2, 0x1

    goto :goto_0

    :sswitch_7
    const-string v0, "vertical"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_7

    goto :goto_0

    :cond_7
    const/4 v2, 0x0

    :goto_0
    packed-switch v2, :pswitch_data_0

    const/4 p0, 0x0

    return-object p0

    :pswitch_0
    const p2, 0x7f0c005c

    :goto_1
    invoke-virtual {p0, p2, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    return-object p0

    :pswitch_1
    const p2, 0x7f0c0024

    goto :goto_1

    :pswitch_2
    const p2, 0x7f0c002d

    goto :goto_1

    :pswitch_3
    const p2, 0x7f0c005f

    goto :goto_1

    :sswitch_data_0
    .sparse-switch
        -0x7643988a -> :sswitch_7
        -0x41b970db -> :sswitch_6
        0x2c6160 -> :sswitch_5
        0x308b46 -> :sswitch_4
        0x32b09e -> :sswitch_3
        0x6942258 -> :sswitch_2
        0x6bdbb5b -> :sswitch_1
        0x7608a165 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method


# virtual methods
.method A(I)V
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/e2;->j:Lcom/digdroid/alman/dig/MyRecyclerView;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/digdroid/alman/dig/e2$r;

    invoke-direct {v1, p0, p1}, Lcom/digdroid/alman/dig/e2$r;-><init>(Lcom/digdroid/alman/dig/e2;I)V

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method a(FF)F
    .locals 7

    float-to-double v0, p2

    const/high16 v2, 0x40000000    # 2.0f

    const/high16 v3, 0x3f800000    # 1.0f

    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    cmpl-double v6, v0, v4

    if-ltz v6, :cond_0

    sub-float/2addr p2, v3

    div-float/2addr p2, v2

    add-float/2addr p1, p2

    invoke-static {p1, v2}, Ljava/lang/Math;->min(FF)F

    move-result p1

    return p1

    :cond_0
    div-float p2, v3, p2

    sub-float/2addr v3, p2

    div-float/2addr v3, v2

    add-float/2addr p1, v3

    const/4 p2, 0x0

    invoke-static {p1, p2}, Ljava/lang/Math;->max(FF)F

    move-result p1

    return p1
.end method

.method public declared-synchronized b(Landroid/database/Cursor;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/e2;->h:Landroid/widget/AbsListView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/AbsListView;->getAdapter()Landroid/widget/Adapter;

    move-result-object v0

    check-cast v0, Landroid/widget/CursorAdapter;

    invoke-virtual {v0, p1}, Landroid/widget/CursorAdapter;->changeCursor(Landroid/database/Cursor;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/e2;->k:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_1

    new-instance v1, Lcom/digdroid/alman/dig/e2$g;

    invoke-direct {v1, p0, p1}, Lcom/digdroid/alman/dig/e2$g;-><init>(Lcom/digdroid/alman/dig/e2;Landroid/database/Cursor;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public c(I)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/e2;->h:Landroid/widget/AbsListView;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/widget/AbsListView;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/e2;->k:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public d(I)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/e2;->h:Landroid/widget/AbsListView;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/AbsListView;->getAdapter()Landroid/widget/Adapter;

    move-result-object v0

    check-cast v0, Lcom/digdroid/alman/dig/q1;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/widget/CursorAdapter;->getCursor()Landroid/database/Cursor;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/e2;->k:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$g;

    move-result-object v0

    check-cast v0, Lcom/digdroid/alman/dig/h;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/h;->w()Landroid/database/Cursor;

    move-result-object v0

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_2

    :try_start_0
    invoke-interface {v0}, Landroid/database/Cursor;->isClosed()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-interface {v0}, Landroid/database/Cursor;->getCount()I

    move-result v2

    if-ge p1, v2, :cond_2

    invoke-interface {v0, p1}, Landroid/database/Cursor;->moveToPosition(I)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p1, :cond_2

    return-object v0

    :catch_0
    :cond_2
    return-object v1
.end method

.method public f()I
    .locals 8

    iget-object v0, p0, Lcom/digdroid/alman/dig/e2;->h:Landroid/widget/AbsListView;

    const/4 v1, -0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/AbsListView;->getSelectedItemPosition()I

    move-result v2

    if-ne v2, v1, :cond_7

    :goto_0
    iget v2, p0, Lcom/digdroid/alman/dig/e2;->x:I

    goto :goto_2

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/e2;->i:Lcom/digdroid/alman/dig/MyCarouselView;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lc/c/a/a/c/a;->getCurrentPosition()I

    move-result v0

    if-gez v0, :cond_1

    goto :goto_2

    :cond_1
    move v2, v0

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lcom/digdroid/alman/dig/e2;->j:Lcom/digdroid/alman/dig/MyRecyclerView;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/digdroid/alman/dig/e2;->l:Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->h2()I

    move-result v0

    if-ne v0, v1, :cond_3

    goto :goto_0

    :cond_3
    iget-object v1, p0, Lcom/digdroid/alman/dig/e2;->l:Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->k2()I

    move-result v1

    sub-int/2addr v1, v0

    add-int/lit8 v1, v1, 0x1

    iget-object v3, p0, Lcom/digdroid/alman/dig/e2;->j:Lcom/digdroid/alman/dig/MyRecyclerView;

    invoke-virtual {v3}, Landroid/view/ViewGroup;->getHeight()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    const v4, 0x7fffffff

    const/4 v4, 0x0

    const v5, 0x7fffffff

    :goto_1
    if-ge v2, v1, :cond_6

    iget-object v6, p0, Lcom/digdroid/alman/dig/e2;->l:Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v6, v2}, Landroidx/recyclerview/widget/RecyclerView$o;->L(I)Landroid/view/View;

    move-result-object v6

    if-nez v6, :cond_4

    goto :goto_0

    :cond_4
    invoke-virtual {v6}, Landroid/view/View;->getTop()I

    move-result v7

    invoke-virtual {v6}, Landroid/view/View;->getBottom()I

    move-result v6

    sub-int/2addr v7, v3

    invoke-static {v7}, Ljava/lang/Math;->abs(I)I

    move-result v7

    sub-int/2addr v6, v3

    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    move-result v6

    add-int/2addr v7, v6

    if-le v5, v7, :cond_5

    add-int v4, v2, v0

    move v5, v7

    :cond_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_6
    move v2, v4

    :cond_7
    :goto_2
    return v2
.end method

.method public g(II)Z
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_5

    if-eq p1, v1, :cond_0

    packed-switch p1, :pswitch_data_0

    goto :goto_2

    :pswitch_0
    iput-boolean v0, p0, Lcom/digdroid/alman/dig/e2;->y:Z

    return v0

    :pswitch_1
    if-ne p2, v1, :cond_9

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/e2;->y:Z

    return v0

    :cond_0
    if-nez p2, :cond_2

    iget-boolean p1, p0, Lcom/digdroid/alman/dig/e2;->y:Z

    if-nez p1, :cond_1

    return v0

    :cond_1
    iput-boolean v1, p0, Lcom/digdroid/alman/dig/e2;->z:Z

    return v1

    :cond_2
    if-ne p2, v1, :cond_4

    iget-boolean p1, p0, Lcom/digdroid/alman/dig/e2;->z:Z

    if-eqz p1, :cond_4

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/e2;->z:Z

    iget-object p1, p0, Lcom/digdroid/alman/dig/e2;->j:Lcom/digdroid/alman/dig/MyRecyclerView;

    if-nez p1, :cond_3

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/e2;->m()V

    :cond_3
    return v1

    :cond_4
    return v0

    :cond_5
    iget-object v2, p0, Lcom/digdroid/alman/dig/e2;->k:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v2, :cond_9

    iget-boolean v2, p0, Lcom/digdroid/alman/dig/e2;->u:Z

    if-nez v2, :cond_9

    iget-boolean v2, p0, Lcom/digdroid/alman/dig/e2;->v:Z

    if-nez v2, :cond_9

    const-wide/16 v2, 0x0

    if-nez p2, :cond_6

    iget-wide p1, p0, Lcom/digdroid/alman/dig/e2;->B:J

    cmp-long v0, p1, v2

    if-nez v0, :cond_8

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/digdroid/alman/dig/e2;->B:J

    goto :goto_1

    :cond_6
    if-ne p2, v1, :cond_8

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iget-wide v4, p0, Lcom/digdroid/alman/dig/e2;->B:J

    sub-long/2addr p1, v4

    const-wide/16 v4, 0x3e8

    cmp-long v0, p1, v4

    if-ltz v0, :cond_7

    new-instance p1, Lcom/digdroid/alman/dig/e2$h;

    invoke-direct {p1, p0}, Lcom/digdroid/alman/dig/e2$h;-><init>(Lcom/digdroid/alman/dig/e2;)V

    goto :goto_0

    :cond_7
    new-instance p1, Lcom/digdroid/alman/dig/e2$i;

    invoke-direct {p1, p0}, Lcom/digdroid/alman/dig/e2$i;-><init>(Lcom/digdroid/alman/dig/e2;)V

    :goto_0
    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/e2;->l(Ljava/lang/Runnable;)V

    iput-wide v2, p0, Lcom/digdroid/alman/dig/e2;->B:J

    :cond_8
    :goto_1
    return v1

    :cond_9
    :goto_2
    if-eqz p2, :cond_a

    return v0

    :cond_a
    const/16 p2, 0xa

    iget-object v2, p0, Lcom/digdroid/alman/dig/e2;->h:Landroid/widget/AbsListView;

    if-eqz v2, :cond_11

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/e2;->j()Z

    move-result v2

    if-eqz v2, :cond_b

    iget-object v2, p0, Lcom/digdroid/alman/dig/e2;->f:Landroid/widget/GridView;

    invoke-virtual {v2}, Landroid/widget/GridView;->getNumColumns()I

    move-result v2

    mul-int/lit8 p2, v2, 0xa

    :cond_b
    iget-object v2, p0, Lcom/digdroid/alman/dig/e2;->h:Landroid/widget/AbsListView;

    invoke-virtual {v2}, Landroid/widget/AbsListView;->getSelectedItemPosition()I

    move-result v2

    const/16 v3, 0x8

    if-eq p1, v3, :cond_f

    const/16 v3, 0x9

    if-eq p1, v3, :cond_c

    return v0

    :cond_c
    iput-boolean v1, p0, Lcom/digdroid/alman/dig/e2;->y:Z

    iget-boolean p1, p0, Lcom/digdroid/alman/dig/e2;->z:Z

    if-nez p1, :cond_d

    return v0

    :cond_d
    iget-object p1, p0, Lcom/digdroid/alman/dig/e2;->h:Landroid/widget/AbsListView;

    invoke-virtual {p1}, Landroid/widget/AbsListView;->getAdapter()Landroid/widget/Adapter;

    move-result-object p1

    check-cast p1, Lcom/digdroid/alman/dig/q1;

    if-eqz p1, :cond_e

    invoke-virtual {p1}, Landroid/widget/CursorAdapter;->getCount()I

    move-result p1

    add-int/2addr v2, p2

    sub-int/2addr p1, v1

    invoke-static {v2, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    iget-object p2, p0, Lcom/digdroid/alman/dig/e2;->h:Landroid/widget/AbsListView;

    invoke-virtual {p2, p1}, Landroid/widget/AbsListView;->setSelection(I)V

    :cond_e
    return v1

    :cond_f
    iput-boolean v1, p0, Lcom/digdroid/alman/dig/e2;->y:Z

    iget-boolean p1, p0, Lcom/digdroid/alman/dig/e2;->z:Z

    if-nez p1, :cond_10

    return v0

    :cond_10
    sub-int/2addr v2, p2

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    iget-object p2, p0, Lcom/digdroid/alman/dig/e2;->h:Landroid/widget/AbsListView;

    invoke-virtual {p2, p1}, Landroid/widget/AbsListView;->setSelection(I)V

    return v1

    :cond_11
    iget-object v2, p0, Lcom/digdroid/alman/dig/e2;->i:Lcom/digdroid/alman/dig/MyCarouselView;

    const/4 v3, 0x0

    if-eqz v2, :cond_1b

    invoke-virtual {v2}, Lc/c/a/a/c/a;->getCurrentPosition()I

    move-result v2

    packed-switch p1, :pswitch_data_1

    goto/16 :goto_8

    :pswitch_2
    iput-boolean v1, p0, Lcom/digdroid/alman/dig/e2;->w:Z

    return v0

    :pswitch_3
    iget-boolean p1, p0, Lcom/digdroid/alman/dig/e2;->u:Z

    if-nez p1, :cond_15

    iget-boolean p1, p0, Lcom/digdroid/alman/dig/e2;->v:Z

    if-nez p1, :cond_15

    iget-object p1, p0, Lcom/digdroid/alman/dig/e2;->i:Lcom/digdroid/alman/dig/MyCarouselView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$g;

    move-result-object p1

    check-cast p1, Lcom/digdroid/alman/dig/h;

    if-eqz p1, :cond_14

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/h;->c()I

    move-result p1

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/e2;->z:Z

    if-eqz v0, :cond_12

    add-int/2addr v2, p2

    sub-int/2addr p1, v1

    invoke-static {v2, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    iget-object p2, p0, Lcom/digdroid/alman/dig/e2;->i:Lcom/digdroid/alman/dig/MyCarouselView;

    invoke-virtual {p2, p1}, Lc/c/a/a/c/a;->k1(I)V

    iget-object p2, p0, Lcom/digdroid/alman/dig/e2;->d:Lcom/digdroid/alman/dig/e2$x;

    if-eqz p2, :cond_13

    invoke-interface {p2, v3, p1}, Lcom/digdroid/alman/dig/e2$x;->a(Landroid/view/View;I)V

    goto :goto_3

    :cond_12
    add-int/2addr v2, v1

    if-ge v2, p1, :cond_13

    iget-object p1, p0, Lcom/digdroid/alman/dig/e2;->i:Lcom/digdroid/alman/dig/MyCarouselView;

    invoke-virtual {p1, v2}, Lc/c/a/a/c/a;->s1(I)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/e2;->d:Lcom/digdroid/alman/dig/e2$x;

    if-eqz p1, :cond_13

    invoke-interface {p1, v3, v2}, Lcom/digdroid/alman/dig/e2$x;->a(Landroid/view/View;I)V

    :cond_13
    :goto_3
    iput-boolean v1, p0, Lcom/digdroid/alman/dig/e2;->y:Z

    :cond_14
    return v1

    :cond_15
    return v0

    :pswitch_4
    iget-boolean p1, p0, Lcom/digdroid/alman/dig/e2;->u:Z

    if-nez p1, :cond_18

    iget-boolean p1, p0, Lcom/digdroid/alman/dig/e2;->v:Z

    if-nez p1, :cond_18

    iget-boolean p1, p0, Lcom/digdroid/alman/dig/e2;->z:Z

    if-eqz p1, :cond_16

    sub-int/2addr v2, p2

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    iget-object p2, p0, Lcom/digdroid/alman/dig/e2;->i:Lcom/digdroid/alman/dig/MyCarouselView;

    invoke-virtual {p2, p1}, Lc/c/a/a/c/a;->k1(I)V

    iget-object p2, p0, Lcom/digdroid/alman/dig/e2;->d:Lcom/digdroid/alman/dig/e2$x;

    if-eqz p2, :cond_17

    invoke-interface {p2, v3, p1}, Lcom/digdroid/alman/dig/e2$x;->a(Landroid/view/View;I)V

    goto :goto_4

    :cond_16
    if-lez v2, :cond_17

    iget-object p1, p0, Lcom/digdroid/alman/dig/e2;->i:Lcom/digdroid/alman/dig/MyCarouselView;

    sub-int/2addr v2, v1

    invoke-virtual {p1, v2}, Lc/c/a/a/c/a;->s1(I)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/e2;->d:Lcom/digdroid/alman/dig/e2$x;

    if-eqz p1, :cond_17

    invoke-interface {p1, v3, v2}, Lcom/digdroid/alman/dig/e2$x;->a(Landroid/view/View;I)V

    :cond_17
    :goto_4
    iput-boolean v1, p0, Lcom/digdroid/alman/dig/e2;->y:Z

    return v1

    :cond_18
    return v0

    :pswitch_5
    iput-boolean v0, p0, Lcom/digdroid/alman/dig/e2;->u:Z

    iget-boolean p1, p0, Lcom/digdroid/alman/dig/e2;->t:Z

    iput-boolean p1, p0, Lcom/digdroid/alman/dig/e2;->v:Z

    if-eqz p1, :cond_19

    iget-object p1, p0, Lcom/digdroid/alman/dig/e2;->a:Lcom/digdroid/alman/dig/e2$s;

    invoke-interface {p1}, Lcom/digdroid/alman/dig/e2$s;->e()V

    :cond_19
    return v0

    :pswitch_6
    iput-boolean v0, p0, Lcom/digdroid/alman/dig/e2;->v:Z

    iget-boolean p1, p0, Lcom/digdroid/alman/dig/e2;->s:Z

    iput-boolean p1, p0, Lcom/digdroid/alman/dig/e2;->u:Z

    if-eqz p1, :cond_1a

    iget-object p1, p0, Lcom/digdroid/alman/dig/e2;->a:Lcom/digdroid/alman/dig/e2$s;

    invoke-interface {p1}, Lcom/digdroid/alman/dig/e2$s;->e()V

    :cond_1a
    return v0

    :cond_1b
    iget-object v2, p0, Lcom/digdroid/alman/dig/e2;->j:Lcom/digdroid/alman/dig/MyRecyclerView;

    if-eqz v2, :cond_29

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/e2;->f()I

    move-result v2

    const-string v4, "allow_paging"

    packed-switch p1, :pswitch_data_2

    goto/16 :goto_8

    :pswitch_7
    iput-boolean v1, p0, Lcom/digdroid/alman/dig/e2;->w:Z

    return v0

    :pswitch_8
    iget-boolean p1, p0, Lcom/digdroid/alman/dig/e2;->u:Z

    if-nez p1, :cond_1c

    iget-boolean p1, p0, Lcom/digdroid/alman/dig/e2;->v:Z

    if-nez p1, :cond_1c

    iget-object p1, p0, Lcom/digdroid/alman/dig/e2;->p:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {p1, v4, v1}, Lcom/digdroid/alman/dig/b3;->c(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_1c

    iget-object p1, p0, Lcom/digdroid/alman/dig/e2;->a:Lcom/digdroid/alman/dig/e2$s;

    invoke-interface {p1}, Lcom/digdroid/alman/dig/e2$s;->i()V

    :cond_1c
    return v1

    :pswitch_9
    iget-boolean p1, p0, Lcom/digdroid/alman/dig/e2;->u:Z

    if-nez p1, :cond_1d

    iget-boolean p1, p0, Lcom/digdroid/alman/dig/e2;->v:Z

    if-nez p1, :cond_1d

    iget-object p1, p0, Lcom/digdroid/alman/dig/e2;->p:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {p1, v4, v1}, Lcom/digdroid/alman/dig/b3;->c(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_1d

    iget-object p1, p0, Lcom/digdroid/alman/dig/e2;->a:Lcom/digdroid/alman/dig/e2$s;

    invoke-interface {p1}, Lcom/digdroid/alman/dig/e2$s;->j()V

    :cond_1d
    return v1

    :pswitch_a
    iget-boolean p1, p0, Lcom/digdroid/alman/dig/e2;->u:Z

    if-eqz p1, :cond_1e

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/e2;->u:Z

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/e2;->m()V

    return v1

    :cond_1e
    iget-object p1, p0, Lcom/digdroid/alman/dig/e2;->j:Lcom/digdroid/alman/dig/MyRecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$g;

    move-result-object p1

    check-cast p1, Lcom/digdroid/alman/dig/h;

    if-nez p1, :cond_1f

    return v0

    :cond_1f
    invoke-virtual {p1}, Lcom/digdroid/alman/dig/h;->c()I

    move-result v4

    sub-int/2addr v4, v1

    if-ne v2, v4, :cond_20

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/e2;->u:Z

    iget-boolean p1, p0, Lcom/digdroid/alman/dig/e2;->t:Z

    iput-boolean p1, p0, Lcom/digdroid/alman/dig/e2;->v:Z

    if-eqz p1, :cond_23

    iget-object p1, p0, Lcom/digdroid/alman/dig/e2;->a:Lcom/digdroid/alman/dig/e2$s;

    invoke-interface {p1}, Lcom/digdroid/alman/dig/e2$s;->e()V

    goto :goto_6

    :cond_20
    iput-boolean v0, p0, Lcom/digdroid/alman/dig/e2;->v:Z

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/e2;->u:Z

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/h;->c()I

    move-result p1

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/e2;->z:Z

    if-eqz v0, :cond_21

    add-int/2addr v2, p2

    sub-int/2addr p1, v1

    invoke-static {v2, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    iget-object p2, p0, Lcom/digdroid/alman/dig/e2;->j:Lcom/digdroid/alman/dig/MyRecyclerView;

    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView;->k1(I)V

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/e2;->A(I)V

    iget-object p2, p0, Lcom/digdroid/alman/dig/e2;->d:Lcom/digdroid/alman/dig/e2$x;

    if-eqz p2, :cond_22

    invoke-interface {p2, v3, p1}, Lcom/digdroid/alman/dig/e2$x;->a(Landroid/view/View;I)V

    goto :goto_5

    :cond_21
    add-int/2addr v2, v1

    if-ge v2, p1, :cond_22

    invoke-virtual {p0, v2}, Lcom/digdroid/alman/dig/e2;->A(I)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/e2;->d:Lcom/digdroid/alman/dig/e2$x;

    if-eqz p1, :cond_22

    invoke-interface {p1, v3, v2}, Lcom/digdroid/alman/dig/e2$x;->a(Landroid/view/View;I)V

    :cond_22
    :goto_5
    iput-boolean v1, p0, Lcom/digdroid/alman/dig/e2;->y:Z

    :cond_23
    :goto_6
    return v1

    :pswitch_b
    iget-boolean p1, p0, Lcom/digdroid/alman/dig/e2;->v:Z

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/e2;->v:Z

    if-eqz p1, :cond_24

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/e2;->m()V

    return v1

    :cond_24
    if-nez v2, :cond_26

    iget-boolean p1, p0, Lcom/digdroid/alman/dig/e2;->s:Z

    iput-boolean p1, p0, Lcom/digdroid/alman/dig/e2;->u:Z

    if-eqz p1, :cond_25

    iget-object p1, p0, Lcom/digdroid/alman/dig/e2;->a:Lcom/digdroid/alman/dig/e2$s;

    invoke-interface {p1}, Lcom/digdroid/alman/dig/e2$s;->e()V

    :cond_25
    return v0

    :cond_26
    iput-boolean v0, p0, Lcom/digdroid/alman/dig/e2;->u:Z

    iget-boolean p1, p0, Lcom/digdroid/alman/dig/e2;->z:Z

    if-eqz p1, :cond_27

    sub-int/2addr v2, p2

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    iget-object p2, p0, Lcom/digdroid/alman/dig/e2;->j:Lcom/digdroid/alman/dig/MyRecyclerView;

    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView;->k1(I)V

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/e2;->A(I)V

    iget-object p2, p0, Lcom/digdroid/alman/dig/e2;->d:Lcom/digdroid/alman/dig/e2$x;

    if-eqz p2, :cond_28

    invoke-interface {p2, v3, p1}, Lcom/digdroid/alman/dig/e2$x;->a(Landroid/view/View;I)V

    goto :goto_7

    :cond_27
    sub-int/2addr v2, v1

    invoke-virtual {p0, v2}, Lcom/digdroid/alman/dig/e2;->A(I)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/e2;->d:Lcom/digdroid/alman/dig/e2$x;

    if-eqz p1, :cond_28

    invoke-interface {p1, v3, v2}, Lcom/digdroid/alman/dig/e2$x;->a(Landroid/view/View;I)V

    :cond_28
    :goto_7
    iput-boolean v1, p0, Lcom/digdroid/alman/dig/e2;->y:Z

    return v1

    :cond_29
    :goto_8
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x8
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x8
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
    .end packed-switch
.end method

.method public h()V
    .locals 2

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/e2;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/e2;->a:Lcom/digdroid/alman/dig/e2$s;

    invoke-interface {v0}, Lcom/digdroid/alman/dig/e2$s;->l()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/e2;->h:Landroid/widget/AbsListView;

    new-instance v1, Lcom/digdroid/alman/dig/e2$q;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/e2$q;-><init>(Lcom/digdroid/alman/dig/e2;)V

    invoke-virtual {v0, v1}, Landroid/widget/AbsListView;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public i()Z
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/e2;->f:Landroid/widget/GridView;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public j()Z
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/e2;->f:Landroid/widget/GridView;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public k()Z
    .locals 1

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/e2;->q:Z

    return v0
.end method

.method public l(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/e2;->h:Landroid/widget/AbsListView;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/widget/AbsListView;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/e2;->k:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->post(Ljava/lang/Runnable;)Z

    :cond_1
    :goto_0
    return-void
.end method

.method public m()V
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/e2;->a:Lcom/digdroid/alman/dig/e2$s;

    invoke-interface {v0}, Lcom/digdroid/alman/dig/e2$s;->D()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/digdroid/alman/dig/e2;->h:Landroid/widget/AbsListView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/AbsListView;->requestFocus()Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/e2;->k:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/ViewGroup;->requestFocus()Z

    :cond_1
    :goto_0
    return-void
.end method

.method n(FF)F
    .locals 1

    mul-float p1, p1, p2

    const p2, 0x3e4ccccd

    cmpg-float v0, p1, p2

    if-gez v0, :cond_0

    const p1, 0x3e4ccccd

    :cond_0
    const/high16 p2, 0x41200000    # 10.0f

    cmpl-float v0, p1, p2

    if-lez v0, :cond_1

    const/high16 p1, 0x41200000    # 10.0f

    :cond_1
    return p1
.end method

.method o(F)V
    .locals 8

    iget-object v0, p0, Lcom/digdroid/alman/dig/e2;->a:Lcom/digdroid/alman/dig/e2$s;

    invoke-interface {v0}, Lcom/digdroid/alman/dig/e2$s;->Q()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const-string v2, "grid"

    const-string v3, "vertical"

    const/4 v4, -0x1

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v1, "coverflow"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v4, 0x7

    goto :goto_0

    :sswitch_1
    const-string v1, "wheel"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v4, 0x6

    goto :goto_0

    :sswitch_2
    const-string v1, "title"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v4, 0x5

    goto :goto_0

    :sswitch_3
    const-string v1, "list"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v4, 0x4

    goto :goto_0

    :sswitch_4
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_0

    :cond_4
    const/4 v4, 0x3

    goto :goto_0

    :sswitch_5
    const-string v1, "carousel"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_0

    :cond_5
    const/4 v4, 0x2

    goto :goto_0

    :sswitch_6
    const-string v1, "linear"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    goto :goto_0

    :cond_6
    const/4 v4, 0x1

    goto :goto_0

    :sswitch_7
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    goto :goto_0

    :cond_7
    const/4 v4, 0x0

    :goto_0
    packed-switch v4, :pswitch_data_0

    goto/16 :goto_1

    :pswitch_0
    iget-object v1, p0, Lcom/digdroid/alman/dig/e2;->a:Lcom/digdroid/alman/dig/e2$s;

    invoke-interface {v1}, Lcom/digdroid/alman/dig/e2$s;->W()F

    move-result v4

    invoke-virtual {p0, v4, p1}, Lcom/digdroid/alman/dig/e2;->n(FF)F

    move-result p1

    invoke-interface {v1, p1}, Lcom/digdroid/alman/dig/e2$s;->u(F)V

    goto/16 :goto_1

    :pswitch_1
    iget-object v1, p0, Lcom/digdroid/alman/dig/e2;->a:Lcom/digdroid/alman/dig/e2$s;

    invoke-interface {v1}, Lcom/digdroid/alman/dig/e2$s;->x()F

    move-result v4

    invoke-virtual {p0, v4, p1}, Lcom/digdroid/alman/dig/e2;->n(FF)F

    move-result p1

    invoke-interface {v1, p1}, Lcom/digdroid/alman/dig/e2$s;->q(F)V

    goto/16 :goto_1

    :pswitch_2
    iget-object v1, p0, Lcom/digdroid/alman/dig/e2;->a:Lcom/digdroid/alman/dig/e2$s;

    invoke-interface {v1}, Lcom/digdroid/alman/dig/e2$s;->h()F

    move-result v4

    invoke-virtual {p0, v4, p1}, Lcom/digdroid/alman/dig/e2;->n(FF)F

    move-result p1

    invoke-interface {v1, p1}, Lcom/digdroid/alman/dig/e2$s;->A(F)V

    goto :goto_1

    :pswitch_3
    iget-object v1, p0, Lcom/digdroid/alman/dig/e2;->a:Lcom/digdroid/alman/dig/e2$s;

    invoke-interface {v1}, Lcom/digdroid/alman/dig/e2$s;->k()F

    move-result v4

    invoke-virtual {p0, v4, p1}, Lcom/digdroid/alman/dig/e2;->n(FF)F

    move-result p1

    invoke-interface {v1, p1}, Lcom/digdroid/alman/dig/e2$s;->O(F)V

    goto :goto_1

    :pswitch_4
    iget-object v1, p0, Lcom/digdroid/alman/dig/e2;->e:Lcom/digdroid/alman/dig/MainActivity;

    invoke-virtual {v1}, Landroidx/appcompat/app/c;->getResources()Landroid/content/res/Resources;

    iget-object v1, p0, Lcom/digdroid/alman/dig/e2;->a:Lcom/digdroid/alman/dig/e2$s;

    invoke-interface {v1}, Lcom/digdroid/alman/dig/e2$s;->P()D

    move-result-wide v4

    float-to-double v6, p1

    invoke-static {v6, v7}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v4, v4, v6

    const-wide/high16 v6, 0x403e000000000000L    # 30.0

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->max(DD)D

    move-result-wide v4

    invoke-interface {v1, v4, v5}, Lcom/digdroid/alman/dig/e2$s;->U(D)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/e2;->a:Lcom/digdroid/alman/dig/e2$s;

    invoke-interface {p1}, Lcom/digdroid/alman/dig/e2$s;->P()D

    move-result-wide v4

    double-to-float p1, v4

    invoke-static {p1}, Lcom/digdroid/alman/dig/p3;->d(F)F

    move-result p1

    iget-object v1, p0, Lcom/digdroid/alman/dig/e2;->f:Landroid/widget/GridView;

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    invoke-virtual {v1, p1}, Landroid/widget/GridView;->setColumnWidth(I)V

    goto :goto_1

    :pswitch_5
    iget-object v1, p0, Lcom/digdroid/alman/dig/e2;->a:Lcom/digdroid/alman/dig/e2$s;

    invoke-interface {v1}, Lcom/digdroid/alman/dig/e2$s;->z()F

    move-result v4

    invoke-virtual {p0, v4, p1}, Lcom/digdroid/alman/dig/e2;->n(FF)F

    move-result p1

    invoke-interface {v1, p1}, Lcom/digdroid/alman/dig/e2$s;->C(F)V

    goto :goto_1

    :pswitch_6
    iget-object v1, p0, Lcom/digdroid/alman/dig/e2;->a:Lcom/digdroid/alman/dig/e2$s;

    invoke-interface {v1}, Lcom/digdroid/alman/dig/e2$s;->V()F

    move-result v4

    invoke-virtual {p0, v4, p1}, Lcom/digdroid/alman/dig/e2;->n(FF)F

    move-result p1

    invoke-interface {v1, p1}, Lcom/digdroid/alman/dig/e2$s;->K(F)V

    goto :goto_1

    :pswitch_7
    iget-object v1, p0, Lcom/digdroid/alman/dig/e2;->a:Lcom/digdroid/alman/dig/e2$s;

    invoke-interface {v1}, Lcom/digdroid/alman/dig/e2$s;->S()F

    move-result v4

    invoke-virtual {p0, v4, p1}, Lcom/digdroid/alman/dig/e2;->a(FF)F

    move-result p1

    invoke-interface {v1, p1}, Lcom/digdroid/alman/dig/e2$s;->H(F)V

    :goto_1
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    iget-object p1, p0, Lcom/digdroid/alman/dig/e2;->f:Landroid/widget/GridView;

    invoke-virtual {p1}, Landroid/widget/GridView;->invalidate()V

    goto :goto_2

    :cond_8
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    iget-object p1, p0, Lcom/digdroid/alman/dig/e2;->n:Lcom/digdroid/alman/dig/j2;

    iget-object v0, p0, Lcom/digdroid/alman/dig/e2;->a:Lcom/digdroid/alman/dig/e2$s;

    invoke-interface {v0}, Lcom/digdroid/alman/dig/e2$s;->S()F

    move-result v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/e2;->a:Lcom/digdroid/alman/dig/e2$s;

    invoke-interface {v1}, Lcom/digdroid/alman/dig/e2$s;->E()F

    move-result v1

    invoke-virtual {p1, v0, v1}, Lcom/digdroid/alman/dig/j2;->k(FF)V

    :cond_9
    iget-object p1, p0, Lcom/digdroid/alman/dig/e2;->a:Lcom/digdroid/alman/dig/e2$s;

    invoke-interface {p1}, Lcom/digdroid/alman/dig/e2$s;->B()V

    :goto_2
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7643988a -> :sswitch_7
        -0x41b970db -> :sswitch_6
        0x2c6160 -> :sswitch_5
        0x308b46 -> :sswitch_4
        0x32b09e -> :sswitch_3
        0x6942258 -> :sswitch_2
        0x6bdbb5b -> :sswitch_1
        0x7608a165 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method p(F)V
    .locals 6

    iget-object v0, p0, Lcom/digdroid/alman/dig/e2;->a:Lcom/digdroid/alman/dig/e2$s;

    invoke-interface {v0}, Lcom/digdroid/alman/dig/e2$s;->Q()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const-string v2, "grid"

    const-string v3, "vertical"

    const/4 v4, -0x1

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v1, "coverflow"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v4, 0x7

    goto :goto_0

    :sswitch_1
    const-string v1, "wheel"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v4, 0x6

    goto :goto_0

    :sswitch_2
    const-string v1, "title"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v4, 0x5

    goto :goto_0

    :sswitch_3
    const-string v1, "list"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v4, 0x4

    goto :goto_0

    :sswitch_4
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_0

    :cond_4
    const/4 v4, 0x3

    goto :goto_0

    :sswitch_5
    const-string v1, "carousel"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_0

    :cond_5
    const/4 v4, 0x2

    goto :goto_0

    :sswitch_6
    const-string v1, "linear"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    goto :goto_0

    :cond_6
    const/4 v4, 0x1

    goto :goto_0

    :sswitch_7
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    goto :goto_0

    :cond_7
    const/4 v4, 0x0

    :goto_0
    const/high16 v1, 0x40000000    # 2.0f

    packed-switch v4, :pswitch_data_0

    goto/16 :goto_2

    :pswitch_0
    iget-object v4, p0, Lcom/digdroid/alman/dig/e2;->a:Lcom/digdroid/alman/dig/e2$s;

    invoke-interface {v4}, Lcom/digdroid/alman/dig/e2$s;->p()F

    move-result v4

    invoke-virtual {p0, v4, p1}, Lcom/digdroid/alman/dig/e2;->a(FF)F

    move-result p1

    iget-object v4, p0, Lcom/digdroid/alman/dig/e2;->a:Lcom/digdroid/alman/dig/e2$s;

    invoke-interface {v4, p1}, Lcom/digdroid/alman/dig/e2$s;->r(F)V

    goto :goto_1

    :pswitch_1
    iget-object v4, p0, Lcom/digdroid/alman/dig/e2;->a:Lcom/digdroid/alman/dig/e2$s;

    invoke-interface {v4}, Lcom/digdroid/alman/dig/e2$s;->M()F

    move-result v4

    invoke-virtual {p0, v4, p1}, Lcom/digdroid/alman/dig/e2;->a(FF)F

    move-result p1

    iget-object v4, p0, Lcom/digdroid/alman/dig/e2;->a:Lcom/digdroid/alman/dig/e2$s;

    invoke-interface {v4, p1}, Lcom/digdroid/alman/dig/e2$s;->v(F)V

    goto :goto_1

    :pswitch_2
    iget-object v1, p0, Lcom/digdroid/alman/dig/e2;->a:Lcom/digdroid/alman/dig/e2$s;

    invoke-interface {v1}, Lcom/digdroid/alman/dig/e2$s;->o()F

    move-result v4

    invoke-virtual {p0, v4, p1}, Lcom/digdroid/alman/dig/e2;->n(FF)F

    move-result p1

    invoke-interface {v1, p1}, Lcom/digdroid/alman/dig/e2$s;->J(F)V

    goto :goto_2

    :pswitch_3
    iget-object v1, p0, Lcom/digdroid/alman/dig/e2;->a:Lcom/digdroid/alman/dig/e2$s;

    invoke-interface {v1}, Lcom/digdroid/alman/dig/e2$s;->m()F

    move-result v4

    invoke-virtual {p0, v4, p1}, Lcom/digdroid/alman/dig/e2;->n(FF)F

    move-result p1

    invoke-interface {v1, p1}, Lcom/digdroid/alman/dig/e2$s;->F(F)V

    goto :goto_2

    :pswitch_4
    iget-object v1, p0, Lcom/digdroid/alman/dig/e2;->e:Lcom/digdroid/alman/dig/MainActivity;

    invoke-virtual {v1}, Landroidx/appcompat/app/c;->getResources()Landroid/content/res/Resources;

    iget-object v1, p0, Lcom/digdroid/alman/dig/e2;->p:Lcom/digdroid/alman/dig/b3;

    const/high16 v4, 0x42100000    # 36.0f

    const-string v5, "vertical_spacing"

    invoke-virtual {v1, v5, v4}, Lcom/digdroid/alman/dig/b3;->f(Ljava/lang/String;F)F

    move-result v1

    mul-float v1, v1, p1

    const/high16 p1, 0x42c80000    # 100.0f

    invoke-static {v1, p1}, Ljava/lang/Math;->min(FF)F

    move-result p1

    const v1, 0x3e4ccccd

    invoke-static {p1, v1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    iget-object v1, p0, Lcom/digdroid/alman/dig/e2;->p:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {v1, v5, p1}, Lcom/digdroid/alman/dig/b3;->w(Ljava/lang/String;F)V

    invoke-static {p1}, Lcom/digdroid/alman/dig/p3;->e(F)F

    move-result p1

    iget-object v1, p0, Lcom/digdroid/alman/dig/e2;->f:Landroid/widget/GridView;

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    invoke-virtual {v1, p1}, Landroid/widget/GridView;->setVerticalSpacing(I)V

    goto :goto_2

    :pswitch_5
    iget-object v4, p0, Lcom/digdroid/alman/dig/e2;->a:Lcom/digdroid/alman/dig/e2$s;

    invoke-interface {v4}, Lcom/digdroid/alman/dig/e2$s;->y()F

    move-result v4

    invoke-virtual {p0, v4, p1}, Lcom/digdroid/alman/dig/e2;->a(FF)F

    move-result p1

    iget-object v4, p0, Lcom/digdroid/alman/dig/e2;->a:Lcom/digdroid/alman/dig/e2$s;

    invoke-interface {v4, p1}, Lcom/digdroid/alman/dig/e2$s;->I(F)V

    :goto_1
    iget-object v4, p0, Lcom/digdroid/alman/dig/e2;->i:Lcom/digdroid/alman/dig/MyCarouselView;

    sub-float/2addr v1, p1

    invoke-virtual {v4, v1}, Lc/c/a/a/c/a;->setYTranslation(F)V

    goto :goto_2

    :pswitch_6
    iget-object v4, p0, Lcom/digdroid/alman/dig/e2;->a:Lcom/digdroid/alman/dig/e2$s;

    invoke-interface {v4}, Lcom/digdroid/alman/dig/e2$s;->L()F

    move-result v4

    invoke-virtual {p0, v4, p1}, Lcom/digdroid/alman/dig/e2;->a(FF)F

    move-result p1

    iget-object v4, p0, Lcom/digdroid/alman/dig/e2;->a:Lcom/digdroid/alman/dig/e2$s;

    invoke-interface {v4, p1}, Lcom/digdroid/alman/dig/e2$s;->N(F)V

    goto :goto_1

    :pswitch_7
    iget-object v1, p0, Lcom/digdroid/alman/dig/e2;->a:Lcom/digdroid/alman/dig/e2$s;

    invoke-interface {v1}, Lcom/digdroid/alman/dig/e2$s;->E()F

    move-result v4

    invoke-virtual {p0, v4, p1}, Lcom/digdroid/alman/dig/e2;->n(FF)F

    move-result p1

    invoke-interface {v1, p1}, Lcom/digdroid/alman/dig/e2$s;->T(F)V

    :goto_2
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    iget-object p1, p0, Lcom/digdroid/alman/dig/e2;->f:Landroid/widget/GridView;

    invoke-virtual {p1}, Landroid/widget/GridView;->invalidate()V

    goto :goto_3

    :cond_8
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    iget-object p1, p0, Lcom/digdroid/alman/dig/e2;->n:Lcom/digdroid/alman/dig/j2;

    iget-object v0, p0, Lcom/digdroid/alman/dig/e2;->a:Lcom/digdroid/alman/dig/e2$s;

    invoke-interface {v0}, Lcom/digdroid/alman/dig/e2$s;->S()F

    move-result v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/e2;->a:Lcom/digdroid/alman/dig/e2$s;

    invoke-interface {v1}, Lcom/digdroid/alman/dig/e2$s;->E()F

    move-result v1

    invoke-virtual {p1, v0, v1}, Lcom/digdroid/alman/dig/j2;->k(FF)V

    :cond_9
    iget-object p1, p0, Lcom/digdroid/alman/dig/e2;->a:Lcom/digdroid/alman/dig/e2$s;

    invoke-interface {p1}, Lcom/digdroid/alman/dig/e2$s;->B()V

    :goto_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7643988a -> :sswitch_7
        -0x41b970db -> :sswitch_6
        0x2c6160 -> :sswitch_5
        0x308b46 -> :sswitch_4
        0x32b09e -> :sswitch_3
        0x6942258 -> :sswitch_2
        0x6bdbb5b -> :sswitch_1
        0x7608a165 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public q(Lcom/digdroid/alman/dig/d2;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/e2;->h:Landroid/widget/AbsListView;

    if-eqz v0, :cond_1

    iget-object p1, p1, Lcom/digdroid/alman/dig/d2;->a:Lcom/digdroid/alman/dig/q1;

    invoke-virtual {v0, p1}, Landroid/widget/AbsListView;->setAdapter(Landroid/widget/ListAdapter;)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/digdroid/alman/dig/e2;->i:Lcom/digdroid/alman/dig/MyCarouselView;

    if-eqz v0, :cond_2

    new-instance v1, Lcom/digdroid/alman/dig/e2$e;

    invoke-direct {v1, p0, p1}, Lcom/digdroid/alman/dig/e2$e;-><init>(Lcom/digdroid/alman/dig/e2;Lcom/digdroid/alman/dig/d2;)V

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->post(Ljava/lang/Runnable;)Z

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/digdroid/alman/dig/e2;->j:Lcom/digdroid/alman/dig/MyRecyclerView;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/digdroid/alman/dig/e2;->b:Lcom/digdroid/alman/dig/e2$v;

    if-eqz v0, :cond_3

    iget-object v1, p1, Lcom/digdroid/alman/dig/d2;->b:Lcom/digdroid/alman/dig/h;

    invoke-virtual {v1, v0}, Lcom/digdroid/alman/dig/h;->x(Lcom/digdroid/alman/dig/e2$v;)V

    :cond_3
    iget-object v0, p0, Lcom/digdroid/alman/dig/e2;->c:Lcom/digdroid/alman/dig/e2$w;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/digdroid/alman/dig/e2;->p:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/b3;->t()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p1, Lcom/digdroid/alman/dig/d2;->b:Lcom/digdroid/alman/dig/h;

    iget-object v1, p0, Lcom/digdroid/alman/dig/e2;->c:Lcom/digdroid/alman/dig/e2$w;

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/h;->z(Lcom/digdroid/alman/dig/e2$w;)V

    :cond_4
    iget-object v0, p0, Lcom/digdroid/alman/dig/e2;->j:Lcom/digdroid/alman/dig/MyRecyclerView;

    new-instance v1, Lcom/digdroid/alman/dig/e2$f;

    invoke-direct {v1, p0, p1}, Lcom/digdroid/alman/dig/e2$f;-><init>(Lcom/digdroid/alman/dig/e2;Lcom/digdroid/alman/dig/d2;)V

    goto :goto_0

    :cond_5
    :goto_1
    return-void
.end method

.method public r(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/e2;->h:Landroid/widget/AbsListView;

    if-eqz v0, :cond_1

    instance-of v1, v0, Landroid/widget/ListView;

    if-eqz v1, :cond_1

    check-cast v0, Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/RelativeLayout$LayoutParams;

    const/16 v2, 0xd

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const-string v1, "icons_bottom"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/digdroid/alman/dig/e2;->e:Lcom/digdroid/alman/dig/MainActivity;

    invoke-static {p1}, Lcom/digdroid/alman/dig/z3;->B(Lcom/digdroid/alman/dig/MainActivity;)I

    move-result p1

    invoke-virtual {v0, v1, p1, v1, v1}, Landroid/widget/ListView;->setPadding(IIII)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/e2;->e:Lcom/digdroid/alman/dig/MainActivity;

    invoke-static {p1}, Lcom/digdroid/alman/dig/z3;->B(Lcom/digdroid/alman/dig/MainActivity;)I

    move-result p1

    invoke-virtual {v0, v1, v1, v1, p1}, Landroid/widget/ListView;->setPadding(IIII)V

    :cond_1
    :goto_0
    return-void
.end method

.method s()V
    .locals 4

    iget-object v0, p0, Lcom/digdroid/alman/dig/e2;->g:Lcom/digdroid/alman/dig/MyListView;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/e2;->a:Lcom/digdroid/alman/dig/e2$s;

    invoke-interface {v0}, Lcom/digdroid/alman/dig/e2$s;->S()F

    move-result v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/e2;->a:Lcom/digdroid/alman/dig/e2$s;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Lcom/digdroid/alman/dig/e2$s;->g(Z)Landroid/graphics/Point;

    move-result-object v1

    iget v1, v1, Landroid/graphics/Point;->x:I

    int-to-float v1, v1

    mul-float v0, v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v3, -0x1

    invoke-direct {v1, v3, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-virtual {v1, v0, v2, v2, v2}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/e2;->g:Lcom/digdroid/alman/dig/MyListView;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    return-void
.end method

.method public t(Lcom/digdroid/alman/dig/e2$v;)V
    .locals 2

    iput-object p1, p0, Lcom/digdroid/alman/dig/e2;->b:Lcom/digdroid/alman/dig/e2$v;

    iget-object v0, p0, Lcom/digdroid/alman/dig/e2;->h:Landroid/widget/AbsListView;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/digdroid/alman/dig/e2$a;

    invoke-direct {v1, p0, p1}, Lcom/digdroid/alman/dig/e2$a;-><init>(Lcom/digdroid/alman/dig/e2;Lcom/digdroid/alman/dig/e2$v;)V

    invoke-virtual {v0, v1}, Landroid/widget/AbsListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/e2;->i:Lcom/digdroid/alman/dig/MyCarouselView;

    if-eqz v0, :cond_1

    new-instance v1, Lcom/digdroid/alman/dig/e2$b;

    invoke-direct {v1, p0, p1}, Lcom/digdroid/alman/dig/e2$b;-><init>(Lcom/digdroid/alman/dig/e2;Lcom/digdroid/alman/dig/e2$v;)V

    invoke-virtual {v0, v1}, Lc/c/a/a/c/a;->R1(Lc/c/a/a/c/a$g;)Lc/c/a/a/c/a;

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/digdroid/alman/dig/e2;->j:Lcom/digdroid/alman/dig/MyRecyclerView;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$g;

    move-result-object p1

    check-cast p1, Lcom/digdroid/alman/dig/h;

    if-eqz p1, :cond_2

    iget-object v0, p0, Lcom/digdroid/alman/dig/e2;->b:Lcom/digdroid/alman/dig/e2$v;

    invoke-virtual {p1, v0}, Lcom/digdroid/alman/dig/h;->x(Lcom/digdroid/alman/dig/e2$v;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public u(Lcom/digdroid/alman/dig/e2$w;)V
    .locals 2

    iput-object p1, p0, Lcom/digdroid/alman/dig/e2;->c:Lcom/digdroid/alman/dig/e2$w;

    iget-object v0, p0, Lcom/digdroid/alman/dig/e2;->h:Landroid/widget/AbsListView;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/digdroid/alman/dig/e2$c;

    invoke-direct {v1, p0, p1}, Lcom/digdroid/alman/dig/e2$c;-><init>(Lcom/digdroid/alman/dig/e2;Lcom/digdroid/alman/dig/e2$w;)V

    invoke-virtual {v0, v1}, Landroid/widget/AbsListView;->setOnItemLongClickListener(Landroid/widget/AdapterView$OnItemLongClickListener;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/e2;->i:Lcom/digdroid/alman/dig/MyCarouselView;

    if-eqz v0, :cond_1

    new-instance v1, Lcom/digdroid/alman/dig/e2$d;

    invoke-direct {v1, p0, p1}, Lcom/digdroid/alman/dig/e2$d;-><init>(Lcom/digdroid/alman/dig/e2;Lcom/digdroid/alman/dig/e2$w;)V

    invoke-virtual {v0, v1}, Lc/c/a/a/c/a;->S1(Lc/c/a/a/c/a$h;)Lc/c/a/a/c/a;

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/digdroid/alman/dig/e2;->j:Lcom/digdroid/alman/dig/MyRecyclerView;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$g;

    move-result-object v0

    check-cast v0, Lcom/digdroid/alman/dig/h;

    if-eqz v0, :cond_2

    iget-object v1, p0, Lcom/digdroid/alman/dig/e2;->p:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/b3;->t()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v0, p1}, Lcom/digdroid/alman/dig/h;->z(Lcom/digdroid/alman/dig/e2$w;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public v(Lcom/digdroid/alman/dig/e2$x;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/e2;->d:Lcom/digdroid/alman/dig/e2$x;

    return-void
.end method

.method public w(I)V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/digdroid/alman/dig/e2;->x(IZ)V

    return-void
.end method

.method public x(IZ)V
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/e2;->h:Landroid/widget/AbsListView;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/widget/AbsListView;->setSelection(I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/e2;->k:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_1

    new-instance v1, Lcom/digdroid/alman/dig/e2$p;

    invoke-direct {v1, p0, p1, p2}, Lcom/digdroid/alman/dig/e2$p;-><init>(Lcom/digdroid/alman/dig/e2;IZ)V

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->post(Ljava/lang/Runnable;)Z

    const/4 p2, 0x0

    iput-boolean p2, p0, Lcom/digdroid/alman/dig/e2;->u:Z

    iput-boolean p2, p0, Lcom/digdroid/alman/dig/e2;->v:Z

    :cond_1
    :goto_0
    iput p1, p0, Lcom/digdroid/alman/dig/e2;->x:I

    iget-object p2, p0, Lcom/digdroid/alman/dig/e2;->d:Lcom/digdroid/alman/dig/e2$x;

    if-eqz p2, :cond_2

    const/4 v0, 0x0

    invoke-interface {p2, v0, p1}, Lcom/digdroid/alman/dig/e2$x;->a(Landroid/view/View;I)V

    :cond_2
    return-void
.end method

.method public y(Ljava/lang/String;)V
    .locals 4

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, -0x1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "default"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x3

    goto :goto_0

    :sswitch_1
    const-string v0, "icons_bottom"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    goto :goto_0

    :sswitch_2
    const-string v0, "none"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v3, 0x1

    goto :goto_0

    :sswitch_3
    const-string v0, "icons_top"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v3, 0x0

    :goto_0
    packed-switch v3, :pswitch_data_0

    goto :goto_2

    :pswitch_0
    iput-boolean v2, p0, Lcom/digdroid/alman/dig/e2;->s:Z

    iput-boolean v1, p0, Lcom/digdroid/alman/dig/e2;->t:Z

    goto :goto_2

    :pswitch_1
    iput-boolean v2, p0, Lcom/digdroid/alman/dig/e2;->s:Z

    :goto_1
    iput-boolean v2, p0, Lcom/digdroid/alman/dig/e2;->t:Z

    goto :goto_2

    :pswitch_2
    iput-boolean v1, p0, Lcom/digdroid/alman/dig/e2;->s:Z

    goto :goto_1

    :goto_2
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x51cfd950 -> :sswitch_3
        0x33af38 -> :sswitch_2
        0x56b272f0 -> :sswitch_1
        0x5c13d641 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method public z(Z)V
    .locals 2

    if-eqz p1, :cond_0

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/e2;->A:Z

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/e2;->y:Z

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/e2;->z:Z

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/digdroid/alman/dig/e2;->B:J

    :cond_1
    iput-boolean p1, p0, Lcom/digdroid/alman/dig/e2;->A:Z

    return-void
.end method
