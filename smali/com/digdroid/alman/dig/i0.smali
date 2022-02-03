.class public Lcom/digdroid/alman/dig/i0;
.super Lcom/digdroid/alman/dig/b4;
.source ""


# instance fields
.field p0:J

.field q0:J

.field r0:Z

.field s0:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/digdroid/alman/dig/b4;-><init>()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/digdroid/alman/dig/i0;->q0:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/i0;->r0:Z

    return-void
.end method


# virtual methods
.method e3()Z
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    const-string v1, "external_browser"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/b3;->c(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method f3()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "https://digdroid.com/forums/categories/game-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/digdroid/alman/dig/i0;->q0:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method h3(Lcom/digdroid/alman/dig/b4$b;)V
    .locals 5

    iget-wide v0, p0, Lcom/digdroid/alman/dig/i0;->q0:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-gez v4, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p0, Lcom/digdroid/alman/dig/i0;->r0:Z

    if-eqz v0, :cond_1

    invoke-interface {p1}, Lcom/digdroid/alman/dig/b4$b;->a()V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->e0:Lcom/digdroid/alman/dig/z1;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/z1;->a()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SELECT title FROM titles WHERE rowid="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Lcom/digdroid/alman/dig/i0;->q0:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    return-void

    :cond_2
    const/4 v1, 0x0

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v2, "system"

    iget-object v3, p0, Lcom/digdroid/alman/dig/i0;->s0:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "game"

    iget-wide v3, p0, Lcom/digdroid/alman/dig/i0;->q0:J

    invoke-virtual {v1, v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v2, "title"

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/digdroid/alman/dig/ServerService;->b:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/getgameforum.php"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Lc/a/c/w/k;

    new-instance v3, Lcom/digdroid/alman/dig/i0$a;

    invoke-direct {v3, p0, p1}, Lcom/digdroid/alman/dig/i0$a;-><init>(Lcom/digdroid/alman/dig/i0;Lcom/digdroid/alman/dig/b4$b;)V

    new-instance p1, Lcom/digdroid/alman/dig/i0$b;

    invoke-direct {p1, p0}, Lcom/digdroid/alman/dig/i0$b;-><init>(Lcom/digdroid/alman/dig/i0;)V

    invoke-direct {v2, v0, v1, v3, p1}, Lc/a/c/w/k;-><init>(Ljava/lang/String;Lorg/json/JSONObject;Lc/a/c/p$b;Lc/a/c/p$a;)V

    :try_start_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->j0()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/digdroid/alman/dig/l2;->a(Landroid/content/Context;)Lc/a/c/o;

    move-result-object p1

    invoke-virtual {p1, v2}, Lc/a/c/o;->a(Lc/a/c/n;)Lc/a/c/n;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    return-void
.end method

.method public t1()V
    .locals 4

    invoke-super {p0}, Lcom/digdroid/alman/dig/b4;->t1()V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->h0()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "gameid"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/digdroid/alman/dig/i0;->p0:J

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->a0:Lcom/digdroid/alman/dig/u;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SELECT forumcreated,system,mdbid FROM roms WHERE _id="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Lcom/digdroid/alman/dig/i0;->p0:J

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

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    const/4 v1, 0x1

    :cond_0
    iput-boolean v1, p0, Lcom/digdroid/alman/dig/i0;->r0:Z

    iget-object v1, p0, Lcom/digdroid/alman/dig/p1;->b0:Lcom/digdroid/alman/dig/g3;

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/digdroid/alman/dig/g3;->s(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/digdroid/alman/dig/i0;->s0:Ljava/lang/String;

    const/4 v1, 0x2

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v1

    iput-wide v1, p0, Lcom/digdroid/alman/dig/i0;->q0:J

    :cond_1
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    return-void
.end method
