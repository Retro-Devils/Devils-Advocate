.class Lcom/digdroid/alman/dig/k2;
.super Lcom/digdroid/alman/dig/i2;
.source ""


# instance fields
.field j:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field k:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/os/Bundle;",
            ">;"
        }
    .end annotation
.end field

.field l:Lcom/digdroid/alman/dig/b3;

.field m:Landroid/os/Handler;

.field n:Z


# direct methods
.method public constructor <init>(Lcom/digdroid/alman/dig/e0;)V
    .locals 1

    invoke-virtual {p1}, Landroidx/fragment/app/d;->C0()Landroidx/fragment/app/i;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/digdroid/alman/dig/i2;-><init>(Landroid/app/Activity;Landroidx/fragment/app/i;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/digdroid/alman/dig/k2;->j:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/digdroid/alman/dig/k2;->k:Ljava/util/ArrayList;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/k2;->n:Z

    invoke-static {p1}, Lcom/digdroid/alman/dig/b3;->k(Landroid/content/Context;)Lcom/digdroid/alman/dig/b3;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/k2;->l:Lcom/digdroid/alman/dig/b3;

    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Lcom/digdroid/alman/dig/k2;->m:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public declared-synchronized c()I
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/k2;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized i(Landroid/os/Parcelable;Ljava/lang/ClassLoader;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    check-cast p1, Landroid/os/Bundle;

    const-string v0, "args"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/k2;->k:Ljava/util/ArrayList;

    const-string v0, "types"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getIntegerArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/k2;->j:Ljava/util/ArrayList;

    const-string v0, "state"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    invoke-super {p0, p1, p2}, Lcom/digdroid/alman/dig/i2;->i(Landroid/os/Parcelable;Ljava/lang/ClassLoader;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized j()Landroid/os/Parcelable;
    .locals 3

    monitor-enter p0

    :try_start_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "state"

    invoke-super {p0}, Lcom/digdroid/alman/dig/i2;->j()Landroid/os/Parcelable;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v1, "types"

    iget-object v2, p0, Lcom/digdroid/alman/dig/k2;->j:Ljava/util/ArrayList;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putIntegerArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    const-string v1, "args"

    iget-object v2, p0, Lcom/digdroid/alman/dig/k2;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized p(I)Landroidx/fragment/app/Fragment;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/k2;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    if-lt p1, v0, :cond_0

    monitor-exit p0

    return-object v1

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/digdroid/alman/dig/k2;->j:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    :pswitch_0
    new-instance v1, Lcom/digdroid/alman/dig/t3;

    invoke-direct {v1}, Lcom/digdroid/alman/dig/t3;-><init>()V

    goto/16 :goto_0

    :pswitch_1
    new-instance v1, Lcom/digdroid/alman/dig/e4;

    invoke-direct {v1}, Lcom/digdroid/alman/dig/e4;-><init>()V

    goto/16 :goto_0

    :pswitch_2
    new-instance v1, Lcom/digdroid/alman/dig/c;

    invoke-direct {v1}, Lcom/digdroid/alman/dig/c;-><init>()V

    goto/16 :goto_0

    :pswitch_3
    new-instance v1, Lcom/digdroid/alman/dig/i0;

    invoke-direct {v1}, Lcom/digdroid/alman/dig/i0;-><init>()V

    goto/16 :goto_0

    :pswitch_4
    new-instance v1, Lcom/digdroid/alman/dig/e3;

    invoke-direct {v1}, Lcom/digdroid/alman/dig/e3;-><init>()V

    goto/16 :goto_0

    :pswitch_5
    new-instance v1, Lcom/digdroid/alman/dig/j;

    invoke-direct {v1}, Lcom/digdroid/alman/dig/j;-><init>()V

    goto/16 :goto_0

    :pswitch_6
    new-instance v1, Lcom/digdroid/alman/dig/k;

    invoke-direct {v1}, Lcom/digdroid/alman/dig/k;-><init>()V

    goto/16 :goto_0

    :pswitch_7
    new-instance v1, Lcom/digdroid/alman/dig/n0;

    invoke-direct {v1}, Lcom/digdroid/alman/dig/n0;-><init>()V

    goto/16 :goto_0

    :pswitch_8
    new-instance v1, Lcom/digdroid/alman/dig/d4;

    invoke-direct {v1}, Lcom/digdroid/alman/dig/d4;-><init>()V

    goto :goto_0

    :pswitch_9
    new-instance v1, Lcom/digdroid/alman/dig/u2;

    invoke-direct {v1}, Lcom/digdroid/alman/dig/u2;-><init>()V

    goto :goto_0

    :pswitch_a
    new-instance v1, Lcom/digdroid/alman/dig/c4;

    invoke-direct {v1}, Lcom/digdroid/alman/dig/c4;-><init>()V

    goto :goto_0

    :pswitch_b
    new-instance v1, Lcom/digdroid/alman/dig/q2;

    invoke-direct {v1}, Lcom/digdroid/alman/dig/q2;-><init>()V

    goto :goto_0

    :pswitch_c
    new-instance v1, Lcom/digdroid/alman/dig/s;

    invoke-direct {v1}, Lcom/digdroid/alman/dig/s;-><init>()V

    goto :goto_0

    :pswitch_d
    new-instance v1, Lcom/digdroid/alman/dig/d3;

    invoke-direct {v1}, Lcom/digdroid/alman/dig/d3;-><init>()V

    goto :goto_0

    :pswitch_e
    new-instance v1, Lcom/digdroid/alman/dig/p2;

    invoke-direct {v1}, Lcom/digdroid/alman/dig/p2;-><init>()V

    goto :goto_0

    :pswitch_f
    new-instance v1, Lcom/digdroid/alman/dig/s2;

    invoke-direct {v1}, Lcom/digdroid/alman/dig/s2;-><init>()V

    goto :goto_0

    :pswitch_10
    new-instance v1, Lcom/digdroid/alman/dig/j0;

    invoke-direct {v1}, Lcom/digdroid/alman/dig/j0;-><init>()V

    goto :goto_0

    :pswitch_11
    new-instance v1, Lcom/digdroid/alman/dig/j1;

    invoke-direct {v1}, Lcom/digdroid/alman/dig/j1;-><init>()V

    goto :goto_0

    :pswitch_12
    new-instance v1, Lcom/digdroid/alman/dig/c0;

    invoke-direct {v1}, Lcom/digdroid/alman/dig/c0;-><init>()V

    goto :goto_0

    :pswitch_13
    new-instance v1, Lcom/digdroid/alman/dig/f3;

    invoke-direct {v1}, Lcom/digdroid/alman/dig/f3;-><init>()V

    goto :goto_0

    :pswitch_14
    new-instance v1, Lcom/digdroid/alman/dig/k3;

    invoke-direct {v1}, Lcom/digdroid/alman/dig/k3;-><init>()V

    goto :goto_0

    :pswitch_15
    new-instance v1, Lcom/digdroid/alman/dig/b;

    invoke-direct {v1}, Lcom/digdroid/alman/dig/b;-><init>()V

    goto :goto_0

    :pswitch_16
    new-instance v1, Lcom/digdroid/alman/dig/s1;

    invoke-direct {v1}, Lcom/digdroid/alman/dig/s1;-><init>()V

    goto :goto_0

    :pswitch_17
    new-instance v1, Lcom/digdroid/alman/dig/k1;

    invoke-direct {v1}, Lcom/digdroid/alman/dig/k1;-><init>()V

    :goto_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/k2;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Bundle;

    invoke-virtual {v1, p1}, Landroidx/fragment/app/Fragment;->c2(Landroid/os/Bundle;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object v1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
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

.method public declared-synchronized r(I)V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/k2;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-lt p1, v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/i2;->r(I)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, p0, Lcom/digdroid/alman/dig/k2;->j:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v2, p0, Lcom/digdroid/alman/dig/k2;->k:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge p1, v2, :cond_1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/digdroid/alman/dig/k2;->k:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    iget-object p1, p0, Lcom/digdroid/alman/dig/k2;->k:Ljava/util/ArrayList;

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object p1, p0, Lcom/digdroid/alman/dig/k2;->j:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    iget-object p1, p0, Lcom/digdroid/alman/dig/k2;->j:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p0}, Lb/s/a/a;->h()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method

.method public declared-synchronized t(Lb/s/a/b;ILandroid/os/Bundle;)V
    .locals 4

    monitor-enter p0

    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, p0, Lcom/digdroid/alman/dig/k2;->j:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v2, p0, Lcom/digdroid/alman/dig/k2;->k:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_0

    invoke-virtual {p1}, Lb/s/a/b;->getCurrentItem()I

    move-result v2

    add-int/lit8 v3, v2, 0x1

    invoke-super {p0, v3}, Lcom/digdroid/alman/dig/i2;->r(I)V

    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    if-ge v2, v3, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p2, p0, Lcom/digdroid/alman/dig/k2;->k:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->clear()V

    iget-object p2, p0, Lcom/digdroid/alman/dig/k2;->k:Ljava/util/ArrayList;

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object p2, p0, Lcom/digdroid/alman/dig/k2;->j:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->clear()V

    iget-object p2, p0, Lcom/digdroid/alman/dig/k2;->j:Ljava/util/ArrayList;

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p0}, Lb/s/a/a;->h()V

    iget-object p2, p0, Lcom/digdroid/alman/dig/k2;->j:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    const/4 p3, 0x0

    invoke-virtual {p1, p2, p3}, Lb/s/a/b;->K(IZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method

.method public declared-synchronized u(I)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/k2;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/k2;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    iget-object v0, p0, Lcom/digdroid/alman/dig/k2;->j:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    invoke-virtual {p0}, Lb/s/a/a;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method v()Z
    .locals 1

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/k2;->n:Z

    return v0
.end method

.method public w(Lb/s/a/b;)V
    .locals 6

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, -0x1

    const/4 v5, -0x1

    move-object v0, p0

    move-object v1, p1

    invoke-virtual/range {v0 .. v5}, Lcom/digdroid/alman/dig/k2;->y(Lb/s/a/b;Lcom/digdroid/alman/dig/h0;Ljava/lang/String;II)V

    return-void
.end method

.method public x(Lb/s/a/b;I)V
    .locals 6

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, -0x1

    move-object v0, p0

    move-object v1, p1

    move v5, p2

    invoke-virtual/range {v0 .. v5}, Lcom/digdroid/alman/dig/k2;->y(Lb/s/a/b;Lcom/digdroid/alman/dig/h0;Ljava/lang/String;II)V

    return-void
.end method

.method public y(Lb/s/a/b;Lcom/digdroid/alman/dig/h0;Ljava/lang/String;II)V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/k2;->j:Ljava/util/ArrayList;

    invoke-virtual {p1}, Lb/s/a/b;->getCurrentItem()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/k2;->k:Ljava/util/ArrayList;

    invoke-virtual {p1}, Lb/s/a/b;->getCurrentItem()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Bundle;

    if-eqz p2, :cond_0

    invoke-virtual {p2, v1}, Lcom/digdroid/alman/dig/h0;->d(Landroid/os/Bundle;)V

    :cond_0
    if-eqz p3, :cond_1

    const-string p2, "type"

    invoke-virtual {v1, p2, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    if-ltz p4, :cond_2

    const-string p2, "generation"

    invoke-virtual {v1, p2, p4}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :cond_2
    if-ltz p5, :cond_3

    const-string p2, "scroll_position"

    invoke-virtual {v1, p2, p5}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :cond_3
    const/4 p2, 0x3

    const-string p3, "grid"

    if-ne v0, p2, :cond_4

    invoke-virtual {v1, p3}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_4

    iget-object p2, p0, Lcom/digdroid/alman/dig/k2;->l:Lcom/digdroid/alman/dig/b3;

    const-string p4, "systems_list_type"

    invoke-virtual {p2, p4, p3}, Lcom/digdroid/alman/dig/b3;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_4
    invoke-virtual {v1, p3}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_5

    iget-object p2, p0, Lcom/digdroid/alman/dig/k2;->l:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {p2}, Lcom/digdroid/alman/dig/b3;->b()Ljava/lang/String;

    move-result-object p2

    :goto_0
    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {v1, p3, p2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_5
    const/4 p2, 0x1

    iput-boolean p2, p0, Lcom/digdroid/alman/dig/k2;->n:Z

    invoke-virtual {p1}, Lb/s/a/b;->getCurrentItem()I

    move-result p3

    const/4 p4, 0x0

    if-lez p3, :cond_6

    sub-int/2addr p3, p2

    invoke-virtual {p1, p3, p4}, Lb/s/a/b;->K(IZ)V

    goto :goto_1

    :cond_6
    invoke-virtual {p0, p4}, Lcom/digdroid/alman/dig/k2;->r(I)V

    invoke-virtual {p0, p4}, Lcom/digdroid/alman/dig/k2;->u(I)V

    :goto_1
    invoke-virtual {p0, p1, v0, v1}, Lcom/digdroid/alman/dig/k2;->t(Lb/s/a/b;ILandroid/os/Bundle;)V

    invoke-virtual {p1}, Lb/s/a/b;->getCurrentItem()I

    move-result p2

    invoke-virtual {p1, p2, p4}, Lb/s/a/b;->K(IZ)V

    iput-boolean p4, p0, Lcom/digdroid/alman/dig/k2;->n:Z

    return-void
.end method
