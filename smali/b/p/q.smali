.class public Lb/p/q;
.super Lb/p/m;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb/p/q$b;
    }
.end annotation


# instance fields
.field private L:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lb/p/m;",
            ">;"
        }
    .end annotation
.end field

.field private M:Z

.field N:I

.field O:Z

.field private P:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lb/p/m;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lb/p/q;->L:Ljava/util/ArrayList;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lb/p/q;->M:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lb/p/q;->O:Z

    iput v0, p0, Lb/p/q;->P:I

    return-void
.end method

.method private f0(Lb/p/m;)V
    .locals 1

    iget-object v0, p0, Lb/p/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput-object p0, p1, Lb/p/m;->v:Lb/p/q;

    return-void
.end method

.method private o0()V
    .locals 3

    new-instance v0, Lb/p/q$b;

    invoke-direct {v0, p0}, Lb/p/q$b;-><init>(Lb/p/q;)V

    iget-object v1, p0, Lb/p/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb/p/m;

    invoke-virtual {v2, v0}, Lb/p/m;->a(Lb/p/m$f;)Lb/p/m;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lb/p/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iput v0, p0, Lb/p/q;->N:I

    return-void
.end method


# virtual methods
.method public N(Landroid/view/View;)V
    .locals 3

    invoke-super {p0, p1}, Lb/p/m;->N(Landroid/view/View;)V

    iget-object v0, p0, Lb/p/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lb/p/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb/p/m;

    invoke-virtual {v2, p1}, Lb/p/m;->N(Landroid/view/View;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public bridge synthetic P(Lb/p/m$f;)Lb/p/m;
    .locals 0

    invoke-virtual {p0, p1}, Lb/p/q;->i0(Lb/p/m$f;)Lb/p/q;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic Q(Landroid/view/View;)Lb/p/m;
    .locals 0

    invoke-virtual {p0, p1}, Lb/p/q;->j0(Landroid/view/View;)Lb/p/q;

    move-result-object p1

    return-object p1
.end method

.method public R(Landroid/view/View;)V
    .locals 3

    invoke-super {p0, p1}, Lb/p/m;->R(Landroid/view/View;)V

    iget-object v0, p0, Lb/p/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lb/p/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb/p/m;

    invoke-virtual {v2, p1}, Lb/p/m;->R(Landroid/view/View;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected T()V
    .locals 4

    iget-object v0, p0, Lb/p/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lb/p/m;->a0()V

    invoke-virtual {p0}, Lb/p/m;->p()V

    return-void

    :cond_0
    invoke-direct {p0}, Lb/p/q;->o0()V

    iget-boolean v0, p0, Lb/p/q;->M:Z

    if-nez v0, :cond_2

    const/4 v0, 0x1

    :goto_0
    iget-object v1, p0, Lb/p/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lb/p/q;->L:Ljava/util/ArrayList;

    add-int/lit8 v2, v0, -0x1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb/p/m;

    iget-object v2, p0, Lb/p/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb/p/m;

    new-instance v3, Lb/p/q$a;

    invoke-direct {v3, p0, v2}, Lb/p/q$a;-><init>(Lb/p/q;Lb/p/m;)V

    invoke-virtual {v1, v3}, Lb/p/m;->a(Lb/p/m$f;)Lb/p/m;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lb/p/q;->L:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb/p/m;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lb/p/m;->T()V

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lb/p/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb/p/m;

    invoke-virtual {v1}, Lb/p/m;->T()V

    goto :goto_1

    :cond_3
    :goto_2
    return-void
.end method

.method public bridge synthetic U(J)Lb/p/m;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lb/p/q;->k0(J)Lb/p/q;

    move-result-object p1

    return-object p1
.end method

.method public V(Lb/p/m$e;)V
    .locals 3

    invoke-super {p0, p1}, Lb/p/m;->V(Lb/p/m$e;)V

    iget v0, p0, Lb/p/q;->P:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lb/p/q;->P:I

    iget-object v0, p0, Lb/p/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lb/p/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb/p/m;

    invoke-virtual {v2, p1}, Lb/p/m;->V(Lb/p/m$e;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public bridge synthetic W(Landroid/animation/TimeInterpolator;)Lb/p/m;
    .locals 0

    invoke-virtual {p0, p1}, Lb/p/q;->l0(Landroid/animation/TimeInterpolator;)Lb/p/q;

    move-result-object p1

    return-object p1
.end method

.method public X(Lb/p/g;)V
    .locals 2

    invoke-super {p0, p1}, Lb/p/m;->X(Lb/p/g;)V

    iget v0, p0, Lb/p/q;->P:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, Lb/p/q;->P:I

    iget-object v0, p0, Lb/p/q;->L:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lb/p/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lb/p/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb/p/m;

    invoke-virtual {v1, p1}, Lb/p/m;->X(Lb/p/g;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public Y(Lb/p/p;)V
    .locals 3

    invoke-super {p0, p1}, Lb/p/m;->Y(Lb/p/p;)V

    iget v0, p0, Lb/p/q;->P:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Lb/p/q;->P:I

    iget-object v0, p0, Lb/p/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lb/p/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb/p/m;

    invoke-virtual {v2, p1}, Lb/p/m;->Y(Lb/p/p;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public bridge synthetic Z(J)Lb/p/m;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lb/p/q;->n0(J)Lb/p/q;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic a(Lb/p/m$f;)Lb/p/m;
    .locals 0

    invoke-virtual {p0, p1}, Lb/p/q;->c0(Lb/p/m$f;)Lb/p/q;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Landroid/view/View;)Lb/p/m;
    .locals 0

    invoke-virtual {p0, p1}, Lb/p/q;->d0(Landroid/view/View;)Lb/p/q;

    move-result-object p1

    return-object p1
.end method

.method b0(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    invoke-super {p0, p1}, Lb/p/m;->b0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lb/p/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lb/p/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb/p/m;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "  "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lb/p/m;->b0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public c0(Lb/p/m$f;)Lb/p/q;
    .locals 0

    invoke-super {p0, p1}, Lb/p/m;->a(Lb/p/m$f;)Lb/p/m;

    move-result-object p1

    check-cast p1, Lb/p/q;

    return-object p1
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lb/p/q;->m()Lb/p/m;

    move-result-object v0

    return-object v0
.end method

.method public d0(Landroid/view/View;)Lb/p/q;
    .locals 2

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lb/p/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lb/p/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb/p/m;

    invoke-virtual {v1, p1}, Lb/p/m;->b(Landroid/view/View;)Lb/p/m;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, Lb/p/m;->b(Landroid/view/View;)Lb/p/m;

    move-result-object p1

    check-cast p1, Lb/p/q;

    return-object p1
.end method

.method public e0(Lb/p/m;)Lb/p/q;
    .locals 5

    invoke-direct {p0, p1}, Lb/p/q;->f0(Lb/p/m;)V

    iget-wide v0, p0, Lb/p/m;->g:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-ltz v4, :cond_0

    invoke-virtual {p1, v0, v1}, Lb/p/m;->U(J)Lb/p/m;

    :cond_0
    iget v0, p0, Lb/p/q;->P:I

    and-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lb/p/m;->s()Landroid/animation/TimeInterpolator;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/p/m;->W(Landroid/animation/TimeInterpolator;)Lb/p/m;

    :cond_1
    iget v0, p0, Lb/p/q;->P:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lb/p/m;->w()Lb/p/p;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/p/m;->Y(Lb/p/p;)V

    :cond_2
    iget v0, p0, Lb/p/q;->P:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lb/p/m;->v()Lb/p/g;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/p/m;->X(Lb/p/g;)V

    :cond_3
    iget v0, p0, Lb/p/q;->P:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lb/p/m;->r()Lb/p/m$e;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb/p/m;->V(Lb/p/m$e;)V

    :cond_4
    return-object p0
.end method

.method public g(Lb/p/s;)V
    .locals 3

    iget-object v0, p1, Lb/p/s;->b:Landroid/view/View;

    invoke-virtual {p0, v0}, Lb/p/m;->G(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lb/p/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb/p/m;

    iget-object v2, p1, Lb/p/s;->b:Landroid/view/View;

    invoke-virtual {v1, v2}, Lb/p/m;->G(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1, p1}, Lb/p/m;->g(Lb/p/s;)V

    iget-object v2, p1, Lb/p/s;->c:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public g0(I)Lb/p/m;
    .locals 1

    if-ltz p1, :cond_1

    iget-object v0, p0, Lb/p/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt p1, v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lb/p/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb/p/m;

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public h0()I
    .locals 1

    iget-object v0, p0, Lb/p/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method i(Lb/p/s;)V
    .locals 3

    invoke-super {p0, p1}, Lb/p/m;->i(Lb/p/s;)V

    iget-object v0, p0, Lb/p/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lb/p/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb/p/m;

    invoke-virtual {v2, p1}, Lb/p/m;->i(Lb/p/s;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public i0(Lb/p/m$f;)Lb/p/q;
    .locals 0

    invoke-super {p0, p1}, Lb/p/m;->P(Lb/p/m$f;)Lb/p/m;

    move-result-object p1

    check-cast p1, Lb/p/q;

    return-object p1
.end method

.method public j(Lb/p/s;)V
    .locals 3

    iget-object v0, p1, Lb/p/s;->b:Landroid/view/View;

    invoke-virtual {p0, v0}, Lb/p/m;->G(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lb/p/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb/p/m;

    iget-object v2, p1, Lb/p/s;->b:Landroid/view/View;

    invoke-virtual {v1, v2}, Lb/p/m;->G(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1, p1}, Lb/p/m;->j(Lb/p/s;)V

    iget-object v2, p1, Lb/p/s;->c:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public j0(Landroid/view/View;)Lb/p/q;
    .locals 2

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lb/p/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lb/p/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb/p/m;

    invoke-virtual {v1, p1}, Lb/p/m;->Q(Landroid/view/View;)Lb/p/m;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, Lb/p/m;->Q(Landroid/view/View;)Lb/p/m;

    move-result-object p1

    check-cast p1, Lb/p/q;

    return-object p1
.end method

.method public k0(J)Lb/p/q;
    .locals 5

    invoke-super {p0, p1, p2}, Lb/p/m;->U(J)Lb/p/m;

    iget-wide v0, p0, Lb/p/m;->g:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-ltz v4, :cond_0

    iget-object v0, p0, Lb/p/q;->L:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lb/p/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb/p/m;

    invoke-virtual {v2, p1, p2}, Lb/p/m;->U(J)Lb/p/m;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public l0(Landroid/animation/TimeInterpolator;)Lb/p/q;
    .locals 3

    iget v0, p0, Lb/p/q;->P:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, Lb/p/q;->P:I

    iget-object v0, p0, Lb/p/q;->L:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lb/p/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb/p/m;

    invoke-virtual {v2, p1}, Lb/p/m;->W(Landroid/animation/TimeInterpolator;)Lb/p/m;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, Lb/p/m;->W(Landroid/animation/TimeInterpolator;)Lb/p/m;

    move-result-object p1

    check-cast p1, Lb/p/q;

    return-object p1
.end method

.method public m()Lb/p/m;
    .locals 4

    invoke-super {p0}, Lb/p/m;->m()Lb/p/m;

    move-result-object v0

    check-cast v0, Lb/p/q;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lb/p/q;->L:Ljava/util/ArrayList;

    iget-object v1, p0, Lb/p/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    iget-object v3, p0, Lb/p/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lb/p/m;

    invoke-virtual {v3}, Lb/p/m;->m()Lb/p/m;

    move-result-object v3

    invoke-direct {v0, v3}, Lb/p/q;->f0(Lb/p/m;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public m0(I)Lb/p/q;
    .locals 3

    const/4 v0, 0x1

    if-eqz p1, :cond_1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lb/p/q;->M:Z

    goto :goto_0

    :cond_0
    new-instance v0, Landroid/util/AndroidRuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid parameter for TransitionSet ordering: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iput-boolean v0, p0, Lb/p/q;->M:Z

    :goto_0
    return-object p0
.end method

.method public n0(J)Lb/p/q;
    .locals 0

    invoke-super {p0, p1, p2}, Lb/p/m;->Z(J)Lb/p/m;

    move-result-object p1

    check-cast p1, Lb/p/q;

    return-object p1
.end method

.method protected o(Landroid/view/ViewGroup;Lb/p/t;Lb/p/t;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            "Lb/p/t;",
            "Lb/p/t;",
            "Ljava/util/ArrayList<",
            "Lb/p/s;",
            ">;",
            "Ljava/util/ArrayList<",
            "Lb/p/s;",
            ">;)V"
        }
    .end annotation

    move-object v0, p0

    invoke-virtual {p0}, Lb/p/m;->y()J

    move-result-wide v1

    iget-object v3, v0, Lb/p/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_3

    iget-object v5, v0, Lb/p/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lb/p/m;

    const-wide/16 v7, 0x0

    cmp-long v5, v1, v7

    if-lez v5, :cond_2

    iget-boolean v5, v0, Lb/p/q;->M:Z

    if-nez v5, :cond_0

    if-nez v4, :cond_2

    :cond_0
    invoke-virtual {v6}, Lb/p/m;->y()J

    move-result-wide v9

    cmp-long v5, v9, v7

    if-lez v5, :cond_1

    add-long/2addr v9, v1

    invoke-virtual {v6, v9, v10}, Lb/p/m;->Z(J)Lb/p/m;

    goto :goto_1

    :cond_1
    invoke-virtual {v6, v1, v2}, Lb/p/m;->Z(J)Lb/p/m;

    :cond_2
    :goto_1
    move-object v7, p1

    move-object v8, p2

    move-object v9, p3

    move-object/from16 v10, p4

    move-object/from16 v11, p5

    invoke-virtual/range {v6 .. v11}, Lb/p/m;->o(Landroid/view/ViewGroup;Lb/p/t;Lb/p/t;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method
