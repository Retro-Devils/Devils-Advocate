.class public abstract Lcom/digdroid/alman/dig/e0;
.super Lcom/digdroid/alman/dig/v1;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/p1$a;
.implements Lcom/digdroid/alman/dig/MyViewPager$a;


# instance fields
.field T:Z

.field U:Z

.field V:Z

.field W:Lcom/digdroid/alman/dig/l2;

.field X:Lcom/digdroid/alman/dig/MyViewPager;

.field Y:Lcom/digdroid/alman/dig/o2;

.field Z:Landroid/view/ViewStub;

.field a0:Landroid/view/ViewStub;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/digdroid/alman/dig/v1;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/e0;->T:Z

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/e0;->U:Z

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/e0;->V:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/digdroid/alman/dig/e0;->Y:Lcom/digdroid/alman/dig/o2;

    iput-object v0, p0, Lcom/digdroid/alman/dig/e0;->Z:Landroid/view/ViewStub;

    iput-object v0, p0, Lcom/digdroid/alman/dig/e0;->a0:Landroid/view/ViewStub;

    return-void
.end method


# virtual methods
.method public A(J)V
    .locals 2

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "game_id"

    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    const/16 p1, 0x16

    invoke-virtual {p0, p1, v0}, Lcom/digdroid/alman/dig/e0;->j1(ILandroid/os/Bundle;)V

    return-void
.end method

.method public B()Landroid/view/Menu;
    .locals 1

    const v0, 0x7f0902ca

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/navigation/NavigationView;

    invoke-virtual {v0}, Lcom/google/android/material/navigation/NavigationView;->getMenu()Landroid/view/Menu;

    move-result-object v0

    return-object v0
.end method

.method public C()V
    .locals 2

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const/16 v1, 0x17

    invoke-virtual {p0, v1, v0}, Lcom/digdroid/alman/dig/e0;->j1(ILandroid/os/Bundle;)V

    return-void
.end method

.method public D(JLjava/lang/String;Lcom/digdroid/alman/dig/h0;)V
    .locals 2

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "gameid"

    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    const-string p1, "title"

    invoke-virtual {v0, p1, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p4, v0}, Lcom/digdroid/alman/dig/h0;->d(Landroid/os/Bundle;)V

    const/4 p1, 0x7

    invoke-virtual {p0, p1, v0}, Lcom/digdroid/alman/dig/e0;->j1(ILandroid/os/Bundle;)V

    return-void
.end method

.method public E(Lcom/digdroid/alman/dig/t3;)V
    .locals 0

    invoke-static {p1}, Lcom/digdroid/alman/dig/q3;->p(Lcom/digdroid/alman/dig/t3;)V

    return-void
.end method

.method public F()V
    .locals 2

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const/16 v1, 0xc

    invoke-virtual {p0, v1, v0}, Lcom/digdroid/alman/dig/e0;->j1(ILandroid/os/Bundle;)V

    return-void
.end method

