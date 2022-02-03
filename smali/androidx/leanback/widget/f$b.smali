.class Landroidx/leanback/widget/f$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroidx/leanback/widget/e$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/leanback/widget/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/leanback/widget/f;


# direct methods
.method constructor <init>(Landroidx/leanback/widget/f;)V
    .locals 0

    iput-object p1, p0, Landroidx/leanback/widget/f$b;->a:Landroidx/leanback/widget/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)I
    .locals 2

    iget-object v0, p0, Landroidx/leanback/widget/f$b;->a:Landroidx/leanback/widget/f;

    iget v1, v0, Landroidx/leanback/widget/f;->z:I

    sub-int/2addr p1, v1

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->F(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/leanback/widget/f;->S2(Landroid/view/View;)I

    move-result p1

    return p1
.end method

.method public b(I)I
    .locals 3

    iget-object v0, p0, Landroidx/leanback/widget/f$b;->a:Landroidx/leanback/widget/f;

    iget v1, v0, Landroidx/leanback/widget/f;->z:I

    sub-int/2addr p1, v1

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->F(I)Landroid/view/View;

    move-result-object p1

    iget-object v0, p0, Landroidx/leanback/widget/f$b;->a:Landroidx/leanback/widget/f;

    iget v1, v0, Landroidx/leanback/widget/f;->E:I

    const/high16 v2, 0x40000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    invoke-virtual {v0, p1}, Landroidx/leanback/widget/f;->Q2(Landroid/view/View;)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Landroidx/leanback/widget/f;->R2(Landroid/view/View;)I

    move-result p1

    :goto_0
    return p1
.end method

.method public c(Ljava/lang/Object;IIII)V
    .locals 7

    check-cast p1, Landroid/view/View;

    const/high16 v0, -0x80000000

    if-eq p5, v0, :cond_0

    const v0, 0x7fffffff

    if-ne p5, v0, :cond_2

    :cond_0
    iget-object p5, p0, Landroidx/leanback/widget/f$b;->a:Landroidx/leanback/widget/f;

    iget-object p5, p5, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    invoke-virtual {p5}, Landroidx/leanback/widget/e;->u()Z

    move-result p5

    if-nez p5, :cond_1

    iget-object p5, p0, Landroidx/leanback/widget/f$b;->a:Landroidx/leanback/widget/f;

    iget-object p5, p5, Landroidx/leanback/widget/f;->d0:Landroidx/leanback/widget/a0;

    invoke-virtual {p5}, Landroidx/leanback/widget/a0;->a()Landroidx/leanback/widget/a0$a;

    move-result-object p5

    invoke-virtual {p5}, Landroidx/leanback/widget/a0$a;->g()I

    move-result p5

    goto :goto_0

    :cond_1
    iget-object p5, p0, Landroidx/leanback/widget/f$b;->a:Landroidx/leanback/widget/f;

    iget-object p5, p5, Landroidx/leanback/widget/f;->d0:Landroidx/leanback/widget/a0;

    invoke-virtual {p5}, Landroidx/leanback/widget/a0;->a()Landroidx/leanback/widget/a0$a;

    move-result-object p5

    invoke-virtual {p5}, Landroidx/leanback/widget/a0$a;->i()I

    move-result p5

    iget-object v0, p0, Landroidx/leanback/widget/f$b;->a:Landroidx/leanback/widget/f;

    iget-object v0, v0, Landroidx/leanback/widget/f;->d0:Landroidx/leanback/widget/a0;

    invoke-virtual {v0}, Landroidx/leanback/widget/a0;->a()Landroidx/leanback/widget/a0$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/leanback/widget/a0$a;->f()I

    move-result v0

    sub-int/2addr p5, v0

    :cond_2
    :goto_0
    iget-object v0, p0, Landroidx/leanback/widget/f$b;->a:Landroidx/leanback/widget/f;

    iget-object v0, v0, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    invoke-virtual {v0}, Landroidx/leanback/widget/e;->u()Z

    move-result v0

    const/4 v6, 0x1

    xor-int/2addr v0, v6

    if-eqz v0, :cond_3

    add-int/2addr p3, p5

    move v4, p3

    move v3, p5

    goto :goto_1

    :cond_3
    sub-int p3, p5, p3

    move v3, p3

    move v4, p5

    :goto_1
    iget-object p3, p0, Landroidx/leanback/widget/f$b;->a:Landroidx/leanback/widget/f;

    invoke-virtual {p3, p4}, Landroidx/leanback/widget/f;->B2(I)I

    move-result p3

    iget-object p5, p0, Landroidx/leanback/widget/f$b;->a:Landroidx/leanback/widget/f;

    iget-object p5, p5, Landroidx/leanback/widget/f;->d0:Landroidx/leanback/widget/a0;

    invoke-virtual {p5}, Landroidx/leanback/widget/a0;->c()Landroidx/leanback/widget/a0$a;

    move-result-object p5

    invoke-virtual {p5}, Landroidx/leanback/widget/a0$a;->g()I

    move-result p5

    add-int/2addr p3, p5

    iget-object p5, p0, Landroidx/leanback/widget/f$b;->a:Landroidx/leanback/widget/f;

    iget v0, p5, Landroidx/leanback/widget/f;->P:I

    sub-int v5, p3, v0

    iget-object p3, p5, Landroidx/leanback/widget/f;->i0:Landroidx/leanback/widget/z;

    invoke-virtual {p3, p1, p2}, Landroidx/leanback/widget/z;->g(Landroid/view/View;I)V

    iget-object v0, p0, Landroidx/leanback/widget/f$b;->a:Landroidx/leanback/widget/f;

    move v1, p4

    move-object v2, p1

    invoke-virtual/range {v0 .. v5}, Landroidx/leanback/widget/f;->h3(ILandroid/view/View;III)V

    iget-object p3, p0, Landroidx/leanback/widget/f$b;->a:Landroidx/leanback/widget/f;

    iget-object p3, p3, Landroidx/leanback/widget/f;->y:Landroidx/recyclerview/widget/RecyclerView$a0;

    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView$a0;->h()Z

    move-result p3

    if-nez p3, :cond_4

    iget-object p3, p0, Landroidx/leanback/widget/f$b;->a:Landroidx/leanback/widget/f;

    invoke-virtual {p3}, Landroidx/leanback/widget/f;->t4()V

    :cond_4
    iget-object p3, p0, Landroidx/leanback/widget/f$b;->a:Landroidx/leanback/widget/f;

    iget p4, p3, Landroidx/leanback/widget/f;->E:I

    and-int/lit8 p4, p4, 0x3

    if-eq p4, v6, :cond_5

    iget-object p3, p3, Landroidx/leanback/widget/f;->L:Landroidx/leanback/widget/f$g;

    if-eqz p3, :cond_5

    invoke-virtual {p3}, Landroidx/leanback/widget/f$g;->E()V

    :cond_5
    iget-object p3, p0, Landroidx/leanback/widget/f$b;->a:Landroidx/leanback/widget/f;

    iget-object p4, p3, Landroidx/leanback/widget/f;->H:Landroidx/leanback/widget/m;

    if-eqz p4, :cond_7

    iget-object p3, p3, Landroidx/leanback/widget/f;->v:Landroidx/leanback/widget/a;

    invoke-virtual {p3, p1}, Landroidx/recyclerview/widget/RecyclerView;->f0(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$d0;

    move-result-object p3

    iget-object p4, p0, Landroidx/leanback/widget/f$b;->a:Landroidx/leanback/widget/f;

    iget-object v0, p4, Landroidx/leanback/widget/f;->H:Landroidx/leanback/widget/m;

    iget-object v1, p4, Landroidx/leanback/widget/f;->v:Landroidx/leanback/widget/a;

    if-nez p3, :cond_6

    const-wide/16 p3, -0x1

    goto :goto_2

    :cond_6
    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView$d0;->k()J

    move-result-wide p3

    :goto_2
    move-wide v4, p3

    move-object v2, p1

    move v3, p2

    invoke-interface/range {v0 .. v5}, Landroidx/leanback/widget/m;->a(Landroid/view/ViewGroup;Landroid/view/View;IJ)V

    :cond_7
    return-void
.end method

.method public d()I
    .locals 1

    iget-object v0, p0, Landroidx/leanback/widget/f$b;->a:Landroidx/leanback/widget/f;

    iget v0, v0, Landroidx/leanback/widget/f;->z:I

    return v0
.end method

.method public e(IZ[Ljava/lang/Object;Z)I
    .locals 5

    iget-object v0, p0, Landroidx/leanback/widget/f$b;->a:Landroidx/leanback/widget/f;

    iget v1, v0, Landroidx/leanback/widget/f;->z:I

    sub-int v1, p1, v1

    invoke-virtual {v0, v1}, Landroidx/leanback/widget/f;->P2(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroidx/leanback/widget/f$e;

    iget-object v2, p0, Landroidx/leanback/widget/f$b;->a:Landroidx/leanback/widget/f;

    iget-object v2, v2, Landroidx/leanback/widget/f;->v:Landroidx/leanback/widget/a;

    invoke-virtual {v2, v0}, Landroidx/recyclerview/widget/RecyclerView;->f0(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$d0;

    move-result-object v2

    iget-object v3, p0, Landroidx/leanback/widget/f$b;->a:Landroidx/leanback/widget/f;

    const-class v4, Landroidx/leanback/widget/j;

    invoke-virtual {v3, v2, v4}, Landroidx/leanback/widget/f;->p2(Landroidx/recyclerview/widget/RecyclerView$d0;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/leanback/widget/j;

    invoke-virtual {v1, v2}, Landroidx/leanback/widget/f$e;->v(Landroidx/leanback/widget/j;)V

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$p;->d()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_8

    if-eqz p4, :cond_1

    if-eqz p2, :cond_0

    iget-object p2, p0, Landroidx/leanback/widget/f$b;->a:Landroidx/leanback/widget/f;

    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/RecyclerView$o;->b(Landroid/view/View;)V

    goto :goto_0

    :cond_0
    iget-object p2, p0, Landroidx/leanback/widget/f$b;->a:Landroidx/leanback/widget/f;

    invoke-virtual {p2, v0, v2}, Landroidx/recyclerview/widget/RecyclerView$o;->c(Landroid/view/View;I)V

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_2

    iget-object p2, p0, Landroidx/leanback/widget/f$b;->a:Landroidx/leanback/widget/f;

    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/RecyclerView$o;->d(Landroid/view/View;)V

    goto :goto_0

    :cond_2
    iget-object p2, p0, Landroidx/leanback/widget/f$b;->a:Landroidx/leanback/widget/f;

    invoke-virtual {p2, v0, v2}, Landroidx/recyclerview/widget/RecyclerView$o;->e(Landroid/view/View;I)V

    :goto_0
    iget-object p2, p0, Landroidx/leanback/widget/f$b;->a:Landroidx/leanback/widget/f;

    iget p2, p2, Landroidx/leanback/widget/f;->O:I

    const/4 p4, -0x1

    if-eq p2, p4, :cond_3

    invoke-virtual {v0, p2}, Landroid/view/View;->setVisibility(I)V

    :cond_3
    iget-object p2, p0, Landroidx/leanback/widget/f$b;->a:Landroidx/leanback/widget/f;

    iget-object p2, p2, Landroidx/leanback/widget/f;->L:Landroidx/leanback/widget/f$g;

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Landroidx/leanback/widget/f$g;->F()V

    :cond_4
    iget-object p2, p0, Landroidx/leanback/widget/f$b;->a:Landroidx/leanback/widget/f;

    invoke-virtual {v0}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object p4

    invoke-virtual {p2, v0, p4}, Landroidx/leanback/widget/f;->H2(Landroid/view/View;Landroid/view/View;)I

    move-result p2

    iget-object p4, p0, Landroidx/leanback/widget/f$b;->a:Landroidx/leanback/widget/f;

    iget v1, p4, Landroidx/leanback/widget/f;->E:I

    and-int/lit8 v3, v1, 0x3

    const/4 v4, 0x1

    if-eq v3, v4, :cond_5

    iget v1, p4, Landroidx/leanback/widget/f;->I:I

    if-ne p1, v1, :cond_7

    iget p1, p4, Landroidx/leanback/widget/f;->J:I

    if-ne p2, p1, :cond_7

    iget-object p1, p4, Landroidx/leanback/widget/f;->L:Landroidx/leanback/widget/f$g;

    if-nez p1, :cond_7

    :goto_1
    invoke-virtual {p4}, Landroidx/leanback/widget/f;->Y1()V

    goto :goto_2

    :cond_5
    and-int/lit8 v3, v1, 0x4

    if-nez v3, :cond_7

    and-int/lit8 v3, v1, 0x10

    if-nez v3, :cond_6

    iget v3, p4, Landroidx/leanback/widget/f;->I:I

    if-ne p1, v3, :cond_6

    iget v3, p4, Landroidx/leanback/widget/f;->J:I

    if-ne p2, v3, :cond_6

    goto :goto_1

    :cond_6
    and-int/lit8 v1, v1, 0x10

    if-eqz v1, :cond_7

    iget p4, p4, Landroidx/leanback/widget/f;->I:I

    if-lt p1, p4, :cond_7

    invoke-virtual {v0}, Landroid/view/View;->hasFocusable()Z

    move-result p4

    if-eqz p4, :cond_7

    iget-object p4, p0, Landroidx/leanback/widget/f$b;->a:Landroidx/leanback/widget/f;

    iput p1, p4, Landroidx/leanback/widget/f;->I:I

    iput p2, p4, Landroidx/leanback/widget/f;->J:I

    iget p1, p4, Landroidx/leanback/widget/f;->E:I

    and-int/lit8 p1, p1, -0x11

    iput p1, p4, Landroidx/leanback/widget/f;->E:I

    goto :goto_1

    :cond_7
    :goto_2
    iget-object p1, p0, Landroidx/leanback/widget/f$b;->a:Landroidx/leanback/widget/f;

    invoke-virtual {p1, v0}, Landroidx/leanback/widget/f;->k3(Landroid/view/View;)V

    :cond_8
    aput-object v0, p3, v2

    iget-object p1, p0, Landroidx/leanback/widget/f$b;->a:Landroidx/leanback/widget/f;

    iget p2, p1, Landroidx/leanback/widget/f;->w:I

    if-nez p2, :cond_9

    invoke-virtual {p1, v0}, Landroidx/leanback/widget/f;->n2(Landroid/view/View;)I

    move-result p1

    goto :goto_3

    :cond_9
    invoke-virtual {p1, v0}, Landroidx/leanback/widget/f;->m2(Landroid/view/View;)I

    move-result p1

    :goto_3
    return p1
.end method

.method public getCount()I
    .locals 2

    iget-object v0, p0, Landroidx/leanback/widget/f$b;->a:Landroidx/leanback/widget/f;

    iget-object v0, v0, Landroidx/leanback/widget/f;->y:Landroidx/recyclerview/widget/RecyclerView$a0;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$a0;->c()I

    move-result v0

    iget-object v1, p0, Landroidx/leanback/widget/f$b;->a:Landroidx/leanback/widget/f;

    iget v1, v1, Landroidx/leanback/widget/f;->z:I

    add-int/2addr v0, v1

    return v0
.end method

.method public removeItem(I)V
    .locals 3

    iget-object v0, p0, Landroidx/leanback/widget/f$b;->a:Landroidx/leanback/widget/f;

    iget v1, v0, Landroidx/leanback/widget/f;->z:I

    sub-int/2addr p1, v1

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->F(I)Landroid/view/View;

    move-result-object p1

    iget-object v0, p0, Landroidx/leanback/widget/f$b;->a:Landroidx/leanback/widget/f;

    iget v1, v0, Landroidx/leanback/widget/f;->E:I

    and-int/lit8 v1, v1, 0x3

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    iget-object v1, v0, Landroidx/leanback/widget/f;->D:Landroidx/recyclerview/widget/RecyclerView$v;

    invoke-virtual {v0, p1, v1}, Landroidx/recyclerview/widget/RecyclerView$o;->y(Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$v;)V

    goto :goto_0

    :cond_0
    iget-object v1, v0, Landroidx/leanback/widget/f;->D:Landroidx/recyclerview/widget/RecyclerView$v;

    invoke-virtual {v0, p1, v1}, Landroidx/recyclerview/widget/RecyclerView$o;->t1(Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$v;)V

    :goto_0
    return-void
.end method
