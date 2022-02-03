.class public Lcom/digdroid/alman/dig/p2;
.super Lcom/digdroid/alman/dig/p1;
.source ""


# instance fields
.field n0:J

.field o0:Landroid/widget/EditText;

.field p0:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/digdroid/alman/dig/p1;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic B2()Z
    .locals 1

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->B2()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic C2()Z
    .locals 1

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->C2()Z

    move-result v0

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

.method public bridge synthetic K2()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->K2()V

    return-void
.end method

.method public bridge synthetic N2()Z
    .locals 1

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->N2()Z

    move-result v0

    return v0
.end method

.method public O2()V
    .locals 0

    return-void
.end method

.method public bridge synthetic P2()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->P2()V

    return-void
.end method

.method public bridge synthetic Q2()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->Q2()V

    return-void
.end method

.method public bridge synthetic R2()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->R2()V

    return-void
.end method

.method public bridge synthetic S2()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->S2()V

    return-void
.end method

.method public bridge synthetic T0(Landroid/content/Context;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/p1;->T0(Landroid/content/Context;)V

    return-void
.end method

.method public bridge synthetic T2(Lcom/digdroid/alman/dig/h0;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/p1;->T2(Lcom/digdroid/alman/dig/h0;)V

    return-void
.end method

.method public bridge synthetic U2()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->U2()V

    return-void
.end method

.method public W0(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/p1;->W0(Landroid/os/Bundle;)V

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const-string v0, "editing"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    :goto_0
    iput-boolean p1, p0, Lcom/digdroid/alman/dig/p2;->p0:Z

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->d2(Z)V

    return-void
.end method

.method public bridge synthetic W2()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->W2()V

    return-void
.end method

.method public bridge synthetic X2(Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/p1;->X2(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic Y2(Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/p1;->Y2(Ljava/lang/String;)V

    return-void
.end method

.method public Z0(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .locals 1

    const v0, 0x7f0d000d

    invoke-virtual {p2, v0, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    const p2, 0x7f09017c

    invoke-interface {p1, p2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    iget-boolean p2, p0, Lcom/digdroid/alman/dig/p2;->p0:Z

    if-eqz p2, :cond_0

    const p2, 0x7f1100c9

    goto :goto_0

    :cond_0
    const p2, 0x7f1100cb

    :goto_0
    invoke-interface {p1, p2}, Landroid/view/MenuItem;->setTitle(I)Landroid/view/MenuItem;

    return-void
.end method

.method public a1(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p3, 0x7f0c0058

    const/4 v0, 0x0

    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic a3(Z)V
    .locals 0

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/p1;->a3(Z)V

    return-void
.end method

.method public bridge synthetic c3()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->c3()V

    return-void
.end method

.method public bridge synthetic d3()Z
    .locals 1

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->d3()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic e3()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->e3()V

    return-void
.end method

.method g3()V
    .locals 5

    iget-object v0, p0, Lcom/digdroid/alman/dig/p2;->o0:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Landroid/content/ContentValues;

    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    const-string v2, "notes"

    invoke-virtual {v1, v2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->a0:Lcom/digdroid/alman/dig/u;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "_id="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v3, p0, Lcom/digdroid/alman/dig/p2;->n0:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "roms"

    const/4 v4, 0x0

    invoke-virtual {v0, v3, v1, v2, v4}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    return-void
.end method

.method public k1(Landroid/view/MenuItem;)Z
    .locals 2

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x7f09017c

    if-eq v0, v1, :cond_0

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/p1;->k1(Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    :cond_0
    iget-boolean p1, p0, Lcom/digdroid/alman/dig/p2;->p0:Z

    const/4 v0, 0x1

    xor-int/2addr p1, v0

    iput-boolean p1, p0, Lcom/digdroid/alman/dig/p2;->p0:Z

    iget-object v1, p0, Lcom/digdroid/alman/dig/p2;->o0:Landroid/widget/EditText;

    invoke-virtual {v1, p1}, Landroid/widget/EditText;->setEnabled(Z)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/p2;->o0:Landroid/widget/EditText;

    iget-boolean v1, p0, Lcom/digdroid/alman/dig/p2;->p0:Z

    if-eqz v1, :cond_1

    const/4 v1, -0x1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/s3;

    iget v1, v1, Lcom/digdroid/alman/dig/s3;->e:I

    :goto_0
    invoke-virtual {p1, v1}, Landroid/widget/EditText;->setTextColor(I)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/p2;->o0:Landroid/widget/EditText;

    iget-boolean v1, p0, Lcom/digdroid/alman/dig/p2;->p0:Z

    if-eqz v1, :cond_2

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->m()I

    move-result v1

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {p1, v1}, Landroid/widget/EditText;->setBackgroundColor(I)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->invalidateOptionsMenu()V

    return v0
.end method

.method public m1()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->m1()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p2;->g3()V

    return-void
.end method

.method public bridge synthetic q2()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->q2()V

    return-void
.end method

.method public r1()V
    .locals 5

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->r1()V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->h0()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "gameid"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/digdroid/alman/dig/p2;->n0:J

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->a0:Lcom/digdroid/alman/dig/u;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SELECT title,notes FROM roms WHERE _id="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Lcom/digdroid/alman/dig/p2;->n0:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/digdroid/alman/dig/p2;->X2(Ljava/lang/String;)V

    const/4 v2, 0x1

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    const-string v2, ""

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F0()Landroid/view/View;

    move-result-object v3

    const v4, 0x7f0902d9

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/EditText;

    iput-object v3, p0, Lcom/digdroid/alman/dig/p2;->o0:Landroid/widget/EditText;

    invoke-virtual {v3, v2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, p0, Lcom/digdroid/alman/dig/p2;->o0:Landroid/widget/EditText;

    invoke-virtual {v2, v1}, Landroid/widget/EditText;->setBackgroundColor(I)V

    iget-object v2, p0, Lcom/digdroid/alman/dig/p2;->o0:Landroid/widget/EditText;

    iget-object v3, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/s3;

    iget v3, v3, Lcom/digdroid/alman/dig/s3;->e:I

    invoke-virtual {v2, v3}, Landroid/widget/EditText;->setTextColor(I)V

    iget-object v2, p0, Lcom/digdroid/alman/dig/p2;->o0:Landroid/widget/EditText;

    invoke-virtual {v2, v1}, Landroid/widget/EditText;->setEnabled(Z)V

    :cond_1
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    return-void
.end method

.method public s1(Landroid/os/Bundle;)V
    .locals 2

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/p2;->p0:Z

    const-string v1, "editing"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->s1(Landroid/os/Bundle;)V

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

    const-string v0, "notes"

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

.method public z2(Landroid/content/Intent;)V
    .locals 0

    return-void
.end method