.method public H(Z)V
    .locals 1

    iput-boolean p1, p0, Lcom/digdroid/alman/dig/e0;->U:Z

    if-nez p1, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/e0;->a0:Landroid/view/ViewStub;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/e0;->a0:Landroid/view/ViewStub;

    if-nez v0, :cond_1

    const v0, 0x7f0903cd

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewStub;

    iput-object v0, p0, Lcom/digdroid/alman/dig/e0;->a0:Landroid/view/ViewStub;

    invoke-virtual {v0}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    move-result-object v0

    goto :goto_0

    :cond_1
    const v0, 0x7f090339

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    :goto_0
    if-eqz p1, :cond_2

    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    const/16 p1, 0x8

    :goto_1
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    iget-boolean p1, p0, Lcom/digdroid/alman/dig/e0;->U:Z

    if-eqz p1, :cond_3

    new-instance p1, Lcom/digdroid/alman/dig/e0$c;

    invoke-direct {p1, p0}, Lcom/digdroid/alman/dig/e0$c;-><init>(Lcom/digdroid/alman/dig/e0;)V

    invoke-virtual {v0, p1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    :cond_3
    return-void
.end method

.method public K(I)V
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/e0;->W:Lcom/digdroid/alman/dig/l2;

    iget-object v1, p0, Lcom/digdroid/alman/dig/e0;->X:Lcom/digdroid/alman/dig/MyViewPager;

    invoke-virtual {v0, v1, p1}, Lcom/digdroid/alman/dig/l2;->x(Lb/t/a/b;I)V

    return-void
.end method

.method public L()V
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object v1, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/c3;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "grid"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const v1, 0x7f110022

    invoke-virtual {p0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "title"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x2

    invoke-virtual {p0, v1, v0}, Lcom/digdroid/alman/dig/e0;->j1(ILandroid/os/Bundle;)V

    return-void
.end method

.method public M(JLjava/lang/String;)V
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object v1, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/c3;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "grid"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v1, "collection"

    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    const-string p1, "title"

    invoke-virtual {v0, p1, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const/16 p1, 0x12

    invoke-virtual {p0, p1, v0}, Lcom/digdroid/alman/dig/e0;->j1(ILandroid/os/Bundle;)V

    return-void
.end method

.method public N()Z
    .locals 1

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/e0;->k1()Lcom/digdroid/alman/dig/p1;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/p1;->d3()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public P()Z
    .locals 1

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/e0;->T:Z

    return v0
.end method

.method public R()V
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/e0;->W:Lcom/digdroid/alman/dig/l2;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/j2;->q()V

    return-void
.end method

.method public T(Lcom/digdroid/alman/dig/h0;)V
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object v1, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/c3;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "grid"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const v1, 0x7f110022

    invoke-virtual {p0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "title"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/digdroid/alman/dig/h0;->d(Landroid/os/Bundle;)V

    const/4 p1, 0x2

    invoke-virtual {p0, p1, v0}, Lcom/digdroid/alman/dig/e0;->j1(ILandroid/os/Bundle;)V

    return-void
.end method

.method public U(JLjava/lang/String;)V
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object v1, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/c3;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "grid"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v1, "genre"

    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    const-string p1, "title"

    invoke-virtual {v0, p1, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x6

    invoke-virtual {p0, p1, v0}, Lcom/digdroid/alman/dig/e0;->j1(ILandroid/os/Bundle;)V

    return-void
.end method

.method public V(Ljava/lang/String;)V
    .locals 3

    const-string v0, "grid"

    :try_start_0
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    iget-object v2, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    invoke-virtual {v2}, Lcom/digdroid/alman/dig/c3;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v0, "system"

    invoke-virtual {v1, v0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "title"

    iget-object v2, p0, Lcom/digdroid/alman/dig/t;->y:Lcom/digdroid/alman/dig/h3;

    invoke-virtual {v2, p1}, Lcom/digdroid/alman/dig/h3;->s(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, v0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x4

    invoke-virtual {p0, p1, v1}, Lcom/digdroid/alman/dig/e0;->j1(ILandroid/os/Bundle;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public Z()V
    .locals 2

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const/16 v1, 0x10

    invoke-virtual {p0, v1, v0}, Lcom/digdroid/alman/dig/e0;->j1(ILandroid/os/Bundle;)V

    return-void
.end method

.method public a0(J)V
    .locals 2

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "gameid"

    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    const/16 p1, 0x9

    invoke-virtual {p0, p1, v0}, Lcom/digdroid/alman/dig/e0;->j1(ILandroid/os/Bundle;)V

    return-void
.end method

.method public b0()V
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object v1, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/c3;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "grid"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const v1, 0x7f1101f5

    invoke-virtual {p0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "title"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v1, 0x8

    invoke-virtual {p0, v1, v0}, Lcom/digdroid/alman/dig/e0;->j1(ILandroid/os/Bundle;)V

    return-void
.end method

.method public d0()V
    .locals 3

    const v0, 0x7f110071

    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-wide/16 v1, -0x1

    invoke-virtual {p0, v1, v2, v0}, Lcom/digdroid/alman/dig/e0;->e0(JLjava/lang/String;)V

    return-void
.end method

.method public e0(JLjava/lang/String;)V
    .locals 2

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "id"

    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    const-string p1, "title"

    invoke-virtual {v0, p1, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const/16 p1, 0x11

    invoke-virtual {p0, p1, v0}, Lcom/digdroid/alman/dig/e0;->j1(ILandroid/os/Bundle;)V

    return-void
.end method

.method public g0()Z
    .locals 1

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/e0;->U:Z

    return v0
.end method

.method public h0()V
    .locals 2

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Lcom/digdroid/alman/dig/e0;->j1(ILandroid/os/Bundle;)V

    return-void
.end method

.method public i()V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/e0;->X:Lcom/digdroid/alman/dig/MyViewPager;

    invoke-virtual {v0}, Lb/t/a/b;->getCurrentItem()I

    move-result v0

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iget-object v2, p0, Lcom/digdroid/alman/dig/e0;->W:Lcom/digdroid/alman/dig/l2;

    invoke-virtual {v2}, Lcom/digdroid/alman/dig/l2;->c()I

    move-result v2

    if-ge v0, v2, :cond_0

    iget-object v2, p0, Lcom/digdroid/alman/dig/e0;->X:Lcom/digdroid/alman/dig/MyViewPager;

    invoke-virtual {v2, v0, v1}, Lb/t/a/b;->K(IZ)V

    :cond_0
    return-void
.end method

.method public i0(Ljava/lang/String;Ljava/lang/String;II)V
    .locals 6

    iget-object v0, p0, Lcom/digdroid/alman/dig/e0;->W:Lcom/digdroid/alman/dig/l2;

    iget-object v1, p0, Lcom/digdroid/alman/dig/e0;->X:Lcom/digdroid/alman/dig/MyViewPager;

    const/4 v2, 0x0

    move-object v3, p2

    move v4, p3

    move v5, p4

    invoke-virtual/range {v0 .. v5}, Lcom/digdroid/alman/dig/l2;->y(Lb/t/a/b;Lcom/digdroid/alman/dig/h0;Ljava/lang/String;II)V

    return-void
.end method

.method public j()V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/e0;->X:Lcom/digdroid/alman/dig/MyViewPager;

    invoke-virtual {v0}, Lb/t/a/b;->getCurrentItem()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v1, p0, Lcom/digdroid/alman/dig/e0;->X:Lcom/digdroid/alman/dig/MyViewPager;

    const/4 v2, 0x1

    sub-int/2addr v0, v2

    invoke-virtual {v1, v0, v2}, Lb/t/a/b;->K(IZ)V

    :cond_0
    return-void
.end method

.method j1(ILandroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/e0;->W:Lcom/digdroid/alman/dig/l2;

    iget-object v1, p0, Lcom/digdroid/alman/dig/e0;->X:Lcom/digdroid/alman/dig/MyViewPager;

    invoke-virtual {v0, v1, p1, p2}, Lcom/digdroid/alman/dig/l2;->t(Lb/t/a/b;ILandroid/os/Bundle;)V

    return-void
.end method

.method public k0(Z)V
    .locals 1

    if-nez p1, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/e0;->Z:Landroid/view/ViewStub;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/e0;->Z:Landroid/view/ViewStub;

    if-nez v0, :cond_1

    const v0, 0x7f0903cc

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewStub;

    iput-object v0, p0, Lcom/digdroid/alman/dig/e0;->Z:Landroid/view/ViewStub;

    invoke-virtual {v0}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    move-result-object v0

    goto :goto_0

    :cond_1
    const v0, 0x7f090387

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    :goto_0
    if-eqz p1, :cond_2

    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    const/16 p1, 0x8

    :goto_1
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method k1()Lcom/digdroid/alman/dig/p1;
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/e0;->X:Lcom/digdroid/alman/dig/MyViewPager;

    invoke-virtual {v0}, Lb/t/a/b;->getCurrentItem()I

    move-result v0

    if-ltz v0, :cond_0

    iget-object v1, p0, Lcom/digdroid/alman/dig/e0;->W:Lcom/digdroid/alman/dig/l2;

    invoke-virtual {v1, v0}, Lcom/digdroid/alman/dig/j2;->o(I)Landroidx/fragment/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/digdroid/alman/dig/p1;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public abstract l1()Landroidx/appcompat/widget/Toolbar;
.end method

.method public m()Z
    .locals 2

    const v0, 0x7f090171

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/drawerlayout/widget/DrawerLayout;

    const v1, 0x800003

    invoke-virtual {v0, v1}, Landroidx/drawerlayout/widget/DrawerLayout;->A(I)Z

    move-result v0

    return v0
.end method

.method public m0()J
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/e0;->X:Lcom/digdroid/alman/dig/MyViewPager;

    invoke-virtual {v0}, Lb/t/a/b;->getCurrentItem()I

    move-result v0

    const/4 v1, 0x1

    if-lt v0, v1, :cond_0

    iget-object v2, p0, Lcom/digdroid/alman/dig/e0;->W:Lcom/digdroid/alman/dig/l2;

    sub-int/2addr v0, v1

    invoke-virtual {v2, v0}, Lcom/digdroid/alman/dig/j2;->o(I)Landroidx/fragment/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/digdroid/alman/dig/p1;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/p1;->u2()J

    move-result-wide v0

    return-wide v0

    :cond_0
    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public m1()Z
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/e0;->W:Lcom/digdroid/alman/dig/l2;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/l2;->v()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public n1()V
    .locals 2

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const/16 v1, 0x15

    invoke-virtual {p0, v1, v0}, Lcom/digdroid/alman/dig/e0;->j1(ILandroid/os/Bundle;)V

    return-void
.end method

.method public o0(J)V
    .locals 2

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "gameid"

    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    const/16 p1, 0x14

    invoke-virtual {p0, p1, v0}, Lcom/digdroid/alman/dig/e0;->j1(ILandroid/os/Bundle;)V

    return-void
.end method

.method o1()V
    .locals 2

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const/4 v1, 0x1

    invoke-virtual {p0, v1, v0}, Lcom/digdroid/alman/dig/e0;->j1(ILandroid/os/Bundle;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/v1;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/digdroid/alman/dig/c3;->k(Landroid/content/Context;)Lcom/digdroid/alman/dig/c3;

    move-result-object v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/e0;->B()Landroid/view/Menu;

    move-result-object v0

    const v1, 0x7f0902be

    invoke-interface {v0, v1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/c3;->t()Z

    move-result v1

    if-eqz v1, :cond_0

    const v1, 0x7f1100e1

    goto :goto_0

    :cond_0
    const v1, 0x7f110142

    :goto_0
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setTitle(I)Landroid/view/MenuItem;

    new-instance v0, Lcom/digdroid/alman/dig/l2;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/l2;-><init>(Lcom/digdroid/alman/dig/e0;)V

    iput-object v0, p0, Lcom/digdroid/alman/dig/e0;->W:Lcom/digdroid/alman/dig/l2;

    if-eqz p1, :cond_1

    :try_start_0
    const-string v1, "state"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    invoke-virtual {p0}, Landroid/app/Activity;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/digdroid/alman/dig/l2;->i(Landroid/os/Parcelable;Ljava/lang/ClassLoader;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    new-instance p1, Lcom/digdroid/alman/dig/l2;

    invoke-direct {p1, p0}, Lcom/digdroid/alman/dig/l2;-><init>(Lcom/digdroid/alman/dig/e0;)V

    iput-object p1, p0, Lcom/digdroid/alman/dig/e0;->W:Lcom/digdroid/alman/dig/l2;

    :cond_1
    :goto_1
    const p1, 0x7f0902fd

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/digdroid/alman/dig/MyViewPager;

    iput-object p1, p0, Lcom/digdroid/alman/dig/e0;->X:Lcom/digdroid/alman/dig/MyViewPager;

    iget-object v0, p0, Lcom/digdroid/alman/dig/e0;->W:Lcom/digdroid/alman/dig/l2;

    invoke-virtual {p1, v0}, Lb/t/a/b;->setAdapter(Lb/t/a/a;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/e0;->X:Lcom/digdroid/alman/dig/MyViewPager;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lb/t/a/b;->setOffscreenPageLimit(I)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/e0;->X:Lcom/digdroid/alman/dig/MyViewPager;

    invoke-virtual {p1, p0}, Lcom/digdroid/alman/dig/MyViewPager;->P(Lcom/digdroid/alman/dig/MyViewPager$a;)V

    new-instance p1, Lcom/digdroid/alman/dig/e0$a;

    invoke-direct {p1, p0}, Lcom/digdroid/alman/dig/e0$a;-><init>(Lcom/digdroid/alman/dig/e0;)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/e0;->X:Lcom/digdroid/alman/dig/MyViewPager;

    invoke-virtual {v0, p1}, Lb/t/a/b;->b(Lb/t/a/b$j;)V

    return-void
.end method

.method protected onPause()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/d;->onPause()V

    invoke-static {}, Lcom/digdroid/alman/dig/o2;->m()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/digdroid/alman/dig/e0;->Y:Lcom/digdroid/alman/dig/o2;

    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/e0;->W:Lcom/digdroid/alman/dig/l2;

    iget-object v1, p0, Lcom/digdroid/alman/dig/e0;->X:Lcom/digdroid/alman/dig/MyViewPager;

    invoke-virtual {v1}, Lb/t/a/b;->getCurrentItem()I

    move-result v1

    iget-object v2, p0, Lcom/digdroid/alman/dig/e0;->X:Lcom/digdroid/alman/dig/MyViewPager;

    invoke-virtual {v2}, Lb/t/a/b;->getOffscreenPageLimit()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/j2;->s(II)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/e0;->W:Lcom/digdroid/alman/dig/l2;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/l2;->j()Landroid/os/Parcelable;

    move-result-object v0

    const-string v1, "state"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/z3;->onSaveInstanceState(Landroid/os/Bundle;)V

    return-void
.end method

.method public p()V
    .locals 4

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object v1, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    const-string v2, "systems_list_type"

    const-string v3, "grid"

    invoke-virtual {v1, v2, v3}, Lcom/digdroid/alman/dig/c3;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v0, v3, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const/4 v1, 0x3

    invoke-virtual {p0, v1, v0}, Lcom/digdroid/alman/dig/e0;->j1(ILandroid/os/Bundle;)V

    return-void
.end method

.method public p1(Ljava/lang/String;)V
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "publisher"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/c3;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "grid"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v1, "title"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const/16 p1, 0xe

    invoke-virtual {p0, p1, v0}, Lcom/digdroid/alman/dig/e0;->j1(ILandroid/os/Bundle;)V

    return-void
.end method

.method public q(Ljava/lang/String;Lcom/digdroid/alman/dig/h0;I)V
    .locals 6

    iget-object v0, p0, Lcom/digdroid/alman/dig/e0;->W:Lcom/digdroid/alman/dig/l2;

    iget-object v1, p0, Lcom/digdroid/alman/dig/e0;->X:Lcom/digdroid/alman/dig/MyViewPager;

    const/4 v3, 0x0

    const/4 v4, -0x1

    move-object v2, p2

    move v5, p3

    invoke-virtual/range {v0 .. v5}, Lcom/digdroid/alman/dig/l2;->y(Lb/t/a/b;Lcom/digdroid/alman/dig/h0;Ljava/lang/String;II)V

    return-void
.end method

.method public q0()V
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/e0;->W:Lcom/digdroid/alman/dig/l2;

    iget-object v1, p0, Lcom/digdroid/alman/dig/e0;->X:Lcom/digdroid/alman/dig/MyViewPager;

    invoke-virtual {v1}, Lb/t/a/b;->getCurrentItem()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/l2;->r(I)V

    return-void
.end method

.method q1()V
    .locals 2

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const/16 v1, 0xa

    invoke-virtual {p0, v1, v0}, Lcom/digdroid/alman/dig/e0;->j1(ILandroid/os/Bundle;)V

    return-void
.end method

.method public r()V
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/e0;->W:Lcom/digdroid/alman/dig/l2;

    iget-object v1, p0, Lcom/digdroid/alman/dig/e0;->X:Lcom/digdroid/alman/dig/MyViewPager;

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/l2;->w(Lb/t/a/b;)V

    return-void
.end method

.method public r1(Landroid/content/Intent;)V
    .locals 4

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/e0;->l1()Landroidx/appcompat/widget/Toolbar;

    move-result-object v0

    const-string v1, "name"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v2, "system"

    invoke-virtual {p1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "title"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/c3;->b()Ljava/lang/String;

    move-result-object p1

    const-string v1, "grid"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const/4 p1, 0x4

    invoke-virtual {p0, p1, v0}, Lcom/digdroid/alman/dig/e0;->j1(ILandroid/os/Bundle;)V

    return-void
.end method

.method public s1(J)V
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "released"

    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/c3;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "grid"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    const/4 p1, 0x1

    invoke-virtual {v1, p1}, Ljava/util/Calendar;->get(I)I

    move-result p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "title"

    invoke-virtual {v0, p2, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const/16 p1, 0xf

    invoke-virtual {p0, p1, v0}, Lcom/digdroid/alman/dig/e0;->j1(ILandroid/os/Bundle;)V

    return-void
.end method

.method public t1(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "system"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const/16 p1, 0x13

    invoke-virtual {p0, p1, v0}, Lcom/digdroid/alman/dig/e0;->j1(ILandroid/os/Bundle;)V

    return-void
.end method

.method public u()V
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object v1, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/c3;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "grid"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const v1, 0x7f1100ea

    invoke-virtual {p0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "title"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x5

    invoke-virtual {p0, v1, v0}, Lcom/digdroid/alman/dig/e0;->j1(ILandroid/os/Bundle;)V

    return-void
.end method

.method public u0()V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/e0;->X:Lcom/digdroid/alman/dig/MyViewPager;

    invoke-virtual {v0}, Lb/t/a/b;->getCurrentItem()I

    move-result v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/e0;->W:Lcom/digdroid/alman/dig/l2;

    invoke-virtual {v1, v0}, Lcom/digdroid/alman/dig/l2;->r(I)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/e0;->W:Lcom/digdroid/alman/dig/l2;

    invoke-virtual {v1, v0}, Lcom/digdroid/alman/dig/l2;->u(I)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/e0;->X:Lcom/digdroid/alman/dig/MyViewPager;

    add-int/lit8 v0, v0, -0x1

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lb/t/a/b;->K(IZ)V

    return-void
.end method

.method u1()V
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/e0;->W:Lcom/digdroid/alman/dig/l2;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/l2;->r(I)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/e0;->W:Lcom/digdroid/alman/dig/l2;

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/l2;->u(I)V

    return-void
.end method

.method public v0()Lcom/digdroid/alman/dig/o2;
    .locals 4

    const v0, 0x7f0903d0

    const v1, 0x7f09026d

    const v2, 0x7f090458

    const v3, 0x7f09045d

    invoke-static {p0, v0, v1, v2, v3}, Lcom/digdroid/alman/dig/o2;->o(Landroid/app/Activity;IIII)Lcom/digdroid/alman/dig/o2;

    move-result-object v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/e0;->Y:Lcom/digdroid/alman/dig/o2;

    return-object v0
.end method

.method protected v1()V
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/e0;->X:Lcom/digdroid/alman/dig/MyViewPager;

    new-instance v1, Lcom/digdroid/alman/dig/e0$b;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/e0$b;-><init>(Lcom/digdroid/alman/dig/e0;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public w(Z)V
    .locals 1

    invoke-virtual {p0}, Landroidx/appcompat/app/c;->L0()Landroidx/appcompat/app/a;

    move-result-object v0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/c3;->t()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v0, p1}, Landroidx/appcompat/app/a;->s(Z)V

    return-void
.end method

.method public x(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "theme"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const/16 p1, 0xb

    invoke-virtual {p0, p1, v0}, Lcom/digdroid/alman/dig/e0;->j1(ILandroid/os/Bundle;)V

    return-void
.end method

.method public z(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "url"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const/16 p1, 0xd

    invoke-virtual {p0, p1, v0}, Lcom/digdroid/alman/dig/e0;->j1(ILandroid/os/Bundle;)V

    return-void
.end method
