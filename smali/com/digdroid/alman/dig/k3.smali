.class public Lcom/digdroid/alman/dig/k3;
.super Lcom/digdroid/alman/dig/r1;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/g1$a;


# instance fields
.field s0:I

.field t0:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/digdroid/alman/dig/r1;-><init>()V

    return-void
.end method

.method static synthetic w3(Lcom/digdroid/alman/dig/k3;I)Z
    .locals 0

    invoke-direct {p0, p1}, Lcom/digdroid/alman/dig/k3;->x3(I)Z

    move-result p0

    return p0
.end method

.method private x3(I)Z
    .locals 5

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->B2()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    if-ltz p1, :cond_1

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/digdroid/alman/dig/r1;->q0:Lcom/digdroid/alman/dig/d2;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/d2;->c()Landroid/database/Cursor;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Landroid/database/Cursor;->isClosed()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-interface {v0, p1}, Landroid/database/Cursor;->moveToPosition(I)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x3

    invoke-interface {v0, p1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    iget-object v2, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/s3;

    iget-object v3, p0, Lcom/digdroid/alman/dig/p1;->b0:Lcom/digdroid/alman/dig/g3;

    invoke-virtual {v3, p1}, Lcom/digdroid/alman/dig/g3;->y(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/digdroid/alman/dig/p1;->b0:Lcom/digdroid/alman/dig/g3;

    invoke-virtual {v4, p1}, Lcom/digdroid/alman/dig/g3;->x(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v2, v3, p1}, Lcom/digdroid/alman/dig/p1$a;->G(Lcom/digdroid/alman/dig/s3;Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public G()[I
    .locals 1

    const/4 v0, 0x4

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    return-object v0

    nop

    :array_0
    .array-data 4
        0x7f0903d5
        0x7f0903d5
        0x7f0903d7
        0x7f0903d6
    .end array-data
.end method

.method public H2(Landroid/view/MenuItem;)Z
    .locals 5

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const-string v1, "systems_sort"

    const/4 v2, 0x0

    const/4 v3, 0x1

    sparse-switch v0, :sswitch_data_0

    packed-switch v0, :pswitch_data_0

    packed-switch v0, :pswitch_data_1

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/r1;->H2(Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    :pswitch_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    const-string v0, "has_theme_icon"

    invoke-virtual {p1, v0, v2}, Lcom/digdroid/alman/dig/b3;->c(Ljava/lang/String;Z)Z

    move-result v1

    xor-int/2addr v1, v3

    invoke-virtual {p1, v0, v1}, Lcom/digdroid/alman/dig/b3;->B(Ljava/lang/String;Z)V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->N2()V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->invalidateOptionsMenu()V

    return v3

    :pswitch_1
    iget p1, p0, Lcom/digdroid/alman/dig/k3;->s0:I

    const-string v0, "handheld"

    invoke-virtual {p0, v0, p1}, Lcom/digdroid/alman/dig/k3;->y3(Ljava/lang/String;I)V

    return v3

    :pswitch_2
    iget-object p1, p0, Lcom/digdroid/alman/dig/k3;->t0:Ljava/lang/String;

    const/16 v0, 0x8

    invoke-virtual {p0, p1, v0}, Lcom/digdroid/alman/dig/k3;->y3(Ljava/lang/String;I)V

    return v3

    :pswitch_3
    iget-object p1, p0, Lcom/digdroid/alman/dig/k3;->t0:Ljava/lang/String;

    const/4 v0, 0x7

    invoke-virtual {p0, p1, v0}, Lcom/digdroid/alman/dig/k3;->y3(Ljava/lang/String;I)V

    return v3

    :pswitch_4
    iget-object p1, p0, Lcom/digdroid/alman/dig/k3;->t0:Ljava/lang/String;

    const/4 v0, 0x6

    invoke-virtual {p0, p1, v0}, Lcom/digdroid/alman/dig/k3;->y3(Ljava/lang/String;I)V

    return v3

    :pswitch_5
    iget-object p1, p0, Lcom/digdroid/alman/dig/k3;->t0:Ljava/lang/String;

    const/4 v0, 0x5

    invoke-virtual {p0, p1, v0}, Lcom/digdroid/alman/dig/k3;->y3(Ljava/lang/String;I)V

    return v3

    :pswitch_6
    iget-object p1, p0, Lcom/digdroid/alman/dig/k3;->t0:Ljava/lang/String;

    const/4 v0, 0x4

    invoke-virtual {p0, p1, v0}, Lcom/digdroid/alman/dig/k3;->y3(Ljava/lang/String;I)V

    return v3

    :pswitch_7
    iget-object p1, p0, Lcom/digdroid/alman/dig/k3;->t0:Ljava/lang/String;

    const/4 v0, 0x3

    invoke-virtual {p0, p1, v0}, Lcom/digdroid/alman/dig/k3;->y3(Ljava/lang/String;I)V

    return v3

    :pswitch_8
    iget-object p1, p0, Lcom/digdroid/alman/dig/k3;->t0:Ljava/lang/String;

    const/4 v0, 0x2

    invoke-virtual {p0, p1, v0}, Lcom/digdroid/alman/dig/k3;->y3(Ljava/lang/String;I)V

    return v3

    :pswitch_9
    iget-object p1, p0, Lcom/digdroid/alman/dig/k3;->t0:Ljava/lang/String;

    invoke-virtual {p0, p1, v2}, Lcom/digdroid/alman/dig/k3;->y3(Ljava/lang/String;I)V

    return v3

    :sswitch_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    const-string v0, "name"

    invoke-virtual {p1, v1, v0}, Lcom/digdroid/alman/dig/b3;->G(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->m3()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/k3;->t0:Ljava/lang/String;

    iget v4, p0, Lcom/digdroid/alman/dig/k3;->s0:I

    invoke-interface {p1, v0, v1, v4, v2}, Lcom/digdroid/alman/dig/p1$a;->i0(Ljava/lang/String;Ljava/lang/String;II)V

    return v3

    :sswitch_1
    iget-object p1, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    const-string v0, "date"

    invoke-virtual {p1, v1, v0}, Lcom/digdroid/alman/dig/b3;->G(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->m3()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/k3;->t0:Ljava/lang/String;

    iget v4, p0, Lcom/digdroid/alman/dig/k3;->s0:I

    invoke-interface {p1, v0, v1, v4, v2}, Lcom/digdroid/alman/dig/p1$a;->i0(Ljava/lang/String;Ljava/lang/String;II)V

    return v3

    :sswitch_2
    iget-object p1, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/b3;->p()Z

    move-result v0

    xor-int/2addr v0, v3

    invoke-virtual {p1, v0}, Lcom/digdroid/alman/dig/b3;->W(Z)V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->N2()V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->invalidateOptionsMenu()V

    iget-object p1, p0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    invoke-interface {p1}, Lcom/digdroid/alman/dig/p1$a;->R()V

    invoke-virtual {p0, v2}, Lcom/digdroid/alman/dig/r1;->G2(Z)V

    return v3

    :sswitch_3
    iget p1, p0, Lcom/digdroid/alman/dig/k3;->s0:I

    const-string v0, "console"

    invoke-virtual {p0, v0, p1}, Lcom/digdroid/alman/dig/k3;->y3(Ljava/lang/String;I)V

    return v3

    :sswitch_4
    iget p1, p0, Lcom/digdroid/alman/dig/k3;->s0:I

    const-string v0, "computer"

    invoke-virtual {p0, v0, p1}, Lcom/digdroid/alman/dig/k3;->y3(Ljava/lang/String;I)V

    return v3

    :sswitch_5
    iget p1, p0, Lcom/digdroid/alman/dig/k3;->s0:I

    const-string v0, "arcade"

    invoke-virtual {p0, v0, p1}, Lcom/digdroid/alman/dig/k3;->y3(Ljava/lang/String;I)V

    return v3

    :sswitch_6
    iget p1, p0, Lcom/digdroid/alman/dig/k3;->s0:I

    const-string v0, "all"

    invoke-virtual {p0, v0, p1}, Lcom/digdroid/alman/dig/k3;->y3(Ljava/lang/String;I)V

    return v3

    :sswitch_data_0
    .sparse-switch
        0x7f09005e -> :sswitch_6
        0x7f090071 -> :sswitch_5
        0x7f090100 -> :sswitch_4
        0x7f090107 -> :sswitch_3
        0x7f0901fc -> :sswitch_2
        0x7f09039a -> :sswitch_1
        0x7f09039e -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x7f0901b5
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x7f0901f3
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public P2()V
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/e2;->f()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/digdroid/alman/dig/k3;->x3(I)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-super {p0}, Lcom/digdroid/alman/dig/r1;->P2()V

    :cond_1
    return-void
.end method

.method public Q()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    const-string v1, "systems_list_type"

    const-string v2, "grid"

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/b3;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public R(Landroid/database/Cursor;)I
    .locals 1

    const/4 v0, 0x2

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result p1

    return p1
.end method

.method public W0(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/r1;->W0(Landroid/os/Bundle;)V

    const-string v0, "generation"

    const-string v1, "type"

    if-nez p1, :cond_2

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->h0()Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v1, "all"

    :goto_0
    iput-object v1, p0, Lcom/digdroid/alman/dig/k3;->t0:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    goto :goto_2

    :cond_2
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/digdroid/alman/dig/k3;->t0:Ljava/lang/String;

    :goto_1
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p1

    :goto_2
    iput p1, p0, Lcom/digdroid/alman/dig/k3;->s0:I

    return-void
.end method

.method public a(Landroid/database/Cursor;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public a1(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    invoke-super {p0, p1, p2, p3}, Lcom/digdroid/alman/dig/r1;->a1(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    iget-object p2, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/s3;

    iget-object p2, p2, Lcom/digdroid/alman/dig/s3;->u:Ljava/lang/String;

    const-string p3, ""

    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    iget-object p2, p0, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    new-instance p3, Lcom/digdroid/alman/dig/k3$a;

    invoke-direct {p3, p0}, Lcom/digdroid/alman/dig/k3$a;-><init>(Lcom/digdroid/alman/dig/k3;)V

    invoke-virtual {p2, p3}, Lcom/digdroid/alman/dig/e2;->v(Lcom/digdroid/alman/dig/e2$x;)V

    :cond_0
    return-object p1
.end method

.method public b()Lcom/digdroid/alman/dig/m;
    .locals 5

    new-instance v0, Lcom/digdroid/alman/dig/m;

    iget-object v1, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/s3;

    iget v2, v1, Lcom/digdroid/alman/dig/s3;->h:I

    iget v1, v1, Lcom/digdroid/alman/dig/s3;->i:I

    const/4 v3, 0x1

    const/4 v4, 0x6

    invoke-direct {v0, v3, v2, v1, v4}, Lcom/digdroid/alman/dig/m;-><init>(ZIII)V

    return-object v0
.end method

.method f3(Landroid/view/View;Ljava/lang/Object;)V
    .locals 3

    check-cast p2, Landroid/database/Cursor;

    iget-object p1, p0, Lcom/digdroid/alman/dig/p1;->l0:Landroid/content/Context;

    invoke-static {p1}, Lcom/digdroid/alman/dig/t1;->p(Landroid/content/Context;)Lcom/digdroid/alman/dig/t1;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v0

    const/4 v1, 0x3

    invoke-interface {p2, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x5

    invoke-interface {p2, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p2

    new-instance v2, Lcom/digdroid/alman/dig/k3$b;

    invoke-direct {v2, p0}, Lcom/digdroid/alman/dig/k3$b;-><init>(Lcom/digdroid/alman/dig/k3;)V

    invoke-virtual {p1, v0, v1, p2, v2}, Lcom/digdroid/alman/dig/t1;->q(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Lcom/digdroid/alman/dig/t1$l;)V

    return-void
.end method

.method h3(Landroid/database/Cursor;)Lcom/digdroid/alman/dig/d2;
    .locals 10

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/digdroid/alman/dig/MainActivity;

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_1

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    const-string v1, "systems_sort"

    const-string v3, "name"

    invoke-virtual {v0, v1, v3}, Lcom/digdroid/alman/dig/b3;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/k3;->Q()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    const/4 v1, -0x1

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v3

    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v3, "coverflow"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x5

    goto :goto_0

    :sswitch_1
    const-string v3, "wheel"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x4

    goto :goto_0

    :sswitch_2
    const-string v3, "title"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v1, 0x3

    goto :goto_0

    :sswitch_3
    const-string v3, "carousel"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    const/4 v1, 0x2

    goto :goto_0

    :sswitch_4
    const-string v3, "linear"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    const/4 v1, 0x1

    goto :goto_0

    :sswitch_5
    const-string v3, "vertical"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_0

    :cond_6
    const/4 v1, 0x0

    :goto_0
    new-instance v0, Lcom/digdroid/alman/dig/d2;

    packed-switch v1, :pswitch_data_0

    new-instance v8, Lcom/digdroid/alman/dig/h3;

    iget-object v3, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/s3;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->k3()F

    move-result v5

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->w()Z

    move-result v9

    move-object v1, v8

    move-object v4, p1

    move-object v6, v7

    move v7, v9

    invoke-direct/range {v1 .. v7}, Lcom/digdroid/alman/dig/h3;-><init>(Lcom/digdroid/alman/dig/MainActivity;Lcom/digdroid/alman/dig/s3;Landroid/database/Cursor;FLjava/lang/String;Z)V

    invoke-direct {v0, v8}, Lcom/digdroid/alman/dig/d2;-><init>(Lcom/digdroid/alman/dig/q1;)V

    return-object v0

    :pswitch_0
    new-instance v9, Lcom/digdroid/alman/dig/j3;

    iget-object v3, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/s3;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->W()F

    move-result v5

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->k3()F

    move-result v6

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->w()Z

    move-result v8

    move-object v1, v9

    move-object v4, p1

    invoke-direct/range {v1 .. v8}, Lcom/digdroid/alman/dig/j3;-><init>(Lcom/digdroid/alman/dig/MainActivity;Lcom/digdroid/alman/dig/s3;Landroid/database/Cursor;FFLjava/lang/String;Z)V

    invoke-direct {v0, v9}, Lcom/digdroid/alman/dig/d2;-><init>(Lcom/digdroid/alman/dig/h;)V

    return-object v0

    :pswitch_1
    new-instance v9, Lcom/digdroid/alman/dig/n3;

    iget-object v3, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/s3;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->x()F

    move-result v5

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->k3()F

    move-result v6

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->w()Z

    move-result v8

    move-object v1, v9

    move-object v4, p1

    invoke-direct/range {v1 .. v8}, Lcom/digdroid/alman/dig/n3;-><init>(Lcom/digdroid/alman/dig/MainActivity;Lcom/digdroid/alman/dig/s3;Landroid/database/Cursor;FFLjava/lang/String;Z)V

    invoke-direct {v0, v9}, Lcom/digdroid/alman/dig/d2;-><init>(Lcom/digdroid/alman/dig/h;)V

    return-object v0

    :pswitch_2
    new-instance v7, Lcom/digdroid/alman/dig/g1;

    iget-object v3, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/s3;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->k3()F

    move-result v5

    move-object v1, v7

    move-object v4, p1

    move-object v6, p0

    invoke-direct/range {v1 .. v6}, Lcom/digdroid/alman/dig/g1;-><init>(Landroid/app/Activity;Lcom/digdroid/alman/dig/s3;Landroid/database/Cursor;FLcom/digdroid/alman/dig/g1$a;)V

    invoke-direct {v0, v7}, Lcom/digdroid/alman/dig/d2;-><init>(Lcom/digdroid/alman/dig/q1;)V

    return-object v0

    :pswitch_3
    new-instance v9, Lcom/digdroid/alman/dig/i3;

    iget-object v3, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/s3;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->z()F

    move-result v5

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->k3()F

    move-result v6

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->w()Z

    move-result v8

    move-object v1, v9

    move-object v4, p1

    invoke-direct/range {v1 .. v8}, Lcom/digdroid/alman/dig/i3;-><init>(Lcom/digdroid/alman/dig/MainActivity;Lcom/digdroid/alman/dig/s3;Landroid/database/Cursor;FFLjava/lang/String;Z)V

    invoke-direct {v0, v9}, Lcom/digdroid/alman/dig/d2;-><init>(Lcom/digdroid/alman/dig/h;)V

    return-object v0

    :pswitch_4
    new-instance v9, Lcom/digdroid/alman/dig/l3;

    iget-object v3, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/s3;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->V()F

    move-result v5

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->k3()F

    move-result v6

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->w()Z

    move-result v8

    move-object v1, v9

    move-object v4, p1

    invoke-direct/range {v1 .. v8}, Lcom/digdroid/alman/dig/l3;-><init>(Lcom/digdroid/alman/dig/MainActivity;Lcom/digdroid/alman/dig/s3;Landroid/database/Cursor;FFLjava/lang/String;Z)V

    invoke-direct {v0, v9}, Lcom/digdroid/alman/dig/d2;-><init>(Lcom/digdroid/alman/dig/h;)V

    return-object v0

    :pswitch_5
    new-instance v9, Lcom/digdroid/alman/dig/m3;

    iget-object v3, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/s3;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->E()F

    move-result v5

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->k3()F

    move-result v6

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->w()Z

    move-result v8

    move-object v1, v9

    move-object v4, p1

    invoke-direct/range {v1 .. v8}, Lcom/digdroid/alman/dig/m3;-><init>(Lcom/digdroid/alman/dig/MainActivity;Lcom/digdroid/alman/dig/s3;Landroid/database/Cursor;FFLjava/lang/String;Z)V

    invoke-direct {v0, v9}, Lcom/digdroid/alman/dig/d2;-><init>(Lcom/digdroid/alman/dig/h;)V

    return-object v0

    :cond_7
    :goto_1
    const/4 p1, 0x0

    return-object p1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7643988a -> :sswitch_5
        -0x41b970db -> :sswitch_4
        0x2c6160 -> :sswitch_3
        0x6942258 -> :sswitch_2
        0x6bdbb5b -> :sswitch_1
        0x7608a165 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method i3()Landroid/database/Cursor;
    .locals 7

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->b0:Lcom/digdroid/alman/dig/g3;

    iget-object v1, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/b3;->p()Z

    move-result v1

    iget-object v2, p0, Lcom/digdroid/alman/dig/k3;->t0:Ljava/lang/String;

    iget v3, p0, Lcom/digdroid/alman/dig/k3;->s0:I

    iget-object v4, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    const-string v5, "systems_sort"

    const-string v6, "name"

    invoke-virtual {v4, v5, v6}, Lcom/digdroid/alman/dig/b3;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/digdroid/alman/dig/g3;->I(ZLjava/lang/String;ILjava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method public j3()Ljava/lang/String;
    .locals 1

    const-string v0, "grid"

    return-object v0
.end method

.method l3(Landroid/view/View;Ljava/lang/Object;)V
    .locals 0

    if-eqz p2, :cond_1

    iget-object p1, p0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    check-cast p2, Landroid/database/Cursor;

    const/4 p1, 0x3

    invoke-interface {p2, p1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    invoke-interface {p2, p1}, Lcom/digdroid/alman/dig/p1$a;->V(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public p2(Landroid/view/Menu;)V
    .locals 5

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/r1;->p2(Landroid/view/Menu;)V

    const v0, 0x7f0901b4

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    iget v1, p0, Lcom/digdroid/alman/dig/k3;->s0:I

    if-eqz v1, :cond_0

    packed-switch v1, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    const v1, 0x7f110104

    goto :goto_0

    :pswitch_1
    const v1, 0x7f110103

    goto :goto_0

    :pswitch_2
    const v1, 0x7f110102

    goto :goto_0

    :pswitch_3
    const v1, 0x7f110101

    goto :goto_0

    :pswitch_4
    const v1, 0x7f110100

    goto :goto_0

    :pswitch_5
    const v1, 0x7f1100ff

    goto :goto_0

    :pswitch_6
    const v1, 0x7f1100fe

    goto :goto_0

    :cond_0
    const v1, 0x7f110023

    :goto_0
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setTitle(I)Landroid/view/MenuItem;

    :goto_1
    invoke-interface {v0}, Landroid/view/MenuItem;->getSubMenu()Landroid/view/SubMenu;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/SubMenu;->clearHeader()V

    const v0, 0x7f090420

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/k3;->t0:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    const/4 v2, -0x1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    const/4 v4, 0x0

    sparse-switch v3, :sswitch_data_0

    goto :goto_2

    :sswitch_0
    const-string v3, "console"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_2

    :cond_1
    const/4 v2, 0x4

    goto :goto_2

    :sswitch_1
    const-string v3, "handheld"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    const/4 v2, 0x3

    goto :goto_2

    :sswitch_2
    const-string v3, "all"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_2

    :cond_3
    const/4 v2, 0x2

    goto :goto_2

    :sswitch_3
    const-string v3, "computer"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_2

    :cond_4
    const/4 v2, 0x1

    goto :goto_2

    :sswitch_4
    const-string v3, "arcade"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_2

    :cond_5
    const/4 v2, 0x0

    :goto_2
    packed-switch v2, :pswitch_data_1

    goto :goto_4

    :pswitch_7
    const v1, 0x7f110099

    goto :goto_3

    :pswitch_8
    const v1, 0x7f11010f

    goto :goto_3

    :pswitch_9
    const v1, 0x7f110025

    :goto_3
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setTitle(I)Landroid/view/MenuItem;

    goto :goto_4

    :pswitch_a
    const v1, 0x7f110087

    goto :goto_3

    :pswitch_b
    const v1, 0x7f110030

    goto :goto_3

    :goto_4
    invoke-interface {v0}, Landroid/view/MenuItem;->getSubMenu()Landroid/view/SubMenu;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/SubMenu;->clearHeader()V

    const v0, 0x7f0901fc

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/b3;->p()Z

    move-result v1

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    const v0, 0x7f0901f4

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    const-string v2, "has_theme_icon"

    invoke-virtual {v1, v2, v4}, Lcom/digdroid/alman/dig/b3;->c(Ljava/lang/String;Z)Z

    move-result v1

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    const v0, 0x7f09039e

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    const-string v2, "systems_sort"

    const-string v3, "name"

    invoke-virtual {v1, v2, v3}, Lcom/digdroid/alman/dig/b3;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v4, "date"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    const v0, 0x7f09039a

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {v0, v2, v3}, Lcom/digdroid/alman/dig/b3;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    return-void

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        -0x5404faf0 -> :sswitch_4
        -0x23b680e5 -> :sswitch_3
        0x179a1 -> :sswitch_2
        0x1dc024 -> :sswitch_1
        0x38b6e557 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
    .end packed-switch
.end method

.method public r1()V
    .locals 1

    invoke-super {p0}, Lcom/digdroid/alman/dig/r1;->r1()V

    const v0, 0x7f110263

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->D0(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/r1;->V2(Ljava/lang/String;)V

    return-void
.end method

.method r2()I
    .locals 1

    const v0, 0x7f0d0011

    return v0
.end method

.method public s1(Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/k3;->t0:Ljava/lang/String;

    const-string v1, "type"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget v0, p0, Lcom/digdroid/alman/dig/k3;->s0:I

    const-string v1, "generation"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/r1;->s1(Landroid/os/Bundle;)V

    return-void
.end method

.method public t2()Ljava/lang/String;
    .locals 1

    const-string v0, "systems"

    return-object v0
.end method

.method public u3(Ljava/lang/String;I)V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    const-string v1, "systems_list_type"

    invoke-virtual {v0, v1, p1}, Lcom/digdroid/alman/dig/b3;->z(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/digdroid/alman/dig/k3;->t0:Ljava/lang/String;

    iget v2, p0, Lcom/digdroid/alman/dig/k3;->s0:I

    invoke-interface {v0, p1, v1, v2, p2}, Lcom/digdroid/alman/dig/p1$a;->i0(Ljava/lang/String;Ljava/lang/String;II)V

    :cond_0
    return-void
.end method

.method y3(Ljava/lang/String;I)V
    .locals 3

    invoke-static {}, Lcom/digdroid/alman/dig/d0;->p()Lcom/digdroid/alman/dig/d0;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v1

    new-instance v2, Lcom/digdroid/alman/dig/k3$c;

    invoke-direct {v2, p0, p1, p2}, Lcom/digdroid/alman/dig/k3$c;-><init>(Lcom/digdroid/alman/dig/k3;Ljava/lang/String;I)V

    const/4 p1, 0x7

    invoke-virtual {v0, v1, p1, v2}, Lcom/digdroid/alman/dig/d0;->r(Landroid/app/Activity;ILcom/digdroid/alman/dig/d0$r;)V

    return-void
.end method

.method declared-synchronized z2(Landroid/content/Intent;)V
    .locals 0

    monitor-enter p0

    monitor-exit p0

    return-void
.end method
