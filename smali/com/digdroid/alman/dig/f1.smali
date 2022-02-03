.class abstract Lcom/digdroid/alman/dig/f1;
.super Lcom/digdroid/alman/dig/r1;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/e1$a;
.implements Lcom/digdroid/alman/dig/g1$a;
.implements Lcom/digdroid/alman/dig/c1$a;


# instance fields
.field s0:Lcom/digdroid/alman/dig/m;

.field t0:Landroid/os/Handler;

.field u0:Ljava/lang/Runnable;

.field protected v0:[Z

.field w0:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/digdroid/alman/dig/r1;-><init>()V

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/digdroid/alman/dig/f1;->t0:Landroid/os/Handler;

    new-instance v0, Lcom/digdroid/alman/dig/f1$a;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/f1$a;-><init>(Lcom/digdroid/alman/dig/f1;)V

    iput-object v0, p0, Lcom/digdroid/alman/dig/f1;->u0:Ljava/lang/Runnable;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/digdroid/alman/dig/f1;->v0:[Z

    iput-object v0, p0, Lcom/digdroid/alman/dig/f1;->w0:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method A3()Ljava/io/File;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method B3()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method

.method C3(Landroid/view/MenuItem;JLjava/lang/String;Ljava/lang/String;)Z
    .locals 0

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p2

    const/4 p3, 0x1

    const p5, 0x7f0900df

    if-ne p2, p5, :cond_0

    new-instance p1, Lcom/digdroid/alman/dig/i;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/digdroid/alman/dig/i;-><init>(Landroid/app/Activity;)V

    invoke-virtual {p1, p3}, Lcom/digdroid/alman/dig/i;->g(Z)V

    new-instance p2, Lcom/digdroid/alman/dig/f1$b;

    invoke-direct {p2, p0, p4}, Lcom/digdroid/alman/dig/f1$b;-><init>(Lcom/digdroid/alman/dig/f1;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/digdroid/alman/dig/i;->h(Lcom/digdroid/alman/dig/i$b;)V

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/i;->d()V

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    const p2, 0x7f090143

    if-ne p1, p2, :cond_2

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result p2

    if-eqz p2, :cond_1

    goto :goto_0

    :cond_1
    new-instance p2, Landroidx/appcompat/app/b$a;

    invoke-static {}, Lcom/digdroid/alman/dig/q3;->c()I

    move-result p5

    invoke-direct {p2, p1, p5}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    const p1, 0x7f11008b

    invoke-virtual {p2, p1}, Landroidx/appcompat/app/b$a;->h(I)Landroidx/appcompat/app/b$a;

    move-result-object p1

    const p2, 0x7f11005a

    const/4 p5, 0x0

    invoke-virtual {p1, p2, p5}, Landroidx/appcompat/app/b$a;->l(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    const p2, 0x7f1101da

    new-instance p5, Lcom/digdroid/alman/dig/f1$c;

    invoke-direct {p5, p0, p4}, Lcom/digdroid/alman/dig/f1$c;-><init>(Lcom/digdroid/alman/dig/f1;Ljava/lang/String;)V

    invoke-virtual {p1, p2, p5}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    nop

    :cond_2
    :goto_0
    return p3
.end method

.method public R(Landroid/database/Cursor;)I
    .locals 0

    const/4 p1, -0x1

    return p1
.end method

.method public b()Lcom/digdroid/alman/dig/m;
    .locals 5

    new-instance v0, Lcom/digdroid/alman/dig/m;

    iget-object v1, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/t3;

    iget v2, v1, Lcom/digdroid/alman/dig/t3;->h:I

    iget v1, v1, Lcom/digdroid/alman/dig/t3;->i:I

    const/4 v3, 0x1

    const/4 v4, 0x6

    invoke-direct {v0, v3, v2, v1, v4}, Lcom/digdroid/alman/dig/m;-><init>(ZIII)V

    return-object v0
.end method

.method public f(Landroid/database/Cursor;)Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method h3(Landroid/view/View;Ljava/lang/Object;)V
    .locals 8

    check-cast p2, Landroid/database/Cursor;

    const/4 v0, 0x0

    invoke-interface {p2, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v3

    const/4 v0, 0x1

    invoke-interface {p2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0, p2}, Lcom/digdroid/alman/dig/f1;->f(Landroid/database/Cursor;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {p2}, Landroid/database/Cursor;->getPosition()I

    move-result p2

    new-instance v0, Lb/a/o/d;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v1

    invoke-static {}, Lcom/digdroid/alman/dig/q3;->c()I

    move-result v2

    invoke-direct {v0, v1, v2}, Lb/a/o/d;-><init>(Landroid/content/Context;I)V

    new-instance v7, Landroidx/appcompat/widget/l0;

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    invoke-interface {p1}, Lcom/digdroid/alman/dig/p1$a;->I()Landroid/view/View;

    move-result-object p1

    :cond_0
    invoke-direct {v7, v0, p1}, Landroidx/appcompat/widget/l0;-><init>(Landroid/content/Context;Landroid/view/View;)V

    invoke-virtual {v7}, Landroidx/appcompat/widget/l0;->b()Landroid/view/MenuInflater;

    move-result-object p1

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/f1;->y3()I

    move-result v0

    invoke-virtual {v7}, Landroidx/appcompat/widget/l0;->a()Landroid/view/Menu;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    invoke-virtual {v7}, Landroidx/appcompat/widget/l0;->a()Landroid/view/Menu;

    move-result-object p1

    const v0, 0x7f090143

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    iget-object v0, p0, Lcom/digdroid/alman/dig/f1;->v0:[Z

    aget-boolean p2, v0, p2

    invoke-interface {p1, p2}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    new-instance p1, Lcom/digdroid/alman/dig/f1$d;

    move-object v1, p1

    move-object v2, p0

    invoke-direct/range {v1 .. v6}, Lcom/digdroid/alman/dig/f1$d;-><init>(Lcom/digdroid/alman/dig/f1;JLjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v7, p1}, Landroidx/appcompat/widget/l0;->c(Landroidx/appcompat/widget/l0$d;)V

    invoke-virtual {v7}, Landroidx/appcompat/widget/l0;->d()V

    return-void
.end method

.method j3(Landroid/database/Cursor;)Lcom/digdroid/alman/dig/d2;
    .locals 11

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/digdroid/alman/dig/MainActivity;

    const/4 v0, 0x0

    if-eqz v2, :cond_a

    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_1

    :cond_0
    invoke-virtual {p0}, Lcom/digdroid/alman/dig/f1;->b()Lcom/digdroid/alman/dig/m;

    move-result-object v1

    iput-object v1, p0, Lcom/digdroid/alman/dig/f1;->s0:Lcom/digdroid/alman/dig/m;

    iget-boolean v1, v1, Lcom/digdroid/alman/dig/m;->a:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/digdroid/alman/dig/f1;->t0:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/f1;->t0:Landroid/os/Handler;

    iget-object v3, p0, Lcom/digdroid/alman/dig/f1;->u0:Ljava/lang/Runnable;

    const-wide/16 v4, 0x0

    invoke-virtual {v1, v3, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_1
    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->Q()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    const/4 v3, -0x1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v4

    sparse-switch v4, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v4, "coverflow"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v3, 0x7

    goto :goto_0

    :sswitch_1
    const-string v4, "wheel"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v3, 0x6

    goto :goto_0

    :sswitch_2
    const-string v4, "title"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_0

    :cond_4
    const/4 v3, 0x5

    goto :goto_0

    :sswitch_3
    const-string v4, "list"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_0

    :cond_5
    const/4 v3, 0x4

    goto :goto_0

    :sswitch_4
    const-string v4, "grid"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    goto :goto_0

    :cond_6
    const/4 v3, 0x3

    goto :goto_0

    :sswitch_5
    const-string v4, "carousel"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    goto :goto_0

    :cond_7
    const/4 v3, 0x2

    goto :goto_0

    :sswitch_6
    const-string v4, "linear"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    goto :goto_0

    :cond_8
    const/4 v3, 0x1

    goto :goto_0

    :sswitch_7
    const-string v4, "vertical"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    goto :goto_0

    :cond_9
    const/4 v3, 0x0

    :goto_0
    packed-switch v3, :pswitch_data_0

    return-object v0

    :pswitch_0
    new-instance v0, Lcom/digdroid/alman/dig/d2;

    new-instance v10, Lcom/digdroid/alman/dig/b1;

    iget-object v3, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/t3;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->W()F

    move-result v5

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->m3()F

    move-result v6

    iget-object v7, p0, Lcom/digdroid/alman/dig/f1;->w0:Ljava/lang/String;

    iget-object v8, p0, Lcom/digdroid/alman/dig/f1;->v0:[Z

    move-object v1, v10

    move-object v4, p1

    move-object v9, p0

    invoke-direct/range {v1 .. v9}, Lcom/digdroid/alman/dig/b1;-><init>(Lcom/digdroid/alman/dig/MainActivity;Lcom/digdroid/alman/dig/t3;Landroid/database/Cursor;FFLjava/lang/String;[ZLcom/digdroid/alman/dig/c1$a;)V

    invoke-direct {v0, v10}, Lcom/digdroid/alman/dig/d2;-><init>(Lcom/digdroid/alman/dig/h;)V

    return-object v0

    :pswitch_1
    new-instance v0, Lcom/digdroid/alman/dig/d2;

    new-instance v10, Lcom/digdroid/alman/dig/i1;

    iget-object v3, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/t3;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->x()F

    move-result v5

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->m3()F

    move-result v6

    iget-object v7, p0, Lcom/digdroid/alman/dig/f1;->w0:Ljava/lang/String;

    iget-object v8, p0, Lcom/digdroid/alman/dig/f1;->v0:[Z

    move-object v1, v10

    move-object v4, p1

    move-object v9, p0

    invoke-direct/range {v1 .. v9}, Lcom/digdroid/alman/dig/i1;-><init>(Lcom/digdroid/alman/dig/MainActivity;Lcom/digdroid/alman/dig/t3;Landroid/database/Cursor;FFLjava/lang/String;[ZLcom/digdroid/alman/dig/c1$a;)V

    invoke-direct {v0, v10}, Lcom/digdroid/alman/dig/d2;-><init>(Lcom/digdroid/alman/dig/h;)V

    return-object v0

    :pswitch_2
    new-instance v0, Lcom/digdroid/alman/dig/d2;

    new-instance v7, Lcom/digdroid/alman/dig/g1;

    iget-object v3, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/t3;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->m3()F

    move-result v5

    move-object v1, v7

    move-object v4, p1

    move-object v6, p0

    invoke-direct/range {v1 .. v6}, Lcom/digdroid/alman/dig/g1;-><init>(Landroid/app/Activity;Lcom/digdroid/alman/dig/t3;Landroid/database/Cursor;FLcom/digdroid/alman/dig/g1$a;)V

    invoke-direct {v0, v7}, Lcom/digdroid/alman/dig/d2;-><init>(Lcom/digdroid/alman/dig/q1;)V

    return-object v0

    :pswitch_3
    new-instance v0, Lcom/digdroid/alman/dig/d2;

    new-instance v9, Lcom/digdroid/alman/dig/e1;

    iget-object v3, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/t3;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->m3()F

    move-result v5

    iget-object v6, p0, Lcom/digdroid/alman/dig/f1;->w0:Ljava/lang/String;

    iget-object v7, p0, Lcom/digdroid/alman/dig/f1;->v0:[Z

    move-object v1, v9

    move-object v4, p1

    move-object v8, p0

    invoke-direct/range {v1 .. v8}, Lcom/digdroid/alman/dig/e1;-><init>(Lcom/digdroid/alman/dig/MainActivity;Lcom/digdroid/alman/dig/t3;Landroid/database/Cursor;FLjava/lang/String;[ZLcom/digdroid/alman/dig/e1$a;)V

    invoke-direct {v0, v9}, Lcom/digdroid/alman/dig/d2;-><init>(Lcom/digdroid/alman/dig/q1;)V

    return-object v0

    :pswitch_4
    new-instance v0, Lcom/digdroid/alman/dig/d2;

    new-instance v9, Lcom/digdroid/alman/dig/c1;

    iget-object v3, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/t3;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->m3()F

    move-result v5

    iget-object v6, p0, Lcom/digdroid/alman/dig/f1;->w0:Ljava/lang/String;

    iget-object v7, p0, Lcom/digdroid/alman/dig/f1;->v0:[Z

    move-object v1, v9

    move-object v4, p1

    move-object v8, p0

    invoke-direct/range {v1 .. v8}, Lcom/digdroid/alman/dig/c1;-><init>(Landroid/app/Activity;Lcom/digdroid/alman/dig/t3;Landroid/database/Cursor;FLjava/lang/String;[ZLcom/digdroid/alman/dig/c1$a;)V

    invoke-direct {v0, v9}, Lcom/digdroid/alman/dig/d2;-><init>(Lcom/digdroid/alman/dig/q1;)V

    return-object v0

    :pswitch_5
    new-instance v0, Lcom/digdroid/alman/dig/d2;

    new-instance v10, Lcom/digdroid/alman/dig/a1;

    iget-object v3, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/t3;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->z()F

    move-result v5

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->m3()F

    move-result v6

    iget-object v7, p0, Lcom/digdroid/alman/dig/f1;->w0:Ljava/lang/String;

    iget-object v8, p0, Lcom/digdroid/alman/dig/f1;->v0:[Z

    move-object v1, v10

    move-object v4, p1

    move-object v9, p0

    invoke-direct/range {v1 .. v9}, Lcom/digdroid/alman/dig/a1;-><init>(Lcom/digdroid/alman/dig/MainActivity;Lcom/digdroid/alman/dig/t3;Landroid/database/Cursor;FFLjava/lang/String;[ZLcom/digdroid/alman/dig/c1$a;)V

    invoke-direct {v0, v10}, Lcom/digdroid/alman/dig/d2;-><init>(Lcom/digdroid/alman/dig/h;)V

    return-object v0

    :pswitch_6
    new-instance v0, Lcom/digdroid/alman/dig/d2;

    new-instance v10, Lcom/digdroid/alman/dig/d1;

    iget-object v3, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/t3;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->V()F

    move-result v5

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->m3()F

    move-result v6

    iget-object v7, p0, Lcom/digdroid/alman/dig/f1;->w0:Ljava/lang/String;

    iget-object v8, p0, Lcom/digdroid/alman/dig/f1;->v0:[Z

    move-object v1, v10

    move-object v4, p1

    move-object v9, p0

    invoke-direct/range {v1 .. v9}, Lcom/digdroid/alman/dig/d1;-><init>(Lcom/digdroid/alman/dig/MainActivity;Lcom/digdroid/alman/dig/t3;Landroid/database/Cursor;FFLjava/lang/String;[ZLcom/digdroid/alman/dig/c1$a;)V

    invoke-direct {v0, v10}, Lcom/digdroid/alman/dig/d2;-><init>(Lcom/digdroid/alman/dig/h;)V

    return-object v0

    :pswitch_7
    new-instance v0, Lcom/digdroid/alman/dig/d2;

    new-instance v10, Lcom/digdroid/alman/dig/h1;

    iget-object v3, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/t3;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->E()F

    move-result v5

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->m3()F

    move-result v6

    iget-object v7, p0, Lcom/digdroid/alman/dig/f1;->w0:Ljava/lang/String;

    iget-object v8, p0, Lcom/digdroid/alman/dig/f1;->v0:[Z

    move-object v1, v10

    move-object v4, p1

    move-object v9, p0

    invoke-direct/range {v1 .. v9}, Lcom/digdroid/alman/dig/h1;-><init>(Lcom/digdroid/alman/dig/MainActivity;Lcom/digdroid/alman/dig/t3;Landroid/database/Cursor;FFLjava/lang/String;[ZLcom/digdroid/alman/dig/c1$a;)V

    invoke-direct {v0, v10}, Lcom/digdroid/alman/dig/d2;-><init>(Lcom/digdroid/alman/dig/h;)V

    :cond_a
    :goto_1
    return-object v0

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

.method public m1()V
    .locals 2

    invoke-super {p0}, Lcom/digdroid/alman/dig/r1;->m1()V

    iget-object v0, p0, Lcom/digdroid/alman/dig/f1;->t0:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    return-void
.end method

.method public r1()V
    .locals 1

    invoke-super {p0}, Lcom/digdroid/alman/dig/r1;->r1()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/f1;->B3()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/r1;->X2(Ljava/lang/String;)V

    return-void
.end method

.method y3()I
    .locals 1

    const/4 v0, -0x1

    return v0
.end method

.method z2(Landroid/content/Intent;)V
    .locals 0

    return-void
.end method

.method z3(Landroid/database/Cursor;)V
    .locals 4

    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Lcom/digdroid/alman/dig/f1;->A3()Ljava/io/File;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/f1;->w0:Ljava/lang/String;

    invoke-interface {p1}, Landroid/database/Cursor;->getCount()I

    move-result v0

    new-array v0, v0, [Z

    iput-object v0, p0, Lcom/digdroid/alman/dig/f1;->v0:[Z

    const/4 v0, 0x0

    :goto_0
    new-instance v1, Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/digdroid/alman/dig/f1;->w0:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/f1;->f(Landroid/database/Cursor;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ".png"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/digdroid/alman/dig/f1;->v0:[Z

    add-int/lit8 v3, v0, 0x1

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    aput-boolean v1, v2, v0

    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    move v0, v3

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method
