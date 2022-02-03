.class Lc/c/a/a/c/a$a;
.super Landroidx/recyclerview/widget/RecyclerView$t;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/c/a/a/c/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lc/c/a/a/c/a;


# direct methods
.method constructor <init>(Lc/c/a/a/c/a;)V
    .locals 0

    iput-object p1, p0, Lc/c/a/a/c/a$a;->a:Lc/c/a/a/c/a;

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$t;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 8

    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$t;->a(Landroidx/recyclerview/widget/RecyclerView;I)V

    const/4 v0, 0x2

    const/4 v1, 0x1

    if-eqz p2, :cond_1

    if-eq p2, v1, :cond_0

    goto/16 :goto_2

    :cond_0
    iget-object v2, p0, Lc/c/a/a/c/a$a;->a:Lc/c/a/a/c/a;

    invoke-static {v2}, Lc/c/a/a/c/a;->A1(Lc/c/a/a/c/a;)Lcom/gtomato/android/ui/manager/CarouselLayoutManager;

    move-result-object v3

    invoke-virtual {v3}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->e2()F

    move-result v3

    invoke-static {v2, v3}, Lc/c/a/a/c/a;->D1(Lc/c/a/a/c/a;F)F

    goto/16 :goto_2

    :cond_1
    iget-object v2, p0, Lc/c/a/a/c/a$a;->a:Lc/c/a/a/c/a;

    invoke-static {v2}, Lc/c/a/a/c/a;->A1(Lc/c/a/a/c/a;)Lcom/gtomato/android/ui/manager/CarouselLayoutManager;

    move-result-object v2

    invoke-virtual {v2}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->e2()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v3

    iget-object v4, p0, Lc/c/a/a/c/a$a;->a:Lc/c/a/a/c/a;

    invoke-static {v4}, Lc/c/a/a/c/a;->B1(Lc/c/a/a/c/a;)Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_4

    iget-object v4, p0, Lc/c/a/a/c/a$a;->a:Lc/c/a/a/c/a;

    invoke-static {v4}, Lc/c/a/a/c/a;->A1(Lc/c/a/a/c/a;)Lcom/gtomato/android/ui/manager/CarouselLayoutManager;

    move-result-object v4

    invoke-virtual {v4}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->c2()F

    move-result v4

    const/4 v6, 0x0

    cmpl-float v4, v4, v6

    if-eqz v4, :cond_4

    int-to-float v4, v3

    sub-float v4, v2, v4

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v4

    const v7, 0x3dcccccd

    cmpl-float v4, v4, v7

    if-lez v4, :cond_3

    new-array v3, v0, [Ljava/lang/Object;

    iget-object v4, p0, Lc/c/a/a/c/a$a;->a:Lc/c/a/a/c/a;

    invoke-static {v4}, Lc/c/a/a/c/a;->C1(Lc/c/a/a/c/a;)F

    move-result v4

    sub-float v4, v2, v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    aput-object v4, v3, v5

    iget-object v4, p0, Lc/c/a/a/c/a$a;->a:Lc/c/a/a/c/a;

    invoke-static {v4}, Lc/c/a/a/c/a;->A1(Lc/c/a/a/c/a;)Lcom/gtomato/android/ui/manager/CarouselLayoutManager;

    move-result-object v4

    invoke-virtual {v4}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->j2()Lc/c/a/a/c/a$k;

    move-result-object v4

    iget-object v7, p0, Lc/c/a/a/c/a$a;->a:Lc/c/a/a/c/a;

    invoke-static {v7}, Lc/c/a/a/c/a;->C1(Lc/c/a/a/c/a;)F

    move-result v7

    sub-float v7, v2, v7

    invoke-interface {v4, v7}, Lc/c/a/a/c/a$k;->a(F)F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    aput-object v4, v3, v1

    const-string v4, "> scroll idle %f %f"

    invoke-static {v4, v3}, Lc/c/a/a/c/a;->E1(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v3, p0, Lc/c/a/a/c/a$a;->a:Lc/c/a/a/c/a;

    invoke-static {v3}, Lc/c/a/a/c/a;->A1(Lc/c/a/a/c/a;)Lcom/gtomato/android/ui/manager/CarouselLayoutManager;

    move-result-object v3

    invoke-virtual {v3}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->j2()Lc/c/a/a/c/a$k;

    move-result-object v3

    iget-object v4, p0, Lc/c/a/a/c/a$a;->a:Lc/c/a/a/c/a;

    invoke-static {v4}, Lc/c/a/a/c/a;->C1(Lc/c/a/a/c/a;)F

    move-result v4

    sub-float v4, v2, v4

    invoke-interface {v3, v4}, Lc/c/a/a/c/a$k;->a(F)F

    move-result v3

    cmpl-float v3, v3, v6

    if-lez v3, :cond_2

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    goto :goto_0

    :cond_2
    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    move-result-wide v2

    :goto_0
    double-to-int v3, v2

    :cond_3
    iget-object v2, p0, Lc/c/a/a/c/a$a;->a:Lc/c/a/a/c/a;

    invoke-virtual {v2, v3}, Lc/c/a/a/c/a;->s1(I)V

    goto :goto_1

    :cond_4
    iget-object v2, p0, Lc/c/a/a/c/a$a;->a:Lc/c/a/a/c/a;

    invoke-static {v2}, Lc/c/a/a/c/a;->F1(Lc/c/a/a/c/a;)Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v2, p0, Lc/c/a/a/c/a$a;->a:Lc/c/a/a/c/a;

    invoke-static {v2, v3}, Lc/c/a/a/c/a;->H1(Lc/c/a/a/c/a;I)V

    :cond_5
    :goto_1
    iget-object v2, p0, Lc/c/a/a/c/a$a;->a:Lc/c/a/a/c/a;

    invoke-static {v2, v5}, Lc/c/a/a/c/a;->G1(Lc/c/a/a/c/a;Z)Z

    :goto_2
    iget-object v2, p0, Lc/c/a/a/c/a$a;->a:Lc/c/a/a/c/a;

    invoke-static {v2}, Lc/c/a/a/c/a;->I1(Lc/c/a/a/c/a;)Lc/c/a/a/c/a$j;

    move-result-object v2

    if-eqz v2, :cond_9

    iget-object v2, p0, Lc/c/a/a/c/a$a;->a:Lc/c/a/a/c/a;

    invoke-static {v2}, Lc/c/a/a/c/a;->I1(Lc/c/a/a/c/a;)Lc/c/a/a/c/a$j;

    move-result-object v2

    check-cast p1, Lc/c/a/a/c/a;

    invoke-virtual {v2, p1, p2}, Lc/c/a/a/c/a$j;->d(Lc/c/a/a/c/a;I)V

    if-eqz p2, :cond_8

    if-eq p2, v1, :cond_7

    if-eq p2, v0, :cond_6

    goto :goto_3

    :cond_6
    iget-object p2, p0, Lc/c/a/a/c/a$a;->a:Lc/c/a/a/c/a;

    invoke-static {p2}, Lc/c/a/a/c/a;->I1(Lc/c/a/a/c/a;)Lc/c/a/a/c/a$j;

    move-result-object p2

    invoke-virtual {p2, p1}, Lc/c/a/a/c/a$j;->a(Lc/c/a/a/c/a;)V

    goto :goto_3

    :cond_7
    iget-object p2, p0, Lc/c/a/a/c/a$a;->a:Lc/c/a/a/c/a;

    invoke-static {p2}, Lc/c/a/a/c/a;->I1(Lc/c/a/a/c/a;)Lc/c/a/a/c/a$j;

    move-result-object p2

    invoke-virtual {p2, p1}, Lc/c/a/a/c/a$j;->b(Lc/c/a/a/c/a;)V

    goto :goto_3

    :cond_8
    iget-object p2, p0, Lc/c/a/a/c/a$a;->a:Lc/c/a/a/c/a;

    invoke-static {p2}, Lc/c/a/a/c/a;->I1(Lc/c/a/a/c/a;)Lc/c/a/a/c/a$j;

    move-result-object p2

    invoke-virtual {p2, p1}, Lc/c/a/a/c/a$j;->c(Lc/c/a/a/c/a;)V

    :cond_9
    :goto_3
    return-void
.end method

.method public b(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 3

    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$t;->b(Landroidx/recyclerview/widget/RecyclerView;II)V

    iget-object v0, p0, Lc/c/a/a/c/a$a;->a:Lc/c/a/a/c/a;

    invoke-static {v0}, Lc/c/a/a/c/a;->I1(Lc/c/a/a/c/a;)Lc/c/a/a/c/a$j;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc/c/a/a/c/a$a;->a:Lc/c/a/a/c/a;

    invoke-static {v0}, Lc/c/a/a/c/a;->I1(Lc/c/a/a/c/a;)Lc/c/a/a/c/a$j;

    move-result-object v0

    check-cast p1, Lc/c/a/a/c/a;

    invoke-virtual {v0, p1, p2, p3}, Lc/c/a/a/c/a$j;->e(Lc/c/a/a/c/a;II)V

    iget-object p2, p0, Lc/c/a/a/c/a$a;->a:Lc/c/a/a/c/a;

    invoke-static {p2}, Lc/c/a/a/c/a;->I1(Lc/c/a/a/c/a;)Lc/c/a/a/c/a$j;

    move-result-object p2

    iget-object p3, p0, Lc/c/a/a/c/a$a;->a:Lc/c/a/a/c/a;

    invoke-static {p3}, Lc/c/a/a/c/a;->A1(Lc/c/a/a/c/a;)Lcom/gtomato/android/ui/manager/CarouselLayoutManager;

    move-result-object p3

    invoke-virtual {p3}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->e2()F

    move-result p3

    float-to-double v0, p3

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-int p3, v0

    iget-object v0, p0, Lc/c/a/a/c/a$a;->a:Lc/c/a/a/c/a;

    invoke-static {v0}, Lc/c/a/a/c/a;->A1(Lc/c/a/a/c/a;)Lcom/gtomato/android/ui/manager/CarouselLayoutManager;

    move-result-object v0

    iget-object v1, p0, Lc/c/a/a/c/a$a;->a:Lc/c/a/a/c/a;

    invoke-static {v1}, Lc/c/a/a/c/a;->A1(Lc/c/a/a/c/a;)Lcom/gtomato/android/ui/manager/CarouselLayoutManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->e2()F

    move-result v1

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->floor(D)D

    move-result-wide v1

    double-to-int v1, v1

    invoke-virtual {v0, v1}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->B2(I)I

    move-result v0

    iget-object v1, p0, Lc/c/a/a/c/a$a;->a:Lc/c/a/a/c/a;

    invoke-static {v1}, Lc/c/a/a/c/a;->A1(Lc/c/a/a/c/a;)Lcom/gtomato/android/ui/manager/CarouselLayoutManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->c2()F

    move-result v1

    invoke-virtual {p2, p1, p3, v0, v1}, Lc/c/a/a/c/a$j;->f(Lc/c/a/a/c/a;IIF)V

    :cond_0
    return-void
.end method
