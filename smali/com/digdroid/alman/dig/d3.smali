.class public Lcom/digdroid/alman/dig/d3;
.super Lcom/digdroid/alman/dig/p1;
.source ""


# instance fields
.field n0:I

.field o0:Landroid/os/Handler;

.field p0:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/digdroid/alman/dig/p1;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/digdroid/alman/dig/d3;->n0:I

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/digdroid/alman/dig/d3;->o0:Landroid/os/Handler;

    new-instance v0, Lcom/digdroid/alman/dig/d3$a;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/d3$a;-><init>(Lcom/digdroid/alman/dig/d3;)V

    iput-object v0, p0, Lcom/digdroid/alman/dig/d3;->p0:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public bridge synthetic B2()Z
    .locals 1

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->B2()Z

    move-result v0

    return v0
.end method

.method public C2()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public bridge synthetic E2(Z)V
    .locals 0

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/p1;->E2(Z)V

    return-void
.end method

.method public bridge synthetic F2()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->F2()V

    return-void
.end method

.method public bridge synthetic G2(Z)V
    .locals 0

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/p1;->G2(Z)V

    return-void
.end method

.method public bridge synthetic I2(Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/p1;->I2(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic J2(Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/p1;->J2(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic M2()Z
    .locals 1

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->M2()Z

    move-result v0

    return v0
.end method

.method N2()V
    .locals 0

    return-void
.end method

.method public bridge synthetic O2()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->O2()V

    return-void
.end method

.method public P2()V
    .locals 0

    return-void
.end method

.method public Q2()V
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/digdroid/alman/dig/p1$a;->w(Z)V

    :cond_0
    return-void
.end method

.method public bridge synthetic R2()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->R2()V

    return-void
.end method

.method public bridge synthetic S2(Lcom/digdroid/alman/dig/h0;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/p1;->S2(Lcom/digdroid/alman/dig/h0;)V

    return-void
.end method

.method public bridge synthetic T0(Landroid/content/Context;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/p1;->T0(Landroid/content/Context;)V

    return-void
.end method

.method public bridge synthetic T2()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->T2()V

    return-void
.end method

.method public bridge synthetic U2()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->U2()V

    return-void
.end method

.method public bridge synthetic W0(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/p1;->W0(Landroid/os/Bundle;)V

    return-void
.end method

.method public bridge synthetic W2(Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/p1;->W2(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic Y2(Z)V
    .locals 0

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/p1;->Y2(Z)V

    return-void
.end method

.method public bridge synthetic Z0(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/digdroid/alman/dig/p1;->Z0(Landroid/view/Menu;Landroid/view/MenuInflater;)V

    return-void
.end method

.method public a1(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p3, 0x7f0c00ec

    const/4 v0, 0x0

    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic a3()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->a3()V

    return-void
.end method

.method public bridge synthetic b3()Z
    .locals 1

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->b3()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic c3()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->c3()V

    return-void
.end method

.method public declared-synchronized e3(Landroid/content/Intent;)V
    .locals 3

    monitor-enter p0

    :try_start_0
    const-string v0, "progress"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Lcom/digdroid/alman/dig/d3;->n0:I

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F0()Landroid/view/View;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_1

    monitor-exit p0

    return-void

    :cond_1
    const v1, 0x7f0903b6

    :try_start_1
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const v2, 0x7f110257

    invoke-virtual {p1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p0, Lcom/digdroid/alman/dig/d3;->n0:I

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "%"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :cond_2
    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public bridge synthetic k1(Landroid/view/MenuItem;)Z
    .locals 0

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/p1;->k1(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public m1()V
    .locals 2

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->m1()V

    iget-object v0, p0, Lcom/digdroid/alman/dig/d3;->o0:Landroid/os/Handler;

    iget-object v1, p0, Lcom/digdroid/alman/dig/d3;->p0:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method

.method public bridge synthetic q2()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->q2()V

    return-void
.end method

.method public r1()V
    .locals 4

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->r1()V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F0()Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0903b6

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/d3;->o0:Landroid/os/Handler;

    iget-object v1, p0, Lcom/digdroid/alman/dig/d3;->p0:Ljava/lang/Runnable;

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/p1;->i0:Z

    return-void
.end method

.method public bridge synthetic s2()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->s2()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic t1()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->t1()V

    return-void
.end method

.method public t2()Ljava/lang/String;
    .locals 1

    const-string v0, "splash"

    return-object v0
.end method

.method public bridge synthetic u2()J
    .locals 2

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->u2()J

    move-result-wide v0

    return-wide v0
.end method

.method public bridge synthetic v2()Lcom/digdroid/alman/dig/s3;
    .locals 1

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->v2()Lcom/digdroid/alman/dig/s3;

    move-result-object v0

    return-object v0
.end method

.method w2()Ljava/lang/String;
    .locals 1

    const-string v0, "none"

    return-object v0
.end method

.method public bridge synthetic x2()Z
    .locals 1

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->x2()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic y2(II)Z
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/digdroid/alman/dig/p1;->y2(II)Z

    move-result p1

    return p1
.end method

.method z2(Landroid/content/Intent;)V
    .locals 0

    return-void
.end method
