.class abstract Lcom/digdroid/alman/dig/p1;
.super Landroidx/fragment/app/Fragment;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/digdroid/alman/dig/p1$a;
    }
.end annotation


# instance fields
.field Z:Lcom/digdroid/alman/dig/c3;

.field a0:Lcom/digdroid/alman/dig/u;

.field b0:Lcom/digdroid/alman/dig/h3;

.field c0:Lcom/digdroid/alman/dig/o0;

.field d0:Lcom/digdroid/alman/dig/b0;

.field e0:Lcom/digdroid/alman/dig/z1;

.field f0:Lcom/digdroid/alman/dig/t1;

.field g0:Lcom/digdroid/alman/dig/t3;

.field h0:Ljava/lang/String;

.field i0:Z

.field j0:Z

.field private k0:Z

.field l0:Landroid/content/Context;

.field m0:Lcom/digdroid/alman/dig/p1$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/digdroid/alman/dig/p1;->h0:Ljava/lang/String;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/p1;->i0:Z

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/p1;->j0:Z

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/p1;->k0:Z

    return-void
.end method


# virtual methods
.method A2(Ljava/lang/String;)Z
    .locals 1

    if-eqz p1, :cond_1

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public B2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/p1;->i0:Z

    return v0
.end method

.method public C2()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method D2(Ljava/lang/String;)[Ljava/io/File;
    .locals 0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object p1

    invoke-static {p1}, Lcom/digdroid/alman/dig/h2;->b(Landroid/content/Context;)[Ljava/io/File;

    move-result-object p1

    return-object p1
.end method

.method public E2(Z)V
    .locals 0

    return-void
.end method

.method public F2()V
    .locals 1

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p1;->B2()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/p1;->k0:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p1;->O2()V

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/p1;->k0:Z

    return-void
.end method

.method public G2(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/digdroid/alman/dig/p1;->k0:Z

    return-void
.end method

.method H2(Landroid/view/MenuItem;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public I2(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public J2(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public K2()V
    .locals 0

    return-void
.end method

.method L2(Landroid/view/View;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, v0}, Lcom/digdroid/alman/dig/p1;->M2(Landroid/view/View;II)V

    return-void
.end method

.method M2(Landroid/view/View;II)V
    .locals 5

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v0

    const/high16 v1, 0x41a00000    # 20.0f

    invoke-static {v0, v1}, Lcom/digdroid/alman/dig/a4;->e(Landroid/content/Context;F)I

    move-result v0

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p1;->w2()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, -0x1

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v2, "default"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v4, 0x3

    goto :goto_0

    :sswitch_1
    const-string v2, "icons_bottom"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    goto :goto_0

    :sswitch_2
    const-string v2, "none"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v4, 0x1

    goto :goto_0

    :sswitch_3
    const-string v2, "icons_top"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v4, 0x0

    :goto_0
    packed-switch v4, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    invoke-virtual {p1, p2, v0, p3, v3}, Landroid/view/View;->setPadding(IIII)V

    goto :goto_1

    :pswitch_1
    invoke-virtual {p1, p2, v0, p3, v0}, Landroid/view/View;->setPadding(IIII)V

    goto :goto_1

    :pswitch_2
    invoke-virtual {p1, p2, v3, p3, v0}, Landroid/view/View;->setPadding(IIII)V

    :goto_1
    return-void

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

.method public N2()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method O2()V
    .locals 0

    return-void
.end method

.method public P2()V
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/digdroid/alman/dig/p1$a;->r()V

    :cond_0
    return-void
.end method

.method public Q2()V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/t3;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2, v2}, Lcom/digdroid/alman/dig/p1$a;->G(Lcom/digdroid/alman/dig/t3;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public R2()V
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/digdroid/alman/dig/p1$a;->w(Z)V

    :cond_0
    return-void
.end method

.method public S2()V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/digdroid/alman/dig/p1$a;->B()Landroid/view/Menu;

    move-result-object v0

    const v1, 0x7f0901a8

    invoke-interface {v0, v1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    const v1, 0x7f0903d5

    invoke-interface {v0, v1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v1

    invoke-interface {v1, v2}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    const v1, 0x7f0902c3

    invoke-interface {v0, v1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v1

    invoke-interface {v1, v2}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    const v1, 0x7f0902c4

    invoke-interface {v0, v1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v1

    invoke-interface {v1, v2}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    const v1, 0x7f0902c5

    invoke-interface {v0, v1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    invoke-interface {v0, v2}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    :cond_0
    return-void
.end method

.method public T0(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/p1;->i0:Z

    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->T0(Landroid/content/Context;)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/p1;->l0:Landroid/content/Context;

    check-cast p1, Lcom/digdroid/alman/dig/p1$a;

    iput-object p1, p0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    return-void
.end method

.method public T2(Lcom/digdroid/alman/dig/h0;)V
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/digdroid/alman/dig/p1$a;->T(Lcom/digdroid/alman/dig/h0;)V

    :cond_0
    return-void
.end method

.method public U2()V
    .locals 0

    return-void
.end method

.method public V2()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/p1;->i0:Z

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p1;->K2()V

    return-void
.end method

.method public W0(Landroid/os/Bundle;)V
    .locals 3

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/p1;->i0:Z

    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->W0(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p1;->C2()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/digdroid/alman/dig/p1;->l0:Landroid/content/Context;

    invoke-static {p1}, Lcom/digdroid/alman/dig/c3;->k(Landroid/content/Context;)Lcom/digdroid/alman/dig/c3;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/c3;

    iget-object p1, p0, Lcom/digdroid/alman/dig/p1;->l0:Landroid/content/Context;

    invoke-static {p1}, Lcom/digdroid/alman/dig/u;->e(Landroid/content/Context;)Lcom/digdroid/alman/dig/u;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/p1;->a0:Lcom/digdroid/alman/dig/u;

    iget-object v1, p0, Lcom/digdroid/alman/dig/p1;->l0:Landroid/content/Context;

    invoke-static {v1, p1}, Lcom/digdroid/alman/dig/h3;->r(Landroid/content/Context;Lcom/digdroid/alman/dig/u;)Lcom/digdroid/alman/dig/h3;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/p1;->b0:Lcom/digdroid/alman/dig/h3;

    iget-object p1, p0, Lcom/digdroid/alman/dig/p1;->l0:Landroid/content/Context;

    iget-object v1, p0, Lcom/digdroid/alman/dig/p1;->a0:Lcom/digdroid/alman/dig/u;

    invoke-static {p1, v1}, Lcom/digdroid/alman/dig/o0;->g(Landroid/content/Context;Lcom/digdroid/alman/dig/u;)Lcom/digdroid/alman/dig/o0;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/p1;->c0:Lcom/digdroid/alman/dig/o0;

    iget-object v1, p0, Lcom/digdroid/alman/dig/p1;->l0:Landroid/content/Context;

    iget-object v2, p0, Lcom/digdroid/alman/dig/p1;->b0:Lcom/digdroid/alman/dig/h3;

    invoke-static {v1, v2, p1}, Lcom/digdroid/alman/dig/b0;->o(Landroid/content/Context;Lcom/digdroid/alman/dig/h3;Lcom/digdroid/alman/dig/o0;)Lcom/digdroid/alman/dig/b0;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/p1;->d0:Lcom/digdroid/alman/dig/b0;

    iget-object p1, p0, Lcom/digdroid/alman/dig/p1;->l0:Landroid/content/Context;

    invoke-static {p1}, Lcom/digdroid/alman/dig/z1;->b(Landroid/content/Context;)Lcom/digdroid/alman/dig/z1;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/p1;->e0:Lcom/digdroid/alman/dig/z1;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p1;->r2()I

    move-result p1

    if-ltz p1, :cond_0

    iget-object p1, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/c3;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/c3;->t()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 v0, 0x1

    :cond_0
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->d2(Z)V

    new-instance p1, Lcom/digdroid/alman/dig/t3;

    invoke-direct {p1}, Lcom/digdroid/alman/dig/t3;-><init>()V

    iput-object p1, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/t3;

    sget-object p1, Lcom/digdroid/alman/dig/q3;->a:Lcom/digdroid/alman/dig/t3;

    iget-object p1, p1, Lcom/digdroid/alman/dig/t3;->a:Lcom/digdroid/alman/dig/s3;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p1;->t2()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/t3;

    invoke-virtual {p1, v0, v1}, Lcom/digdroid/alman/dig/s3;->M(Ljava/lang/String;Lcom/digdroid/alman/dig/t3;)V

    return-void
.end method

.method public W2()V
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p1;->C2()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    iget-object v1, p0, Lcom/digdroid/alman/dig/p1;->h0:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/digdroid/alman/dig/p1$a;->W(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public X2(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/p1;->h0:Ljava/lang/String;

    return-void
.end method

.method public Y2(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/digdroid/alman/dig/p1$a;->v(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public Z0(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .locals 1

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p1;->r2()I

    move-result v0

    invoke-virtual {p2, v0, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/p1;->p2(Landroid/view/Menu;)V

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->Z0(Landroid/view/Menu;Landroid/view/MenuInflater;)V

    return-void
.end method

.method Z2(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/c3;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p1;->t2()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_toolbar"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/digdroid/alman/dig/c3;->G(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public a3(Z)V
    .locals 1

    if-eqz p1, :cond_0

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/p1;->j0:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p1;->w2()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/p1;->Y2(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p1;->W2()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p1;->F2()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p1;->R2()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p1;->S2()V

    :cond_0
    iput-boolean p1, p0, Lcom/digdroid/alman/dig/p1;->j0:Z

    return-void
.end method

.method b3(Ljava/lang/String;)Z
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->b0:Lcom/digdroid/alman/dig/h3;

    invoke-virtual {v0, p1}, Lcom/digdroid/alman/dig/h3;->w(Ljava/lang/String;)Z

    move-result v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/p1;->b0:Lcom/digdroid/alman/dig/h3;

    invoke-virtual {v1, p1}, Lcom/digdroid/alman/dig/h3;->t(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "mame"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    xor-int/lit8 v0, v0, 0x1

    :cond_0
    return v0
.end method

.method public c3()V
    .locals 0

    return-void
.end method

.method public d3()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public e()V
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/digdroid/alman/dig/p1$a;->e()V

    :cond_0
    return-void
.end method

.method public e3()V
    .locals 0

    return-void
.end method

.method f3(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    return-object p1
.end method

.method public k1(Landroid/view/MenuItem;)Z
    .locals 1

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/p1;->H2(Landroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->k1(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public l()Z
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/digdroid/alman/dig/p1$a;->l()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public m1()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->m1()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/p1;->j0:Z

    return-void
.end method

.method p2(Landroid/view/Menu;)V
    .locals 0

    return-void
.end method

.method public q2()V
    .locals 0

    return-void
.end method

.method public r1()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/p1;->i0:Z

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->r1()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p1;->C2()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/c3;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/c3;->i()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->l0:Landroid/content/Context;

    invoke-static {v0}, Lcom/digdroid/alman/dig/ImageService;->a(Landroid/content/Context;)V

    :cond_0
    return-void
.end method

.method r2()I
    .locals 1

    const/4 v0, -0x1

    return v0
.end method

.method public s2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->h0:Ljava/lang/String;

    return-object v0
.end method

.method public t1()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/p1;->i0:Z

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->t1()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p1;->C2()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->a0:Lcom/digdroid/alman/dig/u;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/u;->h()V

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->e0:Lcom/digdroid/alman/dig/z1;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/z1;->c()Z

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->c0:Lcom/digdroid/alman/dig/o0;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/o0;->o()V

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->b0:Lcom/digdroid/alman/dig/h3;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/h3;->C()V

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->l0:Landroid/content/Context;

    invoke-static {v0}, Lcom/digdroid/alman/dig/t1;->p(Landroid/content/Context;)Lcom/digdroid/alman/dig/t1;

    move-result-object v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/p1;->f0:Lcom/digdroid/alman/dig/t1;

    :cond_0
    return-void
.end method

.method abstract t2()Ljava/lang/String;
.end method

.method public u2()J
    .locals 2

    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public v2()Lcom/digdroid/alman/dig/t3;
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/t3;

    return-object v0
.end method

.method w2()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/c3;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p1;->t2()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_toolbar"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "default"

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/c3;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public x2()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public y2(II)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method z2(Landroid/content/Intent;)V
    .locals 0

    return-void
.end method
