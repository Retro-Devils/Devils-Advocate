.class public Lcom/digdroid/alman/dig/t3;
.super Lcom/digdroid/alman/dig/f1;
.source ""


# instance fields
.field private x0:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/digdroid/alman/dig/f1;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/t3;->x0:Z

    return-void
.end method

.method private B3(J)Ljava/lang/String;
    .locals 6

    long-to-double v0, p1

    const-string v2, ""

    const-wide/32 v3, 0x3b9aca00

    cmp-long v5, p1, v3

    if-ltz v5, :cond_0

    const-wide p1, 0x41cdcd6500000000L    # 1.0E9

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v0, p1

    const-string p1, "GB"

    goto :goto_0

    :cond_0
    const-wide/32 v3, 0xf4240

    cmp-long v5, p1, v3

    if-ltz v5, :cond_1

    const-wide p1, 0x412e848000000000L    # 1000000.0

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v0, p1

    const-string p1, "MB"

    goto :goto_0

    :cond_1
    const-wide/16 v3, 0x3e8

    cmp-long v5, p1, v3

    if-ltz v5, :cond_2

    const-wide p1, 0x408f400000000000L    # 1000.0

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v0, p1

    const-string p1, "KB"

    goto :goto_0

    :cond_2
    move-object p1, v2

    :goto_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide/high16 v2, 0x4024000000000000L    # 10.0

    mul-double v0, v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v0, v2

    invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public H2(Landroid/view/MenuItem;)Z
    .locals 3

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x7f09039a

    const/4 v2, 0x1

    if-eq v0, v1, :cond_1

    const v1, 0x7f09039e

    if-eq v0, v1, :cond_0

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/r1;->H2(Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    :cond_0
    iput-boolean v2, p0, Lcom/digdroid/alman/dig/t3;->x0:Z

    :goto_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->invalidateOptionsMenu()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->o3()V

    return v2

    :cond_1
    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/digdroid/alman/dig/t3;->x0:Z

    goto :goto_0
.end method

.method public bridge synthetic R(Landroid/database/Cursor;)I
    .locals 0

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/f1;->R(Landroid/database/Cursor;)I

    move-result p1

    return p1
.end method

.method public W0(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/r1;->W0(Landroid/os/Bundle;)V

    if-eqz p1, :cond_0

    const-string v0, "themes_sort_name"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/digdroid/alman/dig/t3;->x0:Z

    :cond_0
    return-void
.end method

.method public a(Landroid/database/Cursor;)Ljava/lang/String;
    .locals 1

    const-string v0, "name"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b()Lcom/digdroid/alman/dig/m;
    .locals 1

    invoke-super {p0}, Lcom/digdroid/alman/dig/f1;->b()Lcom/digdroid/alman/dig/m;

    move-result-object v0

    return-object v0
.end method

.method public d(Landroid/database/Cursor;)Ljava/lang/String;
    .locals 6

    const-string v0, "minsize"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    const-string v2, "maxsize"

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long p1, v0, v4

    if-nez p1, :cond_0

    const-string p1, "..."

    return-object p1

    :cond_0
    invoke-direct {p0, v0, v1}, Lcom/digdroid/alman/dig/t3;->B3(J)Ljava/lang/String;

    move-result-object p1

    cmp-long v4, v2, v0

    if-lez v4, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " - "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0, v2, v3}, Lcom/digdroid/alman/dig/t3;->B3(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_1
    return-object p1
.end method

.method public f(Landroid/database/Cursor;)Ljava/lang/String;
    .locals 1

    const-string v0, "image_url"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method f3(Landroid/view/View;Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method i3()Landroid/database/Cursor;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SELECT _id,name,forum_id,image_url,modified,minsize,maxsize FROM themes ORDER BY "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/digdroid/alman/dig/t3;->x0:Z

    if-eqz v1, :cond_0

    const-string v1, "name ASC"

    goto :goto_0

    :cond_0
    const-string v1, "modified DESC"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/p1;->a0:Lcom/digdroid/alman/dig/u;

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/t3;->x3(Landroid/database/Cursor;)V

    return-object v0
.end method

.method public j3()Ljava/lang/String;
    .locals 1

    const-string v0, "coverflow"

    return-object v0
.end method

.method l3(Landroid/view/View;Ljava/lang/Object;)V
    .locals 2

    if-nez p2, :cond_0

    return-void

    :cond_0
    :try_start_0
    check-cast p2, Landroid/database/Cursor;

    iget-object p1, p0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "https://digdroid.com/forums/discussion/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "forum_id"

    invoke-interface {p2, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {p2, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/digdroid/alman/dig/p1$a;->z(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public bridge synthetic m1()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/f1;->m1()V

    return-void
.end method

.method public p2(Landroid/view/Menu;)V
    .locals 2

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/r1;->p2(Landroid/view/Menu;)V

    const v0, 0x7f09039e

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    iget-boolean v1, p0, Lcom/digdroid/alman/dig/t3;->x0:Z

    xor-int/lit8 v1, v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    const v0, 0x7f09039a

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/t3;->x0:Z

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    return-void
.end method

.method public r1()V
    .locals 6

    invoke-super {p0}, Lcom/digdroid/alman/dig/f1;->r1()V

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    const-string v1, "new_themes_updated"

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/digdroid/alman/dig/b3;->n(Ljava/lang/String;J)J

    move-result-wide v0

    iget-object v4, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    const-string v5, "themes_updated"

    invoke-virtual {v4, v5, v2, v3}, Lcom/digdroid/alman/dig/b3;->n(Ljava/lang/String;J)J

    move-result-wide v2

    cmp-long v4, v0, v2

    if-gtz v4, :cond_0

    return-void

    :cond_0
    new-instance v0, Lc/a/c/w/k;

    const/4 v1, 0x0

    new-instance v2, Lcom/digdroid/alman/dig/t3$a;

    invoke-direct {v2, p0}, Lcom/digdroid/alman/dig/t3$a;-><init>(Lcom/digdroid/alman/dig/t3;)V

    new-instance v3, Lcom/digdroid/alman/dig/t3$b;

    invoke-direct {v3, p0}, Lcom/digdroid/alman/dig/t3$b;-><init>(Lcom/digdroid/alman/dig/t3;)V

    const-string v4, "https://digdroid.com/php/themes.txt"

    invoke-direct {v0, v4, v1, v2, v3}, Lc/a/c/w/k;-><init>(Ljava/lang/String;Lorg/json/JSONObject;Lc/a/c/p$b;Lc/a/c/p$a;)V

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {v0, v1}, Lc/a/c/n;->L(Z)Lc/a/c/n;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->j0()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/digdroid/alman/dig/l2;->a(Landroid/content/Context;)Lc/a/c/o;

    move-result-object v1

    invoke-virtual {v1, v0}, Lc/a/c/o;->a(Lc/a/c/n;)Lc/a/c/n;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method r2()I
    .locals 1

    const v0, 0x7f0d0012

    return v0
.end method

.method public s1(Landroid/os/Bundle;)V
    .locals 2

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/t3;->x0:Z

    const-string v1, "themes_sort_name"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/r1;->s1(Landroid/os/Bundle;)V

    return-void
.end method

.method public t2()Ljava/lang/String;
    .locals 1

    const-string v0, "themes"

    return-object v0
.end method

.method x3(Landroid/database/Cursor;)V
    .locals 5

    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {p1}, Landroid/database/Cursor;->getCount()I

    move-result v0

    new-array v0, v0, [Z

    iput-object v0, p0, Lcom/digdroid/alman/dig/f1;->v0:[Z

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/digdroid/alman/dig/f1;->v0:[Z

    add-int/lit8 v2, v0, 0x1

    const-string v3, "image_url"

    invoke-interface {p1, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    invoke-interface {p1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, ""

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    xor-int/lit8 v3, v3, 0x1

    aput-boolean v3, v1, v0

    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move v0, v2

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method z3()Ljava/lang/String;
    .locals 1

    const v0, 0x7f110270

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->D0(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
