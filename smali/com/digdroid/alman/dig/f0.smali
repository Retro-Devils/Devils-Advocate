.class public abstract Lcom/digdroid/alman/dig/f0;
.super Lcom/digdroid/alman/dig/f1;
.source ""


# instance fields
.field x0:Landroid/database/sqlite/SQLiteDatabase;

.field y0:Z

.field z0:J


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/digdroid/alman/dig/f1;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/digdroid/alman/dig/f0;->z0:J

    return-void
.end method


# virtual methods
.method C3(Landroid/view/MenuItem;JLjava/lang/String;Ljava/lang/String;)Z
    .locals 6

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const/4 v1, 0x1

    const v2, 0x104000a

    const/high16 v3, 0x1040000

    const/4 v4, 0x0

    const v5, 0x7f090142

    if-ne v0, v5, :cond_0

    new-instance p1, Landroidx/appcompat/app/b$a;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object p4

    invoke-static {}, Lcom/digdroid/alman/dig/q3;->c()I

    move-result v0

    invoke-direct {p1, p4, v0}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const v0, 0x7f1100bc

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->D0(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p1, p4}, Landroidx/appcompat/app/b$a;->s(Ljava/lang/CharSequence;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    const p4, 0x7f11008b

    invoke-virtual {p0, p4}, Landroidx/fragment/app/Fragment;->D0(I)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p1, p4}, Landroidx/appcompat/app/b$a;->i(Ljava/lang/CharSequence;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1, v3, v4}, Landroidx/appcompat/app/b$a;->l(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    new-instance p4, Lcom/digdroid/alman/dig/f0$a;

    invoke-direct {p4, p0, p2, p3}, Lcom/digdroid/alman/dig/f0$a;-><init>(Lcom/digdroid/alman/dig/f0;J)V

    invoke-virtual {p1, v2, p4}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    :goto_0
    invoke-virtual {p1}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    return v1

    :cond_0
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v5, 0x7f090332

    if-ne v0, v5, :cond_1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->q0()Landroid/view/LayoutInflater;

    move-result-object p1

    const p4, 0x7f0c0065

    invoke-virtual {p1, p4, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    const p4, 0x7f0901bf

    invoke-virtual {p1, p4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p4

    check-cast p4, Landroid/widget/EditText;

    invoke-static {}, Lcom/digdroid/alman/dig/q3;->b()I

    move-result v0

    invoke-virtual {p4, v0}, Landroid/widget/EditText;->setTextColor(I)V

    invoke-virtual {p4, p5}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    new-instance p5, Landroidx/appcompat/app/b$a;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v0

    invoke-static {}, Lcom/digdroid/alman/dig/q3;->c()I

    move-result v5

    invoke-direct {p5, v0, v5}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    invoke-virtual {p5, p1}, Landroidx/appcompat/app/b$a;->t(Landroid/view/View;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/f0;->G3()I

    move-result p5

    invoke-virtual {p0, p5}, Landroidx/fragment/app/Fragment;->D0(I)Ljava/lang/String;

    move-result-object p5

    invoke-virtual {p1, p5}, Landroidx/appcompat/app/b$a;->i(Ljava/lang/CharSequence;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1, v3, v4}, Landroidx/appcompat/app/b$a;->l(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    new-instance p5, Lcom/digdroid/alman/dig/f0$b;

    invoke-direct {p5, p0, p4, p2, p3}, Lcom/digdroid/alman/dig/f0$b;-><init>(Lcom/digdroid/alman/dig/f0;Landroid/widget/EditText;J)V

    invoke-virtual {p1, v2, p5}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-super/range {p0 .. p5}, Lcom/digdroid/alman/dig/f1;->C3(Landroid/view/MenuItem;JLjava/lang/String;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method abstract D3(Ljava/lang/String;)V
.end method

.method abstract E3(J)V
.end method

.method abstract F3()I
.end method

.method abstract G3()I
.end method

.method public H2(Landroid/view/MenuItem;)Z
    .locals 6

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const/4 v1, 0x1

    const v2, 0x7f0901fb

    if-ne v0, v2, :cond_0

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/f0;->y0:Z

    xor-int/2addr v0, v1

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/f0;->y0:Z

    iget-object v1, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/c3;

    const-string v2, "show_all_genres"

    invoke-virtual {v1, v2, v0}, Lcom/digdroid/alman/dig/c3;->A(Ljava/lang/String;Z)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->invalidateOptionsMenu()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/digdroid/alman/dig/f0;->z0:J

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/f0;->O2()V

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v2, 0x7f090055

    if-ne v0, v2, :cond_1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->q0()Landroid/view/LayoutInflater;

    move-result-object p1

    const v0, 0x7f0c0065

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    const v0, 0x7f0901bf

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    invoke-static {}, Lcom/digdroid/alman/dig/q3;->b()I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/widget/EditText;->setTextColor(I)V

    new-instance v3, Landroidx/appcompat/app/b$a;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v4

    invoke-static {}, Lcom/digdroid/alman/dig/q3;->c()I

    move-result v5

    invoke-direct {v3, v4, v5}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v3, p1}, Landroidx/appcompat/app/b$a;->t(Landroid/view/View;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/f0;->F3()I

    move-result v3

    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->D0(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Landroidx/appcompat/app/b$a;->s(Ljava/lang/CharSequence;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    const/high16 v3, 0x1040000

    invoke-virtual {p1, v3, v2}, Landroidx/appcompat/app/b$a;->l(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    const v2, 0x104000a

    new-instance v3, Lcom/digdroid/alman/dig/f0$c;

    invoke-direct {v3, p0, v0}, Lcom/digdroid/alman/dig/f0$c;-><init>(Lcom/digdroid/alman/dig/f0;Landroid/widget/EditText;)V

    invoke-virtual {p1, v2, v3}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    return v1

    :cond_1
    :goto_0
    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/r1;->H2(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method abstract H3()Z
.end method

.method abstract I3(JLjava/lang/String;)V
.end method

.method abstract J3(Landroid/database/Cursor;)V
.end method

.method declared-synchronized O2()V
    .locals 7

    monitor-enter p0

    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/digdroid/alman/dig/f0;->z0:J

    sub-long v2, v0, v2

    const-wide/16 v4, 0x2710

    cmp-long v6, v2, v4

    if-ltz v6, :cond_0

    invoke-super {p0}, Lcom/digdroid/alman/dig/r1;->O2()V

    iput-wide v0, p0, Lcom/digdroid/alman/dig/f0;->z0:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public R(Landroid/database/Cursor;)I
    .locals 1

    const/4 v0, 0x2

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result p1

    return p1
.end method

.method public bridge synthetic b()Lcom/digdroid/alman/dig/m;
    .locals 1

    invoke-super {p0}, Lcom/digdroid/alman/dig/f1;->b()Lcom/digdroid/alman/dig/m;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic f(Landroid/database/Cursor;)Ljava/lang/String;
    .locals 0

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/f1;->f(Landroid/database/Cursor;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic m1()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/f1;->m1()V

    return-void
.end method

.method n3(Landroid/view/View;Ljava/lang/Object;)V
    .locals 0

    if-eqz p2, :cond_0

    check-cast p2, Landroid/database/Cursor;

    invoke-virtual {p0, p2}, Lcom/digdroid/alman/dig/f0;->J3(Landroid/database/Cursor;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic r1()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/f1;->r1()V

    return-void
.end method

.method public t1()V
    .locals 1

    invoke-super {p0}, Lcom/digdroid/alman/dig/r1;->t1()V

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->a0:Lcom/digdroid/alman/dig/u;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/f0;->x0:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/f0;->H3()Z

    move-result v0

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/f0;->y0:Z

    return-void
.end method
